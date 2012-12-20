amor - Ad-hoc Maven Object Repository
==========================

Minimalistic Artifact Service
===================

This is the Ad-hoc Maven Object Repository thrown together with tangram.

Setup system:

Build project

  gradle clean build

Start  the local development app server

  dev_appserver -p 12380 build\war

Import data

  bulkloader.py --restore --url=http://localhost:12380/remote_api --filename=online-src/amor.db

(Now you should be able to log in)

Import templates and groovy codes (the real server software)

  bulkloader.py --restore --url=http://localhost:12380/remote_api --filename=online-src/amor-code.db

Wait 4 Minutes, stop the Development App Server and restart it, than call http://localhost:12380/

You should be seeing an empty artifact listing. 

Log-in can be accomplished by http://localhost:12380/repository/googlelogin. The default login "test@example.org" in the Google App Engine is registered as an Administrator and thus allowed to call the Tangram Editor. Don't be confused by the error message after login, with an empty repository you should go to http://localhost:12380/repository/list?cms.editor.class.name=maven.repository.content.Artifact.

(Or review the codes of amor or http://localhost:12380/repository/list?cms.editor.class.name=org.tangram.gae.Code)

In the tangram Editor you can create instances of type Artifact and add the necessary data - don't forget the poms and SHA1 and MD5 hashes.

Point your build system to http://localhost:12380/repository/ and you should be able to use the uploaded artifacts.

To bringt all this to the Google App Engine, you need to change the application ID in build\war\WEB-INF\appengine-web.xml. Please don't forget to add some real google account as administrator in build\war\WEB-INF\tangram\maven-repository.xml

package maven.repository.content;

import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;

import org.tangram.content.Content;
import org.tangram.gae.GaeContent;

import com.google.appengine.api.datastore.Blob;

@PersistenceCapable
public class Artifact extends GaeContent {

    @Persistent
    private Blob data;

    private String dataSha1;

    private String dataMd5;

    @Persistent
    private Blob pom;

    private String pomSha1;

    private String pomMd5;

    private String groupId;

    private String artifactId;

    private String version;

    private String packaging;


    public Blob getData() {
        return data;
    }


    public void setData(Blob data) {
        this.data = data;
    }


    public String getDataSha1() {
        return dataSha1;
    }


    public void setDataSha1(String dataSha1) {
        this.dataSha1 = dataSha1;
    }


    public String getDataMd5() {
        return dataMd5;
    }


    public void setDataMd5(String dataMd5) {
        this.dataMd5 = dataMd5;
    }


    public Blob getPom() {
        return pom;
    }


    public void setPom(Blob pom) {
        this.pom = pom;
    }


    public String getPomSha1() {
        return pomSha1;
    }


    public void setPomSha1(String pomSha1) {
        this.pomSha1 = pomSha1;
    }


    public String getPomMd5() {
        return pomMd5;
    }


    public void setPomMd5(String pomMd5) {
        this.pomMd5 = pomMd5;
    }


    public String getGroupId() {
        return groupId;
    }


    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }


    public String getArtifactId() {
        return artifactId;
    }


    public void setArtifactId(String artifactId) {
        this.artifactId = artifactId;
    }


    public String getVersion() {
        return version;
    }


    public void setVersion(String version) {
        this.version = version;
    }


    public String getPackaging() {
        return packaging;
    }


    public void setPackaging(String packaging) {
        this.packaging = packaging;
    }


    @Override
    public int compareTo(Content o) {
        return (o instanceof Artifact) ? (getGroupId()==null ? 0 : getGroupId().compareTo(((Artifact)o).getGroupId())) : super
                .compareTo(o);
    } // compareTo()

} // Artifact

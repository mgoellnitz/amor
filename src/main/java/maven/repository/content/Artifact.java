/**
 * 
 * Copyright 2012 Martin Goellnitz
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 * 
 */
package maven.repository.content;

import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;

import org.tangram.content.Content;
import org.tangram.gae.GaeContent;

import com.google.appengine.api.datastore.Blob;

@PersistenceCapable
public class Artifact extends GaeContent {

    @Persistent
    private Blob addon;

    private String addonSha1;

    private String addonMd5;

    private String addonClassifier;

    @Persistent
    private Blob data;

    private String dataSha1;

    private String dataMd5;

    @Persistent
    private Blob sources;

    private String sourcesSha1;

    private String sourcesMd5;

    @Persistent
    private Blob pom;

    private String pomSha1;

    private String pomMd5;

    private String groupId;

    private String artifactId;

    private String version;

    private String packaging;


    public Blob getAddon() {
        return addon;
    }


    public void setAddon(Blob addon) {
        this.addon = addon;
    }


    public String getAddonSha1() {
        return addonSha1;
    }


    public void setAddonSha1(String addonSha1) {
        this.addonSha1 = addonSha1;
    }


    public String getAddonMd5() {
        return addonMd5;
    }


    public void setAddonMd5(String addonMd5) {
        this.addonMd5 = addonMd5;
    }


    public String getAddonClassifier() {
        return addonClassifier;
    }


    public void setAddonClassifier(String addonClassifier) {
        this.addonClassifier = addonClassifier;
    }


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


    public Blob getSources() {
        return sources;
    }


    public void setSources(Blob sources) {
        this.sources = sources;
    }


    public String getSourcesSha1() {
        return sourcesSha1;
    }


    public void setSourcesSha1(String sourcesSha1) {
        this.sourcesSha1 = sourcesSha1;
    }


    public String getSourcesMd5() {
        return sourcesMd5;
    }


    public void setSourcesMd5(String sourcesMd5) {
        this.sourcesMd5 = sourcesMd5;
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

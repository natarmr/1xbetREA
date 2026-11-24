package android.javax.sip.header;

/* JADX INFO: loaded from: classes.dex */
public interface OrganizationHeader extends Header {
    public static final String NAME = "Organization";

    String getOrganization();

    void setOrganization(String str);
}

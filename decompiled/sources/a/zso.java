package a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zso {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final wso f44914a = new wso();
    public static final wso b;

    static {
        wso wsoVar = null;
        try {
            wsoVar = (wso) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = wsoVar;
    }
}

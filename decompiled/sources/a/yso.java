package a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class yso {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final vso f43178a = new vso();
    public static final vso b;

    static {
        vso vsoVar = null;
        try {
            vsoVar = (vso) Class.forName("com.google.crypto.tink.shaded.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = vsoVar;
    }
}

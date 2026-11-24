package a;

/* JADX INFO: loaded from: classes6.dex */
public final class rpu extends e0u {
    public static final /* synthetic */ int b = 0;
    public static final /* synthetic */ int c = 0;

    /* JADX WARN: Illegal instructions before constructor call */
    public rpu(s sVar, String str) {
        String strConcat = "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/".concat(sVar.f31386a);
        super(str, strConcat);
        if (strConcat.length() > 0) {
            return;
        }
        jf4.o("type must not be empty");
        throw null;
    }
}

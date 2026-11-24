package a;

/* JADX INFO: loaded from: classes6.dex */
public final class d0u extends e0u {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0u(CharSequence charSequence, byte b) {
        super(charSequence, "android.credentials.GetCredentialException.TYPE_INTERRUPTED");
        switch (b) {
            case 2:
                super(charSequence, "androidx.credentials.TYPE_GET_CREDENTIAL_PROVIDER_CONFIGURATION_EXCEPTION");
                break;
            case 3:
                super(charSequence, "android.credentials.GetCredentialException.TYPE_UNKNOWN");
                break;
            case 4:
                super(charSequence, "android.credentials.GetCredentialException.TYPE_NO_CREDENTIAL");
                break;
            default:
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0u(CharSequence charSequence, String str) {
        super(charSequence, str);
        str.getClass();
        if (str.length() > 0) {
            return;
        }
        jf4.o("type must not be empty");
        throw null;
    }
}

package a;

/* JADX INFO: loaded from: classes.dex */
public final class pcj {
    public static final v9f b = new v9f();
    public static final String c = a("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");
    public static final String d = a("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");
    public static final t9f e = new t9f((byte) 4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final amf0 f26762a;

    public pcj(amf0 amf0Var) {
        this.f26762a = amf0Var;
    }

    public static String a(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            jf4.o("Invalid input received");
            return null;
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (str2.length() > i) {
                sb.append(str2.charAt(i));
            }
        }
        return sb.toString();
    }
}

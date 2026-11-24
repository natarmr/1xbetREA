package a;

/* JADX INFO: loaded from: classes2.dex */
public final class hw2 extends kjt {
    private static final hw2 DEFAULT_INSTANCE;
    public static final int PACKAGE_NAME_FIELD_NUMBER = 1;
    private static volatile iq80 PARSER = null;
    public static final int SDK_VERSION_FIELD_NUMBER = 2;
    public static final int VERSION_NAME_FIELD_NUMBER = 3;
    private int bitField0_;
    private String packageName_ = "";
    private String sdkVersion_ = "";
    private String versionName_ = "";

    static {
        hw2 hw2Var = new hw2();
        DEFAULT_INSTANCE = hw2Var;
        kjt.p(hw2.class, hw2Var);
    }

    public static hw2 r() {
        return DEFAULT_INSTANCE;
    }

    public static fw2 u() {
        return (fw2) DEFAULT_INSTANCE.i();
    }

    @Override // a.kjt
    public final Object j(int i) {
        iq80 djtVar;
        switch (hne.E(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new y9e0(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"bitField0_", "packageName_", "sdkVersion_", "versionName_"});
            case 3:
                return new hw2();
            case 4:
                return new fw2(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                iq80 iq80Var = PARSER;
                if (iq80Var != null) {
                    return iq80Var;
                }
                synchronized (hw2.class) {
                    try {
                        djtVar = PARSER;
                        if (djtVar == null) {
                            djtVar = new djt();
                            PARSER = djtVar;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return djtVar;
            default:
                e9d0.b();
                return null;
        }
    }

    public final boolean s() {
        return (this.bitField0_ & 1) != 0;
    }

    public final boolean t() {
        return (this.bitField0_ & 2) != 0;
    }

    public final void v(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.packageName_ = str;
    }

    public final void w() {
        this.bitField0_ |= 2;
        this.sdkVersion_ = "22.0.6";
    }

    public final void x(String str) {
        this.bitField0_ |= 4;
        this.versionName_ = str;
    }
}

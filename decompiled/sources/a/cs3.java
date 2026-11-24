package a;

/* JADX INFO: loaded from: classes2.dex */
public final class cs3 extends kjt {
    public static final int ANDROID_APP_INFO_FIELD_NUMBER = 3;
    public static final int APPLICATION_PROCESS_STATE_FIELD_NUMBER = 5;
    public static final int APP_INSTANCE_ID_FIELD_NUMBER = 2;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 6;
    private static final cs3 DEFAULT_INSTANCE;
    public static final int GOOGLE_APP_ID_FIELD_NUMBER = 1;
    private static volatile iq80 PARSER;
    private hw2 androidAppInfo_;
    private int applicationProcessState_;
    private int bitField0_;
    private vo20 customAttributes_ = vo20.b;
    private String googleAppId_ = "";
    private String appInstanceId_ = "";

    static {
        cs3 cs3Var = new cs3();
        DEFAULT_INSTANCE = cs3Var;
        kjt.p(cs3.class, cs3Var);
    }

    public static cs3 s() {
        return DEFAULT_INSTANCE;
    }

    public static zr3 y() {
        return (zr3) DEFAULT_INSTANCE.i();
    }

    public final void A(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.appInstanceId_ = str;
    }

    public final void B(ts3 ts3Var) {
        this.applicationProcessState_ = ts3Var.f34442a;
        this.bitField0_ |= 8;
    }

    public final void C(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.googleAppId_ = str;
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
                return new y9e0(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0001\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0005᠌\u0003\u00062", new Object[]{"bitField0_", "googleAppId_", "appInstanceId_", "androidAppInfo_", "applicationProcessState_", gqw0.p, "customAttributes_", as3.f1373a});
            case 3:
                return new cs3();
            case 4:
                return new zr3(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                iq80 iq80Var = PARSER;
                if (iq80Var != null) {
                    return iq80Var;
                }
                synchronized (cs3.class) {
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

    public final hw2 r() {
        hw2 hw2Var = this.androidAppInfo_;
        return hw2Var == null ? hw2.r() : hw2Var;
    }

    public final boolean t() {
        return (this.bitField0_ & 4) != 0;
    }

    public final boolean u() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean v() {
        return (this.bitField0_ & 8) != 0;
    }

    public final boolean w() {
        return (this.bitField0_ & 1) != 0;
    }

    public final vo20 x() {
        vo20 vo20Var = this.customAttributes_;
        if (vo20Var.f37745a) {
            return vo20Var;
        }
        vo20 vo20VarD = vo20Var.d();
        this.customAttributes_ = vo20VarD;
        return vo20VarD;
    }

    public final void z(hw2 hw2Var) {
        this.androidAppInfo_ = hw2Var;
        this.bitField0_ |= 4;
    }
}

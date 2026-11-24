package a;

import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class rd90 extends kjt {
    private static final rd90 DEFAULT_INSTANCE;
    private static volatile iq80 PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    public static final int SESSION_VERBOSITY_FIELD_NUMBER = 2;
    private static final ylx sessionVerbosity_converter_ = new mi70();
    private int bitField0_;
    private String sessionId_ = "";
    private xlx sessionVerbosity_ = sjx.d;

    static {
        rd90 rd90Var = new rd90();
        DEFAULT_INSTANCE = rd90Var;
        kjt.p(rd90.class, rd90Var);
    }

    public static qd90 u() {
        return (qd90) DEFAULT_INSTANCE.i();
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
                return new y9e0(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002ࠞ", new Object[]{"bitField0_", "sessionId_", "sessionVerbosity_", ujn.Y});
            case 3:
                return new rd90();
            case 4:
                return new qd90(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                iq80 iq80Var = PARSER;
                if (iq80Var != null) {
                    return iq80Var;
                }
                synchronized (rd90.class) {
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

    public final void r() {
        RandomAccess randomAccess = this.sessionVerbosity_;
        if (!((n4) randomAccess).f22873a) {
            sjx sjxVar = (sjx) randomAccess;
            int i = sjxVar.c;
            int i2 = i == 0 ? 10 : i * 2;
            if (i2 < i) {
                e9d0.o();
                return;
            } else {
                sjx sjxVar2 = new sjx(Arrays.copyOf(sjxVar.b, i2), sjxVar.c, true);
                this.sessionVerbosity_ = sjxVar2;
                randomAccess = sjxVar2;
            }
        }
        ((sjx) randomAccess).c(1);
    }

    public final int s() {
        int i = 0;
        int iF = ((sjx) this.sessionVerbosity_).f(0);
        if (iF == 0) {
            i = 1;
        } else if (iF == 1) {
            i = 2;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    public final int t() {
        return ((sjx) this.sessionVerbosity_).size();
    }

    public final void v(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.sessionId_ = str;
    }
}

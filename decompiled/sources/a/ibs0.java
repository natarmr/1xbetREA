package a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class ibs0 extends kjt {
    public static final int CLIENT_START_TIME_US_FIELD_NUMBER = 4;
    public static final int COUNTERS_FIELD_NUMBER = 6;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 8;
    private static final ibs0 DEFAULT_INSTANCE;
    public static final int DURATION_US_FIELD_NUMBER = 5;
    public static final int IS_AUTO_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile iq80 PARSER = null;
    public static final int PERF_SESSIONS_FIELD_NUMBER = 9;
    public static final int SUBTRACES_FIELD_NUMBER = 7;
    private int bitField0_;
    private long clientStartTimeUs_;
    private vo20 counters_;
    private vo20 customAttributes_;
    private long durationUs_;
    private boolean isAuto_;
    private String name_;
    private amx perfSessions_;
    private amx subtraces_;

    static {
        ibs0 ibs0Var = new ibs0();
        DEFAULT_INSTANCE = ibs0Var;
        kjt.p(ibs0.class, ibs0Var);
    }

    public ibs0() {
        vo20 vo20Var = vo20.b;
        this.counters_ = vo20Var;
        this.customAttributes_ = vo20Var;
        this.name_ = "";
        e5d0 e5d0Var = e5d0.d;
        this.subtraces_ = e5d0Var;
        this.perfSessions_ = e5d0Var;
    }

    public static fbs0 H() {
        return (fbs0) DEFAULT_INSTANCE.i();
    }

    public static ibs0 z() {
        return DEFAULT_INSTANCE;
    }

    public final long A() {
        return this.durationUs_;
    }

    public final String B() {
        return this.name_;
    }

    public final amx C() {
        return this.perfSessions_;
    }

    public final amx D() {
        return this.subtraces_;
    }

    public final boolean E() {
        return (this.bitField0_ & 4) != 0;
    }

    public final vo20 F() {
        vo20 vo20Var = this.counters_;
        if (vo20Var.f37745a) {
            return vo20Var;
        }
        vo20 vo20VarD = vo20Var.d();
        this.counters_ = vo20VarD;
        return vo20VarD;
    }

    public final vo20 G() {
        vo20 vo20Var = this.customAttributes_;
        if (vo20Var.f37745a) {
            return vo20Var;
        }
        vo20 vo20VarD = vo20Var.d();
        this.customAttributes_ = vo20VarD;
        return vo20VarD;
    }

    public final void I(long j) {
        this.bitField0_ |= 4;
        this.clientStartTimeUs_ = j;
    }

    public final void J(long j) {
        this.bitField0_ |= 8;
        this.durationUs_ = j;
    }

    public final void K(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.name_ = str;
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
                return new y9e0(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\t\b\u0002\u0002\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0004ဂ\u0002\u0005ဂ\u0003\u00062\u0007\u001b\b2\t\u001b", new Object[]{"bitField0_", "name_", "isAuto_", "clientStartTimeUs_", "durationUs_", "counters_", gbs0.f11028a, "subtraces_", ibs0.class, "customAttributes_", hbs0.f12786a, "perfSessions_", rd90.class});
            case 3:
                return new ibs0();
            case 4:
                return new fbs0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                iq80 iq80Var = PARSER;
                if (iq80Var != null) {
                    return iq80Var;
                }
                synchronized (ibs0.class) {
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

    public final void r(List list) {
        amx amxVarO = this.perfSessions_;
        if (!((n4) amxVarO).f22873a) {
            amxVarO = kjt.o(amxVarO);
            this.perfSessions_ = amxVarO;
        }
        zit.g(list, amxVarO);
    }

    public final void s(ArrayList arrayList) {
        amx amxVarO = this.subtraces_;
        if (!((n4) amxVarO).f22873a) {
            amxVarO = kjt.o(amxVarO);
            this.subtraces_ = amxVarO;
        }
        zit.g(arrayList, amxVarO);
    }

    public final void t(rd90 rd90Var) {
        amx amxVarO = this.perfSessions_;
        if (!((n4) amxVarO).f22873a) {
            amxVarO = kjt.o(amxVarO);
            this.perfSessions_ = amxVarO;
        }
        amxVarO.add(rd90Var);
    }

    public final void u(ibs0 ibs0Var) {
        ibs0Var.getClass();
        amx amxVarO = this.subtraces_;
        if (!((n4) amxVarO).f22873a) {
            amxVarO = kjt.o(amxVarO);
            this.subtraces_ = amxVarO;
        }
        amxVarO.add(ibs0Var);
    }

    public final boolean v() {
        return this.customAttributes_.containsKey("Hosting_activity");
    }

    public final int w() {
        return this.counters_.size();
    }

    public final Map x() {
        return Collections.unmodifiableMap(this.counters_);
    }

    public final Map y() {
        return Collections.unmodifiableMap(this.customAttributes_);
    }
}

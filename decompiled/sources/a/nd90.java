package a;

/* JADX INFO: loaded from: classes2.dex */
public final class nd90 extends kjt implements od90 {
    public static final int APPLICATION_INFO_FIELD_NUMBER = 1;
    private static final nd90 DEFAULT_INSTANCE;
    public static final int GAUGE_METRIC_FIELD_NUMBER = 4;
    public static final int NETWORK_REQUEST_METRIC_FIELD_NUMBER = 3;
    private static volatile iq80 PARSER = null;
    public static final int TRACE_METRIC_FIELD_NUMBER = 2;
    public static final int TRANSPORT_INFO_FIELD_NUMBER = 5;
    private cs3 applicationInfo_;
    private int bitField0_;
    private set gaugeMetric_;
    private ll50 networkRequestMetric_;
    private ibs0 traceMetric_;
    private aps0 transportInfo_;

    static {
        nd90 nd90Var = new nd90();
        DEFAULT_INSTANCE = nd90Var;
        kjt.p(nd90.class, nd90Var);
    }

    public static md90 t() {
        return (md90) DEFAULT_INSTANCE.i();
    }

    @Override // a.od90
    public final boolean a() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // a.od90
    public final boolean b() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // a.od90
    public final ll50 c() {
        ll50 ll50Var = this.networkRequestMetric_;
        return ll50Var == null ? ll50.u() : ll50Var;
    }

    @Override // a.od90
    public final boolean d() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // a.od90
    public final ibs0 e() {
        ibs0 ibs0Var = this.traceMetric_;
        return ibs0Var == null ? ibs0.z() : ibs0Var;
    }

    @Override // a.od90
    public final set f() {
        set setVar = this.gaugeMetric_;
        return setVar == null ? set.v() : setVar;
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
                return new y9e0(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"bitField0_", "applicationInfo_", "traceMetric_", "networkRequestMetric_", "gaugeMetric_", "transportInfo_"});
            case 3:
                return new nd90();
            case 4:
                return new md90(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                iq80 iq80Var = PARSER;
                if (iq80Var != null) {
                    return iq80Var;
                }
                synchronized (nd90.class) {
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

    public final cs3 r() {
        cs3 cs3Var = this.applicationInfo_;
        return cs3Var == null ? cs3.s() : cs3Var;
    }

    public final boolean s() {
        return (this.bitField0_ & 1) != 0;
    }

    public final void u(cs3 cs3Var) {
        this.applicationInfo_ = cs3Var;
        this.bitField0_ |= 1;
    }

    public final void v(set setVar) {
        this.gaugeMetric_ = setVar;
        this.bitField0_ |= 8;
    }

    public final void w(ll50 ll50Var) {
        this.networkRequestMetric_ = ll50Var;
        this.bitField0_ |= 4;
    }

    public final void x(ibs0 ibs0Var) {
        this.traceMetric_ = ibs0Var;
        this.bitField0_ |= 2;
    }
}

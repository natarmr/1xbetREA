package a;

/* JADX INFO: loaded from: classes2.dex */
public final class set extends kjt {
    public static final int ANDROID_MEMORY_READINGS_FIELD_NUMBER = 4;
    public static final int CPU_METRIC_READINGS_FIELD_NUMBER = 2;
    private static final set DEFAULT_INSTANCE;
    public static final int GAUGE_METADATA_FIELD_NUMBER = 3;
    private static volatile iq80 PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    private amx androidMemoryReadings_;
    private int bitField0_;
    private amx cpuMetricReadings_;
    private pet gaugeMetadata_;
    private String sessionId_ = "";

    static {
        set setVar = new set();
        DEFAULT_INSTANCE = setVar;
        kjt.p(set.class, setVar);
    }

    public set() {
        e5d0 e5d0Var = e5d0.d;
        this.cpuMetricReadings_ = e5d0Var;
        this.androidMemoryReadings_ = e5d0Var;
    }

    public static set v() {
        return DEFAULT_INSTANCE;
    }

    public static ret z() {
        return (ret) DEFAULT_INSTANCE.i();
    }

    public final void A(pet petVar) {
        petVar.getClass();
        this.gaugeMetadata_ = petVar;
        this.bitField0_ |= 2;
    }

    public final void B(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.sessionId_ = str;
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
                return new y9e0(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဉ\u0001\u0004\u001b", new Object[]{"bitField0_", "sessionId_", "cpuMetricReadings_", y7f.class, "gaugeMetadata_", "androidMemoryReadings_", m03.class});
            case 3:
                return new set();
            case 4:
                return new ret(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                iq80 iq80Var = PARSER;
                if (iq80Var != null) {
                    return iq80Var;
                }
                synchronized (set.class) {
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

    public final void r(m03 m03Var) {
        m03Var.getClass();
        amx amxVarO = this.androidMemoryReadings_;
        if (!((n4) amxVarO).f22873a) {
            amxVarO = kjt.o(amxVarO);
            this.androidMemoryReadings_ = amxVarO;
        }
        amxVarO.add(m03Var);
    }

    public final void s(y7f y7fVar) {
        y7fVar.getClass();
        amx amxVarO = this.cpuMetricReadings_;
        if (!((n4) amxVarO).f22873a) {
            amxVarO = kjt.o(amxVarO);
            this.cpuMetricReadings_ = amxVarO;
        }
        amxVarO.add(y7fVar);
    }

    public final int t() {
        return this.androidMemoryReadings_.size();
    }

    public final int u() {
        return this.cpuMetricReadings_.size();
    }

    public final pet w() {
        pet petVar = this.gaugeMetadata_;
        return petVar == null ? pet.r() : petVar;
    }

    public final boolean x() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean y() {
        return (this.bitField0_ & 1) != 0;
    }
}

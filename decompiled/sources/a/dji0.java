package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@ahi0
public final class dji0 {
    public static final cji0 Companion = new cji0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f6188a;
    public final Double b;
    public final Integer c;
    public final Integer d;
    public final Long e;

    public /* synthetic */ dji0(int i, Boolean bool, Double d, Integer num, Integer num2, Long l) {
        if (31 != (i & 31)) {
            m2x.I(i, 31, bji0.f2710a.getDescriptor());
            throw null;
        }
        this.f6188a = bool;
        this.b = d;
        this.c = num;
        this.d = num2;
        this.e = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dji0)) {
            return false;
        }
        dji0 dji0Var = (dji0) obj;
        return Intrinsics.d(this.f6188a, dji0Var.f6188a) && Intrinsics.d(this.b, dji0Var.b) && Intrinsics.d(this.c, dji0Var.c) && Intrinsics.d(this.d, dji0Var.d) && Intrinsics.d(this.e, dji0Var.e);
    }

    public final int hashCode() {
        Boolean bool = this.f6188a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Double d = this.b;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        Integer num = this.c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.d;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l = this.e;
        return iHashCode4 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        return "SessionConfigs(sessionsEnabled=" + this.f6188a + ", sessionSamplingRate=" + this.b + ", sessionTimeoutSeconds=" + this.c + ", cacheDurationSeconds=" + this.d + ", cacheUpdatedTimeSeconds=" + this.e + ')';
    }

    public dji0(Boolean bool, Double d, Integer num, Integer num2, Long l) {
        this.f6188a = bool;
        this.b = d;
        this.c = num;
        this.d = num2;
        this.e = l;
    }
}

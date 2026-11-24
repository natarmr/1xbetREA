package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public abstract class fw40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f10242a = idm0.t(14);

    public static final long a(long j, long j2) {
        if (!daq0.d(j2)) {
            jf4.o(kng0.l("The multiplier must be in em, but was ", daq0.f(j2), Separators.DOT));
            return 0L;
        }
        if (daq0.d(j)) {
            jf4.n(kng0.l("Cannot convert Em to Px when style.fontSize is Em (", daq0.f(j2), "). Please declare the style.fontSize with Sp units instead."));
            return 0L;
        }
        long j3 = j & 1095216660480L;
        if (j3 != 0) {
            float fC = daq0.c(j2);
            idm0.m(j);
            return idm0.v(daq0.c(j) * fC, j3);
        }
        float fC2 = daq0.c(j2);
        long j4 = f10242a;
        idm0.m(j4);
        return idm0.v(daq0.c(j4) * fC2, 1095216660480L & j4);
    }
}

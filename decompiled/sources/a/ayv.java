package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class ayv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f1688a;
    public final long b;
    public final float c;
    public final long d;
    public final long e;

    public ayv(long j, long j2, float f, long j3, long j4) {
        this.f1688a = j;
        this.b = j2;
        this.c = f;
        this.d = j3;
        this.e = j4;
    }

    public final String toString() {
        String strH = ne60.h(this.b);
        String strH2 = ne60.h(this.d);
        StringBuilder sbO = axq.o(this.f1688a, "HistoricalChange(uptimeMillis=", ", position=", strH);
        sbO.append(", scaleFactor=");
        sbO.append(this.c);
        sbO.append(", panOffset=");
        sbO.append(strH2);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}

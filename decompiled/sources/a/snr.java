package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class snr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f32508a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final zbk f;

    public snr(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, zbk zbkVar) {
        this.f32508a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = zbkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof snr) {
            snr snrVar = (snr) obj;
            return this.f32508a == snrVar.f32508a && this.b == snrVar.b && this.c == snrVar.c && this.d == snrVar.d && this.e == snrVar.e && this.f == snrVar.f;
        }
        return false;
    }

    public final int hashCode() {
        return this.f.hashCode() + brm0.e(brm0.e(brm0.e(brm0.e(Boolean.hashCode(this.f32508a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("GameAdvancedToolbarUiModel(menuEnabled=", ", menuVisible=", ", quickBetVisible=", this.f32508a, this.b);
        ua80.u(", quickBetEnabled=", ", quickBetActive=", sbQ, this.c, this.d);
        sbQ.append(this.e);
        sbQ.append(", title=");
        sbQ.append(this.f);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}

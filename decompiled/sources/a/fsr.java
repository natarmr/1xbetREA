package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class fsr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bfu0 f10077a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public fsr(bfu0 bfu0Var, boolean z, boolean z2, boolean z3) {
        this.f10077a = bfu0Var;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fsr)) {
            return false;
        }
        fsr fsrVar = (fsr) obj;
        return this.f10077a.equals(fsrVar.f10077a) && this.b == fsrVar.b && this.c == fsrVar.c && this.d == fsrVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + brm0.e(brm0.e(this.f10077a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GameBroadcastModel(videoMetaInfoModel=");
        sb.append(this.f10077a);
        sb.append(", liveBroadcastAvailable=");
        sb.append(this.b);
        sb.append(", oneXZoneAvailable=");
        return ohs0.p(", needStartVideo=", Separators.RPAREN, sb, this.c, this.d);
    }
}

package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class bif {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f2657a;
    public final ohf b;
    public final double c;
    public final ArrayList d;

    public bif(double d, ohf ohfVar, double d2, ArrayList arrayList) {
        this.f2657a = d;
        this.b = ohfVar;
        this.c = d2;
        this.d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bif)) {
            return false;
        }
        bif bifVar = (bif) obj;
        return Double.compare(this.f2657a, bifVar.f2657a) == 0 && this.b == bifVar.b && Double.compare(this.c, bifVar.c) == 0 && this.d.equals(bifVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + brm0.d(this.c, (this.b.hashCode() + (Double.hashCode(this.f2657a) * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CrystalWinComboModel(coeff=");
        sb.append(this.f2657a);
        sb.append(", crystalType=");
        sb.append(this.b);
        ohs0.A(sb, this.c, ", winSum=", ", winCrystalCoordinates=");
        return rz4.n(sb, this.d, Separators.RPAREN);
    }
}

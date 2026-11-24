package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class oda implements rda {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j83 f25066a;
    public final j83 b;
    public final ArrayList c;
    public final ArrayList d;
    public final mpm e;

    public oda(j83 j83Var, j83 j83Var2, ArrayList arrayList, ArrayList arrayList2, mpm mpmVar) {
        this.f25066a = j83Var;
        this.b = j83Var2;
        this.c = arrayList;
        this.d = arrayList2;
        this.e = mpmVar;
        dja djaVar = dja.PENALTY;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oda)) {
            return false;
        }
        oda odaVar = (oda) obj;
        return this.f25066a.equals(odaVar.f25066a) && this.b.equals(odaVar.b) && this.c.equals(odaVar.c) && this.d.equals(odaVar.d) && this.e.equals(odaVar.e);
    }

    @Override // a.bja
    public final dja getType() {
        return dja.COMMON;
    }

    public final int hashCode() {
        return this.e.hashCode() + twn.g(this.d, twn.g(this.c, brm0.f(this.b, this.f25066a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        return "MultiTeam(topInfo=" + ((Object) this.f25066a) + ", bottomInfo=" + ((Object) this.b) + ", teamOne=" + this.c + ", teamTwo=" + this.d + ", score=" + this.e + Separators.RPAREN;
    }
}

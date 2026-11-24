package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class bla implements bja {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ao8 f2785a;
    public final udp0 b;
    public final udp0 c;
    public final t5h0 d;
    public final String e;

    public bla(ao8 ao8Var, udp0 udp0Var, udp0 udp0Var2, t5h0 t5h0Var, String str) {
        dja djaVar = dja.PENALTY;
        str.getClass();
        this.f2785a = ao8Var;
        this.b = udp0Var;
        this.c = udp0Var2;
        this.d = t5h0Var;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bla)) {
            return false;
        }
        bla blaVar = (bla) obj;
        dja djaVar = dja.PENALTY;
        return this.f2785a.equals(blaVar.f2785a) && this.b.equals(blaVar.b) && this.c.equals(blaVar.c) && this.d.equals(blaVar.d) && Intrinsics.d(this.e, blaVar.e);
    }

    @Override // a.bja
    public final dja getType() {
        return dja.PERIODS;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + ((this.f2785a.hashCode() + (dja.PERIODS.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "CardPeriodsScoreUiModel(type=" + dja.PERIODS + ", bottomInfoUiModel=" + this.f2785a + ", teamOne=" + this.b + ", teamTwo=" + this.c + ", score=" + this.d + ", periodLabel=" + this.e + Separators.RPAREN;
    }
}

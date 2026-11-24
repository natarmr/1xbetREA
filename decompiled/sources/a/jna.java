package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class jna implements cja {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zrj0 f16803a;
    public final mmo b;
    public final bo8 c;

    public jna(zrj0 zrj0Var, mmo mmoVar, bo8 bo8Var) {
        dja djaVar = dja.PENALTY;
        this.f16803a = zrj0Var;
        this.b = mmoVar;
        this.c = bo8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jna)) {
            return false;
        }
        jna jnaVar = (jna) obj;
        dja djaVar = dja.PENALTY;
        return this.f16803a.equals(jnaVar.f16803a) && this.b.equals(jnaVar.b) && this.c.equals(jnaVar.c);
    }

    @Override // a.cja
    public final dja getType() {
        return dja.SHORT_STATISTIC;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + ((this.f16803a.hashCode() + (dja.SHORT_STATISTIC.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "CardShortStatisticUiModel(type=" + dja.SHORT_STATISTIC + ", shortInfoUiModel=" + this.f16803a + ", btnUiModel=" + this.b + ", bottomInfoUiModel=" + this.c + Separators.RPAREN;
    }
}

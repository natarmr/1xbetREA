package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class yoa implements cja {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n1v0 f42975a;
    public final bo8 b;

    public yoa(n1v0 n1v0Var, bo8 bo8Var) {
        dja djaVar = dja.PENALTY;
        this.f42975a = n1v0Var;
        this.b = bo8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yoa)) {
            return false;
        }
        yoa yoaVar = (yoa) obj;
        dja djaVar = dja.PENALTY;
        return this.f42975a.equals(yoaVar.f42975a) && this.b.equals(yoaVar.b);
    }

    @Override // a.cja
    public final dja getType() {
        return dja.WEATHER;
    }

    public final int hashCode() {
        return this.b.hashCode() + ((this.f42975a.hashCode() + (dja.WEATHER.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "CardWeatherUiModel(type=" + dja.WEATHER + ", weatherInfoUiModel=" + this.f42975a + ", bottomInfoUiModel=" + this.b + Separators.RPAREN;
    }
}

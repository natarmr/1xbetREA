package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class xoa implements bja {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j1v0 f41206a;
    public final ao8 b;

    public xoa(j1v0 j1v0Var, ao8 ao8Var) {
        dja djaVar = dja.PENALTY;
        this.f41206a = j1v0Var;
        this.b = ao8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xoa)) {
            return false;
        }
        xoa xoaVar = (xoa) obj;
        dja djaVar = dja.PENALTY;
        return this.f41206a.equals(xoaVar.f41206a) && this.b.equals(xoaVar.b);
    }

    @Override // a.bja
    public final dja getType() {
        return dja.WEATHER;
    }

    public final int hashCode() {
        return this.b.hashCode() + ((this.f41206a.hashCode() + (dja.WEATHER.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "CardWeatherUiModel(type=" + dja.WEATHER + ", weatherInfoUiModel=" + this.f41206a + ", bottomInfoUiModel=" + this.b + Separators.RPAREN;
    }
}

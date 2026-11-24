package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class zch0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f44167a;
    public final int b;

    public zch0(int i, int i2) {
        this.f44167a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zch0)) {
            return false;
        }
        zch0 zch0Var = (zch0) obj;
        return this.f44167a == zch0Var.f44167a && this.b == zch0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.f44167a) * 31);
    }

    public final String toString() {
        return ohs0.m("SeaBattleCoordinatesModel(x=", this.f44167a, ", y=", Separators.RPAREN, this.b);
    }
}

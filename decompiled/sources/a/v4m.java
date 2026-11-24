package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class v4m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f36788a;
    public final int b;

    public v4m(int i, int i2) {
        this.f36788a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v4m)) {
            return false;
        }
        v4m v4mVar = (v4m) obj;
        return this.f36788a == v4mVar.f36788a && this.b == v4mVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.f36788a) * 31);
    }

    public final String toString() {
        return ohs0.m("DsCyberGameChartValueItemUiModel(valueX=", this.f36788a, ", valueY=", Separators.RPAREN, this.b);
    }
}

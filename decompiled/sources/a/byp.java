package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class byp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3429a;
    public final float b;

    public byp(float f, int i) {
        this.f3429a = i;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof byp)) {
            return false;
        }
        byp bypVar = (byp) obj;
        return this.f3429a == bypVar.f3429a && Float.compare(this.b, bypVar.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Integer.hashCode(this.f3429a) * 31);
    }

    public final String toString() {
        return "FighterStatisticValueModel(count=" + this.f3429a + ", percent=" + this.b + Separators.RPAREN;
    }
}

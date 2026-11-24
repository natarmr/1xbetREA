package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class cba extends eba {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4052a;
    public final float b;

    public cba(float f, int i) {
        this.f4052a = i;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cba)) {
            return false;
        }
        cba cbaVar = (cba) obj;
        return this.f4052a == cbaVar.f4052a && Float.compare(this.b, cbaVar.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Integer.hashCode(this.f4052a) * 31);
    }

    public final String toString() {
        return "Card(image=" + this.f4052a + ", opacity=" + this.b + Separators.RPAREN;
    }
}

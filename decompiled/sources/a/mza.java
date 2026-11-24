package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class mza {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22643a;
    public final String b;
    public final float c;

    public mza(float f, String str, String str2) {
        this.f22643a = str;
        this.b = str2;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mza)) {
            return false;
        }
        mza mzaVar = (mza) obj;
        return this.f22643a.equals(mzaVar.f22643a) && this.b.equals(mzaVar.b) && Float.compare(this.c, mzaVar.c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + ua80.b(this.f22643a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return kng0.o(b1j.n("CashbackProgressState(currentValue=", this.f22643a, ", limitValue=", this.b, ", progress="), this.c, Separators.RPAREN);
    }
}

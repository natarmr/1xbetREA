package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class uvv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36367a;
    public final long b;
    public final int c;

    public uvv(String str, long j, int i) {
        this.f36367a = str;
        this.b = j;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uvv)) {
            return false;
        }
        uvv uvvVar = (uvv) obj;
        return this.f36367a.equals(uvvVar.f36367a) && this.b == uvvVar.b && this.c == uvvVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + rw2.b(this.f36367a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return vqd.p(f140.o(this.b, "HeroItemUiModel(image=", this.f36367a, ", time="), ", positionIcon=", this.c, Separators.RPAREN);
    }
}

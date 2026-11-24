package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class wrl implements xrl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39649a;
    public final int b;

    public wrl(int i, int i2) {
        this.f39649a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wrl)) {
            return false;
        }
        wrl wrlVar = (wrl) obj;
        return this.f39649a == wrlVar.f39649a && this.b == wrlVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.f39649a) * 31);
    }

    public final String toString() {
        return ohs0.m("InProgress(progress=", this.f39649a, ", maxProgress=", Separators.RPAREN, this.b);
    }
}

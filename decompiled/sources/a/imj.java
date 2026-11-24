package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class imj extends upj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15028a;
    public final boolean b;

    public imj(int i, boolean z) {
        this.f15028a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof imj)) {
            return false;
        }
        imj imjVar = (imj) obj;
        return this.f15028a == imjVar.f15028a && this.b == imjVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + twn.a(this.f15028a, Boolean.hashCode(false) * 31, 31);
    }

    public final String toString() {
        return rz4.i(this.f15028a, "Cyber(hasBackStack=false, cyberType=", ", isEsportsWorldCup=", Separators.RPAREN, this.b);
    }
}

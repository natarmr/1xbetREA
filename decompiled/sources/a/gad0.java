package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class gad0 implements pdd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10961a;
    public final boolean b;

    public gad0(int i, boolean z) {
        this.f10961a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gad0)) {
            return false;
        }
        gad0 gad0Var = (gad0) obj;
        return this.f10961a == gad0Var.f10961a && this.b == gad0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(this.f10961a) * 31);
    }

    public final String toString() {
        return rz4.i(this.f10961a, "Cyber(cyberType=", ", isEsportsWorldCup=", Separators.RPAREN, this.b);
    }
}

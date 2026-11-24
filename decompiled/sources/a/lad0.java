package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class lad0 implements pdd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19701a;

    public lad0(int i) {
        this.f19701a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lad0) && this.f19701a == ((lad0) obj).f19701a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f19701a);
    }

    public final String toString() {
        return ua80.e(this.f19701a, "CyberHltv(cyberType=", Separators.RPAREN);
    }
}

package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class fvr0 implements ivr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10228a;

    public fvr0(int i) {
        this.f10228a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fvr0) && this.f10228a == ((fvr0) obj).f10228a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f10228a);
    }

    public final String toString() {
        return ua80.e(this.f10228a, "OnTirageParamsClick(tirageNum=", Separators.RPAREN);
    }
}

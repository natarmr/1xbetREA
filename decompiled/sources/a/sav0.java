package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class sav0 implements tav0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f31902a;

    public /* synthetic */ sav0(int i) {
        this.f31902a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof sav0) {
            return this.f31902a == ((sav0) obj).f31902a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f31902a);
    }

    public final String toString() {
        return ua80.e(this.f31902a, "OnTabSelected(tabPosition=", Separators.RPAREN);
    }
}

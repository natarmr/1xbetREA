package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class xb90 implements cc90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40591a;

    public /* synthetic */ xb90(String str) {
        this.f40591a = str;
    }

    @Override // a.cc90
    public final String a() {
        return this.f40591a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xb90) {
            return this.f40591a.equals(((xb90) obj).f40591a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f40591a.hashCode();
    }

    public final String toString() {
        return kng0.l("Active(penaltyNumber=", this.f40591a, Separators.RPAREN);
    }
}

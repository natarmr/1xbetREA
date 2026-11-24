package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class xhf implements yhf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final igg0 f40888a;

    public final boolean equals(Object obj) {
        if (obj instanceof xhf) {
            return this.f40888a == ((xhf) obj).f40888a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f40888a.hashCode();
    }

    public final String toString() {
        return "RoundState(value=" + this.f40888a + Separators.RPAREN;
    }
}

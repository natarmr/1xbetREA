package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class t1b0 implements b2b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vs5 f33162a;

    public t1b0(vs5 vs5Var) {
        this.f33162a = vs5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t1b0) && this.f33162a.equals(((t1b0) obj).f33162a);
    }

    public final int hashCode() {
        return this.f33162a.hashCode();
    }

    public final String toString() {
        return "OnBannerClick(type=" + this.f33162a + Separators.RPAREN;
    }
}

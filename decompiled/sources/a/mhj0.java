package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class mhj0 implements ohj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i8m0 f21797a;

    public static String a(i8m0 i8m0Var) {
        return "Status(value=" + i8m0Var + Separators.RPAREN;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof mhj0) {
            return this.f21797a == ((mhj0) obj).f21797a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f21797a.hashCode();
    }

    public final String toString() {
        return a(this.f21797a);
    }
}

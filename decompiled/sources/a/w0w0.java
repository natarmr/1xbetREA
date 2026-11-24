package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class w0w0 implements g1w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m7h0 f38370a;

    public w0w0(m7h0 m7h0Var) {
        m7h0Var.getClass();
        this.f38370a = m7h0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w0w0) && Intrinsics.d(this.f38370a, ((w0w0) obj).f38370a);
    }

    public final int hashCode() {
        return this.f38370a.hashCode();
    }

    public final String toString() {
        return "Navigate(screen=" + this.f38370a + Separators.RPAREN;
    }
}

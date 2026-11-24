package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class oq5 implements pq5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lq5 f25671a;

    public oq5(lq5 lq5Var) {
        lq5Var.getClass();
        this.f25671a = lq5Var;
    }

    @Override // a.pq5
    public final lq5 a() {
        return this.f25671a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oq5) && Intrinsics.d(this.f25671a, ((oq5) obj).f25671a);
    }

    public final int hashCode() {
        return this.f25671a.hashCode();
    }

    public final String toString() {
        return "Loading(style=" + this.f25671a + Separators.RPAREN;
    }
}

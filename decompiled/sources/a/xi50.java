package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class xi50 implements yi50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uf50 f40928a;

    public xi50(uf50 uf50Var) {
        uf50Var.getClass();
        this.f40928a = uf50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xi50) && Intrinsics.d(this.f40928a, ((xi50) obj).f40928a);
    }

    public final int hashCode() {
        return this.f40928a.hashCode();
    }

    public final String toString() {
        return "Loaded(card=" + this.f40928a + Separators.RPAREN;
    }
}

package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class jz3 implements lz3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pm80 f17390a;

    public jz3(pm80 pm80Var) {
        this.f17390a = pm80Var;
    }

    @Override // a.lz3
    public final pm80 a() {
        return this.f17390a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jz3) && Intrinsics.d(this.f17390a, ((jz3) obj).f17390a);
    }

    public final int hashCode() {
        pm80 pm80Var = this.f17390a;
        if (pm80Var == null) {
            return 0;
        }
        return pm80Var.hashCode();
    }

    public final String toString() {
        return "Loading(painter=" + this.f17390a + Separators.RPAREN;
    }
}

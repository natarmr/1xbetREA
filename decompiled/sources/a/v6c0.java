package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class v6c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final czc0 f36871a;
    public final boolean b;

    public v6c0(czc0 czc0Var, boolean z) {
        this.f36871a = czc0Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v6c0)) {
            return false;
        }
        v6c0 v6c0Var = (v6c0) obj;
        return Intrinsics.d(this.f36871a, v6c0Var.f36871a) && this.b == v6c0Var.b;
    }

    public final int hashCode() {
        czc0 czc0Var = this.f36871a;
        return Boolean.hashCode(this.b) + ((czc0Var == null ? 0 : czc0Var.hashCode()) * 31);
    }

    public final String toString() {
        return "PromoBetTabKeyModel(promocodeState=" + this.f36871a + ", forceLoading=" + this.b + Separators.RPAREN;
    }
}

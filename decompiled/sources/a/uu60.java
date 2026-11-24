package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class uu60 implements vu60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ed50 f36285a;
    public final zva b;

    public uu60(ed50 ed50Var, zva zvaVar) {
        ed50Var.getClass();
        zvaVar.getClass();
        this.f36285a = ed50Var;
        this.b = zvaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uu60)) {
            return false;
        }
        uu60 uu60Var = (uu60) obj;
        return Intrinsics.d(this.f36285a, uu60Var.f36285a) && Intrinsics.d(this.b, uu60Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f36285a.f7602a.hashCode() * 31);
    }

    public final String toString() {
        return "Loading(navigationBarUiState=" + this.f36285a + ", accountUiState=" + this.b + Separators.RPAREN;
    }
}

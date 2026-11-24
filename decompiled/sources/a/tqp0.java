package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class tqp0 implements uqp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f34391a;

    public tqp0(i4 i4Var) {
        i4Var.getClass();
        this.f34391a = i4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tqp0) && Intrinsics.d(this.f34391a, ((tqp0) obj).f34391a);
    }

    @Override // a.hvk0
    public final Object getKey() {
        return tqp0.class;
    }

    public final int hashCode() {
        return this.f34391a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f34391a, "TeamsLUiModel(list=", Separators.RPAREN);
    }
}

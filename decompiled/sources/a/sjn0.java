package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class sjn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f32311a;
    public final boolean b;

    public sjn0(List list, boolean z) {
        list.getClass();
        this.f32311a = list;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sjn0)) {
            return false;
        }
        sjn0 sjn0Var = (sjn0) obj;
        return Intrinsics.d(this.f32311a, sjn0Var.f32311a) && this.b == sjn0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f32311a.hashCode() * 31);
    }

    public final String toString() {
        return "SupportMenuScreenUiStateModel(items=" + this.f32311a + ", isLoading=" + this.b + Separators.RPAREN;
    }
}

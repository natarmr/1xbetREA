package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class u5d0 implements y5d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x2q f35088a;

    public u5d0(x2q x2qVar) {
        this.f35088a = x2qVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u5d0) && Intrinsics.d(this.f35088a, ((u5d0) obj).f35088a);
    }

    public final int hashCode() {
        x2q x2qVar = this.f35088a;
        if (x2qVar == null) {
            return 0;
        }
        return x2qVar.hashCode();
    }

    public final String toString() {
        return "Content(selectedProvidersFilterCategoryModel=" + this.f35088a + Separators.RPAREN;
    }
}

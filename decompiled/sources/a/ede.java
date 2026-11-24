package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ede implements lde {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f7612a;

    public ede(a4x a4xVar) {
        a4xVar.getClass();
        this.f7612a = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ede) && Intrinsics.d(this.f7612a, ((ede) obj).f7612a);
    }

    public final int hashCode() {
        return this.f7612a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f7612a, "Items(items=", Separators.RPAREN);
    }
}

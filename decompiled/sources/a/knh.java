package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class knh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f18586a;

    public knh(a4x a4xVar) {
        a4xVar.getClass();
        this.f18586a = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof knh) && Intrinsics.d(this.f18586a, ((knh) obj).f18586a);
    }

    public final int hashCode() {
        return this.f18586a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f18586a, "Content(itemList=", Separators.RPAREN);
    }
}

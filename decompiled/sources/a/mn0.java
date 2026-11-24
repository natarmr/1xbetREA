package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class mn0 implements on0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f22067a;

    public mn0(a4x a4xVar) {
        a4xVar.getClass();
        this.f22067a = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mn0) && Intrinsics.d(this.f22067a, ((mn0) obj).f22067a);
    }

    public final int hashCode() {
        return this.f22067a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f22067a, "Categories(items=", Separators.RPAREN);
    }
}

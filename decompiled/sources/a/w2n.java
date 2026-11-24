package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class w2n implements y2n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f38457a;

    public w2n(a4x a4xVar) {
        a4xVar.getClass();
        this.f38457a = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w2n) && Intrinsics.d(this.f38457a, ((w2n) obj).f38457a);
    }

    public final int hashCode() {
        return this.f38457a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f38457a, "Default(items=", Separators.RPAREN);
    }
}

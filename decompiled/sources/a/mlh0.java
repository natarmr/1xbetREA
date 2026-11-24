package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class mlh0 implements plh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f21990a;

    public mlh0(a4x a4xVar) {
        a4xVar.getClass();
        this.f21990a = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mlh0) && Intrinsics.d(this.f21990a, ((mlh0) obj).f21990a);
    }

    public final int hashCode() {
        return this.f21990a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f21990a, "Content(secretQuestionCellItems=", Separators.RPAREN);
    }
}

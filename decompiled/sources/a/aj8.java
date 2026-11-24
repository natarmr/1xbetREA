package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class aj8 implements cj8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f961a;

    public aj8(a4x a4xVar) {
        a4xVar.getClass();
        this.f961a = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aj8) && Intrinsics.d(this.f961a, ((aj8) obj).f961a);
    }

    public final int hashCode() {
        return this.f961a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f961a, "Content(items=", Separators.RPAREN);
    }
}

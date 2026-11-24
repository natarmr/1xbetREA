package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class uuc0 implements yuc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f36293a;

    public uuc0(a4x a4xVar) {
        a4xVar.getClass();
        this.f36293a = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uuc0) && Intrinsics.d(this.f36293a, ((uuc0) obj).f36293a);
    }

    public final int hashCode() {
        return this.f36293a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f36293a, "Content(cards=", Separators.RPAREN);
    }
}

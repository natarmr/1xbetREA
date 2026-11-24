package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ujs0 implements xjs0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f35799a;

    public ujs0(a4x a4xVar) {
        a4xVar.getClass();
        this.f35799a = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ujs0) && Intrinsics.d(this.f35799a, ((ujs0) obj).f35799a);
    }

    public final int hashCode() {
        return this.f35799a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f35799a, "Data(transfers=", Separators.RPAREN);
    }
}

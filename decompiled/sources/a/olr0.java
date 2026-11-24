package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class olr0 implements plr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f25472a;

    public olr0(a4x a4xVar) {
        a4xVar.getClass();
        this.f25472a = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof olr0) && Intrinsics.d(this.f25472a, ((olr0) obj).f25472a);
    }

    public final int hashCode() {
        return this.f25472a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f25472a, "Success(tirageUiItems=", Separators.RPAREN);
    }
}

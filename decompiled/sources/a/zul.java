package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class zul implements bvl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f45015a;

    public zul(a4x a4xVar) {
        a4xVar.getClass();
        this.f45015a = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zul) && Intrinsics.d(this.f45015a, ((zul) obj).f45015a);
    }

    public final int hashCode() {
        return this.f45015a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f45015a, "Content(cards=", Separators.RPAREN);
    }
}

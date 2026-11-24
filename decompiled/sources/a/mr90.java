package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class mr90 implements or90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f22258a;

    public mr90(a4x a4xVar) {
        a4xVar.getClass();
        this.f22258a = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mr90) && Intrinsics.d(this.f22258a, ((mr90) obj).f22258a);
    }

    public final int hashCode() {
        return this.f22258a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f22258a, "Data(middleContent=", Separators.RPAREN);
    }
}

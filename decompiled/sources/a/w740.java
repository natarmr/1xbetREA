package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class w740 implements z740 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f38653a;

    public w740(a4x a4xVar) {
        a4xVar.getClass();
        this.f38653a = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w740) && Intrinsics.d(this.f38653a, ((w740) obj).f38653a);
    }

    public final int hashCode() {
        return this.f38653a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f38653a, "Data(messages=", Separators.RPAREN);
    }
}

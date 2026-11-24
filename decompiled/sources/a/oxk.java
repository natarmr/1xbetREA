package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class oxk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26016a;
    public final boolean b;
    public final a4x c;

    public oxk(a4x a4xVar, String str, boolean z) {
        str.getClass();
        a4xVar.getClass();
        this.f26016a = str;
        this.b = z;
        this.c = a4xVar;
    }

    public static oxk a(oxk oxkVar, a4x a4xVar) {
        String str = oxkVar.f26016a;
        oxkVar.getClass();
        str.getClass();
        a4xVar.getClass();
        return new oxk(a4xVar, str, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oxk)) {
            return false;
        }
        oxk oxkVar = (oxk) obj;
        return Intrinsics.d(this.f26016a, oxkVar.f26016a) && this.b == oxkVar.b && Intrinsics.d(this.c, oxkVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + brm0.e(this.f26016a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return cs0.n(brm0.u("UiState(title=", this.f26016a, ", loading=", this.b, ", items="), this.c, Separators.RPAREN);
    }
}

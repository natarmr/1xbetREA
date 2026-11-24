package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class uie implements jje {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f35726a;
    public final cpm b;
    public final t3r0 c;
    public final boolean d;

    public uie(i4 i4Var, cpm cpmVar, t3r0 t3r0Var, boolean z) {
        i4Var.getClass();
        cpmVar.getClass();
        t3r0Var.getClass();
        this.f35726a = i4Var;
        this.b = cpmVar;
        this.c = t3r0Var;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uie)) {
            return false;
        }
        uie uieVar = (uie) obj;
        return Intrinsics.d(this.f35726a, uieVar.f35726a) && Intrinsics.d(this.b, uieVar.b) && Intrinsics.d(this.c, uieVar.c) && this.d == uieVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (this.f35726a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Data(results=" + this.f35726a + ", calendarUiModel=" + this.b + ", sportFilterUiModel=" + this.c + ", rtlSupport=" + this.d + Separators.RPAREN;
    }
}

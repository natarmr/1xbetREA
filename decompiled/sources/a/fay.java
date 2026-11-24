package a;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class fay {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0t0 f9231a;
    public final gay b;
    public final boolean c;
    public final boolean d;
    public final Set e;
    public final kzj0 f;

    public /* synthetic */ fay(b0t0 b0t0Var, boolean z, boolean z2, Set set, int i) {
        this(b0t0Var, gay.f10991a, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? null : set, null);
    }

    public static fay a(fay fayVar, gay gayVar, boolean z, Set set, kzj0 kzj0Var, int i) {
        b0t0 b0t0Var = fayVar.f9231a;
        if ((i & 2) != 0) {
            gayVar = fayVar.b;
        }
        gay gayVar2 = gayVar;
        if ((i & 4) != 0) {
            z = fayVar.c;
        }
        boolean z2 = z;
        boolean z3 = fayVar.d;
        if ((i & 16) != 0) {
            set = fayVar.e;
        }
        Set set2 = set;
        if ((i & 32) != 0) {
            kzj0Var = fayVar.f;
        }
        fayVar.getClass();
        b0t0Var.getClass();
        gayVar2.getClass();
        return new fay(b0t0Var, gayVar2, z2, z3, set2, kzj0Var);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fay)) {
            return false;
        }
        fay fayVar = (fay) obj;
        return Intrinsics.d(fayVar.f, this.f) && fayVar.f9231a == this.f9231a && fayVar.b == this.b && fayVar.c == this.c && fayVar.d == this.d;
    }

    public final int hashCode() {
        kzj0 kzj0Var = this.f;
        int iHashCode = kzj0Var != null ? kzj0Var.hashCode() : 0;
        int iHashCode2 = this.f9231a.hashCode() + (iHashCode * 31) + iHashCode;
        int iHashCode3 = this.b.hashCode() + (iHashCode2 * 31) + iHashCode2;
        int i = (iHashCode3 * 31) + (this.c ? 1 : 0) + iHashCode3;
        return (i * 31) + (this.d ? 1 : 0) + i;
    }

    public final String toString() {
        return "JavaTypeAttributes(howThisTypeIsUsed=" + this.f9231a + ", flexibility=" + this.b + ", isRaw=" + this.c + ", isForAnnotationParameter=" + this.d + ", visitedTypeParameters=" + this.e + ", defaultType=" + this.f + ')';
    }

    public fay(b0t0 b0t0Var, gay gayVar, boolean z, boolean z2, Set set, kzj0 kzj0Var) {
        this.f9231a = b0t0Var;
        this.b = gayVar;
        this.c = z;
        this.d = z2;
        this.e = set;
        this.f = kzj0Var;
    }
}

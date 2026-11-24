package a;

import android.gov.nist.core.Separators;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class vb90 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37131a;
    public final q0s b;
    public final a4x c;
    public final boolean d;
    public final boolean e;

    public vb90(q0s q0sVar, a4x a4xVar, boolean z, boolean z2) {
        String string = UUID.randomUUID().toString();
        string.getClass();
        a4xVar.getClass();
        this.f37131a = string;
        this.b = q0sVar;
        this.c = a4xVar;
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vb90)) {
            return false;
        }
        vb90 vb90Var = (vb90) obj;
        return this.f37131a.equals(vb90Var.f37131a) && this.b == vb90Var.b && Intrinsics.d(this.c, vb90Var.c) && this.d == vb90Var.d && this.e == vb90Var.e;
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f37131a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + brm0.e(cs0.b(this.c, (this.b.hashCode() + (this.f37131a.hashCode() * 31)) * 31, 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PeekingGameCardUiModel(key=");
        sb.append(this.f37131a);
        sb.append(", orientation=");
        sb.append(this.b);
        sb.append(", gamesCards=");
        sb.append(this.c);
        sb.append(", userScrollEnabled=");
        sb.append(this.d);
        sb.append(", supportRtl=");
        return rw2.p(sb, this.e, Separators.RPAREN);
    }
}

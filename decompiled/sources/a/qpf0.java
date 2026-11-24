package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class qpf0 implements rpf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wof0 f29116a;
    public final boolean b;
    public final int c;

    public qpf0(wof0 wof0Var, boolean z, int i) {
        wof0Var.getClass();
        this.f29116a = wof0Var;
        this.b = z;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qpf0)) {
            return false;
        }
        qpf0 qpf0Var = (qpf0) obj;
        return Intrinsics.d(this.f29116a, qpf0Var.f29116a) && this.b == qpf0Var.b && this.c == qpf0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + brm0.e(this.f29116a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WinGame(game=");
        sb.append(this.f29116a);
        sb.append(", bonusGame=");
        sb.append(this.b);
        sb.append(", pressedDoorIndex=");
        return rz4.j(this.c, Separators.RPAREN, sb);
    }
}

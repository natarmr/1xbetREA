package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class opf0 implements rpf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wof0 f25639a;
    public final boolean b;
    public final int c;

    public opf0(wof0 wof0Var, boolean z, int i) {
        wof0Var.getClass();
        this.f25639a = wof0Var;
        this.b = z;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof opf0)) {
            return false;
        }
        opf0 opf0Var = (opf0) obj;
        return Intrinsics.d(this.f25639a, opf0Var.f25639a) && this.b == opf0Var.b && this.c == opf0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + brm0.e(this.f25639a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LooseGame(game=");
        sb.append(this.f25639a);
        sb.append(", bonusGame=");
        sb.append(this.b);
        sb.append(", pressedDoorIndex=");
        return rz4.j(this.c, Separators.RPAREN, sb);
    }
}

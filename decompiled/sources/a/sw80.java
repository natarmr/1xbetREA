package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class sw80 implements uw80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32910a;
    public final pw80 b;
    public final rw80 c;
    public final ow80 d;

    public sw80(String str, pw80 pw80Var, rw80 rw80Var, ow80 ow80Var) {
        str.getClass();
        this.f32910a = str;
        this.b = pw80Var;
        this.c = rw80Var;
        this.d = ow80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sw80)) {
            return false;
        }
        sw80 sw80Var = (sw80) obj;
        return Intrinsics.d(this.f32910a, sw80Var.f32910a) && this.b.equals(sw80Var.b) && this.c.equals(sw80Var.c) && this.d.equals(sw80Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f32910a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Content(teamName=" + this.f32910a + ", date=" + this.b + ", teams=" + this.c + ", clickParams=" + this.d + Separators.RPAREN;
    }
}

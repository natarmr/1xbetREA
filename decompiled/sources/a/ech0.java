package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class ech0 {
    public static final ech0 e = new ech0(dch0.b, 0.0f, new yxg0((byte) 24), new brx(1, null, (byte) 1));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dch0 f7566a;
    public final float b;
    public final Function0 c;
    public final Function1 d;

    public ech0(dch0 dch0Var, float f, Function0 function0, Function1 function1) {
        this.f7566a = dch0Var;
        this.b = f;
        this.c = function0;
        this.d = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ech0)) {
            return false;
        }
        ech0 ech0Var = (ech0) obj;
        return this.f7566a == ech0Var.f7566a && Float.compare(this.b, ech0Var.b) == 0 && this.c.equals(ech0Var.c) && this.d.equals(ech0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + defpackage.c.a(this.f7566a.hashCode() * 31, this.b, 31)) * 31);
    }

    public final String toString() {
        return "ScrollInfo(direction=" + this.f7566a + ", speedMultiplier=" + this.b + ", maxScrollDistanceProvider=" + this.c + ", onScroll=" + this.d + Separators.RPAREN;
    }
}

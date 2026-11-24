package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class dlj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cne f6285a;
    public final cne b;
    public final cne c;
    public final cne d;
    public final cne e;
    public final cne f;
    public final cne g;
    public final cne h;

    public dlj0() {
        ugg0 ugg0Var = fkj0.f9696a;
        ugg0 ugg0Var2 = fkj0.b;
        ugg0 ugg0Var3 = fkj0.c;
        ugg0 ugg0Var4 = fkj0.d;
        ugg0 ugg0Var5 = fkj0.f;
        ugg0 ugg0Var6 = fkj0.e;
        ugg0 ugg0Var7 = fkj0.g;
        ugg0 ugg0Var8 = fkj0.h;
        this.f6285a = ugg0Var;
        this.b = ugg0Var2;
        this.c = ugg0Var3;
        this.d = ugg0Var4;
        this.e = ugg0Var5;
        this.f = ugg0Var6;
        this.g = ugg0Var7;
        this.h = ugg0Var8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlj0)) {
            return false;
        }
        dlj0 dlj0Var = (dlj0) obj;
        return Intrinsics.d(this.f6285a, dlj0Var.f6285a) && Intrinsics.d(this.b, dlj0Var.b) && Intrinsics.d(this.c, dlj0Var.c) && Intrinsics.d(this.d, dlj0Var.d) && Intrinsics.d(this.e, dlj0Var.e) && Intrinsics.d(this.f, dlj0Var.f) && Intrinsics.d(this.g, dlj0Var.g) && Intrinsics.d(this.h, dlj0Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f6285a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(extraSmall=" + this.f6285a + ", small=" + this.b + ", medium=" + this.c + ", large=" + this.d + ", largeIncreased=" + this.f + ", extraLarge=" + this.e + ", extralargeIncreased=" + this.g + ", extraExtraLarge=" + this.h + ')';
    }
}

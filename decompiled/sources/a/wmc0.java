package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class wmc0 implements cnc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39400a;
    public final vmc0 b;
    public final zmc0 c;
    public final anc0 d;

    public wmc0(String str, vmc0 vmc0Var, zmc0 zmc0Var, anc0 anc0Var) {
        str.getClass();
        this.f39400a = str;
        this.b = vmc0Var;
        this.c = zmc0Var;
        this.d = anc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wmc0)) {
            return false;
        }
        wmc0 wmc0Var = (wmc0) obj;
        return Intrinsics.d(this.f39400a, wmc0Var.f39400a) && this.b.equals(wmc0Var.b) && this.c.equals(wmc0Var.c) && this.d.equals(wmc0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f39400a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Content(title=" + this.f39400a + ", banner=" + this.b + ", gamesSection=" + this.c + ", menuSection=" + this.d + Separators.RPAREN;
    }
}

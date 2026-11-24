package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c3o0 implements i3o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ivm f3687a;
    public final ivm b;
    public final kpm c;
    public final String d;
    public final a4x e;
    public final String f;
    public final zum g;

    public c3o0(ivm ivmVar, ivm ivmVar2, kpm kpmVar, String str, a4x a4xVar, String str2, zum zumVar) {
        a4xVar.getClass();
        str2.getClass();
        this.f3687a = ivmVar;
        this.b = ivmVar2;
        this.c = kpmVar;
        this.d = str;
        this.e = a4xVar;
        this.f = str2;
        this.g = zumVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c3o0)) {
            return false;
        }
        c3o0 c3o0Var = (c3o0) obj;
        return this.f3687a.equals(c3o0Var.f3687a) && this.b.equals(c3o0Var.b) && this.c.equals(c3o0Var.c) && this.d.equals(c3o0Var.d) && Intrinsics.d(this.e, c3o0Var.e) && Intrinsics.d(this.f, c3o0Var.f) && this.g.equals(c3o0Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ua80.b(cs0.b(this.e, ua80.b(dw9.c(this.c, (this.b.hashCode() + (this.f3687a.hashCode() * 31)) * 31, 29791), 31, this.d), 31), 31, this.f);
    }

    public final String toString() {
        return "CyberPoker(firstOpponent=" + this.f3687a + ", secondOpponent=" + this.b + ", scoreModel=" + this.c + ", infoLabel=, infoLabel2=, gameLabel=" + this.d + ", cardOnTableList=" + this.e + ", tagLiveText=" + this.f + ", options=" + this.g + Separators.RPAREN;
    }
}

package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class sr6 implements tr6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f32661a;
    public final mtl b;
    public final a4x c;
    public final boolean d;
    public final boolean e;
    public final hyl f;

    public sr6(imm immVar, mtl mtlVar, a4x a4xVar, boolean z, boolean z2, hyl hylVar) {
        a4xVar.getClass();
        hylVar.getClass();
        this.f32661a = immVar;
        this.b = mtlVar;
        this.c = a4xVar;
        this.d = z;
        this.e = z2;
        this.f = hylVar;
    }

    @Override // a.tr6
    public final imm c() {
        return this.f32661a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sr6)) {
            return false;
        }
        sr6 sr6Var = (sr6) obj;
        return this.f32661a.equals(sr6Var.f32661a) && this.b.equals(sr6Var.b) && Intrinsics.d(this.c, sr6Var.c) && this.d == sr6Var.d && this.e == sr6Var.e && Intrinsics.d(this.f, sr6Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + brm0.e(brm0.e(cs0.b(this.c, cs0.b(this.b.f22376a, this.f32661a.hashCode() * 31, 31), 31), 31, this.d), 31, this.e);
    }

    public final String toString() {
        return "Success(appBarUiModel=" + this.f32661a + ", bottomBarUiModel=" + this.b + ", gameUiModelList=" + this.c + ", supportRtl=" + this.d + ", showMakeBet=" + this.e + ", dsChipUiModel=" + this.f + Separators.RPAREN;
    }
}

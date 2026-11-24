package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class sx60 implements vx60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cd50 f32960a;
    public final htr b;
    public final in5 c;
    public final ijl d;

    public sx60(cd50 cd50Var, htr htrVar, in5 in5Var, ijl ijlVar) {
        cd50Var.getClass();
        htrVar.getClass();
        in5Var.getClass();
        ijlVar.getClass();
        this.f32960a = cd50Var;
        this.b = htrVar;
        this.c = in5Var;
        this.d = ijlVar;
    }

    @Override // a.vx60
    public final cd50 a() {
        return this.f32960a;
    }

    @Override // a.vx60
    public final in5 b() {
        return this.c;
    }

    @Override // a.vx60
    public final ijl c() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sx60)) {
            return false;
        }
        sx60 sx60Var = (sx60) obj;
        return Intrinsics.d(this.f32960a, sx60Var.f32960a) && Intrinsics.d(this.b, sx60Var.b) && Intrinsics.d(this.c, sx60Var.c) && this.d == sx60Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f32960a.f4145a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Content(navigationBarUiState=" + this.f32960a + ", games=" + this.b + ", balanceUiState=" + this.c + ", accountSelectionStyle=" + this.d + Separators.RPAREN;
    }
}

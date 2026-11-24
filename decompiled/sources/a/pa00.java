package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class pa00 implements ra00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26632a;
    public final int b;
    public final a4x c;
    public final a4x d;
    public final int e;
    public final String f;

    public pa00(String str, int i, i4 i4Var, i4 i4Var2, int i2, String str2) {
        i4Var.getClass();
        i4Var2.getClass();
        this.f26632a = str;
        this.b = i;
        this.c = i4Var;
        this.d = i4Var2;
        this.e = i2;
        this.f = str2;
    }

    @Override // a.ra00
    public final String a() {
        return this.f26632a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pa00)) {
            return false;
        }
        pa00 pa00Var = (pa00) obj;
        return this.f26632a.equals(pa00Var.f26632a) && this.b == pa00Var.b && Intrinsics.d(this.c, pa00Var.c) && Intrinsics.d(this.d, pa00Var.d) && this.e == pa00Var.e && this.f.equals(pa00Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + twn.a(this.e, cs0.b(this.d, cs0.b(this.c, twn.a(this.b, this.f26632a.hashCode() * 31, 31), 31), 31), 31);
    }

    @Override // a.ra00
    public final int s() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sbP = kng0.p(this.b, "Hockey(backgroundUrl=", this.f26632a, ", placeholderRes=", ", lineupList=");
        hne.y(sbP, this.c, ", chipUiModelList=", this.d, ", selectedChip=");
        return rw2.k(this.e, ", key=", this.f, Separators.RPAREN, sbP);
    }
}

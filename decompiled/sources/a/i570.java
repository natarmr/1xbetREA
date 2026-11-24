package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class i570 implements k570 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f14180a;
    public final boolean b;
    public final dd50 c;
    public final h3b d;
    public final jn5 e;
    public final ijl f;

    public i570(mdm mdmVar, boolean z, dd50 dd50Var, h3b h3bVar, jn5 jn5Var, ijl ijlVar) {
        this.f14180a = mdmVar;
        this.b = z;
        this.c = dd50Var;
        this.d = h3bVar;
        this.e = jn5Var;
        this.f = ijlVar;
    }

    @Override // a.k570
    public final dd50 a() {
        return this.c;
    }

    @Override // a.k570
    public final jn5 b() {
        return this.e;
    }

    @Override // a.k570
    public final ijl c() {
        return this.f;
    }

    @Override // a.k570
    public final h3b d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i570)) {
            return false;
        }
        i570 i570Var = (i570) obj;
        return Intrinsics.d(this.f14180a, i570Var.f14180a) && this.b == i570Var.b && this.c.equals(i570Var.c) && this.d.equals(i570Var.d) && this.e.equals(i570Var.e) && this.f == i570Var.f;
    }

    public final int hashCode() {
        mdm mdmVar = this.f14180a;
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + brm0.e((mdmVar == null ? 0 : mdmVar.hashCode()) * 31, 31, this.b)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Error(config=" + this.f14180a + ", underMaintenance=" + this.b + ", navigationBarUiState=" + this.c + ", categoriesUiState=" + this.d + ", balanceUiState=" + this.e + ", accountSelectionStyle=" + this.f + Separators.RPAREN;
    }
}

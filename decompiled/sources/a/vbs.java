package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class vbs implements wbs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zdm0 f37154a;
    public final j9m0 b;
    public final boolean c;
    public final fyl d;
    public final a4x e;

    public vbs(zdm0 zdm0Var, j9m0 j9m0Var, boolean z, fyl fylVar, a4x a4xVar) {
        a4xVar.getClass();
        this.f37154a = zdm0Var;
        this.b = j9m0Var;
        this.c = z;
        this.d = fylVar;
        this.e = a4xVar;
    }

    @Override // a.wbs
    public final boolean a() {
        return this.c;
    }

    @Override // a.wbs
    public final zdm0 b() {
        return this.f37154a;
    }

    @Override // a.wbs
    public final j9m0 d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vbs)) {
            return false;
        }
        vbs vbsVar = (vbs) obj;
        return this.f37154a.equals(vbsVar.f37154a) && this.b.equals(vbsVar.b) && this.c == vbsVar.c && this.d.equals(vbsVar.d) && Intrinsics.d(this.e, vbsVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + brm0.e(w6x.h(this.b, this.f37154a.hashCode() * 31, 31), 31, this.c)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Success(headerUiState=");
        sb.append(this.f37154a);
        sb.append(", backgroundUiModel=");
        sb.append(this.b);
        sb.append(", rtlSupport=");
        sb.append(this.c);
        sb.append(", chips=");
        sb.append(this.d);
        sb.append(", eventsList=");
        return cs0.n(sb, this.e, Separators.RPAREN);
    }
}

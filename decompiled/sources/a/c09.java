package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class c09 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f3512a;
    public final jjm b;
    public final rqm c;
    public final jjm d;
    public final mtl e;
    public final a4x f;

    public c09(imm immVar, hjm hjmVar, rqm rqmVar, hjm hjmVar2, mtl mtlVar, i4 i4Var) {
        immVar.getClass();
        hjmVar.getClass();
        rqmVar.getClass();
        hjmVar2.getClass();
        mtlVar.getClass();
        i4Var.getClass();
        this.f3512a = immVar;
        this.b = hjmVar;
        this.c = rqmVar;
        this.d = hjmVar2;
        this.e = mtlVar;
        this.f = i4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c09)) {
            return false;
        }
        c09 c09Var = (c09) obj;
        return Intrinsics.d(this.f3512a, c09Var.f3512a) && Intrinsics.d(this.b, c09Var.b) && Intrinsics.d(this.c, c09Var.c) && Intrinsics.d(this.d, c09Var.d) && Intrinsics.d(this.e, c09Var.e) && Intrinsics.d(this.f, c09Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + cs0.b(this.e.f22376a, (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f3512a.hashCode() * 31)) * 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        return "BrandsLanguageSelectionUiState(dsNavigationBarUiModel=" + this.f3512a + ", defaultLanguagesDsHeaderModel=" + this.b + ", allLanguagesDsSettingCellStyle=" + this.c + ", availableLanguagesDsHeaderModel=" + this.d + ", dsBottomBarModel=" + this.e + ", items=" + this.f + Separators.RPAREN;
    }
}

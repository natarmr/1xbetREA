package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.favorites.impl.presentation.screen.category_image_header.models.CategoryImageHeaderTab;

/* JADX INFO: loaded from: classes4.dex */
public final class p5b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z4b f26397a;
    public final CategoryImageHeaderTab b;
    public final om5 c;
    public final jx70 d;
    public final boolean e;
    public final boolean f;
    public final String g;
    public final boolean h;

    public p5b(z4b z4bVar, CategoryImageHeaderTab categoryImageHeaderTab, om5 om5Var, jx70 jx70Var, boolean z, boolean z2, String str, boolean z3) {
        this.f26397a = z4bVar;
        this.b = categoryImageHeaderTab;
        this.c = om5Var;
        this.d = jx70Var;
        this.e = z;
        this.f = z2;
        this.g = str;
        this.h = z3;
    }

    public static p5b a(p5b p5bVar, z4b z4bVar, CategoryImageHeaderTab categoryImageHeaderTab, om5 om5Var, jx70 jx70Var, boolean z, boolean z2, String str, boolean z3, int i) {
        if ((i & 1) != 0) {
            z4bVar = p5bVar.f26397a;
        }
        z4b z4bVar2 = z4bVar;
        if ((i & 2) != 0) {
            categoryImageHeaderTab = p5bVar.b;
        }
        CategoryImageHeaderTab categoryImageHeaderTab2 = categoryImageHeaderTab;
        if ((i & 4) != 0) {
            om5Var = p5bVar.c;
        }
        om5 om5Var2 = om5Var;
        if ((i & 8) != 0) {
            jx70Var = p5bVar.d;
        }
        jx70 jx70Var2 = jx70Var;
        if ((i & 16) != 0) {
            z = p5bVar.e;
        }
        boolean z4 = z;
        if ((i & 32) != 0) {
            z2 = p5bVar.f;
        }
        boolean z5 = z2;
        String str2 = (i & 64) != 0 ? p5bVar.g : str;
        boolean z6 = (i & 128) != 0 ? p5bVar.h : z3;
        p5bVar.getClass();
        om5Var2.getClass();
        return new p5b(z4bVar2, categoryImageHeaderTab2, om5Var2, jx70Var2, z4, z5, str2, z6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p5b)) {
            return false;
        }
        p5b p5bVar = (p5b) obj;
        return Intrinsics.d(this.f26397a, p5bVar.f26397a) && this.b == p5bVar.b && this.c.equals(p5bVar.c) && this.d.equals(p5bVar.d) && this.e == p5bVar.e && this.f == p5bVar.f && this.g.equals(p5bVar.g) && this.h == p5bVar.h;
    }

    public final int hashCode() {
        z4b z4bVar = this.f26397a;
        return Boolean.hashCode(this.h) + ua80.b(brm0.e(brm0.e((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + ((z4bVar == null ? 0 : z4bVar.hashCode()) * 31)) * 31)) * 31)) * 31, 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CategoryImageHeaderState(config=");
        sb.append(this.f26397a);
        sb.append(", categoryImageHeaderTab=");
        sb.append(this.b);
        sb.append(", balanceState=");
        sb.append(this.c);
        sb.append(", openTabState=");
        sb.append(this.d);
        sb.append(", authorizedUser=");
        ua80.u(", activeSearchField=", ", searchQuery=", sb, this.e, this.f);
        return defpackage.c.c(this.g, ", autoFocusEnabled=", Separators.RPAREN, sb, this.h);
    }
}

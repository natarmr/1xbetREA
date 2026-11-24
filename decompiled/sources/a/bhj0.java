package a;

import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class bhj0 implements ehj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2610a;
    public final String b;
    public final boolean c;

    public bhj0(String str, String str2, boolean z) {
        i8m0 i8m0Var = i8m0.CHECK;
        str.getClass();
        this.f2610a = str;
        this.b = str2;
        this.c = z;
    }

    @Override // a.ehj0
    public final int b() {
        return R.drawable.ic_glyph_bet_one_click;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bhj0)) {
            return false;
        }
        bhj0 bhj0Var = (bhj0) obj;
        if (!Intrinsics.d(this.f2610a, bhj0Var.f2610a) || !this.b.equals(bhj0Var.b)) {
            return false;
        }
        i8m0 i8m0Var = i8m0.CHECK;
        return this.c == bhj0Var.c;
    }

    @Override // a.ehj0
    public final String getSubTitle() {
        return this.b;
    }

    @Override // a.ehj0
    public final String getTitle() {
        return this.f2610a;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + brm0.e(w6x.g(i8m0.CHECK, ua80.b(twn.a(R.drawable.ic_glyph_bet_one_click, this.f2610a.hashCode() * 31, 31), 31, this.b), 961), 31, this.c);
    }

    @Override // a.ehj0
    public final boolean i() {
        return this.c;
    }

    @Override // a.ehj0
    public final String l() {
        return "";
    }

    @Override // a.p6t0
    public final /* bridge */ /* synthetic */ Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return o(p6t0Var, p6t0Var2);
    }

    public final String toString() {
        i8m0 i8m0Var = i8m0.CHECK;
        StringBuilder sbP = kng0.p(R.drawable.ic_glyph_bet_one_click, "OneClickBetsUiModel(title=", this.f2610a, ", image=", ", subTitle=");
        sbP.append(this.b);
        sbP.append(", stateStatus=");
        sbP.append(i8m0Var);
        sbP.append(", endText=, enable=");
        return rw2.p(sbP, this.c, ", clickable=true)");
    }

    @Override // a.ehj0
    public final i8m0 y() {
        return i8m0.CHECK;
    }
}

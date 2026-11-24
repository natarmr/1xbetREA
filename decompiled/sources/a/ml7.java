package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ml7 implements pl7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21974a;
    public final on5 b;
    public final boolean c;
    public final mdm d;
    public final boolean e;
    public final boolean f;

    public ml7(String str, on5 on5Var, boolean z, mdm mdmVar, boolean z2, boolean z3) {
        str.getClass();
        this.f21974a = str;
        this.b = on5Var;
        this.c = z;
        this.d = mdmVar;
        this.e = z2;
        this.f = z3;
    }

    @Override // a.pl7
    public final on5 b() {
        return this.b;
    }

    @Override // a.pl7
    public final boolean c() {
        return this.e;
    }

    @Override // a.pl7
    public final boolean d() {
        return this.c;
    }

    @Override // a.pl7
    public final boolean e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ml7)) {
            return false;
        }
        ml7 ml7Var = (ml7) obj;
        return Intrinsics.d(this.f21974a, ml7Var.f21974a) && this.b.equals(ml7Var.b) && this.c == ml7Var.c && this.d.equals(ml7Var.d) && this.e == ml7Var.e && this.f == ml7Var.f;
    }

    @Override // a.pl7
    public final String getTitle() {
        return this.f21974a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + brm0.e(f140.d(this.d, brm0.e((this.b.hashCode() + (this.f21974a.hashCode() * 31)) * 31, 31, this.c), 31), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Empty(title=");
        sb.append(this.f21974a);
        sb.append(", balanceUiState=");
        sb.append(this.b);
        sb.append(", pullToRefreshState=");
        sb.append(this.c);
        sb.append(", lottieConfigurator=");
        sb.append(this.d);
        sb.append(", isFullScreenLoader=");
        return ohs0.p(", scrollToTop=", Separators.RPAREN, sb, this.e, this.f);
    }
}

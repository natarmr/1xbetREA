package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class x7j0 implements b8j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40416a;
    public final boolean b;
    public final boolean c;

    public x7j0(String str, boolean z, boolean z2) {
        str.getClass();
        this.f40416a = str;
        this.b = z;
        this.c = z2;
    }

    @Override // a.b8j0
    public final int b() {
        return R.drawable.ic_glyph_social_network;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x7j0)) {
            return false;
        }
        x7j0 x7j0Var = (x7j0) obj;
        return Intrinsics.d(this.f40416a, x7j0Var.f40416a) && this.b == x7j0Var.b && this.c == x7j0Var.c;
    }

    @Override // a.b8j0
    public final boolean getFirst() {
        return this.b;
    }

    @Override // a.b8j0
    public final boolean getLast() {
        return this.c;
    }

    @Override // a.b8j0
    public final String getTitle() {
        return this.f40416a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + brm0.e(brm0.e(brm0.e(twn.a(R.drawable.ic_glyph_social_network, this.f40416a.hashCode() * 31, 961), 31, true), 31, true), 31, this.b);
    }

    @Override // a.b8j0
    public final boolean i() {
        return true;
    }

    @Override // a.b8j0
    public final boolean k() {
        return true;
    }

    @Override // a.b8j0
    public final String l() {
        return "";
    }

    @Override // a.p6t0
    public final /* bridge */ /* synthetic */ Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return o(p6t0Var, p6t0Var2);
    }

    public final String toString() {
        return ohs0.p(", last=", Separators.RPAREN, kng0.p(R.drawable.ic_glyph_social_network, "SocialUiModel(title=", this.f40416a, ", image=", ", endText=, enable=true, clickable=true, first="), this.b, this.c);
    }
}

package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class f4k implements hej0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8917a;

    public f4k(String str) {
        str.getClass();
        this.f8917a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f4k) && Intrinsics.d(this.f8917a, ((f4k) obj).f8917a);
    }

    public final int hashCode() {
        return Integer.hashCode(R.drawable.ic_glyph_trash) + (this.f8917a.hashCode() * 31);
    }

    @Override // a.p6t0
    public final /* bridge */ /* synthetic */ Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return o(p6t0Var, p6t0Var2);
    }

    public final String toString() {
        return dw9.n(R.drawable.ic_glyph_trash, "DeleteAccountTabsUiModel(title=", this.f8917a, ", icon=", Separators.RPAREN);
    }
}

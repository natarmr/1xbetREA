package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class dy00 implements hej0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6871a;

    public dy00(String str) {
        str.getClass();
        this.f6871a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dy00) && Intrinsics.d(this.f6871a, ((dy00) obj).f6871a);
    }

    public final int hashCode() {
        return Integer.hashCode(R.drawable.ic_glyph_log_out) + (this.f6871a.hashCode() * 31);
    }

    @Override // a.p6t0
    public final /* bridge */ /* synthetic */ Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return o(p6t0Var, p6t0Var2);
    }

    public final String toString() {
        return dw9.n(R.drawable.ic_glyph_log_out, "LogoutTabsUiModel(title=", this.f6871a, ", icon=", Separators.RPAREN);
    }
}

package a;

import android.gov.nist.core.Separators;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class tb70 implements vb70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c5v0 f33649a;
    public final String b;
    public final Map c;

    public tb70(c5v0 c5v0Var, String str, Map map) {
        str.getClass();
        this.f33649a = c5v0Var;
        this.b = str;
        this.c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tb70)) {
            return false;
        }
        tb70 tb70Var = (tb70) obj;
        return Intrinsics.d(this.f33649a, tb70Var.f33649a) && Intrinsics.d(this.b, tb70Var.b) && this.c.equals(tb70Var.c);
    }

    public final int hashCode() {
        c5v0 c5v0Var = this.f33649a;
        return this.c.hashCode() + ua80.b((c5v0Var == null ? 0 : c5v0Var.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        return "LoadUrl(webViewHolder=" + this.f33649a + ", url=" + this.b + ", headers=" + this.c + Separators.RPAREN;
    }
}

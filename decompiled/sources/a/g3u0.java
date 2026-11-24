package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class g3u0 implements vhv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10629a;
    public final pz40 b;

    public g3u0(dgx dgxVar, String str) {
        this.f10629a = str;
        this.b = androidx.compose.runtime.e.e(dgxVar);
    }

    @Override // a.vhv0
    public final int a(w6k w6kVar, k6z k6zVar) {
        return e().f6064a;
    }

    @Override // a.vhv0
    public final int b(w6k w6kVar) {
        return e().d;
    }

    @Override // a.vhv0
    public final int c(w6k w6kVar, k6z k6zVar) {
        return e().c;
    }

    @Override // a.vhv0
    public final int d(w6k w6kVar) {
        return e().b;
    }

    public final dgx e() {
        return (dgx) ((hgk0) this.b).getValue();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g3u0) {
            return Intrinsics.d(e(), ((g3u0) obj).e());
        }
        return false;
    }

    public final void f(dgx dgxVar) {
        ((hgk0) this.b).setValue(dgxVar);
    }

    public final int hashCode() {
        return this.f10629a.hashCode();
    }

    public final String toString() {
        int i = e().f6064a;
        int i2 = e().b;
        int i3 = e().c;
        int i4 = e().d;
        StringBuilder sb = new StringBuilder(this.f10629a);
        sb.append("(left=");
        sb.append(i);
        sb.append(", top=");
        sb.append(i2);
        rw2.s(i3, i4, ", right=", ", bottom=", sb);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}

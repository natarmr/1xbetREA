package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class uuq0 extends bvq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f36314a;
    public final String b;
    public final uwx c;

    public uuq0(String str, boolean z) {
        uwx uwxVar = uwx.b;
        str.getClass();
        this.f36314a = z;
        this.b = str;
        this.c = uwxVar;
    }

    @Override // a.bvq0
    public final uwx c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uuq0)) {
            return false;
        }
        uuq0 uuq0Var = (uuq0) obj;
        return this.f36314a == uuq0Var.f36314a && Intrinsics.d(this.b, uuq0Var.b) && this.c == uuq0Var.c;
    }

    @Override // a.bvq0
    public final String getTitle() {
        return this.b;
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(Boolean.hashCode(this.f36314a) * 31, 31, this.b);
    }

    @Override // a.bvq0
    public final boolean i() {
        return this.f36314a;
    }

    public final String toString() {
        StringBuilder sbQ = axq.q("AllowDebugIframeUiModel(enable=", ", title=", this.b, this.f36314a, ", itemPosition=");
        sbQ.append(this.c);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}

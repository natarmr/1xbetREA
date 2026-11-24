package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class wuq0 extends bvq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f39802a;
    public final String b;
    public final uwx c;

    public wuq0(String str, boolean z) {
        uwx uwxVar = uwx.c;
        str.getClass();
        this.f39802a = z;
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
        if (!(obj instanceof wuq0)) {
            return false;
        }
        wuq0 wuq0Var = (wuq0) obj;
        return this.f39802a == wuq0Var.f39802a && Intrinsics.d(this.b, wuq0Var.b) && this.c == wuq0Var.c;
    }

    @Override // a.bvq0
    public final String getTitle() {
        return this.b;
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(Boolean.hashCode(this.f39802a) * 31, 31, this.b);
    }

    @Override // a.bvq0
    public final boolean i() {
        return this.f39802a;
    }

    public final String toString() {
        StringBuilder sbQ = axq.q("InternetEmulationUiModel(enable=", ", title=", this.b, this.f39802a, ", itemPosition=");
        sbQ.append(this.c);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}

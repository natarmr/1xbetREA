package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ymq0 implements uqa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42903a;
    public final ank0 b;
    public final ank0 c;

    public ymq0(ank0 ank0Var, ank0 ank0Var2, String str) {
        str.getClass();
        this.f42903a = str;
        this.b = ank0Var;
        this.c = ank0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ymq0)) {
            return false;
        }
        ymq0 ymq0Var = (ymq0) obj;
        return Intrinsics.d(this.f42903a, ymq0Var.f42903a) && this.b.equals(ymq0Var.b) && this.c.equals(ymq0Var.c);
    }

    public final int hashCode() {
        return this.c.f1159a.hashCode() + dw9.a(this.f42903a.hashCode() * 31, 31, this.b.f1159a);
    }

    public final String toString() {
        return "TimerInfoUiModel(teamsName=" + this.f42903a + ", score=" + this.b + ", time=" + this.c + Separators.RPAREN;
    }
}

package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ry20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31291a;
    public final long b;
    public final String c;
    public final boolean d;
    public final a4x e;

    public ry20(String str, long j, String str2, boolean z, a4x a4xVar) {
        w6x.x(a4xVar, str, str2);
        this.f31291a = str;
        this.b = j;
        this.c = str2;
        this.d = z;
        this.e = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ry20)) {
            return false;
        }
        ry20 ry20Var = (ry20) obj;
        return Intrinsics.d(this.f31291a, ry20Var.f31291a) && this.b == ry20Var.b && Intrinsics.d(this.c, ry20Var.c) && this.d == ry20Var.d && Intrinsics.d(this.e, ry20Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + brm0.e(ua80.b(rw2.b(this.f31291a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbO = f140.o(this.b, "MarketsCardUiModel(key=", this.f31291a, ", groupId=");
        w6x.z(", title=", this.c, ", isExpanded=", sbO, this.d);
        sbO.append(", marketRowUiModelList=");
        sbO.append(this.e);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}

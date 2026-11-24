package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ao8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j83 f1190a;
    public final String b;
    public final String c;

    public ao8(j83 j83Var, String str, String str2) {
        str.getClass();
        this.f1190a = j83Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ao8)) {
            return false;
        }
        ao8 ao8Var = (ao8) obj;
        return Intrinsics.d(this.f1190a, ao8Var.f1190a) && Intrinsics.d(this.b, ao8Var.b) && this.c.equals(ao8Var.c);
    }

    public final int hashCode() {
        j83 j83Var = this.f1190a;
        return this.c.hashCode() + ua80.b((j83Var == null ? 0 : j83Var.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BottomInfoUiModel(score=");
        sb.append((Object) this.f1190a);
        sb.append(", teams=");
        sb.append(this.b);
        sb.append(", timeBeforeStart=");
        return axq.n(sb, this.c, Separators.RPAREN);
    }
}

package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class bo8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j83 f2920a;
    public final String b;
    public final qal0 c;
    public final String d;

    public bo8(j83 j83Var, String str, qal0 qal0Var, String str2) {
        str.getClass();
        this.f2920a = j83Var;
        this.b = str;
        this.c = qal0Var;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bo8)) {
            return false;
        }
        bo8 bo8Var = (bo8) obj;
        return Intrinsics.d(this.f2920a, bo8Var.f2920a) && Intrinsics.d(this.b, bo8Var.b) && Intrinsics.d(this.c, bo8Var.c) && this.d.equals(bo8Var.d);
    }

    public final int hashCode() {
        j83 j83Var = this.f2920a;
        int iB = ua80.b((j83Var == null ? 0 : j83Var.hashCode()) * 31, 31, this.b);
        qal0 qal0Var = this.c;
        return this.d.hashCode() + ((iB + (qal0Var != null ? qal0Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "BottomInfoUiModel(score=" + ((Object) this.f2920a) + ", teams=" + this.b + ", timer=" + this.c + ", timeBeforeStart=" + this.d + Separators.RPAREN;
    }
}

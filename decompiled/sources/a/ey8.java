package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ey8 implements fy8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8616a;
    public final String b;
    public final imm c;
    public final vu8 d;
    public final av8 e;
    public final hyl f;

    public ey8(String str, String str2, imm immVar, vu8 vu8Var, av8 av8Var, hyl hylVar) {
        str.getClass();
        str2.getClass();
        immVar.getClass();
        vu8Var.getClass();
        av8Var.getClass();
        hylVar.getClass();
        this.f8616a = str;
        this.b = str2;
        this.c = immVar;
        this.d = vu8Var;
        this.e = av8Var;
        this.f = hylVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ey8)) {
            return false;
        }
        ey8 ey8Var = (ey8) obj;
        return Intrinsics.d(this.f8616a, ey8Var.f8616a) && Intrinsics.d(this.b, ey8Var.b) && Intrinsics.d(this.c, ey8Var.c) && Intrinsics.d(this.d, ey8Var.d) && Intrinsics.d(this.e, ey8Var.e) && Intrinsics.d(this.f, ey8Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + h97.a(this.c, ua80.b(this.f8616a.hashCode() * 31, 31, this.b), 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("Simple(title=", this.f8616a, ", bannerImageUrl=", this.b, ", navigationBarUiModel=");
        sbN.append(this.c);
        sbN.append(", authSectionUiState=");
        sbN.append(this.d);
        sbN.append(", contentSectionUiState=");
        sbN.append(this.e);
        sbN.append(", chipsUiModel=");
        sbN.append(this.f);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}

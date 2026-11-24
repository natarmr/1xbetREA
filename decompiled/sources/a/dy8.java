package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class dy8 implements fy8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6880a;
    public final String b;
    public final imm c;
    public final vu8 d;
    public final av8 e;
    public final imm f;
    public final hyl g;

    public dy8(String str, String str2, imm immVar, vu8 vu8Var, av8 av8Var, imm immVar2, hyl hylVar) {
        str.getClass();
        str2.getClass();
        immVar.getClass();
        vu8Var.getClass();
        av8Var.getClass();
        immVar2.getClass();
        hylVar.getClass();
        this.f6880a = str;
        this.b = str2;
        this.c = immVar;
        this.d = vu8Var;
        this.e = av8Var;
        this.f = immVar2;
        this.g = hylVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dy8)) {
            return false;
        }
        dy8 dy8Var = (dy8) obj;
        return Intrinsics.d(this.f6880a, dy8Var.f6880a) && Intrinsics.d(this.b, dy8Var.b) && Intrinsics.d(this.c, dy8Var.c) && Intrinsics.d(this.d, dy8Var.d) && Intrinsics.d(this.e, dy8Var.e) && Intrinsics.d(this.f, dy8Var.f) && Intrinsics.d(this.g, dy8Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + h97.a(this.f, (this.e.hashCode() + ((this.d.hashCode() + h97.a(this.c, ua80.b(this.f6880a.hashCode() * 31, 31, this.b), 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("Picture(title=", this.f6880a, ", bannerImageUrl=", this.b, ", navigationBarUiModel=");
        sbN.append(this.c);
        sbN.append(", authSectionUiState=");
        sbN.append(this.d);
        sbN.append(", contentSectionUiState=");
        sbN.append(this.e);
        sbN.append(", navigationBarExpandedUiModel=");
        sbN.append(this.f);
        sbN.append(", chipsUiModel=");
        sbN.append(this.g);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}

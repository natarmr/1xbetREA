package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ak60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1007a;
    public final String b;
    public final a4x c;
    public final String d;
    public final wul e;
    public final av9 f;
    public final av9 g;
    public final b2h0 h;

    public ak60(String str, String str2, i4 i4Var, String str3, wul wulVar, av9 av9Var, zu9 zu9Var, int i) {
        zu9Var = (i & 128) != 0 ? null : zu9Var;
        b2h0 b2h0Var = (i & 256) != 0 ? a2h0.f124a : z1h0.f43620a;
        str2.getClass();
        i4Var.getClass();
        this.f1007a = str;
        this.b = str2;
        this.c = i4Var;
        this.d = str3;
        this.e = wulVar;
        this.f = av9Var;
        this.g = zu9Var;
        this.h = b2h0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ak60)) {
            return false;
        }
        ak60 ak60Var = (ak60) obj;
        return this.f1007a.equals(ak60Var.f1007a) && Intrinsics.d(this.b, ak60Var.b) && this.c.equals(ak60Var.c) && Intrinsics.d(this.d, ak60Var.d) && this.e.equals(ak60Var.e) && this.f.equals(ak60Var.f) && Intrinsics.d(this.g, ak60Var.g) && this.h.equals(ak60Var.h);
    }

    public final int hashCode() {
        int iB = cs0.b(this.c, ua80.b(this.f1007a.hashCode() * 961, 31, this.b), 31);
        String str = this.d;
        int iHashCode = (this.f.hashCode() + i8i.a(this.e, (iB + (str == null ? 0 : str.hashCode())) * 31, 31)) * 31;
        av9 av9Var = this.g;
        return this.h.hashCode() + ((iHashCode + (av9Var != null ? av9Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("OnboardingSceneUiModel(sceneId=", this.f1007a, ", title=null, description=", this.b, ", coordinates=");
        sbN.append(this.c);
        sbN.append(", firstButtonText=");
        sbN.append(this.d);
        sbN.append(", secondButton=");
        sbN.append(this.e);
        sbN.append(", secondButtonClick=");
        sbN.append(this.f);
        sbN.append(", focusedAreaClick=");
        sbN.append(this.g);
        sbN.append(", sceneEnterAnimation=");
        sbN.append(this.h);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}

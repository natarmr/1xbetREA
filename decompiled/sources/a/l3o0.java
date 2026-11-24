package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class l3o0 implements q3o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19368a;
    public final String b;
    public final String c;
    public final dkk d;
    public final dkk e;
    public final dlk f;

    public l3o0(String str, String str2, String str3, dkk dkkVar, dkk dkkVar2, dlk dlkVar) {
        brm0.B(str, str2, str3);
        this.f19368a = str;
        this.b = str2;
        this.c = str3;
        this.d = dkkVar;
        this.e = dkkVar2;
        this.f = dlkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l3o0)) {
            return false;
        }
        l3o0 l3o0Var = (l3o0) obj;
        return Intrinsics.d(this.f19368a, l3o0Var.f19368a) && Intrinsics.d(this.b, l3o0Var.b) && Intrinsics.d(this.c, l3o0Var.c) && this.d.equals(l3o0Var.d) && this.e.equals(l3o0Var.e) && this.f.equals(l3o0Var.f);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + ((this.f.hashCode() + b1j.c(this.e, b1j.c(this.d, ua80.b(ua80.b(this.f19368a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("Dice(firstOpponentName=", this.f19368a, ", secondOpponentName=", this.b, ", infoLabel=");
        sbN.append(this.c);
        sbN.append(", firstPlayerScore=");
        sbN.append(this.d);
        sbN.append(", secondPlayerScore=");
        sbN.append(this.e);
        sbN.append(", resultScoreModel=");
        sbN.append(this.f);
        sbN.append(", enableEventStatusIndicator=true)");
        return sbN.toString();
    }
}

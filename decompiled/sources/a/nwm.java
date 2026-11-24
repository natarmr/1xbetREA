package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class nwm implements rwm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24240a;
    public final String b;
    public final String c;
    public final dkk d;
    public final dkk e;
    public final dlk f;

    public nwm(String str, String str2, String str3, dkk dkkVar, dkk dkkVar2, dlk dlkVar) {
        brm0.B(str, str2, str3);
        this.f24240a = str;
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
        if (!(obj instanceof nwm)) {
            return false;
        }
        nwm nwmVar = (nwm) obj;
        return Intrinsics.d(this.f24240a, nwmVar.f24240a) && Intrinsics.d(this.b, nwmVar.b) && Intrinsics.d(this.c, nwmVar.c) && this.d.equals(nwmVar.d) && this.e.equals(nwmVar.e) && this.f.equals(nwmVar.f);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + ((this.f.hashCode() + b1j.c(this.e, b1j.c(this.d, ua80.b(ua80.b(this.f24240a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("V1(firstOpponentName=", this.f24240a, ", secondOpponentName=", this.b, ", infoLabel=");
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

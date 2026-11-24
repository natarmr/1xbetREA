package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class qwm implements rwm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29441a;
    public final String b;
    public final String c;
    public final String d;
    public final dkk e;
    public final dkk f;
    public final dlk g;
    public final boolean h;

    public qwm(dkk dkkVar, dkk dkkVar2, dlk dlkVar, String str, String str2, String str3, String str4, boolean z) {
        cs0.x(str, str2, str3, str4);
        this.f29441a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = dkkVar;
        this.f = dkkVar2;
        this.g = dlkVar;
        this.h = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qwm)) {
            return false;
        }
        qwm qwmVar = (qwm) obj;
        return Intrinsics.d(this.f29441a, qwmVar.f29441a) && Intrinsics.d(this.b, qwmVar.b) && Intrinsics.d(this.c, qwmVar.c) && Intrinsics.d(this.d, qwmVar.d) && this.e.equals(qwmVar.e) && this.f.equals(qwmVar.f) && this.g.equals(qwmVar.g) && this.h == qwmVar.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + ((this.g.hashCode() + b1j.c(this.f, b1j.c(this.e, ua80.b(ua80.b(ua80.b(this.f29441a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("V4(liveTagText=", this.f29441a, ", firstOpponentName=", this.b, ", secondOpponentName=");
        f140.v(sbN, this.c, ", infoLabel=", this.d, ", firstPlayerScore=");
        sbN.append(this.e);
        sbN.append(", secondPlayerScore=");
        sbN.append(this.f);
        sbN.append(", resultScoreModel=");
        sbN.append(this.g);
        sbN.append(", supportRtl=");
        sbN.append(this.h);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}

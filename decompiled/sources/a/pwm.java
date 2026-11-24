package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class pwm implements rwm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27717a;
    public final String b;
    public final dkk c;
    public final dkk d;
    public final dlk e;
    public final boolean f;

    public pwm(String str, String str2, dkk dkkVar, dkk dkkVar2, dlk dlkVar, boolean z) {
        str.getClass();
        str2.getClass();
        this.f27717a = str;
        this.b = str2;
        this.c = dkkVar;
        this.d = dkkVar2;
        this.e = dlkVar;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pwm)) {
            return false;
        }
        pwm pwmVar = (pwm) obj;
        return Intrinsics.d(this.f27717a, pwmVar.f27717a) && Intrinsics.d(this.b, pwmVar.b) && this.c.equals(pwmVar.c) && this.d.equals(pwmVar.d) && this.e.equals(pwmVar.e) && this.f == pwmVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + ((this.e.hashCode() + b1j.c(this.d, b1j.c(this.c, ua80.b(this.f27717a.hashCode() * 31, 31, this.b), 31), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("V3(firstOpponentName=", this.f27717a, ", secondOpponentName=", this.b, ", firstPlayerScore=");
        sbN.append(this.c);
        sbN.append(", secondPlayerScore=");
        sbN.append(this.d);
        sbN.append(", resultScoreModel=");
        sbN.append(this.e);
        sbN.append(", supportRtl=");
        sbN.append(this.f);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}

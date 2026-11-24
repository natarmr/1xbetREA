package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class mwm implements rwm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22511a;
    public final String b;
    public final String c;
    public final dkk d;
    public final dkk e;
    public final dlk f;
    public final boolean g;

    public mwm(String str, String str2, String str3, dkk dkkVar, dkk dkkVar2, dlk dlkVar, boolean z) {
        brm0.B(str, str2, str3);
        this.f22511a = str;
        this.b = str2;
        this.c = str3;
        this.d = dkkVar;
        this.e = dkkVar2;
        this.f = dlkVar;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mwm)) {
            return false;
        }
        mwm mwmVar = (mwm) obj;
        return Intrinsics.d(this.f22511a, mwmVar.f22511a) && Intrinsics.d(this.b, mwmVar.b) && Intrinsics.d(this.c, mwmVar.c) && this.d.equals(mwmVar.d) && this.e.equals(mwmVar.e) && this.f.equals(mwmVar.f) && this.g == mwmVar.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + ((this.f.hashCode() + b1j.c(this.e, b1j.c(this.d, ua80.b(ua80.b(this.f22511a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("Default(firstOpponentName=", this.f22511a, ", secondOpponentName=", this.b, ", infoLabel=");
        sbN.append(this.c);
        sbN.append(", firstPlayerScore=");
        sbN.append(this.d);
        sbN.append(", secondPlayerScore=");
        sbN.append(this.e);
        sbN.append(", resultScoreModel=");
        sbN.append(this.f);
        sbN.append(", supportRtl=");
        return rw2.p(sbN, this.g, Separators.RPAREN);
    }
}

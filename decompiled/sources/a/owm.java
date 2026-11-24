package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class owm implements rwm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25971a;
    public final String b;
    public final String c;
    public final dkk d;
    public final dkk e;
    public final dlk f;
    public final String g;
    public final boolean h;

    public owm(dkk dkkVar, dkk dkkVar2, dlk dlkVar, String str, String str2, String str3, String str4, boolean z) {
        cs0.x(str, str2, str3, str4);
        this.f25971a = str;
        this.b = str2;
        this.c = str3;
        this.d = dkkVar;
        this.e = dkkVar2;
        this.f = dlkVar;
        this.g = str4;
        this.h = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof owm)) {
            return false;
        }
        owm owmVar = (owm) obj;
        return Intrinsics.d(this.f25971a, owmVar.f25971a) && Intrinsics.d(this.b, owmVar.b) && Intrinsics.d(this.c, owmVar.c) && this.d.equals(owmVar.d) && this.e.equals(owmVar.e) && this.f.equals(owmVar.f) && Intrinsics.d(this.g, owmVar.g) && this.h == owmVar.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + ua80.b((this.f.hashCode() + b1j.c(this.e, b1j.c(this.d, ua80.b(ua80.b(this.f25971a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31)) * 31, 31, this.g);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("V2(firstOpponentName=", this.f25971a, ", secondOpponentName=", this.b, ", infoLabel=");
        sbN.append(this.c);
        sbN.append(", firstPlayerScore=");
        sbN.append(this.d);
        sbN.append(", secondPlayerScore=");
        sbN.append(this.e);
        sbN.append(", resultScoreModel=");
        sbN.append(this.f);
        sbN.append(", tagLiveText=");
        return defpackage.c.c(this.g, ", supportRtl=", Separators.RPAREN, sbN, this.h);
    }
}

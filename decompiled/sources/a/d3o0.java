package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d3o0 implements i3o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5413a;
    public final String b;
    public final String c;
    public final dkk d;
    public final dkk e;
    public final dlk f;
    public final String g;

    public d3o0(dkk dkkVar, dkk dkkVar2, dlk dlkVar, String str, String str2, String str3, String str4) {
        cs0.x(str, str2, str3, str4);
        this.f5413a = str;
        this.b = str2;
        this.c = str3;
        this.d = dkkVar;
        this.e = dkkVar2;
        this.f = dlkVar;
        this.g = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d3o0)) {
            return false;
        }
        d3o0 d3o0Var = (d3o0) obj;
        return Intrinsics.d(this.f5413a, d3o0Var.f5413a) && Intrinsics.d(this.b, d3o0Var.b) && Intrinsics.d(this.c, d3o0Var.c) && this.d.equals(d3o0Var.d) && this.e.equals(d3o0Var.e) && this.f.equals(d3o0Var.f) && Intrinsics.d(this.g, d3o0Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ((this.f.hashCode() + b1j.c(this.e, b1j.c(this.d, ua80.b(ua80.b(this.f5413a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("Dice(firstOpponentName=", this.f5413a, ", secondOpponentName=", this.b, ", infoLabel=");
        sbN.append(this.c);
        sbN.append(", firstPlayerScore=");
        sbN.append(this.d);
        sbN.append(", secondPlayerScore=");
        sbN.append(this.e);
        sbN.append(", resultScoreModel=");
        sbN.append(this.f);
        sbN.append(", tagLiveText=");
        return axq.n(sbN, this.g, Separators.RPAREN);
    }
}

package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class lrr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20546a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public lrr(String str, String str2, String str3, String str4, String str5, String str6) {
        str2.getClass();
        this.f20546a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lrr)) {
            return false;
        }
        lrr lrrVar = (lrr) obj;
        return this.f20546a.equals(lrrVar.f20546a) && Intrinsics.d(this.b, lrrVar.b) && this.c.equals(lrrVar.c) && this.d.equals(lrrVar.d) && this.e.equals(lrrVar.e) && this.f.equals(lrrVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ua80.b(ua80.b(ua80.b(ua80.b(this.f20546a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("GameBoardTopInfoUiModel(matchFormat=", this.f20546a, ", vid=", this.b, ", tournamentStage=");
        f140.v(sbN, this.c, ", seriesScore=", this.d, ", locationCountry=");
        return ua80.m(sbN, this.e, ", surfaceDescription=", this.f, Separators.RPAREN);
    }
}

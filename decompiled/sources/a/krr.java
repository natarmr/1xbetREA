package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class krr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18781a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public krr(String str, String str2, String str3, String str4, String str5, String str6) {
        str2.getClass();
        this.f18781a = str;
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
        if (!(obj instanceof krr)) {
            return false;
        }
        krr krrVar = (krr) obj;
        return this.f18781a.equals(krrVar.f18781a) && Intrinsics.d(this.b, krrVar.b) && this.c.equals(krrVar.c) && this.d.equals(krrVar.d) && this.e.equals(krrVar.e) && this.f.equals(krrVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ua80.b(ua80.b(ua80.b(ua80.b(this.f18781a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("GameBoardTopInfoUiModel(matchFormat=", this.f18781a, ", vid=", this.b, ", tournamentStage=");
        f140.v(sbN, this.c, ", seriesScore=", this.d, ", locationCountry=");
        return ua80.m(sbN, this.e, ", surfaceDescription=", this.f, Separators.RPAREN);
    }
}

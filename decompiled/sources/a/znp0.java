package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class znp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44686a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;

    public znp0(String str, String str2, String str3, String str4, String str5, boolean z) {
        str.getClass();
        str2.getClass();
        this.f44686a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof znp0)) {
            return false;
        }
        znp0 znp0Var = (znp0) obj;
        return Intrinsics.d(this.f44686a, znp0Var.f44686a) && Intrinsics.d(this.b, znp0Var.b) && this.c.equals(znp0Var.c) && this.d.equals(znp0Var.d) && this.e.equals(znp0Var.e) && this.f == znp0Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + ua80.b(ua80.b(ua80.b(ua80.b(this.f44686a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("TeamUiModel(id=", this.f44686a, ", title=", this.b, ", teamImage=");
        f140.v(sbN, this.c, ", imageTeamOne=", this.d, ", imageTeamTwo=");
        return defpackage.c.c(this.e, ", pairTeam=", Separators.RPAREN, sbN, this.f);
    }
}

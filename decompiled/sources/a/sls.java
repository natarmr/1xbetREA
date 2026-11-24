package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class sls {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32414a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;

    public sls(String str, String str2, String str3, String str4, String str5, boolean z) {
        str2.getClass();
        this.f32414a = str;
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
        if (!(obj instanceof sls)) {
            return false;
        }
        sls slsVar = (sls) obj;
        return this.f32414a.equals(slsVar.f32414a) && Intrinsics.d(this.b, slsVar.b) && this.c.equals(slsVar.c) && this.d.equals(slsVar.d) && this.e.equals(slsVar.e) && this.f == slsVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + ua80.b(ua80.b(ua80.b(ua80.b(this.f32414a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("GameLogsEventUiModel(heroImage=", this.f32414a, ", actionTitle=", this.b, ", targetIcon=");
        f140.v(sbN, this.c, ", targetName=", this.d, ", actionTime=");
        return defpackage.c.c(this.e, ", radiant=", Separators.RPAREN, sbN, this.f);
    }
}

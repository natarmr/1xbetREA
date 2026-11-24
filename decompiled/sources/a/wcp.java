package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class wcp implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tnp0 f38935a;
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;
    public final String g;

    public wcp(tnp0 tnp0Var, int i, String str, String str2, String str3, boolean z) {
        tnp0Var.getClass();
        str.getClass();
        this.f38935a = tnp0Var;
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = z;
        this.g = String.valueOf(tnp0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wcp)) {
            return false;
        }
        wcp wcpVar = (wcp) obj;
        return Intrinsics.d(this.f38935a, wcpVar.f38935a) && this.b == wcpVar.b && Intrinsics.d(this.c, wcpVar.c) && this.d.equals(wcpVar.d) && this.e.equals(wcpVar.e) && this.f == wcpVar.f;
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + ua80.b(ua80.b(ua80.b(brm0.e(twn.a(this.b, this.f38935a.hashCode() * 31, 31), 31, true), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FavoriteTeamLineUiItem(teamType=");
        sb.append(this.f38935a);
        sb.append(", counter=");
        sb.append(this.b);
        sb.append(", favourite=true, champImage=");
        f140.v(sb, this.c, ", teamImage=", this.d, ", teamName=");
        return defpackage.c.c(this.e, ", hasLiveGame=", Separators.RPAREN, sb, this.f);
    }
}

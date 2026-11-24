package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class p1b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jza f26192a;
    public final String b;
    public final boolean c;
    public final String d;
    public final String e;
    public final boolean f;

    public p1b(jza jzaVar, String str, boolean z, String str2, String str3, boolean z2) {
        str.getClass();
        this.f26192a = jzaVar;
        this.b = str;
        this.c = z;
        this.d = str2;
        this.e = str3;
        this.f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p1b)) {
            return false;
        }
        p1b p1bVar = (p1b) obj;
        return this.f26192a.equals(p1bVar.f26192a) && Intrinsics.d(this.b, p1bVar.b) && this.c == p1bVar.c && this.d.equals(p1bVar.d) && this.e.equals(p1bVar.e) && this.f == p1bVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + ua80.b(ua80.b(brm0.e(ua80.b(this.f26192a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CashbackProgressUiModel(value=");
        sb.append(this.f26192a);
        sb.append(", currencySymbol=");
        sb.append(this.b);
        sb.append(", gameIsAvailable=");
        f140.s(", firstGameName=", this.d, ", secondGameName=", sb, this.c);
        return defpackage.c.c(this.e, ", noUserGamesSelected=", Separators.RPAREN, sb, this.f);
    }
}

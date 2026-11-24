package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class wim0 implements xim0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r3i f39222a;
    public final r3i b;
    public final q3i c;
    public final String d;
    public final String e;
    public final String f;

    public wim0(r3i r3iVar, r3i r3iVar2, q3i q3iVar, String str, String str2, String str3) {
        str.getClass();
        this.f39222a = r3iVar;
        this.b = r3iVar2;
        this.c = q3iVar;
        this.d = str;
        this.e = str2;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wim0)) {
            return false;
        }
        wim0 wim0Var = (wim0) obj;
        return this.f39222a.equals(wim0Var.f39222a) && this.b.equals(wim0Var.b) && this.c.equals(wim0Var.c) && Intrinsics.d(this.d, wim0Var.d) && this.e.equals(wim0Var.e) && this.f.equals(wim0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ua80.b(ua80.b((this.c.hashCode() + ((this.b.hashCode() + (this.f39222a.hashCode() * 31)) * 31)) * 31, 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TwoPairs(teamOne=");
        sb.append(this.f39222a);
        sb.append(", teamTwo=");
        sb.append(this.b);
        sb.append(", score=");
        sb.append(this.c);
        sb.append(", info=");
        sb.append(this.d);
        sb.append(", seedingLeft=");
        return ua80.m(sb, this.e, ", seedingRight=", this.f, Separators.RPAREN);
    }
}

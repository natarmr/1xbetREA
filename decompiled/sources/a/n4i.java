package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class n4i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r3i f22899a;
    public final r3i b;
    public final q3i c;
    public final String d;
    public final String e;
    public final String f;

    public n4i(r3i r3iVar, r3i r3iVar2, q3i q3iVar, String str, String str2, String str3) {
        str.getClass();
        this.f22899a = r3iVar;
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
        if (!(obj instanceof n4i)) {
            return false;
        }
        n4i n4iVar = (n4i) obj;
        return this.f22899a.equals(n4iVar.f22899a) && this.b.equals(n4iVar.b) && this.c.equals(n4iVar.c) && Intrinsics.d(this.d, n4iVar.d) && this.e.equals(n4iVar.e) && this.f.equals(n4iVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ua80.b(ua80.b((this.c.hashCode() + ((this.b.hashCode() + (this.f22899a.hashCode() * 31)) * 31)) * 31, 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Default(teamOne=");
        sb.append(this.f22899a);
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

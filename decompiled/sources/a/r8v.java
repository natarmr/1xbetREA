package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class r8v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30047a;
    public final List b;
    public final bfo0 c;
    public final String d;
    public final boolean e;

    public r8v(String str, List list, bfo0 bfo0Var, String str2, boolean z) {
        list.getClass();
        bfo0Var.getClass();
        this.f30047a = str;
        this.b = list;
        this.c = bfo0Var;
        this.d = str2;
        this.e = z;
    }

    public static r8v a(r8v r8vVar, String str, bfo0 bfo0Var, int i) {
        if ((i & 1) != 0) {
            str = r8vVar.f30047a;
        }
        String str2 = str;
        List list = r8vVar.b;
        if ((i & 4) != 0) {
            bfo0Var = r8vVar.c;
        }
        bfo0 bfo0Var2 = bfo0Var;
        String str3 = r8vVar.d;
        boolean z = (i & 16) != 0 ? r8vVar.e : false;
        r8vVar.getClass();
        str2.getClass();
        list.getClass();
        bfo0Var2.getClass();
        return new r8v(str2, list, bfo0Var2, str3, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r8v)) {
            return false;
        }
        r8v r8vVar = (r8v) obj;
        return this.f30047a.equals(r8vVar.f30047a) && Intrinsics.d(this.b, r8vVar.b) && this.c == r8vVar.c && this.d.equals(r8vVar.d) && this.e == r8vVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ua80.b((this.c.hashCode() + dw9.a(this.f30047a.hashCode() * 31, 31, this.b)) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sbF = defpackage.c.f("GlobalSearchContainerState(query=", this.f30047a, ", tabs=", this.b, ", selectedTab=");
        sbF.append(this.c);
        sbF.append(", screenName=");
        sbF.append(this.d);
        sbF.append(", searchFocused=");
        return rw2.p(sbF, this.e, Separators.RPAREN);
    }
}

package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class uj60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o0x f35762a;
    public final Integer b;
    public final String c;
    public final String d;

    public uj60(o0x o0xVar, Integer num, String str, String str2) {
        o0xVar.getClass();
        str.getClass();
        this.f35762a = o0xVar;
        this.b = num;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uj60)) {
            return false;
        }
        uj60 uj60Var = (uj60) obj;
        return Intrinsics.d(this.f35762a, uj60Var.f35762a) && this.b.equals(uj60Var.b) && Intrinsics.d(this.c, uj60Var.c) && Intrinsics.d(this.d, uj60Var.d);
    }

    public final int hashCode() {
        int iB = ua80.b((this.b.hashCode() + (this.f35762a.hashCode() * 31)) * 31, 31, this.c);
        String str = this.d;
        return iB + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnboardingPageModel(image=");
        sb.append(this.f35762a);
        sb.append(", placeholderRes=");
        sb.append(this.b);
        sb.append(", title=");
        return ua80.m(sb, this.c, ", description=", this.d, Separators.RPAREN);
    }
}

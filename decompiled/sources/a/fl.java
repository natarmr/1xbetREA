package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class fl implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bl f9717a;
    public final al b;
    public final String c;
    public final String d;
    public final int e;
    public final boolean f;

    public fl(bl blVar, al alVar, String str, String str2, int i, boolean z) {
        str.getClass();
        str2.getClass();
        this.f9717a = blVar;
        this.b = alVar;
        this.c = str;
        this.d = str2;
        this.e = i;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fl)) {
            return false;
        }
        fl flVar = (fl) obj;
        return this.f9717a == flVar.f9717a && this.b == flVar.b && Intrinsics.d(this.c, flVar.c) && Intrinsics.d(this.d, flVar.d) && this.e == flVar.e && this.f == flVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + twn.a(this.e, ua80.b(ua80.b((this.b.hashCode() + (this.f9717a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActivationUiModel(type=");
        sb.append(this.f9717a);
        sb.append(", status=");
        sb.append(this.b);
        sb.append(", title=");
        f140.v(sb, this.c, ", subTitle=", this.d, ", startIcon=");
        return ohs0.k(this.e, ", endIconVisible=", Separators.RPAREN, sb, this.f);
    }
}

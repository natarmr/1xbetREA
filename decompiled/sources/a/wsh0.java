package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class wsh0 implements dth0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ssh0 f39692a;
    public final boolean b;
    public final int c;
    public final String d;
    public final String e;
    public final i8m0 f;
    public final boolean g;

    public wsh0(ssh0 ssh0Var, boolean z, int i, String str, String str2, i8m0 i8m0Var, boolean z2) {
        str.getClass();
        str2.getClass();
        this.f39692a = ssh0Var;
        this.b = z;
        this.c = i;
        this.d = str;
        this.e = str2;
        this.f = i8m0Var;
        this.g = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wsh0)) {
            return false;
        }
        wsh0 wsh0Var = (wsh0) obj;
        return this.f39692a == wsh0Var.f39692a && this.b == wsh0Var.b && this.c == wsh0Var.c && Intrinsics.d(this.d, wsh0Var.d) && Intrinsics.d(this.e, wsh0Var.e) && this.f == wsh0Var.f && this.g == wsh0Var.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + brm0.e(brm0.e(w6x.g(this.f, ua80.b(ua80.b(twn.a(this.c, brm0.e(this.f39692a.hashCode() * 31, 31, this.b), 31), 31, this.d), 31, this.e), 31), 31, this.g), 31, false);
    }

    @Override // a.dth0
    public final boolean s() {
        return this.b;
    }

    @Override // a.dth0
    public final ssh0 t() {
        return this.f39692a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Simple(settingType=");
        sb.append(this.f39692a);
        sb.append(", settingAchieved=");
        sb.append(this.b);
        sb.append(", settingTypeIconId=");
        kng0.w(this.c, ", title=", this.d, ", description=", sb);
        sb.append(this.e);
        sb.append(", status=");
        sb.append(this.f);
        sb.append(", isShowArrow=");
        return rw2.p(sb, this.g, ", isFirst=false, isLast=false)");
    }
}

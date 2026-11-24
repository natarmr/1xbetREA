package a;

import android.gov.nist.core.Separators;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e890 implements g890 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7363a;
    public final Map b;
    public final long c;
    public final boolean d;
    public final float e;
    public final boolean f;

    public e890(String str, Map map, long j, boolean z, float f, boolean z2) {
        str.getClass();
        map.getClass();
        this.f7363a = str;
        this.b = map;
        this.c = j;
        this.d = z;
        this.e = f;
        this.f = z2;
    }

    @Override // a.g890
    public final boolean a() {
        return this.d;
    }

    @Override // a.g890
    public final float b() {
        return this.e;
    }

    @Override // a.g890
    public final long c() {
        return this.c;
    }

    @Override // a.g890
    public final Map d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e890)) {
            return false;
        }
        e890 e890Var = (e890) obj;
        return Intrinsics.d(this.f7363a, e890Var.f7363a) && Intrinsics.d(this.b, e890Var.b) && this.c == e890Var.c && this.d == e890Var.d && Float.compare(this.e, e890Var.e) == 0 && this.f == e890Var.f;
    }

    @Override // a.g890
    public final String getUrl() {
        return this.f7363a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + defpackage.c.a(brm0.e(rw2.b(ohs0.f(this.b, this.f7363a.hashCode() * 31, 31), 31, this.c), 31, this.d), this.e, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Content(url=");
        sb.append(this.f7363a);
        sb.append(", extraHeaders=");
        sb.append(this.b);
        sb.append(", loadEventId=");
        hne.t(this.c, ", reloadEnable=", sb, this.d);
        sb.append(", reloadButtonAlpha=");
        sb.append(this.e);
        sb.append(", webPageLoading=");
        sb.append(this.f);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}

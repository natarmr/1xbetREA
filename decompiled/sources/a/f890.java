package a;

import android.gov.nist.core.Separators;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class f890 implements g890 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9095a;
    public final Map b;
    public final long c;
    public final boolean d;
    public final float e;
    public final mdm f;

    public f890(String str, Map map, long j, boolean z, float f, mdm mdmVar) {
        str.getClass();
        map.getClass();
        this.f9095a = str;
        this.b = map;
        this.c = j;
        this.d = z;
        this.e = f;
        this.f = mdmVar;
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
        if (!(obj instanceof f890)) {
            return false;
        }
        f890 f890Var = (f890) obj;
        return Intrinsics.d(this.f9095a, f890Var.f9095a) && Intrinsics.d(this.b, f890Var.b) && this.c == f890Var.c && this.d == f890Var.d && Float.compare(this.e, f890Var.e) == 0 && this.f.equals(f890Var.f);
    }

    @Override // a.g890
    public final String getUrl() {
        return this.f9095a;
    }

    public final int hashCode() {
        return this.f.hashCode() + defpackage.c.a(brm0.e(rw2.b(ohs0.f(this.b, this.f9095a.hashCode() * 31, 31), 31, this.c), 31, this.d), this.e, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Error(url=");
        sb.append(this.f9095a);
        sb.append(", extraHeaders=");
        sb.append(this.b);
        sb.append(", loadEventId=");
        hne.t(this.c, ", reloadEnable=", sb, this.d);
        sb.append(", reloadButtonAlpha=");
        sb.append(this.e);
        sb.append(", errorConfig=");
        sb.append(this.f);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}

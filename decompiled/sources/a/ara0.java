package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ara0 implements era0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f1336a;
    public final String b;
    public final long c;
    public final String d;
    public final k7l0 e;
    public final boolean f;

    public ara0(long j, String str, long j2, String str2, k7l0 k7l0Var, boolean z) {
        str.getClass();
        str2.getClass();
        this.f1336a = j;
        this.b = str;
        this.c = j2;
        this.d = str2;
        this.e = k7l0Var;
        this.f = z;
    }

    @Override // a.era0
    public final String b() {
        return this.d;
    }

    @Override // a.era0
    public final long c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ara0)) {
            return false;
        }
        ara0 ara0Var = (ara0) obj;
        return this.f1336a == ara0Var.f1336a && Intrinsics.d(this.b, ara0Var.b) && this.c == ara0Var.c && Intrinsics.d(this.d, ara0Var.d) && this.e.equals(ara0Var.e) && this.f == ara0Var.f;
    }

    @Override // a.era0
    public final long getId() {
        return this.f1336a;
    }

    @Override // a.era0
    public final String getTitle() {
        return this.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + ((this.e.hashCode() + ua80.b(rw2.b(ua80.b(Long.hashCode(this.f1336a) * 31, 31, this.b), 31, this.c), 31, this.d)) * 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f1336a, "Group(id=", ", title=", this.b);
        kng0.A(sbO, ", sportId=", this.c, ", image=");
        sbO.append(this.d);
        sbO.append(", style=");
        sbO.append(this.e);
        sbO.append(", expanded=");
        return rw2.p(sbO, this.f, Separators.RPAREN);
    }
}

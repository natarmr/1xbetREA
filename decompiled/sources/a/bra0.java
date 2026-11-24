package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class bra0 implements era0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hjm f3070a;
    public final String b;
    public final long c;
    public final String d;

    public bra0(hjm hjmVar, String str, long j, String str2) {
        str.getClass();
        this.f3070a = hjmVar;
        this.b = str;
        this.c = j;
        this.d = str2;
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
        if (!(obj instanceof bra0)) {
            return false;
        }
        bra0 bra0Var = (bra0) obj;
        return this.f3070a.equals(bra0Var.f3070a) && Intrinsics.d(this.b, bra0Var.b) && this.c == bra0Var.c && this.d.equals(bra0Var.d);
    }

    @Override // a.era0
    public final long getId() {
        return -1L;
    }

    @Override // a.era0
    public final String getTitle() {
        return this.b;
    }

    public final int hashCode() {
        return this.d.hashCode() + rw2.b(ua80.b(rw2.b(this.f3070a.hashCode() * 31, 31, -1L), 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Header(model=");
        sb.append(this.f3070a);
        sb.append(", id=-1, title=");
        sb.append(this.b);
        sb.append(", sportId=");
        kng0.z(sb, this.c, ", image=", this.d);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}

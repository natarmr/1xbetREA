package a;

import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class p2m implements t2m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26257a;
    public final m0x b;
    public final int c;
    public final long d;
    public final String e;

    public p2m(int i, long j, m0x m0xVar, String str) {
        String string = UUID.randomUUID().toString();
        string.getClass();
        str.getClass();
        this.f26257a = string;
        this.b = m0xVar;
        this.c = i;
        this.d = j;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p2m)) {
            return false;
        }
        p2m p2mVar = (p2m) obj;
        if (!this.f26257a.equals(p2mVar.f26257a) || !this.b.equals(p2mVar.b) || this.c != p2mVar.c) {
            return false;
        }
        long j = p2mVar.d;
        int i = y3d.h;
        return h2t0.a(this.d, j) && Intrinsics.d(this.e, p2mVar.e);
    }

    @Override // a.t2m
    public final String getId() {
        return this.f26257a;
    }

    public final int hashCode() {
        int iA = twn.a(this.c, cs0.a(this.b, this.f26257a.hashCode() * 31, 31), 31);
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return ua80.b(rw2.b(iA, 31, this.d), 31, this.e);
    }

    public final String toString() {
        String strI = y3d.i(this.d);
        StringBuilder sb = new StringBuilder("IconLabel(id=");
        sb.append(this.f26257a);
        sb.append(", icon=");
        sb.append(this.b);
        sb.append(", placeholder=");
        kng0.w(this.c, ", placeholderTint=", strI, ", label=", sb);
        return axq.n(sb, this.e, ", color=null)");
    }
}

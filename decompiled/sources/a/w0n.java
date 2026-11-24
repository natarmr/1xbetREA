package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class w0n implements x0n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c1n f38357a;
    public final c1n b;
    public final a2m c;
    public final String d;
    public final String e;
    public final r0n f;
    public final boolean g;

    public w0n(c1n c1nVar, c1n c1nVar2, a2m a2mVar, String str, String str2, r0n r0nVar, boolean z) {
        a2mVar.getClass();
        str.getClass();
        str2.getClass();
        this.f38357a = c1nVar;
        this.b = c1nVar2;
        this.c = a2mVar;
        this.d = str;
        this.e = str2;
        this.f = r0nVar;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0n)) {
            return false;
        }
        w0n w0nVar = (w0n) obj;
        return this.f38357a.equals(w0nVar.f38357a) && this.b.equals(w0nVar.b) && Intrinsics.d(this.c, w0nVar.c) && Intrinsics.d(this.d, w0nVar.d) && Intrinsics.d(this.e, w0nVar.e) && this.f.equals(w0nVar.f) && this.g == w0nVar.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + ((this.f.hashCode() + ua80.b(ua80.b(rz4.a(this.c, (this.b.hashCode() + (this.f38357a.hashCode() * 31)) * 31, 31), 31, this.d), 31, this.e)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("V4(firstOpponentModel=");
        sb.append(this.f38357a);
        sb.append(", secondOpponentModel=");
        sb.append(this.b);
        sb.append(", score=");
        sb.append(this.c);
        sb.append(", infoLabel=");
        sb.append(this.d);
        sb.append(", live=");
        sb.append(this.e);
        sb.append(", options=");
        sb.append(this.f);
        sb.append(", supportRtl=");
        return rw2.p(sb, this.g, Separators.RPAREN);
    }
}

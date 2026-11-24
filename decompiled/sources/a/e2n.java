package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e2n implements h2n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l2n f7095a;
    public final l2n b;
    public final String c;
    public final String d;
    public final String e;

    public e2n(l2n l2nVar, l2n l2nVar2, String str, String str2, String str3) {
        str.getClass();
        str3.getClass();
        this.f7095a = l2nVar;
        this.b = l2nVar2;
        this.c = str;
        this.d = str2;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e2n)) {
            return false;
        }
        e2n e2nVar = (e2n) obj;
        return this.f7095a.equals(e2nVar.f7095a) && this.b.equals(e2nVar.b) && Intrinsics.d(this.c, e2nVar.c) && this.d.equals(e2nVar.d) && Intrinsics.d(this.e, e2nVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ua80.b(ua80.b((this.b.hashCode() + (this.f7095a.hashCode() * 31)) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("V2(firstOpponent=");
        sb.append(this.f7095a);
        sb.append(", secondOpponent=");
        sb.append(this.b);
        sb.append(", infoLabel=");
        f140.v(sb, this.c, ", gameLabel=", this.d, ", tagLiveText=");
        return axq.n(sb, this.e, Separators.RPAREN);
    }
}

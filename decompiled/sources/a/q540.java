package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class q540 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28132a;
    public final yos0 b;
    public final long c;
    public final String d;

    public q540(long j, yos0 yos0Var, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f28132a = str;
        this.b = yos0Var;
        this.c = j;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q540)) {
            return false;
        }
        q540 q540Var = (q540) obj;
        return Intrinsics.d(this.f28132a, q540Var.f28132a) && this.b.equals(q540Var.b) && this.c == q540Var.c && Intrinsics.d(this.d, q540Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + rw2.b((this.b.hashCode() + (this.f28132a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImageInfo(preview=");
        sb.append(this.f28132a);
        sb.append(", fileStatus=");
        sb.append(this.b);
        sb.append(", fileSize=");
        kng0.z(sb, this.c, ", fileName=", this.d);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}

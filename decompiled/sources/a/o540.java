package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class o540 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24670a;
    public final long b;
    public final String c;
    public final yos0 d;

    public o540(long j, yos0 yos0Var, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f24670a = str;
        this.b = j;
        this.c = str2;
        this.d = yos0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o540)) {
            return false;
        }
        o540 o540Var = (o540) obj;
        return Intrinsics.d(this.f24670a, o540Var.f24670a) && this.b == o540Var.b && Intrinsics.d(this.c, o540Var.c) && this.d.equals(o540Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b(rw2.b(this.f24670a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbO = f140.o(this.b, "FileInfo(fileName=", this.f24670a, ", fileSize=");
        sbO.append(", mimeType=");
        sbO.append(this.c);
        sbO.append(", fileStatus=");
        sbO.append(this.d);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}

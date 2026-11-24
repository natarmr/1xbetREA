package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class qcl extends rcl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28488a;
    public final String b;
    public final long c;
    public final w1x d;

    public qcl(String str, String str2, long j, w1x w1xVar) {
        str.getClass();
        str2.getClass();
        this.f28488a = str;
        this.b = str2;
        this.c = j;
        this.d = w1xVar;
    }

    @Override // a.rcl
    public final String a() {
        return this.f28488a;
    }

    @Override // a.rcl
    public final long b() {
        return this.c;
    }

    @Override // a.rcl
    public final String d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qcl)) {
            return false;
        }
        qcl qclVar = (qcl) obj;
        return Intrinsics.d(this.f28488a, qclVar.f28488a) && Intrinsics.d(this.b, qclVar.b) && this.c == qclVar.c && this.d == qclVar.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + rw2.b(ua80.b(this.f28488a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("Image(fileName=", this.f28488a, ", mediaId=", this.b, ", fileSize=");
        sbN.append(this.c);
        sbN.append(", imageSize=");
        sbN.append(this.d);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}

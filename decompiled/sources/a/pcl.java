package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class pcl extends rcl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26765a;
    public final String b;
    public final long c;

    public pcl(String str, String str2, long j) {
        str.getClass();
        str2.getClass();
        this.f26765a = str;
        this.b = str2;
        this.c = j;
    }

    @Override // a.rcl
    public final String a() {
        return this.f26765a;
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
        if (!(obj instanceof pcl)) {
            return false;
        }
        pcl pclVar = (pcl) obj;
        return Intrinsics.d(this.f26765a, pclVar.f26765a) && Intrinsics.d(this.b, pclVar.b) && this.c == pclVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + ua80.b(this.f26765a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return brm0.k(this.c, Separators.RPAREN, b1j.n("File(fileName=", this.f26765a, ", mediaId=", this.b, ", fileSize="));
    }
}

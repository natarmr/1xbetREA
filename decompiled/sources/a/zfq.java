package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class zfq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44312a;
    public final String b;

    public zfq(String str, String str2) {
        this.f44312a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zfq)) {
            return false;
        }
        zfq zfqVar = (zfq) obj;
        return Intrinsics.d(this.f44312a, zfqVar.f44312a) && Intrinsics.d(this.b, zfqVar.b);
    }

    public final int hashCode() {
        String str = this.f44312a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FirebaseInstallationId(fid=");
        sb.append(this.f44312a);
        sb.append(", authToken=");
        return axq.m(sb, this.b, ')');
    }
}

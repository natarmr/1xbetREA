package a;

import android.javax.sip.message.Response;
import com.huawei.hms.android.HwBuildEx;

/* JADX INFO: loaded from: classes.dex */
public final class r35 {
    public static final r35 f = new r35(10485760, Response.OK, HwBuildEx.VersionCodes.CUR_DEVELOPMENT, 604800000, 81920);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f29770a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;

    public r35(long j, int i, int i2, long j2, int i3) {
        this.f29770a = j;
        this.b = i;
        this.c = i2;
        this.d = j2;
        this.e = i3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r35) {
            r35 r35Var = (r35) obj;
            if (this.f29770a == r35Var.f29770a && this.b == r35Var.b && this.c == r35Var.c && this.d == r35Var.d && this.e == r35Var.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f29770a;
        int i = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003;
        long j2 = this.d;
        return this.e ^ ((i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb.append(this.f29770a);
        sb.append(", loadBatchSize=");
        sb.append(this.b);
        sb.append(", criticalSectionEnterTimeoutMs=");
        sb.append(this.c);
        sb.append(", eventCleanUpAge=");
        sb.append(this.d);
        sb.append(", maxBlobByteSizePerRow=");
        return rz4.j(this.e, "}", sb);
    }
}

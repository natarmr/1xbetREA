package a;

import android.net.NetworkRequest;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class o4e {
    public static final o4e j = new o4e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sl50 f24629a;
    public final hl50 b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final long g;
    public final long h;
    public final Set i;

    public o4e(o4e o4eVar) {
        o4eVar.getClass();
        this.c = o4eVar.c;
        this.d = o4eVar.d;
        this.b = o4eVar.b;
        this.f24629a = o4eVar.f24629a;
        this.e = o4eVar.e;
        this.f = o4eVar.f;
        this.i = o4eVar.i;
        this.g = o4eVar.g;
        this.h = o4eVar.h;
    }

    public final NetworkRequest a() {
        return (NetworkRequest) this.b.f13241a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !o4e.class.equals(obj.getClass())) {
            return false;
        }
        o4e o4eVar = (o4e) obj;
        if (this.c == o4eVar.c && this.d == o4eVar.d && this.e == o4eVar.e && this.f == o4eVar.f && this.g == o4eVar.g && this.h == o4eVar.h && Intrinsics.d(a(), o4eVar.a()) && this.f24629a == o4eVar.f24629a) {
            return Intrinsics.d(this.i, o4eVar.i);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.f24629a.hashCode() * 31) + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31;
        long j2 = this.g;
        int i = (iHashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.h;
        int iG = ohs0.g(this.i, (i + ((int) (j3 ^ (j3 >>> 32)))) * 31, 31);
        NetworkRequest networkRequestA = a();
        return iG + (networkRequestA != null ? networkRequestA.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Constraints{requiredNetworkType=");
        sb.append(this.f24629a);
        sb.append(", requiresCharging=");
        sb.append(this.c);
        sb.append(", requiresDeviceIdle=");
        ua80.u(", requiresBatteryNotLow=", ", requiresStorageNotLow=", sb, this.d, this.e);
        rw2.v(this.g, ", contentTriggerUpdateDelayMillis=", sb, this.f);
        kng0.A(sb, ", contentTriggerMaxDelayMillis=", this.h, ", contentUriTriggers=");
        sb.append(this.i);
        sb.append(", }");
        return sb.toString();
    }

    public o4e(hl50 hl50Var, sl50 sl50Var, boolean z, boolean z2, boolean z3, boolean z4, long j2, long j3, Set set) {
        set.getClass();
        this.b = hl50Var;
        this.f24629a = sl50Var;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = j2;
        this.h = j3;
        this.i = set;
    }

    public o4e() {
        sl50 sl50Var = sl50.f32381a;
        xun xunVar = xun.f41520a;
        xunVar.getClass();
        this.b = new hl50(null);
        this.f24629a = sl50Var;
        this.c = false;
        this.d = false;
        this.e = false;
        this.f = false;
        this.g = -1L;
        this.h = -1L;
        this.i = xunVar;
    }
}

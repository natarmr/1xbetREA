package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class s2a extends p2a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31492a;
    public final evc b;
    public final Integer c;
    public final zen d;
    public final Throwable e;
    public final zen f;
    public final zen g;
    public final zen h;
    public final az9 i;

    public s2a(String str, evc evcVar, Integer num, zen zenVar, Throwable th, zen zenVar2, zen zenVar3, zen zenVar4, az9 az9Var) {
        str.getClass();
        this.f31492a = str;
        this.b = evcVar;
        this.c = num;
        this.d = zenVar;
        this.e = th;
        this.f = zenVar2;
        this.g = zenVar3;
        this.h = zenVar4;
        this.i = az9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s2a)) {
            return false;
        }
        s2a s2aVar = (s2a) obj;
        return Intrinsics.d(this.f31492a, s2aVar.f31492a) && this.b == s2aVar.b && Intrinsics.d(this.c, s2aVar.c) && Intrinsics.d(this.d, s2aVar.d) && Intrinsics.d(this.e, s2aVar.e) && Intrinsics.d(this.f, s2aVar.f) && Intrinsics.d(this.g, s2aVar.g) && Intrinsics.d(this.h, s2aVar.h) && Intrinsics.d(this.i, s2aVar.i);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f31492a.hashCode() * 31)) * 31;
        Integer num = this.c;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        zen zenVar = this.d;
        int iHashCode3 = (iHashCode2 + (zenVar == null ? 0 : Long.hashCode(zenVar.f44260a))) * 31;
        Throwable th = this.e;
        int iHashCode4 = (iHashCode3 + (th == null ? 0 : th.hashCode())) * 31;
        zen zenVar2 = this.f;
        int iHashCode5 = (iHashCode4 + (zenVar2 == null ? 0 : Long.hashCode(zenVar2.f44260a))) * 31;
        zen zenVar3 = this.g;
        int iHashCode6 = (iHashCode5 + (zenVar3 == null ? 0 : Long.hashCode(zenVar3.f44260a))) * 31;
        zen zenVar4 = this.h;
        int iHashCode7 = (iHashCode6 + (zenVar4 == null ? 0 : Long.hashCode(zenVar4.f44260a))) * 31;
        az9 az9Var = this.i;
        return iHashCode7 + (az9Var != null ? Integer.hashCode(az9Var.f1706a) : 0);
    }

    public final String toString() {
        return "CameraStateClosed(cameraId=" + ((Object) g0a.b(this.f31492a)) + ", cameraClosedReason=" + this.b + ", cameraRetryCount=" + this.c + ", cameraRetryDurationNs=" + this.d + ", cameraException=" + this.e + ", cameraOpenDurationNs=" + this.f + ", cameraActiveDurationNs=" + this.g + ", cameraClosingDurationNs=" + this.h + ", cameraErrorCode=" + this.i + ')';
    }
}

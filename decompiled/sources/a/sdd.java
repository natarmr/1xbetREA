package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class sdd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f32029a;
    public final c5a b;
    public final xdr c;
    public final Object d;
    public final Throwable e;

    public /* synthetic */ sdd(Object obj, c5a c5aVar, xdr xdrVar, Throwable th, int i) {
        this(obj, (i & 2) != 0 ? null : c5aVar, (i & 4) != 0 ? null : xdrVar, (Object) null, (i & 16) != 0 ? null : th);
    }

    public static sdd a(sdd sddVar, c5a c5aVar, Throwable th, int i) {
        Object obj = sddVar.f32029a;
        if ((i & 2) != 0) {
            c5aVar = sddVar.b;
        }
        c5a c5aVar2 = c5aVar;
        xdr xdrVar = sddVar.c;
        Object obj2 = sddVar.d;
        if ((i & 16) != 0) {
            th = sddVar.e;
        }
        return new sdd(obj, c5aVar2, xdrVar, obj2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sdd)) {
            return false;
        }
        sdd sddVar = (sdd) obj;
        return Intrinsics.d(this.f32029a, sddVar.f32029a) && Intrinsics.d(this.b, sddVar.b) && Intrinsics.d(this.c, sddVar.c) && Intrinsics.d(this.d, sddVar.d) && Intrinsics.d(this.e, sddVar.e);
    }

    public final int hashCode() {
        Object obj = this.f32029a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        c5a c5aVar = this.b;
        int iHashCode2 = (iHashCode + (c5aVar == null ? 0 : c5aVar.hashCode())) * 31;
        xdr xdrVar = this.c;
        int iHashCode3 = (iHashCode2 + (xdrVar == null ? 0 : xdrVar.hashCode())) * 31;
        Object obj2 = this.d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.e;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f32029a + ", cancelHandler=" + this.b + ", onCancellation=" + this.c + ", idempotentResume=" + this.d + ", cancelCause=" + this.e + ')';
    }

    public sdd(Object obj, c5a c5aVar, xdr xdrVar, Object obj2, Throwable th) {
        this.f32029a = obj;
        this.b = c5aVar;
        this.c = xdrVar;
        this.d = obj2;
        this.e = th;
    }
}

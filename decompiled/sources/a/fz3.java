package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class fz3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final fz3 f10390a = new fz3();

    public final boolean a(Object obj, Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj instanceof o1x) || !(obj2 instanceof o1x)) {
            return Intrinsics.d(obj, obj2);
        }
        o1x o1xVar = (o1x) obj;
        o1x o1xVar2 = (o1x) obj2;
        return Intrinsics.d(o1xVar.f24504a, o1xVar2.f24504a) && o1xVar.b.equals(o1xVar2.b) && Intrinsics.d(o1xVar.e, o1xVar2.e) && o1xVar.f.equals(o1xVar2.f) && Intrinsics.d(o1xVar.g, o1xVar2.g) && Intrinsics.d(o1xVar.r, o1xVar2.r) && o1xVar.s == o1xVar2.s && o1xVar.t == o1xVar2.t;
    }

    public final int b(Object obj) {
        if (!(obj instanceof o1x)) {
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }
        o1x o1xVar = (o1x) obj;
        int iHashCode = (o1xVar.b.hashCode() + (o1xVar.f24504a.hashCode() * 31)) * 31;
        String str = o1xVar.e;
        int iF = ohs0.f(o1xVar.f, (iHashCode + (str != null ? str.hashCode() : 0)) * 31, 31);
        String str2 = o1xVar.g;
        return o1xVar.t.hashCode() + ((o1xVar.s.hashCode() + ((o1xVar.r.hashCode() + ((iF + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "AsyncImageModelEqualityDelegate.Default";
    }
}

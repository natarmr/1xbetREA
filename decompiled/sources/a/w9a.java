package a;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class w9a extends v2 implements faa {
    public final kiy b;
    public final x9a c;
    public final boolean d;
    public final obx e;

    public w9a(kiy kiyVar, x9a x9aVar, boolean z) {
        super(v9a.f37025a);
        this.b = kiyVar;
        this.c = x9aVar;
        this.d = z;
        this.e = new obx(iun.f15405a);
    }

    @Override // a.v2
    public final v2 B(boolean z) {
        return z == this.d ? this : new w9a(this.b, this.c, z);
    }

    @Override // a.kiy
    public final List M() {
        return iun.f15405a;
    }

    @Override // a.v2
    public final boolean equals(Object obj) {
        if (!(obj instanceof w9a)) {
            return false;
        }
        w9a w9aVar = (w9a) obj;
        return Intrinsics.d(this.b, w9aVar.b) && this.c == w9aVar.c && this.d == w9aVar.d;
    }

    @Override // a.v2
    public final a8z f() {
        return this.e;
    }

    @Override // a.kiy
    public final boolean h() {
        return this.d;
    }

    @Override // a.v2
    public final int hashCode() {
        kiy kiyVar = this.b;
        int iHashCode = kiyVar != null ? kiyVar.hashCode() : 0;
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + (iHashCode * 31)) * 31);
    }

    @Override // a.kiy
    public final fhy o() {
        return null;
    }

    @Override // a.v2
    public final String toString() {
        return this.c.toString();
    }
}

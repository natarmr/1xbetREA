package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class t860 implements jiy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jiy f33499a;
    public final vgi0 b;

    public t860(jiy jiyVar) {
        jiyVar.getClass();
        this.f33499a = jiyVar;
        this.b = new vgi0(jiyVar.getDescriptor());
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        if (rkjVar.A()) {
            return rkjVar.w(this.f33499a);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && t860.class == obj.getClass() && Intrinsics.d(this.f33499a, ((t860) obj).f33499a);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return this.b;
    }

    public final int hashCode() {
        return this.f33499a.hashCode();
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        if (obj != null) {
            bwnVar.C(this.f33499a, obj);
        } else {
            bwnVar.q();
        }
    }
}

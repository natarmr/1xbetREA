package a;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class vz3 extends kpb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wz3 f38280a;

    public vz3(wz3 wz3Var) {
        this.f38280a = wz3Var;
    }

    @Override // a.kpb
    public final int I() {
        return ((List) this.f38280a.d).size();
    }

    @Override // a.kpb
    public final int J() {
        return ((List) this.f38280a.c).size();
    }

    @Override // a.kpb
    public final boolean s(int i, int i2) {
        wz3 wz3Var = this.f38280a;
        Object obj = ((List) wz3Var.c).get(i);
        Object obj2 = ((List) wz3Var.d).get(i2);
        if (obj != null && obj2 != null) {
            return ((dtb) ((yz3) wz3Var.f).b.b).w(obj, obj2);
        }
        if (obj == null && obj2 == null) {
            return true;
        }
        throw new AssertionError();
    }

    @Override // a.kpb
    public final boolean t(int i, int i2) {
        wz3 wz3Var = this.f38280a;
        Object obj = ((List) wz3Var.c).get(i);
        Object obj2 = ((List) wz3Var.d).get(i2);
        if (obj == null || obj2 == null) {
            return obj == null && obj2 == null;
        }
        return ((dtb) ((yz3) wz3Var.f).b.b).x(obj, obj2);
    }

    @Override // a.kpb
    public final Object z(int i, int i2) {
        wz3 wz3Var = this.f38280a;
        Object obj = ((List) wz3Var.c).get(i);
        Object obj2 = ((List) wz3Var.d).get(i2);
        if (obj == null || obj2 == null) {
            throw new AssertionError();
        }
        return ((dtb) ((yz3) wz3Var.f).b.b).E(obj, obj2);
    }
}

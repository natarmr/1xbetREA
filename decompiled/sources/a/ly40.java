package a;

/* JADX INFO: loaded from: classes2.dex */
public final class ly40 extends oo20 implements nhy {
    public final s3d d;
    public Object e;

    public ly40(s3d s3dVar, Object obj, Object obj2) {
        super(obj, obj2, (byte) 1);
        this.d = s3dVar;
        this.e = obj2;
    }

    @Override // a.oo20, java.util.Map.Entry
    public final Object getValue() {
        return this.e;
    }

    @Override // a.oo20, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.e;
        this.e = obj;
        ih90 ih90Var = (ih90) this.d.b;
        gh90 gh90Var = ih90Var.e;
        Object obj3 = this.b;
        if (!gh90Var.containsKey(obj3)) {
            return obj2;
        }
        boolean z = ih90Var.c;
        if (!z) {
            gh90Var.put(obj3, obj);
        } else {
            if (!z) {
                itt0.a();
                return null;
            }
            pqs0 pqs0Var = ((pqs0[]) ih90Var.d)[ih90Var.b];
            Object obj4 = pqs0Var.b[pqs0Var.d];
            gh90Var.put(obj3, obj);
            ih90Var.e(obj4 != null ? obj4.hashCode() : 0, gh90Var.c, obj4, 0, 0, false);
        }
        ih90Var.h = gh90Var.e;
        return obj2;
    }
}

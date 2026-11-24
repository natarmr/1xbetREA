package a;

/* JADX INFO: loaded from: classes.dex */
public final class ny40 extends oo20 implements nhy {
    public final s3d d;
    public Object e;

    public ny40(s3d s3dVar, Object obj, Object obj2) {
        super(obj, obj2, (byte) 0);
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
        jh90 jh90Var = (jh90) this.d.b;
        hh90 hh90Var = jh90Var.e;
        Object obj3 = this.b;
        if (!hh90Var.containsKey(obj3)) {
            return obj2;
        }
        boolean z = jh90Var.c;
        if (!z) {
            hh90Var.put(obj3, obj);
        } else {
            if (!z) {
                itt0.a();
                return null;
            }
            pqs0 pqs0Var = ((pqs0[]) jh90Var.d)[jh90Var.b];
            Object obj4 = pqs0Var.b[pqs0Var.d];
            hh90Var.put(obj3, obj);
            jh90Var.e(obj4 != null ? obj4.hashCode() : 0, hh90Var.c, obj4, 0);
        }
        jh90Var.h = hh90Var.e;
        return obj2;
    }
}

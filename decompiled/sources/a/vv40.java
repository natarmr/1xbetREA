package a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class vv40 implements rae0 {
    public static final rae0[] c = new rae0[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map f38081a;
    public rae0[] b;

    @Override // a.rae0
    public final i0g0 a(chf0 chf0Var, Map map) {
        c(map);
        return b(chf0Var);
    }

    public final i0g0 b(chf0 chf0Var) throws o660 {
        rae0[] rae0VarArr = this.b;
        if (rae0VarArr != null) {
            for (rae0 rae0Var : rae0VarArr) {
                if (Thread.currentThread().isInterrupted()) {
                    throw o660.a();
                }
                try {
                    return rae0Var.a(chf0Var, this.f38081a);
                } catch (sae0 unused) {
                }
            }
            Map map = this.f38081a;
            if (map != null && map.containsKey(gkj.l)) {
                r68 r68VarX = chf0Var.x();
                int length = r68VarX.d.length;
                for (int i = 0; i < length; i++) {
                    int[] iArr = r68VarX.d;
                    iArr[i] = ~iArr[i];
                }
                for (rae0 rae0Var2 : this.b) {
                    if (Thread.currentThread().isInterrupted()) {
                        throw o660.a();
                    }
                    try {
                        return rae0Var2.a(chf0Var, this.f38081a);
                    } catch (sae0 unused2) {
                    }
                }
            }
        }
        throw o660.a();
    }

    public final void c(Map map) {
        this.f38081a = map;
        byte b = 0;
        byte b2 = 1;
        boolean z = map != null && map.containsKey(gkj.d);
        Collection collection = map == null ? null : (Collection) map.get(gkj.c);
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            boolean z2 = collection.contains(ju5.o) || collection.contains(ju5.p) || collection.contains(ju5.h) || collection.contains(ju5.g) || collection.contains(ju5.b) || collection.contains(ju5.c) || collection.contains(ju5.d) || collection.contains(ju5.e) || collection.contains(ju5.i) || collection.contains(ju5.m) || collection.contains(ju5.n);
            if (z2 && !z) {
                arrayList.add(new uv40(map, (byte) 0));
            }
            if (collection.contains(ju5.l)) {
                arrayList.add(new waj((byte) 2));
            }
            if (collection.contains(ju5.f)) {
                arrayList.add(new waj((byte) 0));
            }
            if (collection.contains(ju5.f17135a)) {
                arrayList.add(new hg80(b2));
            }
            if (collection.contains(ju5.k)) {
                arrayList.add(new hg80(b));
            }
            if (collection.contains(ju5.j)) {
                arrayList.add(new waj((byte) 1));
            }
            if (z2 && z) {
                arrayList.add(new uv40(map, (byte) 0));
            }
        }
        if (arrayList.isEmpty()) {
            if (!z) {
                arrayList.add(new uv40(map, (byte) 0));
            }
            arrayList.add(new waj((byte) 2));
            arrayList.add(new waj((byte) 0));
            arrayList.add(new hg80(b2));
            arrayList.add(new hg80(b));
            arrayList.add(new waj((byte) 1));
            if (z) {
                arrayList.add(new uv40(map, (byte) 0));
            }
        }
        this.b = (rae0[]) arrayList.toArray(c);
    }

    @Override // a.rae0
    public final void reset() {
        rae0[] rae0VarArr = this.b;
        if (rae0VarArr != null) {
            for (rae0 rae0Var : rae0VarArr) {
                rae0Var.reset();
            }
        }
    }
}

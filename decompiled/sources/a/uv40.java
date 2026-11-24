package a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class uv40 extends jl60 {
    public static final jl60[] c = new jl60[0];
    public static final n2t0[] d = new n2t0[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f36331a;
    public final jl60[] b;

    public uv40(Map map, byte b) {
        Collection collection;
        this.f36331a = b;
        ju5 ju5Var = ju5.p;
        ju5 ju5Var2 = ju5.g;
        ju5 ju5Var3 = ju5.o;
        ju5 ju5Var4 = ju5.h;
        gkj gkjVar = gkj.c;
        switch (b) {
            case 1:
                collection = map != null ? (Collection) map.get(gkjVar) : null;
                ArrayList arrayList = new ArrayList();
                if (collection != null) {
                    if (collection.contains(ju5Var4)) {
                        arrayList.add(new pgn((byte) 0));
                    } else if (collection.contains(ju5Var3)) {
                        arrayList.add(new pgn((byte) 3));
                    }
                    if (collection.contains(ju5Var2)) {
                        arrayList.add(new pgn((byte) 2));
                    }
                    if (collection.contains(ju5Var)) {
                        arrayList.add(new pgn((byte) 1));
                    }
                }
                if (arrayList.isEmpty()) {
                    arrayList.add(new pgn((byte) 0));
                    arrayList.add(new pgn((byte) 2));
                    arrayList.add(new pgn((byte) 1));
                }
                this.b = (n2t0[]) arrayList.toArray(d);
                break;
            default:
                collection = map != null ? (Collection) map.get(gkjVar) : null;
                boolean z = (map == null || map.get(gkj.g) == null) ? false : true;
                ArrayList arrayList2 = new ArrayList();
                if (collection != null) {
                    if (collection.contains(ju5Var4) || collection.contains(ju5Var3) || collection.contains(ju5Var2) || collection.contains(ju5Var)) {
                        arrayList2.add(new uv40(map, (byte) 1));
                    }
                    if (collection.contains(ju5.c)) {
                        arrayList2.add(new txc(z));
                    }
                    if (collection.contains(ju5.d)) {
                        arrayList2.add(new uxc());
                    }
                    if (collection.contains(ju5.e)) {
                        arrayList2.add(new sxc());
                    }
                    if (collection.contains(ju5.i)) {
                        arrayList2.add(new kvw());
                    }
                    if (collection.contains(ju5.b)) {
                        arrayList2.add(new rxc());
                    }
                    if (collection.contains(ju5.m)) {
                        arrayList2.add(new nqd0());
                    }
                    if (collection.contains(ju5.n)) {
                        arrayList2.add(new oqd0());
                    }
                }
                if (arrayList2.isEmpty()) {
                    arrayList2.add(new uv40(map, (byte) 1));
                    arrayList2.add(new txc(false));
                    arrayList2.add(new rxc());
                    arrayList2.add(new uxc());
                    arrayList2.add(new sxc());
                    arrayList2.add(new kvw());
                    arrayList2.add(new nqd0());
                    arrayList2.add(new oqd0());
                }
                this.b = (jl60[]) arrayList2.toArray(c);
                break;
        }
    }

    @Override // a.jl60
    public final i0g0 b(int i, p68 p68Var, Map map) throws o660 {
        byte b = this.f36331a;
        jl60[] jl60VarArr = this.b;
        switch (b) {
            case 0:
                for (int i2 = 0; i2 < jl60VarArr.length; i2++) {
                    try {
                        return jl60VarArr[i2].b(i, p68Var, map);
                    } catch (sae0 unused) {
                    }
                }
                throw o660.a();
            default:
                int[] iArrM = n2t0.m(p68Var);
                for (n2t0 n2t0Var : (n2t0[]) jl60VarArr) {
                    try {
                        i0g0 i0g0VarK = n2t0Var.k(i, p68Var, iArrM, map);
                        boolean z = i0g0VarK.d == ju5.h && i0g0VarK.f13947a.charAt(0) == '0';
                        Collection collection = map == null ? null : (Collection) map.get(gkj.c);
                        ju5 ju5Var = ju5.o;
                        boolean z2 = collection == null || collection.contains(ju5Var);
                        if (!z || !z2) {
                            return i0g0VarK;
                        }
                        i0g0 i0g0Var = new i0g0(i0g0VarK.f13947a.substring(1), i0g0VarK.b, i0g0VarK.c, ju5Var);
                        i0g0Var.a(i0g0VarK.e);
                        return i0g0Var;
                    } catch (sae0 unused2) {
                    }
                }
                throw o660.a();
        }
    }

    @Override // a.jl60, a.rae0
    public final void reset() {
        byte b = this.f36331a;
        int i = 0;
        jl60[] jl60VarArr = this.b;
        switch (b) {
            case 0:
                int length = jl60VarArr.length;
                while (i < length) {
                    jl60VarArr[i].reset();
                    i++;
                }
                break;
            default:
                n2t0[] n2t0VarArr = (n2t0[]) jl60VarArr;
                int length2 = n2t0VarArr.length;
                while (i < length2) {
                    n2t0VarArr[i].getClass();
                    i++;
                }
                break;
        }
    }
}

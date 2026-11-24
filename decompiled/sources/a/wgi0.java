package a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class wgi0 implements ugi0, vj9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39119a;
    public final c3x b;
    public final int c;
    public final List d;
    public final HashSet e;
    public final String[] f;
    public final ugi0[] g;
    public final List[] h;
    public final boolean[] i;
    public final Map j;
    public final ugi0[] k;
    public final n0o0 l;

    public wgi0(String str, c3x c3xVar, int i, List list, cmc cmcVar) {
        list.getClass();
        this.f39119a = str;
        this.b = c3xVar;
        this.c = i;
        this.d = cmcVar.b;
        ArrayList arrayList = cmcVar.c;
        this.e = CollectionsKt.J0(arrayList);
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        this.f = strArr;
        this.g = j2e.M(cmcVar.e);
        this.h = (List[]) cmcVar.f.toArray(new List[0]);
        this.i = CollectionsKt.F0(cmcVar.g);
        strArr.getClass();
        rx3 rx3Var = new rx3(new a13(strArr, (byte) 20), (byte) 2);
        ArrayList arrayList2 = new ArrayList(r3d.q(rx3Var, 10));
        Iterator it = rx3Var.iterator();
        while (true) {
            iil iilVar = (iil) it;
            if (!iilVar.b.hasNext()) {
                this.j = xp20.m(arrayList2);
                this.k = j2e.M(list);
                this.l = maz.b(new a7g0(this, (byte) 29));
                return;
            }
            IndexedValue indexedValue = (IndexedValue) iilVar.next();
            arrayList2.add(new Pair(indexedValue.b, Integer.valueOf(indexedValue.f46061a)));
        }
    }

    @Override // a.vj9
    public final Set a() {
        return this.e;
    }

    @Override // a.ugi0
    public final int c(String str) {
        str.getClass();
        Integer num = (Integer) this.j.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // a.ugi0
    public final int d() {
        return this.c;
    }

    @Override // a.ugi0
    public final String e(int i) {
        return this.f[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof wgi0) {
            ugi0 ugi0Var = (ugi0) obj;
            if (this.f39119a.equals(ugi0Var.h()) && Arrays.equals(this.k, ((wgi0) obj).k)) {
                int iD = ugi0Var.d();
                int i = this.c;
                if (i == iD) {
                    for (int i2 = 0; i2 < i; i2++) {
                        ugi0[] ugi0VarArr = this.g;
                        if (Intrinsics.d(ugi0VarArr[i2].h(), ugi0Var.g(i2).h()) && Intrinsics.d(ugi0VarArr[i2].l(), ugi0Var.g(i2).l())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // a.ugi0
    public final List f(int i) {
        return this.h[i];
    }

    @Override // a.ugi0
    public final ugi0 g(int i) {
        return this.g[i];
    }

    @Override // a.ugi0
    public final List getAnnotations() {
        return this.d;
    }

    @Override // a.ugi0
    public final String h() {
        return this.f39119a;
    }

    public final int hashCode() {
        return ((Number) this.l.getValue()).intValue();
    }

    @Override // a.ugi0
    public final boolean i(int i) {
        return this.i[i];
    }

    @Override // a.ugi0
    public final c3x l() {
        return this.b;
    }

    public final String toString() {
        return n2x.R(this);
    }
}

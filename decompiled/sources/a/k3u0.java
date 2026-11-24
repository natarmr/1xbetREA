package a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class k3u0 extends s3u0 implements go80 {
    public final int g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final wsy k;
    public final k3u0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3u0(kp9 kp9Var, k3u0 k3u0Var, int i, g93 g93Var, g950 g950Var, wsy wsyVar, boolean z, boolean z2, boolean z3, wsy wsyVar2, gmk0 gmk0Var) {
        super(kp9Var, g93Var, g950Var, wsyVar, gmk0Var);
        kp9Var.getClass();
        g93Var.getClass();
        g950Var.getClass();
        wsyVar.getClass();
        gmk0Var.getClass();
        this.g = i;
        this.h = z;
        this.i = z2;
        this.j = z3;
        this.k = wsyVar2;
        this.l = k3u0Var == null ? this : k3u0Var;
    }

    @Override // a.r3u0
    public final boolean E() {
        return false;
    }

    @Override // a.r3u0
    public final r2e R() {
        return null;
    }

    @Override // a.wen0
    public final xjj f(xzs0 xzs0Var) {
        xzs0Var.getClass();
        if (xzs0Var.f41769a.e()) {
            return this;
        }
        e9d0.b();
        return null;
    }

    @Override // a.akj, a.sq30
    public final tek getVisibility() {
        tek tekVar = uek.f;
        tekVar.getClass();
        return tekVar;
    }

    @Override // a.vjj
    public final Object i0(zjj zjjVar, Object obj) {
        return zjjVar.q(this, obj);
    }

    @Override // a.kp9
    public final Collection k() {
        Collection collectionK = j().k();
        collectionK.getClass();
        Collection collection = collectionK;
        ArrayList arrayList = new ArrayList(r3d.q(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add((k3u0) ((kp9) it.next()).z().get(this.g));
        }
        return arrayList;
    }

    public k3u0 p1(per perVar, g950 g950Var, int i) {
        g950Var.getClass();
        g93 annotations = getAnnotations();
        annotations.getClass();
        wsy type = getType();
        type.getClass();
        return new k3u0(perVar, null, i, annotations, g950Var, type, q1(), this.i, this.j, this.k, gmk0.x0);
    }

    public final boolean q1() {
        return this.h && ((mp9) j()).l() != 2;
    }

    @Override // a.yjj, a.vjj
    /* JADX INFO: renamed from: r1, reason: merged with bridge method [inline-methods] */
    public final kp9 j() {
        vjj vjjVarJ = super.j();
        vjjVarJ.getClass();
        return (kp9) vjjVarJ;
    }

    @Override // a.yjj
    /* JADX INFO: renamed from: s1, reason: merged with bridge method [inline-methods] */
    public final k3u0 o1() {
        k3u0 k3u0Var = this.l;
        return k3u0Var == this ? this : k3u0Var.o1();
    }
}

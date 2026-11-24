package a;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class gaa implements hzs0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hzs0 f10956a;
    public final vjj b;
    public final int c;

    public gaa(hzs0 hzs0Var, vjj vjjVar, int i) {
        hzs0Var.getClass();
        this.f10956a = hzs0Var;
        this.b = vjjVar;
        this.c = i;
    }

    @Override // a.hzs0
    public final eu00 D() {
        eu00 eu00VarD = this.f10956a.D();
        eu00VarD.getClass();
        return eu00VarD;
    }

    @Override // a.hzs0
    public final boolean H() {
        return true;
    }

    @Override // a.foc
    public final kzj0 I() {
        kzj0 kzj0VarI = this.f10956a.I();
        kzj0VarI.getClass();
        return kzj0VarI;
    }

    @Override // a.vjj, a.kp9
    /* JADX INFO: renamed from: a */
    public final hzs0 o1() {
        hzs0 hzs0VarO1 = this.f10956a.o1();
        hzs0VarO1.getClass();
        return hzs0VarO1;
    }

    @Override // a.xjj
    public final gmk0 b() {
        gmk0 gmk0VarB = this.f10956a.b();
        gmk0VarB.getClass();
        return gmk0VarB;
    }

    @Override // a.e83
    public final g93 getAnnotations() {
        return this.f10956a.getAnnotations();
    }

    @Override // a.hzs0
    public final int getIndex() {
        return this.f10956a.getIndex() + this.c;
    }

    @Override // a.vjj
    public final g950 getName() {
        g950 name = this.f10956a.getName();
        name.getClass();
        return name;
    }

    @Override // a.hzs0
    public final List getUpperBounds() {
        List upperBounds = this.f10956a.getUpperBounds();
        upperBounds.getClass();
        return upperBounds;
    }

    @Override // a.hzs0, a.foc
    public final iys0 h() {
        iys0 iys0VarH = this.f10956a.h();
        iys0VarH.getClass();
        return iys0VarH;
    }

    @Override // a.vjj
    public final Object i0(zjj zjjVar, Object obj) {
        return this.f10956a.i0(zjjVar, obj);
    }

    @Override // a.vjj
    public final vjj j() {
        return this.b;
    }

    @Override // a.hzs0
    public final boolean q() {
        return this.f10956a.q();
    }

    @Override // a.hzs0
    public final t3u0 t() {
        t3u0 t3u0VarT = this.f10956a.t();
        t3u0VarT.getClass();
        return t3u0VarT;
    }

    public final String toString() {
        return this.f10956a + "[inner-copy]";
    }
}

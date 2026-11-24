package a;

import kotlin.jvm.internal.Intrinsics;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;

/* JADX INFO: loaded from: classes4.dex */
public final class q5u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f7u f28171a;
    public final edu b;
    public final rtu c;
    public final pmi d;
    public final v7i e;
    public final j3c f;
    public final svu g;
    public final rpt h;
    public final cmt i;
    public final lbu j;
    public final luu k;
    public final m1e l;
    public final cad m;
    public final zri n;
    public final ocl o;
    public final n0o0 p;

    public q5u(f7u f7uVar, edu eduVar, rtu rtuVar, pmi pmiVar, v7i v7iVar, j3c j3cVar, svu svuVar, rpt rptVar, cmt cmtVar, pru pruVar, lbu lbuVar, luu luuVar, m1e m1eVar, cad cadVar, zri zriVar, ocl oclVar) {
        m1eVar.getClass();
        this.f28171a = f7uVar;
        this.b = eduVar;
        this.c = rtuVar;
        this.d = pmiVar;
        this.e = v7iVar;
        this.f = j3cVar;
        this.g = svuVar;
        this.h = rptVar;
        this.i = cmtVar;
        this.j = lbuVar;
        this.k = luuVar;
        this.l = m1eVar;
        this.m = cadVar;
        this.n = zriVar;
        this.o = oclVar;
        this.p = maz.b(new hc0(pruVar, (byte) 29));
    }

    public final gmq a(sip sipVar, long j, CyberGamesPage cyberGamesPage, boolean z) {
        yje yjeVar = null;
        return (sipVar != sip.b || (cyberGamesPage instanceof CyberGamesPage.Real)) ? new dnq(new j5u(aoq.c(aoq.c(new vsg0(new o3s((Object) this, (Object) sipVar, yjeVar, (byte) 5)), new f5u(null, this, sipVar, j, cyberGamesPage)), new xpp(yjeVar, (Object) this, z, (byte) 2)), cyberGamesPage, j, this), new rl2(3, yjeVar, (byte) 13), (byte) 1) : new eu4(yjeVar, (byte) 12);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(CyberGamesPage cyberGamesPage, int i, long j, zje zjeVar) {
        m5u m5uVar;
        if (zjeVar instanceof m5u) {
            m5uVar = (m5u) zjeVar;
            int i2 = m5uVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                m5uVar.l = i2 - Integer.MIN_VALUE;
            } else {
                m5uVar = new m5u(this, zjeVar);
            }
        } else {
            m5uVar = new m5u(this, zjeVar);
        }
        Object objF = m5uVar.j;
        wne wneVar = wne.f39444a;
        int i3 = m5uVar.l;
        byte b = 1;
        yje yjeVar = null;
        if (i3 == 0) {
            z1x.P(objF);
            if (!Intrinsics.d(cyberGamesPage, CyberGamesPage.Real.INSTANCE)) {
                e0g0 e0g0Var = j0g0.b;
                return new eu4(new j0g0(iun.f15405a), (byte) 12);
            }
            m5uVar.i = this;
            m5uVar.l = 1;
            objF = this.n.f(i, j, m5uVar);
            if (objF == wneVar) {
                return wneVar;
            }
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = m5uVar.i;
            z1x.P(objF);
        }
        int i4 = 3;
        return new dnq(new p6d(((m0o0) this.o.f25032a).b(), new a1t((gmq) objF, (byte) 11), new c4u(i4, yjeVar, b), b), new rl2(i4, yjeVar, (byte) 14), b);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object c(sip sipVar, long j, CyberGamesPage cyberGamesPage, zje zjeVar) {
        p5u p5uVar;
        if (zjeVar instanceof p5u) {
            p5uVar = (p5u) zjeVar;
            int i = p5uVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                p5uVar.k = i - Integer.MIN_VALUE;
            } else {
                p5uVar = new p5u(this, zjeVar);
            }
        } else {
            p5uVar = new p5u(this, zjeVar);
        }
        Object objC = p5uVar.i;
        Object obj = wne.f39444a;
        int i2 = p5uVar.k;
        byte b = 12;
        byte b2 = 1;
        yje yjeVar = null;
        if (i2 == 0) {
            z1x.P(objC);
            if ((sipVar == sip.b && !(cyberGamesPage instanceof CyberGamesPage.Real)) || Intrinsics.d(cyberGamesPage, CyberGamesPage.Real.INSTANCE)) {
                return new eu4(yjeVar, b);
            }
            p5uVar.k = 1;
            f7u f7uVar = this.f28171a;
            objC = aoq.c(new vsg0(new atj(f7uVar, yjeVar, (byte) 19)), new izu(null, f7uVar, sipVar, j, cyberGamesPage));
            if (objC == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objC);
        }
        return new dnq(new a1t((gmq) objC, b), new rl2(3, yjeVar, (byte) 15), b2);
    }
}

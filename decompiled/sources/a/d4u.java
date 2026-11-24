package a;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;

/* JADX INFO: loaded from: classes4.dex */
public final class d4u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lbu f5474a;
    public final f3u b;
    public final u8u c;
    public final v7i d;
    public final rtu e;
    public final pmi f;
    public final j3c g;
    public final yuu h;
    public final q8u i;
    public final bnu j;
    public final cyg0 k;
    public final lyt l;
    public final xsu m;
    public final wti n;
    public final ocl o;
    public final n0o0 p;

    public d4u(lbu lbuVar, f3u f3uVar, u8u u8uVar, v7i v7iVar, rtu rtuVar, pmi pmiVar, j3c j3cVar, yuu yuuVar, pru pruVar, q8u q8uVar, bnu bnuVar, cyg0 cyg0Var, lyt lytVar, xsu xsuVar, wti wtiVar, ocl oclVar) {
        this.f5474a = lbuVar;
        this.b = f3uVar;
        this.c = u8uVar;
        this.d = v7iVar;
        this.e = rtuVar;
        this.f = pmiVar;
        this.g = j3cVar;
        this.h = yuuVar;
        this.i = q8uVar;
        this.j = bnuVar;
        this.k = cyg0Var;
        this.l = lytVar;
        this.m = xsuVar;
        this.n = wtiVar;
        this.o = oclVar;
        this.p = maz.b(new hc0(pruVar, (byte) 28));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(int i, zje zjeVar, CyberGamesPage cyberGamesPage) {
        m3u m3uVar;
        if (zjeVar instanceof m3u) {
            m3uVar = (m3u) zjeVar;
            int i2 = m3uVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                m3uVar.l = i2 - Integer.MIN_VALUE;
            } else {
                m3uVar = new m3u(this, zjeVar);
            }
        } else {
            m3uVar = new m3u(this, zjeVar);
        }
        Object objM = m3uVar.j;
        wne wneVar = wne.f39444a;
        int i3 = m3uVar.l;
        byte b = 1;
        yje yjeVar = null;
        if (i3 == 0) {
            z1x.P(objM);
            if (!Intrinsics.d(cyberGamesPage, CyberGamesPage.Real.INSTANCE)) {
                e0g0 e0g0Var = j0g0.b;
                return new eu4(new j0g0(iun.f15405a), (byte) 12);
            }
            m3uVar.i = this;
            m3uVar.l = 1;
            objM = this.n.m(i, m3uVar);
            if (objM == wneVar) {
                return wneVar;
            }
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = m3uVar.i;
            z1x.P(objM);
        }
        int i4 = 3;
        return new dnq(new p6d(((m0o0) this.o.f25032a).b(), new a1t((gmq) objM, (byte) 7), new c4u(i4, yjeVar, (byte) 0), b), new rl2(i4, yjeVar, (byte) 7), (byte) 1);
    }

    public final sff0 b() {
        return (sff0) this.p.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(sip sipVar, CyberGamesPage cyberGamesPage, int i, zje zjeVar) {
        q3u q3uVar;
        if (zjeVar instanceof q3u) {
            q3uVar = (q3u) zjeVar;
            int i2 = q3uVar.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                q3uVar.k = i2 - Integer.MIN_VALUE;
            } else {
                q3uVar = new q3u(this, zjeVar);
            }
        } else {
            q3uVar = new q3u(this, zjeVar);
        }
        Object objS = q3uVar.i;
        wne wneVar = wne.f39444a;
        int i3 = q3uVar.k;
        yje yjeVar = null;
        if (i3 == 0) {
            z1x.P(objS);
            if ((sipVar == sip.b && !(cyberGamesPage instanceof CyberGamesPage.Real)) || Intrinsics.d(cyberGamesPage, CyberGamesPage.Real.INSTANCE)) {
                e0g0 e0g0Var = j0g0.b;
                return new eu4(new j0g0(iun.f15405a), (byte) 12);
            }
            q3uVar.k = 1;
            objS = this.h.s(sipVar, cyberGamesPage, i, q3uVar);
            if (objS == wneVar) {
                return wneVar;
            }
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objS);
        }
        return new dnq(new a1t((gmq) objS, (byte) 8), new rl2(3, yjeVar, (byte) 8), (byte) 1);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(int i, zje zjeVar, CyberGamesPage cyberGamesPage) {
        t3u t3uVar;
        if (zjeVar instanceof t3u) {
            t3uVar = (t3u) zjeVar;
            int i2 = t3uVar.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                t3uVar.k = i2 - Integer.MIN_VALUE;
            } else {
                t3uVar = new t3u(this, zjeVar);
            }
        } else {
            t3uVar = new t3u(this, zjeVar);
        }
        Object objA = t3uVar.i;
        wne wneVar = wne.f39444a;
        int i3 = t3uVar.k;
        yje yjeVar = null;
        if (i3 == 0) {
            z1x.P(objA);
            t3uVar.k = 1;
            objA = this.b.a(i, t3uVar, cyberGamesPage);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
        }
        return new dnq(new a1t((gmq) objA, (byte) 9), new rl2(3, yjeVar, (byte) 9), (byte) 1);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object e(sip sipVar, CyberGamesPage cyberGamesPage, zje zjeVar) {
        u3u u3uVar;
        sip sipVar2;
        CyberGamesPage cyberGamesPage2;
        or30 or30Var;
        if (zjeVar instanceof u3u) {
            u3uVar = (u3u) zjeVar;
            int i = u3uVar.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                u3uVar.m = i - Integer.MIN_VALUE;
            } else {
                u3uVar = new u3u(this, zjeVar);
            }
        } else {
            u3uVar = new u3u(this, zjeVar);
        }
        Object objA = u3uVar.k;
        wne wneVar = wne.f39444a;
        int i2 = u3uVar.m;
        yje yjeVar = null;
        if (i2 == 0) {
            z1x.P(objA);
            if (sipVar == sip.b && !(cyberGamesPage instanceof CyberGamesPage.Real)) {
                e0g0 e0g0Var = j0g0.b;
                return new eu4(new j0g0(iun.f15405a), (byte) 12);
            }
            boolean zU = kpb.u(sipVar);
            u3uVar.i = sipVar;
            u3uVar.j = cyberGamesPage;
            u3uVar.m = 1;
            objA = this.e.a(zU, 0, u3uVar);
            if (objA == wneVar) {
                return wneVar;
            }
            sipVar2 = sipVar;
            cyberGamesPage2 = cyberGamesPage;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            CyberGamesPage cyberGamesPage3 = u3uVar.j;
            sip sipVar3 = u3uVar.i;
            z1x.P(objA);
            cyberGamesPage2 = cyberGamesPage3;
            sipVar2 = sipVar3;
        }
        c3c0 c3c0Var = (c3c0) objA;
        cyberGamesPage2.getClass();
        c3c0Var.getClass();
        sipVar2.getClass();
        u8u u8uVar = this.c;
        n660 n660Var = (n660) u8uVar.c;
        jvn jvnVarB = ((uzc) u8uVar.b).b();
        lnf0 lnf0VarD = ((knf0) n660Var.f22981a).d();
        jo20 jo20Var = new jo20();
        qbt.a(jo20Var, jvnVarB);
        qbt.c(c3c0Var.f3668a, jo20Var);
        qbt.g(lnf0VarD.b, jo20Var);
        qbt.h(jo20Var);
        qbt.j(lnf0VarD.f20342a, jo20Var);
        qbt.l(jo20Var);
        qbt.o(jo20Var, c3c0Var.b, c3c0Var.c);
        qbt.p(jo20Var);
        jo20 jo20VarB = jo20Var.b();
        fuj0 fuj0Var = (fuj0) n660Var.c;
        int iOrdinal = sipVar2.ordinal();
        if (iOrdinal == 0) {
            LinkedHashMap linkedHashMap = (LinkedHashMap) fuj0Var.f10166a;
            Object or30Var2 = linkedHashMap.get(cyberGamesPage2);
            if (or30Var2 == null) {
                or30Var2 = new or30();
                linkedHashMap.put(cyberGamesPage2, or30Var2);
            }
            or30Var = (or30) or30Var2;
        } else {
            if (iOrdinal != 1) {
                t9f.b();
                return null;
            }
            LinkedHashMap linkedHashMap2 = (LinkedHashMap) fuj0Var.b;
            Object or30Var3 = linkedHashMap2.get(cyberGamesPage2);
            if (or30Var3 == null) {
                or30Var3 = new or30();
                linkedHashMap2.put(cyberGamesPage2, or30Var3);
            }
            or30Var = (or30) or30Var3;
        }
        byte b = 3;
        return new dnq(aoq.c(new i89(gfx.R(or30Var, kpb.v(sipVar2), new joq0((byte) 16), new i7r0(n660Var, sipVar2, cyberGamesPage2, jo20VarB, null), 60), (byte) 23), new sot(yjeVar, this, b)), new rl2(b, yjeVar, (byte) 10), (byte) 1);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object f(int i, zje zjeVar, CyberGamesPage cyberGamesPage) {
        z3u z3uVar;
        if (zjeVar instanceof z3u) {
            z3uVar = (z3u) zjeVar;
            int i2 = z3uVar.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                z3uVar.k = i2 - Integer.MIN_VALUE;
            } else {
                z3uVar = new z3u(this, zjeVar);
            }
        } else {
            z3uVar = new z3u(this, zjeVar);
        }
        Object obj = z3uVar.i;
        wne wneVar = wne.f39444a;
        int i3 = z3uVar.k;
        byte b = 1;
        yje yjeVar = null;
        if (i3 == 0) {
            z1x.P(obj);
            if (!Intrinsics.d(cyberGamesPage, CyberGamesPage.Virtual.INSTANCE)) {
                return new vsg0(new fot(2, yjeVar, b));
            }
            z3uVar.k = 1;
            nru0 nru0Var = (nru0) this.m.f41434a;
            fnq fnqVar = new fnq(gfx.R(nru0Var.b.b, nru0.d, null, new gc4(nru0Var, cyberGamesPage, i, yjeVar, (byte) 6), 252), new n7t0(nru0Var, yjeVar, (byte) 8));
            if (fnqVar == wneVar) {
                return wneVar;
            }
            obj = fnqVar;
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        return new dnq(new a1t((gmq) obj, (byte) 10), new rl2(3, yjeVar, (byte) 11), (byte) 1);
    }
}

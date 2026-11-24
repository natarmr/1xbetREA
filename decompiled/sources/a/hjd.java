package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.betting.core.zip.model.zip.BetZip;
import org.xplatform.betting.core.zip.model.zip.bet.BetGroupZip;
import org.xplatform.ui_core.game_broadcating.models.GameBroadcastType;

/* JADX INFO: loaded from: classes3.dex */
public final class hjd extends x2t0 {
    public static final /* synthetic */ int E = 0;
    public final vqc A;
    public final h3c B;
    public final ouu C;
    public final pru D;
    public final uf3 h;
    public final e1u i;
    public final npx j;
    public final pq k;
    public final jtj l;
    public final ywq0 m;
    public final zyt n;
    public final oeg0 o;
    public final mii0 p;
    public final x20 q;
    public final lbu r;
    public final njt0 s;
    public final ivn t;
    public final cad u;
    public final pmi v;
    public final ctf0 w;
    public final x20 x;
    public final bn6 y;
    public final je z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hjd(uf3 uf3Var, e1u e1uVar, npx npxVar, pq pqVar, jtj jtjVar, ywq0 ywq0Var, zyt zytVar, oeg0 oeg0Var, mii0 mii0Var, x20 x20Var, lbu lbuVar, njt0 njt0Var, ivn ivnVar, cad cadVar, pmi pmiVar, ctf0 ctf0Var, x20 x20Var2, bn6 bn6Var, je jeVar, vqc vqcVar, h3c h3cVar, ouu ouuVar, pru pruVar) {
        super(new a7d((byte) 13));
        oeg0Var.getClass();
        ctf0Var.getClass();
        this.h = uf3Var;
        this.i = e1uVar;
        this.j = npxVar;
        this.k = pqVar;
        this.l = jtjVar;
        this.m = ywq0Var;
        this.n = zytVar;
        this.o = oeg0Var;
        this.p = mii0Var;
        this.q = x20Var;
        this.r = lbuVar;
        this.s = njt0Var;
        this.t = ivnVar;
        this.u = cadVar;
        this.v = pmiVar;
        this.w = ctf0Var;
        this.x = x20Var2;
        this.y = bn6Var;
        this.z = jeVar;
        this.A = vqcVar;
        this.B = h3cVar;
        this.C = ouuVar;
        this.D = pruVar;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00be  */
    public static BetZip j(d0t d0tVar, long j, long j2, xgl0 xgl0Var) {
        Object obj;
        Object next;
        Object next2;
        ArrayList arrayList;
        List list;
        Object next3;
        List list2;
        List list3;
        Iterator it = d0tVar.K.iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((BetGroupZip) next).b != j2);
        BetGroupZip betGroupZip = (BetGroupZip) next;
        if (betGroupZip == null || (list3 = betGroupZip.f) == null) {
            Iterator it2 = d0tVar.k.iterator();
            do {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
            } while (((d0t) next2).f5282a != j);
            d0t d0tVar2 = (d0t) next2;
            if (d0tVar2 == null || (list = d0tVar2.K) == null) {
                arrayList = null;
            } else {
                Iterator it3 = list.iterator();
                do {
                    if (!it3.hasNext()) {
                        next3 = null;
                        break;
                    }
                    next3 = it3.next();
                } while (((BetGroupZip) next3).b != j2);
                BetGroupZip betGroupZip2 = (BetGroupZip) next3;
                if (betGroupZip2 == null || (list2 = betGroupZip2.f) == null) {
                    arrayList = null;
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : list2) {
                        BetZip betZip = (BetZip) obj2;
                        if (betZip.b != 0.0d || betZip.t.length() != 0) {
                            arrayList2.add(obj2);
                        }
                    }
                    arrayList = arrayList2;
                }
            }
        } else {
            arrayList = new ArrayList();
            for (Object obj3 : list3) {
                BetZip betZip2 = (BetZip) obj3;
                if (betZip2.b != 0.0d || betZip2.t.length() != 0) {
                    arrayList.add(obj3);
                }
            }
        }
        if (arrayList != null) {
            for (Object obj4 : arrayList) {
                BetZip betZip3 = (BetZip) obj4;
                if (betZip3.f46426a == xgl0Var.f40846a && betZip3.d == xgl0Var.b && betZip3.b == xgl0Var.c && betZip3.c == j2 && Intrinsics.d(betZip3.t, xgl0Var.d)) {
                    obj = obj4;
                    break;
                }
            }
            BetZip betZip4 = (BetZip) obj;
            if (betZip4 != null) {
                return betZip4;
            }
        }
        throw new ss3();
    }

    public static d0t k(long j, List list) {
        Object next;
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((d0t) next).f5282a != j);
        if (next != null) {
            return (d0t) next;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            for (d0t d0tVar : ((d0t) it2.next()).k) {
                if (d0tVar.f5282a == j) {
                    next = d0tVar;
                }
            }
        }
        d0t d0tVar2 = (d0t) next;
        if (d0tVar2 != null) {
            return d0tVar2;
        }
        throw new ss3();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(d0t d0tVar, d0t d0tVar2, BetZip betZip, ctc ctcVar, zje zjeVar) {
        zid zidVar;
        aud audVar;
        ctc ctcVar2;
        if (zjeVar instanceof zid) {
            zidVar = (zid) zjeVar;
            int i = zidVar.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                zidVar.n = i - Integer.MIN_VALUE;
            } else {
                zidVar = new zid(this, zjeVar);
            }
        } else {
            zidVar = new zid(this, zjeVar);
        }
        Object objF = zidVar.l;
        Object obj = wne.f39444a;
        int i2 = zidVar.n;
        if (i2 != 0) {
            if (i2 == 1) {
                ctcVar = zidVar.j;
                d0tVar = zidVar.i;
                z1x.P(objF);
            } else {
                if (i2 != 2) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                audVar = zidVar.k;
                ctcVar2 = zidVar.j;
                z1x.P(objF);
            }
            g(new njd(audVar, ctcVar2, ((tjd) d()).b));
            return Unit.f46060a;
        }
        z1x.P(objF);
        if (this.r.j()) {
            return Unit.f46060a;
        }
        m0k0 m0k0VarA = m0k0.a(q0x.Y(d0tVar), d0tVar2.i, 0L, -524289);
        zxj0 zxj0VarN0 = ucx.n0(betZip);
        ms2 ms2Var = ((tjd) d()).b;
        zidVar.i = d0tVar;
        zidVar.j = ctcVar;
        zidVar.n = 1;
        pmi pmiVar = this.v;
        pmiVar.getClass();
        objF = gud.f((gud) pmiVar.b, m0k0VarA, zxj0VarN0, phu0.Y(ms2Var), zidVar);
        if (objF != obj) {
        }
        return obj;
        aud audVar2 = (aud) objF;
        zidVar.i = null;
        zidVar.j = ctcVar;
        zidVar.k = audVar2;
        zidVar.n = 2;
        if (l(audVar2, d0tVar, zidVar) != obj) {
            audVar = audVar2;
            ctcVar2 = ctcVar;
            g(new njd(audVar, ctcVar2, ((tjd) d()).b));
            return Unit.f46060a;
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object l(aud audVar, d0t d0tVar, zje zjeVar) {
        ajd ajdVar;
        final d0t d0tVar2;
        String str;
        final l1g l1gVar;
        final j1g j1gVar;
        final long j;
        if (zjeVar instanceof ajd) {
            ajdVar = (ajd) zjeVar;
            int i = ajdVar.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                ajdVar.p = i - Integer.MIN_VALUE;
            } else {
                ajdVar = new ajd(this, zjeVar);
            }
        } else {
            ajdVar = new ajd(this, zjeVar);
        }
        Object obj = ajdVar.n;
        wne wneVar = wne.f39444a;
        int i2 = ajdVar.p;
        if (i2 == 0) {
            z1x.P(obj);
            if (!(audVar instanceof ttd)) {
                return Unit.f46060a;
            }
            long j2 = d0tVar.f5282a;
            long j3 = d0tVar.v;
            String strValueOf = String.valueOf(j2);
            long j4 = j3 == 40 ? d0tVar.u : j3;
            l1g l1gVar2 = l1g.ADD_TO_COUPON;
            j1g j1gVar2 = j3 == 40 ? j1g.REAL : j1g.SYNTHETIC;
            ms2 ms2Var = ((tjd) d()).b;
            if ((ms2Var instanceof uq2) || (ms2Var instanceof kr2) || (ms2Var instanceof jr2) || (ms2Var instanceof lr2) || (ms2Var instanceof jq2) || (ms2Var instanceof rq2) || (ms2Var instanceof kq2)) {
                ajdVar.i = d0tVar;
                ajdVar.j = strValueOf;
                ajdVar.k = l1gVar2;
                ajdVar.l = j1gVar2;
                ajdVar.m = j4;
                ajdVar.p = 1;
                Object objB = this.B.b(j3, ajdVar);
                if (objB == wneVar) {
                    return wneVar;
                }
                d0tVar2 = d0tVar;
                str = strValueOf;
                l1gVar = l1gVar2;
                j1gVar = j1gVar2;
                obj = objB;
                j = j4;
            }
            return Unit.f46060a;
        }
        if (i2 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        long j5 = ajdVar.m;
        j1g j1gVar3 = ajdVar.l;
        l1g l1gVar3 = ajdVar.k;
        String str2 = ajdVar.j;
        d0t d0tVar3 = ajdVar.i;
        z1x.P(obj);
        j1gVar = j1gVar3;
        l1gVar = l1gVar3;
        str = str2;
        d0tVar2 = d0tVar3;
        j = j5;
        if (((Boolean) obj).booleanValue()) {
            final String str3 = str;
            this.A.k(pzb.C(new Function1() { // from class: a.yid
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    n1g n1gVar = (n1g) obj2;
                    n1gVar.getClass();
                    n1gVar.b(str3);
                    n1gVar.c = j;
                    n1gVar.e = ((tjd) this.d()).b;
                    j1g j1gVar4 = j1gVar;
                    j1gVar4.getClass();
                    n1gVar.d = j1gVar4;
                    n1gVar.c(l1gVar);
                    n1gVar.b = d0tVar2.n;
                    return Unit.f46060a;
                }
            }));
        }
        return Unit.f46060a;
    }

    public final void m(long j, long j2, long j3, boolean z) {
        ms2 ms2Var = ((tjd) d()).b;
        ds2 ds2Var = ms2Var instanceof ds2 ? (ds2) ms2Var : null;
        String strV = ds2Var != null ? g1x.v(ds2Var) : ((tjd) d()).f34041a;
        this.y.d(j, j2, j3, strV, z);
        this.z.f(j, j2, j3, strV, z);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x055b, code lost:
    
        if (r0 == r15) goto L234;
     */
    @Override // a.j3t0
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(a.vid r31, a.yje r32) {
        /*
            Method dump skipped, instruction units count: 1383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.hjd.a(a.vid, a.yje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object o(m0k0 m0k0Var, zxj0 zxj0Var, ctc ctcVar, zje zjeVar) {
        cjd cjdVar;
        if (zjeVar instanceof cjd) {
            cjdVar = (cjd) zjeVar;
            int i = cjdVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                cjdVar.l = i - Integer.MIN_VALUE;
            } else {
                cjdVar = new cjd(this, zjeVar);
            }
        } else {
            cjdVar = new cjd(this, zjeVar);
        }
        Object objB = cjdVar.j;
        wne wneVar = wne.f39444a;
        int i2 = cjdVar.l;
        if (i2 == 0) {
            z1x.P(objB);
            if (this.r.j()) {
                return Unit.f46060a;
            }
            ms2 ms2Var = ((tjd) d()).b;
            cjdVar.i = ctcVar;
            cjdVar.l = 1;
            pmi pmiVar = this.v;
            pmiVar.getClass();
            objB = ((cr) pmiVar.d).b(m0k0Var, zxj0Var, phu0.Y(ms2Var), hrs.f13547a, cjdVar);
            if (objB == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ctcVar = cjdVar.i;
            z1x.P(objB);
        }
        g(new njd((aud) objB, ctcVar, ((tjd) d()).b));
        return Unit.f46060a;
    }

    public final void p() {
        this.m.s(epv0.a0(((tjd) d()).d), j2e.W(((tjd) d()).e));
        ((qe50) this.C.b).a(new za50(0, 7, 0L, 0L), false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object q(zje zjeVar) {
        djd djdVar;
        if (zjeVar instanceof djd) {
            djdVar = (djd) zjeVar;
            int i = djdVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                djdVar.k = i - Integer.MIN_VALUE;
            } else {
                djdVar = new djd(this, zjeVar);
            }
        } else {
            djdVar = new djd(this, zjeVar);
        }
        Object obj = djdVar.i;
        wne wneVar = wne.f39444a;
        int i2 = djdVar.k;
        if (i2 == 0) {
            z1x.P(obj);
            djdVar.k = 1;
            Object objY = ((esg0) this.v.e).Y(djdVar);
            if (objY != wneVar) {
                objY = Unit.f46060a;
            }
            if (objY == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        g(ijd.f14869a);
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object r(m0k0 m0k0Var, zxj0 zxj0Var, zje zjeVar) {
        fjd fjdVar;
        if (zjeVar instanceof fjd) {
            fjdVar = (fjd) zjeVar;
            int i = fjdVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                fjdVar.k = i - Integer.MIN_VALUE;
            } else {
                fjdVar = new fjd(this, zjeVar);
            }
        } else {
            fjdVar = new fjd(this, zjeVar);
        }
        Object objN = fjdVar.i;
        wne wneVar = wne.f39444a;
        int i2 = fjdVar.k;
        if (i2 == 0) {
            z1x.P(objN);
            ms2 ms2Var = ((tjd) d()).b;
            fjdVar.k = 1;
            pmi pmiVar = this.v;
            pmiVar.getClass();
            objN = ((xzp) pmiVar.c).N(m0k0Var, zxj0Var, phu0.Y(ms2Var), fjdVar);
            if (objN == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objN);
        }
        g(new njd((vtd) objN, ctc.b, ((tjd) d()).b));
        return Unit.f46060a;
    }

    public final Object s(d0t d0tVar, bjd bjdVar) {
        Object objT = t(d0tVar.f5282a, d0tVar.v, d0tVar.u, d0tVar.C, GameBroadcastType.c, grs.f11797a, d0tVar.o, d0tVar.n, bjdVar);
        return objT == wne.f39444a ? objT : Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object t(long j, long j2, long j3, boolean z, GameBroadcastType gameBroadcastType, grs grsVar, String str, long j4, zje zjeVar) {
        gjd gjdVar;
        GameBroadcastType gameBroadcastType2;
        long j5;
        long j6;
        boolean z2;
        String str2;
        long j7;
        long j8;
        grs grsVar2;
        long j9;
        Object next;
        if (zjeVar instanceof gjd) {
            gjdVar = (gjd) zjeVar;
            int i = gjdVar.s;
            if ((i & Integer.MIN_VALUE) != 0) {
                gjdVar.s = i - Integer.MIN_VALUE;
            } else {
                gjdVar = new gjd(this, zjeVar);
            }
        } else {
            gjdVar = new gjd(this, zjeVar);
        }
        Object obj = gjdVar.q;
        wne wneVar = wne.f39444a;
        int i2 = gjdVar.s;
        if (i2 == 0) {
            z1x.P(obj);
            gjdVar.n = gameBroadcastType;
            gjdVar.o = grsVar;
            gjdVar.p = str;
            gjdVar.i = j;
            gjdVar.j = j2;
            gjdVar.k = j3;
            gjdVar.m = z;
            gjdVar.l = j4;
            gjdVar.s = 1;
            Object objB = this.B.b(j2, gjdVar);
            if (objB == wneVar) {
                return wneVar;
            }
            gameBroadcastType2 = gameBroadcastType;
            obj = objB;
            j5 = j2;
            j6 = j;
            z2 = z;
            str2 = str;
            j7 = j4;
            j8 = j3;
            grsVar2 = grsVar;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            long j10 = gjdVar.l;
            boolean z3 = gjdVar.m;
            long j11 = gjdVar.k;
            long j12 = gjdVar.j;
            long j13 = gjdVar.i;
            String str3 = gjdVar.p;
            grs grsVar3 = gjdVar.o;
            GameBroadcastType gameBroadcastType3 = gjdVar.n;
            z1x.P(obj);
            gameBroadcastType2 = gameBroadcastType3;
            grsVar2 = grsVar3;
            str2 = str3;
            j8 = j11;
            z2 = z3;
            j7 = j10;
            j5 = j12;
            j6 = j13;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        Iterator it = ((tjd) d()).c.iterator();
        while (true) {
            if (!it.hasNext()) {
                j9 = j6;
                next = null;
                break;
            }
            next = it.next();
            Iterator it2 = it;
            j9 = j6;
            if (((d0t) next).f5282a == j9) {
                break;
            }
            it = it2;
            j6 = j9;
        }
        d0t d0tVar = (d0t) next;
        this.o.c().d(new wid(this, j9, j5, j8, zBooleanValue, j7, z2, gameBroadcastType2, grsVar2, str2, d0tVar != null ? d0tVar.O : 0, (byte) 0));
        return Unit.f46060a;
    }
}

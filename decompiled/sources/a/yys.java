package a;

import com.huawei.hms.framework.common.BundleUtil;
import kotlin.Unit;
import org.xplatform.game_broadcasting.api.presentation.models.GameBroadcastingParams;

/* JADX INFO: loaded from: classes4.dex */
public final class yys extends w46 implements dke {
    public final xex A;
    public final p7m0 B;
    public final p7m0 C;
    public boolean D;
    public boolean E;
    public bby F;
    public c4m0 G;
    public bby H;
    public c4m0 I;
    public final GameBroadcastingParams b;
    public final ali c;
    public final a5v d;
    public final lut e;
    public final xsc f;
    public final yqc g;
    public final xsc h;
    public final lbu i;
    public final reu j;
    public final yox k;
    public final ljf0 l;
    public final hrx m;
    public final psc n;
    public final m1e o;
    public final mne p;
    public final ctf0 q;
    public final jqt r;
    public final s64 s;
    public final cmt t;
    public final bn6 u;
    public final iqt v;
    public final hrx w;
    public final fuj0 x;
    public final nw20 y;
    public final chf0 z;

    public yys(GameBroadcastingParams gameBroadcastingParams, ali aliVar, a5v a5vVar, lut lutVar, xsc xscVar, yqc yqcVar, xsc xscVar2, lbu lbuVar, reu reuVar, yox yoxVar, ljf0 ljf0Var, hrx hrxVar, psc pscVar, m1e m1eVar, mne mneVar, ctf0 ctf0Var, jqt jqtVar, s64 s64Var, cmt cmtVar, bn6 bn6Var, iqt iqtVar, hrx hrxVar2, fuj0 fuj0Var, nw20 nw20Var, chf0 chf0Var, xex xexVar, lut lutVar2, pru pruVar) {
        m1eVar.getClass();
        ctf0Var.getClass();
        this.b = gameBroadcastingParams;
        this.c = aliVar;
        this.d = a5vVar;
        this.e = lutVar;
        this.f = xscVar;
        this.g = yqcVar;
        this.h = xscVar2;
        this.i = lbuVar;
        this.j = reuVar;
        this.k = yoxVar;
        this.l = ljf0Var;
        this.m = hrxVar;
        this.n = pscVar;
        this.o = m1eVar;
        this.p = mneVar;
        this.q = ctf0Var;
        this.r = jqtVar;
        this.s = s64Var;
        this.t = cmtVar;
        this.u = bn6Var;
        this.v = iqtVar;
        this.w = hrxVar2;
        this.x = fuj0Var;
        this.y = nw20Var;
        this.z = chf0Var;
        this.A = xexVar;
        sff0 sff0VarA = pruVar.a();
        long j = gameBroadcastingParams.f46691a;
        long j2 = gameBroadcastingParams.d;
        String str = gameBroadcastingParams.f;
        long j3 = gameBroadcastingParams.g;
        String str2 = gameBroadcastingParams.h;
        str2 = str2 == null ? "" : str2;
        boolean zA = lutVar2.a();
        boolean z = sff0VarA.F1;
        this.B = q7m0.a(new ixs(j, j2, str, j3, str2, false, false, false, zA, null, hrxVar2.a(), true, null, z, false, "", false, true, yys.class.getSimpleName() + BundleUtil.UNDERLINE_TAG + gameBroadcastingParams.f46691a));
        this.C = q7m0.a(nws.f24250a);
    }

    public final void A() {
        this.y.o(((ixs) this.B.getValue()).s);
    }

    public final void B() {
        if (((ixs) this.B.getValue()).o) {
            v3c.N(this.m.f13553a.f23405a.b);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object C(zje zjeVar) {
        xys xysVar;
        Object value;
        yys yysVar = this;
        if (zjeVar instanceof xys) {
            xysVar = (xys) zjeVar;
            int i = xysVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                xysVar.k = i - Integer.MIN_VALUE;
            } else {
                xysVar = new xys(yysVar, zjeVar);
            }
        } else {
            xysVar = new xys(yysVar, zjeVar);
        }
        Object objX = xysVar.i;
        Object obj = wne.f39444a;
        int i2 = xysVar.k;
        if (i2 == 0) {
            z1x.P(objX);
            xysVar.k = 1;
            objX = yysVar.x(xysVar);
            if (objX == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objX);
        }
        hl90 hl90Var = (hl90) objX;
        p7m0 p7m0Var = yysVar.B;
        if (((ixs) p7m0Var.getValue()).k && hl90Var != hl90.b && hl90Var != hl90.c) {
            yysVar.n.n();
            do {
                value = p7m0Var.getValue();
            } while (!p7m0Var.m(value, ixs.a((ixs) value, 0L, null, false, false, false, false, null, false, false, null, false, null, false, false, 506879)));
        }
        while (true) {
            Object value2 = p7m0Var.getValue();
            if (p7m0Var.m(value2, ixs.a((ixs) value2, 0L, null, true, false, false, false, hl90Var, yysVar.w.a(), false, null, false, null, false, false, 520671))) {
                return Unit.f46060a;
            }
            yysVar = this;
        }
    }

    public final void D() {
        GameBroadcastingParams gameBroadcastingParams = this.b;
        this.x.A(gameBroadcastingParams.f46691a, gameBroadcastingParams.d, gameBroadcastingParams.g, v39.VIDEO, gameBroadcastingParams.f, ((ixs) this.B.getValue()).s);
    }

    public final void E(gl90 gl90Var) {
        String str = gl90Var.f11480a;
        GameBroadcastingParams gameBroadcastingParams = this.b;
        long j = gameBroadcastingParams.d;
        long j2 = gameBroadcastingParams.g;
        xex xexVar = this.A;
        xexVar.getClass();
        ik4 ik4Var = (ik4) xexVar.b;
        ik4Var.getClass();
        s1p s1pVar = ik4Var.f14907a;
        yni0 yni0Var = new yni0();
        yni0Var.add(new i1p((byte) 2, j));
        if (j == 40) {
            yni0Var.add(new i1p((byte) 0, j2));
        }
        yni0Var.add(new j1p(str, (byte) 0));
        s1pVar.a(cui0.a(yni0Var), 12006L);
        vd1 vd1Var = (vd1) xexVar.f40764a;
        vd1Var.getClass();
        kt2 kt2Var = vd1Var.f37210a;
        jo20 jo20Var = new jo20();
        jo20Var.put("option", str);
        jo20Var.put("sport_id", Long.valueOf(j));
        if (j == 40) {
            jo20Var.put("sub_sport_id", Long.valueOf(j2));
        }
        kt2Var.a("broadcast_phone_add", jo20Var.b());
    }

    @Override // a.diu0
    public final void v() {
        if (((ixs) this.B.getValue()).r) {
            w();
        }
    }

    public final void w() {
        b49 b49VarM = this.z.M(((ixs) this.B.getValue()).s);
        if (b49VarM instanceof a49) {
            a49 a49Var = (a49) b49VarM;
            this.A.O(a49Var.b, a49Var.c, a49Var.f212a, a49Var.d, a49Var.e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Enum x(zje zjeVar) {
        mys mysVar;
        Object value;
        if (zjeVar instanceof mys) {
            mysVar = (mys) zjeVar;
            int i = mysVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                mysVar.k = i - Integer.MIN_VALUE;
            } else {
                mysVar = new mys(this, zjeVar);
            }
        } else {
            mysVar = new mys(this, zjeVar);
        }
        Object objA = mysVar.i;
        wne wneVar = wne.f39444a;
        int i2 = mysVar.k;
        p7m0 p7m0Var = this.B;
        if (i2 == 0) {
            z1x.P(objA);
            if (!((ixs) p7m0Var.getValue()).n || !this.v.f15225a.a()) {
                return null;
            }
            mysVar.k = 1;
            objA = ((b3c0) this.j.b).a(false, mysVar);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
        }
        m2c0 m2c0Var = (m2c0) objA;
        do {
            value = p7m0Var.getValue();
        } while (!p7m0Var.m(value, ixs.a((ixs) value, 0L, null, false, false, false, false, null, false, false, null, false, m2c0Var.Z, false, false, 491519)));
        int iOrdinal = m2c0Var.k.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            return m2c0Var.Z.length() == 0 ? hl90.b : hl90.c;
        }
        return hl90.f13247a;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:51:0x0108 A[LOOP:0: B:48:0x00dc->B:51:0x0108, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:52:0x010b  */
    /* JADX WARN: Code duplicated, block: B:57:0x0136 A[EDGE_INSN: B:57:0x0136->B:55:0x0136 BREAK  A[LOOP:0: B:48:0x00dc->B:51:0x0108], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ab, code lost:
    
        if (r1 == r3) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object y(a.zje r28) {
        /*
            Method dump skipped, instruction units count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.yys.y(a.zje):java.lang.Object");
    }

    public final void z() {
        p7m0 p7m0Var;
        Object value;
        do {
            p7m0Var = this.B;
            value = p7m0Var.getValue();
        } while (!p7m0Var.m(value, ixs.a((ixs) value, 0L, null, false, false, false, false, null, false, false, null, false, null, true, false, 458751)));
        B();
    }
}

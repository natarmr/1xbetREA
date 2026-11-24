package a;

import java.net.UnknownHostException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class h2b extends w46 {
    public final dcu A;
    public final iqt B;
    public final gw60 C;
    public final ix0 D;
    public final mne E;
    public final l7k F;
    public final cmt G;
    public final dmt H;
    public final ctf0 I;
    public final uxs0 J;
    public final zri K;
    public bby L;
    public c4m0 M;
    public bby N;
    public bby O;
    public boolean P;
    public boolean Q;
    public Map R;
    public final p7m0 S;
    public final p7m0 T;
    public final ol60 U;
    public final p7m0 V;
    public final p7m0 W;
    public final p7m0 X;
    public final p7m0 Y;
    public final p7m0 Z;
    public final i1w0 b;
    public final ouu c;
    public final p4u d;
    public final kwt e;
    public final o470 f;
    public final yoc g;
    public final yoc h;
    public final u58 i;
    public final ih5 j;
    public final gg5 k;
    public final ih5 l;
    public final rjo m;
    public final m1e n;
    public final uf3 o;
    public final duj p;
    public final v88 q;
    public final uyn r;
    public final sa10 s;
    public final g2v t;
    public final hs60 u;
    public final lbu v;
    public final ls w;
    public final kyg0 x;
    public final wsf0 y;
    public final z4u z;

    public h2b(i1w0 i1w0Var, ouu ouuVar, p4u p4uVar, kwt kwtVar, o470 o470Var, yoc yocVar, yoc yocVar2, u58 u58Var, ih5 ih5Var, gg5 gg5Var, ih5 ih5Var2, rjo rjoVar, m1e m1eVar, uf3 uf3Var, duj dujVar, v88 v88Var, uyn uynVar, sa10 sa10Var, g2v g2vVar, hs60 hs60Var, lbu lbuVar, ls lsVar, kyg0 kyg0Var, wsf0 wsf0Var, z4u z4uVar, dcu dcuVar, iqt iqtVar, gw60 gw60Var, ix0 ix0Var, ntu ntuVar, mne mneVar, l7k l7kVar, cmt cmtVar, dmt dmtVar, ctf0 ctf0Var, uxs0 uxs0Var, zri zriVar) {
        i1w0Var.getClass();
        this.b = i1w0Var;
        this.c = ouuVar;
        this.d = p4uVar;
        this.e = kwtVar;
        this.f = o470Var;
        this.g = yocVar;
        this.h = yocVar2;
        this.i = u58Var;
        this.j = ih5Var;
        this.k = gg5Var;
        this.l = ih5Var2;
        this.m = rjoVar;
        this.n = m1eVar;
        this.o = uf3Var;
        this.p = dujVar;
        this.q = v88Var;
        this.r = uynVar;
        this.s = sa10Var;
        this.t = g2vVar;
        this.u = hs60Var;
        this.v = lbuVar;
        this.w = lsVar;
        this.x = kyg0Var;
        this.y = wsf0Var;
        this.z = z4uVar;
        this.A = dcuVar;
        this.B = iqtVar;
        this.C = gw60Var;
        this.D = ix0Var;
        this.E = mneVar;
        this.F = l7kVar;
        this.G = cmtVar;
        this.H = dmtVar;
        this.I = ctf0Var;
        this.J = uxs0Var;
        this.K = zriVar;
        this.Q = m1eVar.c();
        lun lunVar = lun.f20680a;
        lunVar.getClass();
        this.R = lunVar;
        kat katVar = kat.f17982a;
        this.S = q7m0.a(katVar);
        this.T = q7m0.a(katVar);
        this.U = new ol60(3);
        this.V = q7m0.a(new q1b());
        this.W = q7m0.a(new n1b("", "", ""));
        this.X = q7m0.a(Boolean.TRUE);
        this.Y = q7m0.a(new r1b(null, null));
        this.Z = q7m0.a(new vfu0(iqtVar.f15225a.a()));
    }

    public final void A(y1b y1bVar) {
        sac.V(jiu0.a(this), new m1b((byte) 0), null, this.E.c, new yp6(this, y1bVar, null, (byte) 28), 10);
    }

    public final void B() {
        p7m0 p7m0Var;
        Object value;
        jkm jkmVarD = g2v.d(this.t, pb10.r1, okm.b, null, R.string.games_section_technical_works_descr, R.string.continue_action, new l1b(this, (byte) 0), 84);
        Boolean bool = Boolean.FALSE;
        p7m0 p7m0Var2 = this.X;
        p7m0Var2.getClass();
        p7m0Var2.o(null, bool);
        do {
            p7m0Var = this.Y;
            value = p7m0Var.getValue();
            ((r1b) value).getClass();
        } while (!p7m0Var.m(value, new r1b(null, jkmVarD)));
    }

    public final void C() {
        sac.V(jiu0.a(this), new j1b(this, (byte) 4), null, null, new ya(this, null, (byte) 13), 14);
    }

    public final void D(boolean z) {
        c4m0 c4m0Var = this.M;
        if (c4m0Var != null) {
            v3c.N(c4m0Var);
        }
        p7m0 p7m0Var = this.S;
        pat patVar = (pat) p7m0Var.getValue();
        patVar.getClass();
        boolean z2 = patVar instanceof kat;
        p7m0 p7m0Var2 = this.T;
        if (z2) {
            pat patVar2 = (pat) p7m0Var2.getValue();
            patVar2.getClass();
            if (patVar2 instanceof kat) {
                this.U.f(u1b.f34895a);
            }
        }
        yje yjeVar = null;
        this.M = slb.U(new dnq(new fnq(new rf0(new fnq(i120.W(new p6d(p7m0Var, p7m0Var2, g2b.h, (byte) 1)), new u88(z, (Object) this, yjeVar, (byte) 2), (byte) 4), (byte) 3), new fr9(this, yjeVar, (byte) 4), (byte) 4), new rj((Object) this, yjeVar, (byte) 7), (byte) 1), d5c.S(jiu0.a(this), this.E.b));
    }

    public final void E(Throwable th) {
        Object value;
        ra10 ra10VarB;
        Object value2;
        ra10 ra10VarW;
        Object value3;
        ra10 ra10VarW2;
        Object value4;
        ra10 ra10VarW3;
        if (th instanceof CancellationException) {
            return;
        }
        boolean z = this.Q;
        p7m0 p7m0Var = this.Y;
        if (!z) {
            do {
                value4 = p7m0Var.getValue();
                ra10VarW3 = w();
                ((r1b) value4).getClass();
            } while (!p7m0Var.m(value4, new r1b(ra10VarW3, null)));
        } else if ((th instanceof j7t0) || (th instanceof fpd0)) {
            do {
                value = p7m0Var.getValue();
                ra10VarB = sa10.b(this.s, pb10.g, R.string.unauthorized_cachback_desc, 0, null, 28);
                ((r1b) value).getClass();
            } while (!p7m0Var.m(value, new r1b(ra10VarB, null)));
        } else if (th instanceof sq60) {
            B();
        } else if ((th instanceof bun) || (th instanceof vub0)) {
            do {
                value2 = p7m0Var.getValue();
                ra10VarW = w();
                ((r1b) value2).getClass();
            } while (!p7m0Var.m(value2, new r1b(ra10VarW, null)));
        } else if (th instanceof UnknownHostException) {
            do {
                value3 = p7m0Var.getValue();
                ra10VarW2 = w();
                ((r1b) value3).getClass();
            } while (!p7m0Var.m(value3, new r1b(ra10VarW2, null)));
        } else {
            A(new t1b(th));
        }
        this.p.b(th, new pua((byte) 11));
        this.m.a(th);
        Boolean bool = Boolean.FALSE;
        p7m0 p7m0Var2 = this.X;
        p7m0Var2.getClass();
        p7m0Var2.o(null, bool);
    }

    public final void F(List list) {
        bby bbyVar = this.N;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.N = sac.f0(jiu0.a(this), this.g.a(), TimeUnit.MILLISECONDS, this.E.f22085a, new j1b(this, (byte) 0), new d09((Object) this, (Object) list, (yje) null, (byte) 20), 32);
        }
    }

    @Override // a.diu0
    public final void v() {
        c4m0 c4m0Var = this.M;
        if (c4m0Var != null) {
            c4m0Var.cancel(null);
        }
    }

    public final ra10 w() {
        return this.s.a(pb10.g, R.string.data_retrieval_error, R.string.try_again_text, new l1b(this, (byte) 1), 10000L);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:103:0x01db  */
    /* JADX WARN: Code duplicated, block: B:105:0x01de  */
    /* JADX WARN: Code duplicated, block: B:107:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:109:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:111:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:116:0x0221  */
    /* JADX WARN: Code duplicated, block: B:117:0x0223  */
    /* JADX WARN: Code duplicated, block: B:120:0x022a  */
    /* JADX WARN: Code duplicated, block: B:122:0x0234  */
    /* JADX WARN: Code duplicated, block: B:125:0x023e  */
    /* JADX WARN: Code duplicated, block: B:132:0x0264  */
    /* JADX WARN: Code duplicated, block: B:133:0x0266  */
    /* JADX WARN: Code duplicated, block: B:135:0x0269  */
    /* JADX WARN: Code duplicated, block: B:136:0x026c  */
    /* JADX WARN: Code duplicated, block: B:138:0x026f  */
    /* JADX WARN: Code duplicated, block: B:141:0x0275  */
    /* JADX WARN: Code duplicated, block: B:142:0x0278  */
    /* JADX WARN: Code duplicated, block: B:144:0x027b  */
    /* JADX WARN: Code duplicated, block: B:145:0x0283  */
    /* JADX WARN: Code duplicated, block: B:147:0x0288  */
    /* JADX WARN: Code duplicated, block: B:148:0x0292  */
    /* JADX WARN: Code duplicated, block: B:152:0x02b0 A[LOOP:5: B:130:0x0258->B:152:0x02b0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:155:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:159:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:164:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:165:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:169:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:175:0x0316  */
    /* JADX WARN: Code duplicated, block: B:176:0x0319  */
    /* JADX WARN: Code duplicated, block: B:178:0x031c  */
    /* JADX WARN: Code duplicated, block: B:181:0x0324  */
    /* JADX WARN: Code duplicated, block: B:182:0x0327  */
    /* JADX WARN: Code duplicated, block: B:184:0x032a  */
    /* JADX WARN: Code duplicated, block: B:186:0x0333  */
    /* JADX WARN: Code duplicated, block: B:188:0x0339  */
    /* JADX WARN: Code duplicated, block: B:189:0x033f  */
    /* JADX WARN: Code duplicated, block: B:193:0x0359 A[LOOP:7: B:166:0x02e8->B:193:0x0359, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:194:0x035c  */
    /* JADX WARN: Code duplicated, block: B:200:0x0388  */
    /* JADX WARN: Code duplicated, block: B:203:0x0392  */
    /* JADX WARN: Code duplicated, block: B:206:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:212:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:215:0x03bf A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:219:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:245:0x044e A[LOOP:0: B:48:0x00ff->B:245:0x044e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:246:0x0219 A[EDGE_INSN: B:246:0x0219->B:114:0x0219 BREAK  A[LOOP:0: B:48:0x00ff->B:245:0x044e], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:247:0x0135 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:249:0x0132 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:252:0x0164 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:253:0x0162 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:255:0x0189 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:258:0x0254 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:261:0x02ae A[EDGE_INSN: B:261:0x02ae->B:151:0x02ae BREAK  A[LOOP:5: B:130:0x0258->B:152:0x02b0], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:263:0x02e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:265:0x0375 A[EDGE_INSN: B:265:0x0375->B:197:0x0375 BREAK  A[LOOP:7: B:166:0x02e8->B:193:0x0359], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:267:0x030f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:270:0x03e1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:271:0x042f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:275:0x038c A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:277:0x03b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:280:0x03dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:292:0x00da A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:293:0x00fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:294:? A[LOOP:15: B:42:0x00e0->B:294:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:35:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:41:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:51:0x0112  */
    /* JADX WARN: Code duplicated, block: B:53:0x0123  */
    /* JADX WARN: Code duplicated, block: B:61:0x0142  */
    /* JADX WARN: Code duplicated, block: B:63:0x0153  */
    /* JADX WARN: Code duplicated, block: B:71:0x0171  */
    /* JADX WARN: Code duplicated, block: B:77:0x0190  */
    /* JADX WARN: Code duplicated, block: B:78:0x0193  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:81:0x0198  */
    /* JADX WARN: Code duplicated, block: B:82:0x019b  */
    /* JADX WARN: Code duplicated, block: B:84:0x019f  */
    /* JADX WARN: Code duplicated, block: B:85:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:87:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:88:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:90:0x01ac A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:92:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:95:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:96:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:98:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:99:0x01d2  */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x0448, code lost:
    
        if (kotlin.Unit.f46060a == r3) goto L242;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object x(a.zje r25) {
        /*
            Method dump skipped, instruction units count: 1110
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.h2b.x(a.zje):java.lang.Object");
    }

    public final void y(String str, a570 a570Var, boolean z, String str2) {
        bby bbyVar = this.O;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.O = sac.V(jiu0.a(this), new j1b(this, (byte) 5), null, null, new b2b(a570Var, this, str2, z, (yje) null), 14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object z(long j, zje zjeVar, String str, boolean z) {
        c2b c2bVar;
        long j2;
        String str2;
        boolean z2;
        if (zjeVar instanceof c2b) {
            c2bVar = (c2b) zjeVar;
            int i = c2bVar.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2bVar.n = i - Integer.MIN_VALUE;
            } else {
                c2bVar = new c2b(this, zjeVar);
            }
        } else {
            c2bVar = new c2b(this, zjeVar);
        }
        Object obj = c2bVar.l;
        wne wneVar = wne.f39444a;
        int i2 = c2bVar.n;
        if (i2 == 0) {
            z1x.P(obj);
            c2bVar.k = str;
            c2bVar.i = j;
            c2bVar.j = z;
            c2bVar.n = 1;
            Object objA = this.z.a(j, c2bVar);
            if (objA == wneVar) {
                return wneVar;
            }
            j2 = j;
            str2 = str;
            obj = objA;
            z2 = z;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            boolean z3 = c2bVar.j;
            long j3 = c2bVar.i;
            String str3 = c2bVar.k;
            z1x.P(obj);
            z2 = z3;
            str2 = str3;
            j2 = j3;
        }
        this.b.d(new k1b(this, j2, z2, str2, !((Boolean) obj).booleanValue(), (byte) 0));
        return Unit.f46060a;
    }
}

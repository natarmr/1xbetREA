package a;

import android.javax.sip.message.Response;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import org.xbet.client1.R;
import org.xplatform.core.navigation.dialog.DialogScreen;

/* JADX INFO: loaded from: classes5.dex */
public final class sbb0 extends w3k implements f0s {
    public final ouu A;
    public final n9b0 A0;
    public final lbu B;
    public final p7m0 B0;
    public final ntu C;
    public final p7m0 C0;
    public final x4u D;
    public final p7m0 D0;
    public final rrc E;
    public final ol60 E0;
    public final eke0 F;
    public long F0;
    public final kl5 G;
    public final p7m0 G0;
    public final svu H;
    public final p7m0 H0;
    public final luu I;
    public final p7m0 I0;
    public final y3v J;
    public final p7m0 J0;
    public final hzu K;
    public final p7m0 K0;
    public final lyt L;
    public final yuu M;
    public final iij N;
    public final l0s O;
    public final yox P;
    public final uzc0 Q;
    public final yfu R;
    public final xrt S;
    public final gg5 T;
    public final zg U;
    public final yo4 V;
    public final gmu W;
    public final puu X;
    public final grj Y;
    public final jlx Z;
    public final qho a0;
    public final qyg0 b0;
    public final vzg0 c;
    public final pyg0 c0;
    public final ctf0 d;
    public final zx10 d0;
    public final vqc e;
    public final nmo e0;
    public final wyu f;
    public final iqt f0;
    public final uyu g;
    public final svs0 g0;
    public final i1w0 h;
    public final rou h0;
    public final v88 i;
    public final o3c i0;
    public final phf0 j;
    public final l570 j0;
    public final ort k;
    public final n4u k0;
    public final duj l;
    public final ytt l0;
    public final lbu m;
    public final sff0 m0;
    public final ani0 n;
    public final boolean n0;
    public final pm60 o;
    public final sje o0;
    public final esg0 p;
    public List p0;
    public final mne q;
    public bby q0;
    public final poq0 r;
    public c4m0 r0;
    public final alv s;
    public bby s0;
    public final yuu t;
    public final bby t0;
    public final roi0 u;
    public bby u0;
    public final sd60 v;
    public c4m0 v0;
    public final exu w;
    public long w0;
    public final upt x;
    public c4m0 x0;
    public final c8c y;
    public final ol60 y0;
    public final e1u z;
    public final p7m0 z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public sbb0(vzg0 vzg0Var, ctf0 ctf0Var, vqc vqcVar, wyu wyuVar, uyu uyuVar, i1w0 i1w0Var, v88 v88Var, phf0 phf0Var, ort ortVar, duj dujVar, lbu lbuVar, ani0 ani0Var, pm60 pm60Var, esg0 esg0Var, mne mneVar, poq0 poq0Var, alv alvVar, yuu yuuVar, roi0 roi0Var, sd60 sd60Var, exu exuVar, upt uptVar, c8c c8cVar, e1u e1uVar, ouu ouuVar, lbu lbuVar2, ntu ntuVar, x4u x4uVar, rrc rrcVar, eke0 eke0Var, kl5 kl5Var, svu svuVar, luu luuVar, y3v y3vVar, hzu hzuVar, lyt lytVar, yuu yuuVar2, iij iijVar, l0s l0sVar, yox yoxVar, uzc0 uzc0Var, yfu yfuVar, brt brtVar, xrt xrtVar, gg5 gg5Var, zg zgVar, yo4 yo4Var, gmu gmuVar, puu puuVar, grj grjVar, jlx jlxVar, qho qhoVar, qyg0 qyg0Var, pyg0 pyg0Var, zx10 zx10Var, nmo nmoVar, iqt iqtVar, svs0 svs0Var, rou rouVar, o3c o3cVar, l570 l570Var, n4u n4uVar, ytt yttVar, pru pruVar, lbu lbuVar3, n4u n4uVar2) {
        dr5 br5Var;
        Object value;
        n7b0 n7b0Var;
        super(vzg0Var, q3d.j(alvVar, iijVar, pm60Var, l0sVar));
        ctf0Var.getClass();
        wyuVar.getClass();
        c8cVar.getClass();
        byte b = 1;
        byte b2 = 3;
        this.c = vzg0Var;
        this.d = ctf0Var;
        this.e = vqcVar;
        this.f = wyuVar;
        this.g = uyuVar;
        this.h = i1w0Var;
        this.i = v88Var;
        this.j = phf0Var;
        this.k = ortVar;
        this.l = dujVar;
        this.m = lbuVar;
        this.n = ani0Var;
        this.o = pm60Var;
        this.p = esg0Var;
        this.q = mneVar;
        this.r = poq0Var;
        this.s = alvVar;
        this.t = yuuVar;
        this.u = roi0Var;
        this.v = sd60Var;
        this.w = exuVar;
        this.x = uptVar;
        this.y = c8cVar;
        this.z = e1uVar;
        this.A = ouuVar;
        this.B = lbuVar2;
        this.C = ntuVar;
        this.D = x4uVar;
        this.E = rrcVar;
        this.F = eke0Var;
        this.G = kl5Var;
        this.H = svuVar;
        this.I = luuVar;
        this.J = y3vVar;
        this.K = hzuVar;
        this.L = lytVar;
        this.M = yuuVar2;
        this.N = iijVar;
        this.O = l0sVar;
        this.P = yoxVar;
        this.Q = uzc0Var;
        this.R = yfuVar;
        this.S = xrtVar;
        this.T = gg5Var;
        this.U = zgVar;
        this.V = yo4Var;
        this.W = gmuVar;
        this.X = puuVar;
        this.Y = grjVar;
        this.Z = jlxVar;
        this.a0 = qhoVar;
        this.b0 = qyg0Var;
        this.c0 = pyg0Var;
        this.d0 = zx10Var;
        this.e0 = nmoVar;
        this.f0 = iqtVar;
        this.g0 = svs0Var;
        this.h0 = rouVar;
        this.i0 = o3cVar;
        this.j0 = l570Var;
        this.k0 = n4uVar;
        this.l0 = yttVar;
        this.m0 = pruVar.a();
        boolean zJ = lbuVar3.j();
        this.n0 = zJ;
        this.o0 = d5c.a(mneVar.b);
        sff0 sff0VarA = brtVar.f3095a.a();
        ArrayList arrayListA = brt.a(sff0VarA, sff0VarA.U0);
        arrayListA = arrayListA.isEmpty() ? brt.a(sff0VarA, q3d.j(bmb0.LIVE, bmb0.LINE, bmb0.ESPORTS, bmb0.XGAMES, bmb0.AGGREGATOR, bmb0.VIRTUAL, bmb0.EXPRESS, bmb0.CHAMPSLIVE, bmb0.CHAMPSLINE)) : arrayListA;
        if (zJ) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : arrayListA) {
                if (!q3d.j(s9b0.AGGREGATOR, s9b0.ONE_X_GAMES, s9b0.DAY_EXPRESS).contains((s9b0) obj)) {
                    arrayList.add(obj);
                }
            }
            arrayListA = arrayList;
        }
        yje yjeVar = null;
        sac.V(jiu0.a(this), qbb0.f28440a, null, this.q.c, new s980(this, (s9b0) CollectionsKt.U(arrayListA), yjeVar, (byte) 26), 10);
        this.p0 = iun.f15405a;
        Long l = (Long) this.c.a("KEY_2FA_ALERT_TIMER");
        this.w0 = l != null ? l.longValue() : 0L;
        this.y0 = new ol60(3);
        this.z0 = q7m0.a(Boolean.FALSE);
        sff0 sff0Var = this.m0;
        int i = sff0Var.L.c;
        boolean z = this.n0;
        boolean z2 = sff0Var.J;
        boolean zBooleanValue = ((Boolean) ((tgk) this.E.b).i.getValue()).booleanValue();
        boolean zL = this.H.l();
        sff0 sff0Var2 = this.m0;
        boolean z3 = sff0Var2.L.e;
        q1w0 q1w0Var = sff0Var2.d;
        n9b0 n9b0Var = new n9b0(i, zBooleanValue, z, z2, zL, new hab0(this, (byte) 0), z3, q1w0Var.b, q1w0Var.c, new hab0(this, (byte) 1));
        this.A0 = n9b0Var;
        boolean z4 = !h97.A(this.f, uaq0.f35345a);
        s9b0 s9b0Var = (s9b0) this.c.a("KEY_CURRENT_TAB");
        s9b0Var = s9b0Var == null ? (s9b0) CollectionsKt.U(arrayListA) : s9b0Var;
        sff0 sff0Var3 = this.m0;
        rib0 rib0Var = sff0Var3.L;
        boolean z5 = rib0Var.b;
        mum0 mum0Var = sff0Var3.g;
        String str = mum0Var.i.f12896a;
        String str2 = mum0Var.j.f26988a;
        c4l0 c4l0Var = mum0Var.f22419a;
        boolean z6 = rib0Var.f30534a;
        boolean z7 = !this.n0;
        n4uVar2.e();
        p7m0 p7m0VarA = q7m0.a(new r9b0(z4, arrayListA, s9b0Var, z5, str, str2, c4l0Var, null, false, z7, z6));
        this.B0 = p7m0VarA;
        this.C0 = q7m0.a(new jdb0(this.t.u(), this.r.f27342a.d().r(fk60.POPULAR_OLD_OS), this.m.j() && this.k.f25751a.a(), false, false));
        byte b3 = 6;
        if (n9b0Var.a()) {
            mq5 mq5VarX = x();
            int i2 = 8;
            switch (x()) {
                case RectangleHorizontal:
                case CardHorizontal:
                case RectangleHorizontalNoTitle:
                    i2 = 3;
                    br5Var = new br5(new aq5(new up5(mq5VarX, i2)));
                    break;
                case RectangleVertical:
                case SquareS:
                case RectangleVerticalNoTitle:
                case SquareSNoTitle:
                    br5Var = new br5(new aq5(new up5(mq5VarX, i2)));
                    break;
                case SquareL:
                case SquareLNoTitle:
                    i2 = 6;
                    br5Var = new br5(new aq5(new up5(mq5VarX, i2)));
                    break;
                default:
                    t9f.b();
                    throw null;
            }
        } else {
            br5Var = zq5.f44791a;
        }
        td00 rd00Var = this.k0.f() ? pd00.f26783a : new rd00(kotlin.collections.a.c(q470.f28084a));
        sff0 sff0Var4 = this.m0;
        oz60 oz60Var = new oz60(rd00Var, sff0Var4.g.m.f25258a, sff0Var4.d.f27973a.b, this.d.b.a(R.string.popular_onex_games_game_zone, Arrays.copyOf(new Object[0], 0)), this.d.b.a(R.string.all, Arrays.copyOf(new Object[0], 0)));
        eqk0 eqk0Var = eqk0.f8242a;
        p7m0 p7m0VarA2 = q7m0.a(new n7b0(y8l0.f42202a, br5Var, oz60Var, new rd00(kotlin.collections.a.c(eqk0Var))));
        this.D0 = p7m0VarA2;
        this.E0 = new ol60(3);
        Long l2 = (Long) this.c.a("KEY_AUTH_OFFER_TIMER");
        this.F0 = l2 != null ? l2.longValue() : 0L;
        this.G0 = q7m0.a(n5b0.f22936a);
        this.H0 = q7m0.a(h9b0.f12666a);
        this.I0 = q7m0.a(p9b0.f26598a);
        this.J0 = q7m0.a(k5b0.f17712a);
        this.K0 = q7m0.a(z7b0.f43910a);
        sac.T(new fnq(this.g.f36509a.h(), new ebb0(this, yjeVar, b3), (byte) 4), d5c.S(jiu0.a(this), this.q.b), ibb0.h);
        if (((r9b0) p7m0VarA.getValue()).j || this.m0.L.f30534a) {
            sac.T(new fnq(this.j.m(), new ebb0(this, yjeVar, b2), (byte) 4), d5c.S(jiu0.a(this), this.q.b), new ebb0(this, yjeVar, (byte) 4));
        }
        sac.V(jiu0.a(this), new kma0((byte) 25), null, this.q.b, new mab0(this, yjeVar, (byte) 2), 10);
        sac.T(new fnq(new va(((qe50) this.A.b).b, (byte) 20), new xab0(this, yjeVar, (byte) 2), (byte) 4), d5c.S(jiu0.a(this), this.q.b), obb0.h);
        bby bbyVar = this.t0;
        if (bbyVar == null || !bbyVar.isActive()) {
            do {
                value = p7m0VarA2.getValue();
                n7b0Var = (n7b0) value;
            } while (!p7m0VarA2.m(value, n7b0Var.d instanceof sd00 ? n7b0Var : n7b0.a(n7b0Var, null, null, null, new rd00(kotlin.collections.a.c(eqk0Var)), 7)));
            this.t0 = sac.i0(jiu0.a(this), "PopularClassicViewModel.tryLoadSpecialEvents", 3, 3L, null, null, new xab0(this, yjeVar, (byte) 4), null, this.q.b, new gab0(this, b), null, Response.BUSY_EVERYWHERE);
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00bc A[PHI: r13
  0x00bc: PHI (r13v5 java.lang.String) = (r13v2 java.lang.String), (r13v6 java.lang.String) binds: [B:37:0x00c4, B:33:0x00b9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object A(zje zjeVar) {
        jbb0 jbb0Var;
        p7m0 p7m0Var;
        Object value;
        n7b0 n7b0Var;
        zp5 zp5Var;
        String str;
        if (zjeVar instanceof jbb0) {
            jbb0Var = (jbb0) zjeVar;
            int i = jbb0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                jbb0Var.k = i - Integer.MIN_VALUE;
            } else {
                jbb0Var = new jbb0(this, zjeVar);
            }
        } else {
            jbb0Var = new jbb0(this, zjeVar);
        }
        Object objB = jbb0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = jbb0Var.k;
        if (i2 == 0) {
            z1x.P(objB);
            mvc mvcVar = mvc.CMS_CODE_POPULAR;
            jbb0Var.k = 1;
            objB = this.L.b(mvcVar, jbb0Var);
            if (objB == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objB);
        }
        List<uvc> list = (List) objB;
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(hew0.W((uvc) it.next()));
        }
        this.p0 = arrayList;
        do {
            p7m0Var = this.D0;
            value = p7m0Var.getValue();
            n7b0Var = (n7b0) value;
            mq5 mq5VarX = x();
            this.a0.a();
            if (list.isEmpty()) {
                zp5Var = new zp5(iun.f15405a);
            } else {
                ArrayList arrayList2 = new ArrayList(r3d.q(list, 10));
                for (uvc uvcVar : list) {
                    int i3 = uvcVar.f36341a;
                    String str2 = uvcVar.c;
                    switch (mq5VarX) {
                        case RectangleHorizontal:
                        case CardHorizontal:
                        case RectangleHorizontalNoTitle:
                            str2 = uvcVar.f;
                            if (str2.length() == 0) {
                                str2 = uvcVar.b;
                            }
                            arrayList2.add(new fp5(i3, new n0x(str2), mq5VarX, uvcVar.i, uvcVar.j, null));
                            break;
                        case RectangleVertical:
                        case RectangleVerticalNoTitle:
                            str = uvcVar.e;
                            if (str.length() != 0) {
                                str2 = str;
                            }
                            arrayList2.add(new fp5(i3, new n0x(str2), mq5VarX, uvcVar.i, uvcVar.j, null));
                            break;
                        case SquareL:
                        case SquareS:
                        case SquareLNoTitle:
                        case SquareSNoTitle:
                            str = uvcVar.g;
                            if (str.length() != 0) {
                                str2 = str;
                            }
                            arrayList2.add(new fp5(i3, new n0x(str2), mq5VarX, uvcVar.i, uvcVar.j, null));
                            break;
                        default:
                            t9f.b();
                            return null;
                    }
                }
                zp5Var = new zp5(arrayList2);
            }
        } while (!p7m0Var.m(value, n7b0.a(n7b0Var, null, new cr5(zp5Var), null, null, 13)));
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00ba A[PHI: r13
  0x00ba: PHI (r13v5 java.lang.String) = (r13v2 java.lang.String), (r13v6 java.lang.String) binds: [B:37:0x00c2, B:33:0x00b7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object B(zje zjeVar) {
        kbb0 kbb0Var;
        p7m0 p7m0Var;
        Object value;
        n7b0 n7b0Var;
        zp5 zp5Var;
        String str;
        if (zjeVar instanceof kbb0) {
            kbb0Var = (kbb0) zjeVar;
            int i = kbb0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                kbb0Var.k = i - Integer.MIN_VALUE;
            } else {
                kbb0Var = new kbb0(this, zjeVar);
            }
        } else {
            kbb0Var = new kbb0(this, zjeVar);
        }
        Object objA = kbb0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = kbb0Var.k;
        if (i2 == 0) {
            z1x.P(objA);
            kbb0Var.k = 1;
            objA = this.K.a(kbb0Var);
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
        List<kr5> list = (List) objA;
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(hew0.V((kr5) it.next()));
        }
        this.p0 = arrayList;
        do {
            p7m0Var = this.D0;
            value = p7m0Var.getValue();
            n7b0Var = (n7b0) value;
            mq5 mq5VarX = x();
            this.a0.a();
            if (list.isEmpty()) {
                zp5Var = new zp5(iun.f15405a);
            } else {
                ArrayList arrayList2 = new ArrayList(r3d.q(list, 10));
                for (kr5 kr5Var : list) {
                    int i3 = kr5Var.b;
                    String str2 = kr5Var.g;
                    switch (mq5VarX) {
                        case RectangleHorizontal:
                        case CardHorizontal:
                        case RectangleHorizontalNoTitle:
                            str2 = kr5Var.k;
                            if (str2.length() == 0) {
                                str2 = kr5Var.f;
                            }
                            arrayList2.add(new fp5(i3, new n0x(str2), mq5VarX, kr5Var.o, kr5Var.q, null));
                            break;
                        case RectangleVertical:
                        case RectangleVerticalNoTitle:
                            str = kr5Var.j;
                            if (str.length() != 0) {
                                str2 = str;
                            }
                            arrayList2.add(new fp5(i3, new n0x(str2), mq5VarX, kr5Var.o, kr5Var.q, null));
                            break;
                        case SquareL:
                        case SquareS:
                        case SquareLNoTitle:
                        case SquareSNoTitle:
                            str = kr5Var.h;
                            if (str.length() != 0) {
                                str2 = str;
                            }
                            arrayList2.add(new fp5(i3, new n0x(str2), mq5VarX, kr5Var.o, kr5Var.q, null));
                            break;
                        default:
                            t9f.b();
                            return null;
                    }
                }
                zp5Var = new zp5(arrayList2);
            }
        } while (!p7m0Var.m(value, n7b0.a(n7b0Var, null, new cr5(zp5Var), null, null, 13)));
        return Unit.f46060a;
    }

    public final void C() {
        this.u0 = sac.i0(jiu0.a(this), "PopularClassicViewModel.tryLoadOneXGamesTape", 3, 3L, kotlin.collections.a.c(vub0.class), null, new lbb0(this, null, (byte) 0), null, this.q.b, new e9b0(1, this, sbb0.class, "handleOneXGameError", "handleOneXGameError(Ljava/lang/Throwable;)V", 0, (byte) 1), null, 592);
    }

    public final void D(y7b0 y7b0Var) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        y7b0Var.getClass();
        if (y7b0Var.equals(v7b0.f36916a)) {
            return;
        }
        boolean zEquals = y7b0Var.equals(t7b0.f33459a);
        p7m0 p7m0Var = this.C0;
        if (zEquals) {
            do {
                value4 = p7m0Var.getValue();
            } while (!p7m0Var.m(value4, jdb0.a((jdb0) value4, false, false, false, false, false, 7)));
            return;
        }
        if (y7b0Var.equals(u7b0.f35177a)) {
            ((q7d0) this.n.f1155a).d("KZ_GREETING_SHOWED", true);
            do {
                value3 = p7m0Var.getValue();
            } while (!p7m0Var.m(value3, jdb0.a((jdb0) value3, false, false, false, false, false, 11)));
        } else if (y7b0Var.equals(w7b0.f38664a)) {
            do {
                value2 = p7m0Var.getValue();
            } while (!p7m0Var.m(value2, jdb0.a((jdb0) value2, false, false, false, false, false, 13)));
        } else {
            if (!y7b0Var.equals(x7b0.f40405a)) {
                t9f.b();
                return;
            }
            ((of6) this.u.f30839a).f25150a.d("SHOW_BOTTOM_SHEET", false);
            do {
                value = p7m0Var.getValue();
            } while (!p7m0Var.m(value, jdb0.a((jdb0) value, false, false, false, false, false, 14)));
        }
    }

    public final void E() {
        bby bbyVar = this.q0;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.q0 = sac.V(jiu0.a(this), new gab0(this, (byte) 4), null, this.q.c, new mab0(this, null, (byte) 7), 10);
        }
    }

    public final void F(xjb0 xjb0Var, String str) {
        amb0 amb0Var = amb0.TOP;
        iij iijVar = this.N;
        gg5 gg5Var = (gg5) iijVar.g;
        oeg0 oeg0Var = (oeg0) iijVar.f;
        zg zgVar = (zg) iijVar.d;
        if (!(xjb0Var instanceof ujb0)) {
            if (xjb0Var instanceof vjb0) {
                zgVar.k(-1L);
                ((u58) iijVar.c).f35083a.a("main_filter_call", wp20.b(new Pair("settings", "Filter")));
                oeg0Var.c().d(new yr80(iijVar, (byte) 28));
                return;
            } else {
                if (!(xjb0Var instanceof wjb0)) {
                    t9f.b();
                    return;
                }
                long j = ((wjb0) xjb0Var).f39254a;
                zgVar.k(j);
                gg5Var.q(String.valueOf(j), "popular_new_top");
                oeg0Var.c().d(new qi4((Object) iijVar, j, (byte) 14));
                return;
            }
        }
        zgVar.c();
        gg5Var.q("all", "popular_new_top");
        i1w0 i1w0VarC = oeg0Var.c();
        i1w0VarC.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        FragmentScreen fragmentScreenA = ((vjp) iijVar.e).a(j700.b);
        if (fragmentScreenA instanceof DialogScreen) {
            copyOnWriteArrayList.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) fragmentScreenA)));
        } else {
            copyOnWriteArrayList.add(new c8d(y7d.f42146a, new w0w0(fragmentScreenA)));
        }
        ListIterator listIteratorO = b1j.o(i1w0VarC, copyOnWriteArrayList, 0);
        while (true) {
            paw pawVar = (paw) listIteratorO;
            if (!pawVar.hasNext()) {
                return;
            } else {
                i1w0VarC.a((oe50) pawVar.next());
            }
        }
    }

    public final void G(int i, String str) {
        Object value;
        p7m0 p7m0Var = this.B0;
        s9b0 s9b0Var = (s9b0) ((r9b0) p7m0Var.getValue()).b.get(i);
        if (s9b0Var == ((r9b0) p7m0Var.getValue()).c) {
            return;
        }
        this.c.e("KEY_CURRENT_TAB", s9b0Var);
        do {
            value = p7m0Var.getValue();
        } while (!p7m0Var.m(value, r9b0.a((r9b0) value, false, s9b0Var, null, false, 4091)));
        sac.V(jiu0.a(this), qbb0.f28440a, null, this.q.c, new s980(this, s9b0Var, null, (byte) 26), 10);
    }

    public final void H() {
        c4m0 c4m0Var = this.x0;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            this.x0 = sac.T(bkb.h0(1L, TimeUnit.SECONDS, new xab0(this, null, (byte) 3)), jiu0.a(this), rbb0.h);
        }
    }

    public final void I() {
        Object g0g0Var;
        try {
            e0g0 e0g0Var = j0g0.b;
            this.p.Z(false);
            g0g0Var = Unit.f46060a;
        } catch (Throwable th) {
            e0g0 e0g0Var2 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        Throwable thA = j0g0.a(g0g0Var);
        if (thA != null) {
            thA.printStackTrace();
        }
    }

    @Override // a.etr
    public final void b(kia kiaVar) {
        this.O.b(kiaVar);
    }

    @Override // a.etr
    public final void c(mia miaVar) {
        this.O.c(miaVar);
    }

    @Override // a.etr
    public final void d(oia oiaVar) {
        this.O.d(oiaVar);
    }

    @Override // a.f0s
    public final void e(zxj0 zxj0Var, m0k0 m0k0Var) {
        this.O.e(zxj0Var, m0k0Var);
    }

    @Override // a.f0s
    public final gmq h() {
        return this.O.B;
    }

    @Override // a.etr
    public final void i(iia iiaVar) {
        this.O.i(iiaVar);
    }

    @Override // a.f0s
    public final void j() {
        this.O.j();
    }

    @Override // a.etr
    public final void k(nia niaVar) {
        this.O.k(niaVar);
    }

    @Override // a.f0s
    public final ol60 l() {
        return this.O.A;
    }

    @Override // a.etr
    public final void m(oia oiaVar) {
        this.O.m(oiaVar);
    }

    @Override // a.f0s
    public final void n(m0k0 m0k0Var, m97 m97Var, boolean z) {
        this.O.n(m0k0Var, m97Var, z);
    }

    @Override // a.etr
    public final void o(lia liaVar) {
        this.O.o(liaVar);
    }

    @Override // a.f0s
    public final void q(zxj0 zxj0Var, m0k0 m0k0Var) {
        this.O.q(zxj0Var, m0k0Var);
    }

    @Override // a.etr
    public final void r(iia iiaVar) {
        l0s l0sVar = this.O;
        l0sVar.getClass();
        l0sVar.v(iiaVar, ctc.b);
    }

    @Override // a.w3k, a.diu0
    public final void v() {
        super.v();
        d5c.G(this.o0, null);
        c4m0 c4m0Var = this.v0;
        if (c4m0Var != null) {
            c4m0Var.cancel(null);
        }
        c4m0 c4m0Var2 = this.x0;
        if (c4m0Var2 != null) {
            c4m0Var2.cancel(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object w(zje zjeVar) {
        lab0 lab0Var;
        Object g0g0Var;
        if (zjeVar instanceof lab0) {
            lab0Var = (lab0) zjeVar;
            int i = lab0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                lab0Var.k = i - Integer.MIN_VALUE;
            } else {
                lab0Var = new lab0(this, zjeVar);
            }
        } else {
            lab0Var = new lab0(this, zjeVar);
        }
        Object obj = lab0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = lab0Var.k;
        try {
            if (i2 == 0) {
                z1x.P(obj);
                e0g0 e0g0Var = j0g0.b;
                o3c o3cVar = this.i0;
                lab0Var.k = 1;
                if (o3c.p(o3cVar, false, lab0Var, 3) == wneVar) {
                    return wneVar;
                }
            } else {
                if (i2 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
            }
            g0g0Var = Unit.f46060a;
            e0g0 e0g0Var2 = j0g0.b;
        } catch (Throwable th) {
            e0g0 e0g0Var3 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        Throwable thA = j0g0.a(g0g0Var);
        if (thA != null) {
            z(thA);
        }
        return Boolean.valueOf(!(g0g0Var instanceof g0g0));
    }

    public final mq5 x() {
        switch (this.m0.b.e) {
            case SQUARE_S:
                return mq5.SquareS;
            case SQUARE_S_NO_TITLE:
                return mq5.SquareSNoTitle;
            case SQUARE_L:
                return mq5.SquareL;
            case SQUARE_L_NO_TITLE:
                return mq5.SquareLNoTitle;
            case RECTANGLE_VERTICAL:
                return mq5.RectangleVertical;
            case RECTANGLE_VERTICAL_NO_TITLE:
                return mq5.RectangleVerticalNoTitle;
            case RECTANGLE_HORIZONTAL:
                return mq5.RectangleHorizontal;
            case RECTANGLE_HORIZONTAL_NO_TITLE:
                return mq5.RectangleHorizontalNoTitle;
            case CARD_HORIZONTAL:
                return mq5.CardHorizontal;
            default:
                t9f.b();
                return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object y(zje zjeVar) {
        cbb0 cbb0Var;
        if (zjeVar instanceof cbb0) {
            cbb0Var = (cbb0) zjeVar;
            int i = cbb0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                cbb0Var.k = i - Integer.MIN_VALUE;
            } else {
                cbb0Var = new cbb0(this, zjeVar);
            }
        } else {
            cbb0Var = new cbb0(this, zjeVar);
        }
        Object objK = cbb0Var.i;
        Object obj = wne.f39444a;
        int i2 = cbb0Var.k;
        if (i2 == 0) {
            z1x.P(objK);
            cbb0Var.k = 1;
            objK = lbu.k(this.B, 0, cbb0Var, 3);
            if (objK == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objK);
        }
        Iterable iterable = (Iterable) objK;
        ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(new mz60((pbv) it.next(), this.C.a()));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            mz60 mz60Var = (mz60) obj2;
            if (x1x.D(mz60Var.b) != s470.LUCKY_WHEEL.a() && mz60Var.f && !mz60Var.e) {
                arrayList2.add(obj2);
            }
        }
        return CollectionsKt.D0(arrayList2, 15);
    }

    public final void z(Throwable th) {
        p7m0 p7m0Var;
        Object value;
        n7b0 n7b0Var;
        oz60 oz60Var;
        td00 td00Var;
        sff0 sff0Var;
        th.printStackTrace();
        do {
            p7m0Var = this.D0;
            value = p7m0Var.getValue();
            n7b0Var = (n7b0) value;
            oz60Var = n7b0Var.c;
            td00Var = this.k0.f() ? pd00.f26783a : qd00.f28510a;
            sff0Var = this.m0;
        } while (!p7m0Var.m(value, n7b0.a(n7b0Var, null, null, oz60.a(oz60Var, td00Var, sff0Var.g.m.f25258a, sff0Var.d.f27973a.b, 24), null, 11)));
    }
}

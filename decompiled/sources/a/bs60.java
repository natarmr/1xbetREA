package a;

import android.javax.sip.message.Response;
import android.os.Bundle;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.core.navigation.dialog.DialogScreen;
import org.xplatform.games_list.features.common.OneXGamesScreens$OneXGamesAllGamesFilterScreen;

/* JADX INFO: loaded from: classes4.dex */
public final class bs60 extends i3t0 {
    public static final /* synthetic */ int h0 = 0;
    public final ouu A;
    public final ctf0 B;
    public final duj C;
    public final mne D;
    public final v88 E;
    public final m1e F;
    public final hnu G;
    public final pru H;
    public final b8u I;
    public final lqc J;
    public final lqc K;
    public final foi0 L;
    public final ali M;
    public final nr N;
    public final yuu O;
    public final x4u P;
    public final dmt Q;
    public final l570 R;
    public final jtj S;
    public final kyg0 T;
    public final g2v U;
    public final c4m0 V;
    public c4m0 W;
    public c4m0 X;
    public c4m0 Y;
    public c4m0 Z;
    public bby a0;
    public bby b0;
    public c4m0 c0;
    public bby d0;
    public u270 e0;
    public final p7m0 f0;
    public final p7m0 g0;
    public final Bundle o;
    public final ih5 p;
    public final s31 q;
    public final l7k r;
    public final cmt s;
    public final cyu t;
    public final hs60 u;
    public final gw60 v;
    public final wsf0 w;
    public final nn60 x;
    public final oeg0 y;
    public final i1w0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bs60(Bundle bundle, ih5 ih5Var, s31 s31Var, l7k l7kVar, cmt cmtVar, cyu cyuVar, hs60 hs60Var, gw60 gw60Var, wsf0 wsf0Var, nn60 nn60Var, oeg0 oeg0Var, i1w0 i1w0Var, ouu ouuVar, ctf0 ctf0Var, duj dujVar, mne mneVar, v88 v88Var, m1e m1eVar, hnu hnuVar, pru pruVar, b8u b8uVar, lqc lqcVar, lqc lqcVar2, foi0 foi0Var, ali aliVar, nr nrVar, yuu yuuVar, x4u x4uVar, jqt jqtVar, dmt dmtVar, l570 l570Var, jtj jtjVar, kyg0 kyg0Var, g2v g2vVar) {
        Object value;
        super(null, new ck60(pruVar, ctf0Var, bundle, (byte) 3), new v510(ctf0Var, (byte) 23), cvm0.p(mneVar.c, mneVar.b), null);
        oeg0Var.getClass();
        ctf0Var.getClass();
        m1eVar.getClass();
        this.o = bundle;
        this.p = ih5Var;
        this.q = s31Var;
        this.r = l7kVar;
        this.s = cmtVar;
        this.t = cyuVar;
        this.u = hs60Var;
        this.v = gw60Var;
        this.w = wsf0Var;
        this.x = nn60Var;
        this.y = oeg0Var;
        this.z = i1w0Var;
        this.A = ouuVar;
        this.B = ctf0Var;
        this.C = dujVar;
        this.D = mneVar;
        this.E = v88Var;
        this.F = m1eVar;
        this.G = hnuVar;
        this.H = pruVar;
        this.I = b8uVar;
        this.J = lqcVar;
        this.K = lqcVar2;
        this.L = foi0Var;
        this.M = aliVar;
        this.N = nrVar;
        this.O = yuuVar;
        this.P = x4uVar;
        this.Q = dmtVar;
        this.R = l570Var;
        this.S = jtjVar;
        this.T = kyg0Var;
        this.U = g2vVar;
        kat katVar = kat.f17982a;
        this.f0 = q7m0.a(katVar);
        this.g0 = q7m0.a(katVar);
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
        } while (!p7m0Var.m(value, w370.a((w370) value, true, false, null, null, null, null, null, false, false, false, false, 16382)));
        byte b = 0;
        R(false);
        c4m0 c4m0Var = this.V;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            this.V = i3t0.L(this, new fnq(jqtVar.a(), new fr60(this, null, b), (byte) 4), null, null, 3);
        }
    }

    public static void T(bs60 bs60Var, boolean z, Integer num) {
        String str = ((w370) bs60Var.D()).d.e;
        p7m0 p7m0Var = bs60Var.g0;
        e3c.n(bs60Var.Y);
        p7m0 p7m0Var2 = bs60Var.f0;
        pat patVar = (pat) p7m0Var2.getValue();
        patVar.getClass();
        if (patVar instanceof kat) {
            pat patVar2 = (pat) p7m0Var.getValue();
            patVar2.getClass();
            if (patVar2 instanceof kat) {
                bs60Var.G(l370.f19346a);
            }
        }
        int iIntValue = num.intValue();
        byte b = 1;
        byte b2 = 4;
        bs60Var.Y = slb.U(ulb.L(new dnq(new fnq(new fnq(new jr60(new p6d(p7m0Var2, p7m0Var, or60.h, b), bs60Var, (byte) 1), new st20(2, null, (byte) 8), b2), new p4m(bs60Var, str, z, iIntValue, (yje) null), b2), new wx4(bs60Var, str, (yje) null), b), bs60Var.D.b), jiu0.a(bs60Var));
    }

    public final u270 M(String str) {
        zd70 zd70Var;
        int iB = this.G.b();
        String string = StringsKt.u0(str).toString();
        Integer numValueOf = Integer.valueOf(iB);
        w270 w270Var = null;
        if (iB <= 0) {
            numValueOf = null;
        }
        List listC = numValueOf != null ? kotlin.collections.a.c(Integer.valueOf(numValueOf.intValue())) : null;
        qg40 qg40VarC = this.I.c();
        qg40VarC.getClass();
        m4s.d.getClass();
        int iOrdinal = ddk.p(qg40VarC).ordinal();
        if (iOrdinal == 0) {
            zd70Var = null;
        } else if (iOrdinal == 1) {
            zd70Var = zd70.f44200a;
        } else if (iOrdinal == 2) {
            zd70Var = zd70.b;
        } else {
            if (iOrdinal != 3) {
                t9f.b();
                return null;
            }
            zd70Var = zd70.c;
        }
        byte b = ((my60) ((uyn) this.P.f40284a).f36498a).f22591a;
        urs.d.getClass();
        int iOrdinal2 = xak.p(b).ordinal();
        if (iOrdinal2 != 0) {
            if (iOrdinal2 == 1) {
                w270Var = w270.b;
            } else if (iOrdinal2 == 2) {
                w270Var = w270.c;
            } else {
                if (iOrdinal2 != 3) {
                    t9f.b();
                    return null;
                }
                w270Var = w270.f38437a;
            }
        }
        return new u270(string, listC, zd70Var, w270Var);
    }

    public final void N() {
        v3c.N(this.R.h);
        c4m0 c4m0Var = this.W;
        if (c4m0Var != null) {
            c4m0Var.cancel(null);
        }
        c4m0 c4m0Var2 = this.X;
        if (c4m0Var2 != null) {
            c4m0Var2.cancel(null);
        }
        c4m0 c4m0Var3 = this.Y;
        if (c4m0Var3 != null) {
            c4m0Var3.cancel(null);
        }
        c4m0 c4m0Var4 = this.Z;
        if (c4m0Var4 != null) {
            c4m0Var4.cancel(null);
        }
        bby bbyVar = this.a0;
        if (bbyVar != null) {
            bbyVar.cancel(null);
        }
        bby bbyVar2 = this.b0;
        if (bbyVar2 != null) {
            bbyVar2.cancel(null);
        }
        c4m0 c4m0Var5 = this.c0;
        if (c4m0Var5 != null) {
            c4m0Var5.cancel(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0062, code lost:
    
        if (r8 == r1) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object O(java.lang.String r7, a.zje r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof a.dr60
            if (r0 == 0) goto L13
            r0 = r8
            a.dr60 r0 = (a.dr60) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            a.dr60 r0 = new a.dr60
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.j
            a.wne r1 = a.wne.f39444a
            int r2 = r0.l
            r3 = 0
            r4 = 1
            r5 = 2
            if (r2 == 0) goto L37
            if (r2 == r4) goto L33
            if (r2 != r5) goto L2d
            java.lang.String r7 = r0.i
            a.z1x.P(r8)
            goto L65
        L2d:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r6)
            return r3
        L33:
            a.z1x.P(r8)
            return r8
        L37:
            a.z1x.P(r8)
            boolean r8 = r6.X(r7)
            if (r8 == 0) goto L52
            a.u270 r7 = r6.M(r7)
            r0.i = r3
            r0.l = r4
            a.yuu r6 = r6.O
            java.io.Serializable r6 = r6.o(r7, r0)
            if (r6 != r1) goto L51
            goto L64
        L51:
            return r6
        L52:
            a.hnu r8 = r6.G
            int r8 = r8.b()
            r0.i = r7
            r0.l = r5
            a.nr r6 = r6.N
            java.io.Serializable r8 = r6.r(r8, r0)
            if (r8 != r1) goto L65
        L64:
            return r1
        L65:
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r8 = r8.iterator()
        L70:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto Lb1
            java.lang.Object r0 = r8.next()
            r1 = r0
            a.pbv r1 = (a.pbv) r1
            int r2 = r7.length()
            if (r2 != 0) goto L84
            goto La9
        L84:
            java.lang.String r2 = r1.c
            java.util.Locale r3 = java.util.Locale.getDefault()
            r3.getClass()
            java.lang.String r2 = r2.toLowerCase(r3)
            r2.getClass()
            java.util.Locale r3 = java.util.Locale.getDefault()
            r3.getClass()
            java.lang.String r3 = r7.toLowerCase(r3)
            r3.getClass()
            r4 = 0
            boolean r2 = kotlin.text.StringsKt.O(r2, r3, r4)
            if (r2 == 0) goto L70
        La9:
            boolean r1 = r1.q
            if (r1 == 0) goto L70
            r6.add(r0)
            goto L70
        Lb1:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a.bs60.O(java.lang.String, a.zje):java.lang.Object");
    }

    public final void P(Throwable th) {
        if (th instanceof bun) {
            Z();
            return;
        }
        if ((th instanceof SocketTimeoutException) || (th instanceof UnknownHostException)) {
            if (((w370) D()).k) {
                return;
            }
            Y();
        } else {
            if (th instanceof j7t0) {
                return;
            }
            this.C.b(th, new cr60((byte) 1));
        }
    }

    public final void Q(String str) {
        Object value;
        w370 w370Var;
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            w370Var = (w370) value;
            this.f.getClass();
        } while (!p7m0Var.m(value, w370.a(w370Var, false, false, null, rc50.a(w370Var.d, false, false, false, str, 47), null, null, null, false, false, false, false, 16375)));
        boolean z = this.H.a().W1;
        mne mneVar = this.D;
        yje yjeVar = null;
        if (!z || StringsKt.u0(str).toString().length() == 1) {
            e3c.n(this.d0);
            bvc bvcVarA = jiu0.a(this);
            dvj dvjVar = mneVar.b;
            byte b = 0;
            this.d0 = sac.V(bvcVarA, new br60(this, b), null, dvjVar, new er60(this, str, yjeVar, b), 10);
            return;
        }
        String string = StringsKt.u0(str).toString();
        if (X(str)) {
            this.e0 = M(str);
        } else {
            this.e0 = null;
        }
        sac.V(jiu0.a(this), new jl40((Object) string, (Object) this, (Object) str, (byte) 13), null, mneVar.b, new j940(this, str, yjeVar, (byte) 29), 10);
    }

    public final void R(boolean z) {
        e3c.n(this.Z);
        p7m0 p7m0Var = this.f0;
        pat patVar = (pat) p7m0Var.getValue();
        patVar.getClass();
        boolean z2 = patVar instanceof kat;
        p7m0 p7m0Var2 = this.g0;
        if (z2) {
            pat patVar2 = (pat) p7m0Var2.getValue();
            patVar2.getClass();
            if (patVar2 instanceof kat) {
                G(l370.f19346a);
            }
        }
        byte b = 1;
        yje yjeVar = null;
        this.Z = slb.U(ulb.L(new dnq(new fnq(new jr60(new p6d(p7m0Var, p7m0Var2, kr60.h, b), this, (byte) 0), new ys8((Object) this, z, yjeVar, (byte) 25), (byte) 4), new gbv(this, yjeVar, (byte) 10), b), this.D.b), jiu0.a(this));
    }

    /* JADX WARN: Code duplicated, block: B:28:0x008f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object S(String str, zje zjeVar) {
        lr60 lr60Var;
        boolean z;
        Object value;
        w370 w370Var;
        String str2 = str;
        if (zjeVar instanceof lr60) {
            lr60Var = (lr60) zjeVar;
            int i = lr60Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                lr60Var.l = i - Integer.MIN_VALUE;
            } else {
                lr60Var = new lr60(this, zjeVar);
            }
        } else {
            lr60Var = new lr60(this, zjeVar);
        }
        Object objO = lr60Var.j;
        Object obj = wne.f39444a;
        int i2 = lr60Var.l;
        if (i2 == 0) {
            z1x.P(objO);
            lr60Var.i = str2;
            lr60Var.l = 1;
            objO = O(str2, lr60Var);
            if (objO == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str2 = lr60Var.i;
            z1x.P(objO);
        }
        List list = (List) objO;
        if (!Intrinsics.d(StringsKt.u0(str2).toString(), StringsKt.u0(((w370) D()).d.e).toString())) {
            return Unit.f46060a;
        }
        if (!list.isEmpty()) {
            pat patVar = (pat) this.f0.getValue();
            patVar.getClass();
            if (!(patVar instanceof oat)) {
                pat patVar2 = (pat) this.g0.getValue();
                patVar2.getClass();
                z = patVar2 instanceof oat ? false : true;
            }
        }
        W(z);
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            w370Var = (w370) value;
            this.f.getClass();
        } while (!p7m0Var.m(value, w370.a(w370Var, false, false, null, null, null, tdt.a(w370Var.f, list, null, null, 0, 0, 30), null, false, false, false, false, 16351)));
        if (str2.length() == 0 && ((w370) D()).f.b != null) {
            G(n370.f22836a);
        }
        return Unit.f46060a;
    }

    public final void U() {
        if (((w370) D()).l) {
            c4m0 c4m0Var = this.X;
            yje yjeVar = null;
            if (c4m0Var != null) {
                c4m0Var.cancel(null);
            }
            byte b = 1;
            xu3 xu3Var = new xu3(new p6d(this.f0, this.g0, sr60.h, b), (byte) 5);
            st20 st20Var = new st20(2, yjeVar, (byte) 9);
            byte b2 = 4;
            fnq fnqVar = new fnq(xu3Var, st20Var, b2);
            byte b3 = 0;
            tr60 tr60Var = new tr60(this, yjeVar, b3);
            int i = aoq.f1214a;
            this.X = sac.T(new dnq(new fnq(new i89(new fnq(fnqVar, tr60Var, (byte) 3), (byte) 21), new ur60(this, yjeVar, b3), b2), new qos((Object) this, yjeVar, (byte) 23), b), d5c.S(jiu0.a(this), this.D.b), foe.h);
        }
    }

    public final void V(int i, List list, boolean z) {
        Object value;
        boolean z2 = (this.I.c().f28665a == 0 && (i == 0 || i == -1)) ? false : true;
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
        } while (!p7m0Var.m(value, w370.a((w370) value, false, false, null, null, null, null, new f3b(z2, Integer.valueOf(i), dyb.o0(list)), false, false, false, false, 16318)));
        T(this, z, Integer.valueOf(i));
    }

    public final void W(boolean z) {
        Object value;
        Object value2;
        boolean z2 = ((w370) D()).i;
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        if (z) {
            p7m0 p7m0Var = ocjVar.f25029a;
            do {
                value2 = p7m0Var.getValue();
                value2.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var.m(value2, w370.a((w370) value2, false, false, null, null, null, null, null, false, false, false, false, 16377)));
            return;
        }
        if (!z2) {
            Y();
            return;
        }
        if (((w370) D()).d.e.length() <= 0) {
            Z();
            return;
        }
        if (((w370) D()).b) {
            return;
        }
        mdm mdmVarB = g2v.b(this.U, pb10.e, null, null, 0, 0, R.string.nothing_found, 0, 0, 0L, 0L, 734);
        p7m0 p7m0Var2 = ocjVar.f25029a;
        do {
            value = p7m0Var2.getValue();
            value.getClass();
            oyg0Var.getClass();
        } while (!p7m0Var2.m(value, w370.a((w370) value, false, false, mdmVarB, null, null, null, null, false, false, false, false, 16379)));
    }

    public final boolean X(String str) {
        return this.H.a().W1 && StringsKt.u0(str).toString().length() >= 2;
    }

    public final void Y() {
        Object value;
        mdm mdmVarB = g2v.b(this.U, pb10.g, null, null, 0, 0, R.string.data_retrieval_error, 0, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE);
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
        } while (!p7m0Var.m(value, w370.a((w370) value, false, false, mdmVarB, null, null, null, null, false, false, false, false, 16377)));
    }

    public final void Z() {
        Object value;
        mdm mdmVarB = g2v.b(this.U, pb10.g, null, null, 0, 0, R.string.data_empty_games_error, 0, 0, 0L, 0L, 734);
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
        } while (!p7m0Var.m(value, w370.a((w370) value, false, false, mdmVarB, null, null, null, null, false, false, false, false, 16377)));
    }

    public final void a0() {
        Object value;
        mdm mdmVarB = g2v.b(this.U, pb10.r1, pdm.b, null, R.drawable.ic_glyph_circle_technical_works, 0, R.string.games_section_technical_works_descr, 0, R.string.continue_action, 0L, 0L, 852);
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
        } while (!p7m0Var.m(value, w370.a((w370) value, false, true, mdmVarB, null, null, null, new f3b(), false, false, false, false, 16313)));
    }

    public final void b0() {
        if (((w370) D()).h == 0 && ((w370) D()).l) {
            bby bbyVar = this.a0;
            yje yjeVar = null;
            if (bbyVar != null) {
                bbyVar.cancel(null);
            }
            this.a0 = sac.V(jiu0.a(this), new jw50(1, this.C, duj.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 22), null, this.D.b, new fr60(this, yjeVar, (byte) 3), 10);
        }
    }

    @Override // a.diu0
    public final void v() {
        my60 my60Var = (my60) this.J.f20481a.f36498a;
        my60Var.b = qg40.c;
        my60Var.f22591a = (byte) 0;
        my60Var.c = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        w370 w370Var;
        Object value2;
        w370 w370Var2;
        Object value3;
        w370 w370Var3;
        Object value4;
        w370 w370Var4;
        tdt tdtVar;
        Object value5;
        w370 w370Var5;
        tdt tdtVar2;
        boolean z;
        Object value6;
        w370 w370Var6;
        Object value7;
        w370 w370Var7;
        dvj dvjVar;
        vp60 vp60Var = (vp60) obj;
        vp60Var.getClass();
        super.x(vp60Var);
        boolean z2 = vp60Var instanceof pp60;
        byte b = 2;
        nn60 nn60Var = this.x;
        p7m0 p7m0Var = this.g0;
        p7m0 p7m0Var2 = this.f0;
        mne mneVar = this.D;
        byte b2 = 0;
        byte b3 = 1;
        Object obj2 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        if (z2) {
            i3t0.B(this, nn60Var, new en60[]{new wm60(zn60.OneXAll)});
            bby bbyVar = this.b0;
            if (bbyVar != null) {
                bbyVar.cancel(null);
            }
            this.b0 = i3t0.F(this, this.x, null, null, new cr60(b2), 119);
            c4m0 c4m0Var = this.W;
            if (c4m0Var != null) {
                c4m0Var.cancel(null);
            }
            byte b4 = 4;
            dnq dnqVar = new dnq(new fnq(this.F.b(), new fr60(this, objArr6 == true ? 1 : 0, b3), b4), new pr60(3, objArr5 == true ? 1 : 0, b2), b3);
            bvc bvcVarA = jiu0.a(this);
            dvj dvjVar2 = mneVar.b;
            this.W = sac.T(dnqVar, d5c.S(bvcVarA, dvjVar2), foe.h);
            U();
            b0();
            if (((w370) D()).k) {
                sac.V(jiu0.a(this), as60.f1377a, null, dvjVar2, new tr60(this, objArr4 == true ? 1 : 0, b), 10);
                dvjVar = dvjVar2;
                R(true);
                U();
            } else {
                dvjVar = dvjVar2;
            }
            this.c0 = slb.U(ulb.L(new fnq(new xu3(new p6d(p7m0Var2, p7m0Var, zr60.h, b3), (byte) 6), new ur60(this, objArr3 == true ? 1 : 0, b3), b4), dvjVar), jiu0.a(this));
            return;
        }
        if (vp60Var instanceof op60) {
            N();
            return;
        }
        if (vp60Var instanceof bp60) {
            i1w0 i1w0VarC = this.y.c();
            CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0VarC);
            ListIterator listIteratorP = rz4.p(wez.b, rz4.g(copyOnWriteArrayListQ, new c8d(y7d.f42146a, n0w0.f22721a)), i1w0VarC, copyOnWriteArrayListQ, 0);
            while (true) {
                paw pawVar = (paw) listIteratorP;
                if (!pawVar.hasNext()) {
                    return;
                } else {
                    i1w0VarC.a((oe50) pawVar.next());
                }
            }
        } else {
            if (vp60Var instanceof cp60) {
                sac.V(jiu0.a(this), wr60.f39624a, null, mneVar.f22085a, new tr60(this, objArr2 == true ? 1 : 0, b3), 10);
                return;
            }
            boolean z3 = vp60Var instanceof np60;
            p0w0 p0w0Var = p0w0.f26173a;
            i1w0 i1w0Var = this.z;
            if (!z3) {
                boolean z4 = vp60Var instanceof sp60;
                oyg0 oyg0Var = this.f;
                ocj ocjVar = this.i;
                if (z4) {
                    ql5 ql5Var = ((sp60) vp60Var).f32576a;
                    long j = ql5Var.f28916a;
                    p7m0 p7m0Var3 = ocjVar.f25029a;
                    do {
                        value7 = p7m0Var3.getValue();
                        value7.getClass();
                        w370Var7 = (w370) value7;
                        oyg0Var.getClass();
                    } while (!p7m0Var3.m(value7, w370.a(w370Var7, false, false, null, rc50.a(w370Var7.d, false, false, false, null, 55), null, null, null, false, false, false, false, 16375)));
                    this.T.a(j);
                    wsf0 wsf0Var = this.w;
                    ot otVarB = wsf0Var.b();
                    bm5 bm5Var = bm5.d;
                    otVarB.a(bm5Var, ql5Var);
                    wsf0Var.q().f17359a.z(bm5Var, j);
                    b0();
                    return;
                }
                if (vp60Var instanceof lp60) {
                    p7m0 p7m0Var4 = ocjVar.f25029a;
                    do {
                        value6 = p7m0Var4.getValue();
                        value6.getClass();
                        w370Var6 = (w370) value6;
                        oyg0Var.getClass();
                    } while (!p7m0Var4.m(value6, w370.a(w370Var6, false, false, null, rc50.a(w370Var6.d, false, false, false, null, 55), null, null, null, false, false, false, false, 16375)));
                    this.p.f(k7k.OneXAll);
                    y1p y1pVar = y1p.MAIN;
                    this.r.b("games_all", this.s.g());
                    sac.V(jiu0.a(this), vr60.f37883a, null, mneVar.b, new fr60(this, objArr == true ? 1 : 0, b), 10);
                    return;
                }
                if (vp60Var instanceof jp60) {
                    CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0Var);
                    ListIterator listIteratorP2 = b1j.p(copyOnWriteArrayListQ2, new c8d(y7d.f42146a, p0w0Var), i1w0Var, copyOnWriteArrayListQ2, 0);
                    while (true) {
                        paw pawVar2 = (paw) listIteratorP2;
                        if (!pawVar2.hasNext()) {
                            return;
                        } else {
                            i1w0Var.a((oe50) pawVar2.next());
                        }
                    }
                } else {
                    if (vp60Var instanceof ep60) {
                        long j2 = ((ep60) vp60Var).f8172a;
                        List list = ((w370) D()).f.c;
                        if (list != null && !list.isEmpty()) {
                            Iterator it = list.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (((i8p) it.next()).f14350a == j2) {
                                        z = true;
                                        break;
                                    }
                                } else {
                                    z = false;
                                    break;
                                }
                            }
                        } else {
                            z = false;
                            break;
                        }
                        Integer num = ((w370) D()).g.b;
                        i3t0.B(this, nn60Var, new en60[]{new zm60(num != null ? num.intValue() : -1, j2, !z)});
                        return;
                    }
                    if (vp60Var instanceof rp60) {
                        Q(((rp60) vp60Var).f30871a);
                        return;
                    }
                    if (vp60Var instanceof qp60) {
                        boolean z5 = ((w370) D()).d.c;
                        this.q.g(wgh0.ONE_X_ALL);
                        this.t.C("games_all");
                        H(new obg((byte) 24, z5));
                        if (z5) {
                            Object[] objArr7 = ((w370) D()).d.e.length() == 0;
                            b2 = ((w370) D()).f.b != null ? (byte) 1 : (byte) 0;
                            if (!objArr7 == true || b2 == 0) {
                                Q("");
                            } else {
                                p7m0 p7m0Var5 = ocjVar.f25029a;
                                do {
                                    value4 = p7m0Var5.getValue();
                                    value4.getClass();
                                    w370Var4 = (w370) value4;
                                    oyg0Var.getClass();
                                    tdtVar = w370Var4.f;
                                } while (!p7m0Var5.m(value4, w370.a(w370Var4, false, false, null, null, null, tdt.a(tdtVar, tdtVar.b, null, null, 0, 0, 28), null, false, false, false, false, 16351)));
                            }
                        } else {
                            p7m0 p7m0Var6 = ocjVar.f25029a;
                            do {
                                value5 = p7m0Var6.getValue();
                                value5.getClass();
                                w370Var5 = (w370) value5;
                                oyg0Var.getClass();
                                tdtVar2 = w370Var5.f;
                            } while (!p7m0Var6.m(value5, w370.a(w370Var5, false, false, null, null, null, tdt.a(tdtVar2, null, tdtVar2.f33786a, null, 0, 0, 29), null, false, false, false, false, 16351)));
                        }
                        if (z5 && ((w370) D()).d.e.length() == 0 && ((w370) D()).f.b == null) {
                            G(n370.f22836a);
                            return;
                        }
                        return;
                    }
                    if (vp60Var instanceof gp60) {
                        gp60 gp60Var = (gp60) vp60Var;
                        List list2 = ((w370) D()).f.f33786a;
                        if (list2 != null) {
                            for (Object obj3 : list2) {
                                if (((pbv) obj3).f26728a == gp60Var.f11669a) {
                                    obj2 = obj3;
                                    break;
                                }
                            }
                            pbv pbvVar = (pbv) obj2;
                            if (pbvVar != null) {
                                p7m0 p7m0Var7 = ocjVar.f25029a;
                                do {
                                    value3 = p7m0Var7.getValue();
                                    value3.getClass();
                                    w370Var3 = (w370) value3;
                                    oyg0Var.getClass();
                                } while (!p7m0Var7.m(value3, w370.a(w370Var3, false, false, null, rc50.a(w370Var3.d, false, false, false, null, 55), null, null, null, false, false, false, false, 16375)));
                                String str = gp60Var.b;
                                Integer num2 = ((w370) D()).g.b;
                                i3t0.B(this, nn60Var, new en60[]{new bn60(pbvVar, str, num2 != null ? num2.intValue() : -1)});
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (vp60Var instanceof fp60) {
                        p7m0 p7m0Var8 = ocjVar.f25029a;
                        do {
                            value2 = p7m0Var8.getValue();
                            value2.getClass();
                            w370Var2 = (w370) value2;
                            oyg0Var.getClass();
                        } while (!p7m0Var8.m(value2, w370.a(w370Var2, false, false, null, rc50.a(w370Var2.d, false, false, false, null, 55), null, null, null, false, false, false, false, 16375)));
                        CopyOnWriteArrayList copyOnWriteArrayListQ3 = b1j.q(i1w0Var);
                        OneXGamesScreens$OneXGamesAllGamesFilterScreen oneXGamesScreens$OneXGamesAllGamesFilterScreen = new OneXGamesScreens$OneXGamesAllGamesFilterScreen();
                        if (oneXGamesScreens$OneXGamesAllGamesFilterScreen instanceof DialogScreen) {
                            copyOnWriteArrayListQ3.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) oneXGamesScreens$OneXGamesAllGamesFilterScreen)));
                        } else {
                            copyOnWriteArrayListQ3.add(new c8d(y7d.f42146a, new w0w0(oneXGamesScreens$OneXGamesAllGamesFilterScreen)));
                        }
                        ListIterator listIteratorO = b1j.o(i1w0Var, copyOnWriteArrayListQ3, 0);
                        while (true) {
                            paw pawVar3 = (paw) listIteratorO;
                            if (!pawVar3.hasNext()) {
                                return;
                            } else {
                                i1w0Var.a((oe50) pawVar3.next());
                            }
                        }
                    } else {
                        if (vp60Var instanceof tp60) {
                            b0();
                            return;
                        }
                        if (vp60Var instanceof xo60) {
                            G(p370.f26286a);
                            return;
                        }
                        if (vp60Var instanceof kp60) {
                            if (!((kp60) vp60Var).f18663a.equals(on60.f25532a)) {
                                t9f.b();
                                return;
                            } else {
                                N();
                                Y();
                                return;
                            }
                        }
                        if (vp60Var instanceof up60) {
                            i3t0.B(this, nn60Var, new en60[]{((up60) vp60Var).f36047a});
                            return;
                        }
                        if (vp60Var instanceof zo60) {
                            boolean z6 = ((zo60) vp60Var).f44705a;
                            p7m0 p7m0Var9 = ocjVar.f25029a;
                            do {
                                value = p7m0Var9.getValue();
                                value.getClass();
                                w370Var = (w370) value;
                                oyg0Var.getClass();
                            } while (!p7m0Var9.m(value, w370.a(w370Var, false, false, null, null, zm5.a(w370Var.e, null, null, null, z6, 7), null, null, false, false, false, false, 16367)));
                            return;
                        }
                        if (!(vp60Var instanceof dp60)) {
                            if (vp60Var instanceof yo60) {
                                p7m0Var2.n(((yo60) vp60Var).f42970a);
                                return;
                            }
                            if (vp60Var instanceof mp60) {
                                p7m0Var.n(((mp60) vp60Var).f22165a);
                                return;
                            }
                            if (vp60Var instanceof ap60) {
                                int i = ((ap60) vp60Var).f1236a;
                                this.v.b(i, y1p.XGAMES);
                                this.u.c(i, zn60.OneXGames);
                                Iterable<lxl> iterable = ((w370) D()).g.c;
                                if (iterable == null) {
                                    iterable = iun.f15405a;
                                }
                                ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
                                for (lxl lxlVar : iterable) {
                                    arrayList.add(lxl.a(lxlVar, ((int) lxlVar.f20819a) == i ? uxl.b : uxl.f36445a));
                                }
                                ((my60) this.K.f20481a.f36498a).c = i;
                                H(new rj50((byte) 29));
                                V(i, dyb.o0(arrayList), false);
                                return;
                            }
                            if (vp60Var instanceof hp60) {
                                List listC = kotlin.collections.a.c(Long.valueOf(((hp60) vp60Var).f13428a));
                                bvc bvcVarA2 = jiu0.a(this);
                                br60 br60Var = new br60(this, b3);
                                l570 l570Var = this.R;
                                l570Var.getClass();
                                listC.getClass();
                                l570Var.v(bvcVarA2, listC, "OneXGamesAllGameViewModel.updateGamesWorkStatus", br60Var);
                                return;
                            }
                            if (vp60Var instanceof ip60) {
                                a0();
                                return;
                            } else if (vp60Var instanceof wo60) {
                                E();
                                return;
                            } else {
                                t9f.b();
                                return;
                            }
                        }
                        dp60 dp60Var = (dp60) vp60Var;
                        int i2 = dp60Var.f6448a;
                        int i3 = dp60Var.b;
                        p7m0 p7m0Var10 = ocjVar.f25029a;
                        while (true) {
                            Object value8 = p7m0Var10.getValue();
                            value8.getClass();
                            w370 w370Var8 = (w370) value8;
                            oyg0Var.getClass();
                            int i4 = i3;
                            if (p7m0Var10.m(value8, w370.a(w370Var8, false, false, null, null, null, tdt.a(w370Var8.f, null, null, null, i2, i3, 7), null, false, false, false, false, 16351))) {
                                return;
                            } else {
                                i3 = i4;
                            }
                        }
                    }
                }
            } else {
                if (!((w370) D()).b) {
                    G(m370.f21100a);
                    R(false);
                    U();
                    return;
                }
                this.A.q(new bb50(false), true);
                i1w0Var.getClass();
                CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                ListIterator listIteratorP3 = b1j.p(copyOnWriteArrayList, new c8d(y7d.f42146a, p0w0Var), i1w0Var, copyOnWriteArrayList, 0);
                while (true) {
                    paw pawVar4 = (paw) listIteratorP3;
                    if (!pawVar4.hasNext()) {
                        return;
                    } else {
                        i1w0Var.a((oe50) pawVar4.next());
                    }
                }
            }
        }
    }
}

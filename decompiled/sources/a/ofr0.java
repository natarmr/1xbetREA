package a;

import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.top.api.presentation.header.TopHeaderTagType;
import org.xplatform.top.impl.presentation.ui.model.TopSectionKey;
import org.xplatform.top.impl.presentation.ui.model.TopSectionKey$Header$Aggregator$Categories;
import org.xplatform.top.impl.presentation.ui.model.TopSectionKey$Header$Aggregator$Recommended;
import org.xplatform.top.impl.presentation.ui.model.TopSectionKey$Header$Aggregator$Tournaments;
import org.xplatform.top.impl.presentation.ui.model.TopSectionKey$Header$Cyber$Champs$Line;
import org.xplatform.top.impl.presentation.ui.model.TopSectionKey$Header$Cyber$Champs$Live;
import org.xplatform.top.impl.presentation.ui.model.TopSectionKey$Header$Cyber$Disciplines;
import org.xplatform.top.impl.presentation.ui.model.TopSectionKey$Header$Cyber$Games$Line;
import org.xplatform.top.impl.presentation.ui.model.TopSectionKey$Header$Cyber$Games$Live;
import org.xplatform.top.impl.presentation.ui.model.TopSectionKey$Header$Sport$Champs$Live;
import org.xplatform.top.impl.presentation.ui.model.TopSectionKey$Header$Sport$Games$Line;
import org.xplatform.top.impl.presentation.ui.model.TopSectionKey$Header$Sport$Games$Live;

/* JADX INFO: loaded from: classes6.dex */
public final class ofr0 extends i3t0 {
    public static final /* synthetic */ int U0 = 0;
    public final kki A;
    public bby A0;
    public final ali B;
    public c4m0 B0;
    public final j3c C;
    public bby C0;
    public final pru D;
    public c4m0 D0;
    public final hzu E;
    public c4m0 E0;
    public final lyt F;
    public bby F0;
    public final lbu G;
    public c4m0 G0;
    public final f1v H;
    public c4m0 H0;
    public final xrt I;
    public c4m0 I0;
    public final puu J;
    public c4m0 J0;
    public final lbu K;
    public c4m0 K0;
    public final gmu L;
    public bby L0;
    public final luu M;
    public bby M0;
    public final s2r0 N;
    public bby N0;
    public final l2r0 O;
    public bby O0;
    public final swt P;
    public bby P0;
    public final ooc Q;
    public bby Q0;
    public final ieu R;
    public bby R0;
    public final iqt S;
    public j0g0 S0;
    public final oqx T;
    public c4m0 T0;
    public final gou U;
    public final qqx V;
    public final o470 W;
    public final ljf0 X;
    public final yk50 Y;
    public final g2g0 Z;
    public final zg a0;
    public final gg5 b0;
    public final o3c c0;
    public final kqc d0;
    public final kqc e0;
    public final jqc f0;
    public final jqc g0;
    public final yoc h0;
    public final yoc i0;
    public final ugf0 j0;
    public final duj k0;
    public final jqt l0;
    public final r2u m0;
    public final viu n0;
    public final m1e o;
    public final nhf0 o0;
    public final mne p;
    public c4m0 p0;
    public final l470 q;
    public c4m0 q0;
    public final f47 r;
    public c4m0 r0;
    public final z7z s;
    public c4m0 s0;
    public final alg t;
    public c4m0 t0;
    public final kb0 u;
    public bby u0;
    public final tjb0 v;
    public bby v0;
    public final phf0 w;
    public c4m0 w0;
    public final m2r0 x;
    public c4m0 x0;
    public final a6u y;
    public c4m0 y0;
    public final wdu z;
    public bby z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ofr0(vzg0 vzg0Var, lbu lbuVar, m1e m1eVar, mne mneVar, ctf0 ctf0Var, rrc rrcVar, y78 y78Var, l470 l470Var, f47 f47Var, z7z z7zVar, alg algVar, kb0 kb0Var, tjb0 tjb0Var, phf0 phf0Var, m2r0 m2r0Var, a6u a6uVar, wdu wduVar, kki kkiVar, ali aliVar, j3c j3cVar, wyu wyuVar, pru pruVar, hzu hzuVar, lyt lytVar, lbu lbuVar2, f1v f1vVar, xrt xrtVar, puu puuVar, lbu lbuVar3, gmu gmuVar, luu luuVar, s2r0 s2r0Var, l2r0 l2r0Var, svu svuVar, swt swtVar, ooc oocVar, ieu ieuVar, iqt iqtVar, oqx oqxVar, gou gouVar, qqx qqxVar, o470 o470Var, ljf0 ljf0Var, yk50 yk50Var, g2g0 g2g0Var, zg zgVar, gg5 gg5Var, qho qhoVar, r9u r9uVar, o3c o3cVar, kqc kqcVar, kqc kqcVar2, jqc jqcVar, jqc jqcVar2, yoc yocVar, yoc yocVar2, ugf0 ugf0Var, duj dujVar, i1w0 i1w0Var, jqt jqtVar, r2u r2uVar, bzt bztVar, viu viuVar, nhf0 nhf0Var) {
        super(new qvk0(pruVar, bztVar, lbuVar, rrcVar, svuVar, wyuVar, luuVar, qhoVar, r9uVar, iqtVar), cvm0.p(mneVar.c, mneVar.f22085a), new ge2(ctf0Var, y78Var, (byte) 3), (yzn0) null);
        m1eVar.getClass();
        ctf0Var.getClass();
        z7zVar.getClass();
        m2r0Var.getClass();
        wyuVar.getClass();
        l2r0Var.getClass();
        oocVar.getClass();
        i1w0Var.getClass();
        this.o = m1eVar;
        this.p = mneVar;
        this.q = l470Var;
        this.r = f47Var;
        this.s = z7zVar;
        this.t = algVar;
        this.u = kb0Var;
        this.v = tjb0Var;
        this.w = phf0Var;
        this.x = m2r0Var;
        this.y = a6uVar;
        this.z = wduVar;
        this.A = kkiVar;
        this.B = aliVar;
        this.C = j3cVar;
        this.D = pruVar;
        this.E = hzuVar;
        this.F = lytVar;
        this.G = lbuVar2;
        this.H = f1vVar;
        this.I = xrtVar;
        this.J = puuVar;
        this.K = lbuVar3;
        this.L = gmuVar;
        this.M = luuVar;
        this.N = s2r0Var;
        this.O = l2r0Var;
        this.P = swtVar;
        this.Q = oocVar;
        this.R = ieuVar;
        this.S = iqtVar;
        this.T = oqxVar;
        this.U = gouVar;
        this.V = qqxVar;
        this.W = o470Var;
        this.X = ljf0Var;
        this.Y = yk50Var;
        this.Z = g2g0Var;
        this.a0 = zgVar;
        this.b0 = gg5Var;
        this.c0 = o3cVar;
        this.d0 = kqcVar;
        this.e0 = kqcVar2;
        this.f0 = jqcVar;
        this.g0 = jqcVar2;
        this.h0 = yocVar;
        this.i0 = yocVar2;
        this.j0 = ugf0Var;
        this.k0 = dujVar;
        this.l0 = jqtVar;
        this.m0 = r2uVar;
        this.n0 = viuVar;
        this.o0 = nhf0Var;
    }

    public final void M() {
        e3c.n(this.M0);
        e3c.n(this.N0);
        e3c.n(this.O0);
        e3c.n(this.P0);
        e3c.n(this.Q0);
        e3c.n(this.R0);
    }

    public final void N() {
        e3c.n(this.t0);
        e3c.n(this.u0);
        e3c.n(this.v0);
        e3c.n(this.w0);
        e3c.n(this.x0);
        e3c.n(this.y0);
        e3c.n(this.z0);
        e3c.n(this.A0);
        e3c.n(this.B0);
        e3c.n(this.C0);
        e3c.n(this.D0);
        e3c.n(this.E0);
        e3c.n(this.F0);
        e3c.n(this.G0);
        e3c.n(this.H0);
        e3c.n(this.I0);
        e3c.n(this.J0);
        e3c.n(this.K0);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0076 A[PHI: r2
  0x0076: PHI (r2v5 int) = (r2v3 int), (r2v7 int) binds: [B:27:0x005c, B:32:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x008b  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0068, code lost:
    
        if (r8 == r1) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object O(a.zje r8) throws java.lang.Exception {
        /*
            r7 = this;
            boolean r0 = r8 instanceof a.ffr0
            if (r0 == 0) goto L13
            r0 = r8
            a.ffr0 r0 = (a.ffr0) r0
            int r1 = r0.m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.m = r1
            goto L18
        L13:
            a.ffr0 r0 = new a.ffr0
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.k
            a.wne r1 = a.wne.f39444a
            int r2 = r0.m
            r3 = 0
            r4 = 0
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L3e
            if (r2 == r6) goto L38
            if (r2 != r5) goto L32
            a.ofr0 r0 = r0.j
            a.z1x.P(r8)     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> Lbb
            goto La2
        L2f:
            r8 = move-exception
            goto Lac
        L32:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r7)
            return r3
        L38:
            int r2 = r0.i
            a.z1x.P(r8)
            goto L6b
        L3e:
            a.z1x.P(r8)
            a.kqc r8 = r7.d0
            a.sub0 r8 = r8.a()
            a.sub0 r2 = a.sub0.SUCCESS
            if (r8 != r2) goto L55
            a.kqc r8 = r7.e0
            a.sub0 r8 = r8.a()
            if (r8 != r2) goto L55
            r2 = r6
            goto L56
        L55:
            r2 = r4
        L56:
            a.jqc r8 = r7.f0
            boolean r8 = r8.b()
            if (r8 == 0) goto L76
            r0.i = r2
            r0.m = r6
            a.jqc r8 = r7.g0
            java.io.Serializable r8 = r8.a(r0)
            if (r8 != r1) goto L6b
            goto La0
        L6b:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L74
            goto L76
        L74:
            r8 = r4
            goto L77
        L76:
            r8 = r6
        L77:
            if (r2 != 0) goto L7b
            if (r8 == 0) goto L87
        L7b:
            a.j0g0 r8 = r7.S0
            if (r8 == 0) goto L87
            java.lang.Object r8 = r8.f15681a
            boolean r8 = r8 instanceof a.g0g0
            if (r8 != r6) goto L87
            r7.S0 = r3
        L87:
            a.j0g0 r8 = r7.S0
            if (r8 == 0) goto L90
            java.lang.Object r8 = r8.f15681a
            a.z1x.P(r8)
        L90:
            a.e0g0 r8 = a.j0g0.b     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> Lbb
            a.o3c r8 = r7.c0     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> Lbb
            r0.j = r7     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> Lbb
            r0.i = r2     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> Lbb
            r0.m = r5     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> Lbb
            java.lang.Object r8 = a.o3c.p(r8, r4, r0, r6)     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> Lbb
            if (r8 != r1) goto La1
        La0:
            return r1
        La1:
            r0 = r7
        La2:
            kotlin.Unit r8 = kotlin.Unit.f46060a     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> Lbb
            a.j0g0 r1 = new a.j0g0     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> Lbb
            r1.<init>(r8)     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> Lbb
            r0.S0 = r1     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> Lbb
            return r8
        Lac:
            a.e0g0 r0 = a.j0g0.b
            a.g0g0 r0 = new a.g0g0
            r0.<init>(r8)
            a.j0g0 r1 = new a.j0g0
            r1.<init>(r0)
            r7.S0 = r1
            throw r8
        Lbb:
            r7 = move-exception
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ofr0.O(a.zje):java.lang.Object");
    }

    public final c4m0 P(Function0 function0) {
        return kkb.Q(d5c.S(jiu0.a(this), this.p.f22085a), null, new xhl0(function0, (byte) 17), 50);
    }

    public final void Q() {
        c4m0 c4m0Var = this.p0;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            yje yjeVar = null;
            bu buVar = new bu(this, yjeVar, (byte) 24);
            zz zzVar = new zz(1, this, ofr0.class, "onHandleConnectionError", "onHandleConnectionError()V", 4, (byte) 3);
            this.p0 = sac.T(new fnq(this.o.b(), new xj1(buVar, zzVar, (yje) null), (byte) 4), d5c.S(jiu0.a(this), this.p.f22085a), new f1e(2, yjeVar, (byte) 27));
        }
    }

    public final void R() {
        c4m0 c4m0Var = this.E0;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            ser0 ser0Var = (ser0) D();
            ser0Var.getClass();
            xdr0 xdr0Var = ser0Var.w;
            if (!xdr0Var.q || xdr0Var.s) {
                return;
            }
            if (((ser0) D()).n.a() instanceof d1r0) {
                V(new k0r0(e1r0.f7050a, iun.f15405a));
            }
            ali aliVar = this.B;
            byte b = 2;
            yje yjeVar = null;
            this.E0 = sac.T(new fnq(aoq.a(i120.W(new a1t(((kc60) aliVar.c).a(), b)), new unt(aliVar, null)), new ifr0(this, yjeVar, b), (byte) 4), d5c.S(jiu0.a(this), this.p.f22085a), new hfr0(this, yjeVar, (byte) 3));
        }
    }

    public final void S() {
        ser0 ser0Var = (ser0) D();
        ser0Var.getClass();
        xdr0 xdr0Var = ser0Var.w;
        if (!xdr0Var.m || xdr0Var.i) {
            return;
        }
        if (((ser0) D()).k.a() instanceof d1r0) {
            V(new r0r0(e1r0.f7050a, iun.f15405a));
        }
        bby bbyVar = this.z0;
        if (bbyVar != null) {
            e3c.n(bbyVar);
        }
        this.z0 = sac.V(jiu0.a(this), new afr0(this, (byte) 3), null, null, new kfr0(this, null, (byte) 0), 14);
    }

    public final void T() {
        ser0 ser0Var = (ser0) D();
        ser0Var.getClass();
        xdr0 xdr0Var = ser0Var.w;
        if (!xdr0Var.m || xdr0Var.i) {
            return;
        }
        if (((ser0) D()).l.a() instanceof d1r0) {
            V(new s0r0(e1r0.f7050a, iun.f15405a));
        }
        bby bbyVar = this.A0;
        if (bbyVar != null) {
            e3c.n(bbyVar);
        }
        this.A0 = sac.V(jiu0.a(this), new afr0(this, (byte) 2), null, null, new kfr0(this, null, (byte) 1), 14);
    }

    public final void U() {
        ser0 ser0Var = (ser0) D();
        ser0Var.getClass();
        xdr0 xdr0Var = ser0Var.w;
        if (xdr0Var.m && xdr0Var.o && xdr0Var.d && !xdr0Var.i) {
            if (((ser0) D()).d.a() instanceof d1r0) {
                V(new t0r0(e1r0.f7050a, iun.f15405a));
            }
            bby bbyVar = this.v0;
            if (bbyVar != null) {
                e3c.n(bbyVar);
            }
            this.v0 = sac.V(jiu0.a(this), new afr0(this, (byte) 1), null, null, new kfr0(this, null, (byte) 2), 14);
        }
    }

    public final void V(a1r0 a1r0Var) {
        j1r0 j1r0VarA;
        j1r0 j1r0VarA2;
        H(new p6r0(a1r0Var, (byte) 8));
        ser0 ser0Var = (ser0) D();
        ser0Var.getClass();
        ArrayList arrayListL = xsm0.l(ser0Var);
        ArrayList<f0r0> arrayList = new ArrayList();
        for (Object obj : arrayListL) {
            f0r0 f0r0Var = (f0r0) obj;
            f0r0Var.getClass();
            if (!(f0r0Var.a() instanceof i1r0) || !(f0r0Var instanceof iyq0)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
        for (f0r0 f0r0Var2 : arrayList) {
            if (f0r0Var2 != null) {
                if (f0r0Var2 instanceof zyq0) {
                    j1r0VarA2 = ((zyq0) f0r0Var2).a();
                } else if (f0r0Var2 instanceof xxq0) {
                    j1r0VarA2 = ((xxq0) f0r0Var2).a();
                } else if (f0r0Var2 instanceof zxq0) {
                    j1r0VarA2 = ((zxq0) f0r0Var2).a();
                } else if (f0r0Var2 instanceof eyq0) {
                    j1r0VarA2 = ((eyq0) f0r0Var2).a();
                } else if (f0r0Var2 instanceof hyq0) {
                    j1r0VarA2 = ((hyq0) f0r0Var2).a();
                } else if (f0r0Var2 instanceof iyq0) {
                    j1r0VarA2 = ((iyq0) f0r0Var2).a();
                } else if (f0r0Var2 instanceof b3r0) {
                    j1r0VarA2 = ((b3r0) f0r0Var2).a();
                } else if (f0r0Var2 instanceof a3r0) {
                    j1r0VarA2 = ((a3r0) f0r0Var2).a();
                } else if (f0r0Var2 instanceof h2r0) {
                    j1r0VarA2 = ((h2r0) f0r0Var2).a();
                } else if (f0r0Var2 instanceof j2r0) {
                    j1r0VarA2 = ((j2r0) f0r0Var2).a();
                } else if (f0r0Var2 instanceof n2r0) {
                    j1r0VarA2 = ((n2r0) f0r0Var2).a();
                } else if (f0r0Var2 instanceof c4r0) {
                    j1r0VarA2 = ((c4r0) f0r0Var2).a();
                } else if (f0r0Var2 instanceof s8r0) {
                    j1r0VarA2 = ((s8r0) f0r0Var2).a();
                } else if (f0r0Var2 instanceof t8r0) {
                    j1r0VarA2 = ((t8r0) f0r0Var2).a();
                } else if (f0r0Var2 instanceof u8r0) {
                    j1r0VarA2 = ((u8r0) f0r0Var2).a();
                } else if (f0r0Var2 instanceof her0) {
                    j1r0VarA2 = ((her0) f0r0Var2).a();
                } else if (f0r0Var2 instanceof ler0) {
                    j1r0VarA2 = ((ler0) f0r0Var2).a();
                } else if (f0r0Var2 instanceof per0) {
                    j1r0VarA2 = ((per0) f0r0Var2).a();
                } else if (f0r0Var2 instanceof qer0) {
                    j1r0VarA2 = ((qer0) f0r0Var2).a();
                } else if (f0r0Var2 instanceof pfr0) {
                    j1r0VarA2 = ((pfr0) f0r0Var2).a();
                }
                arrayList2.add(Boolean.valueOf(j1r0VarA2 instanceof b1r0));
            }
            t9f.b();
            return;
        }
        if (!arrayList2.isEmpty()) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                if (!((Boolean) it.next()).booleanValue()) {
                    ser0 ser0Var2 = (ser0) D();
                    ser0Var2.getClass();
                    ArrayList arrayListL2 = xsm0.l(ser0Var2);
                    ArrayList<f0r0> arrayList3 = new ArrayList();
                    for (Object obj2 : arrayListL2) {
                        f0r0 f0r0Var3 = (f0r0) obj2;
                        f0r0Var3.getClass();
                        if (!(f0r0Var3.a() instanceof i1r0) || !(f0r0Var3 instanceof iyq0)) {
                            arrayList3.add(obj2);
                        }
                    }
                    ArrayList arrayList4 = new ArrayList(r3d.q(arrayList3, 10));
                    for (f0r0 f0r0Var4 : arrayList3) {
                        if (f0r0Var4 != null) {
                            if (f0r0Var4 instanceof zyq0) {
                                j1r0VarA = ((zyq0) f0r0Var4).a();
                            } else if (f0r0Var4 instanceof xxq0) {
                                j1r0VarA = ((xxq0) f0r0Var4).a();
                            } else if (f0r0Var4 instanceof zxq0) {
                                j1r0VarA = ((zxq0) f0r0Var4).a();
                            } else if (f0r0Var4 instanceof eyq0) {
                                j1r0VarA = ((eyq0) f0r0Var4).a();
                            } else if (f0r0Var4 instanceof hyq0) {
                                j1r0VarA = ((hyq0) f0r0Var4).a();
                            } else if (f0r0Var4 instanceof iyq0) {
                                j1r0VarA = ((iyq0) f0r0Var4).a();
                            } else if (f0r0Var4 instanceof b3r0) {
                                j1r0VarA = ((b3r0) f0r0Var4).a();
                            } else if (f0r0Var4 instanceof a3r0) {
                                j1r0VarA = ((a3r0) f0r0Var4).a();
                            } else if (f0r0Var4 instanceof h2r0) {
                                j1r0VarA = ((h2r0) f0r0Var4).a();
                            } else if (f0r0Var4 instanceof j2r0) {
                                j1r0VarA = ((j2r0) f0r0Var4).a();
                            } else if (f0r0Var4 instanceof n2r0) {
                                j1r0VarA = ((n2r0) f0r0Var4).a();
                            } else if (f0r0Var4 instanceof c4r0) {
                                j1r0VarA = ((c4r0) f0r0Var4).a();
                            } else if (f0r0Var4 instanceof s8r0) {
                                j1r0VarA = ((s8r0) f0r0Var4).a();
                            } else if (f0r0Var4 instanceof t8r0) {
                                j1r0VarA = ((t8r0) f0r0Var4).a();
                            } else if (f0r0Var4 instanceof u8r0) {
                                j1r0VarA = ((u8r0) f0r0Var4).a();
                            } else if (f0r0Var4 instanceof her0) {
                                j1r0VarA = ((her0) f0r0Var4).a();
                            } else if (f0r0Var4 instanceof ler0) {
                                j1r0VarA = ((ler0) f0r0Var4).a();
                            } else if (f0r0Var4 instanceof per0) {
                                j1r0VarA = ((per0) f0r0Var4).a();
                            } else if (f0r0Var4 instanceof qer0) {
                                j1r0VarA = ((qer0) f0r0Var4).a();
                            } else if (f0r0Var4 instanceof pfr0) {
                                j1r0VarA = ((pfr0) f0r0Var4).a();
                            }
                            arrayList4.add(Boolean.valueOf(j1r0VarA instanceof g1r0));
                        }
                        t9f.b();
                        return;
                    }
                    if (!arrayList4.isEmpty()) {
                        Iterator it2 = arrayList4.iterator();
                        while (it2.hasNext()) {
                            if (!((Boolean) it2.next()).booleanValue()) {
                                Y(n8r0.f23103a);
                                return;
                            }
                        }
                    }
                    Y(n8r0.c);
                    return;
                }
            }
        }
        Y(n8r0.b);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object W(zje zjeVar) {
        mfr0 mfr0Var;
        if (zjeVar instanceof mfr0) {
            mfr0Var = (mfr0) zjeVar;
            int i = mfr0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                mfr0Var.k = i - Integer.MIN_VALUE;
            } else {
                mfr0Var = new mfr0(this, zjeVar);
            }
        } else {
            mfr0Var = new mfr0(this, zjeVar);
        }
        Object objA = mfr0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = mfr0Var.k;
        if (i2 == 0) {
            z1x.P(objA);
            boolean z = ((ser0) D()).w.e && ((ser0) D()).w.f40709a;
            mfr0Var.k = 1;
            objA = this.U.f11651a.b.a(z, mfr0Var);
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
        H(new kv80((List) objA, (byte) 16));
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x010a  */
    /* JADX WARN: Code duplicated, block: B:37:0x0122  */
    /* JADX WARN: Code duplicated, block: B:39:0x0140  */
    /* JADX WARN: Code duplicated, block: B:43:0x0184  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object X(zje zjeVar) {
        nfr0 nfr0Var;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        wcb wcbVar;
        boolean z6;
        Pair pair;
        final boolean z7;
        final boolean z8;
        final boolean z9;
        boolean z10;
        Object objI;
        wcb wcbVar2;
        boolean z11;
        boolean z12;
        String str;
        boolean zBooleanValue;
        Object objC;
        final String str2;
        final boolean z13;
        final wcb wcbVar3;
        final boolean z14;
        final boolean z15;
        if (zjeVar instanceof nfr0) {
            nfr0Var = (nfr0) zjeVar;
            int i = nfr0Var.s;
            if ((i & Integer.MIN_VALUE) != 0) {
                nfr0Var.s = i - Integer.MIN_VALUE;
            } else {
                nfr0Var = new nfr0(this, zjeVar);
            }
        } else {
            nfr0Var = new nfr0(this, zjeVar);
        }
        Object obj = nfr0Var.q;
        wne wneVar = wne.f39444a;
        int i2 = nfr0Var.s;
        iqt iqtVar = this.S;
        if (i2 == 0) {
            z1x.P(obj);
            boolean zA = this.J.a();
            boolean zA2 = this.I.a();
            boolean zA3 = this.L.a();
            boolean zA4 = this.V.a();
            List list = ((ser0) D()).w.G;
            nfr0Var.i = zA;
            nfr0Var.j = zA2;
            nfr0Var.k = zA3;
            nfr0Var.l = zA4;
            nfr0Var.s = 1;
            Object objA = this.T.a(list, nfr0Var);
            if (objA != wneVar) {
                z = zA;
                obj = objA;
                z2 = zA3;
                z3 = zA2;
                z4 = zA4;
            }
            return wneVar;
        }
        if (i2 == 1) {
            z4 = nfr0Var.l;
            z2 = nfr0Var.k;
            z3 = nfr0Var.j;
            z = nfr0Var.i;
            z1x.P(obj);
        } else {
            if (i2 == 2) {
                z5 = nfr0Var.m;
                z6 = nfr0Var.l;
                z2 = nfr0Var.k;
                z3 = nfr0Var.j;
                z = nfr0Var.i;
                z1x.P(obj);
                wcbVar = (wcb) obj;
                if (((ser0) D()).w.x.length() == 0) {
                    nfr0Var.o = wcbVar;
                    nfr0Var.i = z;
                    nfr0Var.j = z3;
                    nfr0Var.k = z2;
                    nfr0Var.l = z6;
                    nfr0Var.m = z5;
                    nfr0Var.s = 3;
                    objI = this.R.i(nfr0Var);
                    if (objI != wneVar) {
                        boolean z16 = z;
                        wcbVar2 = wcbVar;
                        obj = objI;
                        z11 = z6;
                        z8 = z2;
                        z12 = z3;
                        z10 = z16;
                        pair = new Pair(((elt) obj).f8017a, Boolean.valueOf(iqtVar.f15225a.a()));
                        z7 = z11;
                        z9 = z12;
                        wcbVar = wcbVar2;
                        str = (String) pair.f46059a;
                        zBooleanValue = ((Boolean) pair.b).booleanValue();
                        nfr0Var.o = wcbVar;
                        nfr0Var.p = str;
                        nfr0Var.i = z10;
                        nfr0Var.j = z9;
                        nfr0Var.k = z8;
                        nfr0Var.l = z7;
                        nfr0Var.m = z5;
                        nfr0Var.n = zBooleanValue;
                        nfr0Var.s = 4;
                        objC = this.m0.c(nfr0Var);
                        if (objC != wneVar) {
                            str2 = str;
                            z13 = z10;
                            wcbVar3 = wcbVar;
                            obj = objC;
                            z14 = z5;
                            z15 = zBooleanValue;
                        }
                    }
                } else {
                    pair = new Pair(((ser0) D()).w.x, Boolean.valueOf(iqtVar.f15225a.a()));
                    z7 = z6;
                    z8 = z2;
                    z9 = z3;
                    z10 = z;
                    str = (String) pair.f46059a;
                    zBooleanValue = ((Boolean) pair.b).booleanValue();
                    nfr0Var.o = wcbVar;
                    nfr0Var.p = str;
                    nfr0Var.i = z10;
                    nfr0Var.j = z9;
                    nfr0Var.k = z8;
                    nfr0Var.l = z7;
                    nfr0Var.m = z5;
                    nfr0Var.n = zBooleanValue;
                    nfr0Var.s = 4;
                    objC = this.m0.c(nfr0Var);
                    if (objC != wneVar) {
                        str2 = str;
                        z13 = z10;
                        wcbVar3 = wcbVar;
                        obj = objC;
                        z14 = z5;
                        z15 = zBooleanValue;
                    }
                }
                return wneVar;
            }
            if (i2 == 3) {
                z5 = nfr0Var.m;
                z11 = nfr0Var.l;
                z8 = nfr0Var.k;
                z12 = nfr0Var.j;
                z10 = nfr0Var.i;
                wcbVar2 = nfr0Var.o;
                z1x.P(obj);
                pair = new Pair(((elt) obj).f8017a, Boolean.valueOf(iqtVar.f15225a.a()));
                z7 = z11;
                z9 = z12;
                wcbVar = wcbVar2;
                str = (String) pair.f46059a;
                zBooleanValue = ((Boolean) pair.b).booleanValue();
                nfr0Var.o = wcbVar;
                nfr0Var.p = str;
                nfr0Var.i = z10;
                nfr0Var.j = z9;
                nfr0Var.k = z8;
                nfr0Var.l = z7;
                nfr0Var.m = z5;
                nfr0Var.n = zBooleanValue;
                nfr0Var.s = 4;
                objC = this.m0.c(nfr0Var);
                if (objC != wneVar) {
                    str2 = str;
                    z13 = z10;
                    wcbVar3 = wcbVar;
                    obj = objC;
                    z14 = z5;
                    z15 = zBooleanValue;
                }
                return wneVar;
            }
            if (i2 != 4) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            boolean z17 = nfr0Var.n;
            boolean z18 = nfr0Var.m;
            z7 = nfr0Var.l;
            boolean z19 = nfr0Var.k;
            z9 = nfr0Var.j;
            boolean z20 = nfr0Var.i;
            String str3 = nfr0Var.p;
            wcb wcbVar4 = nfr0Var.o;
            z1x.P(obj);
            z15 = z17;
            str2 = str3;
            z14 = z18;
            z8 = z19;
            z13 = z20;
            wcbVar3 = wcbVar4;
        }
        final List list2 = (List) obj;
        H(new Function2() { // from class: a.bfr0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                ser0 ser0Var = (ser0) obj3;
                ((oyg0) obj2).getClass();
                ser0Var.getClass();
                xdr0 xdr0Var = ser0Var.w;
                boolean z21 = Intrinsics.d(str2, "AX") && !z15;
                int i3 = xdr0Var.f;
                boolean z22 = xdr0Var.g;
                boolean z23 = xdr0Var.h;
                boolean z24 = xdr0Var.i;
                boolean z25 = xdr0Var.j;
                boolean z26 = xdr0Var.k;
                boolean z27 = xdr0Var.l;
                boolean z28 = xdr0Var.m;
                boolean z29 = xdr0Var.n;
                boolean z30 = xdr0Var.o;
                boolean z31 = xdr0Var.p;
                boolean z32 = xdr0Var.q;
                boolean z33 = xdr0Var.r;
                lq5 lq5Var = xdr0Var.t;
                uql0 uql0Var = xdr0Var.u;
                String str4 = xdr0Var.w;
                String str5 = xdr0Var.x;
                f3v0 f3v0Var = xdr0Var.y;
                String str6 = xdr0Var.z;
                ot0 ot0Var = xdr0Var.A;
                List list3 = xdr0Var.B;
                boolean z34 = xdr0Var.D;
                boolean z35 = xdr0Var.E;
                Integer num = xdr0Var.F;
                List list4 = xdr0Var.G;
                boolean z36 = xdr0Var.H;
                boolean z37 = xdr0Var.I;
                boolean z38 = xdr0Var.J;
                v5l0 v5l0Var = xdr0Var.K;
                boolean z39 = xdr0Var.L;
                boolean z40 = xdr0Var.M;
                List list5 = list2;
                list5.getClass();
                list4.getClass();
                return ser0.a(ser0Var, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new xdr0(z7, z13, z9, z8, z14, i3, z22, z23, z24, z25, z26, z27, z28, z29, z30, z31, z32, z33, z21, lq5Var, uql0Var, wcbVar3, str4, str5, f3v0Var, str6, ot0Var, list3, list5, z34, z35, num, list4, z36, z37, z38, v5l0Var, z39, z40), false, 12582911);
            }
        });
        return Unit.f46060a;
        boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
        if (((ser0) D()).w.v == null) {
            nfr0Var.i = z;
            nfr0Var.j = z3;
            nfr0Var.k = z2;
            nfr0Var.l = z4;
            nfr0Var.m = zBooleanValue2;
            nfr0Var.s = 2;
            Object objC2 = this.C.c(nfr0Var);
            if (objC2 != wneVar) {
                boolean z21 = z4;
                z5 = zBooleanValue2;
                obj = objC2;
                z6 = z21;
                wcbVar = (wcb) obj;
                if (((ser0) D()).w.x.length() == 0) {
                    nfr0Var.o = wcbVar;
                    nfr0Var.i = z;
                    nfr0Var.j = z3;
                    nfr0Var.k = z2;
                    nfr0Var.l = z6;
                    nfr0Var.m = z5;
                    nfr0Var.s = 3;
                    objI = this.R.i(nfr0Var);
                    if (objI != wneVar) {
                        boolean z110 = z;
                        wcbVar2 = wcbVar;
                        obj = objI;
                        z11 = z6;
                        z8 = z2;
                        z12 = z3;
                        z10 = z110;
                        pair = new Pair(((elt) obj).f8017a, Boolean.valueOf(iqtVar.f15225a.a()));
                        z7 = z11;
                        z9 = z12;
                        wcbVar = wcbVar2;
                        str = (String) pair.f46059a;
                        zBooleanValue = ((Boolean) pair.b).booleanValue();
                        nfr0Var.o = wcbVar;
                        nfr0Var.p = str;
                        nfr0Var.i = z10;
                        nfr0Var.j = z9;
                        nfr0Var.k = z8;
                        nfr0Var.l = z7;
                        nfr0Var.m = z5;
                        nfr0Var.n = zBooleanValue;
                        nfr0Var.s = 4;
                        objC = this.m0.c(nfr0Var);
                        if (objC != wneVar) {
                            str2 = str;
                            z13 = z10;
                            wcbVar3 = wcbVar;
                            obj = objC;
                            z14 = z5;
                            z15 = zBooleanValue;
                            final List list3 = (List) obj;
                            H(new Function2() { // from class: a.bfr0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj2, Object obj3) {
                                    ser0 ser0Var = (ser0) obj3;
                                    ((oyg0) obj2).getClass();
                                    ser0Var.getClass();
                                    xdr0 xdr0Var = ser0Var.w;
                                    boolean z22 = Intrinsics.d(str2, "AX") && !z15;
                                    int i3 = xdr0Var.f;
                                    boolean z23 = xdr0Var.g;
                                    boolean z24 = xdr0Var.h;
                                    boolean z25 = xdr0Var.i;
                                    boolean z26 = xdr0Var.j;
                                    boolean z27 = xdr0Var.k;
                                    boolean z28 = xdr0Var.l;
                                    boolean z29 = xdr0Var.m;
                                    boolean z210 = xdr0Var.n;
                                    boolean z30 = xdr0Var.o;
                                    boolean z31 = xdr0Var.p;
                                    boolean z32 = xdr0Var.q;
                                    boolean z33 = xdr0Var.r;
                                    lq5 lq5Var = xdr0Var.t;
                                    uql0 uql0Var = xdr0Var.u;
                                    String str4 = xdr0Var.w;
                                    String str5 = xdr0Var.x;
                                    f3v0 f3v0Var = xdr0Var.y;
                                    String str6 = xdr0Var.z;
                                    ot0 ot0Var = xdr0Var.A;
                                    List list4 = xdr0Var.B;
                                    boolean z34 = xdr0Var.D;
                                    boolean z35 = xdr0Var.E;
                                    Integer num = xdr0Var.F;
                                    List list5 = xdr0Var.G;
                                    boolean z36 = xdr0Var.H;
                                    boolean z37 = xdr0Var.I;
                                    boolean z38 = xdr0Var.J;
                                    v5l0 v5l0Var = xdr0Var.K;
                                    boolean z39 = xdr0Var.L;
                                    boolean z40 = xdr0Var.M;
                                    List list6 = list3;
                                    list6.getClass();
                                    list5.getClass();
                                    return ser0.a(ser0Var, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new xdr0(z7, z13, z9, z8, z14, i3, z23, z24, z25, z26, z27, z28, z29, z210, z30, z31, z32, z33, z22, lq5Var, uql0Var, wcbVar3, str4, str5, f3v0Var, str6, ot0Var, list4, list6, z34, z35, num, list5, z36, z37, z38, v5l0Var, z39, z40), false, 12582911);
                                }
                            });
                            return Unit.f46060a;
                        }
                    }
                } else {
                    pair = new Pair(((ser0) D()).w.x, Boolean.valueOf(iqtVar.f15225a.a()));
                    z7 = z6;
                    z8 = z2;
                    z9 = z3;
                    z10 = z;
                    str = (String) pair.f46059a;
                    zBooleanValue = ((Boolean) pair.b).booleanValue();
                    nfr0Var.o = wcbVar;
                    nfr0Var.p = str;
                    nfr0Var.i = z10;
                    nfr0Var.j = z9;
                    nfr0Var.k = z8;
                    nfr0Var.l = z7;
                    nfr0Var.m = z5;
                    nfr0Var.n = zBooleanValue;
                    nfr0Var.s = 4;
                    objC = this.m0.c(nfr0Var);
                    if (objC != wneVar) {
                        str2 = str;
                        z13 = z10;
                        wcbVar3 = wcbVar;
                        obj = objC;
                        z14 = z5;
                        z15 = zBooleanValue;
                        final List list4 = (List) obj;
                        H(new Function2() { // from class: a.bfr0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                ser0 ser0Var = (ser0) obj3;
                                ((oyg0) obj2).getClass();
                                ser0Var.getClass();
                                xdr0 xdr0Var = ser0Var.w;
                                boolean z22 = Intrinsics.d(str2, "AX") && !z15;
                                int i3 = xdr0Var.f;
                                boolean z23 = xdr0Var.g;
                                boolean z24 = xdr0Var.h;
                                boolean z25 = xdr0Var.i;
                                boolean z26 = xdr0Var.j;
                                boolean z27 = xdr0Var.k;
                                boolean z28 = xdr0Var.l;
                                boolean z29 = xdr0Var.m;
                                boolean z210 = xdr0Var.n;
                                boolean z30 = xdr0Var.o;
                                boolean z31 = xdr0Var.p;
                                boolean z32 = xdr0Var.q;
                                boolean z33 = xdr0Var.r;
                                lq5 lq5Var = xdr0Var.t;
                                uql0 uql0Var = xdr0Var.u;
                                String str4 = xdr0Var.w;
                                String str5 = xdr0Var.x;
                                f3v0 f3v0Var = xdr0Var.y;
                                String str6 = xdr0Var.z;
                                ot0 ot0Var = xdr0Var.A;
                                List list5 = xdr0Var.B;
                                boolean z34 = xdr0Var.D;
                                boolean z35 = xdr0Var.E;
                                Integer num = xdr0Var.F;
                                List list6 = xdr0Var.G;
                                boolean z36 = xdr0Var.H;
                                boolean z37 = xdr0Var.I;
                                boolean z38 = xdr0Var.J;
                                v5l0 v5l0Var = xdr0Var.K;
                                boolean z39 = xdr0Var.L;
                                boolean z40 = xdr0Var.M;
                                List list7 = list4;
                                list7.getClass();
                                list6.getClass();
                                return ser0.a(ser0Var, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new xdr0(z7, z13, z9, z8, z14, i3, z23, z24, z25, z26, z27, z28, z29, z210, z30, z31, z32, z33, z22, lq5Var, uql0Var, wcbVar3, str4, str5, f3v0Var, str6, ot0Var, list5, list7, z34, z35, num, list6, z36, z37, z38, v5l0Var, z39, z40), false, 12582911);
                            }
                        });
                        return Unit.f46060a;
                    }
                }
            }
        } else {
            boolean z22 = z4;
            z5 = zBooleanValue2;
            wcbVar = ((ser0) D()).w.v;
            z6 = z22;
            if (((ser0) D()).w.x.length() == 0) {
                nfr0Var.o = wcbVar;
                nfr0Var.i = z;
                nfr0Var.j = z3;
                nfr0Var.k = z2;
                nfr0Var.l = z6;
                nfr0Var.m = z5;
                nfr0Var.s = 3;
                objI = this.R.i(nfr0Var);
                if (objI != wneVar) {
                    boolean z111 = z;
                    wcbVar2 = wcbVar;
                    obj = objI;
                    z11 = z6;
                    z8 = z2;
                    z12 = z3;
                    z10 = z111;
                    pair = new Pair(((elt) obj).f8017a, Boolean.valueOf(iqtVar.f15225a.a()));
                    z7 = z11;
                    z9 = z12;
                    wcbVar = wcbVar2;
                    str = (String) pair.f46059a;
                    zBooleanValue = ((Boolean) pair.b).booleanValue();
                    nfr0Var.o = wcbVar;
                    nfr0Var.p = str;
                    nfr0Var.i = z10;
                    nfr0Var.j = z9;
                    nfr0Var.k = z8;
                    nfr0Var.l = z7;
                    nfr0Var.m = z5;
                    nfr0Var.n = zBooleanValue;
                    nfr0Var.s = 4;
                    objC = this.m0.c(nfr0Var);
                    if (objC != wneVar) {
                        str2 = str;
                        z13 = z10;
                        wcbVar3 = wcbVar;
                        obj = objC;
                        z14 = z5;
                        z15 = zBooleanValue;
                        final List list5 = (List) obj;
                        H(new Function2() { // from class: a.bfr0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                ser0 ser0Var = (ser0) obj3;
                                ((oyg0) obj2).getClass();
                                ser0Var.getClass();
                                xdr0 xdr0Var = ser0Var.w;
                                boolean z23 = Intrinsics.d(str2, "AX") && !z15;
                                int i3 = xdr0Var.f;
                                boolean z24 = xdr0Var.g;
                                boolean z25 = xdr0Var.h;
                                boolean z26 = xdr0Var.i;
                                boolean z27 = xdr0Var.j;
                                boolean z28 = xdr0Var.k;
                                boolean z29 = xdr0Var.l;
                                boolean z210 = xdr0Var.m;
                                boolean z211 = xdr0Var.n;
                                boolean z30 = xdr0Var.o;
                                boolean z31 = xdr0Var.p;
                                boolean z32 = xdr0Var.q;
                                boolean z33 = xdr0Var.r;
                                lq5 lq5Var = xdr0Var.t;
                                uql0 uql0Var = xdr0Var.u;
                                String str4 = xdr0Var.w;
                                String str5 = xdr0Var.x;
                                f3v0 f3v0Var = xdr0Var.y;
                                String str6 = xdr0Var.z;
                                ot0 ot0Var = xdr0Var.A;
                                List list6 = xdr0Var.B;
                                boolean z34 = xdr0Var.D;
                                boolean z35 = xdr0Var.E;
                                Integer num = xdr0Var.F;
                                List list7 = xdr0Var.G;
                                boolean z36 = xdr0Var.H;
                                boolean z37 = xdr0Var.I;
                                boolean z38 = xdr0Var.J;
                                v5l0 v5l0Var = xdr0Var.K;
                                boolean z39 = xdr0Var.L;
                                boolean z40 = xdr0Var.M;
                                List list8 = list5;
                                list8.getClass();
                                list7.getClass();
                                return ser0.a(ser0Var, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new xdr0(z7, z13, z9, z8, z14, i3, z24, z25, z26, z27, z28, z29, z210, z211, z30, z31, z32, z33, z23, lq5Var, uql0Var, wcbVar3, str4, str5, f3v0Var, str6, ot0Var, list6, list8, z34, z35, num, list7, z36, z37, z38, v5l0Var, z39, z40), false, 12582911);
                            }
                        });
                        return Unit.f46060a;
                    }
                }
            } else {
                pair = new Pair(((ser0) D()).w.x, Boolean.valueOf(iqtVar.f15225a.a()));
                z7 = z6;
                z8 = z2;
                z9 = z3;
                z10 = z;
                str = (String) pair.f46059a;
                zBooleanValue = ((Boolean) pair.b).booleanValue();
                nfr0Var.o = wcbVar;
                nfr0Var.p = str;
                nfr0Var.i = z10;
                nfr0Var.j = z9;
                nfr0Var.k = z8;
                nfr0Var.l = z7;
                nfr0Var.m = z5;
                nfr0Var.n = zBooleanValue;
                nfr0Var.s = 4;
                objC = this.m0.c(nfr0Var);
                if (objC != wneVar) {
                    str2 = str;
                    z13 = z10;
                    wcbVar3 = wcbVar;
                    obj = objC;
                    z14 = z5;
                    z15 = zBooleanValue;
                    final List list6 = (List) obj;
                    H(new Function2() { // from class: a.bfr0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            ser0 ser0Var = (ser0) obj3;
                            ((oyg0) obj2).getClass();
                            ser0Var.getClass();
                            xdr0 xdr0Var = ser0Var.w;
                            boolean z23 = Intrinsics.d(str2, "AX") && !z15;
                            int i3 = xdr0Var.f;
                            boolean z24 = xdr0Var.g;
                            boolean z25 = xdr0Var.h;
                            boolean z26 = xdr0Var.i;
                            boolean z27 = xdr0Var.j;
                            boolean z28 = xdr0Var.k;
                            boolean z29 = xdr0Var.l;
                            boolean z210 = xdr0Var.m;
                            boolean z211 = xdr0Var.n;
                            boolean z30 = xdr0Var.o;
                            boolean z31 = xdr0Var.p;
                            boolean z32 = xdr0Var.q;
                            boolean z33 = xdr0Var.r;
                            lq5 lq5Var = xdr0Var.t;
                            uql0 uql0Var = xdr0Var.u;
                            String str4 = xdr0Var.w;
                            String str5 = xdr0Var.x;
                            f3v0 f3v0Var = xdr0Var.y;
                            String str6 = xdr0Var.z;
                            ot0 ot0Var = xdr0Var.A;
                            List list7 = xdr0Var.B;
                            boolean z34 = xdr0Var.D;
                            boolean z35 = xdr0Var.E;
                            Integer num = xdr0Var.F;
                            List list8 = xdr0Var.G;
                            boolean z36 = xdr0Var.H;
                            boolean z37 = xdr0Var.I;
                            boolean z38 = xdr0Var.J;
                            v5l0 v5l0Var = xdr0Var.K;
                            boolean z39 = xdr0Var.L;
                            boolean z40 = xdr0Var.M;
                            List list9 = list6;
                            list9.getClass();
                            list8.getClass();
                            return ser0.a(ser0Var, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new xdr0(z7, z13, z9, z8, z14, i3, z24, z25, z26, z27, z28, z29, z210, z211, z30, z31, z32, z33, z23, lq5Var, uql0Var, wcbVar3, str4, str5, f3v0Var, str6, ot0Var, list7, list9, z34, z35, num, list8, z36, z37, z38, v5l0Var, z39, z40), false, 12582911);
                        }
                    });
                    return Unit.f46060a;
                }
            }
        }
        return wneVar;
    }

    public final void Y(n8r0 n8r0Var) {
        H(new p6r0(n8r0Var, (byte) 7));
    }

    public final void Z() {
        iun iunVar = iun.f15405a;
        d1r0 d1r0Var = d1r0.f5324a;
        V(new t0r0(d1r0Var, iunVar));
        V(new r0r0(d1r0Var, iunVar));
        V(new s0r0(d1r0Var, iunVar));
        T();
        U();
        S();
    }

    public final void a0(ArrayList arrayList) {
        bby bbyVar = this.L0;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.L0 = sac.S(jiu0.a(this), "TopViewModel.updateOneXGamesWorkStatus", this.i0.a(), kotlin.collections.a.c(UnknownHostException.class), new meq0((Object) this, (Object) arrayList, (yje) null, (byte) 14), this.p.b, new afr0(this, (byte) 4));
        }
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        uid uidVarN0;
        ylb0 ylb0Var;
        wxq0 wxq0Var = (wxq0) obj;
        wxq0Var.getClass();
        super.x(wxq0Var);
        yje yjeVar = null;
        if (wxq0Var instanceof ixq0) {
            i3t0.K(this, null, null, new gfr0(this, null), 3);
            return;
        }
        boolean z = wxq0Var instanceof jxq0;
        byte b = 2;
        byte b2 = 0;
        z7z z7zVar = this.s;
        byte b3 = 1;
        if (z) {
            c4m0 c4m0Var = this.T0;
            byte b4 = 25;
            if (c4m0Var == null || !c4m0Var.isActive()) {
                this.T0 = i3t0.L(this, new fnq(this.l0.a(), new z2n0(this, yjeVar, b4), (byte) 4), null, null, 3);
            }
            M();
            this.R0 = i3t0.F(this, this.Z, null, null, new shq0((byte) 28), 119);
            Object obj2 = z7zVar.get();
            obj2.getClass();
            this.O0 = i3t0.F(this, (j3t0) obj2, null, null, new shq0((byte) 29), 119);
            this.Q0 = i3t0.F(this, this.v, null, null, new efr0(b2), 119);
            this.M0 = i3t0.F(this, this.q, null, null, new efr0(b3), 119);
            this.N0 = i3t0.F(this, this.r, null, null, new efr0(b), 119);
            this.P0 = i3t0.F(this, this.u, null, new afr0(this, b2), new shq0(b4), 117);
            Q();
            return;
        }
        boolean z2 = wxq0Var instanceof gxq0;
        ooc oocVar = this.Q;
        if (z2) {
            e3c.n(this.L0);
            e3c.n(this.p0);
            e3c.n(this.T0);
            N();
            M();
            oocVar.getClass();
            return;
        }
        if (wxq0Var instanceof hxq0) {
            E();
            return;
        }
        boolean z3 = wxq0Var instanceof qxq0;
        tjb0 tjb0Var = this.v;
        if (z3) {
            TopSectionKey.Header header = ((qxq0) wxq0Var).f29499a;
            if (Intrinsics.d(header, TopSectionKey$Header$Sport$Games$Live.f47148a)) {
                i3t0.B(this, tjb0Var, new c5l0[]{new r4l0(cmb0.b), new q4l0(y1p.POPULAR_LIVE), new u4l0(m7r0.f21334a)});
                return;
            }
            if (Intrinsics.d(header, TopSectionKey$Header$Sport$Games$Line.f47147a)) {
                i3t0.B(this, tjb0Var, new c5l0[]{new r4l0(cmb0.c), new q4l0(y1p.POPULAR_LINE), new u4l0(m7r0.b)});
                return;
            }
            if (Intrinsics.d(header, TopSectionKey$Header$Sport$Champs$Live.f47146a)) {
                i3t0.B(this, tjb0Var, new c5l0[]{new r4l0(cmb0.f4595a), new q4l0(y1p.CHAMP_LIVE), new v4l0(true)});
                return;
            }
            boolean zD = Intrinsics.d(header, TopSectionKey$Header$Cyber$Disciplines.f47141a);
            alg algVar = this.t;
            if (zD) {
                i3t0.B(this, algVar, new qlg[]{elg.f7995a});
                return;
            }
            if (Intrinsics.d(header, TopSectionKey$Header$Cyber$Games$Live.f47143a)) {
                i3t0.B(this, algVar, new qlg[]{ilg.f14977a});
                return;
            }
            if (Intrinsics.d(header, TopSectionKey$Header$Cyber$Games$Line.f47142a)) {
                i3t0.B(this, algVar, new qlg[]{glg.f11489a});
                return;
            }
            if (Intrinsics.d(header, TopSectionKey$Header$Cyber$Champs$Live.f47140a)) {
                i3t0.B(this, algVar, new qlg[]{hlg.f13259a});
                return;
            }
            if (Intrinsics.d(header, TopSectionKey$Header$Cyber$Champs$Line.f47139a)) {
                i3t0.B(this, algVar, new qlg[]{flg.f9735a});
                return;
            }
            if (header instanceof TopSectionKey.Header.VirtualGames) {
                TopSectionKey.Header.VirtualGames virtualGames = (TopSectionKey.Header.VirtualGames) header;
                i3t0.A(this, this.u, new wj0(virtualGames.f47150a, virtualGames.b), null, null, 6);
                return;
            }
            if (Intrinsics.d(header, TopSectionKey$Header$Aggregator$Recommended.f47136a)) {
                i3t0.A(this, this.u, uj0.f35756a, null, null, 6);
                return;
            }
            if (Intrinsics.d(header, TopSectionKey$Header$Aggregator$Tournaments.f47137a)) {
                i3t0.A(this, this.u, vj0.f37506a, null, null, 6);
                return;
            } else if (header instanceof TopSectionKey$Header$Aggregator$Categories) {
                i3t0.A(this, this.u, tj0.f34029a, null, null, 6);
                return;
            } else {
                if (Intrinsics.d(header, TopSectionKey.Header.BannerTape.f47138a)) {
                    i3t0.A(this, this.Z, syq0.f33035a, null, null, 6);
                    return;
                }
                return;
            }
        }
        if (wxq0Var instanceof rxq0) {
            TopHeaderTagType topHeaderTagType = ((rxq0) wxq0Var).f31278a;
            TopHeaderTagType.SportTag sportTag = TopHeaderTagType.SportTag.f47121a;
            boolean zD2 = Intrinsics.d(topHeaderTagType, sportTag);
            TopHeaderTagType.OneXGamesTag oneXGamesTag = TopHeaderTagType.OneXGamesTag.f47120a;
            TopHeaderTagType.AggregatorTag aggregatorTag = TopHeaderTagType.AggregatorTag.f47118a;
            TopHeaderTagType.CyberTag cyberTag = TopHeaderTagType.CyberTag.f47119a;
            gg5 gg5Var = this.b0;
            zg zgVar = this.a0;
            if (zD2) {
                i8i.D("point", "sport", zgVar.f44322a, "popular_category_click");
                b1j.v("sport", gg5Var.f11237a, 11099L);
            } else if (Intrinsics.d(topHeaderTagType, cyberTag)) {
                i8i.D("point", "cyber", zgVar.f44322a, "popular_category_click");
                b1j.v("cyber", gg5Var.f11237a, 11099L);
            } else if (Intrinsics.d(topHeaderTagType, aggregatorTag)) {
                i8i.D("point", "aggregator", zgVar.f44322a, "popular_category_click");
                b1j.v("aggregator", gg5Var.f11237a, 11099L);
            } else if (!Intrinsics.d(topHeaderTagType, oneXGamesTag)) {
                t9f.b();
                return;
            } else {
                i8i.D("point", "games", zgVar.f44322a, "popular_category_click");
                b1j.v("games", gg5Var.f11237a, 11099L);
            }
            if (Intrinsics.d(topHeaderTagType, sportTag)) {
                ylb0Var = wlb0.f39346a;
            } else if (Intrinsics.d(topHeaderTagType, oneXGamesTag)) {
                ylb0Var = vlb0.f37614a;
            } else if (Intrinsics.d(topHeaderTagType, aggregatorTag)) {
                ylb0Var = tlb0.f34134a;
            } else {
                if (!Intrinsics.d(topHeaderTagType, cyberTag)) {
                    t9f.b();
                    return;
                }
                ylb0Var = ulb0.f35864a;
            }
            G(new ydr0(ylb0Var));
            return;
        }
        if (wxq0Var instanceof oxq0) {
            i3t0.B(this, this.Z, new uyq0[]{((oxq0) wxq0Var).f26025a});
            return;
        }
        if (wxq0Var instanceof vxq0) {
            i3t0.B(this, tjb0Var, new c5l0[]{((vxq0) wxq0Var).f38214a});
            return;
        }
        if (!(wxq0Var instanceof nxq0)) {
            if (wxq0Var instanceof pxq0) {
                i3t0.A(this, this.t, ((pxq0) wxq0Var).f27765a, null, null, 6);
                return;
            }
            if (wxq0Var instanceof txq0) {
                i3t0.B(this, this.r, new aw60[]{((txq0) wxq0Var).f34714a});
                return;
            }
            if (wxq0Var instanceof uxq0) {
                i3t0.B(this, this.q, new e470[]{((uxq0) wxq0Var).f36454a});
                return;
            }
            if (wxq0Var instanceof kxq0) {
                i3t0.B(this, this.u, new jk0[]{((kxq0) wxq0Var).f19069a});
                return;
            }
            if (!wxq0Var.equals(sxq0.f32991a)) {
                t9f.b();
                return;
            }
            e3c.n(this.L0);
            e3c.n(this.p0);
            e3c.n(this.T0);
            N();
            M();
            oocVar.getClass();
            H(new shq0((byte) 27));
            Q();
            return;
        }
        nxq0 nxq0Var = (nxq0) wxq0Var;
        if (nxq0Var instanceof mxq0) {
            uidVarN0 = ebc.n0(((mxq0) wxq0Var).f22571a);
        } else {
            if (!(nxq0Var instanceof lxq0)) {
                t9f.b();
                return;
            }
            uidVarN0 = ((lxq0) wxq0Var).f20828a;
        }
        Object obj3 = z7zVar.get();
        obj3.getClass();
        j3t0 j3t0Var = (j3t0) obj3;
        ser0 ser0Var = (ser0) D();
        ser0Var.getClass();
        ArrayList arrayListQ0 = CollectionsKt.q0(ser0Var.f.c, ser0Var.g.c);
        List list = ser0Var.r.c;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            w3d.u(arrayList, ((eih) it.next()).e);
        }
        ArrayList arrayListQ1 = CollectionsKt.q0(arrayListQ0, arrayList);
        List list2 = ser0Var.s.c;
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            w3d.u(arrayList2, ((eih) it2.next()).e);
        }
        i3t0.B(this, j3t0Var, new vid[]{new did(CollectionsKt.q0(arrayListQ1, arrayList2)), uidVarN0});
    }
}

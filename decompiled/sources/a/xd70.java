package a;

import android.content.SharedPreferences;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import com.huawei.hms.push.AttributionReporter;
import java.io.Serializable;
import java.net.ConnectException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class xd70 extends i3t0 {
    public static final /* synthetic */ int B0 = 0;
    public final z7z A;
    public bby A0;
    public final z7z B;
    public final z7z C;
    public final z7z D;
    public final z7z E;
    public final z7z F;
    public final z7z G;
    public final z7z H;
    public final z7z I;
    public final z7z J;
    public final z7z K;
    public final z7z L;
    public final z7z M;
    public final z7z N;
    public final z7z O;
    public final z7z P;
    public final z7z Q;
    public final z7z R;
    public final z7z S;
    public final z7z T;
    public final z7z U;
    public final z7z V;
    public final z7z W;
    public final z7z X;
    public final z7z Y;
    public final z7z Z;
    public final z7z a0;
    public final z7z b0;
    public final z7z c0;
    public final z7z d0;
    public final cmt e0;
    public final z7z f0;
    public final mne g0;
    public final z7z h0;
    public final ctf0 i0;
    public final z7z j0;
    public final ea70 k0;
    public c4m0 l0;
    public c4m0 m0;
    public bby n0;
    public final vzg0 o;
    public bby o0;
    public final oeg0 p;
    public bby p0;
    public final i1w0 q;
    public bby q0;
    public final ouu r;
    public bby r0;
    public final z7z s;
    public bby s0;
    public final z7z t;
    public bby t0;
    public final z7z u;
    public bby u0;
    public final z7z v;
    public bby v0;
    public final z7z w;
    public bby w0;
    public final z7z x;
    public bby x0;
    public final z7z y;
    public bby y0;
    public final z7z z;
    public final bby z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xd70(vzg0 vzg0Var, oeg0 oeg0Var, i1w0 i1w0Var, ouu ouuVar, z7z z7zVar, z7z z7zVar2, z7z z7zVar3, z7z z7zVar4, z7z z7zVar5, z7z z7zVar6, z7z z7zVar7, z7z z7zVar8, z7z z7zVar9, z7z z7zVar10, z7z z7zVar11, z7z z7zVar12, z7z z7zVar13, z7z z7zVar14, z7z z7zVar15, z7z z7zVar16, z7z z7zVar17, z7z z7zVar18, z7z z7zVar19, z7z z7zVar20, z7z z7zVar21, z7z z7zVar22, z7z z7zVar23, z7z z7zVar24, z7z z7zVar25, z7z z7zVar26, z7z z7zVar27, z7z z7zVar28, z7z z7zVar29, z7z z7zVar30, z7z z7zVar31, z7z z7zVar32, z7z z7zVar33, z7z z7zVar34, z7z z7zVar35, z7z z7zVar36, z7z z7zVar37, z7z z7zVar38, z7z z7zVar39, z7z z7zVar40, cmt cmtVar, z7z z7zVar41, mne mneVar, z7z z7zVar42, ctf0 ctf0Var, z7z z7zVar43) {
        super(new ws3(z7zVar36, (byte) 3), cvm0.p(mneVar.c, mneVar.f22085a), new v510(ctf0Var, (byte) 27), (yzn0) null);
        oeg0Var.getClass();
        z7zVar.getClass();
        z7zVar2.getClass();
        z7zVar3.getClass();
        z7zVar4.getClass();
        z7zVar5.getClass();
        z7zVar6.getClass();
        z7zVar7.getClass();
        z7zVar8.getClass();
        z7zVar9.getClass();
        z7zVar10.getClass();
        z7zVar11.getClass();
        z7zVar12.getClass();
        z7zVar13.getClass();
        z7zVar14.getClass();
        z7zVar15.getClass();
        z7zVar16.getClass();
        z7zVar17.getClass();
        z7zVar18.getClass();
        z7zVar19.getClass();
        z7zVar20.getClass();
        z7zVar21.getClass();
        z7zVar22.getClass();
        z7zVar23.getClass();
        z7zVar24.getClass();
        z7zVar25.getClass();
        z7zVar26.getClass();
        z7zVar27.getClass();
        z7zVar28.getClass();
        z7zVar29.getClass();
        z7zVar30.getClass();
        z7zVar31.getClass();
        z7zVar32.getClass();
        z7zVar33.getClass();
        z7zVar34.getClass();
        z7zVar35.getClass();
        z7zVar36.getClass();
        z7zVar37.getClass();
        z7zVar38.getClass();
        z7zVar39.getClass();
        z7zVar40.getClass();
        z7zVar41.getClass();
        z7zVar42.getClass();
        ctf0Var.getClass();
        z7zVar43.getClass();
        yje yjeVar = null;
        this.o = vzg0Var;
        this.p = oeg0Var;
        this.q = i1w0Var;
        this.r = ouuVar;
        this.s = z7zVar;
        this.t = z7zVar2;
        this.u = z7zVar3;
        this.v = z7zVar4;
        this.w = z7zVar5;
        this.x = z7zVar6;
        this.y = z7zVar7;
        this.z = z7zVar8;
        this.A = z7zVar9;
        this.B = z7zVar10;
        this.C = z7zVar11;
        this.D = z7zVar12;
        this.E = z7zVar13;
        this.F = z7zVar14;
        this.G = z7zVar15;
        this.H = z7zVar16;
        this.I = z7zVar17;
        this.J = z7zVar18;
        this.K = z7zVar19;
        this.L = z7zVar20;
        this.M = z7zVar21;
        this.N = z7zVar22;
        this.O = z7zVar23;
        this.P = z7zVar25;
        this.Q = z7zVar26;
        this.R = z7zVar27;
        this.S = z7zVar28;
        this.T = z7zVar29;
        this.U = z7zVar30;
        this.V = z7zVar31;
        this.W = z7zVar32;
        this.X = z7zVar33;
        this.Y = z7zVar34;
        this.Z = z7zVar35;
        this.a0 = z7zVar37;
        this.b0 = z7zVar38;
        this.c0 = z7zVar39;
        this.d0 = z7zVar40;
        this.e0 = cmtVar;
        this.f0 = z7zVar41;
        this.g0 = mneVar;
        this.h0 = z7zVar42;
        this.i0 = ctf0Var;
        this.j0 = z7zVar43;
        byte b = 0;
        this.k0 = new ea70((byte) 0);
        String str = (String) vzg0Var.a("OneXGamesWebGame.BUNDLE_SESSION_ID");
        str = str == null ? "" : str;
        Boolean bool = (Boolean) vzg0Var.a("OneXGamesWebGame.BUNDLE_PROMO_GAME");
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        Boolean bool2 = (Boolean) vzg0Var.a("OneXGamesWebGame.BUNDLE_FULL_SCREEN");
        boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : false;
        Long l = (Long) vzg0Var.a("OneXGamesWebGame.BUNDLE_GAME_ID");
        long jLongValue = l != null ? l.longValue() : -1L;
        csr csrVar = (csr) vzg0Var.a("OneXGamesWebGame.BUNDLE_GAME_BONUS");
        csrVar = csrVar == null ? csr.e : csrVar;
        Boolean bool3 = (Boolean) vzg0Var.a("OneXGamesWebGame.BUNDLE_DEMO_ENABLED");
        boolean zBooleanValue3 = bool3 != null ? bool3.booleanValue() : false;
        Boolean bool4 = (Boolean) vzg0Var.a("OneXGamesWebGame.BUNDLE_DEMO_DIALOG_VISIBLE");
        boolean zBooleanValue4 = bool4 != null ? bool4.booleanValue() : false;
        vti0 vti0Var = (vti0) z7zVar24.get();
        vti0Var.f38009a.b.f31523a = jLongValue;
        vti0Var.b.f26724a.m.add(Long.valueOf(jLongValue));
        final boolean z = zBooleanValue4;
        final String str2 = str;
        final boolean z2 = zBooleanValue;
        final boolean z3 = zBooleanValue2;
        final long j = jLongValue;
        final csr csrVar2 = csrVar;
        final boolean z4 = zBooleanValue3;
        final b970 b970Var = csrVar.a() ? b970.c : b970.f2195a;
        H(new Function2() { // from class: a.yc70
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                xb70 xb70Var = (xb70) obj2;
                ((oyg0) obj).getClass();
                xb70Var.getClass();
                fa70 fa70VarA = fa70.a(xb70Var.n, z3, false, false, false, j, z2, false, false, 206);
                boolean z5 = false;
                c970 c970VarA = c970.a(xb70Var.p, false, csrVar2, b970Var, 9);
                f970 f970Var = xb70Var.o;
                boolean z6 = z4;
                if (z6 && z) {
                    z5 = true;
                }
                return xb70.a(xb70Var, null, str2, null, false, false, false, false, false, null, false, false, 0, false, fa70VarA, f970.a(f970Var, false, z6, false, 0.0d, false, z5, z6, 29), c970VarA, null, 73725);
            }
        });
        bby bbyVar = this.z0;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.z0 = sac.V(jiu0.a(this), new cy60(1, this, xd70.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 16), null, mneVar.b, new dd70(this, yjeVar, b), 10);
        }
        G(new ra70(((j1q0) z7zVar4.get()).f15748a.b(), mneVar));
    }

    public final void M(ql5 ql5Var) {
        jgr jgrVar = new jgr(ql5Var.f28916a);
        z7z z7zVar = this.j0;
        Object obj = z7zVar.get();
        obj.getClass();
        m0(jgrVar.a((vby) obj));
        mgr mgrVar = new mgr(ql5Var.b, ql5Var.f28916a);
        Object obj2 = z7zVar.get();
        obj2.getClass();
        m0(mgrVar.a((vby) obj2));
    }

    public final void N(csr csrVar) {
        pir pirVar;
        if (csrVar.a()) {
            pirVar = null;
        } else {
            bsr bsrVar = csrVar.f4905a;
            pirVar = new pir(bsrVar.f3145a.f8344a, Long.valueOf(((xb70) D()).n.e), Double.valueOf(bsrVar.c));
        }
        ygr ygrVar = new ygr(pirVar);
        Object obj = this.j0.get();
        obj.getClass();
        m0(ygrVar.a((vby) obj));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object O(zje zjeVar) {
        ad70 ad70Var;
        Object value;
        xb70 xb70Var;
        if (zjeVar instanceof ad70) {
            ad70Var = (ad70) zjeVar;
            int i = ad70Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                ad70Var.k = i - Integer.MIN_VALUE;
            } else {
                ad70Var = new ad70(this, zjeVar);
            }
        } else {
            ad70Var = new ad70(this, zjeVar);
        }
        Object objA = ad70Var.i;
        wne wneVar = wne.f39444a;
        int i2 = ad70Var.k;
        if (i2 == 0) {
            z1x.P(objA);
            j6v j6vVar = (j6v) this.V.get();
            ql5 ql5Var = ((xb70) D()).q.e;
            ad70Var.k = 1;
            objA = j6vVar.a(ql5Var, ad70Var);
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
        boolean zBooleanValue = ((Boolean) objA).booleanValue();
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            xb70Var = (xb70) value;
            this.f.getClass();
        } while (!p7m0Var.m(value, xb70.a(xb70Var, null, null, null, false, false, false, false, false, null, false, false, 0, false, null, null, c970.a(xb70Var.p, zBooleanValue, null, null, 14), null, 98303)));
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0078, code lost:
    
        if (r9 == r1) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object P(a.zje r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof a.bd70
            if (r0 == 0) goto L13
            r0 = r9
            a.bd70 r0 = (a.bd70) r0
            int r1 = r0.m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.m = r1
            goto L18
        L13:
            a.bd70 r0 = new a.bd70
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.k
            a.wne r1 = a.wne.f39444a
            int r2 = r0.m
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L39
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2b
            a.z1x.P(r9)
            goto L7b
        L2b:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r8)
            return r5
        L31:
            a.bm5 r2 = r0.j
            a.bsu r4 = r0.i
            a.z1x.P(r9)
            goto L6c
        L39:
            a.z1x.P(r9)
            a.z7z r9 = r8.O
            java.lang.Object r9 = r9.get()
            r9.getClass()
            a.bsu r9 = (a.bsu) r9
            java.lang.Object r2 = r8.D()
            a.xb70 r2 = (a.xb70) r2
            a.z870 r2 = r2.q
            a.bm5 r2 = r2.b
            a.z7z r6 = r8.N
            java.lang.Object r6 = r6.get()
            r6.getClass()
            a.urt r6 = (a.urt) r6
            r0.i = r9
            r0.j = r2
            r0.m = r4
            java.lang.Object r4 = a.urt.a(r6, r0)
            if (r4 != r1) goto L69
            goto L7a
        L69:
            r7 = r4
            r4 = r9
            r9 = r7
        L6c:
            java.util.List r9 = (java.util.List) r9
            r0.i = r5
            r0.j = r5
            r0.m = r3
            java.util.ArrayList r9 = a.bsu.b(r4, r2, r9, r0)
            if (r9 != r1) goto L7b
        L7a:
            return r1
        L7b:
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            boolean r0 = r9 instanceof java.util.Collection
            r1 = 0
            if (r0 == 0) goto L8d
            r0 = r9
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L8d
            r0 = r1
            goto Lbb
        L8d:
            java.util.Iterator r9 = r9.iterator()
            r0 = r1
        L92:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto Lbb
            java.lang.Object r2 = r9.next()
            a.ql5 r2 = (a.ql5) r2
            java.lang.Object r3 = r8.D()
            a.xb70 r3 = (a.xb70) r3
            a.z870 r3 = r3.q
            boolean r3 = r3.c
            if (r3 != 0) goto Lb2
            a.txs0 r2 = r2.i
            boolean r2 = r2.b()
            if (r2 != 0) goto L92
        Lb2:
            int r0 = r0 + 1
            if (r0 < 0) goto Lb7
            goto L92
        Lb7:
            a.q3d.o()
            throw r5
        Lbb:
            a.u49 r9 = new a.u49
            r2 = 20
            r9.<init>(r2, r0, r1)
            r8.H(r9)
            kotlin.Unit r8 = kotlin.Unit.f46060a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a.xd70.P(a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object Q(long j, zje zjeVar, csr csrVar) {
        ed70 ed70Var;
        long j2;
        oct octVar;
        long j3;
        csr csrVar2;
        if (zjeVar instanceof ed70) {
            ed70Var = (ed70) zjeVar;
            int i = ed70Var.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                ed70Var.n = i - Integer.MIN_VALUE;
            } else {
                ed70Var = new ed70(this, zjeVar);
            }
        } else {
            ed70Var = new ed70(this, zjeVar);
        }
        Object objA = ed70Var.l;
        wne wneVar = wne.f39444a;
        int i2 = ed70Var.n;
        z7z z7zVar = this.s;
        if (i2 == 0) {
            z1x.P(objA);
            ycu ycuVar = (ycu) this.D.get();
            ed70Var.i = csrVar;
            ed70Var.k = j;
            ed70Var.n = 1;
            objA = ycuVar.a(j, ed70Var);
            if (objA != wneVar) {
            }
            return wneVar;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                j3 = ed70Var.k;
                csrVar2 = ed70Var.i;
                z1x.P(objA);
                return ((oct) z7zVar.get()).a(j3, csrVar2, (String) objA);
            }
            if (i2 != 3) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            long j4 = ed70Var.k;
            oct octVar2 = ed70Var.j;
            csrVar = ed70Var.i;
            z1x.P(objA);
            j2 = j4;
            octVar = octVar2;
            csr csrVar3 = csrVar;
            boolean zBooleanValue = ((Boolean) objA).booleanValue();
            String string = UUID.randomUUID().toString();
            string.getClass();
            return octVar.b(j2, csrVar3, zBooleanValue, string);
        }
        j = ed70Var.k;
        csrVar = ed70Var.i;
        z1x.P(objA);
        a570 a570Var = (a570) objA;
        if (a570Var != null) {
            if (a570Var instanceof w470) {
                ucu ucuVar = (ucu) this.E.get();
                ed70Var.i = csrVar;
                ed70Var.k = j;
                ed70Var.n = 2;
                objA = ucuVar.a(j, ed70Var);
                if (objA != wneVar) {
                    j3 = j;
                    csrVar2 = csrVar;
                    return ((oct) z7zVar.get()).a(j3, csrVar2, (String) objA);
                }
            } else if (a570Var instanceof z470) {
                Object obj = z7zVar.get();
                obj.getClass();
                oct octVar3 = (oct) obj;
                dcu dcuVar = (dcu) this.C.get();
                ed70Var.i = csrVar;
                ed70Var.j = octVar3;
                ed70Var.k = j;
                ed70Var.n = 3;
                Object objA2 = dcuVar.a(j, ed70Var);
                if (objA2 != wneVar) {
                    j2 = j;
                    octVar = octVar3;
                    objA = objA2;
                    csr csrVar4 = csrVar;
                    boolean zBooleanValue2 = ((Boolean) objA).booleanValue();
                    String string2 = UUID.randomUUID().toString();
                    string2.getClass();
                    return octVar.b(j2, csrVar4, zBooleanValue2, string2);
                }
            }
            return wneVar;
        }
        t9f.b();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00db, code lost:
    
        if (r11 == r1) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable R(a.zje r11) {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.xd70.R(a.zje):java.io.Serializable");
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:41:0x00db A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:42:0x00dc A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:45:0x00d6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:? A[LOOP:0: B:34:0x00c1->B:46:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable S(zje zjeVar) {
        gd70 gd70Var;
        ql5 ql5Var;
        bm5 bm5Var;
        Object obj;
        bsu bsuVar;
        ArrayList arrayListB;
        ql5 ql5Var2;
        ql5 ql5Var3;
        if (zjeVar instanceof gd70) {
            gd70Var = (gd70) zjeVar;
            int i = gd70Var.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                gd70Var.n = i - Integer.MIN_VALUE;
            } else {
                gd70Var = new gd70(this, zjeVar);
            }
        } else {
            gd70Var = new gd70(this, zjeVar);
        }
        Object objA = gd70Var.l;
        wne wneVar = wne.f39444a;
        int i2 = gd70Var.n;
        Object obj2 = null;
        if (i2 == 0) {
            z1x.P(objA);
            Object obj3 = this.J.get();
            obj3.getClass();
            gd70Var.n = 1;
            objA = ((nou) obj3).a(tl5.c, gd70Var);
            if (objA != wneVar) {
            }
            return wneVar;
        }
        if (i2 == 1) {
            z1x.P(objA);
        } else {
            if (i2 == 2) {
                bsuVar = gd70Var.k;
                bm5 bm5Var2 = gd70Var.j;
                ql5 ql5Var4 = gd70Var.i;
                z1x.P(objA);
                bm5Var = bm5Var2;
                obj = objA;
                ql5Var = ql5Var4;
                gd70Var.i = ql5Var;
                gd70Var.j = null;
                gd70Var.k = null;
                gd70Var.n = 3;
                arrayListB = bsu.b(bsuVar, bm5Var, (List) obj, gd70Var);
                if (arrayListB != wneVar) {
                    ql5 ql5Var5 = ql5Var;
                    objA = arrayListB;
                    ql5Var2 = ql5Var5;
                }
                return wneVar;
            }
            if (i2 != 3) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ql5Var2 = gd70Var.i;
            z1x.P(objA);
        }
        for (Object obj4 : (Iterable) objA) {
            if (!((ql5) obj4).i.a()) {
                obj2 = obj4;
                break;
            }
        }
        ql5Var3 = (ql5) obj2;
        if (ql5Var3 == null) {
            return ql5Var2;
        }
        return ql5Var3;
        ql5Var = (ql5) objA;
        if (!ql5Var.i.a() || ((xb70) D()).q.c) {
            return ql5Var;
        }
        Object obj5 = this.O.get();
        obj5.getClass();
        bsu bsuVar2 = (bsu) obj5;
        bm5Var = ((xb70) D()).q.b;
        Object obj6 = this.N.get();
        obj6.getClass();
        gd70Var.i = ql5Var;
        gd70Var.j = bm5Var;
        gd70Var.k = bsuVar2;
        gd70Var.n = 2;
        Object objA2 = urt.a((urt) obj6, gd70Var);
        if (objA2 != wneVar) {
            obj = objA2;
            bsuVar = bsuVar2;
            gd70Var.i = ql5Var;
            gd70Var.j = null;
            gd70Var.k = null;
            gd70Var.n = 3;
            arrayListB = bsu.b(bsuVar, bm5Var, (List) obj, gd70Var);
            if (arrayListB != wneVar) {
                ql5 ql5Var6 = ql5Var;
                objA = arrayListB;
                ql5Var2 = ql5Var6;
                while (r9.hasNext()) {
                    if (!((ql5) obj4).i.a()) {
                        obj2 = obj4;
                        break;
                    }
                }
                ql5Var3 = (ql5) obj2;
                if (ql5Var3 == null) {
                    return ql5Var2;
                }
                return ql5Var3;
            }
        }
        return wneVar;
    }

    public final void T(Throwable th) {
        if (((xb70) D()).n.f && (hic.C(th) || (th instanceof ConnectException))) {
            r0();
        }
        ((duj) this.h0.get()).b(th, new zc70((byte) 2));
    }

    public final void U(mir mirVar) {
        m0(mirVar.b(new Pair[0]));
    }

    public final void V(a870 a870Var) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        Object value5;
        Object value6;
        Object value7;
        Object value8;
        boolean z = a870Var instanceof b770;
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        if (z) {
            p7m0 p7m0Var = ocjVar.f25029a;
            do {
                value8 = p7m0Var.getValue();
                value8.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var.m(value8, xb70.a((xb70) value8, null, null, null, true, false, false, false, false, null, false, false, 0, false, null, null, null, null, 131063)));
            if (((xb70) D()).n.b) {
                return;
            }
            t0();
            return;
        }
        if (a870Var instanceof a770) {
            l0();
            G(sa70.f31878a);
            return;
        }
        boolean z2 = a870Var instanceof z670;
        byte b = 0;
        yje yjeVar = null;
        i1w0 i1w0Var = this.q;
        if (z2) {
            l0();
            i1w0Var.getClass();
            CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
            ListIterator listIteratorP = b1j.p(copyOnWriteArrayList, new c8d(y7d.f42146a, new q0w0(null)), i1w0Var, copyOnWriteArrayList, 0);
            while (true) {
                paw pawVar = (paw) listIteratorP;
                if (!pawVar.hasNext()) {
                    return;
                } else {
                    i1w0Var.a((oe50) pawVar.next());
                }
            }
        } else {
            if ((a870Var instanceof v770) || (a870Var instanceof d770) || (a870Var instanceof w770) || (a870Var instanceof f770)) {
                if (((xb70) D()).n.b) {
                    return;
                }
                t0();
                return;
            }
            if (a870Var instanceof l770) {
                if (((xb70) D()).h) {
                    return;
                }
                l0();
                p7m0 p7m0Var2 = ocjVar.f25029a;
                do {
                    value7 = p7m0Var2.getValue();
                    value7.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var2.m(value7, xb70.a((xb70) value7, null, null, null, false, false, false, false, false, x870.b, false, false, 0, false, null, null, null, null, 130815)));
                i1w0Var.d(new wk60((byte) 9));
                return;
            }
            if (a870Var instanceof m770) {
                if (((xb70) D()).h) {
                    return;
                }
                l0();
                p7m0 p7m0Var3 = ocjVar.f25029a;
                do {
                    value6 = p7m0Var3.getValue();
                    value6.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var3.m(value6, xb70.a((xb70) value6, null, null, null, false, false, false, false, false, x870.b, false, false, 0, false, null, null, null, null, 130815)));
                i1w0Var.d(new wk60((byte) 11));
                return;
            }
            if (a870Var instanceof e770) {
                if (((xb70) D()).q.d || ((xb70) D()).o.b) {
                    return;
                }
                G(new va70(((xb70) D()).q.b, ((xb70) D()).q.c));
                return;
            }
            byte b2 = 1;
            if (a870Var instanceof s770) {
                if (!((xb70) D()).h) {
                    G(cb70.f4048a);
                    return;
                }
                if (((xb70) D()).o.b) {
                    G(eb70.f7506a);
                    return;
                } else {
                    if (((xb70) D()).q.d) {
                        return;
                    }
                    l0();
                    Y();
                    ((v88) this.u.get()).a(i1w0Var, true, ((xb70) D()).q.e.f28916a);
                    return;
                }
            }
            boolean z3 = a870Var instanceof n770;
            p0w0 p0w0Var = p0w0.f26173a;
            if (z3) {
                l0();
                i1w0Var.getClass();
                CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList();
                ListIterator listIteratorP2 = b1j.p(copyOnWriteArrayList2, new c8d(y7d.f42146a, p0w0Var), i1w0Var, copyOnWriteArrayList2, 0);
                while (true) {
                    paw pawVar2 = (paw) listIteratorP2;
                    if (!pawVar2.hasNext()) {
                        return;
                    } else {
                        i1w0Var.a((oe50) pawVar2.next());
                    }
                }
            } else {
                if (a870Var instanceof o770) {
                    if (((xb70) D()).h) {
                        return;
                    }
                    l0();
                    p7m0 p7m0Var4 = ocjVar.f25029a;
                    do {
                        value5 = p7m0Var4.getValue();
                        value5.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var4.m(value5, xb70.a((xb70) value5, null, null, null, false, false, false, false, false, x870.b, false, false, 0, false, null, null, null, null, 130815)));
                    i1w0Var.d(new wk60((byte) 7));
                    return;
                }
                if (a870Var instanceof p770) {
                    if (((xb70) D()).h) {
                        return;
                    }
                    l0();
                    p7m0 p7m0Var5 = ocjVar.f25029a;
                    do {
                        value4 = p7m0Var5.getValue();
                        value4.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var5.m(value4, xb70.a((xb70) value4, null, null, null, false, false, false, false, false, x870.b, false, false, 0, false, null, null, null, null, 130815)));
                    i1w0Var.d(new wk60((byte) 13));
                    return;
                }
                boolean z4 = a870Var instanceof j770;
                mne mneVar = this.g0;
                if (z4) {
                    bby bbyVar = this.t0;
                    if (bbyVar == null || !bbyVar.isActive()) {
                        j0(false);
                        H(new cr60((byte) 23));
                        this.t0 = sac.V(jiu0.a(this), new cy60(1, this, xd70.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 20), null, mneVar.b, new id70(this, yjeVar, b), 10);
                        return;
                    }
                    return;
                }
                boolean z5 = a870Var instanceof i770;
                vzg0 vzg0Var = this.o;
                if (z5) {
                    if (!((xb70) D()).o.g || W()) {
                        vzg0Var.e("OneXGamesWebGame.BUNDLE_DEMO_DIALOG_VISIBLE", Boolean.FALSE);
                        H(new cr60((byte) 26));
                        return;
                    }
                    return;
                }
                if (a870Var instanceof h770) {
                    j0(true);
                    H(new zc70((byte) 4));
                    N(csr.e);
                    pgr pgrVar = new pgr(true, ((xb70) D()).n.e);
                    Object obj = this.j0.get();
                    obj.getClass();
                    m0(pgrVar.a((vby) obj));
                    return;
                }
                byte b3 = 24;
                if (a870Var instanceof g770) {
                    j0(false);
                    H(new cr60((byte) 24));
                    if (((xb70) D()).h) {
                        return;
                    }
                    l0();
                    i1w0Var.getClass();
                    CopyOnWriteArrayList copyOnWriteArrayList3 = new CopyOnWriteArrayList();
                    ListIterator listIteratorP3 = b1j.p(copyOnWriteArrayList3, new c8d(y7d.f42146a, p0w0Var), i1w0Var, copyOnWriteArrayList3, 0);
                    while (true) {
                        paw pawVar3 = (paw) listIteratorP3;
                        if (!pawVar3.hasNext()) {
                            return;
                        } else {
                            i1w0Var.a((oe50) pawVar3.next());
                        }
                    }
                } else {
                    if (a870Var instanceof k770) {
                        bby bbyVar2 = this.w0;
                        if (bbyVar2 == null || !bbyVar2.isActive()) {
                            this.w0 = sac.V(jiu0.a(this), new cy60(1, this, xd70.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 21), null, mneVar.b, new jd70(this, yjeVar, b), 10);
                            return;
                        }
                        return;
                    }
                    if (a870Var instanceof y770) {
                        int i = ((y770) a870Var).f42139a;
                        if (i != 1) {
                            if (i != 2) {
                                return;
                            }
                            l0();
                            i1w0Var.d(new wc70(this, b));
                            return;
                        }
                        if (!((xb70) D()).o.b && !((xb70) D()).p.b.a()) {
                            G(ab70.f566a);
                            return;
                        }
                        if (!((xb70) D()).o.b) {
                            j0(true);
                            H(new cr60((byte) 27));
                            n0();
                            return;
                        } else {
                            if (!((xb70) D()).o.g) {
                                q0();
                                return;
                            }
                            vzg0Var.e("OneXGamesWebGame.BUNDLE_DEMO_DIALOG_VISIBLE", Boolean.TRUE);
                            H(new cr60((byte) 28));
                            n0();
                            k0();
                            return;
                        }
                    }
                    if (a870Var instanceof t770) {
                        p7m0 p7m0Var6 = ocjVar.f25029a;
                        do {
                            value3 = p7m0Var6.getValue();
                            value3.getClass();
                            oyg0Var.getClass();
                        } while (!p7m0Var6.m(value3, xb70.a((xb70) value3, null, null, null, false, false, false, false, false, null, false, false, 0, false, null, null, null, null, 126975)));
                        l0();
                        i1w0Var.getClass();
                        CopyOnWriteArrayList copyOnWriteArrayList4 = new CopyOnWriteArrayList();
                        ListIterator listIteratorP4 = b1j.p(copyOnWriteArrayList4, new c8d(y7d.f42146a, p0w0Var), i1w0Var, copyOnWriteArrayList4, 0);
                        while (true) {
                            paw pawVar4 = (paw) listIteratorP4;
                            if (!pawVar4.hasNext()) {
                                return;
                            } else {
                                i1w0Var.a((oe50) pawVar4.next());
                            }
                        }
                    } else {
                        if (a870Var instanceof u770) {
                            bby bbyVar3 = this.x0;
                            if (bbyVar3 == null || !bbyVar3.isActive()) {
                                if (((xb70) D()).g) {
                                    p7m0 p7m0Var7 = ocjVar.f25029a;
                                    do {
                                        value2 = p7m0Var7.getValue();
                                        value2.getClass();
                                        oyg0Var.getClass();
                                    } while (!p7m0Var7.m(value2, xb70.a((xb70) value2, null, null, null, false, false, false, false, false, null, false, false, 0, false, null, null, null, null, 126975)));
                                }
                                this.x0 = sac.V(jiu0.a(this), null, null, mneVar.c, new id70(this, yjeVar, b2), 11);
                                return;
                            }
                            return;
                        }
                        if (a870Var instanceof c770) {
                            if (!((xb70) D()).n.c) {
                                int i2 = (int) ((xb70) D()).n.e;
                                String str = ((xb70) D()).b;
                                gw60 gw60Var = (gw60) this.b0.get();
                                gw60Var.getClass();
                                gw60Var.f12011a.a(tx3.l0(new k1p[]{new i1p(i2, (byte) 2), new j1p(str, (byte) 0)}), 12077L);
                                hs60 hs60Var = (hs60) this.c0.get();
                                hs60Var.getClass();
                                hs60Var.f13566a.a("load_back_call", xp20.f(new Pair("game_id", Integer.valueOf(i2)), new Pair("session_id", str)));
                            }
                            boolean z6 = ((xb70) D()).n.d;
                            boolean zA = ((xb70) D()).p.b.a();
                            boolean z7 = ((xb70) D()).p.c == b970.f2195a;
                            if (!z6 && !zA && z7) {
                                G(new ta70(((xb70) D()).p.b));
                            }
                            if (((xb70) D()).n.d && ((SharedPreferences) ((jj50) this.A.get()).f16606a.d.f20589a).getBoolean("SHOW_GAME_IS_NOT_FINISHED_DIALOG", true)) {
                                G(jb70.f16225a);
                                return;
                            }
                            l0();
                            i1w0Var.getClass();
                            CopyOnWriteArrayList copyOnWriteArrayList5 = new CopyOnWriteArrayList();
                            ListIterator listIteratorP5 = b1j.p(copyOnWriteArrayList5, new c8d(y7d.f42146a, p0w0Var), i1w0Var, copyOnWriteArrayList5, 0);
                            while (true) {
                                paw pawVar5 = (paw) listIteratorP5;
                                if (!pawVar5.hasNext()) {
                                    return;
                                } else {
                                    i1w0Var.a((oe50) pawVar5.next());
                                }
                            }
                        } else {
                            boolean z8 = a870Var instanceof r770;
                            z7z z7zVar = this.z;
                            if (!z8) {
                                if (a870Var instanceof q770) {
                                    ((SharedPreferences) ((ysi0) z7zVar.get()).f43170a.d.f20589a).edit().putBoolean("SHOW_GAME_IS_NOT_FINISHED_DIALOG", !((q770) a870Var).f28237a).apply();
                                    return;
                                }
                                if (a870Var instanceof x770) {
                                    p7m0 p7m0Var8 = ocjVar.f25029a;
                                    do {
                                        value = p7m0Var8.getValue();
                                        value.getClass();
                                        oyg0Var.getClass();
                                    } while (!p7m0Var8.m(value, xb70.a((xb70) value, null, null, null, false, false, false, false, false, null, false, false, 0, false, null, null, null, null, 130047)));
                                    return;
                                }
                                if (!(a870Var instanceof z770)) {
                                    t9f.b();
                                    return;
                                }
                                bby bbyVar4 = this.n0;
                                if (bbyVar4 == null || !bbyVar4.isActive()) {
                                    this.n0 = sac.h0(jiu0.a(this), "OneXGamesWebGameViewModel.handleWebAppSetUnderMaintenance", 1, new u52((diu0) this, yjeVar, (byte) 17), mneVar.b, new wc70(this, b2), new pu50(this, b3), 20);
                                    return;
                                }
                                return;
                            }
                            ((SharedPreferences) ((ysi0) z7zVar.get()).f43170a.d.f20589a).edit().putBoolean("SHOW_GAME_IS_NOT_FINISHED_DIALOG", !((r770) a870Var).f29966a).apply();
                            l0();
                            i1w0Var.getClass();
                            CopyOnWriteArrayList copyOnWriteArrayList6 = new CopyOnWriteArrayList();
                            ListIterator listIteratorP6 = b1j.p(copyOnWriteArrayList6, new c8d(y7d.f42146a, p0w0Var), i1w0Var, copyOnWriteArrayList6, 0);
                            while (true) {
                                paw pawVar6 = (paw) listIteratorP6;
                                if (!pawVar6.hasNext()) {
                                    return;
                                } else {
                                    i1w0Var.a((oe50) pawVar6.next());
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public final boolean W() {
        return ((xb70) D()).n.b && ((xb70) D()).j && ((xb70) D()).n.c;
    }

    public final void X(int i) {
        gw60 gw60Var = (gw60) this.b0.get();
        int i2 = (int) ((xb70) D()).n.e;
        String str = ((xb70) D()).q.e.g;
        float f = (float) ((xb70) D()).q.e.b;
        gw60Var.getClass();
        str.getClass();
        gw60Var.f12011a.a(tx3.l0(new k1p[]{new i1p(i2, (byte) 2), new j1p(str, (byte) 0), new h1p(f, (byte) 0), new i1p(i, (byte) 0)}), 3061L);
        hs60 hs60Var = (hs60) this.c0.get();
        long j = ((xb70) D()).n.e;
        String str2 = ((xb70) D()).q.e.g;
        String strValueOf = String.valueOf(((xb70) D()).q.e.b);
        hs60Var.getClass();
        str2.getClass();
        strValueOf.getClass();
        hs60Var.f13566a.a("games_demo_call", xp20.f(new Pair("game_id", Long.valueOf(j)), new Pair("currency_id", str2), new Pair("option", strValueOf), new Pair("error_code", Integer.valueOf(i))));
    }

    public final void Y() {
        l7k l7kVar = (l7k) this.d0.get();
        int i = (int) ((xb70) D()).n.e;
        y1p y1pVar = y1p.MAIN;
        l7kVar.a(i, "games", this.e0.g());
        hs60 hs60Var = (hs60) this.c0.get();
        long j = ((xb70) D()).n.e;
        zn60 zn60Var = zn60.Main;
        hs60Var.b(j);
    }

    public final void Z(int i, String str, int i2, String str2) {
        gw60 gw60Var = (gw60) this.b0.get();
        gw60Var.getClass();
        s1p s1pVar = gw60Var.f12011a;
        Set setC = dui0.c(new i1p(i, (byte) 2), new i1p(i2, (byte) 0), new j1p(str2, (byte) 0));
        setC.add(new j1p(str, (byte) 1));
        s1pVar.a(setC, 12073L);
        hs60 hs60Var = (hs60) this.c0.get();
        hs60Var.getClass();
        kt2 kt2Var = hs60Var.f13566a;
        LinkedHashMap linkedHashMapH = xp20.h(new Pair("game_id", Integer.valueOf(i)), new Pair("error_code", Integer.valueOf(i2)), new Pair("session_id", str2));
        linkedHashMapH.put("option", str);
        kt2Var.a("page_request_error", linkedHashMapH);
    }

    public final void a0(int i, String str, int i2, String str2) {
        gw60 gw60Var = (gw60) this.b0.get();
        gw60Var.getClass();
        gw60Var.f12011a.a(dui0.c(new i1p(i, (byte) 2), new i1p(i2, (byte) 0), new j1p(str, (byte) 0), new j1p(str2, (byte) 1)), 12074L);
        hs60 hs60Var = (hs60) this.c0.get();
        hs60Var.getClass();
        hs60Var.f13566a.a("frame_object_error", xp20.h(new Pair("game_id", Integer.valueOf(i)), new Pair("error_code", Integer.valueOf(i2)), new Pair("option", str), new Pair("session_id", str2)));
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e3, code lost:
    
        if (P(r0) == r1) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b0(a.csr r12, a.ql5 r13, a.zje r14) {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.xd70.b0(a.csr, a.ql5, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0060, code lost:
    
        if (o0(r6, r0) == r1) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c0(a.zje r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof a.md70
            if (r0 == 0) goto L13
            r0 = r6
            a.md70 r0 = (a.md70) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            a.md70 r0 = new a.md70
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.i
            a.wne r1 = a.wne.f39444a
            int r2 = r0.k
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2a
            a.z1x.P(r6)
            goto L63
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r5)
            r5 = 0
            return r5
        L31:
            a.z1x.P(r6)
            goto L46
        L35:
            a.z1x.P(r6)
            a.wa70 r6 = a.wa70.f38813a
            r5.G(r6)
            r0.k = r4
            java.io.Serializable r6 = r5.S(r0)
            if (r6 != r1) goto L46
            goto L62
        L46:
            a.ql5 r6 = (a.ql5) r6
            java.lang.Object r2 = r5.D()
            a.xb70 r2 = (a.xb70) r2
            a.fa70 r2 = r2.n
            boolean r2 = r2.b
            if (r2 == 0) goto L5a
            r5.M(r6)
            kotlin.Unit r5 = kotlin.Unit.f46060a
            return r5
        L5a:
            r0.k = r3
            java.lang.Object r5 = r5.o0(r6, r0)
            if (r5 != r1) goto L63
        L62:
            return r1
        L63:
            kotlin.Unit r5 = kotlin.Unit.f46060a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a.xd70.c0(a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006b, code lost:
    
        if (o0(r7, r0) == r1) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d0(a.ql5 r7, a.zje r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof a.nd70
            if (r0 == 0) goto L13
            r0 = r8
            a.nd70 r0 = (a.nd70) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            a.nd70 r0 = new a.nd70
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.j
            a.wne r1 = a.wne.f39444a
            int r2 = r0.l
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L37
            if (r2 == r5) goto L31
            if (r2 != r4) goto L2b
            a.z1x.P(r8)
            goto L6e
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r6)
            return r3
        L31:
            a.ql5 r7 = r0.i
            a.z1x.P(r8)
            goto L4c
        L37:
            a.z1x.P(r8)
            a.xa70 r8 = a.xa70.f40539a
            r6.G(r8)
            a.csr r8 = a.csr.e
            r0.i = r7
            r0.l = r5
            java.lang.Object r8 = r6.p0(r8, r0)
            if (r8 != r1) goto L4c
            goto L6d
        L4c:
            java.lang.Object r8 = r6.D()
            a.xb70 r8 = (a.xb70) r8
            a.fa70 r8 = r8.n
            boolean r8 = r8.b
            if (r8 == 0) goto L63
            a.csr r8 = a.csr.e
            r6.N(r8)
            r6.M(r7)
            kotlin.Unit r6 = kotlin.Unit.f46060a
            return r6
        L63:
            r0.i = r3
            r0.l = r4
            java.lang.Object r6 = r6.o0(r7, r0)
            if (r6 != r1) goto L6e
        L6d:
            return r1
        L6e:
            kotlin.Unit r6 = kotlin.Unit.f46060a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a.xd70.d0(a.ql5, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0060, code lost:
    
        if (o0(r6, r0) == r1) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e0(a.zje r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof a.od70
            if (r0 == 0) goto L13
            r0 = r6
            a.od70 r0 = (a.od70) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            a.od70 r0 = new a.od70
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.i
            a.wne r1 = a.wne.f39444a
            int r2 = r0.k
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2a
            a.z1x.P(r6)
            goto L63
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r5)
            r5 = 0
            return r5
        L31:
            a.z1x.P(r6)
            goto L46
        L35:
            a.z1x.P(r6)
            a.ya70 r6 = a.ya70.f42281a
            r5.G(r6)
            r0.k = r4
            java.io.Serializable r6 = r5.S(r0)
            if (r6 != r1) goto L46
            goto L62
        L46:
            a.ql5 r6 = (a.ql5) r6
            java.lang.Object r2 = r5.D()
            a.xb70 r2 = (a.xb70) r2
            a.fa70 r2 = r2.n
            boolean r2 = r2.b
            if (r2 == 0) goto L5a
            r5.M(r6)
            kotlin.Unit r5 = kotlin.Unit.f46060a
            return r5
        L5a:
            r0.k = r3
            java.lang.Object r5 = r5.o0(r6, r0)
            if (r5 != r1) goto L63
        L62:
            return r1
        L63:
            kotlin.Unit r5 = kotlin.Unit.f46060a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a.xd70.e0(a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0060, code lost:
    
        if (o0(r6, r0) == r1) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f0(a.zje r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof a.pd70
            if (r0 == 0) goto L13
            r0 = r6
            a.pd70 r0 = (a.pd70) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            a.pd70 r0 = new a.pd70
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.i
            a.wne r1 = a.wne.f39444a
            int r2 = r0.k
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2a
            a.z1x.P(r6)
            goto L63
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r5)
            r5 = 0
            return r5
        L31:
            a.z1x.P(r6)
            goto L46
        L35:
            a.z1x.P(r6)
            a.za70 r6 = a.za70.f44054a
            r5.G(r6)
            r0.k = r4
            java.io.Serializable r6 = r5.S(r0)
            if (r6 != r1) goto L46
            goto L62
        L46:
            a.ql5 r6 = (a.ql5) r6
            java.lang.Object r2 = r5.D()
            a.xb70 r2 = (a.xb70) r2
            a.fa70 r2 = r2.n
            boolean r2 = r2.b
            if (r2 == 0) goto L5a
            r5.M(r6)
            kotlin.Unit r5 = kotlin.Unit.f46060a
            return r5
        L5a:
            r0.k = r3
            java.lang.Object r5 = r5.o0(r6, r0)
            if (r5 != r1) goto L63
        L62:
            return r1
        L63:
            kotlin.Unit r5 = kotlin.Unit.f46060a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a.xd70.f0(a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0060, code lost:
    
        if (o0(r6, r0) == r1) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g0(a.zje r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof a.qd70
            if (r0 == 0) goto L13
            r0 = r6
            a.qd70 r0 = (a.qd70) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            a.qd70 r0 = new a.qd70
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.i
            a.wne r1 = a.wne.f39444a
            int r2 = r0.k
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2a
            a.z1x.P(r6)
            goto L63
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r5)
            r5 = 0
            return r5
        L31:
            a.z1x.P(r6)
            goto L46
        L35:
            a.z1x.P(r6)
            a.hb70 r6 = a.hb70.f12757a
            r5.G(r6)
            r0.k = r4
            java.io.Serializable r6 = r5.S(r0)
            if (r6 != r1) goto L46
            goto L62
        L46:
            a.ql5 r6 = (a.ql5) r6
            java.lang.Object r2 = r5.D()
            a.xb70 r2 = (a.xb70) r2
            a.fa70 r2 = r2.n
            boolean r2 = r2.b
            if (r2 == 0) goto L5a
            r5.M(r6)
            kotlin.Unit r5 = kotlin.Unit.f46060a
            return r5
        L5a:
            r0.k = r3
            java.lang.Object r5 = r5.o0(r6, r0)
            if (r5 != r1) goto L63
        L62:
            return r1
        L63:
            kotlin.Unit r5 = kotlin.Unit.f46060a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a.xd70.g0(a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
    
        if (r7 == r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0062, code lost:
    
        if (r7 == r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007f, code lost:
    
        if (o0(r7, r0) == r1) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h0(a.zje r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof a.rd70
            if (r0 == 0) goto L13
            r0 = r7
            a.rd70 r0 = (a.rd70) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            a.rd70 r0 = new a.rd70
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.i
            a.wne r1 = a.wne.f39444a
            int r2 = r0.k
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3c
            if (r2 == r5) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2d
            a.z1x.P(r7)
            goto L82
        L2d:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r6)
            r6 = 0
            return r6
        L34:
            a.z1x.P(r7)
            goto L65
        L38:
            a.z1x.P(r7)
            goto L59
        L3c:
            a.z1x.P(r7)
            a.ib70 r7 = a.ib70.f14473a
            r6.G(r7)
            java.lang.Object r7 = r6.D()
            a.xb70 r7 = (a.xb70) r7
            a.fa70 r7 = r7.n
            boolean r7 = r7.f
            if (r7 == 0) goto L5c
            r0.k = r5
            java.io.Serializable r7 = r6.S(r0)
            if (r7 != r1) goto L59
            goto L81
        L59:
            a.ql5 r7 = (a.ql5) r7
            goto L67
        L5c:
            r0.k = r4
            java.io.Serializable r7 = r6.R(r0)
            if (r7 != r1) goto L65
            goto L81
        L65:
            a.ql5 r7 = (a.ql5) r7
        L67:
            java.lang.Object r2 = r6.D()
            a.xb70 r2 = (a.xb70) r2
            a.fa70 r2 = r2.n
            boolean r2 = r2.b
            if (r2 == 0) goto L79
            r6.M(r7)
            kotlin.Unit r6 = kotlin.Unit.f46060a
            return r6
        L79:
            r0.k = r3
            java.lang.Object r6 = r6.o0(r7, r0)
            if (r6 != r1) goto L82
        L81:
            return r1
        L82:
            kotlin.Unit r6 = kotlin.Unit.f46060a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a.xd70.h0(a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i0(zje zjeVar) {
        sd70 sd70Var;
        if (zjeVar instanceof sd70) {
            sd70Var = (sd70) zjeVar;
            int i = sd70Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                sd70Var.k = i - Integer.MIN_VALUE;
            } else {
                sd70Var = new sd70(this, zjeVar);
            }
        } else {
            sd70Var = new sd70(this, zjeVar);
        }
        Object obj = sd70Var.i;
        Object obj2 = wne.f39444a;
        int i2 = sd70Var.k;
        if (i2 == 0) {
            z1x.P(obj);
            csr csrVar = csr.e;
            sd70Var.k = 1;
            if (p0(csrVar, sd70Var) == obj2) {
                return obj2;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        N(csr.e);
        if (!((xb70) D()).n.b) {
            t0();
        }
        return Unit.f46060a;
    }

    public final void j0(boolean z) {
        Boolean boolValueOf = Boolean.valueOf(z);
        vzg0 vzg0Var = this.o;
        vzg0Var.e("OneXGamesWebGame.BUNDLE_DEMO_ENABLED", boolValueOf);
        if (z) {
            return;
        }
        vzg0Var.e("OneXGamesWebGame.BUNDLE_DEMO_DIALOG_VISIBLE", Boolean.FALSE);
    }

    public final void k0() {
        bby bbyVar = this.v0;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.v0 = sac.V(jiu0.a(this), new cy60(1, this, xd70.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 28), null, this.g0.c, new jd70(this, null, (byte) 4), 10);
        }
    }

    public final void l0() {
        zfr zfrVar = new zfr();
        Object obj = this.j0.get();
        obj.getClass();
        m0(zfrVar.a((vby) obj));
    }

    public final void m0(agr agrVar) {
        String str = agrVar.b;
        if (((xb70) D()).n.b && ((xb70) D()).g) {
            G(new sb70(((xb70) D()).c, str));
            return;
        }
        ea70 ea70Var = this.k0;
        ea70Var.getClass();
        ea70Var.f7454a.put(agrVar.f838a, str);
    }

    public final void n0() {
        pgr pgrVar = new pgr(true, ((xb70) D()).n.e);
        Object obj = this.j0.get();
        obj.getClass();
        m0(pgrVar.a((vby) obj));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b8, code lost:
    
        if (O(r0) == r1) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o0(a.ql5 r8, a.zje r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof a.vd70
            if (r0 == 0) goto L13
            r0 = r9
            a.vd70 r0 = (a.vd70) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            a.vd70 r0 = new a.vd70
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.i
            a.wne r1 = a.wne.f39444a
            int r2 = r0.k
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2b
            a.z1x.P(r9)
            goto Lbb
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r7)
            r7 = 0
            return r7
        L32:
            a.z1x.P(r9)
            goto Lb2
        L37:
            a.z1x.P(r9)
            a.z7z r9 = r7.M
            java.lang.Object r9 = r9.get()
            a.zmi0 r9 = (a.zmi0) r9
            r9.a(r8)
            long r5 = r8.f28916a
            java.lang.Object r9 = r7.D()
            a.xb70 r9 = (a.xb70) r9
            a.f970 r9 = r9.o
            boolean r9 = r9.b
            if (r9 != 0) goto La0
            java.lang.Object r9 = r7.D()
            a.xb70 r9 = (a.xb70) r9
            boolean r9 = r9.h
            if (r9 == 0) goto La0
            java.lang.Object r9 = r7.D()
            a.xb70 r9 = (a.xb70) r9
            a.fa70 r9 = r9.n
            boolean r9 = r9.f
            if (r9 != 0) goto L74
            a.z7z r9 = r7.W
            java.lang.Object r9 = r9.get()
            a.kyg0 r9 = (a.kyg0) r9
            r9.a(r5)
        L74:
            a.z7z r9 = r7.K
            java.lang.Object r9 = r9.get()
            a.jyg0 r9 = (a.jyg0) r9
            java.lang.Object r2 = r7.D()
            a.xb70 r2 = (a.xb70) r2
            a.z870 r2 = r2.q
            a.bm5 r2 = r2.b
            a.rrd r9 = r9.f17359a
            r9.z(r2, r5)
            a.z7z r9 = r7.L
            java.lang.Object r9 = r9.get()
            a.ot r9 = (a.ot) r9
            java.lang.Object r2 = r7.D()
            a.xb70 r2 = (a.xb70) r2
            a.z870 r2 = r2.q
            a.bm5 r2 = r2.b
            r9.a(r2, r8)
        La0:
            a.f87 r9 = new a.f87
            r2 = 4
            r9.<init>(r8, r2)
            r7.H(r9)
            r0.k = r4
            java.lang.Object r8 = r7.P(r0)
            if (r8 != r1) goto Lb2
            goto Lba
        Lb2:
            r0.k = r3
            java.lang.Object r7 = r7.O(r0)
            if (r7 != r1) goto Lbb
        Lba:
            return r1
        Lbb:
            kotlin.Unit r7 = kotlin.Unit.f46060a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a.xd70.o0(a.ql5, a.zje):java.lang.Object");
    }

    public final Object p0(csr csrVar, zje zjeVar) {
        Object value;
        xb70 xb70Var;
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            xb70Var = (xb70) value;
            this.f.getClass();
        } while (!p7m0Var.m(value, xb70.a(xb70Var, null, null, null, false, false, false, false, false, null, false, false, 0, false, null, null, c970.a(xb70Var.p, false, csrVar, null, 13), null, 98303)));
        Object objO = O(zjeVar);
        return objO == wne.f39444a ? objO : Unit.f46060a;
    }

    public final void q0() {
        if (!W()) {
            H(new zc70((byte) 0));
            return;
        }
        H(new zc70((byte) 1));
        this.o.e("OneXGamesWebGame.BUNDLE_DEMO_DIALOG_VISIBLE", Boolean.TRUE);
        if (!((xb70) D()).h) {
            G(cb70.f4048a);
            return;
        }
        String str = ((xb70) D()).q.e.f;
        pn40 pn40Var = pn40.f27267a;
        double d = ((xb70) D()).q.e.b;
        p3u0 p3u0Var = p3u0.c;
        G(new bb70(kng0.l("\u202d", pn40.d(d, str, p3u0Var), "\u202c"), kng0.l("\u202d", pn40.d(((xb70) D()).o.d, str, p3u0Var), "\u202c"), ((xb70) D()).o.c));
    }

    public final void r0() {
        if (((xb70) D()).m) {
            return;
        }
        H(new zc70((byte) 5));
        G(gb70.f11003a);
    }

    public final void s0() {
        if (((xb70) D()).o.f && W() && ((xb70) D()).o.b && !((xb70) D()).o.g) {
            q0();
        }
    }

    public final void t0() {
        bby bbyVar = this.s0;
        if (bbyVar != null) {
            e3c.n(bbyVar);
        }
        this.s0 = sac.V(jiu0.a(this), new cy60(1, this, xd70.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 29), null, this.g0.b, new wk20((diu0) this, (yje) null, (byte) 1), 10);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:27:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:29:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:32:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:35:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:38:0x010c  */
    /* JADX WARN: Code duplicated, block: B:41:0x011c  */
    /* JADX WARN: Code duplicated, block: B:44:0x012c  */
    /* JADX WARN: Code duplicated, block: B:47:0x013c  */
    /* JADX WARN: Code duplicated, block: B:50:0x014c  */
    /* JADX WARN: Code duplicated, block: B:53:0x015c  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x016a, code lost:
    
        if (O(r6) == r0) goto L55;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u0(a.csr r10, a.ql5 r11, a.zje r12) {
        /*
            Method dump skipped, instruction units count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.xd70.u0(a.csr, a.ql5, a.zje):java.lang.Object");
    }

    @Override // a.diu0
    public final void v() {
        sac.V(jiu0.a(this), null, null, this.g0.c, new jd70(this, null, (byte) 2), 11);
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        Object value2;
        Object g0g0Var;
        l670 l670Var;
        String str;
        Object value3;
        Object value4;
        Object value5;
        Object value6;
        Object value7;
        byte b;
        Object value8;
        Object value9;
        Object value10;
        Object value11;
        Object obj2 = (v870) obj;
        obj2.getClass();
        super.x(obj2);
        boolean z = obj2 instanceof y670;
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        byte b2 = 2;
        z7z z7zVar = this.b0;
        z7z z7zVar2 = this.c0;
        z7z z7zVar3 = this.j0;
        mne mneVar = this.g0;
        if (z) {
            y670 y670Var = (y670) obj2;
            if (y670Var instanceof w670) {
                w670 w670Var = (w670) y670Var;
                p7m0 p7m0Var = ocjVar.f25029a;
                do {
                    value11 = p7m0Var.getValue();
                    value11.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var.m(value11, xb70.a((xb70) value11, null, null, w670Var.f38614a, false, false, false, false, false, null, false, false, 0, false, null, null, null, null, 131067)));
            }
            if (y670Var instanceof p670) {
                if (!((xb70) D()).f && !((xb70) D()).n.b) {
                    gw60 gw60Var = (gw60) z7zVar.get();
                    int i = (int) ((xb70) D()).n.e;
                    String str2 = ((xb70) D()).b;
                    gw60Var.getClass();
                    gw60Var.f12011a.a(tx3.l0(new k1p[]{new i1p(i, (byte) 2), new j1p("show", (byte) 0), new j1p(str2, (byte) 1)}), 12075L);
                    hs60 hs60Var = (hs60) z7zVar2.get();
                    int i2 = (int) ((xb70) D()).n.e;
                    String str3 = ((xb70) D()).b;
                    hs60Var.getClass();
                    hs60Var.f13566a.a("load_hide_call", xp20.f(new Pair("game_id", Integer.valueOf(i2)), new Pair("action", "show"), new Pair("session_id", str3)));
                }
                p7m0 p7m0Var2 = ocjVar.f25029a;
                do {
                    value10 = p7m0Var2.getValue();
                    value10.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var2.m(value10, xb70.a((xb70) value10, null, null, null, false, false, true, false, false, null, false, false, 0, false, null, null, null, null, 131039)));
                return;
            }
            if (y670Var instanceof q670) {
                if (((xb70) D()).f && !((xb70) D()).n.b) {
                    gw60 gw60Var2 = (gw60) z7zVar.get();
                    int i3 = (int) ((xb70) D()).n.e;
                    String str4 = ((xb70) D()).b;
                    gw60Var2.getClass();
                    gw60Var2.f12011a.a(tx3.l0(new k1p[]{new i1p(i3, (byte) 2), new j1p("hide", (byte) 0), new j1p(str4, (byte) 1)}), 12075L);
                    hs60 hs60Var2 = (hs60) z7zVar2.get();
                    int i4 = (int) ((xb70) D()).n.e;
                    String str5 = ((xb70) D()).b;
                    hs60Var2.getClass();
                    hs60Var2.f13566a.a("load_hide_call", xp20.f(new Pair("game_id", Integer.valueOf(i4)), new Pair("action", "hide"), new Pair("session_id", str5)));
                }
                p7m0 p7m0Var3 = ocjVar.f25029a;
                do {
                    value9 = p7m0Var3.getValue();
                    value9.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var3.m(value9, xb70.a((xb70) value9, null, null, null, false, false, false, false, false, null, false, false, 0, false, null, null, null, null, 131039)));
                return;
            }
            byte b3 = 5;
            if (y670Var instanceof v670) {
                fnq fnqVar = new fnq(((jqt) this.w.get()).a(), new xj1((diu0) this, (yje) null, (byte) 17), (byte) 4);
                sje sjeVarS = d5c.S(jiu0.a(this), mneVar.b);
                foe foeVar = foe.h;
                this.m0 = sac.T(fnqVar, sjeVarS, foeVar);
                this.l0 = sac.T(new fnq(((m1e) this.f0.get()).b(), new jd70(this, null, b3), (byte) 4), jiu0.a(this), foeVar);
                sac.T(new fnq(((uyu) this.a0.get()).f36509a.h(), new ud70(this, null, (byte) 1), (byte) 4), jiu0.a(this), foe.h);
                return;
            }
            if (y670Var instanceof u670) {
                e3c.n(this.l0);
                e3c.n(this.m0);
                return;
            }
            if (y670Var instanceof s670) {
                s670 s670Var = (s670) y670Var;
                boolean z2 = s670Var.f31690a;
                if (((xb70) D()).e != z2) {
                    iir iirVar = new iir(z2, s670Var.b);
                    Object obj3 = z7zVar3.get();
                    obj3.getClass();
                    m0(iirVar.a((vby) obj3));
                }
                p7m0 p7m0Var4 = ocjVar.f25029a;
                do {
                    value8 = p7m0Var4.getValue();
                    value8.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var4.m(value8, xb70.a((xb70) value8, null, null, null, false, s670Var.f31690a, false, false, false, null, false, false, 0, false, null, null, null, null, 131055)));
                return;
            }
            if (y670Var instanceof x670) {
                gw60 gw60Var3 = (gw60) z7zVar.get();
                int i5 = (int) ((xb70) D()).n.e;
                String str6 = ((xb70) D()).b;
                gw60Var3.getClass();
                gw60Var3.f12011a.a(tx3.l0(new k1p[]{new i1p(i5, (byte) 2), new j1p(str6, (byte) 0)}), 12076L);
                hs60 hs60Var3 = (hs60) z7zVar2.get();
                int i6 = (int) ((xb70) D()).n.e;
                String str7 = ((xb70) D()).b;
                hs60Var3.getClass();
                hs60Var3.f13566a.a("not_webview_device", xp20.f(new Pair("game_id", Integer.valueOf(i6)), new Pair("session_id", str7)));
                G(kb70.f17999a);
                return;
            }
            if (y670Var instanceof o670) {
                o670 o670Var = (o670) y670Var;
                bby bbyVar = this.u0;
                if (bbyVar == null || !bbyVar.isActive()) {
                    this.u0 = sac.V(jiu0.a(this), new cy60(1, this, xd70.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 17), null, mneVar.b, new ku60(o670Var, this, null, (byte) 6), 10);
                    return;
                }
                return;
            }
            if (y670Var instanceof r670) {
                sac.V(jiu0.a(this), new cy60(1, this, xd70.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 18), null, mneVar.b, new er60((r670) y670Var, this, null, b3), 10);
                return;
            }
            if (y670Var instanceof t670) {
                if (!W() || ((xb70) D()).o.g) {
                    G(pa70.f26641a);
                    return;
                }
                return;
            }
            if (y670Var instanceof n670) {
                E();
                return;
            } else {
                t9f.b();
                return;
            }
        }
        if (obj2 instanceof a870) {
            V((a870) obj2);
            return;
        }
        if (!(obj2 instanceof p870)) {
            int errorCode = 0;
            if (!(obj2 instanceof u870)) {
                t9f.b();
                return;
            }
            u870 u870Var = (u870) obj2;
            if (u870Var instanceof s870) {
                s870 s870Var = (s870) u870Var;
                WebResourceRequest webResourceRequest = s870Var.f31789a;
                WebResourceError webResourceError = s870Var.b;
                boolean zIsForMainFrame = webResourceRequest != null ? webResourceRequest.isForMainFrame() : false;
                errorCode = webResourceError != null ? webResourceError.getErrorCode() : 0;
                String strValueOf = String.valueOf(webResourceError != null ? webResourceError.getDescription() : null);
                if (!((xb70) D()).n.b && zIsForMainFrame) {
                    Z((int) ((xb70) D()).n.e, strValueOf, errorCode, ((xb70) D()).b);
                } else if (!((xb70) D()).n.b && !zIsForMainFrame) {
                    a0((int) ((xb70) D()).n.e, String.valueOf(webResourceRequest != null ? webResourceRequest.getUrl() : null), errorCode, ((xb70) D()).b);
                }
                if (zIsForMainFrame) {
                    p7m0 p7m0Var5 = ocjVar.f25029a;
                    do {
                        value4 = p7m0Var5.getValue();
                        value4.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var5.m(value4, xb70.a((xb70) value4, null, null, null, false, false, false, false, false, null, false, false, 0, false, null, null, null, null, 130559)));
                    G(new ub70(((xb70) D()).c));
                    if (((xb70) D()).l >= 4 || !((xb70) D()).g) {
                        r0();
                        return;
                    } else {
                        sac.V(jiu0.a(this), td70.f33753a, null, mneVar.f22085a, new jd70(this, null, (byte) 3), 10);
                        return;
                    }
                }
                return;
            }
            if (!(u870Var instanceof t870)) {
                if (u870Var instanceof r870) {
                    p7m0 p7m0Var6 = ocjVar.f25029a;
                    do {
                        value2 = p7m0Var6.getValue();
                        value2.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var6.m(value2, xb70.a((xb70) value2, null, null, null, false, false, false, false, false, null, false, false, 0, false, null, null, null, null, 130559)));
                    return;
                }
                if (!(u870Var instanceof q870)) {
                    t9f.b();
                    return;
                }
                e3c.n(this.y0);
                p7m0 p7m0Var7 = ocjVar.f25029a;
                do {
                    value = p7m0Var7.getValue();
                    value.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var7.m(value, xb70.a((xb70) value, null, null, null, false, false, false, false, false, null, true, false, 0, false, null, null, null, null, 130559)));
                this.y0 = sac.V(jiu0.a(this), null, null, mneVar.c, new id70(this, null, b2), 11);
                s0();
                return;
            }
            t870 t870Var = (t870) u870Var;
            WebResourceRequest webResourceRequest2 = t870Var.f33501a;
            boolean zIsForMainFrame2 = webResourceRequest2 != null ? webResourceRequest2.isForMainFrame() : false;
            WebResourceResponse webResourceResponse = t870Var.b;
            if (!((xb70) D()).n.b) {
                try {
                    e0g0 e0g0Var = j0g0.b;
                    vby vbyVar = (vby) z7zVar3.get();
                    String strValueOf2 = String.valueOf(webResourceResponse != null ? webResourceResponse.getData() : null);
                    vbyVar.getClass();
                    g0g0Var = (m670) vbyVar.b(m670.Companion.serializer(), strValueOf2);
                } catch (Throwable th) {
                    e0g0 e0g0Var2 = j0g0.b;
                    g0g0Var = new g0g0(th);
                }
                if (g0g0Var instanceof g0g0) {
                    g0g0Var = null;
                }
                m670 m670Var = (m670) g0g0Var;
                String str8 = (m670Var == null || (str = m670Var.f21255a) == null) ? (m670Var == null || (l670Var = m670Var.b) == null) ? null : l670Var.f19493a : str;
                if (zIsForMainFrame2) {
                    int i7 = (int) ((xb70) D()).n.e;
                    int statusCode = webResourceResponse != null ? webResourceResponse.getStatusCode() : 0;
                    if (str8 == null) {
                        str8 = "";
                    }
                    Z(i7, str8, statusCode, ((xb70) D()).b);
                } else {
                    a0((int) ((xb70) D()).n.e, String.valueOf(webResourceRequest2 != null ? webResourceRequest2.getUrl() : null), webResourceResponse != null ? webResourceResponse.getStatusCode() : 0, ((xb70) D()).b);
                }
            }
            if (zIsForMainFrame2) {
                p7m0 p7m0Var8 = ocjVar.f25029a;
                do {
                    value3 = p7m0Var8.getValue();
                    value3.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var8.m(value3, xb70.a((xb70) value3, null, null, null, false, false, false, false, false, null, false, false, 0, false, null, null, null, null, 130559)));
                G(new ub70(((xb70) D()).c));
                IntRange intRange = pnm0.c;
                Integer numValueOf = webResourceResponse != null ? Integer.valueOf(webResourceResponse.getStatusCode()) : null;
                if (numValueOf != null && intRange.b(numValueOf.intValue())) {
                    errorCode = 1;
                }
                if (((xb70) D()).l < 4 && ((xb70) D()).g && errorCode == 0) {
                    sac.V(jiu0.a(this), td70.f33753a, null, mneVar.f22085a, new jd70(this, null, (byte) 3), 10);
                    return;
                } else {
                    r0();
                    return;
                }
            }
            return;
        }
        p870 p870Var = (p870) obj2;
        byte b4 = 10;
        if (p870Var instanceof e870) {
            e870 e870Var = (e870) p870Var;
            U(e870Var.f7360a);
            H(new ds60(e870Var, b4));
            return;
        }
        byte b5 = 8;
        if (p870Var instanceof j870) {
            j870 j870Var = (j870) p870Var;
            qhr qhrVar = j870Var.f16070a;
            U(qhrVar);
            String str9 = qhrVar.c;
            double d = qhrVar.d;
            if (!Intrinsics.d(str9, "demo")) {
                if (((xb70) D()).o.g) {
                    return;
                }
                j0(false);
                H(new cr60((byte) 25));
                e3c.n(this.q0);
                this.q0 = sac.V(jiu0.a(this), new cy60(1, this, xd70.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 23), null, mneVar.b, new qe5(j870Var, this, (yje) null, b5), 10);
                return;
            }
            if (d <= 0.0d) {
                return;
            }
            boolean z3 = ((xb70) D()).q.e.f28916a != -2;
            ql5 ql5VarA = ql5.a(((xb70) D()).q.e, qhrVar.d, this.i0.b.a(R.string.euro_currency, Arrays.copyOf(new Object[0], 0)), 0, 8092);
            Double d2 = qhrVar.e;
            double dDoubleValue = d2 != null ? d2.doubleValue() : ((xb70) D()).o.d;
            j0(true);
            Double dValueOf = Double.valueOf(d);
            vzg0 vzg0Var = this.o;
            vzg0Var.e("OneXGamesWebGame.BUNDLE_DEMO_BALANCE", dValueOf);
            vzg0Var.e("OneXGamesWebGame.BUNDLE_DEMO_TOTAL_WIN_SUM", Double.valueOf(dDoubleValue));
            H(new cn10(ql5VarA, dDoubleValue));
            if (z3 || ((xb70) D()).o.f) {
                q0();
                return;
            }
            return;
        }
        if (p870Var instanceof m870) {
            m870 m870Var = (m870) p870Var;
            U(m870Var.f21357a);
            e3c.n(this.A0);
            this.A0 = sac.V(jiu0.a(this), new cy60(1, this, xd70.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 24), null, mneVar.b, new ku60(m870Var, this, null, (byte) 7), 10);
            return;
        }
        if (p870Var instanceof d870) {
            sgr sgrVar = ((d870) p870Var).f5632a;
            U(sgrVar);
            int iOrdinal = sgrVar.c.ordinal();
            if (iOrdinal == 0) {
                G(db70.f5789a);
                return;
            }
            if (iOrdinal == 1) {
                j0(false);
                H(new cr60((byte) 20));
                G(new fb70(((xb70) D()).h));
                X(2);
                return;
            }
            if (iOrdinal == 2) {
                j0(false);
                H(new cr60((byte) 21));
                G(new fb70(((xb70) D()).h));
                X(1);
                return;
            }
            if (iOrdinal != 3) {
                t9f.b();
                return;
            }
            H(new cr60((byte) 22));
            G(new qa70(((xb70) D()).o.c));
            gw60 gw60Var4 = (gw60) z7zVar.get();
            int i8 = (int) ((xb70) D()).n.e;
            String str10 = ((xb70) D()).q.e.g;
            float f = (float) ((xb70) D()).q.e.b;
            gw60Var4.getClass();
            str10.getClass();
            gw60Var4.f12011a.a(tx3.l0(new k1p[]{new i1p(i8, (byte) 2), new j1p(str10, (byte) 0), new h1p(f, (byte) 0)}), 3061L);
            hs60 hs60Var4 = (hs60) z7zVar2.get();
            long j = ((xb70) D()).n.e;
            String str11 = ((xb70) D()).q.e.g;
            String strValueOf3 = String.valueOf(((xb70) D()).q.e.b);
            hs60Var4.getClass();
            str11.getClass();
            strValueOf3.getClass();
            hs60Var4.f13566a.a("games_demo_call", xp20.f(new Pair("game_id", Long.valueOf(j)), new Pair("currency_id", str11), new Pair("option", strValueOf3)));
            return;
        }
        if (p870Var instanceof b870) {
            b870 b870Var = (b870) p870Var;
            H(new cr60((byte) 29));
            String string = ((us3) ((leu) this.X.get()).f19922a.b).c().toString();
            Object obj4 = z7zVar3.get();
            obj4.getClass();
            vby vbyVar2 = (vby) obj4;
            zir zirVar = ajr.Companion;
            uaq0 uaq0Var = ((xb70) D()).f40588a;
            zirVar.getClass();
            uaq0.f35345a.getClass();
            m0(b870Var.f2144a.b(new Pair(AttributionReporter.APP_VERSION, string), new Pair("appName", "Android"), new Pair("theme", vbyVar2.c(zirVar.serializer(), s9m0.i(uaq0Var) ? ajr.b : s9m0.j(uaq0Var) ? ajr.c : ajr.d))));
            k0();
            s0();
            return;
        }
        if (p870Var instanceof c870) {
            U(((c870) p870Var).f3900a);
            bby bbyVar2 = this.x0;
            if (bbyVar2 != null) {
                b = 1;
                if (bbyVar2.isActive()) {
                    return;
                }
            } else {
                b = 1;
            }
            this.x0 = sac.V(jiu0.a(this), null, null, mneVar.c, new jd70(this, null, b), 11);
            return;
        }
        if (p870Var instanceof o870) {
            U(((o870) p870Var).f24818a);
            r0();
            return;
        }
        if (p870Var instanceof g870) {
            U(((g870) p870Var).f10852a);
            H(new zc70((byte) 3));
            if (((xb70) D()).o.g) {
                n0();
                k0();
            }
            s0();
            return;
        }
        if (p870Var instanceof h870) {
            U(((h870) p870Var).f12614a);
            return;
        }
        boolean z4 = p870Var instanceof i870;
        i1w0 i1w0Var = this.q;
        if (!z4) {
            if (p870Var instanceof k870) {
                sac.V(jiu0.a(this), new cy60(1, this, xd70.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 25), null, mneVar.b, new ku60(this, (k870) p870Var, null, b5), 10);
                return;
            }
            if (p870Var instanceof l870) {
                U(((l870) p870Var).f19593a);
                if (((xb70) D()).h) {
                    return;
                }
                l0();
                p7m0 p7m0Var9 = ocjVar.f25029a;
                do {
                    value5 = p7m0Var9.getValue();
                    value5.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var9.m(value5, xb70.a((xb70) value5, null, null, null, false, false, false, false, false, x870.d, false, false, 0, false, null, null, null, null, 130815)));
                i1w0Var.d(new wk60((byte) 12));
                return;
            }
            if (p870Var instanceof f870) {
                U(((f870) p870Var).f9093a);
                ((hkt0) this.x.get()).a(vpv0.b);
                G(ob70.f24964a);
                return;
            } else {
                if (!(p870Var instanceof n870)) {
                    t9f.b();
                    return;
                }
                n870 n870Var = (n870) p870Var;
                U(n870Var.f23076a);
                sac.V(jiu0.a(this), new cy60(1, this, xd70.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 26), null, mneVar.b, new nf60(n870Var, this, null, (byte) 14), 10);
                return;
            }
        }
        khr khrVar = ((i870) p870Var).f14326a;
        U(khrVar);
        yir yirVar = khrVar.c;
        final wir wirVar = khrVar.d;
        int iOrdinal2 = yirVar.ordinal();
        oeg0 oeg0Var = this.p;
        p0w0 p0w0Var = p0w0.f26173a;
        switch (iOrdinal2) {
            case 0:
                l0();
                i1w0 i1w0VarB = oeg0Var.b();
                i1w0VarB.getClass();
                CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                ListIterator listIteratorP = b1j.p(copyOnWriteArrayList, new c8d(y7d.f42146a, p0w0Var), i1w0VarB, copyOnWriteArrayList, 0);
                while (true) {
                    paw pawVar = (paw) listIteratorP;
                    if (!pawVar.hasNext()) {
                        this.r.q(new bb50(false), true);
                    } else {
                        i1w0VarB.a((oe50) pawVar.next());
                    }
                    break;
                }
                break;
            case 1:
                l0();
                i1w0Var.getClass();
                CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList();
                final byte b6 = 0;
                ListIterator listIteratorP2 = b1j.p(copyOnWriteArrayList2, new c8d(y7d.f42146a, p0w0Var), i1w0Var, copyOnWriteArrayList2, 0);
                while (true) {
                    paw pawVar2 = (paw) listIteratorP2;
                    if (!pawVar2.hasNext()) {
                        oeg0Var.b().d(new Function1(this) { // from class: a.xc70
                            public final /* synthetic */ xd70 b;

                            {
                                this.b = this;
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                String str12;
                                Integer intOrNull;
                                byte b7 = b6;
                                wir wirVar2 = wirVar;
                                xd70 xd70Var = this.b;
                                k0w0 k0w0Var = (k0w0) obj5;
                                switch (b7) {
                                    case 0:
                                        k0w0Var.getClass();
                                        Object obj6 = xd70Var.s.get();
                                        obj6.getClass();
                                        k0w0Var.e(oct.f((oct) obj6, 0L, null, (wirVar2 == null || (str12 = wirVar2.b) == null || (intOrNull = StringsKt.toIntOrNull(str12)) == null) ? 0 : intOrNull.intValue(), null, null, 27));
                                        break;
                                    default:
                                        k0w0Var.getClass();
                                        k0w0Var.g();
                                        Object obj7 = xd70Var.t.get();
                                        obj7.getClass();
                                        k0w0Var.h(uzc0.c((uzc0) obj7, wirVar2.f39231a.intValue()));
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        });
                    } else {
                        i1w0Var.a((oe50) pawVar2.next());
                    }
                    break;
                }
                break;
            case 2:
                if ((wirVar != null ? wirVar.f39231a : null) != null) {
                    e3c.n(this.o0);
                    this.o0 = sac.V(jiu0.a(this), new cy60(1, this, xd70.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 22), null, mneVar.b, new hd70(wirVar, this, null, (byte) 1), 10);
                    break;
                }
                break;
            case 3:
                if ((wirVar != null ? wirVar.f39231a : null) != null) {
                    l0();
                    final byte b7 = 1;
                    i1w0Var.d(new Function1(this) { // from class: a.xc70
                        public final /* synthetic */ xd70 b;

                        {
                            this.b = this;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            String str12;
                            Integer intOrNull;
                            byte b8 = b7;
                            wir wirVar2 = wirVar;
                            xd70 xd70Var = this.b;
                            k0w0 k0w0Var = (k0w0) obj5;
                            switch (b8) {
                                case 0:
                                    k0w0Var.getClass();
                                    Object obj6 = xd70Var.s.get();
                                    obj6.getClass();
                                    k0w0Var.e(oct.f((oct) obj6, 0L, null, (wirVar2 == null || (str12 = wirVar2.b) == null || (intOrNull = StringsKt.toIntOrNull(str12)) == null) ? 0 : intOrNull.intValue(), null, null, 27));
                                    break;
                                default:
                                    k0w0Var.getClass();
                                    k0w0Var.g();
                                    Object obj7 = xd70Var.t.get();
                                    obj7.getClass();
                                    k0w0Var.h(uzc0.c((uzc0) obj7, wirVar2.f39231a.intValue()));
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    });
                    break;
                }
                break;
            case 4:
                if (!((xb70) D()).h) {
                    l0();
                    p7m0 p7m0Var10 = ocjVar.f25029a;
                    do {
                        value6 = p7m0Var10.getValue();
                        value6.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var10.m(value6, xb70.a((xb70) value6, null, null, null, false, false, false, false, false, x870.c, false, false, 0, false, null, null, null, null, 130815)));
                    i1w0Var.d(new wk60(b4));
                }
                break;
            case 5:
                if (!((xb70) D()).h) {
                    l0();
                    p7m0 p7m0Var11 = ocjVar.f25029a;
                    do {
                        value7 = p7m0Var11.getValue();
                        value7.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var11.m(value7, xb70.a((xb70) value7, null, null, null, false, false, false, false, false, x870.c, false, false, 0, false, null, null, null, null, 130815)));
                    i1w0Var.d(new wk60(b5));
                }
                break;
            case 6:
                l0();
                ((v88) this.u.get()).a(i1w0Var, true, ((xb70) D()).q.e.f28916a);
                break;
            case 7:
                l0();
                i1w0Var.getClass();
                CopyOnWriteArrayList copyOnWriteArrayList3 = new CopyOnWriteArrayList();
                ListIterator listIteratorP3 = b1j.p(copyOnWriteArrayList3, new c8d(y7d.f42146a, p0w0Var), i1w0Var, copyOnWriteArrayList3, 0);
                while (true) {
                    paw pawVar3 = (paw) listIteratorP3;
                    if (pawVar3.hasNext()) {
                        i1w0Var.a((oe50) pawVar3.next());
                    }
                    break;
                }
                break;
            case 8:
                e3c.n(this.p0);
                this.p0 = sac.V(jiu0.a(this), new cy60(1, this, xd70.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 19), null, mneVar.b, new hd70(wirVar, this, null, (byte) 0), 10);
                break;
            default:
                t9f.b();
                break;
        }
    }
}

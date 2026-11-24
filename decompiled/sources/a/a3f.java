package a;

import a.iiy;
import a.m1r;
import a.tu5;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.io.Serializable;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class a3f extends i3t0 {
    public static final /* synthetic */ int H = 0;
    public final r9u A;
    public final ryu B;
    public final hnu C;
    public final lsn D;
    public final ocl E;
    public final ctf0 F;
    public bby G;
    public final pru o;
    public final i1w0 p;
    public final duj q;
    public final bj5 r;
    public final a0c s;
    public final h0q0 t;
    public final yiu u;
    public final rpt v;
    public final nou w;
    public final nrt x;
    public final svu y;
    public final q0u z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3f(pru pruVar, mne mneVar, i1w0 i1w0Var, duj dujVar, bj5 bj5Var, a0c a0cVar, h0q0 h0q0Var, yiu yiuVar, rpt rptVar, nou nouVar, nrt nrtVar, svu svuVar, q0u q0uVar, r9u r9uVar, ryu ryuVar, hnu hnuVar, lsn lsnVar, ocl oclVar, ctf0 ctf0Var) {
        super(new qib((byte) 1, pruVar, ctf0Var), cvm0.p(mneVar.c, mneVar.b), new ep4(ctf0Var, (byte) 22), (yzn0) null);
        r9uVar.getClass();
        ctf0Var.getClass();
        this.o = pruVar;
        this.p = i1w0Var;
        this.q = dujVar;
        this.r = bj5Var;
        this.s = a0cVar;
        this.t = h0q0Var;
        this.u = yiuVar;
        this.v = rptVar;
        this.w = nouVar;
        this.x = nrtVar;
        this.y = svuVar;
        this.z = q0uVar;
        this.A = r9uVar;
        this.B = ryuVar;
        this.C = hnuVar;
        this.D = lsnVar;
        this.E = oclVar;
        this.F = ctf0Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object M(zje zjeVar) {
        v2f v2fVar;
        int i;
        q1h0 q1h0Var;
        if (zjeVar instanceof v2f) {
            v2fVar = (v2f) zjeVar;
            int i2 = v2fVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                v2fVar.m = i2 - Integer.MIN_VALUE;
            } else {
                v2fVar = new v2f(this, zjeVar);
            }
        } else {
            v2fVar = new v2f(this, zjeVar);
        }
        v2f v2fVar2 = v2fVar;
        Object objD0 = v2fVar2.k;
        wne wneVar = wne.f39444a;
        int i3 = v2fVar2.m;
        if (i3 == 0) {
            z1x.P(objD0);
            int iA = this.v.a();
            String str = ((l2f) D()).f19304a;
            v2fVar2.i = iA;
            v2fVar2.m = 1;
            rrd rrdVar = this.s.f19a;
            objD0 = qjj.d0(((mne) rrdVar.b).b, new d21((Object) rrdVar, iA, (Object) str, (yje) null, (byte) 6), v2fVar2);
            if (objD0 != wneVar) {
                i = iA;
            }
            return wneVar;
        }
        if (i3 == 1) {
            i = v2fVar2.i;
            z1x.P(objD0);
        } else {
            if (i3 != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            q1h0Var = v2fVar2.j;
            z1x.P(objD0);
        }
        this.B.b((a5w) objD0);
        return new Long(q1h0Var.b);
        q1h0 q1h0Var2 = (q1h0) objD0;
        String str2 = q1h0Var2.f27953a;
        long j = q1h0Var2.b;
        v2fVar2.j = q1h0Var2;
        v2fVar2.i = i;
        v2fVar2.m = 2;
        Object objG = ((nr) this.D.f20589a).g(i, j, v2fVar2, str2);
        if (objG != wneVar) {
            q1h0Var = q1h0Var2;
            objD0 = objG;
            this.B.b((a5w) objD0);
            return new Long(q1h0Var.b);
        }
        return wneVar;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:35:0x011c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0129  */
    /* JADX WARN: Code duplicated, block: B:43:0x0146  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v3, types: [a.h0q0, a.s77, java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v8 */
    public final Serializable N(zje zjeVar) {
        x2f x2fVar;
        boolean z;
        q1h0 q1h0Var;
        s77 s77Var;
        h0q0 h0q0Var;
        String str;
        boolean z2;
        s77 s77Var2;
        h0q0 h0q0Var2;
        String str2;
        long j;
        int iA;
        boolean z3;
        Object objJ;
        int i;
        s77 s77Var3;
        h0q0 h0q0Var3;
        String str3;
        boolean z4;
        String str4;
        q1h0 q1h0Var2;
        long j2;
        boolean z5;
        ?? r12;
        boolean z6;
        Object objV;
        q1h0 q1h0Var3;
        if (zjeVar instanceof x2f) {
            x2fVar = (x2f) zjeVar;
            int i2 = x2fVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                x2fVar.t = i2 - Integer.MIN_VALUE;
            } else {
                x2fVar = new x2f(this, zjeVar);
            }
        } else {
            x2fVar = new x2f(this, zjeVar);
        }
        x2f x2fVar2 = x2fVar;
        Object objD0 = x2fVar2.r;
        wne wneVar = wne.f39444a;
        int i3 = x2fVar2.t;
        rpt rptVar = this.v;
        if (i3 == 0) {
            z1x.P(objD0);
            String str5 = ((l2f) D()).f19304a;
            int iA2 = rptVar.a();
            x2fVar2.t = 1;
            rrd rrdVar = this.s.f19a;
            z = false;
            objD0 = qjj.d0(((mne) rrdVar.b).b, new d21((Object) rrdVar, iA2, (Object) str5, (yje) (false ? 1 : 0), (byte) 6), x2fVar2);
            if (objD0 != wneVar) {
            }
            return wneVar;
        }
        if (i3 == 1) {
            z1x.P(objD0);
            z = false;
        } else {
            if (i3 == 2) {
                s77Var = x2fVar2.l;
                String str6 = x2fVar2.k;
                h0q0Var = x2fVar2.j;
                q1h0Var = x2fVar2.i;
                z1x.P(objD0);
                str = str6;
                z2 = false;
                s77Var2 = s77Var;
                h0q0Var2 = h0q0Var;
                str2 = ((ql5) objD0).f;
                j = q1h0Var.b;
                iA = rptVar.a();
                z3 = ((l2f) D()).i;
                x2fVar2.i = q1h0Var;
                x2fVar2.j = h0q0Var2;
                x2fVar2.k = str;
                x2fVar2.l = s77Var2;
                x2fVar2.m = str2;
                x2fVar2.n = true;
                x2fVar2.p = j;
                x2fVar2.o = iA;
                x2fVar2.q = z3;
                x2fVar2.t = 3;
                objJ = this.E.j();
                if (objJ != wneVar) {
                    i = iA;
                    s77Var3 = s77Var2;
                    h0q0Var3 = h0q0Var2;
                    str3 = str;
                    z4 = z3;
                    str4 = str2;
                    q1h0Var2 = q1h0Var;
                    j2 = j;
                    z5 = true;
                    r12 = z2;
                    List list = (List) objJ;
                    boolean z7 = ((l2f) D()).j;
                    if (this.u.a()) {
                        z6 = true;
                    } else {
                        z6 = true;
                    }
                    x2fVar2.i = q1h0Var2;
                    x2fVar2.j = r12;
                    x2fVar2.k = r12;
                    x2fVar2.l = r12;
                    x2fVar2.m = r12;
                    x2fVar2.t = 4;
                    String str7 = str4;
                    objV = h0q0Var3.v(str3, s77Var3, str7, z5, j2, i, z4, list, z7, z6, x2fVar2);
                    if (objV != wneVar) {
                        q1h0 q1h0Var4 = q1h0Var2;
                        objD0 = objV;
                        q1h0Var3 = q1h0Var4;
                    }
                }
                return wneVar;
            }
            if (i3 == 3) {
                boolean z8 = x2fVar2.q;
                int i4 = x2fVar2.o;
                long j3 = x2fVar2.p;
                boolean z9 = x2fVar2.n;
                String str8 = x2fVar2.m;
                s77 s77Var4 = x2fVar2.l;
                String str9 = x2fVar2.k;
                h0q0 h0q0Var4 = x2fVar2.j;
                q1h0 q1h0Var5 = x2fVar2.i;
                z1x.P(objD0);
                i = i4;
                s77Var3 = s77Var4;
                h0q0Var3 = h0q0Var4;
                str3 = str9;
                z4 = z8;
                str4 = str8;
                objJ = objD0;
                z5 = z9;
                q1h0Var2 = q1h0Var5;
                r12 = 0;
                j2 = j3;
                List list2 = (List) objJ;
                boolean z10 = ((l2f) D()).j;
                if (this.u.a() || this.o.a().O1) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                x2fVar2.i = q1h0Var2;
                x2fVar2.j = r12;
                x2fVar2.k = r12;
                x2fVar2.l = r12;
                x2fVar2.m = r12;
                x2fVar2.t = 4;
                String str10 = str4;
                objV = h0q0Var3.v(str3, s77Var3, str10, z5, j2, i, z4, list2, z10, z6, x2fVar2);
                if (objV != wneVar) {
                    q1h0 q1h0Var6 = q1h0Var2;
                    objD0 = objV;
                    q1h0Var3 = q1h0Var6;
                }
                return wneVar;
            }
            if (i3 != 4) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            q1h0Var3 = x2fVar2.i;
            z1x.P(objD0);
        }
        return new Pair(objD0, new Long(q1h0Var3.b));
        q1h0Var = (q1h0) objD0;
        String str11 = q1h0Var.f27953a;
        s77Var = s77.EVENTS;
        long j4 = q1h0Var.b;
        x2fVar2.i = q1h0Var;
        h0q0Var = this.t;
        x2fVar2.j = h0q0Var;
        x2fVar2.k = str11;
        x2fVar2.l = s77Var;
        x2fVar2.t = 2;
        Serializable serializableA = nrt.a(this.x, j4, x2fVar2);
        if (serializableA != wneVar) {
            str = str11;
            objD0 = serializableA;
            z2 = z;
            s77Var2 = s77Var;
            h0q0Var2 = h0q0Var;
            str2 = ((ql5) objD0).f;
            j = q1h0Var.b;
            iA = rptVar.a();
            z3 = ((l2f) D()).i;
            x2fVar2.i = q1h0Var;
            x2fVar2.j = h0q0Var2;
            x2fVar2.k = str;
            x2fVar2.l = s77Var2;
            x2fVar2.m = str2;
            x2fVar2.n = true;
            x2fVar2.p = j;
            x2fVar2.o = iA;
            x2fVar2.q = z3;
            x2fVar2.t = 3;
            objJ = this.E.j();
            if (objJ != wneVar) {
                i = iA;
                s77Var3 = s77Var2;
                h0q0Var3 = h0q0Var2;
                str3 = str;
                z4 = z3;
                str4 = str2;
                q1h0Var2 = q1h0Var;
                j2 = j;
                z5 = true;
                r12 = z2;
                List list3 = (List) objJ;
                boolean z11 = ((l2f) D()).j;
                if (this.u.a()) {
                    z6 = true;
                } else {
                    z6 = true;
                }
                x2fVar2.i = q1h0Var2;
                x2fVar2.j = r12;
                x2fVar2.k = r12;
                x2fVar2.l = r12;
                x2fVar2.m = r12;
                x2fVar2.t = 4;
                String str12 = str4;
                objV = h0q0Var3.v(str3, s77Var3, str12, z5, j2, i, z4, list3, z11, z6, x2fVar2);
                if (objV != wneVar) {
                    q1h0 q1h0Var7 = q1h0Var2;
                    objD0 = objV;
                    q1h0Var3 = q1h0Var7;
                    return new Pair(objD0, new Long(q1h0Var3.b));
                }
            }
        }
        return wneVar;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:43:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Serializable O(zje zjeVar) {
        y2f y2fVar;
        int i;
        vor0 vor0Var;
        vor0 vor0Var2;
        Object g0g0Var;
        n3w n3wVarD;
        Serializable serializableA;
        n3w n3wVar;
        if (zjeVar instanceof y2f) {
            y2fVar = (y2f) zjeVar;
            int i2 = y2fVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                y2fVar.n = i2 - Integer.MIN_VALUE;
            } else {
                y2fVar = new y2f(this, zjeVar);
            }
        } else {
            y2fVar = new y2f(this, zjeVar);
        }
        Object objA = y2fVar.l;
        wne wneVar = wne.f39444a;
        int i3 = y2fVar.n;
        try {
            if (i3 == 0) {
                z1x.P(objA);
                int iA = this.v.a();
                String str = ((l2f) D()).f19304a;
                y2fVar.i = iA;
                y2fVar.n = 1;
                Object objL = ((y3v) this.y.f32888a).l(iA, y2fVar, str);
                if (objL != wneVar) {
                    i = iA;
                    objA = objL;
                }
                return wneVar;
            }
            if (i3 == 1) {
                i = y2fVar.i;
                z1x.P(objA);
            } else {
                if (i3 == 2) {
                    i = y2fVar.i;
                    vor0Var2 = y2fVar.j;
                    try {
                        z1x.P(objA);
                        g0g0Var = (String) objA;
                        e0g0 e0g0Var = j0g0.b;
                    } catch (Throwable th) {
                        th = th;
                        e0g0 e0g0Var2 = j0g0.b;
                        g0g0Var = new g0g0(th);
                    }
                    if (j0g0.a(g0g0Var) != null) {
                        g0g0Var = vor0Var2.f37780a.g;
                    }
                    n3wVarD = n3w.d(vor0Var2.f37780a, null, 0.0d, null, (String) g0g0Var, 0L, null, 0.0d, 0.0d, null, null, null, false, null, null, null, -65, -1);
                    y2fVar.j = null;
                    y2fVar.k = n3wVarD;
                    y2fVar.i = i;
                    y2fVar.n = 3;
                    serializableA = this.w.a(tl5.c, y2fVar);
                    if (serializableA != wneVar) {
                        n3wVar = n3wVarD;
                        objA = serializableA;
                    }
                    return wneVar;
                }
                if (i3 != 3) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                n3wVar = y2fVar.k;
                z1x.P(objA);
            }
            return new Pair(n3wVar, new Long(((ql5) objA).f28916a));
            e0g0 e0g0Var3 = j0g0.b;
            q0u q0uVar = this.z;
            String str2 = vor0Var.b;
            y2fVar.j = vor0Var;
            y2fVar.i = i;
            y2fVar.n = 2;
            objA = q0uVar.a(str2, y2fVar);
            if (objA != wneVar) {
                vor0Var2 = vor0Var;
                g0g0Var = (String) objA;
                e0g0 e0g0Var4 = j0g0.b;
                if (j0g0.a(g0g0Var) != null) {
                    g0g0Var = vor0Var2.f37780a.g;
                }
                n3wVarD = n3w.d(vor0Var2.f37780a, null, 0.0d, null, (String) g0g0Var, 0L, null, 0.0d, 0.0d, null, null, null, false, null, null, null, -65, -1);
                y2fVar.j = null;
                y2fVar.k = n3wVarD;
                y2fVar.i = i;
                y2fVar.n = 3;
                serializableA = this.w.a(tl5.c, y2fVar);
                if (serializableA != wneVar) {
                    n3wVar = n3wVarD;
                    objA = serializableA;
                    return new Pair(n3wVar, new Long(((ql5) objA).f28916a));
                }
            }
        } catch (Throwable th2) {
            th = th2;
            vor0Var2 = vor0Var;
            e0g0 e0g0Var5 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        vor0Var = (vor0) objA;
        return wneVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006a, code lost:
    
        if (r6 == r1) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object P(a.zje r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof a.z2f
            if (r0 == 0) goto L13
            r0 = r6
            a.z2f r0 = (a.z2f) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            a.z2f r0 = new a.z2f
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.j
            a.wne r1 = a.wne.f39444a
            int r2 = r0.l
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2a
            a.z1x.P(r6)
            goto L6d
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r5)
            r5 = 0
            return r5
        L31:
            int r2 = r0.i
            a.z1x.P(r6)
            goto L59
        L37:
            a.z1x.P(r6)
            a.rpt r6 = r5.v
            int r2 = r6.a()
            java.lang.Object r6 = r5.D()
            a.l2f r6 = (a.l2f) r6
            java.lang.String r6 = r6.f19304a
            r0.i = r2
            r0.l = r4
            a.hnu r4 = r5.C
            java.lang.Object r4 = r4.f13365a
            a.nhf0 r4 = (a.nhf0) r4
            java.lang.Object r6 = r4.s(r2, r0, r6)
            if (r6 != r1) goto L59
            goto L6c
        L59:
            a.for0 r6 = (a.for0) r6
            a.ryu r4 = r5.B
            r4.b(r6)
            r0.i = r2
            r0.l = r3
            a.nou r5 = r5.w
            java.io.Serializable r6 = a.nou.b(r5, r0)
            if (r6 != r1) goto L6d
        L6c:
            return r1
        L6d:
            a.ql5 r6 = (a.ql5) r6
            long r5 = r6.f28916a
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a3f.P(a.zje):java.lang.Object");
    }

    @Override // a.i3t0, a.k3t0
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public final void x(y1f y1fVar) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        y1fVar.getClass();
        boolean z = y1fVar instanceof v1f;
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        if (z) {
            p7m0 p7m0Var = ocjVar.f25029a;
            do {
                value4 = p7m0Var.getValue();
                value4.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var.m(value4, l2f.a((l2f) value4, ((v1f) y1fVar).f36625a, false, false, null, 0, 1006)));
            return;
        }
        if (y1fVar instanceof t1f) {
            if (((l2f) D()).f19304a.length() > 0) {
                x(r1f.f29677a);
                return;
            }
            return;
        }
        boolean z2 = y1fVar instanceof w1f;
        byte b = 0;
        i1w0 i1w0Var = this.p;
        if (z2) {
            k0w0 k0w0VarI = cs0.i(i1w0Var, i1w0Var);
            final bj5 bj5Var = this.r;
            bj5Var.getClass();
            k0w0VarI.h(new FragmentScreen() { // from class: org.xplatform.barcode_scanner.impl.navigation.BarcodeScannerFactoryImpl$barcodeScannerScreen$1
                @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                public final Fragment a(m1r m1rVar) {
                    m1rVar.getClass();
                    tu5.V1.getClass();
                    tu5 tu5Var = new tu5();
                    iiy[] iiyVarArr = tu5.W1;
                    tu5Var.P1.x(tu5Var, iiyVarArr[1], "BARCODE_SCANNER_REQUEST_KEY");
                    tu5Var.Q1.x(tu5Var, iiyVarArr[2], "BARCODE_SCANNER_BUNDLE_KEY");
                    return tu5Var;
                }

                @Override // a.m7h0
                /* JADX INFO: renamed from: b */
                public final String getF45455a() {
                    bj5Var.getClass();
                    return "BarcodeScannerFragment";
                }

                @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                /* JADX INFO: renamed from: g */
                public final /* bridge */ boolean getB() {
                    return true;
                }
            });
            ListIterator listIteratorO = b1j.o(i1w0Var, k0w0VarI.f17489a, 0);
            while (true) {
                paw pawVar = (paw) listIteratorO;
                if (!pawVar.hasNext()) {
                    return;
                } else {
                    i1w0Var.a((oe50) pawVar.next());
                }
            }
        } else {
            if (y1fVar instanceof x1f) {
                p7m0 p7m0Var2 = ocjVar.f25029a;
                do {
                    value3 = p7m0Var2.getValue();
                    value3.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var2.m(value3, l2f.a((l2f) value3, null, false, false, null, ((x1f) y1fVar).f40119a, 943)));
                return;
            }
            if (!(y1fVar instanceof u1f)) {
                if (y1fVar instanceof r1f) {
                    ygp ygpVar = ygp.p;
                    r9u r9uVar = this.A;
                    r9uVar.getClass();
                    j1q0 j1q0Var = r9uVar.f30104a;
                    j1q0Var.getClass();
                    boolean zD = j1q0Var.f15748a.d(ygpVar);
                    byte b2 = 1;
                    yje yjeVar = null;
                    if (zD) {
                        i3t0.K(this, null, new u2f(this, b), new tw(this, yjeVar, b2), 1);
                        return;
                    } else {
                        i3t0.K(this, null, new u2f(this, b2), new bu(this, yjeVar, (byte) 6), 1);
                        return;
                    }
                }
                if (y1fVar instanceof q1f) {
                    p7m0 p7m0Var3 = ocjVar.f25029a;
                    do {
                        value2 = p7m0Var3.getValue();
                        value2.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var3.m(value2, l2f.a((l2f) value2, null, false, false, ((q1f) y1fVar).f27949a, 0, 1005)));
                    return;
                }
                if (!(y1fVar instanceof s1f)) {
                    t9f.b();
                    return;
                }
                p7m0 p7m0Var4 = ocjVar.f25029a;
                do {
                    value = p7m0Var4.getValue();
                    value.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var4.m(value, l2f.a((l2f) value, null, false, ((s1f) y1fVar).f31453a, null, 0, 1015)));
                return;
            }
            CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
            ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ, 0);
            while (true) {
                paw pawVar2 = (paw) listIteratorP;
                if (!pawVar2.hasNext()) {
                    return;
                } else {
                    i1w0Var.a((oe50) pawVar2.next());
                }
            }
        }
    }
}

package a;

import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;

/* JADX INFO: loaded from: classes4.dex */
public final class kgb0 extends i3t0 {
    public static final /* synthetic */ int k0 = 0;
    public final khf0 A;
    public final nr B;
    public final xak C;
    public final o3c D;
    public final uii E;
    public final yuu F;
    public final eot G;
    public final b8u H;
    public final jqc I;
    public final jqc J;
    public final n4u K;
    public final ls L;
    public final scu M;
    public final ntu N;
    public final z4u O;
    public final p4u P;
    public final lbu Q;
    public final nhf0 R;
    public final oct S;
    public final uf3 T;
    public final uxs0 U;
    public final gw60 V;
    public final hs60 W;
    public final yo4 X;
    public final gg5 Y;
    public final sff0 Z;
    public c4m0 a0;
    public bby b0;
    public bby c0;
    public bby d0;
    public bby e0;
    public c4m0 f0;
    public bby g0;
    public bby h0;
    public bby i0;
    public bby j0;
    public final vzg0 o;
    public final mne p;
    public final i1w0 q;
    public final ouu r;
    public final duj s;
    public final m1e t;
    public final wv70 u;
    public final l570 v;
    public final jqt w;
    public final xrt x;
    public final lyt y;
    public final fmt z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kgb0(vzg0 vzg0Var, ctf0 ctf0Var, ocl oclVar, mne mneVar, i1w0 i1w0Var, ouu ouuVar, duj dujVar, m1e m1eVar, wv70 wv70Var, l570 l570Var, pru pruVar, jqt jqtVar, k9c k9cVar, xrt xrtVar, lyt lytVar, fmt fmtVar, khf0 khf0Var, nr nrVar, xak xakVar, o3c o3cVar, uii uiiVar, yuu yuuVar, eot eotVar, b8u b8uVar, tqt tqtVar, jqc jqcVar, jqc jqcVar2, n4u n4uVar, kqc kqcVar, ls lsVar, scu scuVar, ntu ntuVar, z4u z4uVar, p4u p4uVar, lbu lbuVar, nhf0 nhf0Var, oct octVar, uf3 uf3Var, uxs0 uxs0Var, gw60 gw60Var, hs60 hs60Var, yo4 yo4Var, gg5 gg5Var) {
        super(new qw80(m1eVar, tqtVar, k9cVar), cvm0.p(mneVar.c, mneVar.f22085a), new cz(oclVar, ctf0Var, (byte) 29), (yzn0) null);
        ctf0Var.getClass();
        i1w0Var.getClass();
        m1eVar.getClass();
        this.o = vzg0Var;
        this.p = mneVar;
        this.q = i1w0Var;
        this.r = ouuVar;
        this.s = dujVar;
        this.t = m1eVar;
        this.u = wv70Var;
        this.v = l570Var;
        this.w = jqtVar;
        this.x = xrtVar;
        this.y = lytVar;
        this.z = fmtVar;
        this.A = khf0Var;
        this.B = nrVar;
        this.C = xakVar;
        this.D = o3cVar;
        this.E = uiiVar;
        this.F = yuuVar;
        this.G = eotVar;
        this.H = b8uVar;
        this.I = jqcVar;
        this.J = jqcVar2;
        this.K = n4uVar;
        this.L = lsVar;
        this.M = scuVar;
        this.N = ntuVar;
        this.O = z4uVar;
        this.P = p4uVar;
        this.Q = lbuVar;
        this.R = nhf0Var;
        this.S = octVar;
        this.T = uf3Var;
        this.U = uxs0Var;
        this.V = gw60Var;
        this.W = hs60Var;
        this.X = yo4Var;
        this.Y = gg5Var;
        this.Z = pruVar.a();
    }

    public final void M(long j) {
        sac.V(jiu0.a(this), new e9b0(1, this, kgb0.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 3), null, this.p.b, new wn10(this, j, null, (byte) 10), 10);
    }

    public final void N() {
        v3c.N(this.v.h);
        e3c.n(this.b0);
        e3c.n(this.c0);
        e3c.n(this.d0);
        e3c.n(this.e0);
        e3c.n(this.f0);
        e3c.n(this.j0);
    }

    public final void O(boolean z) {
        e3c.n(this.i0);
        this.i0 = sac.V(jiu0.a(this), new e9b0(1, this, kgb0.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 4), null, this.p.b, new a220((Object) this, z, (yje) null, (byte) 8), 10);
    }

    public final void P(int i) {
        hs60 hs60Var = this.W;
        if (i == 0) {
            zn60 zn60Var = zn60.Main;
            hs60Var.getClass();
            i8i.D("screen", "main_screen", hs60Var.f13566a, "games_open_all");
        }
        String strValueOf = String.valueOf(i);
        zn60 zn60Var2 = zn60.Main;
        hs60Var.a(strValueOf);
        y1p y1pVar = y1p.MAIN;
        gw60 gw60Var = this.V;
        gw60Var.getClass();
        gw60Var.f12011a.a(tx3.l0(new k1p[]{new i1p(i, (byte) 2), new j1p("popular_new_games", (byte) 0)}), 3005L);
        this.q.d(new z08((Object) this, i, (byte) 14));
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0065  */
    public final void Q(Throwable th) {
        p7m0 p7m0Var;
        Object value;
        Object value2;
        Object value3;
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        if (th == null) {
            p7m0Var = ocjVar.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var.m(value, ufb0.a((ufb0) value, null, false, false, seb0.b, false, null, null, null, null, null, null, 4087)));
        } else if (th instanceof sq60) {
            p7m0 p7m0Var2 = ocjVar.f25029a;
            do {
                value3 = p7m0Var2.getValue();
                value3.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var2.m(value3, ufb0.a((ufb0) value3, null, false, false, seb0.d, false, null, null, null, null, null, null, 4087)));
        } else if (th instanceof vub0) {
            p7m0 p7m0Var3 = ocjVar.f25029a;
            do {
                value2 = p7m0Var3.getValue();
                value2.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var3.m(value2, ufb0.a((ufb0) value2, null, false, false, seb0.c, false, null, null, null, null, null, null, 4087)));
        } else {
            p7m0Var = ocjVar.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var.m(value, ufb0.a((ufb0) value, null, false, false, seb0.b, false, null, null, null, null, null, null, 4087)));
        }
        this.s.b(th, new yr0(th, (byte) 20));
    }

    public final void R() {
        Object value;
        bby bbyVar = this.d0;
        if (bbyVar == null || !bbyVar.isActive()) {
            if (!((ufb0) D()).j.a()) {
                p7m0 p7m0Var = this.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    this.f.getClass();
                } while (!p7m0Var.m(value, ufb0.a((ufb0) value, null, false, false, null, false, null, null, null, vee.f37282a, null, null, 3583)));
            }
            this.d0 = sac.V(jiu0.a(this), new bgb0(this, (byte) 0), null, this.p.b, new o3s(this, null, (byte) 29), 10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00de A[PHI: r2 r12 r13 r14
  0x00de: PHI (r2v4 boolean) = (r2v3 boolean), (r2v5 boolean) binds: [B:30:0x00bb, B:35:0x00d6] A[DONT_GENERATE, DONT_INLINE]
  0x00de: PHI (r12v11 a.pbv) = (r12v0 a.pbv), (r12v13 a.pbv) binds: [B:30:0x00bb, B:35:0x00d6] A[DONT_GENERATE, DONT_INLINE]
  0x00de: PHI (r13v4 java.lang.String) = (r13v0 java.lang.String), (r13v5 java.lang.String) binds: [B:30:0x00bb, B:35:0x00d6] A[DONT_GENERATE, DONT_INLINE]
  0x00de: PHI (r14v11 boolean) = (r14v5 boolean), (r14v12 boolean) binds: [B:30:0x00bb, B:35:0x00d6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:39:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006a, code lost:
    
        if (r14 == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00cd, code lost:
    
        if (r0 == r1) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object S(a.pbv r12, java.lang.String r13, a.zje r14) {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.kgb0.S(a.pbv, java.lang.String, a.zje):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object next;
        int i;
        lq5 jq5Var;
        Object value;
        aeb0 aeb0Var = (aeb0) obj;
        aeb0Var.getClass();
        super.x(aeb0Var);
        boolean z = aeb0Var instanceof pdb0;
        byte b = 0;
        byte b2 = 1;
        mne mneVar = this.p;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        if (!z) {
            if (!(aeb0Var instanceof zdb0)) {
                t9f.b();
                return;
            }
            zdb0 zdb0Var = (zdb0) aeb0Var;
            if (zdb0Var instanceof qdb0) {
                qdb0 qdb0Var = (qdb0) zdb0Var;
                nv70 nv70Var = qdb0Var.f28528a;
                int i2 = nv70Var.f24178a;
                String str = qdb0Var.b;
                hfe hfeVar = ((ufb0) D()).i;
                bfe bfeVar = hfeVar instanceof bfe ? (bfe) hfeVar : null;
                Iterable iterable = bfeVar != null ? ((deb0) bfeVar.f2497a).f5942a : null;
                if (iterable == null) {
                    iterable = iun.f15405a;
                }
                Iterator it = CollectionsKt.S0(iterable).iterator();
                do {
                    iil iilVar = (iil) it;
                    if (!iilVar.b.hasNext()) {
                        next = null;
                        break;
                    }
                    next = iilVar.next();
                } while (((lr5) ((IndexedValue) next).b).f20512a != i2);
                IndexedValue indexedValue = (IndexedValue) next;
                if (indexedValue == null) {
                    i = -1000;
                } else {
                    int i3 = indexedValue.f46061a;
                    lr5 lr5Var = (lr5) indexedValue.b;
                    String strY = c3x.y(lr5Var.h, lr5Var.j);
                    if (strY.length() == 0) {
                        strY = c3x.w(lr5Var.h);
                    }
                    String str2 = strY;
                    Integer numA = ks60.a(lr5Var.k, str);
                    this.X.o(lr5Var.f20512a, i3, numA, str2, "popular_new_games");
                    this.Y.e(lr5Var.f20512a, str2, i3, y1p.POPULAR_NEW_XGAMES, numA != null ? Float.valueOf(numA.intValue()) : null);
                    i = i3;
                }
                i3t0.A(this, this.u, new nv70(i2, i, nv70Var.c), null, null, 6);
                return;
            }
            if (zdb0Var instanceof rdb0) {
                bby bbyVar = this.g0;
                if (bbyVar == null || !bbyVar.isActive()) {
                    this.g0 = sac.V(jiu0.a(this), new e9b0(1, this, kgb0.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 7), null, mneVar.b, new cgb0(this, objArr4 == true ? 1 : 0, b), 10);
                    return;
                }
                return;
            }
            if (zdb0Var instanceof tdb0) {
                int iOrdinal = ((tdb0) zdb0Var).f33761a.ordinal();
                i1w0 i1w0Var = this.q;
                gw60 gw60Var = this.V;
                hs60 hs60Var = this.W;
                if (iOrdinal == 0) {
                    i8i.D("point", "lucky_wheel", hs60Var.f13566a, "games_promos_popular_call");
                    s1p s1pVar = gw60Var.f12011a;
                    beb0[] beb0VarArr = beb0.f2441a;
                    s1pVar.a(cui0.b(new j1p("lucky_wheel", (byte) 0)), 12012L);
                    M(s470.LUCKY_WHEEL.a());
                    i1w0Var.d(new bgb0(this, b2));
                    return;
                }
                if (iOrdinal != 1) {
                    t9f.b();
                    return;
                }
                i8i.D("point", "jackpot", hs60Var.f13566a, "games_promos_popular_call");
                s1p s1pVar2 = gw60Var.f12011a;
                beb0[] beb0VarArr2 = beb0.f2441a;
                s1pVar2.a(cui0.b(new j1p("jackpot", (byte) 0)), 12012L);
                i1w0Var.d(new bgb0(this, (byte) 2));
                return;
            }
            if (zdb0Var instanceof udb0) {
                return;
            }
            if (zdb0Var instanceof xdb0) {
                P(((xdb0) zdb0Var).f40685a);
                return;
            }
            if (zdb0Var instanceof vdb0) {
                P(((vdb0) zdb0Var).f37223a);
                return;
            }
            if (zdb0Var instanceof sdb0) {
                sdb0 sdb0Var = (sdb0) zdb0Var;
                bby bbyVar2 = this.h0;
                if (bbyVar2 == null || !bbyVar2.isActive()) {
                    this.h0 = sac.V(jiu0.a(this), new e9b0(1, this, kgb0.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 8), null, mneVar.b, new qe5((Object) sdb0Var, (Object) this, (yje) (objArr3 == true ? 1 : 0), (byte) 13), 10);
                    return;
                }
                return;
            }
            if (zdb0Var instanceof wdb0) {
                wdb0 wdb0Var = (wdb0) zdb0Var;
                bby bbyVar3 = this.h0;
                if (bbyVar3 == null || !bbyVar3.isActive()) {
                    this.h0 = sac.V(jiu0.a(this), new e9b0(1, this, kgb0.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 5), null, mneVar.b, new qe5((Object) wdb0Var, (Object) this, (yje) (objArr2 == true ? 1 : 0), (byte) 11), 10);
                    return;
                }
                return;
            }
            if (!(zdb0Var instanceof ydb0)) {
                t9f.b();
                return;
            }
            ydb0 ydb0Var = (ydb0) zdb0Var;
            bby bbyVar4 = this.h0;
            if (bbyVar4 == null || !bbyVar4.isActive()) {
                this.h0 = sac.V(jiu0.a(this), new e9b0(1, this, kgb0.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 6), null, mneVar.b, new qe5((Object) ydb0Var, (Object) this, (yje) (objArr == true ? 1 : 0), (byte) 12), 10);
                return;
            }
            return;
        }
        pdb0 pdb0Var = (pdb0) aeb0Var;
        if (pdb0Var instanceof mdb0) {
            e3c.n(this.a0);
            e3c.n(this.i0);
            N();
            return;
        }
        boolean z2 = pdb0Var instanceof ndb0;
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        if (!z2) {
            if (!(pdb0Var instanceof odb0)) {
                if (pdb0Var instanceof ldb0) {
                    E();
                    return;
                } else {
                    t9f.b();
                    return;
                }
            }
            boolean z3 = this.Z.L.e && this.x.a();
            switch (r0.b.e) {
                case SQUARE_S:
                    jq5Var = new jq5();
                    break;
                case SQUARE_S_NO_TITLE:
                    jq5Var = kq5.f18703a;
                    break;
                case SQUARE_L:
                    jq5Var = hq5.f13470a;
                    break;
                case SQUARE_L_NO_TITLE:
                    jq5Var = iq5.f15191a;
                    break;
                case RECTANGLE_VERTICAL:
                    jq5Var = fq5.f9956a;
                    break;
                case RECTANGLE_VERTICAL_NO_TITLE:
                    jq5Var = gq5.f11714a;
                    break;
                case RECTANGLE_HORIZONTAL:
                    jq5Var = dq5.f6497a;
                    break;
                case RECTANGLE_HORIZONTAL_NO_TITLE:
                    jq5Var = eq5.f8219a;
                    break;
                case CARD_HORIZONTAL:
                    jq5Var = cq5.f4775a;
                    break;
                default:
                    t9f.b();
                    return;
            }
            lq5 lq5Var = jq5Var;
            p7m0 p7m0Var = ocjVar.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var.m(value, ufb0.a((ufb0) value, null, false, false, null, z3, lq5Var, null, null, null, null, null, 4047)));
            this.a0 = sac.T(new dnq(new fnq(new p6d(this.t.b(), this.w.a(), igb0.h, (byte) 1), new ggb0(this, objArr6 == true ? 1 : 0, b2), (byte) 4), new jgb0((Object) this, (yje) (objArr5 == true ? 1 : 0), b), (byte) 1), d5c.S(jiu0.a(this), mneVar.b), foe.h);
            return;
        }
        String str3 = (String) this.o.a("PopularOneXGames.SCREEN_NAME");
        if (str3 == null) {
            str3 = "";
        }
        String str4 = str3;
        p7m0 p7m0Var2 = ocjVar.f25029a;
        while (true) {
            Object value2 = p7m0Var2.getValue();
            value2.getClass();
            oyg0Var.getClass();
            String str5 = str4;
            if (p7m0Var2.m(value2, ufb0.a((ufb0) value2, str4, false, false, null, false, null, null, null, null, null, null, 4094))) {
                return;
            } else {
                str4 = str5;
            }
        }
    }
}

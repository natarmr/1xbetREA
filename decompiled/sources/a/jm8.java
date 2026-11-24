package a;

import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;

/* JADX INFO: loaded from: classes4.dex */
public final class jm8 extends i3t0 {
    public static final /* synthetic */ int V = 0;
    public final ycu A;
    public final dcu B;
    public final trm0 C;
    public final uxs0 D;
    public final oct E;
    public final v88 F;
    public final ix0 G;
    public final l7k H;
    public final cmt I;
    public final ih5 J;
    public final hs60 K;
    public final ih5 L;
    public final duj M;
    public final m1e N;
    public final mne O;
    public final i1w0 P;
    public c4m0 Q;
    public bby R;
    public bby S;
    public bby T;
    public bby U;
    public final nr o;
    public final nr p;
    public final ls q;
    public final p4u r;
    public final ahu s;
    public final kyg0 t;
    public final ot u;
    public final jyg0 v;
    public final yoc w;
    public final yoc x;
    public final pbu y;
    public final lbu z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jm8(vzg0 vzg0Var, nr nrVar, nr nrVar2, ls lsVar, k9c k9cVar, p4u p4uVar, ahu ahuVar, kyg0 kyg0Var, ot otVar, jyg0 jyg0Var, yoc yocVar, yoc yocVar2, pbu pbuVar, pru pruVar, lbu lbuVar, ycu ycuVar, dcu dcuVar, trm0 trm0Var, uxs0 uxs0Var, oct octVar, v88 v88Var, ix0 ix0Var, l7k l7kVar, cmt cmtVar, ih5 ih5Var, hs60 hs60Var, ih5 ih5Var2, duj dujVar, ctf0 ctf0Var, ocl oclVar, m1e m1eVar, mne mneVar, i1w0 i1w0Var) {
        super(new kk0(k9cVar, m1eVar, pruVar, (byte) 12), cvm0.p(mneVar.c, mneVar.f22085a), new cz(ctf0Var, oclVar, (byte) 7), (yzn0) null);
        ctf0Var.getClass();
        m1eVar.getClass();
        this.o = nrVar;
        this.p = nrVar2;
        this.q = lsVar;
        this.r = p4uVar;
        this.s = ahuVar;
        this.t = kyg0Var;
        this.u = otVar;
        this.v = jyg0Var;
        this.w = yocVar;
        this.x = yocVar2;
        this.y = pbuVar;
        this.z = lbuVar;
        this.A = ycuVar;
        this.B = dcuVar;
        this.C = trm0Var;
        this.D = uxs0Var;
        this.E = octVar;
        this.F = v88Var;
        this.G = ix0Var;
        this.H = l7kVar;
        this.I = cmtVar;
        this.J = ih5Var;
        this.K = hs60Var;
        this.L = ih5Var2;
        this.M = dujVar;
        this.N = m1eVar;
        this.O = mneVar;
        this.P = i1w0Var;
        w3t w3tVar = (w3t) vzg0Var.a("BonusesFeature.SOURCE_SCREEN");
        w3tVar = w3tVar == null ? u3t.f35014a : w3tVar;
        p7m0 p7m0Var = this.i.f25029a;
        while (true) {
            Object value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
            w3t w3tVar2 = w3tVar;
            if (p7m0Var.m(value, kl8.a((kl8) value, false, w3tVar2, null, null, false, false, null, null, false, null, null, false, false, 65531))) {
                return;
            } else {
                w3tVar = w3tVar2;
            }
        }
    }

    public final void M(csr csrVar, String str) {
        csr csrVar2;
        jm8 jm8Var = this;
        p7m0 p7m0Var = jm8Var.i.f25029a;
        while (true) {
            Object value = p7m0Var.getValue();
            value.getClass();
            p7m0 p7m0Var2 = p7m0Var;
            jm8Var.f.getClass();
            if (p7m0Var2.m(value, kl8.a((kl8) value, false, null, null, csrVar, false, false, null, null, false, null, null, false, false, 65519))) {
                break;
            }
            p7m0Var = p7m0Var2;
            jm8Var = this;
        }
        if (((kl8) D()).c instanceof u3t) {
            if (csrVar.f4905a.f3145a.b()) {
                G(hl8.f13244a);
                return;
            } else {
                S(csrVar.f4905a.b, csrVar, str);
                return;
            }
        }
        w3t w3tVar = ((kl8) D()).c;
        v3t v3tVar = w3tVar instanceof v3t ? (v3t) w3tVar : null;
        if (v3tVar == null || (csrVar2 = v3tVar.c) == null) {
            csrVar2 = csr.e;
        }
        if (csrVar2.f4905a.equals(csrVar.f4905a)) {
            G(new zk8(csr.e));
        } else {
            i3t0.K(this, this.O.b, null, new bm8(this, str, csrVar, null), 2);
            G(new zk8(csrVar));
        }
        i1w0 i1w0Var = this.P;
        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ, 0);
        while (true) {
            paw pawVar = (paw) listIteratorP;
            if (!pawVar.hasNext()) {
                return;
            } else {
                i1w0Var.a((oe50) pawVar.next());
            }
        }
    }

    public final void N(Throwable th) {
        Object value;
        this.M.b(th, new i87((byte) 27));
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
        } while (!p7m0Var.m(value, kl8.a((kl8) value, false, null, null, null, false, false, null, null, false, null, null, false, true, 49055)));
    }

    public final void O(boolean z) {
        bby bbyVar = this.T;
        yje yjeVar = null;
        if (bbyVar != null) {
            bbyVar.cancel(null);
        }
        this.T = sac.V(jiu0.a(this), em8.f8035a, new xl8(this, (byte) 0), this.O.b, new u88((Object) this, z, yjeVar, (byte) 1), 8);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0238 A[LOOP:6: B:98:0x0232->B:100:0x0238, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:103:0x024c  */
    /* JADX WARN: Code duplicated, block: B:106:0x0252 A[LOOP:3: B:83:0x01b7->B:106:0x0252, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:108:0x00e1 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:0x01e2 A[EDGE_INSN: B:121:0x01e2->B:85:0x01e2 BREAK  A[LOOP:3: B:83:0x01b7->B:106:0x0252], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:0x0201 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:0x01f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:128:0x0221 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:130:0x020e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:0x01a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:0x0193 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:51:0x0109 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:52:0x010b  */
    /* JADX WARN: Code duplicated, block: B:59:0x0131  */
    /* JADX WARN: Code duplicated, block: B:62:0x0144 A[LOOP:2: B:60:0x013e->B:62:0x0144, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:64:0x0176  */
    /* JADX WARN: Code duplicated, block: B:68:0x0180  */
    /* JADX WARN: Code duplicated, block: B:71:0x0187  */
    /* JADX WARN: Code duplicated, block: B:72:0x018a  */
    /* JADX WARN: Code duplicated, block: B:75:0x0199  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:81:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:88:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:94:0x0214  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007f, code lost:
    
        if (r10 == r3) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object P(a.je8 r27, boolean r28, a.zje r29) {
        /*
            Method dump skipped, instruction units count: 598
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.jm8.P(a.je8, boolean, a.zje):java.lang.Object");
    }

    public final void Q(boolean z, boolean z2) {
        Object value;
        bby bbyVar = this.S;
        yje yjeVar = null;
        if (bbyVar != null) {
            bbyVar.cancel(null);
        }
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
        } while (!p7m0Var.m(value, kl8.a((kl8) value, false, null, null, null, z, z2, null, null, false, null, null, false, false, 65439)));
        this.S = sac.g0(jiu0.a(this), jm8.class.getName().concat(".loadContent"), this.O.b, new li8(1, this, jm8.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 5), new ya(this, yjeVar, (byte) 10), 86);
    }

    public final void R(long j, je8 je8Var, w3t w3tVar, String str, lz60 lz60Var, fc8 fc8Var) {
        x3t x3tVar;
        int i = (int) j;
        Integer numValueOf = Integer.valueOf(i);
        String str2 = je8Var.f16360a;
        boolean z = w3tVar instanceof u3t;
        String str3 = z ? str2 : null;
        if (w3tVar instanceof v3t) {
            x3tVar = x3t.GAMES;
        } else {
            if (!z) {
                t9f.b();
                return;
            }
            x3tVar = x3t.BONUSES;
        }
        this.J.a(numValueOf, str3, x3tVar, str, lz60Var, fc8Var != null ? Integer.valueOf(fc8Var.a()) : null);
        this.G.e(Integer.valueOf(i), z ? str2 : null, ((kl8) D()).c.equals(u3t.f35014a) ? "bonuses" : "games", str, lz60Var, fc8Var != null ? Integer.valueOf(fc8Var.a()) : null);
    }

    public final void S(long j, csr csrVar, String str) {
        bby bbyVar = this.R;
        byte b = 1;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.R = sac.V(jiu0.a(this), new li8(1, this, jm8.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 6), new xl8(this, b), this.O.b, new hm8(this, str, j, csrVar, null), 8);
        }
    }

    public final void T(List list) {
        bby bbyVar = this.U;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.U = sac.f0(jiu0.a(this), this.x.a(), TimeUnit.MILLISECONDS, this.O.b, new li8(1, this, jm8.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 7), new oa(this, list, (yje) null), 32);
        }
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        Object value2;
        x3t x3tVar;
        Object value3;
        ci8 ci8Var = (ci8) obj;
        ci8Var.getClass();
        super.x(ci8Var);
        if (ci8Var instanceof mh8) {
            T(kotlin.collections.a.c(Long.valueOf(((mh8) ci8Var).f21777a)));
            return;
        }
        boolean z = ci8Var instanceof oh8;
        byte b = 0;
        p0w0 p0w0Var = p0w0.f26173a;
        i1w0 i1w0Var = this.P;
        if (z) {
            CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
            ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0Var), i1w0Var, copyOnWriteArrayListQ, 0);
            while (true) {
                paw pawVar = (paw) listIteratorP;
                if (!pawVar.hasNext()) {
                    return;
                } else {
                    i1w0Var.a((oe50) pawVar.next());
                }
            }
        } else {
            yje yjeVar = null;
            if (ci8Var instanceof ph8) {
                c4m0 c4m0Var = this.Q;
                if (c4m0Var != null) {
                    c4m0Var.cancel(null);
                    return;
                }
                return;
            }
            boolean z2 = ci8Var instanceof qh8;
            byte b2 = 2;
            mne mneVar = this.O;
            byte b3 = 1;
            if (z2) {
                c4m0 c4m0Var2 = this.Q;
                if (c4m0Var2 == null || !c4m0Var2.isActive()) {
                    O(false);
                    this.Q = sac.T(new fnq(this.N.b(), new cm8(this, yjeVar, b2), (byte) 4), d5c.S(jiu0.a(this), mneVar.b), foe.h);
                    return;
                }
                return;
            }
            if (ci8Var instanceof kh8) {
                E();
                return;
            }
            boolean z3 = ci8Var instanceof rh8;
            u3t u3tVar = u3t.f35014a;
            if (z3) {
                boolean zEquals = ((kl8) D()).c.equals(u3tVar);
                long j = ((rh8) ci8Var).f30478a;
                if (zEquals) {
                    S(j, ((kl8) D()).e, null);
                    return;
                }
                G(new al8(j, ((kl8) D()).e));
                i1w0Var.getClass();
                CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                ListIterator listIteratorP2 = b1j.p(copyOnWriteArrayList, new c8d(y7d.f42146a, p0w0Var), i1w0Var, copyOnWriteArrayList, 0);
                while (true) {
                    paw pawVar2 = (paw) listIteratorP2;
                    if (!pawVar2.hasNext()) {
                        return;
                    } else {
                        i1w0Var.a((oe50) pawVar2.next());
                    }
                }
            } else {
                boolean z4 = ci8Var instanceof lh8;
                oyg0 oyg0Var = this.f;
                ocj ocjVar = this.i;
                if (z4) {
                    ql5 ql5Var = ((lh8) ci8Var).f20042a;
                    long j2 = ql5Var.f28916a;
                    this.t.a(j2);
                    bm5 bm5Var = bm5.d;
                    this.u.a(bm5Var, ql5Var);
                    jyg0 jyg0Var = this.v;
                    jyg0Var.getClass();
                    jyg0Var.f17359a.z(bm5Var, j2);
                    p7m0 p7m0Var = ocjVar.f25029a;
                    while (true) {
                        Object value4 = p7m0Var.getValue();
                        value4.getClass();
                        oyg0Var.getClass();
                        ql5 ql5Var2 = ql5Var;
                        if (p7m0Var.m(value4, kl8.a((kl8) value4, false, null, null, null, false, false, null, null, false, null, ql5Var2, false, false, 63487))) {
                            return;
                        } else {
                            ql5Var = ql5Var2;
                        }
                    }
                } else {
                    boolean z5 = ci8Var instanceof nh8;
                    hl8 hl8Var = hl8.f13244a;
                    if (z5) {
                        nh8 nh8Var = (nh8) ci8Var;
                        if (nh8Var.f23521a.f4905a.f3145a.b()) {
                            p7m0 p7m0Var2 = ocjVar.f25029a;
                            do {
                                value3 = p7m0Var2.getValue();
                                value3.getClass();
                                oyg0Var.getClass();
                            } while (!p7m0Var2.m(value3, kl8.a((kl8) value3, false, null, null, nh8Var.f23521a, false, false, null, null, false, null, null, false, false, 65519)));
                            G(hl8Var);
                            return;
                        }
                        return;
                    }
                    if (!(ci8Var instanceof sh8)) {
                        if (ci8Var instanceof th8) {
                            G(bl8.f2782a);
                            return;
                        }
                        if (ci8Var instanceof uh8) {
                            uh8 uh8Var = (uh8) ci8Var;
                            M(uh8Var.f35665a, uh8Var.b);
                            return;
                        }
                        if (ci8Var instanceof vh8) {
                            vh8 vh8Var = (vh8) ci8Var;
                            int i = vh8Var.f37416a;
                            if (i == 1) {
                                M(vh8Var.b, vh8Var.c);
                                return;
                            }
                            if (i != 2) {
                                return;
                            }
                            p7m0 p7m0Var3 = ocjVar.f25029a;
                            do {
                                value2 = p7m0Var3.getValue();
                                value2.getClass();
                                oyg0Var.getClass();
                            } while (!p7m0Var3.m(value2, kl8.a((kl8) value2, false, null, null, vh8Var.b, false, false, null, null, false, null, null, false, false, 65519)));
                            G(hl8Var);
                            w3t w3tVar = ((kl8) D()).c;
                            gl5 gl5Var = je8.b;
                            if (w3tVar instanceof v3t) {
                                x3tVar = x3t.GAMES;
                            } else {
                                if (!(w3tVar instanceof u3t)) {
                                    t9f.b();
                                    return;
                                }
                                x3tVar = x3t.BONUSES;
                            }
                            x3t x3tVar2 = x3tVar;
                            fc8 fc8Var = fc8.b;
                            this.J.a(null, "wild_freebet", x3tVar2, null, null, Integer.valueOf(fc8Var.a()));
                            this.G.e(null, "wild_freebet", ((kl8) D()).c.equals(u3tVar) ? "bonuses" : "games", null, null, Integer.valueOf(fc8Var.a()));
                            return;
                        }
                        if (ci8Var instanceof wh8) {
                            bby bbyVar = this.R;
                            if (bbyVar == null || !bbyVar.isActive()) {
                                zn60 zn60Var = ((kl8) D()).c.equals(u3tVar) ? zn60.OneXBonuses : zn60.Game;
                                String lowerCase = "LUCKY_WHEEL".toLowerCase(Locale.ROOT);
                                lowerCase.getClass();
                                String strName = zn60Var.name();
                                ix0 ix0Var = this.G;
                                ix0Var.getClass();
                                strName.getClass();
                                ix0Var.f15516a.a(tx3.l0(new k1p[]{new j1p(lowerCase, (byte) 0), new j1p(strName, (byte) 1)}), 3016L);
                                hs60 hs60Var = this.K;
                                hs60Var.getClass();
                                hs60Var.f13566a.a("games_bonus_games_call", xp20.f(new Pair("point", "lucky_wheel"), new Pair("screen", zn60Var.f44660a)));
                                this.R = sac.V(jiu0.a(this), new li8(1, this, jm8.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 3), null, mneVar.b, new cm8(this, yjeVar, b), 10);
                                return;
                            }
                            return;
                        }
                        if (ci8Var instanceof xh8) {
                            je8 je8Var = (je8) ((kl8) D()).h.get((int) ((xh8) ci8Var).f40876a);
                            p7m0 p7m0Var4 = ocjVar.f25029a;
                            do {
                                value = p7m0Var4.getValue();
                                value.getClass();
                                oyg0Var.getClass();
                            } while (!p7m0Var4.m(value, kl8.a((kl8) value, false, null, je8Var, null, false, false, null, null, false, null, null, false, false, 65527)));
                            bby bbyVar2 = this.S;
                            if (bbyVar2 != null) {
                                bbyVar2.cancel(null);
                            }
                            this.S = sac.V(jiu0.a(this), new li8(1, this, jm8.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 4), null, mneVar.b, new cm8(this, yjeVar, b3), 10);
                            return;
                        }
                        if (ci8Var instanceof yh8) {
                            Q(false, false);
                            return;
                        }
                        if (ci8Var instanceof zh8) {
                            O(true);
                            return;
                        }
                        if (ci8Var instanceof ai8) {
                            Q(false, true);
                            return;
                        }
                        if (!(ci8Var instanceof bi8)) {
                            t9f.b();
                            return;
                        }
                        bby bbyVar3 = this.T;
                        if (bbyVar3 == null || !bbyVar3.isActive()) {
                            this.L.f(k7k.OneXBonus);
                            y1p y1pVar = y1p.MAIN;
                            this.H.b("games_bonus", this.I.g());
                            this.T = sac.V(jiu0.a(this), dm8.f6310a, null, mneVar.b, new cm8(this, yjeVar, (byte) 3), 10);
                            return;
                        }
                        return;
                    }
                    CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0Var);
                    ListIterator listIteratorP3 = b1j.p(copyOnWriteArrayListQ2, new c8d(y7d.f42146a, p0w0Var), i1w0Var, copyOnWriteArrayListQ2, 0);
                    while (true) {
                        paw pawVar3 = (paw) listIteratorP3;
                        if (!pawVar3.hasNext()) {
                            return;
                        } else {
                            i1w0Var.a((oe50) pawVar3.next());
                        }
                    }
                }
            }
        }
    }
}

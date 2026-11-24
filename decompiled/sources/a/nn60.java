package a;

import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.UUID;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class nn60 extends x2t0 {
    public final mne h;
    public final ls i;
    public final p4u j;
    public final duj k;
    public final oeg0 l;
    public final hs60 m;
    public final iqt n;
    public final dcu o;
    public final as p;
    public final as q;
    public final z4u r;
    public final gw60 s;
    public final pru t;
    public final hnu u;
    public final ctf0 v;
    public final uxs0 w;
    public bmr x;
    public boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nn60(mne mneVar, ls lsVar, p4u p4uVar, duj dujVar, oeg0 oeg0Var, hs60 hs60Var, iqt iqtVar, dcu dcuVar, as asVar, as asVar2, z4u z4uVar, gw60 gw60Var, pru pruVar, hnu hnuVar, ctf0 ctf0Var, uxs0 uxs0Var) {
        super(new th50((byte) 27));
        oeg0Var.getClass();
        ctf0Var.getClass();
        this.h = mneVar;
        this.i = lsVar;
        this.j = p4uVar;
        this.k = dujVar;
        this.l = oeg0Var;
        this.m = hs60Var;
        this.n = iqtVar;
        this.o = dcuVar;
        this.p = asVar;
        this.q = asVar2;
        this.r = z4uVar;
        this.s = gw60Var;
        this.t = pruVar;
        this.u = hnuVar;
        this.v = ctf0Var;
        this.w = uxs0Var;
    }

    @Override // a.j3t0
    public final Object a(Object obj, bnn0 bnn0Var) {
        Object value;
        un60 un60Var;
        Object objP;
        wne wneVar;
        Object value2;
        un60 un60Var2;
        en60 en60Var = (en60) obj;
        if (Intrinsics.d(en60Var, vm60.f37664a)) {
            e();
        } else {
            boolean z = en60Var instanceof wm60;
            ocj ocjVar = this.b;
            if (z) {
                ocjVar.getClass();
                p7m0 p7m0Var = ocjVar.f25029a;
                do {
                    value2 = p7m0Var.getValue();
                    un60Var2 = (un60) value2;
                    un60Var2.getClass();
                } while (!p7m0Var.m(value2, un60.a(un60Var2, ((wm60) en60Var).f39389a, false, null, 14)));
            } else if (en60Var instanceof ym60) {
                pbv pbvVar = ((ym60) en60Var).f42873a;
                long j = pbvVar.f26728a;
                int iB = this.u.b();
                boolean zContains = ((un60) d()).c.contains(Long.valueOf(j));
                g(pn60.f27271a);
                String str = pbvVar.n.f12884a;
                String str2 = pbvVar.c;
                str.getClass();
                str2.getClass();
                bmr bmrVar = new bmr();
                bmrVar.f2850a = zContains;
                bmrVar.b = j;
                bmrVar.c = str;
                bmrVar.d = str2;
                bmrVar.e = iB;
                this.x = bmrVar;
                g(new rn60(zContains, this.t.a().d.f27973a.d));
            } else {
                if (en60Var instanceof zm60) {
                    zm60 zm60Var = (zm60) en60Var;
                    long j2 = zm60Var.f44610a;
                    boolean z2 = zm60Var.b;
                    int i = zm60Var.c;
                    if (z2) {
                        objP = i(i, j2, bnn0Var);
                        wneVar = wne.f39444a;
                        if (objP != wneVar) {
                            objP = Unit.f46060a;
                        }
                    } else {
                        objP = p(i, j2, bnn0Var);
                        wneVar = wne.f39444a;
                        if (objP != wneVar) {
                            objP = Unit.f46060a;
                        }
                    }
                    return objP == wneVar ? objP : Unit.f46060a;
                }
                if (en60Var instanceof an60) {
                    Object objL = l(-1, bnn0Var);
                    return objL == wne.f39444a ? objL : Unit.f46060a;
                }
                if (en60Var instanceof bn60) {
                    bn60 bn60Var = (bn60) en60Var;
                    Object objM = m(bn60Var.f2868a, bn60Var.b, bn60Var.c, bnn0Var);
                    return objM == wne.f39444a ? objM : Unit.f46060a;
                }
                if (en60Var instanceof cn60) {
                    Object objJ = j((cn60) en60Var, bnn0Var);
                    return objJ == wne.f39444a ? objJ : Unit.f46060a;
                }
                if (!(en60Var instanceof xm60)) {
                    t9f.b();
                    return null;
                }
                ocjVar.getClass();
                p7m0 p7m0Var2 = ocjVar.f25029a;
                do {
                    value = p7m0Var2.getValue();
                    un60Var = (un60) value;
                    un60Var.getClass();
                } while (!p7m0Var2.m(value, un60.a(un60Var, null, false, ((xm60) en60Var).f41108a, 7)));
            }
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v7 */
    public final Object i(int i, long j, zje zjeVar) {
        fn60 fn60Var;
        if (zjeVar instanceof fn60) {
            fn60Var = (fn60) zjeVar;
            int i2 = fn60Var.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fn60Var.k = i2 - Integer.MIN_VALUE;
            } else {
                fn60Var = new fn60(this, zjeVar);
            }
        } else {
            fn60Var = new fn60(this, zjeVar);
        }
        Object obj = fn60Var.i;
        wne wneVar = wne.f39444a;
        int i3 = fn60Var.k;
        try {
            if (i3 == 0) {
                z1x.P(obj);
                Integer numValueOf = Integer.valueOf(i);
                int iIntValue = -1;
                if (i == -1) {
                    numValueOf = null;
                }
                if (numValueOf != null) {
                    iIntValue = numValueOf.intValue();
                } else {
                    bmr bmrVar = this.x;
                    Integer numValueOf2 = bmrVar != null ? Integer.valueOf(bmrVar.e) : null;
                    if (numValueOf2 != null) {
                        iIntValue = numValueOf2.intValue();
                    }
                }
                this.m.f13566a.a("game_favor_games_add", xp20.f(new Pair("game_id", Long.valueOf(j)), new Pair("action", "add_favor"), new Pair("filter", Integer.valueOf(iIntValue))));
                this.s.a((int) j, iIntValue, "add_favor");
                as asVar = this.p;
                fn60Var.k = 1;
                Object objA = asVar.a(j, fn60Var);
                this = objA;
                if (objA == wneVar) {
                    return wneVar;
                }
            } else {
                if (i3 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                this = this;
            }
        } catch (Exception e) {
            if ((e instanceof SocketTimeoutException) || (e instanceof UnknownHostException)) {
                this.g(on60.f25532a);
            } else {
                this.k.b(e, new pi40(this, (byte) 28));
            }
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(cn60 cn60Var, zje zjeVar) {
        gn60 gn60Var;
        nn60 nn60Var;
        Exception exc;
        if (zjeVar instanceof gn60) {
            gn60Var = (gn60) zjeVar;
            int i = gn60Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                gn60Var.k = i - Integer.MIN_VALUE;
            } else {
                gn60Var = new gn60(this, zjeVar);
            }
        } else {
            gn60Var = new gn60(this, zjeVar);
        }
        Object obj = gn60Var.i;
        wne wneVar = wne.f39444a;
        int i2 = gn60Var.k;
        if (i2 == 0) {
            z1x.P(obj);
            pbv pbvVar = cn60Var.f4639a;
            if (pbvVar.p) {
                return Unit.f46060a;
            }
            t470 t470Var = a570.Companion;
            long j = pbvVar.f26728a;
            boolean z = pbvVar.k;
            t470Var.getClass();
            a570 a570VarA = t470.a(z, j);
            g(pn60.f27271a);
            long jD = x1x.D(a570VarA);
            try {
                vs10 vs10Var = this.h.c;
                nn60Var = this;
                try {
                    fl3 fl3Var = new fl3(nn60Var, a570VarA, jD, cn60Var, (yje) null);
                    gn60Var.k = 1;
                    if (qjj.d0(vs10Var, fl3Var, gn60Var) == wneVar) {
                        return wneVar;
                    }
                } catch (Exception e) {
                    e = e;
                    exc = e;
                    nn60Var.k.b(exc, new pi40(exc, (byte) 29));
                }
            } catch (Exception e2) {
                e = e2;
                nn60Var = this;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            try {
                z1x.P(obj);
                nn60Var = this;
            } catch (Exception e3) {
                exc = e3;
                nn60Var = this;
                nn60Var.k.b(exc, new pi40(exc, (byte) 29));
            }
        }
        nn60Var.y = false;
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0060, code lost:
    
        if (r13 == r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00bf, code lost:
    
        if (r7 == r1) goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(a.i1w0 r8, a.a570 r9, long r10, java.lang.String r12, a.zje r13) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.nn60.k(a.i1w0, a.a570, long, java.lang.String, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object l(int i, zje zjeVar) {
        in60 in60Var;
        Object objP;
        if (zjeVar instanceof in60) {
            in60Var = (in60) zjeVar;
            int i2 = in60Var.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                in60Var.k = i2 - Integer.MIN_VALUE;
            } else {
                in60Var = new in60(this, zjeVar);
            }
        } else {
            in60Var = new in60(this, zjeVar);
        }
        Object obj = in60Var.i;
        Object obj2 = wne.f39444a;
        int i3 = in60Var.k;
        if (i3 == 0) {
            z1x.P(obj);
            bmr bmrVar = this.x;
            if (bmrVar != null) {
                long j = bmrVar.b;
                boolean z = bmrVar.f2850a;
                in60Var.k = 1;
                if (z) {
                    objP = p(i, j, in60Var);
                    if (objP != obj2) {
                        objP = Unit.f46060a;
                    }
                } else {
                    objP = i(i, j, in60Var);
                    if (objP != obj2) {
                        objP = Unit.f46060a;
                    }
                }
                if (objP == obj2) {
                    return obj2;
                }
            }
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        this.x = null;
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    public final Object m(pbv pbvVar, String str, int i, zje zjeVar) {
        jn60 jn60Var;
        lz60 lz60Var;
        if (zjeVar instanceof jn60) {
            jn60Var = (jn60) zjeVar;
            int i2 = jn60Var.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jn60Var.k = i2 - Integer.MIN_VALUE;
            } else {
                jn60Var = new jn60(this, zjeVar);
            }
        } else {
            jn60Var = new jn60(this, zjeVar);
        }
        jn60 jn60Var2 = jn60Var;
        Object obj = jn60Var2.i;
        wne wneVar = wne.f39444a;
        int i3 = jn60Var2.k;
        try {
            if (i3 == 0) {
                z1x.P(obj);
                if (pbvVar.p) {
                    return Unit.f46060a;
                }
                t470 t470Var = a570.Companion;
                long j = pbvVar.f26728a;
                boolean z = pbvVar.k;
                t470Var.getClass();
                a570 a570VarA = t470.a(z, j);
                String string = a570VarA instanceof z470 ? UUID.randomUUID().toString() : "";
                string.getClass();
                zn60 zn60Var = ((un60) d()).f35946a;
                lz60 lz60VarA = pbvVar.n.a(str);
                if (this.y || zn60Var == null) {
                    return Unit.f46060a;
                }
                String str2 = zn60Var.f44660a;
                g(pn60.f27271a);
                long jD = x1x.D(a570VarA);
                int i4 = (int) jD;
                int iOrdinal = zn60Var.ordinal();
                gw60 gw60Var = this.s;
                if (iOrdinal != 2) {
                    if (iOrdinal == 3) {
                        gw60Var.getClass();
                        lz60VarA.getClass();
                        s1p s1pVar = gw60Var.f12011a;
                        yni0 yni0Var = new yni0();
                        yni0Var.add(new i1p(i4, (byte) 2));
                        yni0Var.add(new j1p(str2, (byte) 0));
                        if (string.length() > 0) {
                            yni0Var.add(new j1p(string, (byte) 2));
                        }
                        lz60.Companion.getClass();
                        yni0Var.add(new i1p(iz60.b(lz60VarA), (byte) 1));
                        s1pVar.a(cui0.a(yni0Var), 3003L);
                    } else if (iOrdinal == 4) {
                        gw60Var.d(i4, y1p.ONE_X_FAVOR, string, lz60VarA);
                    } else if (iOrdinal == 6) {
                        gw60Var.d(i4, y1p.FAVORITE, string, lz60VarA);
                    }
                    lz60Var = lz60VarA;
                } else {
                    y1p y1pVar = y1p.MAIN;
                    gw60Var.getClass();
                    lz60VarA.getClass();
                    s1p s1pVar2 = gw60Var.f12011a;
                    yni0 yni0Var2 = new yni0();
                    lz60Var = lz60VarA;
                    yni0Var2.add(new i1p(i4, (byte) 2));
                    yni0Var2.add(new j1p("games_all", (byte) 0));
                    yni0Var2.add(new h1p(i, (byte) 0));
                    if (string.length() > 0) {
                        yni0Var2.add(new j1p(string, (byte) 2));
                    }
                    lz60.Companion.getClass();
                    yni0Var2.add(new i1p(iz60.b(lz60Var), (byte) 1));
                    s1pVar2.a(cui0.a(yni0Var2), 3003L);
                }
                hs60 hs60Var = this.m;
                if (i != -1) {
                    hs60Var.getClass();
                    lz60Var.getClass();
                    kt2 kt2Var = hs60Var.f13566a;
                    jo20 jo20Var = new jo20();
                    jo20Var.put("game_id", String.valueOf(jD));
                    jo20Var.put("screen", str2);
                    jo20Var.put("filter", Integer.valueOf(i));
                    if (string.length() > 0) {
                        jo20Var.put("session_id", string);
                    }
                    lz60.Companion.getClass();
                    jo20Var.put("point", Integer.valueOf(iz60.b(lz60Var)));
                    kt2Var.a("games_call", jo20Var.b());
                } else {
                    hs60Var.d(jD, zn60Var, string, lz60Var);
                }
                vs10 vs10Var = this.h.c;
                fl3 fl3Var = new fl3(this, a570VarA, jD, string, (yje) null);
                jn60Var2.k = 1;
                if (qjj.d0(vs10Var, fl3Var, jn60Var2) == wneVar) {
                    return wneVar;
                }
            } else {
                if (i3 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
            }
        } catch (Exception e) {
            this.k.a(e);
        }
        this.y = false;
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00e6 A[Catch: Exception -> 0x003c, TryCatch #0 {Exception -> 0x003c, blocks: (B:22:0x004d, B:42:0x00d4, B:44:0x00e6, B:45:0x00ee, B:48:0x00f9, B:15:0x0037, B:25:0x005f, B:34:0x009d, B:36:0x00ad, B:39:0x00c0, B:30:0x0082), top: B:58:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00ee A[Catch: Exception -> 0x003c, TryCatch #0 {Exception -> 0x003c, blocks: (B:22:0x004d, B:42:0x00d4, B:44:0x00e6, B:45:0x00ee, B:48:0x00f9, B:15:0x0037, B:25:0x005f, B:34:0x009d, B:36:0x00ad, B:39:0x00c0, B:30:0x0082), top: B:58:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f9 A[Catch: Exception -> 0x003c, TRY_LEAVE, TryCatch #0 {Exception -> 0x003c, blocks: (B:22:0x004d, B:42:0x00d4, B:44:0x00e6, B:45:0x00ee, B:48:0x00f9, B:15:0x0037, B:25:0x005f, B:34:0x009d, B:36:0x00ad, B:39:0x00c0, B:30:0x0082), top: B:58:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00fb, code lost:
    
        if (r0 == r7) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(a.z470 r19, java.lang.String r20, a.zje r21) {
        /*
            Method dump skipped, instruction units count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.nn60.n(a.z470, java.lang.String, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object o(long j, zje zjeVar, String str, boolean z) {
        ln60 ln60Var;
        long j2;
        String str2;
        boolean z2;
        if (zjeVar instanceof ln60) {
            ln60Var = (ln60) zjeVar;
            int i = ln60Var.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                ln60Var.n = i - Integer.MIN_VALUE;
            } else {
                ln60Var = new ln60(this, zjeVar);
            }
        } else {
            ln60Var = new ln60(this, zjeVar);
        }
        Object obj = ln60Var.l;
        wne wneVar = wne.f39444a;
        int i2 = ln60Var.n;
        if (i2 == 0) {
            z1x.P(obj);
            ln60Var.k = str;
            ln60Var.i = j;
            ln60Var.j = z;
            ln60Var.n = 1;
            Object objA = this.r.a(j, ln60Var);
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
            boolean z3 = ln60Var.j;
            long j3 = ln60Var.i;
            String str3 = ln60Var.k;
            z1x.P(obj);
            z2 = z3;
            str2 = str3;
            j2 = j3;
        }
        this.l.c().d(new k1b(this, j2, z2, str2, !((Boolean) obj).booleanValue(), (byte) 2));
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v7 */
    public final Object p(int i, long j, zje zjeVar) {
        mn60 mn60Var;
        if (zjeVar instanceof mn60) {
            mn60Var = (mn60) zjeVar;
            int i2 = mn60Var.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mn60Var.k = i2 - Integer.MIN_VALUE;
            } else {
                mn60Var = new mn60(this, zjeVar);
            }
        } else {
            mn60Var = new mn60(this, zjeVar);
        }
        Object obj = mn60Var.i;
        wne wneVar = wne.f39444a;
        int i3 = mn60Var.k;
        try {
            if (i3 == 0) {
                z1x.P(obj);
                Integer numValueOf = Integer.valueOf(i);
                int iIntValue = -1;
                if (i == -1) {
                    numValueOf = null;
                }
                if (numValueOf != null) {
                    iIntValue = numValueOf.intValue();
                } else {
                    bmr bmrVar = this.x;
                    Integer numValueOf2 = bmrVar != null ? Integer.valueOf(bmrVar.e) : null;
                    if (numValueOf2 != null) {
                        iIntValue = numValueOf2.intValue();
                    }
                }
                this.m.f13566a.a("game_favor_games_add", xp20.f(new Pair("game_id", Long.valueOf(j)), new Pair("action", "remove"), new Pair("filter", Integer.valueOf(iIntValue))));
                this.s.a((int) j, iIntValue, "remove");
                as asVar = this.q;
                mn60Var.k = 1;
                Object objA = asVar.a(j, mn60Var);
                this = objA;
                if (objA == wneVar) {
                    return wneVar;
                }
            } else {
                if (i3 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                this = this;
            }
        } catch (Exception e) {
            if ((e instanceof SocketTimeoutException) || (e instanceof UnknownHostException)) {
                this.g(on60.f25532a);
            } else {
                this.k.b(e, new pi40(this, (byte) 28));
            }
        }
        return Unit.f46060a;
    }
}

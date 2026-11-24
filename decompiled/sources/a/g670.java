package a;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class g670 extends w46 {
    public final p7m0 A;
    public final p7m0 B;
    public final p7m0 C;
    public final ol60 D;
    public final p7m0 E;
    public final ol60 F;
    public c4m0 G;
    public final c4m0 H;
    public final hs60 b;
    public final i1w0 c;
    public final vzg0 d;
    public final gw60 e;
    public final cdu f;
    public final p4u g;
    public final abu h;
    public final e5c i;
    public final k9c j;
    public final kyg0 k;
    public final duj l;
    public final mne m;
    public final n4u n;
    public final jqc o;
    public final kqc p;
    public final lbu q;
    public final m73 r;
    public final ctf0 s;
    public final j1q0 t;
    public final wsf0 u;
    public final ba50 v;
    public String w;
    public long x;
    public d270 y;
    public String z;

    public g670(hs60 hs60Var, i1w0 i1w0Var, vzg0 vzg0Var, pru pruVar, gw60 gw60Var, qxg0 qxg0Var, cdu cduVar, p4u p4uVar, abu abuVar, e5c e5cVar, k9c k9cVar, kyg0 kyg0Var, duj dujVar, mne mneVar, n4u n4uVar, jqc jqcVar, kqc kqcVar, lbu lbuVar, m73 m73Var, ctf0 ctf0Var, j1q0 j1q0Var, wsf0 wsf0Var, ba50 ba50Var, m1e m1eVar) {
        pao0 pao0Var;
        i1w0Var.getClass();
        this.b = hs60Var;
        this.c = i1w0Var;
        this.d = vzg0Var;
        this.e = gw60Var;
        this.f = cduVar;
        this.g = p4uVar;
        this.h = abuVar;
        this.i = e5cVar;
        this.j = k9cVar;
        this.k = kyg0Var;
        this.l = dujVar;
        this.m = mneVar;
        this.n = n4uVar;
        this.o = jqcVar;
        this.p = kqcVar;
        this.q = lbuVar;
        this.r = m73Var;
        this.s = ctf0Var;
        this.t = j1q0Var;
        this.u = wsf0Var;
        this.v = ba50Var;
        sff0 sff0VarA = pruVar.a();
        dyv0 dyv0Var = sff0VarA.d.f27973a;
        this.w = "";
        Long l = (Long) vzg0Var.a("OPEN_GAME_KEY");
        this.x = l != null ? l.longValue() : 0L;
        d270 d270Var = (d270) vzg0Var.a("OPEN_PROMO_KEY");
        this.y = d270Var == null ? d270.UNKNOWN : d270Var;
        String str = (String) vzg0Var.a("WEB_GAME_SESSION_UUID");
        this.z = str == null ? axq.g() : str;
        p7m0 p7m0VarA = q7m0.a(Boolean.FALSE);
        this.A = p7m0VarA;
        kat katVar = kat.f17982a;
        p7m0 p7m0VarA2 = q7m0.a(katVar);
        this.B = p7m0VarA2;
        p7m0 p7m0VarA3 = q7m0.a(katVar);
        this.C = p7m0VarA3;
        int i = 3;
        ol60 ol60Var = new ol60(3);
        this.D = ol60Var;
        boolean z = dyv0Var.c;
        boolean zX = x();
        boolean z2 = dyv0Var.d;
        int iOrdinal = sff0VarA.S0.ordinal();
        byte b = 2;
        yje yjeVar = null;
        if (iOrdinal == 0) {
            pao0Var = pao0.f26664a;
        } else if (iOrdinal == 1) {
            pao0Var = pao0.e;
        } else if (iOrdinal == 2) {
            pao0Var = pao0.b;
        } else if (iOrdinal == 3) {
            pao0Var = pao0.c;
        } else {
            if (iOrdinal != 4) {
                t9f.b();
                throw null;
            }
            pao0Var = pao0.d;
        }
        this.E = q7m0.a(new gz60("", false, false, true, z, zX, z2, pao0Var, false));
        this.F = new ol60(3);
        Integer num = (Integer) vzg0Var.a("EXTRA_CATEGORY_ID_KEY");
        if (num != null) {
            ((my60) qxg0Var.f29484a.f36498a).c = num.intValue();
        }
        sac.V(jiu0.a(this), new m570(this, (byte) 2), null, mneVar.b, new xj1((diu0) this, yjeVar, (byte) 15), 10);
        sac.T(new fnq(new hpt(dub.f0(p7m0VarA, p7m0VarA2, p7m0VarA3, f670.h), (byte) 3), new t6f(this, null), (byte) 4), d5c.S(jiu0.a(this), mneVar.b), foe.h);
        c4m0 c4m0Var = this.H;
        if (c4m0Var != null) {
            v3c.N(c4m0Var);
        }
        this.H = sac.T(new dnq(new fnq(m1eVar.b(), new ku60(new mie0(), this, yjeVar, (byte) 5), (byte) 4), new pr60(i, yjeVar, b), (byte) 1), d5c.S(jiu0.a(this), mneVar.c), foe.h);
        ol60Var.f(p570.f26392a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object A(zje zjeVar) {
        a670 a670Var;
        int i;
        if (zjeVar instanceof a670) {
            a670Var = (a670) zjeVar;
            int i2 = a670Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                a670Var.l = i2 - Integer.MIN_VALUE;
            } else {
                a670Var = new a670(this, zjeVar);
            }
        } else {
            a670Var = new a670(this, zjeVar);
        }
        Object obj = a670Var.j;
        wne wneVar = wne.f39444a;
        int i3 = a670Var.l;
        boolean z = false;
        if (i3 == 0) {
            z1x.P(obj);
            int i4 = (this.x > 0 || this.y == d270.LUCKY_WHEEL) ? 1 : 0;
            a670Var.i = i4;
            a670Var.l = 1;
            Object objW = this.h.w(a670Var);
            if (objW == wneVar) {
                return wneVar;
            }
            i = i4;
            obj = objW;
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = a670Var.i;
            z1x.P(obj);
        }
        if (((Boolean) obj).booleanValue() || i != 0) {
            z = true;
        } else {
            C(t570.f33355a);
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x007e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0091  */
    /* JADX WARN: Code duplicated, block: B:25:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ea A[PHI: r2 r4 r10 r11 r12 r13
  0x00ea: PHI (r2v4 a.b670) = (r2v6 a.b670), (r2v13 a.b670) binds: [B:24:0x00a7, B:57:0x00ea] A[DONT_GENERATE, DONT_INLINE]
  0x00ea: PHI (r4v4 a.gz60) = (r4v6 a.gz60), (r4v10 a.gz60) binds: [B:24:0x00a7, B:57:0x00ea] A[DONT_GENERATE, DONT_INLINE]
  0x00ea: PHI (r10v2 java.lang.Object) = (r10v4 java.lang.Object), (r10v11 java.lang.Object) binds: [B:24:0x00a7, B:57:0x00ea] A[DONT_GENERATE, DONT_INLINE]
  0x00ea: PHI (r11v0 a.qz40) = (r11v2 a.qz40), (r11v7 a.qz40) binds: [B:24:0x00a7, B:57:0x00ea] A[DONT_GENERATE, DONT_INLINE]
  0x00ea: PHI (r12v0 java.lang.String) = (r12v2 java.lang.String), (r12v10 java.lang.String) binds: [B:24:0x00a7, B:57:0x00ea] A[DONT_GENERATE, DONT_INLINE]
  0x00ea: PHI (r13v0 java.lang.Throwable) = (r13v1 java.lang.Throwable), (r13v12 java.lang.Throwable) binds: [B:24:0x00a7, B:57:0x00ea] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:44:0x0101  */
    /* JADX WARN: Code duplicated, block: B:49:0x010b  */
    /* JADX WARN: Code duplicated, block: B:52:0x0120  */
    /* JADX WARN: Code duplicated, block: B:54:0x0123  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00a7 -> B:40:0x00ea). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00b9 -> B:28:0x00bc). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object B(java.lang.Throwable r21, a.zje r22) {
        /*
            Method dump skipped, instruction units count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.g670.B(java.lang.Throwable, a.zje):java.lang.Object");
    }

    public final void C(v570 v570Var) {
        qjj.W(jiu0.a(this), null, null, new nf60(this, v570Var, null, (byte) 13), 3);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:23:0x004c  */
    /* JADX WARN: Code duplicated, block: B:24:0x004f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0056  */
    /* JADX WARN: Code duplicated, block: B:28:0x005c  */
    /* JADX WARN: Code duplicated, block: B:30:0x005f  */
    /* JADX WARN: Code duplicated, block: B:33:0x0068  */
    /* JADX WARN: Code duplicated, block: B:35:0x006e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0071  */
    /* JADX WARN: Code duplicated, block: B:38:0x0077  */
    /* JADX WARN: Code duplicated, block: B:39:0x007a  */
    /* JADX WARN: Code duplicated, block: B:41:0x0080  */
    /* JADX WARN: Code duplicated, block: B:42:0x0083  */
    /* JADX WARN: Code duplicated, block: B:44:0x0089  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:58:0x00db  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f5 A[LOOP:0: B:63:0x00f5->B:66:0x010f, LOOP_START, PHI: r13
  0x00f5: PHI (r13v1 java.lang.String) = (r13v0 java.lang.String), (r13v3 java.lang.String) binds: [B:62:0x00f3, B:66:0x010f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x010f A[LOOP:0: B:63:0x00f5->B:66:0x010f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:67:0x0111  */
    /* JADX WARN: Code duplicated, block: B:71:0x010e A[SYNTHETIC] */
    public final void w(String str, boolean z, boolean z2) {
        r270 r270Var;
        r270 r270Var2;
        long j;
        int i;
        Object value;
        String str2;
        fw60 fw60Var;
        gw60 gw60Var;
        int iOrdinal;
        hs60 hs60Var;
        p7m0 p7m0Var = this.E;
        if (str.equals(((gz60) p7m0Var.getValue()).f12166a)) {
            return;
        }
        switch (str) {
            case "CASH_BACK_TAB_BAR_ITEM":
                r270Var = r270.c;
                r270Var2 = r270Var;
                if (r270Var2 == r270.f29718a) {
                    j = this.x;
                } else {
                    j = 0;
                }
                if (r270Var2 == r270.b) {
                    i = this.y.f5344a;
                } else {
                    i = 0;
                }
                if (z2) {
                    switch (str) {
                        case "CASH_BACK_TAB_BAR_ITEM":
                            fw60Var = fw60.c;
                            String value2 = fw60Var.getValue();
                            gw60Var = this.e;
                            gw60Var.getClass();
                            gw60Var.f12011a.a(cui0.b(new j1p(value2, (byte) 0)), 3017L);
                            iOrdinal = fw60Var.ordinal();
                            hs60Var = this.b;
                            if (iOrdinal != 0) {
                                i8i.D("option", "games_all", hs60Var.f13566a, "footer_menu_games_call");
                            } else if (iOrdinal != 1) {
                                i8i.D("option", "games_bonuses", hs60Var.f13566a, "footer_menu_games_call");
                            } else if (iOrdinal != 2) {
                                gw60Var.c();
                                i8i.D("option", "games_cashback", hs60Var.f13566a, "footer_menu_games_call");
                            } else if (iOrdinal == 3) {
                                e9d0.o();
                            } else {
                                hs60Var.f(fw60Var);
                                i8i.D("option", "games_favor", hs60Var.f13566a, "footer_menu_games_call");
                            }
                            break;
                        case "ALL_GAMES_TAB_BAR_ITEM":
                            fw60Var = fw60.f10244a;
                            String value3 = fw60Var.getValue();
                            gw60Var = this.e;
                            gw60Var.getClass();
                            gw60Var.f12011a.a(cui0.b(new j1p(value3, (byte) 0)), 3017L);
                            iOrdinal = fw60Var.ordinal();
                            hs60Var = this.b;
                            if (iOrdinal != 0) {
                                i8i.D("option", "games_all", hs60Var.f13566a, "footer_menu_games_call");
                            } else if (iOrdinal != 1) {
                                i8i.D("option", "games_bonuses", hs60Var.f13566a, "footer_menu_games_call");
                            } else if (iOrdinal != 2) {
                                gw60Var.c();
                                i8i.D("option", "games_cashback", hs60Var.f13566a, "footer_menu_games_call");
                            } else if (iOrdinal == 3) {
                                e9d0.o();
                            } else {
                                hs60Var.f(fw60Var);
                                i8i.D("option", "games_favor", hs60Var.f13566a, "footer_menu_games_call");
                            }
                            break;
                        case "PROMO_TAB_BAR_ITEM":
                            fw60Var = fw60.b;
                            String value4 = fw60Var.getValue();
                            gw60Var = this.e;
                            gw60Var.getClass();
                            gw60Var.f12011a.a(cui0.b(new j1p(value4, (byte) 0)), 3017L);
                            iOrdinal = fw60Var.ordinal();
                            hs60Var = this.b;
                            if (iOrdinal != 0) {
                                i8i.D("option", "games_all", hs60Var.f13566a, "footer_menu_games_call");
                            } else if (iOrdinal != 1) {
                                i8i.D("option", "games_bonuses", hs60Var.f13566a, "footer_menu_games_call");
                            } else if (iOrdinal != 2) {
                                gw60Var.c();
                                i8i.D("option", "games_cashback", hs60Var.f13566a, "footer_menu_games_call");
                            } else if (iOrdinal == 3) {
                                e9d0.o();
                            } else {
                                hs60Var.f(fw60Var);
                                i8i.D("option", "games_favor", hs60Var.f13566a, "footer_menu_games_call");
                            }
                            break;
                        case "FAVORITES_TAB_BAR_ITEM":
                            fw60Var = fw60.d;
                            String value5 = fw60Var.getValue();
                            gw60Var = this.e;
                            gw60Var.getClass();
                            gw60Var.f12011a.a(cui0.b(new j1p(value5, (byte) 0)), 3017L);
                            iOrdinal = fw60Var.ordinal();
                            hs60Var = this.b;
                            if (iOrdinal != 0) {
                                i8i.D("option", "games_all", hs60Var.f13566a, "footer_menu_games_call");
                            } else if (iOrdinal != 1) {
                                i8i.D("option", "games_bonuses", hs60Var.f13566a, "footer_menu_games_call");
                            } else if (iOrdinal != 2) {
                                gw60Var.c();
                                i8i.D("option", "games_cashback", hs60Var.f13566a, "footer_menu_games_call");
                            } else if (iOrdinal == 3) {
                                e9d0.o();
                            } else {
                                hs60Var.f(fw60Var);
                                i8i.D("option", "games_favor", hs60Var.f13566a, "footer_menu_games_call");
                            }
                            break;
                        default:
                            if (str.equals("CASH_BACK_TAB_BAR_ITEM")) {
                                fw60Var = fw60.c;
                                String value6 = fw60Var.getValue();
                                gw60Var = this.e;
                                gw60Var.getClass();
                                gw60Var.f12011a.a(cui0.b(new j1p(value6, (byte) 0)), 3017L);
                                iOrdinal = fw60Var.ordinal();
                                hs60Var = this.b;
                                if (iOrdinal != 0) {
                                    i8i.D("option", "games_all", hs60Var.f13566a, "footer_menu_games_call");
                                } else if (iOrdinal != 1) {
                                    i8i.D("option", "games_bonuses", hs60Var.f13566a, "footer_menu_games_call");
                                } else if (iOrdinal != 2) {
                                    gw60Var.c();
                                    i8i.D("option", "games_cashback", hs60Var.f13566a, "footer_menu_games_call");
                                } else if (iOrdinal == 3) {
                                    e9d0.o();
                                } else {
                                    hs60Var.f(fw60Var);
                                    i8i.D("option", "games_favor", hs60Var.f13566a, "footer_menu_games_call");
                                }
                                break;
                            }
                            e9d0.o();
                            break;
                    }
                }
                this.F.f(new n570(r270Var2, j, i, this.z));
                if (z) {
                    this.w = str;
                } else {
                    while (true) {
                        value = p7m0Var.getValue();
                        str2 = str;
                        if (p7m0Var.m(value, gz60.a((gz60) value, str2, false, false, false, false, false, 510))) {
                            str = str2;
                        }
                    }
                }
                break;
            case "ALL_GAMES_TAB_BAR_ITEM":
                r270Var = r270.f29718a;
                r270Var2 = r270Var;
                if (r270Var2 == r270.f29718a) {
                    j = this.x;
                } else {
                    j = 0;
                }
                if (r270Var2 == r270.b) {
                    i = this.y.f5344a;
                } else {
                    i = 0;
                }
                if (z2) {
                    switch (str) {
                        case -1397416011:
                            if (str.equals("CASH_BACK_TAB_BAR_ITEM")) {
                                fw60Var = fw60.c;
                                String value7 = fw60Var.getValue();
                                gw60Var = this.e;
                                gw60Var.getClass();
                                gw60Var.f12011a.a(cui0.b(new j1p(value7, (byte) 0)), 3017L);
                                iOrdinal = fw60Var.ordinal();
                                hs60Var = this.b;
                                if (iOrdinal != 0) {
                                    i8i.D("option", "games_all", hs60Var.f13566a, "footer_menu_games_call");
                                } else if (iOrdinal != 1) {
                                    i8i.D("option", "games_bonuses", hs60Var.f13566a, "footer_menu_games_call");
                                } else if (iOrdinal != 2) {
                                    gw60Var.c();
                                    i8i.D("option", "games_cashback", hs60Var.f13566a, "footer_menu_games_call");
                                } else if (iOrdinal == 3) {
                                    e9d0.o();
                                } else {
                                    hs60Var.f(fw60Var);
                                    i8i.D("option", "games_favor", hs60Var.f13566a, "footer_menu_games_call");
                                }
                            }
                            e9d0.o();
                            break;
                        case -431842875:
                            if (str.equals("ALL_GAMES_TAB_BAR_ITEM")) {
                                fw60Var = fw60.f10244a;
                                String value8 = fw60Var.getValue();
                                gw60Var = this.e;
                                gw60Var.getClass();
                                gw60Var.f12011a.a(cui0.b(new j1p(value8, (byte) 0)), 3017L);
                                iOrdinal = fw60Var.ordinal();
                                hs60Var = this.b;
                                if (iOrdinal != 0) {
                                    i8i.D("option", "games_all", hs60Var.f13566a, "footer_menu_games_call");
                                } else if (iOrdinal != 1) {
                                    i8i.D("option", "games_bonuses", hs60Var.f13566a, "footer_menu_games_call");
                                } else if (iOrdinal != 2) {
                                    gw60Var.c();
                                    i8i.D("option", "games_cashback", hs60Var.f13566a, "footer_menu_games_call");
                                } else if (iOrdinal == 3) {
                                    e9d0.o();
                                } else {
                                    hs60Var.f(fw60Var);
                                    i8i.D("option", "games_favor", hs60Var.f13566a, "footer_menu_games_call");
                                }
                            }
                            e9d0.o();
                            break;
                        case 965739193:
                            if (str.equals("PROMO_TAB_BAR_ITEM")) {
                                fw60Var = fw60.b;
                                String value9 = fw60Var.getValue();
                                gw60Var = this.e;
                                gw60Var.getClass();
                                gw60Var.f12011a.a(cui0.b(new j1p(value9, (byte) 0)), 3017L);
                                iOrdinal = fw60Var.ordinal();
                                hs60Var = this.b;
                                if (iOrdinal != 0) {
                                    i8i.D("option", "games_all", hs60Var.f13566a, "footer_menu_games_call");
                                } else if (iOrdinal != 1) {
                                    i8i.D("option", "games_bonuses", hs60Var.f13566a, "footer_menu_games_call");
                                } else if (iOrdinal != 2) {
                                    gw60Var.c();
                                    i8i.D("option", "games_cashback", hs60Var.f13566a, "footer_menu_games_call");
                                } else if (iOrdinal == 3) {
                                    e9d0.o();
                                } else {
                                    hs60Var.f(fw60Var);
                                    i8i.D("option", "games_favor", hs60Var.f13566a, "footer_menu_games_call");
                                }
                            }
                            e9d0.o();
                            break;
                        case 1351200369:
                            if (str.equals("FAVORITES_TAB_BAR_ITEM")) {
                                fw60Var = fw60.d;
                                String value10 = fw60Var.getValue();
                                gw60Var = this.e;
                                gw60Var.getClass();
                                gw60Var.f12011a.a(cui0.b(new j1p(value10, (byte) 0)), 3017L);
                                iOrdinal = fw60Var.ordinal();
                                hs60Var = this.b;
                                if (iOrdinal != 0) {
                                    i8i.D("option", "games_all", hs60Var.f13566a, "footer_menu_games_call");
                                } else if (iOrdinal != 1) {
                                    i8i.D("option", "games_bonuses", hs60Var.f13566a, "footer_menu_games_call");
                                } else if (iOrdinal != 2) {
                                    gw60Var.c();
                                    i8i.D("option", "games_cashback", hs60Var.f13566a, "footer_menu_games_call");
                                } else if (iOrdinal == 3) {
                                    e9d0.o();
                                } else {
                                    hs60Var.f(fw60Var);
                                    i8i.D("option", "games_favor", hs60Var.f13566a, "footer_menu_games_call");
                                }
                            }
                            e9d0.o();
                            break;
                        default:
                            e9d0.o();
                            break;
                    }
                }
                this.F.f(new n570(r270Var2, j, i, this.z));
                if (z) {
                    this.w = str;
                } else {
                    while (true) {
                        value = p7m0Var.getValue();
                        str2 = str;
                        if (p7m0Var.m(value, gz60.a((gz60) value, str2, false, false, false, false, false, 510))) {
                            str = str2;
                        }
                    }
                }
                break;
            case "PROMO_TAB_BAR_ITEM":
                r270Var = r270.b;
                r270Var2 = r270Var;
                if (r270Var2 == r270.f29718a) {
                    j = this.x;
                } else {
                    j = 0;
                }
                if (r270Var2 == r270.b) {
                    i = this.y.f5344a;
                } else {
                    i = 0;
                }
                if (z2) {
                    switch (str) {
                        case -1397416011:
                            if (str.equals("CASH_BACK_TAB_BAR_ITEM")) {
                                fw60Var = fw60.c;
                                String value11 = fw60Var.getValue();
                                gw60Var = this.e;
                                gw60Var.getClass();
                                gw60Var.f12011a.a(cui0.b(new j1p(value11, (byte) 0)), 3017L);
                                iOrdinal = fw60Var.ordinal();
                                hs60Var = this.b;
                                if (iOrdinal != 0) {
                                    i8i.D("option", "games_all", hs60Var.f13566a, "footer_menu_games_call");
                                } else if (iOrdinal != 1) {
                                    i8i.D("option", "games_bonuses", hs60Var.f13566a, "footer_menu_games_call");
                                } else if (iOrdinal != 2) {
                                    gw60Var.c();
                                    i8i.D("option", "games_cashback", hs60Var.f13566a, "footer_menu_games_call");
                                } else if (iOrdinal == 3) {
                                    e9d0.o();
                                } else {
                                    hs60Var.f(fw60Var);
                                    i8i.D("option", "games_favor", hs60Var.f13566a, "footer_menu_games_call");
                                }
                            }
                            e9d0.o();
                            break;
                        case -431842875:
                            if (str.equals("ALL_GAMES_TAB_BAR_ITEM")) {
                                fw60Var = fw60.f10244a;
                                String value12 = fw60Var.getValue();
                                gw60Var = this.e;
                                gw60Var.getClass();
                                gw60Var.f12011a.a(cui0.b(new j1p(value12, (byte) 0)), 3017L);
                                iOrdinal = fw60Var.ordinal();
                                hs60Var = this.b;
                                if (iOrdinal != 0) {
                                    i8i.D("option", "games_all", hs60Var.f13566a, "footer_menu_games_call");
                                } else if (iOrdinal != 1) {
                                    i8i.D("option", "games_bonuses", hs60Var.f13566a, "footer_menu_games_call");
                                } else if (iOrdinal != 2) {
                                    gw60Var.c();
                                    i8i.D("option", "games_cashback", hs60Var.f13566a, "footer_menu_games_call");
                                } else if (iOrdinal == 3) {
                                    e9d0.o();
                                } else {
                                    hs60Var.f(fw60Var);
                                    i8i.D("option", "games_favor", hs60Var.f13566a, "footer_menu_games_call");
                                }
                            }
                            e9d0.o();
                            break;
                        case 965739193:
                            if (str.equals("PROMO_TAB_BAR_ITEM")) {
                                fw60Var = fw60.b;
                                String value13 = fw60Var.getValue();
                                gw60Var = this.e;
                                gw60Var.getClass();
                                gw60Var.f12011a.a(cui0.b(new j1p(value13, (byte) 0)), 3017L);
                                iOrdinal = fw60Var.ordinal();
                                hs60Var = this.b;
                                if (iOrdinal != 0) {
                                    i8i.D("option", "games_all", hs60Var.f13566a, "footer_menu_games_call");
                                } else if (iOrdinal != 1) {
                                    i8i.D("option", "games_bonuses", hs60Var.f13566a, "footer_menu_games_call");
                                } else if (iOrdinal != 2) {
                                    gw60Var.c();
                                    i8i.D("option", "games_cashback", hs60Var.f13566a, "footer_menu_games_call");
                                } else if (iOrdinal == 3) {
                                    e9d0.o();
                                } else {
                                    hs60Var.f(fw60Var);
                                    i8i.D("option", "games_favor", hs60Var.f13566a, "footer_menu_games_call");
                                }
                            }
                            e9d0.o();
                            break;
                        case 1351200369:
                            if (str.equals("FAVORITES_TAB_BAR_ITEM")) {
                                fw60Var = fw60.d;
                                String value14 = fw60Var.getValue();
                                gw60Var = this.e;
                                gw60Var.getClass();
                                gw60Var.f12011a.a(cui0.b(new j1p(value14, (byte) 0)), 3017L);
                                iOrdinal = fw60Var.ordinal();
                                hs60Var = this.b;
                                if (iOrdinal != 0) {
                                    i8i.D("option", "games_all", hs60Var.f13566a, "footer_menu_games_call");
                                } else if (iOrdinal != 1) {
                                    i8i.D("option", "games_bonuses", hs60Var.f13566a, "footer_menu_games_call");
                                } else if (iOrdinal != 2) {
                                    gw60Var.c();
                                    i8i.D("option", "games_cashback", hs60Var.f13566a, "footer_menu_games_call");
                                } else if (iOrdinal == 3) {
                                    e9d0.o();
                                } else {
                                    hs60Var.f(fw60Var);
                                    i8i.D("option", "games_favor", hs60Var.f13566a, "footer_menu_games_call");
                                }
                            }
                            e9d0.o();
                            break;
                        default:
                            e9d0.o();
                            break;
                    }
                }
                this.F.f(new n570(r270Var2, j, i, this.z));
                if (z) {
                    this.w = str;
                } else {
                    while (true) {
                        value = p7m0Var.getValue();
                        str2 = str;
                        if (p7m0Var.m(value, gz60.a((gz60) value, str2, false, false, false, false, false, 510))) {
                            str = str2;
                        }
                    }
                }
                break;
            case "FAVORITES_TAB_BAR_ITEM":
                r270Var = r270.d;
                r270Var2 = r270Var;
                if (r270Var2 == r270.f29718a) {
                    j = this.x;
                } else {
                    j = 0;
                }
                if (r270Var2 == r270.b) {
                    i = this.y.f5344a;
                } else {
                    i = 0;
                }
                if (z2) {
                    switch (str) {
                        case -1397416011:
                            if (str.equals("CASH_BACK_TAB_BAR_ITEM")) {
                                fw60Var = fw60.c;
                                String value15 = fw60Var.getValue();
                                gw60Var = this.e;
                                gw60Var.getClass();
                                gw60Var.f12011a.a(cui0.b(new j1p(value15, (byte) 0)), 3017L);
                                iOrdinal = fw60Var.ordinal();
                                hs60Var = this.b;
                                if (iOrdinal != 0) {
                                    i8i.D("option", "games_all", hs60Var.f13566a, "footer_menu_games_call");
                                } else if (iOrdinal != 1) {
                                    i8i.D("option", "games_bonuses", hs60Var.f13566a, "footer_menu_games_call");
                                } else if (iOrdinal != 2) {
                                    gw60Var.c();
                                    i8i.D("option", "games_cashback", hs60Var.f13566a, "footer_menu_games_call");
                                } else if (iOrdinal == 3) {
                                    e9d0.o();
                                } else {
                                    hs60Var.f(fw60Var);
                                    i8i.D("option", "games_favor", hs60Var.f13566a, "footer_menu_games_call");
                                }
                            }
                            e9d0.o();
                            break;
                        case -431842875:
                            if (str.equals("ALL_GAMES_TAB_BAR_ITEM")) {
                                fw60Var = fw60.f10244a;
                                String value16 = fw60Var.getValue();
                                gw60Var = this.e;
                                gw60Var.getClass();
                                gw60Var.f12011a.a(cui0.b(new j1p(value16, (byte) 0)), 3017L);
                                iOrdinal = fw60Var.ordinal();
                                hs60Var = this.b;
                                if (iOrdinal != 0) {
                                    i8i.D("option", "games_all", hs60Var.f13566a, "footer_menu_games_call");
                                } else if (iOrdinal != 1) {
                                    i8i.D("option", "games_bonuses", hs60Var.f13566a, "footer_menu_games_call");
                                } else if (iOrdinal != 2) {
                                    gw60Var.c();
                                    i8i.D("option", "games_cashback", hs60Var.f13566a, "footer_menu_games_call");
                                } else if (iOrdinal == 3) {
                                    e9d0.o();
                                } else {
                                    hs60Var.f(fw60Var);
                                    i8i.D("option", "games_favor", hs60Var.f13566a, "footer_menu_games_call");
                                }
                            }
                            e9d0.o();
                            break;
                        case 965739193:
                            if (str.equals("PROMO_TAB_BAR_ITEM")) {
                                fw60Var = fw60.b;
                                String value17 = fw60Var.getValue();
                                gw60Var = this.e;
                                gw60Var.getClass();
                                gw60Var.f12011a.a(cui0.b(new j1p(value17, (byte) 0)), 3017L);
                                iOrdinal = fw60Var.ordinal();
                                hs60Var = this.b;
                                if (iOrdinal != 0) {
                                    i8i.D("option", "games_all", hs60Var.f13566a, "footer_menu_games_call");
                                } else if (iOrdinal != 1) {
                                    i8i.D("option", "games_bonuses", hs60Var.f13566a, "footer_menu_games_call");
                                } else if (iOrdinal != 2) {
                                    gw60Var.c();
                                    i8i.D("option", "games_cashback", hs60Var.f13566a, "footer_menu_games_call");
                                } else if (iOrdinal == 3) {
                                    e9d0.o();
                                } else {
                                    hs60Var.f(fw60Var);
                                    i8i.D("option", "games_favor", hs60Var.f13566a, "footer_menu_games_call");
                                }
                            }
                            e9d0.o();
                            break;
                        case 1351200369:
                            if (str.equals("FAVORITES_TAB_BAR_ITEM")) {
                                fw60Var = fw60.d;
                                String value18 = fw60Var.getValue();
                                gw60Var = this.e;
                                gw60Var.getClass();
                                gw60Var.f12011a.a(cui0.b(new j1p(value18, (byte) 0)), 3017L);
                                iOrdinal = fw60Var.ordinal();
                                hs60Var = this.b;
                                if (iOrdinal != 0) {
                                    i8i.D("option", "games_all", hs60Var.f13566a, "footer_menu_games_call");
                                } else if (iOrdinal != 1) {
                                    i8i.D("option", "games_bonuses", hs60Var.f13566a, "footer_menu_games_call");
                                } else if (iOrdinal != 2) {
                                    gw60Var.c();
                                    i8i.D("option", "games_cashback", hs60Var.f13566a, "footer_menu_games_call");
                                } else if (iOrdinal == 3) {
                                    e9d0.o();
                                } else {
                                    hs60Var.f(fw60Var);
                                    i8i.D("option", "games_favor", hs60Var.f13566a, "footer_menu_games_call");
                                }
                            }
                            e9d0.o();
                            break;
                        default:
                            e9d0.o();
                            break;
                    }
                }
                this.F.f(new n570(r270Var2, j, i, this.z));
                if (z) {
                    this.w = str;
                } else {
                    while (true) {
                        value = p7m0Var.getValue();
                        str2 = str;
                        if (p7m0Var.m(value, gz60.a((gz60) value, str2, false, false, false, false, false, 510))) {
                            str = str2;
                        }
                    }
                }
                break;
            default:
                if (str.equals("CASH_BACK_TAB_BAR_ITEM")) {
                    r270Var = r270.c;
                    r270Var2 = r270Var;
                    if (r270Var2 == r270.f29718a) {
                        j = this.x;
                    } else {
                        j = 0;
                    }
                    if (r270Var2 == r270.b) {
                        i = this.y.f5344a;
                    } else {
                        i = 0;
                    }
                    if (z2) {
                        switch (str) {
                            case "CASH_BACK_TAB_BAR_ITEM":
                                fw60Var = fw60.c;
                                String value19 = fw60Var.getValue();
                                gw60Var = this.e;
                                gw60Var.getClass();
                                gw60Var.f12011a.a(cui0.b(new j1p(value19, (byte) 0)), 3017L);
                                iOrdinal = fw60Var.ordinal();
                                hs60Var = this.b;
                                if (iOrdinal != 0) {
                                    i8i.D("option", "games_all", hs60Var.f13566a, "footer_menu_games_call");
                                } else if (iOrdinal != 1) {
                                    i8i.D("option", "games_bonuses", hs60Var.f13566a, "footer_menu_games_call");
                                } else if (iOrdinal != 2) {
                                    gw60Var.c();
                                    i8i.D("option", "games_cashback", hs60Var.f13566a, "footer_menu_games_call");
                                } else if (iOrdinal == 3) {
                                    e9d0.o();
                                } else {
                                    hs60Var.f(fw60Var);
                                    i8i.D("option", "games_favor", hs60Var.f13566a, "footer_menu_games_call");
                                }
                                break;
                            case "ALL_GAMES_TAB_BAR_ITEM":
                                fw60Var = fw60.f10244a;
                                String value110 = fw60Var.getValue();
                                gw60Var = this.e;
                                gw60Var.getClass();
                                gw60Var.f12011a.a(cui0.b(new j1p(value110, (byte) 0)), 3017L);
                                iOrdinal = fw60Var.ordinal();
                                hs60Var = this.b;
                                if (iOrdinal != 0) {
                                    i8i.D("option", "games_all", hs60Var.f13566a, "footer_menu_games_call");
                                } else if (iOrdinal != 1) {
                                    i8i.D("option", "games_bonuses", hs60Var.f13566a, "footer_menu_games_call");
                                } else if (iOrdinal != 2) {
                                    gw60Var.c();
                                    i8i.D("option", "games_cashback", hs60Var.f13566a, "footer_menu_games_call");
                                } else if (iOrdinal == 3) {
                                    e9d0.o();
                                } else {
                                    hs60Var.f(fw60Var);
                                    i8i.D("option", "games_favor", hs60Var.f13566a, "footer_menu_games_call");
                                }
                                break;
                            case "PROMO_TAB_BAR_ITEM":
                                fw60Var = fw60.b;
                                String value111 = fw60Var.getValue();
                                gw60Var = this.e;
                                gw60Var.getClass();
                                gw60Var.f12011a.a(cui0.b(new j1p(value111, (byte) 0)), 3017L);
                                iOrdinal = fw60Var.ordinal();
                                hs60Var = this.b;
                                if (iOrdinal != 0) {
                                    i8i.D("option", "games_all", hs60Var.f13566a, "footer_menu_games_call");
                                } else if (iOrdinal != 1) {
                                    i8i.D("option", "games_bonuses", hs60Var.f13566a, "footer_menu_games_call");
                                } else if (iOrdinal != 2) {
                                    gw60Var.c();
                                    i8i.D("option", "games_cashback", hs60Var.f13566a, "footer_menu_games_call");
                                } else if (iOrdinal == 3) {
                                    e9d0.o();
                                } else {
                                    hs60Var.f(fw60Var);
                                    i8i.D("option", "games_favor", hs60Var.f13566a, "footer_menu_games_call");
                                }
                                break;
                            case "FAVORITES_TAB_BAR_ITEM":
                                fw60Var = fw60.d;
                                String value112 = fw60Var.getValue();
                                gw60Var = this.e;
                                gw60Var.getClass();
                                gw60Var.f12011a.a(cui0.b(new j1p(value112, (byte) 0)), 3017L);
                                iOrdinal = fw60Var.ordinal();
                                hs60Var = this.b;
                                if (iOrdinal != 0) {
                                    i8i.D("option", "games_all", hs60Var.f13566a, "footer_menu_games_call");
                                } else if (iOrdinal != 1) {
                                    i8i.D("option", "games_bonuses", hs60Var.f13566a, "footer_menu_games_call");
                                } else if (iOrdinal != 2) {
                                    gw60Var.c();
                                    i8i.D("option", "games_cashback", hs60Var.f13566a, "footer_menu_games_call");
                                } else if (iOrdinal == 3) {
                                    e9d0.o();
                                } else {
                                    hs60Var.f(fw60Var);
                                    i8i.D("option", "games_favor", hs60Var.f13566a, "footer_menu_games_call");
                                }
                                break;
                            default:
                                if (str.equals("CASH_BACK_TAB_BAR_ITEM")) {
                                    fw60Var = fw60.c;
                                    String value113 = fw60Var.getValue();
                                    gw60Var = this.e;
                                    gw60Var.getClass();
                                    gw60Var.f12011a.a(cui0.b(new j1p(value113, (byte) 0)), 3017L);
                                    iOrdinal = fw60Var.ordinal();
                                    hs60Var = this.b;
                                    if (iOrdinal != 0) {
                                        i8i.D("option", "games_all", hs60Var.f13566a, "footer_menu_games_call");
                                    } else if (iOrdinal != 1) {
                                        i8i.D("option", "games_bonuses", hs60Var.f13566a, "footer_menu_games_call");
                                    } else if (iOrdinal != 2) {
                                        gw60Var.c();
                                        i8i.D("option", "games_cashback", hs60Var.f13566a, "footer_menu_games_call");
                                    } else if (iOrdinal == 3) {
                                        e9d0.o();
                                    } else {
                                        hs60Var.f(fw60Var);
                                        i8i.D("option", "games_favor", hs60Var.f13566a, "footer_menu_games_call");
                                    }
                                    break;
                                }
                                e9d0.o();
                                break;
                        }
                    }
                    this.F.f(new n570(r270Var2, j, i, this.z));
                    if (z) {
                        this.w = str;
                    } else {
                        while (true) {
                            value = p7m0Var.getValue();
                            str2 = str;
                            if (p7m0Var.m(value, gz60.a((gz60) value, str2, false, false, false, false, false, 510))) {
                                str = str2;
                            }
                        }
                    }
                    break;
                }
                e9d0.o();
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0034 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:15:0x0036 A[RETURN] */
    public final boolean x() {
        List listA = ((pbt) this.g.f26374a).d.a();
        if (listA == null) {
            listA = iun.f15405a;
        }
        for (Object obj : listA) {
            evz evzVar = d270.b;
            int i = ((rq60) obj).f30917a;
            evzVar.getClass();
            if (evz.c(i) == d270.CASHBACK) {
                if (obj != null) {
                    return true;
                }
                return false;
            }
        }
        obj = null;
        if (obj != null) {
            return true;
        }
        return false;
    }

    public final String y(boolean z) {
        t270 t270Var = (t270) this.d.d("OPEN_SCREEN_KEY");
        if (this.y != d270.UNKNOWN) {
            return "PROMO_TAB_BAR_ITEM";
        }
        if (this.x == 0) {
            t270 t270Var2 = t270.c;
            if (t270Var == t270Var2 && z) {
                return "CASH_BACK_TAB_BAR_ITEM";
            }
            if (t270Var != t270Var2 || z) {
                if (t270Var != null) {
                    return x0x.V(t270Var);
                }
                String str = ((gz60) this.E.getValue()).f12166a;
                if (str.length() != 0) {
                    return str;
                }
            }
        }
        return "ALL_GAMES_TAB_BAR_ITEM";
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object z(zje zjeVar) {
        z570 z570Var;
        e5c e5cVar;
        if (zjeVar instanceof z570) {
            z570Var = (z570) zjeVar;
            int i = z570Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                z570Var.l = i - Integer.MIN_VALUE;
            } else {
                z570Var = new z570(this, zjeVar);
            }
        } else {
            z570Var = new z570(this, zjeVar);
        }
        Object objA = z570Var.j;
        wne wneVar = wne.f39444a;
        int i2 = z570Var.l;
        boolean z = true;
        if (i2 == 0) {
            z1x.P(objA);
            if (this.j.a()) {
                urt urtVarG = this.u.g();
                e5c e5cVar2 = this.i;
                z570Var.i = e5cVar2;
                z570Var.l = 1;
                objA = urt.a(urtVarG, z570Var);
                if (objA == wneVar) {
                    return wneVar;
                }
                e5cVar = e5cVar2;
            }
            return Boolean.valueOf(z);
        }
        if (i2 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        e5cVar = z570Var.i;
        z1x.P(objA);
        if (e5cVar.a((List) objA)) {
            C(s570.f31642a);
            z = false;
        }
        return Boolean.valueOf(z);
    }
}

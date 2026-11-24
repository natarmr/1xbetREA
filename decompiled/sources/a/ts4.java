package a;

import android.gov.nist.core.Separators;
import com.davemorrissey.labs.subscaleview.BuildConfig;
import java.io.Serializable;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.UUID;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Request;

/* JADX INFO: loaded from: classes3.dex */
public final class ts4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final us00 f34444a;
    public final qr4 b;
    public final ht4 c;
    public final at4 d;
    public final vo4 e;
    public final ft4 f;
    public final tgk g;
    public final btt0 h;
    public final knf0 i;
    public final cge0 j;
    public final do20 k;
    public final rp4 l;
    public final zo4 m;

    public ts4(us00 us00Var, qr4 qr4Var, ht4 ht4Var, at4 at4Var, vo4 vo4Var, ft4 ft4Var, tgk tgkVar, btt0 btt0Var, knf0 knf0Var, cge0 cge0Var, cge0 cge0Var2, do20 do20Var, rp4 rp4Var, wby wbyVar) {
        qr4Var.getClass();
        ht4Var.getClass();
        at4Var.getClass();
        vo4Var.getClass();
        ft4Var.getClass();
        tgkVar.getClass();
        btt0Var.getClass();
        knf0Var.getClass();
        rp4Var.getClass();
        wbyVar.getClass();
        this.f34444a = us00Var;
        this.b = qr4Var;
        this.c = ht4Var;
        this.d = at4Var;
        this.e = vo4Var;
        this.f = ft4Var;
        this.g = tgkVar;
        this.h = btt0Var;
        this.i = knf0Var;
        this.j = cge0Var2;
        this.k = do20Var;
        this.l = rp4Var;
        this.m = new zo4(wbyVar, (byte) 3);
    }

    public static void m(Throwable th) throws Throwable {
        if (!(th instanceof zhi0)) {
            throw th;
        }
        zhi0 an4Var = (zhi0) th;
        if (tx3.u(an4Var.c, new i2o[]{i2o.AuthenticatorRegistrationFail, i2o.AuthenticatorPartnerIsBlocked, i2o.AuthenticatorUserTemporaryBanned, i2o.ParticipantIsBanned, i2o.AuthenticatorSmsLimit, i2o.AuthenticatorUserIsNotFound, i2o.CmsDataMissing, i2o.AuthenticatorConfirmationTimeIsOut, i2o.AuthenticatorCodeAttemptExceeded, i2o.AuthenticatorWrongValidationMethod, i2o.AuthenticatorTokenExpired, i2o.AuthenticatorCodeExpired})) {
            kuw kuwVar = an4Var.c;
            String message = th.getMessage();
            if (message == null) {
                message = "";
            }
            an4Var = new an4(message, kuwVar, null, 12);
        }
        throw an4Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable a(String str, zje zjeVar) {
        bs4 bs4Var;
        if (zjeVar instanceof bs4) {
            bs4Var = (bs4) zjeVar;
            int i = bs4Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                bs4Var.k = i - Integer.MIN_VALUE;
            } else {
                bs4Var = new bs4(this, zjeVar);
            }
        } else {
            bs4Var = new bs4(this, zjeVar);
        }
        Object objL = bs4Var.i;
        wne wneVar = wne.f39444a;
        int i2 = bs4Var.k;
        if (i2 == 0) {
            z1x.P(objL);
            swp0 swp0Var = this.d.f1417a;
            ws4 ws4Var = (ws4) this.m.invoke();
            y8c y8cVar = new y8c(new t8c(swp0Var.f32933a, swp0Var.b), new x8c(str));
            bs4Var.k = 1;
            objL = ws4Var.l(y8cVar, bs4Var);
            if (objL == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objL);
        }
        return new swp0(((b9c) ((q16) objL).a()).f2202a, false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, String str2, zje zjeVar) {
        cs4 cs4Var;
        String str3;
        Throwable th;
        ts4 ts4Var;
        Object g0g0Var;
        if (zjeVar instanceof cs4) {
            cs4Var = (cs4) zjeVar;
            int i = cs4Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                cs4Var.m = i - Integer.MIN_VALUE;
            } else {
                cs4Var = new cs4(this, zjeVar);
            }
        } else {
            cs4Var = new cs4(this, zjeVar);
        }
        Object objD = cs4Var.k;
        wne wneVar = wne.f39444a;
        int i2 = cs4Var.m;
        byte b = 1;
        if (i2 == 0) {
            z1x.P(objD);
            try {
                e0g0 e0g0Var = j0g0.b;
                ws4 ws4Var = (ws4) this.m.invoke();
                String strA = this.h.a();
                cs4Var.i = str;
                cs4Var.j = this;
                cs4Var.m = 1;
                objD = ws4Var.d(strA, "application/vnd.xenvelop+json", str2, cs4Var);
                if (objD == wneVar) {
                    return wneVar;
                }
                str3 = str;
                ts4Var = this;
            } catch (Throwable th2) {
                str3 = str;
                th = th2;
                e0g0 e0g0Var2 = j0g0.b;
                g0g0Var = new g0g0(th);
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ts4Var = cs4Var.j;
            str3 = cs4Var.i;
            try {
                z1x.P(objD);
            } catch (Throwable th3) {
                th = th3;
                e0g0 e0g0Var3 = j0g0.b;
                g0g0Var = new g0g0(th);
            }
        }
        g0g0Var = fre0.e0((pq4) ((dx5) objD).a(), new as4(ts4Var, str3, b));
        e0g0 e0g0Var4 = j0g0.b;
        Throwable thA = j0g0.a(g0g0Var);
        if (thA != null && (thA instanceof zhi0) && ((zhi0) thA).f44396a == 403) {
            this.k.n(str3);
        }
        z1x.P(g0g0Var);
        return g0g0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(String str, zje zjeVar) {
        ds4 ds4Var;
        String str2;
        Throwable th;
        ts4 ts4Var;
        Object g0g0Var;
        if (zjeVar instanceof ds4) {
            ds4Var = (ds4) zjeVar;
            int i = ds4Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                ds4Var.m = i - Integer.MIN_VALUE;
            } else {
                ds4Var = new ds4(this, zjeVar);
            }
        } else {
            ds4Var = new ds4(this, zjeVar);
        }
        Object objB = ds4Var.k;
        wne wneVar = wne.f39444a;
        int i2 = ds4Var.m;
        if (i2 == 0) {
            z1x.P(objB);
            try {
                e0g0 e0g0Var = j0g0.b;
                ws4 ws4Var = (ws4) this.m.invoke();
                String strA = this.h.a();
                ds4Var.i = str;
                ds4Var.j = this;
                ds4Var.m = 1;
                objB = ws4Var.b(strA, "application/vnd.xenvelop+json", ds4Var);
                if (objB == wneVar) {
                    return wneVar;
                }
                str2 = str;
                ts4Var = this;
            } catch (Throwable th2) {
                str2 = str;
                th = th2;
                e0g0 e0g0Var2 = j0g0.b;
                g0g0Var = new g0g0(th);
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ts4Var = ds4Var.j;
            str2 = ds4Var.i;
            try {
                z1x.P(objB);
            } catch (Throwable th3) {
                th = th3;
                e0g0 e0g0Var3 = j0g0.b;
                g0g0Var = new g0g0(th);
            }
        }
        g0g0Var = f1t0.c0((tq4) ((dx5) objB).a(), new as4(ts4Var, str2, (byte) 0));
        e0g0 e0g0Var4 = j0g0.b;
        Throwable thA = j0g0.a(g0g0Var);
        if (thA != null && (thA instanceof zhi0) && ((zhi0) thA).f44396a == 403) {
            this.k.n(str2);
        }
        z1x.P(g0g0Var);
        return g0g0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object d(zje zjeVar) {
        es4 es4Var;
        String str;
        wa80 wa80Var;
        if (zjeVar instanceof es4) {
            es4Var = (es4) zjeVar;
            int i = es4Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                es4Var.l = i - Integer.MIN_VALUE;
            } else {
                es4Var = new es4(this, zjeVar);
            }
        } else {
            es4Var = new es4(this, zjeVar);
        }
        Object obj = es4Var.j;
        wne wneVar = wne.f39444a;
        int i2 = es4Var.l;
        if (i2 == 0) {
            z1x.P(obj);
            String strA = this.i.a();
            ws4 ws4Var = (ws4) this.m.invoke();
            String strA2 = this.h.a();
            es4Var.i = strA;
            es4Var.l = 1;
            Object objG = ws4Var.g(strA2, es4Var);
            if (objG == wneVar) {
                return wneVar;
            }
            obj = objG;
            str = strA;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = es4Var.i;
            z1x.P(obj);
        }
        Iterable<n84> iterable = (Iterable) ((dx5) obj).a();
        ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
        for (n84 n84Var : iterable) {
            n84Var.getClass();
            String str2 = n84Var.f23071a;
            str.getClass();
            if (str2 == null) {
                jf4.k(null);
                return null;
            }
            String str3 = n84Var.b;
            String str4 = str3 == null ? "" : str3;
            String str5 = n84Var.c;
            String str6 = str5 == null ? "" : str5;
            String str7 = n84Var.d;
            String str8 = str7 == null ? "" : str7;
            Integer num = n84Var.e;
            if (num != null) {
                int iIntValue = num.intValue();
                wa80.f38814a.getClass();
                if (iIntValue == 1) {
                    wa80Var = wa80.e;
                } else if (iIntValue == 13) {
                    wa80Var = wa80.f;
                } else if (iIntValue == 27 || iIntValue == 29) {
                    wa80Var = wa80.c;
                } else {
                    wa80Var = (iIntValue == 31 || iIntValue == 37) ? wa80.d : wa80.b;
                }
            } else {
                wa80Var = wa80.b;
            }
            wa80 wa80Var2 = wa80Var;
            boolean zEquals = str.equals(str2);
            Long l = n84Var.f;
            arrayList.add(new bo4(str2, str4, str6, str8, wa80Var2, zEquals, l != null ? l.longValue() : 0L));
        }
        return CollectionsKt.A0(arrayList, new s7f((byte) 19));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(String str, zje zjeVar) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        fs4 fs4Var;
        if (zjeVar instanceof fs4) {
            fs4Var = (fs4) zjeVar;
            int i = fs4Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                fs4Var.k = i - Integer.MIN_VALUE;
            } else {
                fs4Var = new fs4(this, zjeVar);
            }
        } else {
            fs4Var = new fs4(this, zjeVar);
        }
        Object objJ = fs4Var.i;
        wne wneVar = wne.f39444a;
        int i2 = fs4Var.k;
        if (i2 == 0) {
            z1x.P(objJ);
            String strD = this.k.d(str);
            ws4 ws4Var = (ws4) this.m.invoke();
            String strA = this.h.a();
            Integer num = new Integer(1);
            Pair pairE = this.g.e();
            bte0 bte0Var = new bte0(num, strD, pairE.f46059a + Separators.SP + pairE.b);
            fs4Var.k = 1;
            objJ = ws4Var.j(strA, bte0Var, "application/vnd.xenvelop+json", fs4Var);
            if (objJ == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objJ);
        }
        ete0 ete0Var = (ete0) ((dx5) objJ).a();
        String str2 = ete0Var.f8373a;
        if (str2 == null) {
            str2 = "";
        }
        Intrinsics.d(ete0Var.c, Boolean.TRUE);
        return str2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0063, code lost:
    
        if (r11 == r1) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(boolean r7, java.lang.String r8, a.ynb0 r9, java.lang.String r10, a.zje r11) {
        /*
            r6 = this;
            boolean r0 = r11 instanceof a.gs4
            if (r0 == 0) goto L13
            r0 = r11
            a.gs4 r0 = (a.gs4) r0
            int r1 = r0.o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.o = r1
            goto L18
        L13:
            a.gs4 r0 = new a.gs4
            r0.<init>(r6, r11)
        L18:
            java.lang.Object r11 = r0.m
            a.wne r1 = a.wne.f39444a
            int r2 = r0.o
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2b
            a.z1x.P(r11)
            goto L66
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r6)
            return r5
        L31:
            boolean r7 = r0.i
            java.lang.String r10 = r0.l
            a.ynb0 r9 = r0.k
            java.lang.String r8 = r0.j
            a.z1x.P(r11)
            goto L53
        L3d:
            a.z1x.P(r11)
            a.fg40[] r11 = a.fg40.f9475a
            r0.j = r8
            r0.k = r9
            r0.l = r10
            r0.i = r7
            r0.o = r4
            java.lang.Object r11 = r6.h(r8, r0)
            if (r11 != r1) goto L53
            goto L65
        L53:
            if (r7 != 0) goto L6e
            r0.j = r5
            r0.k = r5
            r0.l = r5
            r0.i = r7
            r0.o = r3
            java.lang.Object r11 = r6.j(r9, r10, r8, r0)
            if (r11 != r1) goto L66
        L65:
            return r1
        L66:
            a.nte0 r11 = (a.nte0) r11
            a.hg40 r6 = new a.hg40
            r6.<init>(r11)
            return r6
        L6e:
            a.swp0 r7 = new a.swp0
            java.lang.String r8 = a.axq.g()
            java.lang.String r9 = ""
            r10 = 0
            r7.<init>(r8, r9, r10)
            a.at4 r6 = r6.d
            r6.getClass()
            r6.f1417a = r7
            a.gg40 r6 = a.gg40.f11236a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ts4.f(boolean, java.lang.String, a.ynb0, java.lang.String, a.zje):java.lang.Object");
    }

    public final c00 g(ckk0 ckk0Var, String str, String str2) {
        Request.Builder builder = new Request.Builder();
        builder.d(str2.concat("/sockets/channel"));
        Request request = new Request(builder);
        ft4 ft4Var = this.f;
        ft4Var.getClass();
        bq9 bq9VarY = nkb.y(new wn2(ft4Var, request, str, ckk0Var, (yje) null));
        yje yjeVar = null;
        return new c00(ulb.L(new rf0(new fnq(bq9VarY, new pd(2, yjeVar, (byte) 19), (byte) 4), (byte) 1), ft4Var.b.b), this.j, (byte) 15);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object h(String str, zje zjeVar) {
        js4 js4Var;
        String str2 = "";
        if (zjeVar instanceof js4) {
            js4Var = (js4) zjeVar;
            int i = js4Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                js4Var.l = i - Integer.MIN_VALUE;
            } else {
                js4Var = new js4(this, zjeVar);
            }
        } else {
            js4Var = new js4(this, zjeVar);
        }
        Object objJ = js4Var.j;
        wne wneVar = wne.f39444a;
        int i2 = js4Var.l;
        boolean z = false;
        do20 do20Var = this.k;
        try {
            if (i2 == 0) {
                z1x.P(objJ);
                String strD = do20Var.d(str);
                ws4 ws4Var = (ws4) this.m.invoke();
                String strA = this.h.a();
                Integer num = new Integer(1);
                Pair pairE = this.g.e();
                bte0 bte0Var = new bte0(num, strD, pairE.f46059a + Separators.SP + pairE.b);
                js4Var.i = str;
                js4Var.l = 1;
                objJ = ws4Var.j(strA, bte0Var, "application/vnd.xenvelop+json", js4Var);
                if (objJ == wneVar) {
                    return wneVar;
                }
            } else {
                if (i2 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = js4Var.i;
                z1x.P(objJ);
            }
            ete0 ete0Var = (ete0) ((dx5) objJ).a();
            at4 at4Var = this.d;
            String string = UUID.randomUUID().toString();
            string.getClass();
            swp0 swp0Var = new swp0(string, "", false);
            at4Var.getClass();
            at4Var.f1417a = swp0Var;
            try {
                String str3 = ete0Var.f8373a;
                if (str3 == null) {
                    str3 = "";
                }
                String str4 = ete0Var.b;
                if (str4 != null) {
                    str2 = str4;
                }
                i2f0 i2f0Var = new i2f0(str3, str2, Intrinsics.d(ete0Var.c, Boolean.TRUE));
                qr4 qr4Var = this.b;
                rr4 rr4Var = new rr4();
                rr4Var.f30962a = str3;
                rr4Var.b = str2;
                qr4Var.getClass();
                qr4Var.b = rr4Var;
                return i2f0Var;
            } catch (Throwable th) {
                th = th;
                z = true;
                try {
                    m(th);
                    throw null;
                } catch (Throwable th2) {
                    if (!z) {
                        do20Var.n(str);
                    }
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(ynb0 ynb0Var, String str, String str2, zje zjeVar) {
        ks4 ks4Var;
        if (zjeVar instanceof ks4) {
            ks4Var = (ks4) zjeVar;
            int i = ks4Var.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                ks4Var.n = i - Integer.MIN_VALUE;
            } else {
                ks4Var = new ks4(this, zjeVar);
            }
        } else {
            ks4Var = new ks4(this, zjeVar);
        }
        Object obj = ks4Var.l;
        Object obj2 = wne.f39444a;
        int i2 = ks4Var.n;
        if (i2 == 0) {
            z1x.P(obj);
            ks4Var.i = ynb0Var;
            ks4Var.j = str;
            ks4Var.k = str2;
            ks4Var.n = 1;
            fg40[] fg40VarArr = fg40.f9475a;
            if (h(str, ks4Var) != obj2) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                z1x.P(obj);
                return obj;
            }
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        str2 = ks4Var.k;
        str = ks4Var.j;
        ynb0Var = ks4Var.i;
        z1x.P(obj);
        ks4Var.i = null;
        ks4Var.j = null;
        ks4Var.k = null;
        ks4Var.n = 2;
        Object objJ = j(ynb0Var, str2, str, ks4Var);
        return objJ == obj2 ? obj2 : objJ;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a0, code lost:
    
        if (r12 == r0) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(a.ynb0 r9, java.lang.String r10, java.lang.String r11, a.zje r12) {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ts4.j(a.ynb0, java.lang.String, java.lang.String, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object k(String str, String str2, String str3, String str4, zje zjeVar) throws Throwable {
        ms4 ms4Var;
        Object g0g0Var;
        if (zjeVar instanceof ms4) {
            ms4Var = (ms4) zjeVar;
            int i = ms4Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                ms4Var.k = i - Integer.MIN_VALUE;
            } else {
                ms4Var = new ms4(this, zjeVar);
            }
        } else {
            ms4Var = new ms4(this, zjeVar);
        }
        Object obj = ms4Var.i;
        wne wneVar = wne.f39444a;
        int i2 = ms4Var.k;
        try {
            if (i2 == 0) {
                z1x.P(obj);
                e0g0 e0g0Var = j0g0.b;
                ws4 ws4Var = (ws4) this.m.invoke();
                String strA = this.h.a();
                pbu0 pbu0Var = new pbu0(str, str2, str3, str4);
                ms4Var.k = 1;
                if (ws4Var.a(strA, pbu0Var, "application/vnd.xenvelop+json", ms4Var) == wneVar) {
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
        if (thA == null) {
            z1x.P(g0g0Var);
            return Unit.f46060a;
        }
        m(thA);
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object l(ynb0 ynb0Var, String str, String str2, zje zjeVar) {
        ns4 ns4Var;
        if (zjeVar instanceof ns4) {
            ns4Var = (ns4) zjeVar;
            int i = ns4Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                ns4Var.k = i - Integer.MIN_VALUE;
            } else {
                ns4Var = new ns4(this, zjeVar);
            }
        } else {
            ns4Var = new ns4(this, zjeVar);
        }
        Object objO = ns4Var.i;
        wne wneVar = wne.f39444a;
        int i2 = ns4Var.k;
        if (i2 == 0) {
            z1x.P(objO);
            ws4 ws4Var = (ws4) this.m.invoke();
            odi0 odi0Var = new odi0(str, new g6a(ynb0Var));
            ns4Var.k = 1;
            objO = ws4Var.o(BuildConfig.VERSION_NAME, odi0Var, str2, ns4Var);
            if (objO == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objO);
        }
        q16 q16Var = (q16) objO;
        q16Var.getClass();
        tvq0 tvq0Var = (tvq0) q16Var.c;
        int i3 = tvq0Var == null ? -1 : pdi0.f26808a[tvq0Var.ordinal()];
        if (i3 != 1 && i3 != 2) {
            return (String) q16Var.a();
        }
        String str3 = q16Var.f27936a;
        if (str3 != null) {
            return str3;
        }
        jf4.k(null);
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object n(String str, zje zjeVar) {
        os4 os4Var;
        if (zjeVar instanceof os4) {
            os4Var = (os4) zjeVar;
            int i = os4Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                os4Var.k = i - Integer.MIN_VALUE;
            } else {
                os4Var = new os4(this, zjeVar);
            }
        } else {
            os4Var = new os4(this, zjeVar);
        }
        Object objN = os4Var.i;
        wne wneVar = wne.f39444a;
        int i2 = os4Var.k;
        if (i2 == 0) {
            z1x.P(objN);
            ws4 ws4Var = (ws4) this.m.invoke();
            String strA = this.h.a();
            wet0 wet0Var = new wet0(str);
            os4Var.k = 1;
            objN = ws4Var.n(strA, "application/vnd.xenvelop+json", wet0Var, os4Var);
            if (objN == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objN);
        }
        tet0 tet0Var = (tet0) ((dx5) objN).a();
        String str2 = tet0Var.f33839a;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = tet0Var.b;
        return new xet0(str2, str3 != null ? str3 : "");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object o(String str, String str2, zje zjeVar) {
        ps4 ps4Var;
        if (zjeVar instanceof ps4) {
            ps4Var = (ps4) zjeVar;
            int i = ps4Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                ps4Var.k = i - Integer.MIN_VALUE;
            } else {
                ps4Var = new ps4(this, zjeVar);
            }
        } else {
            ps4Var = new ps4(this, zjeVar);
        }
        Object objM = ps4Var.i;
        wne wneVar = wne.f39444a;
        int i2 = ps4Var.k;
        if (i2 == 0) {
            z1x.P(objM);
            ws4 ws4Var = (ws4) this.m.invoke();
            qet0 qet0Var = new qet0(str2);
            ps4Var.k = 1;
            objM = ws4Var.m(str, "application/vnd.xenvelop+json", qet0Var, ps4Var);
            if (objM == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objM);
        }
        tet0 tet0Var = (tet0) ((dx5) objM).a();
        String str3 = tet0Var.f33839a;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = tet0Var.b;
        return new xet0(str3, str4 != null ? str4 : "");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0065, code lost:
    
        if (r(r2, r7, r0) == r1) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(java.lang.String r7, a.zje r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof a.qs4
            if (r0 == 0) goto L13
            r0 = r8
            a.qs4 r0 = (a.qs4) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            a.qs4 r0 = new a.qs4
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
            goto L68
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r6)
            return r3
        L31:
            java.lang.String r7 = r0.i
            a.z1x.P(r8)
            goto L51
        L37:
            a.z1x.P(r8)
            a.btt0 r8 = r6.h
            java.lang.String r8 = r8.a()
            a.knf0 r2 = r6.i
            java.lang.String r2 = r2.a()
            r0.i = r7
            r0.l = r5
            java.lang.Object r8 = r6.o(r8, r2, r0)
            if (r8 != r1) goto L51
            goto L67
        L51:
            a.xet0 r8 = (a.xet0) r8
            java.lang.String r2 = r8.f40760a
            a.do20 r5 = r6.k
            java.lang.String r8 = r8.b
            java.lang.String r7 = r5.o(r7, r8)
            r0.i = r3
            r0.l = r4
            java.lang.Object r6 = r6.r(r2, r7, r0)
            if (r6 != r1) goto L68
        L67:
            return r1
        L68:
            kotlin.Unit r6 = kotlin.Unit.f46060a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ts4.p(java.lang.String, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
    
        if (r(r8, r7, r0) == r1) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(java.lang.String r7, java.lang.String r8, a.zje r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof a.rs4
            if (r0 == 0) goto L13
            r0 = r9
            a.rs4 r0 = (a.rs4) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            a.rs4 r0 = new a.rs4
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.j
            a.wne r1 = a.wne.f39444a
            int r2 = r0.l
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L37
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2b
            a.z1x.P(r9)
            goto L5c
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r6)
            return r5
        L31:
            java.lang.String r7 = r0.i
            a.z1x.P(r9)
            goto L45
        L37:
            a.z1x.P(r9)
            r0.i = r7
            r0.l = r4
            java.lang.Object r9 = r6.n(r8, r0)
            if (r9 != r1) goto L45
            goto L5b
        L45:
            a.xet0 r9 = (a.xet0) r9
            java.lang.String r8 = r9.f40760a
            a.do20 r2 = r6.k
            java.lang.String r9 = r9.b
            java.lang.String r7 = r2.o(r7, r9)
            r0.i = r5
            r0.l = r3
            java.lang.Object r6 = r6.r(r8, r7, r0)
            if (r6 != r1) goto L5c
        L5b:
            return r1
        L5c:
            kotlin.Unit r6 = kotlin.Unit.f46060a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ts4.q(java.lang.String, java.lang.String, a.zje):java.lang.Object");
    }

    public final Object r(String str, String str2, zje zjeVar) {
        Object objK = ((ws4) this.m.invoke()).k(this.h.a(), new aft0(str, str2), "application/vnd.xenvelop+json", zjeVar);
        return objK == wne.f39444a ? objK : Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object s(zje zjeVar) {
        ss4 ss4Var;
        if (zjeVar instanceof ss4) {
            ss4Var = (ss4) zjeVar;
            int i = ss4Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                ss4Var.l = i - Integer.MIN_VALUE;
            } else {
                ss4Var = new ss4(this, zjeVar);
            }
        } else {
            ss4Var = new ss4(this, zjeVar);
        }
        Object objE = ss4Var.j;
        wne wneVar = wne.f39444a;
        int i2 = ss4Var.l;
        if (i2 == 0) {
            z1x.P(objE);
            ws4 ws4Var = (ws4) this.m.invoke();
            ss4Var.l = 1;
            objE = ws4Var.e(ss4Var);
            if (objE != wneVar) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hr4 hr4Var = ss4Var.i;
            z1x.P(objE);
            return hr4Var;
        }
        z1x.P(objE);
        Boolean bool = ((kr4) ((dx5) objE).a()).f18748a;
        boolean z = (bool == null || bool.booleanValue()) ? false : true;
        hr4 hr4Var2 = new hr4(z);
        ss4Var.i = hr4Var2;
        ss4Var.l = 2;
        this.b.f29191a.d("AUTHENTICATOR_PERMISSION_KEY", z);
        return Unit.f46060a == wneVar ? wneVar : hr4Var2;
    }
}

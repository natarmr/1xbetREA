package a;

import android.webkit.MimeTypeMap;
import java.io.IOException;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class zk50 implements oqp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44513a;
    public final a780 b;
    public final n0o0 c;
    public final n0o0 d;
    public final n0o0 e;
    public final obx f;
    public final n0o0 g;

    public zk50(String str, a780 a780Var, n0o0 n0o0Var, n0o0 n0o0Var2, n0o0 n0o0Var3, obx obxVar, n0o0 n0o0Var4) {
        this.f44513a = str;
        this.b = a780Var;
        this.c = n0o0Var;
        this.d = n0o0Var2;
        this.e = n0o0Var3;
        this.f = obxVar;
        this.g = n0o0Var4;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0012  */
    public static String d(String str, String str2) {
        String mimeTypeFromExtension;
        if (str2 == null || kotlin.text.c.x(str2, "text/plain", false)) {
            if (StringsKt.W(str)) {
                mimeTypeFromExtension = null;
            } else {
                String strS0 = StringsKt.s0(StringsKt.s0(str, '#'), '?');
                String strO0 = StringsKt.o0('.', StringsKt.o0('/', strS0, strS0), "");
                if (StringsKt.W(strO0)) {
                    mimeTypeFromExtension = null;
                } else {
                    String lowerCase = strO0.toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    mimeTypeFromExtension = (String) ng40.f23468a.get(lowerCase);
                    if (mimeTypeFromExtension == null) {
                        mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(lowerCase);
                    }
                }
            }
            if (mimeTypeFromExtension != null) {
                return mimeTypeFromExtension;
            }
        }
        if (str2 != null) {
            return StringsKt.q0(str2, ';');
        }
        return null;
    }

    public static void f(ol50 ol50Var) {
        int i = ol50Var.f25436a;
        if ((200 > i || i >= 300) && i != 304) {
            throw new ss3(twn.m(i, "HTTP "));
        }
    }

    @Override // a.oqp
    public final Object a(pyn pynVar) {
        m7t0 m7t0Var = (m7t0) this.g.getValue();
        String str = this.b.e;
        r750 r750Var = new r750(1, this, zk50.class, "doFetch", "doFetch(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 3);
        m7t0Var.getClass();
        return r750Var.invoke(pynVar);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x009e  */
    /* JADX WARN: Code duplicated, block: B:75:0x018a  */
    /* JADX WARN: Code duplicated, block: B:76:0x018b A[Catch: Exception -> 0x0041, PHI: r0 r1
  0x018b: PHI (r0v30 java.lang.Object) = (r0v20 java.lang.Object), (r0v1 java.lang.Object) binds: [B:74:0x0188, B:22:0x0050] A[DONT_GENERATE, DONT_INLINE]
  0x018b: PHI (r1v10 a.mie0) = (r1v8 a.mie0), (r1v16 a.mie0) binds: [B:74:0x0188, B:22:0x0050] A[DONT_GENERATE, DONT_INLINE], TryCatch #3 {Exception -> 0x0041, blocks: (B:15:0x003c, B:81:0x01b1, B:22:0x0050, B:76:0x018b, B:78:0x018f, B:58:0x011e, B:60:0x0124, B:66:0x014e, B:68:0x0154, B:71:0x0163, B:72:0x0168, B:73:0x0169, B:41:0x00a1, B:43:0x00a8, B:45:0x00b6, B:52:0x00ea, B:54:0x00f6, B:48:0x00cc, B:50:0x00d6, B:63:0x0145, B:64:0x014c), top: B:93:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:78:0x018f A[Catch: Exception -> 0x0041, TryCatch #3 {Exception -> 0x0041, blocks: (B:15:0x003c, B:81:0x01b1, B:22:0x0050, B:76:0x018b, B:78:0x018f, B:58:0x011e, B:60:0x0124, B:66:0x014e, B:68:0x0154, B:71:0x0163, B:72:0x0168, B:73:0x0169, B:41:0x00a1, B:43:0x00a8, B:45:0x00b6, B:52:0x00ea, B:54:0x00f6, B:48:0x00cc, B:50:0x00d6, B:63:0x0145, B:64:0x014c), top: B:93:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code duplicated, block: B:96:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01ae, code lost:
    
        if (r0 == r7) goto L80;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(a.yje r18) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 449
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.zk50.b(a.yje):java.lang.Object");
    }

    public final yzp c() {
        yzp yzpVar;
        bbe0 bbe0Var = (bbe0) this.d.getValue();
        return (bbe0Var == null || (yzpVar = bbe0Var.f2305a) == null) ? this.b.f : yzpVar;
    }

    public final gl50 e() {
        kuo kuoVar = p1x.b;
        a780 a780Var = this.b;
        al50 al50Var = (al50) qbc.Q(a780Var, kuoVar);
        al50Var.getClass();
        nv20 nv20Var = new nv20(al50Var);
        vi9 vi9Var = a780Var.h;
        boolean z = vi9Var.f37467a;
        boolean z2 = a780Var.i.f37467a && ((h2e) this.f.f25000a).a();
        if (!z2 && z) {
            nv20Var.i("only-if-cached, max-stale=2147483647");
        } else if (!z2 || z) {
            if (!z2 && !z) {
                nv20Var.i("no-cache, only-if-cached");
            }
        } else if (vi9Var.b) {
            nv20Var.i("no-cache");
        } else {
            nv20Var.i("no-cache, no-store");
        }
        String str = (String) qbc.Q(a780Var, p1x.f26225a);
        al50 al50Var2 = new al50(xp20.n((LinkedHashMap) nv20Var.f24171a));
        if (qbc.Q(a780Var, p1x.c) == null) {
            return new gl50(this.f44513a, str, al50Var2, a780Var.j);
        }
        hny.b();
        return null;
    }

    public final izp g(abe0 abe0Var) {
        fvk fvkVar = abe0Var.f574a;
        if (fvkVar.b) {
            jf4.n("snapshot is closed");
            return null;
        }
        y190 y190Var = (y190) fvkVar.f10219a.c.get(1);
        yzp yzpVarC = c();
        String str = this.b.e;
        if (str == null) {
            str = this.f44513a;
        }
        return z1x.b(y190Var, yzpVarC, str, abe0Var, 16);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(lmk0 lmk0Var, zje zjeVar) {
        wk50 wk50Var;
        f99 f99Var;
        if (zjeVar instanceof wk50) {
            wk50Var = (wk50) zjeVar;
            int i = wk50Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                wk50Var.l = i - Integer.MIN_VALUE;
            } else {
                wk50Var = new wk50(this, zjeVar);
            }
        } else {
            wk50Var = new wk50(this, zjeVar);
        }
        Object obj = wk50Var.j;
        wne wneVar = wne.f39444a;
        int i2 = wk50Var.l;
        if (i2 == 0) {
            z1x.P(obj);
            f99 f99Var2 = new f99();
            wk50Var.i = f99Var2;
            wk50Var.l = 1;
            lmk0Var.f20300a.u(f99Var2);
            if (Unit.f46060a == wneVar) {
                return wneVar;
            }
            f99Var = f99Var2;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            f99Var = wk50Var.i;
            z1x.P(obj);
        }
        return new imk0(f99Var, c(), null);
    }

    public final ol50 i(abe0 abe0Var) throws Throwable {
        Throwable th;
        ol50 ol50VarB0;
        try {
            yzp yzpVarC = c();
            fvk fvkVar = abe0Var.f574a;
            if (fvkVar.b) {
                throw new IllegalStateException("snapshot is closed");
            }
            zae0 zae0VarD = x9x.D(yzpVarC.y((y190) fvkVar.f10219a.c.get(0)));
            try {
                ol50VarB0 = xia0.b0(zae0VarD);
                try {
                    zae0VarD.close();
                    th = null;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                try {
                    zae0VarD.close();
                } catch (Throwable th4) {
                    tjo.a(th3, th4);
                }
                th = th3;
                ol50VarB0 = null;
            }
            if (th == null) {
                return ol50VarB0;
            }
            throw th;
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:122:0x0234 A[Catch: Exception -> 0x003d, TryCatch #7 {Exception -> 0x003d, blocks: (B:13:0x0038, B:110:0x020e, B:117:0x0219, B:118:0x0223, B:120:0x0231, B:122:0x0234, B:125:0x023b, B:126:0x023c, B:119:0x0224), top: B:151:0x0038, inners: #12 }] */
    /* JADX WARN: Code duplicated, block: B:141:0x0259  */
    /* JADX WARN: Code duplicated, block: B:158:0x0224 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:0x0249 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:168:0x0253 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:176:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x0191  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13, types: [a.pv00] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15, types: [a.pv00] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [a.pv00] */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v32, types: [a.pv00] */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r4v41 */
    public final Object j(abe0 abe0Var, ol50 ol50Var, ol50 ol50Var2, zje zjeVar) {
        xk50 xk50Var;
        ol50 ol50Var3;
        ?? pv00Var;
        ?? r1;
        ?? th;
        ?? th2;
        ?? r2;
        o24 o24VarC;
        lmk0 lmk0Var;
        lmk0 lmk0Var2;
        o24 o24Var;
        hvk hvkVar;
        fvk fvkVarD;
        abe0 abe0Var2 = abe0Var;
        ol50 ol50Var4 = ol50Var2;
        if (zjeVar instanceof xk50) {
            xk50Var = (xk50) zjeVar;
            int i = xk50Var.o;
            if ((i & Integer.MIN_VALUE) != 0) {
                xk50Var.o = i - Integer.MIN_VALUE;
            } else {
                xk50Var = new xk50(this, zjeVar);
            }
        } else {
            xk50Var = new xk50(this, zjeVar);
        }
        Object aj9Var = xk50Var.m;
        wne wneVar = wne.f39444a;
        int i2 = xk50Var.o;
        abe0 abe0Var3 = null;
        if (i2 == 0) {
            z1x.P(aj9Var);
            if (!this.b.h.b) {
                if (abe0Var2 != null) {
                    try {
                        ohs0.D(abe0Var2);
                    } catch (RuntimeException e) {
                        throw e;
                    } catch (Exception unused) {
                    }
                }
                return null;
            }
            bj9 bj9Var = (bj9) this.e.getValue();
            xk50Var.i = abe0Var2;
            xk50Var.j = ol50Var4;
            xk50Var.o = 1;
            ((itj) bj9Var).getClass();
            int i3 = ol50Var4.f25436a;
            if (i3 != 304 || ol50Var == null) {
                aj9Var = ((200 > i3 || i3 >= 300) && !itj.b.contains(new Integer(i3))) ? aj9.b : new aj9(ol50Var4);
            } else {
                al50 al50Var = ol50Var.d;
                al50 al50Var2 = ol50Var4.d;
                al50Var.getClass();
                Map map = al50Var.f1052a;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : map.entrySet()) {
                    linkedHashMap.put(entry.getKey(), CollectionsKt.N0((Collection) entry.getValue()));
                }
                for (Map.Entry entry2 : al50Var2.f1052a.entrySet()) {
                    String str = (String) entry2.getKey();
                    List list = (List) entry2.getValue();
                    String lowerCase = str.toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    linkedHashMap.put(lowerCase, CollectionsKt.N0(list));
                }
                aj9Var = new aj9(new ol50(ol50Var4.f25436a, ol50Var4.b, ol50Var4.c, new al50(xp20.n(linkedHashMap)), null, ol50Var4.f));
            }
            if (aj9Var != wneVar) {
            }
            return wneVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r1 = xk50Var.l;
            ol50Var3 = xk50Var.k;
            ol50Var4 = xk50Var.j;
            try {
                z1x.P(aj9Var);
                r2 = r1;
                r1 = r2;
                o24Var = (o24) r1.f27640a;
                hvkVar = (hvk) o24Var.d;
                synchronized (hvkVar.h) {
                    o24Var.a(true);
                    fvkVarD = hvkVar.d(((evk) o24Var.b).f8472a);
                }
                if (fvkVarD != null) {
                    return new abe0(fvkVarD);
                }
                return abe0Var3;
            } catch (Exception e2) {
                e = e2;
                try {
                    ((o24) r1.f27640a).a(false);
                } catch (Exception unused2) {
                }
                lmk0Var = ol50Var4.e;
                if (lmk0Var != null) {
                    try {
                        ohs0.D(lmk0Var);
                    } catch (RuntimeException e3) {
                        throw e3;
                    } catch (Exception unused3) {
                    }
                }
                lmk0Var2 = ol50Var3.e;
                if (lmk0Var2 != null) {
                    throw e;
                }
                try {
                    ohs0.D(lmk0Var2);
                    throw e;
                } catch (RuntimeException e4) {
                    throw e4;
                } catch (Exception unused4) {
                    throw e;
                }
            }
        }
        ol50 ol50Var5 = xk50Var.j;
        abe0 abe0Var4 = xk50Var.i;
        z1x.P(aj9Var);
        ol50Var4 = ol50Var5;
        abe0Var2 = abe0Var4;
        abe0Var3 = null;
        ol50Var3 = ((aj9) aj9Var).f963a;
        if (ol50Var3 == null) {
            return abe0Var3;
        }
        if (abe0Var2 != null) {
            fvk fvkVar = abe0Var2.f574a;
            hvk hvkVar2 = fvkVar.c;
            synchronized (hvkVar2.h) {
                fvkVar.close();
                o24VarC = hvkVar2.c(fvkVar.f10219a.f8472a);
            }
            if (o24VarC != null) {
                pv00Var = new pv00(o24VarC);
            } else {
                pv00Var = abe0Var3;
            }
        } else {
            bbe0 bbe0Var = (bbe0) this.d.getValue();
            if (bbe0Var == null) {
                pv00Var = abe0Var3;
            } else {
                String str2 = this.b.e;
                if (str2 == null) {
                    str2 = this.f44513a;
                }
                hvk hvkVar3 = bbe0Var.b;
                qg9 qg9Var = qg9.d;
                o24 o24VarC2 = hvkVar3.c(gl5.i(str2).d("SHA-256").f());
                if (o24VarC2 != null) {
                    pv00Var = new pv00(o24VarC2);
                } else {
                    pv00Var = abe0Var3;
                }
            }
        }
        if (pv00Var == 0) {
            return abe0Var3;
        }
        try {
            yae0 yae0VarC = x9x.C(c().x(((o24) pv00Var.f27640a).d(0), false));
            try {
                xia0.f0(ol50Var3, yae0VarC);
                try {
                    yae0VarC.close();
                    th = abe0Var3;
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                try {
                    yae0VarC.close();
                } catch (Throwable th5) {
                    tjo.a(th4, th5);
                }
                th = th4;
            }
            if (th != 0) {
                throw th;
            }
            lmk0 lmk0Var3 = ol50Var3.e;
            if (lmk0Var3 != null) {
                yzp yzpVarC = c();
                y190 y190VarD = ((o24) pv00Var.f27640a).d(1);
                abe0Var3 = abe0Var3;
                xk50Var.i = abe0Var3;
                xk50Var.j = ol50Var4;
                xk50Var.k = ol50Var3;
                xk50Var.l = pv00Var;
                xk50Var.o = 2;
                u99 u99Var = lmk0Var3.f20300a;
                yae0 yae0VarC2 = x9x.C(yzpVarC.x(y190VarD, false));
                try {
                    new Long(u99Var.u(yae0VarC2));
                    try {
                        yae0VarC2.close();
                        th2 = abe0Var3;
                    } catch (Throwable th6) {
                        th2 = th6;
                    }
                } catch (Throwable th7) {
                    try {
                        yae0VarC2.close();
                    } catch (Throwable th8) {
                        tjo.a(th7, th8);
                    }
                    th2 = th7;
                }
                if (th2 != 0) {
                    throw th2;
                }
                Unit unit = Unit.f46060a;
                if (unit != wneVar) {
                    r2 = pv00Var;
                    aj9Var = unit;
                    r1 = r2;
                }
                return wneVar;
            }
            abe0Var3 = abe0Var3;
            r1 = pv00Var;
            o24Var = (o24) r1.f27640a;
            hvkVar = (hvk) o24Var.d;
            synchronized (hvkVar.h) {
                o24Var.a(true);
                fvkVarD = hvkVar.d(((evk) o24Var.b).f8472a);
                if (fvkVarD != null) {
                    return new abe0(fvkVarD);
                }
                return abe0Var3;
            }
        } catch (Exception e5) {
            e = e5;
            r1 = pv00Var;
            ((o24) r1.f27640a).a(false);
            lmk0Var = ol50Var4.e;
            if (lmk0Var != null) {
                ohs0.D(lmk0Var);
            }
            lmk0Var2 = ol50Var3.e;
            if (lmk0Var2 != null) {
                throw e;
            }
            ohs0.D(lmk0Var2);
            throw e;
        }
    }
}

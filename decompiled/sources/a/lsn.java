package a;

import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class lsn implements kyn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f20589a;

    public lsn(qj9 qj9Var, m0o0 m0o0Var, peg0 peg0Var, sjl0 sjl0Var, edo edoVar, zfo zfoVar, ulk ulkVar, gst0 gst0Var, ehf0 ehf0Var, nvu nvuVar, sue sueVar, j1q0 j1q0Var, pru pruVar) {
        sjl0Var.getClass();
        edoVar.getClass();
        zfoVar.getClass();
        gst0Var.getClass();
        sueVar.getClass();
        j1q0Var.getClass();
        this.f20589a = new gbi(sueVar, qj9Var, m0o0Var, peg0Var, sjl0Var, edoVar, zfoVar, ulkVar, gst0Var, ehf0Var, nvuVar, j1q0Var);
    }

    @Override // a.kyn
    public Object a(String str) {
        tyn tynVar = (tyn) this.f20589a;
        String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL"};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 2; i++) {
            Provider provider = Security.getProvider(strArr[i]);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        Iterator it = arrayList.iterator();
        Exception exc = null;
        while (it.hasNext()) {
            try {
                return tynVar.c(str, (Provider) it.next());
            } catch (Exception e) {
                if (exc == null) {
                    exc = e;
                }
            }
        }
        return tynVar.c(str, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object b(String str, zje zjeVar) {
        u8p u8pVar;
        if (zjeVar instanceof u8p) {
            u8pVar = (u8p) zjeVar;
            int i = u8pVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                u8pVar.k = i - Integer.MIN_VALUE;
            } else {
                u8pVar = new u8p(this, zjeVar);
            }
        } else {
            u8pVar = new u8p(this, zjeVar);
        }
        Object obj = u8pVar.i;
        wne wneVar = wne.f39444a;
        int i2 = u8pVar.k;
        if (i2 == 0) {
            z1x.P(obj);
            fep fepVar = (fep) ((wgn) this.f20589a).invoke();
            mv60 mv60Var = new mv60(null);
            u8pVar.k = 1;
            if (fepVar.c(str, mv60Var, u8pVar) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object c(String str, String str2, String str3, zje zjeVar) throws Throwable {
        zyo zyoVar;
        Object g0g0Var;
        kuw kuwVar;
        if (zjeVar instanceof zyo) {
            zyoVar = (zyo) zjeVar;
            int i = zyoVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                zyoVar.k = i - Integer.MIN_VALUE;
            } else {
                zyoVar = new zyo(this, zjeVar);
            }
        } else {
            zyoVar = new zyo(this, zjeVar);
        }
        Object objC = zyoVar.i;
        wne wneVar = wne.f39444a;
        int i2 = zyoVar.k;
        try {
            if (i2 == 0) {
                z1x.P(objC);
                e0g0 e0g0Var = j0g0.b;
                jtj jtjVar = (jtj) this.f20589a;
                zyoVar.k = 1;
                objC = jtjVar.c(str, str2, str3, zyoVar);
                if (objC == wneVar) {
                    return wneVar;
                }
            } else {
                if (i2 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(objC);
            }
            g0g0Var = (oyo) objC;
            e0g0 e0g0Var2 = j0g0.b;
        } catch (Throwable th) {
            e0g0 e0g0Var3 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        Throwable thA = j0g0.a(g0g0Var);
        if (thA == null) {
            return g0g0Var;
        }
        if (!(thA instanceof zhi0) || ((kuwVar = ((zhi0) thA).c) != i2o.OldPasswordIncorrect && kuwVar != i2o.CurrentPasswordIncorrect)) {
            throw thA;
        }
        String message = thA.getMessage();
        if (message == null) {
            message = "";
        }
        throw new x4x(message);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008f, code lost:
    
        if (r10 == r9) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(boolean r11, a.zje r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof a.l0u
            if (r0 == 0) goto L14
            r0 = r12
            a.l0u r0 = (a.l0u) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.l = r1
        L12:
            r7 = r0
            goto L1a
        L14:
            a.l0u r0 = new a.l0u
            r0.<init>(r10, r12)
            goto L12
        L1a:
            java.lang.Object r12 = r7.j
            a.wne r9 = a.wne.f39444a
            int r0 = r7.l
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L40
            if (r0 == r2) goto L37
            if (r0 != r1) goto L31
            a.z1x.P(r12)
            a.j0g0 r12 = (a.j0g0) r12
            java.lang.Object r10 = r12.f15681a
            goto L92
        L31:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r10)
            return r3
        L37:
            boolean r11 = r7.i
            a.z1x.P(r12)     // Catch: java.lang.Throwable -> L3d
            goto L5f
        L3d:
            r0 = move-exception
            r12 = r0
            goto L69
        L40:
            a.z1x.P(r12)
            a.e0g0 r12 = a.j0g0.b     // Catch: java.lang.Throwable -> L3d
            java.lang.Object r12 = r10.f20589a     // Catch: java.lang.Throwable -> L3d
            a.pmi r12 = (a.pmi) r12     // Catch: java.lang.Throwable -> L3d
            r7.i = r11     // Catch: java.lang.Throwable -> L3d
            r7.l = r2     // Catch: java.lang.Throwable -> L3d
            java.lang.Object r0 = r12.e     // Catch: java.lang.Throwable -> L3d
            a.mne r0 = (a.mne) r0     // Catch: java.lang.Throwable -> L3d
            a.dvj r0 = r0.b     // Catch: java.lang.Throwable -> L3d
            a.wlk r2 = new a.wlk     // Catch: java.lang.Throwable -> L3d
            r2.<init>(r12, r3, r1)     // Catch: java.lang.Throwable -> L3d
            java.lang.Object r12 = a.qjj.d0(r0, r2, r7)     // Catch: java.lang.Throwable -> L3d
            if (r12 != r9) goto L5f
            goto L91
        L5f:
            java.util.List r12 = (java.util.List) r12     // Catch: java.lang.Throwable -> L3d
            a.lvf r0 = new a.lvf     // Catch: java.lang.Throwable -> L3d
            r0.<init>(r12)     // Catch: java.lang.Throwable -> L3d
            a.e0g0 r12 = a.j0g0.b     // Catch: java.lang.Throwable -> L3d
            goto L70
        L69:
            a.e0g0 r0 = a.j0g0.b
            a.g0g0 r0 = new a.g0g0
            r0.<init>(r12)
        L70:
            java.lang.Throwable r12 = a.j0g0.a(r0)
            if (r12 != 0) goto L77
            goto L9c
        L77:
            if (r11 != 0) goto L99
            a.epp r6 = new a.epp
            r12 = 7
            r6.<init>(r10, r3, r12)
            r7.i = r11
            r7.l = r1
            java.lang.String r1 = "getCurrencies"
            r2 = 5
            r4 = 0
            r8 = 12
            java.lang.Object r10 = a.j0x.I(r1, r2, r4, r6, r7, r8)
            if (r10 != r9) goto L92
        L91:
            return r9
        L92:
            a.z1x.P(r10)
            a.mvf r10 = (a.mvf) r10
        L97:
            r0 = r10
            goto L9c
        L99:
            a.kvf r10 = a.kvf.f18954a
            goto L97
        L9c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a.lsn.d(boolean, a.zje):java.lang.Object");
    }

    public List e() {
        return ((oe6) ((r7v) this.f20589a).f29996a).f25109a;
    }

    public boolean f() {
        return ((t91) this.f20589a).f33539a.b;
    }

    public lsn(rch rchVar) {
        rchVar.getClass();
        this.f20589a = rchVar;
    }

    public lsn(us00 us00Var) {
        this.f20589a = us00Var.getSharedPreferences("GamesPreferences", 0);
    }

    public lsn(xyp0 xyp0Var) {
        xyp0Var.getClass();
        this.f20589a = xyp0Var;
    }

    public lsn(bl6 bl6Var) {
        bl6Var.getClass();
        this.f20589a = bl6Var;
    }

    public lsn(epi0 epi0Var, iw20 iw20Var) {
        this.f20589a = new c5k(epi0Var, iw20Var);
    }

    public lsn(gii0 gii0Var, byte b) {
        gii0Var.getClass();
        switch (b) {
            case 10:
                this.f20589a = new wgn(gii0Var, (byte) 28);
                break;
            default:
                this.f20589a = new wgn(gii0Var, (byte) 10);
                break;
        }
    }

    public lsn(crq crqVar, us00 us00Var, tgk tgkVar) {
        crqVar.getClass();
        tgkVar.getClass();
        this.f20589a = new phf0(crqVar, us00Var, tgkVar);
    }

    public lsn(y1f0 y1f0Var) {
        y1f0Var.getClass();
        this.f20589a = y1f0Var;
    }

    public /* synthetic */ lsn(Object obj) {
        this.f20589a = obj;
    }
}

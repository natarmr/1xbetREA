package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.google.android.gms.internal.p000firebaseauthapi.zzaia;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public class mkt0 implements ngw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f21959a;
    public Object b;
    public Object c;

    public /* synthetic */ mkt0(Object obj, Object obj2, Object obj3) {
        this.f21959a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008f, code lost:
    
        if (r8.a(false, r3, r1, false, r6) == r0) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(a.zje r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof a.lkt0
            if (r0 == 0) goto L14
            r0 = r9
            a.lkt0 r0 = (a.lkt0) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.l = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            a.lkt0 r0 = new a.lkt0
            r0.<init>(r8, r9)
            goto L12
        L1a:
            java.lang.Object r9 = r6.j
            a.wne r0 = a.wne.f39444a
            int r1 = r6.l
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L39
            if (r1 == r3) goto L33
            if (r1 != r2) goto L2d
            a.z1x.P(r9)
            goto L92
        L2d:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r8)
            return r4
        L33:
            java.lang.String r1 = r6.i
            a.z1x.P(r9)
            goto L54
        L39:
            a.z1x.P(r9)
            java.lang.Object r9 = r8.c
            a.ntu r9 = (a.ntu) r9
            java.lang.String r1 = r9.a()
            java.lang.Object r9 = r8.b
            a.jdu r9 = (a.jdu) r9
            r6.i = r1
            r6.l = r3
            r5 = 0
            java.io.Serializable r9 = r9.a(r6, r1, r3, r5)
            if (r9 != r0) goto L54
            goto L91
        L54:
            java.util.Collection r9 = (java.util.Collection) r9
            java.util.ArrayList r9 = kotlin.collections.CollectionsKt.N0(r9)
            java.util.Iterator r9 = r9.iterator()
        L5e:
            boolean r3 = r9.hasNext()
            if (r3 == 0) goto L78
            java.lang.Object r3 = r9.next()
            r5 = r3
            a.f8b r5 = (a.f8b) r5
            int r5 = r5.f9097a
            a.nek r7 = a.y4t.c
            java.lang.String r7 = "160291"
            int r7 = java.lang.Integer.parseInt(r7)
            if (r5 != r7) goto L5e
            goto L79
        L78:
            r3 = r4
        L79:
            a.f8b r3 = (a.f8b) r3
            if (r3 == 0) goto L95
            java.lang.Object r8 = r8.f21959a
            a.cdu r8 = (a.cdu) r8
            int r3 = r3.f9097a
            r6.i = r4
            r6.l = r2
            r2 = 0
            r5 = 0
            r4 = r1
            r1 = r8
            java.io.Serializable r8 = r1.a(r2, r3, r4, r5, r6)
            if (r8 != r0) goto L92
        L91:
            return r0
        L92:
            kotlin.Unit r8 = kotlin.Unit.f46060a
            return r8
        L95:
            kotlin.Unit r8 = kotlin.Unit.f46060a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a.mkt0.a(a.zje):java.lang.Object");
    }

    public boolean b() {
        return ((Boolean) ((hgk0) ((pz40) this.f21959a)).getValue()).booleanValue() || ((Boolean) ((hgk0) ((pz40) this.b)).getValue()).booleanValue() || ((Boolean) ((hgk0) ((pz40) this.c)).getValue()).booleanValue();
    }

    public uyw0 c() {
        rkt0 rkt0Var;
        icw0 icw0VarB;
        zyw0 zyw0Var = (zyw0) this.f21959a;
        if (zyw0Var == null || (rkt0Var = (rkt0) this.b) == null) {
            jf4.o("Cannot build without parameters and/or key material");
            return null;
        }
        if (zyw0Var.f45226a != ((icw0) rkt0Var.b).f14556a.length) {
            hny.o("Key size mismatch");
            return null;
        }
        if (zyw0Var.a() && ((Integer) this.c) == null) {
            hny.o("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (!((zyw0) this.f21959a).a() && ((Integer) this.c) != null) {
            hny.o("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        drq drqVar = ((zyw0) this.f21959a).b;
        if (drqVar == drq.j) {
            icw0VarB = q6x0.f28222a;
        } else if (drqVar == drq.i) {
            icw0VarB = q6x0.a(((Integer) this.c).intValue());
        } else {
            if (drqVar != drq.h) {
                jf4.n("Unknown AesSivParameters.Variant: ".concat(String.valueOf(drqVar)));
                return null;
            }
            icw0VarB = q6x0.b(((Integer) this.c).intValue());
        }
        return new uyw0((zyw0) this.f21959a, (rkt0) this.b, icw0VarB, (Integer) this.c);
    }

    public v7x0 d() throws GeneralSecurityException {
        rkt0 rkt0Var;
        icw0 icw0VarA;
        g8x0 g8x0Var = (g8x0) this.f21959a;
        if (g8x0Var == null || (rkt0Var = (rkt0) this.b) == null) {
            hny.o("Cannot build without parameters and/or key material");
            return null;
        }
        if (g8x0Var.f10885a != ((icw0) rkt0Var.b).f14556a.length) {
            hny.o("Key size mismatch");
            return null;
        }
        if (g8x0Var.a() && ((Integer) this.c) == null) {
            hny.o("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (!((g8x0) this.f21959a).a() && ((Integer) this.c) != null) {
            hny.o("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        hbb hbbVar = ((g8x0) this.f21959a).c;
        if (hbbVar == hbb.s) {
            icw0VarA = q6x0.f28222a;
        } else if (hbbVar == hbb.r || hbbVar == hbb.q) {
            icw0VarA = q6x0.a(((Integer) this.c).intValue());
        } else {
            if (hbbVar != hbb.p) {
                jf4.n("Unknown AesCmacParametersParameters.Variant: ".concat(String.valueOf(hbbVar)));
                return null;
            }
            icw0VarA = q6x0.b(((Integer) this.c).intValue());
        }
        return new v7x0((g8x0) this.f21959a, (rkt0) this.b, icw0VarA, (Integer) this.c);
    }

    @Override // a.ngw0
    public void h(xfw0 xfw0Var) {
        ziw0 ziw0Var = (ziw0) xfw0Var;
        ((nmt0) this.c).g(new zzaia(Long.valueOf(ziw0Var.c), ziw0Var.b, ziw0Var.f44458a), null, ParameterNames.PASSWORD, Boolean.FALSE, null, (hcp0) this.f21959a, this);
    }

    @Override // a.ngw0
    /* JADX INFO: renamed from: zza */
    public void mo2zza(String str) {
        ((zcw0) this.b).mo2zza(str);
    }
}

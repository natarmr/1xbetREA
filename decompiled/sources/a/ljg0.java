package a;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ljg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zsf f20150a = new zsf(0.0f, 1.4f, 1.0f, 1.0f);

    public static final void a(mjg0 mjg0Var, float f, fet fetVar, int i) {
        fet fetVar2;
        Object kvVar;
        t33 t33Var;
        t33 t33Var2;
        pz40 pz40Var;
        mjg0 mjg0Var2 = mjg0Var;
        fetVar.g0(1894625643);
        int i2 = (fetVar.g(mjg0Var2) ? 4 : 2) | i | (fetVar.d(f) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            float f2 = f / 160.0f;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = xf0.c(0.0f);
                fetVar.o0(objP);
            }
            t33 t33Var3 = (t33) objP;
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = xf0.c(0.0f);
                fetVar.o0(objP2);
            }
            t33 t33Var4 = (t33) objP2;
            hjg0 hjg0Var = mjg0Var2.f21895a;
            Object objP3 = fetVar.P();
            if (objP3 == cl5Var) {
                objP3 = xf0.c(hjg0Var.equals(ejg0.f7909a) ? 600.0f : 0.0f);
                fetVar.o0(objP3);
            }
            t33 t33Var5 = (t33) objP3;
            Object objP4 = fetVar.P();
            if (objP4 == cl5Var) {
                objP4 = androidx.compose.runtime.e.e(mjg0Var2.c);
                fetVar.o0(objP4);
            }
            pz40 pz40Var2 = (pz40) objP4;
            boolean zI = ((i2 & 14) == 4) | fetVar.i(t33Var3) | fetVar.i(t33Var4) | fetVar.i(t33Var5);
            Object objP5 = fetVar.P();
            if (zI || objP5 == cl5Var) {
                t33Var = t33Var3;
                t33Var2 = t33Var4;
                kvVar = new kv((Object) mjg0Var2, (Object) t33Var, (Object) t33Var2, (Object) t33Var5, pz40Var2, (yje) null, (byte) 16);
                pz40Var = pz40Var2;
                fetVar.o0(kvVar);
            } else {
                kvVar = objP5;
                t33Var = t33Var3;
                t33Var2 = t33Var4;
                pz40Var = pz40Var2;
            }
            m0x0.t(fetVar, mjg0Var2, (Function2) kvVar);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = o7k0.n(jm40Var, f);
            boolean zI2 = fetVar.i(t33Var5) | fetVar.d(f2) | fetVar.i(t33Var);
            Object objP6 = fetVar.P();
            if (zI2 || objP6 == cl5Var) {
                objP6 = new ny2((Object) t33Var5, f2, (Object) t33Var, (byte) 12);
                fetVar.o0(objP6);
            }
            mm40 mm40VarT = i4w0.T(mm40VarN, (Function1) objP6);
            tj30 tj30VarC = zq8.c(gqw0.h, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarT);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            float f3 = 60.0f * f2;
            t33 t33Var6 = t33Var2;
            fetVar2 = fetVar;
            k7x.a(mjg0Var2.b.a(), null, o7k0.s(o7k0.e(jm40Var, 140.0f * f2), f3), gqw0.f1, null, fetVar2, 1572912, 1976);
            Object objA = ((o0x) pz40Var.getValue()).a();
            mm40 mm40VarQ = ffb0.Q(k7n0.H(o7k0.s(o7k0.e(jr8.f16991a.b(jm40Var, gqw0.b), 100.0f * f2), f3), 1.0f), (-6.0f) * f2, (-54.0f) * f2);
            boolean zI3 = fetVar2.i(t33Var6);
            Object objP7 = fetVar2.P();
            if (zI3 || objP7 == cl5Var) {
                objP7 = new m53(t33Var6, (byte) 24);
                fetVar2.o0(objP7);
            }
            k7x.a(objA, null, i4w0.T(mm40VarQ, (Function1) objP7), null, null, fetVar2, 48, 2040);
            fetVar2.r(true);
        } else {
            mjg0Var2 = mjg0Var2;
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new rx7((byte) 6, f, i, mjg0Var2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0096  */
    /* JADX WARN: Code duplicated, block: B:34:0x00af  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a9, code lost:
    
        if (r14.f(r1, r0) == r2) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d6, code lost:
    
        if (a.t33.a(r14, r0, r3, null, null, r1, 12) == r2) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(a.t33 r12, a.t33 r13, a.t33 r14, boolean r15, int r16, a.n0x r17, a.ryc0 r18, a.zje r19) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ljg0.b(a.t33, a.t33, a.t33, boolean, int, a.n0x, a.ryc0, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004c, code lost:
    
        if (r8.f(r6, r9) == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0069, code lost:
    
        if (a.t33.a(r8, r2, r3, null, null, r6, 12) == r0) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(a.t33 r8, boolean r9, int r10, a.n0x r11, a.ryc0 r12, a.zje r13) {
        /*
            boolean r0 = r13 instanceof a.jjg0
            if (r0 == 0) goto L14
            r0 = r13
            a.jjg0 r0 = (a.jjg0) r0
            int r1 = r0.j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.j = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            a.jjg0 r0 = new a.jjg0
            r0.<init>(r13)
            goto L12
        L1a:
            java.lang.Object r13 = r6.i
            a.wne r0 = a.wne.f39444a
            int r1 = r6.j
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L37
            if (r1 == r3) goto L33
            if (r1 != r2) goto L2d
            a.z1x.P(r13)
            goto L6c
        L2d:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r8)
            return r4
        L33:
            a.z1x.P(r13)
            goto L4f
        L37:
            a.z1x.P(r13)
            r12.invoke(r11)
            r11 = 1142292480(0x44160000, float:600.0)
            if (r9 == 0) goto L52
            java.lang.Float r9 = new java.lang.Float
            r9.<init>(r11)
            r6.j = r3
            java.lang.Object r8 = r8.f(r6, r9)
            if (r8 != r0) goto L4f
            goto L6b
        L4f:
            kotlin.Unit r8 = kotlin.Unit.f46060a
            return r8
        L52:
            r9 = r2
            java.lang.Float r2 = new java.lang.Float
            r2.<init>(r11)
            r11 = 0
            r12 = 6
            a.uts0 r3 = a.ro4.m0(r10, r11, r4, r12)
            r6.j = r9
            r4 = 0
            r5 = 0
            r7 = 12
            r1 = r8
            java.lang.Object r8 = a.t33.a(r1, r2, r3, r4, r5, r6, r7)
            if (r8 != r0) goto L6c
        L6b:
            return r0
        L6c:
            kotlin.Unit r8 = kotlin.Unit.f46060a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ljg0.c(a.t33, boolean, int, a.n0x, a.ryc0, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:36:0x0141  */
    /* JADX WARN: Code duplicated, block: B:40:0x018c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x018c -> B:20:0x0071). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object d(a.t33 r19, a.t33 r20, a.t33 r21, a.n0x r22, boolean r23, a.gig0 r24, a.ryc0 r25, a.zje r26) {
        /*
            Method dump skipped, instruction units count: 562
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ljg0.d(a.t33, a.t33, a.t33, a.n0x, boolean, a.gig0, a.ryc0, a.zje):java.lang.Object");
    }

    public static final Object e(Pair[] pairArr, cfq cfqVar, kjg0 kjg0Var) {
        Object objJ = d5c.J(kjg0Var, new qkb0((Object) pairArr, (Object) cfqVar, (yje) null, (byte) 8));
        return objJ == wne.f39444a ? objJ : Unit.f46060a;
    }
}

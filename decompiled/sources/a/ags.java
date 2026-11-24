package a;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ags {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zsf f840a = new zsf(0.0f, 1.0f, 1.0f, 1.0f);
    public static final zsf b = new zsf(0.0f, 1.0f, 0.0f, 1.0f);

    public static final void a(yaa yaaVar, fet fetVar, int i) {
        fet fetVar2;
        yaa yaaVar2;
        Object kvVar;
        t33 t33Var;
        pz40 pz40Var;
        t33 t33Var2;
        fetVar.g0(164355180);
        int i2 = (fetVar.g(yaaVar) ? 4 : 2) | i;
        byte b2 = 1;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = androidx.compose.runtime.e.e("");
                fetVar.o0(objP);
            }
            pz40 pz40Var2 = (pz40) objP;
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = androidx.compose.runtime.e.e("");
                fetVar.o0(objP2);
            }
            pz40 pz40Var3 = (pz40) objP2;
            Object objP3 = fetVar.P();
            if (objP3 == cl5Var) {
                objP3 = xf0.c(80.0f);
                fetVar.o0(objP3);
            }
            t33 t33Var3 = (t33) objP3;
            Object objP4 = fetVar.P();
            if (objP4 == cl5Var) {
                objP4 = xf0.c(80.0f);
                fetVar.o0(objP4);
            }
            t33 t33Var4 = (t33) objP4;
            zaa zaaVar = yaaVar.k;
            int i3 = i2 & 14;
            boolean zI = (i3 == 4) | fetVar.i(t33Var3) | fetVar.i(t33Var4);
            Object objP5 = fetVar.P();
            if (zI || objP5 == cl5Var) {
                t33Var = t33Var3;
                pz40Var = pz40Var2;
                t33Var2 = t33Var4;
                kvVar = new kv((Object) t33Var, (Object) t33Var2, (Object) yaaVar, (Object) pz40Var, pz40Var3, (yje) null, (byte) 10);
                fetVar.o0(kvVar);
            } else {
                kvVar = objP5;
                t33Var = t33Var3;
                pz40Var = pz40Var2;
                t33Var2 = t33Var4;
            }
            m0x0.t(fetVar, zaaVar, (Function2) kvVar);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(o7k0.e(mm40VarD, 84.0f), 0.0f, 4.0f, 0.0f, 0.0f, 13);
            thg0 thg0VarA = shg0.a(uc9.e, gqw0.k, fetVar, 54);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarN);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            mm40 mm40VarN2 = o7k0.n(yyw.V(jm40Var, fetVar.k(bmd.n) == k6z.b), 80.0f);
            mm40 mm40VarE0 = o2e.e0(mm40VarN2, "CARD_BASKETBALL_FIRST_PLAYER_IMAGE");
            boolean zI2 = fetVar.i(t33Var);
            Object objP6 = fetVar.P();
            if (zI2 || objP6 == cl5Var) {
                objP6 = new m53(t33Var, (byte) 16);
                fetVar.o0(objP6);
            }
            mm40 mm40VarP = ffb0.P(mm40VarE0, (Function1) objP6);
            t33 t33Var5 = t33Var2;
            fetVar2 = fetVar;
            yaaVar2 = yaaVar;
            k7x.a((String) pz40Var.getValue(), null, mm40VarP, null, null, fetVar2, 48, 2040);
            unh0.E(yaaVar2, fetVar2, i3);
            mm40 mm40VarE1 = o2e.e0(mm40VarN2, "CARD_BASKETBALL_SECOND_PLAYER_IMAGE");
            boolean zI3 = fetVar2.i(t33Var5);
            Object objP7 = fetVar2.P();
            if (zI3 || objP7 == cl5Var) {
                objP7 = new m53(t33Var5, (byte) 17);
                fetVar2.o0(objP7);
            }
            k7x.a((String) pz40Var3.getValue(), null, ffb0.P(mm40VarE1, (Function1) objP7), null, null, fetVar2, 48, 2040);
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            yaaVar2 = yaaVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new rqr(yaaVar2, i, b2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0078, code lost:
    
        if (a.t33.a(r2, r3, r4, null, null, r7, 12) == r1) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(a.t33 r16, a.t33 r17, a.zje r18) {
        /*
            r0 = r18
            boolean r1 = r0 instanceof a.wfs
            if (r1 == 0) goto L16
            r1 = r0
            a.wfs r1 = (a.wfs) r1
            int r2 = r1.k
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.k = r2
        L14:
            r7 = r1
            goto L1c
        L16:
            a.wfs r1 = new a.wfs
            r1.<init>(r0)
            goto L14
        L1c:
            java.lang.Object r0 = r7.j
            a.wne r1 = a.wne.f39444a
            int r2 = r7.k
            a.zsf r9 = a.ags.f840a
            r10 = 0
            r11 = 600(0x258, float:8.41E-43)
            r12 = 1117782016(0x42a00000, float:80.0)
            r3 = 1
            r13 = 2
            r14 = 0
            if (r2 == 0) goto L42
            if (r2 == r3) goto L3c
            if (r2 != r13) goto L36
            a.z1x.P(r0)
            goto L7b
        L36:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r0)
            return r14
        L3c:
            a.t33 r2 = r7.i
            a.z1x.P(r0)
            goto L63
        L42:
            a.z1x.P(r0)
            java.lang.Float r0 = new java.lang.Float
            r0.<init>(r12)
            a.uts0 r4 = a.ro4.m0(r11, r10, r9, r13)
            r15 = r17
            r7.i = r15
            r7.k = r3
            r5 = 0
            r6 = 0
            r8 = 12
            r2 = r16
            r3 = r0
            java.lang.Object r0 = a.t33.a(r2, r3, r4, r5, r6, r7, r8)
            if (r0 != r1) goto L62
            goto L7a
        L62:
            r2 = r15
        L63:
            java.lang.Float r3 = new java.lang.Float
            r3.<init>(r12)
            a.uts0 r4 = a.ro4.m0(r11, r10, r9, r13)
            r7.i = r14
            r7.k = r13
            r5 = 0
            r6 = 0
            r8 = 12
            java.lang.Object r0 = a.t33.a(r2, r3, r4, r5, r6, r7, r8)
            if (r0 != r1) goto L7b
        L7a:
            return r1
        L7b:
            kotlin.Unit r0 = kotlin.Unit.f46060a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ags.b(a.t33, a.t33, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0077, code lost:
    
        if (a.t33.a(r2, r3, r4, null, null, r7, 12) == r1) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(a.t33 r16, a.t33 r17, a.zje r18) {
        /*
            r0 = r18
            boolean r1 = r0 instanceof a.xfs
            if (r1 == 0) goto L16
            r1 = r0
            a.xfs r1 = (a.xfs) r1
            int r2 = r1.k
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.k = r2
        L14:
            r7 = r1
            goto L1c
        L16:
            a.xfs r1 = new a.xfs
            r1.<init>(r0)
            goto L14
        L1c:
            java.lang.Object r0 = r7.j
            a.wne r1 = a.wne.f39444a
            int r2 = r7.k
            a.zsf r9 = a.ags.f840a
            r10 = 0
            r11 = 750(0x2ee, float:1.051E-42)
            r12 = 0
            r3 = 1
            r13 = 2
            r14 = 0
            if (r2 == 0) goto L41
            if (r2 == r3) goto L3b
            if (r2 != r13) goto L35
            a.z1x.P(r0)
            goto L7a
        L35:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r0)
            return r14
        L3b:
            a.t33 r2 = r7.i
            a.z1x.P(r0)
            goto L62
        L41:
            a.z1x.P(r0)
            java.lang.Float r0 = new java.lang.Float
            r0.<init>(r12)
            a.uts0 r4 = a.ro4.m0(r11, r10, r9, r13)
            r15 = r17
            r7.i = r15
            r7.k = r3
            r5 = 0
            r6 = 0
            r8 = 12
            r2 = r16
            r3 = r0
            java.lang.Object r0 = a.t33.a(r2, r3, r4, r5, r6, r7, r8)
            if (r0 != r1) goto L61
            goto L79
        L61:
            r2 = r15
        L62:
            java.lang.Float r3 = new java.lang.Float
            r3.<init>(r12)
            a.uts0 r4 = a.ro4.m0(r11, r10, r9, r13)
            r7.i = r14
            r7.k = r13
            r5 = 0
            r6 = 0
            r8 = 12
            java.lang.Object r0 = a.t33.a(r2, r3, r4, r5, r6, r7, r8)
            if (r0 != r1) goto L7a
        L79:
            return r1
        L7a:
            kotlin.Unit r0 = kotlin.Unit.f46060a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ags.c(a.t33, a.t33, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0077, code lost:
    
        if (a.t33.a(r2, r3, r4, null, null, r7, 12) == r1) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(a.t33 r16, a.t33 r17, a.zje r18) {
        /*
            r0 = r18
            boolean r1 = r0 instanceof a.yfs
            if (r1 == 0) goto L16
            r1 = r0
            a.yfs r1 = (a.yfs) r1
            int r2 = r1.k
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.k = r2
        L14:
            r7 = r1
            goto L1c
        L16:
            a.yfs r1 = new a.yfs
            r1.<init>(r0)
            goto L14
        L1c:
            java.lang.Object r0 = r7.j
            a.wne r1 = a.wne.f39444a
            int r2 = r7.k
            a.zsf r9 = a.ags.f840a
            r10 = 0
            r11 = 300(0x12c, float:4.2E-43)
            r12 = 0
            r3 = 1
            r13 = 2
            r14 = 0
            if (r2 == 0) goto L41
            if (r2 == r3) goto L3b
            if (r2 != r13) goto L35
            a.z1x.P(r0)
            goto L7a
        L35:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r0)
            return r14
        L3b:
            a.t33 r2 = r7.i
            a.z1x.P(r0)
            goto L62
        L41:
            a.z1x.P(r0)
            java.lang.Float r0 = new java.lang.Float
            r0.<init>(r12)
            a.uts0 r4 = a.ro4.m0(r11, r10, r9, r13)
            r15 = r17
            r7.i = r15
            r7.k = r3
            r5 = 0
            r6 = 0
            r8 = 12
            r2 = r16
            r3 = r0
            java.lang.Object r0 = a.t33.a(r2, r3, r4, r5, r6, r7, r8)
            if (r0 != r1) goto L61
            goto L79
        L61:
            r2 = r15
        L62:
            java.lang.Float r3 = new java.lang.Float
            r3.<init>(r12)
            a.uts0 r4 = a.ro4.m0(r11, r10, r9, r13)
            r7.i = r14
            r7.k = r13
            r5 = 0
            r6 = 0
            r8 = 12
            java.lang.Object r0 = a.t33.a(r2, r3, r4, r5, r6, r7, r8)
            if (r0 != r1) goto L7a
        L79:
            return r1
        L7a:
            kotlin.Unit r0 = kotlin.Unit.f46060a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ags.d(a.t33, a.t33, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00da  */
    /* JADX WARN: Code duplicated, block: B:36:0x00f9 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00f7 -> B:30:0x00b3). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final void e(a.t33 r23, a.t33 r24, a.zje r25) {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ags.e(a.t33, a.t33, a.zje):void");
    }
}

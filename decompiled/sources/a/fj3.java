package a;

import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class fj3 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public byte k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public fj3(e910 e910Var, int i, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 11;
        this.l = e910Var;
        this.k = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004d, code lost:
    
        if (r1.M(r7) == r2) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007a, code lost:
    
        if (r1.M(r7) == r2) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007c, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object l(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.l
            r1 = r0
            a.o9g0 r1 = (a.o9g0) r1
            boolean r0 = r7.j
            a.wne r2 = a.wne.f39444a
            byte r3 = r7.k
            r4 = 0
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L1f
            if (r3 == r6) goto L1b
            if (r3 != r5) goto L15
            goto L1b
        L15:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r7)
            return r4
        L1b:
            a.z1x.P(r8)
            goto L7d
        L1f:
            a.z1x.P(r8)
            if (r0 == 0) goto L50
            a.bby r8 = r1.K
            if (r8 == 0) goto L2b
            a.e3c.n(r8)
        L2b:
            java.lang.Object r8 = r1.D()
            a.e9g0 r8 = (a.e9g0) r8
            java.util.List r8 = r8.g
            boolean r8 = r8.isEmpty()
            if (r8 != 0) goto L45
            java.lang.Object r8 = r1.D()
            a.e9g0 r8 = (a.e9g0) r8
            a.q5g0 r8 = r8.h
            a.q5g0 r3 = a.q5g0.f28150a
            if (r8 == r3) goto L7d
        L45:
            r7.j = r0
            r7.k = r6
            java.lang.Object r7 = r1.M(r7)
            if (r7 != r2) goto L7d
            goto L7c
        L50:
            java.lang.Object r8 = r1.D()
            a.e9g0 r8 = (a.e9g0) r8
            java.util.List r8 = r8.g
            boolean r8 = r8.isEmpty()
            if (r8 != 0) goto L72
            a.bby r7 = r1.K
            if (r7 == 0) goto L65
            a.e3c.n(r7)
        L65:
            a.k9g0 r7 = new a.k9g0
            r7.<init>(r1, r4, r6)
            r8 = 3
            a.bby r7 = a.i3t0.K(r1, r4, r4, r7, r8)
            r1.K = r7
            goto L7d
        L72:
            r7.j = r0
            r7.k = r5
            java.lang.Object r7 = r1.M(r7)
            if (r7 != r2) goto L7d
        L7c:
            return r2
        L7d:
            int r7 = a.o9g0.M
            a.bby r7 = r1.L
            if (r7 == 0) goto L8a
            boolean r7 = r7.isActive()
            if (r7 != r6) goto L8a
            goto L9d
        L8a:
            a.rus r2 = r1.t
            a.vtf0 r5 = new a.vtf0
            r7 = 11
            r5.<init>(r7)
            r6 = 119(0x77, float:1.67E-43)
            r3 = 0
            r4 = 0
            a.bby r7 = a.i3t0.F(r1, r2, r3, r4, r5, r6)
            r1.L = r7
        L9d:
            kotlin.Unit r7 = kotlin.Unit.f46060a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a.fj3.l(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00d7, code lost:
    
        if (r0 == r2) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object m(java.lang.Object r42) {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.fj3.m(java.lang.Object):java.lang.Object");
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.l;
        switch (b) {
            case 0:
                return new fj3((diu0) obj2, this.j, yjeVar, (byte) 0);
            case 1:
                return new fj3((diu0) obj2, yjeVar, (byte) 1);
            case 2:
                return new fj3((diu0) obj2, this.j, yjeVar, (byte) 2);
            case 3:
                return new fj3((diu0) obj2, yjeVar, (byte) 3);
            case 4:
                return new fj3((diu0) obj2, yjeVar, (byte) 4);
            case 5:
                return new fj3((diu0) obj2, yjeVar, (byte) 5);
            case 6:
                return new fj3((diu0) obj2, yjeVar, (byte) 6);
            case 7:
                return new fj3((diu0) obj2, this.j, yjeVar, (byte) 7);
            case 8:
                return new fj3((diu0) obj2, this.j, yjeVar, (byte) 8);
            case 9:
                return new fj3(this.j, obj2, yjeVar, (byte) 9);
            case 10:
                return new fj3((diu0) obj2, this.j, yjeVar, (byte) 10);
            case 11:
                return new fj3((e910) obj2, this.k, yjeVar);
            case 12:
                return new fj3((diu0) obj2, this.j, yjeVar, (byte) 12);
            case 13:
                return new fj3((diu0) obj2, this.j, yjeVar, (byte) 13);
            case 14:
                return new fj3((diu0) obj2, yjeVar, (byte) 14);
            case 15:
                return new fj3(this.j, obj2, yjeVar, (byte) 15);
            case 16:
                fj3 fj3Var = new fj3((diu0) obj2, yjeVar, (byte) 16);
                fj3Var.j = ((Boolean) obj).booleanValue();
                return fj3Var;
            case 17:
                fj3 fj3Var2 = new fj3((diu0) obj2, yjeVar, (byte) 17);
                fj3Var2.j = ((Boolean) obj).booleanValue();
                return fj3Var2;
            case 18:
                return new fj3((diu0) obj2, this.j, yjeVar, (byte) 18);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new fj3((diu0) obj2, this.j, yjeVar, (byte) 19);
            case 20:
                fj3 fj3Var3 = new fj3((diu0) obj2, yjeVar, (byte) 20);
                fj3Var3.j = ((Boolean) obj).booleanValue();
                return fj3Var3;
            case 21:
                fj3 fj3Var4 = new fj3((diu0) obj2, yjeVar, (byte) 21);
                fj3Var4.j = ((Boolean) obj).booleanValue();
                return fj3Var4;
            case 22:
                return new fj3(this.j, obj2, yjeVar, (byte) 22);
            default:
                return new fj3(this.j, obj2, yjeVar, (byte) 23);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((fj3) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((fj3) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((fj3) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((fj3) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((fj3) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((fj3) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((fj3) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((fj3) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((fj3) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((fj3) create(Long.valueOf(((Number) obj).longValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((fj3) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((fj3) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((fj3) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((fj3) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                return ((fj3) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                return ((fj3) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((fj3) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return ((fj3) create(bool2, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 18:
                return ((fj3) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((fj3) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 20:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                return ((fj3) create(bool3, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 21:
                Boolean bool4 = (Boolean) obj;
                bool4.booleanValue();
                return ((fj3) create(bool4, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 22:
                return ((fj3) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((fj3) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:276:0x063b  */
    /* JADX WARN: Code duplicated, block: B:277:0x064e  */
    /* JADX WARN: Code duplicated, block: B:358:0x080d  */
    /* JADX WARN: Code duplicated, block: B:361:0x081d  */
    /* JADX WARN: Code duplicated, block: B:381:0x08a2 A[LOOP:4: B:381:0x08a2->B:518:?, LOOP_START] */
    /* JADX WARN: Code duplicated, block: B:384:0x08d0  */
    /* JADX WARN: Code duplicated, block: B:407:0x093f  */
    /* JADX WARN: Code duplicated, block: B:410:0x0944  */
    /* JADX WARN: Code duplicated, block: B:433:0x09a8  */
    /* JADX WARN: Code duplicated, block: B:436:0x09ad  */
    /* JADX WARN: Code duplicated, block: B:461:0x0a55  */
    /* JADX WARN: Code duplicated, block: B:464:0x0a67  */
    /* JADX WARN: Code duplicated, block: B:549:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:554:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:573:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:576:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:578:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:583:? A[RETURN, SYNTHETIC] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v12 java.lang.Object, still in use, count: 2, list:
          (r3v12 java.lang.Object) from 0x0a51: PHI (r3 I:??) = (r3v7 java.lang.Object), (r3v12 java.lang.Object) binds: [B:458:0x0a50, B:524:0x0a51] A[DONT_GENERATE, DONT_INLINE]
          (r3v12 java.lang.Object) from 0x0a49: CHECK_CAST (org.xplatform.bet_history.history.domain.model.HistoryTypeModel) (r3v12 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // a.zw5
    public final java.lang.Object invokeSuspend(java.lang.Object r56) {
        /*
            Method dump skipped, instruction units count: 3010
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.fj3.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fj3(diu0 diu0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = diu0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fj3(diu0 diu0Var, boolean z, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = diu0Var;
        this.j = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fj3(boolean z, Object obj, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = z;
        this.l = obj;
    }
}

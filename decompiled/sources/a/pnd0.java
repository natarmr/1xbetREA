package a;

import android.content.Context;
import com.huawei.hms.api.ConnectionResult;
import java.io.File;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class pnd0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public byte j;
    public Object k;
    public Object l;
    public /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pnd0(Object obj, Object obj2, Object obj3, Object obj4, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = obj;
        this.l = obj2;
        this.m = obj3;
        this.n = obj4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
    
        if (r0.a(r7, r6) == r1) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object l(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.l
            a.kmq r0 = (a.kmq) r0
            a.wne r1 = a.wne.f39444a
            byte r2 = r6.j
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L23
            if (r2 == r4) goto L1b
            if (r2 != r3) goto L15
            a.z1x.P(r7)
            goto L4a
        L15:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r6)
            return r5
        L1b:
            java.lang.Object r0 = r6.k
            a.kmq r0 = (a.kmq) r0
            a.z1x.P(r7)
            goto L3d
        L23:
            a.z1x.P(r7)
            java.lang.Object r7 = r6.m
            a.byf0 r7 = (a.byf0) r7
            a.n660 r7 = r7.f3414a
            java.lang.Object r2 = r6.n
            java.lang.String r2 = (java.lang.String) r2
            r6.l = r5
            r6.k = r0
            r6.j = r4
            java.lang.Object r7 = r7.i(r2, r6)
            if (r7 != r1) goto L3d
            goto L49
        L3d:
            r6.l = r5
            r6.k = r5
            r6.j = r3
            java.lang.Object r6 = r0.a(r7, r6)
            if (r6 != r1) goto L4a
        L49:
            return r1
        L4a:
            kotlin.Unit r6 = kotlin.Unit.f46060a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a.pnd0.l(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006e, code lost:
    
        if (r0.a(r8, r7) == r1) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object m(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.l
            a.kmq r0 = (a.kmq) r0
            a.wne r1 = a.wne.f39444a
            byte r2 = r7.j
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L2e
            if (r2 == r5) goto L26
            if (r2 == r4) goto L1e
            if (r2 != r3) goto L18
            a.z1x.P(r8)
            goto L71
        L18:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r7)
            return r6
        L1e:
            java.lang.Object r0 = r7.k
            a.kmq r0 = (a.kmq) r0
            a.z1x.P(r8)
            goto L64
        L26:
            java.lang.Object r0 = r7.k
            a.kmq r0 = (a.kmq) r0
            a.z1x.P(r8)
            goto L4c
        L2e:
            a.z1x.P(r8)
            java.lang.Object r8 = r7.m
            a.vkr0 r8 = (a.vkr0) r8
            java.lang.Object r8 = r8.d
            a.p4u r8 = (a.p4u) r8
            r7.l = r6
            r7.k = r0
            r7.j = r5
            java.lang.Object r8 = r8.f26374a
            a.w4p0 r8 = (a.w4p0) r8
            java.lang.Object r8 = r8.b
            a.zep r8 = (a.zep) r8
            a.qoj0 r8 = r8.b
            if (r8 != r1) goto L4c
            goto L70
        L4c:
            a.gmq r8 = (a.gmq) r8
            a.tj3 r2 = new a.tj3
            java.lang.Object r5 = r7.n
            java.lang.String r5 = (java.lang.String) r5
            r2.<init>(r5, r6, r4)
            r7.l = r6
            r7.k = r0
            r7.j = r4
            java.lang.Object r8 = a.ntb.L(r8, r2, r7)
            if (r8 != r1) goto L64
            goto L70
        L64:
            r7.l = r6
            r7.k = r6
            r7.j = r3
            java.lang.Object r7 = r0.a(r8, r7)
            if (r7 != r1) goto L71
        L70:
            return r1
        L71:
            kotlin.Unit r7 = kotlin.Unit.f46060a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a.pnd0.m(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
    
        if (r0.a(r9, r8) == r1) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object o(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.l
            a.kmq r0 = (a.kmq) r0
            a.wne r1 = a.wne.f39444a
            byte r2 = r8.j
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L23
            if (r2 == r4) goto L1b
            if (r2 != r3) goto L15
            a.z1x.P(r9)
            goto L54
        L15:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r8)
            return r5
        L1b:
            java.lang.Object r0 = r8.k
            a.kmq r0 = (a.kmq) r0
            a.z1x.P(r9)
            goto L47
        L23:
            a.z1x.P(r9)
            java.lang.Object r9 = r8.m
            a.fht0 r9 = (a.fht0) r9
            java.lang.Object r9 = r9.b
            a.nb6 r9 = (a.nb6) r9
            a.qoj0 r9 = r9.b
            a.tj3 r2 = new a.tj3
            java.lang.Object r6 = r8.n
            java.lang.String r6 = (java.lang.String) r6
            r7 = 3
            r2.<init>(r6, r5, r7)
            r8.l = r5
            r8.k = r0
            r8.j = r4
            java.lang.Object r9 = a.ntb.L(r9, r2, r8)
            if (r9 != r1) goto L47
            goto L53
        L47:
            r8.l = r5
            r8.k = r5
            r8.j = r3
            java.lang.Object r8 = r0.a(r9, r8)
            if (r8 != r1) goto L54
        L53:
            return r1
        L54:
            kotlin.Unit r8 = kotlin.Unit.f46060a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a.pnd0.o(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r6v17, types: [int[], java.io.Serializable] */
    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.n;
        switch (b) {
            case 0:
                return new pnd0((qnd0) this.m, (h4j0) obj2, yjeVar, (byte) 0);
            case 1:
                return new pnd0((tod0) this.m, (mod0) obj2, yjeVar, (byte) 1);
            case 2:
                return new pnd0((byte) 2, yjeVar, (ace0) this.m, (dde0) this.l, (Function1) obj2);
            case 3:
                return new pnd0((i050) this.m, (Function1) obj2, yjeVar, (byte) 3);
            case 4:
                return new pnd0((byte) 4, yjeVar, (File) this.m, (eze0) this.l, (dxk) obj2);
            case 5:
                return new pnd0((byte) 5, yjeVar, (File) this.m, (x5f0) this.l, (dxk) obj2);
            case 6:
                return new pnd0((byte) 6, yjeVar, (File) this.m, (ocf0) this.l, (dxk) obj2);
            case 7:
                return new pnd0((xgf0) this.k, (Map) this.l, (k6d0) this.m, (st20) obj2, yjeVar, (byte) 7);
            case 8:
                return new pnd0((k050) this.m, (Function2) obj2, yjeVar, (byte) 8);
            case 9:
                return new pnd0((byte) 9, yjeVar, (String) this.m, (iag0) this.l, (ex9) obj2);
            case 10:
                return new pnd0((t33) this.k, (t33) this.l, (Function0) this.m, (mr0) obj2, yjeVar, (byte) 10);
            case 11:
                byte b2 = 11;
                pnd0 pnd0Var = new pnd0(b2, yjeVar, (AtomicReference) this.m, (Function1) this.l, (Function2) obj2);
                pnd0Var.k = obj;
                return pnd0Var;
            case 12:
                pnd0 pnd0Var2 = new pnd0((kmq) this.m, (Function2) obj2, yjeVar, (byte) 12);
                pnd0Var2.l = obj;
                return pnd0Var2;
            case 13:
                pnd0 pnd0Var3 = new pnd0((m1l0) obj2, yjeVar, (byte) 13);
                pnd0Var3.m = obj;
                return pnd0Var3;
            case 14:
                return new pnd0((ncl0) this.m, (g4z) obj2, yjeVar, (byte) 14);
            case 15:
                pnd0 pnd0Var4 = new pnd0((zco0) this.m, (sh60) obj2, yjeVar, (byte) 15);
                pnd0Var4.l = obj;
                return pnd0Var4;
            case 16:
                pnd0 pnd0Var5 = new pnd0((pds0) obj2, yjeVar, (byte) 16);
                pnd0Var5.m = obj;
                return pnd0Var5;
            case 17:
                byte b3 = 17;
                pnd0 pnd0Var6 = new pnd0(b3, yjeVar, (int[]) this.m, (krs0) this.l, (String[]) obj2);
                pnd0Var6.k = obj;
                return pnd0Var6;
            case 18:
                return new pnd0((xot0) this.k, (oot0) this.l, (Map) this.m, (crd) obj2, yjeVar, (byte) 18);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                pnd0 pnd0Var7 = new pnd0((byf0) this.m, (String) obj2, yjeVar, (byte) 19);
                pnd0Var7.l = obj;
                return pnd0Var7;
            case 20:
                pnd0 pnd0Var8 = new pnd0((vkr0) this.m, (String) obj2, yjeVar, (byte) 20);
                pnd0Var8.l = obj;
                return pnd0Var8;
            case 21:
                pnd0 pnd0Var9 = new pnd0((fht0) this.m, (String) obj2, yjeVar, (byte) 21);
                pnd0Var9.l = obj;
                return pnd0Var9;
            default:
                return new pnd0((og00) this.k, (ppv0) this.l, (wov0) this.m, (Context) obj2, yjeVar, (byte) 22);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        switch (this.i) {
            case 0:
                return ((pnd0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((pnd0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((pnd0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((pnd0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((pnd0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((pnd0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((pnd0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((pnd0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((pnd0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((pnd0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((pnd0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((pnd0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((pnd0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((pnd0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                return ((pnd0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                return ((pnd0) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                return ((pnd0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                ((pnd0) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
                return wne.f39444a;
            case 18:
                return ((pnd0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((pnd0) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 20:
                return ((pnd0) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 21:
                return ((pnd0) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((pnd0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:158:0x036e  */
    /* JADX WARN: Code duplicated, block: B:161:0x037b  */
    /* JADX WARN: Code duplicated, block: B:164:0x0391  */
    /* JADX WARN: Code duplicated, block: B:239:0x0512  */
    /* JADX WARN: Code duplicated, block: B:240:0x0534  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v105, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v136 */
    /* JADX WARN: Type inference failed for: r1v137 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r1v58 */
    /* JADX WARN: Type inference failed for: r1v59, types: [kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r2v138 */
    /* JADX WARN: Type inference failed for: r2v139 */
    /* JADX WARN: Type inference failed for: r2v64, types: [byte] */
    /* JADX WARN: Type inference failed for: r2v65, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v75 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:164:0x0391 -> B:155:0x0361). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:93:0x01ea -> B:84:0x01b7). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // a.zw5
    public final java.lang.Object invokeSuspend(java.lang.Object r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2640
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.pnd0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pnd0(Object obj, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.n = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pnd0(Object obj, Object obj2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.m = obj;
        this.n = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pnd0(byte b, yje yjeVar, Serializable serializable, Object obj, Object obj2) {
        super(2, yjeVar);
        this.i = b;
        this.l = obj;
        this.m = serializable;
        this.n = obj2;
    }
}

package a;

import com.huawei.hms.api.ConnectionResult;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class wup0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wup0(yje yjeVar, mot0 mot0Var) {
        super(2, yjeVar);
        this.i = (byte) 9;
        this.j = mot0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                return new wup0((xup0) obj2, yjeVar, (byte) 0);
            case 1:
                return new wup0((lkq0) obj2, yjeVar, (byte) 1);
            case 2:
                return new wup0((g7r0) obj2, yjeVar, (byte) 2);
            case 3:
                return new wup0((yrr0) obj2, yjeVar, (byte) 3);
            case 4:
                return new wup0((psr0) obj2, yjeVar, (byte) 4);
            case 5:
                return new wup0((wfs0) obj2, yjeVar, (byte) 5);
            case 6:
                return new wup0((tts0) obj2, yjeVar, (byte) 6);
            case 7:
                return new wup0((AtomicBoolean) obj2, yjeVar, (byte) 7);
            case 8:
                return new wup0((a6t0) obj2, yjeVar, (byte) 8);
            case 9:
                return new wup0(yjeVar, (mot0) obj2);
            case 10:
                return new wup0((nst0) obj2, yjeVar, (byte) 10);
            case 11:
                return new wup0((tzt0) obj2, yjeVar, (byte) 11);
            case 12:
                return new wup0((meu0) obj2, yjeVar, (byte) 12);
            case 13:
                return new wup0((mlu0) obj2, yjeVar, (byte) 13);
            case 14:
                return new wup0((hng) obj2, yjeVar, (byte) 14);
            case 15:
                return new wup0((dyu0) obj2, yjeVar, (byte) 15);
            case 16:
                return new wup0((w1v0) obj2, yjeVar, (byte) 16);
            case 17:
                return new wup0((c4v0) obj2, yjeVar, (byte) 17);
            case 18:
                return new wup0((c5v0) obj2, yjeVar, (byte) 18);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new wup0((vcv0) obj2, yjeVar, (byte) 19);
            case 20:
                return new wup0((mgv0) obj2, yjeVar, (byte) 20);
            case 21:
                return new wup0((hwv0) obj2, yjeVar, (byte) 21);
            case 22:
                return new wup0((n2w0) obj2, yjeVar, (byte) 22);
            default:
                return new wup0((x7w0) obj2, yjeVar, (byte) 23);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((wup0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((wup0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((wup0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((wup0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((wup0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((wup0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((wup0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((wup0) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((wup0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((wup0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((wup0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((wup0) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((wup0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((wup0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                return ((wup0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                return ((wup0) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                return ((wup0) create((Unit) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                return ((wup0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 18:
                return ((wup0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((wup0) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 20:
                return ((wup0) create((Pair) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 21:
                return ((wup0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 22:
                return ((wup0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return new wup0((x7w0) this.j, (yje) obj2, (byte) 23).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:117:0x0496  */
    /* JADX WARN: Code duplicated, block: B:197:0x06d0  */
    /* JADX WARN: Code duplicated, block: B:198:0x06d1 A[Catch: all -> 0x06c9, TryCatch #0 {all -> 0x06c9, blocks: (B:186:0x06a5, B:187:0x06b3, B:189:0x06b9, B:195:0x06cc, B:198:0x06d1, B:199:0x06d6), top: B:242:0x06a5 }] */
    /* JADX WARN: Code duplicated, block: B:203:0x06e4  */
    /* JADX WARN: Code duplicated, block: B:205:0x06f1  */
    /* JADX WARN: Code duplicated, block: B:206:0x06f9  */
    /* JADX WARN: Code duplicated, block: B:209:0x06fd  */
    /* JADX WARN: Code duplicated, block: B:212:0x070b  */
    /* JADX WARN: Code duplicated, block: B:215:0x0718 A[LOOP:12: B:210:0x0705->B:215:0x0718, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:219:0x0727  */
    /* JADX WARN: Code duplicated, block: B:223:0x0736  */
    /* JADX WARN: Code duplicated, block: B:224:0x073c  */
    /* JADX WARN: Code duplicated, block: B:227:0x0741 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:228:0x0743  */
    /* JADX WARN: Code duplicated, block: B:229:0x0747 A[PHI: r4
  0x0747: PHI (r4v3 int) = (r4v2 int), (r4v5 int) binds: [B:226:0x073f, B:228:0x0743] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:230:0x0749  */
    /* JADX WARN: Code duplicated, block: B:235:0x075f  */
    /* JADX WARN: Code duplicated, block: B:274:0x071b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:275:0x071c A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [a.yje] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v9 java.lang.Object, still in use, count: 2, list:
          (r3v9 java.lang.Object) from 0x06cc: PHI (r3 I:??) = (r3v6 java.lang.Object), (r3v9 java.lang.Object) binds: [B:194:0x06cb, B:191:0x06c8] A[DONT_GENERATE, DONT_INLINE]
          (r3v9 java.lang.Object) from 0x06be: CHECK_CAST (a.siq0) (r3v9 java.lang.Object)
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
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 1998
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.wup0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wup0(Object obj, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = obj;
    }
}

package a;

import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class b2b extends bnn0 implements Function2 {
    public final /* synthetic */ byte i = 0;
    public byte j;
    public boolean k;
    public Serializable l;
    public Object m;
    public Object n;
    public final /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2b(a570 a570Var, h2b h2bVar, String str, boolean z, yje yjeVar) {
        super(2, yjeVar);
        this.n = a570Var;
        this.o = h2bVar;
        this.m = str;
        this.k = z;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.o;
        switch (b) {
            case 0:
                return new b2b((a570) this.n, (h2b) obj2, (String) this.m, this.k, yjeVar);
            case 1:
                return new b2b(this.k, (mii0) this.n, (String) this.l, (c0f) obj2, yjeVar);
            case 2:
                return new b2b((x920) obj2, this.k, (String) this.l, yjeVar);
            case 3:
                return new b2b((ln20) this.n, (ni20) obj2, this.k, yjeVar);
            case 4:
                return new b2b((ln20) this.n, (yh7) obj2, yjeVar);
            case 5:
                return new b2b((gxc0) obj2, (String) this.m, yjeVar);
            default:
                b2b b2bVar = new b2b((tpq0) obj2, this.k, yjeVar);
                b2bVar.n = obj;
                return b2bVar;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
        }
        return ((b2b) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:192:0x06dc  */
    /* JADX WARN: Code duplicated, block: B:193:0x06ed  */
    /* JADX WARN: Code duplicated, block: B:22:0x009f  */
    /* JADX WARN: Code duplicated, block: B:232:0x088b A[PHI: r0 r5 r12 r13 r16
  0x088b: PHI (r0v45 java.lang.Object) = (r0v44 java.lang.Object), (r0v65 java.lang.Object) binds: [B:230:0x0888, B:214:0x07b4] A[DONT_GENERATE, DONT_INLINE]
  0x088b: PHI (r5v8 a.b2b) = (r5v7 a.b2b), (r5v0 a.b2b) binds: [B:230:0x0888, B:214:0x07b4] A[DONT_GENERATE, DONT_INLINE]
  0x088b: PHI (r12v18 a.ql5) = (r12v17 a.ql5), (r12v23 a.ql5) binds: [B:230:0x0888, B:214:0x07b4] A[DONT_GENERATE, DONT_INLINE]
  0x088b: PHI (r13v14 a.wne) = (r13v13 a.wne), (r13v17 a.wne) binds: [B:230:0x0888, B:214:0x07b4] A[DONT_GENERATE, DONT_INLINE]
  0x088b: PHI (r16v2 a.g320) = (r16v1 a.g320), (r16v3 a.g320) binds: [B:230:0x0888, B:214:0x07b4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:235:0x08aa A[PHI: r0 r5 r12 r13
  0x08aa: PHI (r0v52 java.lang.Object) = (r0v51 java.lang.Object), (r0v68 java.lang.Object) binds: [B:233:0x08a7, B:213:0x07a7] A[DONT_GENERATE, DONT_INLINE]
  0x08aa: PHI (r5v9 a.b2b) = (r5v8 a.b2b), (r5v0 a.b2b) binds: [B:233:0x08a7, B:213:0x07a7] A[DONT_GENERATE, DONT_INLINE]
  0x08aa: PHI (r12v20 a.ql5) = (r12v18 a.ql5), (r12v24 a.ql5) binds: [B:233:0x08a7, B:213:0x07a7] A[DONT_GENERATE, DONT_INLINE]
  0x08aa: PHI (r13v16 a.wne) = (r13v14 a.wne), (r13v18 a.wne) binds: [B:233:0x08a7, B:213:0x07a7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:237:0x08ae  */
    /* JADX WARN: Code duplicated, block: B:239:0x08b2  */
    /* JADX WARN: Code duplicated, block: B:23:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:242:0x08ce  */
    /* JADX WARN: Code duplicated, block: B:244:0x08d3  */
    /* JADX WARN: Code duplicated, block: B:27:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:30:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:314:0x0a86  */
    /* JADX WARN: Code duplicated, block: B:318:0x0ab4  */
    /* JADX WARN: Code duplicated, block: B:31:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:322:0x0ac8  */
    /* JADX WARN: Code duplicated, block: B:328:0x0ae5  */
    /* JADX WARN: Code duplicated, block: B:336:0x0ade A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x011b  */
    /* JADX WARN: Code duplicated, block: B:35:0x012e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0149 A[LOOP:0: B:37:0x0143->B:39:0x0149, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:43:0x0181  */
    /* JADX WARN: Code duplicated, block: B:46:0x0190  */
    /* JADX WARN: Code duplicated, block: B:49:0x0196  */
    /* JADX WARN: Code duplicated, block: B:52:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:53:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:56:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:58:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:59:0x0206  */
    /* JADX WARN: Code duplicated, block: B:61:0x0219  */
    /* JADX WARN: Code duplicated, block: B:65:0x023e  */
    /* JADX WARN: Code duplicated, block: B:68:0x025a  */
    /* JADX WARN: Code duplicated, block: B:88:0x030b  */
    /* JADX WARN: Code duplicated, block: B:92:0x0342 A[LOOP:2: B:90:0x033c->B:92:0x0342, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v10 java.lang.Object, still in use, count: 2, list:
          (r11v10 java.lang.Object) from 0x0a73: PHI (r11 I:??) = (r11v2 java.lang.Object), (r11v10 java.lang.Object) binds: [B:306:0x0a72, B:339:0x0a73] A[DONT_GENERATE, DONT_INLINE]
          (r11v10 java.lang.Object) from 0x0a61: CHECK_CAST (a.pbv) (r11v10 java.lang.Object)
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
    public final java.lang.Object invokeSuspend(java.lang.Object r50) {
        /*
            Method dump skipped, instruction units count: 2840
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b2b.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2b(ln20 ln20Var, yh7 yh7Var, yje yjeVar) {
        super(2, yjeVar);
        this.n = ln20Var;
        this.o = yh7Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2b(ln20 ln20Var, ni20 ni20Var, boolean z, yje yjeVar) {
        super(2, yjeVar);
        this.n = ln20Var;
        this.o = ni20Var;
        this.k = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2b(x920 x920Var, boolean z, String str, yje yjeVar) {
        super(2, yjeVar);
        this.o = x920Var;
        this.k = z;
        this.l = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2b(gxc0 gxc0Var, String str, yje yjeVar) {
        super(2, yjeVar);
        this.o = gxc0Var;
        this.m = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2b(tpq0 tpq0Var, boolean z, yje yjeVar) {
        super(2, yjeVar);
        this.o = tpq0Var;
        this.k = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2b(boolean z, mii0 mii0Var, String str, c0f c0fVar, yje yjeVar) {
        super(2, yjeVar);
        this.k = z;
        this.n = mii0Var;
        this.l = str;
        this.o = c0fVar;
    }
}

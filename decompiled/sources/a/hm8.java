package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class hm8 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i = 0;
    public byte j;
    public final /* synthetic */ long k;
    public Object l;
    public Object m;
    public Object n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hm8(t33 t33Var, t33 t33Var2, zsf zsfVar, t33 t33Var3, t33 t33Var4, long j, yje yjeVar) {
        super(2, yjeVar);
        this.m = t33Var;
        this.n = t33Var2;
        this.o = zsfVar;
        this.p = t33Var3;
        this.q = t33Var4;
        this.k = j;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.q;
        Object obj3 = this.p;
        Object obj4 = this.o;
        switch (b) {
            case 0:
                return new hm8((jm8) obj3, (String) obj4, this.k, (csr) obj2, yjeVar);
            default:
                hm8 hm8Var = new hm8((t33) this.m, (t33) this.n, (zsf) obj4, (t33) obj3, (t33) obj2, this.k, yjeVar);
                hm8Var.l = obj;
                return hm8Var;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
        }
        return ((hm8) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0114  */
    /* JADX WARN: Code duplicated, block: B:46:0x0117  */
    /* JADX WARN: Code duplicated, block: B:50:0x0122  */
    /* JADX WARN: Code duplicated, block: B:54:0x0132 A[PHI: r4 r5
  0x0132: PHI (r4v12 a.lz60) = (r4v9 a.lz60), (r4v17 a.lz60) binds: [B:52:0x012e, B:30:0x00d3] A[DONT_GENERATE, DONT_INLINE]
  0x0132: PHI (r5v8 java.lang.Object) = (r5v6 java.lang.Object), (r5v13 java.lang.Object) binds: [B:52:0x012e, B:30:0x00d3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x0140  */
    /* JADX WARN: Code duplicated, block: B:57:0x0149  */
    /* JADX WARN: Code duplicated, block: B:60:0x0168  */
    /* JADX WARN: Code duplicated, block: B:61:0x016d  */
    /* JADX WARN: Code duplicated, block: B:65:0x0192 A[PHI: r3 r5 r6 r11 r15
  0x0192: PHI (r3v2 long) = (r3v1 long), (r3v10 long) binds: [B:63:0x018e, B:29:0x00c0] A[DONT_GENERATE, DONT_INLINE]
  0x0192: PHI (r5v10 a.a570) = (r5v9 a.a570), (r5v15 a.a570) binds: [B:63:0x018e, B:29:0x00c0] A[DONT_GENERATE, DONT_INLINE]
  0x0192: PHI (r6v8 byte) = (r6v5 byte), (r6v10 byte) binds: [B:63:0x018e, B:29:0x00c0] A[DONT_GENERATE, DONT_INLINE]
  0x0192: PHI (r11v4 java.lang.String) = (r11v3 java.lang.String), (r11v6 java.lang.String) binds: [B:63:0x018e, B:29:0x00c0] A[DONT_GENERATE, DONT_INLINE]
  0x0192: PHI (r15v3 a.jm8) = (r15v2 a.jm8), (r15v0 a.jm8) binds: [B:63:0x018e, B:29:0x00c0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x0194  */
    /* JADX WARN: Code duplicated, block: B:68:0x0198  */
    /* JADX WARN: Code duplicated, block: B:70:0x019e  */
    /* JADX WARN: Code duplicated, block: B:72:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:74:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:78:0x01d8 A[LOOP:1: B:76:0x01cf->B:78:0x01d8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:79:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:81:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:84:0x01f8 A[PHI: r1 r3 r11 r15
  0x01f8: PHI (r1v7 java.lang.Object) = (r1v5 java.lang.Object), (r1v17 java.lang.Object) binds: [B:82:0x01f5, B:28:0x00b3] A[DONT_GENERATE, DONT_INLINE]
  0x01f8: PHI (r3v7 long) = (r3v2 long), (r3v11 long) binds: [B:82:0x01f5, B:28:0x00b3] A[DONT_GENERATE, DONT_INLINE]
  0x01f8: PHI (r11v5 java.lang.String) = (r11v4 java.lang.String), (r11v7 java.lang.String) binds: [B:82:0x01f5, B:28:0x00b3] A[DONT_GENERATE, DONT_INLINE]
  0x01f8: PHI (r15v4 a.jm8) = (r15v3 a.jm8), (r15v0 a.jm8) binds: [B:82:0x01f5, B:28:0x00b3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:86:0x0200  */
    /* JADX WARN: Code duplicated, block: B:87:0x0208  */
    /* JADX WARN: Code duplicated, block: B:90:0x021c  */
    /* JADX WARN: Code duplicated, block: B:94:0x0248 A[LOOP:0: B:92:0x023f->B:94:0x0248, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:98:0x0252 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x0252 A[SYNTHETIC] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v7 java.lang.Object, still in use, count: 2, list:
          (r5v7 java.lang.Object) from 0x0110: PHI (r5 I:??) = (r5v2 java.lang.Object), (r5v7 java.lang.Object) binds: [B:42:0x010f, B:101:0x0110] A[DONT_GENERATE, DONT_INLINE]
          (r5v7 java.lang.Object) from 0x0103: CHECK_CAST (a.pbv) (r5v7 java.lang.Object)
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
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 610
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.hm8.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hm8(jm8 jm8Var, String str, long j, csr csrVar, yje yjeVar) {
        super(2, yjeVar);
        this.p = jm8Var;
        this.o = str;
        this.k = j;
        this.q = csrVar;
    }
}

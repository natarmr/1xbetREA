package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class gv10 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ hv10 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gv10(hv10 hv10Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = hv10Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        hv10 hv10Var = this.k;
        switch (b) {
            case 0:
                gv10 gv10Var = new gv10(hv10Var, yjeVar, (byte) 0);
                gv10Var.j = obj;
                return gv10Var;
            case 1:
                gv10 gv10Var2 = new gv10(hv10Var, yjeVar, (byte) 1);
                gv10Var2.j = obj;
                return gv10Var2;
            default:
                gv10 gv10Var3 = new gv10(hv10Var, yjeVar, (byte) 2);
                gv10Var3.j = obj;
                return gv10Var3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((gv10) create((e9h0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((gv10) create((wpe) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((gv10) create((evp0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0225  */
    /* JADX WARN: Code duplicated, block: B:105:0x0238  */
    /* JADX WARN: Code duplicated, block: B:109:0x0255 A[LOOP:5: B:107:0x024c->B:109:0x0255, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:146:0x033b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:147:0x033d  */
    /* JADX WARN: Code duplicated, block: B:149:0x0341  */
    /* JADX WARN: Code duplicated, block: B:150:0x0345  */
    /* JADX WARN: Code duplicated, block: B:159:0x035b  */
    /* JADX WARN: Code duplicated, block: B:162:0x0360  */
    /* JADX WARN: Code duplicated, block: B:163:0x0377  */
    /* JADX WARN: Code duplicated, block: B:172:0x01c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:173:0x017e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:176:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:0x01a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:182:0x037d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x0138  */
    /* JADX WARN: Code duplicated, block: B:50:0x013c  */
    /* JADX WARN: Code duplicated, block: B:51:0x013f  */
    /* JADX WARN: Code duplicated, block: B:53:0x0142  */
    /* JADX WARN: Code duplicated, block: B:54:0x0147  */
    /* JADX WARN: Code duplicated, block: B:58:0x0154  */
    /* JADX WARN: Code duplicated, block: B:60:0x015c  */
    /* JADX WARN: Code duplicated, block: B:63:0x0176  */
    /* JADX WARN: Code duplicated, block: B:69:0x0191  */
    /* JADX WARN: Code duplicated, block: B:71:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:76:0x01b7 A[LOOP:4: B:74:0x01b1->B:76:0x01b7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:87:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:90:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:94:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:97:0x01fc  */
    /* JADX WARN: Multi-variable type inference failed */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v9 java.lang.Object, still in use, count: 2, list:
          (r6v9 java.lang.Object) from 0x0134: PHI (r6 I:??) = (r6v2 java.lang.Object), (r6v9 java.lang.Object) binds: [B:45:0x0133, B:169:0x0134] A[DONT_GENERATE, DONT_INLINE]
          (r6v9 java.lang.Object) from 0x012a: CHECK_CAST (androidx.fragment.app.Fragment) (r6v9 java.lang.Object)
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
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 908
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.gv10.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

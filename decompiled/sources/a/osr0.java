package a;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class osr0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ psr0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ osr0(psr0 psr0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = psr0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        psr0 psr0Var = this.k;
        switch (b) {
            case 0:
                osr0 osr0Var = new osr0(psr0Var, yjeVar, (byte) 0);
                osr0Var.j = obj;
                return osr0Var;
            default:
                osr0 osr0Var2 = new osr0(psr0Var, yjeVar, (byte) 1);
                osr0Var2.j = obj;
                return osr0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((osr0) create((krr0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((osr0) create((Map) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v0 a.jpr0, still in use, count: 2, list:
          (r4v0 a.jpr0) from 0x00bc: MOVE (r16v0 a.jpr0) = (r4v0 a.jpr0) (LINE:189)
          (r4v0 a.jpr0) from 0x009e: MOVE (r16v3 a.jpr0) = (r4v0 a.jpr0) (LINE:159)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:59)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    @Override // a.zw5
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.osr0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

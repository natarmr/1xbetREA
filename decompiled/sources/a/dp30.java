package a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class dp30 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f6442a;
    public final /* synthetic */ fp30 b;
    public final /* synthetic */ ctf0 c;

    public /* synthetic */ dp30(fp30 fp30Var, ctf0 ctf0Var) {
        this.f6442a = (byte) 1;
        this.b = fp30Var;
        this.c = ctf0Var;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v0 a.awj0, still in use, count: 2, list:
          (r7v0 a.awj0) from 0x01ea: MOVE (r32v0 a.awj0) = (r7v0 a.awj0) (LINE:491)
          (r7v0 a.awj0) from 0x01e4: MOVE (r32v2 a.awj0) = (r7v0 a.awj0) (LINE:485)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:59)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(java.lang.Object r34) {
        /*
            Method dump skipped, instruction units count: 974
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.dp30.invoke(java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ dp30(ctf0 ctf0Var, fp30 fp30Var, byte b) {
        this.f6442a = b;
        this.c = ctf0Var;
        this.b = fp30Var;
    }
}

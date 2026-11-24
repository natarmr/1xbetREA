package a;

/* JADX INFO: loaded from: classes4.dex */
public final class l7h implements v6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f19558a = 1;
    public final ctf0 b;
    public final boolean c;
    public final Object d;

    public l7h(ctf0 ctf0Var, String str, boolean z) {
        str.getClass();
        ctf0Var.getClass();
        this.d = str;
        this.b = ctf0Var;
        this.c = z;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r10v11 a.vbh, still in use, count: 2, list:
          (r10v11 a.vbh) from 0x003b: MOVE (r31v5 a.vbh) = (r10v11 a.vbh) (LINE:60)
          (r10v11 a.vbh) from 0x0058: PHI (r10v13 a.vbh) = (r10v11 a.vbh), (r10v17 a.vbh) binds: [B:12:0x0041, B:55:0x0113] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:59)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    @Override // a.v6t0
    public final java.lang.Object invoke(java.lang.Object r58) {
        /*
            Method dump skipped, instruction units count: 1804
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.l7h.invoke(java.lang.Object):java.lang.Object");
    }

    public l7h(ctf0 ctf0Var, y78 y78Var, boolean z) {
        ctf0Var.getClass();
        this.b = ctf0Var;
        this.d = y78Var;
        this.c = z;
    }
}

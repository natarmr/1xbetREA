package a;

/* JADX INFO: loaded from: classes4.dex */
public final class hdn implements v6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f12877a = 0;
    public final ctf0 b;
    public final boolean c;
    public final n0o0 d;
    public final n0o0 e;
    public final n0o0 f;
    public final n0o0 g;
    public final Object h;

    public hdn(tzh0 tzh0Var, ctf0 ctf0Var, boolean z) {
        ctf0Var.getClass();
        this.b = ctf0Var;
        this.c = z;
        this.d = bkb.H(Long.valueOf(tzh0Var.d));
        this.e = bkb.H(Long.valueOf(tzh0Var.e));
        this.f = bkb.H(tzh0Var.c);
        ldm ldmVar = ldm.f19857a;
        xuz xuzVar = pb10.c;
        pb10 pb10VarK = ozb.K(46L);
        xuzVar.getClass();
        this.h = androidx.compose.runtime.e.e(new nzh0(new v2h(pb10VarK.f26683a)));
        this.g = maz.b(new yw9(tzh0Var, new gwg0((Object) this, (byte) 21), (byte) 20));
    }

    /* JADX WARN: Code duplicated, block: B:55:0x0119  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v9 java.lang.Object, still in use, count: 2, list:
          (r11v9 java.lang.Object) from 0x006c: PHI (r11 I:??) = (r11v6 java.lang.Object), (r11v9 java.lang.Object) binds: [B:14:0x006b, B:85:0x006c] A[DONT_GENERATE, DONT_INLINE]
          (r11v9 java.lang.Object) from 0x0062: CHECK_CAST (a.vcw) (r11v9 java.lang.Object)
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
    @Override // a.v6t0
    public final java.lang.Object invoke(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.hdn.invoke(java.lang.Object):java.lang.Object");
    }

    public hdn(cdn cdnVar, boolean z, udl0 udl0Var, boolean z2, ctf0 ctf0Var) {
        ctf0Var.getClass();
        this.h = udl0Var;
        this.c = z2;
        this.b = ctf0Var;
        n0o0 n0o0VarH = bkb.H(cdnVar.b);
        this.d = n0o0VarH;
        this.e = bkb.H(cdnVar.f4169a);
        this.f = bkb.H(cdnVar.g);
        this.g = maz.b(new yw9((fee) n0o0VarH.getValue(), new x9(z, (Object) this, (byte) 21), (byte) 20));
    }
}

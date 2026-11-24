package a;

/* JADX INFO: loaded from: classes6.dex */
public final class oxv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final duv0 f26032a;
    public final h0q0 b;
    public final fht0 c;
    public final glt0 d;
    public final ruv0 e;
    public final mkt0 f;
    public final vkr0 g;
    public float h;
    public float i;
    public final hcp0 j = new hcp0(new jmv0(this, 11));

    public oxv0(duv0 duv0Var, h0q0 h0q0Var, fht0 fht0Var, glt0 glt0Var, ruv0 ruv0Var, mkt0 mkt0Var, vkr0 vkr0Var) {
        this.f26032a = duv0Var;
        this.b = h0q0Var;
        this.c = fht0Var;
        this.d = glt0Var;
        this.e = ruv0Var;
        this.f = mkt0Var;
        this.g = vkr0Var;
    }

    public final void a(float f) {
        b();
        ((q99) this.j.c).f(new pxv0(f));
    }

    public final void b() {
        pz40 pz40Var = (pz40) this.f.f21959a;
        if (((Boolean) ((hgk0) pz40Var).getValue()).booleanValue()) {
            return;
        }
        ((hgk0) pz40Var).setValue(Boolean.TRUE);
        this.i = ((Number) ((t33) this.d.c).d()).floatValue();
        ruv0 ruv0Var = this.e;
        yuv0 yuv0VarF = ruv0Var.f();
        if (yuv0VarF != null) {
            ((hgk0) ruv0Var.g).setValue(yuv0.a(yuv0VarF, null, 0.0f, ruv0Var.n, 3));
        }
        ruv0Var.m = false;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x018f, code lost:
    
        if (r3.b(r0, r5) == r6) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0214, code lost:
    
        if (r3.b(r0, r5) == r6) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0235, code lost:
    
        if (r3.b(r0, r5) == r6) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0164, code lost:
    
        if (r3.a(r0, a.vwv0.f38173a, r5) == r6) goto L142;
     */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(float r21, a.zje r22) {
        /*
            Method dump skipped, instruction units count: 574
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.oxv0.c(float, a.zje):java.lang.Object");
    }
}

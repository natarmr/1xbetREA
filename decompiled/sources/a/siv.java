package a;

/* JADX INFO: loaded from: classes.dex */
public final class siv implements vuo, vme0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f7m0 f32280a;
    public boolean b;
    public qiv c;
    public int d = -1;
    public int e = -1;
    public float f = 0.0f;
    public String g;

    public siv(f7m0 f7m0Var) {
        this.f32280a = f7m0Var;
    }

    @Override // a.vme0
    public final k4e a() {
        qiv qivVar = this.c;
        if (qivVar != null) {
            return qivVar;
        }
        qiv qivVar2 = new qiv();
        this.c = qivVar2;
        return qivVar2;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // a.vuo
    public final void apply() {
        this.c.X(this.b ? 1 : 0);
        int i = this.d;
        if (i != -1) {
            qiv qivVar = this.c;
            if (i <= -1) {
                qivVar.getClass();
                return;
            }
            qivVar.u0 = -1.0f;
            qivVar.v0 = i;
            qivVar.w0 = -1;
            return;
        }
        int i2 = this.e;
        qiv qivVar2 = this.c;
        if (i2 != -1) {
            if (i2 <= -1) {
                qivVar2.getClass();
                return;
            }
            qivVar2.u0 = -1.0f;
            qivVar2.v0 = -1;
            qivVar2.w0 = i2;
            return;
        }
        float f = this.f;
        if (f <= -1.0f) {
            qivVar2.getClass();
            return;
        }
        qivVar2.u0 = f;
        qivVar2.v0 = -1;
        qivVar2.w0 = -1;
    }

    @Override // a.vme0
    public final void b(k4e k4eVar) {
        if (k4eVar instanceof qiv) {
            this.c = (qiv) k4eVar;
        } else {
            this.c = null;
        }
    }

    @Override // a.vme0
    public final vuo c() {
        return null;
    }

    @Override // a.vme0
    public final Object getKey() {
        return this.g;
    }
}

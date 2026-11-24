package a;

/* JADX INFO: loaded from: classes6.dex */
public final class y2l0 implements g3l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kpe f41910a;
    public final spe b;
    public final zb c;
    public final boolean d;
    public final boolean e;

    public y2l0(kpe kpeVar, spe speVar, zb zbVar, boolean z, boolean z2) {
        this.f41910a = kpeVar;
        this.b = speVar;
        this.c = zbVar;
        this.d = z;
        this.e = z2;
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
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y2l0)) {
            return false;
        }
        y2l0 y2l0Var = (y2l0) obj;
        if (!this.f41910a.equals(y2l0Var.f41910a) || !this.b.equals(y2l0Var.b)) {
            return false;
        }
        tc00 tc00Var = tc00.f33696a;
        return tc00Var.equals(tc00Var) && this.c.equals(y2l0Var.c) && this.d == y2l0Var.d && this.e == y2l0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + brm0.e(brm0.e((this.c.hashCode() + ((((this.b.hashCode() + (this.f41910a.hashCode() * 31)) * 31) + 209164535) * 31)) * 31, 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CounterWithAccordionWithListCheckbox(counterStyle=");
        sb.append(this.f41910a);
        sb.append(", counterValue=");
        sb.append(this.b);
        sb.append(", listCheckboxStyle=");
        sb.append(tc00.f33696a);
        sb.append(", accordionStyle=");
        sb.append(this.c);
        sb.append(", expanded=");
        return ohs0.p(", active=", ", enabled=true)", sb, this.d, this.e);
    }
}

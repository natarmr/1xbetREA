package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class c3l0 implements g3l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f3682a;
    public final boolean b;
    public final boolean c;

    public c3l0(long j, boolean z, boolean z2) {
        this.f3682a = j;
        this.b = z;
        this.c = z2;
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
        if (!(obj instanceof c3l0)) {
            return false;
        }
        c3l0 c3l0Var = (c3l0) obj;
        long j = c3l0Var.f3682a;
        int i = y3d.h;
        if (!h2t0.a(this.f3682a, j)) {
            return false;
        }
        tc00 tc00Var = tc00.f33696a;
        return tc00Var.equals(tc00Var) && this.b == c3l0Var.b && this.c == c3l0Var.c;
    }

    public final int hashCode() {
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Boolean.hashCode(this.c) + brm0.e(((Long.hashCode(this.f3682a) * 31) + 209164535) * 31, 31, this.b);
    }

    public final String toString() {
        String strI = y3d.i(this.f3682a);
        StringBuilder sb = new StringBuilder("DragAndDropWithListCheckbox(dragAndDropIconColor=");
        sb.append(strI);
        sb.append(", listCheckboxStyle=");
        sb.append(tc00.f33696a);
        sb.append(", active=");
        return ohs0.p(", enabled=", Separators.RPAREN, sb, this.b, this.c);
    }
}

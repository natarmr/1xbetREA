package a;

/* JADX INFO: loaded from: classes4.dex */
public final class x0p extends z0p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40081a;
    public final long b;

    public x0p(String str, long j) {
        this.f40081a = str;
        this.b = j;
    }

    @Override // a.z0p
    public final long a() {
        return this.b;
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
        if (!(obj instanceof x0p)) {
            return false;
        }
        x0p x0pVar = (x0p) obj;
        if (!this.f40081a.equals(x0pVar.f40081a) || !ycl.b(40.0f, 40.0f)) {
            return false;
        }
        long j = x0pVar.b;
        int i = y3d.h;
        if (!h2t0.a(this.b, j)) {
            return false;
        }
        zx7 zx7Var = gqw0.e;
        return zx7Var.equals(zx7Var);
    }

    public final int hashCode() {
        int iA = defpackage.c.a(this.f40081a.hashCode() * 31, 40.0f, 31);
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Boolean.hashCode(true) + ((Float.hashCode(0.0f) + (Float.hashCode(0.0f) * 31) + rw2.b(iA, 31, this.b)) * 31);
    }

    public final String toString() {
        String strC = ycl.c(40.0f);
        String strI = y3d.i(this.b);
        zx7 zx7Var = gqw0.e;
        StringBuilder sbN = b1j.n("ImageCell(image=", this.f40081a, ", width=", strC, ", backgroundColor=");
        sbN.append(strI);
        sbN.append(", contentAlignment=");
        sbN.append(zx7Var);
        sbN.append(", needBorders=true)");
        return sbN.toString();
    }
}

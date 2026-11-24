package a;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"La/qum0;", "La/um40;", "La/rum0;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class qum0 extends um40 {
    public final cdl b;

    public qum0(cdl cdlVar) {
        this.b = cdlVar;
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
        if (!(obj instanceof qum0)) {
            return false;
        }
        qum0 qum0Var = (qum0) obj;
        d13 d13Var = ntr.n;
        return d13Var.equals(d13Var) && Intrinsics.d(this.b, qum0Var.b);
    }

    @Override // a.um40
    public final lm40 f() {
        return new rum0(ntr.n, this.b);
    }

    @Override // a.um40
    public final void h(lm40 lm40Var) {
        rum0 rum0Var = (rum0) lm40Var;
        d13 d13Var = ntr.n;
        if (!Intrinsics.d(rum0Var.p, d13Var)) {
            rum0Var.p = d13Var;
            if (rum0Var.q) {
                rum0Var.b1();
            }
        }
        rum0Var.o = this.b;
    }

    public final int hashCode() {
        int iE = brm0.e(1022 * 31, 31, false);
        cdl cdlVar = this.b;
        return iE + (cdlVar != null ? cdlVar.hashCode() : 0);
    }

    public final String toString() {
        return "StylusHoverIconModifierElement(icon=" + ntr.n + ", overrideDescendants=false, touchBoundsExpansion=" + this.b + Separators.RPAREN;
    }
}

package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class se {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32055a;
    public final oe b;
    public final le c;

    public se(String str, oe oeVar, le leVar) {
        str.getClass();
        oeVar.getClass();
        this.f32055a = str;
        this.b = oeVar;
        this.c = leVar;
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
        if (!(obj instanceof se)) {
            return false;
        }
        se seVar = (se) obj;
        if (!Intrinsics.d(this.f32055a, seVar.f32055a) || !Intrinsics.d(this.b, seVar.b)) {
            return false;
        }
        pe peVar = pe.f26827a;
        return peVar.equals(peVar) && Intrinsics.d(this.c, seVar.c);
    }

    public final int hashCode() {
        int iHashCode = (((this.b.hashCode() + (this.f32055a.hashCode() * 31)) * 31) + 2028405939) * 31;
        le leVar = this.c;
        return iHashCode + (leVar == null ? 0 : leVar.hashCode());
    }

    public final String toString() {
        return "AccountInfoUiModel(label=" + this.f32055a + ", state=" + this.b + ", style=" + pe.f26827a + ", button=" + this.c + Separators.RPAREN;
    }
}

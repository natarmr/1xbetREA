package a;

import android.gov.nist.core.Separators;
import org.xplatform.top.impl.presentation.ui.model.TopSectionKey;
import org.xplatform.top.impl.presentation.ui.model.TopSectionKey$Sport$Champs$Live;

/* JADX INFO: loaded from: classes6.dex */
public final class ier0 implements ker0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f14648a;
    public final int b;

    public ier0(int i, a4x a4xVar) {
        this.f14648a = a4xVar;
        this.b = i;
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
        if (!(obj instanceof ier0)) {
            return false;
        }
        ier0 ier0Var = (ier0) obj;
        TopSectionKey$Sport$Champs$Live topSectionKey$Sport$Champs$Live = TopSectionKey$Sport$Champs$Live.f47154a;
        return topSectionKey$Sport$Champs$Live.equals(topSectionKey$Sport$Champs$Live) && this.f14648a.equals(ier0Var.f14648a) && this.b == ier0Var.b;
    }

    @Override // a.qdr0
    public final TopSectionKey getKey() {
        return TopSectionKey$Sport$Champs$Live.f47154a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + cs0.b(this.f14648a, -465834138, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Content(key=");
        sb.append(TopSectionKey$Sport$Champs$Live.f47154a);
        sb.append(", items=");
        sb.append(this.f14648a);
        sb.append(", rowCount=");
        return rz4.j(this.b, Separators.RPAREN, sb);
    }
}

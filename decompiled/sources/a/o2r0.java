package a;

import android.gov.nist.core.Separators;
import org.xplatform.top.impl.presentation.ui.model.TopSectionKey;
import org.xplatform.top.impl.presentation.ui.model.TopSectionKey$Cyber$Disciplines;

/* JADX INFO: loaded from: classes6.dex */
public final class o2r0 implements qdr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bvl f24546a;

    public o2r0(bvl bvlVar) {
        this.f24546a = bvlVar;
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
        if (!(obj instanceof o2r0)) {
            return false;
        }
        o2r0 o2r0Var = (o2r0) obj;
        TopSectionKey$Cyber$Disciplines topSectionKey$Cyber$Disciplines = TopSectionKey$Cyber$Disciplines.f47130a;
        return topSectionKey$Cyber$Disciplines.equals(topSectionKey$Cyber$Disciplines) && this.f24546a.equals(o2r0Var.f24546a);
    }

    @Override // a.qdr0
    public final TopSectionKey getKey() {
        return TopSectionKey$Cyber$Disciplines.f47130a;
    }

    public final int hashCode() {
        return this.f24546a.hashCode() - 1653698332;
    }

    public final String toString() {
        return "TopCyberDisciplinesUiModel(key=" + TopSectionKey$Cyber$Disciplines.f47130a + ", model=" + this.f24546a + Separators.RPAREN;
    }
}

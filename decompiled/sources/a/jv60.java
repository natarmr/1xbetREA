package a;

import android.gov.nist.core.Separators;
import org.xplatform.top.impl.presentation.ui.model.TopSectionKey;
import org.xplatform.top.impl.presentation.ui.model.TopSectionKey$OneXGames$Categories;

/* JADX INFO: loaded from: classes6.dex */
public final class jv60 implements qdr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bvl f17194a;

    public jv60(bvl bvlVar) {
        this.f17194a = bvlVar;
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
        if (!(obj instanceof jv60)) {
            return false;
        }
        jv60 jv60Var = (jv60) obj;
        TopSectionKey$OneXGames$Categories topSectionKey$OneXGames$Categories = TopSectionKey$OneXGames$Categories.f47151a;
        return topSectionKey$OneXGames$Categories.equals(topSectionKey$OneXGames$Categories) && this.f17194a.equals(jv60Var.f17194a);
    }

    @Override // a.qdr0
    public final TopSectionKey getKey() {
        return TopSectionKey$OneXGames$Categories.f47151a;
    }

    public final int hashCode() {
        return this.f17194a.hashCode() + 1982870483;
    }

    public final String toString() {
        return "OneXGamesCategoriesUiModel(key=" + TopSectionKey$OneXGames$Categories.f47151a + ", model=" + this.f17194a + Separators.RPAREN;
    }
}

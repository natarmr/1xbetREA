package a;

import android.gov.nist.core.Separators;
import org.xplatform.top.impl.presentation.ui.model.TopSectionKey;
import org.xplatform.top.impl.presentation.ui.model.TopSectionKey$Aggregator$Categories;

/* JADX INFO: loaded from: classes6.dex */
public final class yxq0 implements qdr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bvl f43437a;

    public yxq0(bvl bvlVar) {
        this.f43437a = bvlVar;
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
        if (!(obj instanceof yxq0)) {
            return false;
        }
        yxq0 yxq0Var = (yxq0) obj;
        TopSectionKey$Aggregator$Categories topSectionKey$Aggregator$Categories = TopSectionKey$Aggregator$Categories.f47122a;
        return topSectionKey$Aggregator$Categories.equals(topSectionKey$Aggregator$Categories) && this.f43437a.equals(yxq0Var.f43437a);
    }

    @Override // a.qdr0
    public final TopSectionKey getKey() {
        return TopSectionKey$Aggregator$Categories.f47122a;
    }

    public final int hashCode() {
        return this.f43437a.hashCode() - 1091212911;
    }

    public final String toString() {
        return "TopAggregatorCategoriesUiModel(key=" + TopSectionKey$Aggregator$Categories.f47122a + ", model=" + this.f43437a + Separators.RPAREN;
    }
}

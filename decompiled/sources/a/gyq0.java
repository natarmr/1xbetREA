package a;

import android.gov.nist.core.Separators;
import org.xplatform.top.impl.presentation.ui.model.TopSectionKey;
import org.xplatform.top.impl.presentation.ui.model.TopSectionKey$Aggregator$Recommended;

/* JADX INFO: loaded from: classes6.dex */
public final class gyq0 implements qdr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bml f12143a;

    public gyq0(bml bmlVar) {
        this.f12143a = bmlVar;
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
        if (!(obj instanceof gyq0)) {
            return false;
        }
        gyq0 gyq0Var = (gyq0) obj;
        TopSectionKey$Aggregator$Recommended topSectionKey$Aggregator$Recommended = TopSectionKey$Aggregator$Recommended.f47125a;
        return topSectionKey$Aggregator$Recommended.equals(topSectionKey$Aggregator$Recommended) && this.f12143a.equals(gyq0Var.f12143a);
    }

    @Override // a.qdr0
    public final TopSectionKey getKey() {
        return TopSectionKey$Aggregator$Recommended.f47125a;
    }

    public final int hashCode() {
        return this.f12143a.hashCode() + 1745913464;
    }

    public final String toString() {
        return "TopAggregatorRecommendedGamesUiModel(key=" + TopSectionKey$Aggregator$Recommended.f47125a + ", model=" + this.f12143a + Separators.RPAREN;
    }
}

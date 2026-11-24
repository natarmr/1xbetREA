package a;

import android.gov.nist.core.Separators;
import org.xplatform.top.impl.presentation.ui.model.TopSectionKey;
import org.xplatform.top.impl.presentation.ui.model.TopSectionKey$Aggregator$Tournaments;

/* JADX INFO: loaded from: classes6.dex */
public final class jyq0 implements qdr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gql f17373a;

    public jyq0(gql gqlVar) {
        this.f17373a = gqlVar;
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
        if (!(obj instanceof jyq0)) {
            return false;
        }
        jyq0 jyq0Var = (jyq0) obj;
        TopSectionKey$Aggregator$Tournaments topSectionKey$Aggregator$Tournaments = TopSectionKey$Aggregator$Tournaments.f47126a;
        return topSectionKey$Aggregator$Tournaments.equals(topSectionKey$Aggregator$Tournaments) && this.f17373a.equals(jyq0Var.f17373a);
    }

    @Override // a.qdr0
    public final TopSectionKey getKey() {
        return TopSectionKey$Aggregator$Tournaments.f47126a;
    }

    public final int hashCode() {
        return this.f17373a.hashCode() + 748497673;
    }

    public final String toString() {
        return "TopAggregatorTournamentsUiModel(key=" + TopSectionKey$Aggregator$Tournaments.f47126a + ", model=" + this.f17373a + Separators.RPAREN;
    }
}

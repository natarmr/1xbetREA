package a;

import android.gov.nist.core.Separators;
import org.xplatform.top.impl.presentation.ui.model.TopSectionKey;
import org.xplatform.top.impl.presentation.ui.model.TopSectionKey$OneXGames$Spotlight;

/* JADX INFO: loaded from: classes6.dex */
public final class u370 implements v370 {
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
        if (!(obj instanceof u370)) {
            return false;
        }
        TopSectionKey$OneXGames$Spotlight topSectionKey$OneXGames$Spotlight = TopSectionKey$OneXGames$Spotlight.f47152a;
        return topSectionKey$OneXGames$Spotlight.equals(topSectionKey$OneXGames$Spotlight);
    }

    @Override // a.qdr0
    public final TopSectionKey getKey() {
        return TopSectionKey$OneXGames$Spotlight.f47152a;
    }

    public final int hashCode() {
        return 461509507;
    }

    public final String toString() {
        return "Shimmer(key=" + TopSectionKey$OneXGames$Spotlight.f47152a + Separators.RPAREN;
    }
}

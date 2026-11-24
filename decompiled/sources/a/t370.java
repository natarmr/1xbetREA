package a;

import android.gov.nist.core.Separators;
import org.xplatform.top.impl.presentation.ui.model.TopSectionKey;
import org.xplatform.top.impl.presentation.ui.model.TopSectionKey$OneXGames$Spotlight;

/* JADX INFO: loaded from: classes6.dex */
public final class t370 implements v370 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r370 f33252a;

    public t370(r370 r370Var) {
        this.f33252a = r370Var;
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
        if (!(obj instanceof t370)) {
            return false;
        }
        t370 t370Var = (t370) obj;
        TopSectionKey$OneXGames$Spotlight topSectionKey$OneXGames$Spotlight = TopSectionKey$OneXGames$Spotlight.f47152a;
        return topSectionKey$OneXGames$Spotlight.equals(topSectionKey$OneXGames$Spotlight) && this.f33252a.equals(t370Var.f33252a);
    }

    @Override // a.qdr0
    public final TopSectionKey getKey() {
        return TopSectionKey$OneXGames$Spotlight.f47152a;
    }

    public final int hashCode() {
        return this.f33252a.hashCode() + 1421892829;
    }

    public final String toString() {
        return "Single(key=" + TopSectionKey$OneXGames$Spotlight.f47152a + ", model=" + this.f33252a + Separators.RPAREN;
    }
}

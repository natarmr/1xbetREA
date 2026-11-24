package a;

import android.gov.nist.core.Separators;
import org.xplatform.top.impl.presentation.ui.model.TopSectionKey;
import org.xplatform.top.impl.presentation.ui.model.TopSectionKey$OneXGames$Tape;

/* JADX INFO: loaded from: classes6.dex */
public final class v8r0 implements qdr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f3v0 f37002a;
    public final bbn b;

    public v8r0(f3v0 f3v0Var, bbn bbnVar) {
        this.f37002a = f3v0Var;
        this.b = bbnVar;
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
        if (!(obj instanceof v8r0)) {
            return false;
        }
        v8r0 v8r0Var = (v8r0) obj;
        TopSectionKey$OneXGames$Tape topSectionKey$OneXGames$Tape = TopSectionKey$OneXGames$Tape.f47153a;
        return topSectionKey$OneXGames$Tape.equals(topSectionKey$OneXGames$Tape) && this.f37002a.equals(v8r0Var.f37002a) && this.b.equals(v8r0Var.b);
    }

    @Override // a.qdr0
    public final TopSectionKey getKey() {
        return TopSectionKey$OneXGames$Tape.f47153a;
    }

    public final int hashCode() {
        return this.b.hashCode() + ((this.f37002a.hashCode() - 2042075955) * 31);
    }

    public final String toString() {
        return "TopOneXGamesTapeUiModel(key=" + TopSectionKey$OneXGames$Tape.f47153a + ", style=" + this.f37002a + ", webGamesGameCollectionSectionUiModel=" + this.b + Separators.RPAREN;
    }
}

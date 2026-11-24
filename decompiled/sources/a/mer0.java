package a;

import android.gov.nist.core.Separators;
import org.xplatform.top.impl.presentation.ui.model.TopSectionKey;
import org.xplatform.top.impl.presentation.ui.model.TopSectionKey$Sport$FilterTape;

/* JADX INFO: loaded from: classes6.dex */
public final class mer0 implements qdr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tsm f21661a;

    public mer0(tsm tsmVar) {
        this.f21661a = tsmVar;
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
        if (!(obj instanceof mer0)) {
            return false;
        }
        mer0 mer0Var = (mer0) obj;
        TopSectionKey$Sport$FilterTape topSectionKey$Sport$FilterTape = TopSectionKey$Sport$FilterTape.f47155a;
        return topSectionKey$Sport$FilterTape.equals(topSectionKey$Sport$FilterTape) && this.f21661a.equals(mer0Var.f21661a);
    }

    @Override // a.qdr0
    public final TopSectionKey getKey() {
        return TopSectionKey$Sport$FilterTape.f47155a;
    }

    public final int hashCode() {
        return this.f21661a.hashCode() + 235786426;
    }

    public final String toString() {
        return "TopSportFilterTapeUiModel(key=" + TopSectionKey$Sport$FilterTape.f47155a + ", model=" + this.f21661a + Separators.RPAREN;
    }
}

package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.top.impl.presentation.ui.model.TopSectionKey;
import org.xplatform.top.impl.presentation.ui.model.TopSectionKey$Sport$Games$Line;

/* JADX INFO: loaded from: classes6.dex */
public final class ner0 implements qdr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f23401a;
    public final boolean b;
    public final boolean c;

    public ner0(a4x a4xVar, boolean z, boolean z2) {
        a4xVar.getClass();
        this.f23401a = a4xVar;
        this.b = z;
        this.c = z2;
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
        if (!(obj instanceof ner0)) {
            return false;
        }
        ner0 ner0Var = (ner0) obj;
        TopSectionKey$Sport$Games$Line topSectionKey$Sport$Games$Line = TopSectionKey$Sport$Games$Line.f47156a;
        return topSectionKey$Sport$Games$Line.equals(topSectionKey$Sport$Games$Line) && Intrinsics.d(this.f23401a, ner0Var.f23401a) && this.b == ner0Var.b && this.c == ner0Var.c;
    }

    @Override // a.qdr0
    public final TopSectionKey getKey() {
        return TopSectionKey$Sport$Games$Line.f47156a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + brm0.e(cs0.b(this.f23401a, -287679693, 31), 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TopSportGameLineUiModel(key=");
        sb.append(TopSectionKey$Sport$Games$Line.f47156a);
        sb.append(", lineGames=");
        sb.append(this.f23401a);
        sb.append(", supportRtl=");
        return ohs0.p(", isLoading=", Separators.RPAREN, sb, this.b, this.c);
    }
}

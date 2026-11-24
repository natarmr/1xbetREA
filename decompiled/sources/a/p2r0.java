package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.top.impl.presentation.ui.model.TopSectionKey;
import org.xplatform.top.impl.presentation.ui.model.TopSectionKey$Cyber$Games$Line;

/* JADX INFO: loaded from: classes6.dex */
public final class p2r0 implements qdr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f26266a;
    public final a4x b;

    public p2r0(a4x a4xVar, boolean z) {
        a4xVar.getClass();
        this.f26266a = z;
        this.b = a4xVar;
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
        if (!(obj instanceof p2r0)) {
            return false;
        }
        p2r0 p2r0Var = (p2r0) obj;
        TopSectionKey$Cyber$Games$Line topSectionKey$Cyber$Games$Line = TopSectionKey$Cyber$Games$Line.f47131a;
        return topSectionKey$Cyber$Games$Line.equals(topSectionKey$Cyber$Games$Line) && this.f26266a == p2r0Var.f26266a && Intrinsics.d(this.b, p2r0Var.b);
    }

    @Override // a.qdr0
    public final TopSectionKey getKey() {
        return TopSectionKey$Cyber$Games$Line.f47131a;
    }

    public final int hashCode() {
        return this.b.hashCode() + brm0.e(-319842152, 31, this.f26266a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TopCyberGameLineUiModel(key=");
        sb.append(TopSectionKey$Cyber$Games$Line.f47131a);
        sb.append(", supportRtl=");
        sb.append(this.f26266a);
        sb.append(", gameList=");
        return cs0.n(sb, this.b, Separators.RPAREN);
    }
}

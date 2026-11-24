package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.top.impl.presentation.ui.model.TopSectionKey;
import org.xplatform.top.impl.presentation.ui.model.TopSectionKey$Cyber$Games$Live;

/* JADX INFO: loaded from: classes6.dex */
public final class q2r0 implements qdr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f28016a;
    public final a4x b;

    public q2r0(a4x a4xVar, boolean z) {
        a4xVar.getClass();
        this.f28016a = z;
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
        if (!(obj instanceof q2r0)) {
            return false;
        }
        q2r0 q2r0Var = (q2r0) obj;
        TopSectionKey$Cyber$Games$Live topSectionKey$Cyber$Games$Live = TopSectionKey$Cyber$Games$Live.f47132a;
        return topSectionKey$Cyber$Games$Live.equals(topSectionKey$Cyber$Games$Live) && this.f28016a == q2r0Var.f28016a && Intrinsics.d(this.b, q2r0Var.b);
    }

    @Override // a.qdr0
    public final TopSectionKey getKey() {
        return TopSectionKey$Cyber$Games$Live.f47132a;
    }

    public final int hashCode() {
        return this.b.hashCode() + brm0.e(-319834464, 31, this.f28016a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TopCyberGameLiveUiModel(key=");
        sb.append(TopSectionKey$Cyber$Games$Live.f47132a);
        sb.append(", supportRtl=");
        sb.append(this.f28016a);
        sb.append(", gameList=");
        return cs0.n(sb, this.b, Separators.RPAREN);
    }
}

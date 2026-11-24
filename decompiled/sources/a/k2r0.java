package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.top.impl.presentation.ui.model.TopSectionKey;
import org.xplatform.top.impl.presentation.ui.model.TopSectionKey$Cyber$Champs$Live;

/* JADX INFO: loaded from: classes6.dex */
public final class k2r0 implements qdr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f17589a;

    public k2r0(a4x a4xVar) {
        a4xVar.getClass();
        this.f17589a = a4xVar;
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
        if (!(obj instanceof k2r0)) {
            return false;
        }
        k2r0 k2r0Var = (k2r0) obj;
        TopSectionKey$Cyber$Champs$Live topSectionKey$Cyber$Champs$Live = TopSectionKey$Cyber$Champs$Live.f47129a;
        return topSectionKey$Cyber$Champs$Live.equals(topSectionKey$Cyber$Champs$Live) && Intrinsics.d(this.f17589a, k2r0Var.f17589a);
    }

    @Override // a.qdr0
    public final TopSectionKey getKey() {
        return TopSectionKey$Cyber$Champs$Live.f47129a;
    }

    public final int hashCode() {
        return this.f17589a.hashCode() - 1462870367;
    }

    public final String toString() {
        return "TopCyberChampsLiveUiModel(key=" + TopSectionKey$Cyber$Champs$Live.f47129a + ", items=" + this.f17589a + Separators.RPAREN;
    }
}

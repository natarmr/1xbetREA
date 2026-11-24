package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.top.impl.presentation.ui.model.TopSectionKey;
import org.xplatform.top.impl.presentation.ui.model.TopSectionKey$Cyber$Champs$Line;

/* JADX INFO: loaded from: classes6.dex */
public final class i2r0 implements qdr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f14065a;

    public i2r0(a4x a4xVar) {
        a4xVar.getClass();
        this.f14065a = a4xVar;
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
        if (!(obj instanceof i2r0)) {
            return false;
        }
        i2r0 i2r0Var = (i2r0) obj;
        TopSectionKey$Cyber$Champs$Line topSectionKey$Cyber$Champs$Line = TopSectionKey$Cyber$Champs$Line.f47128a;
        return topSectionKey$Cyber$Champs$Line.equals(topSectionKey$Cyber$Champs$Line) && Intrinsics.d(this.f14065a, i2r0Var.f14065a);
    }

    @Override // a.qdr0
    public final TopSectionKey getKey() {
        return TopSectionKey$Cyber$Champs$Line.f47128a;
    }

    public final int hashCode() {
        return this.f14065a.hashCode() - 1462878055;
    }

    public final String toString() {
        return "TopCyberChampsLineUiModel(key=" + TopSectionKey$Cyber$Champs$Line.f47128a + ", items=" + this.f14065a + Separators.RPAREN;
    }
}

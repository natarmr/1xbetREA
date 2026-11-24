package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.top.impl.presentation.ui.model.TopSectionKey;

/* JADX INFO: loaded from: classes6.dex */
public final class e4r0 implements f4r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f7198a;

    public e4r0(i4 i4Var) {
        i4Var.getClass();
        this.f7198a = i4Var;
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
        if (!(obj instanceof e4r0)) {
            return false;
        }
        e4r0 e4r0Var = (e4r0) obj;
        TopSectionKey.TopEvents topEvents = TopSectionKey.TopEvents.f47158a;
        return topEvents.equals(topEvents) && Intrinsics.d(this.f7198a, e4r0Var.f7198a);
    }

    @Override // a.qdr0
    public final TopSectionKey getKey() {
        return TopSectionKey.TopEvents.f47158a;
    }

    public final int hashCode() {
        return this.f7198a.hashCode() - 1807126300;
    }

    public final String toString() {
        return "Single(key=" + TopSectionKey.TopEvents.f47158a + ", items=" + this.f7198a + Separators.RPAREN;
    }
}

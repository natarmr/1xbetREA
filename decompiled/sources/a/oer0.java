package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.top.impl.presentation.ui.model.TopSectionKey;
import org.xplatform.top.impl.presentation.ui.model.TopSectionKey$Sport$Games$Live;

/* JADX INFO: loaded from: classes6.dex */
public final class oer0 implements qdr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f25138a;
    public final boolean b;
    public final boolean c;

    public oer0(a4x a4xVar, boolean z, boolean z2) {
        a4xVar.getClass();
        this.f25138a = a4xVar;
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
        if (!(obj instanceof oer0)) {
            return false;
        }
        oer0 oer0Var = (oer0) obj;
        TopSectionKey$Sport$Games$Live topSectionKey$Sport$Games$Live = TopSectionKey$Sport$Games$Live.f47157a;
        return topSectionKey$Sport$Games$Live.equals(topSectionKey$Sport$Games$Live) && Intrinsics.d(this.f25138a, oer0Var.f25138a) && this.b == oer0Var.b && this.c == oer0Var.c;
    }

    @Override // a.qdr0
    public final TopSectionKey getKey() {
        return TopSectionKey$Sport$Games$Live.f47157a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + brm0.e(cs0.b(this.f25138a, -287672005, 31), 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TopSportGameLiveUiModel(key=");
        sb.append(TopSectionKey$Sport$Games$Live.f47157a);
        sb.append(", liveGames=");
        sb.append(this.f25138a);
        sb.append(", isLoading=");
        return ohs0.p(", supportRtl=", Separators.RPAREN, sb, this.b, this.c);
    }
}

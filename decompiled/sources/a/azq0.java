package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.top.impl.presentation.ui.model.TopSectionKey;

/* JADX INFO: loaded from: classes6.dex */
public final class azq0 implements qdr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f1732a;
    public final boolean b;
    public final lq5 c;

    public azq0(lq5 lq5Var, a4x a4xVar, boolean z) {
        a4xVar.getClass();
        this.f1732a = a4xVar;
        this.b = z;
        this.c = lq5Var;
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
        if (!(obj instanceof azq0)) {
            return false;
        }
        azq0 azq0Var = (azq0) obj;
        TopSectionKey.BannerTape bannerTape = TopSectionKey.BannerTape.f47127a;
        return bannerTape.equals(bannerTape) && Intrinsics.d(this.f1732a, azq0Var.f1732a) && this.b == azq0Var.b && this.c.equals(azq0Var.c);
    }

    @Override // a.qdr0
    public final TopSectionKey getKey() {
        return TopSectionKey.BannerTape.f47127a;
    }

    public final int hashCode() {
        return this.c.hashCode() + brm0.e(cs0.b(this.f1732a, 750864288, 31), 31, this.b);
    }

    public final String toString() {
        return "TopBannerTapeUiModel(key=" + TopSectionKey.BannerTape.f47127a + ", banners=" + this.f1732a + ", isLoading=" + this.b + ", bannerStyle=" + this.c + Separators.RPAREN;
    }
}

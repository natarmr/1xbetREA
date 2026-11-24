package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class y8m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f42203a;
    public final String b;
    public final n0x c;
    public final String d;
    public final boolean e;
    public final d4d f;

    public y8m(int i, String str, n0x n0xVar, String str2, boolean z) {
        d4d d4dVar = d4d.BACKGROUND;
        str.getClass();
        str2.getClass();
        this.f42203a = i;
        this.b = str;
        this.c = n0xVar;
        this.d = str2;
        this.e = z;
        this.f = d4dVar;
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
        if (!(obj instanceof y8m)) {
            return false;
        }
        y8m y8mVar = (y8m) obj;
        if (this.f42203a != y8mVar.f42203a || !Intrinsics.d(this.b, y8mVar.b) || !this.c.equals(y8mVar.c) || !Intrinsics.d(this.d, y8mVar.d)) {
            return false;
        }
        x8m x8mVar = x8m.f40469a;
        return x8mVar.equals(x8mVar) && this.e == y8mVar.e && this.f == y8mVar.f;
    }

    public final int hashCode() {
        return this.f.hashCode() + brm0.e((((this.d.hashCode() + twn.a(R.drawable.ic_glyph_circle_globe, f140.f(this.c, ua80.b(Integer.hashCode(this.f42203a) * 31, 31, this.b), 31), 31)) * 31) - 1790308576) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder sbR = vqd.r(this.f42203a, "DsCyberLogoCollectionItemUiModel(id=", ", teamId=", this.b, ", imageLink=");
        sbR.append(this.c);
        sbR.append(", placeholderResId=");
        sbR.append(R.drawable.ic_glyph_circle_globe);
        sbR.append(", label=");
        sbR.append(this.d);
        sbR.append(", tag=");
        sbR.append(x8m.f40469a);
        sbR.append(", badgeEnabled=");
        sbR.append(this.e);
        sbR.append(", badgeBorderColorKey=");
        sbR.append(this.f);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }
}

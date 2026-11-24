package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class t86 implements z86 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wws0 f33498a;
    public final wws0 b;
    public final f2i c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final r0n h;

    public t86(wws0 wws0Var, wws0 wws0Var2, f2i f2iVar, String str, String str2, String str3, String str4, r0n r0nVar) {
        cs0.x(str, str2, str3, str4);
        this.f33498a = wws0Var;
        this.b = wws0Var2;
        this.c = f2iVar;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = r0nVar;
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
        if (!(obj instanceof t86)) {
            return false;
        }
        t86 t86Var = (t86) obj;
        if (!this.f33498a.equals(t86Var.f33498a) || !this.b.equals(t86Var.b) || !Intrinsics.d(this.c, t86Var.c) || !Intrinsics.d(this.d, t86Var.d) || !Intrinsics.d(this.e, t86Var.e) || !Intrinsics.d(this.f, t86Var.f) || !Intrinsics.d(this.g, t86Var.g) || !this.h.equals(t86Var.h)) {
            return false;
        }
        uem uemVar = uem.f35536a;
        return uemVar.equals(uemVar);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f33498a.hashCode() * 31)) * 31;
        f2i f2iVar = this.c;
        return ((this.h.hashCode() + ua80.b(ua80.b(ua80.b(ua80.b((iHashCode + (f2iVar == null ? 0 : f2iVar.hashCode())) * 31, 31, this.d), 961, this.e), 31, this.f), 31, this.g)) * 31) + 1419988970;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Cyber(firstOpponentModel=");
        sb.append(this.f33498a);
        sb.append(", secondOpponentModel=");
        sb.append(this.b);
        sb.append(", broadcastIndicatorModel=");
        sb.append(this.c);
        sb.append(", tagLiveText=");
        sb.append(this.d);
        sb.append(", infoLabel=");
        f140.v(sb, this.e, ", scoreGameTitle=, scoreSetTitle=", this.f, ", scoreResultTitle=");
        sb.append(this.g);
        sb.append(", options=");
        sb.append(this.h);
        sb.append(", gameIndicator=");
        sb.append(uem.f35536a);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}

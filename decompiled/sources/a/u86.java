package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class u86 implements z86 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wws0 f35220a;
    public final wws0 b;
    public final f2i c;
    public final String d;
    public final String e;
    public final r0n f;

    public u86(wws0 wws0Var, wws0 wws0Var2, f2i f2iVar, String str, String str2, r0n r0nVar) {
        str.getClass();
        str2.getClass();
        this.f35220a = wws0Var;
        this.b = wws0Var2;
        this.c = f2iVar;
        this.d = str;
        this.e = str2;
        this.f = r0nVar;
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
        if (!(obj instanceof u86)) {
            return false;
        }
        u86 u86Var = (u86) obj;
        if (!this.f35220a.equals(u86Var.f35220a) || !this.b.equals(u86Var.b) || !Intrinsics.d(this.c, u86Var.c) || !Intrinsics.d(this.d, u86Var.d) || !Intrinsics.d(this.e, u86Var.e) || !this.f.equals(u86Var.f)) {
            return false;
        }
        uem uemVar = uem.f35536a;
        return uemVar.equals(uemVar);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f35220a.hashCode() * 31)) * 31;
        f2i f2iVar = this.c;
        return ((this.f.hashCode() + ua80.b(ua80.b((iHashCode + (f2iVar == null ? 0 : f2iVar.hashCode())) * 31, 31, this.d), 923521, this.e)) * 31) + 1419988970;
    }

    public final String toString() {
        return "MultiTeams(firstOpponentModel=" + this.f35220a + ", secondOpponentModel=" + this.b + ", broadcastIndicatorModel=" + this.c + ", tagLiveText=" + this.d + ", infoLabel=" + this.e + ", scoreGameTitle=, scoreSetTitle=, scoreResultTitle=, options=" + this.f + ", gameIndicator=" + uem.f35536a + Separators.RPAREN;
    }
}

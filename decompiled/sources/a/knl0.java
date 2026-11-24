package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class knl0 implements pnl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a1n f18592a;
    public final a1n b;
    public final r0n c;
    public final String d;
    public final String e;
    public final f2i f;

    public knl0(a1n a1nVar, a1n a1nVar2, r0n r0nVar, String str, String str2, f2i f2iVar) {
        str2.getClass();
        this.f18592a = a1nVar;
        this.b = a1nVar2;
        this.c = r0nVar;
        this.d = str;
        this.e = str2;
        this.f = f2iVar;
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
        if (!(obj instanceof knl0)) {
            return false;
        }
        knl0 knl0Var = (knl0) obj;
        if (!this.f18592a.equals(knl0Var.f18592a) || !this.b.equals(knl0Var.b) || !this.c.equals(knl0Var.c) || !Intrinsics.d(this.d, knl0Var.d)) {
            return false;
        }
        uem uemVar = uem.f35536a;
        return uemVar.equals(uemVar) && Intrinsics.d(this.e, knl0Var.e) && Intrinsics.d(this.f, knl0Var.f);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.f18592a.hashCode() * 31)) * 923521)) * 31;
        String str = this.d;
        int iB = ua80.b((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + 1419988970) * 31, 31, this.e);
        f2i f2iVar = this.f;
        return iB + (f2iVar != null ? f2iVar.hashCode() : 0);
    }

    public final String toString() {
        return "MultiTeams(teamOneModel=" + this.f18592a + ", teamTwoModel=" + this.b + ", scoreGameTitle=, scoreSetTitle=, scoreResultTitle=, options=" + this.c + ", infoLabel=" + this.d + ", gameIndicator=" + uem.f35536a + ", tagLiveText=" + this.e + ", broadcastIndicatorModel=" + this.f + Separators.RPAREN;
    }
}

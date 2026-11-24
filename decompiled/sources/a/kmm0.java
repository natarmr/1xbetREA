package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class kmm0 implements nmm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j1n f18548a;
    public final j1n b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final sgm g;
    public final sgm h;

    public kmm0(j1n j1nVar, j1n j1nVar2, String str, String str2, String str3, String str4, sgm sgmVar, sgm sgmVar2) {
        x0m x0mVar = x0m.f40076a;
        str.getClass();
        str2.getClass();
        this.f18548a = j1nVar;
        this.b = j1nVar2;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = sgmVar;
        this.h = sgmVar2;
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
        if (!(obj instanceof kmm0)) {
            return false;
        }
        kmm0 kmm0Var = (kmm0) obj;
        if (!this.f18548a.equals(kmm0Var.f18548a) || !this.b.equals(kmm0Var.b) || !Intrinsics.d(this.c, kmm0Var.c) || !Intrinsics.d(this.d, kmm0Var.d) || !this.e.equals(kmm0Var.e) || !this.f.equals(kmm0Var.f)) {
            return false;
        }
        uem uemVar = uem.f35536a;
        if (!uemVar.equals(uemVar)) {
            return false;
        }
        x0m x0mVar = x0m.f40076a;
        return this.g.equals(kmm0Var.g) && this.h.equals(kmm0Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.g.hashCode() + ((x0m.f40076a.hashCode() + ((((this.f.hashCode() + ua80.b(ua80.b(ua80.b((this.b.hashCode() + (this.f18548a.hashCode() * 31)) * 29791, 31, this.c), 31, this.d), 31, this.e)) * 31) + 1419988970) * 31)) * 31)) * 31);
    }

    public final String toString() {
        x0m x0mVar = x0m.f40076a;
        StringBuilder sb = new StringBuilder("Tennis(firstOpponent=");
        sb.append(this.f18548a);
        sb.append(", secondOpponent=");
        sb.append(this.b);
        sb.append(", scoreGameTitle=, scoreSetTitle=, scoreResultTitle=");
        f140.v(sb, this.c, ", infoLabel=", this.d, ", seedingLeft=");
        f140.v(sb, this.e, ", seedingRight=", this.f, ", gameIndicator=");
        sb.append(uem.f35536a);
        sb.append(", lowerBracket=");
        sb.append(x0mVar);
        sb.append(", startResultIndicator=");
        sb.append(this.g);
        sb.append(", endResultIndicator=");
        sb.append(this.h);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}

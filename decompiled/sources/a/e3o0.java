package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e3o0 implements i3o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7148a;
    public final String b;
    public final a4x c;
    public final a4x d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final kpm i;
    public final String j;

    public e3o0(String str, String str2, a4x a4xVar, a4x a4xVar2, String str3, String str4, String str5, String str6, kpm kpmVar, String str7) {
        cs0.x(str, str2, str6, str7);
        this.f7148a = str;
        this.b = str2;
        this.c = a4xVar;
        this.d = a4xVar2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = kpmVar;
        this.j = str7;
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
        if (!(obj instanceof e3o0)) {
            return false;
        }
        e3o0 e3o0Var = (e3o0) obj;
        if (!Intrinsics.d(this.f7148a, e3o0Var.f7148a) || !Intrinsics.d(this.b, e3o0Var.b) || !this.c.equals(e3o0Var.c) || !this.d.equals(e3o0Var.d) || !this.e.equals(e3o0Var.e) || !this.f.equals(e3o0Var.f) || !this.g.equals(e3o0Var.g) || !Intrinsics.d(this.h, e3o0Var.h) || !this.i.equals(e3o0Var.i)) {
            return false;
        }
        r2n r2nVar = r2n.f29744a;
        return r2nVar.equals(r2nVar) && Intrinsics.d(this.j, e3o0Var.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + ((((this.i.hashCode() + ua80.b(ua80.b(ua80.b(ua80.b(cs0.b(this.d, cs0.b(this.c, ua80.b(this.f7148a.hashCode() * 31, 31, this.b), 31), 31), 31, this.e), 31, this.f), 31, this.g), 31, this.h)) * 31) + 363200150) * 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("DicePoker(firstOpponentLabel=", this.f7148a, ", secondOpponentLabel=", this.b, ", firstOpponentDiceList=");
        hne.y(sbN, this.c, ", secondOpponentDiceList=", this.d, ", firstOpponentCombinationLabel=");
        f140.v(sbN, this.e, ", secondOpponentCombinationLabel=", this.f, ", infoLabel=");
        f140.v(sbN, this.g, ", gameLabel=", this.h, ", scoreModel=");
        sbN.append(this.i);
        sbN.append(", options=");
        sbN.append(r2n.f29744a);
        sbN.append(", tagLiveText=");
        return axq.n(sbN, this.j, Separators.RPAREN);
    }
}

package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class awm implements fwm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1581a;
    public final String b;
    public final a4x c;
    public final a4x d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final kpm i;
    public final boolean j;

    public awm(String str, String str2, a4x a4xVar, a4x a4xVar2, String str3, String str4, String str5, String str6, kpm kpmVar, boolean z) {
        brm0.B(str, str2, str6);
        this.f1581a = str;
        this.b = str2;
        this.c = a4xVar;
        this.d = a4xVar2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = kpmVar;
        this.j = z;
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
        if (!(obj instanceof awm)) {
            return false;
        }
        awm awmVar = (awm) obj;
        if (!Intrinsics.d(this.f1581a, awmVar.f1581a) || !Intrinsics.d(this.b, awmVar.b) || !this.c.equals(awmVar.c) || !this.d.equals(awmVar.d) || !this.e.equals(awmVar.e) || !this.f.equals(awmVar.f) || !this.g.equals(awmVar.g) || !Intrinsics.d(this.h, awmVar.h) || !this.i.equals(awmVar.i)) {
            return false;
        }
        r2n r2nVar = r2n.f29744a;
        return r2nVar.equals(r2nVar) && this.j == awmVar.j;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.j) + ((((this.i.hashCode() + ua80.b(ua80.b(ua80.b(ua80.b(cs0.b(this.d, cs0.b(this.c, ua80.b(this.f1581a.hashCode() * 31, 31, this.b), 31), 31), 31, this.e), 31, this.f), 31, this.g), 31, this.h)) * 31) + 363200150) * 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("Default(firstOpponentLabel=", this.f1581a, ", secondOpponentLabel=", this.b, ", firstOpponentDiceList=");
        hne.y(sbN, this.c, ", secondOpponentDiceList=", this.d, ", firstOpponentCombinationLabel=");
        f140.v(sbN, this.e, ", secondOpponentCombinationLabel=", this.f, ", infoLabel=");
        f140.v(sbN, this.g, ", gameLabel=", this.h, ", scoreModel=");
        sbN.append(this.i);
        sbN.append(", options=");
        sbN.append(r2n.f29744a);
        sbN.append(", supportRtl=");
        return rw2.p(sbN, this.j, Separators.RPAREN);
    }
}

package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class qoh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f29073a;
    public final String b;
    public final n0x c;
    public final String d;
    public final roh e;
    public final roh f;
    public final toh g;
    public final String h;

    public qoh(long j, String str, n0x n0xVar, String str2, roh rohVar, roh rohVar2, toh tohVar, String str3) {
        str3.getClass();
        this.f29073a = j;
        this.b = str;
        this.c = n0xVar;
        this.d = str2;
        this.e = rohVar;
        this.f = rohVar2;
        this.g = tohVar;
        this.h = str3;
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
        if (!(obj instanceof qoh)) {
            return false;
        }
        qoh qohVar = (qoh) obj;
        if (this.f29073a != qohVar.f29073a || !this.b.equals(qohVar.b) || !this.c.equals(qohVar.c) || !this.d.equals(qohVar.d) || !this.e.equals(qohVar.e) || !this.f.equals(qohVar.f)) {
            return false;
        }
        soh sohVar = soh.f32541a;
        return sohVar.equals(sohVar) && this.g == qohVar.g && Intrinsics.d(this.h, qohVar.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.g.hashCode() + ((((this.f.hashCode() + ((this.e.hashCode() + ua80.b(f140.f(this.c, ua80.b(Long.hashCode(this.f29073a) * 31, 31, this.b), 31), 31, this.d)) * 31)) * 31) + 834596483) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f29073a, "CyberUFCResultEventCardUiModel(id=", ", statId=", this.b);
        sbO.append(", championshipIcon=");
        sbO.append(this.c);
        sbO.append(", championshipLabel=");
        sbO.append(this.d);
        sbO.append(", firstOpponent=");
        sbO.append(this.e);
        sbO.append(", secondOpponent=");
        sbO.append(this.f);
        sbO.append(", score=");
        sbO.append(soh.f32541a);
        sbO.append(", winner=");
        sbO.append(this.g);
        return rw2.o(sbO, ", infoLabel=", this.h, Separators.RPAREN);
    }
}

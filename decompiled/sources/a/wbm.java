package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class wbm implements ybm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f38885a;
    public final String b;

    /* JADX WARN: Type inference failed for: r1v1, types: [byte, int] */
    public wbm(long j, String str) {
        str.getClass();
        this.f38885a = (int) j;
        this.b = str;
    }

    @Override // a.ybm
    public final tbm a() {
        return rbm.f30195a;
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
        if (!(obj instanceof wbm)) {
            return false;
        }
        wbm wbmVar = (wbm) obj;
        if (this.f38885a != wbmVar.f38885a || !Intrinsics.d(this.b, wbmVar.b)) {
            return false;
        }
        rbm rbmVar = rbm.f30195a;
        return rbmVar.equals(rbmVar);
    }

    @Override // a.ybm
    public final long getId() {
        return this.f38885a;
    }

    public final int hashCode() {
        return ((this.b.hashCode() + (Long.hashCode(this.f38885a) * 31)) * 31) + 484069594;
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f38885a, "Label(id=", ", label=", this.b);
        sbO.append(", chevronType=");
        sbO.append(rbm.f30195a);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}

package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class xbm implements ybm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f40607a;
    public final String b;
    public final o0x c;
    public final ubm d;
    public final int e;

    /* JADX WARN: Type inference failed for: r1v1, types: [byte, int] */
    public xbm(long j, String str, o0x o0xVar, ubm ubmVar, int i) {
        str.getClass();
        this.f40607a = (int) j;
        this.b = str;
        this.c = o0xVar;
        this.d = ubmVar;
        this.e = i;
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
        if (!(obj instanceof xbm)) {
            return false;
        }
        xbm xbmVar = (xbm) obj;
        if (this.f40607a != xbmVar.f40607a || !Intrinsics.d(this.b, xbmVar.b) || !this.c.equals(xbmVar.c) || this.d != xbmVar.d || this.e != xbmVar.e) {
            return false;
        }
        rbm rbmVar = rbm.f30195a;
        return rbmVar.equals(rbmVar);
    }

    @Override // a.ybm
    public final long getId() {
        return this.f40607a;
    }

    public final int hashCode() {
        return ((Integer.hashCode(this.e) + ((this.d.hashCode() + w6x.d(this.c, ua80.b(Long.hashCode(this.f40607a) * 31, 31, this.b), 31)) * 31)) * 31) + 484069594;
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f40607a, "LabelWithIcon(id=", ", label=", this.b);
        sbO.append(", icon=");
        sbO.append(this.c);
        sbO.append(", iconType=");
        sbO.append(this.d);
        sbO.append(", placeholderRes=");
        sbO.append(this.e);
        sbO.append(", chevronType=");
        sbO.append(rbm.f30195a);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}

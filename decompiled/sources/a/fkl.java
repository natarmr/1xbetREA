package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class fkl implements hkl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f9699a;
    public final o0x b;
    public final String c;
    public final String d;
    public final ekl e;
    public final String f;
    public final ckl g;
    public final a4x h;

    public fkl(long j, o0x o0xVar, String str, String str2, String str3, i4 i4Var, int i) {
        ekl eklVar = ekl.b;
        ckl cklVar = ckl.b;
        eklVar = (i & 32) != 0 ? ekl.f7957a : eklVar;
        cklVar = (i & 128) != 0 ? ckl.f4512a : cklVar;
        i4Var = (i & 256) != 0 ? dyb.g0(dkl.c, dkl.f6236a, dkl.b) : i4Var;
        i4Var.getClass();
        this.f9699a = j;
        this.b = o0xVar;
        this.c = str;
        this.d = str2;
        this.e = eklVar;
        this.f = str3;
        this.g = cklVar;
        this.h = i4Var;
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
        if (!(obj instanceof fkl)) {
            return false;
        }
        fkl fklVar = (fkl) obj;
        long j = fklVar.f9699a;
        int i = y3d.h;
        if (!h2t0.a(this.f9699a, j)) {
            return false;
        }
        dqo0 dqo0Var = dqo0.f6527a;
        return dqo0Var.equals(dqo0Var) && this.b.equals(fklVar.b) && Intrinsics.d(this.c, fklVar.c) && Intrinsics.d(this.d, fklVar.d) && this.e == fklVar.e && Intrinsics.d(this.f, fklVar.f) && this.g == fklVar.g && this.h.equals(fklVar.h);
    }

    public final int hashCode() {
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        int iD = w6x.d(this.b, ((Long.hashCode(this.f9699a) * 31) - 1060803678) * 31, 31);
        String str = this.c;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (this.e.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        String str3 = this.f;
        return this.h.hashCode() + ((this.g.hashCode() + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        String strI = y3d.i(this.f9699a);
        StringBuilder sb = new StringBuilder("Content(backgroundColor=");
        sb.append(strI);
        sb.append(", tagStyle=");
        sb.append(dqo0.f6527a);
        sb.append(", pictureLink=");
        sb.append(this.b);
        sb.append(", labelText=");
        sb.append(this.c);
        sb.append(", titleText=");
        sb.append(this.d);
        sb.append(", titleType=");
        sb.append(this.e);
        sb.append(", subTitleText=");
        sb.append(this.f);
        sb.append(", contentAlignment=");
        sb.append(this.g);
        sb.append(", contentOrder=");
        return cs0.n(sb, this.h, Separators.RPAREN);
    }
}

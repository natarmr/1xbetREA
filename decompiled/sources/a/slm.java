package a;

import android.gov.nist.core.Separators;
import android.javax.sip.message.Response;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class slm implements tlm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f32407a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;

    public slm(long j, long j2, String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        this.f32407a = z;
        this.b = str;
        this.c = str2;
        this.d = j;
        this.e = j2;
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
        if (!(obj instanceof slm)) {
            return false;
        }
        slm slmVar = (slm) obj;
        if (this.f32407a != slmVar.f32407a || !Intrinsics.d(this.b, slmVar.b) || !Intrinsics.d(this.c, slmVar.c)) {
            return false;
        }
        long j = slmVar.d;
        int i = y3d.h;
        if (!h2t0.a(this.d, j) || !h2t0.a(this.e, slmVar.e)) {
            return false;
        }
        fa50 fa50Var = fa50.f9191a;
        return fa50Var.equals(fa50Var);
    }

    public final int hashCode() {
        int iB = ua80.b(ua80.b(twn.a(Response.BAD_REQUEST, Boolean.hashCode(this.f32407a) * 31, 31), 31, this.b), 31, this.c);
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return ((Long.hashCode(this.e) + rw2.b(iB, 31, this.d)) * 31) - 720973619;
    }

    public final String toString() {
        String strI = y3d.i(this.d);
        String strI2 = y3d.i(this.e);
        StringBuilder sbQ = axq.q("TitleSubtitleAnimated(isVisible=", ", animationDuration=400, title=", this.b, this.f32407a, ", subTitle=");
        f140.v(sbQ, this.c, ", titleColor=", strI, ", subtitleColor=");
        sbQ.append(strI2);
        sbQ.append(", options=");
        sbQ.append(fa50.f9191a);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}

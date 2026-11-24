package a;

import android.gov.nist.core.Separators;
import android.javax.sip.message.Response;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class qlm implements tlm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28941a;
    public final boolean b;
    public final long c;

    public qlm(String str, long j, boolean z) {
        ha50 ha50Var = ha50.TWO_LINES;
        str.getClass();
        this.f28941a = str;
        this.b = z;
        this.c = j;
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
        if (!(obj instanceof qlm)) {
            return false;
        }
        qlm qlmVar = (qlm) obj;
        if (!Intrinsics.d(this.f28941a, qlmVar.f28941a) || this.b != qlmVar.b) {
            return false;
        }
        ha50 ha50Var = ha50.TWO_LINES;
        long j = qlmVar.c;
        int i = y3d.h;
        if (!h2t0.a(this.c, j)) {
            return false;
        }
        fa50 fa50Var = fa50.f9191a;
        return fa50Var.equals(fa50Var);
    }

    public final int hashCode() {
        int iHashCode = (ha50.TWO_LINES.hashCode() + twn.a(Response.BAD_REQUEST, brm0.e(this.f28941a.hashCode() * 31, 31, this.b), 31)) * 31;
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return ((Long.hashCode(this.c) + iHashCode) * 31) - 720973619;
    }

    public final String toString() {
        ha50 ha50Var = ha50.TWO_LINES;
        String strI = y3d.i(this.c);
        StringBuilder sbU = brm0.u("TitleAnimated(title=", this.f28941a, ", isVisible=", this.b, ", animationDuration=400, titleMaxLines=");
        sbU.append(ha50Var);
        sbU.append(", titleColor=");
        sbU.append(strI);
        sbU.append(", options=");
        sbU.append(fa50.f9191a);
        sbU.append(Separators.RPAREN);
        return sbU.toString();
    }
}

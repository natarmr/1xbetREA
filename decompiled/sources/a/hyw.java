package a;

import android.javax.sip.message.Response;
import android.util.Size;

/* JADX INFO: loaded from: classes.dex */
public final class hyw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final myw f13880a;

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
    static {
        Object size = new Size(640, Response.TEMPORARILY_UNAVAILABLE);
        Object isf0Var = new isf0(m2a.d, new jsf0(v7k0.b), 0);
        gyw gywVar = new gyw((byte) 0);
        u15 u15Var = w0x.p0;
        wy40 wy40Var = gywVar.b;
        wy40Var.y(u15Var, size);
        wy40Var.y(fpt0.G0, 1);
        wy40Var.y(w0x.k0, 0);
        wy40Var.y(w0x.s0, isf0Var);
        agn agnVar = agn.d;
        if (!agnVar.equals(agnVar)) {
            v4i0.p("ImageAnalysis currently only supports SDR");
        } else {
            wy40Var.y(h0x.j0, agnVar);
            f13880a = new myw(b780.j(wy40Var));
        }
    }
}

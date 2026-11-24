package a;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class o5k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReference f24691a = new AtomicReference(null);

    /* JADX WARN: Multi-variable type inference failed */
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
    public static final gbe0 a(Context context) {
        gbe0 gbe0Var;
        gbe0 gbe0Var2;
        AtomicReference atomicReference = f24691a;
        Object obj = atomicReference.get();
        gbe0 gbe0Var3 = obj instanceof gbe0 ? (gbe0) obj : null;
        if (gbe0Var3 != null) {
            return gbe0Var3;
        }
        gbe0 gbe0VarA = null;
        while (true) {
            Object obj2 = atomicReference.get();
            if (obj2 instanceof gbe0) {
                gbe0Var = (gbe0) obj2;
                gbe0Var2 = gbe0VarA;
            } else {
                if (gbe0VarA == null) {
                    Context applicationContext = context.getApplicationContext();
                    n5k0 n5k0Var = obj2 instanceof n5k0 ? (n5k0) obj2 : null;
                    if (n5k0Var != null) {
                        gbe0VarA = n5k0Var.a(applicationContext);
                    } else {
                        n5k0 n5k0Var2 = applicationContext instanceof n5k0 ? (n5k0) applicationContext : null;
                        gbe0VarA = n5k0Var2 != null ? n5k0Var2.a(applicationContext) : q5k0.f28155a.a(applicationContext);
                    }
                }
                gbe0Var = gbe0VarA;
                gbe0Var2 = gbe0Var;
            }
            while (!atomicReference.compareAndSet(obj2, gbe0Var)) {
                if (atomicReference.get() != obj2) {
                    gbe0VarA = gbe0Var2;
                }
            }
            return gbe0Var;
        }
    }
}

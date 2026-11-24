package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class t33 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lxs0 f33246a;
    public final Object b;
    public final l73 c;
    public final pz40 d;
    public final pz40 e;
    public final h050 f;
    public final nul0 g;
    public final t73 h;
    public final t73 i;
    public final t73 j;
    public final t73 k;

    public t33(Object obj, lxs0 lxs0Var, Object obj2) {
        this.f33246a = lxs0Var;
        this.b = obj2;
        l73 l73Var = new l73(lxs0Var, obj, null, 60);
        this.c = l73Var;
        this.d = androidx.compose.runtime.e.e(Boolean.FALSE);
        this.e = androidx.compose.runtime.e.e(obj);
        this.f = new h050();
        this.g = new nul0(obj2, 3);
        t73 t73Var = l73Var.c;
        boolean z = t73Var instanceof p73;
        t73 t73Var2 = z ? xf0.f : t73Var instanceof q73 ? xf0.g : t73Var instanceof r73 ? xf0.h : xf0.i;
        this.h = t73Var2;
        t73 t73Var3 = z ? xf0.b : t73Var instanceof q73 ? xf0.c : t73Var instanceof r73 ? xf0.d : xf0.e;
        this.i = t73Var3;
        this.j = t73Var2;
        this.k = t73Var3;
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
    public static Object a(t33 t33Var, Object obj, j73 j73Var, Float f, Function1 function1, yje yjeVar, int i) {
        if ((i & 2) != 0) {
            j73Var = t33Var.g;
        }
        j73 j73Var2 = j73Var;
        Object objInvoke = f;
        if ((i & 4) != 0) {
            objInvoke = t33Var.f33246a.b.invoke(t33Var.c.c);
        }
        if ((i & 8) != 0) {
            function1 = null;
        }
        Object objD = t33Var.d();
        lxs0 lxs0Var = t33Var.f33246a;
        return h050.a(t33Var.f, new r33(t33Var, objInvoke, new wto0(j73Var2, lxs0Var, objD, obj, (t73) lxs0Var.f20832a.invoke(objInvoke)), t33Var.c.d, function1, null), yjeVar);
    }

    public final Object b(Object obj) {
        t73 t73Var = this.h;
        t73 t73Var2 = this.j;
        boolean zD = Intrinsics.d(t73Var2, t73Var);
        t73 t73Var3 = this.k;
        if (!zD || !Intrinsics.d(t73Var3, this.i)) {
            lxs0 lxs0Var = this.f33246a;
            t73 t73Var4 = (t73) lxs0Var.f20832a.invoke(obj);
            int iB = t73Var4.b();
            boolean z = false;
            for (int i = 0; i < iB; i++) {
                if (t73Var4.a(i) < t73Var2.a(i) || t73Var4.a(i) > t73Var3.a(i)) {
                    t73Var4.e(l1e0.c(t73Var4.a(i), t73Var2.a(i), t73Var3.a(i)), i);
                    z = true;
                }
            }
            if (z) {
                return lxs0Var.b.invoke(t73Var4);
            }
        }
        return obj;
    }

    public final void c() {
        l73 l73Var = this.c;
        l73Var.c.d();
        l73Var.d = Long.MIN_VALUE;
        ((hgk0) this.d).setValue(Boolean.FALSE);
    }

    public final Object d() {
        return ((hgk0) this.c.b).getValue();
    }

    public final boolean e() {
        return ((Boolean) ((hgk0) this.d).getValue()).booleanValue();
    }

    public final Object f(yje yjeVar, Object obj) {
        Object objA = h050.a(this.f, new r72(this, obj, null, (byte) 3), yjeVar);
        return objA == wne.f39444a ? objA : Unit.f46060a;
    }

    public final Object g(bnn0 bnn0Var) {
        Object objA = h050.a(this.f, new m91(this, null, (byte) 4), bnn0Var);
        return objA == wne.f39444a ? objA : Unit.f46060a;
    }

    public /* synthetic */ t33(Object obj, lxs0 lxs0Var, Object obj2, int i) {
        this(obj, lxs0Var, (i & 4) != 0 ? null : obj2);
    }
}

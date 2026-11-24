package a;

import androidx.fragment.app.Fragment;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class t1r implements s1r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33180a;
    public final int b;
    public final boolean c;
    public final /* synthetic */ androidx.fragment.app.e d;

    /* JADX WARN: Multi-variable type inference failed */
    public t1r(androidx.fragment.app.e eVar, String str, int i, int i2) {
        this.d = eVar;
        this.f33180a = str;
        this.b = i;
        this.c = i2;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // a.s1r
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        Fragment fragment = this.d.A;
        if (fragment != null && this.b < 0 && this.f33180a == null && fragment.C().h0(-1, 0)) {
            return false;
        }
        return this.d.i0(arrayList, arrayList2, this.f33180a, this.b, this.c ? 1 : 0);
    }
}

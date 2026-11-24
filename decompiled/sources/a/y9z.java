package a;

import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class y9z implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f42271a;
    public final baz b;

    public /* synthetic */ y9z(baz bazVar, byte b) {
        this.f42271a = b;
        this.b = bazVar;
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
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f42271a;
        baz bazVar = this.b;
        switch (b) {
            case 0:
                cek cekVar = cek.m;
                cr30.f4824a.getClass();
                Function1 function1 = j9x.Y;
                cekVar.getClass();
                ux50 ux50Var = ux50.d;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                boolean zA = cekVar.a(cek.l);
                List list = cekVar.f4217a;
                if (zA) {
                    for (g950 g950Var : bazVar.h(cekVar, function1)) {
                        function1.invoke(g950Var);
                        foc focVarD = bazVar.d(g950Var, ux50Var);
                        if (focVarD != null) {
                            linkedHashSet.add(focVarD);
                        }
                    }
                }
                if (cekVar.a(cek.i) && !list.contains(xdk.f40697a)) {
                    for (g950 g950Var2 : bazVar.i(cekVar, function1)) {
                        function1.invoke(g950Var2);
                        linkedHashSet.addAll(bazVar.a(g950Var2, ux50Var));
                    }
                }
                if (cekVar.a(cek.j) && !list.contains(xdk.f40697a)) {
                    for (g950 g950Var3 : bazVar.o(cekVar)) {
                        function1.invoke(g950Var3);
                        linkedHashSet.addAll(bazVar.f(g950Var3, ux50Var));
                    }
                }
                return CollectionsKt.L0(linkedHashSet);
            case 1:
                return bazVar.k();
            case 2:
                return bazVar.i(cek.p, null);
            case 3:
                return bazVar.o(cek.q);
            default:
                return bazVar.h(cek.o, null);
        }
    }
}

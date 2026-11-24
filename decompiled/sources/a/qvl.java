package a;

import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class qvl implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f29391a;
    public final /* synthetic */ rvl b;
    public final /* synthetic */ List c;

    public /* synthetic */ qvl(rvl rvlVar, List list, byte b) {
        this.f29391a = b;
        this.b = rvlVar;
        this.c = list;
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
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f29391a;
        List<Pair> list = this.c;
        rvl rvlVar = this.b;
        float fFloatValue = ((Float) obj).floatValue();
        switch (b) {
            case 0:
                rvlVar.f(fFloatValue);
                ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                for (Pair pair : list) {
                    arrayList.add(new Pair(Float.valueOf(((Number) pair.f46059a).floatValue() * fFloatValue), Float.valueOf(((Number) pair.b).floatValue() * fFloatValue)));
                }
                rvlVar.h(arrayList);
                rvlVar.f31174a.invalidate();
                break;
            default:
                rvlVar.f(fFloatValue);
                ArrayList arrayList2 = new ArrayList(r3d.q(list, 10));
                for (Pair pair2 : list) {
                    arrayList2.add(new Pair(Float.valueOf(((Number) pair2.f46059a).floatValue() * fFloatValue), Float.valueOf(((Number) pair2.b).floatValue() * fFloatValue)));
                }
                rvlVar.h(arrayList2);
                rvlVar.f31174a.invalidate();
                break;
        }
        return Unit.f46060a;
    }
}

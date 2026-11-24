package a;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import org.xplatform.uikit.compose.components.picker.model.SimpleDate;

/* JADX INFO: loaded from: classes6.dex */
public final class pjf0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i = 2;
    public final /* synthetic */ Object j;
    public final /* synthetic */ int k;
    public final /* synthetic */ Object l;
    public /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pjf0(tcj tcjVar, List list, int i, v9v0 v9v0Var, cgk0 cgk0Var, yje yjeVar) {
        super(2, yjeVar);
        this.m = tcjVar;
        this.j = list;
        this.k = i;
        this.l = v9v0Var;
        this.n = cgk0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.n;
        Object obj3 = this.l;
        Object obj4 = this.j;
        switch (b) {
            case 0:
                return new pjf0((tcj) this.m, (List) obj4, this.k, (v9v0) obj3, (cgk0) obj2, yjeVar);
            case 1:
                return new pjf0((List) obj4, this.k, (v9v0) obj3, (tcj) this.m, (cgk0) obj2, yjeVar);
            default:
                pjf0 pjf0Var = new pjf0((dn0) obj4, (mlr) obj3, this.k, (lu0) obj2, yjeVar);
                pjf0Var.m = obj;
                return pjf0Var;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((pjf0) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

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
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        int i = this.k;
        int iD = 0;
        Object[] objArr = 0;
        Object obj2 = this.n;
        Object obj3 = this.l;
        Object obj4 = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                List list = (List) obj4;
                tcj tcjVar = (tcj) this.m;
                idx.l(list, i, (v9v0) obj3, tcjVar);
                if (up90.e(tcjVar)) {
                    return Unit.f46060a;
                }
                ((t9v0) list.get(i)).d.i(((cgk0) obj2).l());
                return Unit.f46060a;
            case 1:
                cgk0 cgk0Var = (cgk0) obj2;
                tcj tcjVar2 = (tcj) this.m;
                v9v0 v9v0Var = (v9v0) obj3;
                List list2 = v9v0Var.f37054a;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                List list3 = (List) obj4;
                if (((t9v0) list3.get(i)).e) {
                    return Unit.f46060a;
                }
                int iIntValue = ((Number) ((u9v0) list2.get(l1e0.d(cgk0Var.l(), 0, q3d.i(list2)))).c).intValue();
                if (up90.e(tcjVar2)) {
                    idx.l(list3, i, v9v0Var, tcjVar2);
                    return Unit.f46060a;
                }
                SimpleDate simpleDate = tcjVar2.f33721a;
                int i2 = simpleDate != null ? simpleDate.f47286a : Integer.MIN_VALUE;
                SimpleDate simpleDate2 = tcjVar2.b;
                int i3 = simpleDate2 != null ? simpleDate2.f47286a : Integer.MAX_VALUE;
                if (iIntValue < i2) {
                    iIntValue = i2;
                }
                int iMin = Math.min(iIntValue, i3);
                u9v0 u9v0Var = (u9v0) CollectionsKt.firstOrNull(list2);
                Integer num = u9v0Var != null ? (Integer) u9v0Var.c : null;
                if (num != null) {
                    int iD2 = l1e0.d(iMin - num.intValue(), 0, ((t9v0) list3.get(i)).b.size() - 1);
                    u9v0 u9v0Var2 = (u9v0) CollectionsKt.W(iD2, list2);
                    if (u9v0Var2 == null || ((Number) u9v0Var2.c).intValue() != iMin) {
                        Iterator it = list2.iterator();
                        int i4 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                i4 = -1;
                            } else if (((Number) ((u9v0) it.next()).c).intValue() != iMin) {
                                i4++;
                            }
                        }
                        iD = l1e0.d(i4, 0, ((t9v0) list3.get(i)).b.size() - 1);
                    } else {
                        iD = iD2;
                    }
                }
                idx.l(list3, i, v9v0Var, tcjVar2);
                if (iD != cgk0Var.l()) {
                    ((t9v0) list3.get(i)).d.i(iD);
                    return Unit.f46060a;
                }
                tcjVar2.c.invoke(new SimpleDate(iMin, 1, 1));
                return Unit.f46060a;
            default:
                vne vneVar = (vne) this.m;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                dn0 dn0Var = (dn0) obj4;
                c4m0 c4m0VarW = qjj.W(vneVar, null, null, new gm0(dn0Var, (mlr) obj3, this.k, (lu0) obj2, null), 3);
                c4m0VarW.invokeOnCompletion(new fm0(dn0Var, objArr == true ? 1 : 0));
                return c4m0VarW;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pjf0(dn0 dn0Var, mlr mlrVar, int i, lu0 lu0Var, yje yjeVar) {
        super(2, yjeVar);
        this.j = dn0Var;
        this.l = mlrVar;
        this.k = i;
        this.n = lu0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pjf0(List list, int i, v9v0 v9v0Var, tcj tcjVar, cgk0 cgk0Var, yje yjeVar) {
        super(2, yjeVar);
        this.j = list;
        this.k = i;
        this.l = v9v0Var;
        this.m = tcjVar;
        this.n = cgk0Var;
    }
}

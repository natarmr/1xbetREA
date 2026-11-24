package a;

import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import org.xplatform.cyber.game.core.presentation.action.CyberActionDialogParams;

/* JADX INFO: loaded from: classes4.dex */
public final class x0g extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ g1g k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0g(g1g g1gVar, boolean z, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 2;
        this.k = g1gVar;
        this.j = z;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        g1g g1gVar = this.k;
        switch (b) {
            case 0:
                return new x0g(g1gVar, yjeVar, (byte) 0);
            case 1:
                return new x0g(g1gVar, yjeVar, (byte) 1);
            case 2:
                return new x0g(g1gVar, this.j, yjeVar);
            case 3:
                x0g x0gVar = new x0g(g1gVar, yjeVar, (byte) 3);
                x0gVar.j = ((Boolean) obj).booleanValue();
                return x0gVar;
            default:
                return new x0g(g1gVar, yjeVar, (byte) 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((x0g) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((x0g) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((x0g) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((x0g) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((x0g) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objA;
        byte b = this.i;
        yje yjeVar = null;
        g1g g1gVar = this.k;
        Object[] objArr = 0;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    rrc rrcVar = g1gVar.p;
                    this.j = true;
                    Object objB = ((hoo) rrcVar.b).b(this);
                    if (objB != wneVar) {
                        objB = Unit.f46060a;
                    }
                    if (objB == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    njt0 njt0Var = g1gVar.i;
                    CyberActionDialogParams cyberActionDialogParams = g1gVar.b;
                    long j = cyberActionDialogParams.b;
                    long j2 = cyberActionDialogParams.f46507a;
                    boolean z3 = cyberActionDialogParams.c;
                    q0g q0gVar = (q0g) CollectionsKt.W(0, g1gVar.A.d());
                    boolean z4 = q0gVar != null ? q0gVar.j : false;
                    this.j = true;
                    objA = njt0Var.a(j, j2, this, z3, z4, false);
                    if (objA == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objA = obj;
                }
                sjt0 sjt0Var = (sjt0) objA;
                if ((sjt0Var instanceof ojt0) && ((ojt0) sjt0Var).f25377a) {
                    g1gVar.z.f(v9o.f37044a);
                }
                return Unit.f46060a;
            case 2:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                ((q7d0) ((wrh) g1gVar.f.b).f39642a.b).d("AUTO_STREAM_KEY", this.j);
                return Unit.f46060a;
            case 3:
                boolean z5 = this.j;
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                g1gVar.B = z5;
                return Unit.f46060a;
            default:
                wne wneVar5 = wne.f39444a;
                boolean z6 = this.j;
                if (!z6) {
                    z1x.P(obj);
                    q430 q430Var = g1gVar.d.f21960a;
                    byte b2 = 2;
                    m430 m430Var = new m430(wwb.C(q430Var.f28079a.a().f34491a, new String[]{"market_filter"}, new sax(b2, yjeVar, (byte) 28)), q430Var, (byte) 0);
                    a1g a1gVar = new a1g(g1gVar.k.f43985a.d(), g1gVar, (byte) 1);
                    i89 i89Var = g1gVar.b.h == 2 ? new i89(g1gVar.m.d(), (byte) 13) : new i89(i120.W(g1gVar.l.f31953a.f40333a.f14208a), (byte) 14);
                    hoo hooVar = g1gVar.n.f11649a;
                    byte b3 = 3;
                    p6d p6dVar = new p6d(new fnq(aoq.c(new p6d(hooVar.c.b, hooVar.b.c, new yno(b3, yjeVar, objArr == true ? 1 : 0), (byte) 1), new zo1(yjeVar, (Object) hooVar, (byte) 17)), new x0g(g1gVar, yjeVar, b3), (byte) 4), g1gVar.o.a(), new y0g(3, (yje) null, (byte) 0), (byte) 1);
                    xvf xvfVar = g1gVar.s;
                    a1g a1gVar2 = new a1g(new gmq[]{m430Var, a1gVar, i89Var, p6dVar, aoq.c(i120.W(new a1t(xvfVar.b.a(), (byte) 6)), new sot(yjeVar, xvfVar, b2)), new a1g(new qaf0(i120.W(vtb.N(((g8n0) g1gVar.q.f1895a.b).f10874a)), (byte) 14), g1gVar, (byte) 2)}, g1gVar, (byte) 0);
                    b1f b1fVar = new b1f((Object) g1gVar, yjeVar, (byte) 5);
                    this.j = true;
                    Object objC = a1gVar2.c(new vnq(h660.f12515a, b1fVar, (byte) 2), this);
                    if (objC != wneVar5) {
                        objC = Unit.f46060a;
                    }
                    if (objC != wneVar5) {
                        objC = Unit.f46060a;
                    }
                    if (objC == wneVar5) {
                        return wneVar5;
                    }
                } else {
                    if (!z6) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x0g(g1g g1gVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = g1gVar;
    }
}

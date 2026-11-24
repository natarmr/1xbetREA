package a;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class bcl0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ ncl0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bcl0(ncl0 ncl0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = ncl0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        ncl0 ncl0Var = this.k;
        switch (b) {
            case 0:
                bcl0 bcl0Var = new bcl0(ncl0Var, yjeVar, (byte) 0);
                bcl0Var.j = ((Boolean) obj).booleanValue();
                return bcl0Var;
            case 1:
                return new bcl0(ncl0Var, yjeVar, (byte) 1);
            case 2:
                return new bcl0(ncl0Var, yjeVar, (byte) 2);
            case 3:
                return new bcl0(ncl0Var, yjeVar, (byte) 3);
            case 4:
                bcl0 bcl0Var2 = new bcl0(ncl0Var, yjeVar, (byte) 4);
                bcl0Var2.j = ((Boolean) obj).booleanValue();
                return bcl0Var2;
            case 5:
                return new bcl0(ncl0Var, yjeVar, (byte) 5);
            case 6:
                return new bcl0(ncl0Var, yjeVar, (byte) 6);
            default:
                return new bcl0(ncl0Var, yjeVar, (byte) 7);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((bcl0) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((bcl0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((bcl0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((bcl0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return ((bcl0) create(bool2, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((bcl0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((bcl0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((bcl0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
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
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        byte b2 = 2;
        byte b3 = 3;
        ncl0 ncl0Var = this.k;
        byte b4 = 4;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        Object[] objArr8 = 0;
        Object[] objArr9 = 0;
        Object[] objArr10 = 0;
        Object[] objArr11 = 0;
        Object[] objArr12 = 0;
        Object[] objArr13 = 0;
        Object[] objArr14 = 0;
        byte b5 = 1;
        switch (b) {
            case 0:
                boolean z = this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (z) {
                    ncl0Var.C(xqs.f41338a);
                }
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    dnq dnqVar = new dnq(new fnq(ncl0Var.x.a(), new zbl0(ncl0Var, objArr2 == true ? 1 : 0, b5), (byte) 4), new vbl0(ncl0Var, objArr == true ? 1 : 0, b2), (byte) 1);
                    this.j = true;
                    if (slb.N(dnqVar, this) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 2:
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    dnq dnqVar2 = new dnq(new fnq(ncl0Var.r.a(), new zbl0(ncl0Var, objArr4 == true ? 1 : 0, b2), (byte) 4), new vbl0(ncl0Var, objArr3 == true ? 1 : 0, b3), (byte) 1);
                    this.j = true;
                    if (slb.N(dnqVar2, this) == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 3:
                wne wneVar4 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    dnq dnqVar3 = new dnq(new fnq(ncl0Var.H.e(udl0.CLASSIC), new zbl0(ncl0Var, objArr6 == true ? 1 : 0, b3), (byte) 4), new vbl0(ncl0Var, objArr5 == true ? 1 : 0, b4), (byte) 1);
                    this.j = true;
                    if (slb.N(dnqVar3, this) == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 4:
                boolean z5 = this.j;
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                ncl0 ncl0Var2 = this.k;
                if (z5) {
                    u3z u3zVarV = ncl0Var2.s.v();
                    frs frsVar = ncl0Var2.j;
                    long j = frsVar.d;
                    long j2 = frsVar.e;
                    if (j == j2 || j2 == 0) {
                        ncl0Var2.z(u3zVarV);
                    } else {
                        ncl0Var2.A(j2, j, u3zVarV.c, u3zVarV.b != t3z.c ? (byte) 0 : (byte) 1, ncl0Var2.x().D0);
                    }
                    c4m0 c4m0Var = ncl0Var2.W;
                    if (c4m0Var != null) {
                        e3c.n(c4m0Var);
                    }
                    ncl0Var2.W = sac.T(new fnq(ncl0Var2.B.a(), new zbl0(ncl0Var2, objArr7 == true ? 1 : 0, b4), (byte) 4), jiu0.a(ncl0Var2), dcl0.h);
                } else {
                    Pair pair = ncl0Var2.X;
                    e3c.n(pair != null ? (bby) pair.b : null);
                    e3c.n(ncl0Var2.W);
                }
                return Unit.f46060a;
            case 5:
                wne wneVar6 = wne.f39444a;
                boolean z6 = this.j;
                if (!z6) {
                    z1x.P(obj);
                    byte b6 = 5;
                    dnq dnqVar4 = new dnq(new fnq(i120.W(new qaf0(ulb.L(new i89(new p6d(ncl0Var.O, ncl0Var.U, new p4b0(ncl0Var, objArr10 == true ? 1 : 0, (byte) 8), (byte) 1), (byte) 22), ncl0Var.o.f22085a), (byte) 10)), new zbl0(ncl0Var, objArr9 == true ? 1 : 0, b6), (byte) 4), new vbl0(ncl0Var, objArr8 == true ? 1 : 0, b6), (byte) 1);
                    this.j = true;
                    if (slb.N(dnqVar4, this) == wneVar6) {
                        return wneVar6;
                    }
                } else {
                    if (!z6) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 6:
                wne wneVar7 = wne.f39444a;
                boolean z7 = this.j;
                if (!z7) {
                    z1x.P(obj);
                    byte b7 = 6;
                    dnq dnqVar5 = new dnq(new fnq(ncl0Var.v.f16158a.e(), new zbl0(ncl0Var, objArr12 == true ? 1 : 0, b7), (byte) 4), new vbl0(ncl0Var, objArr11 == true ? 1 : 0, b7), (byte) 1);
                    this.j = true;
                    if (slb.N(dnqVar5, this) == wneVar7) {
                        return wneVar7;
                    }
                } else {
                    if (!z7) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                wne wneVar8 = wne.f39444a;
                boolean z8 = this.j;
                if (!z8) {
                    z1x.P(obj);
                    dnq dnqVar6 = new dnq(new fnq(ncl0Var.q.a(), new zbl0(ncl0Var, objArr14 == true ? 1 : 0, (byte) 9), (byte) 4), new vbl0(ncl0Var, objArr13 == true ? 1 : 0, (byte) 7), (byte) 1);
                    this.j = true;
                    if (slb.N(dnqVar6, this) == wneVar8) {
                        return wneVar8;
                    }
                } else {
                    if (!z8) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }
}

package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class ud60 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ ywv0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ud60(ywv0 ywv0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = ywv0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                return new ud60(this.k, yjeVar, (byte) 0);
            case 1:
                return new ud60(this.k, yjeVar, (byte) 1);
            case 2:
                return new ud60(this.k, yjeVar, (byte) 2);
            case 3:
                return new ud60(this.k, yjeVar, (byte) 3);
            case 4:
                return new ud60(this.k, yjeVar, (byte) 4);
            default:
                return new ud60(this.k, yjeVar, (byte) 5);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((ud60) create(Integer.valueOf(((Number) obj).intValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((ud60) create((avv0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((ud60) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((ud60) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((ud60) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((ud60) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
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
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object objK0;
        Object objF;
        byte b = this.i;
        ywv0 ywv0Var = this.k;
        cvv0 cvv0Var = null;
        boolean z = false;
        boolean z2 = false;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    pzu pzuVar = ywv0Var.n;
                    this.j = true;
                    if (pzuVar.l0(this) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    pzu pzuVar2 = ywv0Var.n;
                    this.j = true;
                    ruv0 ruv0Var = (ruv0) pzuVar2.d;
                    fht0 fht0Var = (fht0) pzuVar2.b;
                    cvv0 cvv0VarF = fht0Var.f();
                    if (cvv0VarF != null) {
                        bsv0 bsv0VarL = ((h0q0) fht0Var.f9559a).l();
                        int i = cvv0VarF.f5049a;
                        int i2 = cvv0VarF.b;
                        int i3 = cvv0VarF.c;
                        int i4 = cvv0VarF.d;
                        int i5 = cvv0VarF.e;
                        int i6 = cvv0VarF.f;
                        bsv0VarL.getClass();
                        cvv0 cvv0Var2 = new cvv0(i, i2, i3, i4, i5, i6, bsv0VarL);
                        ((hgk0) ((pz40) fht0Var.c)).setValue(cvv0Var2);
                        fht0Var.d = nsm0.x(cvv0Var2);
                        cvv0Var = cvv0Var2;
                    }
                    if (cvv0Var == null || !((glt0) pzuVar2.c).f() || ((mkt0) pzuVar2.f).b()) {
                        objK0 = Unit.f46060a;
                    } else {
                        if (ruv0Var.g()) {
                            ruv0Var.m(cvv0Var);
                        } else {
                            buv0 buv0Var = (buv0) pzuVar2.e;
                            if ((((Boolean) ((hgk0) buv0Var.i).getValue()).booleanValue() && buv0Var.g) || (objK0 = pzuVar2.k0(cvv0Var, this)) != wneVar2) {
                                objK0 = Unit.f46060a;
                            }
                        }
                        objK0 = Unit.f46060a;
                    }
                    if (objK0 == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 2:
                wne wneVar3 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    vkr0 vkr0Var = ywv0Var.m;
                    this.j = true;
                    Object objJ = d5c.J(this, new n7t0(vkr0Var, z ? 1 : 0, (byte) 21));
                    Object obj2 = objJ;
                    if (objJ != wneVar3) {
                        obj2 = Unit.f46060a;
                    }
                    if (obj2 == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z5) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 3:
                wne wneVar4 = wne.f39444a;
                boolean z6 = this.j;
                if (!z6) {
                    z1x.P(obj);
                    glt0 glt0Var = ywv0Var.d;
                    lxv0 lxv0VarD = glt0Var.d();
                    this.j = true;
                    if (glt0Var.c(lxv0VarD, this) == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (!z6) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 4:
                wne wneVar5 = wne.f39444a;
                boolean z7 = this.j;
                if (!z7) {
                    z1x.P(obj);
                    if (!ywv0Var.f.b()) {
                        pzu pzuVar3 = ywv0Var.n;
                        this.j = true;
                        glt0 glt0Var2 = (glt0) pzuVar3.c;
                        t33 t33Var = (t33) glt0Var2.c;
                        if (((fht0) pzuVar3.b).f() == null || !glt0Var2.f() || t33Var.e() || ((ruv0) pzuVar3.d).g()) {
                            objF = Unit.f46060a;
                        } else {
                            objF = t33Var.f(this, new Float(((fht0) glt0Var2.b).a(glt0Var2.d())));
                            if (objF != wneVar5) {
                                objF = Unit.f46060a;
                            }
                            if (objF != wneVar5) {
                                objF = Unit.f46060a;
                            }
                        }
                        if (objF == wneVar5) {
                            return wneVar5;
                        }
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
                wne wneVar6 = wne.f39444a;
                boolean z8 = this.j;
                if (!z8) {
                    z1x.P(obj);
                    oxv0 oxv0Var = ywv0Var.l;
                    this.j = true;
                    Object objJ2 = d5c.J(this, new n7t0(oxv0Var, z2 ? 1 : 0, (byte) 23));
                    Object obj3 = objJ2;
                    if (objJ2 != wneVar6) {
                        obj3 = Unit.f46060a;
                    }
                    if (obj3 == wneVar6) {
                        return wneVar6;
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

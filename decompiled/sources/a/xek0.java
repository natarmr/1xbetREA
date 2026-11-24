package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class xek0 extends bnn0 implements Function2 {
    public jie0 i;
    public byte j;
    public final /* synthetic */ afk0 k;
    public final /* synthetic */ float l;
    public final /* synthetic */ Function1 m;
    public final /* synthetic */ qah0 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xek0(afk0 afk0Var, float f, Function1 function1, qah0 qah0Var, yje yjeVar) {
        super(2, yjeVar);
        this.k = afk0Var;
        this.l = f;
        this.m = function1;
        this.n = qah0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new xek0(this.k, this.l, this.m, this.n, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((xek0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [a.wek0] */
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
        final jie0 jie0Var;
        Object objD;
        afk0 afk0Var = this.k;
        ffk0 ffk0Var = afk0Var.f782a;
        wne wneVar = wne.f39444a;
        byte b = this.j;
        final byte b2 = 1;
        final Function1 function1 = this.m;
        if (b == 0) {
            z1x.P(obj);
            sjj sjjVar = afk0Var.b;
            float f = this.l;
            float fB = ffk0Var.b(f, uzb.R(sjjVar, 0.0f, f));
            if (Float.isNaN(fB)) {
                adx.c("calculateApproachOffset returned NaN. Please use a valid value.");
            }
            jie0Var = new jie0();
            float fSignum = Math.signum(f) * Math.abs(fB);
            jie0Var.f16571a = fSignum;
            function1.invoke(new Float(fSignum));
            float f2 = jie0Var.f16571a;
            final byte b3 = 0;
            ?? r4 = new Function1() { // from class: a.wek0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    byte b4 = b3;
                    Function1 function2 = function1;
                    jie0 jie0Var2 = jie0Var;
                    float fFloatValue = ((Float) obj2).floatValue();
                    switch (b4) {
                        case 0:
                            float f3 = jie0Var2.f16571a - fFloatValue;
                            jie0Var2.f16571a = f3;
                            function2.invoke(Float.valueOf(f3));
                            break;
                        default:
                            float f4 = jie0Var2.f16571a - fFloatValue;
                            jie0Var2.f16571a = f4;
                            function2.invoke(Float.valueOf(f4));
                            break;
                    }
                    return Unit.f46060a;
                }
            };
            this.i = jie0Var;
            this.j = (byte) 1;
            objD = afk0Var.d(this.n, f2, this.l, r4, this);
            if (objD != wneVar) {
            }
        }
        if (b != 1) {
            if (b == 2) {
                z1x.P(obj);
                return obj;
            }
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jie0 jie0Var2 = this.i;
        z1x.P(obj);
        jie0Var = jie0Var2;
        objD = obj;
        l73 l73Var = (l73) objD;
        float fA = ffk0Var.a(((Number) l73Var.b()).floatValue());
        if (Float.isNaN(fA)) {
            adx.c("calculateSnapOffset returned NaN. Please use a valid value.");
        }
        jie0Var.f16571a = fA;
        l73 l73VarA0 = x4d0.a0(l73Var, 0.0f, 0.0f, 30);
        j73 j73Var = afk0Var.c;
        Function1 function2 = new Function1() { // from class: a.wek0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                byte b4 = b2;
                Function1 function3 = function1;
                jie0 jie0Var3 = jie0Var;
                float fFloatValue = ((Float) obj2).floatValue();
                switch (b4) {
                    case 0:
                        float f3 = jie0Var3.f16571a - fFloatValue;
                        jie0Var3.f16571a = f3;
                        function3.invoke(Float.valueOf(f3));
                        break;
                    default:
                        float f4 = jie0Var3.f16571a - fFloatValue;
                        jie0Var3.f16571a = f4;
                        function3.invoke(Float.valueOf(f4));
                        break;
                }
                return Unit.f46060a;
            }
        };
        this.i = null;
        this.j = (byte) 2;
        Object objS = bdx.S(this.n, fA, fA, l73VarA0, j73Var, function2, this);
        return objS == wneVar ? wneVar : objS;
    }
}

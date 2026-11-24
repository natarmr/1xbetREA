package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class o4b0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ r4b0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o4b0(r4b0 r4b0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = r4b0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        r4b0 r4b0Var = this.k;
        switch (b) {
            case 0:
                o4b0 o4b0Var = new o4b0(r4b0Var, yjeVar, (byte) 0);
                o4b0Var.j = obj;
                return o4b0Var;
            default:
                o4b0 o4b0Var2 = new o4b0(r4b0Var, yjeVar, (byte) 1);
                o4b0Var2.j = obj;
                return o4b0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((o4b0) create((n4b0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((o4b0) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
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
        byte b = this.i;
        boolean z = true;
        z = true;
        r4b0 r4b0Var = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                n4b0 n4b0Var = (n4b0) obj2;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                bby bbyVar = r4b0Var.x;
                if (bbyVar != null) {
                    bbyVar.cancel(null);
                }
                rkt0 rkt0Var = r4b0Var.o;
                if (!(n4b0Var instanceof k4b0) && !(n4b0Var instanceof m4b0)) {
                    z = false;
                }
                rkt0Var.g(z);
                break;
            default:
                Throwable th = (Throwable) obj2;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                th.printStackTrace();
                p7m0 p7m0Var = r4b0Var.u;
                k4b0 k4b0Var = new k4b0(th, g2v.d(r4b0Var.g, pb10.g, null, null, R.string.data_retrieval_error, R.string.try_again_text, new g4b0(r4b0Var, z ? (byte) 1 : (byte) 0), 94));
                p7m0Var.getClass();
                p7m0Var.o(null, k4b0Var);
                break;
        }
        return Unit.f46060a;
    }
}

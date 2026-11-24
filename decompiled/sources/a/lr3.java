package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xplatform.client1.features.appactivity.ApplicationActivity;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class lr3 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f20509a;
    public final /* synthetic */ ApplicationActivity b;

    public /* synthetic */ lr3(ApplicationActivity applicationActivity, byte b) {
        this.f20509a = b;
        this.b = applicationActivity;
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
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f20509a;
        Object obj3 = ukd.f35823a;
        byte b2 = 2;
        ApplicationActivity applicationActivity = this.b;
        fet fetVar = (fet) obj;
        Integer num = (Integer) obj2;
        switch (b) {
            case 0:
                num.getClass();
                int i = ApplicationActivity.F1;
                applicationActivity.w(x8x.L(1), fetVar);
                break;
            case 1:
                num.getClass();
                int i2 = ApplicationActivity.F1;
                applicationActivity.v(x8x.L(1), fetVar);
                break;
            case 2:
                int iIntValue = num.intValue();
                int i3 = ApplicationActivity.F1;
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    kjj kjjVar = (kjj) gkb.Q(applicationActivity.F().m0, null, fetVar, 0, 7).getValue();
                    boolean zI = fetVar.i(applicationActivity);
                    Object objP = fetVar.P();
                    if (zI || objP == obj3) {
                        objP = new kr3(applicationActivity, b2);
                        fetVar.o0(objP);
                    }
                    Function0 function0 = (Function0) objP;
                    boolean zI2 = fetVar.i(applicationActivity);
                    Object objP2 = fetVar.P();
                    if (zI2 || objP2 == obj3) {
                        objP2 = new kr3(applicationActivity, (byte) 3);
                        fetVar.o0(objP2);
                    }
                    Function0 function1 = (Function0) objP2;
                    boolean zI3 = fetVar.i(applicationActivity);
                    Object objP3 = fetVar.P();
                    if (zI3 || objP3 == obj3) {
                        objP3 = new kr3(applicationActivity, (byte) 4);
                        fetVar.o0(objP3);
                    }
                    jjj.a(null, kjjVar, function0, function1, (Function0) objP3, fetVar, 0);
                } else {
                    fetVar.X();
                }
                break;
            case 3:
                num.getClass();
                int i4 = ApplicationActivity.F1;
                applicationActivity.u(x8x.L(1), fetVar);
                break;
            case 4:
                int iIntValue2 = num.intValue();
                int i5 = ApplicationActivity.F1;
                if (fetVar.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    boolean zBooleanValue = ((Boolean) gkb.Q(vtb.N(((umx) ((fgu) applicationActivity.F().a0.get()).f9510a.f13549a).b), null, fetVar, 0, 7).getValue()).booleanValue();
                    Object objF = applicationActivity.F();
                    boolean zI4 = fetVar.i(objF);
                    Object objP4 = fetVar.P();
                    if (zI4 || objP4 == obj3) {
                        Object bk2Var = new bk2(1, objF, zu3.class, "onInternetEmulationConnectionChanged", "onInternetEmulationConnectionChanged(Z)V", 0, (byte) 19);
                        fetVar.o0(bk2Var);
                        objP4 = bk2Var;
                    }
                    p8a.w(null, zBooleanValue, (Function1) ((jhy) objP4), fetVar, 0);
                } else {
                    fetVar.X();
                }
                break;
            default:
                int iIntValue3 = num.intValue();
                int i6 = ApplicationActivity.F1;
                if (fetVar.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    applicationActivity.u(0, fetVar);
                    applicationActivity.v(0, fetVar);
                    applicationActivity.w(0, fetVar);
                } else {
                    fetVar.X();
                }
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ lr3(ApplicationActivity applicationActivity, int i, byte b) {
        this.f20509a = b;
        this.b = applicationActivity;
    }
}

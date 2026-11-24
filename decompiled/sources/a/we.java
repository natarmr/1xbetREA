package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class we implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f38996a;
    public final /* synthetic */ pz40 b;

    public /* synthetic */ we(pz40 pz40Var, byte b) {
        this.f38996a = b;
        this.b = pz40Var;
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
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f38996a;
        pz40 pz40Var = this.b;
        switch (b) {
            case 0:
                a9q0 a9q0Var = (a9q0) obj;
                a9q0Var.getClass();
                pz40Var.setValue(Boolean.valueOf(a9q0Var.m(0)));
                break;
            case 1:
                qkx qkxVar = (qkx) obj;
                long j = qkxVar.f28908a;
                pz40Var.setValue(qkxVar);
                break;
            case 2:
                a9q0 a9q0Var2 = (a9q0) obj;
                a9q0Var2.getClass();
                pz40Var.setValue(Boolean.valueOf(a9q0Var2.m(0)));
                break;
            case 3:
                lz3 lz3Var = (lz3) obj;
                lz3Var.getClass();
                pz40Var.setValue(Boolean.valueOf(lz3Var instanceof kz3));
                break;
            case 4:
                abi0 abi0Var = (abi0) obj;
                abi0Var.getClass();
                cbi0.d(abi0Var, ((Boolean) pz40Var.getValue()).booleanValue());
                break;
            case 5:
                lz3 lz3Var2 = (lz3) obj;
                lz3Var2.getClass();
                pz40Var.setValue(Boolean.valueOf(lz3Var2 instanceof kz3));
                break;
            case 6:
                abi0 abi0Var2 = (abi0) obj;
                abi0Var2.getClass();
                cbi0.d(abi0Var2, ((Boolean) pz40Var.getValue()).booleanValue());
                break;
            case 7:
                lz3 lz3Var3 = (lz3) obj;
                lz3Var3.getClass();
                pz40Var.setValue(Boolean.valueOf(lz3Var3 instanceof kz3));
                break;
            case 8:
                abi0 abi0Var3 = (abi0) obj;
                abi0Var3.getClass();
                cbi0.d(abi0Var3, ((Boolean) pz40Var.getValue()).booleanValue());
                break;
            case 9:
                lz3 lz3Var4 = (lz3) obj;
                lz3Var4.getClass();
                pz40Var.setValue(Boolean.valueOf(lz3Var4 instanceof kz3));
                break;
            case 10:
                abi0 abi0Var4 = (abi0) obj;
                abi0Var4.getClass();
                cbi0.d(abi0Var4, ((Boolean) pz40Var.getValue()).booleanValue());
                break;
            case 11:
                a9q0 a9q0Var3 = (a9q0) obj;
                a9q0Var3.getClass();
                pz40Var.setValue(Boolean.valueOf(a9q0Var3.f()));
                break;
            case 12:
                abi0 abi0Var5 = (abi0) obj;
                abi0Var5.getClass();
                zai0 zai0Var = cbi0.m;
                Boolean bool = (Boolean) pz40Var.getValue();
                bool.getClass();
                abi0Var5.b(zai0Var, bool);
                break;
            case 13:
                ((kz3) obj).getClass();
                pz40Var.setValue(Boolean.TRUE);
                break;
            case 14:
                ((iz3) obj).getClass();
                pz40Var.setValue(Boolean.FALSE);
                break;
            case 15:
                pz40Var.setValue((j6z) obj);
                break;
            case 16:
                Object obj2 = (lz3) obj;
                obj2.getClass();
                pz40Var.setValue(obj2);
                break;
            case 17:
                Object obj3 = (lz3) obj;
                obj3.getClass();
                pz40Var.setValue(obj3);
                break;
            case 18:
                ((jz3) obj).getClass();
                pz40Var.setValue(Boolean.FALSE);
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((kz3) obj).getClass();
                pz40Var.setValue(Boolean.TRUE);
                break;
            case 20:
                ((iz3) obj).getClass();
                pz40Var.setValue(Boolean.FALSE);
                break;
            case 21:
                a9q0 a9q0Var4 = (a9q0) obj;
                a9q0Var4.getClass();
                long j2 = a9q0Var4.f491a.b.f42262a.b;
                daq0 daq0Var = new daq0(j2);
                long j3 = ((daq0) pz40Var.getValue()).f5764a;
                idm0.n(j2, j3);
                daq0 daq0Var2 = Float.compare(daq0.c(j2), daq0.c(j3)) < 0 ? daq0Var : null;
                pz40Var.setValue(new daq0(daq0Var2 != null ? daq0Var2.f5764a : ((daq0) pz40Var.getValue()).f5764a));
                break;
            case 22:
                a9q0 a9q0Var5 = (a9q0) obj;
                a9q0Var5.getClass();
                long j4 = a9q0Var5.f491a.b.f42262a.b;
                daq0 daq0Var3 = new daq0(j4);
                long j5 = ((daq0) pz40Var.getValue()).f5764a;
                idm0.n(j4, j5);
                daq0 daq0Var4 = Float.compare(daq0.c(j4), daq0.c(j5)) < 0 ? daq0Var3 : null;
                pz40Var.setValue(new daq0(daq0Var4 != null ? daq0Var4.f5764a : ((daq0) pz40Var.getValue()).f5764a));
                break;
            case 23:
                a9q0 a9q0Var6 = (a9q0) obj;
                a9q0Var6.getClass();
                pz40Var.setValue(new daq0(a9q0Var6.f491a.b.f42262a.b));
                break;
            case 24:
                a9q0 a9q0Var7 = (a9q0) obj;
                a9q0Var7.getClass();
                pz40Var.setValue(new daq0(a9q0Var7.f491a.b.f42262a.b));
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                a9q0 a9q0Var8 = (a9q0) obj;
                a9q0Var8.getClass();
                long j6 = a9q0Var8.f491a.b.f42262a.b;
                daq0 daq0Var5 = new daq0(j6);
                long j7 = ((daq0) pz40Var.getValue()).f5764a;
                idm0.n(j6, j7);
                daq0 daq0Var6 = Float.compare(daq0.c(j6), daq0.c(j7)) < 0 ? daq0Var5 : null;
                pz40Var.setValue(new daq0(daq0Var6 != null ? daq0Var6.f5764a : ((daq0) pz40Var.getValue()).f5764a));
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                a9q0 a9q0Var9 = (a9q0) obj;
                a9q0Var9.getClass();
                long j8 = a9q0Var9.f491a.b.f42262a.b;
                daq0 daq0Var7 = new daq0(j8);
                long j9 = ((daq0) pz40Var.getValue()).f5764a;
                idm0.n(j8, j9);
                daq0 daq0Var8 = Float.compare(daq0.c(j8), daq0.c(j9)) < 0 ? daq0Var7 : null;
                pz40Var.setValue(new daq0(daq0Var8 != null ? daq0Var8.f5764a : ((daq0) pz40Var.getValue()).f5764a));
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                o0x o0xVar = (o0x) obj;
                o0xVar.getClass();
                n0x n0xVar = o0xVar instanceof n0x ? (n0x) o0xVar : null;
                pz40Var.setValue(n0xVar != null ? n0xVar.f22722a : null);
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                pz40Var.setValue((j6z) obj);
                break;
            default:
                k2q0 k2q0Var = (k2q0) obj;
                pz40Var.setValue(k2q0Var.c ? k2q0Var.b : k2q0Var.f17587a);
                break;
        }
        return Unit.f46060a;
    }
}

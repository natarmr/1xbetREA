package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class z2n0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z2n0(Object obj, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = obj;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.k;
        switch (b) {
            case 0:
                return new z2n0((a3n0) obj2, yjeVar, (byte) 0);
            case 1:
                z2n0 z2n0Var = new z2n0((whn0) obj2, yjeVar, (byte) 1);
                z2n0Var.j = ((Boolean) obj).booleanValue();
                return z2n0Var;
            case 2:
                return new z2n0((qon0) obj2, yjeVar, (byte) 2);
            case 3:
                z2n0 z2n0Var2 = new z2n0((m7o0) obj2, yjeVar, (byte) 3);
                z2n0Var2.j = ((Boolean) obj).booleanValue();
                return z2n0Var2;
            case 4:
                return new z2n0((fho0) obj2, yjeVar, (byte) 4);
            case 5:
                z2n0 z2n0Var3 = new z2n0((i3p0) obj2, yjeVar, (byte) 5);
                z2n0Var3.j = ((Boolean) obj).booleanValue();
                return z2n0Var3;
            case 6:
                z2n0 z2n0Var4 = new z2n0((t7p0) obj2, yjeVar, (byte) 6);
                z2n0Var4.j = ((Boolean) obj).booleanValue();
                return z2n0Var4;
            case 7:
                z2n0 z2n0Var5 = new z2n0((zap0) obj2, yjeVar, (byte) 7);
                z2n0Var5.j = ((Boolean) obj).booleanValue();
                return z2n0Var5;
            case 8:
                z2n0 z2n0Var6 = new z2n0((rhp0) obj2, yjeVar, (byte) 8);
                z2n0Var6.j = ((Boolean) obj).booleanValue();
                return z2n0Var6;
            case 9:
                return new z2n0((cwp0) obj2, yjeVar, (byte) 9);
            case 10:
                return new z2n0((pyp0) obj2, yjeVar, (byte) 10);
            case 11:
                return new z2n0((fwf) obj2, yjeVar, (byte) 11);
            case 12:
                return new z2n0((k7q0) obj2, yjeVar, (byte) 12);
            case 13:
                return new z2n0((vb00) obj2, yjeVar, (byte) 13);
            case 14:
                return new z2n0((waq0) obj2, yjeVar, (byte) 14);
            case 15:
                return new z2n0((kzj) obj2, yjeVar, (byte) 15);
            case 16:
                return new z2n0((jdq0) obj2, yjeVar, (byte) 16);
            case 17:
                return new z2n0((ugq0) obj2, yjeVar, (byte) 17);
            case 18:
                return new z2n0((fiq0) obj2, yjeVar, (byte) 18);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                z2n0 z2n0Var7 = new z2n0((lkq0) obj2, yjeVar, (byte) 19);
                z2n0Var7.j = ((Boolean) obj).booleanValue();
                return z2n0Var7;
            case 20:
                return new z2n0((yqq0) obj2, yjeVar, (byte) 20);
            case 21:
                return new z2n0((xtq0) obj2, yjeVar, (byte) 21);
            case 22:
                return new z2n0((hhb0) obj2, yjeVar, (byte) 22);
            case 23:
                z2n0 z2n0Var8 = new z2n0((m5r0) obj2, yjeVar, (byte) 23);
                z2n0Var8.j = ((Boolean) obj).booleanValue();
                return z2n0Var8;
            case 24:
                z2n0 z2n0Var9 = new z2n0((edr0) obj2, yjeVar, (byte) 24);
                z2n0Var9.j = ((Boolean) obj).booleanValue();
                return z2n0Var9;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                z2n0 z2n0Var10 = new z2n0((ofr0) obj2, yjeVar, (byte) 25);
                z2n0Var10.j = ((Boolean) obj).booleanValue();
                return z2n0Var10;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                z2n0 z2n0Var11 = new z2n0((fir0) obj2, yjeVar, (byte) 26);
                z2n0Var11.j = ((Boolean) obj).booleanValue();
                return z2n0Var11;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                z2n0 z2n0Var12 = new z2n0((yrr0) obj2, yjeVar, (byte) 27);
                z2n0Var12.j = ((Boolean) obj).booleanValue();
                return z2n0Var12;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                z2n0 z2n0Var13 = new z2n0((zvr0) obj2, yjeVar, (byte) 28);
                z2n0Var13.j = ((Boolean) obj).booleanValue();
                return z2n0Var13;
            default:
                return new z2n0((k4s0) obj2, yjeVar, (byte) 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((z2n0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((z2n0) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((z2n0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return ((z2n0) create(bool2, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((z2n0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                return ((z2n0) create(bool3, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                Boolean bool4 = (Boolean) obj;
                bool4.booleanValue();
                return ((z2n0) create(bool4, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                Boolean bool5 = (Boolean) obj;
                bool5.booleanValue();
                return ((z2n0) create(bool5, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                Boolean bool6 = (Boolean) obj;
                bool6.booleanValue();
                return ((z2n0) create(bool6, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((z2n0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((z2n0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((z2n0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((z2n0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((z2n0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                return ((z2n0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                return ((z2n0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                return ((z2n0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                return ((z2n0) create(Integer.valueOf(((Number) obj).intValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 18:
                return ((z2n0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                Boolean bool7 = (Boolean) obj;
                bool7.booleanValue();
                return ((z2n0) create(bool7, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 20:
                return ((z2n0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 21:
                return ((z2n0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 22:
                return ((z2n0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 23:
                Boolean bool8 = (Boolean) obj;
                bool8.booleanValue();
                return ((z2n0) create(bool8, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 24:
                Boolean bool9 = (Boolean) obj;
                bool9.booleanValue();
                return ((z2n0) create(bool9, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                Boolean bool10 = (Boolean) obj;
                bool10.booleanValue();
                return ((z2n0) create(bool10, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                Boolean bool11 = (Boolean) obj;
                bool11.booleanValue();
                return ((z2n0) create(bool11, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                Boolean bool12 = (Boolean) obj;
                bool12.booleanValue();
                return ((z2n0) create(bool12, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                Boolean bool13 = (Boolean) obj;
                bool13.booleanValue();
                return ((z2n0) create(bool13, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((z2n0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:173:0x035c  */
    /* JADX WARN: Code duplicated, block: B:175:0x0364  */
    /* JADX WARN: Code duplicated, block: B:178:0x0381  */
    /* JADX WARN: Code duplicated, block: B:179:0x0384  */
    /* JADX WARN: Code duplicated, block: B:181:0x038a  */
    /* JADX WARN: Code duplicated, block: B:182:0x038d  */
    /* JADX WARN: Code duplicated, block: B:184:0x0393  */
    /* JADX WARN: Code duplicated, block: B:185:0x0396  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [a.yje] */
    /* JADX WARN: Type inference failed for: r8v39 */
    /* JADX WARN: Type inference failed for: r8v40 */
    /* JADX WARN: Type inference failed for: r8v41 */
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
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:174:0x0362 -> B:176:0x0366). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // a.zw5
    public final java.lang.Object invokeSuspend(java.lang.Object r36) {
        /*
            Method dump skipped, instruction units count: 1986
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.z2n0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

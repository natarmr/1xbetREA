package a;

import android.view.Window;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class hij extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hij(Object obj, boolean z, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = obj;
        this.j = z;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.k;
        switch (b) {
            case 0:
                return new hij((iij) obj2, yjeVar, (byte) 0);
            case 1:
                return new hij((otj) obj2, yjeVar, (byte) 1);
            case 2:
                hij hijVar = new hij((u8k) obj2, yjeVar, (byte) 2);
                hijVar.j = ((Boolean) obj).booleanValue();
                return hijVar;
            case 3:
                hij hijVar2 = new hij((bbk) obj2, yjeVar, (byte) 3);
                hijVar2.j = ((Boolean) obj).booleanValue();
                return hijVar2;
            case 4:
                return new hij((pmi) obj2, yjeVar, (byte) 4);
            case 5:
                hij hijVar3 = new hij((xtk) obj2, yjeVar, (byte) 5);
                hijVar3.j = ((Boolean) obj).booleanValue();
                return hijVar3;
            case 6:
                return new hij((guk) obj2, yjeVar, (byte) 6);
            case 7:
                return new hij((Window) obj2, this.j, yjeVar, (byte) 7);
            case 8:
                hij hijVar4 = new hij((mpn) obj2, yjeVar, (byte) 8);
                hijVar4.j = ((Boolean) obj).booleanValue();
                return hijVar4;
            case 9:
                return new hij((byn) obj2, yjeVar, (byte) 9);
            case 10:
                hij hijVar5 = new hij((d4o) obj2, yjeVar, (byte) 10);
                hijVar5.j = ((Boolean) obj).booleanValue();
                return hijVar5;
            case 11:
                return new hij((cb8) obj2, this.j, yjeVar, (byte) 11);
            case 12:
                hij hijVar6 = new hij((k9o) obj2, yjeVar, (byte) 12);
                hijVar6.j = ((Boolean) obj).booleanValue();
                return hijVar6;
            case 13:
                return new hij((udo) obj2, yjeVar, (byte) 13);
            case 14:
                return new hij((who) obj2, yjeVar, (byte) 14);
            case 15:
                return new hij((lie0) obj2, yjeVar, (byte) 15);
            case 16:
                return new hij((gzo) obj2, yjeVar, (byte) 16);
            case 17:
                return new hij((e0p) obj2, yjeVar, (byte) 17);
            case 18:
                return new hij((s1p) obj2, yjeVar, (byte) 18);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                hij hijVar7 = new hij((org.xplatform.favorites.impl.presentation.category.a) obj2, yjeVar, (byte) 19);
                hijVar7.j = ((Boolean) obj).booleanValue();
                return hijVar7;
            case 20:
                hij hijVar8 = new hij((org.xplatform.favorites.impl.presentation.category.f) obj2, yjeVar, (byte) 20);
                hijVar8.j = ((Boolean) obj).booleanValue();
                return hijVar8;
            case 21:
                hij hijVar9 = new hij((wgp) obj2, yjeVar, (byte) 21);
                hijVar9.j = ((Boolean) obj).booleanValue();
                return hijVar9;
            case 22:
                hij hijVar10 = new hij((typ) obj2, yjeVar, (byte) 22);
                hijVar10.j = ((Boolean) obj).booleanValue();
                return hijVar10;
            case 23:
                return new hij((x9q) obj2, yjeVar, (byte) 23);
            case 24:
                return new hij((ali) obj2, yjeVar, (byte) 24);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new hij((hhb0) obj2, yjeVar, (byte) 25);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new hij((gmq) obj2, yjeVar, (byte) 26);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new hij((uqq) obj2, yjeVar, (byte) 27);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new hij((xy3) obj2, yjeVar, (byte) 28);
            default:
                hij hijVar11 = new hij((wcr) obj2, yjeVar, (byte) 29);
                hijVar11.j = ((Boolean) obj).booleanValue();
                return hijVar11;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((hij) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((hij) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((hij) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return ((hij) create(bool2, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((hij) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                return ((hij) create(bool3, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((hij) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((hij) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                Boolean bool4 = (Boolean) obj;
                bool4.booleanValue();
                return ((hij) create(bool4, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((hij) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                Boolean bool5 = (Boolean) obj;
                bool5.booleanValue();
                return ((hij) create(bool5, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((hij) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                Boolean bool6 = (Boolean) obj;
                bool6.booleanValue();
                return ((hij) create(bool6, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((hij) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                return ((hij) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                return ((hij) create(obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                return ((hij) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                return ((hij) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 18:
                return ((hij) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                Boolean bool7 = (Boolean) obj;
                bool7.booleanValue();
                return ((hij) create(bool7, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 20:
                Boolean bool8 = (Boolean) obj;
                bool8.booleanValue();
                return ((hij) create(bool8, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 21:
                Boolean bool9 = (Boolean) obj;
                bool9.booleanValue();
                return ((hij) create(bool9, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 22:
                Boolean bool10 = (Boolean) obj;
                bool10.booleanValue();
                return ((hij) create(bool10, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 23:
                return ((hij) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 24:
                return ((hij) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return ((hij) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((hij) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return ((hij) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return ((hij) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                Boolean bool11 = (Boolean) obj;
                bool11.booleanValue();
                return ((hij) create(bool11, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:377:0x082e  */
    /* JADX WARN: Code duplicated, block: B:380:0x083b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [int] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r1v13, types: [a.wne] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r24v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.util.ArrayList] */
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
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v7 java.lang.Object, still in use, count: 2, list:
          (r6v7 java.lang.Object) from 0x082a: PHI (r6 I:??) = (r6v4 java.lang.Object), (r6v7 java.lang.Object) binds: [B:374:0x0829, B:409:0x082a] A[DONT_GENERATE, DONT_INLINE]
          (r6v7 java.lang.Object) from 0x0820: CHECK_CAST (a.qhj) (r6v7 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // a.zw5
    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        /*
            Method dump skipped, instruction units count: 2184
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.hij.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hij(Object obj, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = obj;
    }
}

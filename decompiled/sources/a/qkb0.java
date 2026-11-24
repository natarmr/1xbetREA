package a;

import android.content.Context;
import android.view.Window;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class qkb0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qkb0(k3t0 k3t0Var, kjh0 kjh0Var, pz40 pz40Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 11;
        lkz lkzVar = lkz.f20223a;
        this.j = k3t0Var;
        this.k = kjh0Var;
        this.l = pz40Var;
    }

    private final Object l(Object obj) throws Exception {
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        gmq gmqVarC = ((i3t0) ((k3t0) this.j)).C();
        ajp0 ajp0Var = (ajp0) this.k;
        lkz lkzVar = lkz.f20223a;
        nfj0 nfj0Var = new nfj0(2, (Function1) ((pz40) this.l).getValue(), knx.class, "suspendConversion0", "suspendConversion0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 27);
        clz clzVarW = aac.W(ajp0Var);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new lto0((i89) gmqVarC, clzVarW, nfj0Var, (yje) null, (byte) 0, false), 3);
        return Unit.f46060a;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.l;
        Object obj3 = this.k;
        switch (b) {
            case 0:
                qkb0 qkb0Var = new qkb0(obj3, obj2, yjeVar, (byte) 0);
                qkb0Var.j = obj;
                return qkb0Var;
            case 1:
                qkb0 qkb0Var2 = new qkb0(obj3, obj2, yjeVar, (byte) 1);
                qkb0Var2.j = obj;
                return qkb0Var2;
            case 2:
                return new qkb0((hxd0) this.j, (uwd0) obj3, (String) obj2, yjeVar, (byte) 2);
            case 3:
                qkb0 qkb0Var3 = new qkb0(obj3, obj2, yjeVar, (byte) 3);
                qkb0Var3.j = obj;
                return qkb0Var3;
            case 4:
                return new qkb0((pz40) this.j, (cqq) obj3, (wpq) obj2, yjeVar, (byte) 4);
            case 5:
                return new qkb0((Window) this.j, (pz40) obj3, (w6k) obj2, yjeVar, (byte) 5);
            case 6:
                return new qkb0((fa10) this.j, (Context) obj3, (String) obj2, yjeVar, (byte) 6);
            case 7:
                qkb0 qkb0Var4 = new qkb0(obj3, obj2, yjeVar, (byte) 7);
                qkb0Var4.j = obj;
                return qkb0Var4;
            case 8:
                qkb0 qkb0Var5 = new qkb0(obj3, obj2, yjeVar, (byte) 8);
                qkb0Var5.j = obj;
                return qkb0Var5;
            case 9:
                return new qkb0((String) this.j, (aog0) obj3, (String) obj2, yjeVar, (byte) 9);
            case 10:
                return new qkb0((dq00) this.j, (ArrayList) obj3, (ArrayList) obj2, yjeVar, (byte) 10);
            case 11:
                lkz lkzVar = lkz.f20223a;
                return new qkb0((k3t0) this.j, (kjh0) obj3, (pz40) obj2, yjeVar);
            case 12:
                return new qkb0((androidx.fragment.app.e) this.j, (oqh0) obj3, (xph0) obj2, yjeVar, (byte) 12);
            case 13:
                return new qkb0((Throwable) this.j, (irh0) obj3, (String) obj2, yjeVar, (byte) 13);
            case 14:
                return new qkb0((Throwable) this.j, (zuh0) obj3, (String) obj2, yjeVar, (byte) 14);
            case 15:
                lkz lkzVar2 = lkz.f20223a;
                return new qkb0((k3t0) this.j, (x1i0) obj3, (pz40) obj2, yjeVar);
            case 16:
                lkz lkzVar3 = lkz.f20223a;
                return new qkb0((k3t0) this.j, (y3i0) obj3, (pz40) obj2, yjeVar);
            case 17:
                qkb0 qkb0Var6 = new qkb0(obj3, obj2, yjeVar, (byte) 17);
                qkb0Var6.j = obj;
                return qkb0Var6;
            case 18:
                return new qkb0((File) this.j, (zn00) obj3, (String) obj2, yjeVar, (byte) 18);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new qkb0((pzu) this.j, (File) obj3, (String) obj2, yjeVar, (byte) 19);
            case 20:
                qkb0 qkb0Var7 = new qkb0(obj3, obj2, yjeVar, (byte) 20);
                qkb0Var7.j = obj;
                return qkb0Var7;
            case 21:
                qkb0 qkb0Var8 = new qkb0(obj3, obj2, yjeVar, (byte) 21);
                qkb0Var8.j = obj;
                return qkb0Var8;
            case 22:
                lkz lkzVar4 = lkz.f20223a;
                return new qkb0((k3t0) this.j, (tck0) obj3, (pz40) obj2, yjeVar);
            case 23:
                qkb0 qkb0Var9 = new qkb0(obj3, obj2, yjeVar, (byte) 23);
                qkb0Var9.j = obj;
                return qkb0Var9;
            case 24:
                lkz lkzVar5 = lkz.f20223a;
                return new qkb0((k3t0) this.j, (kxm0) obj3, (pz40) obj2, yjeVar);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                lkz lkzVar6 = lkz.f20223a;
                return new qkb0((k3t0) this.j, (snn0) obj3, (pz40) obj2, yjeVar);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                lkz lkzVar7 = lkz.f20223a;
                return new qkb0((k3t0) this.j, (oxo0) obj3, (pz40) obj2, yjeVar);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                qkb0 qkb0Var10 = new qkb0(obj3, obj2, yjeVar, (byte) 27);
                qkb0Var10.j = obj;
                return qkb0Var10;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                lkz lkzVar8 = lkz.f20223a;
                return new qkb0((k3t0) this.j, (ajp0) obj3, (pz40) obj2, yjeVar);
            default:
                qkb0 qkb0Var11 = new qkb0(obj3, obj2, yjeVar, (byte) 29);
                qkb0Var11.j = obj;
                return qkb0Var11;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws Exception {
        switch (this.i) {
            case 0:
                if (obj != null) {
                    throw new ClassCastException();
                }
                ((qkb0) create(null, (yje) obj2)).invokeSuspend(Unit.f46060a);
                throw null;
            case 1:
                return ((qkb0) create((hdm0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((qkb0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((qkb0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((qkb0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((qkb0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((qkb0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((qkb0) create((hdm0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((qkb0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((qkb0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((qkb0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((qkb0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((qkb0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((qkb0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                return ((qkb0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                return ((qkb0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                return ((qkb0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                return ((qkb0) create((iej0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 18:
                return ((qkb0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((qkb0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 20:
                return ((qkb0) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 21:
                return ((qkb0) create((dqk0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 22:
                return ((qkb0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 23:
                return ((qkb0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 24:
                return ((qkb0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return ((qkb0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((qkb0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return ((qkb0) create((hdm0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return ((qkb0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((qkb0) create((hdm0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:175:0x0709  */
    /* JADX WARN: Code duplicated, block: B:177:0x070d  */
    /* JADX WARN: Code duplicated, block: B:178:0x0718  */
    /* JADX WARN: Code duplicated, block: B:180:0x071e  */
    /* JADX WARN: Code duplicated, block: B:182:0x0738  */
    /* JADX WARN: Code duplicated, block: B:184:0x073e  */
    /* JADX WARN: Code duplicated, block: B:186:0x0744  */
    /* JADX WARN: Code duplicated, block: B:189:0x0750 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:190:0x0752  */
    /* JADX WARN: Code duplicated, block: B:191:0x0755  */
    /* JADX WARN: Code duplicated, block: B:192:0x0759  */
    /* JADX WARN: Code duplicated, block: B:284:0x0a7c  */
    /* JADX WARN: Code duplicated, block: B:285:0x0a7f  */
    /* JADX WARN: Code duplicated, block: B:289:0x0a8f  */
    /* JADX WARN: Code duplicated, block: B:295:0x0aa4  */
    /* JADX WARN: Code duplicated, block: B:296:0x0aa7  */
    /* JADX WARN: Code duplicated, block: B:367:0x0a9f A[SYNTHETIC] */
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
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v8 java.lang.Object, still in use, count: 2, list:
          (r6v8 java.lang.Object) from 0x0a78: PHI (r6 I:??) = (r6v2 java.lang.Object), (r6v8 java.lang.Object) binds: [B:281:0x0a77, B:365:0x0a78] A[DONT_GENERATE, DONT_INLINE]
          (r6v8 java.lang.Object) from 0x0a6c: CHECK_CAST (a.pxd0) (r6v8 java.lang.Object)
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
    public final java.lang.Object invokeSuspend(java.lang.Object r33) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 2964
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.qkb0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qkb0(k3t0 k3t0Var, x1i0 x1i0Var, pz40 pz40Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 15;
        lkz lkzVar = lkz.f20223a;
        this.j = k3t0Var;
        this.k = x1i0Var;
        this.l = pz40Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qkb0(k3t0 k3t0Var, y3i0 y3i0Var, pz40 pz40Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 16;
        lkz lkzVar = lkz.f20223a;
        this.j = k3t0Var;
        this.k = y3i0Var;
        this.l = pz40Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qkb0(k3t0 k3t0Var, tck0 tck0Var, pz40 pz40Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 22;
        lkz lkzVar = lkz.f20223a;
        this.j = k3t0Var;
        this.k = tck0Var;
        this.l = pz40Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qkb0(k3t0 k3t0Var, kxm0 kxm0Var, pz40 pz40Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 24;
        lkz lkzVar = lkz.f20223a;
        this.j = k3t0Var;
        this.k = kxm0Var;
        this.l = pz40Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qkb0(k3t0 k3t0Var, snn0 snn0Var, pz40 pz40Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 25;
        lkz lkzVar = lkz.f20223a;
        this.j = k3t0Var;
        this.k = snn0Var;
        this.l = pz40Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qkb0(k3t0 k3t0Var, oxo0 oxo0Var, pz40 pz40Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 26;
        lkz lkzVar = lkz.f20223a;
        this.j = k3t0Var;
        this.k = oxo0Var;
        this.l = pz40Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qkb0(k3t0 k3t0Var, ajp0 ajp0Var, pz40 pz40Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 28;
        lkz lkzVar = lkz.f20223a;
        this.j = k3t0Var;
        this.k = ajp0Var;
        this.l = pz40Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qkb0(Object obj, Object obj2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = obj;
        this.l = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qkb0(Object obj, Object obj2, Object obj3, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = obj;
        this.k = obj2;
        this.l = obj3;
    }
}

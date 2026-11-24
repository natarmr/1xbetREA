package a;

import androidx.viewpager2.widget.ViewPager2;
import com.huawei.hms.api.ConnectionResult;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.xplatform.uikit.components.segmented_control.DsSegmentedGroup;

/* JADX INFO: loaded from: classes3.dex */
public final class ah0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ah0(Object obj, Object obj2, Object obj3, Object obj4, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = obj;
        this.k = obj2;
        this.l = obj3;
        this.m = obj4;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.m;
        Object obj3 = this.l;
        Object obj4 = this.k;
        switch (b) {
            case 0:
                return new ah0(this.j, obj4, obj3, obj2, yjeVar, (byte) 0);
            case 1:
                return new ah0(this.j, obj4, obj3, obj2, yjeVar, (byte) 1);
            case 2:
                return new ah0(this.j, obj3, (String) obj4, (String) obj2, yjeVar, (byte) 2);
            case 3:
                ah0 ah0Var = new ah0((t33) obj4, (zsf) obj3, (t33) obj2, yjeVar, (byte) 3);
                ah0Var.j = obj;
                return ah0Var;
            case 4:
                ah0 ah0Var2 = new ah0((g8d) obj4, (ij3) obj3, (Function0) obj2, yjeVar, (byte) 4);
                ah0Var2.j = obj;
                return ah0Var2;
            case 5:
                ah0 ah0Var3 = new ah0((String) obj4, (List) obj3, (ou6) obj2, yjeVar, (byte) 5);
                ah0Var3.j = obj;
                return ah0Var3;
            case 6:
                return new ah0(this.j, obj4, obj3, obj2, yjeVar, (byte) 6);
            case 7:
                ah0 ah0Var4 = new ah0((hpa0) obj4, (p5q0) obj3, (k7q0) obj2, yjeVar, (byte) 7);
                ah0Var4.j = obj;
                return ah0Var4;
            case 8:
                ah0 ah0Var5 = new ah0((pwi) obj4, (Long) obj3, (l9s) obj2, yjeVar, (byte) 8);
                ah0Var5.j = obj;
                return ah0Var5;
            case 9:
                ah0 ah0Var6 = new ah0((daf) obj4, (Long) obj3, (l9s) obj2, yjeVar, (byte) 9);
                ah0Var6.j = obj;
                return ah0Var6;
            case 10:
                ah0 ah0Var7 = new ah0((g8d) obj4, (bq00) obj3, (Function0) obj2, yjeVar, (byte) 10);
                ah0Var7.j = obj;
                return ah0Var7;
            case 11:
                ah0 ah0Var8 = new ah0((DsSegmentedGroup) obj4, (i820) obj3, (ViewPager2) obj2, yjeVar, (byte) 11);
                ah0Var8.j = obj;
                return ah0Var8;
            case 12:
                return new ah0(this.j, obj4, obj3, obj2, yjeVar, (byte) 12);
            case 13:
                return new ah0(this.j, obj4, obj3, obj2, yjeVar, (byte) 13);
            case 14:
                return new ah0(this.j, obj4, obj3, obj2, yjeVar, (byte) 14);
            case 15:
                return new ah0(this.j, obj3, (String) obj4, (String) obj2, yjeVar, (byte) 15);
            case 16:
                ah0 ah0Var9 = new ah0((a4x) obj4, (Map) obj3, (pkk0) obj2, yjeVar, (byte) 16);
                ah0Var9.j = obj;
                return ah0Var9;
            case 17:
                return new ah0(this.j, obj4, obj3, obj2, yjeVar, (byte) 17);
            case 18:
                return new ah0(this.j, obj4, obj3, obj2, yjeVar, (byte) 18);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new ah0(this.j, obj4, obj3, obj2, yjeVar, (byte) 19);
            case 20:
                return new ah0(this.j, obj4, obj3, obj2, yjeVar, (byte) 20);
            case 21:
                ah0 ah0Var10 = new ah0((wdk0) obj4, (nam0) obj3, (ii) obj2, yjeVar, (byte) 21);
                ah0Var10.j = obj;
                return ah0Var10;
            case 22:
                ah0 ah0Var11 = new ah0((o9m0) obj4, (oam0) obj3, (nam0) obj2, yjeVar, (byte) 22);
                ah0Var11.j = obj;
                return ah0Var11;
            case 23:
                ah0 ah0Var12 = new ah0((ueo0) obj4, (xcz) obj3, (xcz) obj2, yjeVar, (byte) 23);
                ah0Var12.j = obj;
                return ah0Var12;
            case 24:
                return new ah0(this.j, obj4, obj3, obj2, yjeVar, (byte) 24);
            default:
                ah0 ah0Var13 = new ah0((Function2) obj4, (i3t0) obj3, (j3t0) obj2, yjeVar, (byte) 25);
                ah0Var13.j = obj;
                return ah0Var13;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((ah0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((ah0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((ah0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((ah0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((ah0) create((lpm0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((ah0) create((qpg0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((ah0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((ah0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((ah0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((ah0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((ah0) create((lpm0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((ah0) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((ah0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((ah0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                return ((ah0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                return ((ah0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                return ((ah0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                return ((ah0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 18:
                return ((ah0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((ah0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 20:
                return ((ah0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 21:
                return ((ah0) create((n9m0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 22:
                return ((ah0) create((cam0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 23:
                return ((ah0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 24:
                return ((ah0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((ah0) create(obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:275:0x0a1a  */
    /* JADX WARN: Code duplicated, block: B:276:0x0a1e  */
    /* JADX WARN: Code duplicated, block: B:278:0x0a28  */
    /* JADX WARN: Code duplicated, block: B:279:0x0a2c  */
    /* JADX WARN: Code duplicated, block: B:282:0x0a42  */
    /* JADX WARN: Code duplicated, block: B:285:0x0a4f A[LOOP:8: B:280:0x0a3c->B:285:0x0a4f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:290:0x0a5a  */
    /* JADX WARN: Code duplicated, block: B:292:0x0a5d  */
    /* JADX WARN: Code duplicated, block: B:326:0x0a52 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:327:0x0a53 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r15v0, types: [a.ix0] */
    /* JADX WARN: Type inference failed for: r18v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r2v7, types: [kotlin.ranges.IntRange, kotlin.ranges.a] */
    /* JADX WARN: Type inference failed for: r3v3, types: [a.u58] */
    /* JADX WARN: Type inference failed for: r9v0, types: [a.yje] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Integer] */
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
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v5 java.lang.Object, still in use, count: 2, list:
          (r2v5 java.lang.Object) from 0x0a16: PHI (r2 I:??) = (r2v2 java.lang.Object), (r2v5 java.lang.Object) binds: [B:272:0x0a15, B:324:0x0a16] A[DONT_GENERATE, DONT_INLINE]
          (r2v5 java.lang.Object) from 0x0a0a: CHECK_CAST (a.vh0) (r2v5 java.lang.Object)
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
    public final java.lang.Object invokeSuspend(java.lang.Object r95) {
        /*
            Method dump skipped, instruction units count: 2766
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ah0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ah0(Object obj, Object obj2, Object obj3, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = obj;
        this.l = obj2;
        this.m = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ah0(Object obj, Object obj2, String str, String str2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = obj;
        this.l = obj2;
        this.k = str;
        this.m = str2;
    }
}

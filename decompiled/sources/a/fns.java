package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.game_broadcasting.impl.presentation.video.window_screen.GameVideoWindowService;
import org.xplatform.game_broadcasting.impl.presentation.zone.window_screen.GameZoneWindowService;

/* JADX INFO: loaded from: classes4.dex */
public final class fns extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public Object k;
    public Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fns(i89 i89Var, clz clzVar, j0s j0sVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 25;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = j0sVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.m;
        switch (b) {
            case 0:
                i89 i89Var = (i89) this.k;
                clz clzVar = (clz) this.l;
                lkz lkzVar = lkz.f20223a;
                return new fns(i89Var, clzVar, (ens) obj2, yjeVar);
            case 1:
                return new fns(this.j, (a4x) this.k, (pz40) this.l, (pz40) obj2, yjeVar);
            case 2:
                lys lysVar = (lys) this.k;
                clz clzVar2 = (clz) this.l;
                lkz lkzVar2 = lkz.f20223a;
                return new fns(lysVar, clzVar2, (pfl) obj2, yjeVar);
            case 3:
                gmq gmqVar = (gmq) this.k;
                clz clzVar3 = (clz) this.l;
                lkz lkzVar3 = lkz.f20223a;
                return new fns(gmqVar, clzVar3, (pfl) obj2, yjeVar);
            case 4:
                gmq gmqVar2 = (gmq) this.k;
                clz clzVar4 = (clz) this.l;
                lkz lkzVar4 = lkz.f20223a;
                return new fns(gmqVar2, clzVar4, (pfl) obj2, yjeVar, (byte) 0);
            case 5:
                yop yopVar = (yop) this.k;
                GameVideoWindowService gameVideoWindowService = (GameVideoWindowService) this.l;
                lkz lkzVar5 = lkz.f20223a;
                return new fns(yopVar, gameVideoWindowService, (pfl) obj2, yjeVar);
            case 6:
                gmq gmqVar3 = (gmq) this.k;
                GameVideoWindowService gameVideoWindowService2 = (GameVideoWindowService) this.l;
                lkz lkzVar6 = lkz.f20223a;
                return new fns(gmqVar3, gameVideoWindowService2, (j0s) obj2, yjeVar);
            case 7:
                gmq gmqVar4 = (gmq) this.k;
                GameVideoWindowService gameVideoWindowService3 = (GameVideoWindowService) this.l;
                lkz lkzVar7 = lkz.f20223a;
                return new fns(gmqVar4, gameVideoWindowService3, (gkr) obj2, yjeVar);
            case 8:
                a1t a1tVar = (a1t) this.k;
                clz clzVar5 = (clz) this.l;
                lkz lkzVar8 = lkz.f20223a;
                return new fns(a1tVar, clzVar5, (pfl) obj2, yjeVar);
            case 9:
                gmq gmqVar5 = (gmq) this.k;
                clz clzVar6 = (clz) this.l;
                lkz lkzVar9 = lkz.f20223a;
                return new fns(gmqVar5, clzVar6, (pfl) obj2, yjeVar, (char) 0);
            case 10:
                yop yopVar2 = (yop) this.k;
                GameZoneWindowService gameZoneWindowService = (GameZoneWindowService) this.l;
                lkz lkzVar10 = lkz.f20223a;
                return new fns(yopVar2, gameZoneWindowService, (pfl) obj2, yjeVar);
            case 11:
                gmq gmqVar6 = (gmq) this.k;
                GameZoneWindowService gameZoneWindowService2 = (GameZoneWindowService) this.l;
                lkz lkzVar11 = lkz.f20223a;
                return new fns(gmqVar6, gameZoneWindowService2, (j0s) obj2, yjeVar);
            case 12:
                itb itbVar = (itb) this.k;
                clz clzVar7 = (clz) this.l;
                lkz lkzVar12 = lkz.f20223a;
                return new fns(itbVar, clzVar7, (j0s) obj2, yjeVar);
            case 13:
                gmq gmqVar7 = (gmq) this.k;
                clz clzVar8 = (clz) this.l;
                lkz lkzVar13 = lkz.f20223a;
                return new fns(gmqVar7, clzVar8, (a8t) obj2, yjeVar);
            case 14:
                gmq gmqVar8 = (gmq) this.k;
                clz clzVar9 = (clz) this.l;
                lkz lkzVar14 = lkz.f20223a;
                return new fns(gmqVar8, clzVar9, (a8t) obj2, yjeVar, (byte) 0);
            case 15:
                gmq gmqVar9 = (gmq) this.k;
                clz clzVar10 = (clz) this.l;
                lkz lkzVar15 = lkz.f20223a;
                return new fns(gmqVar9, clzVar10, (a8t) obj2, yjeVar, (char) 0);
            case 16:
                gmq gmqVar10 = (gmq) this.k;
                clz clzVar11 = (clz) this.l;
                lkz lkzVar16 = lkz.f20223a;
                return new fns(gmqVar10, clzVar11, (gkr) obj2, yjeVar);
            case 17:
                xae0 xae0Var = (xae0) this.k;
                clz clzVar12 = (clz) this.l;
                lkz lkzVar17 = lkz.f20223a;
                return new fns(xae0Var, clzVar12, (a8t) obj2, yjeVar);
            case 18:
                gmq gmqVar11 = (gmq) this.k;
                clz clzVar13 = (clz) this.l;
                lkz lkzVar18 = lkz.f20223a;
                return new fns(gmqVar11, clzVar13, (a8t) obj2, yjeVar, 0);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                i89 i89Var2 = (i89) this.k;
                clz clzVar14 = (clz) this.l;
                lkz lkzVar19 = lkz.f20223a;
                return new fns(i89Var2, clzVar14, (ens) obj2, yjeVar, (byte) 0);
            case 20:
                i89 i89Var3 = (i89) this.k;
                clz clzVar15 = (clz) this.l;
                lkz lkzVar20 = lkz.f20223a;
                return new fns(i89Var3, clzVar15, (ens) obj2, yjeVar, (char) 0);
            case 21:
                gmq gmqVar12 = (gmq) this.k;
                clz clzVar16 = (clz) this.l;
                lkz lkzVar21 = lkz.f20223a;
                return new fns(gmqVar12, clzVar16, (j0s) obj2, yjeVar);
            case 22:
                fns fnsVar = new fns(this.l, obj2, yjeVar, (byte) 22);
                fnsVar.k = obj;
                return fnsVar;
            case 23:
                fns fnsVar2 = new fns(this.l, obj2, yjeVar, (byte) 23);
                fnsVar2.k = obj;
                return fnsVar2;
            case 24:
                return new fns((clz) this.l, (g8v) this.k, (s8v) obj2, yjeVar);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                i89 i89Var4 = (i89) this.k;
                clz clzVar17 = (clz) this.l;
                lkz lkzVar22 = lkz.f20223a;
                return new fns(i89Var4, clzVar17, (j0s) obj2, yjeVar);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new fns((q99) obj2, yjeVar);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new fns(yjeVar, (dgu) this.k, (String) this.l, (String) obj2);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                i89 i89Var5 = (i89) this.k;
                clz clzVar18 = (clz) this.l;
                lkz lkzVar23 = lkz.f20223a;
                return new fns(i89Var5, clzVar18, (ens) obj2, yjeVar, 0);
            default:
                gmq gmqVar13 = (gmq) this.k;
                clz clzVar19 = (clz) this.l;
                lkz lkzVar24 = lkz.f20223a;
                return new fns(gmqVar13, clzVar19, (pfl) obj2, yjeVar, 0);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((fns) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((fns) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((fns) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((fns) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((fns) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((fns) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((fns) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((fns) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((fns) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((fns) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((fns) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((fns) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((fns) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((fns) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                return ((fns) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                return ((fns) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                return ((fns) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                return ((fns) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 18:
                return ((fns) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((fns) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 20:
                return ((fns) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 21:
                return ((fns) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 22:
                return ((fns) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 23:
                return ((fns) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 24:
                return ((fns) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return ((fns) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((fns) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return ((fns) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return ((fns) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((fns) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0107 */
    /* JADX WARN: Code duplicated, block: B:101:0x0213  */
    /* JADX WARN: Code duplicated, block: B:103:0x022e  */
    /* JADX WARN: Code duplicated, block: B:104:0x0239  */
    /* JADX WARN: Code duplicated, block: B:107:0x024a  */
    /* JADX WARN: Code duplicated, block: B:349:0x0141 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x0129  */
    /* JADX WARN: Code duplicated, block: B:50:0x0133 A[Catch: all -> 0x0107, TryCatch #2 {, blocks: (B:38:0x0103, B:48:0x012b, B:50:0x0133, B:51:0x0140, B:58:0x0150, B:45:0x011d, B:60:0x0153, B:62:0x0158, B:63:0x0159, B:44:0x0117, B:52:0x0141, B:54:0x0147), top: B:351:0x00f7, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x0147 A[Catch: all -> 0x0157, TRY_LEAVE, TryCatch #1 {all -> 0x0157, blocks: (B:52:0x0141, B:54:0x0147), top: B:349:0x0141, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0153 A[Catch: all -> 0x0107, TryCatch #2 {, blocks: (B:38:0x0103, B:48:0x012b, B:50:0x0133, B:51:0x0140, B:58:0x0150, B:45:0x011d, B:60:0x0153, B:62:0x0158, B:63:0x0159, B:44:0x0117, B:52:0x0141, B:54:0x0147), top: B:351:0x00f7, inners: #1 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:54:0x0147, B:57:0x014f], limit reached: 410 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v71, types: [a.htb] */
    /* JADX WARN: Type inference failed for: r2v73, types: [a.q99] */
    /* JADX WARN: Type inference failed for: r2v74, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v75, types: [a.htb] */
    /* JADX WARN: Type inference failed for: r2v87 */
    /* JADX WARN: Type inference failed for: r2v88 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x0127 -> B:48:0x012b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 2212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.fns.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fns(i89 i89Var, clz clzVar, ens ensVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 0;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = ensVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fns(i89 i89Var, clz clzVar, ens ensVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 19;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = ensVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fns(i89 i89Var, clz clzVar, ens ensVar, yje yjeVar, char c) {
        super(2, yjeVar);
        this.i = (byte) 20;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = ensVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fns(i89 i89Var, clz clzVar, ens ensVar, yje yjeVar, int i) {
        super(2, yjeVar);
        this.i = (byte) 28;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = ensVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fns(q99 q99Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 26;
        this.m = q99Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fns(itb itbVar, clz clzVar, j0s j0sVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 12;
        lkz lkzVar = lkz.f20223a;
        this.k = itbVar;
        this.l = clzVar;
        this.m = j0sVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fns(yje yjeVar, dgu dguVar, String str, String str2) {
        super(2, yjeVar);
        this.i = (byte) 27;
        this.k = dguVar;
        this.l = str;
        this.m = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fns(yop yopVar, GameVideoWindowService gameVideoWindowService, pfl pflVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 5;
        lkz lkzVar = lkz.f20223a;
        this.k = yopVar;
        this.l = gameVideoWindowService;
        this.m = pflVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fns(yop yopVar, GameZoneWindowService gameZoneWindowService, pfl pflVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 10;
        lkz lkzVar = lkz.f20223a;
        this.k = yopVar;
        this.l = gameZoneWindowService;
        this.m = pflVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fns(gmq gmqVar, clz clzVar, pfl pflVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 3;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = pflVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fns(gmq gmqVar, clz clzVar, pfl pflVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 4;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = pflVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fns(gmq gmqVar, clz clzVar, pfl pflVar, yje yjeVar, char c) {
        super(2, yjeVar);
        this.i = (byte) 9;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = pflVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fns(gmq gmqVar, clz clzVar, pfl pflVar, yje yjeVar, int i) {
        super(2, yjeVar);
        this.i = (byte) 29;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = pflVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fns(gmq gmqVar, clz clzVar, gkr gkrVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 16;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = gkrVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fns(gmq gmqVar, clz clzVar, j0s j0sVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 21;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = j0sVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fns(gmq gmqVar, clz clzVar, a8t a8tVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 13;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = a8tVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fns(gmq gmqVar, clz clzVar, a8t a8tVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 14;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = a8tVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fns(gmq gmqVar, clz clzVar, a8t a8tVar, yje yjeVar, char c) {
        super(2, yjeVar);
        this.i = (byte) 15;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = a8tVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fns(gmq gmqVar, clz clzVar, a8t a8tVar, yje yjeVar, int i) {
        super(2, yjeVar);
        this.i = (byte) 18;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = a8tVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fns(gmq gmqVar, GameVideoWindowService gameVideoWindowService, gkr gkrVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 7;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = gameVideoWindowService;
        this.m = gkrVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fns(gmq gmqVar, GameVideoWindowService gameVideoWindowService, j0s j0sVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 6;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = gameVideoWindowService;
        this.m = j0sVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fns(gmq gmqVar, GameZoneWindowService gameZoneWindowService, j0s j0sVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 11;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = gameZoneWindowService;
        this.m = j0sVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fns(lys lysVar, clz clzVar, pfl pflVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 2;
        lkz lkzVar = lkz.f20223a;
        this.k = lysVar;
        this.l = clzVar;
        this.m = pflVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fns(a1t a1tVar, clz clzVar, pfl pflVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 8;
        lkz lkzVar = lkz.f20223a;
        this.k = a1tVar;
        this.l = clzVar;
        this.m = pflVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fns(clz clzVar, g8v g8vVar, s8v s8vVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 24;
        this.l = clzVar;
        this.k = g8vVar;
        this.m = s8vVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fns(xae0 xae0Var, clz clzVar, a8t a8tVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 17;
        lkz lkzVar = lkz.f20223a;
        this.k = xae0Var;
        this.l = clzVar;
        this.m = a8tVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fns(Object obj, Object obj2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = obj;
        this.m = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fns(boolean z, a4x a4xVar, pz40 pz40Var, pz40 pz40Var2, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 1;
        this.j = z;
        this.k = a4xVar;
        this.l = pz40Var;
        this.m = pz40Var2;
    }
}

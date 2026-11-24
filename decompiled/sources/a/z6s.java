package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class z6s implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f43885a;
    public final /* synthetic */ l7m0 b;

    public /* synthetic */ z6s(l7m0 l7m0Var, byte b) {
        this.f43885a = b;
        this.b = l7m0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        a4x a4xVar;
        byte b = this.f43885a;
        l7m0 l7m0Var = this.b;
        switch (b) {
            case 0:
                Object value = l7m0Var.getValue();
                w7s w7sVar = value instanceof w7s ? (w7s) value : null;
                if (w7sVar != null) {
                    return w7sVar.h;
                }
                return null;
            case 1:
                nek nekVar = i7s.a2;
                return Boolean.valueOf(((y7s) l7m0Var.getValue()).e());
            case 2:
                nek nekVar2 = i7s.a2;
                Object value2 = l7m0Var.getValue();
                w7s w7sVar2 = value2 instanceof w7s ? (w7s) value2 : null;
                return (w7sVar2 == null || (a4xVar = w7sVar2.g) == null) ? iun.f15405a : a4xVar;
            case 3:
                nek nekVar3 = i7s.a2;
                return ((y7s) l7m0Var.getValue()).a();
            case 4:
                nek nekVar4 = i7s.a2;
                return ((y7s) l7m0Var.getValue()).c();
            case 5:
                nek nekVar5 = i7s.a2;
                return ((y7s) l7m0Var.getValue()).b();
            case 6:
                nek nekVar6 = i7s.a2;
                return ((y7s) l7m0Var.getValue()).d();
            case 7:
                return ((dis) l7m0Var.getValue()).c;
            case 8:
                return Boolean.valueOf(((dis) l7m0Var.getValue()).b);
            case 9:
                return ((pjs) l7m0Var.getValue()).c;
            case 10:
                return ((pjs) l7m0Var.getValue()).b;
            case 11:
                nek nekVar7 = cjs.a2;
                return ((pjs) l7m0Var.getValue()).f27105a;
            case 12:
                nek nekVar8 = cjs.a2;
                return ((pjs) l7m0Var.getValue()).i;
            case 13:
                bek bekVar = kit.Q1;
                return ((git) l7m0Var.getValue()).c;
            case 14:
                bek bekVar2 = kit.Q1;
                return ((git) l7m0Var.getValue()).q;
            case 15:
                bek bekVar3 = kit.Q1;
                return ((git) l7m0Var.getValue()).f;
            case 16:
                bek bekVar4 = kit.Q1;
                return ((git) l7m0Var.getValue()).r;
            case 17:
                bek bekVar5 = kit.Q1;
                return ((git) l7m0Var.getValue()).d;
            case 18:
                bek bekVar6 = kit.Q1;
                return Boolean.valueOf(((git) l7m0Var.getValue()).n);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                bek bekVar7 = kit.Q1;
                return Boolean.valueOf(((git) l7m0Var.getValue()).o);
            case 20:
                bek bekVar8 = kit.Q1;
                return ((git) l7m0Var.getValue()).g;
            case 21:
                bek bekVar9 = kit.Q1;
                return ((git) l7m0Var.getValue()).p;
            case 22:
                bek bekVar10 = kit.Q1;
                return ((git) l7m0Var.getValue()).l;
            case 23:
                bek bekVar11 = kit.Q1;
                return ((git) l7m0Var.getValue()).m;
            case 24:
                bek bekVar12 = kit.Q1;
                return ((git) l7m0Var.getValue()).s;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                bek bekVar13 = kit.Q1;
                return Boolean.valueOf(((git) l7m0Var.getValue()).i);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                bek bekVar14 = kit.Q1;
                return ((git) l7m0Var.getValue()).h;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                bek bekVar15 = kit.Q1;
                return Boolean.valueOf(((git) l7m0Var.getValue()).j);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                bek bekVar16 = kit.Q1;
                return Boolean.valueOf(((git) l7m0Var.getValue()).f11366a);
            default:
                bek bekVar17 = kit.Q1;
                return Boolean.valueOf(((git) l7m0Var.getValue()).b);
        }
    }
}

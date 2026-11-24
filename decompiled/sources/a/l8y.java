package a;

import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes2.dex */
public abstract class l8y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g950 f19626a = g950.e(CrashHianalyticsData.MESSAGE);
    public static final g950 b = g950.e("allowedTargets");
    public static final g950 c = g950.e("value");
    public static final Map d = xp20.f(new Pair(i4m0.t, bey.c), new Pair(i4m0.w, bey.d), new Pair(i4m0.x, bey.f));

    public static rnb0 a(swq swqVar, m8y m8yVar, f7u f7uVar) {
        cqe0 cqe0VarA;
        swqVar.getClass();
        m8yVar.getClass();
        f7uVar.getClass();
        if (swqVar.equals(i4m0.m)) {
            swq swqVar2 = bey.e;
            swqVar2.getClass();
            cqe0 cqe0VarA2 = m8yVar.a(swqVar2);
            if (cqe0VarA2 != null) {
                return new v8y(cqe0VarA2, f7uVar);
            }
        }
        swq swqVar3 = (swq) d.get(swqVar);
        if (swqVar3 == null || (cqe0VarA = m8yVar.a(swqVar3)) == null) {
            return null;
        }
        return b(f7uVar, cqe0VarA, false);
    }

    public static rnb0 b(f7u f7uVar, cqe0 cqe0Var, boolean z) {
        f7uVar.getClass();
        qlc qlcVarA = bqe0.a(azw.G(azw.F(cqe0Var.f4791a)));
        swq swqVar = bey.c;
        swqVar.getClass();
        if (qlcVarA.equals(new qlc(swqVar.b(), swqVar.f32934a.g()))) {
            return new z9y(cqe0Var, f7uVar);
        }
        swq swqVar2 = bey.d;
        swqVar2.getClass();
        if (qlcVarA.equals(new qlc(swqVar2.b(), swqVar2.f32934a.g()))) {
            return new y9y(cqe0Var, f7uVar);
        }
        swq swqVar3 = bey.f;
        swqVar3.getClass();
        if (qlcVarA.equals(new qlc(swqVar3.b(), swqVar3.f32934a.g()))) {
            return new k8y(f7uVar, cqe0Var, i4m0.x);
        }
        swq swqVar4 = bey.e;
        swqVar4.getClass();
        if (qlcVarA.equals(new qlc(swqVar4.b(), swqVar4.f32934a.g()))) {
            return null;
        }
        return new i9z(f7uVar, cqe0Var, z);
    }
}

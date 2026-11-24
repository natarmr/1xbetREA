package a;

import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import kotlin.Pair;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d93 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g950 f5680a = g950.e(CrashHianalyticsData.MESSAGE);
    public static final g950 b = g950.e("replaceWith");
    public static final g950 c = g950.e("level");
    public static final g950 d = g950.e("expression");
    public static final g950 e = g950.e("imports");

    public static final tc9 a(ary aryVar, String str, String str2, String str3) {
        aryVar.getClass();
        tc9 tc9Var = new tc9(aryVar, i4m0.o, xp20.f(new Pair(d, new htm0(str2)), new Pair(e, new mx3(iun.f15405a, new c93(aryVar, (byte) 0)))));
        swq swqVar = i4m0.m;
        Pair pair = new Pair(f5680a, new htm0(str));
        Pair pair2 = new Pair(b, new e93((Object) tc9Var));
        swq swqVar2 = i4m0.n;
        swqVar2.getClass();
        return new tc9(aryVar, swqVar, xp20.f(pair, pair2, new Pair(c, new h0o(new qlc(swqVar2.b(), swqVar2.f32934a.g()), g950.e(str3)))));
    }
}

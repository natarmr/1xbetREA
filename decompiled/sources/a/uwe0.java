package a;

import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class uwe0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f36389a;
    public final /* synthetic */ dq00 b;

    public /* synthetic */ uwe0(dq00 dq00Var, byte b) {
        this.f36389a = b;
        this.b = dq00Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f36389a;
        dq00 dq00Var = this.b;
        switch (b) {
            case 0:
                aye0 aye0Var = (aye0) obj;
                aye0Var.getClass();
                q1f0 q1f0Var = aye0Var.h;
                q1f0 q1f0VarA = q1f0.a(q1f0Var, null, false, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, false, null, null, null, false, false, null, null, !q1f0Var.K, false, null, -1, 111);
                ((vzg0) dq00Var.b).e("SOCIAL_BLOCK_EXPAND", Boolean.valueOf(q1f0VarA.K));
                return new Pair(q1f0VarA, aye0Var.f);
            case 1:
                aye0 aye0Var2 = (aye0) obj;
                aye0Var2.getClass();
                q1f0 q1f0VarA2 = q1f0.a(aye0Var2.h, null, false, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, false, null, null, null, false, false, null, null, false, false, null, -1073741825, 127);
                Map mapD = dq00.d(aye0Var2, kotlin.collections.a.c(u0f0.j));
                ((vzg0) dq00Var.b).e("SOCIAL", q1f0VarA2.E);
                return new Pair(q1f0VarA2, mapD);
            case 2:
                aye0 aye0Var3 = (aye0) obj;
                aye0Var3.getClass();
                q1f0 q1f0VarA3 = q1f0.a(aye0Var3.h, null, false, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, false, null, null, null, false, false, null, null, false, false, null, -129, 127);
                Map mapD2 = dq00.d(aye0Var3, kotlin.collections.a.c(u0f0.i));
                ((vzg0) dq00Var.b).e("CURRENCY", q1f0VarA3.h);
                return new Pair(q1f0VarA3, mapD2);
            default:
                aye0 aye0Var4 = (aye0) obj;
                aye0Var4.getClass();
                q1f0 q1f0Var2 = aye0Var4.h;
                q1f0 q1f0VarA4 = q1f0.a(q1f0Var2, null, false, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, false, null, null, null, !q1f0Var2.G, false, null, null, false, false, null, -1, 126);
                ((vzg0) dq00Var.b).e("PASSWORD_REQUIREMENTS_EXPANDED", Boolean.valueOf(q1f0VarA4.G));
                return new Pair(q1f0VarA4, aye0Var4.f);
        }
    }
}

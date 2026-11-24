package a;

import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ywe0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f43367a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ dq00 c;

    public /* synthetic */ ywe0(boolean z, dq00 dq00Var, byte b) {
        this.f43367a = b;
        this.b = z;
        this.c = dq00Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f43367a;
        dq00 dq00Var = this.c;
        switch (b) {
            case 0:
                aye0 aye0Var = (aye0) obj;
                aye0Var.getClass();
                q1f0 q1f0VarA = q1f0.a(aye0Var.h, null, false, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, false, null, null, null, false, this.b, null, null, false, false, null, -1, 125);
                ((vzg0) dq00Var.b).e("HAS_BONUSES", Boolean.valueOf(q1f0VarA.c != null));
                return new Pair(q1f0VarA, aye0Var.f);
            default:
                aye0 aye0Var2 = (aye0) obj;
                aye0Var2.getClass();
                q1f0 q1f0VarA2 = q1f0.a(aye0Var2.h, null, false, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, Boolean.valueOf(this.b), null, null, null, null, false, false, null, false, false, false, null, null, null, false, false, null, null, false, false, null, -262145, 127);
                List listC = kotlin.collections.a.c(u0f0.Z);
                dq00Var.getClass();
                Map mapD = dq00.d(aye0Var2, listC);
                ((vzg0) dq00Var.b).e("POLITICALLY_EXPOSED_PERSON", q1f0VarA2.s);
                return new Pair(q1f0VarA2, mapD);
        }
    }
}

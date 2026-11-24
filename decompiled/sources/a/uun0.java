package a;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class uun0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f36309a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ uun0(long j, boolean z, long j2) {
        this.f36309a = j;
        this.b = j2;
        this.c = z;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        gvn0 gvn0Var = (gvn0) obj2;
        ((oyg0) obj).getClass();
        gvn0Var.getClass();
        List<epn0> list = gvn0Var.e;
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        for (epn0 epn0VarA : list) {
            if (epn0VarA.d == this.f36309a && epn0VarA.e == this.b) {
                epn0VarA = epn0.a(epn0VarA, this.c);
            }
            arrayList.add(epn0VarA);
        }
        return gvn0.a(gvn0Var, false, false, false, false, arrayList, null, null, 239);
    }
}

package a;

import java.util.ArrayList;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class h9z implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f12700a;
    public final i9z b;

    public /* synthetic */ h9z(i9z i9zVar, byte b) {
        this.f12700a = b;
        this.b = i9zVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws Throwable {
        byte b = this.f12700a;
        i9z i9zVar = this.b;
        switch (b) {
            case 0:
                return bqe0.a(azw.G(azw.F(i9zVar.b.f4791a))).a();
            case 1:
                swq swqVarD = i9zVar.d();
                cqe0 cqe0Var = i9zVar.b;
                f7u f7uVar = i9zVar.f14412a;
                if (swqVarD == null) {
                    return f2o.c(c2o.f1, cqe0Var.toString());
                }
                v7i v7iVar = (v7i) f7uVar.b;
                ary aryVar = ((zm40) v7iVar.j).e;
                aryVar.getClass();
                String str = bay.f2281a;
                qlc qlcVarG = bay.g(swqVarD);
                wm40 wm40VarJ = qlcVarG != null ? aryVar.j(qlcVarG.a()) : null;
                if (wm40VarJ == null) {
                    mqe0 mqe0Var = new mqe0(azw.G(azw.F(cqe0Var.f4791a)));
                    yox yoxVar = (yox) ((epi0) v7iVar.d).b;
                    if (yoxVar == null) {
                        Intrinsics.h("resolver");
                        throw null;
                    }
                    wm40VarJ = yoxVar.t(mqe0Var);
                    if (wm40VarJ == null) {
                        wm40VarJ = obb.X((zm40) v7iVar.j, new qlc(swqVarD.b(), swqVarD.f32934a.g()), (n660) ((jfk) v7iVar.f).c().n);
                    }
                }
                return wm40VarJ.I();
            default:
                ArrayList<dqe0> arrayListB = i9zVar.b.b();
                ArrayList arrayList = new ArrayList();
                for (dqe0 dqe0Var : arrayListB) {
                    g950 g950Var = dqe0Var.f6511a;
                    if (g950Var == null) {
                        g950Var = bey.b;
                    }
                    r2e r2eVarA = i9zVar.a(dqe0Var);
                    Pair pair = r2eVarA != null ? new Pair(g950Var, r2eVarA) : null;
                    if (pair != null) {
                        arrayList.add(pair);
                    }
                }
                return xp20.m(arrayList);
        }
    }
}

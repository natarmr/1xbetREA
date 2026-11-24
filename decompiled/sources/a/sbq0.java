package a;

import java.util.LinkedHashMap;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class sbq0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f31948a;
    public final /* synthetic */ xbq0 b;

    public /* synthetic */ sbq0(xbq0 xbq0Var, byte b) {
        this.f31948a = b;
        this.b = xbq0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f31948a;
        xbq0 xbq0Var = this.b;
        switch (b) {
            case 0:
                m6m0 m6m0Var = xbq0.O1;
                zbq0 zbq0VarK0 = xbq0Var.K0();
                nvu nvuVar = zbq0VarK0.m;
                ((s1p) nvuVar.b).a(dui0.c(new j1p(CollectionsKt.b0(CollectionsKt.B0(((LinkedHashMap) nvuVar.d).values(), CollectionsKt.P0(((LinkedHashMap) nvuVar.c).values())), ", ", null, null, null, 62), (byte) 0)), 3288L);
                i1w0 i1w0Var = zbq0VarK0.b;
                CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ, 0);
                while (true) {
                    paw pawVar = (paw) listIteratorP;
                    if (!pawVar.hasNext()) {
                        return Unit.f46060a;
                    }
                    i1w0Var.a((oe50) pawVar.next());
                }
                break;
            default:
                m6m0 m6m0Var2 = xbq0.O1;
                i1w0 i1w0VarF = a4n0.f(xbq0Var);
                cxi cxiVar = xbq0Var.L1;
                if (cxiVar != null) {
                    return new ry3(i1w0VarF, cxiVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
        }
    }
}

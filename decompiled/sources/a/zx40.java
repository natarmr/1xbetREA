package a;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class zx40 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f45141a;
    public final ay40 b;

    public /* synthetic */ zx40(ay40 ay40Var, byte b) {
        this.f45141a = b;
        this.b = ay40Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f45141a;
        ay40 ay40Var = this.b;
        switch (b) {
            case 0:
                qlc qlcVar = ay40Var.b;
                qpy qpyVarB = md9.b(qlcVar);
                if (qpyVarB != null) {
                    return qpyVarB;
                }
                throw new poe("Builtin class metadata not found for " + qlcVar + '.');
            case 1:
                nzs0 nzs0Var = nzs0.d;
                ArrayList arrayList = ((qpy) ay40Var.c.getValue()).c;
                xgy xgyVar = ay40Var.f1654a;
                return msm0.k(arrayList, null, xgyVar, bqe0.d(azw.G(xgyVar)));
            default:
                ArrayList arrayList2 = ((qpy) ay40Var.c.getValue()).d;
                ArrayList arrayList3 = new ArrayList(r3d.q(arrayList2, 10));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(jwb.Z((fqy) it.next(), bqe0.d(azw.G(ay40Var.f1654a)), (nzs0) ay40Var.d.getValue(), null, 12));
                }
                return arrayList3;
        }
    }
}

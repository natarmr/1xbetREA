package a;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class fw9 implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f10248a;
    public final /* synthetic */ iw9 b;

    public /* synthetic */ fw9(iw9 iw9Var, byte b) {
        this.f10248a = b;
        this.b = iw9Var;
    }

    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) {
        byte b = this.f10248a;
        iw9 iw9Var = this.b;
        switch (b) {
            case 0:
                d3a d3aVar = (d3a) obj;
                tz9 tz9Var = iw9Var.d;
                if (d3aVar instanceof z2a) {
                    if (!Intrinsics.d(((z2a) d3aVar).f43660a, tz9Var.f34794a)) {
                        jf4.n("Check failed.");
                        return null;
                    }
                    iw9Var.d(d3aVar);
                } else if (d3aVar instanceof b3a) {
                    if (!Intrinsics.d(((b3a) d3aVar).f1892a, tz9Var.f34794a)) {
                        jf4.n("Check failed.");
                        return null;
                    }
                    iw9Var.d(d3aVar);
                }
                return Unit.f46060a;
            default:
                iw9Var.d(a3a.f162a);
                return Unit.f46060a;
        }
    }
}

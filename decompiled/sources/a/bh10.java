package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
public final class bh10 implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f2583a;
    public final /* synthetic */ xk80 b;
    public final /* synthetic */ xk80 c;

    public /* synthetic */ bh10(xk80 xk80Var, xk80 xk80Var2, byte b) {
        this.f2583a = b;
        this.b = xk80Var;
        this.c = xk80Var2;
    }

    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) {
        byte b = this.f2583a;
        xk80 xk80Var = this.c;
        xk80 xk80Var2 = this.b;
        switch (b) {
            case 0:
                ((Number) obj).floatValue();
                Object objV = xk80Var2.v(xk80Var.k(), xk80Var.l(), yjeVar);
                return objV == wne.f39444a ? objV : Unit.f46060a;
            default:
                ((Number) obj).floatValue();
                Object objV2 = xk80Var2.v(xk80Var.k(), xk80Var.l(), yjeVar);
                return objV2 == wne.f39444a ? objV2 : Unit.f46060a;
        }
    }
}

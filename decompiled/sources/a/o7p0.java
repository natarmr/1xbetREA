package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o7p0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f24798a = 0;
    public final /* synthetic */ xcz b;
    public final /* synthetic */ l7m0 c;
    public final /* synthetic */ l7m0 d;

    public /* synthetic */ o7p0(xcz xczVar, l7m0 l7m0Var, l7m0 l7m0Var2, int i) {
        this.b = xczVar;
        this.c = l7m0Var;
        this.d = l7m0Var2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f24798a;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                j47.i0(x8x.L(1), fetVar, this.b, this.c, this.d);
                break;
            default:
                cfx0.t(x8x.L(1), fetVar, this.b, this.c, this.d);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ o7p0(l7m0 l7m0Var, l7m0 l7m0Var2, xcz xczVar, int i) {
        this.c = l7m0Var;
        this.d = l7m0Var2;
        this.b = xczVar;
    }
}

package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class j7m implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f16048a;
    public final /* synthetic */ xcz b;
    public final /* synthetic */ lh80 c;
    public final /* synthetic */ l7m d;
    public final /* synthetic */ int e;

    public /* synthetic */ j7m(xcz xczVar, lh80 lh80Var, l7m l7mVar, int i, byte b) {
        this.f16048a = b;
        this.b = xczVar;
        this.c = lh80Var;
        this.d = l7mVar;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f16048a;
        int i = this.e;
        l7m l7mVar = this.d;
        lh80 lh80Var = this.c;
        xcz xczVar = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                dub.o(xczVar, lh80Var, l7mVar, fetVar, x8x.L(i | 1));
                break;
            default:
                dub.Z(xczVar, lh80Var, l7mVar, fetVar, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}

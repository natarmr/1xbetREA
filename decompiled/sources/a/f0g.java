package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class f0g implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f8715a;
    public final /* synthetic */ h0g b;
    public final /* synthetic */ hh80 c;
    public final /* synthetic */ int d;

    public /* synthetic */ f0g(h0g h0gVar, hh80 hh80Var, int i, byte b) {
        this.f8715a = b;
        this.b = h0gVar;
        this.c = hh80Var;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f8715a;
        int i = this.d;
        hh80 hh80Var = this.c;
        h0g h0gVar = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                ozb.b(h0gVar, hh80Var, fetVar, x8x.L(i | 1));
                break;
            default:
                ozb.c(h0gVar, hh80Var, fetVar, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}

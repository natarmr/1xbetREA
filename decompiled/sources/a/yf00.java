package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class yf00 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f42518a;
    public final /* synthetic */ qdm0 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;

    public /* synthetic */ yf00(qdm0 qdm0Var, boolean z, int i, byte b) {
        this.f42518a = b;
        this.b = qdm0Var;
        this.c = z;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f42518a;
        int i = this.d;
        boolean z = this.c;
        qdm0 qdm0Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                yyw.f(qdm0Var, z, fetVar, x8x.L(i | 1));
                break;
            default:
                hfm0.b(qdm0Var, z, fetVar, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}

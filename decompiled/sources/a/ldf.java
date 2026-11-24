package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ldf implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f19848a;
    public final /* synthetic */ znp0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ ldf(znp0 znp0Var, String str, int i, byte b) {
        this.f19848a = b;
        this.b = znp0Var;
        this.c = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f19848a;
        String str = this.c;
        znp0 znp0Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                sj3.D(znp0Var, str, fetVar, x8x.L(1));
                break;
            default:
                yyw.n(znp0Var, str, fetVar, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }
}

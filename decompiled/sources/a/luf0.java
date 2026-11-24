package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class luf0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f20671a;
    public final /* synthetic */ wuf0 b;

    public /* synthetic */ luf0(wuf0 wuf0Var, byte b) {
        this.f20671a = b;
        this.b = wuf0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f20671a;
        wuf0 wuf0Var = this.b;
        Throwable th = (Throwable) obj;
        switch (b) {
            case 0:
                th.getClass();
                wuf0Var.l.b(th, new j5d0(th, wuf0Var, (byte) 16));
                break;
            default:
                th.getClass();
                wuf0Var.l.b(th, new yr0(th, (byte) 28));
                break;
        }
        return Unit.f46060a;
    }
}

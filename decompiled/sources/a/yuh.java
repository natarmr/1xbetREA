package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.statistic.stadium.impl.stadium.screen.StadiumScreen;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class yuh implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f43268a;
    public final /* synthetic */ dvh b;

    public /* synthetic */ yuh(dvh dvhVar, byte b) {
        this.f43268a = b;
        this.b = dvhVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f43268a;
        dvh dvhVar = this.b;
        switch (b) {
            case 0:
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                cge0 cge0Var = dvhVar.w;
                String str = ((ruh) dvhVar.D()).h;
                long j = dvhVar.r;
                cge0Var.getClass();
                k0w0Var.h(new StadiumScreen(str, j, R.string.statistic_route));
                break;
            default:
                Throwable th = (Throwable) obj;
                th.getClass();
                dvhVar.t.b(th, new yfg(dvhVar, (byte) 10));
                break;
        }
        return Unit.f46060a;
    }
}

package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class yxn0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f43431a;
    public final /* synthetic */ zyn0 b;

    public /* synthetic */ yxn0(zyn0 zyn0Var, byte b) {
        this.f43431a = b;
        this.b = zyn0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f43431a;
        zyn0 zyn0Var = this.b;
        switch (b) {
            case 0:
                if (!((vxn0) zyn0Var.D()).f) {
                    zyn0Var.N.f7161a.a(xun.f41520a, 3128L);
                    zyn0Var.p.f31532a.c("swipex_filter_end_event_call");
                }
                zyn0Var.R();
                return Unit.f46060a;
            case 1:
                return zyn0Var.d0.a();
            case 2:
                zyn0 zyn0Var2 = this.b;
                return zyn0Var2.I.a(pb10.g, R.string.data_retrieval_error, R.string.try_again_text, new cym0(0, zyn0Var2, zyn0.class, "onLottieButtonClick", "onLottieButtonClick()V", 0, (byte) 2), 10000L);
            default:
                return zyn0Var.I.a(pb10.g, R.string.change_filters_alert, R.string.go_to_filter_screen, new yxn0(zyn0Var, (byte) 0), 10000L);
        }
    }
}

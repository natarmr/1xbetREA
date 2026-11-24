package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class dr9 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f6547a;
    public final /* synthetic */ mr9 b;

    public /* synthetic */ dr9(mr9 mr9Var, byte b) {
        this.f6547a = b;
        this.b = mr9Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object value;
        switch (this.f6547a) {
            case 0:
                mr9 mr9Var = this.b;
                return mr9Var.g.a(pb10.g, R.string.data_retrieval_error, R.string.try_again_text, new pw4(0, mr9Var, mr9.class, "onReloadScreenContent", "onReloadScreenContent()V", 0, (byte) 14), 9000L);
            default:
                p7m0 p7m0Var = this.b.l;
                do {
                    value = p7m0Var.getValue();
                } while (!p7m0Var.m(value, es9.a((es9) value, null, null, false, null, 3)));
                return Unit.f46060a;
        }
    }
}

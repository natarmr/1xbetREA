package a;

import kotlin.jvm.functions.Function0;
import okhttp3.logging.HttpLoggingInterceptor;

/* JADX INFO: loaded from: classes2.dex */
public final class cw00 extends guy implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dw00 f5056a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cw00(dw00 dw00Var) {
        super(0);
        this.f5056a = dw00Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new HttpLoggingInterceptor(new bw00(this.f5056a));
    }
}

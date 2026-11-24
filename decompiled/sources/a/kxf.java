package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.uikit.components.lottie_empty.DSLottieEmptyContainer;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class kxf implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f19052a;
    public final /* synthetic */ jkm b;

    public /* synthetic */ kxf(jkm jkmVar, byte b) {
        this.f19052a = b;
        this.b = jkmVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f19052a;
        jkm jkmVar = this.b;
        switch (b) {
            case 0:
                cb10 cb10Var = (cb10) obj;
                cb10Var.getClass();
                DSLottieEmptyContainer dSLottieEmptyContainer = cb10Var.b;
                int i = DSLottieEmptyContainer.d;
                dSLottieEmptyContainer.b(jkmVar, 10000L, new bmh((byte) 12));
                break;
            case 1:
                cb10 cb10Var2 = (cb10) obj;
                cb10Var2.getClass();
                DSLottieEmptyContainer dSLottieEmptyContainer2 = cb10Var2.b;
                int i2 = DSLottieEmptyContainer.d;
                dSLottieEmptyContainer2.b(jkmVar, 10000L, new bmh((byte) 12));
                break;
            default:
                db10 db10Var = (db10) obj;
                db10Var.getClass();
                DSLottieEmptyContainer dSLottieEmptyContainer3 = db10Var.b;
                int i3 = DSLottieEmptyContainer.d;
                dSLottieEmptyContainer3.b(jkmVar, 10000L, new bmh((byte) 12));
                break;
        }
        return Unit.f46060a;
    }
}

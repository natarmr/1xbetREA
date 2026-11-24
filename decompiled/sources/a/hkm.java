package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.uikit.components.lottie_empty.DsLottieEmpty;

/* JADX INFO: loaded from: classes6.dex */
public final class hkm extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ long j;
    public final /* synthetic */ DsLottieEmpty k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hkm(DsLottieEmpty dsLottieEmpty, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = dsLottieEmpty;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                hkm hkmVar = new hkm(this.k, yjeVar, (byte) 0);
                hkmVar.j = ((Number) obj).longValue();
                return hkmVar;
            default:
                hkm hkmVar2 = new hkm(this.k, yjeVar, (byte) 1);
                hkmVar2.j = ((Number) obj).longValue();
                return hkmVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Number number = (Number) obj;
        switch (this.i) {
            case 0:
                return ((hkm) create(Long.valueOf(number.longValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((hkm) create(Long.valueOf(number.longValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        DsLottieEmpty dsLottieEmpty = this.k;
        long j = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                try {
                    dsLottieEmpty.getCaptionView().setText(dsLottieEmpty.getContext().getString(R.string.update_again_after_v2, String.valueOf(j / 1000)));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                dsLottieEmpty.getCaptionView().setText(dsLottieEmpty.getContext().getString(R.string.update_again_after_v2, String.valueOf(j / 1000)));
                break;
        }
        return Unit.f46060a;
    }
}

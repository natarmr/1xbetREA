package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class brx extends bnn0 implements Function1 {
    public final /* synthetic */ byte i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ brx(int i, yje yjeVar, byte b) {
        super(i, yjeVar);
        this.i = b;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        switch (this.i) {
            case 0:
                return new brx(1, yjeVar, (byte) 0);
            default:
                return new brx(1, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        yje yjeVar = (yje) obj;
        switch (this.i) {
            case 0:
                ((brx) create(yjeVar)).invokeSuspend(Unit.f46060a);
                return Boolean.TRUE;
            default:
                return ((brx) create(yjeVar)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        switch (this.i) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                return Boolean.TRUE;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                return Unit.f46060a;
        }
    }
}

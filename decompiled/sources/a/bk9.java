package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class bk9 extends bnn0 implements xdr {
    public final /* synthetic */ byte i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bk9(int i, yje yjeVar, byte b) {
        super(i, yjeVar);
        this.i = b;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = 3;
        switch (this.i) {
            case 0:
                return new bk9(b, (yje) obj3, (byte) 0).invokeSuspend(Unit.f46060a);
            case 1:
                long j = ((ne60) obj2).f23370a;
                return new bk9(b, (yje) obj3, (byte) 1).invokeSuspend(Unit.f46060a);
            case 2:
                ((Number) obj2).floatValue();
                return new bk9(b, (yje) obj3, (byte) 2).invokeSuspend(Unit.f46060a);
            case 3:
                ((Number) obj).intValue();
                new bk9(b, (yje) obj3, b).invokeSuspend(Unit.f46060a);
                return Boolean.FALSE;
            case 4:
                return new bk9(b, (yje) obj3, (byte) 4).invokeSuspend(Unit.f46060a);
            default:
                long j2 = ((ne60) obj2).f23370a;
                return new bk9(b, (yje) obj3, (byte) 5).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        switch (this.i) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                return Unit.f46060a;
            case 2:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                return Unit.f46060a;
            case 3:
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                return Boolean.FALSE;
            case 4:
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                return Unit.f46060a;
            default:
                wne wneVar6 = wne.f39444a;
                z1x.P(obj);
                return Unit.f46060a;
        }
    }
}

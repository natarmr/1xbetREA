package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class okp0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f25416a;
    public final /* synthetic */ mdm b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ okp0(mdm mdmVar, Function1 function1, int i, byte b) {
        this.f25416a = b;
        this.b = mdmVar;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f25416a;
        Function1 function1 = this.c;
        mdm mdmVar = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                ny9.p(mdmVar, function1, fetVar, x8x.L(1));
                break;
            case 1:
                p8a.s(mdmVar, function1, fetVar, x8x.L(1));
                break;
            case 2:
                ofm0.a(mdmVar, function1, fetVar, x8x.L(1));
                break;
            case 3:
                zgc.r(mdmVar, function1, fetVar, x8x.L(1));
                break;
            case 4:
                tke.y(mdmVar, function1, fetVar, x8x.L(1));
                break;
            case 5:
                dqm0.a(mdmVar, function1, fetVar, x8x.L(1));
                break;
            case 6:
                ju70.t(mdmVar, function1, fetVar, x8x.L(1));
                break;
            case 7:
                cwr0.q(mdmVar, function1, fetVar, x8x.L(1));
                break;
            case 8:
                dwi0.p(mdmVar, function1, fetVar, x8x.L(1));
                break;
            case 9:
                gq80.x(mdmVar, function1, fetVar, x8x.L(1));
                break;
            default:
                wha0.p(mdmVar, function1, fetVar, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }
}

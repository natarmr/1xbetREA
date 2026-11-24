package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class wo6 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39478a;
    public final /* synthetic */ mdm b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ int d;

    public /* synthetic */ wo6(mdm mdmVar, Function1 function1, int i, byte b) {
        this.f39478a = b;
        this.b = mdmVar;
        this.c = function1;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f39478a;
        int i = this.d;
        Function1 function1 = this.c;
        mdm mdmVar = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                gq80.t(mdmVar, function1, fetVar, x8x.L(i | 1));
                break;
            case 1:
                qjj.r(mdmVar, function1, fetVar, x8x.L(i | 1));
                break;
            case 2:
                nia0.w(mdmVar, function1, fetVar, x8x.L(i | 1));
                break;
            case 3:
                ay3.p(mdmVar, function1, fetVar, x8x.L(i | 1));
                break;
            case 4:
                b34.r(mdmVar, function1, fetVar, x8x.L(i | 1));
                break;
            case 5:
                q8a.k(mdmVar, function1, fetVar, x8x.L(i | 1));
                break;
            case 6:
                m0x0.r(mdmVar, function1, fetVar, x8x.L(i | 1));
                break;
            default:
                y0x0.m(mdmVar, function1, fetVar, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}

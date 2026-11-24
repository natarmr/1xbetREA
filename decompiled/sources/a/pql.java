package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class pql implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f27421a;
    public final /* synthetic */ zql b;
    public final /* synthetic */ int c;

    public /* synthetic */ pql(zql zqlVar, int i, byte b) {
        this.f27421a = b;
        this.b = zqlVar;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f27421a;
        int i = this.c;
        zql zqlVar = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                obc.m(zqlVar, fetVar, x8x.L(i | 1));
                break;
            case 1:
                vbc.t(zqlVar, fetVar, x8x.L(i | 1));
                break;
            case 2:
                qcc.g(zqlVar, fetVar, x8x.L(i | 1));
                break;
            default:
                tdc.h(zqlVar, fetVar, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}

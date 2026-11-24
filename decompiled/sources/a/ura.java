package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ura implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f36154a;
    public final /* synthetic */ xra b;
    public final /* synthetic */ bzl c;
    public final /* synthetic */ int d;

    public /* synthetic */ ura(xra xraVar, bzl bzlVar, int i, byte b) {
        this.f36154a = b;
        this.b = xraVar;
        this.c = bzlVar;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f36154a;
        int i = this.d;
        bzl bzlVar = this.c;
        xra xraVar = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        cl5 cl5Var = xra.X1;
        switch (b) {
            case 0:
                xraVar.G0(bzlVar, fetVar, x8x.L(i | 1));
                break;
            case 1:
                xraVar.H0(bzlVar, fetVar, x8x.L(i | 1));
                break;
            case 2:
                xraVar.K0(bzlVar, fetVar, x8x.L(i | 1));
                break;
            case 3:
                xraVar.J0(bzlVar, fetVar, x8x.L(i | 1));
                break;
            case 4:
                xraVar.L0(bzlVar, fetVar, x8x.L(i | 1));
                break;
            default:
                xraVar.I0(bzlVar, fetVar, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}

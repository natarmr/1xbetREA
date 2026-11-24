package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d5b implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5498a;
    public final /* synthetic */ g5b b;
    public final /* synthetic */ bzl c;
    public final /* synthetic */ int d;

    public /* synthetic */ d5b(g5b g5bVar, bzl bzlVar, int i, byte b) {
        this.f5498a = b;
        this.b = g5bVar;
        this.c = bzlVar;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f5498a;
        int i = this.d;
        bzl bzlVar = this.c;
        g5b g5bVar = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        gl5 gl5Var = g5b.c2;
        switch (b) {
            case 0:
                g5bVar.G0(bzlVar, fetVar, x8x.L(i | 1));
                break;
            case 1:
                g5bVar.L0(bzlVar, fetVar, x8x.L(i | 1));
                break;
            case 2:
                g5bVar.N0(bzlVar, fetVar, x8x.L(i | 1));
                break;
            case 3:
                g5bVar.M0(bzlVar, fetVar, x8x.L(i | 1));
                break;
            case 4:
                g5bVar.J0(bzlVar, fetVar, x8x.L(i | 1));
                break;
            case 5:
                g5bVar.H0(bzlVar, fetVar, x8x.L(i | 1));
                break;
            case 6:
                g5bVar.I0(bzlVar, fetVar, x8x.L(i | 1));
                break;
            default:
                g5bVar.K0(bzlVar, fetVar, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}

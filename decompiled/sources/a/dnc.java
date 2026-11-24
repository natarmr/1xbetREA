package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class dnc implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f6361a;
    public final /* synthetic */ gnc b;
    public final /* synthetic */ int c;

    public /* synthetic */ dnc(gnc gncVar, int i, byte b) {
        this.f6361a = b;
        this.b = gncVar;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f6361a;
        int i = this.c;
        gnc gncVar = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        kl5 kl5Var = gnc.Z1;
        switch (b) {
            case 0:
                gncVar.G0(x8x.L(i | 1), fetVar);
                break;
            case 1:
                gncVar.J0(x8x.L(i | 1), fetVar);
                break;
            case 2:
                gncVar.H0(x8x.L(i | 1), fetVar);
                break;
            default:
                gncVar.I0(x8x.L(i | 1), fetVar);
                break;
        }
        return Unit.f46060a;
    }
}

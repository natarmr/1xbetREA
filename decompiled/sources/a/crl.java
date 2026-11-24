package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class crl implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f4850a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ krl c;
    public final /* synthetic */ int d;

    public /* synthetic */ crl(mm40 mm40Var, krl krlVar, int i, byte b) {
        this.f4850a = b;
        this.b = mm40Var;
        this.c = krlVar;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f4850a;
        int i = this.d;
        krl krlVar = this.c;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                agc.m(mm40Var, krlVar, fetVar, x8x.L(i | 1));
                break;
            case 1:
                hic.h(mm40Var, krlVar, fetVar, x8x.L(i | 1));
                break;
            default:
                plc.g(mm40Var, krlVar, fetVar, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}

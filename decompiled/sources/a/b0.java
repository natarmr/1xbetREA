package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1744a;
    public final /* synthetic */ ugd b;
    public final /* synthetic */ int c;

    public /* synthetic */ b0(int i, ugd ugdVar, int i2) {
        this.f1744a = (byte) 0;
        this.c = i;
        this.b = ugdVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f1744a;
        int i = this.c;
        ugd ugdVar = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                ay3.u(i, ugdVar, fetVar, x8x.L(49));
                break;
            case 1:
                saj.L(ugdVar, fetVar, x8x.L(i | 1));
                break;
            case 2:
                rcb.i(ugdVar, fetVar, x8x.L(i | 1));
                break;
            default:
                xf0.y(ugdVar, fetVar, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ b0(ugd ugdVar, int i, byte b) {
        this.f1744a = b;
        this.b = ugdVar;
        this.c = i;
    }
}

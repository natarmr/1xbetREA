package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class z460 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f43754a;
    public final /* synthetic */ y5d b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;

    public /* synthetic */ z460(y5d y5dVar, String str, int i, byte b) {
        this.f43754a = b;
        this.b = y5dVar;
        this.c = str;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f43754a;
        int i = this.d;
        String str = this.c;
        y5d y5dVar = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                b8k0.q(y5dVar, str, fetVar, x8x.L(i | 1));
                break;
            case 1:
                qsm0.l(y5dVar, str, fetVar, x8x.L(i | 1));
                break;
            default:
                xsm0.h(y5dVar, str, fetVar, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}

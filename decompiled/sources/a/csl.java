package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class csl implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f4895a;
    public final /* synthetic */ py1 b;
    public final /* synthetic */ int c;

    public /* synthetic */ csl(py1 py1Var, int i, byte b) {
        this.f4895a = b;
        this.b = py1Var;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f4895a;
        fet fetVar = (fet) obj;
        ((Integer) obj2).intValue();
        switch (b) {
            case 0:
                feb.b(this.b, fetVar, x8x.L(this.c | 1));
                break;
            case 1:
                ieb.b(this.b, fetVar, x8x.L(this.c | 1));
                break;
            default:
                jeb.b(this.b, fetVar, x8x.L(this.c | 1));
                break;
        }
        return Unit.f46060a;
    }
}

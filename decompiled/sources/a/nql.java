package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class nql implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f23966a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ yql c;
    public final /* synthetic */ int d;

    public /* synthetic */ nql(mm40 mm40Var, yql yqlVar, int i, byte b) {
        this.f23966a = b;
        this.b = mm40Var;
        this.c = yqlVar;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f23966a;
        int i = this.d;
        yql yqlVar = this.c;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                mbc.m(mm40Var, yqlVar, fetVar, x8x.L(i | 1));
                break;
            case 1:
                qbc.j(mm40Var, yqlVar, fetVar, x8x.L(i | 1));
                break;
            case 2:
                xbc.k(mm40Var, yqlVar, fetVar, x8x.L(i | 1));
                break;
            default:
                vcc.f(mm40Var, yqlVar, fetVar, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}

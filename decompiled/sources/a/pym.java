package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class pym implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f27807a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ c280 e;
    public final /* synthetic */ c280 f;
    public final /* synthetic */ y1m g;
    public final /* synthetic */ boolean h;

    public /* synthetic */ pym(mm40 mm40Var, String str, String str2, c280 c280Var, c280 c280Var2, y1m y1mVar, boolean z, int i, byte b) {
        this.f27807a = b;
        this.b = mm40Var;
        this.c = str;
        this.d = str2;
        this.e = c280Var;
        this.f = c280Var2;
        this.g = y1mVar;
        this.h = z;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f27807a) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(1);
                ckb.B(this.b, this.c, this.d, this.e, this.f, this.g, this.h, (fet) obj, iL);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(1);
                gkb.y(this.b, this.c, this.d, this.e, this.f, this.g, this.h, (fet) obj, iL2);
                break;
        }
        return Unit.f46060a;
    }
}

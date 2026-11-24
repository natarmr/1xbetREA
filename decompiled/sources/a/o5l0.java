package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class o5l0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f24693a;
    public final /* synthetic */ c280 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ c280 d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ long g;
    public final /* synthetic */ String h;
    public final /* synthetic */ long i;

    public /* synthetic */ o5l0(c280 c280Var, String str, c280 c280Var2, String str2, String str3, long j, String str4, long j2, int i, byte b) {
        this.f24693a = b;
        this.b = c280Var;
        this.c = str;
        this.d = c280Var2;
        this.e = str2;
        this.f = str3;
        this.g = j;
        this.h = str4;
        this.i = j2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f24693a) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(1);
                c9x.f(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, (fet) obj, iL);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(1);
                w9x.g(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, (fet) obj, iL2);
                break;
        }
        return Unit.f46060a;
    }
}

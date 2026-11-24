package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class q5l0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f28156a;
    public final /* synthetic */ d280 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ d280 d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ long g;
    public final /* synthetic */ String h;
    public final /* synthetic */ long i;

    public /* synthetic */ q5l0(d280 d280Var, String str, String str2, long j, d280 d280Var2, String str3, String str4, long j2, int i) {
        this.f28156a = (byte) 3;
        this.b = d280Var;
        this.c = str;
        this.e = str2;
        this.g = j;
        this.d = d280Var2;
        this.f = str3;
        this.h = str4;
        this.i = j2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f28156a) {
            case 0:
                ((Integer) obj2).getClass();
                d9x.k(x8x.L(1), this.g, this.i, (fet) obj, this.b, this.d, this.c, this.e, this.f, this.h);
                break;
            case 1:
                ((Integer) obj2).getClass();
                e9x.n(x8x.L(1), this.g, this.i, (fet) obj, this.b, this.d, this.c, this.e, this.f, this.h);
                break;
            case 2:
                ((Integer) obj2).getClass();
                k9x.h(x8x.L(1), this.g, this.i, (fet) obj, this.b, this.d, this.c, this.e, this.f, this.h);
                break;
            default:
                ((Integer) obj2).getClass();
                t9x.k(x8x.L(1), this.g, this.i, (fet) obj, this.b, this.d, this.c, this.e, this.f, this.h);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ q5l0(d280 d280Var, String str, d280 d280Var2, String str2, String str3, long j, String str4, long j2, int i, byte b) {
        this.f28156a = b;
        this.b = d280Var;
        this.c = str;
        this.d = d280Var2;
        this.e = str2;
        this.f = str3;
        this.g = j;
        this.h = str4;
        this.i = j2;
    }
}

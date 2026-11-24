package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class s5l0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f31659a;
    public final /* synthetic */ c280 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ c280 d;
    public final /* synthetic */ String e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ String g;
    public final /* synthetic */ long h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ String j;
    public final /* synthetic */ long k;

    public /* synthetic */ s5l0(c280 c280Var, c280 c280Var2, String str, String str2, boolean z, boolean z2, String str3, String str4, long j, long j2, int i) {
        this.f31659a = (byte) 2;
        this.b = c280Var;
        this.d = c280Var2;
        this.c = str;
        this.e = str2;
        this.f = z;
        this.i = z2;
        this.g = str3;
        this.j = str4;
        this.h = j;
        this.k = j2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f31659a) {
            case 0:
                ((Integer) obj2).getClass();
                x9x.p(x8x.L(1), this.h, this.k, (fet) obj, this.b, this.d, this.c, this.e, this.g, this.j, this.f, this.i);
                break;
            case 1:
                ((Integer) obj2).getClass();
                kcx.l(x8x.L(1), this.h, this.k, (fet) obj, this.b, this.d, this.c, this.e, this.g, this.j, this.f, this.i);
                break;
            case 2:
                ((Integer) obj2).getClass();
                bdx.o(x8x.L(1), this.h, this.k, (fet) obj, this.b, this.d, this.c, this.e, this.g, this.j, this.f, this.i);
                break;
            case 3:
                ((Integer) obj2).getClass();
                idx.g(x8x.L(1), this.h, this.k, (fet) obj, this.b, this.d, this.c, this.e, this.g, this.j, this.f, this.i);
                break;
            default:
                ((Integer) obj2).getClass();
                vdx.m(x8x.L(1), this.h, this.k, (fet) obj, this.b, this.d, this.c, this.e, this.g, this.j, this.f, this.i);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ s5l0(c280 c280Var, String str, c280 c280Var2, String str2, boolean z, String str3, long j, boolean z2, String str4, long j2, int i, byte b) {
        this.f31659a = b;
        this.b = c280Var;
        this.c = str;
        this.d = c280Var2;
        this.e = str2;
        this.f = z;
        this.g = str3;
        this.h = j;
        this.i = z2;
        this.j = str4;
        this.k = j2;
    }
}

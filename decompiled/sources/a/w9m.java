package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class w9m implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f38787a;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;

    public /* synthetic */ w9m(String str, long j, int i, byte b) {
        this.f38787a = b;
        this.b = str;
        this.c = j;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f38787a;
        fet fetVar = (fet) obj;
        ((Integer) obj2).intValue();
        switch (b) {
            case 0:
                ibc.B(this.b, this.c, fetVar, x8x.L(this.d | 1));
                break;
            case 1:
                c9x.k(this.b, this.c, fetVar, x8x.L(this.d | 1));
                break;
            case 2:
                d9x.y(this.b, this.c, fetVar, x8x.L(this.d | 1));
                break;
            case 3:
                e9x.y(this.b, this.c, fetVar, x8x.L(this.d | 1));
                break;
            case 4:
                k9x.t(this.b, this.c, fetVar, x8x.L(this.d | 1));
                break;
            case 5:
                t9x.v(this.b, this.c, fetVar, x8x.L(this.d | 1));
                break;
            case 6:
                w9x.t(this.b, this.c, fetVar, x8x.L(this.d | 1));
                break;
            default:
                ucx.G(this.b, this.c, fetVar, x8x.L(this.d | 1));
                break;
        }
        return Unit.f46060a;
    }
}

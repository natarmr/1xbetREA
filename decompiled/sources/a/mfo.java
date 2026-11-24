package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class mfo implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f21702a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ v3n f;
    public final /* synthetic */ Function0 g;
    public final /* synthetic */ int h;

    public /* synthetic */ mfo(mm40 mm40Var, String str, String str2, boolean z, v3n v3nVar, Function0 function0, int i, byte b) {
        this.f21702a = b;
        this.b = mm40Var;
        this.c = str;
        this.d = str2;
        this.e = z;
        this.f = v3nVar;
        this.g = function0;
        this.h = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f21702a;
        int i = this.h;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                kbc.A(this.b, this.c, this.d, this.e, this.f, this.g, (fet) obj, x8x.L(i | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                kbc.B(this.b, this.c, this.d, this.e, this.f, this.g, (fet) obj, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}

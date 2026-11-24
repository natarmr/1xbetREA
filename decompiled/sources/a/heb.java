package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class heb implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f12914a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ chl0 d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ int g;

    public /* synthetic */ heb(mm40 mm40Var, String str, chl0 chl0Var, boolean z, Function0 function0, int i, byte b) {
        this.f12914a = b;
        this.b = mm40Var;
        this.c = str;
        this.d = chl0Var;
        this.e = z;
        this.f = function0;
        this.g = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f12914a;
        int i = this.g;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                ieb.e(this.b, this.c, this.d, this.e, this.f, (fet) obj, x8x.L(i | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                d9x.a(this.b, this.c, this.d, this.e, this.f, (fet) obj, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}

package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class bl9 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f2783a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ jej c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ Function1 f;
    public final /* synthetic */ int g;

    public /* synthetic */ bl9(mm40 mm40Var, jej jejVar, String str, String str2, Function1 function1, int i, byte b) {
        this.f2783a = b;
        this.b = mm40Var;
        this.c = jejVar;
        this.d = str;
        this.e = str2;
        this.f = function1;
        this.g = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f2783a) {
            case 0:
                ((Integer) obj2).getClass();
                unh0.l(this.b, this.c, this.d, this.e, this.f, (fet) obj, x8x.L(this.g | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                sj3.h(this.b, this.c, this.d, this.e, this.f, (fet) obj, x8x.L(this.g | 1));
                break;
        }
        return Unit.f46060a;
    }
}

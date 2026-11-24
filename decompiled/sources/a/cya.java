package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cya implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5163a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ Function0 g;

    public /* synthetic */ cya(mm40 mm40Var, boolean z, String str, String str2, Function0 function0, Function0 function1, int i, byte b) {
        this.f5163a = b;
        this.b = mm40Var;
        this.c = z;
        this.d = str;
        this.e = str2;
        this.f = function0;
        this.g = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f5163a) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(1);
                zgc.h(this.b, this.c, this.d, this.e, this.f, this.g, (fet) obj, iL);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(1);
                aad.i(this.b, this.c, this.d, this.e, this.f, this.g, (fet) obj, iL2);
                break;
        }
        return Unit.f46060a;
    }
}

package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class yvw implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f43340a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ mm40 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ yjj0 e;
    public final /* synthetic */ wvw f;
    public final /* synthetic */ ugd g;
    public final /* synthetic */ int h;

    public /* synthetic */ yvw(mm40 mm40Var, Function0 function0, boolean z, yjj0 yjj0Var, wvw wvwVar, ugd ugdVar, int i) {
        this.f43340a = (byte) 0;
        this.c = mm40Var;
        this.b = function0;
        this.d = z;
        this.e = yjj0Var;
        this.f = wvwVar;
        this.g = ugdVar;
        this.h = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f43340a;
        int i = this.h;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                zvw.e(x8x.L(i | 1), this.g, (fet) obj, this.f, this.c, this.e, this.b, this.d);
                break;
            case 1:
                ((Integer) obj2).getClass();
                zvw.b(x8x.L(i | 1), this.g, (fet) obj, this.f, this.c, this.e, this.b, this.d);
                break;
            default:
                ((Integer) obj2).getClass();
                zvw.w(x8x.L(i | 1), this.g, (fet) obj, this.f, this.c, this.e, this.b, this.d);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ yvw(Function0 function0, mm40 mm40Var, boolean z, yjj0 yjj0Var, wvw wvwVar, ugd ugdVar, int i, byte b) {
        this.f43340a = b;
        this.b = function0;
        this.c = mm40Var;
        this.d = z;
        this.e = yjj0Var;
        this.f = wvwVar;
        this.g = ugdVar;
        this.h = i;
    }
}

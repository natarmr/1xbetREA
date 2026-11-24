package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class w1i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f38400a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ u1i c;
    public final /* synthetic */ u1i d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ Function0 g;
    public final /* synthetic */ int h;

    public /* synthetic */ w1i(mm40 mm40Var, u1i u1iVar, u1i u1iVar2, boolean z, Function0 function0, Function0 function1, int i, byte b) {
        this.f38400a = b;
        this.b = mm40Var;
        this.c = u1iVar;
        this.d = u1iVar2;
        this.e = z;
        this.f = function0;
        this.g = function1;
        this.h = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f38400a;
        int i = this.h;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                wzb.l(this.b, this.c, this.d, this.e, this.f, this.g, (fet) obj, x8x.L(i | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                e3c.d(this.b, this.c, this.d, this.e, this.f, this.g, (fet) obj, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}

package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class so0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f32519a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ pp0 c;
    public final /* synthetic */ lh80 d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ int g;

    public /* synthetic */ so0(mm40 mm40Var, pp0 pp0Var, lh80 lh80Var, Function0 function0, Function1 function1, int i) {
        this.f32519a = (byte) 0;
        this.b = mm40Var;
        this.c = pp0Var;
        this.d = lh80Var;
        this.f = function0;
        this.e = function1;
        this.g = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f32519a;
        int i = this.g;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                wha0.b(x8x.L(i | 1), this.c, (fet) obj, this.b, this.d, this.f, this.e);
                break;
            case 1:
                ((Integer) obj2).getClass();
                nia0.d(x8x.L(i | 1), this.c, (fet) obj, this.b, this.d, this.f, this.e);
                break;
            default:
                ((Integer) obj2).getClass();
                xia0.b(x8x.L(i | 1), this.c, (fet) obj, this.b, this.d, this.f, this.e);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ so0(mm40 mm40Var, pp0 pp0Var, lh80 lh80Var, Function1 function1, Function0 function0, int i, byte b) {
        this.f32519a = b;
        this.b = mm40Var;
        this.c = pp0Var;
        this.d = lh80Var;
        this.e = function1;
        this.f = function0;
        this.g = i;
    }
}

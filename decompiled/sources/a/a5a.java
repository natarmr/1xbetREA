package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class a5a implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f261a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Function0 d;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ a5a(int i, int i2, mm40 mm40Var, Function0 function0) {
        this.f261a = (byte) 0;
        this.b = mm40Var;
        this.d = function0;
        this.c = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f261a;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                int iL = x8x.L(1);
                boolean z = this.c;
                jd8.o(iL, z ? 1 : 0, fetVar, this.b, this.d);
                break;
            case 1:
                xia0.w(x8x.L(7), fetVar, this.b, this.d, this.c);
                break;
            case 2:
                i5m.a(x8x.L(1), fetVar, this.b, this.d, this.c);
                break;
            case 3:
                sj3.w(x8x.L(1), fetVar, this.b, this.d, this.c);
                break;
            case 4:
                q7x.j(x8x.L(1), fetVar, this.b, this.d, this.c);
                break;
            default:
                ihm0.b(x8x.L(1), fetVar, this.b, this.d, this.c);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ a5a(mm40 mm40Var, boolean z, Function0 function0, int i, byte b) {
        this.f261a = b;
        this.b = mm40Var;
        this.c = z;
        this.d = function0;
    }
}

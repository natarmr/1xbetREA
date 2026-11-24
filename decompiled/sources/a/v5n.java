package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class v5n implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f36833a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ int g;
    public final /* synthetic */ boolean h;

    public /* synthetic */ v5n(String str, Function0 function0, mm40 mm40Var, long j, long j2, boolean z, int i) {
        this.f36833a = (byte) 2;
        this.c = str;
        this.f = function0;
        this.b = mm40Var;
        this.d = j;
        this.e = j2;
        this.h = z;
        this.g = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f36833a;
        int i = this.g;
        Object obj3 = this.f;
        Object obj4 = this.c;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(i | 1);
                z5n.c(this.b, (s4i) obj4, this.d, this.e, (qao0) obj3, (fet) obj, iL, this.h ? 1 : 0);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(i | 1);
                z5n.c(this.b, (s4i) obj4, this.d, this.e, (qao0) obj3, (fet) obj, iL2, this.h ? 1 : 0);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL3 = x8x.L(i | 1);
                s5x0.e((String) obj4, (Function0) obj3, this.b, this.d, this.e, this.h, (fet) obj, iL3);
                break;
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ v5n(mm40 mm40Var, s4i s4iVar, long j, long j2, qao0 qao0Var, int i, int i2, byte b) {
        this.f36833a = b;
        this.b = mm40Var;
        this.c = s4iVar;
        this.d = j;
        this.e = j2;
        this.f = qao0Var;
        this.g = i;
        this.h = i2;
    }
}

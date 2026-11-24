package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class hsh0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f13583a = 0;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ hsh0(int i, int i2, String str, String str2, boolean z, mm40 mm40Var, int i3) {
        this.e = i;
        this.f = i2;
        this.c = str;
        this.g = str2;
        this.d = z;
        this.b = mm40Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f13583a) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(1);
                t9x.w(this.e, this.f, this.c, (String) this.g, this.d, this.b, (fet) obj, iL);
                break;
            default:
                ((Integer) obj2).getClass();
                wgm0.g(this.b, this.c, (q7q0) this.g, this.d, this.e, (fet) obj, x8x.L(this.f | 1));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ hsh0(mm40 mm40Var, String str, q7q0 q7q0Var, boolean z, int i, int i2) {
        this.b = mm40Var;
        this.c = str;
        this.g = q7q0Var;
        this.d = z;
        this.e = i;
        this.f = i2;
    }
}

package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class lwm implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f20771a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ boolean g;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ lwm(mm40 mm40Var, int i, String str, String str2, String str3, int i2, int i3, byte b) {
        this.f20771a = b;
        this.b = mm40Var;
        this.c = i;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f20771a) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(1);
                n4c.B(this.b, this.c, this.d, this.e, this.f, (fet) obj, iL, this.g ? 1 : 0);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(1);
                n4c.x(this.b, this.c, this.d, this.e, this.f, (fet) obj, iL2, this.g ? 1 : 0);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iL3 = x8x.L(1);
                aac.y(this.b, this.c, this.d, this.e, this.f, (fet) obj, iL3, this.g ? 1 : 0);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iL4 = x8x.L(1);
                aac.E(this.b, this.c, this.d, this.e, this.f, (fet) obj, iL4, this.g ? 1 : 0);
                break;
            case 4:
                ((Integer) obj2).getClass();
                int iL5 = x8x.L(1);
                sac.A(this.b, this.c, this.d, this.e, this.f, (fet) obj, iL5, this.g ? 1 : 0);
                break;
            case 5:
                ((Integer) obj2).getClass();
                int iL6 = x8x.L(1);
                sac.F(this.b, this.c, this.d, this.e, this.f, (fet) obj, iL6, this.g ? 1 : 0);
                break;
            case 6:
                ((Integer) obj2).getClass();
                int iL7 = x8x.L(1);
                ebc.R(this.b, this.c, this.d, this.e, this.f, (fet) obj, iL7, this.g ? 1 : 0);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL8 = x8x.L(1);
                ebc.K(this.b, this.c, this.d, this.e, this.f, (fet) obj, iL8, this.g ? 1 : 0);
                break;
        }
        return Unit.f46060a;
    }
}

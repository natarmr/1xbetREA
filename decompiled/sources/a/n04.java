package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class n04 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f22682a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ n04(mm40 mm40Var, n0x n0xVar, int i, qge qgeVar, float f, float f2, int i2) {
        this.f22682a = (byte) 0;
        this.b = mm40Var;
        this.f = n0xVar;
        this.e = i;
        this.g = qgeVar;
        this.c = f;
        this.d = f2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f22682a;
        int i = this.e;
        Object obj3 = this.g;
        Object obj4 = this.f;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(1);
                j2e.g(this.b, (n0x) obj4, this.e, (qge) obj3, this.c, this.d, (fet) obj, iL);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(i | 1);
                mm40 mm40Var = this.b;
                pzb.i(mm40Var, (gpl) obj4, this.c, this.d, (Function1) obj3, (fet) obj, iL2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iL3 = x8x.L(i | 1);
                mm40 mm40Var2 = this.b;
                pzb.j(mm40Var2, (epl) obj4, this.c, this.d, (Function1) obj3, (fet) obj, iL3);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iL4 = x8x.L(i | 1);
                mm40 mm40Var3 = this.b;
                uzb.p(mm40Var3, (jpl) obj4, this.c, this.d, (Function1) obj3, (fet) obj, iL4);
                break;
            case 4:
                ((Integer) obj2).getClass();
                int iL5 = x8x.L(i | 1);
                mm40 mm40Var4 = this.b;
                u1c.d(mm40Var4, (mpl) obj4, this.c, this.d, (Function1) obj3, (fet) obj, iL5);
                break;
            case 5:
                ((Integer) obj2).getClass();
                int iL6 = x8x.L(i | 1);
                mm40 mm40Var5 = this.b;
                v3c.k(mm40Var5, (ppl) obj4, this.c, this.d, (Function1) obj3, (fet) obj, iL6);
                break;
            case 6:
                ((Integer) obj2).getClass();
                int iL7 = x8x.L(i | 1);
                mm40 mm40Var6 = this.b;
                n4c.g(mm40Var6, (spl) obj4, this.c, this.d, (Function1) obj3, (fet) obj, iL7);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL8 = x8x.L(i | 1);
                mm40 mm40Var7 = this.b;
                lvm0.d(mm40Var7, (nts0) obj4, (l7m0) obj3, this.c, this.d, (fet) obj, iL8);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ n04(mm40 mm40Var, tpl tplVar, float f, float f2, Function1 function1, int i, byte b) {
        this.f22682a = b;
        this.b = mm40Var;
        this.f = tplVar;
        this.c = f;
        this.d = f2;
        this.g = function1;
        this.e = i;
    }

    public /* synthetic */ n04(mm40 mm40Var, nts0 nts0Var, l7m0 l7m0Var, float f, float f2, int i) {
        this.f22682a = (byte) 7;
        this.b = mm40Var;
        this.f = nts0Var;
        this.g = l7m0Var;
        this.c = f;
        this.d = f2;
        this.e = i;
    }
}

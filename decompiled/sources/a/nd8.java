package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class nd8 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f23327a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ int e;

    public /* synthetic */ nd8(mm40 mm40Var, int i, String str, String str2, int i2) {
        this.f23327a = (byte) 0;
        this.b = mm40Var;
        this.e = i;
        this.c = str;
        this.d = str2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f23327a;
        int i = this.e;
        String str = this.d;
        String str2 = this.c;
        mm40 mm40Var = this.b;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(1);
                p8a.B(this.e, iL, (fet) obj, this.b, this.c, this.d);
                break;
            case 1:
                ((Integer) obj2).getClass();
                ieb.C(x8x.L(i | 1), (fet) obj, mm40Var, str2, str);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(1);
                ebc.f(this.e, iL2, (fet) obj, this.b, this.c, this.d);
                break;
            case 3:
                ((Integer) obj2).getClass();
                xkb.w(x8x.L(i | 1), (fet) obj, mm40Var, str2, str);
                break;
            case 4:
                ((Integer) obj2).getClass();
                tlb.s(x8x.L(i | 1), (fet) obj, mm40Var, str2, str);
                break;
            case 5:
                ((Integer) obj2).getClass();
                ozb.i(x8x.L(i | 1), (fet) obj, mm40Var, str2, str);
                break;
            case 6:
                ((Integer) obj2).getClass();
                mbc.x(x8x.L(i | 1), (fet) obj, mm40Var, str2, str);
                break;
            case 7:
                ((Integer) obj2).getClass();
                obc.x(x8x.L(i | 1), (fet) obj, mm40Var, str2, str);
                break;
            case 8:
                ((Integer) obj2).getClass();
                vbc.D(x8x.L(i | 1), (fet) obj, mm40Var, str2, str);
                break;
            case 9:
                ((Integer) obj2).getClass();
                azw.m(x8x.L(i | 1), (fet) obj, mm40Var, str2, str);
                break;
            case 10:
                ((Integer) obj2).getClass();
                q8x.q(x8x.L(i | 1), (fet) obj, mm40Var, str2, str);
                break;
            case 11:
                ((Integer) obj2).getClass();
                d9x.g(x8x.L(i | 1), (fet) obj, mm40Var, str2, str);
                break;
            default:
                ((Integer) obj2).getClass();
                d9x.d(x8x.L(i | 1), (fet) obj, mm40Var, str2, str);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ nd8(mm40 mm40Var, String str, String str2, int i, byte b) {
        this.f23327a = b;
        this.b = mm40Var;
        this.c = str;
        this.d = str2;
        this.e = i;
    }

    public /* synthetic */ nd8(mm40 mm40Var, String str, String str2, int i, int i2) {
        this.f23327a = (byte) 2;
        this.b = mm40Var;
        this.c = str;
        this.d = str2;
        this.e = i;
    }
}

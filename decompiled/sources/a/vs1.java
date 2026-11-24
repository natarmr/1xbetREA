package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class vs1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f37926a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ byte f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ Object h;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ vs1(mm40 mm40Var, gol golVar, b0i b0iVar, Function1 function1, Function2 function2, int i, int i2) {
        this.f37926a = (byte) 4;
        this.b = mm40Var;
        this.h = golVar;
        this.d = b0iVar;
        this.e = function1;
        this.c = function2;
        this.f = i;
        this.g = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f37926a) {
            case 0:
                ((Integer) obj2).getClass();
                o050.a(this.b, (zs1) this.h, (xcz) this.d, (mtl) this.c, this.e, (fet) obj, x8x.L(this.f | 1), this.g ? 1 : 0);
                break;
            case 1:
                ((Integer) obj2).getClass();
                y860.d(this.b, (a4x) this.h, (mtl) this.c, (xcz) this.d, this.e, (fet) obj, x8x.L(this.f | 1), this.g ? 1 : 0);
                break;
            case 2:
                ((Integer) obj2).getClass();
                wha0.c(this.b, (bml) this.h, (mtl) this.c, (d9z) this.d, this.e, (fet) obj, x8x.L(this.f | 1), this.g ? 1 : 0);
                break;
            case 3:
                ((Integer) obj2).getClass();
                x4d0.b(this.b, (ou1) this.h, (xcz) this.d, (mtl) this.c, this.e, (fet) obj, x8x.L(this.f | 1), this.g ? 1 : 0);
                break;
            default:
                ((Integer) obj2).getClass();
                wvb.j(this.b, (gol) this.h, (b0i) this.d, this.e, (Function2) this.c, (fet) obj, x8x.L(this.f | 1), this.g ? 1 : 0);
                break;
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ vs1(mm40 mm40Var, Object obj, mtl mtlVar, bch0 bch0Var, Function1 function1, int i, int i2, byte b) {
        this.f37926a = b;
        this.b = mm40Var;
        this.h = obj;
        this.c = mtlVar;
        this.d = bch0Var;
        this.e = function1;
        this.f = i;
        this.g = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ vs1(mm40 mm40Var, Object obj, xcz xczVar, mtl mtlVar, Function1 function1, int i, int i2, byte b) {
        this.f37926a = b;
        this.b = mm40Var;
        this.h = obj;
        this.d = xczVar;
        this.c = mtlVar;
        this.e = function1;
        this.f = i;
        this.g = i2;
    }
}

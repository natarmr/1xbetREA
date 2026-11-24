package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class gka implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11436a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ ugd d;
    public final /* synthetic */ ugd e;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ gka(mm40 mm40Var, ugd ugdVar, ugd ugdVar2, int i, int i2) {
        this.f11436a = (byte) 8;
        this.b = mm40Var;
        this.d = ugdVar;
        this.e = ugdVar2;
        this.c = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f11436a) {
            case 0:
                ((Integer) obj2).getClass();
                cy2.e(x8x.L(3457), this.d, this.e, (fet) obj, this.b, this.c);
                break;
            case 1:
                ((Integer) obj2).getClass();
                agc.i(x8x.L(3457), this.d, this.e, (fet) obj, this.b, this.c);
                break;
            case 2:
                ((Integer) obj2).getClass();
                wvb.h(x8x.L(433), this.d, this.e, (fet) obj, this.b, this.c);
                break;
            case 3:
                ((Integer) obj2).getClass();
                sac.v(x8x.L(3457), this.d, this.e, (fet) obj, this.b, this.c);
                break;
            case 4:
                ((Integer) obj2).getClass();
                n2x.d(x8x.L(3457), this.d, this.e, (fet) obj, this.b, this.c);
                break;
            case 5:
                ((Integer) obj2).getClass();
                a8k0.f(x8x.L(3457), this.d, this.e, (fet) obj, this.b, this.c);
                break;
            case 6:
                ((Integer) obj2).getClass();
                b8k0.i(x8x.L(3463), this.d, this.e, (fet) obj, this.b, this.c);
                break;
            case 7:
                ((Integer) obj2).getClass();
                n7x.f(x8x.L(3457), this.d, this.e, (fet) obj, this.b, this.c);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL = x8x.L(433);
                g8x.p(this.b, this.d, this.e, (fet) obj, iL, this.c ? 1 : 0);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ gka(mm40 mm40Var, boolean z, ugd ugdVar, ugd ugdVar2, int i, byte b) {
        this.f11436a = b;
        this.b = mm40Var;
        this.c = z;
        this.d = ugdVar;
        this.e = ugdVar2;
    }

    public /* synthetic */ gka(boolean z, ugd ugdVar, ugd ugdVar2, mm40 mm40Var, int i) {
        this.f11436a = (byte) 2;
        this.c = z;
        this.d = ugdVar;
        this.e = ugdVar2;
        this.b = mm40Var;
    }
}

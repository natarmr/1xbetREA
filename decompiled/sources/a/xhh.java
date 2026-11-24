package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class xhh implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40891a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ xhh(c5n0 c5n0Var, int i, Function0 function0, long j) {
        this.f40891a = (byte) 11;
        this.d = c5n0Var;
        this.c = i;
        this.e = function0;
        this.b = j;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f40891a;
        Object obj3 = this.e;
        int i = this.c;
        Object obj4 = this.d;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                yhh.b(this.b, (Long) obj4, (ugd) obj3, (fet) obj, x8x.L(i | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                sj3.l((qwv0) obj4, (mm40) obj3, this.b, (fet) obj, x8x.L(i | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                b9m.a(this.b, (y8m) obj4, (Function1) obj3, (fet) obj, x8x.L(i | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                kbc.F((mm40) obj4, (a4x) obj3, this.b, (fet) obj, x8x.L(i | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                tlb.u((mm40) obj4, (jwm) obj3, this.b, (fet) obj, x8x.L(i | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                ibc.I((mm40) obj4, (dwh0) obj3, this.b, (fet) obj, x8x.L(i | 1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                int iL = x8x.L(i | 1);
                hmw0.A((mm40) obj4, this.b, (Function0) obj3, (fet) obj, iL);
                break;
            case 7:
                ((Integer) obj2).getClass();
                bdx.K((mm40) obj4, (ri40) obj3, this.b, (fet) obj, x8x.L(i | 1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(i | 1);
                jiq0.h0((mm40) obj4, this.b, (qol) obj3, (fet) obj, iL2);
                break;
            case 9:
                ((Integer) obj2).getClass();
                q8x.o(this.b, (y9q0) obj4, (ugd) obj3, (fet) obj, x8x.L(i | 1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                int iL3 = x8x.L(i | 1);
                l8x.p((mm40) obj4, this.b, (Function1) obj3, (fet) obj, iL3);
                break;
            default:
                c5n0 c5n0Var = (c5n0) obj4;
                Function0 function0 = (Function0) obj3;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    mm40 mm40VarD = o7k0.d(o7k0.e(jm40.b, c5n0Var.r0(i)), 1.0f);
                    boolean zG = fetVar.g(function0);
                    Object objP = fetVar.P();
                    if (zG || objP == ukd.f35823a) {
                        objP = new vpj0(function0, (byte) 14);
                        fetVar.o0(objP);
                    }
                    zq8.a(0, fetVar, i120.Q(i4w0.T(mm40VarD, (Function1) objP), this.b, jd8.n));
                } else {
                    fetVar.X();
                }
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ xhh(long j, Object obj, wdr wdrVar, int i, byte b) {
        this.f40891a = b;
        this.b = j;
        this.d = obj;
        this.e = wdrVar;
        this.c = i;
    }

    public /* synthetic */ xhh(byte b, int i, long j, mm40 mm40Var, Object obj) {
        this.f40891a = b;
        this.d = mm40Var;
        this.b = j;
        this.e = obj;
        this.c = i;
    }

    public /* synthetic */ xhh(Object obj, Object obj2, long j, int i, byte b) {
        this.f40891a = b;
        this.d = obj;
        this.e = obj2;
        this.b = j;
        this.c = i;
    }
}

package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class lw0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f20737a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ Function0 c;

    public /* synthetic */ lw0(Function0 function0, mm40 mm40Var, int i) {
        this.f20737a = (byte) 7;
        this.c = function0;
        this.b = mm40Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f20737a;
        Function0 function0 = this.c;
        mm40 mm40Var = this.b;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                bsr0.N(x8x.L(7), (fet) obj, mm40Var, function0);
                break;
            case 1:
                ((Integer) obj2).getClass();
                bsr0.M(x8x.L(7), (fet) obj, mm40Var, function0);
                break;
            case 2:
                ((Integer) obj2).getClass();
                ahy.f(x8x.L(1), (fet) obj, mm40Var, function0);
                break;
            case 3:
                ((Integer) obj2).getClass();
                lv00.m(x8x.L(1), (fet) obj, mm40Var, function0);
                break;
            case 4:
                ((Integer) obj2).getClass();
                i120.g(x8x.L(1), (fet) obj, mm40Var, function0);
                break;
            case 5:
                ((Integer) obj2).getClass();
                obb.E(mm40Var, null, function0, (fet) obj, x8x.L(1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                obb.b(mm40Var, null, function0, (fet) obj, x8x.L(1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                cfx0.i(x8x.L(1), (fet) obj, mm40Var, function0);
                break;
            case 8:
                ((Integer) obj2).getClass();
                piz.d(x8x.L(1), (fet) obj, mm40Var, function0);
                break;
            case 9:
                ((Integer) obj2).getClass();
                lv00.D(x8x.L(1), (fet) obj, mm40Var, function0);
                break;
            case 10:
                ((Integer) obj2).getClass();
                i120.C(x8x.L(1), (fet) obj, mm40Var, function0);
                break;
            case 11:
                ((Integer) obj2).getClass();
                y860.C(x8x.L(1), (fet) obj, mm40Var, function0);
                break;
            case 12:
                ((Integer) obj2).getClass();
                q0x.f(x8x.L(1), (fet) obj, mm40Var, function0);
                break;
            case 13:
                ((Integer) obj2).getClass();
                ucx.H(x8x.L(1), (fet) obj, mm40Var, function0);
                break;
            case 14:
                ((Integer) obj2).getClass();
                hfm0.g(x8x.L(1), (fet) obj, mm40Var, function0);
                break;
            case 15:
                ((Integer) obj2).getClass();
                pvm0.f(x8x.L(1), (fet) obj, mm40Var, function0);
                break;
            case 16:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    qzb.n(o2e.e0(mm40Var, "BUTTON_RANDOM_TAG"), new wul(qul.e, oe9.f25112a, new ve9(rsm0.w(R.string.toto_random, 0, fetVar), R.drawable.ic_glyph_shuffle), true, false, true), this.c, fetVar, 0, 0);
                } else {
                    fetVar.X();
                }
                break;
            default:
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    qzb.n(o2e.e0(mm40Var, "BUTTON_RANDOM_TAG"), new wul(qul.e, oe9.f25112a, new ve9(rsm0.w(R.string.toto_random, 0, fetVar2), R.drawable.ic_glyph_shuffle), true, false, true), this.c, fetVar2, 0, 0);
                } else {
                    fetVar2.X();
                }
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ lw0(mm40 mm40Var, Function0 function0, byte b) {
        this.f20737a = b;
        this.b = mm40Var;
        this.c = function0;
    }

    public /* synthetic */ lw0(mm40 mm40Var, Function0 function0, int i, byte b) {
        this.f20737a = b;
        this.b = mm40Var;
        this.c = function0;
    }

    public /* synthetic */ lw0(mm40 mm40Var, j9n j9nVar, Function0 function0, int i, byte b) {
        this.f20737a = b;
        this.b = mm40Var;
        this.c = function0;
    }
}

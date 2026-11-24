package a;

import androidx.compose.ui.tooling.PreviewActivity;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class hw6 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f13754a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    public /* synthetic */ hw6(byte b, int i, String str, String str2) {
        this.f13754a = b;
        this.b = str;
        this.c = str2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws Exception {
        byte b = this.f13754a;
        pcy pcyVar = e7z.u1;
        jm40 jm40Var = jm40.b;
        String str = this.c;
        String str2 = this.b;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                f1t0.v(str2, str, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 1:
                ((Integer) obj2).getClass();
                sw6.e(str2, str, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 2:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    q8a.a(3078, fetVar, mrv.k0(jm40Var, "DESCRIPTION_TEXT"), str2, str);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 3:
                ((Integer) obj2).getClass();
                feb.i(str2, str, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 4:
                ((Integer) obj2).getClass();
                bfb.C(str2, str, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 5:
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    yx7 yx7Var = gqw0.k;
                    zcl zclVar = qmk.f28987a;
                    thg0 thg0VarA = shg0.a(new qw3(2.0f, true, new jf4((byte) 14)), yx7Var, fetVar2, 48);
                    int iHashCode = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM = fetVar2.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar2, jm40Var);
                    mkd.c0.getClass();
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, thg0VarA, gqw0.x);
                    jpm0.o(fetVar2, bh90VarM, gqw0.w);
                    jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar2);
                    jpm0.o(fetVar2, mm40VarC0, gqw0.v);
                    zfn zfnVar = zaq0.b;
                    long textPrimary = ((ThemeColors) fetVar2.k(zfnVar)).getTextPrimary();
                    zfn zfnVar2 = j1t0.e;
                    ((g1t0) fetVar2.k(zfnVar2)).getClass();
                    v8q0.a(this.b, null, textPrimary, null, 0L, null, null, null, 0L, null, 0L, 1, false, 1, 0, null, g1t0.j(), fetVar2, 0, 24960, 110586);
                    String str3 = this.c;
                    if (str3 == null || str3.length() == 0) {
                        fetVar2.e0(-322562670);
                        fetVar2.r(false);
                    } else {
                        fetVar2.e0(-322890092);
                        long secondary = ((ThemeColors) fetVar2.k(zfnVar)).getSecondary();
                        ((g1t0) fetVar2.k(zfnVar2)).getClass();
                        v8q0.a(str3, null, secondary, null, 0L, null, null, null, 0L, null, 0L, 1, false, 1, 0, null, g1t0.j(), fetVar2, 0, 24960, 110586);
                        fetVar2.r(false);
                    }
                    fetVar2.r(true);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 6:
                ((Integer) obj2).getClass();
                n6m.e(str2, str, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 7:
                ((Integer) obj2).getClass();
                kkb.B(str2, str, (fet) obj, x8x.L(7));
                return Unit.f46060a;
            case 8:
                ((Integer) obj2).getClass();
                kkb.u(str2, str, (fet) obj, x8x.L(7));
                return Unit.f46060a;
            case 9:
                ((Integer) obj2).getClass();
                ebc.d(str2, str, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 10:
                ((Integer) obj2).getClass();
                ebc.O(str2, str, (fet) obj, x8x.L(7));
                return Unit.f46060a;
            case 11:
                ((Integer) obj2).getClass();
                ebc.W(str2, str, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 12:
                ((Integer) obj2).getClass();
                oja0.z(str2, str, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 13:
                ((Integer) obj2).getClass();
                x4d0.F(str2, str, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 14:
                ((Integer) obj2).getClass();
                unh0.G(str2, str, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 15:
                ((Integer) obj2).getClass();
                ccq0.v(str2, str, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 16:
                ((Integer) obj2).getClass();
                x8f.J(str2, str, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 17:
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                int i = PreviewActivity.w;
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    wzb.r0(str2, str, fetVar3, new Object[0]);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 18:
                return tcj0.a((tcj0) obj2, false, false, null, null, this.b, this.c, false, null, false, false, null, null, false, false, false, false, false, false, false, false, null, false, false, false, false, 0, false, null, false, false, 0, -897, 2097151);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((Integer) obj2).getClass();
                ghm0.f(str2, str, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 20:
                ((Integer) obj2).getClass();
                ycm0.b(str2, str, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 21:
                ((Integer) obj2).getClass();
                jtm0.b(str2, str, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 22:
                ((Integer) obj2).getClass();
                jtm0.g(str2, str, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 23:
                ((Integer) obj2).getClass();
                k5n0.l(str2, str, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 24:
                ((Integer) obj2).getClass();
                n8n0.e(str2, str, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                fet fetVar4 = (fet) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    zcl zclVar2 = qmk.f28987a;
                    mm40 mm40VarE = o7k0.e(o7k0.s(jm40Var, 128.0f), 44.0f);
                    thg0 thg0VarA2 = shg0.a(uc9.e, gqw0.k, fetVar4, 54);
                    int iHashCode2 = Long.hashCode(fetVar4.T);
                    bh90 bh90VarM2 = fetVar4.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar4, mm40VarE);
                    mkd.c0.getClass();
                    fetVar4.i0();
                    if (fetVar4.S) {
                        fetVar4.l(pcyVar);
                    } else {
                        fetVar4.r0();
                    }
                    jpm0.o(fetVar4, thg0VarA2, gqw0.x);
                    jpm0.o(fetVar4, bh90VarM2, gqw0.w);
                    jpm0.o(fetVar4, Integer.valueOf(iHashCode2), gqw0.y);
                    jpm0.n(fetVar4);
                    x7z x7zVarI = ohs0.i(fetVar4, mm40VarC1, gqw0.v, 1.0f, false);
                    zfn zfnVar3 = j1t0.e;
                    ((g1t0) fetVar4.k(zfnVar3)).getClass();
                    y9q0 y9q0VarD = g1t0.d();
                    zfn zfnVar4 = zaq0.b;
                    v8q0.a(this.b, x7zVarI, ((ThemeColors) fetVar4.k(zfnVar4)).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0VarD, fetVar4, 0, 24960, 110584);
                    ((g1t0) fetVar4.k(zfnVar3)).getClass();
                    v8q0.a(this.c, null, ((ThemeColors) fetVar4.k(zfnVar4)).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.d(), fetVar4, 0, 24960, 110586);
                    fetVar4.r(true);
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            default:
                ((Integer) obj2).getClass();
                vbw0.d(str2, str, (fet) obj, x8x.L(1));
                return Unit.f46060a;
        }
    }

    public /* synthetic */ hw6(String str, String str2, byte b) {
        this.f13754a = b;
        this.b = str;
        this.c = str2;
    }
}

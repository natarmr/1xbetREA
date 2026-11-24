package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class a18 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f59a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ a18(int i, int i2, mm40 mm40Var, Function0 function0) {
        this.f59a = (byte) 2;
        this.e = mm40Var;
        this.c = i;
        this.b = function0;
        this.d = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        long primaryForeground;
        long primary;
        byte b = this.f59a;
        int i = this.d;
        int i2 = this.c;
        Object obj3 = this.e;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(i | 1);
                d18.g(i2, iL, (fet) obj, (a4x) obj4, (mm40) obj3);
                return Unit.f46060a;
            case 1:
                ((Integer) obj2).intValue();
                dj8.x((a4x) obj4, i2, (Function1) obj3, (fet) obj, x8x.L(i | 1));
                return Unit.f46060a;
            case 2:
                ((Integer) obj2).getClass();
                sac.d(i2, x8x.L(i | 1), (fet) obj, (mm40) obj3, (Function0) obj4);
                return Unit.f46060a;
            case 3:
                ((Integer) obj2).getClass();
                lmc.m(i2, (String) obj3, (ugd) obj4, (fet) obj, x8x.L(i | 1));
                return Unit.f46060a;
            case 4:
                ((Integer) obj2).getClass();
                j6n.k((iqo0) obj4, (mm40) obj3, this.c, this.d, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 5:
                sso0 sso0Var = (sso0) obj4;
                mm40 mm40Var = (mm40) obj3;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    if (sso0Var != null) {
                        boolean z = sso0Var instanceof vqo0;
                        int i3 = this.c;
                        int i4 = this.d;
                        if (z) {
                            fetVar.e0(-1907916707);
                            j6n.n((vqo0) sso0Var, mm40Var, i3, i4, fetVar, 0);
                            fetVar.r(false);
                        } else if (sso0Var instanceof yqo0) {
                            fetVar.e0(-1907646542);
                            j6n.o((yqo0) sso0Var, mm40Var, i3, i4, fetVar, 0);
                            fetVar.r(false);
                        } else if (sso0Var instanceof tro0) {
                            fetVar.e0(-1907375013);
                            j6n.y((tro0) sso0Var, mm40Var, i3, i4, fetVar, 0);
                            fetVar.r(false);
                        } else if (sso0Var instanceof zoo0) {
                            fetVar.e0(-1907105995);
                            j6n.a((zoo0) sso0Var, mm40Var, i3, i4, fetVar, 0);
                            fetVar.r(false);
                        } else if (sso0Var instanceof mro0) {
                            fetVar.e0(-1906843487);
                            j6n.v((mro0) sso0Var, mm40Var, i3, i4, fetVar, 0);
                            fetVar.r(false);
                        } else if (sso0Var instanceof fqo0) {
                            fetVar.e0(-1906590465);
                            j6n.j((fqo0) sso0Var, mm40Var, i3, i4, fetVar, 0);
                            fetVar.r(false);
                        } else if (sso0Var instanceof fso0) {
                            fetVar.e0(-1906334498);
                            j6n.B((fso0) sso0Var, mm40Var, i3, i4, fetVar, 0);
                            fetVar.r(false);
                        } else if (sso0Var instanceof cro0) {
                            fetVar.e0(-1906077570);
                            j6n.p((cro0) sso0Var, mm40Var, i3, i4, fetVar, 0);
                            fetVar.r(false);
                        } else if (sso0Var instanceof fro0) {
                            fetVar.e0(-1905809389);
                            j6n.q((fro0) sso0Var, mm40Var, i3, i4, fetVar, 0);
                            fetVar.r(false);
                        } else if (sso0Var instanceof epo0) {
                            fetVar.e0(-1905543936);
                            j6n.b((epo0) sso0Var, mm40Var, i3, i4, fetVar, 0);
                            fetVar.r(false);
                        } else if (sso0Var instanceof hpo0) {
                            fetVar.e0(-1905279723);
                            j6n.c((hpo0) sso0Var, mm40Var, i3, i4, fetVar, 0);
                            fetVar.r(false);
                        } else if (sso0Var instanceof xro0) {
                            fetVar.e0(-1905016192);
                            j6n.z((xro0) sso0Var, mm40Var, i3, i4, fetVar, 0);
                            fetVar.r(false);
                        } else if (sso0Var instanceof aso0) {
                            fetVar.e0(-1904751979);
                            j6n.A((aso0) sso0Var, mm40Var, i3, i4, fetVar, 0);
                            fetVar.r(false);
                        } else if (sso0Var instanceof rso0) {
                            fetVar.e0(-1904486402);
                            j6n.E((rso0) sso0Var, mm40Var, i3, i4, fetVar, 0);
                            fetVar.r(false);
                        } else if (sso0Var instanceof mqo0) {
                            fetVar.e0(-1904229474);
                            j6n.l((mqo0) sso0Var, mm40Var, i3, i4, fetVar, 0);
                            fetVar.r(false);
                        } else if (sso0Var instanceof ppo0) {
                            fetVar.e0(-1903968454);
                            j6n.e((ppo0) sso0Var, mm40Var, i3, i4, fetVar, 0);
                            fetVar.r(false);
                        } else if (sso0Var instanceof qqo0) {
                            fetVar.e0(-1903709728);
                            j6n.m((qqo0) sso0Var, mm40Var, i3, i4, fetVar, 0);
                            fetVar.r(false);
                        } else if (sso0Var instanceof wpo0) {
                            fetVar.e0(-1903452676);
                            j6n.g((wpo0) sso0Var, mm40Var, i3, i4, fetVar, 0);
                            fetVar.r(false);
                        } else if (sso0Var instanceof aqo0) {
                            fetVar.e0(-1903195872);
                            j6n.i((aqo0) sso0Var, mm40Var, i3, i4, fetVar, 0);
                            fetVar.r(false);
                        } else if (sso0Var instanceof lpo0) {
                            fetVar.e0(-1902938820);
                            j6n.d((lpo0) sso0Var, mm40Var, i3, i4, fetVar, 0);
                            fetVar.r(false);
                        } else if (sso0Var instanceof jso0) {
                            fetVar.e0(-1902680993);
                            j6n.C((jso0) sso0Var, mm40Var, i3, i4, fetVar, 0);
                            fetVar.r(false);
                        } else if (sso0Var instanceof pro0) {
                            fetVar.e0(-1902416842);
                            j6n.w((pro0) sso0Var, mm40Var, i3, i4, fetVar, 0);
                            fetVar.r(false);
                        } else if (sso0Var instanceof iqo0) {
                            fetVar.e0(-1902141996);
                            j6n.k((iqo0) sso0Var, mm40Var, i3, i4, fetVar, 0);
                            fetVar.r(false);
                        } else if (sso0Var instanceof spo0) {
                            fetVar.e0(-1901860113);
                            j6n.f((spo0) sso0Var, mm40Var, i3, i4, fetVar, 0);
                            fetVar.r(false);
                        } else if (sso0Var instanceof mso0) {
                            fetVar.e0(-1901578540);
                            j6n.D((mso0) sso0Var, mm40Var, i3, i4, fetVar, 0);
                            fetVar.r(false);
                        } else if (sso0Var instanceof gro0) {
                            fetVar.e0(-1901269098);
                            gro0 gro0Var = (gro0) sso0Var;
                            foo0 foo0Var = gro0Var.f11790a;
                            int iOrdinal = foo0Var.ordinal();
                            if (iOrdinal == 0) {
                                fetVar.e0(1151546095);
                                primaryForeground = ((ThemeColors) fetVar.k(zaq0.b)).getPrimaryForeground();
                                fetVar.r(false);
                            } else if (iOrdinal != 2) {
                                switch (iOrdinal) {
                                    case 17:
                                        fetVar.e0(1151550019);
                                        primaryForeground = ((StaticColors) fetVar.k(m8m0.f21378a)).m114getRed100d7_KjU();
                                        fetVar.r(false);
                                        break;
                                    case 18:
                                        fetVar.e0(1151551875);
                                        primaryForeground = ((StaticColors) fetVar.k(m8m0.f21378a)).m98getGreen0d7_KjU();
                                        fetVar.r(false);
                                        break;
                                    case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                                        fetVar.e0(1151553896);
                                        primaryForeground = ((StaticColors) fetVar.k(m8m0.f21378a)).m87getDarkOrange0d7_KjU();
                                        fetVar.r(false);
                                        break;
                                    case 20:
                                        fetVar.e0(1151555907);
                                        primaryForeground = ((StaticColors) fetVar.k(m8m0.f21378a)).m123getWhite0d7_KjU();
                                        fetVar.r(false);
                                        break;
                                    default:
                                        fetVar.e0(1151557379);
                                        primaryForeground = ((StaticColors) fetVar.k(m8m0.f21378a)).m123getWhite0d7_KjU();
                                        fetVar.r(false);
                                        break;
                                }
                            } else {
                                fetVar.e0(1151548103);
                                primaryForeground = ((ThemeColors) fetVar.k(zaq0.b)).getSecondary();
                                fetVar.r(false);
                            }
                            switch (foo0Var.ordinal()) {
                                case 0:
                                    fetVar.e0(-1017588412);
                                    primary = ((ThemeColors) fetVar.k(zaq0.b)).getPrimary();
                                    fetVar.r(false);
                                    break;
                                case 1:
                                    fetVar.e0(-1017586906);
                                    primary = ((ThemeColors) fetVar.k(zaq0.b)).getSecondary();
                                    fetVar.r(false);
                                    break;
                                case 2:
                                    fetVar.e0(-1017585138);
                                    primary = ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundLight60();
                                    fetVar.r(false);
                                    break;
                                case 3:
                                    fetVar.e0(-1017583328);
                                    primary = ((StaticColors) fetVar.k(m8m0.f21378a)).m113getRed0d7_KjU();
                                    fetVar.r(false);
                                    break;
                                case 4:
                                    fetVar.e0(-1017581886);
                                    primary = ((StaticColors) fetVar.k(m8m0.f21378a)).m98getGreen0d7_KjU();
                                    fetVar.r(false);
                                    break;
                                case 5:
                                    fetVar.e0(-1017580349);
                                    primary = ((StaticColors) fetVar.k(m8m0.f21378a)).m122getViolet0d7_KjU();
                                    fetVar.r(false);
                                    break;
                                case 6:
                                    fetVar.e0(-1017578781);
                                    primary = ((StaticColors) fetVar.k(m8m0.f21378a)).m111getPurple0d7_KjU();
                                    fetVar.r(false);
                                    break;
                                case 7:
                                    fetVar.e0(-1017577279);
                                    primary = ((StaticColors) fetVar.k(m8m0.f21378a)).m79getBlue0d7_KjU();
                                    fetVar.r(false);
                                    break;
                                case 8:
                                    fetVar.e0(-1017575839);
                                    primary = ((StaticColors) fetVar.k(m8m0.f21378a)).m119getTeal0d7_KjU();
                                    fetVar.r(false);
                                    break;
                                case 9:
                                    fetVar.e0(-1017574333);
                                    primary = ((StaticColors) fetVar.k(m8m0.f21378a)).m132getYellow0d7_KjU();
                                    fetVar.r(false);
                                    break;
                                case 10:
                                    fetVar.e0(-1017572765);
                                    primary = ((StaticColors) fetVar.k(m8m0.f21378a)).m104getOrange0d7_KjU();
                                    fetVar.r(false);
                                    break;
                                case 11:
                                    fetVar.e0(-1017571065);
                                    primary = ((StaticColors) fetVar.k(m8m0.f21378a)).m87getDarkOrange0d7_KjU();
                                    fetVar.r(false);
                                    break;
                                case 12:
                                    fetVar.e0(-1017569439);
                                    primary = ((StaticColors) fetVar.k(m8m0.f21378a)).m110getPink0d7_KjU();
                                    fetVar.r(false);
                                    break;
                                case 13:
                                    fetVar.e0(-1017567867);
                                    primary = ((StaticColors) fetVar.k(m8m0.f21378a)).m92getDarkPink0d7_KjU();
                                    fetVar.r(false);
                                    break;
                                case 14:
                                    fetVar.e0(-1017566303);
                                    primary = ((StaticColors) fetVar.k(m8m0.f21378a)).m95getGray0d7_KjU();
                                    fetVar.r(false);
                                    break;
                                case 15:
                                    fetVar.e0(-1017564731);
                                    primary = ((StaticColors) fetVar.k(m8m0.f21378a)).m86getDarkGray0d7_KjU();
                                    fetVar.r(false);
                                    break;
                                case 16:
                                    fetVar.e0(-1017563134);
                                    primary = ((StaticColors) fetVar.k(m8m0.f21378a)).m123getWhite0d7_KjU();
                                    fetVar.r(false);
                                    break;
                                case 17:
                                    fetVar.e0(-1017561342);
                                    primary = ((StaticColors) fetVar.k(m8m0.f21378a)).m114getRed100d7_KjU();
                                    fetVar.r(false);
                                    break;
                                case 18:
                                    fetVar.e0(-1017559484);
                                    primary = ((StaticColors) fetVar.k(m8m0.f21378a)).m99getGreen100d7_KjU();
                                    fetVar.r(false);
                                    break;
                                case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                                    fetVar.e0(-1017557399);
                                    primary = ((StaticColors) fetVar.k(m8m0.f21378a)).m88getDarkOrange100d7_KjU();
                                    fetVar.r(false);
                                    break;
                                case 20:
                                    fetVar.e0(-1017555324);
                                    primary = ((StaticColors) fetVar.k(m8m0.f21378a)).m126getWhite200d7_KjU();
                                    fetVar.r(false);
                                    break;
                                default:
                                    throw b1j.f(-1017588953, fetVar, false);
                            }
                            j6n.s(primaryForeground, primary, ibc.Y(gro0Var.b, fetVar), mm40Var, i3, i4, fetVar, 0);
                            fetVar.r(false);
                        }
                    }
                    throw b1j.f(1323932865, fetVar, false);
                }
                fetVar.X();
                return Unit.f46060a;
            case 6:
                ((Integer) obj2).getClass();
                j6n.y((tro0) obj4, (mm40) obj3, this.c, this.d, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 7:
                ((Integer) obj2).getClass();
                j6n.m((qqo0) obj4, (mm40) obj3, this.c, this.d, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 8:
                ((Integer) obj2).getClass();
                j6n.d((lpo0) obj4, (mm40) obj3, this.c, this.d, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 9:
                ((Integer) obj2).getClass();
                j6n.E((rso0) obj4, (mm40) obj3, this.c, this.d, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 10:
                ((Integer) obj2).getClass();
                j6n.z((xro0) obj4, (mm40) obj3, this.c, this.d, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 11:
                ((Integer) obj2).getClass();
                j6n.v((mro0) obj4, (mm40) obj3, this.c, this.d, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 12:
                ((Integer) obj2).getClass();
                j6n.e((ppo0) obj4, (mm40) obj3, this.c, this.d, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 13:
                ((Integer) obj2).getClass();
                j6n.l((mqo0) obj4, (mm40) obj3, this.c, this.d, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 14:
                ((Integer) obj2).getClass();
                j6n.i((aqo0) obj4, (mm40) obj3, this.c, this.d, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 15:
                ((Integer) obj2).getClass();
                j6n.C((jso0) obj4, (mm40) obj3, this.c, this.d, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 16:
                ((Integer) obj2).getClass();
                j6n.c((hpo0) obj4, (mm40) obj3, this.c, this.d, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 17:
                ((Integer) obj2).getClass();
                j6n.p((cro0) obj4, (mm40) obj3, this.c, this.d, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 18:
                ((Integer) obj2).getClass();
                j6n.B((fso0) obj4, (mm40) obj3, this.c, this.d, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((Integer) obj2).getClass();
                j6n.o((yqo0) obj4, (mm40) obj3, this.c, this.d, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 20:
                ((Integer) obj2).getClass();
                j6n.A((aso0) obj4, (mm40) obj3, this.c, this.d, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 21:
                ((Integer) obj2).getClass();
                j6n.n((vqo0) obj4, (mm40) obj3, this.c, this.d, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 22:
                ((Integer) obj2).getClass();
                j6n.f((spo0) obj4, (mm40) obj3, this.c, this.d, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 23:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(i | 1);
                kpb.l(i2, iL2, (fet) obj, (mm40) obj3, (String) obj4);
                return Unit.f46060a;
            case 24:
                ((Integer) obj2).getClass();
                j6n.D((mso0) obj4, (mm40) obj3, this.c, this.d, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((Integer) obj2).getClass();
                j6n.g((wpo0) obj4, (mm40) obj3, this.c, this.d, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((Integer) obj2).getClass();
                j6n.b((epo0) obj4, (mm40) obj3, this.c, this.d, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((Integer) obj2).getClass();
                j6n.w((pro0) obj4, (mm40) obj3, this.c, this.d, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((Integer) obj2).getClass();
                j6n.a((zoo0) obj4, (mm40) obj3, this.c, this.d, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            default:
                ((Integer) obj2).getClass();
                j6n.j((fqo0) obj4, (mm40) obj3, this.c, this.d, (fet) obj, x8x.L(1));
                return Unit.f46060a;
        }
    }

    public /* synthetic */ a18(byte b, int i, int i2, Object obj, Object obj2) {
        this.f59a = b;
        this.b = obj;
        this.c = i;
        this.e = obj2;
        this.d = i2;
    }

    public /* synthetic */ a18(int i, String str, ugd ugdVar, int i2) {
        this.f59a = (byte) 3;
        this.c = i;
        this.e = str;
        this.b = ugdVar;
        this.d = i2;
    }

    public /* synthetic */ a18(mm40 mm40Var, a4x a4xVar, int i, int i2) {
        this.f59a = (byte) 0;
        this.e = mm40Var;
        this.b = a4xVar;
        this.c = i;
        this.d = i2;
    }

    public /* synthetic */ a18(sso0 sso0Var, mm40 mm40Var, int i, int i2) {
        this.f59a = (byte) 5;
        this.b = sso0Var;
        this.e = mm40Var;
        this.c = i;
        this.d = i2;
    }

    public /* synthetic */ a18(sso0 sso0Var, mm40 mm40Var, int i, int i2, int i3, byte b) {
        this.f59a = b;
        this.b = sso0Var;
        this.e = mm40Var;
        this.c = i;
        this.d = i2;
    }
}

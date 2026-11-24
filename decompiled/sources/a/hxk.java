package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.limits_africa.api.domain.LimitGroupEnum;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class hxk implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f13817a;
    public final /* synthetic */ String b;

    public /* synthetic */ hxk(byte b, int i, String str) {
        this.f13817a = b;
        this.b = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ArrayList arrayListR0;
        tn40 tn40Var;
        ArrayList arrayListR1;
        byte b = this.f13817a;
        String str = this.b;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                vdb.t(str, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 1:
                f9l f9lVar = (f9l) obj2;
                ((oyg0) obj).getClass();
                f9lVar.getClass();
                z6l z6lVar = f9lVar.j;
                List list = z6lVar.d;
                if (list.contains(str)) {
                    arrayListR0 = new ArrayList();
                    for (Object obj3 : list) {
                        if (!Intrinsics.d((String) obj3, str)) {
                            arrayListR0.add(obj3);
                        }
                    }
                } else {
                    arrayListR0 = CollectionsKt.r0(list, str);
                }
                return f9l.a(f9lVar, null, null, null, null, null, null, false, z6l.a(z6lVar, 0L, 0L, null, arrayListR0, 0L, 0L, false, 119), null, false, null, false, false, null, 0, 0, null, 67108351);
            case 2:
                ((Integer) obj2).getClass();
                jeb.H(str, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 3:
                ((Integer) obj2).getClass();
                slb.v(str, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 4:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(1 & iIntValue, (iIntValue & 3) != 2)) {
                    mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
                    long jM130getWhite600d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m130getWhite600d7_KjU();
                    ((g1t0) fetVar.k(j1t0.e)).getClass();
                    v8q0.a(this.b, mm40VarD, jM130getWhite600d7_KjU, new n05(qmk.p, qmk.q, qmk.n), 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 2, 0, null, g1t0.d(), fetVar, 48, 24960, 109552);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 5:
                ((Integer) obj2).getClass();
                ulb.b(str, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 6:
                ((Integer) obj2).getClass();
                ulb.t(str, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 7:
                ((Integer) obj2).getClass();
                n6m.j(str, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 8:
                ((Integer) obj2).getClass();
                b9m.b(str, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 9:
                ((Integer) obj2).getClass();
                fbc.H(str, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 10:
                ((Integer) obj2).getClass();
                o9m.d(str, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 11:
                ((Integer) obj2).getClass();
                vbc.J(str, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 12:
                ((Integer) obj2).getClass();
                b34.Q(str, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 13:
                return qnr.a((qnr) obj2, 0L, null, null, false, 0L, 0L, null, null, this.b, null, null, false, false, false, false, false, false, false, false, null, false, false, false, false, false, false, false, false, false, null, null, false, false, null, null, null, null, null, null, null, null, null, false, null, false, -2049, 524287);
            case 14:
                return z2s.a((z2s) obj2, 0L, null, null, false, 0L, 0L, null, null, this.b, null, null, false, false, false, false, false, false, false, false, null, false, false, false, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, false, null, -2049, 65535);
            case 15:
                return r7s.a((r7s) obj2, 0L, null, null, false, 0L, 0L, null, null, null, this.b, null, null, null, false, false, false, false, false, false, false, false, null, null, false, false, false, false, false, false, null, false, false, false, null, null, false, false, null, null, null, null, null, null, null, null, null, false, -2049, 1048575);
            case 16:
                ((Integer) obj2).getClass();
                aac.b(str, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 17:
                return njs.a((njs) obj2, 0L, null, null, false, 0L, 0L, null, null, null, null, this.b, null, null, null, false, false, false, false, false, false, false, false, null, false, false, false, false, false, false, false, null, null, null, null, null, null, null, null, null, null, -4097, 65535);
            case 18:
                ((Integer) obj2).getClass();
                vic.o(str, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((Integer) obj2).getClass();
                qbc.u(str, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 20:
                ((Integer) obj2).getClass();
                ieb.K(str, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 21:
                ((Integer) obj2).getClass();
                ebc.A(str, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 22:
                ((Integer) obj2).getClass();
                kbc.x(str, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 23:
                ((Integer) obj2).getClass();
                kbc.L(str, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 24:
                ((Integer) obj2).getClass();
                h8x.g(str, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ttz ttzVar = (ttz) obj2;
                ((oyg0) obj).getClass();
                ttzVar.getClass();
                tn40 tn40Var2 = ttzVar.j;
                if (tn40Var2 != null) {
                    LimitGroupEnum limitGroupEnum = tn40Var2.f34218a;
                    trz trzVar = tn40Var2.b;
                    String str2 = tn40Var2.c;
                    String str3 = tn40Var2.d;
                    boolean z = tn40Var2.e;
                    boolean z2 = tn40Var2.f;
                    boolean z3 = tn40Var2.g;
                    qrz qrzVar = tn40Var2.h;
                    long j = tn40Var2.i;
                    long j2 = tn40Var2.j;
                    long j3 = tn40Var2.k;
                    boolean z4 = tn40Var2.m;
                    String str4 = tn40Var2.n;
                    long j4 = tn40Var2.o;
                    List list2 = tn40Var2.p;
                    boolean z5 = tn40Var2.q;
                    str2.getClass();
                    String str5 = this.b;
                    str5.getClass();
                    list2.getClass();
                    tn40Var = new tn40(limitGroupEnum, trzVar, str2, str3, z, z2, z3, qrzVar, j, j2, j3, str5, z4, str4, j4, list2, z5);
                } else {
                    tn40Var = null;
                }
                return ttz.a(ttzVar, null, null, 0, false, false, false, tn40Var, null, 1535);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((Integer) obj2).getClass();
                ffb0.t(str, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((Integer) obj2).getClass();
                yyw.h(str, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                m310 m310Var = (m310) obj2;
                ((oyg0) obj).getClass();
                m310Var.getClass();
                g310 g310Var = m310Var.j;
                List list3 = g310Var.e;
                if (list3.contains(str)) {
                    arrayListR1 = new ArrayList();
                    for (Object obj4 : list3) {
                        if (!Intrinsics.d((String) obj4, str)) {
                            arrayListR1.add(obj4);
                        }
                    }
                } else {
                    arrayListR1 = CollectionsKt.r0(list3, str);
                }
                return m310.a(m310Var, null, null, null, null, null, null, false, g310.a(g310Var, 0L, 0L, null, 0L, arrayListR1, 0L, false, 239), null, null, false, null, false, false, null, null, 33553919);
            default:
                a820 a820Var = (a820) obj2;
                ((oyg0) obj).getClass();
                a820Var.getClass();
                return a820.a(a820Var, null, null, null, null, null, null, new vtb0(0.0d, false, false, false, this.b, null, g920.PROMO, false), false, null, 0.0f, false, null, 0, false, false, false, 262015);
        }
    }

    public /* synthetic */ hxk(String str, byte b) {
        this.f13817a = b;
        this.b = str;
    }
}

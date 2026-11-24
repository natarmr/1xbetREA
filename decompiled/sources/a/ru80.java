package a;

import com.huawei.hms.api.ConnectionResult;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ru80 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f31114a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ ru80(Function1 function1, byte b) {
        this.f31114a = b;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f31114a;
        cl5 cl5Var = ukd.f35823a;
        jm40 jm40Var = jm40.b;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                function1.invoke(new tt80(((Integer) obj).intValue()));
                return Unit.f46060a;
            case 1:
                fxb.D(ivb0.b, new bh1((Object) function1, ((Integer) obj).intValue(), obj2, (byte) 7)).a();
                return Unit.f46060a;
            case 2:
                long jLongValue = ((Long) obj).longValue();
                ((Boolean) obj2).getClass();
                function1.invoke(new xya0(jLongValue));
                return Unit.f46060a;
            case 3:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    yyw.q(o7k0.d(jm40Var, 1.0f), function1, fetVar, 6);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 4:
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    uc50 uc50Var = new uc50(xsm0.s(R.string.filling_data, fetVar2));
                    boolean zG = fetVar2.g(function1);
                    Object objP = fetVar2.P();
                    if (zG || objP == cl5Var) {
                        objP = new rpa0(function1, (byte) 16);
                        fetVar2.o0(objP);
                    }
                    vtb.v(jm40.b, (Function1) objP, uc50Var, fetVar2, 6, 8);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 5:
                o4c0 o4c0Var = (o4c0) obj;
                ((Integer) obj2).getClass();
                o4c0Var.getClass();
                function1.invoke(o4c0Var);
                return Unit.f46060a;
            case 6:
                wim wimVar = (wim) obj;
                wimVar.getClass();
                function1.invoke(new xlc0(wimVar));
                return Unit.f46060a;
            case 7:
                function1.invoke(new zqk0(((Integer) obj).intValue()));
                return Unit.f46060a;
            case 8:
                aye0 aye0Var = (aye0) obj2;
                ((oyg0) obj).getClass();
                aye0Var.getClass();
                Pair pair = (Pair) function1.invoke(aye0Var);
                return aye0.a(aye0Var, false, false, false, null, null, (Map) pair.b, null, (q1f0) pair.f46059a, null, null, null, null, false, null, null, null, null, null, null, null, null, 2147483487);
            case 9:
                u4f0 u4f0Var = (u4f0) obj2;
                ((oyg0) obj).getClass();
                u4f0Var.getClass();
                Pair pair2 = (Pair) function1.invoke(u4f0Var);
                return u4f0.a(u4f0Var, false, false, null, null, (Map) pair2.b, null, (r1f0) pair2.f46059a, null, null, null, null, false, null, false, null, null, null, null, null, null, null, null, 1073741743);
            case 10:
                mbf0 mbf0Var = (mbf0) obj2;
                ((oyg0) obj).getClass();
                mbf0Var.getClass();
                Pair pair3 = (Pair) function1.invoke(mbf0Var);
                return mbf0.a(mbf0Var, false, false, null, null, (Map) pair3.b, null, (p1f0) pair3.f46059a, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, 1073741743);
            case 11:
                String str = (String) obj;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                str.getClass();
                function1.invoke(new llg0(str, zBooleanValue));
                return Unit.f46060a;
            case 12:
                dpa0 dpa0Var = (dpa0) obj;
                ne60 ne60Var = (ne60) obj2;
                dpa0Var.getClass();
                dpa0Var.a();
                if (function1 != null) {
                    function1.invoke(new xui0(ne60Var.f23370a));
                }
                return Unit.f46060a;
            case 13:
                dpa0 dpa0Var2 = (dpa0) obj;
                ne60 ne60Var2 = (ne60) obj2;
                dpa0Var2.getClass();
                dpa0Var2.a();
                if (function1 != null) {
                    function1.invoke(new i2l0(ne60Var2.f23370a));
                }
                return Unit.f46060a;
            case 14:
                long jLongValue2 = ((Long) obj).longValue();
                String str2 = (String) obj2;
                str2.getClass();
                function1.invoke(new frk0(jLongValue2, str2));
                return Unit.f46060a;
            case 15:
                int iIntValue3 = ((Integer) obj).intValue();
                String str3 = (String) obj2;
                str3.getClass();
                function1.invoke(new vxq0(new a5l0(iIntValue3, str3)));
                return Unit.f46060a;
            case 16:
                int iIntValue4 = ((Integer) obj).intValue();
                String str4 = (String) obj2;
                str4.getClass();
                function1.invoke(new vxq0(new a5l0(iIntValue4, str4)));
                return Unit.f46060a;
            case 17:
                int iIntValue5 = ((Integer) obj).intValue();
                iqr0 iqr0Var = (iqr0) obj2;
                iqr0Var.getClass();
                function1.invoke(new dpr0(iIntValue5, iqr0Var));
                return Unit.f46060a;
            case 18:
                function1.invoke(new utr0(((Integer) obj).intValue(), (int) ((Long) obj2).longValue()));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                fet fetVar3 = (fet) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (fetVar3.U(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                    String strW = rsm0.w(R.string.transaction_history_title, 0, fetVar3);
                    boolean zG2 = fetVar3.g(function1);
                    Object objP2 = fetVar3.P();
                    if (zG2 || objP2 == cl5Var) {
                        objP2 = new nas0(function1, (byte) 1);
                        fetVar3.o0(objP2);
                    }
                    dnm0.f(mm40VarD, strW, (Function0) objP2, fetVar3, 6);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 20:
                String str5 = (String) obj;
                long jLongValue3 = ((Long) obj2).longValue();
                str5.getClass();
                function1.invoke(new c5t0(str5, jLongValue3));
                return Unit.f46060a;
            case 21:
                String str6 = (String) obj;
                long jLongValue4 = ((Long) obj2).longValue();
                str6.getClass();
                function1.invoke(new c5t0(str6, jLongValue4));
                return Unit.f46060a;
            case 22:
                function1.invoke(new i8t0(((Integer) obj).intValue()));
                return Unit.f46060a;
            case 23:
                function1.invoke(obj);
                return Unit.f46060a;
            case 24:
                m9n m9nVar = (m9n) obj;
                m9nVar.getClass();
                function1.invoke(new qfv0(m9nVar, (String) obj2));
                return Unit.f46060a;
            default:
                m9n m9nVar2 = (m9n) obj;
                m9nVar2.getClass();
                function1.invoke(new kyv0(m9nVar2.getId(), (String) obj2));
                return Unit.f46060a;
        }
    }
}

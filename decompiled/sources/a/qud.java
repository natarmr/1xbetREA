package a;

import com.github.terrakok.cicerone.androidx.FragmentScreen$Companion$invoke$1;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class qud implements SuccessContinuation, u1j0 {
    public static lwi0 b(j6m0 j6m0Var) {
        return new lwi0(System.currentTimeMillis() + 3600000, new x860(8, false), new c34(true, false, false), 10.0d, 1.2d, 60);
    }

    public static boh c(Integer num) {
        Object next;
        c0o c0oVar = boh.f;
        y2 y2VarH = ohs0.h(c0oVar, c0oVar);
        while (true) {
            if (!y2VarH.hasNext()) {
                next = null;
                break;
            }
            next = y2VarH.next();
            int i = ((boh) next).f2933a;
            if (num != null && i == num.intValue()) {
                break;
            }
        }
        boh bohVar = (boh) next;
        return bohVar == null ? boh.UNKNOWN : bohVar;
    }

    public static boh d(Integer num, Boolean bool) {
        Object next;
        c0o c0oVar = boh.f;
        y2 y2VarH = ohs0.h(c0oVar, c0oVar);
        while (true) {
            if (!y2VarH.hasNext()) {
                next = null;
                break;
            }
            next = y2VarH.next();
            int i = ((boh) next).f2933a;
            if (num != null && i == num.intValue()) {
                break;
            }
        }
        boh bohVar = (boh) next;
        if (bohVar == null) {
            return Intrinsics.d(bool, Boolean.TRUE) ? boh.OLD_CYBER : boh.UNKNOWN;
        }
        return bohVar;
    }

    public static e4f e(int i) {
        switch (i) {
            case 1:
                return e4f.c;
            case 2:
                return e4f.d;
            case 3:
                return e4f.e;
            case 4:
                return e4f.f;
            case 5:
                return e4f.g;
            case 6:
                return e4f.h;
            case 7:
                return e4f.i;
            case 8:
                return e4f.j;
            default:
                return e4f.b;
        }
    }

    public static gmq f(anq0 anq0Var) {
        anq0Var.getClass();
        if (anq0Var.h == null && !anq0Var.i) {
            return new eu4(anq0Var, (byte) 12);
        }
        return bkb.h0(1L, TimeUnit.SECONDS, new yg1((Object) anq0Var, (yje) null, (byte) 7));
    }

    public static FragmentScreen$Companion$invoke$1 g(final int i, final we50 we50Var, final String str, final String str2, final String str3, final String str4, final List list, final List list2) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        we50Var.getClass();
        list.getClass();
        list2.getClass();
        return new FragmentScreen$Companion$invoke$1(null, new xbf() { // from class: a.pud
            @Override // a.xbf
            public final Object c(Object obj) {
                ((m1r) obj).getClass();
                nud.b2.getClass();
                String str5 = str;
                str5.getClass();
                String str6 = str2;
                str6.getClass();
                String str7 = str3;
                str7.getClass();
                String str8 = str4;
                str8.getClass();
                we50 we50Var2 = we50Var;
                we50Var2.getClass();
                List list3 = list;
                list3.getClass();
                List list4 = list2;
                list4.getClass();
                nud nudVar = new nud();
                iiy[] iiyVarArr = nud.c2;
                int i2 = 0;
                nudVar.N1.x(nudVar, iiyVarArr[0], str5);
                nudVar.O1.x(nudVar, iiyVarArr[1], str6);
                nudVar.Q1.x(nudVar, iiyVarArr[3], str7);
                switch (i) {
                    case 1:
                        i2 = 1;
                        break;
                    case 2:
                        i2 = 2;
                        break;
                    case 3:
                        i2 = 3;
                        break;
                    case 4:
                        i2 = 4;
                        break;
                    case 5:
                        i2 = 5;
                        break;
                    case 6:
                        i2 = 6;
                        break;
                    case 7:
                        i2 = 7;
                        break;
                    case 8:
                        i2 = 8;
                        break;
                    case 9:
                        i2 = 9;
                        break;
                    case 10:
                        i2 = 10;
                        break;
                    case 11:
                        i2 = 11;
                        break;
                    case 12:
                        i2 = 12;
                        break;
                    case 13:
                        i2 = 13;
                        break;
                    case 14:
                        i2 = 14;
                        break;
                    case 15:
                        i2 = 15;
                        break;
                    case 16:
                        i2 = 16;
                        break;
                    case 17:
                        i2 = 17;
                        break;
                    case 18:
                        i2 = 18;
                        break;
                    case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                        i2 = 19;
                        break;
                    case 20:
                        i2 = 20;
                        break;
                    case 21:
                        i2 = 21;
                        break;
                    case 22:
                        i2 = 22;
                        break;
                    case 23:
                        i2 = 23;
                        break;
                    case 24:
                        i2 = 24;
                        break;
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                        i2 = 25;
                        break;
                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        i2 = 26;
                        break;
                    case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                        i2 = 27;
                        break;
                }
                nudVar.P1.I(nudVar, iiyVarArr[2], i2);
                nudVar.R1.x(nudVar, iiyVarArr[4], str8);
                nudVar.S1.u(nudVar, iiyVarArr[5], we50Var2);
                nudVar.U1.D(nudVar, iiyVarArr[6], list3);
                nudVar.V1.D(nudVar, iiyVarArr[7], list4);
                return nudVar;
            }
        }, true);
    }

    public static void h(qud qudVar, androidx.fragment.app.e eVar, xdr xdrVar, Calendar calendar, int i, long j, gvb0 gvb0Var, int i2) {
        Function0 bmhVar = (i2 & 64) != 0 ? new bmh((byte) 24) : gvb0Var;
        qudVar.getClass();
        eVar.getClass();
        calendar.getClass();
        int i3 = calendar.get(1);
        int i4 = calendar.get(2);
        int i5 = calendar.get(5);
        if (eVar.J("DATE_PICKER_DIALOG_FRAGMENT") == null) {
            bej bejVar = new bej();
            iiy[] iiyVarArr = bej.j2;
            bejVar.d2.j(bejVar, iiyVarArr[2], 0L);
            bejVar.e2.j(bejVar, iiyVarArr[3], j);
            bejVar.f2.I(bejVar, iiyVarArr[4], i5);
            bejVar.g2.I(bejVar, iiyVarArr[5], i4);
            bejVar.h2.I(bejVar, iiyVarArr[6], i3);
            bejVar.b2.I(bejVar, iiyVarArr[0], i);
            bejVar.c2.x(bejVar, iiyVarArr[1], "");
            bejVar.Z1 = xdrVar;
            bejVar.a2 = bmhVar;
            bejVar.H0(eVar, "DATE_PICKER_DIALOG_FRAGMENT");
        }
    }

    @Override // a.u1j0
    public lwi0 a(j6m0 j6m0Var, JSONObject jSONObject) {
        return b(j6m0Var);
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        return Tasks.forResult(Boolean.TRUE);
    }
}

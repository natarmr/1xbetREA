package a;

import android.gov.nist.core.Separators;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import org.xplatform.uikit.components.cells.DsMenuCell;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class sbt0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f31952a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ sbt0(Function1 function1, byte b) {
        this.f31952a = b;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z;
        byte b = this.f31952a;
        byte b2 = 2;
        boolean z2 = false;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                function1.invoke(new fbt0(((Integer) obj).intValue()));
                break;
            case 1:
                function1.invoke(new fbt0(((Integer) obj).intValue()));
                break;
            case 2:
                function1.invoke(new j8t0(((Integer) obj).intValue()));
                break;
            case 3:
                function1.invoke(new q8t0(((Long) obj).longValue()));
                break;
            case 4:
                y8m y8mVar = (y8m) obj;
                y8mVar.getClass();
                Long lT0 = StringsKt.t0(y8mVar.b);
                function1.invoke(new t8t0(lT0 != null ? lT0.longValue() : 0L, y8mVar.d));
                break;
            case 5:
                function1.invoke(new n8t0((int) ((Long) obj).longValue()));
                break;
            case 6:
                y8m y8mVar2 = (y8m) obj;
                y8mVar2.getClass();
                function1.invoke(new r8t0(y8mVar2.f42203a));
                break;
            case 7:
                hdb hdbVar = (hdb) obj;
                hdbVar.getClass();
                function1.invoke(new wwt0(hdbVar));
                break;
            case 8:
                uss ussVar = (uss) obj;
                ussVar.getClass();
                function1.invoke(new xwt0(ussVar));
                break;
            case 9:
                function1.invoke(new jxt0(((Long) obj).longValue()));
                break;
            case 10:
                function1.invoke(new ext0(((Integer) obj).intValue()));
                break;
            case 11:
                String str = (String) obj;
                str.getClass();
                function1.invoke(new zwt0(str));
                break;
            case 12:
                nus nusVar = (nus) obj;
                nusVar.getClass();
                function1.invoke(new kxt0(nusVar));
                break;
            case 13:
                ims imsVar = (ims) obj;
                imsVar.getClass();
                function1.invoke(new axt0(imsVar));
                break;
            case 14:
                ((jtl) obj).getClass();
                function1.invoke(t9u0.f33586a);
                break;
            case 15:
                cp cpVar = (cp) obj;
                cpVar.getClass();
                DsMenuCell dsMenuCell = ((aux) cpVar.u).f1500a;
                dsMenuCell.getClass();
                dyb.O(dsMenuCell, new o7x(function1, cpVar, (byte) 17));
                cpVar.t(new a8u0(cpVar, b2));
                break;
            case 16:
                cp cpVar2 = (cp) obj;
                cpVar2.getClass();
                dyb.O(((ztx) cpVar2.u).f44983a, new o7x(function1, cpVar2, (byte) 18));
                cpVar2.t(new a8u0(cpVar2, (byte) 3));
                break;
            case 17:
                String str2 = (String) obj;
                str2.getClass();
                function1.invoke(new bou0(str2));
                break;
            case 18:
                function1.invoke(new aou0(((Boolean) obj).booleanValue()));
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                p3b p3bVar = (p3b) obj;
                p3bVar.getClass();
                function1.invoke(Integer.valueOf(p3bVar.f26292a));
                break;
            case 20:
                function1.invoke(new vou0(((Integer) obj).intValue()));
                break;
            case 21:
                function1.invoke(new uou0(((Long) obj).longValue()));
                break;
            case 22:
                String str3 = (String) obj;
                str3.getClass();
                function1.invoke(new wqu0(str3));
                break;
            case 23:
                function1.invoke(new vqu0(((Boolean) obj).booleanValue()));
                break;
            case 24:
                st0 st0Var = (st0) obj;
                st0Var.getClass();
                long j = st0Var.f32750a;
                mtr mtrVar = st0Var.d;
                function1.invoke(new kxq0(new hk0((int) j, j, mtrVar != null ? mtrVar.b : false)));
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                st0 st0Var2 = (st0) obj;
                st0Var2.getClass();
                function1.invoke(new kxq0(new gk0(st0Var2.f32750a)));
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                cp cpVar3 = (cp) obj;
                cpVar3.getClass();
                DsMenuCell dsMenuCell2 = ((yyx) cpVar3.u).f43490a;
                dsMenuCell2.getClass();
                dyb.O(dsMenuCell2, new o7x(function1, cpVar3, (byte) 19));
                cpVar3.t(new a8u0(cpVar3, (byte) 4));
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                cp cpVar4 = (cp) obj;
                cpVar4.getClass();
                dyb.O(((jtx) cpVar4.u).f17123a, new o7x(function1, cpVar4, (byte) 20));
                cpVar4.t(new a8u0(cpVar4, (byte) 5));
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                function1.invoke(new nsu0(((Long) obj).longValue()));
                break;
            default:
                x5q0 x5q0Var = (x5q0) obj;
                x5q0Var.getClass();
                if (x5q0Var instanceof w5q0) {
                    String str4 = ((w5q0) x5q0Var).f38596a;
                    boolean z3 = str4.length() == 0 || str4.equals(Separators.DOT);
                    int i = 0;
                    for (int i2 = 0; i2 < str4.length(); i2++) {
                        if (str4.charAt(i2) == '.') {
                            i++;
                        }
                    }
                    boolean z4 = i > 1;
                    int i3 = 0;
                    while (true) {
                        if (i3 < str4.length()) {
                            char cCharAt = str4.charAt(i3);
                            if (Character.isDigit(cCharAt) || cCharAt == '.') {
                                i3++;
                            } else {
                                z = true;
                            }
                        } else {
                            z = false;
                        }
                    }
                    List listI0 = StringsKt.i0(str4, new char[]{'.'}, 2);
                    String str5 = (String) listI0.get(0);
                    String str6 = (String) CollectionsKt.W(1, listI0);
                    if (str6 == null) {
                        str6 = "";
                    }
                    if (str5.length() <= 13 && str6.length() <= 2) {
                        z2 = true;
                    }
                    if (z3 || (!z4 && !z && z2)) {
                        function1.invoke(new zvu0(str4));
                    }
                }
                break;
        }
        return Unit.f46060a;
    }
}

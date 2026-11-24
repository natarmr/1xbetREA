package a;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.view.ContextThemeWrapper;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.components.buttons.DsButton;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class umu implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f35935a;

    public /* synthetic */ umu(mtv mtvVar) {
        this.f35935a = (byte) 22;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = 2;
        Object[] objArr = 0;
        switch (this.f35935a) {
            case 0:
                sbq sbqVar = (sbq) obj;
                sbqVar.getClass();
                return Boolean.valueOf(sbqVar.e == wbq.f38891a);
            case 1:
                rq60 rq60Var = (rq60) obj;
                rq60Var.getClass();
                evz evzVar = d270.b;
                int i = rq60Var.f30917a;
                evzVar.getClass();
                return new tq60(rq60Var, evz.c(i));
            case 2:
                tq60 tq60Var = (tq60) obj;
                tq60Var.getClass();
                return Boolean.valueOf(tq60Var.b != d270.UNKNOWN);
            case 3:
                Throwable th = (Throwable) obj;
                th.getClass();
                return Boolean.valueOf((th instanceof zhi0) && ((zhi0) th).c == i2o.IncorrectDataError);
            case 4:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                return Boolean.valueOf(agc.W(th2));
            case 5:
                String str = (String) obj;
                str.getClass();
                if (!StringsKt.P(str, ':')) {
                    return str;
                }
                Object objI = ttm0.I(2, str);
                if (objI == null) {
                    objI = "";
                }
                Character chI = ttm0.I(0, str);
                return objI + Separators.COLON + (chI != null ? chI : "");
            case 6:
                synchronized (xfk0.c) {
                    List list = xfk0.i;
                    int size = list.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        ((Function1) list.get(i2)).invoke(obj);
                    }
                }
                return Unit.f46060a;
            case 7:
                ((Throwable) obj).getClass();
                return Unit.f46060a;
            case 8:
                ecv0 ecv0Var = (ecv0) obj;
                ecv0Var.getClass();
                return Integer.valueOf(ecv0Var.f7586a);
            case 9:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                th3.printStackTrace();
                return Unit.f46060a;
            case 10:
                n1g n1gVar = (n1g) obj;
                rq2 rq2Var = new rq2();
                n1gVar.getClass();
                n1gVar.e = rq2Var;
                n1gVar.f = l1g.OPEN_SCREEN;
                n1gVar.g = k1g.OPEN_REGULAR;
                n1gVar.d = j1g.REAL;
                return Unit.f46060a;
            case 11:
                ((Throwable) obj).getClass();
                return Boolean.FALSE;
            case 12:
                cp cpVar = (cp) obj;
                cpVar.getClass();
                cpVar.t(new kgh(cpVar, (byte) 24));
                return Unit.f46060a;
            case 13:
                p6t0 p6t0Var = (p6t0) obj;
                p6t0Var.getClass();
                return p6t0Var.getKey();
            case 14:
                p6t0 p6t0Var2 = (p6t0) obj;
                p6t0Var2.getClass();
                return sre0.f32672a.b(p6t0Var2.getClass()).v();
            case 15:
                cp cpVar2 = (cp) obj;
                cpVar2.getClass();
                cpVar2.t(new umu((byte) 16));
                return Unit.f46060a;
            case 16:
                ((List) obj).getClass();
                return Unit.f46060a;
            case 17:
                cp cpVar3 = (cp) obj;
                cpVar3.getClass();
                cpVar3.t(new k2l(cpVar3, cpVar3, (byte) 29));
                return Unit.f46060a;
            case 18:
                cp cpVar4 = (cp) obj;
                cpVar4.getClass();
                cpVar4.t(new ctv(cpVar4, cpVar4, objArr == true ? 1 : 0));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                cp cpVar5 = (cp) obj;
                cpVar5.getClass();
                cpVar5.t(new kgh(cpVar5, (byte) 25));
                return Unit.f46060a;
            case 20:
                cp cpVar6 = (cp) obj;
                cpVar6.getClass();
                cpVar6.t(new kgh(cpVar6, (byte) 26));
                return Unit.f46060a;
            case 21:
                cp cpVar7 = (cp) obj;
                cpVar7.getClass();
                cpVar7.t(new kgh(cpVar7, (byte) 27));
                return Unit.f46060a;
            case 22:
                az40 az40Var = (az40) obj;
                zsb0 zsb0Var = mtv.c;
                Map mapA = az40Var.a();
                LinkedHashMap linkedHashMap = az40Var.f1700a;
                long j = 0;
                for (Map.Entry entry : mapA.entrySet()) {
                    if (entry.getValue() instanceof Set) {
                        zsb0 zsb0Var2 = (zsb0) entry.getKey();
                        Set set = (Set) entry.getValue();
                        String strB = mtv.b(System.currentTimeMillis());
                        if (set.contains(strB)) {
                            Object[] objArr2 = {strB};
                            HashSet hashSet = new HashSet(1);
                            Object obj2 = objArr2[0];
                            Objects.requireNonNull(obj2);
                            if (!hashSet.add(obj2)) {
                                e9d0.i(obj2, "duplicate element: ");
                                return null;
                            }
                            az40Var.c(zsb0Var2, Collections.unmodifiableSet(hashSet));
                            j++;
                        } else {
                            zsb0Var2.getClass();
                            az40Var.b();
                            linkedHashMap.remove(zsb0Var2);
                        }
                    }
                }
                if (j == 0) {
                    zsb0Var.getClass();
                    az40Var.b();
                    linkedHashMap.remove(zsb0Var);
                } else {
                    az40Var.c(zsb0Var, Long.valueOf(j));
                }
                return null;
            case 23:
                Context context = (Context) obj;
                context.getClass();
                ntv ntvVar = new ntv(context);
                ntvVar.setMinimum(0.0d);
                ntvVar.setMaximum(100.0d);
                ntvVar.setRadius(((double) context.getResources().getDisplayMetrics().widthPixels) / 13.5d);
                ntvVar.setBlurAmount(1.0E-4d);
                ntvVar.setOpaque(false);
                synchronized (ntvVar.p) {
                    ntvVar.b.clear();
                    ntvVar.c = true;
                }
                return ntvVar;
            case 24:
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                th4.printStackTrace();
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                Context context2 = (Context) obj;
                context2.getClass();
                DsButton dsButton = new DsButton(new ContextThemeWrapper(context2, R.style.DSButton_Large_Secondary), null, 6, 0);
                dsButton.setLoading(false);
                String string = context2.getString(R.string.load_archive);
                string.getClass();
                dsButton.l(string);
                return dsButton;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                cp cpVar8 = (cp) obj;
                cpVar8.getClass();
                cpVar8.t(new b1w(cpVar8, b));
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                x5w x5wVar = (x5w) obj;
                x5wVar.getClass();
                x5wVar.c();
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return Boolean.valueOf(((x5w) obj).f20939a.f24513a);
            default:
                cp cpVar9 = (cp) obj;
                cpVar9.getClass();
                cpVar9.t(new b1w(cpVar9, (byte) 3));
                return Unit.f46060a;
        }
    }

    public /* synthetic */ umu(byte b) {
        this.f35935a = b;
    }
}

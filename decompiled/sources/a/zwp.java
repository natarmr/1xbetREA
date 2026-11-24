package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class zwp implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f45117a;
    public final /* synthetic */ l7m0 b;

    public /* synthetic */ zwp(dnr dnrVar, pz40 pz40Var) {
        this.f45117a = (byte) 10;
        this.b = pz40Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f45117a;
        l7m0 l7m0Var = this.b;
        switch (b) {
            case 0:
                return ((qyp) l7m0Var.getValue()).c;
            case 1:
                return ((qyp) l7m0Var.getValue()).b.b;
            case 2:
                return Boolean.valueOf((((Number) l7m0Var.getValue()).floatValue() == 1.0f ? 1 : 0) ^ 1);
            case 3:
                ddk ddkVar = dnr.c2;
                return ((unr) l7m0Var.getValue()).f35977a;
            case 4:
                ddk ddkVar2 = dnr.c2;
                return ((unr) l7m0Var.getValue()).c;
            case 5:
                ddk ddkVar3 = dnr.c2;
                return ((unr) l7m0Var.getValue()).i;
            case 6:
                ddk ddkVar4 = dnr.c2;
                return ((unr) l7m0Var.getValue()).b;
            case 7:
                ddk ddkVar5 = dnr.c2;
                return Boolean.valueOf(((unr) l7m0Var.getValue()).g);
            case 8:
                ddk ddkVar6 = dnr.c2;
                return Boolean.valueOf(((unr) l7m0Var.getValue()).j);
            case 9:
                ddk ddkVar7 = dnr.c2;
                return ((unr) l7m0Var.getValue()).f;
            case 10:
                ddk ddkVar8 = dnr.c2;
                unr unrVar = (unr) l7m0Var.getValue();
                Iterator it = unrVar.e.iterator();
                int i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                    } else if (((cja) it.next()).getType() != unrVar.h) {
                        i++;
                    }
                }
                return Integer.valueOf(i >= 0 ? i : 0);
            case 11:
                ddk ddkVar9 = dnr.c2;
                return ((unr) l7m0Var.getValue()).d;
            case 12:
                return ((pjs) l7m0Var.getValue()).d;
            case 13:
                Boolean bool = (Boolean) l7m0Var.getValue();
                bool.getClass();
                return bool;
            case 14:
                xak xakVar = j2s.b2;
                return ((c3s) l7m0Var.getValue()).e;
            case 15:
                xak xakVar2 = j2s.b2;
                return Boolean.valueOf(((n930) l7m0Var.getValue()).c);
            case 16:
                xak xakVar3 = j2s.b2;
                return ((c3s) l7m0Var.getValue()).g;
            case 17:
                xak xakVar4 = j2s.b2;
                return ((c3s) l7m0Var.getValue()).f;
            case 18:
                xak xakVar5 = j2s.b2;
                return ((c3s) l7m0Var.getValue()).h;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                xak xakVar6 = j2s.b2;
                return Boolean.valueOf(((c3s) l7m0Var.getValue()).i);
            case 20:
                xak xakVar7 = j2s.b2;
                int iIndexOf = ((n930) l7m0Var.getValue()).g.indexOf(((n930) l7m0Var.getValue()).f);
                return Integer.valueOf(iIndexOf >= 0 ? iIndexOf : 0);
            case 21:
                xak xakVar8 = j2s.b2;
                return ((c3s) l7m0Var.getValue()).f3694a;
            case 22:
                xak xakVar9 = j2s.b2;
                return ((n930) l7m0Var.getValue()).f23119a;
            case 23:
                xak xakVar10 = j2s.b2;
                return ((c3s) l7m0Var.getValue()).b;
            case 24:
                xak xakVar11 = j2s.b2;
                return ((c3s) l7m0Var.getValue()).c;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                xak xakVar12 = j2s.b2;
                return ((c3s) l7m0Var.getValue()).d;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return Boolean.valueOf(l7m0Var.getValue() instanceof w7s);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                Object value = l7m0Var.getValue();
                value.getClass();
                return ((w7s) value).e;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                Object value2 = l7m0Var.getValue();
                value2.getClass();
                return ((w7s) value2).f;
            default:
                Object value3 = l7m0Var.getValue();
                value3.getClass();
                return Boolean.valueOf(((w7s) value3).i);
        }
    }

    public /* synthetic */ zwp(l7m0 l7m0Var, byte b) {
        this.f45117a = b;
        this.b = l7m0Var;
    }
}

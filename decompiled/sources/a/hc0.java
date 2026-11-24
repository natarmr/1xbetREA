package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hc0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f12795a;
    public final /* synthetic */ pru b;

    public /* synthetic */ hc0(pru pruVar, byte b) {
        this.f12795a = b;
        this.b = pruVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f12795a;
        pru pruVar = this.b;
        switch (b) {
            case 0:
                return new xq5(pruVar.a().O0);
            case 1:
                return new wd0(td0.f33741a, iun.f15405a, pruVar.a().b.v, null);
            case 2:
                hl1 hl1Var = pruVar.a().b;
                boolean z = hl1Var.f13233a.f8987a;
                iun iunVar = iun.f15405a;
                lun lunVar = lun.f20680a;
                lunVar.getClass();
                return new hz0("", q8h0.f28300a, "", z, iunVar, false, 0, lunVar, hl1Var.l);
            case 3:
                return new pj2(null, true, lj2.f20133a, false, false, true, true, pruVar.a());
            case 4:
                return pruVar.a();
            case 5:
                return pruVar.a().g.b.f20982a;
            case 6:
                return pruVar.a().g.h.f23390a;
            case 7:
                return pruVar.a();
            case 8:
                return pruVar.a();
            case 9:
                return pruVar.a();
            case 10:
                return pruVar.a();
            case 11:
                sff0 sff0VarA = pruVar.a();
                iun iunVar2 = iun.f15405a;
                xun xunVar = xun.f41520a;
                lun lunVar2 = lun.f20680a;
                lunVar2.getClass();
                return new jp6(true, false, false, true, iunVar2, iunVar2, iunVar2, xunVar, iunVar2, false, lunVar2, false, false, false, jg7.i, false, null, true, sff0VarA.J1, sff0VarA.O1, sff0VarA.l.g);
            case 12:
                return pruVar.a();
            case 13:
                return new pj8("", iun.f15405a, false, false, pruVar.a().d.f27973a.g);
            case 14:
                return new nl8(iun.f15405a, 0, false, false, null, pruVar.a().Y1);
            case 15:
                udl0 udl0Var = pruVar.a().h1;
                iun iunVar3 = iun.f15405a;
                return new lua(udl0Var, iunVar3, iunVar3, iunVar3, iunVar3, null, false);
            case 16:
                return pruVar.a();
            case 17:
                return pruVar.a();
            case 18:
                return pruVar.a();
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return Boolean.valueOf(pruVar.a().c.d);
            case 20:
                return pruVar.a();
            case 21:
                return pruVar.a();
            case 22:
                return pruVar.a();
            case 23:
                return pruVar.a();
            case 24:
                return pruVar.a();
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return pruVar.a();
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return pruVar.a();
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return pruVar.a();
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return pruVar.a();
            default:
                return pruVar.a();
        }
    }
}

package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b6u implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f2074a;
    public final /* synthetic */ pru b;

    public /* synthetic */ b6u(pru pruVar, byte b) {
        this.f2074a = b;
        this.b = pruVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f2074a;
        pru pruVar = this.b;
        switch (b) {
            case 0:
                return pruVar.a();
            case 1:
                return pruVar.a();
            case 2:
                return pruVar.a();
            case 3:
                return pruVar.a();
            case 4:
                return pruVar.a();
            case 5:
                return pruVar.a();
            case 6:
                return pruVar.a();
            case 7:
                return pruVar.a();
            case 8:
                return pruVar.a();
            case 9:
                return pruVar.a();
            case 10:
                return pruVar.a();
            case 11:
                return pruVar.a();
            case 12:
                return pruVar.a();
            case 13:
                return Integer.valueOf(pruVar.a().f32117a.b.d);
            case 14:
                sff0 sff0VarA = pruVar.a();
                tew tewVar = new tew(null, null);
                lun lunVar = lun.f20680a;
                lunVar.getClass();
                return new lew(0L, tewVar, sff0VarA, lunVar);
            case 15:
                sff0 sff0VarA2 = pruVar.a();
                lun lunVar2 = lun.f20680a;
                lunVar2.getClass();
                ucq ucqVar = sff0VarA2.f;
                return new ttz(lunVar2, lunVar2, 0, true, false, ucqVar.l, ucqVar.i, ucqVar.k, false, null, "");
            case 16:
                sff0 sff0VarA3 = pruVar.a();
                lun lunVar3 = lun.f20680a;
                lunVar3.getClass();
                ucq ucqVar2 = sff0VarA3.f;
                return new gvz(lunVar3, lunVar3, 0, true, false, ucqVar2.m, ucqVar2.k, null, "");
            case 17:
                sff0 sff0VarA4 = pruVar.a();
                lun lunVar4 = lun.f20680a;
                lunVar4.getClass();
                ucq ucqVar3 = sff0VarA4.f;
                return new ryz(lunVar4, lunVar4, 0, true, false, ucqVar3.l, ucqVar3.i, ucqVar3.k, null, "");
            case 18:
                sff0 sff0VarA5 = pruVar.a();
                lun lunVar5 = lun.f20680a;
                lunVar5.getClass();
                ucq ucqVar4 = sff0VarA5.f;
                return new e100(lunVar5, lunVar5, 0, true, false, ucqVar4.l, ucqVar4.i, ucqVar4.k, ucqVar4.j, null, lunVar5, null);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return pruVar.a();
            case 20:
                sff0 sff0VarA6 = pruVar.a();
                yfa0 yfa0Var = yfa0.INSTANCE;
                iun iunVar = iun.f15405a;
                boolean z = sff0VarA6.f32117a.g;
                ls2 ls2Var = new ls2();
                lun lunVar6 = lun.f20680a;
                lunVar6.getClass();
                return new z130(yfa0Var, iunVar, null, null, "", "", lunVar6, z, null, ls2Var, lunVar6, sff0VarA6.I1.f26017a);
            case 21:
                return pruVar.a();
            case 22:
                return pruVar.a();
            case 23:
                return pruVar.a();
            case 24:
                return pruVar.a();
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new qx60(new sc50(pruVar.a().d.f27973a.b), new gep("", "", "", false), new cfp(null, iun.f15405a), true, false, false, pruVar.a().g.e, null);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                boolean z2 = !pruVar.a().W1;
                m4s m4sVar = m4s.ANY;
                urs ursVar = urs.BY_POPULAR;
                iun iunVar2 = iun.f15405a;
                return new ty60(z2, iunVar2, 0, ursVar, m4sVar, 0, iunVar2);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return pruVar.a();
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return pruVar.a();
            default:
                return pruVar.a();
        }
    }
}

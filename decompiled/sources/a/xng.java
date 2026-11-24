package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.lang.annotation.Annotation;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesParentSectionModel;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class xng implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f41170a;

    public /* synthetic */ xng(byte b) {
        this.f41170a = b;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f41170a) {
            case 0:
                lc00 lc00VarB = kotlin.collections.a.b();
                for (int i = 0; i < 6; i++) {
                    lc00VarB.add(new una0(R.drawable.card_back));
                }
                return kotlin.collections.a.a(lc00VarB);
            case 1:
                return new yog(0.0f);
            case 2:
                return new zw3(okx.f25427a, (byte) 0);
            case 3:
                return new zw3(okx.f25427a, (byte) 0);
            case 4:
                return new zw3(kyg.f19102a, (byte) 0);
            case 5:
                return new zw3(dyg.f6891a, (byte) 0);
            case 6:
                return new zw3(c0h.f3523a, (byte) 0);
            case 7:
                return new zw3(wzg.f40018a, (byte) 0);
            case 8:
                zzg zzgVar = CyberGamesPage.Companion;
                tre0 tre0Var = sre0.f32672a;
                return new leh0("org.xplatform.cyber.section.api.domain.entity.CyberGamesPage", tre0Var.b(CyberGamesPage.class), new sgy[]{tre0Var.b(CyberGamesPage.OneXCyber.class), tre0Var.b(CyberGamesPage.Real.class), tre0Var.b(CyberGamesPage.Virtual.class)}, new jiy[]{new g0o("org.xplatform.cyber.section.api.domain.entity.CyberGamesPage.OneXCyber", CyberGamesPage.OneXCyber.INSTANCE, new Annotation[0]), new g0o("org.xplatform.cyber.section.api.domain.entity.CyberGamesPage.Real", CyberGamesPage.Real.INSTANCE, new Annotation[0]), new g0o("org.xplatform.cyber.section.api.domain.entity.CyberGamesPage.Virtual", CyberGamesPage.Virtual.INSTANCE, new Annotation[0])}, new Annotation[0]);
            case 9:
                return new g0o("org.xplatform.cyber.section.api.domain.entity.CyberGamesPage.OneXCyber", CyberGamesPage.OneXCyber.INSTANCE, new Annotation[0]);
            case 10:
                return new g0o("org.xplatform.cyber.section.api.domain.entity.CyberGamesPage.Real", CyberGamesPage.Real.INSTANCE, new Annotation[0]);
            case 11:
                return new g0o("org.xplatform.cyber.section.api.domain.entity.CyberGamesPage.Virtual", CyberGamesPage.Virtual.INSTANCE, new Annotation[0]);
            case 12:
                a0h a0hVar = CyberGamesParentSectionModel.Companion;
                tre0 tre0Var2 = sre0.f32672a;
                return new leh0("org.xplatform.cyber.section.api.domain.entity.CyberGamesParentSectionModel", tre0Var2.b(CyberGamesParentSectionModel.class), new sgy[]{tre0Var2.b(CyberGamesParentSectionModel.FromGame.class), tre0Var2.b(CyberGamesParentSectionModel.FromMain.class), tre0Var2.b(CyberGamesParentSectionModel.FromNewPopular.class), tre0Var2.b(CyberGamesParentSectionModel.FromPopular.class), tre0Var2.b(CyberGamesParentSectionModel.FromSection.class)}, new jiy[]{new g0o("org.xplatform.cyber.section.api.domain.entity.CyberGamesParentSectionModel.FromGame", CyberGamesParentSectionModel.FromGame.INSTANCE, new Annotation[0]), new g0o("org.xplatform.cyber.section.api.domain.entity.CyberGamesParentSectionModel.FromMain", CyberGamesParentSectionModel.FromMain.INSTANCE, new Annotation[0]), new g0o("org.xplatform.cyber.section.api.domain.entity.CyberGamesParentSectionModel.FromNewPopular", CyberGamesParentSectionModel.FromNewPopular.INSTANCE, new Annotation[0]), new g0o("org.xplatform.cyber.section.api.domain.entity.CyberGamesParentSectionModel.FromPopular", CyberGamesParentSectionModel.FromPopular.INSTANCE, new Annotation[0]), new g0o("org.xplatform.cyber.section.api.domain.entity.CyberGamesParentSectionModel.FromSection", CyberGamesParentSectionModel.FromSection.INSTANCE, new Annotation[0])}, new Annotation[0]);
            case 13:
                return new g0o("org.xplatform.cyber.section.api.domain.entity.CyberGamesParentSectionModel.FromGame", CyberGamesParentSectionModel.FromGame.INSTANCE, new Annotation[0]);
            case 14:
                return new g0o("org.xplatform.cyber.section.api.domain.entity.CyberGamesParentSectionModel.FromMain", CyberGamesParentSectionModel.FromMain.INSTANCE, new Annotation[0]);
            case 15:
                return new g0o("org.xplatform.cyber.section.api.domain.entity.CyberGamesParentSectionModel.FromNewPopular", CyberGamesParentSectionModel.FromNewPopular.INSTANCE, new Annotation[0]);
            case 16:
                return new g0o("org.xplatform.cyber.section.api.domain.entity.CyberGamesParentSectionModel.FromPopular", CyberGamesParentSectionModel.FromPopular.INSTANCE, new Annotation[0]);
            case 17:
                return new g0o("org.xplatform.cyber.section.api.domain.entity.CyberGamesParentSectionModel.FromSection", CyberGamesParentSectionModel.FromSection.INSTANCE, new Annotation[0]);
            case 18:
                return jm40.b;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new zw3(b8h.f2156a, (byte) 0);
            case 20:
                return new zw3(b8h.f2156a, (byte) 0);
            case 21:
                return new zw3(b8h.f2156a, (byte) 0);
            case 22:
                return new zw3(b8h.f2156a, (byte) 0);
            case 23:
                return new zw3(b8h.f2156a, (byte) 0);
            case 24:
                return new zw3(okx.f25427a, (byte) 0);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new zw3(okx.f25427a, (byte) 0);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new zw3(z0h.f43565a, (byte) 0);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new zw3(ne90.f23375a, (byte) 0);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new zw3(khh.f18292a, (byte) 0);
            default:
                return new zw3(n3h.f22850a, (byte) 0);
        }
    }
}

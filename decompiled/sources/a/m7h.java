package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.framework.common.BundleUtil;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class m7h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f21321a;

    public /* synthetic */ m7h(byte b) {
        this.f21321a = b;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = 0;
        byte b2 = 23;
        switch (this.f21321a) {
            case 0:
                xve xveVar = (xve) obj;
                xveVar.getClass();
                return xveVar;
            case 1:
                xt20 xt20Var = (xt20) obj;
                xt20Var.getClass();
                return lgi0.c(CollectionsKt.I(xt20Var.f41445a), new eoh0((byte) 23));
            case 2:
                xw7 xw7Var = (xw7) obj;
                xw7Var.getClass();
                return new sx3(xw7Var.f41596a, (byte) 1);
            case 3:
                xt20 xt20Var2 = (xt20) obj;
                xt20Var2.getClass();
                return lgi0.c(CollectionsKt.I(xt20Var2.f41445a), new eoh0((byte) 23));
            case 4:
                a2n a2nVar = (a2n) obj;
                a2nVar.getClass();
                return a2nVar.getKey();
            case 5:
                a2n a2nVar2 = (a2n) obj;
                a2nVar2.getClass();
                return sre0.f32672a.b(a2nVar2.getClass());
            case 6:
                fhl fhlVar = (fhl) obj;
                fhlVar.getClass();
                pz40 pz40Var = s6t0.f31722a;
                fhl.u(fhlVar, s6t0.b().f33626a.getBackground(), 0L, 0L, 0.0f, null, null, 0, 126);
                return Unit.f46060a;
            case 7:
                cp cpVar = (cp) obj;
                cpVar.getClass();
                cpVar.t(new ok(cpVar, cpVar, b2));
                return Unit.f46060a;
            case 8:
                cp cpVar2 = (cp) obj;
                cpVar2.getClass();
                cpVar2.t(new ok(cpVar2, cpVar2, (byte) 25));
                return Unit.f46060a;
            case 9:
                cp cpVar3 = (cp) obj;
                cpVar3.getClass();
                cpVar3.t(new ok(cpVar3, cpVar3, (byte) 26));
                return Unit.f46060a;
            case 10:
                cp cpVar4 = (cp) obj;
                cpVar4.getClass();
                ((vjd) cpVar4.u).b.setViewCompositionStrategy(pek0.g);
                cpVar4.t(new rn5(cpVar4, (byte) 29));
                return Unit.f46060a;
            case 11:
                cp cpVar5 = (cp) obj;
                cpVar5.getClass();
                cpVar5.t(new kgh(cpVar5, b));
                return Unit.f46060a;
            case 12:
                shh shhVar = (shh) obj;
                shhVar.getClass();
                return shhVar.f32211a + BundleUtil.UNDERLINE_TAG + shhVar.d;
            case 13:
                obj.getClass();
                return Unit.f46060a;
            case 14:
                xlh xlhVar = (xlh) obj;
                xlhVar.getClass();
                if (xlhVar instanceof vlh) {
                    return pgi0.k(CollectionsKt.I(((vlh) xlhVar).b), new m7h((byte) 15));
                }
                return xlhVar instanceof wlh ? pgi0.k(CollectionsKt.I(((wlh) xlhVar).b), new m7h((byte) 16)) : wun.f39799a;
            case 15:
                yih yihVar = (yih) obj;
                yihVar.getClass();
                return pgi0.k(CollectionsKt.I(yihVar.b), new m7h((byte) 17));
            case 16:
                cjh cjhVar = (cjh) obj;
                cjhVar.getClass();
                return pgi0.k(CollectionsKt.I(cjhVar.b), new m7h((byte) 18));
            case 17:
                glh glhVar = (glh) obj;
                glhVar.getClass();
                return pgi0.p(CollectionsKt.I(glhVar.d), new hfg(glhVar, (byte) 20));
            case 18:
                klh klhVar = (klh) obj;
                klhVar.getClass();
                return pgi0.k(CollectionsKt.I(klhVar.c), new qkh(klhVar, (byte) 0));
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                hcz hczVar = (hcz) obj;
                hczVar.getClass();
                hcz.g(hczVar, 6, null, null, rsr0.b, 6);
                return Unit.f46060a;
            case 20:
                hcz hczVar2 = (hcz) obj;
                hczVar2.getClass();
                hcz.g(hczVar2, 6, null, null, cwr0.b, 6);
                return Unit.f46060a;
            case 21:
                ((f7v0) obj).getClass();
                return Unit.f46060a;
            case 22:
                ((Long) obj).getClass();
                return Unit.f46060a;
            case 23:
                vpl vplVar = (vpl) obj;
                vplVar.getClass();
                return Long.valueOf(vplVar.f37811a);
            case 24:
                ((vpl) obj).getClass();
                return sre0.f32672a.b(vpl.class);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                vpl vplVar2 = (vpl) obj;
                vplVar2.getClass();
                return Long.valueOf(vplVar2.f37811a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((vpl) obj).getClass();
                return sre0.f32672a.b(vpl.class);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                vpl vplVar3 = (vpl) obj;
                vplVar3.getClass();
                return Long.valueOf(vplVar3.f37811a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((vpl) obj).getClass();
                return sre0.f32672a.b(vpl.class);
            default:
                uag0 uag0Var = (uag0) obj;
                uag0Var.getClass();
                uag0Var.h(1);
                return Unit.f46060a;
        }
    }
}

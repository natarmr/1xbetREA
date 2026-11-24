package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;

/* JADX INFO: loaded from: classes4.dex */
public final class fdg extends bnn0 implements Function2 {
    public final /* synthetic */ gdg i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fdg(gdg gdgVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = gdgVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new fdg(this.i, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((fdg) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        gdg gdgVar = this.i;
        gdgVar.w();
        c4m0 c4m0Var = gdgVar.x;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            gdgVar.x = slb.U(new fnq(vtb.M(((udg) gdgVar.g.f20589a).b.i), new adg(gdgVar, null, (byte) 0), (byte) 4), jiu0.a(gdgVar));
        }
        if (gdgVar.d.d == CyberGamesPage.OneXCyber.INSTANCE.f46556a) {
            gdgVar.x = slb.U(new fnq(vtb.M(gdgVar.h.f10230a.b.j), new adg(gdgVar, null, (byte) 1), (byte) 4), jiu0.a(gdgVar));
        }
        return Unit.f46060a;
    }
}

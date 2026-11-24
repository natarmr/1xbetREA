package a;

import android.content.ComponentCallbacks2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xplatform.mailing.api.presentation.models.TelegramBonusCodeParams;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class eup0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f8433a;
    public final /* synthetic */ gup0 b;

    public /* synthetic */ eup0(gup0 gup0Var, byte b) {
        this.f8433a = b;
        this.b = gup0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f8433a;
        gup0 gup0Var = this.b;
        switch (b) {
            case 0:
                m6m0 m6m0Var = gup0.n2;
                gup0Var.P0().x(iup0.f15408a);
                return Unit.f46060a;
            case 1:
                m6m0 m6m0Var2 = gup0.n2;
                gup0Var.P0().x(jup0.f17168a);
                return Unit.f46060a;
            case 2:
                m6m0 m6m0Var3 = gup0.n2;
                ComponentCallbacks2 application = gup0Var.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(oup0.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof oup0)) {
                        ze3Var = null;
                    }
                    oup0 oup0Var = (oup0) ze3Var;
                    if (oup0Var != null) {
                        return new swi(oup0Var.b, oup0Var.f25887a, (TelegramBonusCodeParams) gup0Var.k2.n(gup0Var, gup0.o2[0]));
                    }
                }
                jf4.n(b1j.i(oup0.class, "Cannot create dependency "));
                return null;
            case 3:
                m6m0 m6m0Var4 = gup0.n2;
                return new q0h0((rwi) ((swi) gup0Var.l2.getValue()).d.get());
            case 4:
                m6m0 m6m0Var5 = gup0.n2;
                gup0Var.P0().x(lup0.f20684a);
                return Unit.f46060a;
            default:
                m6m0 m6m0Var6 = gup0.n2;
                gup0Var.P0().x(kup0.f18922a);
                return Unit.f46060a;
        }
    }
}

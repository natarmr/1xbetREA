package a;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e820 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f7354a;
    public final /* synthetic */ i820 b;

    public /* synthetic */ e820(i820 i820Var, byte b) {
        this.f7354a = b;
        this.b = i820Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f7354a;
        yje yjeVar = null;
        i820 i820Var = this.b;
        switch (b) {
            case 0:
                atz atzVar = i820.U1;
                ((View) obj).getClass();
                wze wzeVarH0 = i820Var.H0();
                sac.V(jiu0.a(wzeVarH0), new z6e(1, wzeVarH0, wze.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 23), null, wzeVarH0.o.b, new oze(wzeVarH0, yjeVar, (byte) 0), 10);
                break;
            case 1:
                atz atzVar2 = i820.U1;
                ((View) obj).getClass();
                wze wzeVarH1 = i820Var.H0();
                wzeVarH1.r.f809a.c("bet_place_settings");
                wzeVarH1.x.f40143a.a(xun.f41520a, 3174L);
                p7m0 p7m0Var = wzeVarH1.I;
                Boolean bool = Boolean.TRUE;
                p7m0Var.getClass();
                p7m0Var.o(null, bool);
                wzeVarH1.t.d(new ejd(wzeVarH1, (byte) 16));
                break;
            case 2:
                atz atzVar3 = i820.U1;
                ((View) obj).getClass();
                i820Var.H0().D();
                break;
            case 3:
                atz atzVar4 = i820.U1;
                ((View) obj).getClass();
                i820Var.H0().D();
                break;
            default:
                int iIntValue = ((Integer) obj).intValue();
                atz atzVar5 = i820.U1;
                i820Var.G0().u.setCurrentItem(iIntValue);
                break;
        }
        return Unit.f46060a;
    }
}

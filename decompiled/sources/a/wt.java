package a;

import android.view.View;
import android.widget.LinearLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class wt implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39715a;
    public final /* synthetic */ ttn0 b;

    public /* synthetic */ wt(ttn0 ttn0Var, byte b) {
        this.f39715a = b;
        this.b = ttn0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f39715a;
        ttn0 ttn0Var = this.b;
        switch (b) {
            case 0:
                cp cpVar = (cp) obj;
                cpVar.getClass();
                LinearLayout linearLayout = ((yt) cpVar.u).f43194a;
                linearLayout.getClass();
                dyb.O(linearLayout, new k1(ttn0Var, cpVar, (byte) 17));
                cpVar.t(new j9(cpVar, (byte) 13));
                break;
            case 1:
                cp cpVar2 = (cp) obj;
                cpVar2.getClass();
                LinearLayout linearLayout2 = ((mif0) cpVar2.u).f21843a;
                linearLayout2.getClass();
                dyb.O(linearLayout2, new wt(ttn0Var, (byte) 2));
                break;
            default:
                ((View) obj).getClass();
                ttn0Var.invoke(bop0.UNDEFINED);
                break;
        }
        return Unit.f46060a;
    }
}

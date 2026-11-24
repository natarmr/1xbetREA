package a;

import android.view.View;
import android.widget.FrameLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b8s0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f2173a;
    public final /* synthetic */ oye b;

    public /* synthetic */ b8s0(oye oyeVar, byte b) {
        this.f2173a = b;
        this.b = oyeVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f2173a;
        oye oyeVar = this.b;
        switch (b) {
            case 0:
                cp cpVar = (cp) obj;
                cpVar.getClass();
                c3s0 c3s0Var = (c3s0) cpVar.u;
                FrameLayout frameLayout = c3s0Var.f3695a;
                frameLayout.getClass();
                dyb.O(frameLayout, new b8s0(oyeVar, (byte) 1));
                dyb.O(c3s0Var.c, new b8s0(oyeVar, (byte) 2));
                cpVar.t(new pgj0(cpVar, cpVar, (byte) 19));
                break;
            case 1:
                ((View) obj).getClass();
                oyeVar.invoke();
                break;
            default:
                ((View) obj).getClass();
                oyeVar.invoke();
                break;
        }
        return Unit.f46060a;
    }
}

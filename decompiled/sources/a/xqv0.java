package a;

import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class xqv0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ yqv0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xqv0(yqv0 yqv0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = yqv0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        yqv0 yqv0Var = this.k;
        switch (b) {
            case 0:
                return new xqv0(yqv0Var, yjeVar, (byte) 0);
            default:
                return new xqv0(yqv0Var, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
        }
        return ((xqv0) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        yqv0 yqv0Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    AndroidComposeView androidComposeView = yqv0Var.f43094a;
                    this.j = true;
                    Object objL = androidComposeView.w.l(this);
                    if (objL != wneVar) {
                        objL = Unit.f46060a;
                    }
                    if (objL == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    AndroidComposeView androidComposeView2 = yqv0Var.f43094a;
                    this.j = true;
                    Object objA = androidComposeView2.contentCaptureManager.a(this);
                    if (objA != wneVar2) {
                        objA = Unit.f46060a;
                    }
                    if (objA == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }
}

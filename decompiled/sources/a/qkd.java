package a;

import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qkd implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f28878a = 1;
    public final /* synthetic */ skd b;
    public final /* synthetic */ AndroidComposeView c;
    public final /* synthetic */ ugd d;

    public /* synthetic */ qkd(skd skdVar, AndroidComposeView androidComposeView, ugd ugdVar, int i) {
        this.b = skdVar;
        this.c = androidComposeView;
        this.d = ugdVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f28878a;
        ugd ugdVar = this.d;
        AndroidComposeView androidComposeView = this.c;
        skd skdVar = this.b;
        fet fetVar = (fet) obj;
        Integer num = (Integer) obj2;
        switch (b) {
            case 0:
                int iIntValue = num.intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    fetVar.e0(866651995);
                    bmd.a(androidComposeView, skdVar.l, ugdVar, fetVar, 0);
                    fetVar.r(false);
                } else {
                    fetVar.X();
                }
                break;
            default:
                num.getClass();
                skdVar.a(androidComposeView, ugdVar, fetVar, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ qkd(AndroidComposeView androidComposeView, skd skdVar, ugd ugdVar) {
        this.c = androidComposeView;
        this.b = skdVar;
        this.d = ugdVar;
    }
}

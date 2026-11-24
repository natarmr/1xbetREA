package a;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class v5c0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f36821a;
    public final /* synthetic */ b0c0 b;

    public /* synthetic */ v5c0(b0c0 b0c0Var, byte b) {
        this.f36821a = b;
        this.b = b0c0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f36821a;
        b0c0 b0c0Var = this.b;
        switch (b) {
            case 0:
                cp cpVar = (cp) obj;
                cpVar.getClass();
                n2k n2kVar = (n2k) cpVar.u;
                dyb.c0(n2kVar.b, new v5c0(b0c0Var, (byte) 1));
                n2kVar.c.setTitleMaxLines(2);
                n2kVar.c.setSubtitleMaxLines(1);
                cpVar.t(new ctv(cpVar, cpVar, (byte) 15));
                break;
            default:
                ((View) obj).getClass();
                b0c0Var.invoke();
                break;
        }
        return Unit.f46060a;
    }
}

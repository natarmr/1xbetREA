package a;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class u5c0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f35087a;
    public final /* synthetic */ b0c0 b;

    public /* synthetic */ u5c0(b0c0 b0c0Var, byte b) {
        this.f35087a = b;
        this.b = b0c0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f35087a;
        b0c0 b0c0Var = this.b;
        switch (b) {
            case 0:
                cp cpVar = (cp) obj;
                cpVar.getClass();
                o2k o2kVar = (o2k) cpVar.u;
                dyb.c0(o2kVar.b, new u5c0(b0c0Var, (byte) 1));
                o2kVar.b.setLabel(cpVar.v(R.string.promo_codes_title));
                cpVar.t(new ctv(cpVar, cpVar, (byte) 14));
                break;
            default:
                ((View) obj).getClass();
                b0c0Var.invoke();
                break;
        }
        return Unit.f46060a;
    }
}

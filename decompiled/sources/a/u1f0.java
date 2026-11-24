package a;

import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import org.xplatform.registration.simple.impl.presentation.state.models.fields.BonusStateModel;
import org.xplatform.registration.simple.impl.presentation.state.models.fields.CurrencyStateModel;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class u1f0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f34899a;
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ g090 e;

    public /* synthetic */ u1f0(int i, String str, String str2, g090 g090Var, byte b) {
        this.f34899a = b;
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = g090Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f34899a;
        g090 g090Var = this.e;
        String str = this.d;
        String str2 = this.c;
        int i = this.b;
        switch (b) {
            case 0:
                u4f0 u4f0Var = (u4f0) obj;
                u4f0Var.getClass();
                r1f0 r1f0VarA = r1f0.a(u4f0Var.g, null, false, new BonusStateModel(i, str2, str), null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, false, null, null, null, false, null, null, null, false, false, null, -5, 127);
                Map mapF = g090.f(u4f0Var, kotlin.collections.a.c(u0f0.v));
                ((vzg0) g090Var.f10448a).e("BONUS", r1f0VarA.c);
                return new Pair(r1f0VarA, mapF);
            default:
                u4f0 u4f0Var2 = (u4f0) obj;
                u4f0Var2.getClass();
                r1f0 r1f0VarA2 = r1f0.a(u4f0Var2.g, null, false, null, null, false, false, null, new CurrencyStateModel(i, str2, str), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, false, null, null, null, false, null, null, null, false, false, null, -129, 127);
                List listC = kotlin.collections.a.c(u0f0.i);
                g090Var.getClass();
                Map mapF2 = g090.f(u4f0Var2, listC);
                ((vzg0) g090Var.f10448a).e("CURRENCY", r1f0VarA2.h);
                return new Pair(r1f0VarA2, mapF2);
        }
    }
}

package a;

import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import org.xplatform.registration_default.impl.presentation.udf.state.models.fields.BonusStateModel;
import org.xplatform.registration_default.impl.presentation.udf.state.models.fields.CurrencyStateModel;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class wwe0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39884a;
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ dq00 e;

    public /* synthetic */ wwe0(int i, String str, String str2, dq00 dq00Var, byte b) {
        this.f39884a = b;
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = dq00Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f39884a;
        dq00 dq00Var = this.e;
        String str = this.d;
        String str2 = this.c;
        int i = this.b;
        switch (b) {
            case 0:
                aye0 aye0Var = (aye0) obj;
                aye0Var.getClass();
                q1f0 q1f0VarA = q1f0.a(aye0Var.h, null, false, null, null, false, false, null, new CurrencyStateModel(i, str2, str), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, false, null, null, null, false, false, null, null, false, false, null, -129, 127);
                List listC = kotlin.collections.a.c(u0f0.i);
                dq00Var.getClass();
                Map mapD = dq00.d(aye0Var, listC);
                ((vzg0) dq00Var.b).e("CURRENCY", q1f0VarA.h);
                return new Pair(q1f0VarA, mapD);
            default:
                aye0 aye0Var2 = (aye0) obj;
                aye0Var2.getClass();
                q1f0 q1f0VarA2 = q1f0.a(aye0Var2.h, null, false, new BonusStateModel(i, str2, str), null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, false, null, null, null, false, false, null, null, false, false, null, -5, 127);
                Map mapD2 = dq00.d(aye0Var2, kotlin.collections.a.c(u0f0.v));
                ((vzg0) dq00Var.b).e("BONUS", q1f0VarA2.c);
                return new Pair(q1f0VarA2, mapD2);
        }
    }
}

package a;

import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import org.xplatform.registration.visual.impl.presentation.state.models.fields.BonusStateModel;
import org.xplatform.registration.visual.impl.presentation.state.models.fields.CurrencyStateModel;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class baf0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f2254a;
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ j910 e;

    public /* synthetic */ baf0(int i, String str, String str2, j910 j910Var, byte b) {
        this.f2254a = b;
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = j910Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f2254a;
        j910 j910Var = this.e;
        String str = this.d;
        String str2 = this.c;
        int i = this.b;
        switch (b) {
            case 0:
                mbf0 mbf0Var = (mbf0) obj;
                mbf0Var.getClass();
                p1f0 p1f0VarA = p1f0.a(mbf0Var.g, null, false, null, null, false, false, null, new CurrencyStateModel(i, str2, str), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, false, null, null, null, false, false, null, null, false, false, null, -129, 127);
                List listC = kotlin.collections.a.c(u0f0.i);
                j910Var.getClass();
                Map mapE = j910.e(mbf0Var, listC);
                ((vzg0) j910Var.b).e("CURRENCY", p1f0VarA.h);
                return new Pair(p1f0VarA, mapE);
            default:
                mbf0 mbf0Var2 = (mbf0) obj;
                mbf0Var2.getClass();
                p1f0 p1f0VarA2 = p1f0.a(mbf0Var2.g, null, false, new BonusStateModel(i, str2, str), null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, false, null, null, null, false, false, null, null, false, false, null, -5, 127);
                Map mapE2 = j910.e(mbf0Var2, kotlin.collections.a.c(u0f0.v));
                ((vzg0) j910Var.b).e("BONUS", p1f0VarA2.c);
                return new Pair(p1f0VarA2, mapE2);
        }
    }
}

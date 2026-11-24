package a;

import android.javax.sip.message.Response;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class wb2 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f38854a;
    public final /* synthetic */ pru b;
    public final /* synthetic */ vzg0 c;
    public final /* synthetic */ g2v d;

    public /* synthetic */ wb2(pru pruVar, vzg0 vzg0Var, g2v g2vVar, byte b) {
        this.f38854a = b;
        this.b = pruVar;
        this.c = vzg0Var;
        this.d = g2vVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f38854a;
        vzg0 vzg0Var = this.c;
        pru pruVar = this.b;
        switch (b) {
            case 0:
                sff0 sff0VarA = pruVar.a();
                iun iunVar = iun.f15405a;
                Set set = (Set) vzg0Var.a("SAVED_SELECTED_SPORTS_IDS_KEY");
                if (set == null) {
                    set = xun.f41520a;
                }
                pb10 pb10Var = pb10.g;
                g2v g2vVar = this.d;
                mdm mdmVarB = g2v.b(g2vVar, pb10Var, null, null, 0, 0, R.string.data_retrieval_error, 0, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE);
                mdm mdmVarB2 = g2v.b(g2vVar, pb10.e, null, null, 0, 0, R.string.nothing_found, 0, 0, 0L, 0L, 990);
                mum0 mum0Var = sff0VarA.g;
                return new dc2(iunVar, set, false, false, true, false, mdmVarB, mdmVarB2, false, "", null, mum0Var.o, mum0Var.p);
            default:
                sff0 sff0VarA2 = pruVar.a();
                iun iunVar2 = iun.f15405a;
                Set set2 = (Set) vzg0Var.a("SAVED_SELECTED_SPORTS_IDS_KEY");
                if (set2 == null) {
                    set2 = xun.f41520a;
                }
                pb10 pb10Var2 = pb10.g;
                g2v g2vVar2 = this.d;
                mdm mdmVarB3 = g2v.b(g2vVar2, pb10Var2, null, null, 0, 0, R.string.data_retrieval_error, 0, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE);
                mdm mdmVarB4 = g2v.b(g2vVar2, pb10.e, null, null, 0, 0, R.string.nothing_found, 0, 0, 0L, 0L, 990);
                mum0 mum0Var2 = sff0VarA2.g;
                return new ad2(iunVar2, set2, false, true, false, false, mdmVarB3, mdmVarB4, false, "", mum0Var2.o, mum0Var2.p);
        }
    }
}

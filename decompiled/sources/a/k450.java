package a;

import android.javax.sip.message.Response;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class k450 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f17652a;
    public final /* synthetic */ o450 b;

    public /* synthetic */ k450(o450 o450Var, byte b) {
        this.f17652a = b;
        this.b = o450Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f17652a;
        o450 o450Var = this.b;
        switch (b) {
            case 0:
                fiu0 fiu0Var = o450Var.N1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            default:
                atz atzVar = o450.V1;
                ynb ynbVar = o450Var.Q1;
                if (ynbVar == null) {
                    Intrinsics.h("changeBalanceDialogProvider");
                    throw null;
                }
                bm5 bm5Var = bm5.e;
                String string = o450Var.G().getString(R.string.gift_balance_dialog_description);
                string.getClass();
                androidx.fragment.app.e eVarC = o450Var.C();
                eVarC.getClass();
                ynb.b(ynbVar, bm5Var, string, eVarC, false, "REQUEST_CHANGE_BALANCE_KEY", Response.BUSY_HERE);
                return Unit.f46060a;
        }
    }
}

package a;

import android.content.Intent;
import android.net.Uri;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nid0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f23581a;
    public final /* synthetic */ qid0 b;

    public /* synthetic */ nid0(qid0 qid0Var, byte b) {
        this.f23581a = b;
        this.b = qid0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f23581a;
        qid0 qid0Var = this.b;
        switch (b) {
            case 0:
                fiu0 fiu0Var = qid0Var.L1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                rl70 rl70Var = qid0.V1;
                return new kb6(qid0Var.n0());
            case 2:
                phf0 phf0Var = qid0Var.P1;
                iiy[] iiyVarArr = qid0.W1;
                return new oid0(qid0Var, phf0Var.n(qid0Var, iiyVarArr[1]), qid0Var.Q1.n(qid0Var, iiyVarArr[2]));
            case 3:
                rl70 rl70Var2 = qid0.V1;
                ((sid0) qid0Var.N1.getValue()).w();
                return Unit.f46060a;
            case 4:
                rl70 rl70Var3 = qid0.V1;
                kxq kxqVarN0 = qid0Var.n0();
                Intent intentJ = hne.j("android.settings.APPLICATION_DETAILS_SETTINGS");
                intentJ.setData(Uri.fromParts("package", kxqVarN0.getPackageName(), null));
                kxqVarN0.startActivityForResult(intentJ, 250);
                return Unit.f46060a;
            default:
                rl70 rl70Var4 = qid0.V1;
                ((sid0) qid0Var.N1.getValue()).w();
                return Unit.f46060a;
        }
    }
}

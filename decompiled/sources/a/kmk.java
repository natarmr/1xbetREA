package a;

import android.javax.sip.Dialog;
import java.util.function.UnaryOperator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class kmk implements UnaryOperator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f18543a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kmk(Object obj, byte b) {
        this.f18543a = b;
        this.b = obj;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        byte b = this.f18543a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                String str = (String) obj2;
                lmk lmkVar = (lmk) obj;
                return !Intrinsics.d(lmkVar.f20299a, str) ? new lmk(str, 1) : new lmk(str, lmkVar.b + 1);
            case 1:
                y5k0 y5k0Var = (y5k0) obj;
                y5k0Var.getClass();
                return y5k0.a(y5k0Var, null, null, (m6k0) obj2, false, 0, null, null, 0, null, null, null, null, null, null, null, 0, 0, false, 2097147);
            default:
                y5k0 y5k0Var2 = (y5k0) obj;
                y5k0Var2.getClass();
                return y5k0.a(y5k0Var2, (Dialog) obj2, null, null, false, 0, null, null, 0, null, null, null, null, null, null, null, 0, 0, false, 2097110);
        }
    }
}

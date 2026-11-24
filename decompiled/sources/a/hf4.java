package a;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hf4 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f12954a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ kie0 c;
    public final /* synthetic */ int d;

    public /* synthetic */ hf4(ArrayList arrayList, int i, kie0 kie0Var) {
        this.f12954a = (byte) 0;
        this.b = arrayList;
        this.d = i;
        this.c = kie0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f12954a;
        int i = this.d;
        kie0 kie0Var = this.c;
        ArrayList<pu90> arrayList = this.b;
        ou90 ou90Var = (ou90) obj;
        switch (b) {
            case 0:
                ou90Var.getClass();
                for (pu90 pu90Var : arrayList) {
                    Object objN = pu90Var.n();
                    p6z p6zVar = objN instanceof p6z ? (p6z) objN : null;
                    Object objG0 = p6zVar != null ? p6zVar.g0() : null;
                    if (Intrinsics.d(objG0, "AUTH_LOGIN_SIMPLE_REGISTER_LABEL")) {
                        ou90Var.m(pu90Var, kie0Var.f18333a, i - (pu90Var.b / 2), 0.0f);
                        kie0Var.f18333a += pu90Var.f27604a;
                    } else if (Intrinsics.d(objG0, "AUTH_LOGIN_SIMPLE_REGISTER_BUTTON")) {
                        ou90Var.m(pu90Var, kie0Var.f18333a, i - (pu90Var.b / 2), 0.0f);
                    }
                }
                break;
            case 1:
                ou90Var.getClass();
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    pu90 pu90Var2 = (pu90) arrayList.get(i2);
                    Object objN2 = pu90Var2.n();
                    p6z p6zVar2 = objN2 instanceof p6z ? (p6z) objN2 : null;
                    Object objG1 = p6zVar2 != null ? p6zVar2.g0() : null;
                    if (Intrinsics.d(objG1, "TOOLBAR_CONTAINER_KEY")) {
                        ou90Var.m(pu90Var2, 0, 0, 0.0f);
                    } else if (Intrinsics.d(objG1, "TAB_CONTENT_KEY")) {
                        ou90Var.m(pu90Var2, 0, kie0Var.f18333a - i, 0.0f);
                    }
                }
                break;
            default:
                ou90Var.getClass();
                for (pu90 pu90Var3 : arrayList) {
                    ou90Var.m(pu90Var3, kie0Var.f18333a, 0, 0.0f);
                    kie0Var.f18333a = pu90Var3.f27604a + i + kie0Var.f18333a;
                }
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ hf4(ArrayList arrayList, kie0 kie0Var, int i, byte b) {
        this.f12954a = b;
        this.b = arrayList;
        this.c = kie0Var;
        this.d = i;
    }
}

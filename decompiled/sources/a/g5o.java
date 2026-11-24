package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class g5o implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f10729a;
    public final /* synthetic */ i5o b;

    public /* synthetic */ g5o(i5o i5oVar, byte b) {
        this.f10729a = b;
        this.b = i5oVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f10729a;
        i5o i5oVar = this.b;
        switch (b) {
            case 0:
                k6o k6oVar = (k6o) obj;
                pek pekVar = i5o.Z1;
                k6oVar.getClass();
                if (k6oVar instanceof j6o) {
                    wus wusVar = ((j6o) k6oVar).f15998a;
                    xi70 xi70Var = i5oVar.Q1;
                    if (xi70Var == null) {
                        Intrinsics.h("quickBetDialogNavigator");
                        throw null;
                    }
                    wdk0 wdk0Var = i5oVar.O1;
                    if (wdk0Var == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    ntb.S(i5oVar, wusVar, xi70Var, wdk0Var, new g5o(i5oVar, (byte) 1));
                } else {
                    if (!(k6oVar instanceof i6o)) {
                        t9f.b();
                        return null;
                    }
                    xa30 xa30Var = ((i6o) k6oVar).f14251a;
                    wdk0 wdk0Var2 = i5oVar.O1;
                    if (wdk0Var2 == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    cww.v(i5oVar, xa30Var, wdk0Var2, new g5o(i5oVar, (byte) 2));
                }
                i5oVar.H0().x(g4o.f10676a);
                return Unit.f46060a;
            case 1:
                nus nusVar = (nus) obj;
                pek pekVar2 = i5o.Z1;
                nusVar.getClass();
                i5oVar.H0().x(new r4o(nusVar));
                return Unit.f46060a;
            default:
                ims imsVar = (ims) obj;
                pek pekVar3 = i5o.Z1;
                imsVar.getClass();
                i5oVar.H0().x(new j4o(imsVar));
                return Unit.f46060a;
        }
    }
}

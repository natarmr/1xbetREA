package a;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class mu7 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f22401a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;

    public /* synthetic */ mu7(byte b, int i, long j, Object obj) {
        this.f22401a = b;
        this.d = i;
        this.b = obj;
        this.c = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i;
        byte b = this.f22401a;
        long j = this.c;
        Object obj2 = this.b;
        int i2 = this.d;
        switch (b) {
            case 0:
                ou90 ou90Var = (ou90) obj;
                ou90Var.getClass();
                for (pu90 pu90Var : (ArrayList) obj2) {
                    Object objN = pu90Var.n();
                    p6z p6zVar = objN instanceof p6z ? (p6z) objN : null;
                    Object objG0 = p6zVar != null ? p6zVar.g0() : null;
                    if (Intrinsics.d(objG0, "TOOLBAR_ID")) {
                        ou90Var.m(pu90Var, 0, i2, 0.0f);
                        i = pu90Var.b;
                    } else if (Intrinsics.d(objG0, "SEGMENT_CONTROL_ID")) {
                        ou90Var.m(pu90Var, 0, i2, 0.0f);
                        i = pu90Var.b;
                    } else if (Intrinsics.d(objG0, "MIDDLE_CONTENT_ID")) {
                        ou90Var.m(pu90Var, 0, i2, 0.0f);
                        i = pu90Var.b;
                    } else if (Intrinsics.d(objG0, "BETTING_ID")) {
                        ou90Var.m(pu90Var, 0, p4e.h(j) - pu90Var.b, 0.0f);
                    } else if (Intrinsics.d(objG0, "BACKGROUND_ID")) {
                        ou90Var.m(pu90Var, 0, 0, 0.0f);
                    }
                    i2 += i;
                }
                break;
            case 1:
                ou90 ou90Var2 = (ou90) obj;
                ou90Var2.getClass();
                for (pu90 pu90Var2 : (ArrayList) obj2) {
                    Object objN2 = pu90Var2.n();
                    p6z p6zVar2 = objN2 instanceof p6z ? (p6z) objN2 : null;
                    Object objG1 = p6zVar2 != null ? p6zVar2.g0() : null;
                    if (Intrinsics.d(objG1, "PitchPlayerLogo")) {
                        zcl zclVar = qmk.f28987a;
                        ou90Var2.g(pu90Var2, (p4e.i(j) - pu90Var2.f27604a) / 2, ou90Var2.T(18.0f) - (pu90Var2.b / 2), 0.0f);
                    } else if (Intrinsics.d(objG1, "PitchPlayerName")) {
                        zcl zclVar2 = qmk.f28987a;
                        int iT = (ou90Var2.T(18.0f) * 2) - ou90Var2.T(4.0f);
                        ou90Var2.g(pu90Var2, i2, hne.d(p4e.h(j) - iT, pu90Var2.b, 2, iT), 0.0f);
                    } else if (Intrinsics.d(objG1, "PitchPlayerCaptainTag")) {
                        int i3 = p4e.i(j) / 2;
                        zcl zclVar3 = qmk.f28987a;
                        ou90Var2.g(pu90Var2, ou90Var2.T(10.0f) + i3, 0, 0.0f);
                    }
                }
                break;
            case 2:
                ou90 ou90Var3 = (ou90) obj;
                ou90Var3.getClass();
                int i4 = 0;
                for (pu90 pu90Var3 : (ArrayList) obj2) {
                    Object objN3 = pu90Var3.n();
                    p6z p6zVar3 = objN3 instanceof p6z ? (p6z) objN3 : null;
                    Object objG2 = p6zVar3 != null ? p6zVar3.g0() : null;
                    if (Intrinsics.d(objG2, "REGISTER_APP_BAR_ID")) {
                        ou90Var3.m(pu90Var3, 0, 0, 0.9f);
                        i4 += pu90Var3.b;
                    } else if (Intrinsics.d(objG2, "REGISTER_BOTTOM_BAR_ID")) {
                        ou90Var3.m(pu90Var3, 0, (p4e.h(j) - pu90Var3.b) - i2, 0.9f);
                    } else if (Intrinsics.d(objG2, "REGISTER_LOADER_ID")) {
                        ou90Var3.m(pu90Var3, 0, i4, 1.0f);
                    } else if (Intrinsics.d(objG2, "REGISTER_OVERLAY_LOADER_ID")) {
                        ou90Var3.m(pu90Var3, 0, i4, 2.0f);
                    } else {
                        ou90Var3.m(pu90Var3, 0, i4, 0.0f);
                    }
                }
                break;
            case 3:
                ou90 ou90Var4 = (ou90) obj;
                ou90Var4.getClass();
                int i5 = 0;
                for (pu90 pu90Var4 : (ArrayList) obj2) {
                    Object objN4 = pu90Var4.n();
                    p6z p6zVar4 = objN4 instanceof p6z ? (p6z) objN4 : null;
                    Object objG3 = p6zVar4 != null ? p6zVar4.g0() : null;
                    if (Intrinsics.d(objG3, "TOOLBAR_ID")) {
                        ou90Var4.m(pu90Var4, 0, 0, 0.9f);
                        i5 += pu90Var4.b;
                    } else if (Intrinsics.d(objG3, "REGISTER_BUTTON_ID")) {
                        ou90Var4.m(pu90Var4, 0, (p4e.h(j) - pu90Var4.b) - i2, 0.9f);
                    } else if (Intrinsics.d(objG3, "REGISTER_OVERLAY_LOADER_ID")) {
                        ou90Var4.m(pu90Var4, 0, i5, 1.0f);
                    } else {
                        ou90Var4.m(pu90Var4, 0, i5, 0.0f);
                    }
                }
                break;
            default:
                fhl fhlVar = (fhl) obj;
                fhlVar.getClass();
                int i6 = q3d.i((List) ((pz40) obj2).getValue());
                long j2 = this.c;
                if (i2 == i6) {
                    zcl zclVar4 = qmk.f28987a;
                    z1x.E(fhlVar, vgg0.c(0.0f, 0.0f, 16.0f, 16.0f, 3).a(fhlVar.d(), fhlVar.getLayoutDirection(), fhlVar), j2);
                } else {
                    fhl.u(fhlVar, j2, 0L, 0L, 0.0f, null, null, 0, 126);
                }
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ mu7(ArrayList arrayList, long j, int i, byte b) {
        this.f22401a = b;
        this.b = arrayList;
        this.c = j;
        this.d = i;
    }
}

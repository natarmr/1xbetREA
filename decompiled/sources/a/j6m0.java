package a;

import java.util.List;
import org.xplatform.feed.topgamesbystat.presentation.params.TopGamesByStatBottomSheetScreenParams;

/* JADX INFO: loaded from: classes4.dex */
public final class j6m0 implements lpj0, kotlin.coroutines.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f15996a;

    public j6m0(y2m0 y2m0Var, s2m0 s2m0Var, us3 us3Var) {
        this.f15996a = (byte) 18;
        us3Var.getClass();
    }

    public static ygq0 a(int i) {
        Object next;
        c0o c0oVar = ygq0.s;
        y2 y2VarH = ohs0.h(c0oVar, c0oVar);
        do {
            if (!y2VarH.hasNext()) {
                next = null;
                break;
            }
            next = y2VarH.next();
        } while (((ygq0) next).f42598a != i);
        ygq0 ygq0Var = (ygq0) next;
        return ygq0Var == null ? ygq0.NOT : ygq0Var;
    }

    public static List c(boolean z) {
        return z ? q3d.j(ygq0.NOT, ygq0.D_1, ygq0.D_5, ygq0.D_7, ygq0.D_10, ygq0.D_30, ygq0.CUSTOM_DATE) : q3d.j(ygq0.NOT, ygq0.ONE_X_DRIVE, ygq0.M_30, ygq0.H_1, ygq0.H_2, ygq0.H_6, ygq0.H_12, ygq0.H_24, ygq0.H_48, ygq0.CUSTOM_DATE);
    }

    public static List d() {
        return q3d.j(ygq0.NOT, ygq0.ONE_X_DRIVE, ygq0.M_30, ygq0.H_1, ygq0.H_2, ygq0.H_6, ygq0.H_12, ygq0.H_24);
    }

    public static void e(androidx.fragment.app.e eVar, String str, boolean z) {
        eVar.getClass();
        if (eVar.J("SupportAppBottomSheetDialog") != null) {
            return;
        }
        sin0 sin0Var = new sin0();
        iiy[] iiyVarArr = sin0.k2;
        sin0Var.g2.v(sin0Var, iiyVarArr[0], z);
        sin0Var.h2.x(sin0Var, iiyVarArr[1], str);
        sin0Var.H0(eVar, "SupportAppBottomSheetDialog");
    }

    public static void f(androidx.fragment.app.e eVar, TopGamesByStatBottomSheetScreenParams topGamesByStatBottomSheetScreenParams) {
        eVar.getClass();
        String str = b5r0.v2;
        if (eVar.J(str) == null) {
            b5r0 b5r0Var = new b5r0();
            b5r0Var.k2.J(b5r0Var, b5r0.u2[0], topGamesByStatBottomSheetScreenParams);
            sj3.E0(b5r0Var, eVar, str);
        }
    }

    @Override // a.lpj0
    public gmq b(w6n0 w6n0Var) {
        return new eu4(jpj0.f16905a, (byte) 12);
    }

    public String toString() {
        switch (this.f15996a) {
            case 0:
                return "SharingStarted.Eagerly";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ j6m0(byte b) {
        this.f15996a = b;
    }
}

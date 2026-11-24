package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.text.CharsKt;
import org.xplatform.aggregator.impl.category.data.models.AggregatorSortingOptionModel;
import org.xplatform.core.navigation.dialog.DialogScreen$Companion$invoke$1;
import org.xplatform.feed.linelive.presentation.dialogs.select_date_time.params.SelectTimeRangeScreenParams;
import org.xplatform.registration.success.api.RegistrationSuccessParams;

/* JADX INFO: loaded from: classes5.dex */
public final class lme0 implements lah0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f20292a;

    public lme0(r9u r9uVar) {
        this.f20292a = (byte) 28;
        r9uVar.getClass();
    }

    public static DialogScreen$Companion$invoke$1 a(RegistrationSuccessParams registrationSuccessParams) {
        m6f0.f2.getClass();
        return new DialogScreen$Companion$invoke$1(m6f0.h2, new ex60(registrationSuccessParams, (byte) 19));
    }

    public static void b(androidx.fragment.app.e eVar, String str, List list, AggregatorSortingOptionModel aggregatorSortingOptionModel) {
        eVar.getClass();
        list.getClass();
        aggregatorSortingOptionModel.getClass();
        String str2 = jlk0.p2;
        if (eVar.J(str2) == null) {
            jlk0 jlk0Var = new jlk0();
            iiy[] iiyVarArr = jlk0.o2;
            jlk0Var.k2.x(jlk0Var, iiyVarArr[0], str);
            jlk0Var.l2.I(jlk0Var, iiyVarArr[1], list);
            jlk0Var.m2.J(jlk0Var, iiyVarArr[2], aggregatorSortingOptionModel);
            jlk0Var.H0(eVar, str2);
        }
    }

    public static void c(androidx.fragment.app.e eVar, SelectTimeRangeScreenParams selectTimeRangeScreenParams) {
        eVar.getClass();
        String strK = kng0.k("SelectDateTimeBottomSheetDialog", selectTimeRangeScreenParams.b);
        if (eVar.J(strK) == null) {
            y3i0 y3i0Var = new y3i0();
            y3i0Var.k2.J(y3i0Var, y3i0.o2[0], selectTimeRangeScreenParams);
            y3i0Var.H0(eVar, strK);
        }
    }

    public String toString() {
        switch (this.f20292a) {
            case 12:
                String string = Integer.toString(hashCode(), CharsKt.checkRadix(16));
                string.getClass();
                return b1j.k("CreationExtras.Key@", string, Separators.LESS_THAN, sre0.f32672a.b(i0h0.class).J(), Separators.GREATER_THAN);
            default:
                return super.toString();
        }
    }

    public lme0(gl5 gl5Var, gle0 gle0Var) {
        this.f20292a = (byte) 25;
    }

    public /* synthetic */ lme0(byte b) {
        this.f20292a = b;
    }

    @Override // a.lah0
    public void onScrollLimit(int i, int i2, int i3, boolean z) {
    }

    @Override // a.lah0
    public void onScrollProgress(int i, int i2, int i3, int i4) {
    }
}

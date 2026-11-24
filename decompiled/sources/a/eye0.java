package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.picker.api.presentation.AnalyticsEntryPoint;
import org.xplatform.picker.api.presentation.PickerDialogParams;
import org.xplatform.registration_default.impl.presentation.udf.state.models.fields.CitizenshipStateModel;
import org.xplatform.registration_default.impl.presentation.udf.state.models.fields.CityStateModel;
import org.xplatform.registration_default.impl.presentation.udf.state.models.fields.CountryStateModel;
import org.xplatform.registration_default.impl.presentation.udf.state.models.fields.CurrencyStateModel;
import org.xplatform.registration_default.impl.presentation.udf.state.models.fields.DocumentStateModel;
import org.xplatform.registration_default.impl.presentation.udf.state.models.fields.RegionStateModel;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class eye0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f8625a;
    public final /* synthetic */ eze0 b;

    public /* synthetic */ eye0(eze0 eze0Var, byte b) {
        this.f8625a = b;
        this.b = eze0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        byte b = this.f8625a;
        byte b2 = 2;
        eze0 eze0Var = this.b;
        switch (b) {
            case 0:
                Throwable th = (Throwable) obj;
                th.getClass();
                th.printStackTrace();
                dq00 dq00Var = eze0Var.x0;
                ((eye0) dq00Var.c).invoke(new uwe0(dq00Var, b2));
                break;
            case 1:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                eze0Var.G(new uxe0(false));
                th2.printStackTrace();
                break;
            case 2:
                Function1 function1 = (Function1) obj;
                function1.getClass();
                eze0Var.H(new ru80(function1, (byte) 8));
                break;
            case 3:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                th3.printStackTrace();
                if (((aye0) eze0Var.D()).e.isEmpty()) {
                    p7m0 p7m0Var = eze0Var.i.f25029a;
                    do {
                        value = p7m0Var.getValue();
                        value.getClass();
                        eze0Var.f.getClass();
                    } while (!p7m0Var.m(value, aye0.a((aye0) value, false, false, true, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, 2147483641)));
                } else {
                    dq00 dq00Var2 = eze0Var.x0;
                    ((eye0) dq00Var2.c).invoke(new uwe0(dq00Var2, b2));
                }
                break;
            case 4:
                k0w0 k0w0Var = (k0w0) obj;
                nh70 nh70Var = eze0Var.s0;
                CitizenshipStateModel citizenshipStateModel = ((aye0) eze0Var.D()).h.o;
                PickerDialogParams pickerDialogParams = new PickerDialogParams(new PickerDialogParams.PickerType.Citizenship(citizenshipStateModel != null ? Integer.valueOf(citizenshipStateModel.f46872a) : null), AnalyticsEntryPoint.b);
                nh70Var.getClass();
                k0w0Var.l(nh70.h(pickerDialogParams));
                break;
            case 5:
                k0w0 k0w0Var2 = (k0w0) obj;
                nh70 nh70Var2 = eze0Var.s0;
                CityStateModel cityStateModel = ((aye0) eze0Var.D()).h.d;
                PickerDialogParams pickerDialogParams2 = new PickerDialogParams(new PickerDialogParams.PickerType.City(cityStateModel != null ? Integer.valueOf(cityStateModel.f46873a) : null), AnalyticsEntryPoint.b);
                nh70Var2.getClass();
                k0w0Var2.l(nh70.h(pickerDialogParams2));
                break;
            case 6:
                k0w0 k0w0Var3 = (k0w0) obj;
                nh70 nh70Var3 = eze0Var.s0;
                CountryStateModel countryStateModel = ((aye0) eze0Var.D()).h.g;
                PickerDialogParams pickerDialogParams3 = new PickerDialogParams(new PickerDialogParams.PickerType.Country(countryStateModel != null ? Integer.valueOf(countryStateModel.f46874a) : null), AnalyticsEntryPoint.b);
                nh70Var3.getClass();
                k0w0Var3.h(nh70.h(pickerDialogParams3));
                break;
            case 7:
                k0w0 k0w0Var4 = (k0w0) obj;
                nh70 nh70Var4 = eze0Var.s0;
                CurrencyStateModel currencyStateModel = ((aye0) eze0Var.D()).h.h;
                PickerDialogParams pickerDialogParams4 = new PickerDialogParams(new PickerDialogParams.PickerType.Currency(currencyStateModel != null ? Integer.valueOf(currencyStateModel.f46875a) : null), AnalyticsEntryPoint.b);
                nh70Var4.getClass();
                k0w0Var4.l(nh70.h(pickerDialogParams4));
                break;
            case 8:
                k0w0 k0w0Var5 = (k0w0) obj;
                nh70 nh70Var5 = eze0Var.s0;
                DocumentStateModel documentStateModel = ((aye0) eze0Var.D()).h.j;
                PickerDialogParams pickerDialogParams5 = new PickerDialogParams(new PickerDialogParams.PickerType.Document(documentStateModel != null ? Integer.valueOf(documentStateModel.f46876a) : null), AnalyticsEntryPoint.b);
                nh70Var5.getClass();
                k0w0Var5.l(nh70.h(pickerDialogParams5));
                break;
            case 9:
                k0w0 k0w0Var6 = (k0w0) obj;
                nh70 nh70Var6 = eze0Var.s0;
                RegionStateModel regionStateModel = ((aye0) eze0Var.D()).h.v;
                PickerDialogParams pickerDialogParams6 = new PickerDialogParams(new PickerDialogParams.PickerType.Region(regionStateModel != null ? Integer.valueOf(regionStateModel.f46878a) : null), AnalyticsEntryPoint.b);
                nh70Var6.getClass();
                k0w0Var6.l(nh70.h(pickerDialogParams6));
                break;
            case 10:
                k0w0 k0w0Var7 = (k0w0) obj;
                nh70 nh70Var7 = eze0Var.s0;
                CountryStateModel countryStateModel2 = ((aye0) eze0Var.D()).h.g;
                PickerDialogParams pickerDialogParams7 = new PickerDialogParams(new PickerDialogParams.PickerType.Phone(countryStateModel2 != null ? Integer.valueOf(countryStateModel2.f46874a) : null, true, ((aye0) eze0Var.D()).h.M == q7f0.PHONE), AnalyticsEntryPoint.b);
                nh70Var7.getClass();
                k0w0Var7.l(nh70.h(pickerDialogParams7));
                break;
            default:
                qxe0 qxe0Var = new qxe0((d7a) obj);
                int i = eze0.y0;
                eze0Var.G(qxe0Var);
                break;
        }
        return Unit.f46060a;
    }
}

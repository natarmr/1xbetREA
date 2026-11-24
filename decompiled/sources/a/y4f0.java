package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.picker.api.presentation.AnalyticsEntryPoint;
import org.xplatform.picker.api.presentation.PickerDialogParams;
import org.xplatform.registration.simple.impl.presentation.state.models.fields.CitizenshipStateModel;
import org.xplatform.registration.simple.impl.presentation.state.models.fields.CityStateModel;
import org.xplatform.registration.simple.impl.presentation.state.models.fields.CountryStateModel;
import org.xplatform.registration.simple.impl.presentation.state.models.fields.CurrencyStateModel;
import org.xplatform.registration.simple.impl.presentation.state.models.fields.DocumentStateModel;
import org.xplatform.registration.simple.impl.presentation.state.models.fields.RegionStateModel;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class y4f0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f42001a;
    public final /* synthetic */ x5f0 b;

    public /* synthetic */ y4f0(x5f0 x5f0Var, byte b) {
        this.f42001a = b;
        this.b = x5f0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f42001a;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        x5f0 x5f0Var = this.b;
        switch (b) {
            case 0:
                Throwable th = (Throwable) obj;
                th.getClass();
                th.printStackTrace();
                g090 g090Var = x5f0Var.y0;
                ((y4f0) g090Var.b).invoke(new t1f0(g090Var, objArr == true ? 1 : 0));
                break;
            case 1:
                Function1 function1 = (Function1) obj;
                function1.getClass();
                x5f0Var.H(new ru80(function1, (byte) 9));
                break;
            case 2:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                th2.printStackTrace();
                g090 g090Var2 = x5f0Var.y0;
                ((y4f0) g090Var2.b).invoke(new t1f0(g090Var2, objArr2 == true ? 1 : 0));
                break;
            case 3:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                x5f0Var.G(new o4f0(false));
                th3.printStackTrace();
                break;
            case 4:
                k0w0 k0w0Var = (k0w0) obj;
                nh70 nh70Var = x5f0Var.s0;
                CitizenshipStateModel citizenshipStateModel = ((u4f0) x5f0Var.D()).g.o;
                PickerDialogParams pickerDialogParams = new PickerDialogParams(new PickerDialogParams.PickerType.Citizenship(citizenshipStateModel != null ? Integer.valueOf(citizenshipStateModel.f46851a) : null), AnalyticsEntryPoint.b);
                nh70Var.getClass();
                k0w0Var.l(nh70.h(pickerDialogParams));
                break;
            case 5:
                k0w0 k0w0Var2 = (k0w0) obj;
                nh70 nh70Var2 = x5f0Var.s0;
                CityStateModel cityStateModel = ((u4f0) x5f0Var.D()).g.d;
                PickerDialogParams pickerDialogParams2 = new PickerDialogParams(new PickerDialogParams.PickerType.City(cityStateModel != null ? Integer.valueOf(cityStateModel.f46852a) : null), AnalyticsEntryPoint.b);
                nh70Var2.getClass();
                k0w0Var2.l(nh70.h(pickerDialogParams2));
                break;
            case 6:
                k0w0 k0w0Var3 = (k0w0) obj;
                nh70 nh70Var3 = x5f0Var.s0;
                CountryStateModel countryStateModel = ((u4f0) x5f0Var.D()).g.g;
                PickerDialogParams pickerDialogParams3 = new PickerDialogParams(new PickerDialogParams.PickerType.Country(countryStateModel != null ? Integer.valueOf(countryStateModel.f46853a) : null), AnalyticsEntryPoint.b);
                nh70Var3.getClass();
                k0w0Var3.l(nh70.h(pickerDialogParams3));
                break;
            case 7:
                k0w0 k0w0Var4 = (k0w0) obj;
                nh70 nh70Var4 = x5f0Var.s0;
                CurrencyStateModel currencyStateModel = ((u4f0) x5f0Var.D()).g.h;
                PickerDialogParams pickerDialogParams4 = new PickerDialogParams(new PickerDialogParams.PickerType.Currency(currencyStateModel != null ? Integer.valueOf(currencyStateModel.f46854a) : null), AnalyticsEntryPoint.b);
                nh70Var4.getClass();
                k0w0Var4.l(nh70.h(pickerDialogParams4));
                break;
            case 8:
                k0w0 k0w0Var5 = (k0w0) obj;
                nh70 nh70Var5 = x5f0Var.s0;
                DocumentStateModel documentStateModel = ((u4f0) x5f0Var.D()).g.j;
                PickerDialogParams pickerDialogParams5 = new PickerDialogParams(new PickerDialogParams.PickerType.Document(documentStateModel != null ? Integer.valueOf(documentStateModel.f46855a) : null), AnalyticsEntryPoint.b);
                nh70Var5.getClass();
                k0w0Var5.l(nh70.h(pickerDialogParams5));
                break;
            case 9:
                k0w0 k0w0Var6 = (k0w0) obj;
                nh70 nh70Var6 = x5f0Var.s0;
                RegionStateModel regionStateModel = ((u4f0) x5f0Var.D()).g.v;
                PickerDialogParams pickerDialogParams6 = new PickerDialogParams(new PickerDialogParams.PickerType.Region(regionStateModel != null ? Integer.valueOf(regionStateModel.f46857a) : null), AnalyticsEntryPoint.b);
                nh70Var6.getClass();
                k0w0Var6.l(nh70.h(pickerDialogParams6));
                break;
            case 10:
                k0w0 k0w0Var7 = (k0w0) obj;
                nh70 nh70Var7 = x5f0Var.s0;
                CountryStateModel countryStateModel2 = ((u4f0) x5f0Var.D()).g.g;
                PickerDialogParams pickerDialogParams7 = new PickerDialogParams(new PickerDialogParams.PickerType.Phone(countryStateModel2 != null ? Integer.valueOf(countryStateModel2.f46853a) : null, true, ((u4f0) x5f0Var.D()).g.M == q7f0.PHONE), AnalyticsEntryPoint.b);
                nh70Var7.getClass();
                k0w0Var7.l(nh70.h(pickerDialogParams7));
                break;
            default:
                l4f0 l4f0Var = new l4f0((d7a) obj);
                int i = x5f0.z0;
                x5f0Var.G(l4f0Var);
                break;
        }
        return Unit.f46060a;
    }
}

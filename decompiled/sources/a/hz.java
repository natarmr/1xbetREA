package a;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.picker.api.presentation.PickerParams;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class hz implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f13883a;
    public final /* synthetic */ mz b;

    public /* synthetic */ hz(mz mzVar, byte b) {
        this.f13883a = b;
        this.b = mzVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Object value;
        ArrayList arrayList;
        Object value2;
        ArrayList arrayList2;
        p6t0 p6t0Var;
        p6t0 p6t0VarC;
        byte b = this.f13883a;
        mz mzVar = this.b;
        switch (b) {
            case 0:
                Bundle bundle = (Bundle) obj2;
                jdk0 jdk0Var = mz.V1;
                int iH = f140.h(bundle, (String) obj, "KEY_PICKER_MODEL_REQUEST");
                if (((PickerParams) bundle.getParcelable("PICKER_PARAMS_KEY")) != null) {
                    g00 g00VarH0 = mzVar.H0();
                    sac.V(jiu0.a(g00VarH0), new nz(g00VarH0, (byte) 1), null, g00VarH0.p.f22085a, new ey((Object) g00VarH0, iH, (yje) null, (byte) 1), 10);
                }
                break;
            case 1:
                jdk0 jdk0Var2 = mz.V1;
                int iH2 = f140.h((Bundle) obj2, (String) obj, "KEY_PICKER_COUNTRY_ID_REQUEST");
                g00 g00VarH1 = mzVar.H0();
                sac.V(jiu0.a(g00VarH1), new nz(g00VarH1, (byte) 1), null, g00VarH1.p.f22085a, new ey((Object) g00VarH1, iH2, (yje) null, (byte) 1), 10);
                break;
            case 2:
                String str = (String) obj;
                vqp vqpVar = (vqp) obj2;
                jdk0 jdk0Var3 = mz.V1;
                str.getClass();
                vqpVar.getClass();
                p7m0 p7m0Var = mzVar.H0().A;
                do {
                    value = p7m0Var.getValue();
                    List<Object> list = (List) value;
                    arrayList = new ArrayList(r3d.q(list, 10));
                    for (Object objC : list) {
                        if (objC instanceof x7q0) {
                            x7q0 x7q0Var = (x7q0) objC;
                            if (x7q0Var.f40425a == vqpVar) {
                                objC = x7q0.c(x7q0Var, str, "", 13);
                            }
                        }
                        arrayList.add(objC);
                    }
                } while (!p7m0Var.m(value, arrayList));
                break;
            default:
                String str2 = (String) obj;
                vqp vqpVar2 = (vqp) obj2;
                jdk0 jdk0Var4 = mz.V1;
                str2.getClass();
                vqpVar2.getClass();
                p7m0 p7m0Var2 = mzVar.H0().A;
                do {
                    value2 = p7m0Var2.getValue();
                    List<p6t0> list2 = (List) value2;
                    arrayList2 = new ArrayList(r3d.q(list2, 10));
                    for (p6t0 p6t0Var2 : list2) {
                        if (p6t0Var2 instanceof xl90) {
                            p6t0Var = p6t0Var2;
                            xl90 xl90Var = (xl90) p6t0Var;
                            if (xl90Var.f41061a == vqpVar2) {
                                p6t0VarC = xl90.c(xl90Var, str2, null, null, null, null, 243);
                            }
                            arrayList2.add(p6t0VarC);
                        } else {
                            p6t0Var = p6t0Var2;
                        }
                        p6t0VarC = p6t0Var;
                        arrayList2.add(p6t0VarC);
                    }
                } while (!p7m0Var2.m(value2, arrayList2));
                break;
        }
        return Unit.f46060a;
    }
}

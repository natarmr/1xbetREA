package a;

import android.os.Build;
import android.view.View;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.io.IOException;
import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class mn1 implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f22068a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mn1(Object obj, byte b) {
        this.f22068a = b;
        this.b = obj;
    }

    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) throws IOException {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        byte b = this.f22068a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                Object objInvoke = ((oc) obj2).invoke(obj, yjeVar);
                return objInvoke == wne.f39444a ? objInvoke : Unit.f46060a;
            case 1:
                Object objInvoke2 = ((oc) obj2).invoke(obj, yjeVar);
                return objInvoke2 == wne.f39444a ? objInvoke2 : Unit.f46060a;
            case 2:
                o00 o00Var = new o00((gqt0) obj, (byte) 21);
                int i = uv1.X;
                ((uv1) obj2).H(o00Var);
                return Unit.f46060a;
            case 3:
                Object objInvoke3 = ((oc) obj2).invoke(obj, yjeVar);
                return objInvoke3 == wne.f39444a ? objInvoke3 : Unit.f46060a;
            case 4:
                Object objInvoke4 = ((oc) obj2).invoke(obj, yjeVar);
                return objInvoke4 == wne.f39444a ? objInvoke4 : Unit.f46060a;
            case 5:
                Object objInvoke5 = ((oc) obj2).invoke(obj, yjeVar);
                return objInvoke5 == wne.f39444a ? objInvoke5 : Unit.f46060a;
            case 6:
                Object objInvoke6 = ((oc) obj2).invoke(obj, yjeVar);
                return objInvoke6 == wne.f39444a ? objInvoke6 : Unit.f46060a;
            case 7:
                Object objInvoke7 = ((oc) obj2).invoke(obj, yjeVar);
                return objInvoke7 == wne.f39444a ? objInvoke7 : Unit.f46060a;
            case 8:
                if (((Boolean) obj).booleanValue()) {
                    hd2 hd2Var = (hd2) obj2;
                    int i2 = hd2.z;
                    p7m0 p7m0Var = hd2Var.i.f25029a;
                    do {
                        value = p7m0Var.getValue();
                        value.getClass();
                        hd2Var.f.getClass();
                    } while (!p7m0Var.m(value, ad2.a((ad2) value, null, null, true, false, false, false, null, 4091)));
                }
                return Unit.f46060a;
            case 9:
                Object objInvoke8 = ((oc) obj2).invoke(obj, yjeVar);
                return objInvoke8 == wne.f39444a ? objInvoke8 : Unit.f46060a;
            case 10:
                Object objInvoke9 = ((df2) obj2).invoke(obj, yjeVar);
                return objInvoke9 == wne.f39444a ? objInvoke9 : Unit.f46060a;
            case 11:
                Object objInvoke10 = ((df2) obj2).invoke(obj, yjeVar);
                return objInvoke10 == wne.f39444a ? objInvoke10 : Unit.f46060a;
            case 12:
                Object objInvoke11 = ((df2) obj2).invoke(obj, yjeVar);
                return objInvoke11 == wne.f39444a ? objInvoke11 : Unit.f46060a;
            case 13:
                fqp0 fqp0Var = (fqp0) obj;
                qi2 qi2Var = (qi2) obj2;
                boolean z = !((ei2) qi2Var.D()).c.getClass().equals(fqp0Var.getClass());
                p7m0 p7m0Var2 = qi2Var.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                    qi2Var.f.getClass();
                } while (!p7m0Var2.m(value2, ei2.a((ei2) value2, null, false, fqp0Var, z, false, null, 115)));
                return Unit.f46060a;
            case 14:
                nj2 nj2Var = (nj2) obj;
                fk2 fk2Var = (fk2) obj2;
                boolean z2 = !((pj2) fk2Var.D()).c.getClass().equals(nj2Var.getClass());
                p7m0 p7m0Var3 = fk2Var.i.f25029a;
                do {
                    value3 = p7m0Var3.getValue();
                    value3.getClass();
                    fk2Var.f.getClass();
                } while (!p7m0Var3.m(value3, pj2.a((pj2) value3, null, false, nj2Var, z2, false, false, false, 243)));
                return Unit.f46060a;
            case 15:
                gds0 gds0Var = (gds0) obj;
                ul2 ul2Var = (ul2) obj2;
                boolean z3 = !((nl2) ul2Var.D()).d.getClass().equals(gds0Var.getClass());
                p7m0 p7m0Var4 = ul2Var.i.f25029a;
                do {
                    value4 = p7m0Var4.getValue();
                    value4.getClass();
                    ul2Var.f.getClass();
                } while (!p7m0Var4.m(value4, nl2.a((nl2) value4, null, false, false, gds0Var, z3, false, false, null, null, 455)));
                return Unit.f46060a;
            case 16:
                Object objInvoke12 = ((qa) obj2).invoke(obj, yjeVar);
                return objInvoke12 == wne.f39444a ? objInvoke12 : Unit.f46060a;
            case 17:
                xex xexVar = (xex) obj2;
                if (Build.VERSION.SDK_INT >= 34) {
                    xexVar.D().startStylusHandwriting((View) xexVar.f40764a);
                }
                return Unit.f46060a;
            case 18:
                Object objInvoke13 = ((ee0) obj2).invoke(obj, yjeVar);
                return objInvoke13 == wne.f39444a ? objInvoke13 : Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                Object objInvoke14 = ((i8) obj2).invoke(obj, yjeVar);
                return objInvoke14 == wne.f39444a ? objInvoke14 : Unit.f46060a;
            case 20:
                Object objInvoke15 = ((sg3) obj2).invoke(obj, yjeVar);
                return objInvoke15 == wne.f39444a ? objInvoke15 : Unit.f46060a;
            case 21:
                Object objInvoke16 = ((i8) obj2).invoke(obj, yjeVar);
                return objInvoke16 == wne.f39444a ? objInvoke16 : Unit.f46060a;
            case 22:
                Object objInvoke17 = ((sg3) obj2).invoke(obj, yjeVar);
                return objInvoke17 == wne.f39444a ? objInvoke17 : Unit.f46060a;
            case 23:
                Object objInvoke18 = ((sg3) obj2).invoke(obj, yjeVar);
                return objInvoke18 == wne.f39444a ? objInvoke18 : Unit.f46060a;
            case 24:
                Object objInvoke19 = ((i8) obj2).invoke(obj, yjeVar);
                return objInvoke19 == wne.f39444a ? objInvoke19 : Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                Object objInvoke20 = ((i8) obj2).invoke(obj, yjeVar);
                return objInvoke20 == wne.f39444a ? objInvoke20 : Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                Object objInvoke21 = ((pa) obj2).invoke(obj, yjeVar);
                return objInvoke21 == wne.f39444a ? objInvoke21 : Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                Object objInvoke22 = ((i8) obj2).invoke(obj, yjeVar);
                return objInvoke22 == wne.f39444a ? objInvoke22 : Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                Object objInvoke23 = ((i8) obj2).invoke(obj, yjeVar);
                return objInvoke23 == wne.f39444a ? objInvoke23 : Unit.f46060a;
            default:
                Object objInvoke24 = ((cm3) obj2).invoke(obj, yjeVar);
                return objInvoke24 == wne.f39444a ? objInvoke24 : Unit.f46060a;
        }
    }
}

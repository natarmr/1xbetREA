package a;

import android.system.ErrnoException;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.uikit.components.chips.DsChip;
import org.xplatform.uikit.components.segmented_control.DsSegmentItem;

/* JADX INFO: loaded from: classes6.dex */
public final class ske implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f32343a;
    public static final ske b = new ske(0);
    public static final ske c = new ske(1);
    public static final ske d = new ske(2);
    public static final ske e = new ske(3);
    public static final ske f = new ske(4);
    public static final ske g = new ske(5);
    public static final ske h = new ske(6);
    public static final ske i = new ske(7);
    public static final ske j = new ske(8);
    public static final ske k = new ske(9);
    public static final ske l = new ske(10);
    public static final ske m = new ske(11);
    public static final ske n = new ske(12);
    public static final ske o = new ske(13);
    public static final ske p = new ske(14);
    public static final ske q = new ske(15);
    public static final ske r = new ske(16);
    public static final ske s = new ske(17);
    public static final ske t = new ske(18);
    public static final ske u = new ske(19);
    public static final ske v = new ske(20);
    public static final ske w = new ske(21);
    public static final ske x = new ske(22);
    public static final ske y = new ske(23);
    public static final ske z = new ske(24);
    public static final ske A = new ske(25);
    public static final ske B = new ske(26);
    public static final ske Y = new ske(27);
    public static final ske Z = new ske(28);
    public static final ske f1 = new ske(29);

    public /* synthetic */ ske(byte b2) {
        this.f32343a = b2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f32343a) {
            case 0:
                jhy jhyVar = (jhy) obj;
                jhyVar.getClass();
                return "  - " + jhyVar + " (" + uvw.x(jhyVar) + ')';
            case 1:
                fqy fqyVar = (fqy) obj;
                fqyVar.getClass();
                return fqyVar.e;
            case 2:
                fqy fqyVar2 = (fqy) obj;
                fqyVar2.getClass();
                return fqyVar2.c;
            case 3:
                ((Throwable) obj).getClass();
                return Unit.f46060a;
            case 4:
                return Boolean.valueOf(obj instanceof ErrnoException);
            case 5:
                float[] fArr = ((ui30) obj).f35710a;
                return Unit.f46060a;
            case 6:
                float[] fArr2 = ((ui30) obj).f35710a;
                return Unit.f46060a;
            case 7:
                return Boolean.valueOf(obj instanceof xw7);
            case 8:
                lwv0 lwv0Var = (lwv0) obj;
                lwv0Var.getClass();
                return lwv0Var.toString();
            case 9:
                lwv0 lwv0Var2 = (lwv0) obj;
                lwv0Var2.getClass();
                return jtt0.w(lwv0Var2);
            case 10:
                String str = (String) obj;
                str.getClass();
                return am.valueOf(str);
            case 11:
                String str2 = (String) obj;
                str2.getClass();
                return ifj.valueOf(str2);
            case 12:
                wsy wsyVar = (wsy) obj;
                iek iekVar = iek.c;
                wsyVar.getClass();
                return wsyVar;
            case 13:
                iek iekVar2 = iek.c;
                return "";
            case 14:
                wsy wsyVar2 = (wsy) obj;
                iiy[] iiyVarArr = lek.Z;
                wsyVar2.getClass();
                return wsyVar2;
            case 15:
                iiy[] iiyVarArr2 = lek.Z;
                ((k3u0) obj).getClass();
                return "...";
            case 16:
                vjj vjjVar = (vjj) obj;
                int i2 = rek.f30339a;
                vjjVar.getClass();
                return vjjVar.j();
            case 17:
                ((Number) obj).longValue();
                return Unit.f46060a;
            case 18:
                ((Number) obj).longValue();
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return Boolean.valueOf(obj instanceof DsChip);
            case 20:
                return Boolean.valueOf(obj instanceof DsChip);
            case 21:
                return Boolean.valueOf(obj instanceof DsSegmentItem);
            case 22:
                return ((k3u0) obj).getType();
            case 23:
                dre0 dre0Var = (dre0) obj;
                gi2 gi2Var = two.f34660a;
                dre0Var.getClass();
                elc elcVarD = two.d(dre0Var);
                sgy sgyVar = elcVarD instanceof sgy ? (sgy) elcVarD : null;
                return Boolean.valueOf(sgyVar != null && azw.G(sgyVar).isInterface());
            case 24:
                dre0 dre0Var2 = (dre0) obj;
                gi2 gi2Var2 = two.f34660a;
                dre0Var2.getClass();
                return Boolean.valueOf(Intrinsics.d(two.d(dre0Var2), sre0.f32672a.b(Object.class)));
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((qlc) obj).getClass();
                return 0;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return Boolean.TRUE;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                uag uagVar = (uag) obj;
                uagVar.getClass();
                return Boolean.valueOf(uagVar.b != 0);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                Throwable th = (Throwable) obj;
                th.getClass();
                return Boolean.valueOf((th instanceof zhi0) && ((zhi0) th).c == i2o.IncorrectDataError);
            default:
                ((String) obj).getClass();
                return Unit.f46060a;
        }
    }
}

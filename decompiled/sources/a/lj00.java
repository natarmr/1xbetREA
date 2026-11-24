package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class lj00 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f20132a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ lj00(Function1 function1, byte b) {
        this.f20132a = b;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f20132a;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                bem bemVar = (bem) obj;
                bemVar.getClass();
                function1.invoke(new fi00(bemVar));
                return Unit.f46060a;
            case 1:
                hdb hdbVar = (hdb) obj;
                hdbVar.getClass();
                function1.invoke(new ky00(hdbVar));
                return Unit.f46060a;
            case 2:
                uss ussVar = (uss) obj;
                ussVar.getClass();
                function1.invoke(new ly00(ussVar));
                return Unit.f46060a;
            case 3:
                function1.invoke(new iy00(((Integer) obj).intValue()));
                return Unit.f46060a;
            case 4:
                function1.invoke(new wy00(((Long) obj).longValue()));
                return Unit.f46060a;
            case 5:
                String str = (String) obj;
                str.getClass();
                function1.invoke(new ny00(str));
                return Unit.f46060a;
            case 6:
                nus nusVar = (nus) obj;
                nusVar.getClass();
                function1.invoke(new xy00(nusVar));
                return Unit.f46060a;
            case 7:
                ims imsVar = (ims) obj;
                imsVar.getClass();
                function1.invoke(new oy00(imsVar));
                return Unit.f46060a;
            case 8:
                zb10 zb10Var = (zb10) obj;
                zb10Var.getClass();
                function1.invoke(zb10Var.b);
                return Unit.f46060a;
            case 9:
                kkm kkmVar = (kkm) obj;
                kkmVar.getClass();
                function1.invoke(kkmVar.b);
                return Unit.f46060a;
            case 10:
                ((Integer) obj).intValue();
                function1.invoke(ne10.f23361a);
                return Unit.f46060a;
            case 11:
                j6z j6zVar = (j6z) obj;
                j6zVar.getClass();
                if (((int) (j6zVar.g() >> 32)) == 0 || ((int) (j6zVar.g() & 4294967295L)) == 0) {
                    return Unit.f46060a;
                }
                long jY = j6zVar.Y(0L);
                function1.invoke(new ne60((((long) Float.floatToRawIntBits((((int) (j6zVar.g() >> 32)) / 2.0f) + Float.intBitsToFloat((int) (jY >> 32)))) << 32) | (((long) Float.floatToRawIntBits((((int) (j6zVar.g() & 4294967295L)) / 2.0f) + Float.intBitsToFloat((int) (jY & 4294967295L)))) & 4294967295L)));
                return Unit.f46060a;
            case 12:
                List list = (List) obj;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (list.size() % 2 != 0) {
                    jf4.n("non-zero remainder");
                    return null;
                }
                for (int i = 0; i < list.size(); i += 2) {
                    Object obj2 = list.get(i);
                    obj2.getClass();
                    linkedHashMap.put((String) obj2, list.get(i + 1));
                }
                return function1.invoke(linkedHashMap);
            case 13:
                wgl0 wgl0Var = (wgl0) obj;
                wgl0Var.getClass();
                if (wgl0Var instanceof vgl0) {
                    fxb.D(ivb0.b, new mbz(function1, wgl0Var, (byte) 17)).a();
                }
                return Unit.f46060a;
            case 14:
                xgl0 xgl0Var = (xgl0) obj;
                xgl0Var.getClass();
                fxb.D(ivb0.b, new mbz(function1, xgl0Var, (byte) 18)).a();
                return Unit.f46060a;
            case 15:
                wgl0 wgl0Var2 = (wgl0) obj;
                wgl0Var2.getClass();
                if (wgl0Var2 instanceof vgl0) {
                    function1.invoke(new hn6(((vgl0) wgl0Var2).f37387a));
                }
                return Unit.f46060a;
            case 16:
                ((lwk) obj).getClass();
                function1.invoke(ty20.d);
                return new b1z(function1, (byte) 1);
            case 17:
                function1.invoke(((Boolean) obj).booleanValue() ? ty20.b : ty20.f34731a);
                return Unit.f46060a;
            case 18:
                String str2 = (String) obj;
                str2.getClass();
                function1.invoke(new zy20(str2));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                String str3 = (String) obj;
                str3.getClass();
                function1.invoke(new zy20(str3));
                return Unit.f46060a;
            case 20:
                String str4 = (String) obj;
                str4.getClass();
                function1.invoke(new zy20(str4));
                return Unit.f46060a;
            case 21:
                String str5 = (String) obj;
                str5.getClass();
                function1.invoke(new zy20(str5));
                return Unit.f46060a;
            case 22:
                xgl0 xgl0Var2 = (xgl0) obj;
                xgl0Var2.getClass();
                function1.invoke(new vgl0(xgl0Var2));
                return Unit.f46060a;
            case 23:
                xgl0 xgl0Var3 = (xgl0) obj;
                xgl0Var3.getClass();
                function1.invoke(new vgl0(xgl0Var3));
                return Unit.f46060a;
            case 24:
                xgl0 xgl0Var4 = (xgl0) obj;
                xgl0Var4.getClass();
                function1.invoke(new vgl0(xgl0Var4));
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                xgl0 xgl0Var5 = (xgl0) obj;
                xgl0Var5.getClass();
                function1.invoke(new vgl0(xgl0Var5));
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                xgl0 xgl0Var6 = (xgl0) obj;
                xgl0Var6.getClass();
                function1.invoke(new vgl0(xgl0Var6));
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                function1.invoke(new hms(((Long) obj).longValue()));
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                function1.invoke(new gms(((Long) obj).longValue()));
                return Unit.f46060a;
            default:
                kim kimVar = (kim) obj;
                kimVar.getClass();
                if (kimVar instanceof iim) {
                    function1.invoke(new m62(((iim) kimVar).f14835a));
                } else if (kimVar.equals(eim.f7867a)) {
                    function1.invoke(e62.f7260a);
                } else if (kimVar.equals(gim.f11355a)) {
                    function1.invoke(k62.f17746a);
                } else if (kimVar instanceof fim) {
                    int i2 = ((fim) kimVar).f9595a;
                    if (i2 == 1) {
                        function1.invoke(h62.f12509a);
                    } else if (i2 == 2) {
                        function1.invoke(o62.f24712a);
                    }
                }
                return Unit.f46060a;
        }
    }
}

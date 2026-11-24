package a;

import android.content.res.Resources;
import com.huawei.hms.api.ConnectionResult;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class jno implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f16822a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ jno(byte b, boolean z) {
        this.f16822a = b;
        this.b = z;
    }

    /* JADX WARN: Code duplicated, block: B:70:0x01da  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List listJ;
        List listJ2;
        float density;
        byte b = this.f16822a;
        boolean z = true;
        byte b2 = 3;
        boolean z2 = this.b;
        switch (b) {
            case 0:
                lno lnoVar = (lno) obj;
                lnoVar.getClass();
                Map map = lnoVar.f20356a;
                LinkedHashMap linkedHashMap = new LinkedHashMap(wp20.a(map.size()));
                Iterator it = map.entrySet().iterator();
                while (it.hasNext()) {
                    linkedHashMap.put(((Map.Entry) it.next()).getKey(), Boolean.valueOf(z2));
                }
                return new lno(linkedHashMap, true);
            case 1:
                iz30 iz30Var = (iz30) obj;
                iz30Var.getClass();
                if (z2) {
                    int iOrdinal = iz30Var.ordinal();
                    if (iOrdinal == 3 || iOrdinal == 7 || iOrdinal == 9 || iOrdinal == 56 || iOrdinal == 38 || iOrdinal == 39 || iOrdinal == 42 || iOrdinal == 43 || iOrdinal == 46 || iOrdinal == 47 || iOrdinal == 50 || iOrdinal == 51 || iOrdinal == 63 || iOrdinal == 64) {
                        z = false;
                    } else {
                        switch (iOrdinal) {
                            case 14:
                            case 15:
                            case 16:
                            case 17:
                            case 18:
                            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                            case 20:
                            case 21:
                                z = false;
                        }
                    }
                    break;
                }
                return Boolean.valueOf(z);
            case 2:
                ((Resources) obj).getClass();
                return Boolean.valueOf(z2);
            case 3:
                pi9 pi9Var = (pi9) obj;
                pi9Var.getClass();
                if (z2) {
                    pz40 pz40Var = s6t0.f31722a;
                    listJ = q3d.j(new y3d(StaticColors.INSTANCE.m121getTransparent0d7_KjU()), new y3d(s6t0.b().f33626a.getBackground()));
                } else {
                    pz40 pz40Var2 = s6t0.f31722a;
                    listJ = q3d.j(new y3d(s6t0.b().f33626a.getBackground()), new y3d(StaticColors.INSTANCE.m121getTransparent0d7_KjU()));
                }
                return pi9Var.a(new n51(new e900(listJ, null, (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L)), (byte) 4));
            case 4:
                pi9 pi9Var2 = (pi9) obj;
                pi9Var2.getClass();
                if (z2) {
                    pz40 pz40Var3 = s6t0.f31722a;
                    listJ2 = q3d.j(new y3d(StaticColors.INSTANCE.m121getTransparent0d7_KjU()), new y3d(s6t0.b().f33626a.getBackground()));
                } else {
                    pz40 pz40Var4 = s6t0.f31722a;
                    listJ2 = q3d.j(new y3d(s6t0.b().f33626a.getBackground()), new y3d(StaticColors.INSTANCE.m121getTransparent0d7_KjU()));
                }
                return pi9Var2.a(new n51(new e900(listJ2, null, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L)), b2));
            case 5:
                uag0 uag0Var = (uag0) obj;
                uag0Var.getClass();
                if (z2) {
                    zcl zclVar = qmk.f28987a;
                    density = -(uag0Var.t.getDensity() * 16.0f);
                } else {
                    zcl zclVar2 = qmk.f28987a;
                    density = uag0Var.t.getDensity() * 16.0f;
                }
                uag0Var.H(density);
                uag0Var.I(-(uag0Var.t.getDensity() * 32.0f));
                return Unit.f46060a;
            case 6:
                hcz hczVar = (hcz) obj;
                hczVar.getClass();
                if (z2) {
                    hcz.e(hczVar, null, null, wha0.g, 3);
                }
                hcz.g(hczVar, 8, null, null, wha0.h, 6);
                return Unit.f46060a;
            case 7:
                abi0 abi0Var = (abi0) obj;
                abi0Var.getClass();
                if (!z2) {
                    iiy[] iiyVarArr = yai0.f42300a;
                    abi0Var.b(xai0.j, Unit.f46060a);
                }
                return Unit.f46060a;
            default:
                abi0 abi0Var2 = (abi0) obj;
                abi0Var2.getClass();
                p8n.c(abi0Var2, z2);
                return Unit.f46060a;
        }
    }
}

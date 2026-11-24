package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import org.xplatform.uikit.components.chips.DsChip;
import org.xplatform.uikit.components.chips.DsChipGroup;
import org.xplatform.uikit.compose.components.calendar.model.DateRangeModel;
import org.xplatform.uikit.compose.components.picker.model.SimpleDate;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class xjl implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40990a;

    public /* synthetic */ xjl(byte b) {
        this.f40990a = b;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f40990a) {
            case 0:
                Map map = (Map) obj;
                map.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : map.entrySet()) {
                    if (entry.getValue() instanceof Integer) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    if (StringsKt.t0((String) entry2.getKey()) != null) {
                        linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                    }
                }
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(wp20.a(linkedHashMap2.size()));
                for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                    linkedHashMap3.put(Long.valueOf(Long.parseLong((String) entry3.getKey())), entry3.getValue());
                }
                LinkedHashMap linkedHashMap4 = new LinkedHashMap(wp20.a(linkedHashMap3.size()));
                for (Map.Entry entry4 : linkedHashMap3.entrySet()) {
                    Object key = entry4.getKey();
                    Object value = entry4.getValue();
                    value.getClass();
                    linkedHashMap4.put(key, new y3d(fbc.d(((Integer) value).intValue())));
                }
                return new LinkedHashMap(linkedHashMap4);
            case 1:
                Map map2 = (Map) obj;
                map2.getClass();
                LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                for (Map.Entry entry5 : map2.entrySet()) {
                    if (entry5.getValue() instanceof Integer) {
                        linkedHashMap5.put(entry5.getKey(), entry5.getValue());
                    }
                }
                LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                for (Map.Entry entry6 : linkedHashMap5.entrySet()) {
                    if (StringsKt.t0((String) entry6.getKey()) != null) {
                        linkedHashMap6.put(entry6.getKey(), entry6.getValue());
                    }
                }
                LinkedHashMap linkedHashMap7 = new LinkedHashMap(wp20.a(linkedHashMap6.size()));
                for (Map.Entry entry7 : linkedHashMap6.entrySet()) {
                    linkedHashMap7.put(Long.valueOf(Long.parseLong((String) entry7.getKey())), entry7.getValue());
                }
                LinkedHashMap linkedHashMap8 = new LinkedHashMap(wp20.a(linkedHashMap7.size()));
                for (Map.Entry entry8 : linkedHashMap7.entrySet()) {
                    Object key2 = entry8.getKey();
                    Object value2 = entry8.getValue();
                    value2.getClass();
                    linkedHashMap8.put(key2, new y3d(fbc.d(((Integer) value2).intValue())));
                }
                return new LinkedHashMap(linkedHashMap8);
            case 2:
                return new daq0(idm0.v(daq0.c(((daq0) obj).f5764a) - daq0.c(qmk.n), 4294967296L));
            case 3:
                ((Long) obj).getClass();
                return Unit.f46060a;
            case 4:
                w6k w6kVar = (w6k) obj;
                w6kVar.getClass();
                zcl zclVar = qmk.f28987a;
                int i = -w6kVar.T(1.0f);
                return new ikx((((long) (-w6kVar.T(1.0f))) & 4294967295L) | (((long) i) << 32));
            case 5:
                ((SimpleDate) obj).getClass();
                return Unit.f46060a;
            case 6:
                return Unit.f46060a;
            case 7:
                return Unit.f46060a;
            case 8:
                ((DateRangeModel) obj).getClass();
                return Unit.f46060a;
            case 9:
                ((mvl) obj).getClass();
                return Unit.f46060a;
            case 10:
                ((mvl) obj).getClass();
                return Unit.f46060a;
            case 11:
                DsChip dsChip = (DsChip) obj;
                int i2 = DsChipGroup.r;
                dsChip.getClass();
                return Boolean.valueOf(dsChip.isSelected());
            case 12:
                ((Boolean) obj).getClass();
                return Unit.f46060a;
            case 13:
                ((Long) obj).getClass();
                return Unit.f46060a;
            case 14:
                ((Long) obj).getClass();
                return Unit.f46060a;
            case 15:
                ((abi0) obj).getClass();
                return Unit.f46060a;
            case 16:
                return Float.valueOf(((Float) obj).floatValue() * 0.5f);
            case 17:
                hcz hczVar = (hcz) obj;
                hczVar.getClass();
                hcz.g(hczVar, 6, null, null, y0x0.c, 6);
                return Unit.f46060a;
            case 18:
                ((Long) obj).getClass();
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((Long) obj).getClass();
                return Unit.f46060a;
            case 20:
                ((Long) obj).getClass();
                return Unit.f46060a;
            case 21:
                ((Long) obj).getClass();
                return Unit.f46060a;
            case 22:
                ((Integer) obj).getClass();
                return Unit.f46060a;
            case 23:
                uag0 uag0Var = (uag0) obj;
                uag0Var.getClass();
                uag0Var.w(-1.0f);
                return Unit.f46060a;
            case 24:
                ((c53) obj).getClass();
                return ay3.e0(kzn.d(ro4.m0(120, 0, null, 6), 0.0f, 2), kzn.e(ro4.m0(120, 0, null, 6), 2));
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                t2m t2mVar = (t2m) obj;
                t2mVar.getClass();
                return sre0.f32672a.b(t2mVar.getClass());
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ibm ibmVar = (ibm) obj;
                ibmVar.getClass();
                return ibmVar.f14494a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((ibm) obj).getClass();
                return sre0.f32672a.b(ibm.class);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ybm ybmVar = (ybm) obj;
                ybmVar.getClass();
                return String.valueOf(ybmVar.getId());
            default:
                ((Long) obj).getClass();
                return Unit.f46060a;
        }
    }
}

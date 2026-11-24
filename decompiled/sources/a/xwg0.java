package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xwg0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f41609a;

    public /* synthetic */ xwg0(byte b) {
        this.f41609a = b;
    }

    /* JADX WARN: Code duplicated, block: B:129:0x0401 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:130:0x0403 A[LOOP:2: B:117:0x03bc->B:130:0x0403, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:141:0x0406 A[SYNTHETIC] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        z83 z83Var;
        Object objA;
        switch (this.f41609a) {
            case 0:
                return Unit.f46060a;
            case 1:
                czg0 czg0Var = (czg0) obj2;
                Map map = czg0Var.f5222a;
                hz40 hz40Var = czg0Var.b;
                Object[] objArr = hz40Var.b;
                Object[] objArr2 = hz40Var.c;
                long[] jArr = hz40Var.f13891a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    int i4 = (i << 3) + i3;
                                    Object obj3 = objArr[i4];
                                    Map mapE = ((fzg0) objArr2[i4]).e();
                                    if (mapE.isEmpty()) {
                                        map.remove(obj3);
                                    } else {
                                        map.put(obj3, mapE);
                                    }
                                }
                                j >>= 8;
                            }
                            if (i2 == 8) {
                                if (i != length) {
                                    i++;
                                }
                            }
                        } else if (i != length) {
                            i++;
                        }
                    }
                }
                if (map.isEmpty()) {
                    return null;
                }
                return map;
            case 2:
                return obj2;
            case 3:
                j83 j83Var = (j83) obj2;
                return q3d.e(j83Var.b, z0h0.a(j83Var.f16067a, z0h0.f43566a, (azg0) obj));
            case 4:
                return Integer.valueOf(((k5q0) obj2).f17733a);
            case 5:
                f8q0 f8q0Var = (f8q0) obj2;
                return q3d.e(Float.valueOf(f8q0Var.f9121a), Float.valueOf(f8q0Var.b));
            case 6:
                azg0 azg0Var = (azg0) obj;
                g8q0 g8q0Var = (g8q0) obj2;
                daq0 daq0Var = new daq0(g8q0Var.f10879a);
                y0h0 y0h0Var = z0h0.v;
                return q3d.e(z0h0.a(daq0Var, y0h0Var, azg0Var), z0h0.a(new daq0(g8q0Var.b), y0h0Var, azg0Var));
            case 7:
                return Integer.valueOf(((psq) obj2).f27526a);
            case 8:
                jb00 jb00Var = (jb00) obj2;
                return q3d.e(jb00Var.f16214a, z0h0.a(jb00Var.b, z0h0.i, (azg0) obj));
            case 9:
                return Float.valueOf(((j56) obj2).f15918a);
            case 10:
                azg0 azg0Var2 = (azg0) obj;
                List list = (List) obj2;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i5 = 0; i5 < size; i5++) {
                    arrayList.add(z0h0.a((i83) list.get(i5), z0h0.b, azg0Var2));
                }
                return arrayList;
            case 11:
                o9q0 o9q0Var = (o9q0) obj2;
                return q3d.e(Integer.valueOf((int) (o9q0Var.f24893a >> 32)), Integer.valueOf((int) (o9q0Var.f24893a & 4294967295L)));
            case 12:
                azg0 azg0Var3 = (azg0) obj;
                ljj0 ljj0Var = (ljj0) obj2;
                return q3d.e(z0h0.a(new y3d(ljj0Var.f20155a), z0h0.p, azg0Var3), z0h0.a(new ne60(ljj0Var.b), z0h0.x, azg0Var3), Float.valueOf(ljj0Var.c));
            case 13:
                return Integer.valueOf(((f2q0) obj2).f8826a);
            case 14:
                return Integer.valueOf(((n5q0) obj2).f22957a);
            case 15:
                return Integer.valueOf(((fuw) obj2).f10185a);
            case 16:
                return Integer.valueOf(((lsq) obj2).f20592a);
            case 17:
                return Integer.valueOf(((msq) obj2).f22332a);
            case 18:
                daq0 daq0Var2 = (daq0) obj2;
                return daq0Var2 != null ? daq0.a(daq0Var2.f5764a, daq0.c) : false ? Boolean.FALSE : q3d.e(Float.valueOf(daq0.c(daq0Var2.f5764a)), z0h0.a(new eaq0(daq0.b(daq0Var2.f5764a)), z0h0.w, (azg0) obj));
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ib00 ib00Var = (ib00) obj2;
                return q3d.e(ib00Var.f14462a, z0h0.a(ib00Var.b, z0h0.i, (azg0) obj));
            case 20:
                long j2 = ((eaq0) obj2).f7481a;
                if (eaq0.a(j2, 8589934592L)) {
                    return 0;
                }
                if (eaq0.a(j2, 4294967296L)) {
                    return 1;
                }
                return Boolean.FALSE;
            case 21:
                ne60 ne60Var = (ne60) obj2;
                return ne60Var != null ? ne60.c(ne60Var.f23370a, 9205357640488583168L) : false ? Boolean.FALSE : q3d.e(Float.valueOf(Float.intBitsToFloat((int) (ne60Var.f23370a >> 32))), Float.valueOf(Float.intBitsToFloat((int) (ne60Var.f23370a & 4294967295L))));
            case 22:
                azg0 azg0Var4 = (azg0) obj;
                i83 i83Var = (i83) obj2;
                Object obj4 = i83Var.f14321a;
                if (obj4 instanceof eo80) {
                    z83Var = z83.f43948a;
                } else if (obj4 instanceof smk0) {
                    z83Var = z83.b;
                } else if (obj4 instanceof h7u0) {
                    z83Var = z83.c;
                } else if (obj4 instanceof cot0) {
                    z83Var = z83.d;
                } else if (obj4 instanceof jb00) {
                    z83Var = z83.e;
                } else if (obj4 instanceof ib00) {
                    z83Var = z83.f;
                } else {
                    if (!(obj4 instanceof fsm0)) {
                        e9d0.b();
                        return null;
                    }
                    z83Var = z83.g;
                }
                switch (z83Var.ordinal()) {
                    case 0:
                        obj4.getClass();
                        objA = z0h0.a((eo80) obj4, z0h0.g, azg0Var4);
                        break;
                    case 1:
                        obj4.getClass();
                        objA = z0h0.a((smk0) obj4, z0h0.h, azg0Var4);
                        break;
                    case 2:
                        obj4.getClass();
                        objA = z0h0.a((h7u0) obj4, z0h0.c, azg0Var4);
                        break;
                    case 3:
                        obj4.getClass();
                        objA = z0h0.a((cot0) obj4, z0h0.d, azg0Var4);
                        break;
                    case 4:
                        obj4.getClass();
                        objA = z0h0.a((jb00) obj4, z0h0.e, azg0Var4);
                        break;
                    case 5:
                        obj4.getClass();
                        objA = z0h0.a((ib00) obj4, z0h0.f, azg0Var4);
                        break;
                    case 6:
                        obj4.getClass();
                        objA = ((fsm0) obj4).f10072a;
                        break;
                    default:
                        t9f.b();
                        return null;
                }
                return q3d.e(z83Var, objA, Integer.valueOf(i83Var.b), Integer.valueOf(i83Var.c), i83Var.d);
            case 23:
                azg0 azg0Var5 = (azg0) obj;
                List list2 = ((rs00) obj2).f31011a;
                ArrayList arrayList2 = new ArrayList(list2.size());
                int size2 = list2.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    arrayList2.add(z0h0.a((qs00) list2.get(i6), z0h0.z, azg0Var5));
                }
                return arrayList2;
            case 24:
                return ((qs00) obj2).f29235a.toLanguageTag();
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                azg0 azg0Var6 = (azg0) obj;
                m600 m600Var = (m600) obj2;
                return q3d.e(z0h0.a(new j600(m600Var.f21243a), z0h0.B, azg0Var6), z0h0.a(new l600(m600Var.b), z0h0.C, azg0Var6), z0h0.a(new k600(m600Var.c), z0h0.D, azg0Var6));
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return Float.valueOf(((j600) obj2).f15960a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return Integer.valueOf(((l600) obj2).f19483a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return Integer.valueOf(((k600) obj2).f17743a);
            default:
                return ((h7u0) obj2).f12593a;
        }
    }
}

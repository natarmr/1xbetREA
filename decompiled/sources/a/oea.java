package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.framework.common.BundleUtil;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class oea implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f25113a;
    public final /* synthetic */ a4x b;

    public /* synthetic */ oea(a4x a4xVar, byte b) {
        this.f25113a = b;
        this.b = a4xVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f25113a;
        byte b2 = 12;
        byte b3 = 22;
        byte b4 = 17;
        byte b5 = 14;
        byte b6 = 13;
        byte b7 = 20;
        byte b8 = 9;
        byte b9 = 3;
        byte b10 = 4;
        byte b11 = 5;
        int i = 1;
        a4x a4xVar = this.b;
        switch (b) {
            case 0:
                hcz hczVar = (hcz) obj;
                hczVar.getClass();
                hczVar.f(a4xVar.size(), new at7(new im8((byte) 18), a4xVar, b8), new dx8(a4xVar, b9), new ugd(2039820996, true, new xy1(a4xVar, i == true ? (byte) 1 : (byte) 0)));
                return Unit.f46060a;
            case 1:
                i8z i8zVar = (i8z) obj;
                i8zVar.getClass();
                i8zVar.e(a4xVar.size(), new at7(new d69(b7), a4xVar, (byte) 10), null, new dx8(a4xVar, b10), new ugd(-1117249557, true, new xy1(a4xVar, (byte) 2)));
                return Unit.f46060a;
            case 2:
                i8z i8zVar2 = (i8z) obj;
                i8zVar2.getClass();
                i8zVar2.e(a4xVar.size(), new at7(new d69(b3), a4xVar, (byte) 11), null, new dx8(a4xVar, b11), new ugd(-1117249557, true, new xy1(a4xVar, b9)));
                return Unit.f46060a;
            case 3:
                int iIntValue = ((Integer) obj).intValue();
                return rz4.h(iIntValue, ((p6t0) a4xVar.get(iIntValue)).getKey());
            case 4:
                return sre0.f32672a.b(a4xVar.get(((Integer) obj).intValue()).getClass());
            case 5:
                hcz hczVar2 = (hcz) obj;
                hczVar2.getClass();
                hczVar2.f(a4xVar.size(), null, new dx8(a4xVar, (byte) 29), new ugd(2039820996, true, new xy1(a4xVar, b10)));
                return Unit.f46060a;
            case 6:
                hcz hczVar3 = (hcz) obj;
                hczVar3.getClass();
                byte b12 = 15;
                hczVar3.f(a4xVar.size(), new vtf(new zuh(b12), a4xVar, b12), new bzh(a4xVar, b11), new ugd(2039820996, true, new xy1(a4xVar, b11)));
                return Unit.f46060a;
            case 7:
                hcz hczVar4 = (hcz) obj;
                hczVar4.getClass();
                hczVar4.f(a4xVar.size(), null, new v2m(a4xVar, b8), new ugd(802480018, true, new xy1(a4xVar, (byte) 10)));
                return Unit.f46060a;
            case 8:
                hcz hczVar5 = (hcz) obj;
                hczVar5.getClass();
                hczVar5.f(a4xVar.size(), null, new v2m(a4xVar, (byte) 10), new ugd(802480018, true, new xy1(a4xVar, (byte) 11)));
                return Unit.f46060a;
            case 9:
                hcz hczVar6 = (hcz) obj;
                hczVar6.getClass();
                hczVar6.f(a4xVar.size(), null, new v2m(a4xVar, (byte) 11), new ugd(802480018, true, new xy1(a4xVar, b2)));
                return Unit.f46060a;
            case 10:
                hcz hczVar7 = (hcz) obj;
                hczVar7.getClass();
                hczVar7.f(a4xVar.size(), null, new v2m(a4xVar, b2), new ugd(802480018, true, new xy1(a4xVar, b6)));
                return Unit.f46060a;
            case 11:
                hcz hczVar8 = (hcz) obj;
                hczVar8.getClass();
                hczVar8.f(a4xVar.size(), null, new v2m(a4xVar, (byte) 28), new ugd(802480018, true, new xy1(a4xVar, b5)));
                return Unit.f46060a;
            case 12:
                return a4xVar.get(((Integer) obj).intValue());
            case 13:
                ntv ntvVar = (ntv) obj;
                ntvVar.getClass();
                try {
                    synchronized (ntvVar.p) {
                        ntvVar.b.clear();
                        ntvVar.c = true;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : a4xVar) {
                        if (((z3a0) obj2).i) {
                            arrayList.add(obj2);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        w3d.u(arrayList2, ((z3a0) it.next()).h);
                    }
                    synchronized (ntvVar.p) {
                        ntvVar.b.addAll(arrayList2);
                        ntvVar.c = true;
                    }
                    synchronized (ntvVar.p) {
                        ntvVar.m = true;
                        ntvVar.q.d = true;
                    }
                } catch (Exception unused) {
                }
                return Unit.f46060a;
            case 14:
                int iIntValue2 = ((Integer) obj).intValue();
                return rz4.h(iIntValue2, ((p6t0) a4xVar.get(iIntValue2)).getKey());
            case 15:
                return sre0.f32672a.b(a4xVar.get(((Integer) obj).intValue()).getClass());
            case 16:
                Integer num = (Integer) obj;
                int iIntValue3 = num.intValue();
                int size = a4xVar.size();
                return (iIntValue3 / (size >= 1 ? size : 1)) + BundleUtil.UNDERLINE_TAG + new Pair(kbc.W((pe0) a4xVar.get(kbc.d0(iIntValue3, a4xVar.size()))), num);
            case 17:
                return sre0.f32672a.b(a4xVar.get(kbc.d0(((Integer) obj).intValue(), a4xVar.size())).getClass());
            case 18:
                Integer num2 = (Integer) obj;
                int iIntValue4 = num2.intValue();
                int size2 = a4xVar.size();
                return (iIntValue4 / (size2 >= 1 ? size2 : 1)) + BundleUtil.UNDERLINE_TAG + new Pair(kbc.W((pe0) a4xVar.get(kbc.d0(iIntValue4, a4xVar.size()))), num2);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return sre0.f32672a.b(a4xVar.get(kbc.d0(((Integer) obj).intValue(), a4xVar.size())).getClass());
            case 20:
                hcz hczVar9 = (hcz) obj;
                hczVar9.getClass();
                hczVar9.f(a4xVar.size(), null, new ap30(a4xVar, b6), new ugd(802480018, true, new xy1(a4xVar, (byte) 21)));
                return Unit.f46060a;
            case 21:
                return ((t0a0) a4xVar.get(((Integer) obj).intValue())).f33110a;
            case 22:
                hcz hczVar10 = (hcz) obj;
                hczVar10.getClass();
                hczVar10.f(a4xVar.size(), new zu90(b9, new so90((byte) 19), a4xVar), new a580(a4xVar, b7), new ugd(2039820996, true, new xy1(a4xVar, b3)));
                return Unit.f46060a;
            case 23:
                hcz hczVar11 = (hcz) obj;
                hczVar11.getClass();
                hczVar11.f(a4xVar.size(), null, new a580(a4xVar, (byte) 24), new ugd(802480018, true, new xy1(a4xVar, (byte) 23)));
                return Unit.f46060a;
            case 24:
                hcz hczVar12 = (hcz) obj;
                hczVar12.getClass();
                hcz.g(hczVar12, a4xVar.size(), null, null, new ugd(333002153, true, new ftl(a4xVar, b11)), 6);
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                hcz hczVar13 = (hcz) obj;
                hczVar13.getClass();
                hcz.g(hczVar13, a4xVar.size(), null, new wtf0(b4), new ugd(-403618317, true, new ftl(a4xVar, (byte) 6)), 2);
                hcz.e(hczVar13, null, null, m0x0.g, 3);
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                hcz hczVar14 = (hcz) obj;
                hczVar14.getClass();
                hczVar14.f(a4xVar.size(), null, new d1c0(a4xVar, b4), new ugd(802480018, true, new xy1(a4xVar, (byte) 26)));
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                hcz hczVar15 = (hcz) obj;
                hczVar15.getClass();
                hczVar15.f(a4xVar.size(), null, new adn0(a4xVar, b6), new ugd(2039820996, true, new y5p0(a4xVar, a4xVar, (byte) 0)));
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                hcz hczVar16 = (hcz) obj;
                hczVar16.getClass();
                hczVar16.f(a4xVar.size(), new zcn0(new zgp0(b11), a4xVar, b5), new adn0(a4xVar, b7), new ugd(2039820996, true, new y5p0(a4xVar, a4xVar, i == true ? (byte) 1 : (byte) 0)));
                return Unit.f46060a;
            default:
                hcz hczVar17 = (hcz) obj;
                hczVar17.getClass();
                byte b13 = 8;
                hczVar17.f(a4xVar.size(), new vdr0(xdx.E(a4xVar, new g4s0(b13)), b13), new xlr0(new g4s0(b8), a4xVar, b10), new ugd(-1311333631, true, new bzp0(a4xVar, b10)));
                return Unit.f46060a;
        }
    }
}

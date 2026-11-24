package a;

import android.view.View;
import android.widget.ImageView;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.promotions.news.impl.navigation.PromotionsNewsScreenFactoryImpl$getCmsNewsMainScreen$1;
import org.xplatform.resident.presentation.views.ResidentDoorLineView;
import org.xplatform.resident.presentation.views.ResidentSafeLineView;
import org.xplatform.rules.impl.navigation.PaymentInfoScreenFactoryImpl$getPaymentInfoScreen$1;
import org.xplatform.ui_core.viewcomponents.imageview.RoundCornerImageView;
import org.xplatform.uikit.components.tabs.DsTabs;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class g18 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f10499a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ g18(Object obj, int i, Object obj2, byte b) {
        this.f10499a = b;
        this.c = obj;
        this.b = i;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        mld mldVar;
        mld mldVar2;
        int i;
        byte b = this.f10499a;
        byte b2 = 12;
        byte b3 = 24;
        byte b4 = 10;
        int i2 = 8;
        int i3 = 0;
        boolean z = true;
        int iIntValue = this.b;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                uag0 uag0Var = (uag0) obj;
                uag0Var.getClass();
                int iFloatValue = (int) ((Number) ((Function0) obj3).invoke()).floatValue();
                int size = ((a4x) obj2).size() - 1;
                if (iFloatValue > size) {
                    iFloatValue = size;
                }
                uag0Var.b(iFloatValue == iIntValue ? 1.0f : 0.0f);
                return Unit.f46060a;
            case 1:
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                k0w0Var.h(new PaymentInfoScreenFactoryImpl$getPaymentInfoScreen$1(((h6i) ((uzg) obj3).g.f24171a).c(), R.string.web_statistic, (String) obj2, this.b, false));
                return Unit.f46060a;
            case 2:
                Integer num = (Integer) obj3;
                pz40 pz40Var = (pz40) obj2;
                abi0 abi0Var = (abi0) obj;
                abi0Var.getClass();
                cbi0.d(abi0Var, ((Boolean) pz40Var.getValue()).booleanValue());
                if (!((Boolean) pz40Var.getValue()).booleanValue()) {
                    if (num != null) {
                        iIntValue = num.intValue();
                    }
                    cbi0.c(abi0Var, iIntValue);
                }
                return Unit.f46060a;
            case 3:
                l7m l7mVar = (l7m) obj3;
                vpm0 vpm0Var = (vpm0) obj2;
                hcz hczVar = (hcz) obj;
                hczVar.getClass();
                for (Object obj4 : l7mVar.e) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        q3d.p();
                        throw null;
                    }
                    q7m q7mVar = (q7m) obj4;
                    if (iIntValue <= 0 || i3 != q3d.i(l7mVar.e)) {
                        hcz.e(hczVar, null, null, new ugd(-1682936778, true, new h7m(q7mVar, dub.k0((f7m) CollectionsKt.W(i3, l7mVar.d)))), 3);
                    } else {
                        hcz.h(hczVar, new ugd(847158585, true, new ec30(q7mVar, vpm0Var, b3)), 3);
                        float f = vpm0Var.b;
                        zcl zclVar = qmk.f28987a;
                        if (ycl.a(f, 0.0f) > 0) {
                            hcz.e(hczVar, null, null, new ugd(-113554936, true, new sd8(vpm0Var, (byte) 29)), 3);
                        }
                    }
                    i3 = i4;
                }
                return Unit.f46060a;
            case 4:
                int iB = 0;
                Function1 function1 = (Function1) obj3;
                mcz mczVar = (mcz) obj2;
                ktb0 ktb0Var = (ktb0) obj;
                if (function1 != null) {
                    a5n0 a5n0Var = ktb0Var.e;
                    int iC = a5n0Var != null ? a5n0Var.c() : 0;
                    for (int i5 = 0; i5 < iC; i5++) {
                        ma80 ma80Var = mczVar.q;
                        ma80 ma80Var2 = ma80.f21447a;
                        a5n0 a5n0Var2 = ktb0Var.e;
                        iB += (int) (ma80Var == ma80Var2 ? 4294967295L & (a5n0Var2 != null ? a5n0Var2.b(i5) : 0L) : (a5n0Var2 != null ? a5n0Var2.b(i5) : 0L) >> 32);
                    }
                    function1.invoke(new ocz(iIntValue, iB));
                }
                return Unit.f46060a;
            case 5:
                hcz hczVar2 = (hcz) obj;
                hczVar2.getClass();
                a4x a4xVar = ((qg10) ((sg10) obj3)).f28661a;
                hczVar2.f(a4xVar.size(), null, new ubn(a4xVar, (byte) 12), new ugd(802480018, true, new ws1(a4xVar, (Function1) obj2, iIntValue)));
                return Unit.f46060a;
            case 6:
                pao paoVar = (pao) obj2;
                ((View) obj).getClass();
                xdr xdrVar = ((bu20) obj3).j;
                if (xdrVar != null) {
                    xdrVar.F(paoVar, Integer.valueOf(iIntValue), Boolean.valueOf(paoVar.a()));
                }
                return Unit.f46060a;
            case 7:
                ArrayList arrayList = (ArrayList) obj3;
                ArrayList arrayList2 = (ArrayList) obj2;
                ou90 ou90Var = (ou90) obj;
                ou90Var.getClass();
                int size2 = arrayList.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    ou90Var.g((pu90) arrayList.get(i6), 0, iIntValue, 0.0f);
                }
                int size3 = arrayList2.size();
                for (int i7 = 0; i7 < size3; i7++) {
                    ou90Var.g((pu90) arrayList2.get(i7), 0, 0, 0.0f);
                }
                return Unit.f46060a;
            case 8:
                bb00 bb00Var = (bb00) obj3;
                hcz hczVar3 = (hcz) obj;
                hczVar3.getClass();
                a4x a4xVar2 = ((ynp0) bb00Var.e.get(iIntValue)).b;
                hczVar3.f(a4xVar2.size(), new m160(new zc70((byte) 8), a4xVar2, (byte) 11), new ubn(a4xVar2, (byte) 15), new ugd(2039820996, true, new h8w((List) a4xVar2, (Object) bb00Var, (Function1) obj2, b2)));
                return Unit.f46060a;
            case 9:
                k0w0 k0w0Var2 = (k0w0) obj;
                k0w0Var2.getClass();
                uzc0 uzc0Var = ((sbb0) obj3).Q;
                int i8 = ((uvc) obj2).f36341a;
                mvc mvcVar = mvc.CMS_CODE_POPULAR;
                uzc0Var.getClass();
                k0w0Var2.h(new PromotionsNewsScreenFactoryImpl$getCmsNewsMainScreen$1(i8, iIntValue, mvcVar, true));
                return Unit.f46060a;
            case 10:
                yfe0 yfe0Var = (yfe0) obj3;
                ry40 ry40Var = (ry40) obj2;
                mld mldVar3 = (mld) obj;
                if (yfe0Var.e == iIntValue && Intrinsics.d(ry40Var, yfe0Var.f) && (mldVar3 instanceof tld)) {
                    long[] jArr = ry40Var.f31295a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i9 = 0;
                        while (true) {
                            long j = jArr[i9];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i10 = 8 - ((~(i9 - length)) >>> 31);
                                int i11 = i3;
                                while (i11 < i10) {
                                    if ((255 & j) < 128) {
                                        int i12 = (i9 << 3) + i11;
                                        Object obj5 = ry40Var.b[i12];
                                        boolean z2 = ry40Var.c[i12] != iIntValue ? z : false;
                                        if (z2) {
                                            tld tldVar = (tld) mldVar3;
                                            i = i2;
                                            hz40 hz40Var = tldVar.g;
                                            e9x.S(hz40Var, obj5, yfe0Var);
                                            mldVar2 = mldVar3;
                                            if (obj5 instanceof zbk) {
                                                zbk zbkVar = (zbk) obj5;
                                                if (!hz40Var.c(zbkVar)) {
                                                    e9x.T(tldVar.j, zbkVar);
                                                }
                                                hz40 hz40Var2 = yfe0Var.g;
                                                if (hz40Var2 != null) {
                                                    hz40Var2.l(obj5);
                                                }
                                            }
                                        } else {
                                            mldVar2 = mldVar3;
                                            i = i2;
                                        }
                                        if (z2) {
                                            ry40Var.f(i12);
                                        }
                                    } else {
                                        mldVar2 = mldVar3;
                                        i = i2;
                                    }
                                    j >>= i;
                                    i11++;
                                    mldVar3 = mldVar2;
                                    i2 = i;
                                    z = true;
                                }
                                mldVar = mldVar3;
                                if (i10 == i2) {
                                }
                            } else {
                                mldVar = mldVar3;
                            }
                            if (i9 != length) {
                                i9++;
                                mldVar3 = mldVar;
                                i2 = 8;
                                i3 = 0;
                                z = true;
                            }
                        }
                    }
                }
                return Unit.f46060a;
            case 11:
                aoo0 aoo0Var = (aoo0) obj3;
                a4x a4xVar3 = (a4x) obj2;
                DsTabs dsTabs = (DsTabs) obj;
                dsTabs.getClass();
                if (dsTabs.t.size() < 2) {
                    dsTabs.setTabsStyle(aoo0Var);
                    dsTabs.c(a4xVar3);
                }
                dsTabs.k(iIntValue);
                return Unit.f46060a;
            case 12:
                ResidentDoorLineView residentDoorLineView = (ResidentDoorLineView) obj2;
                int i13 = ResidentDoorLineView.e;
                ((View) obj).getClass();
                if (((mof0) obj3).c == lof0.c) {
                    residentDoorLineView.b.invoke(Integer.valueOf(iIntValue));
                }
                return Unit.f46060a;
            case 13:
                ResidentSafeLineView residentSafeLineView = (ResidentSafeLineView) obj2;
                int i14 = ResidentSafeLineView.m;
                ((View) obj).getClass();
                mrf0 mrf0Var = ((srf0) obj3).c;
                if ((mrf0Var != null ? mrf0Var.d : null) == qrf0.g) {
                    residentSafeLineView.b.invoke(Integer.valueOf(iIntValue + 1));
                }
                return Unit.f46060a;
            case 14:
                oah0 oah0Var = (oah0) obj3;
                pu90 pu90Var = (pu90) obj2;
                ou90 ou90Var2 = (ou90) obj;
                int iL = oah0Var.o.f30133a.l();
                if (iL < 0) {
                    iL = 0;
                }
                if (iL > iIntValue) {
                    iL = iIntValue;
                }
                int i15 = oah0Var.p ? iL - iIntValue : -iL;
                boolean z3 = oah0Var.q;
                int i16 = i15;
                if (z3) {
                    i15 = 0;
                }
                int i17 = z3 ? i16 : 0;
                ou90Var2.f25867a = true;
                ou90.w(ou90Var2, pu90Var, i15, i17, null, 12);
                ou90Var2.f25867a = false;
                return Unit.f46060a;
            case 15:
                uhh0 uhh0Var = (uhh0) obj;
                uhh0Var.getClass();
                return new aih0(uhh0Var, (ctf0) obj3, (y78) obj2, iIntValue);
            case 16:
                List list = (List) obj3;
                hcz hczVar4 = (hcz) obj;
                hczVar4.getClass();
                hczVar4.f(list.size(), new pwe0(new wvi0(b4), list, b3), new d1c0(list, (byte) 27), new ugd(802480018, true, new cit(list, iIntValue, (Function1) obj2)));
                return Unit.f46060a;
            case 17:
                Function2 function2 = (Function2) obj2;
                ou90 ou90Var3 = (ou90) obj;
                ou90Var3.getClass();
                int i18 = 0;
                int i19 = 0;
                for (Object obj6 : (ArrayList) obj3) {
                    int i20 = i18 + 1;
                    if (i18 < 0) {
                        q3d.p();
                        throw null;
                    }
                    pu90 pu90Var2 = (pu90) obj6;
                    if (i18 != 0 || function2 == null) {
                        ou90Var3.g(pu90Var2, 0, i19, 0.0f);
                        i19 += pu90Var2.b;
                    } else {
                        Object objN = pu90Var2.n();
                        w0v0 w0v0Var = objN instanceof w0v0 ? (w0v0) objN : null;
                        v0v0 v0v0Var = w0v0Var != null ? w0v0Var.b : null;
                        if (v0v0Var == null) {
                            continue;
                        } else {
                            int iOrdinal = v0v0Var.ordinal();
                            if (iOrdinal == 0) {
                                int i21 = iIntValue - pu90Var2.f27604a;
                                zcl zclVar2 = qmk.f28987a;
                                ou90Var3.g(pu90Var2, ou90Var3.T(16.0f) + i21, 0 - ou90Var3.T(32.0f), 0.0f);
                            } else {
                                if (iOrdinal != 1) {
                                    t9f.b();
                                    return null;
                                }
                                zcl zclVar3 = qmk.f28987a;
                                ou90Var3.g(pu90Var2, 0 - ou90Var3.T(16.0f), 0 - ou90Var3.T(32.0f), 0.0f);
                            }
                        }
                    }
                    i18 = i20;
                }
                return Unit.f46060a;
            case 18:
                ((RoundCornerImageView) obj3).setScaleType(ImageView.ScaleType.CENTER_CROP);
                Object obj7 = ((List) obj2).get(iIntValue);
                obj7.getClass();
                ((View) obj7).setVisibility(8);
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((View) obj).getClass();
                ((bbl0) obj3).invoke(Integer.valueOf(iIntValue), ((qwl0) ((cp) obj2).u()).f29440a);
                return Unit.f46060a;
            case 20:
                k0w0 k0w0Var3 = (k0w0) obj;
                k0w0Var3.getClass();
                c8d c8dVar = (c8d) k0w0Var3.b(new a1w0(new bh1((g2g0) obj3, (kr5) obj2, iIntValue, b4))).f14945a;
                bjk bjkVar = cfx0.o;
                c8dVar.f3908a = new v7d(true, bjkVar, bjkVar);
                return Unit.f46060a;
            case 21:
                k0w0 k0w0Var4 = (k0w0) obj;
                k0w0Var4.getClass();
                uzc0 uzc0Var2 = (uzc0) ((g2g0) obj3).k;
                int i22 = ((uvc) obj2).f36341a;
                mvc mvcVar2 = mvc.CMS_CODE_POPULAR;
                uzc0Var2.getClass();
                k0w0Var4.h(new PromotionsNewsScreenFactoryImpl$getCmsNewsMainScreen$1(i22, iIntValue, mvcVar2, true));
                return Unit.f46060a;
            default:
                lcu0 lcu0Var = (lcu0) obj3;
                pu90 pu90Var3 = (pu90) obj2;
                ou90 ou90Var4 = (ou90) obj;
                int i23 = lcu0Var.c;
                d7q0 d7q0Var = lcu0Var.b;
                nls0 nls0Var = lcu0Var.d;
                b9q0 b9q0Var = (b9q0) lcu0Var.e.invoke();
                d7q0Var.a(ma80.f21447a, yum0.g(ou90Var4, i23, nls0Var, b9q0Var != null ? b9q0Var.f2224a : null, false, pu90Var3.f27604a), iIntValue, pu90Var3.b);
                ou90Var4.m(pu90Var3, 0, Math.round(-d7q0Var.f5606a.l()), 0.0f);
                return Unit.f46060a;
        }
    }

    public /* synthetic */ g18(Object obj, Object obj2, int i, byte b) {
        this.f10499a = b;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }
}

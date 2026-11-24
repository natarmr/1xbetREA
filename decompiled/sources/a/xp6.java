package a;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import org.xplatform.ui_core.circleindicator.CircleIndicator;
import org.xplatform.uikit.components.page_control.DsPageControl;
import org.xplatform.uikit.components.segmented_control.DsSegmentedGroup;
import org.xplatform.uikit.components.tabs.DsTabs;

/* JADX INFO: loaded from: classes6.dex */
public final class xp6 extends nju0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f41253a;
    public final Object b;

    public xp6() {
        this.f41253a = (byte) 3;
        this.b = new ArrayList(3);
    }

    @Override // a.nju0
    public void a(int i) {
        byte b = this.f41253a;
        Object obj = this.b;
        switch (b) {
            case 3:
                try {
                    Iterator it = ((ArrayList) obj).iterator();
                    while (it.hasNext()) {
                        ((nju0) it.next()).a(i);
                    }
                } catch (ConcurrentModificationException e) {
                    hny.q("Adding and removing callbacks during dispatch to callbacks is not supported", e);
                    return;
                }
                break;
            case 7:
                ((lrd) obj).b(false);
                break;
            case 9:
                j120.Y((a720) obj);
                break;
            case 11:
                j120.Y((i820) obj);
                break;
        }
    }

    @Override // a.nju0
    public void b(int i, float f, int i2) {
        byte b = this.f41253a;
        Object obj = this.b;
        switch (b) {
            case 3:
                try {
                    Iterator it = ((ArrayList) obj).iterator();
                    while (it.hasNext()) {
                        ((nju0) it.next()).b(i, f, i2);
                    }
                } catch (ConcurrentModificationException e) {
                    hny.q("Adding and removing callbacks during dispatch to callbacks is not supported", e);
                    return;
                }
                break;
            case 12:
                if (f == 0.0f) {
                    g9m0 g9m0Var = npn0.j2;
                    tpn0 tpn0VarU0 = ((npn0) obj).U0();
                    rpn0 rpn0Var = (rpn0) CollectionsKt.firstOrNull(tpn0VarU0.n.d());
                    if (rpn0Var == null || rpn0Var.d != i) {
                        tpn0VarU0.w(i);
                    }
                }
                break;
            case 16:
                ((sbx0) obj).i(f, i);
                break;
        }
    }

    @Override // a.nju0
    public void c(int i) {
        Object value;
        byte b = this.f41253a;
        Object obj = this.b;
        switch (b) {
            case 0:
                zp6 zp6Var = (zp6) obj;
                DsSegmentedGroup dsSegmentedGroup = zp6Var.V0().d;
                DsSegmentedGroup.f(dsSegmentedGroup, null);
                dsSegmentedGroup.setSelectedPosition(i);
                DsSegmentedGroup.f(dsSegmentedGroup, new os5(zp6Var, (byte) 11));
                return;
            case 1:
                int i2 = CircleIndicator.o;
                ((CircleIndicator) obj).b(i);
                return;
            case 2:
                kl5 kl5Var = ywc.W1;
                p7m0 p7m0Var = ((ywc) obj).H0().m;
                while (true) {
                    Object value2 = p7m0Var.getValue();
                    int i3 = i;
                    if (p7m0Var.m(value2, yvc.a((yvc) value2, null, i3, null, 0L, 27))) {
                        return;
                    } else {
                        i = i3;
                    }
                }
                break;
            case 3:
                try {
                    Iterator it = ((ArrayList) obj).iterator();
                    while (it.hasNext()) {
                        ((nju0) it.next()).c(i);
                    }
                    return;
                } catch (ConcurrentModificationException e) {
                    hny.q("Adding and removing callbacks during dispatch to callbacks is not supported", e);
                    return;
                }
            case 4:
                mii0 mii0Var = (mii0) obj;
                ((DsTabs) mii0Var.b).k(i);
                ((Function1) mii0Var.d).invoke(Integer.valueOf(i));
                return;
            case 5:
                DsPageControl dsPageControl = (DsPageControl) obj;
                int i4 = DsPageControl.y2;
                gkz gkzVar = dsPageControl.m2;
                if (dsPageControl.q2 == i) {
                    return;
                }
                List list = gkzVar.e.f;
                list.getClass();
                ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                int i5 = 0;
                for (Object obj2 : list) {
                    int i6 = i5 + 1;
                    if (i5 < 0) {
                        q3d.p();
                        throw null;
                    }
                    wi80 wi80Var = (wi80) obj2;
                    boolean z = i == i5;
                    int i7 = z ? dsPageControl.u2 : dsPageControl.v2;
                    wi80Var.getClass();
                    arrayList.add(new wi80(wi80Var.f39202a, i7, z));
                    i5 = i6;
                }
                gkzVar.B(arrayList, new n23((Object) dsPageControl, i, (byte) 7));
                dsPageControl.q2 = i;
                return;
            case 6:
                ((DsSegmentedGroup) ((uii) obj).f35730a).setSelectedPosition(i);
                return;
            case 7:
                ((lrd) obj).b(false);
                return;
            case 8:
                yr10 yr10Var = (yr10) obj;
                wsz wszVar = yr10.R1;
                p7m0 p7m0Var2 = ((ds10) yr10Var.M1.getValue()).e;
                do {
                    value = p7m0Var2.getValue();
                } while (!p7m0Var2.m(value, ru9.a((ru9) value, null, i, 3)));
                yr10Var.Q1.I(yr10Var, yr10.S1[3], i);
                return;
            case 9:
            case 12:
            case 16:
            default:
                return;
            case 10:
                c720 c720Var = (c720) obj;
                DsSegmentedGroup dsSegmentedGroup2 = c720Var.Q0().b;
                DsSegmentedGroup.f(dsSegmentedGroup2, null);
                dsSegmentedGroup2.setSelectedPosition(i);
                DsSegmentedGroup.f(dsSegmentedGroup2, new km00(c720Var, (byte) 18));
                j120.X(dsSegmentedGroup2);
                return;
            case 11:
                i820 i820Var = (i820) obj;
                atz atzVar = i820.U1;
                if (i820Var.G0().q.getSegmentsSize() > i) {
                    i820Var.G0().q.setSelectedPosition(i);
                }
                i820Var.R1 = i;
                return;
            case 13:
                noq0 noq0Var = (noq0) obj;
                y2m0 y2m0Var = noq0.m2;
                zz2 zz2Var = noq0Var.f2;
                iiy[] iiyVarArr = noq0.n2;
                zz2Var.I(noq0Var, iiyVarArr[1], i);
                qjk qjkVarL0 = noq0Var.L0();
                qjkVarL0.e.post(new qaq0(qjkVarL0, noq0Var, (byte) 4));
                xoq0 xoq0VarY0 = noq0Var.Y0();
                int iX0 = noq0Var.X0();
                int iV0 = noq0Var.V0() + 1;
                int size = ((ArrayList) noq0Var.T0().f).size();
                String strN = noq0Var.i2.n(noq0Var, iiyVarArr[4]);
                strN.getClass();
                fk60 fk60Var = xoq0VarY0.j0;
                if (fk60Var != null) {
                    byte b2 = fk60Var.f9675a;
                    fk60.b.getClass();
                    if (CollectionsKt.L(fk60.c, uuz.e(b2))) {
                        xoq0VarY0.a0.b(iX0, iV0, size, strN);
                        return;
                    }
                    return;
                }
                return;
            case 14:
                ikr0 ikr0Var = (ikr0) obj;
                DsSegmentedGroup dsSegmentedGroup3 = ikr0Var.W0().d;
                DsSegmentedGroup.f(dsSegmentedGroup3, null);
                dsSegmentedGroup3.setSelectedPosition(i);
                j120.X(dsSegmentedGroup3);
                DsSegmentedGroup.f(dsSegmentedGroup3, new lcr0(ikr0Var, (byte) 5));
                return;
            case 15:
                s2m0 s2m0Var = u2s0.X1;
                twn.A(i == 1, ((u2s0) obj).H0().j, null);
                return;
            case 17:
                l6v0 l6v0Var = (l6v0) obj;
                sxs0 sxs0Var = l6v0.P1;
                l6v0Var.I0(i + 1);
                l6v0Var.G0().b.setSelectedDay(i);
                return;
        }
    }

    public /* synthetic */ xp6(Object obj, byte b) {
        this.f41253a = b;
        this.b = obj;
    }
}

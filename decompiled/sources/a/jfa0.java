package a;

import android.gov.nist.core.Separators;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.framework.common.BundleUtil;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class jfa0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f16415a;

    public /* synthetic */ jfa0(byte b) {
        this.f16415a = b;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f16415a;
        eyx eyxVar = eyx.f8647a;
        ayx ayxVar = ayx.f1691a;
        byte b2 = 1;
        switch (b) {
            case 0:
                LayoutInflater layoutInflater = (LayoutInflater) obj;
                ViewGroup viewGroup = (ViewGroup) obj2;
                layoutInflater.getClass();
                viewGroup.getClass();
                return vjd.a(layoutInflater, viewGroup);
            case 1:
                int iIntValue = ((Integer) obj).intValue();
                ka00 ka00Var = (ka00) obj2;
                ka00Var.getClass();
                if (ka00Var instanceof ia00) {
                    return ((ia00) ka00Var).f14414a + BundleUtil.UNDERLINE_TAG + iIntValue;
                }
                if (!(ka00Var instanceof ja00)) {
                    t9f.b();
                    return null;
                }
                return ((ja00) ka00Var).f16165a + BundleUtil.UNDERLINE_TAG + iIntValue;
            case 2:
                ((Integer) obj2).getClass();
                ntr.H(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 3:
                ((Integer) obj2).getClass();
                mrv.W(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 4:
                ((Integer) obj2).getClass();
                mrv.M(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 5:
                ((Integer) obj2).getClass();
                knx.s(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 6:
                ((Integer) obj2).getClass();
                ahy.z(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 7:
                LayoutInflater layoutInflater2 = (LayoutInflater) obj;
                ViewGroup viewGroup2 = (ViewGroup) obj2;
                layoutInflater2.getClass();
                viewGroup2.getClass();
                return zvx.a(layoutInflater2, viewGroup2);
            case 8:
                ((Integer) obj).getClass();
                a2n a2nVar = (a2n) obj2;
                a2nVar.getClass();
                return a2nVar.getKey();
            case 9:
                Function1 function1 = (Function1) obj;
                Function1 function2 = (Function1) obj2;
                function1.getClass();
                function2.getClass();
                function1.invoke(new kma0(b2));
                function2.invoke(new npa0((byte) 5));
                return Unit.f46060a;
            case 10:
                LayoutInflater layoutInflater3 = (LayoutInflater) obj;
                ViewGroup viewGroup3 = (ViewGroup) obj2;
                layoutInflater3.getClass();
                viewGroup3.getClass();
                return dux.a(layoutInflater3, viewGroup3);
            case 11:
                ((Integer) obj).getClass();
                era0 era0Var = (era0) obj2;
                era0Var.getClass();
                if (era0Var instanceof bra0) {
                    return kng0.k("-1 ", ((bra0) era0Var).b);
                }
                return era0Var.getId() + Separators.SP + era0Var.getTitle() + Separators.SP + era0Var.c() + Separators.SP + era0Var.b();
            case 12:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 13:
                Function1 function3 = (Function1) obj;
                Function1 function4 = (Function1) obj2;
                function3.getClass();
                function4.getClass();
                function3.invoke(new kma0((byte) 6));
                function4.invoke(new npa0((byte) 8));
                return Unit.f46060a;
            case 14:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 15:
                d0b0 d0b0Var = (d0b0) obj2;
                ((oyg0) obj).getClass();
                d0b0Var.getClass();
                return h8x.A(d0b0Var, false, true, d0b0Var.c.c);
            case 16:
                d0b0 d0b0Var2 = (d0b0) obj2;
                ((oyg0) obj).getClass();
                d0b0Var2.getClass();
                return d0b0.a(d0b0Var2, null, new zza0(d0b0Var2.b.c, false, true), new yza0(d0b0Var2.c.c, false, true), null, null, false, false, false, false, null, false, 4089);
            case 17:
                d0b0 d0b0Var3 = (d0b0) obj2;
                ((oyg0) obj).getClass();
                d0b0Var3.getClass();
                return h8x.B(d0b0Var3, false, true, d0b0Var3.b.c);
            case 18:
                d0b0 d0b0Var4 = (d0b0) obj2;
                ((oyg0) obj).getClass();
                d0b0Var4.getClass();
                return h8x.D(d0b0Var4, false, true, d0b0Var4.d.c);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return h8x.z((d0b0) obj2, true, false);
            case 20:
                return h8x.z((d0b0) obj2, false, true);
            case 21:
                int iIntValue2 = ((Integer) obj).intValue();
                j2b0 j2b0Var = (j2b0) obj2;
                j2b0Var.getClass();
                return twn.m(iIntValue2, j2b0Var.getKey());
            case 22:
                u2b0 u2b0Var = (u2b0) obj2;
                ((oyg0) obj).getClass();
                u2b0Var.getClass();
                List<df40> list = u2b0Var.l;
                ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                for (df40 ve40Var : list) {
                    fyx state = ve40Var.getState();
                    state.getClass();
                    if (state instanceof ayx) {
                        if (ve40Var instanceof ue40) {
                            ve40Var = new ue40(byx.f3439a);
                        } else if (ve40Var instanceof pe40) {
                            ve40Var = new pe40(((pe40) ve40Var).f26833a, eyxVar);
                        } else if (ve40Var instanceof ne40) {
                            ve40Var = new ne40(eyxVar);
                        } else {
                            if (!(ve40Var instanceof ve40)) {
                                t9f.b();
                                return null;
                            }
                            ve40Var = new ve40(eyxVar);
                        }
                    }
                    arrayList.add(ve40Var);
                }
                return u2b0.a(u2b0Var, false, false, false, false, null, null, arrayList, 2047);
            case 23:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 24:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                u2b0 u2b0Var2 = (u2b0) obj2;
                ((oyg0) obj).getClass();
                u2b0Var2.getClass();
                List<Object> list2 = u2b0Var2.l;
                ArrayList arrayList2 = new ArrayList(r3d.q(list2, 10));
                for (Object ve40Var2 : list2) {
                    if (ve40Var2 instanceof ve40) {
                        ve40Var2 = new ve40(ayxVar);
                    }
                    arrayList2.add(ve40Var2);
                }
                return u2b0.a(u2b0Var2, false, false, false, false, null, null, arrayList2, 2047);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                u2b0 u2b0Var3 = (u2b0) obj2;
                ((oyg0) obj).getClass();
                u2b0Var3.getClass();
                List<Object> list3 = u2b0Var3.l;
                ArrayList arrayList3 = new ArrayList(r3d.q(list3, 10));
                for (Object ne40Var : list3) {
                    if (ne40Var instanceof ne40) {
                        ne40Var = new ne40(ayxVar);
                    }
                    arrayList3.add(ne40Var);
                }
                return u2b0.a(u2b0Var3, false, false, false, false, null, null, arrayList3, 2047);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                u2b0 u2b0Var4 = (u2b0) obj2;
                ((oyg0) obj).getClass();
                u2b0Var4.getClass();
                List<Object> list4 = u2b0Var4.l;
                ArrayList arrayList4 = new ArrayList(r3d.q(list4, 10));
                for (Object pe40Var : list4) {
                    if (pe40Var instanceof pe40) {
                        w4t w4tVar = ((pe40) pe40Var).f26833a;
                        if (w4tVar instanceof t4t) {
                            pe40Var = new pe40(w4tVar, ayxVar);
                        }
                    }
                    arrayList4.add(pe40Var);
                }
                return u2b0.a(u2b0Var4, false, false, false, false, null, null, arrayList4, 2047);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                u2b0 u2b0Var5 = (u2b0) obj2;
                ((oyg0) obj).getClass();
                u2b0Var5.getClass();
                List<Object> list5 = u2b0Var5.l;
                ArrayList arrayList5 = new ArrayList(r3d.q(list5, 10));
                for (Object ue40Var : list5) {
                    if (ue40Var instanceof ue40) {
                        ue40Var = new ue40(dyx.f6915a);
                    }
                    arrayList5.add(ue40Var);
                }
                return u2b0.a(u2b0Var5, false, false, false, false, null, null, arrayList5, 2047);
            default:
                u2b0 u2b0Var6 = (u2b0) obj2;
                List<Object> list6 = u2b0Var6.l;
                ArrayList arrayList6 = new ArrayList(r3d.q(list6, 10));
                for (Object ne40Var2 : list6) {
                    if (ne40Var2 instanceof ne40) {
                        ne40Var2 = new ne40(eyxVar);
                    }
                    arrayList6.add(ne40Var2);
                }
                return u2b0.a(u2b0Var6, false, false, false, false, null, null, arrayList6, 2047);
        }
    }

    public /* synthetic */ jfa0(int i, byte b) {
        this.f16415a = b;
    }
}

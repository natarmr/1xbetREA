package a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class pp00 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f27352a;
    public final /* synthetic */ cp00 b;
    public final /* synthetic */ y11 c;

    public /* synthetic */ pp00(y11 y11Var, cp00 cp00Var, byte b) {
        this.f27352a = b;
        this.c = y11Var;
        this.b = cp00Var;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0141  */
    /* JADX WARN: Code duplicated, block: B:64:0x018f  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        c1l c1lVar;
        bac bacVar;
        String str;
        String str2;
        byte b = this.f27352a;
        int i = 0;
        cp00 cp00Var = this.b;
        y11 y11Var = this.c;
        switch (b) {
            case 0:
                ((List) obj).getClass();
                fh3 fh3Var = cp00Var.c.c;
                int iIntValue = ((Number) ((fee) y11Var.l.getValue()).b()).intValue();
                phk phkVar = (phk) y11Var.d.getValue();
                phkVar.getClass();
                int iOrdinal = fh3Var.ordinal();
                if (iOrdinal == 0) {
                    List listJ = q3d.j(Integer.valueOf(R.drawable.ic_ball_1), Integer.valueOf(R.drawable.ic_ball_2), Integer.valueOf(R.drawable.ic_ball_3), Integer.valueOf(R.drawable.ic_ball_4), Integer.valueOf(R.drawable.ic_ball_5), Integer.valueOf(R.drawable.ic_ball_6), Integer.valueOf(R.drawable.ic_ball_7), Integer.valueOf(R.drawable.ic_ball_8));
                    ArrayList arrayList = new ArrayList(r3d.q(listJ, 10));
                    int i2 = 0;
                    for (Object obj2 : listJ) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            q3d.p();
                            throw null;
                        }
                        int iIntValue2 = ((Number) obj2).intValue();
                        arrayList.add(i2 == iIntValue ? new xn5(iIntValue2, true) : i2 < iIntValue ? new xn5(iIntValue2, false) : yn5.f42921a);
                        i2 = i3;
                    }
                    return dyb.r0(arrayList);
                }
                if (iOrdinal == 1) {
                    lc00 lc00VarB = kotlin.collections.a.b();
                    while (i < 8) {
                        if (i <= iIntValue) {
                            pz40 pz40Var = s6t0.f31722a;
                            c1lVar = new c1l(StaticColors.INSTANCE.m123getWhite0d7_KjU());
                        } else if (i == iIntValue + 1) {
                            pz40 pz40Var2 = s6t0.f31722a;
                            c1lVar = new c1l(StaticColors.INSTANCE.m127getWhite300d7_KjU());
                        } else {
                            pz40 pz40Var3 = s6t0.f31722a;
                            c1lVar = new c1l(StaticColors.INSTANCE.m126getWhite200d7_KjU());
                        }
                        lc00VarB.add(c1lVar);
                        i++;
                    }
                    return dyb.r0(kotlin.collections.a.a(lc00VarB));
                }
                if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        t9f.b();
                        return null;
                    }
                    int iOrdinal2 = phkVar.ordinal();
                    if (iOrdinal2 == 0) {
                        return ipm0.d(iIntValue, gpm0.f11690a);
                    }
                    if (iOrdinal2 == 1 || iOrdinal2 == 2) {
                        return ipm0.d(iIntValue, hpm0.f13451a);
                    }
                    t9f.b();
                    return null;
                }
                lc00 lc00VarB2 = kotlin.collections.a.b();
                while (i < 8) {
                    if (i <= iIntValue) {
                        pz40 pz40Var4 = s6t0.f31722a;
                        bacVar = new bac(StaticColors.INSTANCE.m123getWhite0d7_KjU());
                    } else if (i == iIntValue + 1) {
                        pz40 pz40Var5 = s6t0.f31722a;
                        bacVar = new bac(StaticColors.INSTANCE.m127getWhite300d7_KjU());
                    } else {
                        pz40 pz40Var6 = s6t0.f31722a;
                        bacVar = new bac(StaticColors.INSTANCE.m126getWhite200d7_KjU());
                    }
                    lc00VarB2.add(bacVar);
                    i++;
                }
                return dyb.r0(kotlin.collections.a.a(lc00VarB2));
            case 1:
                oc5 oc5Var = (oc5) obj;
                eh3 eh3Var = cp00Var.c.b;
                if (eh3Var != eh3.REMOTE_IMAGE) {
                    if (eh3Var != eh3.SMART_IMAGE && cp00Var.o) {
                        return new kx80(((bb6) y11Var.z).a(y11Var.b.b.a(R.string.content_partner_image, Arrays.copyOf(new Object[0], 0)), dkq.DRAWABLE));
                    }
                    return null;
                }
                if (oc5Var == null || (str = oc5Var.e) == null) {
                    str = null;
                } else {
                    if (str.length() <= 0) {
                        str = null;
                    }
                    if (str == null) {
                        str = null;
                    }
                }
                if (str != null) {
                    return new lx80(str);
                }
                return null;
            case 2:
                oc5 oc5Var2 = (oc5) obj;
                eh3 eh3Var2 = cp00Var.c.b;
                if (eh3Var2 != eh3.REMOTE_IMAGE) {
                    if (eh3Var2 != eh3.SMART_IMAGE && cp00Var.p) {
                        return new tcd(((bb6) y11Var.z).a(y11Var.b.b.a(R.string.content_app_logo_image, Arrays.copyOf(new Object[0], 0)), dkq.DRAWABLE));
                    }
                    return null;
                }
                if (oc5Var2 == null || (str2 = oc5Var2.d) == null) {
                    str2 = null;
                } else {
                    if (str2.length() <= 0) {
                        str2 = null;
                    }
                    if (str2 == null) {
                        str2 = null;
                    }
                }
                if (str2 != null) {
                    return new ucd(str2);
                }
                return null;
            case 3:
                int iIntValue3 = ((Integer) obj).intValue();
                List list = (List) ((fee) y11Var.r.getValue()).b();
                if (list.size() == 8) {
                    if (list.isEmpty()) {
                        i = 1;
                    } else {
                        Iterator it = list.iterator();
                        do {
                            if (!it.hasNext()) {
                                i = 1;
                            }
                        } while (((Number) it.next()).intValue() != 0);
                    }
                }
                return new jp00(cp00Var.f4723a, (xyw) ((fee) y11Var.q.getValue()).b(), i != 0 ? CollectionsKt.D0(list, iIntValue3 + 1) : iun.f15405a);
            default:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                if (((Boolean) ((fee) y11Var.h.getValue()).c()).booleanValue()) {
                    return new lp00(ctf0.b(R.attr.uikitSplashBackground, y11Var.b));
                }
                if (zBooleanValue) {
                    return new hp00((String) y11Var.e.getValue());
                }
                return cp00Var.c.b == eh3.SMART_IMAGE ? (mp00) ((fee) y11Var.s.getValue()).b() : new ip00(cp00Var.f4723a, (eub0) y11Var.c.getValue(), (a4x) ((fee) y11Var.m.getValue()).b(), (mx80) ((fee) y11Var.o.getValue()).b(), (vcd) ((fee) y11Var.p.getValue()).b(), (ud5) ((fee) y11Var.x.getValue()).b(), (List) ((fee) y11Var.n.getValue()).b(), (String) ((fee) y11Var.k.getValue()).c());
        }
    }

    public /* synthetic */ pp00(cp00 cp00Var, y11 y11Var, byte b) {
        this.f27352a = b;
        this.b = cp00Var;
        this.c = y11Var;
    }
}

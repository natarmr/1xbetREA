package a;

import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class pn20 extends dtb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f27264a;

    public /* synthetic */ pn20(byte b) {
        this.f27264a = b;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003a  */
    @Override // a.dtb
    public Object E(Object obj, Object obj2) {
        xuq0 xuq0Var;
        switch (this.f27264a) {
            case 6:
                ((wi80) obj).getClass();
                ((wi80) obj2).getClass();
                return xun.f41520a;
            case 7:
                je90 je90Var = (je90) obj;
                je90 je90Var2 = (je90) obj2;
                je90Var.getClass();
                je90Var2.getClass();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                zmk0 zmk0Var = je90Var2.b;
                String str = je90Var2.f16363a;
                zmk0 zmk0Var2 = je90Var2.c;
                if (!zmk0Var.equals(je90Var.b)) {
                    linkedHashSet.add(new ge90(zmk0Var));
                }
                if (!zmk0Var2.equals(je90Var.c)) {
                    linkedHashSet.add(new he90(zmk0Var2));
                }
                if (!str.equals(je90Var.f16363a)) {
                    linkedHashSet.add(new fe90(str));
                }
                return linkedHashSet;
            case 10:
                p6t0 p6t0Var = (p6t0) obj;
                p6t0 p6t0Var2 = (p6t0) obj2;
                p6t0Var.getClass();
                p6t0Var2.getClass();
                return p6t0Var.o(p6t0Var, p6t0Var2);
            case 12:
                gwi0 gwi0Var = (gwi0) obj;
                gwi0 gwi0Var2 = (gwi0) obj2;
                gwi0Var.getClass();
                gwi0Var2.getClass();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                if ((gwi0Var2 instanceof jui0) && (gwi0Var instanceof jui0)) {
                    ArrayList arrayList = new ArrayList();
                    boolean z = ((jui0) gwi0Var).b;
                    boolean z2 = ((jui0) gwi0Var2).b;
                    if (z != z2) {
                        arrayList.add(new fwi0(z2));
                    }
                    linkedHashSet2.add(arrayList);
                }
                return linkedHashSet2;
            case 13:
                prj0 prj0Var = (prj0) obj2;
                ((prj0) obj).getClass();
                prj0Var.getClass();
                LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                linkedHashSet3.add(new orj0(prj0Var));
                return linkedHashSet3;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                s1q0 s1q0Var = (s1q0) obj;
                s1q0 s1q0Var2 = (s1q0) obj2;
                s1q0Var.getClass();
                s1q0Var2.getClass();
                LinkedHashSet linkedHashSet4 = new LinkedHashSet();
                if ((s1q0Var instanceof bvq0) && (s1q0Var2 instanceof bvq0)) {
                    bvq0 bvq0Var = (bvq0) s1q0Var2;
                    if (((bvq0) s1q0Var).i() != bvq0Var.i()) {
                        xuq0Var = new xuq0(bvq0Var.i());
                    } else {
                        xuq0Var = null;
                    }
                } else {
                    xuq0Var = null;
                }
                if (xuq0Var != null) {
                    linkedHashSet4.add(xuq0Var);
                }
                if (linkedHashSet4.isEmpty()) {
                    return null;
                }
                return linkedHashSet4;
            default:
                return super.E(obj, obj2);
        }
    }

    @Override // a.dtb
    public final boolean w(Object obj, Object obj2) {
        switch (this.f27264a) {
            case 0:
                fo7 fo7Var = (fo7) obj;
                fo7 fo7Var2 = (fo7) obj2;
                fo7Var.getClass();
                fo7Var2.getClass();
                return Intrinsics.d(fo7Var, fo7Var2);
            case 1:
                ew20 ew20Var = (ew20) obj;
                ew20 ew20Var2 = (ew20) obj2;
                ew20Var.getClass();
                ew20Var2.getClass();
                if ((ew20Var instanceof gw20) && (ew20Var2 instanceof gw20)) {
                    gw20 gw20Var = (gw20) ew20Var;
                    gw20 gw20Var2 = (gw20) ew20Var2;
                    if (gw20Var.c == gw20Var2.c && gw20Var.d == gw20Var2.d) {
                        return true;
                    }
                } else if ((ew20Var instanceof li) && (ew20Var2 instanceof li)) {
                    if (((li) ew20Var).f20081a == ((li) ew20Var2).f20081a) {
                        return true;
                    }
                } else {
                    if (!(ew20Var instanceof xvi0) || !(ew20Var2 instanceof xvi0)) {
                        return ew20Var.equals(ew20Var2);
                    }
                    if (((xvi0) ew20Var).f41561a == ((xvi0) ew20Var2).f41561a) {
                        return true;
                    }
                }
                return false;
            case 2:
                fw20 fw20Var = (fw20) obj;
                fw20 fw20Var2 = (fw20) obj2;
                fw20Var.getClass();
                fw20Var2.getClass();
                if ((fw20Var instanceof hw20) && (fw20Var2 instanceof hw20)) {
                    hw20 hw20Var = (hw20) fw20Var;
                    hw20 hw20Var2 = (hw20) fw20Var2;
                    if (hw20Var.c == hw20Var2.c && hw20Var.d == hw20Var2.d) {
                        return true;
                    }
                } else if ((fw20Var instanceof mi) && (fw20Var2 instanceof mi)) {
                    if (((mi) fw20Var).f21821a == ((mi) fw20Var2).f21821a) {
                        return true;
                    }
                } else {
                    if (!(fw20Var instanceof yvi0) || !(fw20Var2 instanceof yvi0)) {
                        return fw20Var.equals(fw20Var2);
                    }
                    if (((yvi0) fw20Var).f43321a == ((yvi0) fw20Var2).f43321a) {
                        return true;
                    }
                }
                return false;
            case 3:
                zw40 zw40Var = (zw40) obj;
                zw40 zw40Var2 = (zw40) obj2;
                zw40Var.getClass();
                zw40Var2.getClass();
                return Intrinsics.d(zw40Var, zw40Var2);
            case 4:
                qn50 qn50Var = (qn50) obj;
                qn50 qn50Var2 = (qn50) obj2;
                qn50Var.getClass();
                qn50Var2.getClass();
                return Intrinsics.d(qn50Var, qn50Var2);
            case 5:
                ct5 ct5Var = (ct5) obj;
                ct5 ct5Var2 = (ct5) obj2;
                ct5Var.getClass();
                ct5Var2.getClass();
                return Intrinsics.d(ct5Var, ct5Var2);
            case 6:
                wi80 wi80Var = (wi80) obj;
                wi80 wi80Var2 = (wi80) obj2;
                wi80Var.getClass();
                wi80Var2.getClass();
                return Intrinsics.d(wi80Var, wi80Var2);
            case 7:
                je90 je90Var = (je90) obj;
                je90 je90Var2 = (je90) obj2;
                je90Var.getClass();
                je90Var2.getClass();
                return Intrinsics.d(je90Var2, je90Var);
            case 8:
                obj.getClass();
                obj2.getClass();
                return ((obj instanceof dpe0) && (obj2 instanceof dpe0)) ? Intrinsics.d((dpe0) obj, (dpe0) obj2) : Intrinsics.d(obj, obj2);
            case 9:
                ((awf0) obj).getClass();
                ((awf0) obj2).getClass();
                return false;
            case 10:
                p6t0 p6t0Var = (p6t0) obj;
                p6t0 p6t0Var2 = (p6t0) obj2;
                p6t0Var.getClass();
                p6t0Var2.getClass();
                return p6t0Var.h(p6t0Var, p6t0Var2);
            case 11:
                Calendar calendar = (Calendar) obj;
                Calendar calendar2 = (Calendar) obj2;
                calendar.getClass();
                calendar2.getClass();
                return Intrinsics.d(calendar.getTime(), calendar2.getTime());
            case 12:
                gwi0 gwi0Var = (gwi0) obj;
                gwi0 gwi0Var2 = (gwi0) obj2;
                gwi0Var.getClass();
                gwi0Var2.getClass();
                return Intrinsics.d(gwi0Var, gwi0Var2);
            case 13:
                prj0 prj0Var = (prj0) obj;
                prj0 prj0Var2 = (prj0) obj2;
                prj0Var.getClass();
                prj0Var2.getClass();
                return Intrinsics.d(prj0Var2, prj0Var);
            case 14:
                obj.getClass();
                obj2.getClass();
                return ((obj instanceof dpe0) && (obj2 instanceof dpe0)) ? Intrinsics.d((dpe0) obj, (dpe0) obj2) : Intrinsics.d(obj, obj2);
            case 15:
                lql0 lql0Var = (lql0) obj;
                lql0 lql0Var2 = (lql0) obj2;
                lql0Var.getClass();
                lql0Var2.getClass();
                return Intrinsics.d(lql0Var, lql0Var2);
            case 16:
                owl0 owl0Var = (owl0) obj;
                owl0 owl0Var2 = (owl0) obj2;
                owl0Var.getClass();
                owl0Var2.getClass();
                return Intrinsics.d(owl0Var2, owl0Var);
            case 17:
                p6t0 p6t0Var3 = (p6t0) obj;
                p6t0 p6t0Var4 = (p6t0) obj2;
                p6t0Var3.getClass();
                p6t0Var4.getClass();
                return ((p6t0Var3 instanceof cqm0) && (p6t0Var4 instanceof cqm0)) ? Intrinsics.d((cqm0) p6t0Var3, (cqm0) p6t0Var4) : Intrinsics.d(p6t0Var3, p6t0Var4);
            case 18:
                uxm0 uxm0Var = (uxm0) obj;
                uxm0 uxm0Var2 = (uxm0) obj2;
                uxm0Var.getClass();
                uxm0Var2.getClass();
                return Intrinsics.d(uxm0Var, uxm0Var2);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                s1q0 s1q0Var = (s1q0) obj;
                s1q0 s1q0Var2 = (s1q0) obj2;
                s1q0Var.getClass();
                s1q0Var2.getClass();
                return Intrinsics.d(s1q0Var, s1q0Var2);
            case 20:
                p6t0 p6t0Var5 = (p6t0) obj;
                p6t0 p6t0Var6 = (p6t0) obj2;
                return rw2.y(p6t0Var5, p6t0Var6, p6t0Var5, p6t0Var6);
            case 21:
                m7w m7wVar = (m7w) obj;
                m7w m7wVar2 = (m7w) obj2;
                m7wVar.getClass();
                m7wVar2.getClass();
                return Intrinsics.d(m7wVar, m7wVar2);
            default:
                p6t0 p6t0Var7 = (p6t0) obj;
                p6t0 p6t0Var8 = (p6t0) obj2;
                return rw2.y(p6t0Var7, p6t0Var8, p6t0Var7, p6t0Var8);
        }
    }

    @Override // a.dtb
    public final boolean x(Object obj, Object obj2) {
        switch (this.f27264a) {
            case 0:
                fo7 fo7Var = (fo7) obj;
                fo7 fo7Var2 = (fo7) obj2;
                fo7Var.getClass();
                fo7Var2.getClass();
                return fo7Var.f9867a == fo7Var2.f9867a;
            case 1:
                ew20 ew20Var = (ew20) obj;
                ew20 ew20Var2 = (ew20) obj2;
                ew20Var.getClass();
                ew20Var2.getClass();
                if ((ew20Var instanceof gw20) && (ew20Var2 instanceof gw20)) {
                    if (((gw20) ew20Var).b != ((gw20) ew20Var2).b) {
                        return false;
                    }
                } else if ((ew20Var instanceof li) && (ew20Var2 instanceof li)) {
                    if (((li) ew20Var).f20081a != ((li) ew20Var2).f20081a) {
                        return false;
                    }
                } else {
                    if (!(ew20Var instanceof xvi0) || !(ew20Var2 instanceof xvi0)) {
                        return ew20Var.getClass().equals(ew20Var2.getClass());
                    }
                    if (((xvi0) ew20Var).f41561a != ((xvi0) ew20Var2).f41561a) {
                        return false;
                    }
                }
                return true;
            case 2:
                fw20 fw20Var = (fw20) obj;
                fw20 fw20Var2 = (fw20) obj2;
                fw20Var.getClass();
                fw20Var2.getClass();
                if ((fw20Var instanceof hw20) && (fw20Var2 instanceof hw20)) {
                    if (((hw20) fw20Var).b != ((hw20) fw20Var2).b) {
                        return false;
                    }
                } else if ((fw20Var instanceof mi) && (fw20Var2 instanceof mi)) {
                    if (((mi) fw20Var).f21821a != ((mi) fw20Var2).f21821a) {
                        return false;
                    }
                } else {
                    if (!(fw20Var instanceof yvi0) || !(fw20Var2 instanceof yvi0)) {
                        return fw20Var.getClass().equals(fw20Var2.getClass());
                    }
                    if (((yvi0) fw20Var).f43321a != ((yvi0) fw20Var2).f43321a) {
                        return false;
                    }
                }
                return true;
            case 3:
                zw40 zw40Var = (zw40) obj;
                zw40 zw40Var2 = (zw40) obj2;
                zw40Var.getClass();
                zw40Var2.getClass();
                return zw40Var.getClass() == zw40Var2.getClass();
            case 4:
                qn50 qn50Var = (qn50) obj;
                qn50 qn50Var2 = (qn50) obj2;
                qn50Var.getClass();
                qn50Var2.getClass();
                return qn50Var.f29016a == qn50Var2.f29016a;
            case 5:
                ct5 ct5Var = (ct5) obj;
                ct5 ct5Var2 = (ct5) obj2;
                ct5Var.getClass();
                ct5Var2.getClass();
                return ct5Var.f4919a == ct5Var2.f4919a;
            case 6:
                wi80 wi80Var = (wi80) obj;
                wi80 wi80Var2 = (wi80) obj2;
                wi80Var.getClass();
                wi80Var2.getClass();
                return wi80Var.f39202a == wi80Var2.f39202a;
            case 7:
                ((je90) obj).getClass();
                ((je90) obj2).getClass();
                return je90.class.equals(je90.class);
            case 8:
                obj.getClass();
                obj2.getClass();
                return ((obj instanceof dpe0) && (obj2 instanceof dpe0)) ? Intrinsics.d(((dpe0) obj).b, ((dpe0) obj2).b) : obj.getClass().equals(obj2.getClass());
            case 9:
                awf0 awf0Var = (awf0) obj;
                awf0 awf0Var2 = (awf0) obj2;
                awf0Var.getClass();
                awf0Var2.getClass();
                if ((awf0Var instanceof buf0) && (awf0Var2 instanceof buf0)) {
                    return awf0Var.equals(awf0Var2);
                }
                if ((awf0Var instanceof yvf0) && (awf0Var2 instanceof yvf0)) {
                    return awf0Var.equals(awf0Var2);
                }
                if ((awf0Var instanceof zvf0) && (awf0Var2 instanceof zvf0)) {
                    return awf0Var.equals(awf0Var2);
                }
                return (awf0Var instanceof cuf0) && (awf0Var2 instanceof cuf0) && awf0Var == awf0Var2;
            case 10:
                p6t0 p6t0Var = (p6t0) obj;
                p6t0 p6t0Var2 = (p6t0) obj2;
                p6t0Var.getClass();
                p6t0Var2.getClass();
                return p6t0Var.g(p6t0Var, p6t0Var2);
            case 11:
                Calendar calendar = (Calendar) obj;
                Calendar calendar2 = (Calendar) obj2;
                calendar.getClass();
                calendar2.getClass();
                return Intrinsics.d(calendar.getTime(), calendar2.getTime());
            case 12:
                gwi0 gwi0Var = (gwi0) obj;
                gwi0 gwi0Var2 = (gwi0) obj2;
                gwi0Var.getClass();
                gwi0Var2.getClass();
                return gwi0Var2.getClass() == gwi0Var.getClass();
            case 13:
                prj0 prj0Var = (prj0) obj;
                prj0 prj0Var2 = (prj0) obj2;
                prj0Var.getClass();
                prj0Var2.getClass();
                return Intrinsics.d(prj0Var2.f27469a, prj0Var.f27469a);
            case 14:
                obj.getClass();
                obj2.getClass();
                return ((obj instanceof dpe0) && (obj2 instanceof dpe0)) ? Intrinsics.d(((dpe0) obj).b, ((dpe0) obj2).b) : obj.getClass().equals(obj2.getClass());
            case 15:
                lql0 lql0Var = (lql0) obj;
                lql0 lql0Var2 = (lql0) obj2;
                lql0Var.getClass();
                lql0Var2.getClass();
                ae9 ae9Var = lql0Var.f20492a;
                ae9 ae9Var2 = lql0Var2.f20492a;
                if (ae9Var == ae9Var2 && (lql0Var instanceof kql0) && (lql0Var2 instanceof kql0)) {
                    if (((kql0) lql0Var).b.f37861a != ((kql0) lql0Var2).b.f37861a) {
                        return false;
                    }
                } else if (ae9Var != ae9Var2) {
                    return false;
                }
                return true;
            case 16:
                owl0 owl0Var = (owl0) obj;
                owl0 owl0Var2 = (owl0) obj2;
                owl0Var.getClass();
                owl0Var2.getClass();
                return owl0Var2.getClass() == owl0Var.getClass();
            case 17:
                p6t0 p6t0Var3 = (p6t0) obj;
                p6t0 p6t0Var4 = (p6t0) obj2;
                p6t0Var3.getClass();
                p6t0Var4.getClass();
                if ((p6t0Var3 instanceof cqm0) && (p6t0Var4 instanceof cqm0)) {
                    return ((cqm0) p6t0Var3).f4802a == ((cqm0) p6t0Var4).f4802a;
                }
                return p6t0Var3.getClass().equals(p6t0Var4.getClass());
            case 18:
                uxm0 uxm0Var = (uxm0) obj;
                uxm0 uxm0Var2 = (uxm0) obj2;
                uxm0Var.getClass();
                uxm0Var2.getClass();
                return uxm0Var.f36448a == uxm0Var2.f36448a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                s1q0 s1q0Var = (s1q0) obj;
                s1q0 s1q0Var2 = (s1q0) obj2;
                s1q0Var.getClass();
                s1q0Var2.getClass();
                return s1q0Var.getClass().equals(s1q0Var2.getClass());
            case 20:
                p6t0 p6t0Var5 = (p6t0) obj2;
                return axq.f((p6t0) obj, p6t0Var5).equals(p6t0Var5.getClass());
            case 21:
                ((m7w) obj).getClass();
                ((m7w) obj2).getClass();
                return m7w.class.equals(m7w.class);
            default:
                p6t0 p6t0Var6 = (p6t0) obj2;
                return axq.f((p6t0) obj, p6t0Var6).equals(p6t0Var6.getClass());
        }
    }
}

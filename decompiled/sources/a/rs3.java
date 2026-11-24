package a;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.ActivityScreen;
import com.github.terrakok.cicerone.androidx.ActivityScreen$Companion$invoke$1;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import com.github.terrakok.cicerone.androidx.FragmentScreen$Companion$invoke$1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xplatform.client1.features.appactivity.ApplicationActivity;
import org.xplatform.core.navigation.dialog.DialogScreen;
import org.xplatform.verification.status.impl.navigation.VerificationStatusScreens$VerificationStatusFragmentScreen;

/* JADX INFO: loaded from: classes3.dex */
public class rs3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kxq f31015a;
    public final int b;
    public final androidx.fragment.app.e c;
    public final m1r d;
    public final ArrayList e;

    public rs3(kxq kxqVar, int i, androidx.fragment.app.e eVar, m1r m1rVar) {
        eVar.getClass();
        m1rVar.getClass();
        this.f31015a = kxqVar;
        this.b = i;
        this.c = eVar;
        this.d = m1rVar;
        this.e = new ArrayList();
        eVar.k0(new ur3(this, (byte) 1), true);
    }

    /* JADX WARN: Code duplicated, block: B:147:0x0259  */
    public void a(t7d t7dVar) {
        vsv0 vsv0Var;
        androidx.fragment.app.e eVarC;
        Fragment fragmentI;
        int iNextIndex;
        t7dVar.getClass();
        androidx.fragment.app.e eVar = this.c;
        eVar.F();
        if (t7dVar instanceof x4m0) {
            FragmentScreen fragmentScreenG = g(((x4m0) t7dVar).f40273a);
            if (fragmentScreenG instanceof ActivityScreen) {
                e((ActivityScreen) fragmentScreenG);
                return;
            } else {
                f(fragmentScreenG, true);
                return;
            }
        }
        boolean z = t7dVar instanceof gn50;
        ArrayList arrayList = this.e;
        int iNextIndex2 = -1;
        if (z) {
            VerificationStatusScreens$VerificationStatusFragmentScreen verificationStatusScreens$VerificationStatusFragmentScreen = ((gn50) t7dVar).f11570a;
            ListIterator listIterator = arrayList.listIterator(arrayList.size());
            while (listIterator.hasPrevious()) {
                if (kotlin.text.c.n((String) listIterator.previous(), "_childScreen", false)) {
                    iNextIndex2 = listIterator.nextIndex();
                    break;
                }
            }
            if (iNextIndex2 >= 0 && iNextIndex2 < arrayList.size()) {
                FragmentScreen$Companion$invoke$1 fragmentScreen$Companion$invoke$1G = g(verificationStatusScreens$VerificationStatusFragmentScreen);
                List listSubList = arrayList.subList(iNextIndex2 + 1, arrayList.size());
                eVar.f0(0, (String) CollectionsKt.W(iNextIndex2, arrayList));
                listSubList.clear();
                h(new xkf0(fragmentScreen$Companion$invoke$1G));
                return;
            }
            FragmentScreen fragmentScreenG2 = g(verificationStatusScreens$VerificationStatusFragmentScreen);
            if (fragmentScreenG2 instanceof ActivityScreen) {
                e((ActivityScreen) fragmentScreenG2);
                return;
            } else {
                if (fragmentScreenG2 instanceof FragmentScreen) {
                    f(fragmentScreenG2, true);
                    return;
                }
                return;
            }
        }
        Object obj = null;
        if (t7dVar instanceof afq) {
            ListIterator listIterator2 = arrayList.listIterator(arrayList.size());
            while (true) {
                if (listIterator2.hasPrevious()) {
                    if (kotlin.text.c.n((String) listIterator2.previous(), "_childScreen", false)) {
                        iNextIndex = listIterator2.nextIndex();
                        break;
                    }
                } else {
                    iNextIndex = -1;
                    break;
                }
            }
            int i = iNextIndex - 1;
            if (i >= 0) {
                List listSubList2 = arrayList.subList(i, arrayList.size());
                eVar.f0(0, ((String) CollectionsKt.U(listSubList2)).toString());
                listSubList2.clear();
                return;
            } else if (i != -1) {
                c();
                return;
            } else {
                arrayList.clear();
                eVar.f0(1, null);
                return;
            }
        }
        if (t7dVar instanceof bc5) {
            FragmentScreen fragmentScreen = ((bc5) t7dVar).f2336a;
            Iterator it = arrayList.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i2 = -1;
                    break;
                } else if (StringsKt.e0((String) it.next(), "_childScreen").equals(fragmentScreen.getF45455a())) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 != -1) {
                List listSubList3 = arrayList.subList(i2, arrayList.size());
                eVar.f0(0, ((String) CollectionsKt.U(listSubList3)).toString());
                listSubList3.clear();
                return;
            } else if (fragmentScreen instanceof ActivityScreen) {
                e((ActivityScreen) fragmentScreen);
                return;
            } else {
                f(fragmentScreen, true);
                return;
            }
        }
        boolean z2 = t7dVar instanceof lvk;
        int i3 = this.b;
        if (z2) {
            Fragment fragmentI2 = eVar.I(i3);
            if (fragmentI2 == null) {
                return;
            }
            fragmentI2.C().getClass();
            throw null;
        }
        if (t7dVar instanceof kvk) {
            kvk kvkVar = (kvk) t7dVar;
            Fragment fragmentI3 = eVar.I(i3);
            if (fragmentI3 == null) {
                return;
            }
            androidx.fragment.app.e eVarC2 = fragmentI3.C();
            eVarC2.getClass();
            List listP = eVarC2.c.p();
            ArrayList arrayListU = twn.u(listP);
            for (Object obj2 : listP) {
                if (obj2 instanceof of80) {
                    arrayListU.add(obj2);
                }
            }
            if (arrayListU.isEmpty()) {
                return;
            }
            for (Object obj3 : arrayListU) {
                if (Intrinsics.d(((of80) obj3).B, null)) {
                    obj = obj3;
                    break;
                }
            }
            of80 of80Var = (of80) obj;
            if (of80Var == null) {
                of80Var = (of80) CollectionsKt.d0(arrayListU);
            }
            if (kvkVar.b && (fragmentI = eVar.I(i3)) != null) {
                zb5 zb5Var = new zb5(eVar);
                zb5Var.j(fragmentI);
                zb5Var.f();
                zb5 zb5Var2 = new zb5(eVar);
                zb5Var2.b(new h6r(7, fragmentI));
                zb5Var2.f();
            }
            if (kvkVar.f18958a) {
                of80Var.y0();
            } else {
                of80Var.z0(false, false, false);
            }
            eVarC2.F();
            return;
        }
        if (t7dVar instanceof psj0) {
            psj0 psj0Var = (psj0) t7dVar;
            DialogScreen dialogScreen = psj0Var.f27518a;
            of80 of80VarD = dialogScreen.d(this.d);
            String f45455a = dialogScreen.getF45455a();
            Fragment fragmentI4 = eVar.I(i3);
            if (fragmentI4 != null && (eVarC = fragmentI4.C()) != null) {
                eVar = eVarC;
            }
            if (psj0Var.c || eVar.J(f45455a) == null) {
                if (psj0Var.b) {
                    sj3.E0(of80VarD, eVar, f45455a);
                    return;
                } else {
                    of80VarD.H0(eVar, f45455a);
                    return;
                }
            }
            return;
        }
        boolean z3 = t7dVar instanceof gw70;
        i0h0 i0h0Var = this.f31015a;
        if (!z3) {
            if (t7dVar instanceof ivk) {
                i0h0Var.getClass();
                evv0 evv0Var = i0h0Var instanceof evv0 ? (evv0) i0h0Var : null;
                if (evv0Var == null) {
                    return;
                }
                ((ApplicationActivity) evv0Var).G();
                throw null;
            }
            if (t7dVar instanceof jvk) {
                i0h0Var.getClass();
                evv0 evv0Var2 = i0h0Var instanceof evv0 ? (evv0) i0h0Var : null;
                if (evv0Var2 == null) {
                    return;
                }
                ((ApplicationActivity) evv0Var2).G();
                throw null;
            }
            if (t7dVar instanceof dwq) {
                m7h0 m7h0Var = ((dwq) t7dVar).f6811a;
                if (m7h0Var instanceof ActivityScreen) {
                    e((ActivityScreen) m7h0Var);
                    return;
                } else {
                    if (m7h0Var instanceof FragmentScreen) {
                        f((FragmentScreen) m7h0Var, true);
                        return;
                    }
                    return;
                }
            }
            if (t7dVar instanceof xkf0) {
                h((xkf0) t7dVar);
                return;
            }
            if (!(t7dVar instanceof ac5)) {
                if (t7dVar instanceof nb5) {
                    c();
                    return;
                }
                return;
            }
            m7h0 m7h0Var2 = ((ac5) t7dVar).f613a;
            if (m7h0Var2 == null) {
                arrayList.clear();
                eVar.f0(1, null);
                return;
            }
            Iterator it2 = arrayList.iterator();
            int i4 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    i4 = -1;
                    break;
                } else if (StringsKt.e0((String) it2.next(), "_childScreen").equals(m7h0Var2.getF45455a())) {
                    break;
                } else {
                    i4++;
                }
            }
            if (i4 == -1) {
                d(m7h0Var2);
                return;
            }
            List listSubList4 = arrayList.subList(i4, arrayList.size());
            eVar.f0(0, ((String) CollectionsKt.U(listSubList4)).toString());
            listSubList4.clear();
            return;
        }
        gw70 gw70Var = (gw70) t7dVar;
        i0h0Var.getClass();
        evv0 evv0Var3 = i0h0Var instanceof evv0 ? (evv0) i0h0Var : null;
        if (evv0Var3 == null) {
            return;
        }
        Fragment fragmentI5 = eVar.I(i3);
        Function2 function2 = gw70Var.b;
        lwv0 lwv0Var = gw70Var.f12013a;
        if (function2 == null) {
            vsv0Var = vsv0.f37973a;
        } else {
            fwv0 fwv0Var = ((ApplicationActivity) evv0Var3).Y;
            if (fwv0Var == null) {
                Intrinsics.h("xBottomSheetResultReceiver");
                throw null;
            }
            vsv0Var = (vsv0) function2.invoke(fwv0Var, fragmentI5 != null ? ltt0.v(fragmentI5) : null);
            if (vsv0Var == null) {
                vsv0Var = vsv0.f37973a;
            }
        }
        int iOrdinal = vsv0Var.ordinal();
        if (iOrdinal == 0) {
            hsv0 hsv0VarG = ((ApplicationActivity) evv0Var3).G();
            u950 u950Var = hsv0VarG.c;
            if (u950Var == null) {
                ArrayList arrayList2 = hsv0VarG.d;
                hsv0VarG.c(arrayList2, lwv0Var);
                arrayList2.add(lwv0Var);
            } else {
                hsv0VarG.c(u950Var, lwv0Var);
                u950Var.add(lwv0Var);
            }
            if (fragmentI5 != null) {
                hsv0VarG.b.a(lwv0Var, fragmentI5);
                return;
            }
            return;
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                return;
            }
            t9f.b();
            return;
        }
        if (fragmentI5 != null) {
            hsv0 hsv0VarG2 = ((ApplicationActivity) evv0Var3).G();
            jvv0 jvv0Var = hsv0VarG2.b;
            ArrayList arrayList3 = hsv0VarG2.d;
            u950 u950Var2 = hsv0VarG2.c;
            if ((u950Var2 != null && u950Var2.contains(lwv0Var)) || arrayList3.contains(lwv0Var)) {
                jvv0Var.a(lwv0Var, fragmentI5);
                return;
            }
            u950 u950Var3 = hsv0VarG2.c;
            if (u950Var3 == null) {
                hsv0VarG2.c(arrayList3, lwv0Var);
                arrayList3.add(lwv0Var);
            } else {
                hsv0VarG2.c(u950Var3, lwv0Var);
                u950Var3.add(lwv0Var);
            }
            jvv0Var.a(lwv0Var, fragmentI5);
        }
    }

    public final void b(t7d[] t7dVarArr) {
        t7dVarArr.getClass();
        androidx.fragment.app.e eVar = this.c;
        eVar.F();
        ArrayList arrayList = this.e;
        arrayList.clear();
        int iP = eVar.P();
        int i = 0;
        if (iP > 0) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                String str = eVar.O(i2).i;
                str.getClass();
                arrayList.add(str);
                if (i3 >= iP) {
                    break;
                } else {
                    i2 = i3;
                }
            }
        }
        int length = t7dVarArr.length;
        while (i < length) {
            t7d t7dVar = t7dVarArr[i];
            i++;
            try {
                a(t7dVar);
            } catch (RuntimeException e) {
                t7dVar.getClass();
                throw e;
            }
        }
    }

    public void c() {
        ArrayList arrayList = this.e;
        if (arrayList.isEmpty()) {
            this.f31015a.finish();
            return;
        }
        androidx.fragment.app.e eVar = this.c;
        eVar.getClass();
        eVar.A(new t1r(eVar, null, -1, 0), false);
        arrayList.remove(arrayList.size() - 1);
    }

    public void d(m7h0 m7h0Var) {
        m7h0Var.getClass();
        this.e.clear();
        this.c.f0(1, null);
    }

    public final void e(ActivityScreen activityScreen) {
        kxq kxqVar = this.f31015a;
        Intent intentC = ((ActivityScreen$Companion$invoke$1) activityScreen).c(kxqVar);
        try {
            kxqVar.startActivity(intentC, null);
        } catch (ActivityNotFoundException unused) {
            intentC.getClass();
        }
    }

    public final void f(FragmentScreen fragmentScreen, boolean z) {
        fragmentScreen.getClass();
        String str = fragmentScreen.getF45455a() + "_dialogScreen";
        ArrayList arrayList = this.e;
        if (arrayList.contains(str)) {
            return;
        }
        Fragment fragmentA = fragmentScreen.a(this.d);
        androidx.fragment.app.e eVar = this.c;
        eVar.getClass();
        zb5 zb5Var = new zb5(eVar);
        zb5Var.p = true;
        int i = this.b;
        i(fragmentScreen, zb5Var, eVar.I(i), fragmentA);
        boolean z2 = fragmentA instanceof sik;
        String strN = z2 ? ohs0.n(fragmentScreen.getF45455a(), "_dialogScreen") : fragmentScreen.getF45455a();
        if (!z2) {
            if (fragmentScreen.getB()) {
                zb5Var.o(i, fragmentA, strN);
            } else {
                zb5Var.k(i, fragmentA, strN, 1);
            }
        }
        if (z) {
            zb5Var.c(strN);
            arrayList.add(strN);
        }
        if (!z2) {
            zb5Var.f();
            return;
        }
        sik sikVar = (sik) fragmentA;
        sikVar.V1 = false;
        sikVar.W1 = true;
        zb5Var.k(0, sikVar, strN, 1);
        sikVar.U1 = false;
        sikVar.P1 = zb5Var.g(false, true);
    }

    public final FragmentScreen$Companion$invoke$1 g(FragmentScreen fragmentScreen) {
        return new FragmentScreen$Companion$invoke$1(ohs0.n(fragmentScreen.getF45455a(), "_childScreen"), new uq(fragmentScreen, this, (byte) 1), true);
    }

    public void h(xkf0 xkf0Var) {
        ArrayList arrayList = this.e;
        String str = (String) CollectionsKt.f0(arrayList);
        if (str != null && StringsKt.O(str, "_childScreen", false)) {
            m7h0 activityScreen$Companion$invoke$1 = xkf0Var.f41027a;
            if (activityScreen$Companion$invoke$1 != null) {
                if (activityScreen$Companion$invoke$1 instanceof FragmentScreen) {
                    activityScreen$Companion$invoke$1 = g((FragmentScreen) activityScreen$Companion$invoke$1);
                } else if (activityScreen$Companion$invoke$1 instanceof ActivityScreen) {
                    ActivityScreen activityScreen = (ActivityScreen) activityScreen$Companion$invoke$1;
                    activityScreen$Companion$invoke$1 = new ActivityScreen$Companion$invoke$1(((ActivityScreen$Companion$invoke$1) activityScreen).f45455a.concat("_childScreen"), new uq(activityScreen, this, (byte) 2));
                }
            }
            xkf0Var = new xkf0(activityScreen$Companion$invoke$1);
        }
        m7h0 m7h0Var = xkf0Var.f41027a;
        if (m7h0Var instanceof ActivityScreen) {
            e((ActivityScreen) m7h0Var);
            this.f31015a.finish();
        } else if (m7h0Var instanceof FragmentScreen) {
            if (arrayList.isEmpty()) {
                f((FragmentScreen) m7h0Var, false);
                return;
            }
            androidx.fragment.app.e eVar = this.c;
            eVar.getClass();
            eVar.A(new t1r(eVar, null, -1, 0), false);
            arrayList.remove(arrayList.size() - 1);
            f((FragmentScreen) m7h0Var, true);
        }
    }

    public void i(FragmentScreen fragmentScreen, zb5 zb5Var, Fragment fragment, Fragment fragment2) {
        fragmentScreen.getClass();
        fragment2.getClass();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ rs3(kxq kxqVar, int i, androidx.fragment.app.e eVar, int i2) {
        eVar = (i2 & 4) != 0 ? kxqVar.r() : eVar;
        m1r m1rVarS = eVar.S();
        m1rVarS.getClass();
        this(kxqVar, i, eVar, m1rVarS);
    }
}

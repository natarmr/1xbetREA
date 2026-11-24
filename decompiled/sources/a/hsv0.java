package a;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class hsv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fwv0 f13603a;
    public final jvv0 b;
    public u950 c;
    public final ArrayList d;
    public final wzu0 e;
    public final gsv0 f;

    public hsv0(fwv0 fwv0Var, jvv0 jvv0Var) {
        fwv0Var.getClass();
        jvv0Var.getClass();
        this.f13603a = fwv0Var;
        this.b = jvv0Var;
        this.d = new ArrayList();
        this.e = new wzu0(1, this, hsv0.class, "dismiss", "dismiss$navigation(Lorg/xplatform/core/navigation/compose_nav/bottom_sheet/XBottomSheetRoute;)V", 0, (byte) 17);
        this.f = new gsv0(this);
    }

    public final void a(mm40 mm40Var, Set set, fet fetVar, int i) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        set.getClass();
        fetVar2.g0(-1820893661);
        int i2 = i | 6 | (fetVar2.g(set) ? 32 : 16) | (fetVar2.g(this) ? 256 : 128);
        byte b = 0;
        byte b2 = 1;
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            int i3 = i2 >> 3;
            int i4 = i3 & 14;
            boolean z = ((i4 ^ 6) > 4 && fetVar2.g(set)) || (i3 & 6) == 4;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = szg0.a(new qb50(set, b2));
                fetVar2.o0(objP);
            }
            u950 u950VarH = c9x.H((rzg0) objP, new rb50[]{kwv0.INSTANCE}, fetVar2);
            int i5 = i2 & 896;
            boolean zI = (i5 == 256) | fetVar2.i(u950VarH);
            Object objP2 = fetVar2.P();
            if (zI || objP2 == cl5Var) {
                objP2 = new zfv0(this, u950VarH, (byte) 13);
                fetVar2.o0(objP2);
            }
            m0x0.o(u950VarH, (Function1) objP2, fetVar2);
            jvv0 jvv0Var = this.b;
            pz40 pz40VarO = gkb.O(jvv0Var.c, ((gvv0) jvv0Var.f17222a.getValue()).c, null, fetVar2, 64, 14);
            Object objP3 = fetVar2.P();
            if (objP3 == cl5Var) {
                objP3 = new ejv0((byte) 15);
                fetVar2.o0(objP3);
            }
            Function1 function1N0 = mrv.n0(set, (Function1) objP3, fetVar2, i4 | 48, 0);
            boolean zG = fetVar2.g(function1N0);
            Object objP4 = fetVar2.P();
            if (zG || objP4 == cl5Var) {
                objP4 = new szu0(function1N0, (byte) 11);
                fetVar2.o0(objP4);
            }
            Function1 function1 = (Function1) objP4;
            Object objP5 = fetVar2.P();
            if (objP5 == cl5Var) {
                objP5 = new nwv0();
                fetVar2.o0(objP5);
            }
            nwv0 nwv0Var = (nwv0) objP5;
            kvv0 kvv0Var = (kvv0) pz40VarO.getValue();
            jvv0 jvv0Var2 = this.b;
            boolean zI2 = fetVar2.i(jvv0Var2);
            Object objP6 = fetVar2.P();
            if (zI2 || objP6 == cl5Var) {
                objP6 = new wzu0(1, jvv0Var2, jvv0.class, "ownerOf", "ownerOf$navigation(Lorg/xplatform/core/navigation/compose_nav/bottom_sheet/XBottomSheetRoute;)Lorg/xplatform/core/navigation/compose_nav/bottom_sheet/host/XBottomSheetOwnerToken;", 0, (byte) 16);
                fetVar2.o0(objP6);
            }
            Function1 function2 = (Function1) ((jhy) objP6);
            nwv0Var.getClass();
            function2.getClass();
            wzu0 wzu0Var = this.e;
            boolean zG2 = fetVar2.g(wzu0Var) | fetVar2.g(kvv0Var);
            Object objP7 = fetVar2.P();
            if (zG2 || objP7 == cl5Var) {
                objP7 = new owv0(nwv0Var, function2, kvv0Var, wzu0Var);
                fetVar2.o0(objP7);
            }
            owv0 owv0Var = (owv0) objP7;
            boolean zG3 = fetVar2.g(owv0Var);
            Object objP8 = fetVar2.P();
            if (zG3 || objP8 == cl5Var) {
                objP8 = q3d.j(owv0Var, new mjk(b));
                fetVar2.o0(objP8);
            }
            List list = (List) objP8;
            List listJ = q3d.j(u7x.G(fetVar2), a4n0.k(fetVar2));
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC0 = kbc.c0(fetVar2, jm40Var);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            boolean z2 = i5 == 256;
            Object objP9 = fetVar2.P();
            if (z2 || objP9 == cl5Var) {
                objP9 = new jmv0(this, (byte) 5);
                fetVar2.o0(objP9);
            }
            fetVar2 = fetVar;
            ufx.h(u950VarH, null, null, (Function0) objP9, listJ, list, null, null, null, null, function1, fetVar2, 0);
            fetVar2.e0(-980691344);
            ListIterator listIterator = nwv0Var.b.listIterator();
            while (true) {
                paw pawVar = (paw) listIterator;
                if (!pawVar.hasNext()) {
                    break;
                }
                ywv0 ywv0Var = (ywv0) ((hgk0) ((mwv0) pawVar.next()).f22524a).getValue();
                if (ywv0Var == null) {
                    fetVar2.e0(-1918099719);
                } else {
                    fetVar2.e0(-1918099718);
                    luv0.a(null, ywv0Var, fetVar2, 0);
                }
                fetVar2.r(false);
            }
            fetVar2.r(false);
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gdr0(this, mm40Var2, set, i);
        }
    }

    public final void b(rb50 rb50Var) {
        Object value;
        gvv0 gvv0VarA;
        yje yjeVar = null;
        jgc jgcVar = rb50Var instanceof jgc ? (jgc) rb50Var : null;
        byte b = 0;
        if (jgcVar != null) {
            fwv0 fwv0Var = this.f13603a;
            fwv0Var.getClass();
            tkz tkzVar = fwv0Var.f10280a;
            rwj rwjVar = tvk.f34603a;
            sac.V(tkzVar, null, null, ys10.f43147a.x(), new ewv0(fwv0Var, jgcVar, yjeVar, b), 11);
        }
        lwv0 lwv0Var = rb50Var instanceof lwv0 ? (lwv0) rb50Var : null;
        if (lwv0Var != null) {
            jvv0 jvv0Var = this.b;
            jvv0Var.getClass();
            p7m0 p7m0Var = jvv0Var.f17222a;
            do {
                value = p7m0Var.getValue();
                gvv0VarA = (gvv0) value;
                Map map = gvv0VarA.f11994a;
                kvv0 kvv0Var = gvv0VarA.c;
                kvv0 kvv0Var2 = (kvv0) map.get(lwv0Var);
                if (kvv0Var2 != null) {
                    Map mapG = xp20.g(gvv0VarA.f11994a, lwv0Var);
                    if (Intrinsics.d(kvv0Var, kvv0Var2) && !mapG.containsValue(kvv0Var2)) {
                        kvv0Var = null;
                    }
                    gvv0VarA = gvv0.a(gvv0VarA, mapG, null, kvv0Var, 2);
                }
            } while (!p7m0Var.m(value, gvv0VarA));
        }
    }

    public final void c(List list, lwv0 lwv0Var) {
        int iIndexOf = list.indexOf(lwv0Var);
        if (iIndexOf != -1) {
            b((rb50) list.remove(iIndexOf));
        }
    }
}

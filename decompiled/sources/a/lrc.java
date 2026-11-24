package a;

import android.content.res.Resources;
import android.gov.nist.core.Separators;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.onexdatabase.OnexDatabase;
import org.xplatform.uikit.components.phone_text_field.DsPhoneTextField;

/* JADX INFO: loaded from: classes5.dex */
public final class lrc implements k4r, zf60, giu0, zjj, n1x, kyn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f20524a;
    public final Object b;

    public lrc(rl1 rl1Var, std stdVar, q7d0 q7d0Var, ctf0 ctf0Var, gii0 gii0Var, ort ortVar, mne mneVar, duj dujVar, v88 v88Var, pru pruVar, btt0 btt0Var, o0j o0jVar, kc60 kc60Var, iqt iqtVar, m1e m1eVar, knf0 knf0Var, oeg0 oeg0Var, peg0 peg0Var, poq0 poq0Var, wsf0 wsf0Var, b4j b4jVar, je jeVar, r9u r9uVar) {
        this.f20524a = (byte) 19;
        q7d0Var.getClass();
        ctf0Var.getClass();
        gii0Var.getClass();
        btt0Var.getClass();
        o0jVar.getClass();
        m1eVar.getClass();
        knf0Var.getClass();
        oeg0Var.getClass();
        r9uVar.getClass();
        this.b = new mci(wsf0Var, rl1Var, q7d0Var, ctf0Var, gii0Var, mneVar, dujVar, pruVar, btt0Var, o0jVar, kc60Var, iqtVar, m1eVar, knf0Var, oeg0Var, peg0Var, b4jVar, jeVar);
    }

    public g4u A() {
        return new g4u(((mci) this.b).c());
    }

    /* JADX WARN: Code duplicated, block: B:24:0x007d  */
    /* JADX WARN: Code duplicated, block: B:56:0x016b  */
    /* JADX WARN: Code duplicated, block: B:58:0x0172  */
    /* JADX WARN: Code duplicated, block: B:59:0x0175  */
    public void B(mer merVar, StringBuilder sb) {
        String strP;
        boolean z;
        sb.getClass();
        iek iekVar = (iek) this.b;
        lek lekVar = iekVar.f14637a;
        if (!lekVar.A()) {
            if (!lekVar.z()) {
                List listW = merVar.W();
                listW.getClass();
                iekVar.t(sb, listW);
                iekVar.p(sb, merVar, null);
                tek visibility = merVar.getVisibility();
                visibility.getClass();
                iekVar.Y(visibility, sb);
                iekVar.D(merVar, sb);
                if (lekVar.t()) {
                    iekVar.B(merVar, sb);
                }
                iekVar.J(merVar, sb);
                if (lekVar.t()) {
                    boolean z2 = false;
                    if (merVar.isOperator()) {
                        Collection collectionK = merVar.k();
                        collectionK.getClass();
                        Collection collection = collectionK;
                        if (!collection.isEmpty()) {
                            Iterator it = collection.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (((mer) it.next()).isOperator()) {
                                        if (!lekVar.l()) {
                                            z = false;
                                        }
                                    }
                                }
                            }
                        }
                        z = true;
                    } else {
                        z = false;
                    }
                    if (merVar.isInfix()) {
                        Collection collectionK2 = merVar.k();
                        collectionK2.getClass();
                        Collection collection2 = collectionK2;
                        if (!collection2.isEmpty()) {
                            Iterator it2 = collection2.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    if (((mer) it2.next()).isInfix()) {
                                        if (!lekVar.l()) {
                                            break;
                                        } else {
                                            break;
                                        }
                                    }
                                }
                                z2 = true;
                                break;
                            }
                        }
                        z2 = true;
                        break;
                    }
                    iekVar.E(sb, merVar.w(), "tailrec");
                    iekVar.E(sb, merVar.isSuspend(), "suspend");
                    iekVar.E(sb, merVar.isInline(), "inline");
                    iekVar.E(sb, z2, "infix");
                    iekVar.E(sb, z, "operator");
                } else {
                    iekVar.E(sb, merVar.isSuspend(), "suspend");
                }
                iekVar.A(merVar, sb);
                if (lekVar.D()) {
                    if (merVar.b0()) {
                        sb.append("/*isHiddenToOvercomeSignatureClash*/ ");
                    }
                    if (merVar.e0()) {
                        sb.append("/*isHiddenForResolutionEverywhereBesideSupercalls*/ ");
                    }
                }
            }
            sb.append(iekVar.z("fun"));
            sb.append(Separators.SP);
            List typeParameters = merVar.getTypeParameters();
            typeParameters.getClass();
            iekVar.U(sb, typeParameters, true);
            iekVar.M(merVar, sb);
        }
        iekVar.G(merVar, sb, true);
        List listZ = merVar.z();
        listZ.getClass();
        iekVar.X(sb, listZ, merVar.P());
        iekVar.N(merVar, sb);
        wsy returnType = merVar.getReturnType();
        ov5 ov5Var = lekVar.l;
        iiy[] iiyVarArr = lek.Z;
        iiy iiyVar = iiyVarArr[10];
        ov5Var.getClass();
        iiyVar.getClass();
        if (!((Boolean) ov5Var.b).booleanValue()) {
            ov5 ov5Var2 = lekVar.k;
            iiy iiyVar2 = iiyVarArr[9];
            ov5Var2.getClass();
            iiyVar2.getClass();
            if (((Boolean) ov5Var2.b).booleanValue() || returnType == null) {
                sb.append(": ");
                if (returnType == null) {
                    strP = "[NULL]";
                } else {
                    strP = iekVar.P(returnType);
                }
                sb.append(strP);
            } else {
                g950 g950Var = ary.e;
                if (!ary.E(returnType, i4m0.d)) {
                    sb.append(": ");
                    if (returnType == null) {
                        strP = "[NULL]";
                    } else {
                        strP = iekVar.P(returnType);
                    }
                    sb.append(strP);
                }
            }
        }
        List typeParameters2 = merVar.getTypeParameters();
        typeParameters2.getClass();
        iekVar.Z(sb, typeParameters2);
    }

    public void C(b0d0 b0d0Var, StringBuilder sb, String str) {
        iek iekVar = (iek) this.b;
        int iOrdinal = iekVar.f14637a.w().ordinal();
        if (iOrdinal == 0) {
            iekVar.B(b0d0Var, sb);
            sb.append(str.concat(" for "));
            d0d0 d0d0VarP1 = b0d0Var.p1();
            d0d0VarP1.getClass();
            iekVar.L(d0d0VarP1, sb);
            return;
        }
        if (iOrdinal == 1) {
            B(b0d0Var, sb);
        } else {
            if (iOrdinal == 2) {
                return;
            }
            t9f.b();
        }
    }

    @Override // a.kyn
    public Object a(String str) throws GeneralSecurityException {
        String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 3; i++) {
            Provider provider = Security.getProvider(strArr[i]);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        Iterator it = arrayList.iterator();
        Exception exc = null;
        while (it.hasNext()) {
            try {
                return ((tyn) this.b).c(str, (Provider) it.next());
            } catch (Exception e) {
                if (exc == null) {
                    exc = e;
                }
            }
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }

    public void b() {
        ((nld) this.b).getClass();
    }

    @Override // a.giu0
    public diu0 c(Object obj) {
        byte b = this.f20524a;
        Object obj2 = this.b;
        switch (b) {
            case 15:
                pfi pfiVar = (pfi) ((c7i) obj2).c;
                return new wm70((i1w0) obj, pfiVar.f26907a.u0(), pfiVar.f26907a.f0(), pfiVar.f26907a.v1(), (fpi0) pfiVar.m.get(), (fq) pfiVar.x.get(), (dqx) pfiVar.s0.get(), (itt) pfiVar.u.get(), (qni0) pfiVar.d0.get(), (l1u) pfiVar.t0.get(), (lg60) pfiVar.e0.get(), (qa60) pfiVar.F.get(), (ppb) pfiVar.u0.get(), (i5m0) pfiVar.f0.get(), (lzt) pfiVar.f.get(), (xcc) pfiVar.U.get(), (ztt) pfiVar.k.get(), (d3c) pfiVar.e.get(), (xyb) pfiVar.h.get(), (oqt) pfiVar.p.get(), (y5s) pfiVar.T.get(), (t0u) pfiVar.X.get());
            case 16:
                c7i c7iVar = (c7i) obj2;
                lki lkiVar = (lki) c7iVar.c;
                v88 v88VarU0 = lkiVar.f20204a.u0();
                wsf0 wsf0VarF0 = lkiVar.f20204a.f0();
                mne mneVarV1 = lkiVar.f20204a.v1();
                fpi0 fpi0Var = (fpi0) lkiVar.m.get();
                fq fqVar = (fq) lkiVar.x.get();
                r8i r8iVar = (r8i) c7iVar.d;
                return new wm70((i1w0) obj, v88VarU0, wsf0VarF0, mneVarV1, fpi0Var, fqVar, (dqx) ((n5d0) r8iVar.g).get(), (itt) lkiVar.u.get(), (qni0) lkiVar.d0.get(), (l1u) ((n5d0) r8iVar.l).get(), (lg60) lkiVar.e0.get(), (qa60) lkiVar.F.get(), (ppb) ((n5d0) r8iVar.m).get(), (i5m0) lkiVar.f0.get(), (lzt) lkiVar.f.get(), (xcc) lkiVar.U.get(), (ztt) lkiVar.k.get(), (d3c) lkiVar.e.get(), (xyb) lkiVar.h.get(), (oqt) lkiVar.p.get(), (y5s) lkiVar.T.get(), (t0u) lkiVar.X.get());
            default:
                kui kuiVar = (kui) ((c7i) obj2).c;
                qa60 qa60Var = (qa60) kuiVar.F.get();
                xcc xccVar = (xcc) kuiVar.U.get();
                return new gh70((fq) kuiVar.x.get(), xccVar, kuiVar.f18911a.v1(), (lzt) kuiVar.f.get(), qa60Var, (i1w0) obj);
        }
    }

    @Override // a.zjj
    public Object d(wm40 wm40Var, Object obj) {
        flc flcVarM0;
        String str;
        StringBuilder sb = (StringBuilder) obj;
        sb.getClass();
        iek iekVar = (iek) this.b;
        lek lekVar = iekVar.f14637a;
        byte b = 1;
        boolean z = wm40Var.r() == slc.d;
        if (!lekVar.A()) {
            List listP = wm40Var.p();
            listP.getClass();
            iekVar.t(sb, listP);
            iekVar.p(sb, wm40Var, null);
            if (!z) {
                tek visibility = wm40Var.getVisibility();
                visibility.getClass();
                iekVar.Y(visibility, sb);
            }
            if ((wm40Var.r() != slc.b || wm40Var.m() != gm40.e) && (!wm40Var.r().a() || wm40Var.m() != gm40.b)) {
                gm40 gm40VarM = wm40Var.m();
                gm40VarM.getClass();
                iekVar.C(gm40VarM, sb, iek.m(wm40Var));
            }
            iekVar.B(wm40Var, sb);
            iekVar.E(sb, lekVar.u().contains(jek.INNER) && wm40Var.i(), "inner");
            iekVar.E(sb, lekVar.u().contains(jek.DATA) && wm40Var.p0(), RemoteMessageConst.DATA);
            iekVar.E(sb, lekVar.u().contains(jek.INLINE) && wm40Var.isInline(), "inline");
            iekVar.E(sb, lekVar.u().contains(jek.VALUE) && wm40Var.r0(), "value");
            iekVar.E(sb, lekVar.u().contains(jek.FUN) && wm40Var.q0(), "fun");
            if (wm40Var.o0()) {
                str = "companion object";
            } else {
                int iOrdinal = wm40Var.r().ordinal();
                if (iOrdinal == 0) {
                    str = "class";
                } else if (iOrdinal == 1) {
                    str = "interface";
                } else if (iOrdinal == 2) {
                    str = "enum class";
                } else if (iOrdinal == 3) {
                    str = "enum entry";
                } else if (iOrdinal == 4) {
                    str = "annotation class";
                } else {
                    if (iOrdinal != 5) {
                        t9f.b();
                        return null;
                    }
                    str = "object";
                }
            }
            sb.append(iekVar.z(str));
        }
        if (oek.l(wm40Var)) {
            ov5 ov5Var = lekVar.G;
            iiy iiyVar = lek.Z[31];
            ov5Var.getClass();
            iiyVar.getClass();
            if (((Boolean) ov5Var.b).booleanValue()) {
                if (lekVar.A()) {
                    sb.append("companion object");
                }
                iek.O(sb);
                vjj vjjVarJ = wm40Var.j();
                if (vjjVarJ != null) {
                    sb.append("of ");
                    g950 name = vjjVarJ.getName();
                    name.getClass();
                    sb.append(iekVar.F(name, false));
                }
            }
            if (lekVar.D() || !Intrinsics.d(wm40Var.getName(), lxk0.b)) {
                if (!lekVar.A()) {
                    iek.O(sb);
                }
                g950 name2 = wm40Var.getName();
                name2.getClass();
                sb.append(iekVar.F(name2, true));
            }
        } else {
            if (!lekVar.A()) {
                iek.O(sb);
            }
            iekVar.G(wm40Var, sb, true);
        }
        if (!z) {
            List listM = wm40Var.M();
            listM.getClass();
            iekVar.U(sb, listM, false);
            iekVar.r(wm40Var, sb);
            if (!wm40Var.r().a()) {
                ov5 ov5Var2 = lekVar.i;
                iiy iiyVar2 = lek.Z[7];
                ov5Var2.getClass();
                iiyVar2.getClass();
                if (((Boolean) ov5Var2.b).booleanValue() && (flcVarM0 = wm40Var.m0()) != null) {
                    sb.append(Separators.SP);
                    iekVar.p(sb, flcVarM0, null);
                    tek visibility2 = flcVarM0.getVisibility();
                    visibility2.getClass();
                    iekVar.Y(visibility2, sb);
                    sb.append(iekVar.z("constructor"));
                    List listZ = flcVarM0.z();
                    listZ.getClass();
                    iekVar.X(sb, listZ, flcVarM0.P());
                }
            }
            ov5 ov5Var3 = lekVar.x;
            iiy iiyVar3 = lek.Z[22];
            ov5Var3.getClass();
            iiyVar3.getClass();
            if (!((Boolean) ov5Var3.b).booleanValue() && !ary.F(wm40Var.I())) {
                Collection collectionB = wm40Var.h().b();
                collectionB.getClass();
                if (!collectionB.isEmpty() && (collectionB.size() != 1 || !ary.y((wsy) collectionB.iterator().next()))) {
                    iek.O(sb);
                    sb.append(": ");
                    CollectionsKt.a0(collectionB, sb, ", ", null, null, new hek(iekVar, b), 60);
                }
            }
            iekVar.Z(sb, listM);
        }
        return Unit.f46060a;
    }

    @Override // a.zjj
    public Object e(t5 t5Var, Object obj) {
        StringBuilder sb = (StringBuilder) obj;
        sb.getClass();
        ((iek) this.b).S(t5Var, sb, true);
        return Unit.f46060a;
    }

    @Override // a.zjj
    public Object f(f0d0 f0d0Var, Object obj) {
        StringBuilder sb = (StringBuilder) obj;
        sb.getClass();
        ((iek) this.b).L(f0d0Var, sb);
        return Unit.f46060a;
    }

    @Override // a.zjj
    public Object g(ng80 ng80Var, Object obj) {
        StringBuilder sb = (StringBuilder) obj;
        sb.getClass();
        iek iekVar = (iek) this.b;
        iekVar.getClass();
        swq swqVar = ng80Var.f;
        sb.append(iekVar.z("package-fragment"));
        twq twqVar = swqVar.f32934a;
        twqVar.getClass();
        String strL = iekVar.l(xdx.C(twq.f(twqVar)));
        if (strL.length() > 0) {
            sb.append(Separators.SP);
            sb.append(strL);
        }
        if (iekVar.f14637a.p()) {
            sb.append(" in ");
            iekVar.G(ng80Var.j(), sb, false);
        }
        return Unit.f46060a;
    }

    @Override // a.n1x
    public void h(o1x o1xVar, hhn0 hhn0Var) {
        dyw dywVar = hhn0Var.f13073a;
        DsPhoneTextField dsPhoneTextField = (DsPhoneTextField) this.b;
        Resources resources = dsPhoneTextField.getContext().getResources();
        resources.getClass();
        dsPhoneTextField.setCodeStartIcon(c3x.q(dywVar, resources));
        dsPhoneTextField.setCodeStartIconTintList(null);
        dsPhoneTextField.e = null;
    }

    @Override // a.k4r
    public void i(Bundle bundle, String str) {
        i5e i5eVar = (i5e) this.b;
        str.getClass();
        Object obj = ((j0g0) ahy.f0(bundle, m2a.class.getName())).f15681a;
        if (obj instanceof g0g0) {
            kud kudVar = i5e.q2;
            i5eVar.c1();
            i5eVar.x0();
            return;
        }
        try {
            z1x.P(obj);
            l2a l2aVar = (l2a) obj;
            if (l2aVar.f19297a.length() == 0) {
                return;
            }
            Uri uri = Uri.parse(l2aVar.f19297a);
            uri.getClass();
            kud kudVar2 = i5e.q2;
            i5eVar.Y0(uri);
        } catch (Exception unused) {
            kud kudVar3 = i5e.q2;
            i5eVar.c1();
            i5eVar.x0();
        }
    }

    @Override // a.zjj
    public /* bridge */ /* synthetic */ Object j(mer merVar, Object obj) {
        B(merVar, (StringBuilder) obj);
        return Unit.f46060a;
    }

    @Override // a.zf60
    public xiv0 l(View view, xiv0 xiv0Var) {
        uiv0 uiv0Var = xiv0Var.f40966a;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.b;
        if (!Objects.equals(coordinatorLayout.n, xiv0Var)) {
            coordinatorLayout.n = xiv0Var;
            boolean z = xiv0Var.d() > 0;
            coordinatorLayout.o = z;
            coordinatorLayout.setWillNotDraw(!z && coordinatorLayout.getBackground() == null);
            if (!uiv0Var.s()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    WeakHashMap weakHashMap = rgu0.f30456a;
                    if (childAt.getFitsSystemWindows() && ((ble) childAt.getLayoutParams()).f2790a != null && uiv0Var.s()) {
                        break;
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return xiv0Var;
    }

    @Override // a.zjj
    public Object m(c8z c8zVar, Object obj) {
        StringBuilder sb = (StringBuilder) obj;
        sb.getClass();
        sb.append(c8zVar.getName());
        return Unit.f46060a;
    }

    @Override // a.zjj
    public Object n(tfk tfkVar, Object obj) {
        StringBuilder sb = (StringBuilder) obj;
        sb.getClass();
        iek iekVar = (iek) this.b;
        iekVar.getClass();
        iekVar.p(sb, tfkVar, null);
        tek tekVar = tfkVar.g;
        tekVar.getClass();
        iekVar.Y(tekVar, sb);
        iekVar.B(tfkVar, sb);
        sb.append(iekVar.z("typealias"));
        sb.append(Separators.SP);
        iekVar.G(tfkVar, sb, true);
        iekVar.U(sb, tfkVar.M(), false);
        iekVar.r(tfkVar, sb);
        sb.append(" = ");
        sb.append(iekVar.P(tfkVar.r1()));
        return Unit.f46060a;
    }

    @Override // a.zjj
    public Object o(zm40 zm40Var, Object obj) {
        StringBuilder sb = (StringBuilder) obj;
        sb.getClass();
        ((iek) this.b).G(zm40Var, sb, true);
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0037  */
    @Override // a.zjj
    public Object p(flc flcVar, Object obj) {
        boolean z;
        flc flcVarM0;
        boolean z2 = flcVar.f1;
        StringBuilder sb = (StringBuilder) obj;
        sb.getClass();
        iek iekVar = (iek) this.b;
        iekVar.getClass();
        iekVar.p(sb, flcVar, null);
        lek lekVar = iekVar.f14637a;
        if (lekVar.x() || flcVar.z1().m() != gm40.c) {
            tek visibility = flcVar.getVisibility();
            visibility.getClass();
            if (iekVar.Y(visibility, sb)) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        iekVar.A(flcVar, sb);
        ov5 ov5Var = lekVar.P;
        iiy[] iiyVarArr = lek.Z;
        iiy iiyVar = iiyVarArr[40];
        ov5Var.getClass();
        iiyVar.getClass();
        boolean z3 = ((Boolean) ov5Var.b).booleanValue() || !z2 || z;
        if (z3) {
            sb.append(iekVar.z("constructor"));
        }
        wm40 wm40VarJ = flcVar.j();
        wm40VarJ.getClass();
        if (lekVar.y()) {
            if (z3) {
                sb.append(Separators.SP);
            }
            iekVar.G(wm40VarJ, sb, true);
            iekVar.U(sb, flcVar.getTypeParameters(), false);
        }
        List listZ = flcVar.z();
        listZ.getClass();
        iekVar.X(sb, listZ, flcVar.P());
        ov5 ov5Var2 = lekVar.q;
        iiy iiyVar2 = iiyVarArr[15];
        ov5Var2.getClass();
        iiyVar2.getClass();
        if (((Boolean) ov5Var2.b).booleanValue() && !z2 && (flcVarM0 = wm40VarJ.m0()) != null) {
            List listZ2 = flcVarM0.z();
            ArrayList arrayListU = twn.u(listZ2);
            for (Object obj2 : listZ2) {
                k3u0 k3u0Var = (k3u0) obj2;
                if (!k3u0Var.q1() && k3u0Var.k == null) {
                    arrayListU.add(obj2);
                }
            }
            if (!arrayListU.isEmpty()) {
                sb.append(" : ");
                sb.append(iekVar.z("this"));
                sb.append(CollectionsKt.b0(arrayListU, ", ", Separators.LPAREN, Separators.RPAREN, ske.o, 24));
            }
        }
        if (lekVar.y()) {
            iekVar.Z(sb, flcVar.getTypeParameters());
        }
        return Unit.f46060a;
    }

    @Override // a.zjj
    public Object q(k3u0 k3u0Var, Object obj) {
        StringBuilder sb = (StringBuilder) obj;
        sb.getClass();
        ((iek) this.b).W(k3u0Var, true, sb, true);
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object r(long j, zje zjeVar) {
        nvf nvfVar;
        if (zjeVar instanceof nvf) {
            nvfVar = (nvf) zjeVar;
            int i = nvfVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                nvfVar.k = i - Integer.MIN_VALUE;
            } else {
                nvfVar = new nvf(this, zjeVar);
            }
        } else {
            nvfVar = new nvf(this, zjeVar);
        }
        Object objW0 = nvfVar.i;
        wne wneVar = wne.f39444a;
        int i2 = nvfVar.k;
        yje yjeVar = null;
        if (i2 == 0) {
            z1x.P(objW0);
            ruf rufVar = (ruf) this.b;
            nvfVar.k = 1;
            objW0 = sj3.w0(nvfVar, rufVar.f31125a, new hu6(j, yjeVar, (byte) 4), true, false);
            if (objW0 == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objW0);
        }
        return new Double(((tuf) objW0).i);
    }

    @Override // a.zjj
    public Object s(g0d0 g0d0Var, Object obj) {
        StringBuilder sb = (StringBuilder) obj;
        sb.getClass();
        C(g0d0Var, sb, "getter");
        return Unit.f46060a;
    }

    @Override // a.zjj
    public Object t(n0d0 n0d0Var, Object obj) {
        StringBuilder sb = (StringBuilder) obj;
        sb.getClass();
        C(n0d0Var, sb, "setter");
        return Unit.f46060a;
    }

    @Override // a.zjj
    public Object u(gdz gdzVar, Object obj) {
        StringBuilder sb = (StringBuilder) obj;
        sb.getClass();
        iek iekVar = (iek) this.b;
        iekVar.getClass();
        swq swqVar = gdzVar.e;
        sb.append(iekVar.z("package"));
        twq twqVar = swqVar.f32934a;
        twqVar.getClass();
        String strL = iekVar.l(xdx.C(twq.f(twqVar)));
        if (strL.length() > 0) {
            sb.append(Separators.SP);
            sb.append(strL);
        }
        if (iekVar.f14637a.p()) {
            sb.append(" in context of ");
            iekVar.G(gdzVar.d, sb, false);
        }
        return Unit.f46060a;
    }

    public g4u v() {
        return new g4u(((mci) this.b).c());
    }

    public nmt w() {
        return new nmt(((mci) this.b).c());
    }

    public rpt x() {
        return new rpt(((mci) this.b).c());
    }

    public void y(List list) {
        list.getClass();
        cih cihVar = ((dih) this.b).f6138a;
        q7d0 q7d0Var = cihVar.f4414a;
        Set<String> set = xun.f41520a;
        q7d0Var.getClass();
        set.getClass();
        Set<String> stringSet = q7d0Var.a().getStringSet("CYBER_PROMO_IDS", set);
        if (stringSet != null) {
            set = stringSet;
        }
        LinkedHashSet linkedHashSetO0 = CollectionsKt.O0(set);
        linkedHashSetO0.addAll(list);
        q7d0 q7d0Var2 = cihVar.f4414a;
        q7d0Var2.getClass();
        q7d0Var2.a().edit().putStringSet("CYBER_PROMO_IDS", linkedHashSetO0).apply();
    }

    public void z(boolean z) {
        m8l0 m8l0Var = (m8l0) ((lef0) this.b).f19899a;
        if (z) {
            m8l0Var.c.o(null, ygq0.NOT);
        } else {
            m8l0Var.b.o(null, ygq0.NOT);
        }
    }

    @Override // a.n1x
    public void k(o1x o1xVar, r1o r1oVar) {
    }

    public /* synthetic */ lrc(Object obj, byte b) {
        this.f20524a = b;
        this.b = obj;
    }

    public lrc(rrc rrcVar) {
        this.f20524a = (byte) 11;
        this.b = ((OnexDatabase) rrcVar.b).l();
    }

    public lrc(iqp0 iqp0Var) {
        this.f20524a = (byte) 3;
        iqp0Var.getClass();
        this.b = iqp0Var;
    }

    public lrc(qi10 qi10Var) {
        this.f20524a = (byte) 5;
        qi10Var.getClass();
        this.b = qi10Var;
    }

    public lrc(azj0 azj0Var) {
        this.f20524a = (byte) 26;
        azj0Var.getClass();
        this.b = azj0Var;
    }

    public lrc(jnn jnnVar) {
        this.f20524a = (byte) 28;
        jnnVar.getClass();
        this.b = jnnVar;
    }

    public lrc(gii0 gii0Var) {
        this.f20524a = (byte) 25;
        gii0Var.getClass();
        this.b = new sza(gii0Var, (byte) 28);
    }

    public lrc(h0f h0fVar) {
        this.f20524a = (byte) 9;
        h0fVar.getClass();
        this.b = h0fVar;
    }

    public lrc(m2a m2aVar, i5e i5eVar) {
        this.f20524a = (byte) 7;
        this.b = i5eVar;
    }

    public lrc() {
        this.f20524a = (byte) 14;
        this.b = new HashSet();
    }
}

package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class iek implements kek {
    public static final iek c;
    public static final iek d;
    public static final iek e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lek f14637a;
    public final n0o0 b = maz.b(new v9k(this, 9));

    static {
        lek lekVar = new lek();
        lekVar.f(xun.f41520a);
        lekVar.f19907a = true;
        new iek(lekVar);
        lek lekVar2 = new lek();
        lekVar2.b(false);
        lekVar2.f19907a = true;
        new iek(lekVar2);
        lek lekVar3 = new lek();
        lekVar3.b(false);
        lekVar3.f(xun.f41520a);
        lekVar3.f19907a = true;
        new iek(lekVar3);
        lek lekVar4 = new lek();
        lekVar4.b(false);
        lekVar4.f(xun.f41520a);
        lekVar4.c(true);
        lekVar4.f19907a = true;
        new iek(lekVar4);
        lek lekVar5 = new lek();
        lekVar5.f(xun.f41520a);
        hoc hocVar = hoc.c;
        lekVar5.g(hocVar);
        lekVar5.h(ro80.b);
        lekVar5.f19907a = true;
        new iek(lekVar5);
        lek lekVar6 = new lek();
        lekVar6.b(false);
        lekVar6.f(xun.f41520a);
        lekVar6.g(hocVar);
        lekVar6.k(true);
        lekVar6.h(ro80.c);
        lekVar6.d(true);
        lekVar6.j(true);
        lekVar6.c(true);
        lekVar6.a(true);
        lekVar6.f19907a = true;
        new iek(lekVar6);
        lek lekVar7 = new lek();
        lekVar7.f(jek.b);
        lekVar7.f19907a = true;
        c = new iek(lekVar7);
        lek lekVar8 = new lek();
        lekVar8.f(jek.c);
        lekVar8.f19907a = true;
        new iek(lekVar8);
        lek lekVar9 = new lek();
        lekVar9.g(hocVar);
        lekVar9.h(ro80.b);
        lekVar9.f19907a = true;
        d = new iek(lekVar9);
        lek lekVar10 = new lek();
        lekVar10.i(true);
        lekVar10.g(hoc.b);
        lekVar10.f(jek.c);
        lekVar10.f19907a = true;
        e = new iek(lekVar10);
        lek lekVar11 = new lek();
        lekVar11.e(xjf0.b);
        lekVar11.f(jek.c);
        lekVar11.f19907a = true;
        new iek(lekVar11);
    }

    public iek(lek lekVar) {
        this.f14637a = lekVar;
    }

    public static void O(StringBuilder sb) {
        int length = sb.length();
        if (length == 0 || sb.charAt(length - 1) != ' ') {
            sb.append(' ');
        }
    }

    public static boolean a0(wsy wsyVar) {
        if (!bfb.X(wsyVar)) {
            return false;
        }
        List listJ = wsyVar.J();
        if (listJ != null && listJ.isEmpty()) {
            return true;
        }
        Iterator it = listJ.iterator();
        while (it.hasNext()) {
            if (((pzs0) it.next()).c()) {
                return false;
            }
        }
        return true;
    }

    public static gm40 m(sq30 sq30Var) {
        if (sq30Var instanceof wm40) {
            return ((wm40) sq30Var).r() == slc.b ? gm40.e : gm40.b;
        }
        vjj vjjVarJ = sq30Var.j();
        wm40 wm40Var = vjjVarJ instanceof wm40 ? (wm40) vjjVarJ : null;
        if (wm40Var == null) {
            return gm40.b;
        }
        if (!(sq30Var instanceof mp9)) {
            return gm40.b;
        }
        mp9 mp9Var = (mp9) sq30Var;
        Collection collectionK = mp9Var.k();
        collectionK.getClass();
        if (!collectionK.isEmpty() && wm40Var.m() != gm40.b) {
            return gm40.d;
        }
        if (wm40Var.r() != slc.b || Intrinsics.d(mp9Var.getVisibility(), uek.f35533a)) {
            return gm40.b;
        }
        gm40 gm40VarM = mp9Var.m();
        gm40 gm40Var = gm40.e;
        return gm40VarM == gm40Var ? gm40Var : gm40.d;
    }

    public final void A(mp9 mp9Var, StringBuilder sb) {
        String str;
        lek lekVar = this.f14637a;
        if (lekVar.u().contains(jek.MEMBER_KIND) && lekVar.D() && mp9Var.l() != 1) {
            sb.append("/*");
            int iL = mp9Var.l();
            if (iL == 1) {
                str = "DECLARATION";
            } else if (iL == 2) {
                str = "FAKE_OVERRIDE";
            } else if (iL == 3) {
                str = "DELEGATION";
            } else {
                if (iL != 4) {
                    throw null;
                }
                str = "SYNTHESIZED";
            }
            sb.append(zgc.S(str));
            sb.append("*/ ");
        }
    }

    public final void B(sq30 sq30Var, StringBuilder sb) {
        E(sb, sq30Var.isExternal(), "external");
        lek lekVar = this.f14637a;
        boolean z = false;
        E(sb, lekVar.u().contains(jek.EXPECT) && sq30Var.Q(), "expect");
        if (lekVar.u().contains(jek.ACTUAL) && sq30Var.L()) {
            z = true;
        }
        E(sb, z, "actual");
    }

    public final void C(gm40 gm40Var, StringBuilder sb, gm40 gm40Var2) {
        lek lekVar = this.f14637a;
        ov5 ov5Var = lekVar.p;
        iiy iiyVar = lek.Z[14];
        ov5Var.getClass();
        iiyVar.getClass();
        if (((Boolean) ov5Var.b).booleanValue() || gm40Var != gm40Var2) {
            E(sb, lekVar.u().contains(jek.MODALITY), zgc.S(gm40Var.name()));
        }
    }

    public final void D(mp9 mp9Var, StringBuilder sb) {
        if (oek.r(mp9Var) && mp9Var.m() == gm40.b) {
            return;
        }
        if (this.f14637a.v() == qf80.f28619a && mp9Var.m() == gm40.d && !mp9Var.k().isEmpty()) {
            return;
        }
        gm40 gm40VarM = mp9Var.m();
        gm40VarM.getClass();
        C(gm40VarM, sb, m(mp9Var));
    }

    public final void E(StringBuilder sb, boolean z, String str) {
        if (z) {
            sb.append(z(str));
            sb.append(Separators.SP);
        }
    }

    public final String F(g950 g950Var, boolean z) {
        g950Var.getClass();
        String strL = l(xdx.A(g950Var));
        lek lekVar = this.f14637a;
        return (lekVar.n() && lekVar.B() == xjf0.b && z) ? kng0.l("<b>", strL, "</b>") : strL;
    }

    public final void G(vjj vjjVar, StringBuilder sb, boolean z) {
        g950 name = vjjVar.getName();
        name.getClass();
        sb.append(F(name, z));
    }

    public final void H(StringBuilder sb, wsy wsyVar) {
        tft0 tft0VarJ0 = wsyVar.j0();
        p pVar = tft0VarJ0 instanceof p ? (p) tft0VarJ0 : null;
        if (pVar == null) {
            I(sb, wsyVar);
            return;
        }
        kzj0 kzj0Var = pVar.c;
        kzj0 kzj0Var2 = pVar.b;
        lek lekVar = this.f14637a;
        ov5 ov5Var = lekVar.R;
        iiy[] iiyVarArr = lek.Z;
        iiy iiyVar = iiyVarArr[42];
        ov5Var.getClass();
        iiyVar.getClass();
        if (((Boolean) ov5Var.b).booleanValue()) {
            I(sb, kzj0Var2);
            ov5 ov5Var2 = lekVar.S;
            iiy iiyVar2 = iiyVarArr[43];
            ov5Var2.getClass();
            iiyVar2.getClass();
            if (((Boolean) ov5Var2.b).booleanValue()) {
                xjf0 xjf0VarB = lekVar.B();
                vjf0 vjf0Var = xjf0.b;
                if (xjf0VarB == vjf0Var) {
                    sb.append("<font color=\"808080\"><i>");
                }
                sb.append(" /* ");
                sb.append("from: ");
                I(sb, kzj0Var);
                sb.append(" */");
                if (lekVar.B() == vjf0Var) {
                    sb.append("</i></font>");
                    return;
                }
                return;
            }
            return;
        }
        I(sb, kzj0Var);
        ov5 ov5Var3 = lekVar.Q;
        iiy iiyVar3 = iiyVarArr[41];
        ov5Var3.getClass();
        iiyVar3.getClass();
        if (((Boolean) ov5Var3.b).booleanValue()) {
            xjf0 xjf0VarB2 = lekVar.B();
            vjf0 vjf0Var2 = xjf0.b;
            if (xjf0VarB2 == vjf0Var2) {
                sb.append("<font color=\"808080\"><i>");
            }
            sb.append(" /* ");
            sb.append("= ");
            I(sb, kzj0Var2);
            sb.append(" */");
            if (lekVar.B() == vjf0Var2) {
                sb.append("</i></font>");
            }
        }
    }

    public final void I(StringBuilder sb, wsy wsyVar) {
        g950 g950VarO;
        String strL;
        lek lekVar = this.f14637a;
        if ((wsyVar instanceof zez) && lekVar.p()) {
            cu00 cu00Var = ((zez) wsyVar).d;
            if (cu00Var.c == du00.f6678a || cu00Var.c == du00.b) {
                sb.append("<Not computed yet>");
                return;
            }
        }
        tft0 tft0VarJ0 = wsyVar.j0();
        if (tft0VarJ0 instanceof kkq) {
            sb.append(((kkq) tft0VarJ0).o0(this, this));
            return;
        }
        if (!(tft0VarJ0 instanceof kzj0)) {
            t9f.b();
            return;
        }
        kzj0 kzj0Var = (kzj0) tft0VarJ0;
        if (kzj0Var.equals(e0t0.b) || kzj0Var.S() == e0t0.f7005a.b) {
            sb.append("???");
            return;
        }
        iys0 iys0VarS = kzj0Var.S();
        byte b = 0;
        if ((iys0VarS instanceof b2o) && ((b2o) iys0VarS).f1862a == c2o.j) {
            ov5 ov5Var = lekVar.t;
            iiy iiyVar = lek.Z[18];
            ov5Var.getClass();
            iiyVar.getClass();
            if (!((Boolean) ov5Var.b).booleanValue()) {
                sb.append("???");
                return;
            }
            iys0 iys0VarS2 = kzj0Var.S();
            iys0VarS2.getClass();
            sb.append(v(((b2o) iys0VarS2).b[0]));
            return;
        }
        if (bdx.k0(kzj0Var)) {
            u(sb, kzj0Var);
            return;
        }
        if (!a0(kzj0Var)) {
            u(sb, kzj0Var);
            return;
        }
        int length = sb.length();
        ((iek) this.b.getValue()).p(sb, kzj0Var, null);
        boolean z = sb.length() != length;
        wsy wsyVarV = bfb.V(kzj0Var);
        List listQ = bfb.Q(kzj0Var);
        boolean zY = bfb.Y(kzj0Var);
        boolean zU = kzj0Var.U();
        boolean z2 = zU || (z && wsyVarV != null);
        if (z2) {
            if (zY) {
                sb.insert(length, '(');
            } else {
                if (z) {
                    CharsKt.d(ttm0.J(sb));
                    if (sb.charAt(sb.length() - 2) != ')') {
                        sb.insert(sb.length() - 1, "()");
                    }
                }
                sb.append(Separators.LPAREN);
            }
        }
        E(sb, zY, "suspend");
        if (!listQ.isEmpty()) {
            sb.append("context(");
            Iterator it = listQ.subList(0, listQ.size() - 1).iterator();
            while (it.hasNext()) {
                H(sb, (wsy) it.next());
                sb.append(", ");
            }
            H(sb, (wsy) CollectionsKt.d0(listQ));
            sb.append(") ");
        }
        if (wsyVarV != null) {
            boolean z3 = (a0(wsyVarV) && !wsyVarV.U()) || bfb.Y(wsyVarV) || !wsyVarV.getAnnotations().isEmpty() || (wsyVarV instanceof szj);
            if (z3) {
                sb.append(Separators.LPAREN);
            }
            H(sb, wsyVarV);
            if (z3) {
                sb.append(Separators.RPAREN);
            }
            sb.append(Separators.DOT);
        }
        sb.append(Separators.LPAREN);
        if (!bfb.X(kzj0Var) || kzj0Var.getAnnotations().O0(i4m0.p) == null || kzj0Var.J().size() > 1) {
            int i = 0;
            for (pzs0 pzs0Var : bfb.W(kzj0Var)) {
                int i2 = i + 1;
                if (i > 0) {
                    sb.append(", ");
                }
                ov5 ov5Var2 = lekVar.U;
                iiy iiyVar2 = lek.Z[45];
                ov5Var2.getClass();
                iiyVar2.getClass();
                if (((Boolean) ov5Var2.b).booleanValue()) {
                    wsy wsyVarB = pzs0Var.b();
                    wsyVarB.getClass();
                    g950VarO = bfb.O(wsyVarB);
                } else {
                    g950VarO = null;
                }
                if (g950VarO != null) {
                    sb.append(F(g950VarO, false));
                    sb.append(": ");
                }
                pzs0Var.getClass();
                StringBuilder sb2 = new StringBuilder();
                CollectionsKt.a0(kotlin.collections.a.c(pzs0Var), sb2, ", ", null, null, new hek(this, b), 60);
                sb.append(sb2.toString());
                i = i2;
            }
        } else {
            sb.append("???");
        }
        sb.append(") ");
        int iOrdinal = lekVar.B().ordinal();
        if (iOrdinal == 0) {
            strL = l("->");
        } else {
            if (iOrdinal != 1) {
                t9f.b();
                return;
            }
            strL = "&rarr;";
        }
        sb.append(strL);
        sb.append(Separators.SP);
        bfb.X(kzj0Var);
        wsy wsyVarB2 = ((pzs0) CollectionsKt.d0(kzj0Var.J())).b();
        wsyVarB2.getClass();
        H(sb, wsyVarB2);
        if (z2) {
            sb.append(Separators.RPAREN);
        }
        if (zU) {
            sb.append(Separators.QUESTION);
        }
    }

    public final void J(mp9 mp9Var, StringBuilder sb) {
        lek lekVar = this.f14637a;
        if (!lekVar.u().contains(jek.OVERRIDE) || mp9Var.k().isEmpty() || lekVar.v() == qf80.b) {
            return;
        }
        E(sb, true, "override");
        if (lekVar.D()) {
            sb.append("/*");
            sb.append(mp9Var.k().size());
            sb.append("*/ ");
        }
    }

    public final void K(StringBuilder sb, ouu ouuVar) {
        ouu ouuVar2 = (ouu) ouuVar.d;
        goc gocVar = (goc) ouuVar.b;
        if (ouuVar2 != null) {
            K(sb, ouuVar2);
            sb.append('.');
            g950 name = gocVar.getName();
            name.getClass();
            sb.append(F(name, false));
        } else {
            iys0 iys0VarH = gocVar.h();
            iys0VarH.getClass();
            sb.append(R(iys0VarH));
        }
        sb.append(Q((List) ouuVar.c));
    }

    public final void L(d0d0 d0d0Var, StringBuilder sb) {
        lek lekVar = this.f14637a;
        if (!lekVar.A()) {
            if (!lekVar.z()) {
                List listW = d0d0Var.W();
                listW.getClass();
                t(sb, listW);
                if (lekVar.u().contains(jek.ANNOTATIONS)) {
                    p(sb, d0d0Var, null);
                    tqp tqpVarV = d0d0Var.V();
                    if (tqpVarV != null) {
                        p(sb, tqpVarV, b93.FIELD);
                    }
                    tqp tqpVarG = d0d0Var.G();
                    if (tqpVarG != null) {
                        p(sb, tqpVarG, b93.PROPERTY_DELEGATE_FIELD);
                    }
                    if (lekVar.w() == c0d0.b) {
                        g0d0 g0d0VarD = d0d0Var.d();
                        if (g0d0VarD != null) {
                            p(sb, g0d0VarD, b93.PROPERTY_GETTER);
                        }
                        n0d0 n0d0VarE = d0d0Var.e();
                        if (n0d0VarE != null) {
                            p(sb, n0d0VarE, b93.PROPERTY_SETTER);
                            List listZ = n0d0VarE.z();
                            listZ.getClass();
                            k3u0 k3u0Var = (k3u0) CollectionsKt.v0(listZ);
                            k3u0Var.getClass();
                            p(sb, k3u0Var, b93.SETTER_PARAMETER);
                        }
                    }
                }
                tek visibility = d0d0Var.getVisibility();
                visibility.getClass();
                Y(visibility, sb);
                E(sb, lekVar.u().contains(jek.CONST) && d0d0Var.N(), "const");
                B(d0d0Var, sb);
                D(d0d0Var, sb);
                J(d0d0Var, sb);
                E(sb, lekVar.u().contains(jek.LATEINIT) && d0d0Var.X(), "lateinit");
                A(d0d0Var, sb);
            }
            V(d0d0Var, sb, false);
            List typeParameters = d0d0Var.getTypeParameters();
            typeParameters.getClass();
            U(sb, typeParameters, true);
            M(d0d0Var, sb);
        }
        G(d0d0Var, sb, true);
        sb.append(": ");
        wsy type = d0d0Var.getType();
        type.getClass();
        sb.append(P(type));
        N(d0d0Var, sb);
        y(d0d0Var, sb);
        List typeParameters2 = d0d0Var.getTypeParameters();
        typeParameters2.getClass();
        Z(sb, typeParameters2);
    }

    public final void M(kp9 kp9Var, StringBuilder sb) {
        c8z c8zVarF = kp9Var.F();
        if (c8zVarF != null) {
            p(sb, c8zVarF, b93.RECEIVER);
            wsy type = c8zVarF.getType();
            type.getClass();
            sb.append(x(type, false));
            sb.append(Separators.DOT);
        }
    }

    public final void N(kp9 kp9Var, StringBuilder sb) {
        c8z c8zVarF;
        ov5 ov5Var = this.f14637a.F;
        iiy iiyVar = lek.Z[30];
        ov5Var.getClass();
        iiyVar.getClass();
        if (((Boolean) ov5Var.b).booleanValue() && (c8zVarF = kp9Var.F()) != null) {
            sb.append(" on ");
            wsy type = c8zVarF.getType();
            type.getClass();
            sb.append(P(type));
        }
    }

    public final String P(wsy wsyVar) {
        wsyVar.getClass();
        StringBuilder sb = new StringBuilder();
        ov5 ov5Var = this.f14637a.y;
        iiy iiyVar = lek.Z[23];
        ov5Var.getClass();
        iiyVar.getClass();
        H(sb, (wsy) ((Function1) ov5Var.b).invoke(wsyVar));
        return sb.toString();
    }

    public final String Q(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(l(Separators.LESS_THAN));
        CollectionsKt.a0(list, sb, ", ", null, null, new hek(this, (byte) 0), 60);
        sb.append(l(Separators.GREATER_THAN));
        return sb.toString();
    }

    public final String R(iys0 iys0Var) {
        iys0Var.getClass();
        foc focVarN = iys0Var.n();
        if ((focVarN instanceof hzs0) || (focVarN instanceof wm40) || (focVarN instanceof tfk)) {
            focVarN.getClass();
            return f2o.f(focVarN) ? focVarN.h().toString() : this.f14637a.o().b(focVarN, this);
        }
        if (focVarN == null) {
            return iys0Var instanceof xmx ? ((xmx) iys0Var).d(ske.n) : iys0Var.toString();
        }
        e9d0.x(focVarN.getClass(), "Unexpected classifier: ");
        return null;
    }

    public final void S(hzs0 hzs0Var, StringBuilder sb, boolean z) {
        if (z) {
            sb.append(l(Separators.LESS_THAN));
        }
        if (this.f14637a.D()) {
            sb.append("/*");
            sb.append(hzs0Var.getIndex());
            sb.append("*/ ");
        }
        E(sb, hzs0Var.q(), "reified");
        String str = hzs0Var.t().f33287a;
        boolean z2 = true;
        E(sb, str.length() > 0, str);
        p(sb, hzs0Var, null);
        G(hzs0Var, sb, z);
        int size = hzs0Var.getUpperBounds().size();
        if ((size > 1 && !z) || size == 1) {
            wsy wsyVar = (wsy) hzs0Var.getUpperBounds().iterator().next();
            if (wsyVar == null) {
                ary.a(141);
                throw null;
            }
            if (!ary.y(wsyVar) || !wsyVar.U()) {
                sb.append(" : ");
                sb.append(P(wsyVar));
            }
        } else if (z) {
            for (wsy wsyVar2 : hzs0Var.getUpperBounds()) {
                if (wsyVar2 == null) {
                    ary.a(141);
                    throw null;
                }
                if (!ary.y(wsyVar2) || !wsyVar2.U()) {
                    if (z2) {
                        sb.append(" : ");
                    } else {
                        sb.append(" & ");
                    }
                    sb.append(P(wsyVar2));
                    z2 = false;
                }
            }
        }
        if (z) {
            sb.append(l(Separators.GREATER_THAN));
        }
    }

    public final void T(StringBuilder sb, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            S((hzs0) it.next(), sb, false);
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
    }

    public final void U(StringBuilder sb, List list, boolean z) {
        if (this.f14637a.E() || list.isEmpty()) {
            return;
        }
        sb.append(l(Separators.LESS_THAN));
        T(sb, list);
        sb.append(l(Separators.GREATER_THAN));
        if (z) {
            sb.append(Separators.SP);
        }
    }

    public final void V(r3u0 r3u0Var, StringBuilder sb, boolean z) {
        if (z || !(r3u0Var instanceof k3u0)) {
            sb.append(z(r3u0Var.E() ? "var" : "val"));
            sb.append(Separators.SP);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0066  */
    public final void W(k3u0 k3u0Var, boolean z, StringBuilder sb, boolean z2) {
        boolean z3;
        if (z2) {
            sb.append(z("value-parameter"));
            sb.append(Separators.SP);
        }
        lek lekVar = this.f14637a;
        if (lekVar.D()) {
            sb.append("/*");
            sb.append(k3u0Var.g);
            sb.append("*/ ");
        }
        p(sb, k3u0Var, null);
        E(sb, k3u0Var.i, "crossinline");
        E(sb, k3u0Var.j, "noinline");
        ov5 ov5Var = lekVar.r;
        iiy[] iiyVarArr = lek.Z;
        iiy iiyVar = iiyVarArr[16];
        ov5Var.getClass();
        iiyVar.getClass();
        if (((Boolean) ov5Var.b).booleanValue()) {
            kp9 kp9VarR1 = k3u0Var.j();
            flc flcVar = kp9VarR1 instanceof flc ? (flc) kp9VarR1 : null;
            if (flcVar == null || !flcVar.f1) {
                z3 = false;
            } else {
                z3 = true;
            }
        } else {
            z3 = false;
        }
        if (z3) {
            ov5 ov5Var2 = lekVar.s;
            iiy iiyVar2 = iiyVarArr[17];
            ov5Var2.getClass();
            iiyVar2.getClass();
            E(sb, ((Boolean) ov5Var2.b).booleanValue(), "actual");
        }
        wsy type = k3u0Var.getType();
        type.getClass();
        wsy wsyVar = k3u0Var.k;
        wsy wsyVar2 = wsyVar == null ? type : wsyVar;
        E(sb, wsyVar != null, "vararg");
        if (z3 || (z2 && !lekVar.A())) {
            V(k3u0Var, sb, z3);
        }
        if (z) {
            G(k3u0Var, sb, z2);
            sb.append(": ");
        }
        sb.append(P(wsyVar2));
        y(k3u0Var, sb);
        if (lekVar.D() && wsyVar != null) {
            sb.append(" /*");
            sb.append(P(type));
            sb.append("*/");
        }
        if (lekVar.q() != null) {
            if (lekVar.p() ? k3u0Var.q1() : rek.a(k3u0Var)) {
                StringBuilder sb2 = new StringBuilder(" = ");
                Function1 function1Q = lekVar.q();
                function1Q.getClass();
                sb2.append((String) function1Q.invoke(k3u0Var));
                sb.append(sb2.toString());
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0029  */
    public final void X(StringBuilder sb, List list, boolean z) {
        boolean z2;
        lek lekVar = this.f14637a;
        ov5 ov5Var = lekVar.E;
        iiy iiyVar = lek.Z[29];
        ov5Var.getClass();
        iiyVar.getClass();
        int iOrdinal = ((ro80) ov5Var.b).ordinal();
        if (iOrdinal == 0) {
            z2 = true;
        } else {
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    t9f.b();
                    return;
                }
            } else if (!z) {
                z2 = true;
            }
            z2 = false;
        }
        int size = list.size();
        lekVar.C().getClass();
        sb.getClass();
        sb.append(Separators.LPAREN);
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            int i2 = i + 1;
            k3u0 k3u0Var = (k3u0) it.next();
            lekVar.C().getClass();
            k3u0Var.getClass();
            W(k3u0Var, z2, sb, false);
            lekVar.C().getClass();
            if (i != size - 1) {
                sb.append(", ");
            }
            i = i2;
        }
        lekVar.C().getClass();
        sb.append(Separators.RPAREN);
    }

    public final boolean Y(tek tekVar, StringBuilder sb) {
        lek lekVar = this.f14637a;
        if (!lekVar.u().contains(jek.VISIBILITY)) {
            return false;
        }
        ov5 ov5Var = lekVar.n;
        iiy iiyVar = lek.Z[12];
        ov5Var.getClass();
        iiyVar.getClass();
        if (((Boolean) ov5Var.b).booleanValue()) {
            tekVar = uek.f(tekVar.f33825a.m());
        }
        if (!lekVar.x() && Intrinsics.d(tekVar, uek.k)) {
            return false;
        }
        sb.append(z(tekVar.f33825a.e()));
        sb.append(Separators.SP);
        return true;
    }

    public final void Z(StringBuilder sb, List list) {
        if (this.f14637a.E()) {
            return;
        }
        ArrayList arrayList = new ArrayList(0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hzs0 hzs0Var = (hzs0) it.next();
            List upperBounds = hzs0Var.getUpperBounds();
            upperBounds.getClass();
            for (wsy wsyVar : CollectionsKt.O(upperBounds, 1)) {
                StringBuilder sb2 = new StringBuilder();
                g950 name = hzs0Var.getName();
                name.getClass();
                sb2.append(F(name, false));
                sb2.append(" : ");
                wsyVar.getClass();
                sb2.append(P(wsyVar));
                arrayList.add(sb2.toString());
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        sb.append(Separators.SP);
        sb.append(z("where"));
        sb.append(Separators.SP);
        CollectionsKt.a0(arrayList, sb, ", ", null, null, null, 124);
    }

    @Override // a.kek
    public final void a(boolean z) {
        this.f14637a.a(true);
    }

    @Override // a.kek
    public final void b(boolean z) {
        this.f14637a.b(false);
    }

    @Override // a.kek
    public final void c(boolean z) {
        this.f14637a.c(true);
    }

    @Override // a.kek
    public final void d(boolean z) {
        this.f14637a.d(true);
    }

    @Override // a.kek
    public final void e(xjf0 xjf0Var) {
        this.f14637a.e(xjf0Var);
    }

    @Override // a.kek
    public final void f(Set set) {
        set.getClass();
        this.f14637a.f(set);
    }

    @Override // a.kek
    public final void g(hoc hocVar) {
        this.f14637a.g(hocVar);
    }

    @Override // a.kek
    public final void h(ro80 ro80Var) {
        this.f14637a.h(ro80Var);
    }

    @Override // a.kek
    public final void i(boolean z) {
        this.f14637a.i(true);
    }

    @Override // a.kek
    public final void j(boolean z) {
        this.f14637a.j(true);
    }

    @Override // a.kek
    public final void k(boolean z) {
        this.f14637a.k(true);
    }

    public final String l(String str) {
        return this.f14637a.B().a(str);
    }

    public final String n(vjj vjjVar) {
        vjj vjjVarJ;
        String str;
        StringBuilder sb = new StringBuilder();
        vjjVar.i0(new lrc((Object) this, (byte) 23), sb);
        lek lekVar = this.f14637a;
        ov5 ov5Var = lekVar.c;
        iiy[] iiyVarArr = lek.Z;
        iiyVarArr[1].getClass();
        if (((Boolean) ov5Var.b).booleanValue() && !(vjjVar instanceof mg80) && !(vjjVar instanceof gdz) && (vjjVarJ = vjjVar.j()) != null && !(vjjVarJ instanceof ym40)) {
            sb.append(Separators.SP);
            int iOrdinal = lekVar.B().ordinal();
            if (iOrdinal == 0) {
                str = "defined in";
            } else {
                if (iOrdinal != 1) {
                    t9f.b();
                    return null;
                }
                str = "<i>defined in</i>";
            }
            sb.append(str);
            sb.append(Separators.SP);
            twq twqVarF = oek.f(vjjVarJ);
            twqVarF.getClass();
            sb.append(twqVarF.c() ? "root package" : l(xdx.C(twq.f(twqVarF))));
            ov5 ov5Var2 = lekVar.d;
            iiyVarArr[2].getClass();
            if (((Boolean) ov5Var2.b).booleanValue() && (vjjVarJ instanceof mg80) && (vjjVar instanceof xjj)) {
                ((xjj) vjjVar).b().getClass();
            }
        }
        return sb.toString();
    }

    public final String o(t83 t83Var, b93 b93Var) {
        flc flcVarM0;
        List listZ;
        t83Var.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append('@');
        if (b93Var != null) {
            sb.append(b93Var.f2187a + ':');
        }
        wsy type = t83Var.getType();
        sb.append(P(type));
        lek lekVar = this.f14637a;
        if (lekVar.m().f23069a) {
            Map mapC = t83Var.c();
            ov5 ov5Var = lekVar.I;
            iiy iiyVar = lek.Z[33];
            ov5Var.getClass();
            iiyVar.getClass();
            List list = null;
            wm40 wm40VarD = ((Boolean) ov5Var.b).booleanValue() ? rek.d(t83Var) : null;
            if (wm40VarD != null && (flcVarM0 = wm40VarD.m0()) != null && (listZ = flcVarM0.z()) != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : listZ) {
                    if (((k3u0) obj).q1()) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((k3u0) it.next()).getName());
                }
                list = arrayList2;
            }
            if (list == null) {
                list = iun.f15405a;
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : list) {
                if (!mapC.containsKey((g950) obj2)) {
                    arrayList3.add(obj2);
                }
            }
            ArrayList arrayList4 = new ArrayList(r3d.q(arrayList3, 10));
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                arrayList4.add(((g950) it2.next()).b() + " = ...");
            }
            Set<Map.Entry> setEntrySet = mapC.entrySet();
            ArrayList arrayList5 = new ArrayList(r3d.q(setEntrySet, 10));
            for (Map.Entry entry : setEntrySet) {
                g950 g950Var = (g950) entry.getKey();
                r2e r2eVar = (r2e) entry.getValue();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(g950Var.b());
                sb2.append(" = ");
                sb2.append(!list.contains(g950Var) ? s(r2eVar) : "...");
                arrayList5.add(sb2.toString());
            }
            List listZ0 = CollectionsKt.z0(CollectionsKt.q0(arrayList4, arrayList5));
            if (lekVar.m().b || !listZ0.isEmpty()) {
                CollectionsKt.a0(listZ0, sb, ", ", Separators.LPAREN, Separators.RPAREN, null, 112);
            }
        }
        if (lekVar.D() && (bdx.k0(type) || (type.S().n() instanceof m660))) {
            sb.append(" /* annotation class not found */");
        }
        return sb.toString();
    }

    public final void p(StringBuilder sb, e83 e83Var, b93 b93Var) {
        Set setS;
        lek lekVar = this.f14637a;
        if (lekVar.u().contains(jek.ANNOTATIONS)) {
            if (e83Var instanceof wsy) {
                setS = lekVar.s();
            } else {
                ov5 ov5Var = lekVar.K;
                iiy iiyVar = lek.Z[35];
                ov5Var.getClass();
                iiyVar.getClass();
                setS = (Set) ov5Var.b;
            }
            ov5 ov5Var2 = lekVar.M;
            iiy iiyVar2 = lek.Z[37];
            ov5Var2.getClass();
            iiyVar2.getClass();
            Function1 function1 = (Function1) ov5Var2.b;
            for (t83 t83Var : e83Var.getAnnotations()) {
                if (!CollectionsKt.L(setS, t83Var.d()) && !Intrinsics.d(t83Var.d(), i4m0.r) && (function1 == null || ((Boolean) function1.invoke(t83Var)).booleanValue())) {
                    sb.append(o(t83Var, b93Var));
                    ov5 ov5Var3 = lekVar.J;
                    iiy iiyVar3 = lek.Z[34];
                    ov5Var3.getClass();
                    iiyVar3.getClass();
                    if (((Boolean) ov5Var3.b).booleanValue()) {
                        sb.append('\n');
                    } else {
                        sb.append(Separators.SP);
                    }
                }
            }
        }
    }

    public final void r(goc gocVar, StringBuilder sb) {
        List listM = gocVar.M();
        listM.getClass();
        List parameters = gocVar.h().getParameters();
        parameters.getClass();
        if (this.f14637a.D() && gocVar.i() && parameters.size() > listM.size()) {
            sb.append(" /*captured type parameters: ");
            T(sb, parameters.subList(listM.size(), parameters.size()));
            sb.append("*/");
        }
    }

    public final String s(r2e r2eVar) {
        ov5 ov5Var = this.f14637a.v;
        iiy iiyVar = lek.Z[20];
        ov5Var.getClass();
        iiyVar.getClass();
        Function1 function1 = (Function1) ov5Var.b;
        if (function1 != null) {
            return (String) function1.invoke(r2eVar);
        }
        if (r2eVar instanceof mx3) {
            Iterable iterable = (Iterable) ((mx3) r2eVar).f29728a;
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                String strS = s((r2e) it.next());
                if (strS != null) {
                    arrayList.add(strS);
                }
            }
            return CollectionsKt.b0(arrayList, ", ", "{", "}", null, 56);
        }
        if (r2eVar instanceof e93) {
            return StringsKt.d0(Separators.AT, o((t83) ((e93) r2eVar).f29728a, null));
        }
        if (!(r2eVar instanceof ehy)) {
            return r2eVar.toString();
        }
        dhy dhyVar = (dhy) ((ehy) r2eVar).f29728a;
        if (dhyVar instanceof bhy) {
            return ((bhy) dhyVar).f2632a + "::class";
        }
        if (!(dhyVar instanceof chy)) {
            t9f.b();
            return null;
        }
        tlc tlcVar = ((chy) dhyVar).f4385a;
        String strL = tlcVar.f34135a.a().f32934a.f34663a;
        int i = tlcVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            strL = hne.l('>', "kotlin.Array<", strL);
        }
        return ohs0.n(strL, "::class");
    }

    public final void t(StringBuilder sb, List list) {
        if (list.isEmpty()) {
            return;
        }
        sb.append("context(");
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            int i2 = i + 1;
            wsy type = ((c8z) it.next()).getType();
            type.getClass();
            sb.append(x(type, true));
            if (i == q3d.i(list)) {
                sb.append(") ");
            } else {
                sb.append(", ");
            }
            i = i2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0051 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x0053  */
    /* JADX WARN: Code duplicated, block: B:17:0x006b  */
    /* JADX WARN: Code duplicated, block: B:18:0x0074  */
    public final void u(StringBuilder sb, kzj0 kzj0Var) {
        ov5 ov5Var;
        p(sb, kzj0Var, null);
        if (bdx.k0(kzj0Var)) {
            boolean z = kzj0Var instanceof a2o;
            lek lekVar = this.f14637a;
            if (z && ((a2o) kzj0Var).d.b) {
                ov5 ov5Var2 = lekVar.W;
                iiy iiyVar = lek.Z[47];
                ov5Var2.getClass();
                iiyVar.getClass();
                if (((Boolean) ov5Var2.b).booleanValue()) {
                    f2o f2oVar = f2o.f8821a;
                    if (z) {
                        boolean z2 = ((a2o) kzj0Var).d.b;
                    }
                    iys0 iys0VarS = kzj0Var.S();
                    iys0VarS.getClass();
                    sb.append(v(((b2o) iys0VarS).b[0]));
                } else {
                    if (z) {
                        ov5Var = lekVar.Y;
                        iiy iiyVar2 = lek.Z[49];
                        ov5Var.getClass();
                        iiyVar2.getClass();
                        if (((Boolean) ov5Var.b).booleanValue()) {
                            sb.append(kzj0Var.S().toString());
                        } else {
                            sb.append(((a2o) kzj0Var).h);
                        }
                    } else {
                        sb.append(kzj0Var.S().toString());
                    }
                    sb.append(Q(kzj0Var.J()));
                }
            } else {
                if (z) {
                    ov5Var = lekVar.Y;
                    iiy iiyVar3 = lek.Z[49];
                    ov5Var.getClass();
                    iiyVar3.getClass();
                    if (((Boolean) ov5Var.b).booleanValue()) {
                        sb.append(((a2o) kzj0Var).h);
                    } else {
                        sb.append(kzj0Var.S().toString());
                    }
                } else {
                    sb.append(kzj0Var.S().toString());
                }
                sb.append(Q(kzj0Var.J()));
            }
        } else {
            iys0 iys0VarS2 = kzj0Var.S();
            foc focVarN = kzj0Var.S().n();
            ouu ouuVarM = nsm0.m(kzj0Var, focVarN instanceof goc ? (goc) focVarN : null, 0);
            if (ouuVarM == null) {
                sb.append(R(iys0VarS2));
                sb.append(Q(kzj0Var.J()));
            } else {
                K(sb, ouuVarM);
            }
        }
        if (kzj0Var.U()) {
            sb.append(Separators.QUESTION);
        }
        if (kzj0Var instanceof szj) {
            sb.append(" & Any");
        }
    }

    public final String v(String str) {
        int iOrdinal = this.f14637a.B().ordinal();
        if (iOrdinal == 0) {
            return str;
        }
        if (iOrdinal == 1) {
            return kng0.l("<font color=red><b>", str, "</b></font>");
        }
        t9f.b();
        return null;
    }

    public final String w(String str, String str2, ary aryVar) {
        str.getClass();
        str2.getClass();
        aryVar.getClass();
        byte b = 0;
        if (xdx.Q(str, str2)) {
            return kotlin.text.c.x(str2, Separators.LPAREN, false) ? kng0.l(Separators.LPAREN, str, ")!") : str.concat("!");
        }
        String strB = xdx.B(str, str2, new gek(this, aryVar, b), new gek(this, aryVar, (byte) 1), new y6h(1, this, iek.class, "escape", "escape(Ljava/lang/String;)Ljava/lang/String;", 0, (byte) 22));
        if (strB != null) {
            return strB;
        }
        return Separators.LPAREN + str + ".." + str2 + ')';
    }

    public final String x(wsy wsyVar, boolean z) {
        String strP = P(wsyVar);
        return ((!a0(wsyVar) || e0t0.e(wsyVar)) && !(wsyVar instanceof szj) && (!z || wsyVar.getAnnotations().isEmpty())) ? strP : hne.l(')', Separators.LPAREN, strP);
    }

    public final void y(r3u0 r3u0Var, StringBuilder sb) {
        r2e r2eVarR;
        String strS;
        ov5 ov5Var = this.f14637a.u;
        iiy iiyVar = lek.Z[19];
        ov5Var.getClass();
        iiyVar.getClass();
        if (!((Boolean) ov5Var.b).booleanValue() || (r2eVarR = r3u0Var.R()) == null || (strS = s(r2eVarR)) == null) {
            return;
        }
        sb.append(" = ");
        sb.append(l(strS));
    }

    public final String z(String str) {
        lek lekVar = this.f14637a;
        int iOrdinal = lekVar.B().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                t9f.b();
                return null;
            }
            if (!lekVar.n()) {
                return kng0.l("<b>", str, "</b>");
            }
        }
        return str;
    }
}

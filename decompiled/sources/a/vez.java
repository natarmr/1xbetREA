package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes2.dex */
public final class vez extends wm40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wm40 f37308a;
    public final xzs0 b;
    public xzs0 c;
    public ArrayList d;
    public ArrayList e;
    public dmc f;

    public vez(wm40 wm40Var, xzs0 xzs0Var) {
        this.f37308a = wm40Var;
        this.b = xzs0Var;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0051  */
    /* JADX WARN: Code duplicated, block: B:35:0x0056  */
    /* JADX WARN: Code duplicated, block: B:36:0x005b  */
    public static /* synthetic */ void s0(int i) {
        String str = (i == 2 || i == 3 || i == 5 || i == 6 || i == 8 || i == 10 || i == 13 || i == 23) ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[(i == 2 || i == 3 || i == 5 || i == 6 || i == 8 || i == 10 || i == 13 || i == 23) ? 3 : 2];
        if (i == 2) {
            objArr[0] = "typeArguments";
        } else if (i == 3) {
            objArr[0] = "kotlinTypeRefiner";
        } else if (i == 5) {
            objArr[0] = "typeSubstitution";
        } else if (i == 6) {
            objArr[0] = "kotlinTypeRefiner";
        } else if (i == 8) {
            objArr[0] = "typeArguments";
        } else if (i == 10) {
            objArr[0] = "typeSubstitution";
        } else if (i == 13) {
            objArr[0] = "kotlinTypeRefiner";
        } else if (i != 23) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazySubstitutingClassDescriptor";
        } else {
            objArr[0] = "substitutor";
        }
        switch (i) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 10:
            case 13:
            case 23:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazySubstitutingClassDescriptor";
                break;
            case 4:
            case 7:
            case 9:
            case 11:
                objArr[1] = "getMemberScope";
                break;
            case 12:
            case 14:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 15:
                objArr[1] = "getStaticScope";
                break;
            case 16:
                objArr[1] = "getDefaultType";
                break;
            case 17:
                objArr[1] = "getContextReceivers";
                break;
            case 18:
                objArr[1] = "getConstructors";
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                objArr[1] = "getAnnotations";
                break;
            case 20:
                objArr[1] = "getName";
                break;
            case 21:
                objArr[1] = "getOriginal";
                break;
            case 22:
                objArr[1] = "getContainingDeclaration";
                break;
            case 24:
                objArr[1] = "substitute";
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                objArr[1] = "getKind";
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                objArr[1] = "getModality";
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                objArr[1] = "getVisibility";
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                objArr[1] = "getUnsubstitutedInnerClassesScope";
                break;
            case AvailableCode.HMS_IS_SPOOF /* 29 */:
                objArr[1] = "getSource";
                break;
            case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "getTypeConstructor";
                break;
        }
        if (i == 2 || i == 3 || i == 5 || i == 6 || i == 8 || i == 10) {
            objArr[2] = "getMemberScope";
        } else if (i == 13) {
            objArr[2] = "getUnsubstitutedMemberScope";
        } else if (i == 23) {
            objArr[2] = "substitute";
        }
        String str2 = String.format(str, objArr);
        if (i != 2 && i != 3 && i != 5 && i != 6 && i != 8 && i != 10 && i != 13 && i != 23) {
            throw new IllegalStateException(str2);
        }
        throw new IllegalArgumentException(str2);
    }

    @Override // a.wm40, a.foc
    public final kzj0 I() {
        ays0 ays0VarB;
        List listD = e0t0.d(h().getParameters());
        g93 annotations = getAnnotations();
        if (annotations.isEmpty()) {
            ays0.b.getClass();
            ays0VarB = ays0.c;
        } else {
            fck0 fck0Var = ays0.b;
            List listC = kotlin.collections.a.c(new j93(annotations));
            fck0Var.getClass();
            ays0VarB = fck0.b(listC);
        }
        return ucx.h0(k0(), ays0VarB, h(), listD, false);
    }

    @Override // a.wm40
    public final cr30 J(vzs0 vzs0Var) {
        rek.h(oek.c(this));
        return K(vzs0Var, cty.b0);
    }

    @Override // a.wm40
    public final cr30 K(vzs0 vzs0Var, cty ctyVar) {
        cr30 cr30VarK = this.f37308a.K(vzs0Var, ctyVar);
        if (!this.b.f41769a.e()) {
            return new bfn0(cr30VarK, t0());
        }
        if (cr30VarK != null) {
            return cr30VarK;
        }
        s0(7);
        throw null;
    }

    @Override // a.sq30
    public final boolean L() {
        return this.f37308a.L();
    }

    @Override // a.wm40, a.goc
    public final List M() {
        t0();
        ArrayList arrayList = this.e;
        if (arrayList != null) {
            return arrayList;
        }
        s0(30);
        throw null;
    }

    @Override // a.sq30
    public final boolean Q() {
        return this.f37308a.Q();
    }

    @Override // a.vjj, a.kp9
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public final wm40 o1() {
        wm40 wm40VarO1 = this.f37308a.o1();
        if (wm40VarO1 != null) {
            return wm40VarO1;
        }
        s0(21);
        throw null;
    }

    @Override // a.wm40
    public final cr30 U() {
        cr30 cr30VarU = this.f37308a.U();
        if (cr30VarU != null) {
            return cr30VarU;
        }
        s0(15);
        throw null;
    }

    @Override // a.xjj
    public final gmk0 b() {
        return gmk0.x0;
    }

    @Override // a.wen0
    public final xjj f(xzs0 xzs0Var) {
        if (xzs0Var != null) {
            vzs0 vzs0Var = xzs0Var.f41769a;
            return vzs0Var.e() ? this : new vez(this, xzs0.e(vzs0Var, t0().f41769a));
        }
        s0(23);
        throw null;
    }

    @Override // a.wm40
    public final Collection g() {
        Collection<flc> collectionG = this.f37308a.g();
        ArrayList arrayList = new ArrayList(collectionG.size());
        for (flc flcVar : collectionG) {
            flcVar.getClass();
            ner nerVarU1 = flcVar.u1(xzs0.b);
            nerVarU1.e = flcVar.o1();
            nerVarU1.r(flcVar.m());
            nerVarU1.k(flcVar.getVisibility());
            nerVarU1.d(flcVar.l());
            nerVarU1.m = false;
            arrayList.add(((flc) nerVarU1.x.r1(nerVarU1)).f(t0()));
        }
        return arrayList;
    }

    @Override // a.e83
    public final g93 getAnnotations() {
        g93 annotations = this.f37308a.getAnnotations();
        if (annotations != null) {
            return annotations;
        }
        s0(19);
        throw null;
    }

    @Override // a.vjj
    public final g950 getName() {
        g950 name = this.f37308a.getName();
        if (name != null) {
            return name;
        }
        s0(20);
        throw null;
    }

    @Override // a.wm40, a.sq30
    public final tek getVisibility() {
        tek visibility = this.f37308a.getVisibility();
        if (visibility != null) {
            return visibility;
        }
        s0(27);
        throw null;
    }

    @Override // a.foc
    public final iys0 h() {
        iys0 iys0VarH = this.f37308a.h();
        if (this.b.f41769a.e()) {
            if (iys0VarH != null) {
                return iys0VarH;
            }
            s0(0);
            throw null;
        }
        dmc dmcVar = this.f;
        if (dmcVar != null) {
            return dmcVar;
        }
        xzs0 xzs0VarT0 = t0();
        Collection collectionB = iys0VarH.b();
        ArrayList arrayList = new ArrayList(collectionB.size());
        Iterator it = collectionB.iterator();
        while (it.hasNext()) {
            arrayList.add(xzs0VarT0.h((wsy) it.next(), t3u0.c));
        }
        dmc dmcVar2 = new dmc(this, this.d, arrayList, eu00.e);
        this.f = dmcVar2;
        return dmcVar2;
    }

    @Override // a.goc
    public final boolean i() {
        return this.f37308a.i();
    }

    @Override // a.vjj
    public final Object i0(zjj zjjVar, Object obj) {
        return zjjVar.d(this, obj);
    }

    @Override // a.sq30
    public final boolean isExternal() {
        return this.f37308a.isExternal();
    }

    @Override // a.wm40
    public final boolean isInline() {
        return this.f37308a.isInline();
    }

    @Override // a.vjj
    public final vjj j() {
        vjj vjjVarJ = this.f37308a.j();
        if (vjjVarJ != null) {
            return vjjVarJ;
        }
        s0(22);
        throw null;
    }

    @Override // a.wm40
    public final cr30 j0() {
        cr30 cr30VarJ0 = this.f37308a.j0();
        if (cr30VarJ0 != null) {
            return cr30VarJ0;
        }
        s0(28);
        throw null;
    }

    @Override // a.wm40
    public final cr30 k0() {
        rek.h(oek.c(this.f37308a));
        return l0(cty.b0);
    }

    @Override // a.wm40
    public final cr30 l0(cty ctyVar) {
        cr30 cr30VarL0 = this.f37308a.l0(ctyVar);
        if (!this.b.f41769a.e()) {
            return new bfn0(cr30VarL0, t0());
        }
        if (cr30VarL0 != null) {
            return cr30VarL0;
        }
        s0(14);
        throw null;
    }

    @Override // a.wm40, a.sq30
    public final gm40 m() {
        gm40 gm40VarM = this.f37308a.m();
        if (gm40VarM != null) {
            return gm40VarM;
        }
        s0(26);
        throw null;
    }

    @Override // a.wm40
    public final flc m0() {
        return this.f37308a.m0();
    }

    @Override // a.wm40
    public final k2u0 n0() {
        k2u0 k2u0VarN0 = this.f37308a.n0();
        ArrayList arrayList = null;
        if (k2u0VarN0 == null) {
            return null;
        }
        boolean z = k2u0VarN0 instanceof cdx;
        xzs0 xzs0Var = this.b;
        if (z) {
            cdx cdxVar = (cdx) k2u0VarN0;
            g950 g950Var = cdxVar.f4185a;
            kzj0 kzj0Var = (kzj0) cdxVar.b;
            if (kzj0Var != null && !xzs0Var.f41769a.e()) {
                kzj0Var = (kzj0) t0().h(kzj0Var, t3u0.c);
            }
            return new cdx(g950Var, kzj0Var);
        }
        if (!(k2u0VarN0 instanceof ycr)) {
            t9f.b();
            return null;
        }
        List<Pair> list = ((ycr) k2u0VarN0).f42395a;
        if (list != null) {
            arrayList = new ArrayList(r3d.q(list, 10));
            for (Pair pair : list) {
                g950 g950Var2 = (g950) pair.f46059a;
                kzj0 kzj0Var2 = (kzj0) ((dcg0) pair.b);
                if (kzj0Var2 != null && !xzs0Var.f41769a.e()) {
                    kzj0Var2 = (kzj0) t0().h(kzj0Var2, t3u0.c);
                }
                arrayList.add(new Pair(g950Var2, kzj0Var2));
            }
        }
        return new ycr(arrayList);
    }

    @Override // a.wm40
    public final boolean o0() {
        return this.f37308a.o0();
    }

    @Override // a.wm40
    public final List p() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        s0(17);
        throw null;
    }

    @Override // a.wm40
    public final boolean p0() {
        return this.f37308a.p0();
    }

    @Override // a.wm40
    public final boolean q0() {
        return this.f37308a.q0();
    }

    @Override // a.wm40
    public final slc r() {
        slc slcVarR = this.f37308a.r();
        if (slcVarR != null) {
            return slcVarR;
        }
        s0(25);
        throw null;
    }

    @Override // a.wm40
    public final boolean r0() {
        return this.f37308a.r0();
    }

    public final xzs0 t0() {
        if (this.c == null) {
            xzs0 xzs0Var = this.b;
            if (xzs0Var.f41769a.e()) {
                this.c = xzs0Var;
            } else {
                List parameters = this.f37308a.h().getParameters();
                ArrayList arrayList = new ArrayList(parameters.size());
                this.d = arrayList;
                this.c = vdb.k0(parameters, xzs0Var.f41769a, this, arrayList);
                ArrayList arrayList2 = this.d;
                arrayList2.getClass();
                ArrayList arrayList3 = new ArrayList();
                for (Object obj : arrayList2) {
                    if (!((hzs0) obj).H()) {
                        arrayList3.add(obj);
                    }
                }
                this.e = arrayList3;
            }
        }
        return this.c;
    }
}

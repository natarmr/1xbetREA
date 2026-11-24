package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes2.dex */
public final class o5 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f24663a;
    public final Object b;

    public /* synthetic */ o5(Object obj, byte b) {
        this.f24663a = b;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r16v0, types: [a.kp9, a.mer, a.oer, a.vxs0] */
    /* JADX WARN: Type inference failed for: r19v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v1, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.ArrayList] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws wzs0 {
        flc flcVarF;
        ?? arrayList;
        byte b = this.f24663a;
        Object obj = this.b;
        switch (b) {
            case 0:
                tfk tfkVar = (tfk) obj;
                wm40 wm40VarP1 = tfkVar.p1();
                if (wm40VarP1 == null) {
                    return iun.f15405a;
                }
                Collection<flc> collectionG = wm40VarP1.g();
                collectionG.getClass();
                ArrayList arrayList2 = new ArrayList();
                for (flc flcVar : collectionG) {
                    uxs0 uxs0Var = vxs0.i1;
                    eu00 eu00Var = tfkVar.f;
                    flcVar.getClass();
                    uxs0Var.getClass();
                    f93 f93Var = ujn.c;
                    eu00Var.getClass();
                    ?? r12 = 0;
                    r12 = 0;
                    r12 = 0;
                    xzs0 xzs0VarD = tfkVar.p1() == null ? null : xzs0.d(tfkVar.q1());
                    if (xzs0VarD != null && (flcVarF = flcVar.f(xzs0VarD)) != null) {
                        g93 annotations = flcVar.getAnnotations();
                        int iL = flcVar.l();
                        if (iL == 0) {
                            throw null;
                        }
                        gmk0 gmk0VarB = tfkVar.b();
                        gmk0VarB.getClass();
                        ?? vxs0Var = new vxs0(eu00Var, tfkVar, flcVarF, null, annotations, iL, gmk0VarB);
                        List listZ = flcVar.z();
                        if (listZ == null) {
                            oer.k0(28);
                            throw null;
                        }
                        ArrayList arrayListS1 = oer.s1(vxs0Var, listZ, xzs0VarD, false, false, null);
                        if (arrayListS1 != null) {
                            kzj0 kzj0VarL = q7x.L(thb.P(flcVarF.h.j0()), tfkVar.I());
                            c8z c8zVar = flcVar.k;
                            c8z c8zVarS = c8zVar != null ? obb.S(vxs0Var, xzs0VarD.f(c8zVar.getType(), t3u0.c), f93Var) : null;
                            wm40 wm40VarP2 = tfkVar.p1();
                            if (wm40VarP2 != null) {
                                List listW = flcVar.W();
                                listW.getClass();
                                arrayList = new ArrayList(r3d.q(listW, 10));
                                int i = 0;
                                for (Object obj2 : listW) {
                                    int i2 = i + 1;
                                    if (i < 0) {
                                        q3d.p();
                                        throw null;
                                    }
                                    c8z c8zVar2 = (c8z) obj2;
                                    wsy wsyVarF = xzs0VarD.f(c8zVar2.getType(), t3u0.c);
                                    vde0 vde0VarP1 = c8zVar2.p1();
                                    vde0VarP1.getClass();
                                    mje mjeVar = new mje(wm40VarP2, wsyVarF, ((mje) vde0VarP1).n1());
                                    Regex regex = j950.f16120a;
                                    arrayList.add(new c8z(wm40VarP2, mjeVar, f93Var, g950.e(j950.b + '_' + i)));
                                    i = i2;
                                }
                            } else {
                                arrayList = iun.f15405a;
                            }
                            vxs0Var.t1(c8zVarS, null, arrayList, tfkVar.M(), arrayListS1, kzj0VarL, gm40.b, tfkVar.g);
                            r12 = vxs0Var;
                        }
                    }
                    if (r12 != 0) {
                        arrayList2.add(r12);
                    }
                }
                return arrayList2;
            case 1:
                return new q5(((r5) obj).a());
            case 2:
                StringBuilder sb = new StringBuilder("Scope for type parameter ");
                h5 h5Var = (h5) obj;
                sb.append(((g950) h5Var.b).b());
                return jpm0.j(sb.toString(), ((t5) h5Var.c).getUpperBounds());
            case 3:
                return new q0h0((p0h0) ((d8) obj).invoke());
            case 4:
                return (l8) obj;
            case 5:
                return (riu0) ((o5) obj).invoke();
            case 6:
                return new q0h0((p0h0) ((u8) obj).invoke());
            case 7:
                return (y8) obj;
            case 8:
                return (riu0) ((o5) obj).invoke();
            case 9:
                return new q0h0((p0h0) ((b9) obj).invoke());
            case 10:
                return (f9) obj;
            case 11:
                return (riu0) ((o5) obj).invoke();
            case 12:
                return new q0h0((p0h0) ((p9) obj).invoke());
            case 13:
                return (t9) obj;
            case 14:
                return (riu0) ((o5) obj).invoke();
            case 15:
                return (nd) obj;
            case 16:
                return (riu0) ((o5) obj).invoke();
            case 17:
                return (df) obj;
            case 18:
                return (riu0) ((o5) obj).invoke();
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return (pi) obj;
            case 20:
                return (riu0) ((o5) obj).invoke();
            case 21:
                return new q0h0((p0h0) ((su) obj).invoke());
            case 22:
                return (xu) obj;
            case 23:
                return (riu0) ((o5) obj).invoke();
            case 24:
                return new q0h0((p0h0) ((gz) obj).invoke());
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return (mz) obj;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return (riu0) ((o5) obj).invoke();
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return (s10) obj;
            default:
                return (riu0) ((o5) obj).invoke();
        }
    }
}

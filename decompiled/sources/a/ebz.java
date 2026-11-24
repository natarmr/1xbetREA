package a;

import android.text.Editable;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ebz implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f7541a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ebz(Object obj, byte b) {
        this.f7541a = b;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [a.yje] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        mcz mczVar;
        fez fezVar;
        l0l0 l0l0Var;
        byte b = this.f7541a;
        float f = 0.0f;
        byte b2 = 11;
        byte b3 = 12;
        byte b4 = 4;
        byte b5 = 2;
        mcz mczVar2 = 0;
        fez fezVar2 = null;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                return new ty2((fbz) obj2, b2);
            case 1:
                ((Integer) obj).getClass();
                return obj2;
            case 2:
                kcz kczVar = (kcz) obj2;
                return kczVar.n1(((Integer) obj).intValue(), kczVar.e);
            case 3:
                xcz xczVar = (xcz) obj2;
                jru jruVar = xczVar.r;
                pcz pczVar = xczVar.f40671a;
                boolean z = xczVar.k;
                float f2 = -((Float) obj).floatValue();
                if ((f2 >= 0.0f || xczVar.d()) && (f2 <= 0.0f || xczVar.c())) {
                    if (Math.abs(xczVar.h) > 0.5f) {
                        adx.c("entered drag with non-zero pending scroll");
                    }
                    xczVar.d = true;
                    float f3 = xczVar.h + f2;
                    xczVar.h = f3;
                    if (Math.abs(f3) > 0.5f) {
                        float f4 = xczVar.h;
                        int iRound = Math.round(f4);
                        mcz mczVarG = ((mcz) ((hgk0) xczVar.f).getValue()).g(iRound, !xczVar.b);
                        if (mczVarG == null || (mczVar = xczVar.c) == null) {
                            mczVar2 = mczVarG;
                        } else {
                            mcz mczVarG2 = mczVar.g(iRound, true);
                            if (mczVarG2 != null) {
                                xczVar.c = mczVarG2;
                                mczVar2 = mczVarG;
                            }
                        }
                        if (mczVar2 != 0) {
                            xczVar.g(mczVar2, xczVar.b, true);
                            m8x.Z(xczVar.w);
                            float f5 = f4 - xczVar.h;
                            if (z) {
                                pczVar.c(jruVar, f5, mczVar2);
                            }
                        } else {
                            e7z e7zVar = xczVar.l;
                            if (e7zVar != null) {
                                e7zVar.l();
                            }
                            float f6 = f4 - xczVar.h;
                            mcz mczVarJ = xczVar.j();
                            if (z) {
                                pczVar.c(jruVar, f6, mczVarJ);
                            }
                        }
                    }
                    if (Math.abs(xczVar.h) > 0.5f) {
                        f2 -= xczVar.h;
                        xczVar.h = 0.0f;
                    }
                    f = f2;
                }
                return Float.valueOf(-f);
            case 4:
                List list = (List) obj;
                return new xcz((uwq) obj2, ((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
            case 5:
                List list2 = (List) obj;
                return new xcz(((Number) list2.get(0)).intValue(), ((Number) list2.get(1)).intValue(), (pvj) obj2);
            case 6:
                fzg0 fzg0Var = (fzg0) obj2;
                return Boolean.valueOf(fzg0Var != null ? fzg0Var.d(obj) : true);
            case 7:
                qek0 qek0Var = (qek0) obj2;
                ((Integer) obj).getClass();
                return qek0Var;
            case 8:
                mez mezVar = (mez) obj2;
                float f7 = -((Float) obj).floatValue();
                pz40 pz40Var = mezVar.d;
                if ((f7 >= 0.0f || mezVar.d()) && (f7 <= 0.0f || mezVar.c())) {
                    if (Math.abs(mezVar.o) > 0.5f) {
                        adx.c("entered drag with non-zero pending scroll");
                    }
                    float f8 = mezVar.o + f7;
                    mezVar.o = f8;
                    if (Math.abs(f8) > 0.5f) {
                        float f9 = mezVar.o;
                        int iB = si30.b(f9);
                        hgk0 hgk0Var = (hgk0) pz40Var;
                        fez fezVarG = ((fez) hgk0Var.getValue()).g(iB, !mezVar.f21671a);
                        if (fezVarG == null || (fezVar = mezVar.b) == null) {
                            fezVar2 = fezVarG;
                        } else {
                            fez fezVarG2 = fezVar.g(iB, true);
                            if (fezVarG2 != null) {
                                mezVar.b = fezVarG2;
                                fezVar2 = fezVarG;
                            }
                        }
                        if (fezVar2 != null) {
                            mezVar.f(fezVar2, mezVar.f21671a, true);
                            m8x.Z(mezVar.u);
                            mezVar.j(f9 - mezVar.o, fezVar2);
                        } else {
                            e7z e7zVar2 = mezVar.h;
                            if (e7zVar2 != null) {
                                e7zVar2.l();
                            }
                            mezVar.j(f9 - mezVar.o, (fez) hgk0Var.getValue());
                        }
                    }
                    if (Math.abs(mezVar.o) > 0.5f) {
                        f7 -= mezVar.o;
                        mezVar.o = 0.0f;
                    }
                    f = f7;
                }
                return Float.valueOf(-f);
            case 9:
                cgz cgzVar = (cgz) obj2;
                Long l = (Long) obj;
                l.getClass();
                sqt sqtVar = cgz.m2;
                vcc.f0(i120.V(new Pair("REQUEST_DISCIPLINE_RESULT_KEY", l)), cgzVar, "REQUEST_DISCIPLINE_RESULT_KEY");
                cgzVar.x0();
                return Unit.f46060a;
            case 10:
                egz egzVar = (egz) obj2;
                String str = (String) obj;
                sqt sqtVar2 = cgz.m2;
                str.getClass();
                egzVar.getClass();
                egzVar.b.setValue(str);
                return Unit.f46060a;
            case 11:
                pgz pgzVar = (pgz) obj2;
                qgz qgzVar = (qgz) obj;
                art artVar = pgz.l2;
                qgzVar.getClass();
                vcc.f0(i120.V(new Pair("REQUEST_TYPE_REGION_RESULT_KEY", qgzVar)), pgzVar, "REQUEST_TYPE_REGION_RESULT_KEY");
                pgzVar.x0();
                return Unit.f46060a;
            case 12:
                mhz mhzVar = (mhz) obj2;
                epe epeVar = (epe) obj;
                bst bstVar = mhz.l2;
                epeVar.getClass();
                vcc.f0(i120.V(new Pair("REQUEST_TEAMS_TYPE_RESULT_KEY", epeVar)), mhzVar, "REQUEST_TEAMS_TYPE_RESULT_KEY");
                mhzVar.x0();
                return Unit.f46060a;
            case 13:
                qhz qhzVar = (qhz) obj2;
                Integer num = (Integer) obj;
                num.getClass();
                gst gstVar = qhz.l2;
                vcc.f0(i120.V(new Pair("REQUEST_TIME_FILTER_RESULT_KEY", num)), qhzVar, "REQUEST_TIME_FILTER_RESULT_KEY");
                qhzVar.x0();
                return Unit.f46060a;
            case 14:
                vhz vhzVar = (vhz) obj2;
                xhz xhzVar = (xhz) obj;
                rqt rqtVar = vhz.l2;
                xhzVar.getClass();
                vcc.f0(i120.V(new Pair("REQUEST_TYPE_RESULT_KEY", xhzVar)), vhzVar, "REQUEST_TYPE_RESULT_KEY");
                vhzVar.x0();
                return Unit.f46060a;
            case 15:
                return ((j4a) obj2).m;
            case 16:
                cp cpVar = (cp) obj;
                cpVar.getClass();
                LinearLayout linearLayout = ((wvx) cpVar.u).f39860a;
                linearLayout.getClass();
                dyb.O(linearLayout, new okw((svz) obj2, cpVar, (byte) 29));
                cpVar.t(new ctv(cpVar, cpVar, b4));
                return Unit.f46060a;
            case 17:
                qpz qpzVar = (qpz) obj2;
                Throwable th = (Throwable) obj;
                th.getClass();
                qpzVar.r.b(th, new g2z((Object) qpzVar, (byte) 5));
                return Unit.f46060a;
            case 18:
                lqz lqzVar = (lqz) obj2;
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                lqzVar.r.b(th2, new g2z((Object) lqzVar, (byte) 7));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                cxz cxzVar = (cxz) obj2;
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                cxzVar.s.b(th3, new g2z((Object) cxzVar, (byte) 9));
                return Unit.f46060a;
            case 20:
                sxz sxzVar = (sxz) obj2;
                x5q0 x5q0Var = (x5q0) obj;
                xuz xuzVar = sxz.o2;
                x5q0Var.getClass();
                if (x5q0Var instanceof w5q0) {
                    k3t0 k3t0Var = (k3t0) sxzVar.l2.getValue();
                    String str2 = ((w5q0) x5q0Var).f38596a;
                    str2.getClass();
                    k3t0Var.x(new oxz(str2));
                }
                return Unit.f46060a;
            case 21:
                v000 v000Var = (v000) obj2;
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                v000Var.s.b(th4, new g2z(v000Var, b2));
                return Unit.f46060a;
            case 22:
                w400 w400Var = (w400) obj2;
                Throwable th5 = (Throwable) obj;
                th5.getClass();
                w400Var.s.b(th5, new g2z(w400Var, b3));
                return Unit.f46060a;
            case 23:
                cp cpVar2 = (cp) obj;
                cpVar2.getClass();
                ConstraintLayout constraintLayout = ((dwx) cpVar2.u).f6820a;
                constraintLayout.getClass();
                dyb.O(constraintLayout, new u400((cbl0) obj2, cpVar2, b5));
                cpVar2.t(new b1w(cpVar2, (byte) 23));
                return Unit.f46060a;
            case 24:
                return ((ynp0) ((bb00) obj2).e.get(((Integer) obj).intValue())).f42951a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ppj0 ppj0Var = (ppj0) obj2;
                qjj.W(ppj0Var.b, null, null, new npj0(ppj0Var, mczVar2, b5), 3);
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                gb00 gb00Var = (gb00) obj2;
                Throwable th6 = (Throwable) obj;
                th6.getClass();
                gb00Var.t.b(th6, new g2z((Object) gb00Var, (byte) 15));
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                qi00 qi00Var = (qi00) obj2;
                Throwable th7 = (Throwable) obj;
                th7.getClass();
                qi00Var.x.b(th7, new g2z((Object) qi00Var, (byte) 16));
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                syp sypVar = (syp) obj2;
                n0o0 n0o0Var = sypVar.f;
                ais aisVar = (ais) obj;
                aisVar.getClass();
                mj00 mj00Var = (mj00) ((fee) sypVar.b.getValue()).c();
                if (mj00Var == null) {
                    return ij00.f14851a;
                }
                boolean z2 = mj00Var.g;
                mdm mdmVar = (mdm) ((fee) ((n0o0) sypVar.i).getValue()).b();
                int iOrdinal = aisVar.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
                        t9f.b();
                        return null;
                    }
                    if (mdmVar != null) {
                        return new hj00(mdmVar);
                    }
                    zcl zclVar = qmk.f28987a;
                    return new gj00((a4x) ((fee) n0o0Var.getValue()).b(), z2);
                }
                if (!((Collection) ((fee) n0o0Var.getValue()).c()).isEmpty()) {
                    zcl zclVar2 = qmk.f28987a;
                    return new gj00((a4x) ((fee) n0o0Var.getValue()).b(), z2);
                }
                zcl zclVar3 = qmk.f28987a;
                b3 = ((Boolean) ((fee) ((n0o0) sypVar.h).getValue()).c()).booleanValue() ? (byte) 12 : (byte) 4;
                ArrayList arrayList = new ArrayList(b3);
                for (int i = 0; i < b3; i++) {
                    int iOrdinal2 = mj00Var.f.ordinal();
                    if (iOrdinal2 == 0) {
                        l0l0Var = g0l0.f10465a;
                    } else if (iOrdinal2 == 1) {
                        l0l0Var = k0l0.f17474a;
                    } else if (iOrdinal2 == 2) {
                        l0l0Var = j0l0.f15687a;
                    } else if (iOrdinal2 == 3) {
                        l0l0Var = i0l0.f13953a;
                    } else {
                        if (iOrdinal2 != 4) {
                            t9f.b();
                            return null;
                        }
                        l0l0Var = h0l0.f12241a;
                    }
                    arrayList.add(new x56(l0l0Var));
                }
                return new jj00(dyb.o0(arrayList));
            default:
                Editable editable = (Editable) obj;
                htz htzVar = yl00.n2;
                editable.getClass();
                xm00 xm00Var = (xm00) ((yl00) obj2).i2.getValue();
                String string = editable.toString();
                string.getClass();
                p7m0 p7m0Var = xm00Var.g;
                pm00 pm00Var = new pm00(!StringsKt.W(string));
                p7m0Var.getClass();
                p7m0Var.o(null, pm00Var);
                return Unit.f46060a;
        }
    }
}

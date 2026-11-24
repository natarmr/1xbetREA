package a;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.google.android.material.imageview.ShapeableImageView;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.imageview.RoundCornerImageView;
import org.xplatform.uikit_sport.sport_coupon_card.common.DsSportCouponCard;

/* JADX INFO: loaded from: classes.dex */
public final class ok implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f25382a;
    public final /* synthetic */ cp b;
    public final /* synthetic */ cp c;

    public /* synthetic */ ok(cp cpVar, cp cpVar2, byte b) {
        this.f25382a = b;
        this.b = cpVar;
        this.c = cpVar2;
    }

    private final Object A(Object obj) {
        List list = (List) obj;
        cp cpVar = this.c;
        yfu0 yfu0Var = cpVar.u;
        cp cpVar2 = this.b;
        yfu0 yfu0Var2 = cpVar2.u;
        list.getClass();
        if (!list.isEmpty()) {
            ArrayList<xfh> arrayList = new ArrayList();
            for (Object obj2 : list) {
                obj2.getClass();
                w3d.u(arrayList, (Collection) obj2);
            }
            for (xfh xfhVar : arrayList) {
                if (xfhVar != null) {
                    if (xfhVar instanceof wfh) {
                        ((tfh) yfu0Var).d.setText(((yfh) cpVar.u()).b);
                    } else if (xfhVar instanceof ufh) {
                        ShapeableImageView shapeableImageView = ((tfh) yfu0Var).c;
                        shapeableImageView.setBackgroundResource(R.color.static_black_40);
                    } else if (xfhVar instanceof vfh) {
                        plc.w(cpVar);
                    }
                }
                t9f.b();
                return null;
            }
        }
        ((tfh) yfu0Var2).d.setText(((yfh) cpVar2.u()).b);
        ShapeableImageView shapeableImageView2 = ((tfh) yfu0Var2).c;
        shapeableImageView2.setBackgroundResource(R.color.static_black_40);
        plc.w(cpVar2);
        return Unit.f46060a;
    }

    private final Object B(Object obj) {
        List list = (List) obj;
        cp cpVar = this.b;
        yfu0 yfu0Var = cpVar.u;
        Context context = cpVar.w;
        list.getClass();
        if (list.isEmpty()) {
            ((wqo) yfu0Var).b.setButtonsVisibile(false);
            wqo wqoVar = (wqo) yfu0Var;
            wqoVar.b.setTitle(((vqo) cpVar.u()).c);
            Drawable drawable = context.getDrawable(R.drawable.ic_glyph_percent);
            if (drawable != null) {
                TypedValue typedValue = j5d.f15927a;
                vcc.c0(drawable, context, j5d.a(context, R.attr.uikitSecondary, false));
                wqoVar.b.setBonusIcon(drawable);
            }
            ((wqo) yfu0Var).b.setMarket(((vqo) cpVar.u()).d.f36128a);
        } else {
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                obj2.getClass();
                w3d.u(arrayList, (Collection) obj2);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((uqo) it.next()) == null) {
                    t9f.b();
                    return null;
                }
                cp cpVar2 = this.c;
                ((wqo) cpVar2.u).b.setMarket(((vqo) cpVar2.u()).d.f36128a);
            }
        }
        return Unit.f46060a;
    }

    private final Object a(Object obj) {
        String string;
        List list = (List) obj;
        cp cpVar = this.b;
        yfu0 yfu0Var = cpVar.u;
        list.getClass();
        if (!list.isEmpty()) {
            ArrayList<dcb> arrayList = new ArrayList();
            for (Object obj2 : list) {
                obj2.getClass();
                w3d.u(arrayList, (Collection) obj2);
            }
            for (dcb dcbVar : arrayList) {
                if (dcbVar != null) {
                    boolean z = dcbVar instanceof bcb;
                    cp cpVar2 = this.c;
                    if (z) {
                        jcb.J(cpVar2);
                    } else if (dcbVar instanceof ccb) {
                        ((o7b0) cpVar2.u).c.setTitleText(((fcb) cpVar2.u()).b);
                    }
                }
                t9f.b();
                return null;
            }
        }
        List list2 = u0d.f34849a;
        AppCompatImageView appCompatImageViewD = ((o7b0) yfu0Var).b.d();
        long j = ((fcb) cpVar.u()).f9303a;
        if (j != 0) {
            bzu bzuVarD = rz4.d("static", "svg", "sports_v2");
            rz4.s(j, ".svg", bzuVarD);
            string = ((StringBuilder) bzuVarD.b).toString();
        } else {
            string = "";
        }
        u0d.j(appCompatImageViewD, string, R.drawable.ic_glyph_category_new, 0, null, null, null, 508);
        ((o7b0) yfu0Var).c.setTitleText(((fcb) cpVar.u()).b);
        jcb.J(cpVar);
        return Unit.f46060a;
    }

    private final Object b(Object obj) {
        List list = (List) obj;
        cp cpVar = this.c;
        yfu0 yfu0Var = cpVar.u;
        cp cpVar2 = this.b;
        yfu0 yfu0Var2 = cpVar2.u;
        list.getClass();
        if (!list.isEmpty()) {
            ArrayList<ygb> arrayList = new ArrayList();
            for (Object obj2 : list) {
                obj2.getClass();
                w3d.u(arrayList, (Collection) obj2);
            }
            for (ygb ygbVar : arrayList) {
                if (ygbVar != null) {
                    if (ygbVar instanceof vgb) {
                        ((z3b0) yfu0Var).c.setTitleText(((zgb) cpVar.u()).d);
                    } else if (ygbVar instanceof xgb) {
                        ((z3b0) yfu0Var).d.setFavoriteIcon(((zgb) cpVar.u()).f);
                    } else if (ygbVar instanceof ugb) {
                        ahb.w(cpVar);
                    } else if (ygbVar instanceof tgb) {
                        ((z3b0) yfu0Var).d.setVisibility(!((zgb) cpVar.u()).k ? 0 : 8);
                    } else if (ygbVar instanceof wgb) {
                        ((z3b0) yfu0Var).d.setCounterNumber(Integer.valueOf(((zgb) cpVar.u()).i));
                    }
                }
                t9f.b();
                return null;
            }
        }
        ((z3b0) yfu0Var2).d.setFavoriteIcon(((zgb) cpVar2.u()).f);
        ahb.w(cpVar2);
        ((z3b0) yfu0Var2).c.setTitleText(((zgb) cpVar2.u()).d);
        ((z3b0) yfu0Var2).d.setCounterNumber(Integer.valueOf(((zgb) cpVar2.u()).i));
        ((z3b0) yfu0Var2).b.setBadge(((zgb) cpVar2.u()).g);
        ((z3b0) yfu0Var2).d.setVisibility(((zgb) cpVar2.u()).k ? 8 : 0);
        return Unit.f46060a;
    }

    private final Object c(Object obj) {
        List list = (List) obj;
        cp cpVar = this.c;
        yfu0 yfu0Var = cpVar.u;
        cp cpVar2 = this.b;
        yfu0 yfu0Var2 = cpVar2.u;
        list.getClass();
        if (!list.isEmpty()) {
            ArrayList<hfo0> arrayList = new ArrayList();
            for (Object obj2 : list) {
                obj2.getClass();
                w3d.u(arrayList, (Collection) obj2);
            }
            for (hfo0 hfo0Var : arrayList) {
                if (hfo0Var != null) {
                    if (hfo0Var instanceof gfo0) {
                        ((xcu0) yfu0Var).b.setText(((ifo0) cpVar.u()).f14698a);
                    } else if (hfo0Var instanceof ffo0) {
                        ((xcu0) yfu0Var).b.setSelected(((ifo0) cpVar.u()).b);
                    }
                }
                t9f.b();
                return null;
            }
        }
        ((xcu0) yfu0Var2).b.setText(((ifo0) cpVar2.u()).f14698a);
        ((xcu0) yfu0Var2).b.setSelected(((ifo0) cpVar2.u()).b);
        return Unit.f46060a;
    }

    private final Object g(Object obj) {
        List list = (List) obj;
        list.getClass();
        if (list.isEmpty()) {
            cp cpVar = this.b;
            ond ondVar = (ond) cpVar.u();
            ank0 ank0Var = ondVar.i;
            Context context = cpVar.w;
            SpannableString spannableStringB = ank0Var.b(context);
            ntx ntxVar = (ntx) cpVar.u;
            TextView textView = ntxVar.j;
            Group group = ntxVar.c;
            Group group2 = ntxVar.b;
            AppCompatTextView appCompatTextView = ntxVar.l;
            textView.setText(spannableStringB);
            ntxVar.j.setVisibility(!StringsKt.W(spannableStringB) ? 0 : 8);
            if (ondVar.j) {
                jwb.z(appCompatTextView);
            } else {
                jwb.y(appCompatTextView);
            }
            appCompatTextView.setText(ondVar.b.b(context));
            ntxVar.k.setSpannableText(ondVar.g.a(context));
            ntxVar.m.setSpannableText(ondVar.h.a(context));
            if (ondVar.l) {
                ond ondVar2 = (ond) cpVar.u();
                group2.setVisibility(0);
                group.setVisibility(8);
                List list2 = u0d.f34849a;
                u0d.n(ntxVar.e, ondVar2.c, 0, 11);
                u0d.n(ntxVar.f, ondVar2.e, 0, 11);
                u0d.n(ntxVar.h, ondVar2.d, 0, 11);
                u0d.n(ntxVar.i, ondVar2.f, 0, 11);
            } else {
                ond ondVar3 = (ond) cpVar.u();
                RoundCornerImageView roundCornerImageView = ntxVar.g;
                RoundCornerImageView roundCornerImageView2 = ntxVar.d;
                group2.setVisibility(8);
                group.setVisibility(0);
                if (ondVar3.m) {
                    roundCornerImageView2.setImageResource(R.drawable.ic_glyph_color_logo_home);
                    roundCornerImageView.setImageResource(R.drawable.ic_glyph_color_logo_away);
                } else {
                    List list3 = u0d.f34849a;
                    u0d.n(roundCornerImageView2, ondVar3.c, 0, 11);
                    u0d.n(roundCornerImageView, ondVar3.d, 0, 11);
                }
            }
            ntxVar.f24122a.setLayoutDirection(((ond) cpVar.u()).o ? 2 : 0);
        } else {
            ArrayList<List> arrayList = new ArrayList();
            for (Object obj2 : list) {
                obj2.getClass();
                w3d.u(arrayList, (Collection) obj2);
            }
            for (List list4 : arrayList) {
                ArrayList<lmd> arrayList2 = new ArrayList();
                for (Object obj3 : list4) {
                    if (obj3 instanceof lmd) {
                        arrayList2.add(obj3);
                    }
                }
                for (lmd lmdVar : arrayList2) {
                    cp cpVar2 = this.c;
                    Context context2 = cpVar2.w;
                    yfu0 yfu0Var = cpVar2.u;
                    lmdVar.getClass();
                    if (lmdVar instanceof fmd) {
                        ((ntx) yfu0Var).j.setText(((fmd) lmdVar).f9775a.b(context2));
                    } else if (lmdVar instanceof gmd) {
                        ntx ntxVar2 = (ntx) yfu0Var;
                        String string = ntxVar2.l.getText().toString();
                        ank0 ank0Var2 = ((gmd) lmdVar).f11538a;
                        String strA = ank0Var2.a();
                        Regex regex = new Regex("\\d+");
                        int iC0 = CollectionsKt.C0(pgi0.t(pgi0.p(Regex.d(regex, string), new y2d((byte) 17))));
                        int iC1 = CollectionsKt.C0(pgi0.t(pgi0.p(Regex.d(regex, strA), new y2d((byte) 18))));
                        AppCompatTextView appCompatTextView2 = ntxVar2.l;
                        if (iC0 < iC1) {
                            appCompatTextView2.setText(ank0Var2.b(context2));
                        } else {
                            appCompatTextView2.setText(kotlin.text.c.r(ank0Var2.a(), ", ", "", false));
                        }
                    } else if (lmdVar instanceof hmd) {
                        List list5 = u0d.f34849a;
                        u0d.n(((ntx) yfu0Var).e, ((hmd) lmdVar).f13299a, 0, 11);
                    } else if (lmdVar instanceof imd) {
                        List list6 = u0d.f34849a;
                        u0d.n(((ntx) yfu0Var).f, ((imd) lmdVar).f15018a, 0, 11);
                    } else if (lmdVar instanceof jmd) {
                        List list7 = u0d.f34849a;
                        u0d.n(((ntx) yfu0Var).h, ((jmd) lmdVar).f16758a, 0, 11);
                    } else {
                        if (!(lmdVar instanceof kmd)) {
                            t9f.b();
                            return null;
                        }
                        List list8 = u0d.f34849a;
                        u0d.n(((ntx) yfu0Var).i, ((kmd) lmdVar).f18533a, 0, 11);
                    }
                }
            }
        }
        return Unit.f46060a;
    }

    private final Object h(Object obj) {
        List list = (List) obj;
        list.getClass();
        if (list.isEmpty()) {
            cp cpVar = this.b;
            apd apdVar = (apd) cpVar.u();
            ank0 ank0Var = apdVar.e;
            Context context = cpVar.w;
            SpannableString spannableStringB = ank0Var.b(context);
            ptx ptxVar = (ptx) cpVar.u;
            TextView textView = ptxVar.b;
            AppCompatTextView appCompatTextView = ptxVar.d;
            textView.setText(spannableStringB);
            ptxVar.b.setVisibility(!StringsKt.W(spannableStringB) ? 0 : 8);
            if (apdVar.f) {
                jwb.z(appCompatTextView);
            } else {
                jwb.y(appCompatTextView);
            }
            appCompatTextView.setText(apdVar.b.b(context));
            ptxVar.c.setText(apdVar.c.a(context));
            ptxVar.e.setText(apdVar.d.a(context));
            ptxVar.f27585a.setLayoutDirection(((apd) cpVar.u()).i ? 2 : 0);
        } else {
            ArrayList<List> arrayList = new ArrayList();
            for (Object obj2 : list) {
                obj2.getClass();
                w3d.u(arrayList, (Collection) obj2);
            }
            for (List list2 : arrayList) {
                ArrayList<xmd> arrayList2 = new ArrayList();
                for (Object obj3 : list2) {
                    if (obj3 instanceof xmd) {
                        arrayList2.add(obj3);
                    }
                }
                for (xmd xmdVar : arrayList2) {
                    cp cpVar2 = this.c;
                    Context context2 = cpVar2.w;
                    yfu0 yfu0Var = cpVar2.u;
                    xmdVar.getClass();
                    if (xmdVar instanceof vmd) {
                        ((ptx) yfu0Var).b.setText(((vmd) xmdVar).f37670a.b(context2));
                    } else {
                        if (!(xmdVar instanceof wmd)) {
                            t9f.b();
                            return null;
                        }
                        ((ptx) yfu0Var).d.setText(((wmd) xmdVar).f39401a.b(context2));
                    }
                }
            }
        }
        return Unit.f46060a;
    }

    private final Object i(Object obj) {
        List list = (List) obj;
        list.getClass();
        if (list.isEmpty()) {
            cp cpVar = this.b;
            mpd mpdVar = (mpd) cpVar.u();
            ank0 ank0Var = mpdVar.c;
            Context context = cpVar.w;
            SpannableString spannableStringB = ank0Var.b(context);
            stx stxVar = (stx) cpVar.u;
            stxVar.b.setText(spannableStringB);
            stxVar.b.setVisibility(!StringsKt.W(spannableStringB) ? 0 : 8);
            stxVar.c.setText(mpdVar.b.b(context));
        } else {
            ArrayList<List> arrayList = new ArrayList();
            for (Object obj2 : list) {
                obj2.getClass();
                w3d.u(arrayList, (Collection) obj2);
            }
            for (List list2 : arrayList) {
                ArrayList<jnd> arrayList2 = new ArrayList();
                for (Object obj3 : list2) {
                    if (obj3 instanceof jnd) {
                        arrayList2.add(obj3);
                    }
                }
                for (jnd jndVar : arrayList2) {
                    jndVar.getClass();
                    if (!(jndVar instanceof jnd)) {
                        t9f.b();
                        return null;
                    }
                    cp cpVar2 = this.c;
                    ((stx) cpVar2.u).b.setText(jndVar.f16807a.b(cpVar2.w));
                }
            }
        }
        return Unit.f46060a;
    }

    private final Object l(Object obj) {
        List list = (List) obj;
        list.getClass();
        if (list.isEmpty()) {
            cp cpVar = this.b;
            Object objU = cpVar.u();
            Context context = cpVar.w;
            ee90 ee90Var = (ee90) objU;
            rtx rtxVar = (rtx) cpVar.u;
            rtxVar.b.setImageResource(ee90Var.f7660a);
            rtxVar.c.setText(ee90Var.b.a(context));
            rtxVar.d.setText(ee90Var.c.a(context));
        } else {
            ArrayList<List> arrayList = new ArrayList();
            for (Object obj2 : list) {
                obj2.getClass();
                w3d.u(arrayList, (Collection) obj2);
            }
            for (List list2 : arrayList) {
                ArrayList<rpd> arrayList2 = new ArrayList();
                for (Object obj3 : list2) {
                    if (obj3 instanceof rpd) {
                        arrayList2.add(obj3);
                    }
                }
                for (rpd rpdVar : arrayList2) {
                    cp cpVar2 = this.c;
                    Context context2 = cpVar2.w;
                    yfu0 yfu0Var = cpVar2.u;
                    rpdVar.getClass();
                    if (rpdVar instanceof ppd) {
                        ((rtx) yfu0Var).c.setText(((ppd) rpdVar).f27370a.a(context2));
                    } else {
                        if (!(rpdVar instanceof qpd)) {
                            t9f.b();
                            return null;
                        }
                        ((rtx) yfu0Var).d.setText(((qpd) rpdVar).f29111a.a(context2));
                    }
                }
            }
        }
        return Unit.f46060a;
    }

    private final Object m(Object obj) {
        List list = (List) obj;
        list.getClass();
        if (list.isEmpty()) {
            cp cpVar = this.b;
            Object objU = cpVar.u();
            Context context = cpVar.w;
            cf90 cf90Var = (cf90) objU;
            qtx qtxVar = (qtx) cpVar.u;
            qtxVar.b.setText(cf90Var.f4250a);
            qtxVar.c.setText(cf90Var.b.a(context));
            qtxVar.d.setText(cf90Var.c.a(context));
        } else {
            ArrayList<List> arrayList = new ArrayList();
            for (Object obj2 : list) {
                obj2.getClass();
                w3d.u(arrayList, (Collection) obj2);
            }
            for (List list2 : arrayList) {
                ArrayList<vpd> arrayList2 = new ArrayList();
                for (Object obj3 : list2) {
                    if (obj3 instanceof vpd) {
                        arrayList2.add(obj3);
                    }
                }
                for (vpd vpdVar : arrayList2) {
                    cp cpVar2 = this.c;
                    Context context2 = cpVar2.w;
                    yfu0 yfu0Var = cpVar2.u;
                    vpdVar.getClass();
                    if (vpdVar instanceof tpd) {
                        ((qtx) yfu0Var).c.setText(((tpd) vpdVar).f34327a.a(context2));
                    } else if (vpdVar instanceof upd) {
                        ((qtx) yfu0Var).d.setText(((upd) vpdVar).f36060a.a(context2));
                    } else {
                        if (!(vpdVar instanceof spd)) {
                            t9f.b();
                            return null;
                        }
                        ((qtx) yfu0Var).b.setText(((spd) vpdVar).f32587a);
                    }
                }
            }
        }
        return Unit.f46060a;
    }

    private final Object o(Object obj) {
        List list = (List) obj;
        list.getClass();
        if (!list.isEmpty()) {
            ArrayList<List> arrayList = new ArrayList();
            for (Object obj2 : list) {
                obj2.getClass();
                w3d.u(arrayList, (Collection) obj2);
            }
            for (List list2 : arrayList) {
                ArrayList<umd> arrayList2 = new ArrayList();
                for (Object obj3 : list2) {
                    if (obj3 instanceof umd) {
                        arrayList2.add(obj3);
                    }
                }
                for (umd umdVar : arrayList2) {
                    cp cpVar = this.c;
                    Context context = cpVar.w;
                    yfu0 yfu0Var = cpVar.u;
                    if (umdVar != null) {
                        if (umdVar instanceof rmd) {
                            ((otx) yfu0Var).h.setText(((rmd) umdVar).f30738a.b(context));
                        } else if (umdVar instanceof tmd) {
                            ((otx) yfu0Var).k.setText(((tmd) umdVar).f34188a.b(context));
                        } else if (umdVar instanceof smd) {
                            ((otx) yfu0Var).i.setText(((smd) umdVar).f32438a.b(context));
                        }
                    }
                    t9f.b();
                    return null;
                }
            }
        }
        cp cpVar2 = this.b;
        otx otxVar = (otx) cpVar2.u;
        TextView textView = otxVar.i;
        ank0 ank0Var = ((aqd) cpVar2.u()).b;
        Context context2 = cpVar2.w;
        textView.setText(ank0Var.b(context2));
        List list3 = u0d.f34849a;
        u0d.n(otxVar.b, ((aqd) cpVar2.u()).e, 0, 11);
        u0d.n(otxVar.d, ((aqd) cpVar2.u()).f, 0, 11);
        otxVar.g.setText(((aqd) cpVar2.u()).c);
        otxVar.j.setText(((aqd) cpVar2.u()).d);
        AppCompatTextView appCompatTextView = otxVar.h;
        jwb.z(appCompatTextView);
        appCompatTextView.setText(((aqd) cpVar2.u()).g.b(context2));
        AppCompatTextView appCompatTextView2 = otxVar.k;
        jwb.z(appCompatTextView2);
        appCompatTextView2.setText(((aqd) cpVar2.u()).h.b(context2));
        return Unit.f46060a;
    }

    private final Object p(Object obj) {
        List list = (List) obj;
        list.getClass();
        if (list.isEmpty()) {
            cp cpVar = this.b;
            gqd gqdVar = (gqd) cpVar.u();
            qtx qtxVar = (qtx) cpVar.u;
            qtxVar.b.setText(gqdVar.f11727a);
            TextView textView = qtxVar.c;
            zmk0 zmk0Var = gqdVar.b;
            Context context = cpVar.w;
            textView.setText(zmk0Var.a(context));
            qtxVar.d.setText(gqdVar.c.a(context));
        } else {
            ArrayList<fqd> arrayList = new ArrayList();
            for (Object obj2 : list) {
                obj2.getClass();
                w3d.u(arrayList, (Collection) obj2);
            }
            for (fqd fqdVar : arrayList) {
                cp cpVar2 = this.c;
                Context context2 = cpVar2.w;
                yfu0 yfu0Var = cpVar2.u;
                fqdVar.getClass();
                if (fqdVar instanceof dqd) {
                    ((qtx) yfu0Var).c.setText(((dqd) fqdVar).f6508a.a(context2));
                } else if (fqdVar instanceof eqd) {
                    ((qtx) yfu0Var).d.setText(((eqd) fqdVar).f8232a.a(context2));
                } else {
                    if (!(fqdVar instanceof cqd)) {
                        t9f.b();
                        return null;
                    }
                    ((qtx) yfu0Var).b.setText(((cqd) fqdVar).f4788a);
                }
            }
        }
        return Unit.f46060a;
    }

    private final Object r(Object obj) {
        List list = (List) obj;
        cp cpVar = this.c;
        yfu0 yfu0Var = cpVar.u;
        cp cpVar2 = this.b;
        yfu0 yfu0Var2 = cpVar2.u;
        list.getClass();
        if (!list.isEmpty()) {
            ArrayList<ise> arrayList = new ArrayList();
            for (Object obj2 : list) {
                obj2.getClass();
                w3d.u(arrayList, (Collection) obj2);
            }
            for (ise iseVar : arrayList) {
                if (iseVar != null) {
                    if (iseVar instanceof hse) {
                        ((scu0) yfu0Var).b.setCouponBonusTitleStyle(((jse) cpVar.u()).k);
                    } else if (iseVar instanceof gse) {
                        ((scu0) yfu0Var).b.setCouponBonusTitle(((jse) cpVar.u()).j);
                    } else if (iseVar instanceof fse) {
                        ((scu0) yfu0Var).b.setTagText(((jse) cpVar.u()).l);
                    } else if (iseVar instanceof ese) {
                        ((scu0) yfu0Var).b.setMarketStyle(((jse) cpVar.u()).p);
                    } else if (iseVar instanceof dse) {
                        ((scu0) yfu0Var).b.setMarketDescriptionStyle(((jse) cpVar.u()).n);
                    } else if (iseVar instanceof cse) {
                        ((scu0) yfu0Var).b.setMarketDescription(((jse) cpVar.u()).m);
                    } else if (iseVar instanceof bse) {
                        DsSportCouponCard dsSportCouponCard = ((scu0) yfu0Var).b;
                        String str = ((jse) cpVar.u()).q;
                        j0d j0dVar = j0d.f15678a;
                        pse pseVar = dsSportCouponCard.j;
                        if (pseVar != null) {
                            pseVar.b(str, j0dVar);
                        }
                    }
                }
                t9f.b();
                return null;
            }
        }
        ((scu0) yfu0Var2).b.a(((jse) cpVar2.u()).r);
        scu0 scu0Var = (scu0) yfu0Var2;
        DsSportCouponCard dsSportCouponCard2 = scu0Var.b;
        dsSportCouponCard2.setAutoSub("");
        dsSportCouponCard2.setOptionBet("");
        dsSportCouponCard2.setEachWay("");
        if (dsSportCouponCard2.getCurrentStyledView() instanceof mue) {
            Integer numValueOf = ((jse) cpVar2.u()).i != 0 ? Integer.valueOf(((jse) cpVar2.u()).i) : null;
            if (numValueOf != null) {
                dsSportCouponCard2.setSportImage(numValueOf.intValue());
            }
        }
        ((scu0) yfu0Var2).b.setCouponBonusTitleStyle(((jse) cpVar2.u()).k);
        ((scu0) yfu0Var2).b.setCouponBonusTitle(((jse) cpVar2.u()).j);
        ((scu0) yfu0Var2).b.setTagText(((jse) cpVar2.u()).l);
        ((scu0) yfu0Var2).b.setMarketStyle(((jse) cpVar2.u()).p);
        ((scu0) yfu0Var2).b.setMarketDescriptionStyle(((jse) cpVar2.u()).n);
        ((scu0) yfu0Var2).b.setMarketDescription(((jse) cpVar2.u()).m);
        scu0Var.b.setMarketHeader(((jse) cpVar2.u()).o);
        DsSportCouponCard dsSportCouponCard3 = ((scu0) yfu0Var2).b;
        String str2 = ((jse) cpVar2.u()).q;
        j0d j0dVar2 = j0d.f15678a;
        pse pseVar2 = dsSportCouponCard3.j;
        if (pseVar2 != null) {
            pseVar2.b(str2, j0dVar2);
        }
        return Unit.f46060a;
    }

    private final Object s(Object obj) {
        List list = (List) obj;
        cp cpVar = this.b;
        yfu0 yfu0Var = cpVar.u;
        list.getClass();
        if (list.isEmpty()) {
            List list2 = u0d.f34849a;
            u0d.j(((k7g) yfu0Var).d, ((a7g) cpVar.u()).b, R.drawable.ic_cyber_group, 0, null, null, null, 508);
            k7g k7gVar = (k7g) yfu0Var;
            k7gVar.d.setVisibility(((a7g) cpVar.u()).e ? 0 : 8);
            k7gVar.e.setText(((a7g) cpVar.u()).c);
            k7g k7gVar2 = (k7g) yfu0Var;
            k7gVar2.b.setChecked(((a7g) cpVar.u()).d);
            k7gVar2.b.jumpDrawablesToCurrentState();
        } else {
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                obj2.getClass();
                w3d.u(arrayList, (Collection) obj2);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (!Intrinsics.d((z6g) it.next(), z6g.f43864a)) {
                    t9f.b();
                    return null;
                }
                cp cpVar2 = this.c;
                k7g k7gVar3 = (k7g) cpVar2.u;
                k7gVar3.b.setChecked(((a7g) cpVar2.u()).d);
                k7gVar3.b.jumpDrawablesToCurrentState();
            }
        }
        return Unit.f46060a;
    }

    private final Object t(Object obj) {
        List list = (List) obj;
        cp cpVar = this.c;
        yfu0 yfu0Var = cpVar.u;
        cp cpVar2 = this.b;
        yfu0 yfu0Var2 = cpVar2.u;
        list.getClass();
        if (!list.isEmpty()) {
            ArrayList<sog> arrayList = new ArrayList();
            for (Object obj2 : list) {
                obj2.getClass();
                w3d.u(arrayList, (Collection) obj2);
            }
            for (sog sogVar : arrayList) {
                if (sogVar != null) {
                    if (sogVar instanceof oog) {
                        thb.s(cpVar);
                    } else if (sogVar instanceof rog) {
                        ((hth) yfu0Var).c.setText(((tog) cpVar.u()).b);
                    } else if (sogVar instanceof pog) {
                        ((hth) yfu0Var).d.setText(((tog) cpVar.u()).c);
                    } else if (sogVar instanceof qog) {
                        ((hth) yfu0Var).f.setText(((tog) cpVar.u()).d);
                    } else if (sogVar instanceof nog) {
                        ((hth) yfu0Var).f13634a.setBackgroundResource(((tog) cpVar.u()).e);
                    }
                }
                t9f.b();
                return null;
            }
        }
        thb.s(cpVar2);
        ((hth) yfu0Var2).c.setText(((tog) cpVar2.u()).b);
        ((hth) yfu0Var2).d.setText(((tog) cpVar2.u()).c);
        ((hth) yfu0Var2).f.setText(((tog) cpVar2.u()).d);
        ((hth) yfu0Var2).f13634a.setBackgroundResource(((tog) cpVar2.u()).e);
        return Unit.f46060a;
    }

    private final Object u(Object obj) {
        List list = (List) obj;
        cp cpVar = this.c;
        yfu0 yfu0Var = cpVar.u;
        cp cpVar2 = this.b;
        yfu0 yfu0Var2 = cpVar2.u;
        list.getClass();
        if (!list.isEmpty()) {
            ArrayList<jov> arrayList = new ArrayList();
            for (Object obj2 : list) {
                obj2.getClass();
                w3d.u(arrayList, (Collection) obj2);
            }
            for (jov jovVar : arrayList) {
                if (jovVar != null) {
                    if (jovVar instanceof fov) {
                        ntb.C(cpVar);
                    } else if (jovVar instanceof gov) {
                        ((ith) yfu0Var).f.setText(((kov) cpVar.u()).b);
                    } else if (jovVar instanceof hov) {
                        ntb.D(cpVar);
                    } else if (jovVar instanceof iov) {
                        ((ith) yfu0Var).g.setText(((kov) cpVar.u()).d);
                    } else if (jovVar instanceof dov) {
                        ((ith) yfu0Var).e.setText(((kov) cpVar.u()).e);
                    } else if (jovVar instanceof eov) {
                        ((ith) yfu0Var).b.setBackground(sj3.U(((kov) cpVar.u()).f, cpVar.w));
                    }
                }
                t9f.b();
                return null;
            }
        }
        ntb.C(cpVar2);
        ((ith) yfu0Var2).f.setText(((kov) cpVar2.u()).b);
        ntb.D(cpVar2);
        ((ith) yfu0Var2).g.setText(((kov) cpVar2.u()).d);
        ((ith) yfu0Var2).e.setText(((kov) cpVar2.u()).e);
        ((ith) yfu0Var2).b.setBackground(sj3.U(((kov) cpVar2.u()).f, cpVar2.w));
        return Unit.f46060a;
    }

    private final Object v(Object obj) {
        List list = (List) obj;
        cp cpVar = this.c;
        yfu0 yfu0Var = cpVar.u;
        cp cpVar2 = this.b;
        yfu0 yfu0Var2 = cpVar2.u;
        list.getClass();
        byte b = 2;
        if (!list.isEmpty()) {
            ArrayList<bov> arrayList = new ArrayList();
            for (Object obj2 : list) {
                obj2.getClass();
                w3d.u(arrayList, (Collection) obj2);
            }
            for (bov bovVar : arrayList) {
                if (bovVar != null) {
                    if (bovVar instanceof tnv) {
                        ((jth) yfu0Var).f.setText(((cov) cpVar.u()).c);
                    } else if (bovVar instanceof snv) {
                        vtb.O(cpVar);
                    } else if (bovVar instanceof unv) {
                        ((jth) yfu0Var).f.setTextColor(((cov) cpVar.u()).d);
                    } else if (bovVar instanceof xnv) {
                        ((jth) yfu0Var).h.setText(((cov) cpVar.u()).f);
                    } else if (bovVar instanceof wnv) {
                        vtb.P(cpVar);
                    } else if (bovVar instanceof ynv) {
                        ((jth) yfu0Var).h.setTextColor(((cov) cpVar.u()).g);
                    } else if (bovVar instanceof aov) {
                        ((jth) yfu0Var).d.setText(((cov) cpVar.u()).h);
                    } else if (bovVar instanceof znv) {
                        ((jth) yfu0Var).e.setText(((cov) cpVar.u()).i);
                    } else if (bovVar instanceof vnv) {
                        ((jth) yfu0Var).g.post(new zre(cpVar, b));
                    } else if (bovVar instanceof rnv) {
                        ((jth) yfu0Var).f17100a.setBackground(sj3.U(((cov) cpVar.u()).k, cpVar.w));
                    }
                }
                t9f.b();
                return null;
            }
        }
        ((jth) yfu0Var2).f.setText(((cov) cpVar2.u()).c);
        vtb.O(cpVar2);
        ((jth) yfu0Var2).f.setTextColor(((cov) cpVar2.u()).d);
        ((jth) yfu0Var2).h.setText(((cov) cpVar2.u()).f);
        vtb.P(cpVar2);
        ((jth) yfu0Var2).h.setTextColor(((cov) cpVar2.u()).g);
        ((jth) yfu0Var2).d.setText(((cov) cpVar2.u()).h);
        ((jth) yfu0Var2).e.setText(((cov) cpVar2.u()).i);
        ((jth) yfu0Var2).g.post(new zre(cpVar2, b));
        ((jth) yfu0Var2).f17100a.setBackground(sj3.U(((cov) cpVar2.u()).k, cpVar2.w));
        return Unit.f46060a;
    }

    private final Object w(Object obj) {
        List list = (List) obj;
        cp cpVar = this.c;
        Context context = cpVar.w;
        yfu0 yfu0Var = cpVar.u;
        cp cpVar2 = this.b;
        Context context2 = cpVar2.w;
        yfu0 yfu0Var2 = cpVar2.u;
        list.getClass();
        if (!list.isEmpty()) {
            ArrayList<cdh> arrayList = new ArrayList();
            for (Object obj2 : list) {
                obj2.getClass();
                w3d.u(arrayList, (Collection) obj2);
            }
            for (cdh cdhVar : arrayList) {
                if (cdhVar != null) {
                    if (cdhVar instanceof uch) {
                        xbc.J(cpVar);
                    } else if (cdhVar instanceof adh) {
                        xbc.N(cpVar);
                    } else if (cdhVar instanceof wch) {
                        xbc.K(cpVar);
                    } else if (cdhVar instanceof vch) {
                        ((oth) yfu0Var).g.setText(((ddh) cpVar.u()).f.b(context));
                    } else if (cdhVar instanceof bdh) {
                        ((oth) yfu0Var).k.setText(((ddh) cpVar.u()).g.b(context));
                    } else if (cdhVar instanceof tch) {
                        xbc.K(cpVar);
                    } else if (cdhVar instanceof xch) {
                        xbc.L(cpVar);
                    } else if (cdhVar instanceof ych) {
                        ((oth) yfu0Var).i.setText(((ddh) cpVar.u()).j);
                    } else if (cdhVar instanceof zch) {
                        xbc.M(cpVar);
                    }
                }
                t9f.b();
                return null;
            }
        }
        xbc.K(cpVar2);
        xbc.J(cpVar2);
        xbc.N(cpVar2);
        ((oth) yfu0Var2).g.setText(((ddh) cpVar2.u()).f.b(context2));
        ((oth) yfu0Var2).k.setText(((ddh) cpVar2.u()).g.b(context2));
        ((oth) yfu0Var2).f25830a.setBackground(sj3.U(((ddh) cpVar2.u()).h, context2));
        xbc.L(cpVar2);
        ((oth) yfu0Var2).i.setText(((ddh) cpVar2.u()).j);
        xbc.M(cpVar2);
        return Unit.f46060a;
    }

    private final Object x(Object obj) {
        List list = (List) obj;
        cp cpVar = this.c;
        Context context = cpVar.w;
        yfu0 yfu0Var = cpVar.u;
        cp cpVar2 = this.b;
        Context context2 = cpVar2.w;
        yfu0 yfu0Var2 = cpVar2.u;
        list.getClass();
        byte b = 3;
        if (!list.isEmpty()) {
            ArrayList<l4k0> arrayList = new ArrayList();
            for (Object obj2 : list) {
                obj2.getClass();
                w3d.u(arrayList, (Collection) obj2);
            }
            for (l4k0 l4k0Var : arrayList) {
                if (l4k0Var != null) {
                    if (l4k0Var instanceof f4k0) {
                        ((qth) yfu0Var).f.setText(((m4k0) cpVar.u()).c);
                    } else if (l4k0Var instanceof e4k0) {
                        qcc.I(cpVar);
                    } else if (l4k0Var instanceof g4k0) {
                        ((qth) yfu0Var).g.post(new zre(cpVar, b));
                    } else if (l4k0Var instanceof h4k0) {
                        ((qth) yfu0Var).g.setBackground(sj3.U(((m4k0) cpVar.u()).e, context));
                    } else if (l4k0Var instanceof k4k0) {
                        ((qth) yfu0Var).d.setText(((m4k0) cpVar.u()).f);
                    } else if (l4k0Var instanceof j4k0) {
                        ((qth) yfu0Var).c.setText(((m4k0) cpVar.u()).g);
                    } else if (l4k0Var instanceof i4k0) {
                        ((qth) yfu0Var).e.setText(((m4k0) cpVar.u()).h);
                    } else if (l4k0Var instanceof d4k0) {
                        ((qth) yfu0Var).f29299a.setBackground(sj3.U(((m4k0) cpVar.u()).i, context));
                    }
                }
                t9f.b();
                return null;
            }
        }
        ((qth) yfu0Var2).f.setText(((m4k0) cpVar2.u()).c);
        qcc.I(cpVar2);
        ((qth) yfu0Var2).g.post(new zre(cpVar2, b));
        ((qth) yfu0Var2).g.setBackground(sj3.U(((m4k0) cpVar2.u()).e, context2));
        ((qth) yfu0Var2).d.setText(((m4k0) cpVar2.u()).f);
        ((qth) yfu0Var2).c.setText(((m4k0) cpVar2.u()).g);
        ((qth) yfu0Var2).e.setText(((m4k0) cpVar2.u()).h);
        ((qth) yfu0Var2).f29299a.setBackground(sj3.U(((m4k0) cpVar2.u()).i, context2));
        return Unit.f46060a;
    }

    private final Object y(Object obj) {
        List list = (List) obj;
        list.getClass();
        if (!list.isEmpty()) {
            ArrayList<p4k0> arrayList = new ArrayList();
            for (Object obj2 : list) {
                obj2.getClass();
                w3d.u(arrayList, (Collection) obj2);
            }
            for (p4k0 p4k0Var : arrayList) {
                if (p4k0Var != null) {
                    boolean z = p4k0Var instanceof o4k0;
                    cp cpVar = this.c;
                    if (z) {
                        vcc.z(cpVar);
                    } else if (p4k0Var instanceof n4k0) {
                        ((pth) cpVar.u).f27564a.setBackground(sj3.U(((q4k0) cpVar.u()).b, cpVar.w));
                    }
                }
                t9f.b();
                return null;
            }
        }
        cp cpVar2 = this.b;
        vcc.z(cpVar2);
        ((pth) cpVar2.u).f27564a.setBackground(sj3.U(((q4k0) cpVar2.u()).b, cpVar2.w));
        return Unit.f46060a;
    }

    private final Object z(Object obj) {
        List list = (List) obj;
        yfu0 yfu0Var = this.c.u;
        cp cpVar = this.b;
        yfu0 yfu0Var2 = cpVar.u;
        list.getClass();
        if (!list.isEmpty()) {
            ArrayList<nfh> arrayList = new ArrayList();
            for (Object obj2 : list) {
                obj2.getClass();
                w3d.u(arrayList, (Collection) obj2);
            }
            for (nfh nfhVar : arrayList) {
                if (nfhVar != null) {
                    if (nfhVar instanceof lfh) {
                        ((rfh) yfu0Var).f30387a.setHeaders(((lfh) nfhVar).f19955a);
                    } else if (nfhVar instanceof mfh) {
                        ((rfh) yfu0Var).f30387a.setTeams(((mfh) nfhVar).f21694a);
                    }
                }
                t9f.b();
                return null;
            }
        }
        ((rfh) yfu0Var2).f30387a.setHeaders(((ofh) cpVar.u()).b);
        ((rfh) yfu0Var2).f30387a.setTeams(((ofh) cpVar.u()).c);
        return Unit.f46060a;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i;
        cp cpVar;
        byte b = this.f25382a;
        cp cpVar2 = this.c;
        cp cpVar3 = this.b;
        switch (b) {
            case 0:
                List list = (List) obj;
                yfu0 yfu0Var = cpVar3.u;
                list.getClass();
                if (list.isEmpty()) {
                    ((urx) yfu0Var).b.setImageResource(((nk) cpVar3.u()).b());
                    ((urx) yfu0Var).c.setText(((nk) cpVar3.u()).a());
                } else {
                    ArrayList<ik> arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        obj2.getClass();
                        w3d.u(arrayList, (Collection) obj2);
                    }
                    for (ik ikVar : arrayList) {
                        yfu0 yfu0Var2 = cpVar2.u;
                        ikVar.getClass();
                        if (ikVar instanceof gk) {
                            ((urx) yfu0Var2).c.setText(((gk) ikVar).f11423a);
                        } else {
                            if (!(ikVar instanceof hk)) {
                                t9f.b();
                                return null;
                            }
                            ((urx) yfu0Var2).b.setImageResource(((hk) ikVar).f13184a);
                        }
                    }
                }
                return Unit.f46060a;
            case 1:
                List list2 = (List) obj;
                list2.getClass();
                if (list2.isEmpty()) {
                    vcc.d0(((bg3) cpVar3.u).b, ((xx3) cpVar3.u()).f41639a);
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj3 : list2) {
                        obj3.getClass();
                        w3d.u(arrayList2, (Collection) obj3);
                    }
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        if (((wx3) it.next()) == null) {
                            t9f.b();
                            return null;
                        }
                        vcc.d0(((bg3) cpVar2.u).b, ((xx3) cpVar2.u()).f41639a);
                    }
                }
                return Unit.f46060a;
            case 2:
                List list3 = (List) obj;
                yfu0 yfu0Var3 = cpVar2.u;
                yfu0 yfu0Var4 = cpVar3.u;
                list3.getClass();
                if (!list3.isEmpty()) {
                    ArrayList<q07> arrayList3 = new ArrayList();
                    for (Object obj4 : list3) {
                        obj4.getClass();
                        w3d.u(arrayList3, (Collection) obj4);
                    }
                    for (q07 q07Var : arrayList3) {
                        if (q07Var != null) {
                            if (q07Var instanceof p07) {
                                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(((cs6) yfu0Var3).b, "rotation", ((r07) cpVar2.u()).d);
                                objectAnimatorOfFloat.setDuration(300L);
                                objectAnimatorOfFloat.start();
                            } else if (q07Var instanceof o07) {
                                fre0.K(cpVar2);
                            } else if (q07Var instanceof n07) {
                                ((cs6) yfu0Var3).d.setText(((r07) cpVar2.u()).b);
                            }
                        }
                        t9f.b();
                        return null;
                    }
                }
                ((cs6) yfu0Var4).d.setText(((r07) cpVar3.u()).b);
                cs6 cs6Var = (cs6) yfu0Var4;
                Drawable drawable = cs6Var.b.getDrawable();
                Context context = cs6Var.b.getContext();
                context.getClass();
                vcc.c0(drawable, context, R.attr.colorPrimary);
                cs6Var.b.setRotation(((r07) cpVar3.u()).d);
                fre0.K(cpVar3);
                return Unit.f46060a;
            case 3:
                List list4 = (List) obj;
                list4.getClass();
                if (!list4.isEmpty()) {
                    ArrayList<List> arrayList4 = new ArrayList();
                    for (Object obj5 : list4) {
                        obj5.getClass();
                        w3d.u(arrayList4, (Collection) obj5);
                    }
                    for (List list5 : arrayList4) {
                        ArrayList<wds> arrayList5 = new ArrayList();
                        for (Object obj6 : list5) {
                            if (obj6 instanceof wds) {
                                arrayList5.add(obj6);
                            }
                        }
                        for (wds wdsVar : arrayList5) {
                            yfu0 yfu0Var5 = cpVar2.u;
                            wdsVar.getClass();
                            if (wdsVar instanceof vds) {
                                ((lsx) yfu0Var5).w.u(((vds) wdsVar).f37246a);
                            } else if (wdsVar instanceof jds) {
                                ((lsx) yfu0Var5).d.setImageResource(((jds) wdsVar).f16343a);
                            } else if (wdsVar instanceof rds) {
                                ((lsx) yfu0Var5).l.setImageResource(((rds) wdsVar).f30304a);
                            } else if (wdsVar instanceof lds) {
                                List list6 = u0d.f34849a;
                                u0d.n(((lsx) yfu0Var5).e, ((lds) wdsVar).f19866a, 0, 11);
                            } else if (wdsVar instanceof tds) {
                                List list7 = u0d.f34849a;
                                u0d.n(((lsx) yfu0Var5).m, ((tds) wdsVar).f33784a, 0, 11);
                            } else if (wdsVar instanceof nds) {
                                ((lsx) yfu0Var5).f.setImageResource(((nds) wdsVar).f23350a);
                            } else if (wdsVar instanceof ods) {
                                ((lsx) yfu0Var5).h.setImageResource(((ods) wdsVar).f25091a);
                            } else if (wdsVar instanceof pds) {
                                ((lsx) yfu0Var5).g.setImageResource(((pds) wdsVar).f26821a);
                            } else if (wdsVar instanceof qds) {
                                ((lsx) yfu0Var5).i.setImageResource(((qds) wdsVar).f28549a);
                            } else if (wdsVar instanceof ids) {
                                ((lsx) yfu0Var5).s.setText(((ids) wdsVar).f14600a);
                            } else if (wdsVar instanceof kds) {
                                List list8 = u0d.f34849a;
                                u0d.n(((lsx) yfu0Var5).b, ((kds) wdsVar).f18120a, 0, 11);
                            } else if (wdsVar instanceof mds) {
                                List list9 = u0d.f34849a;
                                u0d.n(((lsx) yfu0Var5).j, ((mds) wdsVar).f21612a, 0, 11);
                            } else if (wdsVar instanceof sds) {
                                List list10 = u0d.f34849a;
                                u0d.n(((lsx) yfu0Var5).c, ((sds) wdsVar).f32045a, 0, 11);
                            } else {
                                if (!(wdsVar instanceof uds)) {
                                    t9f.b();
                                    return null;
                                }
                                List list11 = u0d.f34849a;
                                u0d.n(((lsx) yfu0Var5).k, ((uds) wdsVar).f35493a, 0, 11);
                            }
                        }
                    }
                    return Unit.f46060a;
                }
                uca ucaVar = (uca) cpVar3.u();
                SpannableString spannableStringB = ucaVar.d.b(cpVar3.w);
                int length = spannableStringB.length();
                yfu0 yfu0Var6 = cpVar3.u;
                if (length > 0) {
                    lsx lsxVar = (lsx) yfu0Var6;
                    lsxVar.r.setVisibility(0);
                    lsxVar.r.setText(spannableStringB);
                    i = 8;
                } else {
                    i = 8;
                    ((lsx) yfu0Var6).r.setVisibility(8);
                }
                ohm0 ohm0Var = ucaVar.c;
                if (ohm0Var instanceof spp0) {
                    spp0 spp0Var = (spp0) ohm0Var;
                    lsx lsxVar2 = (lsx) yfu0Var6;
                    lsxVar2.e.setVisibility(i);
                    RoundCornerImageView roundCornerImageView = lsxVar2.m;
                    ImageView imageView = lsxVar2.i;
                    ImageView imageView2 = lsxVar2.g;
                    ImageView imageView3 = lsxVar2.h;
                    ImageView imageView4 = lsxVar2.f;
                    roundCornerImageView.setVisibility(i);
                    lsxVar2.d.setVisibility(i);
                    lsxVar2.l.setVisibility(i);
                    lsxVar2.n.setVisibility(0);
                    lsxVar2.o.setVisibility(0);
                    imageView4.setVisibility((((uca) cpVar3.u()).h || ((uca) cpVar3.u()).f) ? 8 : 0);
                    imageView3.setVisibility((((uca) cpVar3.u()).h || ((uca) cpVar3.u()).f) ? 8 : 0);
                    imageView2.setVisibility((((uca) cpVar3.u()).h || ((uca) cpVar3.u()).f) ? 8 : 0);
                    imageView.setVisibility((((uca) cpVar3.u()).h || ((uca) cpVar3.u()).f) ? 8 : 0);
                    List list12 = u0d.f34849a;
                    u0d.n(lsxVar2.b, spp0Var.i, 0, 11);
                    u0d.n(lsxVar2.j, spp0Var.j, 0, 11);
                    u0d.n(lsxVar2.c, spp0Var.k, 0, 11);
                    u0d.n(lsxVar2.k, spp0Var.l, 0, 11);
                    imageView4.setImageResource(spp0Var.m);
                    imageView3.setImageResource(spp0Var.n);
                    imageView2.setImageResource(spp0Var.o);
                    imageView.setImageResource(spp0Var.p);
                    lsxVar2.p.setText(spp0Var.q);
                    lsxVar2.u.setText(spp0Var.r);
                } else {
                    if (!(ohm0Var instanceof tpp0)) {
                        t9f.b();
                        return null;
                    }
                    tpp0 tpp0Var = (tpp0) ohm0Var;
                    lsx lsxVar3 = (lsx) yfu0Var6;
                    lsxVar3.e.setVisibility(0);
                    RoundCornerImageView roundCornerImageView2 = lsxVar3.m;
                    RoundCornerImageView roundCornerImageView3 = lsxVar3.e;
                    ImageView imageView5 = lsxVar3.l;
                    ImageView imageView6 = lsxVar3.d;
                    roundCornerImageView2.setVisibility(0);
                    imageView6.setVisibility((((uca) cpVar3.u()).h || ((uca) cpVar3.u()).f) ? 8 : 0);
                    imageView5.setVisibility((((uca) cpVar3.u()).h || ((uca) cpVar3.u()).f) ? 8 : 0);
                    lsxVar3.n.setVisibility(8);
                    lsxVar3.o.setVisibility(8);
                    if (((uca) cpVar3.u()).f) {
                        roundCornerImageView3.setImageResource(R.drawable.ic_glyph_color_logo_home);
                        roundCornerImageView2.setImageResource(R.drawable.ic_glyph_color_logo_away);
                    } else {
                        List list13 = u0d.f34849a;
                        u0d.n(roundCornerImageView3, tpp0Var.e, 0, 11);
                        u0d.n(roundCornerImageView2, tpp0Var.f, 0, 11);
                    }
                    imageView6.setImageResource(tpp0Var.g);
                    imageView5.setImageResource(tpp0Var.h);
                    lsxVar3.p.setText(tpp0Var.i);
                    lsxVar3.u.setText(tpp0Var.j);
                }
                lsx lsxVar4 = (lsx) yfu0Var6;
                AppCompatTextView appCompatTextView = lsxVar4.s;
                AppCompatTextView appCompatTextView2 = lsxVar4.t;
                appCompatTextView.setMaxLines(1);
                appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                ViewGroup.LayoutParams layoutParams = appCompatTextView.getLayoutParams();
                layoutParams.getClass();
                a3e a3eVar = (a3e) layoutParams;
                ((ViewGroup.MarginLayoutParams) a3eVar).height = -2;
                appCompatTextView.setLayoutParams(a3eVar);
                lsxVar4.s.setText(ucaVar.e);
                jwb.y(appCompatTextView2);
                appCompatTextView2.setText(ucaVar.b);
                lsxVar4.w.u(ucaVar.g);
                lsxVar4.f20602a.setLayoutDirection(((uca) cpVar3.u()).j ? 2 : 0);
                return Unit.f46060a;
            case 4:
                List list14 = (List) obj;
                list14.getClass();
                if (!list14.isEmpty()) {
                    ArrayList<List> arrayList6 = new ArrayList();
                    for (Object obj7 : list14) {
                        obj7.getClass();
                        w3d.u(arrayList6, (Collection) obj7);
                    }
                    for (List list15 : arrayList6) {
                        ArrayList<oes> arrayList7 = new ArrayList();
                        for (Object obj8 : list15) {
                            if (obj8 instanceof oes) {
                                arrayList7.add(obj8);
                            }
                        }
                        for (oes oesVar : arrayList7) {
                            Context context2 = cpVar2.w;
                            yfu0 yfu0Var7 = cpVar2.u;
                            oesVar.getClass();
                            if (oesVar instanceof xds) {
                                ((lsx) yfu0Var7).s.setText(((xds) oesVar).f40710a.b(context2));
                            } else if (oesVar instanceof yds) {
                                lsx lsxVar5 = (lsx) yfu0Var7;
                                String string = lsxVar5.t.getText().toString();
                                ank0 ank0Var = ((yds) oesVar).f42454a;
                                String strA = ank0Var.a();
                                Regex regex = new Regex("\\d+");
                                int iC0 = CollectionsKt.C0(pgi0.t(pgi0.p(Regex.d(regex, string), new d69((byte) 11))));
                                int iC1 = CollectionsKt.C0(pgi0.t(pgi0.p(Regex.d(regex, strA), new d69((byte) 12))));
                                AppCompatTextView appCompatTextView3 = lsxVar5.t;
                                if (iC0 < iC1) {
                                    appCompatTextView3.setText(ank0Var.b(context2));
                                } else {
                                    appCompatTextView3.setText(kotlin.text.c.r(ank0Var.a(), ", ", "", false));
                                }
                            } else if (oesVar instanceof nes) {
                                ((lsx) yfu0Var7).w.u(((nes) oesVar).f23402a);
                            } else if (oesVar instanceof ces) {
                                nia0.c0(((ces) oesVar).f4227a, ((lsx) yfu0Var7).q);
                            } else if (oesVar instanceof les) {
                                nia0.c0(((les) oesVar).f19919a, ((lsx) yfu0Var7).v);
                            } else if (oesVar instanceof zds) {
                                ((lsx) yfu0Var7).d.setImageResource(((zds) oesVar).f44222a);
                            } else if (oesVar instanceof ies) {
                                ((lsx) yfu0Var7).l.setImageResource(((ies) oesVar).f14649a);
                            } else if (oesVar instanceof ees) {
                                ((lsx) yfu0Var7).f.setImageResource(((ees) oesVar).f7687a);
                            } else if (oesVar instanceof fes) {
                                ((lsx) yfu0Var7).h.setImageResource(((fes) oesVar).f9419a);
                            } else if (oesVar instanceof ges) {
                                ((lsx) yfu0Var7).g.setImageResource(((ges) oesVar).f11170a);
                            } else if (oesVar instanceof hes) {
                                ((lsx) yfu0Var7).i.setImageResource(((hes) oesVar).f12937a);
                            } else if (oesVar instanceof aes) {
                                List list16 = u0d.f34849a;
                                u0d.n(((lsx) yfu0Var7).b, ((aes) oesVar).f744a, 0, 11);
                            } else if (oesVar instanceof des) {
                                List list17 = u0d.f34849a;
                                u0d.n(((lsx) yfu0Var7).j, ((des) oesVar).f5964a, 0, 11);
                            } else if (oesVar instanceof jes) {
                                List list18 = u0d.f34849a;
                                u0d.n(((lsx) yfu0Var7).c, ((jes) oesVar).f16390a, 0, 11);
                            } else if (oesVar instanceof mes) {
                                List list19 = u0d.f34849a;
                                u0d.n(((lsx) yfu0Var7).k, ((mes) oesVar).f21662a, 0, 11);
                            } else if (oesVar instanceof bes) {
                                List list20 = u0d.f34849a;
                                u0d.n(((lsx) yfu0Var7).e, ((bes) oesVar).f2466a, 0, 11);
                            } else {
                                if (!(oesVar instanceof kes)) {
                                    t9f.b();
                                    return null;
                                }
                                List list21 = u0d.f34849a;
                                u0d.n(((lsx) yfu0Var7).m, ((kes) oesVar).f18167a, 0, 11);
                            }
                        }
                    }
                    return Unit.f46060a;
                }
                yca ycaVar = (yca) cpVar3.u();
                ank0 ank0Var2 = ycaVar.f;
                Context context3 = cpVar3.w;
                SpannableString spannableStringB2 = ank0Var2.b(context3);
                int length2 = spannableStringB2.length();
                yfu0 yfu0Var8 = cpVar3.u;
                if (length2 > 0) {
                    lsx lsxVar6 = (lsx) yfu0Var8;
                    lsxVar6.r.setVisibility(0);
                    lsxVar6.r.setText(spannableStringB2);
                } else {
                    ((lsx) yfu0Var8).r.setVisibility(8);
                }
                lsx lsxVar7 = (lsx) yfu0Var8;
                AppCompatTextView appCompatTextView4 = lsxVar7.t;
                AppCompatTextView appCompatTextView5 = lsxVar7.s;
                AppCompatTextView appCompatTextView6 = lsxVar7.u;
                AppCompatTextView appCompatTextView7 = lsxVar7.p;
                ConstraintLayout constraintLayout = lsxVar7.o;
                ConstraintLayout constraintLayout2 = lsxVar7.n;
                RoundCornerImageView roundCornerImageView4 = lsxVar7.e;
                RoundCornerImageView roundCornerImageView5 = lsxVar7.m;
                ImageView imageView7 = lsxVar7.l;
                ImageView imageView8 = lsxVar7.d;
                jwb.z(appCompatTextView4);
                lsxVar7.t.setText(ycaVar.b.b(context3));
                ohm0 ohm0Var2 = ycaVar.c;
                if (ohm0Var2 instanceof tpp0) {
                    tpp0 tpp0Var2 = (tpp0) ohm0Var2;
                    imageView8.setImageResource(tpp0Var2.g);
                    imageView7.setImageResource(tpp0Var2.h);
                    imageView8.setVisibility((((yca) cpVar3.u()).j || ((yca) cpVar3.u()).h) ? 8 : 0);
                    imageView7.setVisibility((((yca) cpVar3.u()).j || ((yca) cpVar3.u()).h) ? 8 : 0);
                    roundCornerImageView4.setVisibility(0);
                    roundCornerImageView5.setVisibility(0);
                    constraintLayout2.setVisibility(8);
                    constraintLayout.setVisibility(8);
                    appCompatTextView7.setText(tpp0Var2.i);
                    appCompatTextView6.setText(tpp0Var2.j);
                    if (((yca) cpVar3.u()).h) {
                        roundCornerImageView4.setImageResource(R.drawable.ic_glyph_color_logo_home);
                        roundCornerImageView5.setImageResource(R.drawable.ic_glyph_color_logo_away);
                    } else {
                        List list22 = u0d.f34849a;
                        u0d.n(roundCornerImageView4, tpp0Var2.e, 0, 11);
                        u0d.n(roundCornerImageView5, tpp0Var2.f, 0, 11);
                    }
                    cpVar = cpVar3;
                } else {
                    if (!(ohm0Var2 instanceof spp0)) {
                        t9f.b();
                        return null;
                    }
                    spp0 spp0Var2 = (spp0) ohm0Var2;
                    roundCornerImageView4.setVisibility(8);
                    ImageView imageView9 = lsxVar7.i;
                    ImageView imageView10 = lsxVar7.g;
                    cpVar = cpVar3;
                    ImageView imageView11 = lsxVar7.h;
                    ImageView imageView12 = lsxVar7.f;
                    roundCornerImageView5.setVisibility(8);
                    imageView8.setVisibility(8);
                    imageView7.setVisibility(8);
                    constraintLayout2.setVisibility(0);
                    constraintLayout.setVisibility(0);
                    appCompatTextView7.setText(spp0Var2.q);
                    appCompatTextView6.setText(spp0Var2.r);
                    imageView12.setVisibility((((yca) cpVar.u()).j || ((yca) cpVar.u()).h) ? 8 : 0);
                    imageView12.setImageResource(spp0Var2.m);
                    imageView11.setVisibility((((yca) cpVar.u()).j || ((yca) cpVar.u()).h) ? 8 : 0);
                    imageView11.setImageResource(spp0Var2.n);
                    imageView10.setVisibility((((yca) cpVar.u()).j || ((yca) cpVar.u()).h) ? 8 : 0);
                    imageView10.setImageResource(spp0Var2.o);
                    imageView9.setVisibility((((yca) cpVar.u()).j || ((yca) cpVar.u()).h) ? 8 : 0);
                    imageView9.setImageResource(spp0Var2.p);
                    List list23 = u0d.f34849a;
                    u0d.n(lsxVar7.b, spp0Var2.i, 0, 11);
                    u0d.n(lsxVar7.j, spp0Var2.j, 0, 11);
                    u0d.n(lsxVar7.c, spp0Var2.k, 0, 11);
                    u0d.n(lsxVar7.k, spp0Var2.l, 0, 11);
                }
                nia0.c0(ycaVar.d, lsxVar7.q);
                nia0.c0(ycaVar.e, lsxVar7.v);
                jwb.A(appCompatTextView5);
                appCompatTextView5.setText(ycaVar.g.b(context3));
                lsxVar7.w.u(ycaVar.i);
                lsxVar7.f20602a.setLayoutDirection(((yca) cpVar.u()).l ? 2 : 0);
                return Unit.f46060a;
            case 5:
                List list24 = (List) obj;
                list24.getClass();
                if (list24.isEmpty()) {
                    jda jdaVar = (jda) cpVar3.u();
                    String str = jdaVar.b;
                    String str2 = jdaVar.e;
                    int length3 = str.length();
                    yfu0 yfu0Var9 = cpVar3.u;
                    if (length3 > 0) {
                        nsx nsxVar = (nsx) yfu0Var9;
                        nsxVar.b.setVisibility(0);
                        nsxVar.b.setText(str);
                    } else {
                        ((nsx) yfu0Var9).b.setVisibility(8);
                    }
                    nsx nsxVar2 = (nsx) yfu0Var9;
                    nsxVar2.c.setText(jdaVar.c);
                    nsxVar2.e.u(jdaVar.f);
                    int length4 = str2.length();
                    TextView textView = nsxVar2.d;
                    if (length4 > 0) {
                        textView.setText(str2);
                    } else {
                        rdj rdjVar = rdj.f30294a;
                        textView.setText(rdj.g(new znq0(jdaVar.d), efj.UNIVERSAL, Boolean.valueOf(DateFormat.is24HourFormat(cpVar3.w)), false, 56));
                    }
                } else {
                    ArrayList<List> arrayList8 = new ArrayList();
                    for (Object obj9 : list24) {
                        obj9.getClass();
                        w3d.u(arrayList8, (Collection) obj9);
                    }
                    for (List list25 : arrayList8) {
                        ArrayList<nfs> arrayList9 = new ArrayList();
                        for (Object obj10 : list25) {
                            if (obj10 instanceof nfs) {
                                arrayList9.add(obj10);
                            }
                        }
                        for (nfs nfsVar : arrayList9) {
                            nfsVar.getClass();
                            if (!(nfsVar instanceof nfs)) {
                                t9f.b();
                                return null;
                            }
                            ((nsx) cpVar2.u).e.u(nfsVar.f23451a);
                        }
                    }
                }
                return Unit.f46060a;
            case 6:
                List list26 = (List) obj;
                list26.getClass();
                if (list26.isEmpty()) {
                    ((psx) cpVar3.u).b.setText(((kfa) cpVar3.u()).b);
                } else {
                    ArrayList<List> arrayList10 = new ArrayList();
                    for (Object obj11 : list26) {
                        obj11.getClass();
                        w3d.u(arrayList10, (Collection) obj11);
                    }
                    for (List list27 : arrayList10) {
                        ArrayList<xes> arrayList11 = new ArrayList();
                        for (Object obj12 : list27) {
                            if (obj12 instanceof xes) {
                                arrayList11.add(obj12);
                            }
                        }
                        for (xes xesVar : arrayList11) {
                            xesVar.getClass();
                            ((psx) cpVar2.u).b.setText(xesVar.f40758a);
                        }
                    }
                }
                return Unit.f46060a;
            case 7:
                List list28 = (List) obj;
                list28.getClass();
                if (!list28.isEmpty()) {
                    ArrayList<List> arrayList12 = new ArrayList();
                    for (Object obj13 : list28) {
                        obj13.getClass();
                        w3d.u(arrayList12, (Collection) obj13);
                    }
                    for (List list29 : arrayList12) {
                        ArrayList<wes> arrayList13 = new ArrayList();
                        for (Object obj14 : list29) {
                            if (obj14 instanceof wes) {
                                arrayList13.add(obj14);
                            }
                        }
                        for (wes wesVar : arrayList13) {
                            Context context4 = cpVar2.w;
                            yfu0 yfu0Var10 = cpVar2.u;
                            if (wesVar != null) {
                                if (wesVar instanceof qes) {
                                    ((osx) yfu0Var10).c.setImageResource(((qes) wesVar).f28598a);
                                } else if (wesVar instanceof tes) {
                                    ((osx) yfu0Var10).e.setImageResource(((tes) wesVar).f33836a);
                                } else if (wesVar instanceof res) {
                                    List list30 = u0d.f34849a;
                                    u0d.n(((osx) yfu0Var10).d, ((res) wesVar).f30351a, 0, 11);
                                } else if (wesVar instanceof ues) {
                                    List list31 = u0d.f34849a;
                                    u0d.n(((osx) yfu0Var10).f, ((ues) wesVar).f35544a, 0, 11);
                                } else if (wesVar instanceof ses) {
                                    ((osx) yfu0Var10).j.setText(((ses) wesVar).f32088a.b(context4));
                                } else if (wesVar instanceof ves) {
                                    ((osx) yfu0Var10).n.setText(((ves) wesVar).f37299a.b(context4));
                                } else if (wesVar instanceof pes) {
                                    ((osx) yfu0Var10).l.setText(((pes) wesVar).f26868a.b(context4));
                                }
                            }
                            t9f.b();
                            return null;
                        }
                    }
                }
                yfu0 yfu0Var11 = cpVar3.u;
                osx osxVar = (osx) yfu0Var11;
                TextView textView2 = osxVar.k;
                ank0 ank0Var3 = ((qca) cpVar3.u()).b;
                Context context5 = cpVar3.w;
                textView2.setText(ank0Var3.b(context5));
                List list32 = u0d.f34849a;
                u0d.n(osxVar.d, ((qca) cpVar3.u()).d.q(), 0, 11);
                u0d.n(osxVar.f, ((qca) cpVar3.u()).d.v(), 0, 11);
                AppCompatTextView appCompatTextView8 = osxVar.j;
                jwb.z(appCompatTextView8);
                appCompatTextView8.setText(((qca) cpVar3.u()).e.b(context5));
                AppCompatTextView appCompatTextView9 = osxVar.n;
                jwb.z(appCompatTextView9);
                appCompatTextView9.setText(((qca) cpVar3.u()).f.b(context5));
                osxVar.i.setText(((qca) cpVar3.u()).d.r());
                osxVar.m.setText(((qca) cpVar3.u()).d.w());
                osxVar.c.setImageResource(((qca) cpVar3.u()).d.o());
                osxVar.e.setImageResource(((qca) cpVar3.u()).d.t());
                osxVar.l.setText(((qca) cpVar3.u()).c.b(context5));
                ((osx) yfu0Var11).f25804a.setLayoutDirection(((qca) cpVar3.u()).h ? 2 : 0);
                return Unit.f46060a;
            case 8:
                return a(obj);
            case 9:
                return b(obj);
            case 10:
                return c(obj);
            case 11:
                return g(obj);
            case 12:
                return h(obj);
            case 13:
                return i(obj);
            case 14:
                return l(obj);
            case 15:
                return m(obj);
            case 16:
                return o(obj);
            case 17:
                return p(obj);
            case 18:
                return r(obj);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return s(obj);
            case 20:
                return t(obj);
            case 21:
                return u(obj);
            case 22:
                return v(obj);
            case 23:
                return w(obj);
            case 24:
                return x(obj);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return y(obj);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return z(obj);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return A(obj);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return B(obj);
            default:
                List list33 = (List) obj;
                list33.getClass();
                if (list33.isEmpty()) {
                    vcc.d0(((jg3) cpVar3.u).b, ((e1l) cpVar3.u()).f7041a);
                } else {
                    ArrayList arrayList14 = new ArrayList();
                    for (Object obj15 : list33) {
                        obj15.getClass();
                        w3d.u(arrayList14, (Collection) obj15);
                    }
                    Iterator it2 = arrayList14.iterator();
                    while (it2.hasNext()) {
                        if (((d1l) it2.next()) == null) {
                            t9f.b();
                            return null;
                        }
                        vcc.d0(((jg3) cpVar2.u).b, ((e1l) cpVar2.u()).f7041a);
                    }
                }
                return Unit.f46060a;
        }
    }
}

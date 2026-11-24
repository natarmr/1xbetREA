package a;

import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textview.MaterialTextView;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.top.impl.utils.nested_list_scroll_anchor_holder.model.ScrollPosition;
import org.xplatform.uikit.components.cells.DsMenuCell;
import org.xplatform.uikit.components.cells.left.DsCellLeftIcon;
import org.xplatform.uikit.components.cells.middle.DsCellMiddleTitle;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class rj50 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f30576a;

    public /* synthetic */ rj50(byte b) {
        this.f30576a = b;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x013e  */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        q9h0 q9h0Var;
        boolean z = false;
        switch (this.f30576a) {
            case 0:
                qj50 qj50Var = (qj50) obj2;
                ((azg0) obj).getClass();
                qj50Var.getClass();
                LinkedHashMap linkedHashMap = qj50Var.f28820a;
                ArrayList<jzg0> arrayList = new ArrayList();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    Object key = entry.getKey();
                    oj50 oj50Var = (oj50) entry.getValue();
                    bch0 bch0Var = oj50Var.b;
                    q9h0 q9h0Var2 = oj50Var.f25345a;
                    if (bch0Var != null) {
                        if (bch0Var instanceof xcz) {
                            xcz xczVar = (xcz) bch0Var;
                            q9h0Var = new q9h0(xczVar.h(), xczVar.i());
                        } else if (bch0Var instanceof d9z) {
                            d9z d9zVar = (d9z) bch0Var;
                            q9h0Var = new q9h0(d9zVar.h(), d9zVar.i());
                        } else if (bch0Var instanceof mez) {
                            mez mezVar = (mez) bch0Var;
                            q9h0Var = new q9h0(mezVar.g(), mezVar.h());
                        } else {
                            q9h0Var = new q9h0(0, 0);
                        }
                        if (!q9h0Var.equals(new q9h0(0, 0)) || oj50Var.c) {
                            q9h0Var2 = q9h0Var;
                        }
                    }
                    jzg0 jzg0Var = q9h0Var2.equals(new q9h0(0, 0)) ? null : new jzg0(q9h0Var2.f28347a, q9h0Var2.b, key);
                    if (jzg0Var != null) {
                        arrayList.add(jzg0Var);
                    }
                }
                ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
                for (jzg0 jzg0Var2 : arrayList) {
                    arrayList2.add(new ScrollPosition((Parcelable) jzg0Var2.f17411a, jzg0Var2.b, jzg0Var2.c));
                }
                return arrayList2;
            case 1:
                ViewGroup viewGroup = (ViewGroup) obj2;
                View viewF = rw2.f((LayoutInflater) obj, viewGroup, R.layout.delegate_new_messages_label, viewGroup, false);
                if (((TextView) yum0.f(viewF, R.id.txtMessage)) != null) {
                    return new vr9((LinearLayout) viewF, (byte) 1);
                }
                hny.u("Missing required view with ID: ".concat(viewF.getResources().getResourceName(R.id.txtMessage)));
                return null;
            case 2:
                ((Integer) obj).getClass();
                return Unit.f46060a;
            case 3:
                ((Integer) obj).getClass();
                return Unit.f46060a;
            case 4:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 5:
                ((Integer) obj).getClass();
                return Unit.f46060a;
            case 6:
                b1j.z((String) obj2, (Throwable) obj);
                return Unit.f46060a;
            case 7:
                ((Integer) obj2).getClass();
                q5x.g(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 8:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 9:
                return Unit.f46060a;
            case 10:
                pw50 pw50Var = (pw50) obj2;
                ((oyg0) obj).getClass();
                pw50Var.getClass();
                return pw50.a(pw50Var, false, false, false, 0, null, null, null, 105);
            case 11:
                pw50 pw50Var2 = (pw50) obj2;
                ((oyg0) obj).getClass();
                pw50Var2.getClass();
                return pw50.a(pw50Var2, false, false, true, 0, null, null, null, 121);
            case 12:
                ((Integer) obj).intValue();
                d160 d160Var = (d160) obj2;
                d160Var.getClass();
                return d160Var.c;
            case 13:
                q060 q060Var = (q060) obj2;
                ((oyg0) obj).getClass();
                q060Var.getClass();
                return q060.a(q060Var, null, null, null, null, null, 1791);
            case 14:
                b1j.z((String) obj2, (Throwable) obj);
                return Unit.f46060a;
            case 15:
                Integer num = (Integer) obj;
                int iIntValue = num.intValue();
                p6t0 p6t0Var = (p6t0) obj2;
                p6t0Var.getClass();
                if (p6t0Var instanceof nt0) {
                    return ((nt0) p6t0Var).getKey();
                }
                if (p6t0Var instanceof rt0) {
                    return ((rt0) p6t0Var).getKey();
                }
                if (p6t0Var instanceof rfp) {
                    return p6t0Var.getKey();
                }
                if (p6t0Var instanceof sfp) {
                    return p6t0Var.getKey();
                }
                if (p6t0Var instanceof w360) {
                    return twn.m(iIntValue, ((w360) p6t0Var).b);
                }
                if (p6t0Var instanceof mbo) {
                    return ((mbo) p6t0Var).f21519a.getKey();
                }
                if (p6t0Var instanceof flw) {
                    return ((flw) p6t0Var).getKey();
                }
                if (p6t0Var instanceof nlw) {
                    return ((nlw) p6t0Var).getKey();
                }
                if (p6t0Var instanceof llw) {
                    return ((llw) p6t0Var).getKey();
                }
                return p6t0Var instanceof mlw ? ((mlw) p6t0Var).getKey() : num;
            case 16:
                Integer num2 = (Integer) obj;
                num2.getClass();
                fdp fdpVar = (fdp) obj2;
                fdpVar.getClass();
                return fdpVar instanceof edp ? ((edp) fdpVar).b : num2;
            case 17:
                b1j.z((String) obj2, (Throwable) obj);
                return Unit.f46060a;
            case 18:
                c260 c260Var = (c260) obj2;
                ((oyg0) obj).getClass();
                c260Var.getClass();
                return c260.a(c260Var, null, false, false, false, null, false, null, null, null, null, 262135);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                b1j.z((String) obj2, (Throwable) obj);
                return Unit.f46060a;
            case 20:
                Function1 function1 = (Function1) obj;
                Function1 function2 = (Function1) obj2;
                function1.getClass();
                function2.getClass();
                function1.invoke(new mb50((byte) 19));
                function2.invoke(new th50((byte) 14));
                return Unit.f46060a;
            case 21:
                Function1 function3 = (Function1) obj;
                Function1 function4 = (Function1) obj2;
                function3.getClass();
                function4.getClass();
                function3.invoke(new mb50((byte) 18));
                function4.invoke(new th50((byte) 13));
                return Unit.f46060a;
            case 22:
                ((Integer) obj).getClass();
                o8w o8wVar = (o8w) obj2;
                o8wVar.getClass();
                return o8wVar.getKey();
            case 23:
                o1d0 o1d0Var = (o1d0) obj;
                o1d0 o1d0Var2 = (o1d0) obj2;
                o1d0Var.getClass();
                o1d0Var2.getClass();
                if (o1d0Var.a() == o1d0Var2.a()) {
                    if (o1d0Var.getClass().equals(o1d0Var2.getClass())) {
                        z = true;
                    } else if ((o1d0Var instanceof m1d0) && (o1d0Var2 instanceof m1d0)) {
                        m1d0 m1d0Var = (m1d0) o1d0Var2;
                        m1d0 m1d0Var2 = (m1d0) o1d0Var;
                        if (m1d0Var2.d == m1d0Var.d && Intrinsics.d(m1d0Var2.b, m1d0Var.b) && Intrinsics.d(m1d0Var2.c, m1d0Var.c)) {
                            z = true;
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 24:
                ((Integer) obj2).getClass();
                xdx.f(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((Integer) obj2).getClass();
                xdx.f(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ViewGroup viewGroup2 = (ViewGroup) obj2;
                View viewF2 = rw2.f((LayoutInflater) obj, viewGroup2, R.layout.ui_kit_onboarding_sections_list_item, viewGroup2, false);
                int i = R.id.cliIcon;
                DsCellLeftIcon dsCellLeftIcon = (DsCellLeftIcon) yum0.f(viewF2, R.id.cliIcon);
                if (dsCellLeftIcon != null) {
                    i = R.id.cmtTitle;
                    DsCellMiddleTitle dsCellMiddleTitle = (DsCellMiddleTitle) yum0.f(viewF2, R.id.cmtTitle);
                    if (dsCellMiddleTitle != null) {
                        return new t6t0((DsMenuCell) viewF2, dsCellLeftIcon, dsCellMiddleTitle);
                    }
                }
                hny.u("Missing required view with ID: ".concat(viewF2.getResources().getResourceName(i)));
                return null;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ViewGroup viewGroup3 = (ViewGroup) obj2;
                View viewF3 = rw2.f((LayoutInflater) obj, viewGroup3, R.layout.item_onboarding_delegate, viewGroup3, false);
                int i2 = R.id.imageViewPreview;
                AppCompatImageView appCompatImageView = (AppCompatImageView) yum0.f(viewF3, R.id.imageViewPreview);
                if (appCompatImageView != null) {
                    i2 = R.id.textViewDescription;
                    MaterialTextView materialTextView = (MaterialTextView) yum0.f(viewF3, R.id.textViewDescription);
                    if (materialTextView != null) {
                        i2 = R.id.textViewTitle;
                        MaterialTextView materialTextView2 = (MaterialTextView) yum0.f(viewF3, R.id.textViewTitle);
                        if (materialTextView2 != null) {
                            return new nwx((ConstraintLayout) viewF3, appCompatImageView, materialTextView, materialTextView2);
                        }
                    }
                }
                hny.u("Missing required view with ID: ".concat(viewF3.getResources().getResourceName(i2)));
                return null;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                i8z i8zVar = (i8z) obj;
                ((Integer) obj2).getClass();
                i8zVar.getClass();
                uzb.U(i8zVar, new gtr(true), null, null, null, 14);
                return Unit.f46060a;
            default:
                w370 w370Var = (w370) obj2;
                ((oyg0) obj).getClass();
                w370Var.getClass();
                return w370.a(w370Var, false, false, null, rc50.a(w370Var.d, false, false, false, null, 55), null, tdt.a(w370Var.f, null, null, null, 0, 0, 7), null, false, false, false, false, 16343);
        }
    }

    public /* synthetic */ rj50(int i, byte b) {
        this.f30576a = b;
    }
}

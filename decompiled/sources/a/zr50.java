package a;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.card.MaterialCardView;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class zr50 extends v46 {
    public final /* synthetic */ byte u = 1;
    public final Object v;
    public final Object w;
    public final Object x;
    public Object y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zr50(View view, p0z p0zVar, b530 b530Var) {
        super(view);
        p0zVar.getClass();
        b530Var.getClass();
        this.v = p0zVar;
        this.w = b530Var;
        int i = R.id.all_view;
        TextView textView = (TextView) yum0.f(view, R.id.all_view);
        if (textView != null) {
            i = R.id.catalog_recycler_view;
            RecyclerView recyclerView = (RecyclerView) yum0.f(view, R.id.catalog_recycler_view);
            if (recyclerView != null) {
                i = R.id.title_view;
                TextView textView2 = (TextView) yum0.f(view, R.id.title_view);
                if (textView2 != null) {
                    this.x = new dc3((ViewGroup) view, textView, (View) recyclerView, (View) textView2, (byte) 6);
                    GridLayoutManager gridLayoutManager = new GridLayoutManager(view.getContext(), 2, 0, false);
                    this.y = gridLayoutManager;
                    nhe0 nhe0Var = new nhe0();
                    recyclerView.setLayoutManager(gridLayoutManager);
                    recyclerView.setRecycledViewPool(nhe0Var);
                    return;
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        throw null;
    }

    @Override // a.v46
    public final void t(Object obj) {
        int iA;
        byte b = this.u;
        Object obj2 = this.x;
        byte b2 = 1;
        Object obj3 = this.v;
        switch (b) {
            case 0:
                ct5 ct5Var = (ct5) obj;
                ct5Var.getClass();
                j6j j6jVar = (j6j) obj2;
                View view = this.f40887a;
                view.getClass();
                RecyclerView recyclerView = (RecyclerView) obj3;
                recyclerView.post(new kjn(view, j6jVar.e, recyclerView, this, ct5Var));
                view.setOnClickListener(new wg(this, ct5Var, (byte) 29));
                j6jVar.d.setText(ct5Var.d);
                j6jVar.c.setText(ct5Var.e);
                break;
            case 1:
                qn50 qn50Var = (qn50) obj;
                qn50Var.getClass();
                kj5 kj5Var = uo5.b;
                bt5 bt5Var = qn50Var.b;
                int i = bt5Var.f3165a;
                kj5Var.getClass();
                as50 as50Var = new as50(new ba30(this, kj5.f(i), (byte) 27));
                dc3 dc3Var = (dc3) obj2;
                ((RecyclerView) dc3Var.c).setAdapter(as50Var);
                ((TextView) dc3Var.d).setText(bt5Var.b);
                TextView textView = (TextView) dc3Var.e;
                ArrayList arrayList = qn50Var.c;
                textView.setVisibility(arrayList.size() < 3 ? 8 : 0);
                textView.setOnClickListener(new bs50(this, qn50Var, b2));
                ((GridLayoutManager) this.y).m1 = new eo6(qn50Var, (byte) 2);
                as50Var.G(arrayList);
                break;
            default:
                ygq0 ygq0Var = (ygq0) obj;
                ygq0Var.getClass();
                lth lthVar = (lth) this.y;
                TextView textView2 = lthVar.c;
                View view2 = (View) obj3;
                String string = view2.getContext().getString(ipm0.i(ygq0Var));
                string.getClass();
                Locale locale = Locale.getDefault();
                locale.getClass();
                if (string.length() > 0) {
                    char cCharAt = string.charAt(0);
                    if (Character.isLowerCase(cCharAt)) {
                        StringBuilder sb = new StringBuilder();
                        char titleCase = Character.toTitleCase(cCharAt);
                        if (titleCase != Character.toUpperCase(cCharAt)) {
                            sb.append(titleCase);
                        } else {
                            String upperCase = string.substring(0, 1).toUpperCase(locale);
                            upperCase.getClass();
                            sb.append(upperCase);
                        }
                        sb.append(string.substring(1));
                        string = sb.toString();
                    }
                }
                textView2.setText(string);
                TextView textView3 = lthVar.c;
                if (((ygq0) this.w) == ygq0Var) {
                    TypedValue typedValue = j5d.f15927a;
                    Context context = view2.getContext();
                    context.getClass();
                    iA = j5d.a(context, R.attr.uikitPrimary, false);
                } else {
                    TypedValue typedValue2 = j5d.f15927a;
                    Context context2 = view2.getContext();
                    context2.getClass();
                    iA = j5d.a(context2, R.attr.uikitTextPrimary, false);
                }
                textView3.setTextColor(iA);
                view2.setOnClickListener(new bs50((Object) this, (Object) ygq0Var, (byte) 17));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zr50(View view, ygq0 ygq0Var, Function1 function1) {
        super(view);
        view.getClass();
        ygq0Var.getClass();
        this.v = view;
        this.w = ygq0Var;
        this.x = function1;
        LinearLayout linearLayout = (LinearLayout) view;
        TextView textView = (TextView) yum0.f(view, R.id.time_title);
        if (textView != null) {
            this.y = new lth(linearLayout, textView, (byte) 0);
        } else {
            hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.time_title)));
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zr50(View view, RecyclerView recyclerView, jt50 jt50Var) {
        super(view);
        view.getClass();
        this.v = recyclerView;
        this.w = jt50Var;
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i = R.id.ivShowcaseBanner;
        ImageView imageView = (ImageView) yum0.f(view, R.id.ivShowcaseBanner);
        if (imageView != null) {
            i = R.id.materialCardView;
            if (((MaterialCardView) yum0.f(view, R.id.materialCardView)) != null) {
                i = R.id.tvShowcaseDescr;
                TextView textView = (TextView) yum0.f(view, R.id.tvShowcaseDescr);
                if (textView != null) {
                    i = R.id.tvShowcaseText;
                    TextView textView2 = (TextView) yum0.f(view, R.id.tvShowcaseText);
                    if (textView2 != null) {
                        this.x = new j6j(constraintLayout, imageView, textView, textView2, (byte) 3);
                        return;
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        throw null;
    }
}

package a;

import android.content.Context;
import android.text.Html;
import android.text.Spanned;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.imageview.ShapeableImageView;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class v70 extends v46 {
    public static final /* synthetic */ int x = 0;
    public final /* synthetic */ byte u;
    public final Object v;
    public final Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v70(q77 q77Var, View view, byte b) {
        super(view);
        this.u = b;
        switch (b) {
            case 3:
                this.w = q77Var;
                super(view);
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                int i = R.id.imageDetail;
                if (((ImageView) yum0.f(view, R.id.imageDetail)) != null) {
                    i = R.id.imageScore;
                    if (((ImageView) yum0.f(view, R.id.imageScore)) != null) {
                        i = R.id.place;
                        TextView textView = (TextView) yum0.f(view, R.id.place);
                        if (textView != null) {
                            i = R.id.placeDetail;
                            if (((TextView) yum0.f(view, R.id.placeDetail)) != null) {
                                i = R.id.point;
                                TextView textView2 = (TextView) yum0.f(view, R.id.point);
                                if (textView2 != null) {
                                    i = R.id.title;
                                    if (((TextView) yum0.f(view, R.id.title)) != null) {
                                        i = R.id.tvScore;
                                        if (((TextView) yum0.f(view, R.id.tvScore)) != null) {
                                            this.v = new qn5(constraintLayout, textView, textView2, (byte) 1);
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
                throw null;
            default:
                this.w = q77Var;
                int i2 = R.id.prizeDetail;
                TextView textView3 = (TextView) yum0.f(view, R.id.prizeDetail);
                if (textView3 != null) {
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) view;
                    i2 = R.id.prizeImage;
                    ImageView imageView = (ImageView) yum0.f(view, R.id.prizeImage);
                    if (imageView != null) {
                        i2 = R.id.prizeName;
                        TextView textView4 = (TextView) yum0.f(view, R.id.prizeName);
                        if (textView4 != null) {
                            this.v = new j6j(constraintLayout2, textView3, imageView, textView4, (byte) 0);
                            return;
                        }
                    }
                }
                hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
                throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:109:0x0348  */
    @Override // a.v46
    public final void t(Object obj) {
        String string;
        int i;
        int i2;
        int i3;
        String string2;
        int i4;
        byte b = this.u;
        byte b2 = 9;
        Object obj2 = this.v;
        View view = this.f40887a;
        byte b3 = 0;
        Object obj3 = this.w;
        switch (b) {
            case 0:
                t70 t70Var = (t70) obj;
                t70Var.getClass();
                j6j j6jVar = (j6j) obj3;
                TextView textView = j6jVar.c;
                TextView textView2 = j6jVar.d;
                esr esrVar = t70Var.d;
                z70 z70Var = t70Var.b;
                if (esrVar.a()) {
                    string = view.getContext().getString(R.string.bonus);
                } else {
                    Context context = view.getContext();
                    pn40 pn40Var = pn40.f27267a;
                    string = context.getString(R.string.cell_bet, pn40.c(t70Var.f33442a, p3u0.g), t70Var.c);
                }
                textView.setText(string);
                int iOrdinal = z70Var.ordinal();
                if (iOrdinal == 0) {
                    i = R.drawable.green_rectangle;
                } else if (iOrdinal != 1 && iOrdinal != 3 && iOrdinal != 5 && iOrdinal != 7 && iOrdinal != 9 && iOrdinal != 11) {
                    switch (iOrdinal) {
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                            i = R.drawable.transparent_rectangle;
                            break;
                        case 18:
                            i = R.drawable.red_rectangle;
                            break;
                        default:
                            i = R.drawable.black_rectangle;
                            break;
                    }
                } else {
                    i = R.drawable.red_rectangle;
                }
                textView2.setBackgroundResource(i);
                textView2.setText(z70Var.a());
                Context context2 = textView2.getContext();
                context2.getClass();
                if (context2.getResources().getDisplayMetrics().density > 1.5d || z70Var.a().length() <= 3) {
                    Context context3 = textView2.getContext();
                    context3.getClass();
                    i2 = (((double) context3.getResources().getDisplayMetrics().density) > 1.5d && z70Var.a().length() <= 3) ? R.dimen.text_12 : R.dimen.text_8;
                } else {
                    i2 = R.dimen.text_6;
                }
                textView2.setTextSize(0, view.getResources().getDimension(i2));
                j6jVar.e.setOnClickListener(new wg(this, t70Var, (byte) 2));
                break;
            case 1:
                nf8 nf8Var = (nf8) obj;
                nf8Var.getClass();
                dc3 dc3Var = (dc3) obj3;
                ShapeableImageView shapeableImageView = (ShapeableImageView) dc3Var.c;
                mf8 mf8Var = nf8Var.f23422a;
                shapeableImageView.setImageResource(mf8Var.f21682a);
                TextView textView3 = (TextView) dc3Var.d;
                Context context4 = view.getContext();
                int i5 = mf8Var.b;
                int i6 = mf8Var.c;
                textView3.setText(context4.getString(i5));
                ((TextView) dc3Var.e).setText(mf8Var == mf8.g ? view.getContext().getString(i6, nf8Var.b) : view.getContext().getString(i6));
                dyb.c0(view, new op7(this, nf8Var, (byte) 6));
                break;
            case 2:
                ((xzi) obj).getClass();
                j6j j6jVar2 = (j6j) obj2;
                q77 q77Var = (q77) obj3;
                j6jVar2.c.setText((String) q77Var.j);
                j6jVar2.d.setText(((y1s0) q77Var.i).d);
                ImageView imageView = j6jVar2.e;
                List list = u0d.f34849a;
                u0d.j(imageView, q77Var.h, 0, 0, null, null, null, 510);
                break;
            case 3:
                ((xzi) obj).getClass();
                qn5 qn5Var = (qn5) obj2;
                TextView textView4 = qn5Var.c;
                y1s0 y1s0Var = (y1s0) ((q77) obj3).i;
                textView4.setText(String.valueOf(y1s0Var.c));
                qn5Var.d.setText(String.valueOf(y1s0Var.b));
                break;
            case 4:
                vlq0 vlq0Var = (vlq0) obj;
                u70 u70Var = (u70) obj3;
                vlq0Var.getClass();
                vd7 vd7Var = (vd7) obj2;
                TextView textView5 = (TextView) vd7Var.d;
                int iOrdinal2 = vlq0Var.ordinal();
                if (iOrdinal2 == 0) {
                    i3 = R.string.filter_1h;
                } else if (iOrdinal2 == 1) {
                    i3 = R.string.filter_6h;
                } else if (iOrdinal2 == 2) {
                    i3 = R.string.filter_12h;
                } else if (iOrdinal2 == 3) {
                    i3 = R.string.filter_1d;
                } else if (iOrdinal2 == 4) {
                    i3 = R.string.hide_for_week;
                } else if (iOrdinal2 != 5) {
                    t9f.b();
                } else {
                    i3 = R.string.bet_hide_all_time;
                }
                textView5.setText(i3);
                vd7Var.c.setVisibility(((vlq0) dw9.l(1, (ArrayList) u70Var.f)) != vlq0Var ? 0 : 8);
                ((TextView) vd7Var.d).setOnClickListener(new wg((dxv) u70Var.h, vlq0Var, (byte) 21));
                break;
            case 5:
                ykg0 ykg0Var = (ykg0) obj;
                jk30 jk30Var = (jk30) obj3;
                ykg0Var.getClass();
                ysw yswVar = ykg0Var.c;
                String str = ykg0Var.b;
                if (yswVar.f43189a.length() <= 0 && yswVar.d.length() <= 0 && yswVar.c.length() <= 0) {
                    jk30Var.c.setVisibility(8);
                    jk30Var.c.setOnClickListener(null);
                } else {
                    wqv wqvVar = new wqv(this, ykg0Var, (byte) 15);
                    ImageView imageView2 = jk30Var.c;
                    imageView2.setVisibility(0);
                    List list2 = u0d.f34849a;
                    u0d.j(imageView2, yswVar.d, 0, 0, null, null, null, 510);
                    if (yswVar.f43189a.length() > 0) {
                        dyb.N(imageView2, ymx.INTERVAL_500, new adw(wqvVar, (byte) 10));
                    } else {
                        imageView2.setOnClickListener(null);
                    }
                }
                if (str.length() <= 0) {
                    jk30Var.d.setVisibility(8);
                } else {
                    jk30Var.d.setVisibility(0);
                    jk30Var.d.setText(str);
                }
                break;
            case 6:
                qn50 qn50Var = (qn50) obj;
                qn50Var.getClass();
                kj5 kj5Var = uo5.b;
                int i7 = qn50Var.b.f3165a;
                kj5Var.getClass();
                nq8 nq8Var = (nq8) obj3;
                yr50 yr50Var = new yr50(b3, new jt50(this, kj5.f(i7), b3), (RecyclerView) nq8Var.c);
                RecyclerView recyclerView = (RecyclerView) nq8Var.c;
                recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext(), 0, false));
                recyclerView.setAdapter(yr50Var);
                yr50Var.G(qn50Var.c);
                break;
            case 7:
                ykg0 ykg0Var2 = (ykg0) obj;
                ykg0Var2.getClass();
                qn5 qn5Var2 = (qn5) obj3;
                TextView textView6 = qn5Var2.c;
                ysw yswVar2 = ykg0Var2.c;
                String str2 = ykg0Var2.b;
                String str3 = yswVar2.f43189a;
                String str4 = yswVar2.c;
                if (str3.length() <= 0 && yswVar2.d.length() <= 0 && str4.length() <= 0) {
                    textView6.setVisibility(8);
                    textView6.setOnClickListener(null);
                } else {
                    textView6.setVisibility(0);
                    Spanned spannedFromHtml = Html.fromHtml("<a>" + str4 + "</a>", 0);
                    spannedFromHtml.getClass();
                    textView6.setText(spannedFromHtml);
                    dyb.N(textView6, ymx.INTERVAL_500, new oac0(this, ykg0Var2, (byte) 25));
                }
                sj3.x0(qn5Var2.c);
                TextView textView7 = qn5Var2.d;
                textView7.setVisibility(StringsKt.W(str2) ? 8 : 0);
                textView7.setText(str2);
                break;
            default:
                xxk0 xxk0Var = (xxk0) obj;
                xxk0Var.getClass();
                j6j j6jVar3 = (j6j) obj3;
                TextView textView8 = j6jVar3.c;
                TextView textView9 = j6jVar3.d;
                if (xxk0Var.d.a()) {
                    string2 = view.getContext().getString(R.string.bonus);
                } else {
                    Context context5 = view.getContext();
                    pn40 pn40Var2 = pn40.f27267a;
                    string2 = context5.getString(R.string.cell_bet, pn40.c(xxk0Var.f41663a, p3u0.g), xxk0Var.c);
                }
                textView8.setText(string2);
                int iOrdinal3 = xxk0Var.b.ordinal();
                if (iOrdinal3 == 0) {
                    i4 = R.drawable.x2_bet_background;
                } else if (iOrdinal3 == 1) {
                    i4 = R.drawable.x4_bet_background;
                } else if (iOrdinal3 == 2) {
                    i4 = R.drawable.x5_bet_background;
                } else if (iOrdinal3 == 3) {
                    i4 = R.drawable.x7_bet_background;
                } else if (iOrdinal3 != 4) {
                    i4 = iOrdinal3 != 5 ? R.drawable.default_bet_background : R.drawable.x20_bet_background;
                } else {
                    i4 = R.drawable.x10_bet_background;
                }
                textView9.setBackgroundResource(i4);
                j6jVar3.e.setOnClickListener(new bs50(this, xxk0Var, b2));
                if (!xxk0Var.e) {
                    textView9.setAlpha(0.2f);
                } else {
                    textView9.setAlpha(1.0f);
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v70(View view, p0z p0zVar) {
        super(view);
        this.u = (byte) 6;
        p0zVar.getClass();
        this.v = p0zVar;
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        RecyclerView recyclerView = (RecyclerView) yum0.f(view, R.id.recycler_view);
        if (recyclerView != null) {
            this.w = new nq8(constraintLayout, recyclerView, (byte) 6);
        } else {
            hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.recycler_view)));
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v70(View view, dke0 dke0Var, byte b) {
        super(view);
        this.u = b;
        int i = R.id.tvRuleText;
        view.getClass();
        switch (b) {
            case 7:
                super(view);
                this.v = dke0Var;
                TextView textView = (TextView) yum0.f(view, R.id.tvHref);
                if (textView != null) {
                    TextView textView2 = (TextView) yum0.f(view, R.id.tvRuleText);
                    if (textView2 != null) {
                        this.w = new qn5((ConstraintLayout) view, textView, textView2, (byte) 3);
                        return;
                    }
                } else {
                    i = R.id.tvHref;
                }
                hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
                throw null;
            default:
                this.v = dke0Var;
                ImageView imageView = (ImageView) yum0.f(view, R.id.ivImage);
                if (imageView != null) {
                    TextView textView3 = (TextView) yum0.f(view, R.id.tvRuleText);
                    if (textView3 != null) {
                        this.w = new jk30((LinearLayout) view, imageView, textView3, (byte) 5);
                        return;
                    }
                } else {
                    i = R.id.ivImage;
                }
                hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
                throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v70(View view, cyk0 cyk0Var) {
        super(view);
        this.u = (byte) 8;
        view.getClass();
        this.v = cyk0Var;
        int i = R.id.betSum;
        TextView textView = (TextView) yum0.f(view, R.id.betSum);
        if (textView != null) {
            i = R.id.betType;
            TextView textView2 = (TextView) yum0.f(view, R.id.betType);
            if (textView2 != null) {
                i = R.id.imgClose;
                ImageView imageView = (ImageView) yum0.f(view, R.id.imgClose);
                if (imageView != null) {
                    this.w = new j6j((ConstraintLayout) view, textView, textView2, imageView, (byte) 4);
                    return;
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v70(View view, Function1 function1) {
        super(view);
        this.u = (byte) 1;
        view.getClass();
        this.v = function1;
        int i = R.id.ivBonus;
        ShapeableImageView shapeableImageView = (ShapeableImageView) yum0.f(view, R.id.ivBonus);
        if (shapeableImageView != null) {
            i = R.id.tvBonusSubtitle;
            TextView textView = (TextView) yum0.f(view, R.id.tvBonusSubtitle);
            if (textView != null) {
                i = R.id.tvBonusTitle;
                TextView textView2 = (TextView) yum0.f(view, R.id.tvBonusTitle);
                if (textView2 != null) {
                    this.w = new dc3((ViewGroup) view, (View) shapeableImageView, textView, textView2, (byte) 15);
                    return;
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v70(View view, i80 i80Var) {
        super(view);
        this.u = (byte) 0;
        view.getClass();
        this.v = i80Var;
        int i = R.id.betSum;
        TextView textView = (TextView) yum0.f(view, R.id.betSum);
        if (textView != null) {
            i = R.id.betType;
            TextView textView2 = (TextView) yum0.f(view, R.id.betType);
            if (textView2 != null) {
                i = R.id.imgClose;
                ImageView imageView = (ImageView) yum0.f(view, R.id.imgClose);
                if (imageView != null) {
                    this.w = new j6j((ConstraintLayout) view, textView, textView2, imageView, (byte) 1);
                    return;
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v70(u70 u70Var, View view) {
        super(view);
        this.u = (byte) 4;
        view.getClass();
        this.w = u70Var;
        int i = R.id.divider;
        View viewF = yum0.f(view, R.id.divider);
        if (viewF != null) {
            i = R.id.title;
            TextView textView = (TextView) yum0.f(view, R.id.title);
            if (textView != null) {
                this.v = new vd7((LinearLayoutCompat) view, viewF, textView, (byte) 16);
                return;
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        throw null;
    }
}

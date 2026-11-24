package a;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.imageview.RoundCornerImageView;
import org.xplatform.ui_core.viewcomponents.views.scrollable_table.table_view.TableViewImpl;

/* JADX INFO: loaded from: classes6.dex */
public final class v8e0 extends k5 {
    public TableViewImpl l;
    public final ksc0 m;

    public v8e0(TableViewImpl tableViewImpl, ksc0 ksc0Var) {
        super(tableViewImpl, true, R.dimen.text_16);
        this.l = tableViewImpl;
        this.m = ksc0Var;
    }

    @Override // a.k5
    public final nmo0 g() {
        return this.l;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0159  */
    /* JADX WARN: Code duplicated, block: B:32:0x0168  */
    /* JADX WARN: Code duplicated, block: B:33:0x016b  */
    @Override // a.k5
    public final void j(w5 w5Var, y8b y8bVar) {
        String string;
        if ((w5Var instanceof c8e0) && (y8bVar instanceof u3e0)) {
            c8e0 c8e0Var = (c8e0) w5Var;
            u3e0 u3e0Var = (u3e0) y8bVar;
            View view = c8e0Var.f40887a;
            iab iabVar = c8e0Var.u;
            RoundCornerImageView roundCornerImageView = (RoundCornerImageView) iabVar.f;
            RoundCornerImageView roundCornerImageView2 = (RoundCornerImageView) iabVar.g;
            TextView textView = (TextView) iabVar.h;
            RoundCornerImageView roundCornerImageView3 = (RoundCornerImageView) iabVar.e;
            RoundCornerImageView roundCornerImageView4 = (RoundCornerImageView) iabVar.b;
            LinearLayout linearLayout = (LinearLayout) iabVar.d;
            TextView textView2 = (TextView) iabVar.c;
            s3e0 s3e0Var = u3e0Var.d;
            if (s3e0Var == null) {
                c8e0Var.v();
                linearLayout.setGravity(17);
                roundCornerImageView3.setVisibility(8);
                if (u3e0Var.e) {
                    string = "";
                } else {
                    string = view.getResources().getString(R.string.figure_dash);
                }
                textView2.setText(string);
            } else if (s3e0Var instanceof r3e0) {
                r3e0 r3e0Var = (r3e0) s3e0Var;
                ufp0 ufp0Var = r3e0Var.f29783a;
                linearLayout.setGravity(8388627);
                roundCornerImageView3.setVisibility(8);
                roundCornerImageView.setVisibility(8);
                textView2.setVisibility(0);
                textView2.setText(ufp0Var.b + " / ");
                textView.setVisibility(0);
                ufp0 ufp0Var2 = r3e0Var.b;
                textView.setText(ufp0Var2.b);
                roundCornerImageView4.setVisibility(0);
                List list = u0d.f34849a;
                u0d.n(roundCornerImageView4, vsm0.t(ufp0Var.d), 0, 11);
                roundCornerImageView2.setVisibility(0);
                u0d.n(roundCornerImageView2, vsm0.t(ufp0Var2.d), 0, 11);
            } else if (s3e0Var instanceof q3e0) {
                q3e0 q3e0Var = (q3e0) s3e0Var;
                b9a0 b9a0Var = q3e0Var.f28049a;
                linearLayout.setGravity(8388627);
                roundCornerImageView3.setVisibility(8);
                textView2.setText(b9a0Var.b);
                textView.setVisibility(0);
                b9a0 b9a0Var2 = q3e0Var.b;
                textView.setText(b9a0Var2.b);
                roundCornerImageView4.setVisibility(0);
                List list2 = u0d.f34849a;
                u0d.n(roundCornerImageView4, b9a0Var.f, 0, 11);
                roundCornerImageView2.setVisibility(0);
                u0d.n(roundCornerImageView2, b9a0Var2.f, 0, 11);
                c8e0.w(roundCornerImageView3, b9a0Var.e.b);
                c8e0.w(roundCornerImageView, b9a0Var2.e.b);
            } else if (s3e0Var instanceof m3e0) {
                b9a0 b9a0Var3 = ((m3e0) s3e0Var).f21111a;
                linearLayout.setGravity(8388627);
                c8e0Var.v();
                roundCornerImageView4.setVisibility(0);
                textView2.setText(b9a0Var3.b);
                List list3 = u0d.f34849a;
                u0d.n(roundCornerImageView4, b9a0Var3.f, 0, 11);
                c8e0.w(roundCornerImageView3, b9a0Var3.e.b);
            } else if (s3e0Var instanceof j3e0) {
                c8e0Var.v();
                roundCornerImageView4.setVisibility(8);
                roundCornerImageView3.setVisibility(8);
                String string2 = ((j3e0) s3e0Var).f15828a;
                if (StringsKt.W(string2)) {
                    string2 = view.getResources().getString(R.string.figure_dash);
                    string2.getClass();
                }
                textView2.setText(string2);
                linearLayout.setGravity(17);
            } else if (s3e0Var instanceof o3e0) {
                ufp0 ufp0Var3 = ((o3e0) s3e0Var).f24580a;
                linearLayout.setGravity(8388627);
                c8e0Var.v();
                roundCornerImageView4.setVisibility(0);
                textView2.setText(ufp0Var3.b);
                List list4 = u0d.f34849a;
                u0d.n(roundCornerImageView4, ufp0Var3.d, 0, 11);
            } else if (s3e0Var instanceof p3e0) {
                linearLayout.setGravity(8388627);
                c8e0Var.v();
                roundCornerImageView3.setVisibility(8);
                roundCornerImageView4.setVisibility(8);
                textView2.setText(((p3e0) s3e0Var).f26296a.b);
            } else {
                c8e0Var.v();
                linearLayout.setGravity(17);
                roundCornerImageView3.setVisibility(8);
                if (u3e0Var.e) {
                    string = "";
                } else {
                    string = view.getResources().getString(R.string.figure_dash);
                }
                textView2.setText(string);
            }
            TypedValue typedValue = j5d.f15927a;
            Context context = view.getContext();
            context.getClass();
            int iA = j5d.a(context, R.attr.uikitSecondary, false);
            textView2.setTextColor(iA);
            textView.setTextColor(iA);
        }
    }

    @Override // a.k5
    public final void k(w5 w5Var, y8b y8bVar) {
        if ((w5Var instanceof j6d) && (y8bVar instanceof v3e0)) {
            j6d j6dVar = (j6d) w5Var;
            v3e0 v3e0Var = (v3e0) y8bVar;
            wcu0 wcu0Var = j6dVar.u;
            TextView textView = wcu0Var.d;
            TextView textView2 = wcu0Var.c;
            textView.setText(v3e0Var.d);
            String str = v3e0Var.e;
            textView2.setText(str);
            textView2.setVisibility(str.length() > 0 ? 0 : 8);
            TypedValue typedValue = j5d.f15927a;
            Context context = j6dVar.f40887a.getContext();
            context.getClass();
            j6dVar.u(j5d.a(context, R.attr.uikitBackground, false));
        }
    }

    @Override // a.k5
    public final void l(w5 w5Var, y8b y8bVar) {
        int i;
        if ((w5Var instanceof aig0) && (y8bVar instanceof l6e0)) {
            aig0 aig0Var = (aig0) w5Var;
            l6e0 l6e0Var = (l6e0) y8bVar;
            View view = aig0Var.f40887a;
            zkk zkkVar = aig0Var.u;
            TextView textView = zkkVar.d;
            ConstraintLayout constraintLayout = (ConstraintLayout) zkkVar.f;
            FrameLayout frameLayout = (FrameLayout) zkkVar.g;
            TextView textView2 = (TextView) zkkVar.e;
            RoundCornerImageView roundCornerImageView = (RoundCornerImageView) zkkVar.i;
            String str = l6e0Var.g;
            b9a0 b9a0Var = l6e0Var.j;
            e6e0 e6e0Var = l6e0Var.h;
            hee heeVar = l6e0Var.l;
            if (StringsKt.W(str) && heeVar == hee.f12919a && e6e0Var == e6e0.c) {
                frameLayout.setVisibility(8);
            } else {
                ImageView imageView = (ImageView) zkkVar.c;
                frameLayout.setVisibility(0);
                if (str.length() > 0) {
                    textView.setText(str);
                    textView.setVisibility(0);
                } else {
                    textView.setVisibility(8);
                }
                int iOrdinal = e6e0Var.ordinal();
                if (iOrdinal != 0) {
                    i = iOrdinal != 1 ? 0 : R.drawable.ic_arrow_downward;
                } else {
                    i = R.drawable.ic_arrow_upward;
                }
                if (i != 0) {
                    Drawable drawable = constraintLayout.getContext().getDrawable(i);
                    int dimensionPixelSize = constraintLayout.getResources().getDimensionPixelSize(R.dimen.space_16);
                    if (drawable != null) {
                        drawable.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                    }
                    textView.setCompoundDrawables(null, null, drawable, null);
                } else {
                    textView.setCompoundDrawables(null, null, null, null);
                }
                int iOrdinal2 = heeVar.ordinal();
                if (iOrdinal2 == 0) {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable(null);
                } else if (iOrdinal2 == 1) {
                    imageView.setVisibility(0);
                    imageView.setImageResource(R.drawable.ic_ufc_top_rank);
                } else if (iOrdinal2 == 2) {
                    imageView.setVisibility(0);
                    imageView.setImageResource(R.drawable.ic_ufc_champion);
                } else if (iOrdinal2 == 3) {
                    imageView.setVisibility(0);
                    imageView.setImageResource(R.drawable.ic_ufc_temporary_champion);
                } else if (iOrdinal2 != 4) {
                    t9f.b();
                    return;
                } else {
                    imageView.setVisibility(0);
                    imageView.setImageResource(R.drawable.ic_ufc_newcomer);
                }
            }
            ufp0 ufp0Var = l6e0Var.i;
            String str2 = l6e0Var.f;
            if (!ufp0Var.equals(new ufp0(0, "", "", "", iun.f15405a))) {
                roundCornerImageView.setVisibility(0);
                textView2.setText(ufp0Var.b);
                List list = u0d.f34849a;
                u0d.n(roundCornerImageView, ufp0Var.d, 0, 11);
            } else if (!Intrinsics.d(b9a0Var, b9a0.g)) {
                roundCornerImageView.setVisibility(0);
                textView2.setText(b9a0Var.b);
                List list2 = u0d.f34849a;
                u0d.n(roundCornerImageView, b9a0Var.f, 0, 11);
            } else if (StringsKt.W(str2)) {
                textView2.setText("");
                roundCornerImageView.setVisibility(8);
            } else {
                textView2.setGravity(l6e0Var.p == hnh0.b ? 8388611 : 17);
                textView2.setText(str2);
                roundCornerImageView.setVisibility(8);
            }
            ImageView imageView2 = (ImageView) zkkVar.b;
            RoundCornerImageView roundCornerImageView2 = (RoundCornerImageView) zkkVar.h;
            textView2.setSelected(true);
            String str3 = b9a0Var.e.b;
            if (str3.length() > 0) {
                roundCornerImageView2.setVisibility(0);
                List list3 = u0d.f34849a;
                u0d.j(roundCornerImageView2, ((StringBuilder) rz4.d("sfiles", "logo_teams", str3).b).toString(), 0, 0, kotlin.collections.a.c(g2x.f10583a), null, null, 494);
            } else {
                roundCornerImageView2.setVisibility(8);
            }
            if (l6e0Var.m != null) {
                imageView2.setVisibility(0);
                if (l6e0Var.n) {
                    imageView2.setImageResource(R.drawable.ic_arrow_up);
                    TypedValue typedValue = j5d.f15927a;
                    Context context = view.getContext();
                    context.getClass();
                    textView2.setTextColor(j5d.a(context, R.attr.uikitTextPrimary, false));
                    Context context2 = view.getContext();
                    context2.getClass();
                    textView.setTextColor(j5d.a(context2, R.attr.uikitTextPrimary, false));
                } else {
                    imageView2.setImageResource(R.drawable.ic_arrow_down);
                    TypedValue typedValue2 = j5d.f15927a;
                    Context context3 = view.getContext();
                    context3.getClass();
                    textView2.setTextColor(j5d.a(context3, R.attr.uikitSecondary, false));
                    Context context4 = view.getContext();
                    context4.getClass();
                    textView.setTextColor(j5d.a(context4, R.attr.uikitSecondary, false));
                }
                constraintLayout.getClass();
                dyb.O(constraintLayout, new dff0(aig0Var, l6e0Var, (byte) 17));
            } else {
                imageView2.setVisibility(8);
                TypedValue typedValue3 = j5d.f15927a;
                Context context5 = view.getContext();
                context5.getClass();
                textView2.setTextColor(j5d.a(context5, R.attr.uikitSecondary, false));
                Context context6 = view.getContext();
                context6.getClass();
                textView.setTextColor(j5d.a(context6, R.attr.uikitSecondary, false));
                constraintLayout.setOnClickListener(null);
            }
            if (l6e0Var.o) {
                constraintLayout.setPadding(view.getResources().getDimensionPixelSize(R.dimen.space_32), constraintLayout.getPaddingTop(), constraintLayout.getPaddingRight(), constraintLayout.getPaddingBottom());
            } else {
                constraintLayout.setPadding(view.getResources().getDimensionPixelSize(R.dimen.space_8), constraintLayout.getPaddingTop(), constraintLayout.getPaddingRight(), constraintLayout.getPaddingBottom());
            }
            constraintLayout.getClass();
            ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
            if (layoutParams == null) {
                hny.u("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            } else {
                layoutParams.width = -1;
                constraintLayout.setLayoutParams(layoutParams);
            }
        }
    }

    @Override // a.k5
    public final w5 m(ViewGroup viewGroup, int i) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.vh_rating_table_data, viewGroup, false);
        int i2 = R.id.rcivCountry;
        RoundCornerImageView roundCornerImageView = (RoundCornerImageView) yum0.f(viewInflate, R.id.rcivCountry);
        if (roundCornerImageView != null) {
            i2 = R.id.rcivProfile;
            RoundCornerImageView roundCornerImageView2 = (RoundCornerImageView) yum0.f(viewInflate, R.id.rcivProfile);
            if (roundCornerImageView2 != null) {
                i2 = R.id.rcivSecondCountry;
                RoundCornerImageView roundCornerImageView3 = (RoundCornerImageView) yum0.f(viewInflate, R.id.rcivSecondCountry);
                if (roundCornerImageView3 != null) {
                    i2 = R.id.rcivSecondProfile;
                    RoundCornerImageView roundCornerImageView4 = (RoundCornerImageView) yum0.f(viewInflate, R.id.rcivSecondProfile);
                    if (roundCornerImageView4 != null) {
                        i2 = R.id.tvData;
                        TextView textView = (TextView) yum0.f(viewInflate, R.id.tvData);
                        if (textView != null) {
                            i2 = R.id.tvSecondData;
                            TextView textView2 = (TextView) yum0.f(viewInflate, R.id.tvSecondData);
                            if (textView2 != null) {
                                return new c8e0(new iab((LinearLayout) viewInflate, roundCornerImageView, roundCornerImageView2, roundCornerImageView3, roundCornerImageView4, textView, textView2, (byte) 5));
                            }
                        }
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
        return null;
    }

    @Override // a.k5
    public final w5 n(ViewGroup viewGroup, int i) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.vh_rating_table_column_title, viewGroup, false);
        int i2 = R.id.tvSubTitle;
        TextView textView = (TextView) yum0.f(viewInflate, R.id.tvSubTitle);
        if (textView != null) {
            i2 = R.id.tvTitle;
            TextView textView2 = (TextView) yum0.f(viewInflate, R.id.tvTitle);
            if (textView2 != null) {
                return new j6d(new wcu0((LinearLayout) viewInflate, textView, textView2, (byte) 1));
            }
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0040  */
    @Override // a.k5
    public final View o(ViewGroup viewGroup, y8b y8bVar) {
        String str;
        boolean z;
        y8bVar.getClass();
        Context context = viewGroup.getContext();
        context.getClass();
        shq shqVar = new shq(context);
        shqVar.setLayoutParams(new FrameLayout.LayoutParams(-2, vqd.d(viewGroup, R.dimen.size_50)));
        rhq rhqVar = y8bVar instanceof rhq ? (rhq) y8bVar : null;
        if (rhqVar == null || (str = rhqVar.f38714a.f12665a) == null) {
            str = "-";
        }
        shqVar.setTitle(str);
        if (rhqVar != null) {
            z = rhqVar.e && rhqVar.f > 1;
        }
        shqVar.setNumberVisibility(z);
        return shqVar;
    }

    @Override // a.k5
    public final w5 p(ViewGroup viewGroup, int i) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.vh_rating_table_row_title, viewGroup, false);
        int i2 = R.id.endBarrier;
        if (((Barrier) yum0.f(viewInflate, R.id.endBarrier)) != null) {
            i2 = R.id.flRatingPosition;
            FrameLayout frameLayout = (FrameLayout) yum0.f(viewInflate, R.id.flRatingPosition);
            if (frameLayout != null) {
                i2 = R.id.guideline;
                if (((Barrier) yum0.f(viewInflate, R.id.guideline)) != null) {
                    i2 = R.id.ivCountryIcon;
                    RoundCornerImageView roundCornerImageView = (RoundCornerImageView) yum0.f(viewInflate, R.id.ivCountryIcon);
                    if (roundCornerImageView != null) {
                        i2 = R.id.ivExpand;
                        ImageView imageView = (ImageView) yum0.f(viewInflate, R.id.ivExpand);
                        if (imageView != null) {
                            i2 = R.id.ivPosition;
                            ImageView imageView2 = (ImageView) yum0.f(viewInflate, R.id.ivPosition);
                            if (imageView2 != null) {
                                i2 = R.id.ivTeam;
                                RoundCornerImageView roundCornerImageView2 = (RoundCornerImageView) yum0.f(viewInflate, R.id.ivTeam);
                                if (roundCornerImageView2 != null) {
                                    i2 = R.id.tvPosition;
                                    TextView textView = (TextView) yum0.f(viewInflate, R.id.tvPosition);
                                    if (textView != null) {
                                        i2 = R.id.tvTitle;
                                        TextView textView2 = (TextView) yum0.f(viewInflate, R.id.tvTitle);
                                        if (textView2 != null) {
                                            return new aig0(new zkk((ConstraintLayout) viewInflate, frameLayout, roundCornerImageView, imageView, imageView2, roundCornerImageView2, textView, textView2), this.m);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
        return null;
    }

    @Override // a.k5
    public final void r(TableViewImpl tableViewImpl) {
        this.l = tableViewImpl;
    }
}

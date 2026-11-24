package a;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.text.BidiFormatter;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.google.android.material.card.MaterialCardView;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.imageview.RoundCornerImageView;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class na7 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f23175a = 0;
    public final /* synthetic */ vft b;
    public final /* synthetic */ cp c;

    public /* synthetic */ na7(cp cpVar, vft vftVar) {
        this.c = cpVar;
        this.b = vftVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String string;
        View view;
        String str;
        boolean z;
        String strR;
        TextView textView;
        int i;
        String strB;
        int color;
        byte b = this.f23175a;
        cp cpVar = this.c;
        vft vftVar = this.b;
        switch (b) {
            case 0:
                ((List) obj).getClass();
                View view2 = cpVar.f40887a;
                yfu0 yfu0Var = cpVar.u;
                Context context = view2.getContext();
                context.getClass();
                if (context.getResources().getConfiguration().getLayoutDirection() == 1) {
                    ((lb7) yfu0Var).i.setRotationY(180.0f);
                }
                lb7 lb7Var = (lb7) yfu0Var;
                ConstraintLayout constraintLayout = lb7Var.b;
                TextView textView2 = lb7Var.x;
                TextView textView3 = lb7Var.r;
                TextView textView4 = lb7Var.N;
                TextView textView5 = lb7Var.J;
                TextView textView6 = lb7Var.D;
                ImageView imageView = lb7Var.d;
                TextView textView7 = lb7Var.P;
                dyb.O(constraintLayout, new na7(vftVar, cpVar));
                lb7Var.b.setVisibility(((uv6) cpVar.u()).A ? 0 : 8);
                lb7Var.G.setText(((uv6) cpVar.u()).t == 95 ? cpVar.v(R.string.betconstructor) : ((uv6) cpVar.u()).c);
                lb7Var.c.setVisibility(((uv6) cpVar.u()).X ? 0 : 8);
                q4f q4fVar = ((uv6) cpVar.u()).P;
                String str2 = ((uv6) cpVar.u()).Q;
                boolean z2 = ((uv6) cpVar.u()).J >= 0 && ((uv6) cpVar.u()).J != ((uv6) cpVar.u()).L && (q4fVar == q4f.g || q4fVar == q4f.h);
                LinearLayout linearLayout = lb7Var.e;
                TextView textView8 = lb7Var.L;
                TextView textView9 = lb7Var.I;
                linearLayout.setVisibility(z2 ? 0 : 8);
                lb7Var.y.setVisibility(z2 ? 0 : 8);
                textView9.setVisibility(((uv6) cpVar.u()).K > 0.0d ? 0 : 8);
                lb7Var.H.setText(((uv6) cpVar.u()).J == 0 ? view2.getContext().getString(R.string.lobby_) : view2.getContext().getString(R.string.block_v2, String.valueOf(((uv6) cpVar.u()).J)));
                pn40 pn40Var = pn40.f27267a;
                textView9.setText(pn40.d(((uv6) cpVar.u()).K, str2, p3u0.c));
                lb7Var.j.setVisibility(((uv6) cpVar.u()).l ? 0 : 8);
                textView8.setVisibility(((uv6) cpVar.u()).V.length() > 0 ? 0 : 8);
                textView8.setText(((uv6) cpVar.u()).V);
                lb7Var.O.setVisibility(((uv6) cpVar.u()).y ? 0 : 8);
                lb7Var.K.setVisibility(((uv6) cpVar.u()).z ? 0 : 8);
                String string2 = "";
                long j = 0;
                if (oa7.a(cpVar)) {
                    imageView.setImageResource(R.drawable.ic_1x_bonus);
                    j = 0;
                } else {
                    List list = u0d.f34849a;
                    long j2 = ((uv6) cpVar.u()).t;
                    if (j2 != 0) {
                        bzu bzuVarD = rz4.d("static", "svg", "sports_v2");
                        rz4.s(j2, ".svg", bzuVarD);
                        string = ((StringBuilder) bzuVarD.b).toString();
                    } else {
                        string = "";
                    }
                    u0d.k(imageView, string);
                }
                boolean z3 = ((uv6) cpVar.u()).B.length() > 0;
                lb7Var.g.setVisibility(z3 ? 0 : 8);
                if (z3) {
                    lb7Var.z.setText(((uv6) cpVar.u()).B);
                }
                textView6.setVisibility(((uv6) cpVar.u()).q == j ? 0 : 8);
                textView6.setText(((uv6) cpVar.u()).j);
                boolean z4 = ((uv6) cpVar.u()).f != j;
                textView5.setVisibility(z4 ? 0 : 8);
                if (z4) {
                    rdj rdjVar = rdj.f30294a;
                    textView5.setText(rdj.g(new znq0(((uv6) cpVar.u()).f), efj.UNIVERSAL, Boolean.valueOf(((uv6) cpVar.u()).Z), false, 56));
                }
                s77 s77Var = ((uv6) cpVar.u()).O;
                s77 s77Var2 = s77.TOTO;
                if (s77Var == s77Var2 || s77Var == s77.JACKPOT) {
                    if (((uv6) cpVar.u()).D.length() > 0 && ((uv6) cpVar.u()).U > 0.0d) {
                        textView7.setVisibility(0);
                        textView7.setText(((uv6) cpVar.u()).D + ". " + cpVar.w(R.string.total_v2, Double.valueOf(((uv6) cpVar.u()).U)));
                    } else if (((uv6) cpVar.u()).D.length() > 0 && ((uv6) cpVar.u()).U <= 0.0d) {
                        textView7.setVisibility(0);
                        textView7.setText(((uv6) cpVar.u()).D);
                    } else if (((uv6) cpVar.u()).D.length() != 0 || ((uv6) cpVar.u()).U <= 0.0d) {
                        textView7.setVisibility(8);
                    } else {
                        textView7.setVisibility(0);
                        textView7.setText(cpVar.w(R.string.total_v2, Double.valueOf(((uv6) cpVar.u()).U)));
                    }
                } else if (((uv6) cpVar.u()).R) {
                    textView7.setVisibility(!((uv6) cpVar.u()).Y ? 0 : 8);
                    textView7.setText(((uv6) cpVar.u()).s);
                } else {
                    textView7.setVisibility(8);
                }
                lb7Var.M.setVisibility((!((uv6) cpVar.u()).l || ((uv6) cpVar.u()).x <= j) ? 8 : 0);
                textView4.setVisibility((!((uv6) cpVar.u()).l || ((uv6) cpVar.u()).x <= j) ? 8 : 0);
                long j3 = ((uv6) cpVar.u()).x;
                textView4.setText(view2.getContext().getString(R.string.line_live_time_period_capitalized_v2, String.format(Locale.ENGLISH, "%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j3 / 60), Long.valueOf(j3 % 60)}, 2))));
                s77 s77Var3 = ((uv6) cpVar.u()).O;
                Group group = lb7Var.l;
                s77 s77Var4 = s77.AUTO;
                group.setVisibility((s77Var3 != s77Var4 || ((uv6) cpVar.u()).s.length() <= 0) ? 8 : 0);
                lb7Var.E.setText(oa7.b((uv6) cpVar.u()));
                s77 s77Var5 = ((uv6) cpVar.u()).O;
                q4f q4fVar2 = ((uv6) cpVar.u()).P;
                TextView textView10 = lb7Var.A;
                int iOrdinal = s77Var5.ordinal();
                if (iOrdinal == 1 || iOrdinal == 6) {
                    view = view2;
                    str = "-";
                    String strB0 = ((uv6) cpVar.u()).u;
                    boolean z5 = ((uv6) cpVar.u()).Y;
                    String str3 = ((uv6) cpVar.u()).u;
                    if (z5) {
                        z = false;
                        strB0 = CollectionsKt.b0(StringsKt__StringsKt.split$default(str3, new String[]{", "}, false, 0, 6, null), null, null, null, new h26((byte) 19), 31);
                    } else {
                        z = false;
                    }
                    strR = kotlin.text.c.r(strB0, Separators.COMMA, ", ", z);
                } else {
                    uv6 uv6Var = (uv6) cpVar.u();
                    strR = view2.getContext().getString(R.string.sp_coef);
                    strR.getClass();
                    String str4 = uv6Var.e;
                    if (str4.length() > 0) {
                        view = view2;
                        strR = str4;
                        str = "-";
                    } else {
                        str = "-";
                        double d = uv6Var.d;
                        if (d > 0.0d) {
                            strR = pn40.c(d, p3u0.e);
                            view = view2;
                        } else {
                            view = view2;
                            if (q3d.j(q4f.e, q4f.g, q4f.k, q4f.j, q4f.x).contains(q4fVar2)) {
                                strR = str;
                            }
                        }
                    }
                }
                textView10.setText(strR);
                lb7Var.B.setVisibility((s77Var5 == s77Var2 || s77Var5 == s77.JACKPOT) ? 0 : 8);
                TextView textView11 = lb7Var.C;
                if (s77Var5 != s77Var2 && s77Var5 != s77.JACKPOT) {
                    if (oa7.a(cpVar)) {
                        string2 = ((uv6) cpVar.u()).j;
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append(kotlin.text.c.r(((uv6) cpVar.u()).u, " \n", ". ", false));
                        if (((uv6) cpVar.u()).D.length() > 0) {
                            if (sb.length() > 0) {
                                sb.append(". ");
                            }
                            sb.append(((uv6) cpVar.u()).D);
                        }
                        if (((uv6) cpVar.u()).C.length() > 0) {
                            if (sb.length() > 0) {
                                sb.append(". ");
                            }
                            sb.append(((uv6) cpVar.u()).C);
                        }
                        if (((uv6) cpVar.u()).w.length() > 0) {
                            if (sb.length() > 0) {
                                sb.append(". ");
                            }
                            sb.append(((uv6) cpVar.u()).w);
                        }
                        string2 = sb.toString();
                    }
                }
                textView11.setText(string2);
                s77 s77Var6 = ((uv6) cpVar.u()).O;
                lb7Var.s.setVisibility((((uv6) cpVar.u()).p.length() <= 0 || oa7.a(cpVar)) ? 8 : 0);
                uv6 uv6Var2 = (uv6) cpVar.u();
                String str5 = ((uv6) cpVar.u()).Y ? uv6Var2.p : uv6Var2.m;
                uv6 uv6Var3 = (uv6) cpVar.u();
                String str6 = !((uv6) cpVar.u()).Y ? uv6Var3.p : uv6Var3.m;
                int i2 = cy7.f5159a;
                if (BidiFormatter.getInstance().isRtl(str5)) {
                    cy7.b(textView3, 8388611, 8388613);
                }
                if (BidiFormatter.getInstance().isRtl(str6)) {
                    textView = textView2;
                    cy7.b(textView, 8388613, 8388611);
                } else {
                    textView = textView2;
                }
                Group group2 = lb7Var.u;
                Group group3 = lb7Var.o;
                RoundCornerImageView roundCornerImageView = lb7Var.t;
                RoundCornerImageView roundCornerImageView2 = lb7Var.n;
                textView3.setText(str5);
                textView.setText(str6);
                boolean z6 = ((uv6) cpVar.u()).Y;
                if (((uv6) cpVar.u()).t == 95) {
                    roundCornerImageView2.setVisibility(0);
                    i = 8;
                    group3.setVisibility(8);
                    roundCornerImageView.setVisibility(0);
                    group2.setVisibility(8);
                    int i3 = R.drawable.ic_betconsructor_team_one;
                    roundCornerImageView2.setImageResource(z6 ? R.drawable.ic_betconsructor_team_second : R.drawable.ic_betconsructor_team_one);
                    if (!z6) {
                        i3 = R.drawable.ic_betconsructor_team_second;
                    }
                    roundCornerImageView.setImageResource(i3);
                } else {
                    i = 8;
                    uv6 uv6Var4 = (uv6) cpVar.u();
                    List list2 = z6 ? uv6Var4.r : uv6Var4.o;
                    uv6 uv6Var5 = (uv6) cpVar.u();
                    List list3 = !z6 ? uv6Var5.r : uv6Var5.o;
                    oa7.c(list2, roundCornerImageView2, group3, lb7Var.p, lb7Var.q);
                    oa7.c(list3, roundCornerImageView, group2, lb7Var.v, lb7Var.w);
                }
                TextView textView12 = lb7Var.R;
                if (s77Var6 == s77Var4) {
                    strB = view.getResources().getString(R.string.vs);
                } else if (oa7.b((uv6) cpVar.u()).length() <= 0 || !((uv6) cpVar.u()).Y) {
                    strB = oa7.b((uv6) cpVar.u()).length() > 0 ? oa7.b((uv6) cpVar.u()) : view.getResources().getString(R.string.vs);
                } else {
                    strB = oa7.b((uv6) cpVar.u());
                    List listSplit$default = StringsKt__StringsKt.split$default(strB, new String[]{" : ", " - "}, false, 0, 6, null);
                    if (listSplit$default.size() == 2) {
                        Object obj2 = listSplit$default.get(1);
                        String str7 = StringsKt.O(strB, " : ", false) ? Separators.COLON : str;
                        strB = obj2 + Separators.SP + str7 + Separators.SP + listSplit$default.get(0);
                    }
                }
                textView12.setText(strB);
                lb7Var.m.setVisibility((oa7.a(cpVar) || ((uv6) cpVar.u()).O == s77Var4) ? i : 0);
                ImageView imageView2 = lb7Var.h;
                TextView textView13 = lb7Var.F;
                int iOrdinal2 = ((uv6) cpVar.u()).k.ordinal();
                int i4 = R.drawable.ic_status_win_new;
                switch (iOrdinal2) {
                    case 0:
                        i4 = 0;
                        break;
                    case 1:
                        i4 = R.drawable.ic_status_lost_new;
                        break;
                    case 2:
                    case 3:
                    case 4:
                    case 7:
                        break;
                    case 5:
                    case 6:
                        i4 = R.drawable.ic_status_accepted_new;
                        break;
                    default:
                        t9f.b();
                        return null;
                }
                imageView2.setImageResource(i4);
                mvn mvnVar = ((uv6) cpVar.u()).k;
                Context context2 = view.getContext();
                context2.getClass();
                int iOrdinal3 = mvnVar.ordinal();
                if (iOrdinal3 == 1) {
                    TypedValue typedValue = j5d.f15927a;
                    color = context2.getColor(R.color.static_red);
                } else if (iOrdinal3 == 2 || iOrdinal3 == 3 || iOrdinal3 == 4 || iOrdinal3 == 7) {
                    TypedValue typedValue2 = j5d.f15927a;
                    color = context2.getColor(R.color.static_green);
                } else {
                    TypedValue typedValue3 = j5d.f15927a;
                    color = j5d.a(context2, R.attr.uikitPrimary, false);
                }
                textView13.setTextColor(color);
                textView13.setText(((uv6) cpVar.u()).M);
                lb7Var.k.setVisibility(((uv6) cpVar.u()).N.length() > 0 ? 0 : i);
                lb7Var.Q.setText(((uv6) cpVar.u()).N);
                float dimension = ((uv6) cpVar.u()).T ? cpVar.w.getResources().getDimension(R.dimen.corner_radius_8) : 0.0f;
                MaterialCardView materialCardView = lb7Var.f;
                FrameLayout frameLayout = lb7Var.f19740a;
                daf dafVarL = materialCardView.getShapeAppearanceModel().l();
                dafVarL.T(dimension);
                dafVarL.U(dimension);
                materialCardView.setShapeAppearanceModel(dafVarL.c());
                float f = ((uv6) cpVar.u()).T ? 4.0f : 0.0f;
                Context context3 = frameLayout.getContext();
                context3.getClass();
                int iCeil = f == 0.0f ? 0 : (int) Math.ceil(context3.getResources().getDisplayMetrics().density * f);
                Context context4 = frameLayout.getContext();
                context4.getClass();
                int iCeil2 = (int) Math.ceil(context4.getResources().getDisplayMetrics().density * 8.0f);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                layoutParams.setMargins(iCeil2, 0, iCeil2, iCeil);
                materialCardView.setLayoutParams(layoutParams);
                return Unit.f46060a;
            default:
                ((View) obj).getClass();
                vftVar.invoke(Long.valueOf(((uv6) cpVar.u()).i));
                return Unit.f46060a;
        }
    }

    public /* synthetic */ na7(vft vftVar, cp cpVar) {
        this.b = vftVar;
        this.c = cpVar;
    }
}

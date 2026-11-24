package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.card.MaterialCardView;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.cyber.section.impl.championships.regular.presentation.world_cup.tournament_info.ExpandableTextView;
import org.xplatform.ui_core.GradientTextView;
import org.xplatform.uikit.components.accordion.DsAccordion;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class efr0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f7731a;

    public /* synthetic */ efr0(byte b) {
        this.f7731a = b;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x01bf A[PHI: r1
  0x01bf: PHI (r1v69 int) = (r1v68 int), (r1v70 int), (r1v71 int), (r1v72 int), (r1v73 int), (r1v74 int) binds: [B:43:0x016f, B:45:0x017b, B:47:0x0187, B:49:0x0193, B:51:0x019f, B:53:0x01aa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:69:0x0216 A[PHI: r1
  0x0216: PHI (r1v62 int) = (r1v61 int), (r1v63 int), (r1v64 int) binds: [B:61:0x01e9, B:63:0x01f5, B:65:0x0201] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f7731a;
        int i = R.id.tvTeamName;
        jur0 jur0VarA = null;
        switch (b) {
            case 0:
                Function1 function1 = (Function1) obj;
                Function1 function2 = (Function1) obj2;
                function1.getClass();
                function2.getClass();
                function1.invoke(new t9r0((byte) 14));
                function2.invoke(new joq0((byte) 29));
                return Unit.f46060a;
            case 1:
                Function1 function3 = (Function1) obj;
                Function1 function4 = (Function1) obj2;
                function3.getClass();
                function4.getClass();
                function3.invoke(new t9r0((byte) 12));
                function4.invoke(new joq0((byte) 27));
                return Unit.f46060a;
            case 2:
                Function1 function5 = (Function1) obj;
                Function1 function6 = (Function1) obj2;
                function5.getClass();
                function6.getClass();
                function5.invoke(new t9r0((byte) 15));
                function6.invoke(new dfr0((byte) 1));
                return Unit.f46060a;
            case 3:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 4:
                ((Integer) obj).getClass();
                hmr0 hmr0Var = (hmr0) obj2;
                int i2 = ylr0.m2;
                hmr0Var.getClass();
                return Integer.valueOf(hmr0Var.f13321a);
            case 5:
                ql5 ql5Var = (ql5) obj;
                ql5 ql5Var2 = (ql5) obj2;
                ql5Var.getClass();
                ql5Var2.getClass();
                return Boolean.valueOf(ql5Var.f28916a == ql5Var2.f28916a);
            case 6:
                ftr0 ftr0Var = (ftr0) obj2;
                ((oyg0) obj).getClass();
                ftr0Var.getClass();
                jur0 jur0Var = ftr0Var.h;
                if (jur0Var != null) {
                    String str = (String) jur0Var.b.getValue();
                    jur0VarA = jur0.a(jur0Var, str != null && str.length() > 0, 3);
                }
                return ftr0.a(ftr0Var, null, null, null, false, jur0VarA, 127);
            case 7:
                ztr0 ztr0Var = (ztr0) obj2;
                ((oyg0) obj).getClass();
                ztr0Var.getClass();
                List<vd80> list = ztr0Var.b;
                ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                for (vd80 vd80Var : list) {
                    List list2 = vd80Var.d;
                    ArrayList arrayList2 = new ArrayList(r3d.q(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(ntr0.a((ntr0) it.next(), false));
                    }
                    arrayList.add(vd80.a(vd80Var, be80.b, 0, arrayList2));
                }
                return new ztr0(ztr0Var.f44976a, arrayList, ztr0Var.c, 0);
            case 8:
                ztr0 ztr0Var2 = (ztr0) obj2;
                ((oyg0) obj).getClass();
                ztr0Var2.getClass();
                int i3 = ztr0Var2.d;
                int i4 = ztr0Var2.c;
                if (i3 == i4) {
                    return ztr0Var2;
                }
                List<vd80> list3 = ztr0Var2.b;
                ArrayList arrayList3 = new ArrayList(r3d.q(list3, 10));
                for (vd80 vd80Var2 : list3) {
                    List list4 = vd80Var2.d;
                    ArrayList arrayList4 = new ArrayList(r3d.q(list4, 10));
                    Iterator it2 = list4.iterator();
                    while (it2.hasNext()) {
                        arrayList4.add(ntr0.a((ntr0) it2.next(), true));
                    }
                    arrayList3.add(vd80.a(vd80Var2, be80.f2437a, vd80Var2.d.size(), arrayList4));
                }
                return new ztr0(ztr0Var2.f44976a, arrayList3, i4, i4);
            case 9:
                LayoutInflater layoutInflater = (LayoutInflater) obj;
                ViewGroup viewGroup = (ViewGroup) obj2;
                layoutInflater.getClass();
                viewGroup.getClass();
                return es10.a(layoutInflater, viewGroup, false);
            case 10:
                ((Integer) obj2).getClass();
                qim0.a(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 11:
                ngk0 ngk0Var = (ngk0) obj2;
                ((azg0) obj).getClass();
                ngk0Var.getClass();
                lc00 lc00VarB = kotlin.collections.a.b();
                for (Map.Entry entry : ngk0Var.b) {
                    long jLongValue = ((Number) entry.getKey()).longValue();
                    long j = ((ne60) entry.getValue()).f23370a;
                    lc00VarB.add(Float.valueOf(jLongValue));
                    lc00VarB.add(Float.valueOf(Float.intBitsToFloat((int) (j >> 32))));
                    lc00VarB.add(Float.valueOf(Float.intBitsToFloat((int) (4294967295L & j))));
                }
                return kotlin.collections.a.a(lc00VarB);
            case 12:
                ((Integer) obj2).getClass();
                rsm0.a(x8x.L(7), (fet) obj);
                return Unit.f46060a;
            case 13:
                ViewGroup viewGroup2 = (ViewGroup) obj2;
                View viewF = rw2.f((LayoutInflater) obj, viewGroup2, R.layout.main_champ_information_item, viewGroup2, false);
                int i5 = R.id.champDateTitle;
                if (((TextView) yum0.f(viewF, R.id.champDateTitle)) != null) {
                    i5 = R.id.champPlaceTitle;
                    if (((TextView) yum0.f(viewF, R.id.champPlaceTitle)) != null) {
                        i5 = R.id.champTypeTitle;
                        if (((TextView) yum0.f(viewF, R.id.champTypeTitle)) != null) {
                            i5 = R.id.clFullDescription;
                            ConstraintLayout constraintLayout = (ConstraintLayout) yum0.f(viewF, R.id.clFullDescription);
                            if (constraintLayout != null) {
                                i5 = R.id.datesContainer;
                                ConstraintLayout constraintLayout2 = (ConstraintLayout) yum0.f(viewF, R.id.datesContainer);
                                if (constraintLayout2 != null) {
                                    i5 = R.id.ivArrow;
                                    DsAccordion dsAccordion = (DsAccordion) yum0.f(viewF, R.id.ivArrow);
                                    if (dsAccordion != null) {
                                        i5 = R.id.placeContainer;
                                        ConstraintLayout constraintLayout3 = (ConstraintLayout) yum0.f(viewF, R.id.placeContainer);
                                        if (constraintLayout3 != null) {
                                            i5 = R.id.tvChampDates;
                                            TextView textView = (TextView) yum0.f(viewF, R.id.tvChampDates);
                                            if (textView != null) {
                                                i5 = R.id.tvChampPlace;
                                                TextView textView2 = (TextView) yum0.f(viewF, R.id.tvChampPlace);
                                                if (textView2 != null) {
                                                    i5 = R.id.tvChampType;
                                                    TextView textView3 = (TextView) yum0.f(viewF, R.id.tvChampType);
                                                    if (textView3 != null) {
                                                        i5 = R.id.tvDescription;
                                                        ExpandableTextView expandableTextView = (ExpandableTextView) yum0.f(viewF, R.id.tvDescription);
                                                        if (expandableTextView != null) {
                                                            i5 = R.id.tvFullDescriptionTitle;
                                                            TextView textView4 = (TextView) yum0.f(viewF, R.id.tvFullDescriptionTitle);
                                                            if (textView4 != null) {
                                                                i5 = R.id.tvTotal;
                                                                GradientTextView gradientTextView = (GradientTextView) yum0.f(viewF, R.id.tvTotal);
                                                                if (gradientTextView != null) {
                                                                    i5 = R.id.tvTotalHeader;
                                                                    TextView textView5 = (TextView) yum0.f(viewF, R.id.tvTotalHeader);
                                                                    if (textView5 != null) {
                                                                        i5 = R.id.typeContainer;
                                                                        ConstraintLayout constraintLayout4 = (ConstraintLayout) yum0.f(viewF, R.id.typeContainer);
                                                                        if (constraintLayout4 != null) {
                                                                            return new gs10((ConstraintLayout) viewF, constraintLayout, constraintLayout2, dsAccordion, constraintLayout3, textView, textView2, textView3, expandableTextView, textView4, gradientTextView, textView5, constraintLayout4);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                hny.u("Missing required view with ID: ".concat(viewF.getResources().getResourceName(i5)));
                return null;
            case 14:
                ViewGroup viewGroup3 = (ViewGroup) obj2;
                View viewF2 = rw2.f((LayoutInflater) obj, viewGroup3, R.layout.main_champ_social_media_item, viewGroup3, false);
                int i6 = R.id.ivSocialMediaIcon;
                ImageView imageView = (ImageView) yum0.f(viewF2, R.id.ivSocialMediaIcon);
                if (imageView != null) {
                    i6 = R.id.tvSocialMediaName;
                    TextView textView6 = (TextView) yum0.f(viewF2, R.id.tvSocialMediaName);
                    if (textView6 != null) {
                        return new hs10((ConstraintLayout) viewF2, imageView, textView6);
                    }
                }
                hny.u("Missing required view with ID: ".concat(viewF2.getResources().getResourceName(i6)));
                return null;
            case 15:
                ViewGroup viewGroup4 = (ViewGroup) obj2;
                View viewF3 = rw2.f((LayoutInflater) obj, viewGroup4, R.layout.tournament_prize_distribution_collapsed_button_item, viewGroup4, false);
                int i7 = R.id.tvFullStatTitle;
                TextView textView7 = (TextView) yum0.f(viewF3, R.id.tvFullStatTitle);
                if (textView7 != null) {
                    i7 = R.id.vAccordion;
                    DsAccordion dsAccordion2 = (DsAccordion) yum0.f(viewF3, R.id.vAccordion);
                    if (dsAccordion2 != null) {
                        return new c3s0((FrameLayout) viewF3, textView7, dsAccordion2);
                    }
                }
                hny.u("Missing required view with ID: ".concat(viewF3.getResources().getResourceName(i7)));
                return null;
            case 16:
                ViewGroup viewGroup5 = (ViewGroup) obj2;
                View viewF4 = rw2.f((LayoutInflater) obj, viewGroup5, R.layout.cyber_tournament_prize_distribution_item, viewGroup5, false);
                int i8 = R.id.ivTeamIcon;
                ImageView imageView2 = (ImageView) yum0.f(viewF4, R.id.ivTeamIcon);
                if (imageView2 != null) {
                    i8 = R.id.tvPlaceNumber;
                    TextView textView8 = (TextView) yum0.f(viewF4, R.id.tvPlaceNumber);
                    if (textView8 != null) {
                        i8 = R.id.tvPrize;
                        TextView textView9 = (TextView) yum0.f(viewF4, R.id.tvPrize);
                        if (textView9 != null) {
                            TextView textView10 = (TextView) yum0.f(viewF4, R.id.tvTeamName);
                            if (textView10 != null) {
                                return new lnh((ConstraintLayout) viewF4, imageView2, textView8, textView9, textView10);
                            }
                        } else {
                            i = i8;
                        }
                    } else {
                        i = i8;
                    }
                } else {
                    i = i8;
                }
                hny.u("Missing required view with ID: ".concat(viewF4.getResources().getResourceName(i)));
                return null;
            case 17:
                ViewGroup viewGroup6 = (ViewGroup) obj2;
                View viewF5 = rw2.f((LayoutInflater) obj, viewGroup6, R.layout.main_champ_tournament_top_team_item, viewGroup6, false);
                int i9 = R.id.ivFirstWinBadge;
                ImageView imageView3 = (ImageView) yum0.f(viewF5, R.id.ivFirstWinBadge);
                if (imageView3 != null) {
                    i9 = R.id.ivPartnerBadge;
                    ImageView imageView4 = (ImageView) yum0.f(viewF5, R.id.ivPartnerBadge);
                    if (imageView4 != null) {
                        i9 = R.id.ivSecondWinBadge;
                        ImageView imageView5 = (ImageView) yum0.f(viewF5, R.id.ivSecondWinBadge);
                        if (imageView5 != null) {
                            i9 = R.id.ivTeam;
                            ImageView imageView6 = (ImageView) yum0.f(viewF5, R.id.ivTeam);
                            if (imageView6 != null) {
                                i9 = R.id.ivThirdWinBadge;
                                ImageView imageView7 = (ImageView) yum0.f(viewF5, R.id.ivThirdWinBadge);
                                if (imageView7 != null) {
                                    i9 = R.id.teamContainer;
                                    if (((FrameLayout) yum0.f(viewF5, R.id.teamContainer)) != null) {
                                        TextView textView11 = (TextView) yum0.f(viewF5, R.id.tvTeamName);
                                        if (textView11 != null) {
                                            return new is10((LinearLayout) viewF5, imageView3, imageView4, imageView5, imageView6, imageView7, textView11);
                                        }
                                    } else {
                                        i = i9;
                                    }
                                } else {
                                    i = i9;
                                }
                            } else {
                                i = i9;
                            }
                        } else {
                            i = i9;
                        }
                    } else {
                        i = i9;
                    }
                } else {
                    i = i9;
                }
                hny.u("Missing required view with ID: ".concat(viewF5.getResources().getResourceName(i)));
                return null;
            case 18:
                ViewGroup viewGroup7 = (ViewGroup) obj2;
                View viewF6 = rw2.f((LayoutInflater) obj, viewGroup7, R.layout.main_champ_tournament_top_teams, viewGroup7, false);
                if (viewF6 != null) {
                    RecyclerView recyclerView = (RecyclerView) viewF6;
                    return new js10(recyclerView, recyclerView);
                }
                hny.u("rootView");
                return null;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ViewGroup viewGroup8 = (ViewGroup) obj2;
                View viewF7 = rw2.f((LayoutInflater) obj, viewGroup8, R.layout.transaction_history_item_new, viewGroup8, false);
                MaterialCardView materialCardView = (MaterialCardView) viewF7;
                int i10 = R.id.tvCreditTitle;
                if (((TextView) yum0.f(viewF7, R.id.tvCreditTitle)) != null) {
                    i10 = R.id.tvCreditValue;
                    TextView textView12 = (TextView) yum0.f(viewF7, R.id.tvCreditValue);
                    if (textView12 != null) {
                        i10 = R.id.tvDate;
                        TextView textView13 = (TextView) yum0.f(viewF7, R.id.tvDate);
                        if (textView13 != null) {
                            i10 = R.id.tvNewValue;
                            TextView textView14 = (TextView) yum0.f(viewF7, R.id.tvNewValue);
                            if (textView14 != null) {
                                i10 = R.id.tvNewValueTitle;
                                if (((TextView) yum0.f(viewF7, R.id.tvNewValueTitle)) != null) {
                                    return new cfs0(materialCardView, textView12, textView13, textView14);
                                }
                            }
                        }
                    }
                }
                hny.u("Missing required view with ID: ".concat(viewF7.getResources().getResourceName(i10)));
                return null;
            case 20:
                ((Integer) obj).getClass();
                g3k0 g3k0Var = (g3k0) obj2;
                g3k0Var.getClass();
                return g3k0Var.a();
            case 21:
                b1j.z((String) obj2, (Throwable) obj);
                return Unit.f46060a;
            case 22:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 23:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 24:
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((Integer) obj2).getClass();
                cwr0.E(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((Integer) obj2).getClass();
                cwr0.D(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                LayoutInflater layoutInflater2 = (LayoutInflater) obj;
                ViewGroup viewGroup9 = (ViewGroup) obj2;
                layoutInflater2.getClass();
                viewGroup9.getClass();
                return zvx.a(layoutInflater2, viewGroup9);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                LayoutInflater layoutInflater3 = (LayoutInflater) obj;
                ViewGroup viewGroup10 = (ViewGroup) obj2;
                layoutInflater3.getClass();
                viewGroup10.getClass();
                return dux.a(layoutInflater3, viewGroup10);
            default:
                int iIntValue = ((Integer) obj).intValue();
                grh grhVar = (grh) obj2;
                grhVar.getClass();
                sgy sgyVarB = sre0.f32672a.b(grhVar.getClass());
                StringBuilder sb = new StringBuilder();
                sb.append(sgyVarB);
                sb.append(iIntValue);
                return sb.toString();
        }
    }

    public /* synthetic */ efr0(int i, byte b) {
        this.f7731a = b;
    }
}

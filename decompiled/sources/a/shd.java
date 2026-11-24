package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.sportgame.classic.impl.presentation.legacy.views.CustomCutTextView;
import org.xplatform.ui_core.viewcomponents.imageview.RoundCornerImageView;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class shd implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f32205a;

    public /* synthetic */ shd(byte b) {
        this.f32205a = b;
    }

    /* JADX WARN: Code duplicated, block: B:152:0x0378 A[PHI: r2
  0x0378: PHI (r2v73 int) = (r2v72 int), (r2v74 int) binds: [B:142:0x0346, B:148:0x0361] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:229:0x0571 A[PHI: r2
  0x0571: PHI (r2v38 int) = (r2v37 int), (r2v45 int) binds: [B:207:0x04e1, B:221:0x053c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:230:0x0573 A[PHI: r1
  0x0573: PHI (r1v91 int) = 
  (r1v90 int)
  (r1v92 int)
  (r1v93 int)
  (r1v94 int)
  (r1v95 int)
  (r1v96 int)
  (r1v99 int)
  (r1v100 int)
  (r1v101 int)
  (r1v102 int)
  (r1v103 int)
  (r1v104 int)
 binds: [B:195:0x049b, B:197:0x04a6, B:199:0x04b1, B:201:0x04bc, B:203:0x04c9, B:205:0x04d6, B:209:0x04ee, B:211:0x04fb, B:213:0x0508, B:215:0x0515, B:217:0x0522, B:219:0x052f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x0187 A[PHI: r1
  0x0187: PHI (r1v175 int) = (r1v174 int), (r1v176 int), (r1v177 int), (r1v178 int), (r1v179 int) binds: [B:58:0x0141, B:60:0x014d, B:62:0x0159, B:64:0x0165, B:66:0x016e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v219 */
    /* JADX WARN: Type inference failed for: r1v220 */
    /* JADX WARN: Type inference failed for: r1v221 */
    /* JADX WARN: Type inference failed for: r1v222 */
    /* JADX WARN: Type inference failed for: r1v64 */
    /* JADX WARN: Type inference failed for: r1v65 */
    /* JADX WARN: Type inference failed for: r1v66 */
    /* JADX WARN: Type inference failed for: r1v67, types: [a.xz40] */
    /* JADX WARN: Type inference failed for: r1v68 */
    /* JADX WARN: Type inference failed for: r1v69 */
    /* JADX WARN: Type inference failed for: r1v70, types: [a.xz40] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24, types: [a.lm40] */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29, types: [a.lm40] */
    /* JADX WARN: Type inference failed for: r3v30, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v44 */
    /* JADX WARN: Type inference failed for: r3v45 */
    /* JADX WARN: Type inference failed for: r4v20 */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        switch (this.f32205a) {
            case 0:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    zcl zclVar = qmk.f28987a;
                    dww.c(a8k0.F(R.drawable.ic_glyph_arrow_left, 0, fetVar), null, o7k0.n(jm40.b, 24.0f), ((ThemeColors) fetVar.k(zaq0.b)).getSecondary(), fetVar, 56, 0);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 1:
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ooo0 ooo0Var = new ooo0("Live", "TagLive", kro0.f18776a);
                    tqo0 tqo0Var = tqo0.f34390a;
                    tnq0.e(48, 1, fetVar2, dyb.g0(ooo0Var, new qoo0("Promo", "TagPromo", tqo0Var), new qoo0("Big Text Promo Title Text Big", "TagPromo", tqo0Var), new qoo0("Promo", "TagPromo", tqo0Var), new ioo0("AutoSub")), null);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 2:
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    v2n0.a(0, fetVar3, null);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 3:
                fet fetVar4 = (fet) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    kc5.c0(0, fetVar4);
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            case 4:
                fet fetVar5 = (fet) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (!fetVar5.U(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    fetVar5.X();
                }
                return Unit.f46060a;
            case 5:
                fet fetVar6 = (fet) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (!fetVar6.U(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    fetVar6.X();
                }
                return Unit.f46060a;
            case 6:
                fet fetVar7 = (fet) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (!fetVar7.U(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    fetVar7.X();
                }
                return Unit.f46060a;
            case 7:
                fet fetVar8 = (fet) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (!fetVar8.U(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    fetVar8.X();
                }
                return Unit.f46060a;
            case 8:
                fet fetVar9 = (fet) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (!fetVar9.U(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    fetVar9.X();
                }
                return Unit.f46060a;
            case 9:
                fet fetVar10 = (fet) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (!fetVar10.U(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    fetVar10.X();
                }
                return Unit.f46060a;
            case 10:
                ((e7z) ((mkd) obj)).e0((mm40) obj2);
                return Unit.f46060a;
            case 11:
                xld xldVar = (xld) obj2;
                e7z e7zVar = (e7z) ((mkd) obj);
                e7zVar.Y = xldVar;
                tzi tziVar = e7zVar.h1;
                zfn zfnVar = bmd.h;
                bh90 bh90Var = (bh90) xldVar;
                bh90Var.getClass();
                e7zVar.a0((w6k) qbc.V(bh90Var, zfnVar));
                bh90 bh90Var2 = (bh90) xldVar;
                k6z k6zVar = (k6z) qbc.V(bh90Var2, bmd.n);
                if (e7zVar.A != k6zVar) {
                    e7zVar.A = k6zVar;
                    e7zVar.F();
                    e7z e7zVarV = e7zVar.v();
                    if (e7zVarV != null) {
                        e7zVarV.D();
                    } else {
                        cg80 cg80Var = e7zVar.o;
                        if (cg80Var != null) {
                            ((AndroidComposeView) cg80Var).invalidate();
                        }
                    }
                    e7zVar.E();
                    for (lm40 lm40Var = (lm40) tziVar.g; lm40Var != null; lm40Var = lm40Var.f) {
                        lm40Var.H();
                    }
                }
                e7zVar.f0((wgu0) qbc.V(bh90Var2, bmd.t));
                lm40 lm40Var2 = (lm40) tziVar.g;
                if ((lm40Var2.d & 32768) != 0) {
                    while (lm40Var2 != null) {
                        if ((lm40Var2.c & 32768) != 0) {
                            ?? V = lm40Var2;
                            ?? xz40Var = 0;
                            while (V != 0) {
                                if (V instanceof vld) {
                                    lm40 lm40Var3 = ((lm40) ((vld) V)).f20279a;
                                    if (lm40Var3.n) {
                                        t460.c(lm40Var3);
                                    } else {
                                        lm40Var3.j = true;
                                    }
                                } else if ((V.c & 32768) != 0 && (V instanceof f3k)) {
                                    lm40 lm40Var4 = ((f3k) V).p;
                                    int i7 = 0;
                                    xz40Var = xz40Var;
                                    V = V;
                                    while (lm40Var4 != null) {
                                        if ((lm40Var4.c & 32768) != 0) {
                                            i7++;
                                            xz40Var = xz40Var;
                                            if (i7 == 1) {
                                                V = lm40Var4;
                                            } else {
                                                if (xz40Var == 0) {
                                                    xz40Var = new xz40(new lm40[16]);
                                                }
                                                if (V != 0) {
                                                    xz40Var.b(V);
                                                    V = 0;
                                                }
                                                xz40Var.b(lm40Var4);
                                            }
                                        }
                                        lm40Var4 = lm40Var4.f;
                                        xz40Var = xz40Var;
                                        V = V;
                                    }
                                    if (i7 == 1) {
                                    }
                                }
                                V = vcc.V(xz40Var);
                            }
                        }
                        if ((lm40Var2.d & 32768) != 0) {
                            lm40Var2 = lm40Var2.f;
                        }
                    }
                }
                return Unit.f46060a;
            case 12:
                ((e7z) ((mkd) obj)).d0((tj30) obj2);
                return Unit.f46060a;
            case 13:
                ((Integer) obj2).getClass();
                ((e7z) ((mkd) obj)).getClass();
                return Unit.f46060a;
            case 14:
                fet fetVar11 = (fet) obj;
                ((Integer) obj2).getClass();
                fetVar11.e0(-1397438895);
                WeakHashMap weakHashMap = djv0.w;
                q33 q33Var = zcm0.i(fetVar11).f;
                fetVar11.r(false);
                return q33Var;
            case 15:
                fet fetVar12 = (fet) obj;
                ((Integer) obj2).getClass();
                fetVar12.e0(79690181);
                WeakHashMap weakHashMap2 = djv0.w;
                q33 q33Var2 = zcm0.i(fetVar12).f;
                fetVar12.r(false);
                return q33Var2;
            case 16:
                ViewGroup viewGroup = (ViewGroup) obj2;
                View viewF = rw2.f((LayoutInflater) obj, viewGroup, R.layout.item_compressed_common, viewGroup, false);
                int i8 = R.id.bOneTeamImages;
                if (((Barrier) yum0.f(viewF, R.id.bOneTeamImages)) != null) {
                    i8 = R.id.bTwoTeamImages;
                    if (((Barrier) yum0.f(viewF, R.id.bTwoTeamImages)) != null) {
                        i8 = R.id.flTeamOneLogos;
                        if (((Flow) yum0.f(viewF, R.id.flTeamOneLogos)) != null) {
                            i8 = R.id.flTeamTwoLogos;
                            if (((Flow) yum0.f(viewF, R.id.flTeamTwoLogos)) != null) {
                                i8 = R.id.gLogosPairTeams;
                                Group group = (Group) yum0.f(viewF, R.id.gLogosPairTeams);
                                if (group != null) {
                                    i8 = R.id.gLogosTeams;
                                    Group group2 = (Group) yum0.f(viewF, R.id.gLogosTeams);
                                    if (group2 != null) {
                                        int i9 = R.id.glBottom;
                                        if (((Guideline) yum0.f(viewF, R.id.glBottom)) != null) {
                                            i8 = R.id.ivOneTeam;
                                            RoundCornerImageView roundCornerImageView = (RoundCornerImageView) yum0.f(viewF, R.id.ivOneTeam);
                                            if (roundCornerImageView != null) {
                                                i8 = R.id.ivOneTeamFirstPlayer;
                                                RoundCornerImageView roundCornerImageView2 = (RoundCornerImageView) yum0.f(viewF, R.id.ivOneTeamFirstPlayer);
                                                if (roundCornerImageView2 != null) {
                                                    i8 = R.id.ivOneTeamSecondPlayer;
                                                    RoundCornerImageView roundCornerImageView3 = (RoundCornerImageView) yum0.f(viewF, R.id.ivOneTeamSecondPlayer);
                                                    if (roundCornerImageView3 != null) {
                                                        i8 = R.id.ivTwoTeam;
                                                        RoundCornerImageView roundCornerImageView4 = (RoundCornerImageView) yum0.f(viewF, R.id.ivTwoTeam);
                                                        if (roundCornerImageView4 != null) {
                                                            i8 = R.id.ivTwoTeamFirstPlayer;
                                                            RoundCornerImageView roundCornerImageView5 = (RoundCornerImageView) yum0.f(viewF, R.id.ivTwoTeamFirstPlayer);
                                                            if (roundCornerImageView5 != null) {
                                                                i8 = R.id.ivTwoTeamSecondPlayer;
                                                                RoundCornerImageView roundCornerImageView6 = (RoundCornerImageView) yum0.f(viewF, R.id.ivTwoTeamSecondPlayer);
                                                                if (roundCornerImageView6 != null) {
                                                                    i9 = R.id.tvMatchBaseInfo;
                                                                    TextView textView = (TextView) yum0.f(viewF, R.id.tvMatchBaseInfo);
                                                                    if (textView != null) {
                                                                        i = R.id.tvOneTeamName;
                                                                        CustomCutTextView customCutTextView = (CustomCutTextView) yum0.f(viewF, R.id.tvOneTeamName);
                                                                        if (customCutTextView != null) {
                                                                            i = R.id.tvScore;
                                                                            AppCompatTextView appCompatTextView = (AppCompatTextView) yum0.f(viewF, R.id.tvScore);
                                                                            if (appCompatTextView != null) {
                                                                                i = R.id.tvTwoTeamName;
                                                                                CustomCutTextView customCutTextView2 = (CustomCutTextView) yum0.f(viewF, R.id.tvTwoTeamName);
                                                                                if (customCutTextView2 != null) {
                                                                                    return new ntx((ConstraintLayout) viewF, group, group2, roundCornerImageView, roundCornerImageView2, roundCornerImageView3, roundCornerImageView4, roundCornerImageView5, roundCornerImageView6, textView, customCutTextView, appCompatTextView, customCutTextView2);
                                                                                }
                                                                            }
                                                                        }
                                                                    } else {
                                                                        i = i9;
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
                                                    } else {
                                                        i = i8;
                                                    }
                                                } else {
                                                    i = i8;
                                                }
                                            } else {
                                                i = i8;
                                            }
                                        } else {
                                            i = i9;
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
                        } else {
                            i = i8;
                        }
                    } else {
                        i = i8;
                    }
                } else {
                    i = i8;
                }
                hny.u("Missing required view with ID: ".concat(viewF.getResources().getResourceName(i)));
                return null;
            case 17:
                ((Long) obj).getClass();
                ((Boolean) obj2).getClass();
                return Unit.f46060a;
            case 18:
                ((Long) obj).getClass();
                ((Boolean) obj2).getClass();
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ViewGroup viewGroup2 = (ViewGroup) obj2;
                View viewF2 = rw2.f((LayoutInflater) obj, viewGroup2, R.layout.item_compressed_card_error, viewGroup2, false);
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) yum0.f(viewF2, R.id.tvErrorMessage);
                if (appCompatTextView2 != null) {
                    return new ktx((FrameLayout) viewF2, appCompatTextView2);
                }
                hny.u("Missing required view with ID: ".concat(viewF2.getResources().getResourceName(R.id.tvErrorMessage)));
                return null;
            case 20:
                ViewGroup viewGroup3 = (ViewGroup) obj2;
                View viewF3 = rw2.f((LayoutInflater) obj, viewGroup3, R.layout.item_compressed_multi_teams, viewGroup3, false);
                if (((Guideline) yum0.f(viewF3, R.id.glBottom)) != null) {
                    TextView textView2 = (TextView) yum0.f(viewF3, R.id.tvMatchBaseInfo);
                    if (textView2 != null) {
                        i2 = R.id.tvOneTeamGroupName;
                        TextView textView3 = (TextView) yum0.f(viewF3, R.id.tvOneTeamGroupName);
                        if (textView3 != null) {
                            i2 = R.id.tvScore;
                            AppCompatTextView appCompatTextView3 = (AppCompatTextView) yum0.f(viewF3, R.id.tvScore);
                            if (appCompatTextView3 != null) {
                                i2 = R.id.tvTwoTeamGroupName;
                                TextView textView4 = (TextView) yum0.f(viewF3, R.id.tvTwoTeamGroupName);
                                if (textView4 != null) {
                                    return new ptx((ConstraintLayout) viewF3, textView2, textView3, appCompatTextView3, textView4);
                                }
                            }
                        }
                    } else {
                        i2 = R.id.tvMatchBaseInfo;
                    }
                } else {
                    i2 = R.id.glBottom;
                }
                hny.u("Missing required view with ID: ".concat(viewF3.getResources().getResourceName(i2)));
                return null;
            case 21:
                ((Long) obj).getClass();
                ((Boolean) obj2).getClass();
                return Unit.f46060a;
            case 22:
                ((Long) obj).getClass();
                ((Boolean) obj2).getClass();
                return Unit.f46060a;
            case 23:
                ViewGroup viewGroup4 = (ViewGroup) obj2;
                View viewF4 = rw2.f((LayoutInflater) obj, viewGroup4, R.layout.item_compressed_card_period, viewGroup4, false);
                if (((Barrier) yum0.f(viewF4, R.id.bTeamsLogo)) == null) {
                    i3 = R.id.bTeamsLogo;
                } else if (((Barrier) yum0.f(viewF4, R.id.bTotalScore)) == null) {
                    i3 = R.id.bTotalScore;
                } else if (((Barrier) yum0.f(viewF4, R.id.bTotalScoreDividers)) != null) {
                    i3 = R.id.btvTeamsName;
                    if (((Barrier) yum0.f(viewF4, R.id.btvTeamsName)) != null) {
                        i3 = R.id.clGameScore;
                        if (((ConstraintLayout) yum0.f(viewF4, R.id.clGameScore)) != null) {
                            i3 = R.id.gTvTeamPointsScores;
                            Group group3 = (Group) yum0.f(viewF4, R.id.gTvTeamPointsScores);
                            if (group3 != null) {
                                i3 = R.id.gTvTeamScores;
                                Group group4 = (Group) yum0.f(viewF4, R.id.gTvTeamScores);
                                if (group4 != null) {
                                    i3 = R.id.ivTeamOneInning;
                                    ImageView imageView = (ImageView) yum0.f(viewF4, R.id.ivTeamOneInning);
                                    if (imageView != null) {
                                        RoundCornerImageView roundCornerImageView7 = (RoundCornerImageView) yum0.f(viewF4, R.id.ivTeamOneLogo);
                                        if (roundCornerImageView7 != null) {
                                            i3 = R.id.ivTeamOneSecondPlayerLogo;
                                            RoundCornerImageView roundCornerImageView8 = (RoundCornerImageView) yum0.f(viewF4, R.id.ivTeamOneSecondPlayerLogo);
                                            if (roundCornerImageView8 != null) {
                                                i3 = R.id.ivTeamTwoInning;
                                                ImageView imageView2 = (ImageView) yum0.f(viewF4, R.id.ivTeamTwoInning);
                                                if (imageView2 != null) {
                                                    RoundCornerImageView roundCornerImageView9 = (RoundCornerImageView) yum0.f(viewF4, R.id.ivTeamTwoLogo);
                                                    if (roundCornerImageView9 != null) {
                                                        i3 = R.id.ivTeamTwoSecondPlayerLogo;
                                                        RoundCornerImageView roundCornerImageView10 = (RoundCornerImageView) yum0.f(viewF4, R.id.ivTeamTwoSecondPlayerLogo);
                                                        if (roundCornerImageView10 != null) {
                                                            RecyclerView recyclerView = (RecyclerView) yum0.f(viewF4, R.id.rvPeriods);
                                                            if (recyclerView != null) {
                                                                i3 = R.id.tvPeriodTitle;
                                                                TextView textView5 = (TextView) yum0.f(viewF4, R.id.tvPeriodTitle);
                                                                if (textView5 != null) {
                                                                    TextView textView6 = (TextView) yum0.f(viewF4, R.id.tvPeriodsName);
                                                                    if (textView6 != null) {
                                                                        i3 = R.id.tvPointsTitle;
                                                                        TextView textView7 = (TextView) yum0.f(viewF4, R.id.tvPointsTitle);
                                                                        if (textView7 != null) {
                                                                            TextView textView8 = (TextView) yum0.f(viewF4, R.id.tvTeamOneName);
                                                                            if (textView8 != null) {
                                                                                i3 = R.id.tvTeamOnePointScore;
                                                                                TextView textView9 = (TextView) yum0.f(viewF4, R.id.tvTeamOnePointScore);
                                                                                if (textView9 != null) {
                                                                                    i3 = R.id.tvTeamOneScore;
                                                                                    TextView textView10 = (TextView) yum0.f(viewF4, R.id.tvTeamOneScore);
                                                                                    if (textView10 != null) {
                                                                                        TextView textView11 = (TextView) yum0.f(viewF4, R.id.tvTeamOneTotalScore);
                                                                                        if (textView11 != null) {
                                                                                            TextView textView12 = (TextView) yum0.f(viewF4, R.id.tvTeamTwoName);
                                                                                            if (textView12 != null) {
                                                                                                i3 = R.id.tvTeamTwoPointScore;
                                                                                                TextView textView13 = (TextView) yum0.f(viewF4, R.id.tvTeamTwoPointScore);
                                                                                                if (textView13 != null) {
                                                                                                    i3 = R.id.tvTeamTwoScore;
                                                                                                    TextView textView14 = (TextView) yum0.f(viewF4, R.id.tvTeamTwoScore);
                                                                                                    if (textView14 != null) {
                                                                                                        TextView textView15 = (TextView) yum0.f(viewF4, R.id.tvTeamTwoTotalScore);
                                                                                                        if (textView15 != null) {
                                                                                                            i3 = R.id.tvTotalScoreName;
                                                                                                            if (((TextView) yum0.f(viewF4, R.id.tvTotalScoreName)) != null) {
                                                                                                                int i10 = R.id.vHeaderBackground;
                                                                                                                View viewF5 = yum0.f(viewF4, R.id.vHeaderBackground);
                                                                                                                if (viewF5 != null) {
                                                                                                                    i3 = R.id.vTeamOneTotalScoreDivider;
                                                                                                                    View viewF6 = yum0.f(viewF4, R.id.vTeamOneTotalScoreDivider);
                                                                                                                    if (viewF6 != null) {
                                                                                                                        i3 = R.id.vTeamTwoTotalScoreDivider;
                                                                                                                        View viewF7 = yum0.f(viewF4, R.id.vTeamTwoTotalScoreDivider);
                                                                                                                        if (viewF7 != null) {
                                                                                                                            i10 = R.id.vTeamsDivider;
                                                                                                                            View viewF8 = yum0.f(viewF4, R.id.vTeamsDivider);
                                                                                                                            if (viewF8 != null) {
                                                                                                                                i3 = R.id.vTotalScoreNameDivider;
                                                                                                                                View viewF9 = yum0.f(viewF4, R.id.vTotalScoreNameDivider);
                                                                                                                                if (viewF9 != null) {
                                                                                                                                    return new mtx((ConstraintLayout) viewF4, group3, group4, imageView, roundCornerImageView7, roundCornerImageView8, imageView2, roundCornerImageView9, roundCornerImageView10, recyclerView, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14, textView15, viewF5, viewF6, viewF7, viewF8, viewF9);
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                i3 = i10;
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    i3 = i10;
                                                                                                                }
                                                                                                            }
                                                                                                        } else {
                                                                                                            i3 = R.id.tvTeamTwoTotalScore;
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                i3 = R.id.tvTeamTwoName;
                                                                                            }
                                                                                        } else {
                                                                                            i3 = R.id.tvTeamOneTotalScore;
                                                                                        }
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                i3 = R.id.tvTeamOneName;
                                                                            }
                                                                        }
                                                                    } else {
                                                                        i3 = R.id.tvPeriodsName;
                                                                    }
                                                                }
                                                            } else {
                                                                i3 = R.id.rvPeriods;
                                                            }
                                                        }
                                                    } else {
                                                        i3 = R.id.ivTeamTwoLogo;
                                                    }
                                                }
                                            }
                                        } else {
                                            i3 = R.id.ivTeamOneLogo;
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    i3 = R.id.bTotalScoreDividers;
                }
                hny.u("Missing required view with ID: ".concat(viewF4.getResources().getResourceName(i3)));
                return null;
            case 24:
                ((Long) obj).getClass();
                ((Boolean) obj2).getClass();
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((Long) obj).getClass();
                ((Boolean) obj2).getClass();
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ViewGroup viewGroup5 = (ViewGroup) obj2;
                View viewF10 = rw2.f((LayoutInflater) obj, viewGroup5, R.layout.item_compressed_single_game, viewGroup5, false);
                if (((Guideline) yum0.f(viewF10, R.id.glBottom)) != null) {
                    TextView textView16 = (TextView) yum0.f(viewF10, R.id.tvMatchBaseInfo);
                    if (textView16 != null) {
                        i4 = R.id.tvMatchName;
                        TextView textView17 = (TextView) yum0.f(viewF10, R.id.tvMatchName);
                        if (textView17 != null) {
                            return new stx((ConstraintLayout) viewF10, textView16, textView17);
                        }
                    } else {
                        i4 = R.id.tvMatchBaseInfo;
                    }
                } else {
                    i4 = R.id.glBottom;
                }
                hny.u("Missing required view with ID: ".concat(viewF10.getResources().getResourceName(i4)));
                return null;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ViewGroup viewGroup6 = (ViewGroup) obj2;
                View viewF11 = rw2.f((LayoutInflater) obj, viewGroup6, R.layout.item_compressed_period_event, viewGroup6, false);
                int i11 = R.id.gLHeader;
                if (((Guideline) yum0.f(viewF11, R.id.gLHeader)) != null) {
                    i11 = R.id.ivEventType;
                    ImageView imageView3 = (ImageView) yum0.f(viewF11, R.id.ivEventType);
                    if (imageView3 != null) {
                        i11 = R.id.tvTeamOneValue;
                        TextView textView18 = (TextView) yum0.f(viewF11, R.id.tvTeamOneValue);
                        if (textView18 != null) {
                            i11 = R.id.tvTeamTwoValue;
                            TextView textView19 = (TextView) yum0.f(viewF11, R.id.tvTeamTwoValue);
                            if (textView19 != null) {
                                i11 = R.id.vScoreHeight;
                                View viewF12 = yum0.f(viewF11, R.id.vScoreHeight);
                                if (viewF12 != null) {
                                    View viewF13 = yum0.f(viewF11, R.id.vTeamsDivider);
                                    if (viewF13 != null) {
                                        return new rtx((ConstraintLayout) viewF11, imageView3, textView18, textView19, viewF12, viewF13);
                                    }
                                    i5 = R.id.vTeamsDivider;
                                } else {
                                    i5 = i11;
                                }
                            } else {
                                i5 = i11;
                            }
                        } else {
                            i5 = i11;
                        }
                    } else {
                        i5 = i11;
                    }
                } else {
                    i5 = i11;
                }
                hny.u("Missing required view with ID: ".concat(viewF11.getResources().getResourceName(i5)));
                return null;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                LayoutInflater layoutInflater = (LayoutInflater) obj;
                ViewGroup viewGroup7 = (ViewGroup) obj2;
                layoutInflater.getClass();
                viewGroup7.getClass();
                return qtx.a(layoutInflater, viewGroup7);
            default:
                ViewGroup viewGroup8 = (ViewGroup) obj2;
                View viewF14 = rw2.f((LayoutInflater) obj, viewGroup8, R.layout.item_compressed_card_football_period, viewGroup8, false);
                if (((Barrier) yum0.f(viewF14, R.id.bTeamsLogo)) == null) {
                    i6 = R.id.bTeamsLogo;
                } else if (((Barrier) yum0.f(viewF14, R.id.bTotalScore)) == null) {
                    i6 = R.id.bTotalScore;
                } else if (((Barrier) yum0.f(viewF14, R.id.bTotalScoreDividers)) != null) {
                    RoundCornerImageView roundCornerImageView11 = (RoundCornerImageView) yum0.f(viewF14, R.id.ivTeamOneLogo);
                    if (roundCornerImageView11 != null) {
                        RoundCornerImageView roundCornerImageView12 = (RoundCornerImageView) yum0.f(viewF14, R.id.ivTeamTwoLogo);
                        if (roundCornerImageView12 != null) {
                            RecyclerView recyclerView2 = (RecyclerView) yum0.f(viewF14, R.id.rvPeriods);
                            if (recyclerView2 == null) {
                                i6 = R.id.rvPeriods;
                            } else if (((TextView) yum0.f(viewF14, R.id.tvPeriodsName)) != null) {
                                TextView textView20 = (TextView) yum0.f(viewF14, R.id.tvTeamOneName);
                                if (textView20 != null) {
                                    TextView textView21 = (TextView) yum0.f(viewF14, R.id.tvTeamOneTotalScore);
                                    if (textView21 != null) {
                                        TextView textView22 = (TextView) yum0.f(viewF14, R.id.tvTeamTwoName);
                                        if (textView22 != null) {
                                            TextView textView23 = (TextView) yum0.f(viewF14, R.id.tvTeamTwoTotalScore);
                                            if (textView23 == null) {
                                                i6 = R.id.tvTeamTwoTotalScore;
                                            } else if (((TextView) yum0.f(viewF14, R.id.tvTotalScoreName)) != null) {
                                                View viewF15 = yum0.f(viewF14, R.id.vHeaderBackground);
                                                if (viewF15 != null) {
                                                    i6 = R.id.vTeamOneTotalScoreDivider;
                                                    View viewF16 = yum0.f(viewF14, R.id.vTeamOneTotalScoreDivider);
                                                    if (viewF16 != null) {
                                                        i6 = R.id.vTeamTwoTotalScoreDivider;
                                                        View viewF17 = yum0.f(viewF14, R.id.vTeamTwoTotalScoreDivider);
                                                        if (viewF17 != null) {
                                                            View viewF18 = yum0.f(viewF14, R.id.vTeamsDivider);
                                                            if (viewF18 != null) {
                                                                i6 = R.id.vTotalScoreNameDivider;
                                                                View viewF19 = yum0.f(viewF14, R.id.vTotalScoreNameDivider);
                                                                if (viewF19 != null) {
                                                                    return new ltx((ConstraintLayout) viewF14, roundCornerImageView11, roundCornerImageView12, recyclerView2, textView20, textView21, textView22, textView23, viewF15, viewF16, viewF17, viewF18, viewF19);
                                                                }
                                                            } else {
                                                                i6 = R.id.vTeamsDivider;
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    i6 = R.id.vHeaderBackground;
                                                }
                                            } else {
                                                i6 = R.id.tvTotalScoreName;
                                            }
                                        } else {
                                            i6 = R.id.tvTeamTwoName;
                                        }
                                    } else {
                                        i6 = R.id.tvTeamOneTotalScore;
                                    }
                                } else {
                                    i6 = R.id.tvTeamOneName;
                                }
                            } else {
                                i6 = R.id.tvPeriodsName;
                            }
                        } else {
                            i6 = R.id.ivTeamTwoLogo;
                        }
                    } else {
                        i6 = R.id.ivTeamOneLogo;
                    }
                } else {
                    i6 = R.id.bTotalScoreDividers;
                }
                hny.u("Missing required view with ID: ".concat(viewF14.getResources().getResourceName(i6)));
                return null;
        }
    }
}

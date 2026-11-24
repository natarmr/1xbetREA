package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.ui.PlayerView;
import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.bet_history.history.domain.model.HistoryMenuItem;
import org.xplatform.bet_history.history.domain.model.bet_history.TimeTypeModel;
import org.xplatform.bet_history.history.presentation.dialog.history_menu.model.HistoryMenuItemUiModel;
import org.xplatform.core.presentation.views.cards.LuckyCardButton;
import org.xplatform.game_broadcasting.impl.presentation.video.GameVideoView;
import org.xplatform.game_broadcasting.impl.presentation.views.GameBroadcastingControlPanelView;
import org.xplatform.game_broadcasting.impl.presentation.zone.GameZoneView;
import org.xplatform.game_broadcasting.impl.presentation.zone.GameZoneWebView;
import org.xplatform.lucky_card.presentation.views.LuckyCardChoiceView;
import org.xplatform.referral.impl.presentation.takepart.view.LevelInfoView;
import org.xplatform.sportgame.classic.impl.presentation.legacy.views.GameScreenToolbarView;
import org.xplatform.ui_core.viewcomponents.layouts.linear.ShimmerLinearLayout;
import org.xplatform.ui_core.viewcomponents.loader.LoaderView;
import org.xplatform.ui_core.viewcomponents.views.MakeBetBalanceView;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes2.dex */
public final class nsr implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f24062a;
    public final Object b;
    public final Object c;

    public nsr(baz bazVar, sqe0 sqe0Var, mie0 mie0Var) {
        this.f24062a = (byte) 23;
        this.b = bazVar;
        this.c = mie0Var;
    }

    /* JADX WARN: Code duplicated, block: B:180:0x06a9 A[PHI: r0
  0x06a9: PHI (r0v27 int) = (r0v26 int), (r0v32 int), (r0v33 int) binds: [B:168:0x066e, B:174:0x0689, B:176:0x0696] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        kiy kiyVarJ0;
        byte b = this.f24062a;
        int i = R.id.vGameBroadcastingControlPanel;
        int i2 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                LayoutInflater layoutInflaterFrom = LayoutInflater.from(((GameBroadcastingControlPanelView) obj2).getContext());
                layoutInflaterFrom.getClass();
                GameBroadcastingControlPanelView gameBroadcastingControlPanelView = (GameBroadcastingControlPanelView) obj;
                layoutInflaterFrom.inflate(R.layout.view_game_broadcasting_control_panel, gameBroadcastingControlPanelView);
                int i3 = R.id.ivFullScreen;
                ImageView imageView = (ImageView) yum0.f(gameBroadcastingControlPanelView, R.id.ivFullScreen);
                if (imageView != null) {
                    i3 = R.id.ivPlay;
                    ImageView imageView2 = (ImageView) yum0.f(gameBroadcastingControlPanelView, R.id.ivPlay);
                    if (imageView2 != null) {
                        i3 = R.id.ivStop;
                        ImageView imageView3 = (ImageView) yum0.f(gameBroadcastingControlPanelView, R.id.ivStop);
                        if (imageView3 != null) {
                            i3 = R.id.ivWindow;
                            ImageView imageView4 = (ImageView) yum0.f(gameBroadcastingControlPanelView, R.id.ivWindow);
                            if (imageView4 != null) {
                                i3 = R.id.ivZoneFormat;
                                ImageView imageView5 = (ImageView) yum0.f(gameBroadcastingControlPanelView, R.id.ivZoneFormat);
                                if (imageView5 != null) {
                                    return new dhu0(gameBroadcastingControlPanelView, imageView, imageView2, imageView3, imageView4, imageView5);
                                }
                            }
                        }
                    }
                }
                hny.u("Missing required view with ID: ".concat(gameBroadcastingControlPanelView.getResources().getResourceName(i3)));
                return null;
            case 1:
                LayoutInflater layoutInflaterFrom2 = LayoutInflater.from(((GameScreenToolbarView) obj2).getContext());
                layoutInflaterFrom2.getClass();
                GameScreenToolbarView gameScreenToolbarView = (GameScreenToolbarView) obj;
                layoutInflaterFrom2.inflate(R.layout.view_game_classic_toolbar, gameScreenToolbarView);
                int i4 = R.id.actionBack;
                ImageView imageView6 = (ImageView) yum0.f(gameScreenToolbarView, R.id.actionBack);
                if (imageView6 != null) {
                    i4 = R.id.actionMenu;
                    ImageView imageView7 = (ImageView) yum0.f(gameScreenToolbarView, R.id.actionMenu);
                    if (imageView7 != null) {
                        i4 = R.id.actionQuickBet;
                        ImageView imageView8 = (ImageView) yum0.f(gameScreenToolbarView, R.id.actionQuickBet);
                        if (imageView8 != null) {
                            i4 = R.id.toolbarTitle;
                            TextView textView = (TextView) yum0.f(gameScreenToolbarView, R.id.toolbarTitle);
                            if (textView != null) {
                                return new ehu0(gameScreenToolbarView, imageView6, imageView7, imageView8, textView);
                            }
                        }
                    }
                }
                hny.u("Missing required view with ID: ".concat(gameScreenToolbarView.getResources().getResourceName(i4)));
                return null;
            case 2:
                LayoutInflater layoutInflaterFrom3 = LayoutInflater.from(((GameVideoView) obj2).getContext());
                layoutInflaterFrom3.getClass();
                GameVideoView gameVideoView = (GameVideoView) obj;
                layoutInflaterFrom3.inflate(R.layout.view_game_video, gameVideoView);
                int i5 = R.id.blurOverlayView;
                ImageView imageView9 = (ImageView) yum0.f(gameVideoView, R.id.blurOverlayView);
                if (imageView9 == null) {
                    i = i5;
                } else {
                    View viewF = yum0.f(gameVideoView, R.id.containerView);
                    if (viewF != null) {
                        ProgressBar progressBar = (ProgressBar) yum0.f(gameVideoView, R.id.progressBar);
                        if (progressBar != null) {
                            i5 = R.id.soundButton;
                            ImageView imageView10 = (ImageView) yum0.f(gameVideoView, R.id.soundButton);
                            if (imageView10 != null) {
                                i5 = R.id.vBroadcastingVideo;
                                PlayerView playerView = (PlayerView) yum0.f(gameVideoView, R.id.vBroadcastingVideo);
                                if (playerView != null) {
                                    GameBroadcastingControlPanelView gameBroadcastingControlPanelView2 = (GameBroadcastingControlPanelView) yum0.f(gameVideoView, R.id.vGameBroadcastingControlPanel);
                                    if (gameBroadcastingControlPanelView2 != null) {
                                        return new fhu0(gameVideoView, imageView9, viewF, progressBar, imageView10, playerView, gameBroadcastingControlPanelView2);
                                    }
                                } else {
                                    i = i5;
                                }
                            } else {
                                i = i5;
                            }
                        } else {
                            i = R.id.progressBar;
                        }
                    } else {
                        i = R.id.containerView;
                    }
                }
                hny.u("Missing required view with ID: ".concat(gameVideoView.getResources().getResourceName(i)));
                return null;
            case 3:
                LayoutInflater layoutInflaterFrom4 = LayoutInflater.from(((GameZoneView) obj2).getContext());
                layoutInflaterFrom4.getClass();
                GameZoneView gameZoneView = (GameZoneView) obj;
                layoutInflaterFrom4.inflate(R.layout.view_game_zone, gameZoneView);
                View viewF2 = yum0.f(gameZoneView, R.id.containerView);
                if (viewF2 != null) {
                    ProgressBar progressBar2 = (ProgressBar) yum0.f(gameZoneView, R.id.progressBar);
                    if (progressBar2 != null) {
                        GameZoneWebView gameZoneWebView = (GameZoneWebView) yum0.f(gameZoneView, R.id.vBroadcastingZone);
                        if (gameZoneWebView != null) {
                            GameBroadcastingControlPanelView gameBroadcastingControlPanelView3 = (GameBroadcastingControlPanelView) yum0.f(gameZoneView, R.id.vGameBroadcastingControlPanel);
                            if (gameBroadcastingControlPanelView3 != null) {
                                return new ghu0(gameZoneView, viewF2, progressBar2, gameZoneWebView, gameBroadcastingControlPanelView3);
                            }
                        } else {
                            i = R.id.vBroadcastingZone;
                        }
                    } else {
                        i = R.id.progressBar;
                    }
                } else {
                    i = R.id.containerView;
                }
                hny.u("Missing required view with ID: ".concat(gameZoneView.getResources().getResourceName(i)));
                return null;
            case 4:
                ((Function1) obj2).invoke(new rft((ok90) obj));
                return Unit.f46060a;
            case 5:
                bfo0 bfo0Var = ((s8v) obj).c;
                rqt rqtVar = g8v.P1;
                ((g8v) obj2).J0(bfo0Var);
                return Unit.f46060a;
            case 6:
                axv axvVar = (axv) obj2;
                TimeTypeModel timeTypeModel = ((wlq0) obj).b;
                art artVar = axv.n2;
                ccq0.V(axvVar, "CONFIRM_DIALOG_REQUEST_KEY", new wqv(axvVar, timeTypeModel, (byte) 5));
                ii iiVar = axvVar.m2;
                if (iiVar == null) {
                    Intrinsics.h("actionDialogManager");
                    throw null;
                }
                String strH = axvVar.H(R.string.caution);
                String strH2 = axvVar.H(R.string.hide_history_dialog);
                String strH3 = axvVar.H(R.string.ok);
                strH3.getClass();
                DialogFields dialogFields = new DialogFields((CharSequence) strH, (CharSequence) strH2, (CharSequence) strH3, axvVar.H(R.string.cancel), (String) null, "CONFIRM_DIALOG_REQUEST_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                androidx.fragment.app.e eVarC = axvVar.C();
                eVarC.getClass();
                iiVar.d(dialogFields, eVarC);
                return Unit.f46060a;
            case 7:
                sqt sqtVar = vzv.p2;
                ((vzv) obj2).P0().x(new zzv(((g1w) obj).f10535a));
                return Unit.f46060a;
            case 8:
                c4w c4wVar = (c4w) obj2;
                HistoryMenuItem historyMenuItem = ((HistoryMenuItemUiModel) obj).c;
                tqt tqtVar = c4w.n2;
                phf0 phf0Var = c4wVar.k2;
                iiy[] iiyVarArr = c4w.o2;
                vcc.f0(i120.V(new Pair("HISTORY_MENU_ITEM_RESULT", historyMenuItem), new Pair("HISTORY_MENU_BET_ID_RESULT", c4wVar.l2.n(c4wVar, iiyVarArr[1]))), c4wVar, phf0Var.n(c4wVar, iiyVarArr[0]));
                c4wVar.y0();
                return Unit.f46060a;
            case 9:
                ((Function1) obj2).invoke((uew) obj);
                return Unit.f46060a;
            case 10:
                xjw xjwVar = (xjw) obj;
                ((Function2) obj2).invoke(Integer.valueOf(xjwVar.f41006a), xjwVar.b);
                return Unit.f46060a;
            case 11:
                ((Function1) obj2).invoke(new nmw(((zmw) obj).b));
                return Unit.f46060a;
            case 12:
                ((Function1) obj2).invoke(new z97(((beo) ((zdo) obj)).b));
                return Unit.f46060a;
            case 13:
                return ((zm40) ((v7i) ((f7u) obj2).b).j).e.j(((k8y) obj).f17891a).I();
            case 14:
                i9y i9yVar = (i9y) obj2;
                ihy ihyVar = (ihy) obj;
                List listA = i9yVar.a();
                if (!fre0.W(i9yVar)) {
                    return listA;
                }
                if (listA.isEmpty()) {
                    StringBuilder sb = new StringBuilder("Bound function reference has no parameters: ");
                    sb.append(ihyVar);
                    String name = i9yVar.getName();
                    sb.append('.');
                    sb.append(name);
                    throw new IllegalStateException(sb.toString().toString());
                }
                int size = listA.size() - 1;
                ArrayList arrayList = new ArrayList(size);
                while (true) {
                    int i6 = i2;
                    if (i6 >= size) {
                        return arrayList;
                    }
                    i2 = i6 + 1;
                    hre0 hre0Var = (hre0) listA.get(i2);
                    if (!(hre0Var instanceof o9y)) {
                        StringBuilder sb2 = new StringBuilder("Unexpected parameter type: ");
                        sb2.append(sre0.f32672a.b(hre0Var.getClass()).J());
                        sb2.append(" (");
                        sb2.append(ihyVar);
                        String name2 = i9yVar.getName();
                        sb2.append('.');
                        sb2.append(name2);
                        sb2.append(')');
                        throw new IllegalStateException(sb2.toString().toString());
                    }
                    o9y o9yVar = (o9y) hre0Var;
                    arrayList.add(new o9y(o9yVar.f24903a, o9yVar.b, o9yVar.c, i6, o9yVar.e, o9yVar.f));
                }
                break;
            case 15:
                rgy rgyVar = (rgy) obj2;
                n9y n9yVar = (n9y) obj;
                boolean zC = rgyVar.c();
                List list = rgyVar.f;
                if (zC && list.size() == 1) {
                    kiyVarJ0 = ((dre0) CollectionsKt.v0(list)).getReturnType();
                } else {
                    Type genericReturnType = n9yVar.B().getGenericReturnType();
                    genericReturnType.getClass();
                    kiyVarJ0 = tke.j0(genericReturnType, xp20.m(tx3.m0(n9yVar.u(), n9yVar.getTypeParameters())), null, tke.W(n9yVar.d), false, null, 26);
                }
                return (v2) fre0.c0(n9yVar, kiyVarJ0);
            case 16:
                fey feyVar = (fey) obj2;
                eu00 eu00Var = (eu00) obj;
                Function1 function1 = feyVar.b;
                ym40 ym40Var = feyVar.f9427a;
                llc llcVar = new llc((vjj) function1.invoke(ym40Var), fey.g, gm40.e, slc.b, kotlin.collections.a.c(ym40Var.c().e()), eu00Var);
                llcVar.u0(new tuc(eu00Var, llcVar), xun.f41520a, null);
                return llcVar;
            case 17:
                jey jeyVar = (jey) obj2;
                zm40 zm40VarL = jeyVar.l();
                zm40VarL.getClass();
                return new mey(zm40VarL, (eu00) obj, new aaw(jeyVar, (byte) 15));
            case 18:
                mey meyVar = (mey) obj2;
                zm40 zm40Var = meyVar.e().f14659a;
                fey.d.getClass();
                return obb.X(zm40Var, fey.h, new n660((eu00) obj, meyVar.e().f14659a)).I();
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                l9z l9zVar = (l9z) obj2;
                f7u f7uVar = l9zVar.j;
                v7i v7iVar = (v7i) f7uVar.b;
                f7u f7uVar2 = new f7u(new v7i((eu00) v7iVar.i, (zx10) v7iVar.g, (yox) v7iVar.e, (jfk) v7iVar.f, (zie0) v7iVar.c, (epi0) v7iVar.d, (lwf) v7iVar.h, (zm40) v7iVar.j, (xre0) v7iVar.k, (a93) v7iVar.l, (cge0) v7iVar.f36925a, (km50) v7iVar.m, (cgx0) v7iVar.b, (bek) v7iVar.n), (mzs0) f7uVar.c, (a8z) f7uVar.d);
                vjj vjjVarJ = l9zVar.j();
                vjjVarJ.getClass();
                return new l9z(f7uVar2, vjjVarJ, l9zVar.h, (wm40) obj);
            case 20:
                xgy xgyVar = (xgy) obj;
                foc focVarN = ((wsy) obj2).S().n();
                if (!(focVarN instanceof wm40)) {
                    ohq.u(focVarN, "Supertype not a class: ");
                    return null;
                }
                Class clsQ = xtt0.q((wm40) focVarN);
                if (clsQ == null) {
                    udk.f("Unsupported superclass of ", xgyVar, ": ", focVarN);
                    return null;
                }
                Class cls = xgyVar.b;
                if (Intrinsics.d(cls.getSuperclass(), clsQ)) {
                    Type genericSuperclass = cls.getGenericSuperclass();
                    genericSuperclass.getClass();
                    return genericSuperclass;
                }
                Class<?>[] interfaces = cls.getInterfaces();
                interfaces.getClass();
                int iH = tx3.H(clsQ, interfaces);
                if (iH < 0) {
                    udk.f("No superclass of ", xgyVar, " in Java reflection for ", focVarN);
                    return null;
                }
                Type type = cls.getGenericInterfaces()[iH];
                type.getClass();
                return type;
            case 21:
                csy csyVar = (csy) obj2;
                nzs0 nzs0Var = (nzs0) obj;
                fqy fqyVar = csyVar.b.c;
                if (fqyVar != null) {
                    return jwb.Z(fqyVar, bqe0.d(csyVar.f4912a.K().j()), nzs0Var, new aaw(csyVar, (byte) 21), 4);
                }
                Intrinsics.h(Payload.TYPE);
                throw null;
            case 22:
                return new r9z(((s9z) obj2).f31869a, (wqe0) obj);
            case 23:
                Object obj3 = ((baz) obj2).b.b;
                ((d0d0) ((mie0) obj).f21842a).getClass();
                return null;
            case 24:
                LayoutInflater layoutInflaterFrom5 = LayoutInflater.from(((LevelInfoView) obj2).getContext());
                layoutInflaterFrom5.getClass();
                LevelInfoView levelInfoView = (LevelInfoView) obj;
                View viewInflate = layoutInflaterFrom5.inflate(R.layout.layout_level_info_view, (ViewGroup) levelInfoView, false);
                levelInfoView.addView(viewInflate);
                int i7 = R.id.levelProgress;
                CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) yum0.f(viewInflate, R.id.levelProgress);
                if (circularProgressIndicator != null) {
                    i7 = R.id.levelProgressValue;
                    TextView textView2 = (TextView) yum0.f(viewInflate, R.id.levelProgressValue);
                    if (textView2 != null) {
                        i7 = R.id.levelTv;
                        TextView textView3 = (TextView) yum0.f(viewInflate, R.id.levelTv);
                        if (textView3 != null) {
                            return new s6z((FrameLayout) viewInflate, circularProgressIndicator, textView2, textView3);
                        }
                    }
                }
                hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
                return null;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                String str = ((oea0) obj2).f25114a;
                gna0 gna0Var = (gna0) obj;
                String str2 = (String) ((hgk0) gna0Var.f11577a).getValue();
                agk0 agk0Var = gna0Var.c;
                if (Intrinsics.d(str, str2)) {
                    return Float.valueOf(agk0Var.l());
                }
                if (Intrinsics.d(str, (String) ((hgk0) gna0Var.b).getValue())) {
                    return Float.valueOf(1.0f - agk0Var.l());
                }
                return null;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                LayoutInflater layoutInflaterFrom6 = LayoutInflater.from(((LoaderView) obj2).getContext());
                layoutInflaterFrom6.getClass();
                LoaderView loaderView = (LoaderView) obj;
                layoutInflaterFrom6.inflate(R.layout.view_loader, loaderView);
                int i8 = R.id.ivIcon;
                ImageView imageView11 = (ImageView) yum0.f(loaderView, R.id.ivIcon);
                if (imageView11 != null) {
                    i8 = R.id.ivProgress;
                    ImageView imageView12 = (ImageView) yum0.f(loaderView, R.id.ivProgress);
                    if (imageView12 != null) {
                        i8 = R.id.loaderWrapper;
                        FrameLayout frameLayout = (FrameLayout) yum0.f(loaderView, R.id.loaderWrapper);
                        if (frameLayout != null) {
                            return new uhu0(loaderView, imageView11, imageView12, frameLayout);
                        }
                    }
                }
                hny.u("Missing required view with ID: ".concat(loaderView.getResources().getResourceName(i8)));
                return null;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                LayoutInflater layoutInflaterFrom7 = LayoutInflater.from(((LuckyCardButton) obj2).getContext());
                layoutInflaterFrom7.getClass();
                LuckyCardButton luckyCardButton = (LuckyCardButton) obj;
                View viewInflate2 = layoutInflaterFrom7.inflate(R.layout.view_card_button_x, (ViewGroup) luckyCardButton, false);
                luckyCardButton.addView(viewInflate2);
                MaterialCardView materialCardView = (MaterialCardView) viewInflate2;
                int i9 = R.id.icon1;
                ImageView imageView13 = (ImageView) yum0.f(viewInflate2, R.id.icon1);
                if (imageView13 != null) {
                    i9 = R.id.icon2;
                    ImageView imageView14 = (ImageView) yum0.f(viewInflate2, R.id.icon2);
                    if (imageView14 != null) {
                        i9 = R.id.icon_text;
                        TextView textView4 = (TextView) yum0.f(viewInflate2, R.id.icon_text);
                        if (textView4 != null) {
                            i9 = R.id.image_layout;
                            LinearLayout linearLayout = (LinearLayout) yum0.f(viewInflate2, R.id.image_layout);
                            if (linearLayout != null) {
                                i9 = R.id.text;
                                TextView textView5 = (TextView) yum0.f(viewInflate2, R.id.text);
                                if (textView5 != null) {
                                    return new agu0(materialCardView, materialCardView, imageView13, imageView14, textView4, linearLayout, textView5);
                                }
                            }
                        }
                    }
                }
                hny.u("Missing required view with ID: ".concat(viewInflate2.getResources().getResourceName(i9)));
                return null;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                LayoutInflater layoutInflaterFrom8 = LayoutInflater.from(((LuckyCardChoiceView) obj2).getContext());
                layoutInflaterFrom8.getClass();
                LuckyCardChoiceView luckyCardChoiceView = (LuckyCardChoiceView) obj;
                View viewInflate3 = layoutInflaterFrom8.inflate(R.layout.view_lucky_card_choice_x, (ViewGroup) luckyCardChoiceView, false);
                luckyCardChoiceView.addView(viewInflate3);
                int i10 = R.id.black;
                LuckyCardButton luckyCardButton2 = (LuckyCardButton) yum0.f(viewInflate3, R.id.black);
                if (luckyCardButton2 != null) {
                    i10 = R.id.clubs;
                    LuckyCardButton luckyCardButton3 = (LuckyCardButton) yum0.f(viewInflate3, R.id.clubs);
                    if (luckyCardButton3 != null) {
                        i10 = R.id.diamonds;
                        LuckyCardButton luckyCardButton4 = (LuckyCardButton) yum0.f(viewInflate3, R.id.diamonds);
                        if (luckyCardButton4 != null) {
                            i10 = R.id.hearts;
                            LuckyCardButton luckyCardButton5 = (LuckyCardButton) yum0.f(viewInflate3, R.id.hearts);
                            if (luckyCardButton5 != null) {
                                i10 = R.id.hint;
                                TextView textView6 = (TextView) yum0.f(viewInflate3, R.id.hint);
                                if (textView6 != null) {
                                    i10 = R.id.red;
                                    LuckyCardButton luckyCardButton6 = (LuckyCardButton) yum0.f(viewInflate3, R.id.red);
                                    if (luckyCardButton6 != null) {
                                        i10 = R.id.spades;
                                        LuckyCardButton luckyCardButton7 = (LuckyCardButton) yum0.f(viewInflate3, R.id.spades);
                                        if (luckyCardButton7 != null) {
                                            return new yhu0((LinearLayout) viewInflate3, luckyCardButton2, luckyCardButton3, luckyCardButton4, luckyCardButton5, textView6, luckyCardButton6, luckyCardButton7);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                hny.u("Missing required view with ID: ".concat(viewInflate3.getResources().getResourceName(i10)));
                return null;
            default:
                LayoutInflater layoutInflaterFrom9 = LayoutInflater.from(((MakeBetBalanceView) obj2).getContext());
                layoutInflaterFrom9.getClass();
                MakeBetBalanceView makeBetBalanceView = (MakeBetBalanceView) obj;
                View viewInflate4 = layoutInflaterFrom9.inflate(R.layout.make_bet_balance_view, (ViewGroup) makeBetBalanceView, false);
                makeBetBalanceView.addView(viewInflate4);
                int i11 = R.id.ivDeposit;
                ImageView imageView15 = (ImageView) yum0.f(viewInflate4, R.id.ivDeposit);
                if (imageView15 != null) {
                    i11 = R.id.shimmer;
                    if (((ShimmerLinearLayout) yum0.f(viewInflate4, R.id.shimmer)) != null) {
                        i11 = R.id.tvBalance;
                        if (((TextView) yum0.f(viewInflate4, R.id.tvBalance)) != null) {
                            i11 = R.id.tvBalanceValue;
                            if (((TextView) yum0.f(viewInflate4, R.id.tvBalanceValue)) != null) {
                                i11 = R.id.tvChangeBalanceAccount;
                                TextView textView7 = (TextView) yum0.f(viewInflate4, R.id.tvChangeBalanceAccount);
                                if (textView7 != null) {
                                    return new j620((ConstraintLayout) viewInflate4, imageView15, textView7);
                                }
                            }
                        }
                    }
                }
                hny.u("Missing required view with ID: ".concat(viewInflate4.getResources().getResourceName(i11)));
                return null;
        }
    }

    public /* synthetic */ nsr(Object obj, Object obj2, byte b) {
        this.f24062a = b;
        this.b = obj;
        this.c = obj2;
    }
}

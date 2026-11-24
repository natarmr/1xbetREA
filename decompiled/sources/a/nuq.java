package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import com.google.android.material.button.MaterialButton;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.uikit_sport.eventcard.bottom.EventCardBottomMarketMultiline;
import org.xplatform.uikit_sport.eventcard.container.BasicEventCard;
import org.xplatform.uikit_sport.eventcard.container.SyntheticsEventCard;
import org.xplatform.uikit_sport.eventcard.info.EventCardInfoLive;
import org.xplatform.uikit_sport.eventcard.middle.EventCardMiddleCricket;
import org.xplatform.uikit_sport.eventcard.middle.EventCardMiddleFighting;
import org.xplatform.uikit_sport.eventcard.middle.EventCardMiddleTwoTeams;
import org.xplatform.uikit_sport.eventcard.middle.EventCardMiddleWinningFormula;
import org.xplatform.uikit_sport.eventcard.top.EventCardHeader;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nuq implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f24157a;

    public /* synthetic */ nuq(byte b) {
        this.f24157a = b;
    }

    private final Object a(Object obj, Object obj2) {
        ViewGroup viewGroup = (ViewGroup) obj2;
        View viewF = rw2.f((LayoutInflater) obj, viewGroup, R.layout.item_game_card_type_10, viewGroup, false);
        int i = R.id.gameCardBottom;
        EventCardBottomMarketMultiline eventCardBottomMarketMultiline = (EventCardBottomMarketMultiline) yum0.f(viewF, R.id.gameCardBottom);
        if (eventCardBottomMarketMultiline != null) {
            i = R.id.gameCardHeader;
            EventCardHeader eventCardHeader = (EventCardHeader) yum0.f(viewF, R.id.gameCardHeader);
            if (eventCardHeader != null) {
                i = R.id.gameCardInfoLive;
                EventCardInfoLive eventCardInfoLive = (EventCardInfoLive) yum0.f(viewF, R.id.gameCardInfoLive);
                if (eventCardInfoLive != null) {
                    i = R.id.gameCardMiddle;
                    EventCardMiddleTwoTeams eventCardMiddleTwoTeams = (EventCardMiddleTwoTeams) yum0.f(viewF, R.id.gameCardMiddle);
                    if (eventCardMiddleTwoTeams != null) {
                        return new rux((BasicEventCard) viewF, eventCardBottomMarketMultiline, eventCardHeader, eventCardInfoLive, eventCardMiddleTwoTeams);
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(viewF.getResources().getResourceName(i)));
        return null;
    }

    private final Object b(Object obj, Object obj2) {
        ViewGroup viewGroup = (ViewGroup) obj2;
        View viewF = rw2.f((LayoutInflater) obj, viewGroup, R.layout.item_game_card_type_11, viewGroup, false);
        int i = R.id.gameCardBottom;
        EventCardBottomMarketMultiline eventCardBottomMarketMultiline = (EventCardBottomMarketMultiline) yum0.f(viewF, R.id.gameCardBottom);
        if (eventCardBottomMarketMultiline != null) {
            i = R.id.gameCardHeader;
            EventCardHeader eventCardHeader = (EventCardHeader) yum0.f(viewF, R.id.gameCardHeader);
            if (eventCardHeader != null) {
                i = R.id.gameCardMiddle;
                EventCardMiddleCricket eventCardMiddleCricket = (EventCardMiddleCricket) yum0.f(viewF, R.id.gameCardMiddle);
                if (eventCardMiddleCricket != null) {
                    return new sux((BasicEventCard) viewF, eventCardBottomMarketMultiline, eventCardHeader, eventCardMiddleCricket);
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(viewF.getResources().getResourceName(i)));
        return null;
    }

    private final Object c(Object obj, Object obj2) {
        ViewGroup viewGroup = (ViewGroup) obj2;
        View viewF = rw2.f((LayoutInflater) obj, viewGroup, R.layout.item_game_card_type_12, viewGroup, false);
        int i = R.id.gameCardBottom;
        EventCardBottomMarketMultiline eventCardBottomMarketMultiline = (EventCardBottomMarketMultiline) yum0.f(viewF, R.id.gameCardBottom);
        if (eventCardBottomMarketMultiline != null) {
            i = R.id.gameCardHeader;
            EventCardHeader eventCardHeader = (EventCardHeader) yum0.f(viewF, R.id.gameCardHeader);
            if (eventCardHeader != null) {
                i = R.id.gameCardMiddle;
                EventCardMiddleFighting eventCardMiddleFighting = (EventCardMiddleFighting) yum0.f(viewF, R.id.gameCardMiddle);
                if (eventCardMiddleFighting != null) {
                    return new tux((SyntheticsEventCard) viewF, eventCardBottomMarketMultiline, eventCardHeader, eventCardMiddleFighting);
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(viewF.getResources().getResourceName(i)));
        return null;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f24157a) {
            case 0:
                ((Integer) obj2).getClass();
                gq80.D(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 1:
                return ((d5r) obj2).f5520a;
            case 2:
                ((Integer) obj2).getClass();
                xia0.T(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 3:
                ViewGroup viewGroup = (ViewGroup) obj2;
                View viewF = rw2.f((LayoutInflater) obj, viewGroup, R.layout.history_event_item_view_holder, viewGroup, false);
                int i = R.id.advanceGroup;
                Group group = (Group) yum0.f(viewF, R.id.advanceGroup);
                if (group != null) {
                    i = R.id.advanceTitle;
                    TextView textView = (TextView) yum0.f(viewF, R.id.advanceTitle);
                    if (textView != null) {
                        i = R.id.advanceValue;
                        TextView textView2 = (TextView) yum0.f(viewF, R.id.advanceValue);
                        if (textView2 != null) {
                            i = R.id.aggregatorBetTypeGroup;
                            Group group2 = (Group) yum0.f(viewF, R.id.aggregatorBetTypeGroup);
                            if (group2 != null) {
                                i = R.id.autoSaleGroup;
                                Group group3 = (Group) yum0.f(viewF, R.id.autoSaleGroup);
                                if (group3 != null) {
                                    i = R.id.autoSubTag;
                                    ImageView imageView = (ImageView) yum0.f(viewF, R.id.autoSubTag);
                                    if (imageView != null) {
                                        i = R.id.betTitleImage;
                                        ImageView imageView2 = (ImageView) yum0.f(viewF, R.id.betTitleImage);
                                        if (imageView2 != null) {
                                            i = R.id.betValueGroup;
                                            Group group4 = (Group) yum0.f(viewF, R.id.betValueGroup);
                                            if (group4 != null) {
                                                i = R.id.betWinGroup;
                                                Group group5 = (Group) yum0.f(viewF, R.id.betWinGroup);
                                                if (group5 != null) {
                                                    i = R.id.bottom;
                                                    if (((ConstraintLayout) yum0.f(viewF, R.id.bottom)) != null) {
                                                        i = R.id.btnSale;
                                                        MaterialButton materialButton = (MaterialButton) yum0.f(viewF, R.id.btnSale);
                                                        if (materialButton != null) {
                                                            i = R.id.center;
                                                            if (((Guideline) yum0.f(viewF, R.id.center)) != null) {
                                                                i = R.id.coefGroup;
                                                                Group group6 = (Group) yum0.f(viewF, R.id.coefGroup);
                                                                if (group6 != null) {
                                                                    LinearLayout linearLayout = (LinearLayout) viewF;
                                                                    i = R.id.dateAndTagFlow;
                                                                    if (((Flow) yum0.f(viewF, R.id.dateAndTagFlow)) != null) {
                                                                        i = R.id.flSale;
                                                                        FrameLayout frameLayout = (FrameLayout) yum0.f(viewF, R.id.flSale);
                                                                        if (frameLayout != null) {
                                                                            i = R.id.grSubGameGroup;
                                                                            Group group7 = (Group) yum0.f(viewF, R.id.grSubGameGroup);
                                                                            if (group7 != null) {
                                                                                i = R.id.header;
                                                                                if (((ConstraintLayout) yum0.f(viewF, R.id.header)) != null) {
                                                                                    i = R.id.imageBell;
                                                                                    ImageView imageView3 = (ImageView) yum0.f(viewF, R.id.imageBell);
                                                                                    if (imageView3 != null) {
                                                                                        i = R.id.imageBellContainer;
                                                                                        FrameLayout frameLayout2 = (FrameLayout) yum0.f(viewF, R.id.imageBellContainer);
                                                                                        if (frameLayout2 != null) {
                                                                                            i = R.id.imageBetStatus;
                                                                                            ImageView imageView4 = (ImageView) yum0.f(viewF, R.id.imageBetStatus);
                                                                                            if (imageView4 != null) {
                                                                                                i = R.id.imageMore;
                                                                                                if (((ImageView) yum0.f(viewF, R.id.imageMore)) != null) {
                                                                                                    i = R.id.imageMoreContainer;
                                                                                                    FrameLayout frameLayout3 = (FrameLayout) yum0.f(viewF, R.id.imageMoreContainer);
                                                                                                    if (frameLayout3 != null) {
                                                                                                        i = R.id.ivSubGameImage;
                                                                                                        ImageView imageView5 = (ImageView) yum0.f(viewF, R.id.ivSubGameImage);
                                                                                                        if (imageView5 != null) {
                                                                                                            i = R.id.payoutGroup;
                                                                                                            Group group8 = (Group) yum0.f(viewF, R.id.payoutGroup);
                                                                                                            if (group8 != null) {
                                                                                                                i = R.id.payoutSum;
                                                                                                                TextView textView3 = (TextView) yum0.f(viewF, R.id.payoutSum);
                                                                                                                if (textView3 != null) {
                                                                                                                    i = R.id.payoutTitle;
                                                                                                                    TextView textView4 = (TextView) yum0.f(viewF, R.id.payoutTitle);
                                                                                                                    if (textView4 != null) {
                                                                                                                        i = R.id.sellButtonTopBarrier;
                                                                                                                        if (((Barrier) yum0.f(viewF, R.id.sellButtonTopBarrier)) != null) {
                                                                                                                            i = R.id.stakeAfterTaxGroup;
                                                                                                                            Group group9 = (Group) yum0.f(viewF, R.id.stakeAfterTaxGroup);
                                                                                                                            if (group9 != null) {
                                                                                                                                i = R.id.statusGroup;
                                                                                                                                Group group10 = (Group) yum0.f(viewF, R.id.statusGroup);
                                                                                                                                if (group10 != null) {
                                                                                                                                    i = R.id.taxExciseGroup;
                                                                                                                                    Group group11 = (Group) yum0.f(viewF, R.id.taxExciseGroup);
                                                                                                                                    if (group11 != null) {
                                                                                                                                        i = R.id.taxFeeGroup;
                                                                                                                                        Group group12 = (Group) yum0.f(viewF, R.id.taxFeeGroup);
                                                                                                                                        if (group12 != null) {
                                                                                                                                            i = R.id.taxGroup;
                                                                                                                                            Group group13 = (Group) yum0.f(viewF, R.id.taxGroup);
                                                                                                                                            if (group13 != null) {
                                                                                                                                                i = R.id.tvAggregatorBetType;
                                                                                                                                                TextView textView5 = (TextView) yum0.f(viewF, R.id.tvAggregatorBetType);
                                                                                                                                                if (textView5 != null) {
                                                                                                                                                    i = R.id.tvAggregatorBetTypeTitle;
                                                                                                                                                    TextView textView6 = (TextView) yum0.f(viewF, R.id.tvAggregatorBetTypeTitle);
                                                                                                                                                    if (textView6 != null) {
                                                                                                                                                        i = R.id.tvApproveId;
                                                                                                                                                        TextView textView7 = (TextView) yum0.f(viewF, R.id.tvApproveId);
                                                                                                                                                        if (textView7 != null) {
                                                                                                                                                            i = R.id.tvAutoSaleTitle;
                                                                                                                                                            TextView textView8 = (TextView) yum0.f(viewF, R.id.tvAutoSaleTitle);
                                                                                                                                                            if (textView8 != null) {
                                                                                                                                                                i = R.id.tvAutoSaleValue;
                                                                                                                                                                TextView textView9 = (TextView) yum0.f(viewF, R.id.tvAutoSaleValue);
                                                                                                                                                                if (textView9 != null) {
                                                                                                                                                                    i = R.id.tvBetCoef;
                                                                                                                                                                    TextView textView10 = (TextView) yum0.f(viewF, R.id.tvBetCoef);
                                                                                                                                                                    if (textView10 != null) {
                                                                                                                                                                        i = R.id.tvBetCoefTitle;
                                                                                                                                                                        TextView textView11 = (TextView) yum0.f(viewF, R.id.tvBetCoefTitle);
                                                                                                                                                                        if (textView11 != null) {
                                                                                                                                                                            i = R.id.tvBetCoeffType;
                                                                                                                                                                            TextView textView12 = (TextView) yum0.f(viewF, R.id.tvBetCoeffType);
                                                                                                                                                                            if (textView12 != null) {
                                                                                                                                                                                i = R.id.tvBetCoeffTypeTitle;
                                                                                                                                                                                TextView textView13 = (TextView) yum0.f(viewF, R.id.tvBetCoeffTypeTitle);
                                                                                                                                                                                if (textView13 != null) {
                                                                                                                                                                                    i = R.id.tvBetDescription;
                                                                                                                                                                                    TextView textView14 = (TextView) yum0.f(viewF, R.id.tvBetDescription);
                                                                                                                                                                                    if (textView14 != null) {
                                                                                                                                                                                        i = R.id.tvBetStatus;
                                                                                                                                                                                        TextView textView15 = (TextView) yum0.f(viewF, R.id.tvBetStatus);
                                                                                                                                                                                        if (textView15 != null) {
                                                                                                                                                                                            i = R.id.tvBetStatusTitle;
                                                                                                                                                                                            TextView textView16 = (TextView) yum0.f(viewF, R.id.tvBetStatusTitle);
                                                                                                                                                                                            if (textView16 != null) {
                                                                                                                                                                                                i = R.id.tvBetTitle;
                                                                                                                                                                                                TextView textView17 = (TextView) yum0.f(viewF, R.id.tvBetTitle);
                                                                                                                                                                                                if (textView17 != null) {
                                                                                                                                                                                                    i = R.id.tvBetTitleSubgame;
                                                                                                                                                                                                    TextView textView18 = (TextView) yum0.f(viewF, R.id.tvBetTitleSubgame);
                                                                                                                                                                                                    if (textView18 != null) {
                                                                                                                                                                                                        i = R.id.tvBetValue;
                                                                                                                                                                                                        TextView textView19 = (TextView) yum0.f(viewF, R.id.tvBetValue);
                                                                                                                                                                                                        if (textView19 != null) {
                                                                                                                                                                                                            i = R.id.tvBetValueTitle;
                                                                                                                                                                                                            TextView textView20 = (TextView) yum0.f(viewF, R.id.tvBetValueTitle);
                                                                                                                                                                                                            if (textView20 != null) {
                                                                                                                                                                                                                i = R.id.tvBetWin;
                                                                                                                                                                                                                TextView textView21 = (TextView) yum0.f(viewF, R.id.tvBetWin);
                                                                                                                                                                                                                if (textView21 != null) {
                                                                                                                                                                                                                    i = R.id.tvBetWinTitle;
                                                                                                                                                                                                                    TextView textView22 = (TextView) yum0.f(viewF, R.id.tvBetWinTitle);
                                                                                                                                                                                                                    if (textView22 != null) {
                                                                                                                                                                                                                        i = R.id.tvChampName;
                                                                                                                                                                                                                        TextView textView23 = (TextView) yum0.f(viewF, R.id.tvChampName);
                                                                                                                                                                                                                        if (textView23 != null) {
                                                                                                                                                                                                                            i = R.id.tvDate;
                                                                                                                                                                                                                            TextView textView24 = (TextView) yum0.f(viewF, R.id.tvDate);
                                                                                                                                                                                                                            if (textView24 != null) {
                                                                                                                                                                                                                                i = R.id.tvEventTag;
                                                                                                                                                                                                                                TextView textView25 = (TextView) yum0.f(viewF, R.id.tvEventTag);
                                                                                                                                                                                                                                if (textView25 != null) {
                                                                                                                                                                                                                                    i = R.id.tvFreeToto;
                                                                                                                                                                                                                                    TextView textView26 = (TextView) yum0.f(viewF, R.id.tvFreeToto);
                                                                                                                                                                                                                                    if (textView26 != null) {
                                                                                                                                                                                                                                        i = R.id.tvLive;
                                                                                                                                                                                                                                        LinearLayout linearLayout2 = (LinearLayout) yum0.f(viewF, R.id.tvLive);
                                                                                                                                                                                                                                        if (linearLayout2 != null) {
                                                                                                                                                                                                                                            i = R.id.tvNumber;
                                                                                                                                                                                                                                            TextView textView27 = (TextView) yum0.f(viewF, R.id.tvNumber);
                                                                                                                                                                                                                                            if (textView27 != null) {
                                                                                                                                                                                                                                                i = R.id.tvNumberSymbol;
                                                                                                                                                                                                                                                TextView textView28 = (TextView) yum0.f(viewF, R.id.tvNumberSymbol);
                                                                                                                                                                                                                                                if (textView28 != null) {
                                                                                                                                                                                                                                                    i = R.id.tvPromo;
                                                                                                                                                                                                                                                    TextView textView29 = (TextView) yum0.f(viewF, R.id.tvPromo);
                                                                                                                                                                                                                                                    if (textView29 != null) {
                                                                                                                                                                                                                                                        i = R.id.tvStakeAfterTaxTitle;
                                                                                                                                                                                                                                                        TextView textView30 = (TextView) yum0.f(viewF, R.id.tvStakeAfterTaxTitle);
                                                                                                                                                                                                                                                        if (textView30 != null) {
                                                                                                                                                                                                                                                            i = R.id.tvStakeAfterTaxValue;
                                                                                                                                                                                                                                                            TextView textView31 = (TextView) yum0.f(viewF, R.id.tvStakeAfterTaxValue);
                                                                                                                                                                                                                                                            if (textView31 != null) {
                                                                                                                                                                                                                                                                i = R.id.tvSubgameBet;
                                                                                                                                                                                                                                                                TextView textView32 = (TextView) yum0.f(viewF, R.id.tvSubgameBet);
                                                                                                                                                                                                                                                                if (textView32 != null) {
                                                                                                                                                                                                                                                                    i = R.id.tvSubgameCoef;
                                                                                                                                                                                                                                                                    TextView textView33 = (TextView) yum0.f(viewF, R.id.tvSubgameCoef);
                                                                                                                                                                                                                                                                    if (textView33 != null) {
                                                                                                                                                                                                                                                                        i = R.id.tvTaxExciseTitle;
                                                                                                                                                                                                                                                                        TextView textView34 = (TextView) yum0.f(viewF, R.id.tvTaxExciseTitle);
                                                                                                                                                                                                                                                                        if (textView34 != null) {
                                                                                                                                                                                                                                                                            i = R.id.tvTaxExciseValue;
                                                                                                                                                                                                                                                                            TextView textView35 = (TextView) yum0.f(viewF, R.id.tvTaxExciseValue);
                                                                                                                                                                                                                                                                            if (textView35 != null) {
                                                                                                                                                                                                                                                                                i = R.id.tvTaxFeeTitle;
                                                                                                                                                                                                                                                                                TextView textView36 = (TextView) yum0.f(viewF, R.id.tvTaxFeeTitle);
                                                                                                                                                                                                                                                                                if (textView36 != null) {
                                                                                                                                                                                                                                                                                    i = R.id.tvTaxFeeValue;
                                                                                                                                                                                                                                                                                    TextView textView37 = (TextView) yum0.f(viewF, R.id.tvTaxFeeValue);
                                                                                                                                                                                                                                                                                    if (textView37 != null) {
                                                                                                                                                                                                                                                                                        i = R.id.tvTaxTitle;
                                                                                                                                                                                                                                                                                        TextView textView38 = (TextView) yum0.f(viewF, R.id.tvTaxTitle);
                                                                                                                                                                                                                                                                                        if (textView38 != null) {
                                                                                                                                                                                                                                                                                            i = R.id.tvTaxValue;
                                                                                                                                                                                                                                                                                            TextView textView39 = (TextView) yum0.f(viewF, R.id.tvTaxValue);
                                                                                                                                                                                                                                                                                            if (textView39 != null) {
                                                                                                                                                                                                                                                                                                i = R.id.tvType;
                                                                                                                                                                                                                                                                                                TextView textView40 = (TextView) yum0.f(viewF, R.id.tvType);
                                                                                                                                                                                                                                                                                                if (textView40 != null) {
                                                                                                                                                                                                                                                                                                    i = R.id.tvVatTaxTitle;
                                                                                                                                                                                                                                                                                                    TextView textView41 = (TextView) yum0.f(viewF, R.id.tvVatTaxTitle);
                                                                                                                                                                                                                                                                                                    if (textView41 != null) {
                                                                                                                                                                                                                                                                                                        i = R.id.tvVatTaxValue;
                                                                                                                                                                                                                                                                                                        TextView textView42 = (TextView) yum0.f(viewF, R.id.tvVatTaxValue);
                                                                                                                                                                                                                                                                                                        if (textView42 != null) {
                                                                                                                                                                                                                                                                                                            i = R.id.vatTaxGroup;
                                                                                                                                                                                                                                                                                                            Group group14 = (Group) yum0.f(viewF, R.id.vatTaxGroup);
                                                                                                                                                                                                                                                                                                            if (group14 != null) {
                                                                                                                                                                                                                                                                                                                return new y0w(linearLayout, group, textView, textView2, group2, group3, imageView, imageView2, group4, group5, materialButton, group6, frameLayout, group7, imageView3, frameLayout2, imageView4, frameLayout3, imageView5, group8, textView3, textView4, group9, group10, group11, group12, group13, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14, textView15, textView16, textView17, textView18, textView19, textView20, textView21, textView22, textView23, textView24, textView25, textView26, linearLayout2, textView27, textView28, textView29, textView30, textView31, textView32, textView33, textView34, textView35, textView36, textView37, textView38, textView39, textView40, textView41, textView42, group14);
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
                hny.u("Missing required view with ID: ".concat(viewF.getResources().getResourceName(i)));
                return null;
            case 4:
                ViewGroup viewGroup2 = (ViewGroup) obj2;
                View viewF2 = rw2.f((LayoutInflater) obj, viewGroup2, R.layout.item_gambling_exam_description, viewGroup2, false);
                TextView textView43 = (TextView) yum0.f(viewF2, R.id.tvTitle);
                if (textView43 != null) {
                    return new pux((FrameLayout) viewF2, textView43);
                }
                hny.u("Missing required view with ID: ".concat(viewF2.getResources().getResourceName(R.id.tvTitle)));
                return null;
            case 5:
                ((Integer) obj2).getClass();
                x4d0.L(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 6:
                ViewGroup viewGroup3 = (ViewGroup) obj2;
                View viewF3 = rw2.f((LayoutInflater) obj, viewGroup3, R.layout.item_gambling_exam_question, viewGroup3, false);
                int i2 = R.id.buttonNo;
                MaterialButton materialButton2 = (MaterialButton) yum0.f(viewF3, R.id.buttonNo);
                if (materialButton2 != null) {
                    i2 = R.id.buttonYes;
                    MaterialButton materialButton3 = (MaterialButton) yum0.f(viewF3, R.id.buttonYes);
                    if (materialButton3 != null) {
                        i2 = R.id.tvQuestion;
                        TextView textView44 = (TextView) yum0.f(viewF3, R.id.tvQuestion);
                        if (textView44 != null) {
                            i2 = R.id.tvQuestionNumber;
                            TextView textView45 = (TextView) yum0.f(viewF3, R.id.tvQuestionNumber);
                            if (textView45 != null) {
                                return new qux((ConstraintLayout) viewF3, materialButton2, materialButton3, textView44, textView45);
                            }
                        }
                    }
                }
                hny.u("Missing required view with ID: ".concat(viewF3.getResources().getResourceName(i2)));
                return null;
            case 7:
                qnr qnrVar = (qnr) obj2;
                ((oyg0) obj).getClass();
                qnrVar.getClass();
                return qnr.a(qnrVar, 0L, null, null, false, 0L, 0L, null, null, null, null, null, false, false, false, false, false, false, false, false, null, false, false, false, false, false, false, false, false, false, null, null, false, false, null, null, null, null, null, null, null, null, null, false, null, false, -167772161, 524287);
            case 8:
                qnr qnrVar2 = (qnr) obj2;
                ((oyg0) obj).getClass();
                qnrVar2.getClass();
                return qnr.a(qnrVar2, 0L, null, null, false, 0L, 0L, null, null, null, null, null, false, false, false, false, false, false, false, false, null, false, false, false, false, false, false, false, false, false, null, null, false, false, null, null, null, null, null, null, null, null, null, false, null, false, -335544321, 524287);
            case 9:
                qnr qnrVar3 = (qnr) obj2;
                ((oyg0) obj).getClass();
                qnrVar3.getClass();
                return qnr.a(qnrVar3, 0L, null, null, false, 0L, 0L, null, null, null, null, null, false, false, false, false, false, false, false, false, null, false, false, false, false, false, false, false, false, false, null, null, false, false, null, null, null, null, null, null, null, null, null, false, null, false, -33554433, 524287);
            case 10:
                qnr qnrVar4 = (qnr) obj2;
                ((oyg0) obj).getClass();
                qnrVar4.getClass();
                return qnr.a(qnrVar4, 0L, null, null, false, 0L, 0L, null, null, null, null, null, false, false, false, false, false, false, false, false, null, false, false, false, false, false, false, false, false, false, null, null, false, false, null, null, null, null, null, null, null, null, null, false, null, false, -67108865, 524287);
            case 11:
                qnr qnrVar5 = (qnr) obj2;
                ((oyg0) obj).getClass();
                qnrVar5.getClass();
                return qnr.a(qnrVar5, 0L, null, null, false, 0L, 0L, null, null, null, null, null, false, false, false, false, false, false, false, false, null, false, false, true, false, false, false, false, false, false, null, null, false, false, null, null, null, null, null, null, null, null, null, false, null, false, -100663297, 524287);
            case 12:
                qnr qnrVar6 = (qnr) obj2;
                ((oyg0) obj).getClass();
                qnrVar6.getClass();
                return qnr.a(qnrVar6, 0L, null, null, false, 0L, 0L, null, null, null, null, null, false, false, false, false, false, false, false, false, null, false, false, false, true, false, false, false, false, false, null, null, false, false, null, null, null, null, null, null, null, null, null, false, null, false, -100663297, 524287);
            case 13:
                return qnr.a((qnr) obj2, 0L, null, null, false, 0L, 0L, null, null, null, null, null, false, false, false, false, false, false, false, false, null, false, false, false, false, false, false, false, false, false, null, null, false, false, null, null, null, dja.COMMON, null, null, null, null, null, false, null, false, -1, 523727);
            case 14:
                return qnr.a((qnr) obj2, 0L, null, null, false, 0L, 0L, null, null, null, null, null, false, false, false, false, false, false, false, false, null, false, false, false, false, false, false, false, false, false, null, null, false, false, null, null, null, null, null, null, null, null, null, false, null, false, -167772161, 524287);
            case 15:
                return qnr.a((qnr) obj2, 0L, null, null, false, 0L, 0L, null, null, null, null, null, false, false, false, false, false, false, false, false, null, false, false, false, false, false, false, false, false, false, null, null, false, false, null, null, null, null, null, null, null, null, null, false, null, false, -335544321, 524287);
            case 16:
                return qnr.a((qnr) obj2, 0L, null, null, false, 0L, 0L, null, null, null, null, null, false, false, false, false, false, false, false, false, null, false, false, false, false, false, false, false, false, false, null, null, false, false, null, null, null, null, null, null, null, null, null, false, null, false, -167772161, 524287);
            case 17:
                return qnr.a((qnr) obj2, 0L, null, null, false, 0L, 0L, null, null, null, null, null, false, false, false, false, false, false, false, false, null, false, false, true, false, false, false, false, false, false, null, null, false, false, null, null, null, null, null, null, null, null, null, false, null, false, -167772161, 524287);
            case 18:
                return qnr.a((qnr) obj2, 0L, null, null, false, 0L, 0L, null, null, null, null, null, false, false, false, false, false, false, false, false, null, false, false, false, false, false, false, false, false, false, null, null, false, false, null, null, null, null, null, null, null, null, null, false, null, false, -335544321, 524287);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return qnr.a((qnr) obj2, 0L, null, null, false, 0L, 0L, null, null, null, null, null, false, false, false, false, false, false, false, false, null, false, false, false, true, false, false, false, false, false, null, null, false, false, null, null, null, null, null, null, null, null, null, false, null, false, -335544321, 524287);
            case 20:
                return qnr.a((qnr) obj2, 0L, null, null, false, 0L, 0L, null, null, null, null, null, false, false, false, false, false, false, false, false, null, false, false, false, false, false, false, false, false, false, null, null, false, false, null, null, null, null, null, null, null, null, null, false, null, false, -167772161, 524287);
            case 21:
                return qnr.a((qnr) obj2, 0L, null, null, false, 0L, 0L, null, null, null, null, null, false, false, false, false, false, false, false, false, null, false, false, false, false, false, false, false, false, false, null, null, false, false, null, null, null, null, null, null, null, null, null, false, null, false, -335544321, 524287);
            case 22:
                qnr qnrVar7 = (qnr) obj2;
                ((oyg0) obj).getClass();
                qnrVar7.getClass();
                return qnr.a(qnrVar7, 0L, null, null, false, 0L, 0L, null, null, null, null, null, false, false, false, false, false, false, false, false, null, false, false, false, false, false, false, false, false, false, null, null, false, false, null, null, null, null, null, null, null, null, null, false, null, false, -32769, 524287);
            case 23:
                qnr qnrVar8 = (qnr) obj2;
                ((oyg0) obj).getClass();
                qnrVar8.getClass();
                return qnr.a(qnrVar8, 0L, null, null, false, 0L, 0L, null, null, null, null, null, false, false, false, false, false, false, false, false, null, false, false, false, false, false, false, false, false, false, null, null, false, false, null, null, null, null, null, null, null, null, null, false, null, false, -32769, 524287);
            case 24:
                qnr qnrVar9 = (qnr) obj2;
                ((oyg0) obj).getClass();
                qnrVar9.getClass();
                return qnr.a(qnrVar9, 0L, null, null, false, 0L, 0L, null, null, null, null, null, false, true, false, false, false, false, false, false, null, false, false, false, false, false, false, false, false, false, null, null, false, false, null, null, null, null, null, null, null, null, null, false, null, false, -32769, 524287);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                qnr qnrVar10 = (qnr) obj2;
                return qnr.a(qnrVar10, 0L, null, null, false, 0L, 0L, null, null, null, null, null, false, false, false, false, false, false, false, false, null, false, false, false, false, false, false, false, false, qnrVar10.F, null, null, false, false, null, null, null, null, null, null, null, null, null, false, null, false, Integer.MAX_VALUE, 524287);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return a(obj, obj2);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return b(obj, obj2);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return c(obj, obj2);
            default:
                ViewGroup viewGroup4 = (ViewGroup) obj2;
                View viewF4 = rw2.f((LayoutInflater) obj, viewGroup4, R.layout.item_game_card_type_13, viewGroup4, false);
                int i3 = R.id.gameCardBottom;
                EventCardBottomMarketMultiline eventCardBottomMarketMultiline = (EventCardBottomMarketMultiline) yum0.f(viewF4, R.id.gameCardBottom);
                if (eventCardBottomMarketMultiline != null) {
                    i3 = R.id.gameCardHeader;
                    EventCardHeader eventCardHeader = (EventCardHeader) yum0.f(viewF4, R.id.gameCardHeader);
                    if (eventCardHeader != null) {
                        i3 = R.id.gameCardMiddle;
                        EventCardMiddleWinningFormula eventCardMiddleWinningFormula = (EventCardMiddleWinningFormula) yum0.f(viewF4, R.id.gameCardMiddle);
                        if (eventCardMiddleWinningFormula != null) {
                            return new uux((SyntheticsEventCard) viewF4, eventCardBottomMarketMultiline, eventCardHeader, eventCardMiddleWinningFormula);
                        }
                    }
                }
                hny.u("Missing required view with ID: ".concat(viewF4.getResources().getResourceName(i3)));
                return null;
        }
    }

    public /* synthetic */ nuq(int i, byte b) {
        this.f24157a = b;
    }
}

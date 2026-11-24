package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.uikit_sport.eventcard.bottom.EventCardBottomMarketMultiline;
import org.xplatform.uikit_sport.eventcard.container.BasicEventCard;
import org.xplatform.uikit_sport.eventcard.container.SyntheticsEventCard;
import org.xplatform.uikit_sport.eventcard.info.EventCardInfoLine;
import org.xplatform.uikit_sport.eventcard.info.EventCardInfoLive;
import org.xplatform.uikit_sport.eventcard.middle.EventCardMiddleBaccarat;
import org.xplatform.uikit_sport.eventcard.middle.EventCardMiddleCricket;
import org.xplatform.uikit_sport.eventcard.middle.EventCardMiddleCyber;
import org.xplatform.uikit_sport.eventcard.middle.EventCardMiddleCyberPoker;
import org.xplatform.uikit_sport.eventcard.middle.EventCardMiddleDice;
import org.xplatform.uikit_sport.eventcard.middle.EventCardMiddleDicePoker;
import org.xplatform.uikit_sport.eventcard.middle.EventCardMiddlePairTeams;
import org.xplatform.uikit_sport.eventcard.middle.EventCardMiddleRoulette;
import org.xplatform.uikit_sport.eventcard.middle.EventCardMiddleSette;
import org.xplatform.uikit_sport.eventcard.middle.EventCardMiddleSingleTeam;
import org.xplatform.uikit_sport.eventcard.middle.EventCardMiddleTwoTeams;
import org.xplatform.uikit_sport.eventcard.top.EventCardHeader;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class gwr implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f12040a;

    public /* synthetic */ gwr(byte b) {
        this.f12040a = b;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f12040a;
        int i = R.id.gameCardInfoLive;
        int i2 = R.id.gameCardInfoLine;
        int i3 = R.id.gameCardMiddle;
        switch (b) {
            case 0:
                ViewGroup viewGroup = (ViewGroup) obj2;
                View viewF = rw2.f((LayoutInflater) obj, viewGroup, R.layout.item_game_card_type_14, viewGroup, false);
                EventCardBottomMarketMultiline eventCardBottomMarketMultiline = (EventCardBottomMarketMultiline) yum0.f(viewF, R.id.gameCardBottom);
                if (eventCardBottomMarketMultiline != null) {
                    EventCardHeader eventCardHeader = (EventCardHeader) yum0.f(viewF, R.id.gameCardHeader);
                    if (eventCardHeader != null) {
                        EventCardMiddleCyberPoker eventCardMiddleCyberPoker = (EventCardMiddleCyberPoker) yum0.f(viewF, R.id.gameCardMiddle);
                        if (eventCardMiddleCyberPoker != null) {
                            return new vux((SyntheticsEventCard) viewF, eventCardBottomMarketMultiline, eventCardHeader, eventCardMiddleCyberPoker);
                        }
                    } else {
                        i3 = R.id.gameCardHeader;
                    }
                } else {
                    i3 = R.id.gameCardBottom;
                }
                hny.u("Missing required view with ID: ".concat(viewF.getResources().getResourceName(i3)));
                return null;
            case 1:
                ViewGroup viewGroup2 = (ViewGroup) obj2;
                View viewF2 = rw2.f((LayoutInflater) obj, viewGroup2, R.layout.item_game_card_type_15, viewGroup2, false);
                EventCardBottomMarketMultiline eventCardBottomMarketMultiline2 = (EventCardBottomMarketMultiline) yum0.f(viewF2, R.id.gameCardBottom);
                if (eventCardBottomMarketMultiline2 != null) {
                    EventCardHeader eventCardHeader2 = (EventCardHeader) yum0.f(viewF2, R.id.gameCardHeader);
                    if (eventCardHeader2 != null) {
                        EventCardMiddleSette eventCardMiddleSette = (EventCardMiddleSette) yum0.f(viewF2, R.id.gameCardMiddle);
                        if (eventCardMiddleSette != null) {
                            return new wux((SyntheticsEventCard) viewF2, eventCardBottomMarketMultiline2, eventCardHeader2, eventCardMiddleSette);
                        }
                    } else {
                        i3 = R.id.gameCardHeader;
                    }
                } else {
                    i3 = R.id.gameCardBottom;
                }
                hny.u("Missing required view with ID: ".concat(viewF2.getResources().getResourceName(i3)));
                return null;
            case 2:
                ViewGroup viewGroup3 = (ViewGroup) obj2;
                View viewF3 = rw2.f((LayoutInflater) obj, viewGroup3, R.layout.item_game_card_type_16, viewGroup3, false);
                EventCardBottomMarketMultiline eventCardBottomMarketMultiline3 = (EventCardBottomMarketMultiline) yum0.f(viewF3, R.id.gameCardBottom);
                if (eventCardBottomMarketMultiline3 != null) {
                    EventCardHeader eventCardHeader3 = (EventCardHeader) yum0.f(viewF3, R.id.gameCardHeader);
                    if (eventCardHeader3 != null) {
                        EventCardMiddleDicePoker eventCardMiddleDicePoker = (EventCardMiddleDicePoker) yum0.f(viewF3, R.id.gameCardMiddle);
                        if (eventCardMiddleDicePoker != null) {
                            return new xux((SyntheticsEventCard) viewF3, eventCardBottomMarketMultiline3, eventCardHeader3, eventCardMiddleDicePoker);
                        }
                    } else {
                        i3 = R.id.gameCardHeader;
                    }
                } else {
                    i3 = R.id.gameCardBottom;
                }
                hny.u("Missing required view with ID: ".concat(viewF3.getResources().getResourceName(i3)));
                return null;
            case 3:
                ViewGroup viewGroup4 = (ViewGroup) obj2;
                View viewF4 = rw2.f((LayoutInflater) obj, viewGroup4, R.layout.item_game_card_type_17, viewGroup4, false);
                EventCardBottomMarketMultiline eventCardBottomMarketMultiline4 = (EventCardBottomMarketMultiline) yum0.f(viewF4, R.id.gameCardBottom);
                if (eventCardBottomMarketMultiline4 != null) {
                    EventCardHeader eventCardHeader4 = (EventCardHeader) yum0.f(viewF4, R.id.gameCardHeader);
                    if (eventCardHeader4 != null) {
                        EventCardMiddleRoulette eventCardMiddleRoulette = (EventCardMiddleRoulette) yum0.f(viewF4, R.id.gameCardMiddle);
                        if (eventCardMiddleRoulette != null) {
                            return new yux((SyntheticsEventCard) viewF4, eventCardBottomMarketMultiline4, eventCardHeader4, eventCardMiddleRoulette);
                        }
                    } else {
                        i3 = R.id.gameCardHeader;
                    }
                } else {
                    i3 = R.id.gameCardBottom;
                }
                hny.u("Missing required view with ID: ".concat(viewF4.getResources().getResourceName(i3)));
                return null;
            case 4:
                ViewGroup viewGroup5 = (ViewGroup) obj2;
                View viewF5 = rw2.f((LayoutInflater) obj, viewGroup5, R.layout.item_game_card_type_1, viewGroup5, false);
                EventCardBottomMarketMultiline eventCardBottomMarketMultiline5 = (EventCardBottomMarketMultiline) yum0.f(viewF5, R.id.gameCardBottom);
                if (eventCardBottomMarketMultiline5 != null) {
                    EventCardHeader eventCardHeader5 = (EventCardHeader) yum0.f(viewF5, R.id.gameCardHeader);
                    if (eventCardHeader5 != null) {
                        EventCardMiddleCricket eventCardMiddleCricket = (EventCardMiddleCricket) yum0.f(viewF5, R.id.gameCardMiddle);
                        if (eventCardMiddleCricket != null) {
                            return new zux((BasicEventCard) viewF5, eventCardBottomMarketMultiline5, eventCardHeader5, eventCardMiddleCricket);
                        }
                    } else {
                        i3 = R.id.gameCardHeader;
                    }
                } else {
                    i3 = R.id.gameCardBottom;
                }
                hny.u("Missing required view with ID: ".concat(viewF5.getResources().getResourceName(i3)));
                return null;
            case 5:
                ViewGroup viewGroup6 = (ViewGroup) obj2;
                View viewF6 = rw2.f((LayoutInflater) obj, viewGroup6, R.layout.item_game_card_type_2, viewGroup6, false);
                EventCardBottomMarketMultiline eventCardBottomMarketMultiline6 = (EventCardBottomMarketMultiline) yum0.f(viewF6, R.id.gameCardBottom);
                if (eventCardBottomMarketMultiline6 != null) {
                    EventCardHeader eventCardHeader6 = (EventCardHeader) yum0.f(viewF6, R.id.gameCardHeader);
                    if (eventCardHeader6 != null) {
                        EventCardMiddleBaccarat eventCardMiddleBaccarat = (EventCardMiddleBaccarat) yum0.f(viewF6, R.id.gameCardMiddle);
                        if (eventCardMiddleBaccarat != null) {
                            return new avx((SyntheticsEventCard) viewF6, eventCardBottomMarketMultiline6, eventCardHeader6, eventCardMiddleBaccarat);
                        }
                    } else {
                        i3 = R.id.gameCardHeader;
                    }
                } else {
                    i3 = R.id.gameCardBottom;
                }
                hny.u("Missing required view with ID: ".concat(viewF6.getResources().getResourceName(i3)));
                return null;
            case 6:
                ViewGroup viewGroup7 = (ViewGroup) obj2;
                View viewF7 = rw2.f((LayoutInflater) obj, viewGroup7, R.layout.item_game_card_type_3, viewGroup7, false);
                EventCardBottomMarketMultiline eventCardBottomMarketMultiline7 = (EventCardBottomMarketMultiline) yum0.f(viewF7, R.id.gameCardBottom);
                if (eventCardBottomMarketMultiline7 != null) {
                    EventCardHeader eventCardHeader7 = (EventCardHeader) yum0.f(viewF7, R.id.gameCardHeader);
                    if (eventCardHeader7 != null) {
                        EventCardInfoLine eventCardInfoLine = (EventCardInfoLine) yum0.f(viewF7, R.id.gameCardInfoLine);
                        if (eventCardInfoLine != null) {
                            EventCardMiddleTwoTeams eventCardMiddleTwoTeams = (EventCardMiddleTwoTeams) yum0.f(viewF7, R.id.gameCardMiddle);
                            if (eventCardMiddleTwoTeams != null) {
                                return new bvx((BasicEventCard) viewF7, eventCardBottomMarketMultiline7, eventCardHeader7, eventCardInfoLine, eventCardMiddleTwoTeams);
                            }
                            i2 = R.id.gameCardMiddle;
                        }
                    } else {
                        i2 = R.id.gameCardHeader;
                    }
                } else {
                    i2 = R.id.gameCardBottom;
                }
                hny.u("Missing required view with ID: ".concat(viewF7.getResources().getResourceName(i2)));
                return null;
            case 7:
                ViewGroup viewGroup8 = (ViewGroup) obj2;
                View viewF8 = rw2.f((LayoutInflater) obj, viewGroup8, R.layout.item_game_card_type_4, viewGroup8, false);
                EventCardBottomMarketMultiline eventCardBottomMarketMultiline8 = (EventCardBottomMarketMultiline) yum0.f(viewF8, R.id.gameCardBottom);
                if (eventCardBottomMarketMultiline8 != null) {
                    EventCardHeader eventCardHeader8 = (EventCardHeader) yum0.f(viewF8, R.id.gameCardHeader);
                    if (eventCardHeader8 != null) {
                        EventCardMiddleDice eventCardMiddleDice = (EventCardMiddleDice) yum0.f(viewF8, R.id.gameCardMiddle);
                        if (eventCardMiddleDice != null) {
                            return new cvx((SyntheticsEventCard) viewF8, eventCardBottomMarketMultiline8, eventCardHeader8, eventCardMiddleDice);
                        }
                    } else {
                        i3 = R.id.gameCardHeader;
                    }
                } else {
                    i3 = R.id.gameCardBottom;
                }
                hny.u("Missing required view with ID: ".concat(viewF8.getResources().getResourceName(i3)));
                return null;
            case 8:
                ViewGroup viewGroup9 = (ViewGroup) obj2;
                View viewF9 = rw2.f((LayoutInflater) obj, viewGroup9, R.layout.item_game_card_type_5, viewGroup9, false);
                EventCardBottomMarketMultiline eventCardBottomMarketMultiline9 = (EventCardBottomMarketMultiline) yum0.f(viewF9, R.id.gameCardBottom);
                if (eventCardBottomMarketMultiline9 != null) {
                    EventCardHeader eventCardHeader9 = (EventCardHeader) yum0.f(viewF9, R.id.gameCardHeader);
                    if (eventCardHeader9 != null) {
                        EventCardInfoLive eventCardInfoLive = (EventCardInfoLive) yum0.f(viewF9, R.id.gameCardInfoLive);
                        if (eventCardInfoLive != null) {
                            EventCardMiddleSingleTeam eventCardMiddleSingleTeam = (EventCardMiddleSingleTeam) yum0.f(viewF9, R.id.gameCardMiddle);
                            if (eventCardMiddleSingleTeam != null) {
                                return new dvx((BasicEventCard) viewF9, eventCardBottomMarketMultiline9, eventCardHeader9, eventCardInfoLive, eventCardMiddleSingleTeam);
                            }
                            i = R.id.gameCardMiddle;
                        }
                    } else {
                        i = R.id.gameCardHeader;
                    }
                } else {
                    i = R.id.gameCardBottom;
                }
                hny.u("Missing required view with ID: ".concat(viewF9.getResources().getResourceName(i)));
                return null;
            case 9:
                ViewGroup viewGroup10 = (ViewGroup) obj2;
                View viewF10 = rw2.f((LayoutInflater) obj, viewGroup10, R.layout.item_game_card_type_6, viewGroup10, false);
                EventCardBottomMarketMultiline eventCardBottomMarketMultiline10 = (EventCardBottomMarketMultiline) yum0.f(viewF10, R.id.gameCardBottom);
                if (eventCardBottomMarketMultiline10 != null) {
                    EventCardHeader eventCardHeader10 = (EventCardHeader) yum0.f(viewF10, R.id.gameCardHeader);
                    if (eventCardHeader10 != null) {
                        EventCardInfoLine eventCardInfoLine2 = (EventCardInfoLine) yum0.f(viewF10, R.id.gameCardInfoLine);
                        if (eventCardInfoLine2 != null) {
                            EventCardMiddlePairTeams eventCardMiddlePairTeams = (EventCardMiddlePairTeams) yum0.f(viewF10, R.id.gameCardMiddle);
                            if (eventCardMiddlePairTeams != null) {
                                return new evx((BasicEventCard) viewF10, eventCardBottomMarketMultiline10, eventCardHeader10, eventCardInfoLine2, eventCardMiddlePairTeams);
                            }
                            i2 = R.id.gameCardMiddle;
                        }
                    } else {
                        i2 = R.id.gameCardHeader;
                    }
                } else {
                    i2 = R.id.gameCardBottom;
                }
                hny.u("Missing required view with ID: ".concat(viewF10.getResources().getResourceName(i2)));
                return null;
            case 10:
                ViewGroup viewGroup11 = (ViewGroup) obj2;
                View viewF11 = rw2.f((LayoutInflater) obj, viewGroup11, R.layout.item_game_card_type_7, viewGroup11, false);
                EventCardBottomMarketMultiline eventCardBottomMarketMultiline11 = (EventCardBottomMarketMultiline) yum0.f(viewF11, R.id.gameCardBottom);
                if (eventCardBottomMarketMultiline11 != null) {
                    EventCardHeader eventCardHeader11 = (EventCardHeader) yum0.f(viewF11, R.id.gameCardHeader);
                    if (eventCardHeader11 != null) {
                        EventCardInfoLine eventCardInfoLine3 = (EventCardInfoLine) yum0.f(viewF11, R.id.gameCardInfoLine);
                        if (eventCardInfoLine3 != null) {
                            EventCardMiddleTwoTeams eventCardMiddleTwoTeams2 = (EventCardMiddleTwoTeams) yum0.f(viewF11, R.id.gameCardMiddle);
                            if (eventCardMiddleTwoTeams2 != null) {
                                return new fvx((BasicEventCard) viewF11, eventCardBottomMarketMultiline11, eventCardHeader11, eventCardInfoLine3, eventCardMiddleTwoTeams2);
                            }
                            i2 = R.id.gameCardMiddle;
                        }
                    } else {
                        i2 = R.id.gameCardHeader;
                    }
                } else {
                    i2 = R.id.gameCardBottom;
                }
                hny.u("Missing required view with ID: ".concat(viewF11.getResources().getResourceName(i2)));
                return null;
            case 11:
                ViewGroup viewGroup12 = (ViewGroup) obj2;
                View viewF12 = rw2.f((LayoutInflater) obj, viewGroup12, R.layout.item_game_card_type_8, viewGroup12, false);
                EventCardBottomMarketMultiline eventCardBottomMarketMultiline12 = (EventCardBottomMarketMultiline) yum0.f(viewF12, R.id.gameCardBottom);
                if (eventCardBottomMarketMultiline12 != null) {
                    EventCardHeader eventCardHeader12 = (EventCardHeader) yum0.f(viewF12, R.id.gameCardHeader);
                    if (eventCardHeader12 != null) {
                        EventCardInfoLive eventCardInfoLive2 = (EventCardInfoLive) yum0.f(viewF12, R.id.gameCardInfoLive);
                        if (eventCardInfoLive2 != null) {
                            EventCardMiddleCyber eventCardMiddleCyber = (EventCardMiddleCyber) yum0.f(viewF12, R.id.gameCardMiddle);
                            if (eventCardMiddleCyber != null) {
                                return new gvx((BasicEventCard) viewF12, eventCardBottomMarketMultiline12, eventCardHeader12, eventCardInfoLive2, eventCardMiddleCyber);
                            }
                            i = R.id.gameCardMiddle;
                        }
                    } else {
                        i = R.id.gameCardHeader;
                    }
                } else {
                    i = R.id.gameCardBottom;
                }
                hny.u("Missing required view with ID: ".concat(viewF12.getResources().getResourceName(i)));
                return null;
            case 12:
                ViewGroup viewGroup13 = (ViewGroup) obj2;
                View viewF13 = rw2.f((LayoutInflater) obj, viewGroup13, R.layout.item_game_card_type_9, viewGroup13, false);
                EventCardBottomMarketMultiline eventCardBottomMarketMultiline13 = (EventCardBottomMarketMultiline) yum0.f(viewF13, R.id.gameCardBottom);
                if (eventCardBottomMarketMultiline13 != null) {
                    EventCardHeader eventCardHeader13 = (EventCardHeader) yum0.f(viewF13, R.id.gameCardHeader);
                    if (eventCardHeader13 != null) {
                        EventCardInfoLine eventCardInfoLine4 = (EventCardInfoLine) yum0.f(viewF13, R.id.gameCardInfoLine);
                        if (eventCardInfoLine4 != null) {
                            EventCardMiddleTwoTeams eventCardMiddleTwoTeams3 = (EventCardMiddleTwoTeams) yum0.f(viewF13, R.id.gameCardMiddle);
                            if (eventCardMiddleTwoTeams3 != null) {
                                return new hvx((BasicEventCard) viewF13, eventCardBottomMarketMultiline13, eventCardHeader13, eventCardInfoLine4, eventCardMiddleTwoTeams3);
                            }
                            i2 = R.id.gameCardMiddle;
                        }
                    } else {
                        i2 = R.id.gameCardHeader;
                    }
                } else {
                    i2 = R.id.gameCardBottom;
                }
                hny.u("Missing required view with ID: ".concat(viewF13.getResources().getResourceName(i2)));
                return null;
            case 13:
                ((Integer) obj).getClass();
                y39 y39Var = (y39) obj2;
                y39Var.getClass();
                return y39Var.getKey();
            case 14:
                ((Integer) obj).getClass();
                bja bjaVar = (bja) obj2;
                bjaVar.getClass();
                return bjaVar.getType();
            case 15:
                oyg0 oyg0Var = (oyg0) obj;
                z2s z2sVar = (z2s) obj2;
                oyg0Var.getClass();
                z2sVar.getClass();
                irs irsVar = irs.f15274a;
                q7x.F(oyg0Var, irsVar, "KEY_CURRENT_TAB");
                return z2s.a(z2sVar, 0L, null, null, false, 0L, 0L, null, null, null, null, null, false, false, false, false, false, false, false, false, null, false, false, false, null, null, false, false, null, null, null, null, irsVar, null, null, null, null, null, null, false, null, -1, 65471);
            case 16:
                oyg0 oyg0Var2 = (oyg0) obj;
                z2s z2sVar2 = (z2s) obj2;
                oyg0Var2.getClass();
                z2sVar2.getClass();
                irs irsVar2 = irs.b;
                q7x.F(oyg0Var2, irsVar2, "KEY_CURRENT_TAB");
                return z2s.a(z2sVar2, 0L, null, null, false, 0L, 0L, null, null, null, null, null, false, false, false, false, false, false, false, false, null, false, false, false, null, null, false, false, null, null, null, null, irsVar2, null, null, null, null, null, null, false, null, -1, 65471);
            case 17:
                oyg0 oyg0Var3 = (oyg0) obj;
                z2s z2sVar3 = (z2s) obj2;
                oyg0Var3.getClass();
                z2sVar3.getClass();
                q7x.F(oyg0Var3, Boolean.FALSE, "KEY_EXPANDED_CARD_SECTION");
                return z2s.a(z2sVar3, 0L, null, null, false, 0L, 0L, null, null, null, null, null, false, false, false, false, false, false, false, false, null, false, false, false, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, false, null, -1, 57343);
            case 18:
                q7x.F((oyg0) obj, Boolean.FALSE, "KEY_SHOW_SUB_GAMES");
                return z2s.a((z2s) obj2, 0L, null, null, false, 0L, 0L, null, null, null, null, null, false, false, false, false, false, false, false, false, null, false, false, false, null, null, false, true, null, null, null, null, null, null, null, null, null, null, null, false, null, 1073741823, 65534);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return z2s.a((z2s) obj2, 0L, null, null, false, 0L, 0L, null, null, null, null, null, false, false, false, false, false, false, false, false, null, false, false, false, null, null, false, false, null, null, null, dja.COMMON, null, null, null, null, null, null, null, false, null, -1, 65500);
            case 20:
                irs irsVar3 = irs.f15274a;
                q7x.F((oyg0) obj, irsVar3, "KEY_CURRENT_TAB");
                return z2s.a((z2s) obj2, 0L, null, null, false, 0L, 0L, null, null, null, null, null, false, false, false, false, false, false, false, false, null, false, false, false, null, null, false, false, null, null, null, null, irsVar3, null, null, null, null, null, null, false, null, -1, 65471);
            case 21:
                irs irsVar4 = irs.f15274a;
                q7x.F((oyg0) obj, irsVar4, "KEY_CURRENT_TAB");
                return z2s.a((z2s) obj2, 0L, null, null, false, 0L, 0L, null, null, null, null, null, false, false, false, false, false, false, false, false, null, false, false, false, null, null, false, false, null, null, null, null, irsVar4, null, null, null, null, null, null, false, null, -1, 65471);
            case 22:
                oyg0 oyg0Var4 = (oyg0) obj;
                irs irsVar5 = irs.b;
                q7x.F(oyg0Var4, irsVar5, "KEY_CURRENT_TAB");
                dja djaVar = dja.BROADCASTING_VIDEO;
                q7x.F(oyg0Var4, djaVar, "KEY_CURRENT_BROADCASTING_TYPE");
                return z2s.a((z2s) obj2, 0L, null, null, false, 0L, 0L, null, null, null, null, null, false, false, false, false, false, false, false, false, null, false, false, false, null, null, false, false, null, null, null, null, irsVar5, djaVar, null, null, null, null, null, false, null, -1, 65343);
            case 23:
                oyg0 oyg0Var5 = (oyg0) obj;
                irs irsVar6 = irs.b;
                q7x.F(oyg0Var5, irsVar6, "KEY_CURRENT_TAB");
                dja djaVar2 = dja.BROADCASTING_ZONE;
                q7x.F(oyg0Var5, djaVar2, "KEY_CURRENT_BROADCASTING_TYPE");
                return z2s.a((z2s) obj2, 0L, null, null, false, 0L, 0L, null, null, null, null, null, false, false, false, false, false, false, false, false, null, false, false, false, null, null, false, false, null, null, null, null, irsVar6, djaVar2, null, null, null, null, null, false, null, -1, 65343);
            case 24:
                irs irsVar7 = irs.f15274a;
                q7x.F((oyg0) obj, irsVar7, "KEY_CURRENT_TAB");
                return z2s.a((z2s) obj2, 0L, null, null, false, 0L, 0L, null, null, null, null, null, false, false, false, false, false, false, false, false, null, false, false, false, null, null, false, false, null, null, null, null, irsVar7, null, null, null, null, null, null, false, null, -1, 65471);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                irs irsVar8 = irs.f15274a;
                q7x.F((oyg0) obj, irsVar8, "KEY_CURRENT_TAB");
                return z2s.a((z2s) obj2, 0L, null, null, false, 0L, 0L, null, null, null, null, null, false, false, false, false, false, false, false, false, null, false, false, false, null, null, false, false, null, null, null, null, irsVar8, null, null, null, null, null, null, false, null, -1, 65471);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                z2s z2sVar4 = (z2s) obj2;
                ((oyg0) obj).getClass();
                z2sVar4.getClass();
                return z2s.a(z2sVar4, 0L, null, null, false, 0L, 0L, null, null, null, null, null, false, false, false, false, false, false, false, false, null, false, false, false, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, false, null, -32769, 65535);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                z2s z2sVar5 = (z2s) obj2;
                ((oyg0) obj).getClass();
                z2sVar5.getClass();
                return z2s.a(z2sVar5, 0L, null, null, false, 0L, 0L, null, null, null, null, null, false, false, false, false, false, false, false, false, null, false, false, false, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, false, null, -32769, 65535);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                z2s z2sVar6 = (z2s) obj2;
                ((oyg0) obj).getClass();
                z2sVar6.getClass();
                return z2s.a(z2sVar6, 0L, null, null, false, 0L, 0L, null, null, null, null, null, false, true, false, false, false, false, false, false, null, false, false, false, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, false, null, -32769, 65535);
            default:
                return z2s.a((z2s) obj2, 0L, null, null, false, 0L, 0L, null, null, null, null, null, false, false, false, false, false, false, false, false, null, false, false, false, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, false, null, -16385, 65535);
        }
    }
}

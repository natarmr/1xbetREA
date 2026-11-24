package a;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.widget.NestedScrollView;
import com.airbnb.lottie.LottieAnimationView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.components.buttons.DsButton;
import org.xplatform.uikit.components.separator.DsSeparator;
import org.xplatform.uikit.components.successbetalert.model.BetDoneIconStyleEnum;
import org.xplatform.uikit.components.successbetalert.model.SuccessBetAlertModel;
import org.xplatform.uikit.components.successbetalert.model.SuccessBetStringModel;
import org.xplatform.uikit.components.successbetalert.model.TmpBetDoneUiModel;

/* JADX INFO: loaded from: classes6.dex */
public final class kgn0 extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TmpBetDoneUiModel f18248a;
    public final SuccessBetAlertModel b;
    public final n0o0 c;
    public final n0o0 d;
    public final n0o0 e;
    public final n0o0 f;
    public final n0o0 g;
    public final n0o0 h;
    public final n0o0 i;
    public final n0o0 j;
    public final n0o0 k;
    public Function0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code duplicated, block: B:27:0x0100  */
    /* JADX WARN: Code duplicated, block: B:28:0x011c  */
    public kgn0(TmpBetDoneUiModel tmpBetDoneUiModel, SuccessBetAlertModel successBetAlertModel, SuccessBetStringModel successBetStringModel, Context context) {
        int i;
        View view;
        super(context, null, 0);
        BetDoneIconStyleEnum betDoneIconStyleEnum = tmpBetDoneUiModel.b;
        final byte b = 0;
        this.f18248a = tmpBetDoneUiModel;
        this.b = successBetAlertModel;
        this.c = maz.b(new Function0(this) { // from class: a.jgn0
            public final /* synthetic */ kgn0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b2 = b;
                kgn0 kgn0Var = this.b;
                switch (b2) {
                    case 0:
                        return (FrameLayout) kgn0Var.findViewById(R.id.successBetInfoView);
                    case 1:
                        kgn0Var.l.invoke();
                        return Unit.f46060a;
                    case 2:
                        kgn0Var.l.invoke();
                        return Unit.f46060a;
                    case 3:
                        kgn0Var.l.invoke();
                        return Unit.f46060a;
                    case 4:
                        return (AppCompatTextView) kgn0Var.findViewById(R.id.tvTitle);
                    case 5:
                        return (AppCompatTextView) kgn0Var.findViewById(R.id.tvSubTitle);
                    case 6:
                        return (DsButton) kgn0Var.findViewById(R.id.historyB);
                    case 7:
                        return (DsButton) kgn0Var.findViewById(R.id.continueB);
                    case 8:
                        return (LottieAnimationView) kgn0Var.findViewById(R.id.lottieAnimationView);
                    case 9:
                        return (LinearLayout) kgn0Var.findViewById(R.id.contentContainer);
                    case 10:
                        return (DsSeparator) kgn0Var.findViewById(R.id.nestedSeparator);
                    default:
                        return (NestedScrollView) kgn0Var.findViewById(R.id.nestedScroll);
                }
            }
        });
        final byte b2 = 4;
        this.d = maz.b(new Function0(this) { // from class: a.jgn0
            public final /* synthetic */ kgn0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                kgn0 kgn0Var = this.b;
                switch (b3) {
                    case 0:
                        return (FrameLayout) kgn0Var.findViewById(R.id.successBetInfoView);
                    case 1:
                        kgn0Var.l.invoke();
                        return Unit.f46060a;
                    case 2:
                        kgn0Var.l.invoke();
                        return Unit.f46060a;
                    case 3:
                        kgn0Var.l.invoke();
                        return Unit.f46060a;
                    case 4:
                        return (AppCompatTextView) kgn0Var.findViewById(R.id.tvTitle);
                    case 5:
                        return (AppCompatTextView) kgn0Var.findViewById(R.id.tvSubTitle);
                    case 6:
                        return (DsButton) kgn0Var.findViewById(R.id.historyB);
                    case 7:
                        return (DsButton) kgn0Var.findViewById(R.id.continueB);
                    case 8:
                        return (LottieAnimationView) kgn0Var.findViewById(R.id.lottieAnimationView);
                    case 9:
                        return (LinearLayout) kgn0Var.findViewById(R.id.contentContainer);
                    case 10:
                        return (DsSeparator) kgn0Var.findViewById(R.id.nestedSeparator);
                    default:
                        return (NestedScrollView) kgn0Var.findViewById(R.id.nestedScroll);
                }
            }
        });
        final byte b3 = 5;
        this.e = maz.b(new Function0(this) { // from class: a.jgn0
            public final /* synthetic */ kgn0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b4 = b3;
                kgn0 kgn0Var = this.b;
                switch (b4) {
                    case 0:
                        return (FrameLayout) kgn0Var.findViewById(R.id.successBetInfoView);
                    case 1:
                        kgn0Var.l.invoke();
                        return Unit.f46060a;
                    case 2:
                        kgn0Var.l.invoke();
                        return Unit.f46060a;
                    case 3:
                        kgn0Var.l.invoke();
                        return Unit.f46060a;
                    case 4:
                        return (AppCompatTextView) kgn0Var.findViewById(R.id.tvTitle);
                    case 5:
                        return (AppCompatTextView) kgn0Var.findViewById(R.id.tvSubTitle);
                    case 6:
                        return (DsButton) kgn0Var.findViewById(R.id.historyB);
                    case 7:
                        return (DsButton) kgn0Var.findViewById(R.id.continueB);
                    case 8:
                        return (LottieAnimationView) kgn0Var.findViewById(R.id.lottieAnimationView);
                    case 9:
                        return (LinearLayout) kgn0Var.findViewById(R.id.contentContainer);
                    case 10:
                        return (DsSeparator) kgn0Var.findViewById(R.id.nestedSeparator);
                    default:
                        return (NestedScrollView) kgn0Var.findViewById(R.id.nestedScroll);
                }
            }
        });
        final byte b4 = 6;
        this.f = maz.b(new Function0(this) { // from class: a.jgn0
            public final /* synthetic */ kgn0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b5 = b4;
                kgn0 kgn0Var = this.b;
                switch (b5) {
                    case 0:
                        return (FrameLayout) kgn0Var.findViewById(R.id.successBetInfoView);
                    case 1:
                        kgn0Var.l.invoke();
                        return Unit.f46060a;
                    case 2:
                        kgn0Var.l.invoke();
                        return Unit.f46060a;
                    case 3:
                        kgn0Var.l.invoke();
                        return Unit.f46060a;
                    case 4:
                        return (AppCompatTextView) kgn0Var.findViewById(R.id.tvTitle);
                    case 5:
                        return (AppCompatTextView) kgn0Var.findViewById(R.id.tvSubTitle);
                    case 6:
                        return (DsButton) kgn0Var.findViewById(R.id.historyB);
                    case 7:
                        return (DsButton) kgn0Var.findViewById(R.id.continueB);
                    case 8:
                        return (LottieAnimationView) kgn0Var.findViewById(R.id.lottieAnimationView);
                    case 9:
                        return (LinearLayout) kgn0Var.findViewById(R.id.contentContainer);
                    case 10:
                        return (DsSeparator) kgn0Var.findViewById(R.id.nestedSeparator);
                    default:
                        return (NestedScrollView) kgn0Var.findViewById(R.id.nestedScroll);
                }
            }
        });
        final byte b5 = 7;
        this.g = maz.b(new Function0(this) { // from class: a.jgn0
            public final /* synthetic */ kgn0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b6 = b5;
                kgn0 kgn0Var = this.b;
                switch (b6) {
                    case 0:
                        return (FrameLayout) kgn0Var.findViewById(R.id.successBetInfoView);
                    case 1:
                        kgn0Var.l.invoke();
                        return Unit.f46060a;
                    case 2:
                        kgn0Var.l.invoke();
                        return Unit.f46060a;
                    case 3:
                        kgn0Var.l.invoke();
                        return Unit.f46060a;
                    case 4:
                        return (AppCompatTextView) kgn0Var.findViewById(R.id.tvTitle);
                    case 5:
                        return (AppCompatTextView) kgn0Var.findViewById(R.id.tvSubTitle);
                    case 6:
                        return (DsButton) kgn0Var.findViewById(R.id.historyB);
                    case 7:
                        return (DsButton) kgn0Var.findViewById(R.id.continueB);
                    case 8:
                        return (LottieAnimationView) kgn0Var.findViewById(R.id.lottieAnimationView);
                    case 9:
                        return (LinearLayout) kgn0Var.findViewById(R.id.contentContainer);
                    case 10:
                        return (DsSeparator) kgn0Var.findViewById(R.id.nestedSeparator);
                    default:
                        return (NestedScrollView) kgn0Var.findViewById(R.id.nestedScroll);
                }
            }
        });
        final byte b6 = 8;
        this.h = maz.b(new Function0(this) { // from class: a.jgn0
            public final /* synthetic */ kgn0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b7 = b6;
                kgn0 kgn0Var = this.b;
                switch (b7) {
                    case 0:
                        return (FrameLayout) kgn0Var.findViewById(R.id.successBetInfoView);
                    case 1:
                        kgn0Var.l.invoke();
                        return Unit.f46060a;
                    case 2:
                        kgn0Var.l.invoke();
                        return Unit.f46060a;
                    case 3:
                        kgn0Var.l.invoke();
                        return Unit.f46060a;
                    case 4:
                        return (AppCompatTextView) kgn0Var.findViewById(R.id.tvTitle);
                    case 5:
                        return (AppCompatTextView) kgn0Var.findViewById(R.id.tvSubTitle);
                    case 6:
                        return (DsButton) kgn0Var.findViewById(R.id.historyB);
                    case 7:
                        return (DsButton) kgn0Var.findViewById(R.id.continueB);
                    case 8:
                        return (LottieAnimationView) kgn0Var.findViewById(R.id.lottieAnimationView);
                    case 9:
                        return (LinearLayout) kgn0Var.findViewById(R.id.contentContainer);
                    case 10:
                        return (DsSeparator) kgn0Var.findViewById(R.id.nestedSeparator);
                    default:
                        return (NestedScrollView) kgn0Var.findViewById(R.id.nestedScroll);
                }
            }
        });
        final byte b7 = 9;
        this.i = maz.b(new Function0(this) { // from class: a.jgn0
            public final /* synthetic */ kgn0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b8 = b7;
                kgn0 kgn0Var = this.b;
                switch (b8) {
                    case 0:
                        return (FrameLayout) kgn0Var.findViewById(R.id.successBetInfoView);
                    case 1:
                        kgn0Var.l.invoke();
                        return Unit.f46060a;
                    case 2:
                        kgn0Var.l.invoke();
                        return Unit.f46060a;
                    case 3:
                        kgn0Var.l.invoke();
                        return Unit.f46060a;
                    case 4:
                        return (AppCompatTextView) kgn0Var.findViewById(R.id.tvTitle);
                    case 5:
                        return (AppCompatTextView) kgn0Var.findViewById(R.id.tvSubTitle);
                    case 6:
                        return (DsButton) kgn0Var.findViewById(R.id.historyB);
                    case 7:
                        return (DsButton) kgn0Var.findViewById(R.id.continueB);
                    case 8:
                        return (LottieAnimationView) kgn0Var.findViewById(R.id.lottieAnimationView);
                    case 9:
                        return (LinearLayout) kgn0Var.findViewById(R.id.contentContainer);
                    case 10:
                        return (DsSeparator) kgn0Var.findViewById(R.id.nestedSeparator);
                    default:
                        return (NestedScrollView) kgn0Var.findViewById(R.id.nestedScroll);
                }
            }
        });
        final byte b8 = 10;
        this.j = maz.b(new Function0(this) { // from class: a.jgn0
            public final /* synthetic */ kgn0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b9 = b8;
                kgn0 kgn0Var = this.b;
                switch (b9) {
                    case 0:
                        return (FrameLayout) kgn0Var.findViewById(R.id.successBetInfoView);
                    case 1:
                        kgn0Var.l.invoke();
                        return Unit.f46060a;
                    case 2:
                        kgn0Var.l.invoke();
                        return Unit.f46060a;
                    case 3:
                        kgn0Var.l.invoke();
                        return Unit.f46060a;
                    case 4:
                        return (AppCompatTextView) kgn0Var.findViewById(R.id.tvTitle);
                    case 5:
                        return (AppCompatTextView) kgn0Var.findViewById(R.id.tvSubTitle);
                    case 6:
                        return (DsButton) kgn0Var.findViewById(R.id.historyB);
                    case 7:
                        return (DsButton) kgn0Var.findViewById(R.id.continueB);
                    case 8:
                        return (LottieAnimationView) kgn0Var.findViewById(R.id.lottieAnimationView);
                    case 9:
                        return (LinearLayout) kgn0Var.findViewById(R.id.contentContainer);
                    case 10:
                        return (DsSeparator) kgn0Var.findViewById(R.id.nestedSeparator);
                    default:
                        return (NestedScrollView) kgn0Var.findViewById(R.id.nestedScroll);
                }
            }
        });
        final byte b9 = 11;
        this.k = maz.b(new Function0(this) { // from class: a.jgn0
            public final /* synthetic */ kgn0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b10 = b9;
                kgn0 kgn0Var = this.b;
                switch (b10) {
                    case 0:
                        return (FrameLayout) kgn0Var.findViewById(R.id.successBetInfoView);
                    case 1:
                        kgn0Var.l.invoke();
                        return Unit.f46060a;
                    case 2:
                        kgn0Var.l.invoke();
                        return Unit.f46060a;
                    case 3:
                        kgn0Var.l.invoke();
                        return Unit.f46060a;
                    case 4:
                        return (AppCompatTextView) kgn0Var.findViewById(R.id.tvTitle);
                    case 5:
                        return (AppCompatTextView) kgn0Var.findViewById(R.id.tvSubTitle);
                    case 6:
                        return (DsButton) kgn0Var.findViewById(R.id.historyB);
                    case 7:
                        return (DsButton) kgn0Var.findViewById(R.id.continueB);
                    case 8:
                        return (LottieAnimationView) kgn0Var.findViewById(R.id.lottieAnimationView);
                    case 9:
                        return (LinearLayout) kgn0Var.findViewById(R.id.contentContainer);
                    case 10:
                        return (DsSeparator) kgn0Var.findViewById(R.id.nestedSeparator);
                    default:
                        return (NestedScrollView) kgn0Var.findViewById(R.id.nestedScroll);
                }
            }
        });
        this.l = new a7n0((byte) 14);
        int iOrdinal = betDoneIconStyleEnum.ordinal();
        final byte b10 = 1;
        final byte b11 = 2;
        if (iOrdinal == 0) {
            i = R.layout.success_bet_alert_action_dialog;
        } else if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                t9f.b();
                throw null;
            }
            i = R.layout.success_bet_alert_action_dialog;
        } else {
            i = R.layout.success_bet_alert_action_dialog_with_island;
        }
        View.inflate(getContext(), i, this);
        if (b()) {
            AppCompatTextView tvSubTitle = getTvSubTitle();
            ViewGroup.LayoutParams layoutParams = tvSubTitle.getLayoutParams();
            if (layoutParams == null) {
                hny.u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                throw null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.bottomMargin = getResources().getDimensionPixelSize(R.dimen.space_24);
            tvSubTitle.setLayoutParams(marginLayoutParams);
        }
        if (b()) {
            getSuccessBetInfoView().setVisibility(8);
        } else {
            FrameLayout successBetInfoView = getSuccessBetInfoView();
            int iOrdinal2 = tmpBetDoneUiModel.f47268a.ordinal();
            if (iOrdinal2 == 0) {
                Context context2 = getContext();
                context2.getClass();
                ahn0 ahn0Var = new ahn0(context2);
                ahn0Var.setId(jmu0.d());
                ahn0Var.a(successBetAlertModel, successBetStringModel, new Function0(this) { // from class: a.jgn0
                    public final /* synthetic */ kgn0 b;

                    {
                        this.b = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        byte b12 = b10;
                        kgn0 kgn0Var = this.b;
                        switch (b12) {
                            case 0:
                                return (FrameLayout) kgn0Var.findViewById(R.id.successBetInfoView);
                            case 1:
                                kgn0Var.l.invoke();
                                return Unit.f46060a;
                            case 2:
                                kgn0Var.l.invoke();
                                return Unit.f46060a;
                            case 3:
                                kgn0Var.l.invoke();
                                return Unit.f46060a;
                            case 4:
                                return (AppCompatTextView) kgn0Var.findViewById(R.id.tvTitle);
                            case 5:
                                return (AppCompatTextView) kgn0Var.findViewById(R.id.tvSubTitle);
                            case 6:
                                return (DsButton) kgn0Var.findViewById(R.id.historyB);
                            case 7:
                                return (DsButton) kgn0Var.findViewById(R.id.continueB);
                            case 8:
                                return (LottieAnimationView) kgn0Var.findViewById(R.id.lottieAnimationView);
                            case 9:
                                return (LinearLayout) kgn0Var.findViewById(R.id.contentContainer);
                            case 10:
                                return (DsSeparator) kgn0Var.findViewById(R.id.nestedSeparator);
                            default:
                                return (NestedScrollView) kgn0Var.findViewById(R.id.nestedScroll);
                        }
                    }
                });
                view = ahn0Var;
            } else if (iOrdinal2 == 1) {
                Context context3 = getContext();
                context3.getClass();
                wgn0 wgn0Var = new wgn0(context3);
                wgn0Var.setId(jmu0.d());
                wgn0Var.a(successBetAlertModel, successBetStringModel, new Function0(this) { // from class: a.jgn0
                    public final /* synthetic */ kgn0 b;

                    {
                        this.b = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        byte b12 = b11;
                        kgn0 kgn0Var = this.b;
                        switch (b12) {
                            case 0:
                                return (FrameLayout) kgn0Var.findViewById(R.id.successBetInfoView);
                            case 1:
                                kgn0Var.l.invoke();
                                return Unit.f46060a;
                            case 2:
                                kgn0Var.l.invoke();
                                return Unit.f46060a;
                            case 3:
                                kgn0Var.l.invoke();
                                return Unit.f46060a;
                            case 4:
                                return (AppCompatTextView) kgn0Var.findViewById(R.id.tvTitle);
                            case 5:
                                return (AppCompatTextView) kgn0Var.findViewById(R.id.tvSubTitle);
                            case 6:
                                return (DsButton) kgn0Var.findViewById(R.id.historyB);
                            case 7:
                                return (DsButton) kgn0Var.findViewById(R.id.continueB);
                            case 8:
                                return (LottieAnimationView) kgn0Var.findViewById(R.id.lottieAnimationView);
                            case 9:
                                return (LinearLayout) kgn0Var.findViewById(R.id.contentContainer);
                            case 10:
                                return (DsSeparator) kgn0Var.findViewById(R.id.nestedSeparator);
                            default:
                                return (NestedScrollView) kgn0Var.findViewById(R.id.nestedScroll);
                        }
                    }
                });
                view = wgn0Var;
            } else if (iOrdinal2 != 2) {
                final byte b12 = 3;
                if (iOrdinal2 != 3) {
                    Context context4 = getContext();
                    context4.getClass();
                    ahn0 ahn0Var2 = new ahn0(context4);
                    ahn0Var2.setId(jmu0.d());
                    ahn0Var2.a(successBetAlertModel, successBetStringModel, new Function0(this) { // from class: a.jgn0
                        public final /* synthetic */ kgn0 b;

                        {
                            this.b = this;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            byte b13 = b12;
                            kgn0 kgn0Var = this.b;
                            switch (b13) {
                                case 0:
                                    return (FrameLayout) kgn0Var.findViewById(R.id.successBetInfoView);
                                case 1:
                                    kgn0Var.l.invoke();
                                    return Unit.f46060a;
                                case 2:
                                    kgn0Var.l.invoke();
                                    return Unit.f46060a;
                                case 3:
                                    kgn0Var.l.invoke();
                                    return Unit.f46060a;
                                case 4:
                                    return (AppCompatTextView) kgn0Var.findViewById(R.id.tvTitle);
                                case 5:
                                    return (AppCompatTextView) kgn0Var.findViewById(R.id.tvSubTitle);
                                case 6:
                                    return (DsButton) kgn0Var.findViewById(R.id.historyB);
                                case 7:
                                    return (DsButton) kgn0Var.findViewById(R.id.continueB);
                                case 8:
                                    return (LottieAnimationView) kgn0Var.findViewById(R.id.lottieAnimationView);
                                case 9:
                                    return (LinearLayout) kgn0Var.findViewById(R.id.contentContainer);
                                case 10:
                                    return (DsSeparator) kgn0Var.findViewById(R.id.nestedSeparator);
                                default:
                                    return (NestedScrollView) kgn0Var.findViewById(R.id.nestedScroll);
                            }
                        }
                    });
                    view = ahn0Var2;
                } else {
                    Context context5 = getContext();
                    context5.getClass();
                    wgn0 wgn0Var2 = new wgn0(context5);
                    wgn0Var2.setId(jmu0.d());
                    wgn0Var2.a(successBetAlertModel, successBetStringModel, new Function0(this) { // from class: a.jgn0
                        public final /* synthetic */ kgn0 b;

                        {
                            this.b = this;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            byte b13 = b11;
                            kgn0 kgn0Var = this.b;
                            switch (b13) {
                                case 0:
                                    return (FrameLayout) kgn0Var.findViewById(R.id.successBetInfoView);
                                case 1:
                                    kgn0Var.l.invoke();
                                    return Unit.f46060a;
                                case 2:
                                    kgn0Var.l.invoke();
                                    return Unit.f46060a;
                                case 3:
                                    kgn0Var.l.invoke();
                                    return Unit.f46060a;
                                case 4:
                                    return (AppCompatTextView) kgn0Var.findViewById(R.id.tvTitle);
                                case 5:
                                    return (AppCompatTextView) kgn0Var.findViewById(R.id.tvSubTitle);
                                case 6:
                                    return (DsButton) kgn0Var.findViewById(R.id.historyB);
                                case 7:
                                    return (DsButton) kgn0Var.findViewById(R.id.continueB);
                                case 8:
                                    return (LottieAnimationView) kgn0Var.findViewById(R.id.lottieAnimationView);
                                case 9:
                                    return (LinearLayout) kgn0Var.findViewById(R.id.contentContainer);
                                case 10:
                                    return (DsSeparator) kgn0Var.findViewById(R.id.nestedSeparator);
                                default:
                                    return (NestedScrollView) kgn0Var.findViewById(R.id.nestedScroll);
                            }
                        }
                    });
                    view = wgn0Var2;
                }
            } else {
                Context context6 = getContext();
                context6.getClass();
                ahn0 ahn0Var3 = new ahn0(context6);
                ahn0Var3.setId(jmu0.d());
                ahn0Var3.a(successBetAlertModel, successBetStringModel, new Function0(this) { // from class: a.jgn0
                    public final /* synthetic */ kgn0 b;

                    {
                        this.b = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        byte b13 = b10;
                        kgn0 kgn0Var = this.b;
                        switch (b13) {
                            case 0:
                                return (FrameLayout) kgn0Var.findViewById(R.id.successBetInfoView);
                            case 1:
                                kgn0Var.l.invoke();
                                return Unit.f46060a;
                            case 2:
                                kgn0Var.l.invoke();
                                return Unit.f46060a;
                            case 3:
                                kgn0Var.l.invoke();
                                return Unit.f46060a;
                            case 4:
                                return (AppCompatTextView) kgn0Var.findViewById(R.id.tvTitle);
                            case 5:
                                return (AppCompatTextView) kgn0Var.findViewById(R.id.tvSubTitle);
                            case 6:
                                return (DsButton) kgn0Var.findViewById(R.id.historyB);
                            case 7:
                                return (DsButton) kgn0Var.findViewById(R.id.continueB);
                            case 8:
                                return (LottieAnimationView) kgn0Var.findViewById(R.id.lottieAnimationView);
                            case 9:
                                return (LinearLayout) kgn0Var.findViewById(R.id.contentContainer);
                            case 10:
                                return (DsSeparator) kgn0Var.findViewById(R.id.nestedSeparator);
                            default:
                                return (NestedScrollView) kgn0Var.findViewById(R.id.nestedScroll);
                        }
                    }
                });
                view = ahn0Var3;
            }
            successBetInfoView.addView(view);
        }
        int iOrdinal3 = betDoneIconStyleEnum.ordinal();
        if (iOrdinal3 == 0) {
            getContentContainer().removeView(getLottieAnimationView());
        } else if (iOrdinal3 == 2) {
            Integer num = successBetAlertModel.g;
            if (num != null) {
                getLottieAnimationView().setAnimation(getResources().getString(num.intValue()));
            }
            getLottieAnimationView().setVisibility(0);
        }
        if (getParent() != null) {
            post(new apj0(this, b3));
        }
        setTag("SuccessBetAlertDialogView");
        setId(jmu0.d());
    }

    private final LinearLayout getContentContainer() {
        Object value = this.i.getValue();
        value.getClass();
        return (LinearLayout) value;
    }

    private final DsButton getContinueButton() {
        Object value = this.g.getValue();
        value.getClass();
        return (DsButton) value;
    }

    private final DsButton getHistoryButton() {
        Object value = this.f.getValue();
        value.getClass();
        return (DsButton) value;
    }

    private final LottieAnimationView getLottieAnimationView() {
        Object value = this.h.getValue();
        value.getClass();
        return (LottieAnimationView) value;
    }

    private final NestedScrollView getNestedScroll() {
        Object value = this.k.getValue();
        value.getClass();
        return (NestedScrollView) value;
    }

    private final DsSeparator getNestedSeparator() {
        Object value = this.j.getValue();
        value.getClass();
        return (DsSeparator) value;
    }

    private final FrameLayout getSuccessBetInfoView() {
        Object value = this.c.getValue();
        value.getClass();
        return (FrameLayout) value;
    }

    private final AppCompatTextView getTvSubTitle() {
        Object value = this.e.getValue();
        value.getClass();
        return (AppCompatTextView) value;
    }

    private final AppCompatTextView getTvTitle() {
        Object value = this.d.getValue();
        value.getClass();
        return (AppCompatTextView) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setSeparatorBigText$lambda$0(kgn0 kgn0Var) {
        kgn0Var.getNestedSeparator().setVisibility(kgn0Var.getNestedScroll().canScrollVertically(1) ? 0 : 8);
    }

    public final boolean b() {
        SuccessBetAlertModel successBetAlertModel = this.b;
        boolean zIsEmpty = successBetAlertModel.f.isEmpty();
        String str = successBetAlertModel.f47264a;
        boolean z = str != null && str.length() == 0;
        String str2 = successBetAlertModel.b;
        return zIsEmpty && z && (str2 != null && str2.length() == 0);
    }

    public final void c() {
        int i = this.f18248a.b == BetDoneIconStyleEnum.LOTTIE ? R.dimen.space_12 : R.dimen.space_24;
        AppCompatTextView tvTitle = getTvTitle();
        ViewGroup.LayoutParams layoutParams = tvTitle.getLayoutParams();
        if (layoutParams == null) {
            hny.u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = getResources().getDimensionPixelSize(i);
        marginLayoutParams.bottomMargin = getResources().getDimensionPixelSize(R.dimen.space_4);
        tvTitle.setLayoutParams(marginLayoutParams);
    }

    public final void d(String str, String str2) {
        getHistoryButton().l(str);
        getContinueButton().l(str2);
    }

    public final DsButton getContinueButton$uikit() {
        return getContinueButton();
    }

    public final DsButton getHistoryButton$uikit() {
        return getHistoryButton();
    }

    public final void setOnShareClick(Function0<Unit> function0) {
        function0.getClass();
        this.l = function0;
    }

    public final void setSubTitle$uikit(String str) {
        AppCompatTextView tvSubTitle = getTvSubTitle();
        if (str == null) {
            str = null;
        }
        if (str != null) {
            tvSubTitle.setText(str);
            getTvSubTitle().setVisibility(0);
        }
    }

    public final void setTitle$uikit(String str) {
        str.getClass();
        AppCompatTextView tvTitle = getTvTitle();
        String strConcat = StringsKt.O(str, "!", false) ? str : null;
        if (strConcat == null) {
            strConcat = str.concat("!");
        }
        tvTitle.setText(strConcat);
    }
}

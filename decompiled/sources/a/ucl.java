package a;

import android.content.Context;
import android.text.TextUtils;
import android.util.TypedValue;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class ucl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f35435a;
    public final boolean b;

    public ucl(ConstraintLayout constraintLayout) {
        this.f35435a = constraintLayout;
        this.b = constraintLayout.getLayoutDirection() == 1;
    }

    public static void a(ql3 ql3Var, Function0 function0, Function0 function1, Function0 function2, Function0 function3) {
        ml3 ml3VarA = ql3Var.a();
        if (ml3VarA != null) {
            if (ml3VarA instanceof ll3) {
                function0.invoke();
                return;
            }
            if (ml3VarA instanceof jl3) {
                function1.invoke();
                return;
            } else if (ml3VarA instanceof kl3) {
                function2.invoke();
                return;
            } else if (ml3VarA instanceof il3) {
                function3.invoke();
                return;
            }
        }
        t9f.b();
    }

    public final void b(org.xplatform.app_update.impl.presentation.update_screen.views.content.download.label.b bVar, ql3 ql3Var) {
        if (ql3Var instanceof ol3) {
            return;
        }
        boolean z = ql3Var instanceof nl3;
        int i = 17;
        ConstraintLayout constraintLayout = this.f35435a;
        if (z) {
            bVar.setTextSize(20.0f);
            bVar.setGravity(17);
            TypedValue typedValue = j5d.f15927a;
            Context context = constraintLayout.getContext();
            context.getClass();
            bVar.setTextColor(j5d.a(context, R.attr.uikitTextPrimary, false));
            bVar.setTextAppearance(constraintLayout.getContext(), R.style.TextStyle_Title_Bold_M_TextPrimary);
            bVar.setTypeface(itf0.a(R.font.roboto_bold, constraintLayout.getContext()));
        } else {
            if (!(ql3Var instanceof pl3)) {
                t9f.b();
                return;
            }
            ml3 ml3Var = ((pl3) ql3Var).b;
            if (ml3Var instanceof kl3) {
                bVar.setTextAppearance(constraintLayout.getContext(), R.style.TextStyle_Title_Medium_S);
                TypedValue typedValue2 = j5d.f15927a;
                Context context2 = constraintLayout.getContext();
                context2.getClass();
                bVar.setTextColor(j5d.a(context2, R.attr.uikitStaticWhite80, false));
                bVar.setTypeface(itf0.a(R.font.roboto_medium, constraintLayout.getContext()));
                bVar.setTextSize(18.0f);
            } else {
                bVar.setTextAppearance(bVar.getContext(), R.style.TextStyle_Text_Regular_StaticWhite);
                bVar.setTypeface(itf0.a(R.font.roboto_regular, constraintLayout.getContext()));
                bVar.setTextSize(14.0f);
            }
            bVar.setEllipsize(TextUtils.TruncateAt.END);
            if (!(ml3Var instanceof jl3)) {
                i = this.b ? 8388613 : 8388611;
            }
            bVar.setGravity(i);
        }
        bVar.setTextDirection(5);
        bVar.setMaxLines(1);
    }

    public final void c(final org.xplatform.app_update.impl.presentation.update_screen.views.content.download.value.b bVar, ql3 ql3Var) {
        if (ql3Var instanceof nl3) {
            final byte b = 5;
            final byte b2 = 6;
            final byte b3 = 7;
            final byte b4 = 8;
            a(ql3Var, new Function0() { // from class: a.tcl
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    byte b5 = b;
                    ucl uclVar = this;
                    org.xplatform.app_update.impl.presentation.update_screen.views.content.download.value.b bVar2 = bVar;
                    switch (b5) {
                        case 0:
                            bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Text_Regular);
                            ConstraintLayout constraintLayout = uclVar.f35435a;
                            bVar2.setTypeface(itf0.a(R.font.roboto_regular, constraintLayout.getContext()));
                            TypedValue typedValue = j5d.f15927a;
                            Context context = constraintLayout.getContext();
                            context.getClass();
                            bVar2.setTextColor(j5d.a(context, R.attr.uikitStaticWhite80, false));
                            bVar2.setTextSize(14.0f);
                            break;
                        case 1:
                            bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Text_Regular_StaticWhite);
                            bVar2.setTypeface(itf0.a(R.font.roboto_regular, uclVar.f35435a.getContext()));
                            bVar2.setTextSize(14.0f);
                            break;
                        case 2:
                            bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Text_Regular_StaticWhite);
                            bVar2.setTypeface(itf0.a(R.font.roboto_regular, uclVar.f35435a.getContext()));
                            bVar2.setTextSize(14.0f);
                            break;
                        case 3:
                            bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Title_Medium_M_StaticWhite);
                            bVar2.setTypeface(itf0.a(R.font.roboto_medium, uclVar.f35435a.getContext()));
                            bVar2.setTextSize(20.0f);
                            break;
                        case 4:
                            bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Text_Regular_StaticWhite);
                            bVar2.setTypeface(itf0.a(R.font.roboto_regular, uclVar.f35435a.getContext()));
                            bVar2.setTextSize(14.0f);
                            break;
                        case 5:
                            bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Text_Regular_Primary);
                            ConstraintLayout constraintLayout2 = uclVar.f35435a;
                            bVar2.setTypeface(itf0.a(R.font.roboto_regular, constraintLayout2.getContext()));
                            TypedValue typedValue2 = j5d.f15927a;
                            Context context2 = constraintLayout2.getContext();
                            context2.getClass();
                            bVar2.setTextColor(j5d.a(context2, R.attr.uikitPrimary, false));
                            bVar2.setTextSize(14.0f);
                            break;
                        case 6:
                            bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Text_Regular_Primary);
                            ConstraintLayout constraintLayout3 = uclVar.f35435a;
                            bVar2.setTypeface(itf0.a(R.font.roboto_regular, constraintLayout3.getContext()));
                            TypedValue typedValue3 = j5d.f15927a;
                            Context context3 = constraintLayout3.getContext();
                            context3.getClass();
                            bVar2.setTextColor(j5d.a(context3, R.attr.uikitTextPrimary, false));
                            bVar2.setDynamicTextColor(true);
                            bVar2.setTextSize(14.0f);
                            break;
                        case 7:
                            bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Title_Medium_M);
                            ConstraintLayout constraintLayout4 = uclVar.f35435a;
                            bVar2.setTypeface(itf0.a(R.font.roboto_medium, constraintLayout4.getContext()));
                            TypedValue typedValue4 = j5d.f15927a;
                            Context context4 = constraintLayout4.getContext();
                            context4.getClass();
                            bVar2.setTextColor(j5d.a(context4, R.attr.uikitPrimary, false));
                            bVar2.setTextSize(20.0f);
                            break;
                        case 8:
                            bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Text_Regular_Primary);
                            ConstraintLayout constraintLayout5 = uclVar.f35435a;
                            bVar2.setTypeface(itf0.a(R.font.roboto_regular, constraintLayout5.getContext()));
                            TypedValue typedValue5 = j5d.f15927a;
                            Context context5 = constraintLayout5.getContext();
                            context5.getClass();
                            bVar2.setTextColor(j5d.a(context5, R.attr.uikitTextPrimary, false));
                            bVar2.setTextSize(14.0f);
                            break;
                        case 9:
                            bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Text_Regular_StaticWhite);
                            bVar2.setTypeface(itf0.a(R.font.roboto_regular, uclVar.f35435a.getContext()));
                            bVar2.setTextSize(14.0f);
                            break;
                        case 10:
                            bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Text_Regular);
                            ConstraintLayout constraintLayout6 = uclVar.f35435a;
                            bVar2.setTypeface(itf0.a(R.font.roboto_regular, constraintLayout6.getContext()));
                            TypedValue typedValue6 = j5d.f15927a;
                            Context context6 = constraintLayout6.getContext();
                            context6.getClass();
                            bVar2.setTextColor(j5d.a(context6, R.attr.uikitStaticWhite, false));
                            bVar2.setTextSize(14.0f);
                            break;
                        default:
                            bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Title_Medium_M_StaticWhite);
                            bVar2.setTypeface(itf0.a(R.font.roboto_medium, uclVar.f35435a.getContext()));
                            bVar2.setTextSize(20.0f);
                            break;
                    }
                    return Unit.f46060a;
                }
            }, new Function0() { // from class: a.tcl
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    byte b5 = b2;
                    ucl uclVar = this;
                    org.xplatform.app_update.impl.presentation.update_screen.views.content.download.value.b bVar2 = bVar;
                    switch (b5) {
                        case 0:
                            bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Text_Regular);
                            ConstraintLayout constraintLayout = uclVar.f35435a;
                            bVar2.setTypeface(itf0.a(R.font.roboto_regular, constraintLayout.getContext()));
                            TypedValue typedValue = j5d.f15927a;
                            Context context = constraintLayout.getContext();
                            context.getClass();
                            bVar2.setTextColor(j5d.a(context, R.attr.uikitStaticWhite80, false));
                            bVar2.setTextSize(14.0f);
                            break;
                        case 1:
                            bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Text_Regular_StaticWhite);
                            bVar2.setTypeface(itf0.a(R.font.roboto_regular, uclVar.f35435a.getContext()));
                            bVar2.setTextSize(14.0f);
                            break;
                        case 2:
                            bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Text_Regular_StaticWhite);
                            bVar2.setTypeface(itf0.a(R.font.roboto_regular, uclVar.f35435a.getContext()));
                            bVar2.setTextSize(14.0f);
                            break;
                        case 3:
                            bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Title_Medium_M_StaticWhite);
                            bVar2.setTypeface(itf0.a(R.font.roboto_medium, uclVar.f35435a.getContext()));
                            bVar2.setTextSize(20.0f);
                            break;
                        case 4:
                            bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Text_Regular_StaticWhite);
                            bVar2.setTypeface(itf0.a(R.font.roboto_regular, uclVar.f35435a.getContext()));
                            bVar2.setTextSize(14.0f);
                            break;
                        case 5:
                            bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Text_Regular_Primary);
                            ConstraintLayout constraintLayout2 = uclVar.f35435a;
                            bVar2.setTypeface(itf0.a(R.font.roboto_regular, constraintLayout2.getContext()));
                            TypedValue typedValue2 = j5d.f15927a;
                            Context context2 = constraintLayout2.getContext();
                            context2.getClass();
                            bVar2.setTextColor(j5d.a(context2, R.attr.uikitPrimary, false));
                            bVar2.setTextSize(14.0f);
                            break;
                        case 6:
                            bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Text_Regular_Primary);
                            ConstraintLayout constraintLayout3 = uclVar.f35435a;
                            bVar2.setTypeface(itf0.a(R.font.roboto_regular, constraintLayout3.getContext()));
                            TypedValue typedValue3 = j5d.f15927a;
                            Context context3 = constraintLayout3.getContext();
                            context3.getClass();
                            bVar2.setTextColor(j5d.a(context3, R.attr.uikitTextPrimary, false));
                            bVar2.setDynamicTextColor(true);
                            bVar2.setTextSize(14.0f);
                            break;
                        case 7:
                            bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Title_Medium_M);
                            ConstraintLayout constraintLayout4 = uclVar.f35435a;
                            bVar2.setTypeface(itf0.a(R.font.roboto_medium, constraintLayout4.getContext()));
                            TypedValue typedValue4 = j5d.f15927a;
                            Context context4 = constraintLayout4.getContext();
                            context4.getClass();
                            bVar2.setTextColor(j5d.a(context4, R.attr.uikitPrimary, false));
                            bVar2.setTextSize(20.0f);
                            break;
                        case 8:
                            bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Text_Regular_Primary);
                            ConstraintLayout constraintLayout5 = uclVar.f35435a;
                            bVar2.setTypeface(itf0.a(R.font.roboto_regular, constraintLayout5.getContext()));
                            TypedValue typedValue5 = j5d.f15927a;
                            Context context5 = constraintLayout5.getContext();
                            context5.getClass();
                            bVar2.setTextColor(j5d.a(context5, R.attr.uikitTextPrimary, false));
                            bVar2.setTextSize(14.0f);
                            break;
                        case 9:
                            bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Text_Regular_StaticWhite);
                            bVar2.setTypeface(itf0.a(R.font.roboto_regular, uclVar.f35435a.getContext()));
                            bVar2.setTextSize(14.0f);
                            break;
                        case 10:
                            bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Text_Regular);
                            ConstraintLayout constraintLayout6 = uclVar.f35435a;
                            bVar2.setTypeface(itf0.a(R.font.roboto_regular, constraintLayout6.getContext()));
                            TypedValue typedValue6 = j5d.f15927a;
                            Context context6 = constraintLayout6.getContext();
                            context6.getClass();
                            bVar2.setTextColor(j5d.a(context6, R.attr.uikitStaticWhite, false));
                            bVar2.setTextSize(14.0f);
                            break;
                        default:
                            bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Title_Medium_M_StaticWhite);
                            bVar2.setTypeface(itf0.a(R.font.roboto_medium, uclVar.f35435a.getContext()));
                            bVar2.setTextSize(20.0f);
                            break;
                    }
                    return Unit.f46060a;
                }
            }, new Function0() { // from class: a.tcl
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    byte b5 = b3;
                    ucl uclVar = this;
                    org.xplatform.app_update.impl.presentation.update_screen.views.content.download.value.b bVar2 = bVar;
                    switch (b5) {
                        case 0:
                            bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Text_Regular);
                            ConstraintLayout constraintLayout = uclVar.f35435a;
                            bVar2.setTypeface(itf0.a(R.font.roboto_regular, constraintLayout.getContext()));
                            TypedValue typedValue = j5d.f15927a;
                            Context context = constraintLayout.getContext();
                            context.getClass();
                            bVar2.setTextColor(j5d.a(context, R.attr.uikitStaticWhite80, false));
                            bVar2.setTextSize(14.0f);
                            break;
                        case 1:
                            bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Text_Regular_StaticWhite);
                            bVar2.setTypeface(itf0.a(R.font.roboto_regular, uclVar.f35435a.getContext()));
                            bVar2.setTextSize(14.0f);
                            break;
                        case 2:
                            bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Text_Regular_StaticWhite);
                            bVar2.setTypeface(itf0.a(R.font.roboto_regular, uclVar.f35435a.getContext()));
                            bVar2.setTextSize(14.0f);
                            break;
                        case 3:
                            bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Title_Medium_M_StaticWhite);
                            bVar2.setTypeface(itf0.a(R.font.roboto_medium, uclVar.f35435a.getContext()));
                            bVar2.setTextSize(20.0f);
                            break;
                        case 4:
                            bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Text_Regular_StaticWhite);
                            bVar2.setTypeface(itf0.a(R.font.roboto_regular, uclVar.f35435a.getContext()));
                            bVar2.setTextSize(14.0f);
                            break;
                        case 5:
                            bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Text_Regular_Primary);
                            ConstraintLayout constraintLayout2 = uclVar.f35435a;
                            bVar2.setTypeface(itf0.a(R.font.roboto_regular, constraintLayout2.getContext()));
                            TypedValue typedValue2 = j5d.f15927a;
                            Context context2 = constraintLayout2.getContext();
                            context2.getClass();
                            bVar2.setTextColor(j5d.a(context2, R.attr.uikitPrimary, false));
                            bVar2.setTextSize(14.0f);
                            break;
                        case 6:
                            bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Text_Regular_Primary);
                            ConstraintLayout constraintLayout3 = uclVar.f35435a;
                            bVar2.setTypeface(itf0.a(R.font.roboto_regular, constraintLayout3.getContext()));
                            TypedValue typedValue3 = j5d.f15927a;
                            Context context3 = constraintLayout3.getContext();
                            context3.getClass();
                            bVar2.setTextColor(j5d.a(context3, R.attr.uikitTextPrimary, false));
                            bVar2.setDynamicTextColor(true);
                            bVar2.setTextSize(14.0f);
                            break;
                        case 7:
                            bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Title_Medium_M);
                            ConstraintLayout constraintLayout4 = uclVar.f35435a;
                            bVar2.setTypeface(itf0.a(R.font.roboto_medium, constraintLayout4.getContext()));
                            TypedValue typedValue4 = j5d.f15927a;
                            Context context4 = constraintLayout4.getContext();
                            context4.getClass();
                            bVar2.setTextColor(j5d.a(context4, R.attr.uikitPrimary, false));
                            bVar2.setTextSize(20.0f);
                            break;
                        case 8:
                            bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Text_Regular_Primary);
                            ConstraintLayout constraintLayout5 = uclVar.f35435a;
                            bVar2.setTypeface(itf0.a(R.font.roboto_regular, constraintLayout5.getContext()));
                            TypedValue typedValue5 = j5d.f15927a;
                            Context context5 = constraintLayout5.getContext();
                            context5.getClass();
                            bVar2.setTextColor(j5d.a(context5, R.attr.uikitTextPrimary, false));
                            bVar2.setTextSize(14.0f);
                            break;
                        case 9:
                            bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Text_Regular_StaticWhite);
                            bVar2.setTypeface(itf0.a(R.font.roboto_regular, uclVar.f35435a.getContext()));
                            bVar2.setTextSize(14.0f);
                            break;
                        case 10:
                            bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Text_Regular);
                            ConstraintLayout constraintLayout6 = uclVar.f35435a;
                            bVar2.setTypeface(itf0.a(R.font.roboto_regular, constraintLayout6.getContext()));
                            TypedValue typedValue6 = j5d.f15927a;
                            Context context6 = constraintLayout6.getContext();
                            context6.getClass();
                            bVar2.setTextColor(j5d.a(context6, R.attr.uikitStaticWhite, false));
                            bVar2.setTextSize(14.0f);
                            break;
                        default:
                            bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Title_Medium_M_StaticWhite);
                            bVar2.setTypeface(itf0.a(R.font.roboto_medium, uclVar.f35435a.getContext()));
                            bVar2.setTextSize(20.0f);
                            break;
                    }
                    return Unit.f46060a;
                }
            }, new Function0() { // from class: a.tcl
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    byte b5 = b4;
                    ucl uclVar = this;
                    org.xplatform.app_update.impl.presentation.update_screen.views.content.download.value.b bVar2 = bVar;
                    switch (b5) {
                        case 0:
                            bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Text_Regular);
                            ConstraintLayout constraintLayout = uclVar.f35435a;
                            bVar2.setTypeface(itf0.a(R.font.roboto_regular, constraintLayout.getContext()));
                            TypedValue typedValue = j5d.f15927a;
                            Context context = constraintLayout.getContext();
                            context.getClass();
                            bVar2.setTextColor(j5d.a(context, R.attr.uikitStaticWhite80, false));
                            bVar2.setTextSize(14.0f);
                            break;
                        case 1:
                            bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Text_Regular_StaticWhite);
                            bVar2.setTypeface(itf0.a(R.font.roboto_regular, uclVar.f35435a.getContext()));
                            bVar2.setTextSize(14.0f);
                            break;
                        case 2:
                            bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Text_Regular_StaticWhite);
                            bVar2.setTypeface(itf0.a(R.font.roboto_regular, uclVar.f35435a.getContext()));
                            bVar2.setTextSize(14.0f);
                            break;
                        case 3:
                            bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Title_Medium_M_StaticWhite);
                            bVar2.setTypeface(itf0.a(R.font.roboto_medium, uclVar.f35435a.getContext()));
                            bVar2.setTextSize(20.0f);
                            break;
                        case 4:
                            bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Text_Regular_StaticWhite);
                            bVar2.setTypeface(itf0.a(R.font.roboto_regular, uclVar.f35435a.getContext()));
                            bVar2.setTextSize(14.0f);
                            break;
                        case 5:
                            bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Text_Regular_Primary);
                            ConstraintLayout constraintLayout2 = uclVar.f35435a;
                            bVar2.setTypeface(itf0.a(R.font.roboto_regular, constraintLayout2.getContext()));
                            TypedValue typedValue2 = j5d.f15927a;
                            Context context2 = constraintLayout2.getContext();
                            context2.getClass();
                            bVar2.setTextColor(j5d.a(context2, R.attr.uikitPrimary, false));
                            bVar2.setTextSize(14.0f);
                            break;
                        case 6:
                            bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Text_Regular_Primary);
                            ConstraintLayout constraintLayout3 = uclVar.f35435a;
                            bVar2.setTypeface(itf0.a(R.font.roboto_regular, constraintLayout3.getContext()));
                            TypedValue typedValue3 = j5d.f15927a;
                            Context context3 = constraintLayout3.getContext();
                            context3.getClass();
                            bVar2.setTextColor(j5d.a(context3, R.attr.uikitTextPrimary, false));
                            bVar2.setDynamicTextColor(true);
                            bVar2.setTextSize(14.0f);
                            break;
                        case 7:
                            bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Title_Medium_M);
                            ConstraintLayout constraintLayout4 = uclVar.f35435a;
                            bVar2.setTypeface(itf0.a(R.font.roboto_medium, constraintLayout4.getContext()));
                            TypedValue typedValue4 = j5d.f15927a;
                            Context context4 = constraintLayout4.getContext();
                            context4.getClass();
                            bVar2.setTextColor(j5d.a(context4, R.attr.uikitPrimary, false));
                            bVar2.setTextSize(20.0f);
                            break;
                        case 8:
                            bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Text_Regular_Primary);
                            ConstraintLayout constraintLayout5 = uclVar.f35435a;
                            bVar2.setTypeface(itf0.a(R.font.roboto_regular, constraintLayout5.getContext()));
                            TypedValue typedValue5 = j5d.f15927a;
                            Context context5 = constraintLayout5.getContext();
                            context5.getClass();
                            bVar2.setTextColor(j5d.a(context5, R.attr.uikitTextPrimary, false));
                            bVar2.setTextSize(14.0f);
                            break;
                        case 9:
                            bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Text_Regular_StaticWhite);
                            bVar2.setTypeface(itf0.a(R.font.roboto_regular, uclVar.f35435a.getContext()));
                            bVar2.setTextSize(14.0f);
                            break;
                        case 10:
                            bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Text_Regular);
                            ConstraintLayout constraintLayout6 = uclVar.f35435a;
                            bVar2.setTypeface(itf0.a(R.font.roboto_regular, constraintLayout6.getContext()));
                            TypedValue typedValue6 = j5d.f15927a;
                            Context context6 = constraintLayout6.getContext();
                            context6.getClass();
                            bVar2.setTextColor(j5d.a(context6, R.attr.uikitStaticWhite, false));
                            bVar2.setTextSize(14.0f);
                            break;
                        default:
                            bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Title_Medium_M_StaticWhite);
                            bVar2.setTypeface(itf0.a(R.font.roboto_medium, uclVar.f35435a.getContext()));
                            bVar2.setTextSize(20.0f);
                            break;
                    }
                    return Unit.f46060a;
                }
            });
            bVar.setGravity(17);
            return;
        }
        if (ql3Var instanceof ol3) {
            final byte b5 = 9;
            final byte b6 = 10;
            final byte b7 = 11;
            final byte b8 = 1;
            a(ql3Var, new Function0() { // from class: a.tcl
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    byte b9 = b5;
                    ucl uclVar = this;
                    org.xplatform.app_update.impl.presentation.update_screen.views.content.download.value.b bVar2 = bVar;
                    switch (b9) {
                        case 0:
                            bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Text_Regular);
                            ConstraintLayout constraintLayout = uclVar.f35435a;
                            bVar2.setTypeface(itf0.a(R.font.roboto_regular, constraintLayout.getContext()));
                            TypedValue typedValue = j5d.f15927a;
                            Context context = constraintLayout.getContext();
                            context.getClass();
                            bVar2.setTextColor(j5d.a(context, R.attr.uikitStaticWhite80, false));
                            bVar2.setTextSize(14.0f);
                            break;
                        case 1:
                            bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Text_Regular_StaticWhite);
                            bVar2.setTypeface(itf0.a(R.font.roboto_regular, uclVar.f35435a.getContext()));
                            bVar2.setTextSize(14.0f);
                            break;
                        case 2:
                            bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Text_Regular_StaticWhite);
                            bVar2.setTypeface(itf0.a(R.font.roboto_regular, uclVar.f35435a.getContext()));
                            bVar2.setTextSize(14.0f);
                            break;
                        case 3:
                            bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Title_Medium_M_StaticWhite);
                            bVar2.setTypeface(itf0.a(R.font.roboto_medium, uclVar.f35435a.getContext()));
                            bVar2.setTextSize(20.0f);
                            break;
                        case 4:
                            bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Text_Regular_StaticWhite);
                            bVar2.setTypeface(itf0.a(R.font.roboto_regular, uclVar.f35435a.getContext()));
                            bVar2.setTextSize(14.0f);
                            break;
                        case 5:
                            bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Text_Regular_Primary);
                            ConstraintLayout constraintLayout2 = uclVar.f35435a;
                            bVar2.setTypeface(itf0.a(R.font.roboto_regular, constraintLayout2.getContext()));
                            TypedValue typedValue2 = j5d.f15927a;
                            Context context2 = constraintLayout2.getContext();
                            context2.getClass();
                            bVar2.setTextColor(j5d.a(context2, R.attr.uikitPrimary, false));
                            bVar2.setTextSize(14.0f);
                            break;
                        case 6:
                            bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Text_Regular_Primary);
                            ConstraintLayout constraintLayout3 = uclVar.f35435a;
                            bVar2.setTypeface(itf0.a(R.font.roboto_regular, constraintLayout3.getContext()));
                            TypedValue typedValue3 = j5d.f15927a;
                            Context context3 = constraintLayout3.getContext();
                            context3.getClass();
                            bVar2.setTextColor(j5d.a(context3, R.attr.uikitTextPrimary, false));
                            bVar2.setDynamicTextColor(true);
                            bVar2.setTextSize(14.0f);
                            break;
                        case 7:
                            bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Title_Medium_M);
                            ConstraintLayout constraintLayout4 = uclVar.f35435a;
                            bVar2.setTypeface(itf0.a(R.font.roboto_medium, constraintLayout4.getContext()));
                            TypedValue typedValue4 = j5d.f15927a;
                            Context context4 = constraintLayout4.getContext();
                            context4.getClass();
                            bVar2.setTextColor(j5d.a(context4, R.attr.uikitPrimary, false));
                            bVar2.setTextSize(20.0f);
                            break;
                        case 8:
                            bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Text_Regular_Primary);
                            ConstraintLayout constraintLayout5 = uclVar.f35435a;
                            bVar2.setTypeface(itf0.a(R.font.roboto_regular, constraintLayout5.getContext()));
                            TypedValue typedValue5 = j5d.f15927a;
                            Context context5 = constraintLayout5.getContext();
                            context5.getClass();
                            bVar2.setTextColor(j5d.a(context5, R.attr.uikitTextPrimary, false));
                            bVar2.setTextSize(14.0f);
                            break;
                        case 9:
                            bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Text_Regular_StaticWhite);
                            bVar2.setTypeface(itf0.a(R.font.roboto_regular, uclVar.f35435a.getContext()));
                            bVar2.setTextSize(14.0f);
                            break;
                        case 10:
                            bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Text_Regular);
                            ConstraintLayout constraintLayout6 = uclVar.f35435a;
                            bVar2.setTypeface(itf0.a(R.font.roboto_regular, constraintLayout6.getContext()));
                            TypedValue typedValue6 = j5d.f15927a;
                            Context context6 = constraintLayout6.getContext();
                            context6.getClass();
                            bVar2.setTextColor(j5d.a(context6, R.attr.uikitStaticWhite, false));
                            bVar2.setTextSize(14.0f);
                            break;
                        default:
                            bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Title_Medium_M_StaticWhite);
                            bVar2.setTypeface(itf0.a(R.font.roboto_medium, uclVar.f35435a.getContext()));
                            bVar2.setTextSize(20.0f);
                            break;
                    }
                    return Unit.f46060a;
                }
            }, new Function0() { // from class: a.tcl
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    byte b9 = b6;
                    ucl uclVar = this;
                    org.xplatform.app_update.impl.presentation.update_screen.views.content.download.value.b bVar2 = bVar;
                    switch (b9) {
                        case 0:
                            bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Text_Regular);
                            ConstraintLayout constraintLayout = uclVar.f35435a;
                            bVar2.setTypeface(itf0.a(R.font.roboto_regular, constraintLayout.getContext()));
                            TypedValue typedValue = j5d.f15927a;
                            Context context = constraintLayout.getContext();
                            context.getClass();
                            bVar2.setTextColor(j5d.a(context, R.attr.uikitStaticWhite80, false));
                            bVar2.setTextSize(14.0f);
                            break;
                        case 1:
                            bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Text_Regular_StaticWhite);
                            bVar2.setTypeface(itf0.a(R.font.roboto_regular, uclVar.f35435a.getContext()));
                            bVar2.setTextSize(14.0f);
                            break;
                        case 2:
                            bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Text_Regular_StaticWhite);
                            bVar2.setTypeface(itf0.a(R.font.roboto_regular, uclVar.f35435a.getContext()));
                            bVar2.setTextSize(14.0f);
                            break;
                        case 3:
                            bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Title_Medium_M_StaticWhite);
                            bVar2.setTypeface(itf0.a(R.font.roboto_medium, uclVar.f35435a.getContext()));
                            bVar2.setTextSize(20.0f);
                            break;
                        case 4:
                            bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Text_Regular_StaticWhite);
                            bVar2.setTypeface(itf0.a(R.font.roboto_regular, uclVar.f35435a.getContext()));
                            bVar2.setTextSize(14.0f);
                            break;
                        case 5:
                            bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Text_Regular_Primary);
                            ConstraintLayout constraintLayout2 = uclVar.f35435a;
                            bVar2.setTypeface(itf0.a(R.font.roboto_regular, constraintLayout2.getContext()));
                            TypedValue typedValue2 = j5d.f15927a;
                            Context context2 = constraintLayout2.getContext();
                            context2.getClass();
                            bVar2.setTextColor(j5d.a(context2, R.attr.uikitPrimary, false));
                            bVar2.setTextSize(14.0f);
                            break;
                        case 6:
                            bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Text_Regular_Primary);
                            ConstraintLayout constraintLayout3 = uclVar.f35435a;
                            bVar2.setTypeface(itf0.a(R.font.roboto_regular, constraintLayout3.getContext()));
                            TypedValue typedValue3 = j5d.f15927a;
                            Context context3 = constraintLayout3.getContext();
                            context3.getClass();
                            bVar2.setTextColor(j5d.a(context3, R.attr.uikitTextPrimary, false));
                            bVar2.setDynamicTextColor(true);
                            bVar2.setTextSize(14.0f);
                            break;
                        case 7:
                            bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Title_Medium_M);
                            ConstraintLayout constraintLayout4 = uclVar.f35435a;
                            bVar2.setTypeface(itf0.a(R.font.roboto_medium, constraintLayout4.getContext()));
                            TypedValue typedValue4 = j5d.f15927a;
                            Context context4 = constraintLayout4.getContext();
                            context4.getClass();
                            bVar2.setTextColor(j5d.a(context4, R.attr.uikitPrimary, false));
                            bVar2.setTextSize(20.0f);
                            break;
                        case 8:
                            bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Text_Regular_Primary);
                            ConstraintLayout constraintLayout5 = uclVar.f35435a;
                            bVar2.setTypeface(itf0.a(R.font.roboto_regular, constraintLayout5.getContext()));
                            TypedValue typedValue5 = j5d.f15927a;
                            Context context5 = constraintLayout5.getContext();
                            context5.getClass();
                            bVar2.setTextColor(j5d.a(context5, R.attr.uikitTextPrimary, false));
                            bVar2.setTextSize(14.0f);
                            break;
                        case 9:
                            bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Text_Regular_StaticWhite);
                            bVar2.setTypeface(itf0.a(R.font.roboto_regular, uclVar.f35435a.getContext()));
                            bVar2.setTextSize(14.0f);
                            break;
                        case 10:
                            bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Text_Regular);
                            ConstraintLayout constraintLayout6 = uclVar.f35435a;
                            bVar2.setTypeface(itf0.a(R.font.roboto_regular, constraintLayout6.getContext()));
                            TypedValue typedValue6 = j5d.f15927a;
                            Context context6 = constraintLayout6.getContext();
                            context6.getClass();
                            bVar2.setTextColor(j5d.a(context6, R.attr.uikitStaticWhite, false));
                            bVar2.setTextSize(14.0f);
                            break;
                        default:
                            bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Title_Medium_M_StaticWhite);
                            bVar2.setTypeface(itf0.a(R.font.roboto_medium, uclVar.f35435a.getContext()));
                            bVar2.setTextSize(20.0f);
                            break;
                    }
                    return Unit.f46060a;
                }
            }, new Function0() { // from class: a.tcl
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    byte b9 = b7;
                    ucl uclVar = this;
                    org.xplatform.app_update.impl.presentation.update_screen.views.content.download.value.b bVar2 = bVar;
                    switch (b9) {
                        case 0:
                            bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Text_Regular);
                            ConstraintLayout constraintLayout = uclVar.f35435a;
                            bVar2.setTypeface(itf0.a(R.font.roboto_regular, constraintLayout.getContext()));
                            TypedValue typedValue = j5d.f15927a;
                            Context context = constraintLayout.getContext();
                            context.getClass();
                            bVar2.setTextColor(j5d.a(context, R.attr.uikitStaticWhite80, false));
                            bVar2.setTextSize(14.0f);
                            break;
                        case 1:
                            bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Text_Regular_StaticWhite);
                            bVar2.setTypeface(itf0.a(R.font.roboto_regular, uclVar.f35435a.getContext()));
                            bVar2.setTextSize(14.0f);
                            break;
                        case 2:
                            bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Text_Regular_StaticWhite);
                            bVar2.setTypeface(itf0.a(R.font.roboto_regular, uclVar.f35435a.getContext()));
                            bVar2.setTextSize(14.0f);
                            break;
                        case 3:
                            bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Title_Medium_M_StaticWhite);
                            bVar2.setTypeface(itf0.a(R.font.roboto_medium, uclVar.f35435a.getContext()));
                            bVar2.setTextSize(20.0f);
                            break;
                        case 4:
                            bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Text_Regular_StaticWhite);
                            bVar2.setTypeface(itf0.a(R.font.roboto_regular, uclVar.f35435a.getContext()));
                            bVar2.setTextSize(14.0f);
                            break;
                        case 5:
                            bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Text_Regular_Primary);
                            ConstraintLayout constraintLayout2 = uclVar.f35435a;
                            bVar2.setTypeface(itf0.a(R.font.roboto_regular, constraintLayout2.getContext()));
                            TypedValue typedValue2 = j5d.f15927a;
                            Context context2 = constraintLayout2.getContext();
                            context2.getClass();
                            bVar2.setTextColor(j5d.a(context2, R.attr.uikitPrimary, false));
                            bVar2.setTextSize(14.0f);
                            break;
                        case 6:
                            bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Text_Regular_Primary);
                            ConstraintLayout constraintLayout3 = uclVar.f35435a;
                            bVar2.setTypeface(itf0.a(R.font.roboto_regular, constraintLayout3.getContext()));
                            TypedValue typedValue3 = j5d.f15927a;
                            Context context3 = constraintLayout3.getContext();
                            context3.getClass();
                            bVar2.setTextColor(j5d.a(context3, R.attr.uikitTextPrimary, false));
                            bVar2.setDynamicTextColor(true);
                            bVar2.setTextSize(14.0f);
                            break;
                        case 7:
                            bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Title_Medium_M);
                            ConstraintLayout constraintLayout4 = uclVar.f35435a;
                            bVar2.setTypeface(itf0.a(R.font.roboto_medium, constraintLayout4.getContext()));
                            TypedValue typedValue4 = j5d.f15927a;
                            Context context4 = constraintLayout4.getContext();
                            context4.getClass();
                            bVar2.setTextColor(j5d.a(context4, R.attr.uikitPrimary, false));
                            bVar2.setTextSize(20.0f);
                            break;
                        case 8:
                            bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Text_Regular_Primary);
                            ConstraintLayout constraintLayout5 = uclVar.f35435a;
                            bVar2.setTypeface(itf0.a(R.font.roboto_regular, constraintLayout5.getContext()));
                            TypedValue typedValue5 = j5d.f15927a;
                            Context context5 = constraintLayout5.getContext();
                            context5.getClass();
                            bVar2.setTextColor(j5d.a(context5, R.attr.uikitTextPrimary, false));
                            bVar2.setTextSize(14.0f);
                            break;
                        case 9:
                            bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Text_Regular_StaticWhite);
                            bVar2.setTypeface(itf0.a(R.font.roboto_regular, uclVar.f35435a.getContext()));
                            bVar2.setTextSize(14.0f);
                            break;
                        case 10:
                            bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Text_Regular);
                            ConstraintLayout constraintLayout6 = uclVar.f35435a;
                            bVar2.setTypeface(itf0.a(R.font.roboto_regular, constraintLayout6.getContext()));
                            TypedValue typedValue6 = j5d.f15927a;
                            Context context6 = constraintLayout6.getContext();
                            context6.getClass();
                            bVar2.setTextColor(j5d.a(context6, R.attr.uikitStaticWhite, false));
                            bVar2.setTextSize(14.0f);
                            break;
                        default:
                            bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Title_Medium_M_StaticWhite);
                            bVar2.setTypeface(itf0.a(R.font.roboto_medium, uclVar.f35435a.getContext()));
                            bVar2.setTextSize(20.0f);
                            break;
                    }
                    return Unit.f46060a;
                }
            }, new Function0() { // from class: a.tcl
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    byte b9 = b8;
                    ucl uclVar = this;
                    org.xplatform.app_update.impl.presentation.update_screen.views.content.download.value.b bVar2 = bVar;
                    switch (b9) {
                        case 0:
                            bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Text_Regular);
                            ConstraintLayout constraintLayout = uclVar.f35435a;
                            bVar2.setTypeface(itf0.a(R.font.roboto_regular, constraintLayout.getContext()));
                            TypedValue typedValue = j5d.f15927a;
                            Context context = constraintLayout.getContext();
                            context.getClass();
                            bVar2.setTextColor(j5d.a(context, R.attr.uikitStaticWhite80, false));
                            bVar2.setTextSize(14.0f);
                            break;
                        case 1:
                            bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Text_Regular_StaticWhite);
                            bVar2.setTypeface(itf0.a(R.font.roboto_regular, uclVar.f35435a.getContext()));
                            bVar2.setTextSize(14.0f);
                            break;
                        case 2:
                            bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Text_Regular_StaticWhite);
                            bVar2.setTypeface(itf0.a(R.font.roboto_regular, uclVar.f35435a.getContext()));
                            bVar2.setTextSize(14.0f);
                            break;
                        case 3:
                            bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Title_Medium_M_StaticWhite);
                            bVar2.setTypeface(itf0.a(R.font.roboto_medium, uclVar.f35435a.getContext()));
                            bVar2.setTextSize(20.0f);
                            break;
                        case 4:
                            bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Text_Regular_StaticWhite);
                            bVar2.setTypeface(itf0.a(R.font.roboto_regular, uclVar.f35435a.getContext()));
                            bVar2.setTextSize(14.0f);
                            break;
                        case 5:
                            bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Text_Regular_Primary);
                            ConstraintLayout constraintLayout2 = uclVar.f35435a;
                            bVar2.setTypeface(itf0.a(R.font.roboto_regular, constraintLayout2.getContext()));
                            TypedValue typedValue2 = j5d.f15927a;
                            Context context2 = constraintLayout2.getContext();
                            context2.getClass();
                            bVar2.setTextColor(j5d.a(context2, R.attr.uikitPrimary, false));
                            bVar2.setTextSize(14.0f);
                            break;
                        case 6:
                            bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Text_Regular_Primary);
                            ConstraintLayout constraintLayout3 = uclVar.f35435a;
                            bVar2.setTypeface(itf0.a(R.font.roboto_regular, constraintLayout3.getContext()));
                            TypedValue typedValue3 = j5d.f15927a;
                            Context context3 = constraintLayout3.getContext();
                            context3.getClass();
                            bVar2.setTextColor(j5d.a(context3, R.attr.uikitTextPrimary, false));
                            bVar2.setDynamicTextColor(true);
                            bVar2.setTextSize(14.0f);
                            break;
                        case 7:
                            bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Title_Medium_M);
                            ConstraintLayout constraintLayout4 = uclVar.f35435a;
                            bVar2.setTypeface(itf0.a(R.font.roboto_medium, constraintLayout4.getContext()));
                            TypedValue typedValue4 = j5d.f15927a;
                            Context context4 = constraintLayout4.getContext();
                            context4.getClass();
                            bVar2.setTextColor(j5d.a(context4, R.attr.uikitPrimary, false));
                            bVar2.setTextSize(20.0f);
                            break;
                        case 8:
                            bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Text_Regular_Primary);
                            ConstraintLayout constraintLayout5 = uclVar.f35435a;
                            bVar2.setTypeface(itf0.a(R.font.roboto_regular, constraintLayout5.getContext()));
                            TypedValue typedValue5 = j5d.f15927a;
                            Context context5 = constraintLayout5.getContext();
                            context5.getClass();
                            bVar2.setTextColor(j5d.a(context5, R.attr.uikitTextPrimary, false));
                            bVar2.setTextSize(14.0f);
                            break;
                        case 9:
                            bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Text_Regular_StaticWhite);
                            bVar2.setTypeface(itf0.a(R.font.roboto_regular, uclVar.f35435a.getContext()));
                            bVar2.setTextSize(14.0f);
                            break;
                        case 10:
                            bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Text_Regular);
                            ConstraintLayout constraintLayout6 = uclVar.f35435a;
                            bVar2.setTypeface(itf0.a(R.font.roboto_regular, constraintLayout6.getContext()));
                            TypedValue typedValue6 = j5d.f15927a;
                            Context context6 = constraintLayout6.getContext();
                            context6.getClass();
                            bVar2.setTextColor(j5d.a(context6, R.attr.uikitStaticWhite, false));
                            bVar2.setTextSize(14.0f);
                            break;
                        default:
                            bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Title_Medium_M_StaticWhite);
                            bVar2.setTypeface(itf0.a(R.font.roboto_medium, uclVar.f35435a.getContext()));
                            bVar2.setTextSize(20.0f);
                            break;
                    }
                    return Unit.f46060a;
                }
            });
            return;
        }
        if (!(ql3Var instanceof pl3)) {
            t9f.b();
            return;
        }
        final byte b9 = 2;
        final byte b10 = 0;
        final byte b11 = 3;
        final byte b12 = 4;
        a(ql3Var, new Function0() { // from class: a.tcl
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b13 = b9;
                ucl uclVar = this;
                org.xplatform.app_update.impl.presentation.update_screen.views.content.download.value.b bVar2 = bVar;
                switch (b13) {
                    case 0:
                        bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Text_Regular);
                        ConstraintLayout constraintLayout = uclVar.f35435a;
                        bVar2.setTypeface(itf0.a(R.font.roboto_regular, constraintLayout.getContext()));
                        TypedValue typedValue = j5d.f15927a;
                        Context context = constraintLayout.getContext();
                        context.getClass();
                        bVar2.setTextColor(j5d.a(context, R.attr.uikitStaticWhite80, false));
                        bVar2.setTextSize(14.0f);
                        break;
                    case 1:
                        bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Text_Regular_StaticWhite);
                        bVar2.setTypeface(itf0.a(R.font.roboto_regular, uclVar.f35435a.getContext()));
                        bVar2.setTextSize(14.0f);
                        break;
                    case 2:
                        bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Text_Regular_StaticWhite);
                        bVar2.setTypeface(itf0.a(R.font.roboto_regular, uclVar.f35435a.getContext()));
                        bVar2.setTextSize(14.0f);
                        break;
                    case 3:
                        bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Title_Medium_M_StaticWhite);
                        bVar2.setTypeface(itf0.a(R.font.roboto_medium, uclVar.f35435a.getContext()));
                        bVar2.setTextSize(20.0f);
                        break;
                    case 4:
                        bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Text_Regular_StaticWhite);
                        bVar2.setTypeface(itf0.a(R.font.roboto_regular, uclVar.f35435a.getContext()));
                        bVar2.setTextSize(14.0f);
                        break;
                    case 5:
                        bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Text_Regular_Primary);
                        ConstraintLayout constraintLayout2 = uclVar.f35435a;
                        bVar2.setTypeface(itf0.a(R.font.roboto_regular, constraintLayout2.getContext()));
                        TypedValue typedValue2 = j5d.f15927a;
                        Context context2 = constraintLayout2.getContext();
                        context2.getClass();
                        bVar2.setTextColor(j5d.a(context2, R.attr.uikitPrimary, false));
                        bVar2.setTextSize(14.0f);
                        break;
                    case 6:
                        bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Text_Regular_Primary);
                        ConstraintLayout constraintLayout3 = uclVar.f35435a;
                        bVar2.setTypeface(itf0.a(R.font.roboto_regular, constraintLayout3.getContext()));
                        TypedValue typedValue3 = j5d.f15927a;
                        Context context3 = constraintLayout3.getContext();
                        context3.getClass();
                        bVar2.setTextColor(j5d.a(context3, R.attr.uikitTextPrimary, false));
                        bVar2.setDynamicTextColor(true);
                        bVar2.setTextSize(14.0f);
                        break;
                    case 7:
                        bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Title_Medium_M);
                        ConstraintLayout constraintLayout4 = uclVar.f35435a;
                        bVar2.setTypeface(itf0.a(R.font.roboto_medium, constraintLayout4.getContext()));
                        TypedValue typedValue4 = j5d.f15927a;
                        Context context4 = constraintLayout4.getContext();
                        context4.getClass();
                        bVar2.setTextColor(j5d.a(context4, R.attr.uikitPrimary, false));
                        bVar2.setTextSize(20.0f);
                        break;
                    case 8:
                        bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Text_Regular_Primary);
                        ConstraintLayout constraintLayout5 = uclVar.f35435a;
                        bVar2.setTypeface(itf0.a(R.font.roboto_regular, constraintLayout5.getContext()));
                        TypedValue typedValue5 = j5d.f15927a;
                        Context context5 = constraintLayout5.getContext();
                        context5.getClass();
                        bVar2.setTextColor(j5d.a(context5, R.attr.uikitTextPrimary, false));
                        bVar2.setTextSize(14.0f);
                        break;
                    case 9:
                        bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Text_Regular_StaticWhite);
                        bVar2.setTypeface(itf0.a(R.font.roboto_regular, uclVar.f35435a.getContext()));
                        bVar2.setTextSize(14.0f);
                        break;
                    case 10:
                        bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Text_Regular);
                        ConstraintLayout constraintLayout6 = uclVar.f35435a;
                        bVar2.setTypeface(itf0.a(R.font.roboto_regular, constraintLayout6.getContext()));
                        TypedValue typedValue6 = j5d.f15927a;
                        Context context6 = constraintLayout6.getContext();
                        context6.getClass();
                        bVar2.setTextColor(j5d.a(context6, R.attr.uikitStaticWhite, false));
                        bVar2.setTextSize(14.0f);
                        break;
                    default:
                        bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Title_Medium_M_StaticWhite);
                        bVar2.setTypeface(itf0.a(R.font.roboto_medium, uclVar.f35435a.getContext()));
                        bVar2.setTextSize(20.0f);
                        break;
                }
                return Unit.f46060a;
            }
        }, new Function0() { // from class: a.tcl
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b13 = b10;
                ucl uclVar = this;
                org.xplatform.app_update.impl.presentation.update_screen.views.content.download.value.b bVar2 = bVar;
                switch (b13) {
                    case 0:
                        bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Text_Regular);
                        ConstraintLayout constraintLayout = uclVar.f35435a;
                        bVar2.setTypeface(itf0.a(R.font.roboto_regular, constraintLayout.getContext()));
                        TypedValue typedValue = j5d.f15927a;
                        Context context = constraintLayout.getContext();
                        context.getClass();
                        bVar2.setTextColor(j5d.a(context, R.attr.uikitStaticWhite80, false));
                        bVar2.setTextSize(14.0f);
                        break;
                    case 1:
                        bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Text_Regular_StaticWhite);
                        bVar2.setTypeface(itf0.a(R.font.roboto_regular, uclVar.f35435a.getContext()));
                        bVar2.setTextSize(14.0f);
                        break;
                    case 2:
                        bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Text_Regular_StaticWhite);
                        bVar2.setTypeface(itf0.a(R.font.roboto_regular, uclVar.f35435a.getContext()));
                        bVar2.setTextSize(14.0f);
                        break;
                    case 3:
                        bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Title_Medium_M_StaticWhite);
                        bVar2.setTypeface(itf0.a(R.font.roboto_medium, uclVar.f35435a.getContext()));
                        bVar2.setTextSize(20.0f);
                        break;
                    case 4:
                        bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Text_Regular_StaticWhite);
                        bVar2.setTypeface(itf0.a(R.font.roboto_regular, uclVar.f35435a.getContext()));
                        bVar2.setTextSize(14.0f);
                        break;
                    case 5:
                        bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Text_Regular_Primary);
                        ConstraintLayout constraintLayout2 = uclVar.f35435a;
                        bVar2.setTypeface(itf0.a(R.font.roboto_regular, constraintLayout2.getContext()));
                        TypedValue typedValue2 = j5d.f15927a;
                        Context context2 = constraintLayout2.getContext();
                        context2.getClass();
                        bVar2.setTextColor(j5d.a(context2, R.attr.uikitPrimary, false));
                        bVar2.setTextSize(14.0f);
                        break;
                    case 6:
                        bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Text_Regular_Primary);
                        ConstraintLayout constraintLayout3 = uclVar.f35435a;
                        bVar2.setTypeface(itf0.a(R.font.roboto_regular, constraintLayout3.getContext()));
                        TypedValue typedValue3 = j5d.f15927a;
                        Context context3 = constraintLayout3.getContext();
                        context3.getClass();
                        bVar2.setTextColor(j5d.a(context3, R.attr.uikitTextPrimary, false));
                        bVar2.setDynamicTextColor(true);
                        bVar2.setTextSize(14.0f);
                        break;
                    case 7:
                        bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Title_Medium_M);
                        ConstraintLayout constraintLayout4 = uclVar.f35435a;
                        bVar2.setTypeface(itf0.a(R.font.roboto_medium, constraintLayout4.getContext()));
                        TypedValue typedValue4 = j5d.f15927a;
                        Context context4 = constraintLayout4.getContext();
                        context4.getClass();
                        bVar2.setTextColor(j5d.a(context4, R.attr.uikitPrimary, false));
                        bVar2.setTextSize(20.0f);
                        break;
                    case 8:
                        bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Text_Regular_Primary);
                        ConstraintLayout constraintLayout5 = uclVar.f35435a;
                        bVar2.setTypeface(itf0.a(R.font.roboto_regular, constraintLayout5.getContext()));
                        TypedValue typedValue5 = j5d.f15927a;
                        Context context5 = constraintLayout5.getContext();
                        context5.getClass();
                        bVar2.setTextColor(j5d.a(context5, R.attr.uikitTextPrimary, false));
                        bVar2.setTextSize(14.0f);
                        break;
                    case 9:
                        bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Text_Regular_StaticWhite);
                        bVar2.setTypeface(itf0.a(R.font.roboto_regular, uclVar.f35435a.getContext()));
                        bVar2.setTextSize(14.0f);
                        break;
                    case 10:
                        bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Text_Regular);
                        ConstraintLayout constraintLayout6 = uclVar.f35435a;
                        bVar2.setTypeface(itf0.a(R.font.roboto_regular, constraintLayout6.getContext()));
                        TypedValue typedValue6 = j5d.f15927a;
                        Context context6 = constraintLayout6.getContext();
                        context6.getClass();
                        bVar2.setTextColor(j5d.a(context6, R.attr.uikitStaticWhite, false));
                        bVar2.setTextSize(14.0f);
                        break;
                    default:
                        bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Title_Medium_M_StaticWhite);
                        bVar2.setTypeface(itf0.a(R.font.roboto_medium, uclVar.f35435a.getContext()));
                        bVar2.setTextSize(20.0f);
                        break;
                }
                return Unit.f46060a;
            }
        }, new Function0() { // from class: a.tcl
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b13 = b11;
                ucl uclVar = this;
                org.xplatform.app_update.impl.presentation.update_screen.views.content.download.value.b bVar2 = bVar;
                switch (b13) {
                    case 0:
                        bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Text_Regular);
                        ConstraintLayout constraintLayout = uclVar.f35435a;
                        bVar2.setTypeface(itf0.a(R.font.roboto_regular, constraintLayout.getContext()));
                        TypedValue typedValue = j5d.f15927a;
                        Context context = constraintLayout.getContext();
                        context.getClass();
                        bVar2.setTextColor(j5d.a(context, R.attr.uikitStaticWhite80, false));
                        bVar2.setTextSize(14.0f);
                        break;
                    case 1:
                        bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Text_Regular_StaticWhite);
                        bVar2.setTypeface(itf0.a(R.font.roboto_regular, uclVar.f35435a.getContext()));
                        bVar2.setTextSize(14.0f);
                        break;
                    case 2:
                        bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Text_Regular_StaticWhite);
                        bVar2.setTypeface(itf0.a(R.font.roboto_regular, uclVar.f35435a.getContext()));
                        bVar2.setTextSize(14.0f);
                        break;
                    case 3:
                        bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Title_Medium_M_StaticWhite);
                        bVar2.setTypeface(itf0.a(R.font.roboto_medium, uclVar.f35435a.getContext()));
                        bVar2.setTextSize(20.0f);
                        break;
                    case 4:
                        bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Text_Regular_StaticWhite);
                        bVar2.setTypeface(itf0.a(R.font.roboto_regular, uclVar.f35435a.getContext()));
                        bVar2.setTextSize(14.0f);
                        break;
                    case 5:
                        bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Text_Regular_Primary);
                        ConstraintLayout constraintLayout2 = uclVar.f35435a;
                        bVar2.setTypeface(itf0.a(R.font.roboto_regular, constraintLayout2.getContext()));
                        TypedValue typedValue2 = j5d.f15927a;
                        Context context2 = constraintLayout2.getContext();
                        context2.getClass();
                        bVar2.setTextColor(j5d.a(context2, R.attr.uikitPrimary, false));
                        bVar2.setTextSize(14.0f);
                        break;
                    case 6:
                        bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Text_Regular_Primary);
                        ConstraintLayout constraintLayout3 = uclVar.f35435a;
                        bVar2.setTypeface(itf0.a(R.font.roboto_regular, constraintLayout3.getContext()));
                        TypedValue typedValue3 = j5d.f15927a;
                        Context context3 = constraintLayout3.getContext();
                        context3.getClass();
                        bVar2.setTextColor(j5d.a(context3, R.attr.uikitTextPrimary, false));
                        bVar2.setDynamicTextColor(true);
                        bVar2.setTextSize(14.0f);
                        break;
                    case 7:
                        bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Title_Medium_M);
                        ConstraintLayout constraintLayout4 = uclVar.f35435a;
                        bVar2.setTypeface(itf0.a(R.font.roboto_medium, constraintLayout4.getContext()));
                        TypedValue typedValue4 = j5d.f15927a;
                        Context context4 = constraintLayout4.getContext();
                        context4.getClass();
                        bVar2.setTextColor(j5d.a(context4, R.attr.uikitPrimary, false));
                        bVar2.setTextSize(20.0f);
                        break;
                    case 8:
                        bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Text_Regular_Primary);
                        ConstraintLayout constraintLayout5 = uclVar.f35435a;
                        bVar2.setTypeface(itf0.a(R.font.roboto_regular, constraintLayout5.getContext()));
                        TypedValue typedValue5 = j5d.f15927a;
                        Context context5 = constraintLayout5.getContext();
                        context5.getClass();
                        bVar2.setTextColor(j5d.a(context5, R.attr.uikitTextPrimary, false));
                        bVar2.setTextSize(14.0f);
                        break;
                    case 9:
                        bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Text_Regular_StaticWhite);
                        bVar2.setTypeface(itf0.a(R.font.roboto_regular, uclVar.f35435a.getContext()));
                        bVar2.setTextSize(14.0f);
                        break;
                    case 10:
                        bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Text_Regular);
                        ConstraintLayout constraintLayout6 = uclVar.f35435a;
                        bVar2.setTypeface(itf0.a(R.font.roboto_regular, constraintLayout6.getContext()));
                        TypedValue typedValue6 = j5d.f15927a;
                        Context context6 = constraintLayout6.getContext();
                        context6.getClass();
                        bVar2.setTextColor(j5d.a(context6, R.attr.uikitStaticWhite, false));
                        bVar2.setTextSize(14.0f);
                        break;
                    default:
                        bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Title_Medium_M_StaticWhite);
                        bVar2.setTypeface(itf0.a(R.font.roboto_medium, uclVar.f35435a.getContext()));
                        bVar2.setTextSize(20.0f);
                        break;
                }
                return Unit.f46060a;
            }
        }, new Function0() { // from class: a.tcl
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b13 = b12;
                ucl uclVar = this;
                org.xplatform.app_update.impl.presentation.update_screen.views.content.download.value.b bVar2 = bVar;
                switch (b13) {
                    case 0:
                        bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Text_Regular);
                        ConstraintLayout constraintLayout = uclVar.f35435a;
                        bVar2.setTypeface(itf0.a(R.font.roboto_regular, constraintLayout.getContext()));
                        TypedValue typedValue = j5d.f15927a;
                        Context context = constraintLayout.getContext();
                        context.getClass();
                        bVar2.setTextColor(j5d.a(context, R.attr.uikitStaticWhite80, false));
                        bVar2.setTextSize(14.0f);
                        break;
                    case 1:
                        bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Text_Regular_StaticWhite);
                        bVar2.setTypeface(itf0.a(R.font.roboto_regular, uclVar.f35435a.getContext()));
                        bVar2.setTextSize(14.0f);
                        break;
                    case 2:
                        bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Text_Regular_StaticWhite);
                        bVar2.setTypeface(itf0.a(R.font.roboto_regular, uclVar.f35435a.getContext()));
                        bVar2.setTextSize(14.0f);
                        break;
                    case 3:
                        bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Title_Medium_M_StaticWhite);
                        bVar2.setTypeface(itf0.a(R.font.roboto_medium, uclVar.f35435a.getContext()));
                        bVar2.setTextSize(20.0f);
                        break;
                    case 4:
                        bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Text_Regular_StaticWhite);
                        bVar2.setTypeface(itf0.a(R.font.roboto_regular, uclVar.f35435a.getContext()));
                        bVar2.setTextSize(14.0f);
                        break;
                    case 5:
                        bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Text_Regular_Primary);
                        ConstraintLayout constraintLayout2 = uclVar.f35435a;
                        bVar2.setTypeface(itf0.a(R.font.roboto_regular, constraintLayout2.getContext()));
                        TypedValue typedValue2 = j5d.f15927a;
                        Context context2 = constraintLayout2.getContext();
                        context2.getClass();
                        bVar2.setTextColor(j5d.a(context2, R.attr.uikitPrimary, false));
                        bVar2.setTextSize(14.0f);
                        break;
                    case 6:
                        bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Text_Regular_Primary);
                        ConstraintLayout constraintLayout3 = uclVar.f35435a;
                        bVar2.setTypeface(itf0.a(R.font.roboto_regular, constraintLayout3.getContext()));
                        TypedValue typedValue3 = j5d.f15927a;
                        Context context3 = constraintLayout3.getContext();
                        context3.getClass();
                        bVar2.setTextColor(j5d.a(context3, R.attr.uikitTextPrimary, false));
                        bVar2.setDynamicTextColor(true);
                        bVar2.setTextSize(14.0f);
                        break;
                    case 7:
                        bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Title_Medium_M);
                        ConstraintLayout constraintLayout4 = uclVar.f35435a;
                        bVar2.setTypeface(itf0.a(R.font.roboto_medium, constraintLayout4.getContext()));
                        TypedValue typedValue4 = j5d.f15927a;
                        Context context4 = constraintLayout4.getContext();
                        context4.getClass();
                        bVar2.setTextColor(j5d.a(context4, R.attr.uikitPrimary, false));
                        bVar2.setTextSize(20.0f);
                        break;
                    case 8:
                        bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Text_Regular_Primary);
                        ConstraintLayout constraintLayout5 = uclVar.f35435a;
                        bVar2.setTypeface(itf0.a(R.font.roboto_regular, constraintLayout5.getContext()));
                        TypedValue typedValue5 = j5d.f15927a;
                        Context context5 = constraintLayout5.getContext();
                        context5.getClass();
                        bVar2.setTextColor(j5d.a(context5, R.attr.uikitTextPrimary, false));
                        bVar2.setTextSize(14.0f);
                        break;
                    case 9:
                        bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Text_Regular_StaticWhite);
                        bVar2.setTypeface(itf0.a(R.font.roboto_regular, uclVar.f35435a.getContext()));
                        bVar2.setTextSize(14.0f);
                        break;
                    case 10:
                        bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Text_Regular);
                        ConstraintLayout constraintLayout6 = uclVar.f35435a;
                        bVar2.setTypeface(itf0.a(R.font.roboto_regular, constraintLayout6.getContext()));
                        TypedValue typedValue6 = j5d.f15927a;
                        Context context6 = constraintLayout6.getContext();
                        context6.getClass();
                        bVar2.setTextColor(j5d.a(context6, R.attr.uikitStaticWhite, false));
                        bVar2.setTextSize(14.0f);
                        break;
                    default:
                        bVar2.setTextAppearance(bVar2.getContext(), R.style.TextStyle_Title_Medium_M_StaticWhite);
                        bVar2.setTypeface(itf0.a(R.font.roboto_medium, uclVar.f35435a.getContext()));
                        bVar2.setTextSize(20.0f);
                        break;
                }
                return Unit.f46060a;
            }
        });
    }
}

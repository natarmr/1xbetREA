package org.xplatform.app_update.impl.presentation.update_screen.views;

import a.a13;
import a.a3e;
import a.a8z;
import a.abk0;
import a.b33;
import a.bbk0;
import a.dyb;
import a.ful;
import a.gbk0;
import a.hbk0;
import a.hny;
import a.hxm0;
import a.j5d;
import a.jk3;
import a.knm0;
import a.lk3;
import a.maz;
import a.mk3;
import a.nk3;
import a.ok3;
import a.pn3;
import a.qn3;
import a.t9f;
import a.vm3;
import a.wez;
import a.xl3;
import a.yum0;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textview.MaterialTextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.app_update.impl.presentation.update_screen.views.content.bottom.AppUpdateBottomView;
import org.xplatform.app_update.impl.presentation.update_screen.views.content.download.DownloadView;
import org.xplatform.app_update.impl.presentation.update_screen.views.content.dropdowncards.b;
import org.xplatform.ui_core.viewcomponents.smart_background.e;
import org.xplatform.uikit.components.buttons.DsButton;

/* JADX INFO: loaded from: classes3.dex */
public final class AppUpdateScreenLayout extends ConstraintLayout {
    public static final /* synthetic */ int A = 0;
    public final jk3 q;
    public b r;
    public hbk0 s;
    public ok3 t;
    public int u;
    public boolean v;
    public boolean w;
    public final a8z x;
    public Function0 y;
    public final float z;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/app_update/impl/presentation/update_screen/views/AppUpdateScreenLayout$SavedState;", "Landroid/os/Parcelable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Parcelable f46325a;
        public final int b;
        public final boolean c;

        public SavedState(Parcelable parcelable, int i, boolean z) {
            this.f46325a = parcelable;
            this.b = i;
            this.c = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.f46325a, i);
            parcel.writeInt(this.b);
            parcel.writeInt(this.c ? 1 : 0);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AppUpdateScreenLayout(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        LayoutInflater.from(context).inflate(R.layout.app_update_screen_layout, this);
        int i2 = R.id.backBtn;
        AppCompatImageButton appCompatImageButton = (AppCompatImageButton) yum0.f(this, R.id.backBtn);
        if (appCompatImageButton != null) {
            i2 = R.id.barrierUpdate;
            Barrier barrier = (Barrier) yum0.f(this, R.id.barrierUpdate);
            if (barrier != null) {
                i2 = R.id.bottomView;
                AppUpdateBottomView appUpdateBottomView = (AppUpdateBottomView) yum0.f(this, R.id.bottomView);
                if (appUpdateBottomView != null) {
                    i2 = R.id.downloadView;
                    DownloadView downloadView = (DownloadView) yum0.f(this, R.id.downloadView);
                    if (downloadView != null) {
                        this.q = new jk3(this, appCompatImageButton, barrier, appUpdateBottomView, downloadView);
                        this.u = -1;
                        this.x = maz.a(wez.b, new a13(this, (byte) 11));
                        this.z = getResources().getDimension(R.dimen.elevation_2);
                        dyb.c0(appCompatImageButton, new b33((Object) this, (byte) 5));
                        knm0.h(appUpdateBottomView, false);
                        knm0.h(downloadView, false);
                        return;
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    private final abk0 getSmartBackgroundInflater() {
        return (abk0) this.x.getValue();
    }

    private final void setDownloadViewVisibility(boolean z) {
        jk3 jk3Var = this.q;
        if ((((DownloadView) jk3Var.f).getVisibility() == 0) == z) {
            return;
        }
        ((DownloadView) jk3Var.f).setVisibility(z ? 0 : 8);
    }

    public final int getBottomViewHeight() {
        return ((AppUpdateBottomView) this.q.b).getHeight();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        if (this.v && this.w) {
            this.w = false;
            b bVar = this.r;
            if (bVar != null && bVar.c) {
                bVar.c = false;
                bVar.setVisibility(8);
            }
        }
        super.onDetachedFromWindow();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.v && this.r == null) {
            b bVar = (b) findViewById(R.id.dropDownCardsView);
            this.r = bVar;
            if (!this.v || this.w) {
                return;
            }
            this.w = true;
            if (bVar == null || bVar.c) {
                return;
            }
            bVar.setVisibility(0);
            bVar.c = true;
            bVar.a();
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        setProgress(savedState.b);
        this.v = savedState.c;
        super.onRestoreInstanceState(savedState.f46325a);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), this.u, this.v);
    }

    public final void setBackBtnClickedCallback(Function0<Unit> function0) {
        function0.getClass();
        this.y = function0;
    }

    public final void setProgress(int i) {
        if (this.u > i) {
            return;
        }
        this.u = i;
        ((DownloadView) this.q.f).v(i);
    }

    public final void setUpdateBtnClickedCallback(Function0<Unit> function0) {
        function0.getClass();
        ((AppUpdateBottomView) this.q.b).setUpdateBtnClickedCallback(function0);
    }

    public final void setUpdateBtnEnabled(boolean z) {
        ((AppUpdateBottomView) this.q.b).setUpdateBtnEnabled(z);
    }

    public final void setWhatsNewBtnClickedCallback(Function0<Unit> function0) {
        function0.getClass();
        ((AppUpdateBottomView) this.q.b).setWhatsNewBtnClickedCallback(function0);
    }

    public final void u(List list, pn3 pn3Var) {
        Context context = getContext();
        context.getClass();
        b bVar = new b(context);
        bVar.setContainerLayoutParams(pn3Var);
        bVar.setContent(list);
        ok3 ok3Var = this.t;
        if (ok3Var != null && !(ok3Var instanceof lk3)) {
            bVar.setElevation(this.z);
        }
        addView(bVar);
        this.v = true;
    }

    public final void v(boolean z) {
        if (findViewById(R.id.bottomGradientView) == null) {
            View view = new View(getContext());
            view.setId(R.id.bottomGradientView);
            a3e a3eVar = new a3e(-1, view.getContext().getResources().getDimensionPixelSize(R.dimen.size_256));
            a3eVar.i = 0;
            a3eVar.t = 0;
            a3eVar.v = 0;
            a3eVar.l = 0;
            a3eVar.F = 1.0f;
            view.setLayoutParams(a3eVar);
            view.setBackground(view.getContext().getDrawable(R.drawable.app_update_bottom_gradient));
            addView(view);
        }
        if (z && findViewById(R.id.topGradientView) == null) {
            View view2 = new View(getContext());
            view2.setId(R.id.topGradientView);
            view2.setLayoutParams(new a3e(-1, view2.getContext().getResources().getDimensionPixelSize(R.dimen.size_248)));
            view2.setBackground(view2.getContext().getDrawable(R.drawable.app_update_top_gradient));
            addView(view2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004b  */
    /* JADX WARN: Code duplicated, block: B:22:0x0060  */
    /* JADX WARN: Code duplicated, block: B:35:0x0096  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b2  */
    public final void w(vm3 vm3Var, xl3 xl3Var) {
        View viewM;
        View viewM2;
        vm3Var.getClass();
        hbk0 hbk0Var = vm3Var.f37657a;
        hbk0 hbk0Var2 = this.s;
        if (hbk0Var2 == null) {
            getSmartBackgroundInflater().a(hbk0Var, xl3Var);
            this.s = hbk0Var;
        } else if (!hbk0Var2.equals(hbk0Var)) {
            this.s = hbk0Var;
            Unit unit = null;
            if (hbk0Var instanceof gbk0) {
                View viewM3 = m(R.id.smart_background_video);
                if (viewM3 == null) {
                    Context context = getContext();
                    context.getClass();
                    e eVar = new e(context);
                    addView(eVar, 0);
                    viewM2 = m(R.id.smart_background_image);
                    if (viewM2 != null) {
                        removeView(viewM2);
                    }
                    gbk0 gbk0Var = (gbk0) hbk0Var;
                    eVar.c(gbk0Var.b, gbk0Var.c);
                    eVar.e();
                    eVar.setOnPlayerReadyListener(xl3Var);
                    requestLayout();
                } else {
                    e eVar2 = viewM3 instanceof e ? (e) viewM3 : null;
                    if (eVar2 != null) {
                        gbk0 gbk0Var2 = (gbk0) hbk0Var;
                        eVar2.c(gbk0Var2.b, gbk0Var2.c);
                    }
                    if (eVar2 != null) {
                        eVar2.e();
                        unit = Unit.f46060a;
                    }
                    if (unit == null) {
                        Context context2 = getContext();
                        context2.getClass();
                        e eVar3 = new e(context2);
                        addView(eVar3, 0);
                        viewM2 = m(R.id.smart_background_image);
                        if (viewM2 != null) {
                            removeView(viewM2);
                        }
                        gbk0 gbk0Var3 = (gbk0) hbk0Var;
                        eVar3.c(gbk0Var3.b, gbk0Var3.c);
                        eVar3.e();
                        eVar3.setOnPlayerReadyListener(xl3Var);
                        requestLayout();
                    }
                }
            } else if (hbk0Var instanceof bbk0) {
                View viewM4 = m(R.id.smart_background_image);
                if (viewM4 == null) {
                    Context context3 = getContext();
                    context3.getClass();
                    org.xplatform.ui_core.viewcomponents.smart_background.b bVar = new org.xplatform.ui_core.viewcomponents.smart_background.b(context3);
                    addView(bVar, 0);
                    bVar.setImageParams(((bbk0) hbk0Var).b);
                    viewM = m(R.id.smart_background_video);
                    if (viewM != null) {
                        removeView(viewM);
                    }
                    requestLayout();
                } else {
                    org.xplatform.ui_core.viewcomponents.smart_background.b bVar2 = viewM4 instanceof org.xplatform.ui_core.viewcomponents.smart_background.b ? (org.xplatform.ui_core.viewcomponents.smart_background.b) viewM4 : null;
                    if (bVar2 != null) {
                        bVar2.setImageParams(((bbk0) hbk0Var).b);
                        unit = Unit.f46060a;
                    }
                    if (unit == null) {
                        Context context4 = getContext();
                        context4.getClass();
                        org.xplatform.ui_core.viewcomponents.smart_background.b bVar3 = new org.xplatform.ui_core.viewcomponents.smart_background.b(context4);
                        addView(bVar3, 0);
                        bVar3.setImageParams(((bbk0) hbk0Var).b);
                        viewM = m(R.id.smart_background_video);
                        if (viewM != null) {
                            removeView(viewM);
                        }
                        requestLayout();
                    }
                }
            }
        }
        ok3 ok3Var = this.t;
        ok3 ok3Var2 = vm3Var.b;
        if (Intrinsics.d(ok3Var, ok3Var2)) {
            return;
        }
        boolean z = ok3Var2 instanceof lk3;
        jk3 jk3Var = this.q;
        if (z) {
            lk3 lk3Var = (lk3) ok3Var2;
            AppUpdateBottomView appUpdateBottomView = (AppUpdateBottomView) jk3Var.b;
            appUpdateBottomView.setBackground(appUpdateBottomView.getContext().getDrawable(R.drawable.bg_bottom_view_style_bottom_sheet));
            AppUpdateBottomView appUpdateBottomView2 = (AppUpdateBottomView) jk3Var.b;
            appUpdateBottomView2.setDescriptionStyle(R.style.TextStyle_Headline_Regular_Secondary);
            TypedValue typedValue = j5d.f15927a;
            Context context5 = getContext();
            context5.getClass();
            appUpdateBottomView2.setDescriptionColor(j5d.a(context5, R.attr.uikitSecondary, false));
            appUpdateBottomView2.setDescriptionErrorColor(getContext().getColor(R.color.static_red));
            appUpdateBottomView2.setDescriptionText(lk3Var.b);
            appUpdateBottomView2.setWhatsNewBtnStyle(ful.f);
            appUpdateBottomView2.setTitle(lk3Var.f20178a);
            ((DownloadView) jk3Var.f).u(lk3Var.d);
            List list = lk3Var.c;
            if (!list.isEmpty()) {
                qn3 qn3Var = new qn3();
                qn3Var.f29013a = 0;
                qn3Var.b = 0;
                qn3Var.d = ((AppCompatImageButton) jk3Var.d).getId();
                qn3Var.e = appUpdateBottomView2.getId();
                qn3Var.h = appUpdateBottomView2.getId();
                qn3Var.g = ((Barrier) jk3Var.e).getId();
                u(list, qn3Var.a());
            }
        } else if (ok3Var2 instanceof mk3) {
            mk3 mk3Var = (mk3) ok3Var2;
            boolean z2 = true;
            v(true);
            AppCompatImageButton appCompatImageButton = (AppCompatImageButton) jk3Var.d;
            AppUpdateBottomView appUpdateBottomView3 = (AppUpdateBottomView) jk3Var.b;
            float f = this.z;
            appCompatImageButton.setElevation(f);
            appUpdateBottomView3.setElevation(f);
            appUpdateBottomView3.setBackground(appUpdateBottomView3.getContext().getDrawable(R.drawable.app_update_bottom_gradient));
            appUpdateBottomView3.setTitleVisibility(false);
            appUpdateBottomView3.setDescriptionStyle(R.style.TextStyle_Headline_Regular);
            appUpdateBottomView3.setDescriptionColor(getContext().getColor(R.color.static_white_80));
            appUpdateBottomView3.setDescriptionErrorColor(getContext().getColor(R.color.static_red));
            String str = mk3Var.c;
            List list2 = mk3Var.d;
            appUpdateBottomView3.setDescriptionText(str);
            appUpdateBottomView3.setWhatsNewBtnStyle(ful.k);
            DownloadView downloadView = (DownloadView) jk3Var.f;
            downloadView.setElevation(f);
            downloadView.u(mk3Var.e);
            String str2 = mk3Var.f21924a;
            String str3 = mk3Var.b;
            Context context6 = getContext();
            context6.getClass();
            context6.getClass();
            org.xplatform.app_update.impl.presentation.update_screen.views.content.updateavailable.b bVar4 = new org.xplatform.app_update.impl.presentation.update_screen.views.content.updateavailable.b(context6);
            bVar4.i = "";
            bVar4.j = "";
            int id = R.id.updateAvailableView;
            bVar4.setId(R.id.updateAvailableView);
            bVar4.setVisibility(0);
            bVar4.setGravity(17);
            bVar4.setTextDirection(5);
            TypedValue typedValue2 = j5d.f15927a;
            bVar4.setTextColor(context6.getColor(R.color.static_white));
            bVar4.setTextAppearance(context6, R.style.TextStyle_Title_Medium_XL);
            bVar4.setTextSize(32.0f);
            qn3 qn3Var2 = new qn3();
            qn3Var2.f29013a = -1;
            qn3Var2.b = -2;
            qn3Var2.d = appCompatImageButton.getId();
            qn3Var2.g = appUpdateBottomView3.getId();
            qn3Var2.e = 0;
            qn3Var2.h = 0;
            qn3Var2.m = R.dimen.space_40;
            qn3Var2.k = R.dimen.space_40;
            qn3Var2.i = 0.0f;
            bVar4.setViewLayoutParams(qn3Var2.a());
            str2.getClass();
            str3.getClass();
            if (str2.length() != 0 || str3.length() != 0) {
                bVar4.j = str2;
                bVar4.i = str3;
                bVar4.setText(str2);
            }
            ok3 ok3Var3 = this.t;
            if (ok3Var3 != null && (ok3Var3 instanceof mk3)) {
                bVar4.setElevation(f);
            }
            addView(bVar4);
            if (!list2.isEmpty()) {
                ArrayList arrayListQ = hxm0.q(this);
                if (!arrayListQ.isEmpty()) {
                    Iterator it = arrayListQ.iterator();
                    do {
                        if (!it.hasNext()) {
                            z2 = false;
                            break;
                        }
                    } while (!(((View) it.next()) instanceof org.xplatform.app_update.impl.presentation.update_screen.views.content.updateavailable.b));
                } else {
                    z2 = false;
                    break;
                }
                qn3 qn3Var3 = new qn3();
                qn3Var3.f29013a = 0;
                qn3Var3.b = 0;
                if (!z2) {
                    id = appCompatImageButton.getId();
                }
                qn3Var3.d = id;
                qn3Var3.e = 0;
                qn3Var3.h = 0;
                qn3Var3.g = ((Barrier) jk3Var.e).getId();
                u(list2, qn3Var3.a());
            }
        } else {
            if (!(ok3Var2 instanceof nk3)) {
                t9f.b();
                return;
            }
            nk3 nk3Var = (nk3) ok3Var2;
            v(false);
            float dimension = getResources().getDimension(R.dimen.elevation_2);
            ((AppUpdateBottomView) jk3Var.b).setElevation(dimension);
            AppUpdateBottomView appUpdateBottomView4 = (AppUpdateBottomView) jk3Var.b;
            appUpdateBottomView4.setTitleVisibility(false);
            appUpdateBottomView4.setDescriptionStyle(R.style.TextStyle_Headline_Regular);
            appUpdateBottomView4.setDescriptionColor(getContext().getColor(R.color.static_white_80));
            appUpdateBottomView4.setDescriptionErrorColor(getContext().getColor(R.color.static_red));
            appUpdateBottomView4.setDescriptionText(nk3Var.f23663a);
            appUpdateBottomView4.setWhatsNewBtnStyle(ful.k);
            DownloadView downloadView2 = (DownloadView) jk3Var.f;
            downloadView2.setElevation(dimension);
            downloadView2.u(nk3Var.c);
            List list3 = nk3Var.b;
            if (!list3.isEmpty()) {
                qn3 qn3Var4 = new qn3();
                qn3Var4.f29013a = 0;
                qn3Var4.b = 0;
                qn3Var4.d = ((AppCompatImageButton) jk3Var.d).getId();
                qn3Var4.e = 0;
                qn3Var4.h = 0;
                qn3Var4.g = ((Barrier) jk3Var.e).getId();
                u(list3, qn3Var4.a());
            }
        }
        this.t = ok3Var2;
    }

    public final void x(boolean z) {
        AppUpdateBottomView appUpdateBottomView = (AppUpdateBottomView) this.q.b;
        jk3 jk3Var = appUpdateBottomView.f46326a;
        String str = appUpdateBottomView.f;
        if (str.length() != 0 && !Intrinsics.d(((DsButton) jk3Var.e).getButtonLabel(), str)) {
            ((DsButton) jk3Var.e).l(str);
        }
        int i = appUpdateBottomView.h;
        if (i != 0) {
            ((MaterialTextView) jk3Var.c).setTextColor(i);
        }
        if (appUpdateBottomView.c.length() != 0 && !Intrinsics.d(((MaterialTextView) jk3Var.c).getText(), appUpdateBottomView.c)) {
            ((MaterialTextView) jk3Var.c).setText(appUpdateBottomView.c);
        }
        setDownloadViewVisibility(false);
        ok3 ok3Var = this.t;
        if (ok3Var != null) {
            if (ok3Var instanceof lk3) {
                appUpdateBottomView.setTitleVisibility(true);
            } else if (ok3Var instanceof mk3) {
                org.xplatform.app_update.impl.presentation.update_screen.views.content.updateavailable.b bVar = (org.xplatform.app_update.impl.presentation.update_screen.views.content.updateavailable.b) findViewById(R.id.updateAvailableView);
                if (bVar != null) {
                    bVar.setText(bVar.j);
                }
                appUpdateBottomView.setTitleVisibility(false);
            } else {
                if (!(ok3Var instanceof nk3)) {
                    t9f.b();
                    return;
                }
                appUpdateBottomView.setTitleVisibility(false);
            }
        }
        appUpdateBottomView.setDescriptionVisibility(true);
        appUpdateBottomView.setWhatsNewBtnVisibility(true);
        appUpdateBottomView.setUpdateBtnVisibility(true);
        appUpdateBottomView.setUpdateBtnLoading(z);
    }

    public final void y(String str) {
        str.getClass();
        AppUpdateBottomView appUpdateBottomView = (AppUpdateBottomView) this.q.b;
        jk3 jk3Var = appUpdateBottomView.f46326a;
        String str2 = appUpdateBottomView.g;
        if (str2.length() != 0 && !Intrinsics.d(((DsButton) jk3Var.e).getButtonLabel(), str2)) {
            ((DsButton) jk3Var.e).l(str2);
        }
        int i = appUpdateBottomView.i;
        if (i != 0) {
            ((MaterialTextView) jk3Var.c).setTextColor(i);
        }
        appUpdateBottomView.setDescriptionErrorText(str);
        if (appUpdateBottomView.d.length() != 0 && !Intrinsics.d(((MaterialTextView) jk3Var.c).getText(), appUpdateBottomView.d)) {
            ((MaterialTextView) jk3Var.c).setText(appUpdateBottomView.d);
        }
        setDownloadViewVisibility(false);
        ok3 ok3Var = this.t;
        if (ok3Var != null) {
            if (ok3Var instanceof lk3) {
                appUpdateBottomView.setTitleVisibility(true);
            } else if (ok3Var instanceof mk3) {
                org.xplatform.app_update.impl.presentation.update_screen.views.content.updateavailable.b bVar = (org.xplatform.app_update.impl.presentation.update_screen.views.content.updateavailable.b) findViewById(R.id.updateAvailableView);
                if (bVar != null) {
                    bVar.setText(bVar.j);
                }
                appUpdateBottomView.setTitleVisibility(false);
            } else {
                if (!(ok3Var instanceof nk3)) {
                    t9f.b();
                    return;
                }
                appUpdateBottomView.setTitleVisibility(false);
            }
        }
        appUpdateBottomView.setDescriptionVisibility(true);
        appUpdateBottomView.setWhatsNewBtnVisibility(true);
        appUpdateBottomView.setUpdateBtnVisibility(true);
        appUpdateBottomView.setUpdateBtnLoading(false);
    }

    public final void z() {
        org.xplatform.app_update.impl.presentation.update_screen.views.content.updateavailable.b bVar;
        jk3 jk3Var = this.q;
        AppUpdateBottomView appUpdateBottomView = (AppUpdateBottomView) jk3Var.b;
        if (((DownloadView) jk3Var.f).getVisibility() == 0) {
            return;
        }
        ok3 ok3Var = this.t;
        if (ok3Var != null && (ok3Var instanceof mk3) && (bVar = (org.xplatform.app_update.impl.presentation.update_screen.views.content.updateavailable.b) findViewById(R.id.updateAvailableView)) != null) {
            bVar.setText(bVar.i);
        }
        setDownloadViewVisibility(true);
        appUpdateBottomView.setTitleVisibility(false);
        appUpdateBottomView.setDescriptionVisibility(false);
        appUpdateBottomView.setWhatsNewBtnVisibility(false);
        appUpdateBottomView.setUpdateBtnVisibility(false);
        appUpdateBottomView.setUpdateBtnLoading(false);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AppUpdateScreenLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AppUpdateScreenLayout(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}

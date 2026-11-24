package org.xplatform.app_update.impl.presentation.update_screen.views.content.bottom;

import a.brm0;
import a.dyb;
import a.ful;
import a.hny;
import a.jk3;
import a.yum0;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.material.textview.MaterialTextView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.app_update.impl.presentation.update_screen.views.content.bottom.AppUpdateBottomView;
import org.xplatform.uikit.components.buttons.DsButton;
import org.xplatform.uikit.components.loader.DsLoader;

/* JADX INFO: loaded from: classes3.dex */
public final class AppUpdateBottomView extends LinearLayout {
    public static final /* synthetic */ int m = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jk3 f46326a;
    public String b;
    public String c;
    public String d;
    public boolean e;
    public final String f;
    public final String g;
    public int h;
    public int i;
    public int j;
    public Function0 k;
    public Function0 l;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/bottom/AppUpdateBottomView$SavedState;", "Landroid/os/Parcelable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Parcelable f46327a;
        public final String b;
        public final String c;
        public final String d;
        public final int e;
        public final int f;
        public final int g;
        public final boolean h;

        public SavedState(Parcelable parcelable, String str, String str2, String str3, int i, int i2, int i3, boolean z) {
            brm0.B(str, str2, str3);
            this.f46327a = parcelable;
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = i;
            this.f = i2;
            this.g = i3;
            this.h = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.f46327a, i);
            parcel.writeString(this.b);
            parcel.writeString(this.c);
            parcel.writeString(this.d);
            parcel.writeInt(this.e);
            parcel.writeInt(this.f);
            parcel.writeInt(this.g);
            parcel.writeInt(this.h ? 1 : 0);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AppUpdateBottomView(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        final byte b = 0;
        super(context, attributeSet, 0);
        LayoutInflater.from(context).inflate(R.layout.app_update_bottom_view, this);
        int i2 = R.id.description;
        MaterialTextView materialTextView = (MaterialTextView) yum0.f(this, R.id.description);
        if (materialTextView != null) {
            i2 = R.id.title;
            MaterialTextView materialTextView2 = (MaterialTextView) yum0.f(this, R.id.title);
            if (materialTextView2 != null) {
                i2 = R.id.updateBtn;
                DsButton dsButton = (DsButton) yum0.f(this, R.id.updateBtn);
                if (dsButton != null) {
                    i2 = R.id.whatsNewBtn;
                    DsButton dsButton2 = (DsButton) yum0.f(this, R.id.whatsNewBtn);
                    if (dsButton2 != null) {
                        this.f46326a = new jk3(this, materialTextView, materialTextView2, dsButton, dsButton2, (byte) 0);
                        this.b = "";
                        this.c = "";
                        this.d = "";
                        final byte b2 = 1;
                        this.e = true;
                        String string = context.getString(R.string.update_app_button);
                        string.getClass();
                        this.f = string;
                        String string2 = context.getString(R.string.try_again_text);
                        string2.getClass();
                        this.g = string2;
                        materialTextView2.setVisibility(8);
                        dyb.c0(dsButton2, new Function1(this) { // from class: a.ik3
                            public final /* synthetic */ AppUpdateBottomView b;

                            {
                                this.b = this;
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                byte b3 = b;
                                AppUpdateBottomView appUpdateBottomView = this.b;
                                View view = (View) obj;
                                switch (b3) {
                                    case 0:
                                        int i3 = AppUpdateBottomView.m;
                                        view.getClass();
                                        Function0 function0 = appUpdateBottomView.k;
                                        if (function0 != null) {
                                            function0.invoke();
                                        }
                                        break;
                                    default:
                                        int i4 = AppUpdateBottomView.m;
                                        view.getClass();
                                        Function0 function1 = appUpdateBottomView.l;
                                        if (function1 != null) {
                                            function1.invoke();
                                        }
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        });
                        dyb.c0(dsButton, new Function1(this) { // from class: a.ik3
                            public final /* synthetic */ AppUpdateBottomView b;

                            {
                                this.b = this;
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                byte b3 = b2;
                                AppUpdateBottomView appUpdateBottomView = this.b;
                                View view = (View) obj;
                                switch (b3) {
                                    case 0:
                                        int i3 = AppUpdateBottomView.m;
                                        view.getClass();
                                        Function0 function0 = appUpdateBottomView.k;
                                        if (function0 != null) {
                                            function0.invoke();
                                        }
                                        break;
                                    default:
                                        int i4 = AppUpdateBottomView.m;
                                        view.getClass();
                                        Function0 function1 = appUpdateBottomView.l;
                                        if (function1 != null) {
                                            function1.invoke();
                                        }
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        });
                        setOrientation(1);
                        return;
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        boolean z = savedState.h;
        if (this.e != z) {
            this.e = z;
            ((DsButton) this.f46326a.f).setVisibility(z ? 0 : 8);
        }
        setTitle(savedState.b);
        setDescriptionColor(savedState.e);
        setDescriptionText(savedState.c);
        setDescriptionErrorColor(savedState.f);
        setDescriptionErrorText(savedState.d);
        setDescriptionStyle(savedState.g);
        super.onRestoreInstanceState(savedState.f46327a);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), this.b, this.c, this.d, this.h, this.i, this.j, this.e);
    }

    public final void setDescriptionColor(int i) {
        if (this.h == i) {
            return;
        }
        this.h = i;
    }

    public final void setDescriptionErrorColor(int i) {
        if (this.i == i) {
            return;
        }
        this.i = i;
    }

    public final void setDescriptionErrorText(String str) {
        str.getClass();
        if (Intrinsics.d(((MaterialTextView) this.f46326a.c).getText(), str)) {
            return;
        }
        this.d = str;
    }

    public final void setDescriptionStyle(int i) {
        if (this.j == i) {
            return;
        }
        this.j = i;
        ((MaterialTextView) this.f46326a.c).setTextAppearance(getContext(), i);
    }

    public final void setDescriptionText(String str) {
        str.getClass();
        if (Intrinsics.d(((MaterialTextView) this.f46326a.c).getText(), str)) {
            return;
        }
        this.c = str;
    }

    public final void setDescriptionVisibility(boolean z) {
        jk3 jk3Var = this.f46326a;
        if ((((MaterialTextView) jk3Var.c).getVisibility() == 0) == z) {
            return;
        }
        ((MaterialTextView) jk3Var.c).setVisibility(z ? 0 : 8);
    }

    public final void setTitle(String str) {
        str.getClass();
        jk3 jk3Var = this.f46326a;
        if (Intrinsics.d(((MaterialTextView) jk3Var.d).getText(), str)) {
            return;
        }
        this.b = str;
        ((MaterialTextView) jk3Var.d).setText(str);
    }

    public final void setTitleVisibility(boolean z) {
        jk3 jk3Var = this.f46326a;
        if ((((MaterialTextView) jk3Var.d).getVisibility() == 0) == z) {
            return;
        }
        ((MaterialTextView) jk3Var.d).setVisibility(z ? 0 : 8);
    }

    public final void setUpdateBtnClickedCallback(Function0<Unit> function0) {
        function0.getClass();
        this.l = function0;
    }

    public final void setUpdateBtnEnabled(boolean z) {
        jk3 jk3Var = this.f46326a;
        if (((DsButton) jk3Var.e).isEnabled() == z) {
            return;
        }
        ((DsButton) jk3Var.e).setEnabled(z);
    }

    public final void setUpdateBtnLoading(boolean z) {
        jk3 jk3Var = this.f46326a;
        DsLoader loader = ((DsButton) jk3Var.e).getLoader();
        if (loader != null) {
            if ((loader.getVisibility() == 0) == z) {
                return;
            }
        }
        ((DsButton) jk3Var.e).setLoading(z);
    }

    public final void setUpdateBtnVisibility(boolean z) {
        jk3 jk3Var = this.f46326a;
        if ((((DsButton) jk3Var.e).getVisibility() == 0) == z) {
            return;
        }
        ((DsButton) jk3Var.e).setVisibility(z ? 0 : 8);
    }

    public final void setWhatsNewBtnClickedCallback(Function0<Unit> function0) {
        function0.getClass();
        this.k = function0;
    }

    public final void setWhatsNewBtnStyle(ful fulVar) {
        fulVar.getClass();
        if (this.e) {
            jk3 jk3Var = this.f46326a;
            ((DsButton) jk3Var.f).setButtonStyle(fulVar);
            ((DsButton) jk3Var.f).h();
        }
    }

    public final void setWhatsNewBtnTextColor(int i) {
        if (this.e) {
            ((DsButton) this.f46326a.f).m(i);
        }
    }

    public final void setWhatsNewBtnVisibility(boolean z) {
        if (this.e) {
            ((DsButton) this.f46326a.f).setVisibility(z ? 0 : 8);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AppUpdateBottomView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AppUpdateBottomView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}

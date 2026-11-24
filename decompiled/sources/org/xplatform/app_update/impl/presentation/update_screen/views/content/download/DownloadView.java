package org.xplatform.app_update.impl.presentation.update_screen.views.content.download;

import a.a8z;
import a.ewm0;
import a.fcl;
import a.hxm0;
import a.il3;
import a.j5d;
import a.jl3;
import a.lc00;
import a.ll3;
import a.maz;
import a.ml3;
import a.nl3;
import a.ol3;
import a.paw;
import a.pek;
import a.pl3;
import a.ql3;
import a.qn3;
import a.r3d;
import a.t9f;
import a.ucj;
import a.ucl;
import a.wez;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.Unit;
import org.xbet.client1.R;
import org.xplatform.app_update.impl.presentation.update_screen.views.content.download.bar.b;

/* JADX INFO: loaded from: classes3.dex */
public final class DownloadView extends ConstraintLayout {
    public static final /* synthetic */ int v = 0;
    public final a8z q;
    public b r;
    public org.xplatform.app_update.impl.presentation.update_screen.views.content.download.value.b s;
    public org.xplatform.app_update.impl.presentation.update_screen.views.content.download.label.b t;
    public int u;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/DownloadView$SavedState;", "Landroid/os/Parcelable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Parcelable f46328a;
        public final int b;

        public SavedState(Parcelable parcelable, int i) {
            this.f46328a = parcelable;
            this.b = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.f46328a, i);
            parcel.writeInt(this.b);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DownloadView(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        this.q = maz.a(wez.b, new ucj(this, (byte) 25));
    }

    private final ucl getDownloadViewInflater() {
        return (ucl) this.q.getValue();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        org.xplatform.app_update.impl.presentation.update_screen.views.content.download.label.b bVar;
        super.onAttachedToWindow();
        if (this.u <= 0 || (bVar = this.t) == null || bVar == null) {
            return;
        }
        bVar.j();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        org.xplatform.app_update.impl.presentation.update_screen.views.content.download.label.b bVar = this.t;
        if (bVar != null) {
            bVar.k();
        }
        super.onDetachedFromWindow();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.r == null) {
            this.r = (b) findViewById(R.id.downloadBarContainer);
        }
        if (this.s == null) {
            this.s = (org.xplatform.app_update.impl.presentation.update_screen.views.content.download.value.b) findViewById(R.id.downloadValue);
        }
        if (this.t == null) {
            this.t = (org.xplatform.app_update.impl.presentation.update_screen.views.content.download.label.b) findViewById(R.id.downloadLabel);
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        v(savedState.b);
        super.onRestoreInstanceState(savedState.f46328a);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), this.u);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x007b  */
    public final void u(ql3 ql3Var) {
        View view;
        View view2;
        View view3;
        if (hxm0.q(this).isEmpty()) {
            ucl downloadViewInflater = getDownloadViewInflater();
            downloadViewInflater.getClass();
            lc00 lc00VarB = kotlin.collections.a.b();
            ConstraintLayout constraintLayout = downloadViewInflater.f35435a;
            Context context = constraintLayout.getContext();
            context.getClass();
            lc00VarB.add(new b(context));
            Context context2 = constraintLayout.getContext();
            context2.getClass();
            lc00VarB.add(new org.xplatform.app_update.impl.presentation.update_screen.views.content.download.value.b(context2));
            boolean z = ql3Var instanceof nl3;
            if (z) {
                Context context3 = constraintLayout.getContext();
                context3.getClass();
                context3.getClass();
                org.xplatform.app_update.impl.presentation.update_screen.views.content.download.description.b bVar = new org.xplatform.app_update.impl.presentation.update_screen.views.content.download.description.b(context3);
                bVar.i = "";
                bVar.setId(R.id.downloadDescription);
                bVar.setTextDirection(5);
                bVar.setGravity(17);
                lc00VarB.add(bVar);
            }
            boolean z2 = ql3Var instanceof ol3;
            if (!z2) {
                if (ql3Var instanceof pl3) {
                    pl3 pl3Var = (pl3) ql3Var;
                    if (!(pl3Var.b instanceof il3) && pl3Var.f27162a.length() != 0) {
                        Context context4 = constraintLayout.getContext();
                        context4.getClass();
                        lc00VarB.add(new org.xplatform.app_update.impl.presentation.update_screen.views.content.download.label.b(context4));
                    }
                } else {
                    Context context5 = constraintLayout.getContext();
                    context5.getClass();
                    lc00VarB.add(new org.xplatform.app_update.impl.presentation.update_screen.views.content.download.label.b(context5));
                }
            }
            lc00 lc00VarA = kotlin.collections.a.a(lc00VarB);
            int i = -1;
            int i2 = R.dimen.space_40;
            int i3 = R.dimen.space_16;
            if (z) {
                nl3 nl3Var = (nl3) ql3Var;
                ml3 ml3Var = nl3Var.c;
                constraintLayout.setBackground(constraintLayout.getContext().getDrawable(R.drawable.bg_bottom_view_style_bottom_sheet));
                ArrayList arrayList = new ArrayList(r3d.q(lc00VarA, 10));
                ListIterator listIterator = lc00VarA.listIterator(0);
                while (true) {
                    paw pawVar = (paw) listIterator;
                    if (!pawVar.hasNext() || (view3 = (View) pawVar.next()) == null) {
                        break;
                    }
                    if (!(view3 instanceof b)) {
                        if (!(view3 instanceof org.xplatform.app_update.impl.presentation.update_screen.views.content.download.value.b)) {
                            if (!(view3 instanceof org.xplatform.app_update.impl.presentation.update_screen.views.content.download.description.b)) {
                                if (!(view3 instanceof org.xplatform.app_update.impl.presentation.update_screen.views.content.download.label.b)) {
                                    break;
                                }
                                org.xplatform.app_update.impl.presentation.update_screen.views.content.download.label.b bVar2 = (org.xplatform.app_update.impl.presentation.update_screen.views.content.download.label.b) view3;
                                qn3 qn3Var = new qn3();
                                qn3Var.f29013a = i;
                                qn3Var.b = -2;
                                qn3Var.c = 0;
                                qn3Var.e = R.id.downloadBarContainer;
                                qn3Var.h = R.id.downloadBarContainer;
                                qn3Var.g = R.id.downloadDescription;
                                qn3Var.l = R.dimen.space_32;
                                qn3Var.m = R.dimen.space_16;
                                qn3Var.k = R.dimen.space_16;
                                qn3Var.n = R.dimen.space_8;
                                qn3Var.i = 1.0f;
                                bVar2.setViewLayoutParams(qn3Var.a());
                                downloadViewInflater.b(bVar2, nl3Var);
                                bVar2.setContent(nl3Var.f23708a);
                            } else {
                                org.xplatform.app_update.impl.presentation.update_screen.views.content.download.description.b bVar3 = (org.xplatform.app_update.impl.presentation.update_screen.views.content.download.description.b) view3;
                                qn3 qn3Var2 = new qn3();
                                qn3Var2.f29013a = -2;
                                qn3Var2.b = -2;
                                qn3Var2.c = 0;
                                qn3Var2.e = 0;
                                qn3Var2.h = 0;
                                qn3Var2.l = R.dimen.space_8;
                                qn3Var2.g = ((ml3Var instanceof jl3) || (ml3Var instanceof il3)) ? R.id.downloadBarContainer : R.id.downloadValue;
                                qn3Var2.n = R.dimen.space_24;
                                qn3Var2.i = 1.0f;
                                bVar3.setViewLayoutParams(qn3Var2.a());
                                bVar3.setTextAppearance(constraintLayout.getContext(), R.style.TextAppearance_Headline_Regular);
                                TypedValue typedValue = j5d.f15927a;
                                Context context6 = constraintLayout.getContext();
                                context6.getClass();
                                bVar3.setTextColor(j5d.a(context6, R.attr.uikitSecondary, false));
                                bVar3.setTextSize(16.0f);
                                bVar3.setContent(nl3Var.b);
                            }
                        } else {
                            org.xplatform.app_update.impl.presentation.update_screen.views.content.download.value.b bVar4 = (org.xplatform.app_update.impl.presentation.update_screen.views.content.download.value.b) view3;
                            qn3 qn3Var3 = new qn3();
                            qn3Var3.f29013a = -2;
                            qn3Var3.b = -2;
                            if ((ml3Var instanceof il3) || (ml3Var instanceof jl3)) {
                                qn3Var3.c = R.id.downloadBarContainer;
                                qn3Var3.e = R.id.downloadBarContainer;
                                qn3Var3.h = R.id.downloadBarContainer;
                                qn3Var3.f = R.id.downloadBarContainer;
                            } else {
                                qn3Var3.c = 0;
                                qn3Var3.e = R.id.downloadBarContainer;
                                qn3Var3.h = R.id.downloadBarContainer;
                                qn3Var3.g = R.id.downloadBarContainer;
                                if (!(ml3Var instanceof ll3)) {
                                    qn3Var3.n = R.dimen.space_16;
                                }
                                qn3Var3.i = 1.0f;
                            }
                            bVar4.setViewLayoutParams(qn3Var3.a());
                            downloadViewInflater.c(bVar4, nl3Var);
                            fcl.f9318a.getClass();
                            bVar4.setDownloadBarType(pek.l(ml3Var));
                        }
                    } else {
                        b bVar5 = (b) view3;
                        qn3 qn3Var4 = new qn3();
                        qn3Var4.f29013a = 0;
                        qn3Var4.b = -2;
                        qn3Var4.c = 0;
                        qn3Var4.e = 0;
                        qn3Var4.h = 0;
                        qn3Var4.f = 0;
                        qn3Var4.n = i2;
                        qn3Var4.m = R.dimen.space_16;
                        qn3Var4.k = R.dimen.space_16;
                        qn3Var4.i = 1.0f;
                        bVar5.setContainerLayoutParams(qn3Var4.a());
                        bVar5.a(ml3Var, R.color.uikit_background_light_60_light);
                    }
                    arrayList.add(Unit.f46060a);
                    i = -1;
                    i2 = R.dimen.space_40;
                }
            } else {
                int i4 = R.color.static_white_10;
                if (z2) {
                    ol3 ol3Var = (ol3) ql3Var;
                    ml3 ml3Var2 = ol3Var.f25434a;
                    ArrayList arrayList2 = new ArrayList(r3d.q(lc00VarA, 10));
                    ListIterator listIterator2 = lc00VarA.listIterator(0);
                    while (true) {
                        paw pawVar2 = (paw) listIterator2;
                        if (!pawVar2.hasNext() || (view2 = (View) pawVar2.next()) == null) {
                            break;
                        }
                        if (!(view2 instanceof b)) {
                            if (!(view2 instanceof org.xplatform.app_update.impl.presentation.update_screen.views.content.download.value.b)) {
                                break;
                            }
                            org.xplatform.app_update.impl.presentation.update_screen.views.content.download.value.b bVar6 = (org.xplatform.app_update.impl.presentation.update_screen.views.content.download.value.b) view2;
                            qn3 qn3Var5 = new qn3();
                            qn3Var5.f29013a = -2;
                            qn3Var5.b = -2;
                            if ((ml3Var2 instanceof il3) || (ml3Var2 instanceof jl3)) {
                                qn3Var5.c = 0;
                                qn3Var5.e = R.id.downloadBarContainer;
                                qn3Var5.h = R.id.downloadBarContainer;
                                qn3Var5.f = R.id.downloadBarContainer;
                            } else {
                                qn3Var5.c = 0;
                                qn3Var5.e = R.id.downloadBarContainer;
                                qn3Var5.h = R.id.downloadBarContainer;
                                qn3Var5.g = R.id.downloadBarContainer;
                                if (!(ml3Var2 instanceof ll3)) {
                                    qn3Var5.n = R.dimen.space_16;
                                }
                                qn3Var5.m = R.dimen.space_16;
                                qn3Var5.k = R.dimen.space_16;
                                qn3Var5.i = 0.0f;
                            }
                            bVar6.setViewLayoutParams(qn3Var5.a());
                            downloadViewInflater.c(bVar6, ol3Var);
                            fcl.f9318a.getClass();
                            bVar6.setDownloadBarType(pek.l(ml3Var2));
                        } else {
                            b bVar7 = (b) view2;
                            qn3 qn3Var6 = new qn3();
                            qn3Var6.f29013a = 0;
                            qn3Var6.b = -2;
                            qn3Var6.c = 0;
                            qn3Var6.e = 0;
                            qn3Var6.h = 0;
                            qn3Var6.f = 0;
                            qn3Var6.n = R.dimen.space_40;
                            qn3Var6.m = R.dimen.space_16;
                            qn3Var6.k = R.dimen.space_16;
                            qn3Var6.i = 1.0f;
                            bVar7.setContainerLayoutParams(qn3Var6.a());
                            bVar7.a(ml3Var2, R.color.static_white_10);
                        }
                        arrayList2.add(Unit.f46060a);
                    }
                } else {
                    if (!(ql3Var instanceof pl3)) {
                        t9f.b();
                        return;
                    }
                    pl3 pl3Var2 = (pl3) ql3Var;
                    ml3 ml3Var3 = pl3Var2.b;
                    boolean z3 = downloadViewInflater.b;
                    ArrayList arrayList3 = new ArrayList(r3d.q(lc00VarA, 10));
                    ListIterator listIterator3 = lc00VarA.listIterator(0);
                    while (true) {
                        paw pawVar3 = (paw) listIterator3;
                        if (!pawVar3.hasNext() || (view = (View) pawVar3.next()) == null) {
                            break;
                        }
                        if (!(view instanceof b)) {
                            if (!(view instanceof org.xplatform.app_update.impl.presentation.update_screen.views.content.download.label.b)) {
                                if (!(view instanceof org.xplatform.app_update.impl.presentation.update_screen.views.content.download.value.b)) {
                                    break;
                                }
                                org.xplatform.app_update.impl.presentation.update_screen.views.content.download.value.b bVar8 = (org.xplatform.app_update.impl.presentation.update_screen.views.content.download.value.b) view;
                                qn3 qn3Var7 = new qn3();
                                qn3Var7.f29013a = -2;
                                qn3Var7.b = -2;
                                if ((ml3Var3 instanceof il3) || (ml3Var3 instanceof jl3)) {
                                    qn3Var7.c = R.id.downloadBarContainer;
                                    qn3Var7.e = R.id.downloadBarContainer;
                                    qn3Var7.h = R.id.downloadBarContainer;
                                    qn3Var7.f = R.id.downloadBarContainer;
                                } else {
                                    qn3Var7.c = 0;
                                    qn3Var7.e = R.id.downloadBarContainer;
                                    qn3Var7.h = R.id.downloadBarContainer;
                                    qn3Var7.f = 0;
                                    qn3Var7.j = z3 ? 0.0f : 1.0f;
                                    qn3Var7.i = 0.0f;
                                }
                                bVar8.setViewLayoutParams(qn3Var7.a());
                                downloadViewInflater.c(bVar8, pl3Var2);
                                fcl.f9318a.getClass();
                                bVar8.setDownloadBarType(pek.l(ml3Var3));
                            } else {
                                org.xplatform.app_update.impl.presentation.update_screen.views.content.download.label.b bVar9 = (org.xplatform.app_update.impl.presentation.update_screen.views.content.download.label.b) view;
                                qn3 qn3Var8 = new qn3();
                                qn3Var8.f29013a = 0;
                                qn3Var8.b = -2;
                                qn3Var8.c = 0;
                                qn3Var8.e = R.id.downloadBarContainer;
                                qn3Var8.h = R.id.downloadBarContainer;
                                qn3Var8.g = R.id.downloadBarContainer;
                                qn3Var8.i = 0.0f;
                                if (!(ml3Var3 instanceof jl3)) {
                                    qn3Var8.j = z3 ? 1.0f : 0.0f;
                                }
                                if (!(ml3Var3 instanceof ll3)) {
                                    qn3Var8.n = i3;
                                }
                                bVar9.setViewLayoutParams(qn3Var8.a());
                                if (!(ml3Var3 instanceof il3)) {
                                    int color = constraintLayout.getContext().getColor(R.color.static_white_80);
                                    int color2 = constraintLayout.getContext().getColor(R.color.static_white_60);
                                    if (color != -1 && color != bVar9.i) {
                                        bVar9.i = color;
                                    }
                                    if (color2 != -1 && color2 != bVar9.j) {
                                        bVar9.j = color2;
                                    }
                                }
                                downloadViewInflater.b(bVar9, pl3Var2);
                                bVar9.setContent(pl3Var2.f27162a);
                            }
                        } else {
                            b bVar10 = (b) view;
                            qn3 qn3Var9 = new qn3();
                            qn3Var9.f29013a = 0;
                            qn3Var9.b = -2;
                            qn3Var9.c = 0;
                            qn3Var9.e = 0;
                            qn3Var9.h = 0;
                            qn3Var9.f = 0;
                            qn3Var9.n = R.dimen.space_40;
                            qn3Var9.m = i3;
                            qn3Var9.k = i3;
                            qn3Var9.i = 1.0f;
                            bVar10.setContainerLayoutParams(qn3Var9.a());
                            bVar10.a(ml3Var3, i4);
                        }
                        arrayList3.add(Unit.f46060a);
                        i4 = R.color.static_white_10;
                        i3 = R.dimen.space_16;
                    }
                }
            }
            ewm0.p(constraintLayout, lc00VarA);
        }
    }

    public final void v(int i) {
        if (this.u > i) {
            return;
        }
        this.u = i;
        b bVar = this.r;
        if (bVar != null) {
            bVar.setProgress(i);
        }
        org.xplatform.app_update.impl.presentation.update_screen.views.content.download.value.b bVar2 = this.s;
        if (bVar2 != null) {
            bVar2.setContent(i);
        }
        org.xplatform.app_update.impl.presentation.update_screen.views.content.download.label.b bVar3 = this.t;
        if (bVar3 != null) {
            bVar3.j();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DownloadView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DownloadView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}

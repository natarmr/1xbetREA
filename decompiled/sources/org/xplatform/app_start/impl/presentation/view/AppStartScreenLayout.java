package org.xplatform.app_start.impl.presentation.view;

import a.a8z;
import a.abk0;
import a.ah3;
import a.bbk0;
import a.dg3;
import a.dh3;
import a.dx00;
import a.gbk0;
import a.gg3;
import a.hbk0;
import a.hg3;
import a.ig3;
import a.ix80;
import a.kj3;
import a.lc00;
import a.maz;
import a.mym0;
import a.n0o0;
import a.nh3;
import a.paw;
import a.qg3;
import a.r3d;
import a.sj3;
import a.t9f;
import a.u0d;
import a.wez;
import a.wg3;
import a.yg3;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.collections.a;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;
import org.xplatform.app_start.impl.presentation.view.AppStartScreenLayout;
import org.xplatform.app_start.impl.presentation.view.content.logo.b;
import org.xplatform.ui_core.viewcomponents.smart_background.e;

/* JADX INFO: loaded from: classes3.dex */
public final class AppStartScreenLayout extends ConstraintLayout {
    public static final /* synthetic */ int B = 0;
    public final n0o0 A;
    public final a8z q;
    public final a8z r;
    public final a8z s;
    public final n0o0 t;
    public hbk0 u;
    public int v;
    public ah3 w;
    public final n0o0 x;
    public final n0o0 y;
    public final n0o0 z;

    /* JADX WARN: Illegal instructions before constructor call */
    public AppStartScreenLayout(Context context, AttributeSet attributeSet, int i) {
        final byte b = 2;
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        final byte b2 = 0;
        super(context, attributeSet, 0);
        Function0 function0 = new Function0(this) { // from class: a.ch3
            public final /* synthetic */ AppStartScreenLayout b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                AppStartScreenLayout appStartScreenLayout = this.b;
                switch (b3) {
                    case 0:
                        int i2 = AppStartScreenLayout.B;
                        return new hg3(appStartScreenLayout);
                    case 1:
                        int i3 = AppStartScreenLayout.B;
                        return new abk0(appStartScreenLayout);
                    case 2:
                        int i4 = AppStartScreenLayout.B;
                        return new dg3(appStartScreenLayout);
                    case 3:
                        int i5 = AppStartScreenLayout.B;
                        return (org.xplatform.app_start.impl.presentation.view.content.version.b) appStartScreenLayout.findViewById(R.id.appVersion);
                    case 4:
                        int i6 = AppStartScreenLayout.B;
                        return (org.xplatform.app_start.impl.presentation.view.content.partner.b) appStartScreenLayout.findViewById(R.id.partner);
                    case 5:
                        int i7 = AppStartScreenLayout.B;
                        return (org.xplatform.app_start.impl.presentation.view.content.loader.b) appStartScreenLayout.findViewById(R.id.loader);
                    default:
                        int i8 = AppStartScreenLayout.B;
                        return (org.xplatform.app_start.impl.presentation.view.content.logo.b) appStartScreenLayout.findViewById(R.id.appLogo);
                }
            }
        };
        wez wezVar = wez.b;
        this.q = maz.a(wezVar, function0);
        final byte b3 = 1;
        this.r = maz.a(wezVar, new Function0(this) { // from class: a.ch3
            public final /* synthetic */ AppStartScreenLayout b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b4 = b3;
                AppStartScreenLayout appStartScreenLayout = this.b;
                switch (b4) {
                    case 0:
                        int i2 = AppStartScreenLayout.B;
                        return new hg3(appStartScreenLayout);
                    case 1:
                        int i3 = AppStartScreenLayout.B;
                        return new abk0(appStartScreenLayout);
                    case 2:
                        int i4 = AppStartScreenLayout.B;
                        return new dg3(appStartScreenLayout);
                    case 3:
                        int i5 = AppStartScreenLayout.B;
                        return (org.xplatform.app_start.impl.presentation.view.content.version.b) appStartScreenLayout.findViewById(R.id.appVersion);
                    case 4:
                        int i6 = AppStartScreenLayout.B;
                        return (org.xplatform.app_start.impl.presentation.view.content.partner.b) appStartScreenLayout.findViewById(R.id.partner);
                    case 5:
                        int i7 = AppStartScreenLayout.B;
                        return (org.xplatform.app_start.impl.presentation.view.content.loader.b) appStartScreenLayout.findViewById(R.id.loader);
                    default:
                        int i8 = AppStartScreenLayout.B;
                        return (org.xplatform.app_start.impl.presentation.view.content.logo.b) appStartScreenLayout.findViewById(R.id.appLogo);
                }
            }
        });
        this.s = maz.a(wezVar, new Function0(this) { // from class: a.ch3
            public final /* synthetic */ AppStartScreenLayout b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b4 = b;
                AppStartScreenLayout appStartScreenLayout = this.b;
                switch (b4) {
                    case 0:
                        int i2 = AppStartScreenLayout.B;
                        return new hg3(appStartScreenLayout);
                    case 1:
                        int i3 = AppStartScreenLayout.B;
                        return new abk0(appStartScreenLayout);
                    case 2:
                        int i4 = AppStartScreenLayout.B;
                        return new dg3(appStartScreenLayout);
                    case 3:
                        int i5 = AppStartScreenLayout.B;
                        return (org.xplatform.app_start.impl.presentation.view.content.version.b) appStartScreenLayout.findViewById(R.id.appVersion);
                    case 4:
                        int i6 = AppStartScreenLayout.B;
                        return (org.xplatform.app_start.impl.presentation.view.content.partner.b) appStartScreenLayout.findViewById(R.id.partner);
                    case 5:
                        int i7 = AppStartScreenLayout.B;
                        return (org.xplatform.app_start.impl.presentation.view.content.loader.b) appStartScreenLayout.findViewById(R.id.loader);
                    default:
                        int i8 = AppStartScreenLayout.B;
                        return (org.xplatform.app_start.impl.presentation.view.content.logo.b) appStartScreenLayout.findViewById(R.id.appLogo);
                }
            }
        });
        final byte b4 = 4;
        this.t = maz.b(new yg3(context, b4));
        this.v = -1;
        final byte b5 = 3;
        this.x = maz.b(new Function0(this) { // from class: a.ch3
            public final /* synthetic */ AppStartScreenLayout b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b6 = b5;
                AppStartScreenLayout appStartScreenLayout = this.b;
                switch (b6) {
                    case 0:
                        int i2 = AppStartScreenLayout.B;
                        return new hg3(appStartScreenLayout);
                    case 1:
                        int i3 = AppStartScreenLayout.B;
                        return new abk0(appStartScreenLayout);
                    case 2:
                        int i4 = AppStartScreenLayout.B;
                        return new dg3(appStartScreenLayout);
                    case 3:
                        int i5 = AppStartScreenLayout.B;
                        return (org.xplatform.app_start.impl.presentation.view.content.version.b) appStartScreenLayout.findViewById(R.id.appVersion);
                    case 4:
                        int i6 = AppStartScreenLayout.B;
                        return (org.xplatform.app_start.impl.presentation.view.content.partner.b) appStartScreenLayout.findViewById(R.id.partner);
                    case 5:
                        int i7 = AppStartScreenLayout.B;
                        return (org.xplatform.app_start.impl.presentation.view.content.loader.b) appStartScreenLayout.findViewById(R.id.loader);
                    default:
                        int i8 = AppStartScreenLayout.B;
                        return (org.xplatform.app_start.impl.presentation.view.content.logo.b) appStartScreenLayout.findViewById(R.id.appLogo);
                }
            }
        });
        this.y = maz.b(new Function0(this) { // from class: a.ch3
            public final /* synthetic */ AppStartScreenLayout b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b6 = b4;
                AppStartScreenLayout appStartScreenLayout = this.b;
                switch (b6) {
                    case 0:
                        int i2 = AppStartScreenLayout.B;
                        return new hg3(appStartScreenLayout);
                    case 1:
                        int i3 = AppStartScreenLayout.B;
                        return new abk0(appStartScreenLayout);
                    case 2:
                        int i4 = AppStartScreenLayout.B;
                        return new dg3(appStartScreenLayout);
                    case 3:
                        int i5 = AppStartScreenLayout.B;
                        return (org.xplatform.app_start.impl.presentation.view.content.version.b) appStartScreenLayout.findViewById(R.id.appVersion);
                    case 4:
                        int i6 = AppStartScreenLayout.B;
                        return (org.xplatform.app_start.impl.presentation.view.content.partner.b) appStartScreenLayout.findViewById(R.id.partner);
                    case 5:
                        int i7 = AppStartScreenLayout.B;
                        return (org.xplatform.app_start.impl.presentation.view.content.loader.b) appStartScreenLayout.findViewById(R.id.loader);
                    default:
                        int i8 = AppStartScreenLayout.B;
                        return (org.xplatform.app_start.impl.presentation.view.content.logo.b) appStartScreenLayout.findViewById(R.id.appLogo);
                }
            }
        });
        final byte b6 = 5;
        this.z = maz.b(new Function0(this) { // from class: a.ch3
            public final /* synthetic */ AppStartScreenLayout b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b7 = b6;
                AppStartScreenLayout appStartScreenLayout = this.b;
                switch (b7) {
                    case 0:
                        int i2 = AppStartScreenLayout.B;
                        return new hg3(appStartScreenLayout);
                    case 1:
                        int i3 = AppStartScreenLayout.B;
                        return new abk0(appStartScreenLayout);
                    case 2:
                        int i4 = AppStartScreenLayout.B;
                        return new dg3(appStartScreenLayout);
                    case 3:
                        int i5 = AppStartScreenLayout.B;
                        return (org.xplatform.app_start.impl.presentation.view.content.version.b) appStartScreenLayout.findViewById(R.id.appVersion);
                    case 4:
                        int i6 = AppStartScreenLayout.B;
                        return (org.xplatform.app_start.impl.presentation.view.content.partner.b) appStartScreenLayout.findViewById(R.id.partner);
                    case 5:
                        int i7 = AppStartScreenLayout.B;
                        return (org.xplatform.app_start.impl.presentation.view.content.loader.b) appStartScreenLayout.findViewById(R.id.loader);
                    default:
                        int i8 = AppStartScreenLayout.B;
                        return (org.xplatform.app_start.impl.presentation.view.content.logo.b) appStartScreenLayout.findViewById(R.id.appLogo);
                }
            }
        });
        final byte b7 = 6;
        this.A = maz.b(new Function0(this) { // from class: a.ch3
            public final /* synthetic */ AppStartScreenLayout b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b8 = b7;
                AppStartScreenLayout appStartScreenLayout = this.b;
                switch (b8) {
                    case 0:
                        int i2 = AppStartScreenLayout.B;
                        return new hg3(appStartScreenLayout);
                    case 1:
                        int i3 = AppStartScreenLayout.B;
                        return new abk0(appStartScreenLayout);
                    case 2:
                        int i4 = AppStartScreenLayout.B;
                        return new dg3(appStartScreenLayout);
                    case 3:
                        int i5 = AppStartScreenLayout.B;
                        return (org.xplatform.app_start.impl.presentation.view.content.version.b) appStartScreenLayout.findViewById(R.id.appVersion);
                    case 4:
                        int i6 = AppStartScreenLayout.B;
                        return (org.xplatform.app_start.impl.presentation.view.content.partner.b) appStartScreenLayout.findViewById(R.id.partner);
                    case 5:
                        int i7 = AppStartScreenLayout.B;
                        return (org.xplatform.app_start.impl.presentation.view.content.loader.b) appStartScreenLayout.findViewById(R.id.loader);
                    default:
                        int i8 = AppStartScreenLayout.B;
                        return (org.xplatform.app_start.impl.presentation.view.content.logo.b) appStartScreenLayout.findViewById(R.id.appLogo);
                }
            }
        });
    }

    private final b getAppLogo() {
        return (b) this.A.getValue();
    }

    private final hg3 getAppStartContentFacade() {
        return (hg3) this.q.getValue();
    }

    private final org.xplatform.app_start.impl.presentation.view.content.version.b getAppVersion() {
        return (org.xplatform.app_start.impl.presentation.view.content.version.b) this.x.getValue();
    }

    private final dg3 getBlockOverlay() {
        return (dg3) this.s.getValue();
    }

    private final org.xplatform.app_start.impl.presentation.view.content.loader.b getLoader() {
        return (org.xplatform.app_start.impl.presentation.view.content.loader.b) this.z.getValue();
    }

    private final org.xplatform.app_start.impl.presentation.view.content.partner.b getPartner() {
        return (org.xplatform.app_start.impl.presentation.view.content.partner.b) this.y.getValue();
    }

    private final abk0 getSmartBackgroundInflater() {
        return (abk0) this.r.getValue();
    }

    public final void setBottomContentTranslationY(float f) {
        org.xplatform.app_start.impl.presentation.view.content.loader.b loader;
        ah3 ah3Var = this.w;
        int i = ah3Var == null ? -1 : dh3.f6075a[ah3Var.ordinal()];
        if (i != -1) {
            if (i == 1) {
                org.xplatform.app_start.impl.presentation.view.content.version.b appVersion = getAppVersion();
                if (appVersion != null) {
                    appVersion.setTranslationY(f);
                }
                org.xplatform.app_start.impl.presentation.view.content.partner.b partner = getPartner();
                if (partner != null) {
                    partner.setTranslationY(f);
                    return;
                }
                return;
            }
            if (i != 2) {
                if (i == 3) {
                    org.xplatform.app_start.impl.presentation.view.content.version.b appVersion2 = getAppVersion();
                    if (appVersion2 != null) {
                        appVersion2.setTranslationY(f);
                    }
                    org.xplatform.app_start.impl.presentation.view.content.partner.b partner2 = getPartner();
                    if (partner2 != null) {
                        partner2.setTranslationY(f);
                    }
                    if (getPartner() == null || (loader = getLoader()) == null) {
                        return;
                    }
                    loader.setTranslationY(f);
                    return;
                }
                if (i != 4 && i != 5) {
                    t9f.b();
                    return;
                }
                org.xplatform.app_start.impl.presentation.view.content.version.b appVersion3 = getAppVersion();
                if (appVersion3 != null) {
                    appVersion3.setTranslationY(f);
                }
                org.xplatform.app_start.impl.presentation.view.content.partner.b partner3 = getPartner();
                if (partner3 != null) {
                    partner3.setTranslationY(f);
                }
                org.xplatform.app_start.impl.presentation.view.content.loader.b loader2 = getLoader();
                if (loader2 != null) {
                    loader2.setTranslationY(f);
                    return;
                }
                return;
            }
        }
        org.xplatform.app_start.impl.presentation.view.content.version.b appVersion4 = getAppVersion();
        if (appVersion4 != null) {
            appVersion4.setTranslationY(f);
        }
        org.xplatform.app_start.impl.presentation.view.content.partner.b partner4 = getPartner();
        if (partner4 != null) {
            partner4.setTranslationY(f);
        }
        if (((Boolean) this.t.getValue()).booleanValue()) {
            org.xplatform.app_start.impl.presentation.view.content.loader.b loader3 = getLoader();
            if (loader3 != null) {
                loader3.setTranslationY(f);
            }
            b appLogo = getAppLogo();
            if (appLogo != null) {
                appLogo.setTranslationY(f);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0054  */
    /* JADX WARN: Code duplicated, block: B:23:0x0069  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:39:0x00bd  */
    public final void u(nh3 nh3Var, qg3 qg3Var) {
        View viewM;
        Unit unit;
        View viewM2;
        Unit unit2;
        Unit unit3;
        Unit unit4;
        boolean z;
        Unit unit5;
        boolean z2;
        Unit unit6;
        boolean z3;
        ListIterator listIterator;
        Unit unit7;
        boolean z4;
        org.xplatform.app_start.impl.presentation.view.content.partner.b bVar;
        b bVar2;
        nh3Var.getClass();
        ig3 ig3Var = nh3Var.b;
        hbk0 hbk0Var = nh3Var.f23514a;
        hbk0 hbk0Var2 = this.u;
        if (hbk0Var2 == null) {
            getSmartBackgroundInflater().a(hbk0Var, qg3Var);
            this.u = hbk0Var;
        } else if (!hbk0Var2.equals(hbk0Var)) {
            this.u = hbk0Var;
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
                    eVar.setOnPlayerReadyListener(qg3Var);
                    requestLayout();
                } else {
                    e eVar2 = viewM3 instanceof e ? (e) viewM3 : null;
                    if (eVar2 != null) {
                        gbk0 gbk0Var2 = (gbk0) hbk0Var;
                        eVar2.c(gbk0Var2.b, gbk0Var2.c);
                    }
                    if (eVar2 != null) {
                        eVar2.e();
                        unit2 = Unit.f46060a;
                    } else {
                        unit2 = null;
                    }
                    if (unit2 == null) {
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
                        eVar3.setOnPlayerReadyListener(qg3Var);
                        requestLayout();
                    }
                }
            } else if (hbk0Var instanceof bbk0) {
                View viewM4 = m(R.id.smart_background_image);
                if (viewM4 == null) {
                    Context context3 = getContext();
                    context3.getClass();
                    org.xplatform.ui_core.viewcomponents.smart_background.b bVar3 = new org.xplatform.ui_core.viewcomponents.smart_background.b(context3);
                    addView(bVar3, 0);
                    bVar3.setImageParams(((bbk0) hbk0Var).b);
                    viewM = m(R.id.smart_background_video);
                    if (viewM != null) {
                        removeView(viewM);
                    }
                    requestLayout();
                } else {
                    org.xplatform.ui_core.viewcomponents.smart_background.b bVar4 = viewM4 instanceof org.xplatform.ui_core.viewcomponents.smart_background.b ? (org.xplatform.ui_core.viewcomponents.smart_background.b) viewM4 : null;
                    if (bVar4 != null) {
                        bVar4.setImageParams(((bbk0) hbk0Var).b);
                        unit = Unit.f46060a;
                    } else {
                        unit = null;
                    }
                    if (unit == null) {
                        Context context4 = getContext();
                        context4.getClass();
                        org.xplatform.ui_core.viewcomponents.smart_background.b bVar5 = new org.xplatform.ui_core.viewcomponents.smart_background.b(context4);
                        addView(bVar5, 0);
                        bVar5.setImageParams(((bbk0) hbk0Var).b);
                        viewM = m(R.id.smart_background_video);
                        if (viewM != null) {
                            removeView(viewM);
                        }
                        requestLayout();
                    }
                }
            }
        }
        ah3 ah3Var = this.w;
        ah3 ah3Var2 = ig3Var.b;
        if (ah3Var != ah3Var2) {
            this.w = ah3Var2;
        }
        hg3 appStartContentFacade = getAppStartContentFacade();
        appStartContentFacade.getClass();
        ConstraintLayout constraintLayout = appStartContentFacade.f12999a;
        dx00 dx00Var = ig3Var.e;
        String str = ig3Var.f14717a;
        wg3 wg3Var = ig3Var.c;
        ix80 ix80Var = ig3Var.d;
        if (dx00Var != null && (bVar2 = (b) constraintLayout.findViewById(R.id.appLogo)) != null) {
            bVar2.setContent(dx00Var);
        }
        if (ix80Var != null && (bVar = (org.xplatform.app_start.impl.presentation.view.content.partner.b) constraintLayout.findViewById(R.id.partner)) != null) {
            bVar.setContent(ix80Var);
        }
        lc00 lc00VarB = a.b();
        if (constraintLayout.m(R.id.appVersion) == null) {
            Context context5 = constraintLayout.getContext();
            context5.getClass();
            lc00VarB.add(new org.xplatform.app_start.impl.presentation.view.content.version.b(context5));
        }
        int i = R.id.loader;
        if (wg3Var != null && constraintLayout.m(R.id.loader) == null) {
            Context context6 = constraintLayout.getContext();
            context6.getClass();
            lc00VarB.add(new org.xplatform.app_start.impl.presentation.view.content.loader.b(context6));
        }
        if (dx00Var != null && constraintLayout.m(R.id.appLogo) == null) {
            Context context7 = constraintLayout.getContext();
            context7.getClass();
            lc00VarB.add(new b(context7));
        }
        if (ix80Var != null && constraintLayout.m(R.id.partner) == null) {
            Context context8 = constraintLayout.getContext();
            context8.getClass();
            lc00VarB.add(new org.xplatform.app_start.impl.presentation.view.content.partner.b(context8));
        }
        lc00 lc00VarA = a.a(lc00VarB);
        ah3 ah3Var3 = ig3Var.b;
        int i2 = ah3Var3 == null ? -1 : gg3.f11233a[ah3Var3.ordinal()];
        if (i2 == -1) {
            if (constraintLayout.findViewById(R.id.appVersion) == null) {
                Context context9 = constraintLayout.getContext();
                context9.getClass();
                org.xplatform.app_start.impl.presentation.view.content.version.b bVar6 = new org.xplatform.app_start.impl.presentation.view.content.version.b(context9);
                kj3 kj3Var = new kj3();
                kj3Var.f18366a = R.id.appVersion;
                kj3Var.b = (short) -1;
                kj3Var.c = (short) -2;
                kj3Var.d = 0;
                kj3Var.f = 0;
                kj3Var.e = 0;
                kj3Var.h = 0;
                kj3Var.i = 1.0f;
                kj3Var.j = 1.0f;
                kj3Var.k = R.dimen.space_12;
                kj3Var.o = R.dimen.space_4;
                kj3Var.m = R.dimen.space_12;
                kj3Var.p = R.dimen.space_4;
                bVar6.setViewLayoutParams(kj3Var.a());
                bVar6.setContent(str);
                constraintLayout.addView(bVar6);
                return;
            }
            return;
        }
        if (i2 != 1) {
            int i3 = R.dimen.space_16;
            if (i2 == 2) {
                ArrayList arrayList = new ArrayList(r3d.q(lc00VarA, 10));
                ListIterator listIterator2 = lc00VarA.listIterator(0);
                while (true) {
                    paw pawVar = (paw) listIterator2;
                    if (!pawVar.hasNext()) {
                        mym0.g(constraintLayout, lc00VarA);
                        return;
                    }
                    View view = (View) pawVar.next();
                    if (view == null) {
                        return;
                    }
                    if (view instanceof org.xplatform.app_start.impl.presentation.view.content.loader.b) {
                        if (!lc00VarA.isEmpty()) {
                            ListIterator listIterator3 = lc00VarA.listIterator(0);
                            while (true) {
                                paw pawVar2 = (paw) listIterator3;
                                if (!pawVar2.hasNext()) {
                                    z = false;
                                    break;
                                } else if (((View) pawVar2.next()) instanceof org.xplatform.app_start.impl.presentation.view.content.partner.b) {
                                    z = true;
                                    break;
                                }
                            }
                        } else {
                            z = false;
                            break;
                        }
                        org.xplatform.app_start.impl.presentation.view.content.loader.b bVar7 = (org.xplatform.app_start.impl.presentation.view.content.loader.b) view;
                        kj3 kj3Var2 = new kj3();
                        kj3Var2.f18366a = R.id.loader;
                        kj3Var2.b = (short) -2;
                        kj3Var2.c = (short) -2;
                        kj3Var2.d = 0;
                        kj3Var2.e = 0;
                        kj3Var2.h = 0;
                        if (z) {
                            kj3Var2.g = R.id.partner;
                            kj3Var2.i = 1.0f;
                        } else {
                            kj3Var2.f = 0;
                            kj3Var2.i = 0.85f;
                        }
                        kj3Var2.o = R.dimen.space_16;
                        kj3Var2.p = R.dimen.space_16;
                        bVar7.setContainerLayoutParams(kj3Var2.a());
                        if (wg3Var != null) {
                            bVar7.setLoaderType(wg3Var);
                            unit4 = Unit.f46060a;
                        } else {
                            unit4 = null;
                        }
                    } else if (view instanceof org.xplatform.app_start.impl.presentation.view.content.partner.b) {
                        org.xplatform.app_start.impl.presentation.view.content.partner.b bVar8 = (org.xplatform.app_start.impl.presentation.view.content.partner.b) view;
                        kj3 kj3Var3 = new kj3();
                        kj3Var3.f18366a = R.id.partner;
                        kj3Var3.b = (short) -1;
                        kj3Var3.c = (short) -2;
                        kj3Var3.d = 0;
                        kj3Var3.g = R.id.appVersion;
                        kj3Var3.e = 0;
                        kj3Var3.h = 0;
                        kj3Var3.i = 1.0f;
                        bVar8.setContainerLayoutParams(kj3Var3.a());
                        if (ix80Var != null) {
                            bVar8.setContent(ix80Var);
                        }
                        unit4 = Unit.f46060a;
                    } else if (view instanceof b) {
                        b bVar9 = (b) view;
                        kj3 kj3Var4 = new kj3();
                        kj3Var4.f18366a = R.id.appLogo;
                        kj3Var4.d = 0;
                        kj3Var4.g = R.id.appVersion;
                        kj3Var4.e = 0;
                        kj3Var4.h = 0;
                        kj3Var4.i = 0.0f;
                        kj3Var4.l = R.dimen.space_72;
                        bVar9.setContainerLayoutParams(kj3Var4.a());
                        if (dx00Var != null) {
                            bVar9.setContent(dx00Var);
                        }
                        bVar9.setViewGravity(48);
                        unit4 = Unit.f46060a;
                    } else {
                        if (!(view instanceof org.xplatform.app_start.impl.presentation.view.content.version.b)) {
                            return;
                        }
                        org.xplatform.app_start.impl.presentation.view.content.version.b bVar10 = (org.xplatform.app_start.impl.presentation.view.content.version.b) view;
                        kj3 kj3Var5 = new kj3();
                        kj3Var5.f18366a = R.id.appVersion;
                        kj3Var5.b = (short) -1;
                        kj3Var5.c = (short) -2;
                        kj3Var5.d = 0;
                        kj3Var5.f = 0;
                        kj3Var5.e = 0;
                        kj3Var5.h = 0;
                        kj3Var5.i = 1.0f;
                        kj3Var5.j = 1.0f;
                        kj3Var5.k = R.dimen.space_12;
                        kj3Var5.o = R.dimen.space_4;
                        kj3Var5.m = R.dimen.space_12;
                        kj3Var5.p = R.dimen.space_4;
                        bVar10.setViewLayoutParams(kj3Var5.a());
                        bVar10.setContent(str);
                        unit4 = Unit.f46060a;
                    }
                    arrayList.add(unit4);
                }
            } else if (i2 == 3) {
                ArrayList arrayList2 = new ArrayList(r3d.q(lc00VarA, 10));
                ListIterator listIterator4 = lc00VarA.listIterator(0);
                while (true) {
                    paw pawVar3 = (paw) listIterator4;
                    if (!pawVar3.hasNext()) {
                        mym0.g(constraintLayout, lc00VarA);
                        return;
                    }
                    View view2 = (View) pawVar3.next();
                    if (view2 == null) {
                        return;
                    }
                    if (view2 instanceof org.xplatform.app_start.impl.presentation.view.content.loader.b) {
                        org.xplatform.app_start.impl.presentation.view.content.loader.b bVar11 = (org.xplatform.app_start.impl.presentation.view.content.loader.b) view2;
                        kj3 kj3Var6 = new kj3();
                        kj3Var6.f18366a = R.id.loader;
                        kj3Var6.b = (short) -2;
                        kj3Var6.c = (short) -2;
                        kj3Var6.d = 0;
                        kj3Var6.g = R.id.appVersion;
                        kj3Var6.e = 0;
                        kj3Var6.h = 0;
                        kj3Var6.i = 1.0f;
                        kj3Var6.o = R.dimen.space_16;
                        kj3Var6.p = R.dimen.space_16;
                        bVar11.setContainerLayoutParams(kj3Var6.a());
                        if (wg3Var != null) {
                            bVar11.setLoaderType(wg3Var);
                            unit5 = Unit.f46060a;
                        } else {
                            unit5 = null;
                        }
                    } else if (view2 instanceof org.xplatform.app_start.impl.presentation.view.content.partner.b) {
                        if (!lc00VarA.isEmpty()) {
                            ListIterator listIterator5 = lc00VarA.listIterator(0);
                            while (true) {
                                paw pawVar4 = (paw) listIterator5;
                                if (!pawVar4.hasNext()) {
                                    z2 = false;
                                    break;
                                } else if (((View) pawVar4.next()) instanceof org.xplatform.app_start.impl.presentation.view.content.loader.b) {
                                    z2 = true;
                                    break;
                                }
                            }
                        } else {
                            z2 = false;
                            break;
                        }
                        org.xplatform.app_start.impl.presentation.view.content.partner.b bVar12 = (org.xplatform.app_start.impl.presentation.view.content.partner.b) view2;
                        kj3 kj3Var7 = new kj3();
                        kj3Var7.f18366a = R.id.partner;
                        kj3Var7.b = (short) -1;
                        kj3Var7.c = (short) -2;
                        kj3Var7.d = 0;
                        kj3Var7.g = z2 ? R.id.loader : R.id.appVersion;
                        kj3Var7.e = 0;
                        kj3Var7.h = 0;
                        kj3Var7.i = 1.0f;
                        bVar12.setContainerLayoutParams(kj3Var7.a());
                        if (ix80Var != null) {
                            bVar12.setContent(ix80Var);
                        }
                        unit5 = Unit.f46060a;
                    } else if (view2 instanceof b) {
                        b bVar13 = (b) view2;
                        kj3 kj3Var8 = new kj3();
                        kj3Var8.f18366a = R.id.appLogo;
                        kj3Var8.d = 0;
                        kj3Var8.g = R.id.appVersion;
                        kj3Var8.e = 0;
                        kj3Var8.h = 0;
                        kj3Var8.i = 0.0f;
                        kj3Var8.l = R.dimen.space_72;
                        bVar13.setContainerLayoutParams(kj3Var8.a());
                        if (dx00Var != null) {
                            bVar13.setContent(dx00Var);
                        }
                        bVar13.setViewGravity(48);
                        unit5 = Unit.f46060a;
                    } else {
                        if (!(view2 instanceof org.xplatform.app_start.impl.presentation.view.content.version.b)) {
                            return;
                        }
                        org.xplatform.app_start.impl.presentation.view.content.version.b bVar14 = (org.xplatform.app_start.impl.presentation.view.content.version.b) view2;
                        kj3 kj3Var9 = new kj3();
                        kj3Var9.f18366a = R.id.appVersion;
                        kj3Var9.b = (short) -1;
                        kj3Var9.c = (short) -2;
                        kj3Var9.d = 0;
                        kj3Var9.f = 0;
                        kj3Var9.e = 0;
                        kj3Var9.h = 0;
                        kj3Var9.i = 1.0f;
                        kj3Var9.j = 1.0f;
                        kj3Var9.k = R.dimen.space_12;
                        kj3Var9.o = R.dimen.space_4;
                        kj3Var9.m = R.dimen.space_12;
                        kj3Var9.p = R.dimen.space_4;
                        bVar14.setViewLayoutParams(kj3Var9.a());
                        bVar14.setContent(str);
                        unit5 = Unit.f46060a;
                    }
                    arrayList2.add(unit5);
                }
            } else if (i2 == 4) {
                ArrayList arrayList3 = new ArrayList(r3d.q(lc00VarA, 10));
                ListIterator listIterator6 = lc00VarA.listIterator(0);
                while (true) {
                    paw pawVar5 = (paw) listIterator6;
                    if (!pawVar5.hasNext()) {
                        mym0.g(constraintLayout, lc00VarA);
                        return;
                    }
                    View view3 = (View) pawVar5.next();
                    if (view3 == null) {
                        return;
                    }
                    if (view3 instanceof org.xplatform.app_start.impl.presentation.view.content.loader.b) {
                        org.xplatform.app_start.impl.presentation.view.content.loader.b bVar15 = (org.xplatform.app_start.impl.presentation.view.content.loader.b) view3;
                        kj3 kj3Var10 = new kj3();
                        kj3Var10.f18366a = R.id.loader;
                        kj3Var10.b = (short) -2;
                        kj3Var10.c = (short) -2;
                        kj3Var10.d = 0;
                        kj3Var10.g = R.id.appVersion;
                        kj3Var10.e = 0;
                        kj3Var10.h = 0;
                        kj3Var10.i = 1.0f;
                        kj3Var10.o = i3;
                        kj3Var10.p = i3;
                        bVar15.setContainerLayoutParams(kj3Var10.a());
                        if (wg3Var != null) {
                            bVar15.setLoaderType(wg3Var);
                            unit6 = Unit.f46060a;
                        } else {
                            unit6 = null;
                        }
                    } else if (view3 instanceof org.xplatform.app_start.impl.presentation.view.content.partner.b) {
                        if (!lc00VarA.isEmpty()) {
                            ListIterator listIterator7 = lc00VarA.listIterator(0);
                            while (true) {
                                paw pawVar6 = (paw) listIterator7;
                                if (!pawVar6.hasNext()) {
                                    z3 = false;
                                    break;
                                } else if (((View) pawVar6.next()) instanceof org.xplatform.app_start.impl.presentation.view.content.loader.b) {
                                    z3 = true;
                                    break;
                                }
                            }
                        } else {
                            z3 = false;
                            break;
                        }
                        org.xplatform.app_start.impl.presentation.view.content.partner.b bVar16 = (org.xplatform.app_start.impl.presentation.view.content.partner.b) view3;
                        kj3 kj3Var11 = new kj3();
                        kj3Var11.f18366a = R.id.partner;
                        kj3Var11.b = (short) -1;
                        kj3Var11.c = (short) -2;
                        kj3Var11.d = 0;
                        kj3Var11.g = z3 ? R.id.loader : R.id.appVersion;
                        kj3Var11.e = 0;
                        kj3Var11.h = 0;
                        kj3Var11.i = 1.0f;
                        bVar16.setContainerLayoutParams(kj3Var11.a());
                        if (ix80Var != null) {
                            bVar16.setContent(ix80Var);
                        }
                        unit6 = Unit.f46060a;
                    } else if (view3 instanceof b) {
                        b bVar17 = (b) view3;
                        kj3 kj3Var12 = new kj3();
                        kj3Var12.f18366a = R.id.appLogo;
                        kj3Var12.d = 0;
                        kj3Var12.f = 0;
                        kj3Var12.e = 0;
                        kj3Var12.h = 0;
                        bVar17.setContainerLayoutParams(kj3Var12.a());
                        if (dx00Var != null) {
                            bVar17.setContent(dx00Var);
                        }
                        bVar17.setViewGravity(17);
                        unit6 = Unit.f46060a;
                    } else {
                        if (!(view3 instanceof org.xplatform.app_start.impl.presentation.view.content.version.b)) {
                            return;
                        }
                        org.xplatform.app_start.impl.presentation.view.content.version.b bVar18 = (org.xplatform.app_start.impl.presentation.view.content.version.b) view3;
                        kj3 kj3Var13 = new kj3();
                        kj3Var13.f18366a = R.id.appVersion;
                        kj3Var13.b = (short) -1;
                        kj3Var13.c = (short) -2;
                        kj3Var13.d = 0;
                        kj3Var13.f = 0;
                        kj3Var13.e = 0;
                        kj3Var13.h = 0;
                        kj3Var13.i = 1.0f;
                        kj3Var13.j = 1.0f;
                        kj3Var13.k = R.dimen.space_12;
                        kj3Var13.l = R.dimen.space_4;
                        kj3Var13.m = R.dimen.space_12;
                        kj3Var13.n = R.dimen.space_4;
                        bVar18.setViewLayoutParams(kj3Var13.a());
                        bVar18.setContent(str);
                        unit6 = Unit.f46060a;
                    }
                    arrayList3.add(unit6);
                    i3 = R.dimen.space_16;
                }
            } else {
                if (i2 != 5) {
                    t9f.b();
                    return;
                }
                ArrayList arrayList4 = new ArrayList(r3d.q(lc00VarA, 10));
                ListIterator listIterator8 = lc00VarA.listIterator(0);
                while (true) {
                    paw pawVar7 = (paw) listIterator8;
                    if (!pawVar7.hasNext()) {
                        mym0.g(constraintLayout, lc00VarA);
                        return;
                    }
                    View view4 = (View) pawVar7.next();
                    if (view4 == null) {
                        return;
                    }
                    if (view4 instanceof org.xplatform.app_start.impl.presentation.view.content.loader.b) {
                        org.xplatform.app_start.impl.presentation.view.content.loader.b bVar19 = (org.xplatform.app_start.impl.presentation.view.content.loader.b) view4;
                        kj3 kj3Var14 = new kj3();
                        kj3Var14.f18366a = R.id.loader;
                        kj3Var14.b = (short) -2;
                        kj3Var14.c = (short) -2;
                        kj3Var14.d = 0;
                        kj3Var14.f = R.id.appVersion;
                        kj3Var14.e = 0;
                        kj3Var14.h = 0;
                        bVar19.setContainerLayoutParams(kj3Var14.a());
                        listIterator = listIterator8;
                        sj3.M0(view4, Float.valueOf(bVar19.getContext().getResources().getDimension(R.dimen.space_24)), null, 13);
                        if (wg3Var != null) {
                            bVar19.setLoaderType(wg3Var);
                            unit7 = Unit.f46060a;
                        } else {
                            unit7 = null;
                        }
                    } else {
                        listIterator = listIterator8;
                        if (view4 instanceof org.xplatform.app_start.impl.presentation.view.content.partner.b) {
                            org.xplatform.app_start.impl.presentation.view.content.partner.b bVar20 = (org.xplatform.app_start.impl.presentation.view.content.partner.b) view4;
                            kj3 kj3Var15 = new kj3();
                            kj3Var15.f18366a = R.id.partner;
                            kj3Var15.b = (short) -1;
                            kj3Var15.c = (short) -2;
                            kj3Var15.d = 0;
                            kj3Var15.g = R.id.appVersion;
                            kj3Var15.e = 0;
                            kj3Var15.h = 0;
                            kj3Var15.i = 1.0f;
                            bVar20.setContainerLayoutParams(kj3Var15.a());
                            if (ix80Var != null) {
                                bVar20.setContent(ix80Var);
                            }
                            unit7 = Unit.f46060a;
                        } else if (view4 instanceof b) {
                            if (!lc00VarA.isEmpty()) {
                                ListIterator listIterator9 = lc00VarA.listIterator(0);
                                while (true) {
                                    paw pawVar8 = (paw) listIterator9;
                                    if (!pawVar8.hasNext()) {
                                        z4 = false;
                                        break;
                                    } else if (((View) pawVar8.next()) instanceof org.xplatform.app_start.impl.presentation.view.content.loader.b) {
                                        z4 = true;
                                        break;
                                    }
                                }
                            } else {
                                z4 = false;
                                break;
                            }
                            b bVar21 = (b) view4;
                            kj3 kj3Var16 = new kj3();
                            kj3Var16.f18366a = R.id.appLogo;
                            kj3Var16.d = 0;
                            if (z4) {
                                kj3Var16.i = 1.0f;
                                kj3Var16.n = R.dimen.space_24;
                                kj3Var16.g = R.id.loader;
                            } else {
                                kj3Var16.g = R.id.appVersion;
                            }
                            kj3Var16.e = 0;
                            kj3Var16.h = 0;
                            bVar21.setContainerLayoutParams(kj3Var16.a());
                            if (dx00Var != null) {
                                bVar21.setContent(dx00Var);
                            }
                            bVar21.setViewGravity(80);
                            unit7 = Unit.f46060a;
                        } else {
                            if (!(view4 instanceof org.xplatform.app_start.impl.presentation.view.content.version.b)) {
                                return;
                            }
                            org.xplatform.app_start.impl.presentation.view.content.version.b bVar22 = (org.xplatform.app_start.impl.presentation.view.content.version.b) view4;
                            kj3 kj3Var17 = new kj3();
                            kj3Var17.f18366a = R.id.appVersion;
                            kj3Var17.b = (short) -1;
                            kj3Var17.c = (short) -2;
                            kj3Var17.d = 0;
                            kj3Var17.f = 0;
                            kj3Var17.e = 0;
                            kj3Var17.h = 0;
                            kj3Var17.i = 1.0f;
                            kj3Var17.j = 1.0f;
                            kj3Var17.k = R.dimen.space_12;
                            kj3Var17.o = R.dimen.space_4;
                            kj3Var17.m = R.dimen.space_12;
                            kj3Var17.p = R.dimen.space_4;
                            bVar22.setViewLayoutParams(kj3Var17.a());
                            bVar22.setContent(str);
                            unit7 = Unit.f46060a;
                        }
                    }
                    arrayList4.add(unit7);
                    listIterator8 = listIterator;
                }
            }
        } else {
            ArrayList arrayList5 = new ArrayList(r3d.q(lc00VarA, 10));
            ListIterator listIterator10 = lc00VarA.listIterator(0);
            while (true) {
                paw pawVar9 = (paw) listIterator10;
                if (!pawVar9.hasNext()) {
                    mym0.g(constraintLayout, lc00VarA);
                    return;
                }
                View view5 = (View) pawVar9.next();
                if (view5 == null) {
                    return;
                }
                if (view5 instanceof org.xplatform.app_start.impl.presentation.view.content.loader.b) {
                    org.xplatform.app_start.impl.presentation.view.content.loader.b bVar23 = (org.xplatform.app_start.impl.presentation.view.content.loader.b) view5;
                    kj3 kj3Var18 = new kj3();
                    kj3Var18.f18366a = i;
                    kj3Var18.b = (short) -2;
                    kj3Var18.c = (short) -2;
                    kj3Var18.d = 0;
                    kj3Var18.f = 0;
                    kj3Var18.e = 0;
                    kj3Var18.h = 0;
                    kj3Var18.i = 0.0f;
                    bVar23.setContainerLayoutParams(kj3Var18.a());
                    sj3.L0(view5, 0, bVar23.getContext().getResources().getDimensionPixelOffset(R.dimen.space_72), 0, 0, 13);
                    if (wg3Var != null) {
                        bVar23.setLoaderType(wg3Var);
                        unit3 = Unit.f46060a;
                    } else {
                        unit3 = null;
                    }
                } else if (view5 instanceof org.xplatform.app_start.impl.presentation.view.content.partner.b) {
                    org.xplatform.app_start.impl.presentation.view.content.partner.b bVar24 = (org.xplatform.app_start.impl.presentation.view.content.partner.b) view5;
                    kj3 kj3Var19 = new kj3();
                    kj3Var19.f18366a = R.id.partner;
                    kj3Var19.b = (short) -1;
                    kj3Var19.c = (short) -2;
                    kj3Var19.d = 0;
                    kj3Var19.g = R.id.appVersion;
                    kj3Var19.e = 0;
                    kj3Var19.h = 0;
                    kj3Var19.i = 1.0f;
                    bVar24.setContainerLayoutParams(kj3Var19.a());
                    if (ix80Var != null) {
                        bVar24.setContent(ix80Var);
                    }
                    unit3 = Unit.f46060a;
                } else if (view5 instanceof b) {
                    b bVar25 = (b) view5;
                    kj3 kj3Var20 = new kj3();
                    kj3Var20.f18366a = R.id.appLogo;
                    kj3Var20.d = 0;
                    kj3Var20.f = 0;
                    kj3Var20.e = 0;
                    kj3Var20.h = 0;
                    bVar25.setContainerLayoutParams(kj3Var20.a());
                    if (dx00Var != null) {
                        bVar25.setContent(dx00Var);
                    }
                    bVar25.setViewGravity(17);
                    unit3 = Unit.f46060a;
                } else {
                    if (!(view5 instanceof org.xplatform.app_start.impl.presentation.view.content.version.b)) {
                        return;
                    }
                    org.xplatform.app_start.impl.presentation.view.content.version.b bVar26 = (org.xplatform.app_start.impl.presentation.view.content.version.b) view5;
                    kj3 kj3Var21 = new kj3();
                    kj3Var21.f18366a = R.id.appVersion;
                    kj3Var21.b = (short) -1;
                    kj3Var21.c = (short) -2;
                    kj3Var21.d = 0;
                    kj3Var21.f = 0;
                    kj3Var21.e = 0;
                    kj3Var21.h = 0;
                    kj3Var21.i = 1.0f;
                    kj3Var21.k = R.dimen.space_12;
                    kj3Var21.o = R.dimen.space_4;
                    kj3Var21.m = R.dimen.space_12;
                    kj3Var21.p = R.dimen.space_4;
                    bVar26.setViewLayoutParams(kj3Var21.a());
                    bVar26.setContent(str);
                    unit3 = Unit.f46060a;
                }
                arrayList5.add(unit3);
                i = R.id.loader;
            }
        }
    }

    public final void v() {
        dg3 blockOverlay = getBlockOverlay();
        ((ImageView) blockOverlay.b.getValue()).setVisibility(8);
        List list = u0d.f34849a;
        u0d.a((ImageView) blockOverlay.b.getValue());
    }

    public final void w(String str) {
        dg3 blockOverlay = getBlockOverlay();
        blockOverlay.getClass();
        n0o0 n0o0Var = blockOverlay.b;
        ((ImageView) n0o0Var.getValue()).setVisibility(0);
        List list = u0d.f34849a;
        u0d.d((ImageView) n0o0Var.getValue(), str, null, null, 60);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AppStartScreenLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AppStartScreenLayout(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}

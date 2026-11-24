package org.xplatform.uikit.components.banner_collection;

import a.aq5;
import a.bq5;
import a.bqd0;
import a.cl5;
import a.dp5;
import a.ep5;
import a.jp5;
import a.knl;
import a.maz;
import a.n0o0;
import a.q3d;
import a.rr5;
import a.sp5;
import a.t9f;
import a.tp5;
import a.tr5;
import a.up5;
import a.xdr;
import a.zp5;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;
import org.xplatform.uikit.components.banner_collection.DsBannerCollection;
import org.xplatform.uikit.components.views.OptimizedScrollRecyclerView;
import org.xplatform.uikit.utils.recycerview.CenterViewLayoutManager;

/* JADX INFO: loaded from: classes6.dex */
public final class DsBannerCollection extends OptimizedScrollRecyclerView {
    public static final /* synthetic */ int t2 = 0;
    public final int o2;
    public final int p2;
    public final dp5 q2;
    public final n0o0 r2;
    public final n0o0 s2;

    /* JADX WARN: Illegal instructions before constructor call */
    public DsBannerCollection(Context context, AttributeSet attributeSet, int i) {
        Object obj = null;
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, R.attr.bannerCollectionStyle);
        this.o2 = context.getResources().getDimensionPixelSize(R.dimen.medium_horizontal_margin_dynamic);
        this.p2 = context.getResources().getDimensionPixelSize(R.dimen.medium_horizontal_margin_dynamic);
        this.q2 = dp5.THEME;
        final byte b = 0;
        this.r2 = maz.b(new Function0(this) { // from class: a.wsl
            public final /* synthetic */ DsBannerCollection b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b2 = b;
                DsBannerCollection dsBannerCollection = this.b;
                switch (b2) {
                    case 0:
                        return new jp5(dsBannerCollection.q2);
                    default:
                        return new sp5(dsBannerCollection.q2);
                }
            }
        });
        final byte b2 = 1;
        this.s2 = maz.b(new Function0(this) { // from class: a.wsl
            public final /* synthetic */ DsBannerCollection b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                DsBannerCollection dsBannerCollection = this.b;
                switch (b3) {
                    case 0:
                        return new jp5(dsBannerCollection.q2);
                    default:
                        return new sp5(dsBannerCollection.q2);
                }
            }
        });
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bqd0.g, 0, 0);
        cl5 cl5Var = dp5.b;
        int i2 = typedArrayObtainStyledAttributes.getInt(0, 0);
        cl5Var.getClass();
        for (Object obj2 : dp5.e) {
            if (((dp5) obj2).f6445a == i2) {
                obj = obj2;
                break;
            }
        }
        dp5 dp5Var = (dp5) obj;
        this.q2 = dp5Var == null ? dp5.THEME : dp5Var;
        typedArrayObtainStyledAttributes.recycle();
    }

    public static final void H0(DsBannerCollection dsBannerCollection, Function0 function0) {
        while (dsBannerCollection.getItemDecorationCount() > 0) {
            dsBannerCollection.t0();
        }
        dsBannerCollection.m(dsBannerCollection.getBannerCollectionItemDecorator());
        function0.invoke();
    }

    public static final void I0(DsBannerCollection dsBannerCollection, Function0 function0) {
        while (dsBannerCollection.getItemDecorationCount() > 0) {
            dsBannerCollection.t0();
        }
        dsBannerCollection.m(dsBannerCollection.getBannerCollectionShimmersDecorator());
        function0.invoke();
    }

    public static void J0(final DsBannerCollection dsBannerCollection, bq5 bq5Var) {
        final knl knlVar = new knl((byte) 15);
        final byte b = 0;
        if (!(bq5Var instanceof aq5)) {
            if (!(bq5Var instanceof zp5)) {
                t9f.b();
                return;
            }
            zp5 zp5Var = (zp5) bq5Var;
            if (!(dsBannerCollection.getAdapter() instanceof jp5)) {
                dsBannerCollection.setAdapter(dsBannerCollection.getBannerCollectionItemsAdapter());
                Context context = dsBannerCollection.getContext();
                context.getClass();
                dsBannerCollection.setLayoutManager(new CenterViewLayoutManager(context, q3d.j(rr5.class, tr5.class)));
            }
            dsBannerCollection.getBannerCollectionItemsAdapter().H(zp5Var.f44743a, new Runnable(dsBannerCollection) { // from class: a.xsl
                public final /* synthetic */ DsBannerCollection b;

                {
                    this.b = dsBannerCollection;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    byte b2 = b;
                    Function0 function0 = knlVar;
                    DsBannerCollection dsBannerCollection2 = this.b;
                    switch (b2) {
                        case 0:
                            DsBannerCollection.H0(dsBannerCollection2, function0);
                            break;
                        default:
                            DsBannerCollection.I0(dsBannerCollection2, function0);
                            break;
                    }
                }
            });
            return;
        }
        up5 up5Var = ((aq5) bq5Var).f1281a;
        int i = up5Var.b;
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(new up5(up5Var.f36046a, i));
        }
        if (!(dsBannerCollection.getAdapter() instanceof sp5)) {
            dsBannerCollection.setLayoutManager(new LinearLayoutManager(dsBannerCollection.getContext(), 0, false));
            dsBannerCollection.setAdapter(dsBannerCollection.getBannerCollectionShimmersAdapter());
        }
        final byte b2 = 1;
        dsBannerCollection.getBannerCollectionShimmersAdapter().H(arrayList, new Runnable(dsBannerCollection) { // from class: a.xsl
            public final /* synthetic */ DsBannerCollection b;

            {
                this.b = dsBannerCollection;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b3 = b2;
                Function0 function0 = knlVar;
                DsBannerCollection dsBannerCollection2 = this.b;
                switch (b3) {
                    case 0:
                        DsBannerCollection.H0(dsBannerCollection2, function0);
                        break;
                    default:
                        DsBannerCollection.I0(dsBannerCollection2, function0);
                        break;
                }
            }
        });
    }

    private final ep5 getBannerCollectionItemDecorator() {
        Resources resources = getResources();
        resources.getClass();
        return new ep5(resources, this.o2, this.p2);
    }

    private final jp5 getBannerCollectionItemsAdapter() {
        return (jp5) this.r2.getValue();
    }

    private final sp5 getBannerCollectionShimmersAdapter() {
        return (sp5) this.s2.getValue();
    }

    private final tp5 getBannerCollectionShimmersDecorator() {
        Resources resources = getResources();
        resources.getClass();
        return new tp5(resources, this.o2, this.p2);
    }

    public final void setOnItemClickListener(xdr xdrVar) {
        xdrVar.getClass();
        getBannerCollectionItemsAdapter().g = xdrVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsBannerCollection(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsBannerCollection(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}

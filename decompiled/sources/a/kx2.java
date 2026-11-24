package a;

import android.content.res.Resources;
import android.view.View;
import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.statistic.stage.impl.stagetable.presentation.common.NonScrollableRecyclerView;
import org.xplatform.ui_core.viewcomponents.views.scrollable_table.table_view.TableViewImpl;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class kx2 extends rer implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f19031a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kx2(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.f19031a = b;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        bby bbyVar;
        bby bbyVar2;
        bby bbyVar3;
        bby bbyVar4;
        View viewFindViewById;
        byte b = 2;
        yje yjeVar = null;
        switch (this.f19031a) {
            case 0:
                if (obj != null) {
                    hny.b();
                    return null;
                }
                AndroidComposeView androidComposeView = (AndroidComposeView) this.receiver;
                Class cls = AndroidComposeView.j2;
                Resources resources = androidComposeView.getContext().getResources();
                return Boolean.valueOf(xx2.f41638a.a(androidComposeView, null, new whd(new z6k(resources.getDisplayMetrics().density, resources.getConfiguration().fontScale), ((h7k0) obj2).f12579a, (Function1) obj3)));
            case 1:
                Function1 function1 = ((q99) this.receiver).b;
                function1.getClass();
                vdx.E(function1, obj2, (CoroutineContext) obj3);
                return Unit.f46060a;
            case 2:
                Object obj4 = ((ztb) obj2).f44949a;
                Function1 function2 = ((q99) this.receiver).b;
                function2.getClass();
                Object objB = ztb.b(obj4);
                objB.getClass();
                vdx.E(function2, objB, (CoroutineContext) obj3);
                return Unit.f46060a;
            case 3:
                int iIntValue = ((Number) obj).intValue();
                int iIntValue2 = ((Number) obj2).intValue();
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                fae faeVar = (fae) this.receiver;
                yxb yxbVar = faeVar.v;
                ol60 ol60Var = faeVar.B;
                if (yxbVar.C && yxbVar.u && (((bbyVar = yxbVar.y) == null || !bbyVar.isActive()) && (((bbyVar2 = yxbVar.w) == null || !bbyVar2.isActive()) && ((bbyVar3 = yxbVar.v) == null || !bbyVar3.isActive())))) {
                    if (iIntValue <= 10) {
                        yxbVar.a();
                    }
                    if (iIntValue >= yxbVar.r.f17297a - 10 && !yxbVar.B && ((bbyVar4 = yxbVar.v) == null || !bbyVar4.isActive())) {
                        yxbVar.v = sac.V(yxbVar.n, uxb.f36432a, new hxb(yxbVar, b), null, new rxb(yxbVar, yjeVar, b), 12);
                    }
                }
                o6e o6eVar = o6e.f24730a;
                if (!zBooleanValue) {
                    ol60Var.f(o6eVar);
                    if (faeVar.N == w9e.b) {
                        faeVar.g.f29365a.a0(iIntValue2);
                    }
                }
                ol60Var.f(o6eVar);
                return Unit.f46060a;
            case 4:
                int iIntValue3 = ((Number) obj).intValue();
                String str = (String) obj2;
                String str2 = (String) obj3;
                str.getClass();
                str2.getClass();
                o890 o890Var = (o890) this.receiver;
                jh70 jh70Var = o890.f2;
                kxq kxqVarN0 = o890Var.n0();
                z7z z7zVar = o890Var.P1;
                if (z7zVar == null) {
                    Intrinsics.h("snackbarManager");
                    throw null;
                }
                Object obj5 = z7zVar.get();
                obj5.getClass();
                String strH = o890Var.H(iIntValue3);
                strH.getClass();
                n6x.i0(kxqVarN0, (wdk0) obj5, strH, str, str2);
                return Unit.f46060a;
            case 5:
                ae9 ae9Var = (ae9) obj;
                Long l = (Long) obj2;
                String str3 = (String) obj3;
                ae9Var.getClass();
                u6b0 u6b0Var = (u6b0) this.receiver;
                xi70 xi70Var = u6b0.e2;
                u6b0Var.getClass();
                amb0 amb0Var = amb0.TOP;
                String simpleName = u6b0.class.getSimpleName();
                int iOrdinal = ae9Var.ordinal();
                if (iOrdinal == 0) {
                    u6b0Var.J0().F(ujb0.f35770a, simpleName);
                } else if (iOrdinal == 1) {
                    u6b0Var.J0().F(vjb0.f37519a, simpleName);
                } else {
                    if (iOrdinal != 2) {
                        t9f.b();
                        return null;
                    }
                    sbb0 sbb0VarJ0 = u6b0Var.J0();
                    if (l != null) {
                        long jLongValue = l.longValue();
                        if (str3 == null) {
                            str3 = "";
                        }
                        sbb0VarJ0.F(new wjb0(jLongValue, str3), simpleName);
                    }
                }
                return Unit.f46060a;
            default:
                int iIntValue4 = ((Number) obj).intValue();
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                boolean zBooleanValue3 = ((Boolean) obj3).booleanValue();
                j2m0 j2m0Var = (j2m0) this.receiver;
                tjj0 tjj0VarA = j2m0Var.a();
                iab iabVar = j2m0Var.f15787a;
                if (iabVar == null) {
                    Intrinsics.h("binding");
                    throw null;
                }
                NonScrollableRecyclerView nonScrollableRecyclerView = (NonScrollableRecyclerView) iabVar.c;
                tjj0VarA.getClass();
                if (tjj0VarA.g != zBooleanValue2) {
                    tjj0VarA.g = zBooleanValue2;
                    int childCount = nonScrollableRecyclerView.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        View childAt = nonScrollableRecyclerView.getChildAt(i);
                        if (childAt != null && (viewFindViewById = childAt.findViewById(R.id.leftShadowView)) != null) {
                            viewFindViewById.setVisibility(zBooleanValue2 ? 0 : 8);
                        }
                    }
                }
                iab iabVar2 = j2m0Var.f15787a;
                if (iabVar2 == null) {
                    Intrinsics.h("binding");
                    throw null;
                }
                ((TableViewImpl) iabVar2.f).b(zBooleanValue2, zBooleanValue3);
                iab iabVar3 = j2m0Var.f15787a;
                if (iabVar3 == null) {
                    Intrinsics.h("binding");
                    throw null;
                }
                iabVar3.b.setVisibility(zBooleanValue3 ? 0 : 8);
                iab iabVar4 = j2m0Var.f15787a;
                if (iabVar4 != null) {
                    ((TableViewImpl) iabVar4.f).getColumnHeaderRecyclerView().scrollBy(iIntValue4, 0);
                    return Unit.f46060a;
                }
                Intrinsics.h("binding");
                throw null;
        }
    }
}

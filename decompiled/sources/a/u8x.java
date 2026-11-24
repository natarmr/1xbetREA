package a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.io.File;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
public final class u8x extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ v8x k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u8x(v8x v8xVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = v8xVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        v8x v8xVar = this.k;
        switch (b) {
            case 0:
                u8x u8xVar = new u8x(v8xVar, yjeVar, (byte) 0);
                u8xVar.j = obj;
                return u8xVar;
            case 1:
                u8x u8xVar2 = new u8x(v8xVar, yjeVar, (byte) 1);
                u8xVar2.j = obj;
                return u8xVar2;
            default:
                u8x u8xVar3 = new u8x(v8xVar, yjeVar, (byte) 2);
                u8xVar3.j = obj;
                return u8xVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((u8x) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((u8x) create((l9x) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((u8x) create((pax) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        v8x v8xVar;
        Object g0g0Var;
        byte b = this.i;
        v8x v8xVar2 = this.k;
        switch (b) {
            case 0:
                List list = (List) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                gst gstVar = v8x.U1;
                ((h9x) v8xVar2.R1.getValue()).A(list);
                return Unit.f46060a;
            case 1:
                l9x l9xVar = (l9x) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                gst gstVar2 = v8x.U1;
                androidx.recyclerview.widget.b layoutManager = v8xVar2.G0().c.getLayoutManager();
                if (l9xVar == l9x.PLAIN_LIST_ITEMS && !(layoutManager instanceof LinearLayoutManager)) {
                    v8xVar2.G0().c.setLayoutManager(new LinearLayoutManager(v8xVar2.o0()));
                    RecyclerView recyclerView = v8xVar2.G0().c;
                    int dimensionPixelSize = v8xVar2.G().getDimensionPixelSize(R.dimen.space_8);
                    int dimensionPixelSize2 = v8xVar2.G().getDimensionPixelSize(R.dimen.large_horizontal_margin_dynamic);
                    recyclerView.m(new gvl(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize2, (byte) 1));
                } else if (l9xVar == l9x.COMPACT_CARDS && !(layoutManager instanceof GridLayoutManager)) {
                    v8xVar2.G0().c.setLayoutManager(new GridLayoutManager(v8xVar2.o0(), 2));
                    RecyclerView recyclerView2 = v8xVar2.G0().c;
                    int dimensionPixelSize3 = v8xVar2.G().getDimensionPixelSize(R.dimen.space_8);
                    int dimensionPixelSize4 = v8xVar2.G().getDimensionPixelSize(R.dimen.large_horizontal_margin_dynamic);
                    recyclerView2.m(new fvl(dimensionPixelSize3, dimensionPixelSize4, dimensionPixelSize4, 0, dimensionPixelSize3, cy7.c(), iun.f15405a));
                }
                return Unit.f46060a;
            default:
                rek0 rek0Var = rek0.b;
                pax paxVar = (pax) this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                if (paxVar != null) {
                    boolean z = paxVar instanceof nax;
                    v8x v8xVar3 = this.k;
                    if (z) {
                        Context contextO0 = v8xVar3.o0();
                        String str = ((nax) paxVar).f23212a;
                        str.getClass();
                        try {
                            e0g0 e0g0Var = j0g0.b;
                            Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL);
                            intent.setFlags(268435456);
                            intent.setData(Uri.parse(str));
                            contextO0.startActivity(intent);
                            g0g0Var = Unit.f46060a;
                        } catch (Throwable th) {
                            e0g0 e0g0Var2 = j0g0.b;
                            g0g0Var = new g0g0(th);
                        }
                        if (j0g0.a(g0g0Var) != null) {
                            wdk0 wdk0Var = v8xVar3.L1;
                            if (wdk0Var == null) {
                                Intrinsics.h("snackbarManager");
                                throw null;
                            }
                            String strH = v8xVar3.H(R.string.open_browser_error_message);
                            strH.getClass();
                            wdk0.k(wdk0Var, new xdk0(rek0Var, strH, null, null, null, null, 124), v8xVar3, null, null, false, null, 1020);
                        }
                        break;
                    } else if (paxVar instanceof oax) {
                        boolean z2 = ((oax) paxVar).f24951a;
                        gst gstVar3 = v8x.U1;
                        if (z2) {
                            wdk0 wdk0Var2 = v8xVar3.L1;
                            if (wdk0Var2 == null) {
                                Intrinsics.h("snackbarManager");
                                throw null;
                            }
                            pek0 pek0Var = pek0.f26859a;
                            String strH2 = v8xVar3.H(R.string.show_loading_document_message);
                            strH2.getClass();
                            v8xVar3.S1 = wdk0.k(wdk0Var2, new xdk0(pek0Var, strH2, null, null, rv00.B, null, 108), v8xVar3, null, null, false, null, 1020);
                        } else {
                            ndk0 ndk0Var = v8xVar3.S1;
                            if (ndk0Var != null) {
                                ndk0Var.dismiss();
                            }
                        }
                    } else if (paxVar instanceof max) {
                        max maxVar = (max) paxVar;
                        File file = maxVar.f21479a;
                        String str2 = maxVar.b;
                        gst gstVar4 = v8x.U1;
                        if (sj3.v0(v8xVar3.o0(), file, str2)) {
                            v8xVar = v8xVar3;
                        } else {
                            v8xVar3.H0().C = false;
                            wdk0 wdk0Var3 = v8xVar3.L1;
                            if (wdk0Var3 == null) {
                                Intrinsics.h("snackbarManager");
                                throw null;
                            }
                            String strH3 = v8xVar3.H(R.string.registration_gdpr_pdf_error);
                            strH3.getClass();
                            v8xVar = v8xVar3;
                            wdk0.k(wdk0Var3, new xdk0(rek0Var, strH3, null, null, null, null, 124), v8xVar, null, null, false, null, 1020);
                        }
                        ndk0 ndk0Var2 = v8xVar.S1;
                        if (ndk0Var2 != null) {
                            ndk0Var2.dismiss();
                        }
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
        }
    }
}

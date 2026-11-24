package a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.cyber.cyberstatistic.api.navigation.CyberGameStatisticScreenParams;
import org.xplatform.cyber.game.core.InterceptTouchRecyclerView;
import org.xplatform.cyber.game.core.game_background.presentation.view.TopCropFillImageView;
import org.xplatform.uikit.components.lottie_empty.DsLottieEmpty;

/* JADX INFO: loaded from: classes3.dex */
public final class tpg extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ upg k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tpg(upg upgVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = upgVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        upg upgVar = this.k;
        switch (b) {
            case 0:
                tpg tpgVar = new tpg(upgVar, yjeVar, (byte) 0);
                tpgVar.j = obj;
                return tpgVar;
            case 1:
                tpg tpgVar2 = new tpg(upgVar, yjeVar, (byte) 1);
                tpgVar2.j = obj;
                return tpgVar2;
            default:
                tpg tpgVar3 = new tpg(upgVar, yjeVar, (byte) 2);
                tpgVar3.j = obj;
                return tpgVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((tpg) create((och) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((tpg) create((cqr) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((tpg) create((qqg) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        final byte b2 = 0;
        upg upgVar = this.k;
        final byte b3 = 1;
        switch (b) {
            case 0:
                cgx0 cgx0Var = upgVar.N1;
                och ochVar = (och) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (ochVar != null) {
                    if (ochVar instanceof nch) {
                        kwd kwdVar = upg.X1;
                        cgx0Var.u(iun.f15405a, upgVar.G0().f);
                        pb10 pb10VarK = ozb.K(((CyberGameStatisticScreenParams) upgVar.S1.n(upgVar, upg.Y1[1])).b);
                        upgVar.G0().d.setVisibility(0);
                        DsLottieEmpty dsLottieEmpty = upgVar.G0().d;
                        g2v g2vVar = upgVar.L1;
                        if (g2vVar == null) {
                            Intrinsics.h("lottieEmptyConfigurator");
                            throw null;
                        }
                        dsLottieEmpty.d(g2v.d(g2vVar, pb10VarK, null, ikm.b, 0, 0, null, 506));
                    } else if (ochVar instanceof mch) {
                        mch mchVar = (mch) ochVar;
                        kwd kwdVar2 = upg.X1;
                        cgx0Var.u(iun.f15405a, upgVar.G0().f);
                        upgVar.G0().d.setVisibility(0);
                        upgVar.G0().d.e(mchVar.f21551a, mchVar.b, new oye(0, upgVar.H0(), vqg.class, "setEndTimeState", "setEndTimeState()V", 0, (byte) 22));
                        upgVar.G0().d.setButtonOnClickListener(new oye(0, upgVar.H0(), vqg.class, "onRefreshClick", "onRefreshClick()V", 0, (byte) 23));
                    } else if (ochVar instanceof lch) {
                        List list = ((lch) ochVar).f19799a;
                        kwd kwdVar3 = upg.X1;
                        upgVar.G0().d.setVisibility(8);
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : list) {
                            if (obj2 instanceof zog) {
                                arrayList.add(obj2);
                            }
                        }
                        zog zogVar = (zog) CollectionsKt.firstOrNull(arrayList);
                        m5m m5mVar = zogVar != null ? zogVar.b : null;
                        if (m5mVar == null) {
                            m5mVar = null;
                        }
                        if ((m5mVar != null ? m5mVar.f21226a.i : null) != null) {
                            upgVar.G0().b.setVisibility(0);
                            InterceptTouchRecyclerView interceptTouchRecyclerView = upgVar.G0().f;
                            h5m h5mVar = upgVar.U1;
                            interceptTouchRecyclerView.setNestedScrollConnection(h5mVar != null ? h5mVar.e : null);
                            pkd.h(upgVar.G0().b, new owp0(upgVar), null, new ugd(-529723473, true, new eod(zogVar, upgVar, (byte) 24)));
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj3 : list) {
                                if (!(((p6t0) obj3) instanceof zog)) {
                                    arrayList2.add(obj3);
                                }
                            }
                            cgx0Var.u(arrayList2, upgVar.G0().f);
                        } else {
                            upgVar.G0().b.setVisibility(8);
                            upgVar.G0().f.setNestedScrollConnection(null);
                            cgx0Var.u(list, upgVar.G0().f);
                        }
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            case 1:
                cqr cqrVar = (cqr) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                qud qudVar = upgVar.P1;
                final TopCropFillImageView topCropFillImageView = upgVar.G0().c;
                ConstraintLayout constraintLayout = upgVar.G0().f31078a;
                final hfg hfgVar = new hfg(upgVar, (byte) 9);
                qudVar.getClass();
                cqrVar.getClass();
                List list2 = u0d.f34849a;
                u0d.j(topCropFillImageView, cqrVar.f4810a, 0, 0, null, new Function1() { // from class: a.bpg
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) throws Exception {
                        Bitmap bitmapD;
                        byte b4 = b2;
                        hfg hfgVar2 = hfgVar;
                        ImageView imageView = topCropFillImageView;
                        switch (b4) {
                            case 0:
                                Drawable drawable = imageView.getDrawable();
                                bitmapD = drawable != null ? hic.D(drawable, 0, 0, 7) : null;
                                if (bitmapD != null) {
                                    hfgVar2.invoke(bitmapD);
                                }
                                break;
                            default:
                                Drawable drawable2 = imageView.getDrawable();
                                bitmapD = drawable2 != null ? hic.D(drawable2, 0, 0, 7) : null;
                                if (bitmapD != null) {
                                    hfgVar2.invoke(bitmapD);
                                }
                                break;
                        }
                        return Unit.f46060a;
                    }
                }, new Function1() { // from class: a.bpg
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) throws Exception {
                        Bitmap bitmapD;
                        byte b4 = b3;
                        hfg hfgVar2 = hfgVar;
                        ImageView imageView = topCropFillImageView;
                        switch (b4) {
                            case 0:
                                Drawable drawable = imageView.getDrawable();
                                bitmapD = drawable != null ? hic.D(drawable, 0, 0, 7) : null;
                                if (bitmapD != null) {
                                    hfgVar2.invoke(bitmapD);
                                }
                                break;
                            default:
                                Drawable drawable2 = imageView.getDrawable();
                                bitmapD = drawable2 != null ? hic.D(drawable2, 0, 0, 7) : null;
                                if (bitmapD != null) {
                                    hfgVar2.invoke(bitmapD);
                                }
                                break;
                        }
                        return Unit.f46060a;
                    }
                }, 126);
                Context context = constraintLayout.getContext();
                context.getClass();
                constraintLayout.setBackgroundColor(context.getColor(cqrVar.b));
                return Unit.f46060a;
            default:
                qqg qqgVar = (qqg) this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                boolean z = qqgVar instanceof nqg;
                upg upgVar2 = this.k;
                if (z) {
                    s4v0 s4v0Var = ((nqg) qqgVar).f23958a;
                    kwd kwdVar4 = upg.X1;
                    ((uzg) upgVar2.H0().d).j(s4v0Var.b, s4v0Var.f31627a);
                } else if (qqgVar instanceof pqg) {
                    String string = upgVar2.G().getString(((pqg) qqgVar).f27415a);
                    string.getClass();
                    wdk0 wdk0Var = upgVar2.M1;
                    if (wdk0Var == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    wdk0.k(wdk0Var, new xdk0(rek0.b, string, null, null, null, null, 124), upgVar2, null, null, false, null, 1020);
                } else {
                    if (!Intrinsics.d(qqgVar, oqg.f25686a)) {
                        t9f.b();
                        return null;
                    }
                    upgVar2.N1.b = true;
                }
                return Unit.f46060a;
        }
    }
}

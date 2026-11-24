package a;

import android.content.Intent;
import android.net.Uri;
import android.widget.ProgressBar;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.lottie_empty.DSLottieEmptyContainer;

/* JADX INFO: loaded from: classes5.dex */
public final class xwc extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ ywc k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xwc(ywc ywcVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = ywcVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        ywc ywcVar = this.k;
        switch (b) {
            case 0:
                xwc xwcVar = new xwc(ywcVar, yjeVar, (byte) 0);
                xwcVar.j = obj;
                return xwcVar;
            case 1:
                xwc xwcVar2 = new xwc(ywcVar, yjeVar, (byte) 1);
                xwcVar2.j = obj;
                return xwcVar2;
            default:
                xwc xwcVar3 = new xwc(ywcVar, yjeVar, (byte) 2);
                xwcVar3.j = obj;
                return xwcVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((xwc) create((String) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((xwc) create((kxc) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((xwc) create((exc) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        ywc ywcVar = this.k;
        switch (b) {
            case 0:
                String str = (String) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                gxc gxcVar = ywcVar.S1;
                if (gxcVar != null) {
                    str.getClass();
                    gxcVar.k = str;
                }
                return Unit.f46060a;
            case 1:
                kxc kxcVar = (kxc) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (kxcVar != null) {
                    boolean z = kxcVar instanceof ixc;
                    ywc ywcVar2 = this.k;
                    if (!z) {
                        if (kxcVar instanceof jxc) {
                            int i = ((jxc) kxcVar).f17299a;
                            kl5 kl5Var = ywc.W1;
                            ywcVar2.G0().f.e(i, true);
                        } else if (kxcVar instanceof hxc) {
                            String str2 = ((hxc) kxcVar).f13809a;
                            kl5 kl5Var2 = ywc.W1;
                            try {
                                ywcVar2.w0(new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(str2)));
                            } catch (Exception unused) {
                                wdk0 wdk0Var = ywcVar2.L1;
                                if (wdk0Var == null) {
                                    Intrinsics.h("snackbarManager");
                                    throw null;
                                }
                                rek0 rek0Var = rek0.b;
                                String strH = ywcVar2.H(R.string.intent_app_not_installed);
                                strH.getClass();
                                wdk0.k(wdk0Var, new xdk0(rek0Var, strH, null, null, null, null, 124), ywcVar2, null, null, false, null, 1020);
                            }
                        }
                        break;
                    } else {
                        int i2 = ((ixc) kxcVar).f15536a;
                        kl5 kl5Var3 = ywc.W1;
                        ywcVar2.G0().f.e(i2, true);
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            default:
                exc excVar = (exc) this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                if (excVar != null) {
                    int i3 = 0;
                    if (excVar instanceof cxc) {
                        cxc cxcVar = (cxc) excVar;
                        kl5 kl5Var4 = ywc.W1;
                        dzq dzqVarG0 = ywcVar.G0();
                        nq8 nq8Var = dzqVarG0.e;
                        DSLottieEmptyContainer dSLottieEmptyContainer = dzqVarG0.b;
                        ((ProgressBar) nq8Var.c).setVisibility(8);
                        dzqVarG0.f.setVisibility(8);
                        dzqVarG0.c.setVisibility(8);
                        jkm jkmVar = cxcVar.f5117a;
                        long j = cxcVar.b;
                        int i4 = DSLottieEmptyContainer.d;
                        dSLottieEmptyContainer.b(jkmVar, j, new bmh((byte) 12));
                        dSLottieEmptyContainer.setButtonOnClickListener(new vwc(ywcVar, (byte) 2));
                        dSLottieEmptyContainer.setVisibility(0);
                    } else if (excVar instanceof dxc) {
                        kl5 kl5Var5 = ywc.W1;
                        dzq dzqVarG1 = ywcVar.G0();
                        dzqVarG1.b.setVisibility(8);
                        ((ProgressBar) dzqVarG1.e.c).setVisibility(0);
                        dzqVarG1.f.setVisibility(0);
                    } else if (excVar instanceof bxc) {
                        List list = ((bxc) excVar).f3369a;
                        kl5 kl5Var6 = ywc.W1;
                        ((ProgressBar) ywcVar.G0().e.c).setVisibility(8);
                        ywcVar.G0().b.setVisibility(8);
                        gxc gxcVar2 = ywcVar.S1;
                        if (gxcVar2 != null) {
                            gxcVar2.G(list);
                        }
                        ywcVar.G0().c.setVisibility(list.size() > 1 ? 0 : 8);
                        qxc qxcVarH0 = ywcVar.H0();
                        zz2 zz2Var = ywcVar.M1;
                        iiy[] iiyVarArr = ywc.X1;
                        int iIntValue = zz2Var.n(ywcVar, iiyVarArr[0]).intValue();
                        int iIntValue2 = ywcVar.O1.n(ywcVar, iiyVarArr[2]).intValue();
                        p7m0 p7m0Var = qxcVarH0.m;
                        int i5 = ((yvc) p7m0Var.getValue()).c;
                        ol60 ol60Var = qxcVarH0.l;
                        if (i5 == -1) {
                            Iterator it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    i3 = -1;
                                } else if (((uvc) it.next()).f36341a != iIntValue) {
                                    i3++;
                                }
                            }
                            Integer numValueOf = i3 != -1 ? Integer.valueOf(i3) : null;
                            if (numValueOf != null) {
                                iIntValue2 = numValueOf.intValue();
                            }
                            ol60Var.f(new ixc(iIntValue2));
                        } else {
                            ol60Var.f(new jxc(((yvc) p7m0Var.getValue()).c));
                        }
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
        }
    }
}

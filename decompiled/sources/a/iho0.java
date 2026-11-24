package a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes5.dex */
public final class iho0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ jho0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iho0(jho0 jho0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = jho0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        jho0 jho0Var = this.k;
        switch (b) {
            case 0:
                iho0 iho0Var = new iho0(jho0Var, yjeVar, (byte) 0);
                iho0Var.j = obj;
                return iho0Var;
            default:
                iho0 iho0Var2 = new iho0(jho0Var, yjeVar, (byte) 1);
                iho0Var2.j = obj;
                return iho0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((iho0) create((zho0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((iho0) create((who0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00ee  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        xho0 xho0Var;
        ViewPager2 viewPager2;
        Object g0g0Var;
        int i = 0;
        Object[] objArr = 0;
        switch (this.i) {
            case 0:
                zho0 zho0Var = (zho0) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (zho0Var != null) {
                    boolean z = zho0Var instanceof yho0;
                    jho0 jho0Var = this.k;
                    if (!z) {
                        if (zho0Var instanceof xho0) {
                            xho0 xho0Var2 = (xho0) zho0Var;
                            y2m0 y2m0Var = jho0.R1;
                            ViewPager2 viewPager3 = jho0Var.Q1;
                            if (viewPager3 != null) {
                                if (viewPager3.getAdapter() == null) {
                                    e140 e140Var = xho0Var2.f40904a;
                                    List list = e140Var.c;
                                    ViewPager2 viewPager4 = jho0Var.Q1;
                                    Integer numValueOf = viewPager4 != null ? Integer.valueOf(viewPager4.getCurrentItem()) : null;
                                    try {
                                        ViewPager2 viewPager5 = jho0Var.Q1;
                                        if (viewPager5 != null) {
                                            viewPager5.setAdapter(new dz30(list, jho0Var));
                                        }
                                        xho0Var = xho0Var2;
                                        viewPager2 = viewPager3;
                                    } catch (Throwable th) {
                                        rio0 rio0VarH0 = jho0Var.H0();
                                        boolean zN = jho0Var.N();
                                        boolean zQ = jho0Var.Q();
                                        boolean z2 = jho0Var.q;
                                        boolean zR = jho0Var.R();
                                        boolean z3 = jho0Var.Z;
                                        boolean z4 = jho0Var.m;
                                        String strName = jho0Var.u1.i.name();
                                        n6r n6rVarK = jho0Var.K();
                                        n6rVarK.b();
                                        String strName2 = n6rVarK.c.i.name();
                                        xho0Var = xho0Var2;
                                        viewPager2 = viewPager3;
                                        StringBuilder sb = new StringBuilder("\n                    viewPager.currentItem ");
                                        sb.append(numValueOf);
                                        sb.append("\n                    fragment.isAdded = ");
                                        sb.append(zN);
                                        sb.append(" \n                    fragment.isResumed = ");
                                        ua80.u(" \n                    fragment.isInLayout = ", " \n                    fragment.isStateSaved = ", sb, zQ, z2);
                                        ua80.u("\n                    fragment.isDetached = ", " \n                    fragment.isRemoving = ", sb, zR, z3);
                                        f140.s(" \n                    fragment.lifecycle = ", strName, "\n                    fragment.viewLifecycleOwner.lifecycle = ", sb, z4);
                                        sb.append(strName2);
                                        sb.append("\n                    ");
                                        String strC = ntm0.c(sb.toString());
                                        rio0VarH0.q0.getClass();
                                        if (strC.length() > 0) {
                                            tfq.a().b(strC);
                                        }
                                        tfq.a().c(th);
                                        mii0 mii0Var = jho0Var.P1;
                                        if (mii0Var != null) {
                                            ((ViewPager2) mii0Var.c).g((xp6) mii0Var.e);
                                        }
                                        ViewPager2 viewPager6 = jho0Var.Q1;
                                        if (viewPager6 != null) {
                                            dz30 dz30Var = new dz30(list, jho0Var);
                                            int id = viewPager6.getId();
                                            ViewGroup.LayoutParams layoutParams = viewPager6.getLayoutParams();
                                            int currentItem = viewPager6.getCurrentItem();
                                            jho0Var.G0().f24701a.removeView(viewPager6);
                                            ViewPager2 viewPager7 = new ViewPager2(viewPager6.getContext());
                                            viewPager7.setId(id);
                                            viewPager7.setLayoutParams(layoutParams);
                                            jho0Var.Q1 = viewPager7;
                                            jho0Var.G0().f24701a.addView(viewPager7);
                                            viewPager7.setAdapter(dz30Var);
                                            viewPager7.post(new n23(viewPager7, currentItem, (byte) 13));
                                        }
                                    }
                                    jho0Var.G0().c.setTabsStyle(e140Var.f7020a);
                                    jho0Var.G0().c.c(e140Var.b);
                                } else {
                                    xho0Var = xho0Var2;
                                    viewPager2 = viewPager3;
                                }
                                jho0Var.G0().b.setVisibility(8);
                                jho0Var.G0().c.setVisibility(0);
                                viewPager2.setVisibility(0);
                                xho0 xho0Var3 = xho0Var;
                                boolean z5 = xho0Var3.c;
                                ViewPager2 viewPager8 = jho0Var.Q1;
                                if (z5) {
                                    if (viewPager8 != null) {
                                        viewPager8.e(xho0Var3.b, false);
                                    }
                                } else if (viewPager8 != null) {
                                    viewPager8.post(new oh60(viewPager8, xho0Var3, (byte) 27));
                                }
                            }
                        }
                        break;
                    } else {
                        y2m0 y2m0Var2 = jho0.R1;
                        jho0Var.G0().b.setVisibility(0);
                        jho0Var.G0().c.setVisibility(8);
                        ViewPager2 viewPager9 = jho0Var.Q1;
                        if (viewPager9 != null) {
                            viewPager9.setVisibility(8);
                        }
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            default:
                jho0 jho0Var2 = this.k;
                a8z a8zVar = jho0Var2.M1;
                who0 who0Var = (who0) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (who0Var != null) {
                    if (!(who0Var instanceof tho0)) {
                        if (!(who0Var instanceof uho0)) {
                            if (!(who0Var instanceof vho0)) {
                                if (!(who0Var instanceof sho0)) {
                                    if (who0Var instanceof pho0) {
                                        kxq kxqVarB = jho0Var2.B();
                                        if (kxqVarB != null && tdc.U(kxqVarB.r())) {
                                            rio0 rio0VarH1 = jho0Var2.H0();
                                            rio0VarH1.z.d(new lho0(rio0VarH1, (byte) 4));
                                        }
                                    } else if (who0Var instanceof rho0) {
                                        y2m0 y2m0Var3 = jho0.R1;
                                        db dbVar = ((cwi) a8zVar.getValue()).f5081a;
                                        androidx.fragment.app.e eVarC = jho0Var2.C();
                                        eVarC.getClass();
                                        jvp0 jvp0Var = jvp0.f17215a;
                                        s9m0.m(eVarC);
                                    } else if (who0Var instanceof qho0) {
                                        Context contextO0 = jho0Var2.o0();
                                        String str = ((qho0) who0Var).f28750a;
                                        try {
                                            e0g0 e0g0Var = j0g0.b;
                                            Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL);
                                            intent.setFlags(268435456);
                                            intent.setData(Uri.parse(str));
                                            contextO0.startActivity(intent);
                                            g0g0Var = Unit.f46060a;
                                        } catch (Throwable th2) {
                                            e0g0 e0g0Var2 = j0g0.b;
                                            g0g0Var = new g0g0(th2);
                                        }
                                        if (j0g0.a(g0g0Var) != null) {
                                            wdk0 wdk0Var = (wdk0) ((cwi) a8zVar.getValue()).f5081a.q;
                                            x1x.y(wdk0Var);
                                            rek0 rek0Var = rek0.b;
                                            String strH = jho0Var2.H(R.string.open_browser_error_message);
                                            strH.getClass();
                                            wdk0.k(wdk0Var, new xdk0(rek0Var, strH, null, null, null, null, 124), jho0Var2, null, null, false, null, 1020);
                                        }
                                    }
                                    break;
                                } else {
                                    y2m0 y2m0Var4 = jho0.R1;
                                    List listP = jho0Var2.C().c.p();
                                    listP.getClass();
                                    ViewPager2 viewPager10 = jho0Var2.Q1;
                                    Fragment fragment = (Fragment) CollectionsKt.W(viewPager10 != null ? viewPager10.getCurrentItem() : -1, listP);
                                    if (fragment != null) {
                                        if (fragment instanceof tah0) {
                                            tah0 tah0Var = (tah0) fragment;
                                            if (tah0Var.p()) {
                                                tah0Var.w();
                                            } else {
                                                rio0 rio0VarH2 = jho0Var2.H0();
                                                sac.V(jiu0.a(rio0VarH2), pio0.f27052a, null, rio0VarH2.y.f22085a, new bh0(rio0VarH2, i, objArr == true ? 1 : 0, (byte) 26), 10);
                                            }
                                        } else {
                                            rio0 rio0VarH3 = jho0Var2.H0();
                                            sac.V(jiu0.a(rio0VarH3), pio0.f27052a, null, rio0VarH3.y.f22085a, new bh0(rio0VarH3, i, objArr == true ? 1 : 0, (byte) 26), 10);
                                        }
                                    }
                                }
                            } else {
                                vho0 vho0Var = (vho0) who0Var;
                                jho0Var2.o0().startService(new Intent(vho0Var.b).setComponent(new ComponentName(jho0Var2.o0(), vho0Var.f37441a)));
                            }
                        } else {
                            uho0 uho0Var = (uho0) who0Var;
                            String str2 = uho0Var.f35691a;
                            sek0 sek0Var = uho0Var.b;
                            y2m0 y2m0Var5 = jho0.R1;
                            xdk0 xdk0Var = new xdk0(sek0Var, str2, null, null, null, null, 124);
                            wdk0 wdk0Var2 = (wdk0) ((cwi) a8zVar.getValue()).f5081a.q;
                            x1x.y(wdk0Var2);
                            wdk0.k(wdk0Var2, xdk0Var, jho0Var2, null, null, false, null, 1020);
                        }
                    } else {
                        y2m0 y2m0Var6 = jho0.R1;
                        ii iiVar = (ii) ((cwi) a8zVar.getValue()).f5081a.p;
                        x1x.y(iiVar);
                        String strH2 = jho0Var2.H(R.string.attention);
                        String strH3 = jho0Var2.H(R.string.country_blocking);
                        String strH4 = jho0Var2.H(R.string.ok_new);
                        strH4.getClass();
                        DialogFields dialogFields = new DialogFields((CharSequence) strH2, (CharSequence) strH3, (CharSequence) strH4, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528);
                        androidx.fragment.app.e eVarC2 = jho0Var2.C();
                        eVarC2.getClass();
                        iiVar.d(dialogFields, eVarC2);
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
        }
    }
}

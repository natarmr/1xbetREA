package a;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import org.xbet.client1.R;
import org.xplatform.statistic.stage.impl.champ_statistic_tour_net.presentation.view.bracket.BracketItemView;

/* JADX INFO: loaded from: classes.dex */
public final class zas0 implements hs8, ez5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f44083a;
    public Object b;

    public zas0(lds0 lds0Var) {
        this.f44083a = (byte) 13;
        lds0Var.getClass();
        String str = pov0.f27347a;
        b4e b4eVar = lds0Var.b;
        rl50 rl50Var = lds0Var.d;
        byte b = 3;
        byte b2 = 2;
        ArrayList arrayListL = q3d.l(new ua6(b4eVar, (byte) 0), new ua6(lds0Var.c, (byte) 1), new ua6(lds0Var.e, (byte) 4));
        if (Build.VERSION.SDK_INT >= 28) {
            Context context = lds0Var.f19867a;
            context.getClass();
            Object systemService = context.getSystemService("connectivity");
            systemService.getClass();
            arrayListL.add(new il50((ConnectivityManager) systemService));
        } else {
            rl50Var.getClass();
            arrayListL.addAll(q3d.j(new ua6(rl50Var, b2), new ua6(rl50Var, b), new fl50(rl50Var), new cl50(rl50Var)));
        }
        this.b = arrayListL;
    }

    public static String a(String str, String str2, String str3) {
        return b1j.k(str, str2, "=", str3, "&");
    }

    public Object b(vt20 vt20Var, mt00 mt00Var) {
        Object objW0;
        wne wneVar = wne.f39444a;
        long j = vt20Var.f37982a;
        boolean z = vt20Var.d;
        he1 he1Var = ((p430) this.b).f26331a;
        int i = vt20Var.c;
        yje yjeVar = null;
        if (i != 0 || z) {
            ut20 ut20Var = new ut20(i, j, z);
            tt20 tt20VarA = he1Var.a();
            objW0 = sj3.w0(mt00Var, tt20VarA.f34491a, new v620((Object) tt20VarA, (Object) ut20Var, yjeVar, (byte) 28), false, true);
            if (objW0 != wneVar) {
                objW0 = Unit.f46060a;
            }
            if (objW0 != wneVar) {
                objW0 = Unit.f46060a;
            }
            if (objW0 != wneVar) {
                objW0 = Unit.f46060a;
            }
        } else {
            objW0 = sj3.w0(mt00Var, he1Var.a().f34491a, new hu6(j, yjeVar, (byte) 7), false, true);
            if (objW0 != wneVar) {
                objW0 = Unit.f46060a;
            }
            if (objW0 != wneVar) {
                objW0 = Unit.f46060a;
            }
            if (objW0 != wneVar) {
                objW0 = Unit.f46060a;
            }
        }
        return objW0 == wneVar ? objW0 : Unit.f46060a;
    }

    public void c(Set set) {
        set.getClass();
        v8l0 v8l0Var = (v8l0) ((ani0) this.b).f1155a;
        v8l0Var.getClass();
        p7m0 p7m0Var = v8l0Var.f;
        LinkedHashMap linkedHashMapP = xp20.p((Map) p7m0Var.getValue());
        Set set2 = set;
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            linkedHashMapP.put(Long.valueOf(((Number) it.next()).longValue()), Boolean.TRUE);
        }
        Iterator it2 = eui0.f(linkedHashMapP.keySet(), set2).iterator();
        while (it2.hasNext()) {
            linkedHashMapP.put(Long.valueOf(((Number) it2.next()).longValue()), Boolean.FALSE);
        }
        if (linkedHashMapP.equals(p7m0Var.getValue())) {
            return;
        }
        p7m0Var.o(null, linkedHashMapP);
        v8l0Var.a(linkedHashMapP);
    }

    public void d(int i, boolean z, boolean z2, boolean z3) {
        vju0 vju0Var = (vju0) this.b;
        if (z) {
            vju0Var.B.invoke(Integer.valueOf(i), Integer.valueOf(vju0Var.c()));
            vju0Var.A(i);
        }
        if (z2) {
            int iD = vju0Var.K;
            if (iD == -1) {
                iD = vju0Var.d();
            }
            vju0Var.y(iD, z3);
            vju0Var.K = -1;
        }
    }

    public gmq e(ppv0 ppv0Var) {
        ppv0Var.getClass();
        ArrayList arrayList = (ArrayList) this.b;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((y2e) obj).b(ppv0Var)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(r3d.q(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((y2e) it.next()).c(ppv0Var.j));
        }
        return i120.W(new pxt((gmq[]) CollectionsKt.L0(arrayList3).toArray(new gmq[0]), (byte) 5));
    }

    public View f(BracketItemView bracketItemView, ss8 ss8Var) {
        ss8Var.getClass();
        pab pabVar = ss8Var.c;
        if (pabVar == null) {
            return new View(bracketItemView.getContext());
        }
        mk50 mk50Var = pabVar.b;
        mim0 mim0Var = pabVar.c;
        Context context = bracketItemView.getContext();
        context.getClass();
        ComposeView composeView = new ComposeView(context, null, 6);
        pkd.i(composeView, null, new ugd(-505204702, true, new stl0((Object) mim0Var, this.b, (Object) mk50Var, (Object) ss8Var, (byte) 26)));
        boolean z = mim0Var instanceof shm0;
        FrameLayout frameLayout = new FrameLayout(bracketItemView.getContext());
        if (!z) {
            Context context2 = bracketItemView.getContext();
            context2.getClass();
            frameLayout.setBackgroundColor(m5d.b(R.attr.uikitBackgroundContent, context2));
        }
        hxm0.x(frameLayout, bracketItemView.getContext().getResources().getDimensionPixelSize(R.dimen.radius_16));
        frameLayout.setId(R.id.stub_id);
        frameLayout.setLayoutDirection(3);
        frameLayout.addView(composeView);
        return frameLayout;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    public void g(wyw0 wyw0Var, int i) {
        pkw0 pkw0Var;
        if (i == -30) {
            pkw0Var = pkw0.TCF;
        } else if (i == -20) {
            pkw0Var = pkw0.API;
        } else if (i == -10) {
            pkw0Var = pkw0.MANIFEST;
        } else if (i != 0) {
            pkw0Var = i != 30 ? pkw0.UNSET : pkw0.INITIALIZATION;
        } else {
            pkw0Var = pkw0.API;
        }
        ((EnumMap) this.b).put(wyw0Var, pkw0Var);
    }

    public void h(wyw0 wyw0Var, pkw0 pkw0Var) {
        ((EnumMap) this.b).put(wyw0Var, pkw0Var);
    }

    @Override // a.ez5
    public void onConnected() {
        ((qav) this.b).onConnected();
    }

    @Override // a.ez5
    public void onConnectionSuspended(int i) {
        ((qav) this.b).onConnectionSuspended(i);
    }

    public String toString() {
        switch (this.f44083a) {
            case 16:
                StringBuilder sb = new StringBuilder("1");
                for (wyw0 wyw0Var : wyw0.values()) {
                    pkw0 pkw0Var = (pkw0) ((EnumMap) this.b).get(wyw0Var);
                    if (pkw0Var == null) {
                        pkw0Var = pkw0.UNSET;
                    }
                    sb.append(pkw0Var.f27155a);
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ zas0(Object obj, byte b) {
        this.f44083a = b;
        this.b = obj;
    }

    public zas0(byte b) {
        this.f44083a = b;
        switch (b) {
            case 18:
                this.b = new HashMap();
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
            default:
                this.b = new EnumMap(wyw0.class);
                break;
            case 20:
                this.b = new ConcurrentHashMap();
                break;
        }
    }

    public /* synthetic */ zas0(byte b, boolean z) {
        this.f44083a = b;
    }

    public zas0(EnumMap enumMap) {
        this.f44083a = (byte) 16;
        EnumMap enumMap2 = new EnumMap(wyw0.class);
        this.b = enumMap2;
        enumMap2.putAll(enumMap);
    }

    public zas0(epi0 epi0Var) {
        this.f44083a = (byte) 10;
        this.b = new psc((Object) epi0Var, (byte) 17);
    }

    public zas0(fme fmeVar) {
        this.f44083a = (byte) 7;
        fmeVar.getClass();
        this.b = fmeVar;
    }

    public zas0(knf0 knf0Var) {
        this.f44083a = (byte) 12;
        knf0Var.getClass();
        this.b = knf0Var;
    }

    public zas0(gii0 gii0Var, byte b) {
        this.f44083a = b;
        gii0Var.getClass();
        switch (b) {
            case 2:
                this.b = new lkr0(gii0Var, (byte) 17);
                break;
            default:
                this.b = new lkr0(gii0Var, (byte) 11);
                break;
        }
    }
}

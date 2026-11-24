package a;

import android.os.Bundle;
import android.util.Log;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;

/* JADX INFO: loaded from: classes3.dex */
public final class yzn0 implements nae0, cfr, zfe0 {
    public static final uuz c = new uuz();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f43523a;
    public Object b;

    public yzn0(gii0 gii0Var, byte b) {
        gii0Var.getClass();
        switch (b) {
            case 12:
                this.f43523a = gii0Var;
                this.b = new zo4(this, (byte) 23);
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                this.f43523a = gii0Var;
                this.b = new e8g(this, (byte) 16);
                break;
            default:
                this.f43523a = gii0Var;
                this.b = new nc((Object) this, (byte) 24);
                break;
        }
    }

    public static void p(yzn0 yzn0Var, b3e b3eVar, float f, int i) {
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        yzn0Var.o(b3eVar, f);
    }

    public boolean a() {
        synchronized (this) {
            if (((AtomicBoolean) this.b).get()) {
                return false;
            }
            ((AtomicInteger) this.f43523a).incrementAndGet();
            return true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object c(long j, zje zjeVar, String str) throws cii0 {
        vx0 vx0Var;
        if (zjeVar instanceof vx0) {
            vx0Var = (vx0) zjeVar;
            int i = vx0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                vx0Var.k = i - Integer.MIN_VALUE;
            } else {
                vx0Var = new vx0(this, zjeVar);
            }
        } else {
            vx0Var = new vx0(this, zjeVar);
        }
        Object objA = vx0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = vx0Var.k;
        if (i2 == 0) {
            z1x.P(objA);
            ta0 ta0Var = (ta0) ((zm) this.b).invoke();
            String strA = ((btt0) this.f43523a).a();
            obf obfVar = new obf(j, str);
            vx0Var.k = 1;
            objA = ta0Var.a(strA, obfVar, vx0Var);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
        }
        rbf rbfVar = (rbf) objA;
        Integer num = rbfVar.f30182a;
        if (num == null) {
            return Unit.f46060a;
        }
        int iIntValue = num.intValue();
        String str2 = rbfVar.b;
        if (str2 == null) {
            str2 = "";
        }
        throw new cii0(iIntValue, str2);
    }

    public Object d(String str, z47 z47Var, zje zjeVar) {
        zo4 zo4Var = (zo4) this.b;
        if (z47Var instanceof ab7) {
            return ((s37) zo4Var.invoke()).a(str, (ab7) z47Var, zjeVar);
        }
        if (z47Var instanceof db7) {
            return ((s37) zo4Var.invoke()).f(str, (db7) z47Var, zjeVar);
        }
        t9f.b();
        return null;
    }

    @Override // a.zfe0
    public gox e(yfe0 yfe0Var, Object obj) {
        gox goxVarE;
        tld tldVar = (tld) this.f43523a;
        if (tldVar == null) {
            tldVar = null;
        }
        if (tldVar == null || (goxVarE = tldVar.e(yfe0Var, obj)) == null) {
            goxVarE = gox.f11656a;
        }
        if (goxVarE != gox.f11656a) {
            return goxVarE;
        }
        mu40 mu40Var = (mu40) this.b;
        mu40Var.f = CollectionsKt.r0(mu40Var.f, new Pair(yfe0Var, obj));
        return gox.b;
    }

    public Object g(String str, r47 r47Var, zje zjeVar) {
        zo4 zo4Var = (zo4) this.b;
        if (r47Var instanceof hb7) {
            return ((s37) zo4Var.invoke()).b(str, (hb7) r47Var, zjeVar);
        }
        if (r47Var instanceof kb7) {
            return ((s37) zo4Var.invoke()).d(str, (kb7) r47Var, zjeVar);
        }
        t9f.b();
        return null;
    }

    public or30 h(CyberGamesPage cyberGamesPage, sip sipVar) {
        cyberGamesPage.getClass();
        sipVar.getClass();
        int iOrdinal = sipVar.ordinal();
        if (iOrdinal == 0) {
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.f43523a;
            Object or30Var = linkedHashMap.get(cyberGamesPage);
            if (or30Var == null) {
                or30Var = new or30();
                linkedHashMap.put(cyberGamesPage, or30Var);
            }
            return (or30) or30Var;
        }
        if (iOrdinal != 1) {
            t9f.b();
            return null;
        }
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) this.b;
        Object or30Var2 = linkedHashMap2.get(cyberGamesPage);
        if (or30Var2 == null) {
            or30Var2 = new or30();
            linkedHashMap2.put(cyberGamesPage, or30Var2);
        }
        return (or30) or30Var2;
    }

    public ynb i() {
        return (ynb) ((n5d0) this.b).get();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object j(jo20 jo20Var, zje zjeVar) {
        wkh wkhVar;
        if (zjeVar instanceof wkh) {
            wkhVar = (wkh) zjeVar;
            int i = wkhVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                wkhVar.k = i - Integer.MIN_VALUE;
            } else {
                wkhVar = new wkh(this, zjeVar);
            }
        } else {
            wkhVar = new wkh(this, zjeVar);
        }
        Object objA = wkhVar.i;
        wne wneVar = wne.f39444a;
        int i2 = wkhVar.k;
        if (i2 == 0) {
            z1x.P(objA);
            tih tihVar = (tih) ((e8g) this.b).invoke();
            wkhVar.k = 1;
            objA = tihVar.a(jo20Var, wkhVar);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
        }
        return ((dx5) objA).a();
    }

    @Override // a.nae0
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public Serializable n(Fragment fragment, iiy iiyVar) {
        Serializable serializable;
        fragment.getClass();
        iiyVar.getClass();
        Serializable serializable2 = (Serializable) this.b;
        if (serializable2 == null) {
            Bundle bundle = fragment.g;
            serializable2 = null;
            if (bundle == null || (serializable = bundle.getSerializable((String) this.f43523a)) == null) {
                serializable = null;
            } else {
                this.b = serializable;
            }
            if (serializable != null) {
                return serializable;
            }
            e9d0.o();
        }
        return serializable2;
    }

    public Object l(yje yjeVar) throws oqt0 {
        if (!((ort) this.b).f25751a.a()) {
            throw new oqt0();
        }
        Object objX = iom0.x(new ndn0(1, (m0o0) this.f43523a, m0o0.class, "updateFavoritesFromRemote", "updateFavoritesFromRemote(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 24), yzn0.class, yjeVar);
        return objX == wne.f39444a ? objX : Unit.f46060a;
    }

    public boolean m() {
        return ((pru) this.f43523a).a().b.E && ((rou) this.b).f30857a.c();
    }

    public void o(b3e b3eVar, float f) {
        boolean z = b3eVar.b;
        String str = "top";
        if (z) {
            if (!z) {
                Log.e("CCL", "horizontalAnchorIndexToAnchorName: Unknown horizontal index");
            } else {
                str = "bottom";
            }
        }
        vg9 vg9Var = new vg9(new char[0]);
        vg9Var.i(eh9.i(b3eVar.f1898a.toString()));
        vg9Var.i(eh9.i(str));
        vg9Var.i(new zg9(f));
        vg9Var.i(new zg9(0.0f));
        ((bh9) this.f43523a).F((String) this.b, vg9Var);
    }

    @Override // a.cfr
    public void onFailure(Throwable th) {
        ofm0.m();
        dzb0 dzb0Var = (dzb0) this.f43523a;
        esg0 esg0Var = (esg0) this.b;
        if (dzb0Var == ((dzb0) esg0Var.f8326a)) {
            l8x.E0("CaptureNode", "request aborted, id=" + ((dzb0) esg0Var.f8326a).f6936a);
            zn00 zn00Var = (zn00) esg0Var.f;
            if (zn00Var != null) {
                zn00Var.b = null;
            }
            esg0Var.f8326a = null;
        }
    }

    @Override // a.cfr
    public void onSuccess(Object obj) {
    }

    public void q(int i, Bundle bundle) {
        Locale locale = Locale.US;
        String str = "Analytics listener received message. ID: " + i + ", Extras: " + bundle;
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", str, null);
        }
        String string = bundle.getString("name");
        if (string != null) {
            Bundle bundle2 = bundle.getBundle("params");
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            ns2 ns2Var = "clx".equals(bundle2.getString("_o")) ? (lhf0) this.f43523a : (peg0) this.b;
            if (ns2Var == null) {
                return;
            }
            ns2Var.d(bundle2, string);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object r(int i, long j, zje zjeVar, String str) {
        yt9 yt9Var;
        if (zjeVar instanceof yt9) {
            yt9Var = (yt9) zjeVar;
            int i2 = yt9Var.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yt9Var.k = i2 - Integer.MIN_VALUE;
            } else {
                yt9Var = new yt9(this, zjeVar);
            }
        } else {
            yt9Var = new yt9(this, zjeVar);
        }
        Object objA = yt9Var.i;
        wne wneVar = wne.f39444a;
        int i3 = yt9Var.k;
        if (i3 == 0) {
            z1x.P(objA);
            r7v r7vVar = (r7v) this.f43523a;
            String strA = ((btt0) this.b).a();
            yt9Var.k = 1;
            str.getClass();
            bzu bzuVar = new bzu((byte) 19);
            cww.F(bzuVar, "Id", Long.valueOf(j));
            cww.F(bzuVar, "CallFeedback", Integer.valueOf(i));
            if (str.length() > 0) {
                cww.G(bzuVar, "Comment", str);
            }
            objA = ((zt9) ((zm) r7vVar.f29996a).invoke()).a(strA, new wp9(bzuVar.a()), yt9Var);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
        }
        return Boolean.valueOf(Intrinsics.d(((zp9) ((q16) objA).a()).f44748a, Boolean.TRUE));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object s(hqn hqnVar, int i, zje zjeVar) {
        ltf ltfVar;
        String strF;
        String str;
        if (zjeVar instanceof ltf) {
            ltfVar = (ltf) zjeVar;
            int i2 = ltfVar.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ltfVar.k = i2 - Integer.MIN_VALUE;
            } else {
                ltfVar = new ltf(this, zjeVar);
            }
        } else {
            ltfVar = new ltf(this, zjeVar);
        }
        Object objA = ltfVar.i;
        wne wneVar = wne.f39444a;
        int i3 = ltfVar.k;
        if (i3 == 0) {
            z1x.P(objA);
            hqnVar.getClass();
            jo20 jo20Var = new jo20();
            jo20Var.put("Name", ncy.c(hqnVar.f13492a));
            jo20Var.put("Surname", ncy.c(hqnVar.b));
            String str2 = hqnVar.c;
            if (str2.length() > 0) {
                jo20Var.put("MiddleName", ncy.c(str2));
            }
            if (i == 1) {
                jo20Var.put("IdCity", ncy.b(Integer.valueOf(hqnVar.h)));
            }
            jo20Var.put("IdCountry", ncy.b(Integer.valueOf(hqnVar.f)));
            Long l = hqnVar.d;
            if (l == null) {
                strF = "";
            } else {
                rdj rdjVar = rdj.f30294a;
                strF = rdj.f(new ynq0(l.longValue()), sdj.UNIQUE_10, null, 48);
            }
            jo20Var.put("Birthday", ncy.c(strF));
            jo20Var.put("DocumentNumber", ncy.c(hqnVar.k));
            int i4 = hqnVar.q;
            if (i4 != 1) {
                str = i4 != 2 ? "" : "f";
            } else {
                str = "m";
            }
            jo20Var.put("Sex", ncy.c(str));
            if (i == 1) {
                jo20Var.put("Address", ncy.c(hqnVar.n));
            }
            if (i == 1) {
                jo20Var.put("Inn", ncy.c(hqnVar.o));
            }
            jo20Var.put("IsResident", ncy.b(Integer.valueOf(i)));
            jo20 jo20VarB = jo20Var.b();
            prc prcVar = (prc) this.f43523a;
            String strA = ((btt0) this.b).a();
            ltfVar.k = 1;
            objA = ((ktf) ((sza) prcVar.b).invoke()).a(true, strA, jo20VarB, ltfVar);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
        }
        String str3 = ((jtf) ((dx5) objA).a()).f17097a;
        return str3 == null ? "" : str3;
    }

    public void t(Object obj) {
        obj.getClass();
        sgy sgyVar = (sgy) this.f43523a;
        sgyVar.getClass();
        if (!sgyVar.r(obj)) {
            obj = null;
        }
        if (obj == null) {
            return;
        }
        p7m0 p7m0Var = (p7m0) this.b;
        while (!p7m0Var.m(p7m0Var.getValue(), obj)) {
        }
    }

    public void u(Fragment fragment, iiy iiyVar, Serializable serializable) {
        fragment.getClass();
        iiyVar.getClass();
        serializable.getClass();
        Bundle bundle = fragment.g;
        if (bundle == null) {
            bundle = new Bundle();
            fragment.s0(bundle);
        }
        bundle.putSerializable((String) this.f43523a, serializable);
        this.b = serializable;
    }

    public rrm v(ViewGroup viewGroup, wdk0 wdk0Var, kxq kxqVar, sek0 sek0Var, String str, Function0 function0, Function0 function1) {
        wdk0Var.getClass();
        str.getClass();
        rrm rrmVarC = wdk0.j(wdk0Var, new xdk0(sek0Var, str, null, new hdk0(((ctf0) this.f43523a).f(R.string.coupon, new Object[0]), function0), jtv.x, Integer.valueOf(R.drawable.ic_snack_coupon), 4), kxqVar, viewGroup, null, false, false, null, 120).c();
        wq wqVar = new wq(function1, (byte) 0);
        ArrayList arrayList = rrmVarC.s;
        if (arrayList == null) {
            arrayList = new ArrayList();
            rrmVarC.s = arrayList;
        }
        arrayList.add(wqVar);
        return rrmVarC;
    }

    public void w() {
        synchronized (this) {
            ((AtomicInteger) this.f43523a).decrementAndGet();
            if (((AtomicInteger) this.f43523a).get() < 0) {
                throw new IllegalStateException("Unbalanced call to unblock() detected.");
            }
        }
    }

    public void x(ArrayList arrayList) {
        ke60 ke60Var;
        for (int i = 0; i < arrayList.size(); i++) {
            if (((je60) arrayList.get(i)).f16358a == 1) {
                try {
                    ke60Var = new ke60((je60) arrayList.get(i));
                } catch (ie60 unused) {
                    ke60Var = null;
                }
                this.b = ke60Var;
            }
        }
    }

    @Override // a.zfe0
    public void b() {
    }

    @Override // a.zfe0
    public void f(Object obj) {
    }

    public yzn0(String str, cwr0 cwr0Var, qek0 qek0Var) {
        this.b = str;
        this.f43523a = cwr0Var;
    }

    public /* synthetic */ yzn0(Object obj, Object obj2) {
        this.f43523a = obj;
        this.b = obj2;
    }

    public yzn0(btt0 btt0Var, gii0 gii0Var) {
        btt0Var.getClass();
        gii0Var.getClass();
        this.f43523a = btt0Var;
        this.b = new zm(gii0Var, (byte) 2);
    }

    public yzn0(sgy sgyVar) {
        sgyVar.getClass();
        this.f43523a = sgyVar;
        this.b = q7m0.a(null);
    }

    public yzn0(xzp xzpVar) {
        this.f43523a = xzpVar;
        this.b = c;
    }

    public yzn0(byte b) {
        switch (b) {
            case 11:
                this.f43523a = new LinkedHashMap();
                this.b = new LinkedHashMap();
                break;
            case 16:
                xun xunVar = xun.f41520a;
                lun lunVar = lun.f20680a;
                lunVar.getClass();
                xunVar.getClass();
                this.f43523a = xunVar;
                this.b = lunVar;
                break;
            default:
                this.f43523a = ByteBuffer.allocateDirect(500);
                break;
        }
    }

    public yzn0(bh9 bh9Var, int i) {
        this.f43523a = bh9Var;
        String str = "top";
        if (i != 0) {
            if (i != 1) {
                Log.e("CCL", "horizontalAnchorIndexToAnchorName: Unknown horizontal index");
            } else {
                str = "bottom";
            }
        }
        this.b = str;
    }

    public yzn0(String str) {
        str.getClass();
        this.f43523a = str;
    }
}

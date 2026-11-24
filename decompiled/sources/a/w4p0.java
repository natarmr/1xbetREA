package a;

import android.app.Activity;
import android.app.BroadcastOptions;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class w4p0 implements u73, w7, uhv0, mff0, qfw0, g1x0, thx0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f38552a;
    public Object b;

    public w4p0(gii0 gii0Var, byte b) {
        this.f38552a = b;
        gii0Var.getClass();
        switch (b) {
            case 3:
                this.b = new lkr0(gii0Var, (byte) 2);
                break;
            case 4:
                this.b = new lkr0(gii0Var, (byte) 9);
                break;
            case 18:
                this.b = new lkr0(gii0Var, (byte) 25);
                break;
            default:
                this.b = new enj0(gii0Var, (byte) 26);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002d  */
    @Override // a.g1x0
    public void a(int i, Throwable th, byte[] bArr) {
        uuw0 uuw0Var;
        uuw0 uuw0Var2;
        int i2 = i;
        kxw0 kxw0Var = (kxw0) this.b;
        uuw0 uuw0Var3 = kxw0Var.f;
        if (i2 == 200 || i2 == 204) {
            if (th == null) {
                wvw0 wvw0Var = kxw0Var.e;
                kxw0.e(wvw0Var);
                wvw0Var.u.b(true);
                if (bArr != null || bArr.length == 0) {
                    kxw0.g(uuw0Var3);
                    uuw0Var3.n.a("Deferred Deep Link response empty.");
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject(new String(bArr));
                    String strOptString = jSONObject.optString("deeplink", "");
                    if (TextUtils.isEmpty(strOptString)) {
                        kxw0.g(uuw0Var3);
                        uuw0Var3.n.a("Deferred Deep Link is empty.");
                        return;
                    }
                    String strOptString2 = jSONObject.optString("gclid", "");
                    String strOptString3 = jSONObject.optString("gbraid", "");
                    String strOptString4 = jSONObject.optString("gad_source", "");
                    double dOptDouble = jSONObject.optDouble("timestamp", 0.0d);
                    Bundle bundle = new Bundle();
                    x6x0 x6x0Var = kxw0Var.i;
                    kxw0.e(x6x0Var);
                    kxw0 kxw0Var2 = (kxw0) x6x0Var.b;
                    if (TextUtils.isEmpty(strOptString)) {
                        uuw0Var2 = uuw0Var3;
                    } else {
                        Context context = kxw0Var2.f19080a;
                        uuw0Var2 = uuw0Var3;
                        try {
                            List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(strOptString)), 0);
                            if (listQueryIntentActivities != null && !listQueryIntentActivities.isEmpty()) {
                                if (!TextUtils.isEmpty(strOptString3)) {
                                    bundle.putString("gbraid", strOptString3);
                                }
                                if (!TextUtils.isEmpty(strOptString4)) {
                                    bundle.putString("gad_source", strOptString4);
                                }
                                bundle.putString("gclid", strOptString2);
                                bundle.putString("_cis", "ddp");
                                kxw0Var.m.s1(bundle, "auto", "_cmp");
                                if (TextUtils.isEmpty(strOptString)) {
                                    return;
                                }
                                try {
                                    SharedPreferences.Editor editorEdit = context.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                                    editorEdit.putString("deeplink", strOptString);
                                    editorEdit.putLong("timestamp", Double.doubleToRawLongBits(dOptDouble));
                                    if (editorEdit.commit()) {
                                        Intent intent = new Intent("android.google.analytics.action.DEEPLINK_ACTION");
                                        Context context2 = kxw0Var2.f19080a;
                                        if (Build.VERSION.SDK_INT < 34) {
                                            context2.sendBroadcast(intent);
                                            return;
                                        } else {
                                            context2.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
                                            return;
                                        }
                                    }
                                    return;
                                } catch (RuntimeException e) {
                                    uuw0 uuw0Var4 = ((kxw0) x6x0Var.b).f;
                                    kxw0.g(uuw0Var4);
                                    uuw0Var4.g.b(e, "Failed to persist Deferred Deep Link. exception");
                                    return;
                                }
                            }
                        } catch (JSONException e2) {
                            e = e2;
                            uuw0Var = uuw0Var2;
                            kxw0.g(uuw0Var);
                            uuw0Var.g.b(e, "Failed to parse the Deferred Deep Link response. exception");
                            return;
                        }
                    }
                    kxw0.g(uuw0Var2);
                    uuw0Var = uuw0Var2;
                    try {
                        uuw0Var.j.d("Deferred Deep Link validation failed. gclid, gbraid, deep link", strOptString2, strOptString3, strOptString);
                        return;
                    } catch (JSONException e3) {
                        e = e3;
                        kxw0.g(uuw0Var);
                        uuw0Var.g.b(e, "Failed to parse the Deferred Deep Link response. exception");
                        return;
                    }
                } catch (JSONException e4) {
                    e = e4;
                    uuw0Var = uuw0Var3;
                }
            }
        } else if (i2 == 304) {
            i2 = 304;
            if (th == null) {
                wvw0 wvw0Var2 = kxw0Var.e;
                kxw0.e(wvw0Var2);
                wvw0Var2.u.b(true);
                if (bArr != null) {
                }
                kxw0.g(uuw0Var3);
                uuw0Var3.n.a("Deferred Deep Link response empty.");
                return;
            }
        }
        kxw0.g(uuw0Var3);
        uuw0Var3.j.c(Integer.valueOf(i2), th, "Network Request for Deferred Deep Link failed. response, exception");
    }

    @Override // a.mff0
    public void accept(Object obj, Object obj2) {
        switch (this.f38552a) {
            case 20:
                maw0 maw0Var = new maw0((TaskCompletionSource) obj2, (byte) 1);
                ebw0 ebw0Var = (ebw0) ((paw0) obj).l();
                GetSignInIntentRequest getSignInIntentRequest = (GetSignInIntentRequest) this.b;
                Parcel parcelC = ebw0Var.C();
                int i = taw0.f33634a;
                parcelC.writeStrongBinder(maw0Var);
                taw0.c(parcelC, getSignInIntentRequest);
                ebw0Var.D(parcelC, 3);
                return;
            case 21:
            default:
                h0x0 h0x0Var = (h0x0) ((i0x0) obj).l();
                izw0 izw0Var = new izw0((tzw0) this.b, (TaskCompletionSource) obj2);
                Parcel parcelG = h0x0Var.G();
                wmw0.c(parcelG, izw0Var);
                h0x0Var.H(parcelG, 27);
                return;
            case 22:
                kzw0 kzw0Var = (kzw0) ((fhw0) obj).l();
                hiw0 hiw0Var = new hiw0((mmx) this.b, (TaskCompletionSource) obj2);
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeInterfaceToken("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
                int i2 = ynw0.f42960a;
                parcelObtain.writeStrongBinder(hiw0Var);
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    kzw0Var.f19170a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return;
                } finally {
                    parcelObtain.recycle();
                    parcelObtain2.recycle();
                }
        }
    }

    @Override // a.thx0
    public Iterator b(ikt0 ikt0Var, CharSequence charSequence) {
        return new nex0(ikt0Var, charSequence, (gvw0) this.b, (byte) 1);
    }

    public Object c(int i, md80 md80Var, bnn0 bnn0Var) {
        rkr0 rkr0Var = (rkr0) this.b;
        Map mapS = rkr0Var.s();
        LinkedHashMap linkedHashMap = new LinkedHashMap(mapS);
        Object obj = mapS.get(new Integer(i));
        if (obj == null) {
            obj = xun.f41520a;
        }
        LinkedHashSet linkedHashSetO0 = CollectionsKt.O0((Iterable) obj);
        if (linkedHashSetO0.contains(md80Var)) {
            linkedHashSetO0.remove(md80Var);
        } else {
            if (rkr0Var.r().c == ulr0.TOTO_1XTOTO) {
                linkedHashSetO0.clear();
            }
            linkedHashSetO0.add(md80Var);
        }
        if (linkedHashSetO0.isEmpty()) {
            linkedHashMap.remove(new Integer(i));
        } else {
            linkedHashMap.put(new Integer(i), linkedHashSetO0);
        }
        Object objN = rkr0Var.n(linkedHashMap, bnn0Var);
        return objN == wne.f39444a ? objN : Unit.f46060a;
    }

    public ArrayList d(uaq0 uaq0Var) {
        String str;
        x4p0 x4p0Var = (x4p0) this.b;
        List<v4p0> list = x4p0.d;
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        for (v4p0 v4p0Var : list) {
            boolean zO = StringsKt.O(x4p0Var.c.c(), "ru", false);
            v4p0Var.getClass();
            String str2 = zO ? "/ru/" : "/en/";
            if (v4p0Var.equals(u4p0.f35062a)) {
                str = "1";
            } else if (v4p0Var.equals(t4p0.f33332a)) {
                str = "2";
            } else {
                if (!v4p0Var.equals(s4p0.f31619a)) {
                    t9f.b();
                    return null;
                }
                str = "3";
            }
            uaq0.f35345a.getClass();
            String str3 = "_l";
            if (!s9m0.j(uaq0Var)) {
                if (s9m0.i(uaq0Var)) {
                    str3 = "_d";
                } else if (s9m0.k(uaq0Var)) {
                    str3 = "_n";
                }
            }
            arrayList.add(new r4p0(v4p0Var, b1j.k("static/img/android/instructions/teambet", str2, str, str3, ".webp")));
        }
        return arrayList;
    }

    @Override // a.w7
    public boolean e(View view) {
        fht0 fht0Var = (fht0) this.b;
        int currentItem = ((ViewPager2) view).getCurrentItem() + 1;
        ViewPager2 viewPager2 = (ViewPager2) fht0Var.d;
        if (viewPager2.r) {
            viewPager2.f(currentItem, true);
        }
        return true;
    }

    public void f(long j) {
        ((tfh0) ((zn00) this.b).b).f33866a.o(null, Long.valueOf(j));
    }

    public gmq g(Activity activity) {
        bq9 bq9VarY = nkb.y(new npu0(this, activity, null));
        rwj rwjVar = tvk.f34603a;
        return ulb.L(bq9VarY, ys10.f43147a);
    }

    @Override // a.u73
    public xkq get(int i) {
        return (mlq) this.b;
    }

    @Override // a.qfw0
    public boolean zzb(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (((qfw0[]) this.b)[i].zzb(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // a.qfw0
    public cgw0 zzc(Class cls) {
        for (int i = 0; i < 2; i++) {
            qfw0 qfw0Var = ((qfw0[]) this.b)[i];
            if (qfw0Var.zzb(cls)) {
                return qfw0Var.zzc(cls);
            }
        }
        v4i0.p("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    public /* synthetic */ w4p0(Object obj, byte b) {
        this.f38552a = b;
        this.b = obj;
    }

    public w4p0(byte b) {
        this.f38552a = b;
        switch (b) {
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                break;
            default:
                this.b = new LinkedHashMap();
                break;
        }
    }

    public w4p0(h7q h7qVar) {
        this.f38552a = (byte) 8;
        h7qVar.getClass();
        this.b = h7qVar;
    }

    public w4p0(wwb0 wwb0Var) {
        this.f38552a = (byte) 1;
        wwb0Var.getClass();
        this.b = wwb0Var;
    }

    public w4p0(zep zepVar) {
        this.f38552a = (byte) 16;
        zepVar.getClass();
        this.b = zepVar;
    }

    public /* synthetic */ w4p0(oaw0 oaw0Var, GetSignInIntentRequest getSignInIntentRequest) {
        this.f38552a = (byte) 20;
        this.b = getSignInIntentRequest;
    }

    public w4p0(clz clzVar) {
        this.f38552a = (byte) 15;
        clzVar.getClass();
        this.b = new WeakReference(clzVar);
    }

    public w4p0(njv0 njv0Var, jhv0 jhv0Var, bzs0 bzs0Var) {
        this.f38552a = (byte) 17;
        this.b = jhv0Var;
    }

    public w4p0(float f, float f2) {
        this.f38552a = (byte) 13;
        this.b = new mlq(f, f2);
    }
}

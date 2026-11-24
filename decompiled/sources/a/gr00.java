package a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.gov.nist.core.Separators;
import android.net.Uri;
import android.util.Log;
import com.appsflyer.sdk_base.referrer.Payload;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.Charsets;
import org.xplatform.aggregator.impl.core.navigation.AggregatorScreens$AggregatorMainScreen;
import org.xplatform.verification.status.impl.navigation.VerificationStatusScreens$VerificationStatusFragmentScreen;

/* JADX INFO: loaded from: classes.dex */
public final class gr00 implements lry {
    public static final Object f = new Object();
    public static gr00 g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f11760a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    public gr00(Context context) {
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new ArrayList();
        this.f11760a = context;
        this.e = new g12(this, context.getMainLooper(), (byte) 2);
    }

    public static String k(String str, String str2) {
        try {
            byte[] bArrW = w(str2.substring(0, 32));
            byte[] bArrW2 = w(str2.substring(32, 64));
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArrW, "AES");
            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArrW2);
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(1, secretKeySpec, ivParameterSpec);
            Charset charset = Charsets.UTF_8;
            byte[] bytes = str.getBytes(charset);
            bytes.getClass();
            byte[] bArrDoFinal = cipher.doFinal(bytes);
            bArrDoFinal.getClass();
            String str3 = new String(defpackage.b.c(bArrDoFinal), charset);
            Arrays.fill(bArrW, (byte) 0);
            Arrays.fill(bArrW2, (byte) 0);
            return str3;
        } catch (Exception unused) {
            return "";
        }
    }

    public static gr00 t(Context context) {
        gr00 gr00Var;
        synchronized (f) {
            try {
                gr00Var = g;
                if (gr00Var == null) {
                    gr00Var = new gr00(context.getApplicationContext());
                    g = gr00Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return gr00Var;
    }

    public static byte[] w(String str) {
        int length = str.length();
        byte[] bArr = new byte[length / 2];
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) (Character.digit(str.charAt(i + 1), 16) + (Character.digit(str.charAt(i), 16) << 4));
        }
        return bArr;
    }

    public void A(lr1 lr1Var, boolean z) {
        wv10 wv10Var = wv10.SPORT;
        ab50 ab50Var = new ab50(2);
        AggregatorScreens$AggregatorMainScreen aggregatorScreens$AggregatorMainScreenQ = ((h7i) ((fvt0) this.c).f10231a).d().q(lr1Var);
        ((pmi0) this.e).h(ab50Var);
        ((ouu) this.b).q(ab50Var, true);
        ((oeg0) this.d).b().d(new x9((Object) aggregatorScreens$AggregatorMainScreenQ, z, (byte) 2));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object B(zje zjeVar) {
        zg3 zg3Var;
        if (zjeVar instanceof zg3) {
            zg3Var = (zg3) zjeVar;
            int i = zg3Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                zg3Var.k = i - Integer.MIN_VALUE;
            } else {
                zg3Var = new zg3(this, zjeVar);
            }
        } else {
            zg3Var = new zg3(this, zjeVar);
        }
        Object objD0 = zg3Var.i;
        wne wneVar = wne.f39444a;
        int i2 = zg3Var.k;
        yje yjeVar = null;
        if (i2 == 0) {
            z1x.P(objD0);
            xox xoxVar = (xox) this.c;
            zg3Var.k = 1;
            nhf0 nhf0Var = xoxVar.f41242a;
            objD0 = qjj.d0(((mne) nhf0Var.d).b, new czb(nhf0Var, yjeVar, (byte) 0), zg3Var);
            if (objD0 == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objD0);
        }
        boolean z = !((Boolean) objD0).booleanValue();
        ((zte0) ((dpc) this.d).f6458a.b).f44955a.set(z);
        ((ani0) this.e).d(true);
        ((i1w0) this.f11760a).d(new z((byte) 2, z));
        return Unit.f46060a;
    }

    public void C() {
        i1w0 i1w0Var = (i1w0) this.f11760a;
        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, new f1w0(new VerificationStatusScreens$VerificationStatusFragmentScreen(true, (r9u) ((drm0) this.b).f6568a))), i1w0Var, copyOnWriteArrayListQ, 0);
        while (true) {
            paw pawVar = (paw) listIteratorP;
            if (!pawVar.hasNext()) {
                return;
            } else {
                i1w0Var.a((oe50) pawVar.next());
            }
        }
    }

    public void D(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (((HashMap) this.b)) {
            try {
                fr00 fr00Var = new fr00(broadcastReceiver, intentFilter);
                ArrayList arrayList = (ArrayList) ((HashMap) this.b).get(broadcastReceiver);
                if (arrayList == null) {
                    arrayList = new ArrayList(1);
                    ((HashMap) this.b).put(broadcastReceiver, arrayList);
                }
                arrayList.add(fr00Var);
                for (int i = 0; i < intentFilter.countActions(); i++) {
                    String action = intentFilter.getAction(i);
                    ArrayList arrayList2 = (ArrayList) ((HashMap) this.c).get(action);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList(1);
                        ((HashMap) this.c).put(action, arrayList2);
                    }
                    arrayList2.add(fr00Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean E(Intent intent) {
        String str;
        synchronized (((HashMap) this.b)) {
            try {
                String action = intent.getAction();
                String strResolveTypeIfNeeded = intent.resolveTypeIfNeeded(((Context) this.f11760a).getContentResolver());
                Uri data = intent.getData();
                String scheme = intent.getScheme();
                Set<String> categories = intent.getCategories();
                boolean z = (intent.getFlags() & 8) != 0;
                if (z) {
                    Log.v("LocalBroadcastManager", "Resolving type " + strResolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
                }
                ArrayList arrayList = (ArrayList) ((HashMap) this.c).get(intent.getAction());
                if (arrayList != null) {
                    if (z) {
                        Log.v("LocalBroadcastManager", "Action list: " + arrayList);
                    }
                    ArrayList arrayList2 = null;
                    int i = 0;
                    while (i < arrayList.size()) {
                        fr00 fr00Var = (fr00) arrayList.get(i);
                        if (z) {
                            Log.v("LocalBroadcastManager", "Matching against filter " + fr00Var.f10001a);
                        }
                        if (fr00Var.c) {
                            if (z) {
                                Log.v("LocalBroadcastManager", "  Filter's target already added");
                            }
                            arrayList = arrayList;
                        } else {
                            int iMatch = fr00Var.f10001a.match(action, strResolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                            if (iMatch >= 0) {
                                if (z) {
                                    Log.v("LocalBroadcastManager", "  Filter matched!  match=0x" + Integer.toHexString(iMatch));
                                }
                                if (arrayList2 == null) {
                                    arrayList2 = new ArrayList();
                                }
                                arrayList2.add(fr00Var);
                                fr00Var.c = true;
                            } else {
                                arrayList = arrayList;
                                if (z) {
                                    if (iMatch == -4) {
                                        str = "category";
                                    } else if (iMatch == -3) {
                                        str = "action";
                                    } else if (iMatch != -2) {
                                        str = iMatch != -1 ? "unknown reason" : Payload.TYPE;
                                    } else {
                                        str = RemoteMessageConst.DATA;
                                    }
                                    Log.v("LocalBroadcastManager", "  Filter did not match: " + str);
                                }
                            }
                        }
                        i++;
                        arrayList = arrayList;
                    }
                    if (arrayList2 != null) {
                        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                            ((fr00) arrayList2.get(i2)).c = false;
                        }
                        ((ArrayList) this.d).add(new edu((Object) intent, (Object) arrayList2, (byte) 29));
                        if (!((g12) this.e).hasMessages(1)) {
                            ((g12) this.e).sendEmptyMessage(1);
                        }
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void F(BroadcastReceiver broadcastReceiver) {
        synchronized (((HashMap) this.b)) {
            try {
                ArrayList arrayList = (ArrayList) ((HashMap) this.b).remove(broadcastReceiver);
                if (arrayList == null) {
                    return;
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    fr00 fr00Var = (fr00) arrayList.get(size);
                    fr00Var.d = true;
                    for (int i = 0; i < fr00Var.f10001a.countActions(); i++) {
                        String action = fr00Var.f10001a.getAction(i);
                        ArrayList arrayList2 = (ArrayList) ((HashMap) this.c).get(action);
                        if (arrayList2 != null) {
                            for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                                fr00 fr00Var2 = (fr00) arrayList2.get(size2);
                                if (fr00Var2.b == broadcastReceiver) {
                                    fr00Var2.d = true;
                                    arrayList2.remove(size2);
                                }
                            }
                            if (arrayList2.size() <= 0) {
                                ((HashMap) this.c).remove(action);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // a.lry
    public void a() {
        ((xzp) this.b).a();
        xzp xzpVar = (xzp) this.c;
        ((HashMap) xzpVar.b).put((g950) this.e, new e93((t83) CollectionsKt.v0((ArrayList) this.d)));
    }

    @Override // a.lry
    public void b(g950 g950Var, qlc qlcVar, g950 g950Var2) {
        ((xzp) this.f11760a).b(g950Var, qlcVar, g950Var2);
    }

    @Override // a.lry
    public void c(g950 g950Var, Object obj) {
        ((xzp) this.f11760a).c(g950Var, obj);
    }

    public void d(v23 v23Var, sgy sgyVar) {
        ((ArrayList) this.f11760a).add(new Pair(v23Var, sgyVar));
    }

    public void e(nqp nqpVar, sgy sgyVar) {
        ((ArrayList) this.c).add(new yw9(nqpVar, sgyVar, (byte) 17));
    }

    public s5a f(pa5 pa5Var, Function0 function0) {
        int i;
        int i2;
        int i3;
        kie0 kie0Var = new kie0();
        kie0Var.f18333a = -1;
        synchronized (this.f11760a) {
            Throwable th = (Throwable) this.b;
            if (th != null) {
                pa5Var.b(th);
                return gqw0.s;
            }
            a14 a14Var = (a14) this.c;
            do {
                i = a14Var.get();
                i2 = i + 1;
            } while (!a14Var.compareAndSet(i, i2));
            boolean z = (134217727 & i2) == 1;
            kie0Var.f18333a = (i2 >>> 27) & 15;
            ((vy40) this.d).a(pa5Var);
            if (z) {
                try {
                    function0.invoke();
                } catch (Throwable th2) {
                    synchronized (this.f11760a) {
                        try {
                            if (((Throwable) this.b) == null) {
                                this.b = th2;
                                vy40 vy40Var = (vy40) this.d;
                                Object[] objArr = vy40Var.f38232a;
                                int i4 = vy40Var.b;
                                for (int i5 = 0; i5 < i4; i5++) {
                                    ((pa5) objArr[i5]).b(th2);
                                }
                                ((vy40) this.d).d();
                                a14 a14Var2 = (a14) this.c;
                                do {
                                    i3 = a14Var2.get();
                                } while (!a14Var2.compareAndSet(i3, ((((i3 >>> 27) & 15) + 1) & 15) << 27));
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
            }
            return new nw20(new kk0(pa5Var, this, kie0Var, (byte) 6));
        }
    }

    public a55 g() {
        String strConcat = ((hzj) this.f11760a) == null ? " surface" : "";
        if (((List) this.b) == null) {
            strConcat = strConcat.concat(" sharedSurfaces");
        }
        if (((Integer) this.c) == null) {
            strConcat = strConcat.concat(" mirrorMode");
        }
        if (((Integer) this.d) == null) {
            strConcat = strConcat.concat(" surfaceGroupId");
        }
        if (((agn) this.e) == null) {
            strConcat = strConcat.concat(" dynamicRange");
        }
        if (strConcat.isEmpty()) {
            return new a55((hzj) this.f11760a, (List) this.b, ((Integer) this.c).intValue(), ((Integer) this.d).intValue(), (agn) this.e);
        }
        jf4.n("Missing required properties:".concat(strConcat));
        return null;
    }

    public fua h() {
        return new fua((mta) ((n5d0) this.e).get(), (zvf) this.b, (kta) this.c, (mne) this.d);
    }

    @Override // a.lry
    public lry i(qlc qlcVar, g950 g950Var) {
        return ((xzp) this.f11760a).i(qlcVar, g950Var);
    }

    @Override // a.lry
    public mry j(g950 g950Var) {
        return ((xzp) this.f11760a).j(g950Var);
    }

    /* JADX WARN: Code duplicated, block: B:134:0x0c13 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:135:0x0c14  */
    /* JADX WARN: Code duplicated, block: B:150:0x066d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:152:0x071c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:154:0x0702 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:157:0x0a29 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:159:0x0a0f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:162:0x0aa3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:164:0x0a89 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x0654  */
    /* JADX WARN: Code duplicated, block: B:46:0x066a  */
    /* JADX WARN: Code duplicated, block: B:50:0x0681  */
    /* JADX WARN: Code duplicated, block: B:52:0x068a  */
    /* JADX WARN: Code duplicated, block: B:53:0x069d  */
    /* JADX WARN: Code duplicated, block: B:57:0x0708  */
    /* JADX WARN: Code duplicated, block: B:62:0x072d  */
    /* JADX WARN: Code duplicated, block: B:64:0x0736  */
    /* JADX WARN: Code duplicated, block: B:65:0x0739  */
    /* JADX WARN: Code duplicated, block: B:67:0x073c  */
    /* JADX WARN: Code duplicated, block: B:68:0x08a1  */
    /* JADX WARN: Code duplicated, block: B:72:0x0a15  */
    /* JADX WARN: Code duplicated, block: B:77:0x0a3a  */
    /* JADX WARN: Code duplicated, block: B:79:0x0a43  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x0a46  */
    /* JADX WARN: Code duplicated, block: B:82:0x0a49  */
    /* JADX WARN: Code duplicated, block: B:83:0x0a5c  */
    /* JADX WARN: Code duplicated, block: B:87:0x0a8f  */
    /* JADX WARN: Code duplicated, block: B:91:0x0acd  */
    /* JADX WARN: Code duplicated, block: B:93:0x0ad1  */
    /* JADX WARN: Code duplicated, block: B:95:0x0ad5  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v122, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v44, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v45, types: [java.lang.Iterable] */
    public Object l(String str, String str2, zje zjeVar) {
        u6a u6aVar;
        u6a u6aVar2;
        wne wneVar;
        iqi iqiVar;
        String str3;
        String str4;
        yje yjeVar;
        Map linkedHashMap;
        LinkedHashMap linkedHashMap2;
        String str5;
        String str6;
        iqi iqiVar2;
        wne wneVar2;
        LinkedHashMap linkedHashMap3;
        iqi iqiVar3;
        ?? arrayList;
        List<Pair> listJ;
        ArrayList arrayList2;
        tul0 tul0Var;
        List<Pair> listJ2;
        ArrayList arrayList3;
        int i;
        tul0 tul0Var2;
        List<Pair> listJ3;
        ArrayList arrayList4;
        int i2;
        tul0 tul0Var3;
        List<Pair> listJ4;
        ArrayList arrayList5;
        veq veqVarZ;
        veq veqVarZ2;
        veq veqVarZ3;
        veq veqVarZ4;
        Object g0g0Var;
        gr00 gr00Var = this;
        if (zjeVar instanceof u6a) {
            u6aVar = (u6a) zjeVar;
            int i3 = u6aVar.p;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                u6aVar.p = i3 - Integer.MIN_VALUE;
            } else {
                u6aVar = new u6a(gr00Var, zjeVar);
            }
        } else {
            u6aVar = new u6a(gr00Var, zjeVar);
        }
        Object objD0 = u6aVar.n;
        wne wneVar3 = wne.f39444a;
        int i4 = u6aVar.p;
        byte b = 8;
        if (i4 == 0) {
            z1x.P(objD0);
            us00 us00Var = (us00) gr00Var.f11760a;
            int i5 = oeq.f25137a;
            iqi iqiVar4 = new iqi(new neq(us00Var, (byte) 6));
            Object obj = ((j0g0) ((n0o0) iqiVar4.b).getValue()).f15681a;
            if (!(obj instanceof g0g0)) {
                e0g0 e0g0Var = j0g0.b;
                obj = ((peq) obj).f26865a;
            }
            Throwable thA = j0g0.a(obj);
            if (thA != null) {
                Log.e("FingerprintJS", "Unexpected error occurred. Feel free to create an issue on Github repository of the fingerprintjs-android library.", thA);
            }
            if (obj instanceof g0g0) {
                obj = null;
            }
            zeq zeqVar = (zeq) obj;
            if (zeqVar != null) {
                meq meqVar = meq.V_5;
                tul0 tul0Var4 = tul0.b;
                ueq ueqVar = eo20.b;
                yjeVar = null;
                Pair pair = new Pair(ueqVar, new weq(zeqVar, (byte) 27));
                ueq ueqVar2 = im40.b;
                Pair pair2 = new Pair(ueqVar2, new xeq(zeqVar, b));
                ueq ueqVar3 = ngr0.b;
                Pair pair3 = new Pair(ueqVar3, new xeq(zeqVar, (byte) 19));
                ueq ueqVar4 = mgr0.b;
                Pair pair4 = new Pair(ueqVar4, new yeq(zeqVar, (byte) 0));
                ueq ueqVar5 = jyb0.b;
                Pair pair5 = new Pair(ueqVar5, new yeq(zeqVar, (byte) 2));
                ueq ueqVar6 = kyb0.b;
                str3 = "FingerprintJS";
                Pair pair6 = new Pair(ueqVar6, new yeq(zeqVar, (byte) 3));
                ueq ueqVar7 = ofi0.b;
                str4 = "Unexpected error occurred. Feel free to create an issue on Github repository of the fingerprintjs-android library.";
                Pair pair7 = new Pair(ueqVar7, new yeq(zeqVar, (byte) 4));
                ueq ueqVar8 = qex.b;
                wneVar = wneVar3;
                Pair pair8 = new Pair(ueqVar8, new yeq(zeqVar, (byte) 5));
                ueq ueqVar9 = rex.b;
                iqiVar = iqiVar4;
                Pair pair9 = new Pair(ueqVar9, new yeq(zeqVar, (byte) 6));
                ueq ueqVar10 = za6.b;
                u6aVar2 = u6aVar;
                Pair pair10 = new Pair(ueqVar10, new weq(zeqVar, (byte) 17));
                ueq ueqVar11 = xa6.b;
                Pair pair11 = new Pair(ueqVar11, new weq(zeqVar, (byte) 18));
                tul0 tul0Var5 = tul0Var4;
                Pair pair12 = new Pair(ya6.b, new weq(zeqVar, (byte) 19));
                ueq ueqVar12 = y0a.b;
                Pair pair13 = new Pair(ueqVar12, new weq(zeqVar, (byte) 20));
                ueq ueqVar13 = q7v.b;
                Pair pair14 = new Pair(ueqVar13, new weq(zeqVar, (byte) 21));
                ueq ueqVar14 = q.b;
                Pair pair15 = new Pair(ueqVar14, new weq(zeqVar, (byte) 22));
                ueq ueqVar15 = bne.b;
                List<Pair> listJ5 = q3d.j(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, pair10, pair11, pair12, pair13, pair14, pair15, new Pair(ueqVar15, new weq(zeqVar, (byte) 23)), new Pair(leq.b, new weq(zeqVar, (byte) 24)), new Pair(y23.b, new weq(zeqVar, (byte) 25)), new Pair(vch0.b, new weq(zeqVar, (byte) 26)), new Pair(pjy.b, new weq(zeqVar, (byte) 28)), new Pair(ywn.b, new weq(zeqVar, (byte) 29)), new Pair(gyc.b, new xeq(zeqVar, (byte) 0)), new Pair(lsh0.b, new xeq(zeqVar, (byte) 1)), new Pair(av3.b, new xeq(zeqVar, (byte) 2)), new Pair(z8o0.b, new xeq(zeqVar, (byte) 3)), new Pair(op.b, new xeq(zeqVar, (byte) 4)), new Pair(ngk.b, new xeq(zeqVar, (byte) 5)), new Pair(stw.b, new xeq(zeqVar, (byte) 6)), new Pair(ims0.b, new xeq(zeqVar, (byte) 7)), new Pair(ihv0.b, new xeq(zeqVar, (byte) 9)), new Pair(fbj.b, new xeq(zeqVar, (byte) 10)), new Pair(q6.b, new xeq(zeqVar, (byte) 11)), new Pair(avj.b, new xeq(zeqVar, (byte) 12)), new Pair(vkg0.b, new xeq(zeqVar, (byte) 13)), new Pair(ewr0.b, new xeq(zeqVar, (byte) 14)), new Pair(c12.b, new xeq(zeqVar, (byte) 15)), new Pair(qdj.b, new xeq(zeqVar, (byte) 16)), new Pair(zwn.b, new xeq(zeqVar, (byte) 17)), new Pair(ksq.b, new xeq(zeqVar, (byte) 18)), new Pair(s7h0.b, new xeq(zeqVar, (byte) 20)), new Pair(a3q0.b, new xeq(zeqVar, (byte) 21)), new Pair(z2q0.b, new xeq(zeqVar, (byte) 22)), new Pair(ogq0.b, new xeq(zeqVar, (byte) 23)), new Pair(mqx.b, new xeq(zeqVar, (byte) 24)), new Pair(keq.b, new xeq(zeqVar, (byte) 25)), new Pair(gcg0.b, new xeq(zeqVar, (byte) 26)), new Pair(i85.b, new xeq(zeqVar, (byte) 27)), new Pair(pse0.b, new xeq(zeqVar, (byte) 28)), new Pair(nvj.b, new xeq(zeqVar, (byte) 29)), new Pair(eoq0.b, new yeq(zeqVar, (byte) 1)));
                meq meqVar2 = meq.V_1;
                meq.b.getClass();
                if (meqVar.compareTo(meq.V_4) > 0 || meqVar.compareTo(meqVar2) < 0) {
                    arrayList = new ArrayList();
                    for (Pair pair16 : listJ5) {
                        veq veqVarZ5 = g8x.z(tul0Var5, (ueq) pair16.f46059a, (Function0) pair16.b);
                        if (veqVarZ5 != null) {
                            arrayList.add(veqVarZ5);
                        }
                    }
                } else {
                    if (meqVar.compareTo(meqVar) >= 0) {
                        jf4.o("Failed requirement.");
                        return null;
                    }
                    if (qeq.f28596a[4] == 1) {
                        ueq ueqVar16 = eo20.b;
                        Pair pair17 = new Pair(ueqVar, new seq(zeqVar, (byte) 24));
                        ueq ueqVar17 = im40.b;
                        Pair pair18 = new Pair(ueqVar2, new teq(zeqVar, (byte) 5));
                        ueq ueqVar18 = ngr0.b;
                        Pair pair19 = new Pair(ueqVar3, new teq(zeqVar, (byte) 12));
                        ueq ueqVar19 = mgr0.b;
                        Pair pair20 = new Pair(ueqVar4, new teq(zeqVar, (byte) 13));
                        ueq ueqVar20 = jyb0.b;
                        Pair pair21 = new Pair(ueqVar5, new teq(zeqVar, (byte) 14));
                        ueq ueqVar21 = ofi0.b;
                        Pair pair22 = new Pair(ueqVar7, new teq(zeqVar, (byte) 15));
                        ueq ueqVar22 = qex.b;
                        listJ = q3d.j(pair17, pair18, pair19, pair20, pair21, pair22, new Pair(ueqVar8, new teq(zeqVar, (byte) 16)));
                    } else {
                        meq meqVar3 = meq.V_2;
                        if (meqVar.compareTo(meq.V_3) > 0 || meqVar.compareTo(meqVar3) < 0) {
                            ueq ueqVar23 = eo20.b;
                            Pair pair23 = new Pair(ueqVar, new seq(zeqVar, (byte) 26));
                            ueq ueqVar24 = im40.b;
                            Pair pair24 = new Pair(ueqVar2, new seq(zeqVar, (byte) 27));
                            ueq ueqVar25 = ngr0.b;
                            Pair pair25 = new Pair(ueqVar3, new seq(zeqVar, (byte) 28));
                            ueq ueqVar26 = mgr0.b;
                            Pair pair26 = new Pair(ueqVar4, new seq(zeqVar, (byte) 29));
                            ueq ueqVar27 = jyb0.b;
                            Pair pair27 = new Pair(ueqVar5, new teq(zeqVar, (byte) 0));
                            ueq ueqVar28 = kyb0.b;
                            Pair pair28 = new Pair(ueqVar6, new teq(zeqVar, (byte) 1));
                            ueq ueqVar29 = ofi0.b;
                            Pair pair29 = new Pair(ueqVar7, new teq(zeqVar, (byte) 2));
                            ueq ueqVar30 = qex.b;
                            Pair pair30 = new Pair(ueqVar8, new teq(zeqVar, (byte) 3));
                            ueq ueqVar31 = rex.b;
                            Pair pair31 = new Pair(ueqVar9, new teq(zeqVar, (byte) 4));
                            ueq ueqVar32 = za6.b;
                            Pair pair32 = new Pair(ueqVar10, new teq(zeqVar, (byte) 6));
                            ueq ueqVar33 = xa6.b;
                            Pair pair33 = new Pair(ueqVar11, new teq(zeqVar, (byte) 7));
                            ueq ueqVar34 = y0a.b;
                            Pair pair34 = new Pair(ueqVar12, new teq(zeqVar, (byte) 8));
                            ueq ueqVar35 = q7v.b;
                            Pair pair35 = new Pair(ueqVar13, new teq(zeqVar, (byte) 9));
                            ueq ueqVar36 = q.b;
                            Pair pair36 = new Pair(ueqVar14, new teq(zeqVar, (byte) 10));
                            ueq ueqVar37 = bne.b;
                            listJ = q3d.j(pair23, pair24, pair25, pair26, pair27, pair28, pair29, pair30, pair31, pair32, pair33, pair34, pair35, pair36, new Pair(ueqVar15, new teq(zeqVar, (byte) 11)));
                        } else {
                            ueq ueqVar38 = eo20.b;
                            Pair pair37 = new Pair(ueqVar, new teq(zeqVar, (byte) 17));
                            ueq ueqVar39 = im40.b;
                            Pair pair38 = new Pair(ueqVar2, new teq(zeqVar, (byte) 18));
                            ueq ueqVar40 = ngr0.b;
                            Pair pair39 = new Pair(ueqVar3, new seq(zeqVar, (byte) 14));
                            ueq ueqVar41 = mgr0.b;
                            Pair pair40 = new Pair(ueqVar4, new seq(zeqVar, (byte) 15));
                            ueq ueqVar42 = jyb0.b;
                            Pair pair41 = new Pair(ueqVar5, new seq(zeqVar, (byte) 16));
                            ueq ueqVar43 = ofi0.b;
                            Pair pair42 = new Pair(ueqVar7, new seq(zeqVar, (byte) 17));
                            ueq ueqVar44 = qex.b;
                            Pair pair43 = new Pair(ueqVar8, new seq(zeqVar, (byte) 18));
                            ueq ueqVar45 = xa6.b;
                            Pair pair44 = new Pair(ueqVar11, new seq(zeqVar, (byte) 19));
                            ueq ueqVar46 = za6.b;
                            Pair pair45 = new Pair(ueqVar10, new seq(zeqVar, (byte) 20));
                            ueq ueqVar47 = q7v.b;
                            Pair pair46 = new Pair(ueqVar13, new seq(zeqVar, (byte) 21));
                            ueq ueqVar48 = q.b;
                            Pair pair47 = new Pair(ueqVar14, new seq(zeqVar, (byte) 22));
                            ueq ueqVar49 = bne.b;
                            Pair pair48 = new Pair(ueqVar15, new seq(zeqVar, (byte) 23));
                            ueq ueqVar50 = y0a.b;
                            listJ = q3d.j(pair37, pair38, pair39, pair40, pair41, pair42, pair43, pair44, pair45, pair46, pair47, pair48, new Pair(ueqVar12, new seq(zeqVar, (byte) 25)));
                        }
                        arrayList2 = new ArrayList();
                        for (Pair pair49 : listJ) {
                            tul0 tul0Var6 = tul0Var5;
                            veqVarZ4 = g8x.z(tul0Var6, (ueq) pair49.f46059a, (Function0) pair49.b);
                            if (veqVarZ4 != null) {
                                arrayList2.add(veqVarZ4);
                            }
                            tul0Var5 = tul0Var6;
                        }
                        tul0Var = tul0Var5;
                        meq.b.getClass();
                        if (meqVar.compareTo(meq.V_5) < 0) {
                            jf4.o("Failed requirement.");
                            return null;
                        }
                        if (qeq.f28596a[4] == 1) {
                            listJ2 = kotlin.collections.a.c(new Pair(leq.b, new teq(zeqVar, (byte) 22)));
                        } else {
                            listJ2 = q3d.j(new Pair(y23.b, new teq(zeqVar, (byte) 23)), new Pair(vch0.b, new teq(zeqVar, (byte) 24)), new Pair(pjy.b, new teq(zeqVar, (byte) 25)), new Pair(ywn.b, new teq(zeqVar, (byte) 26)), new Pair(lsh0.b, new teq(zeqVar, (byte) 27)), new Pair(gyc.b, new teq(zeqVar, (byte) 28)));
                        }
                        arrayList3 = new ArrayList();
                        for (Pair pair50 : listJ2) {
                            veqVarZ3 = g8x.z(tul0Var, (ueq) pair50.f46059a, (Function0) pair50.b);
                            if (veqVarZ3 != null) {
                                arrayList3.add(veqVarZ3);
                            }
                        }
                        meq.b.getClass();
                        if (meqVar.compareTo(meq.V_5) < 0) {
                            jf4.o("Failed requirement.");
                            return null;
                        }
                        i = qeq.f28596a[4];
                        if (i == 1) {
                            tul0Var2 = tul0.c;
                        } else {
                            tul0Var2 = tul0Var;
                        }
                        if (i == 1) {
                            listJ3 = q3d.j(new Pair(op.b, new req(zeqVar, (byte) 10)), new Pair(ngk.b, new req(zeqVar, (byte) 21)), new Pair(stw.b, new seq(zeqVar, (byte) 2)), new Pair(ims0.b, new seq(zeqVar, (byte) 8)), new Pair(ihv0.b, new seq(zeqVar, (byte) 9)), new Pair(fbj.b, new seq(zeqVar, (byte) 10)), new Pair(q6.b, new seq(zeqVar, (byte) 11)), new Pair(avj.b, new seq(zeqVar, (byte) 12)), new Pair(vkg0.b, new seq(zeqVar, (byte) 13)), new Pair(ewr0.b, new req(zeqVar, (byte) 0)), new Pair(c12.b, new req(zeqVar, (byte) 1)), new Pair(qdj.b, new req(zeqVar, (byte) 2)), new Pair(zwn.b, new req(zeqVar, (byte) 3)), new Pair(ksq.b, new req(zeqVar, (byte) 4)), new Pair(s7h0.b, new req(zeqVar, (byte) 5)), new Pair(a3q0.b, new req(zeqVar, (byte) 6)), new Pair(z2q0.b, new req(zeqVar, (byte) 7)), new Pair(ogq0.b, new req(zeqVar, (byte) 8)), new Pair(mqx.b, new req(zeqVar, (byte) 9)), new Pair(keq.b, new req(zeqVar, (byte) 11)), new Pair(gcg0.b, new req(zeqVar, (byte) 12)), new Pair(i85.b, new req(zeqVar, (byte) 13)));
                        } else {
                            listJ3 = q3d.j(new Pair(op.b, new req(zeqVar, (byte) 14)), new Pair(ngk.b, new req(zeqVar, (byte) 15)), new Pair(stw.b, new req(zeqVar, (byte) 16)), new Pair(ims0.b, new req(zeqVar, (byte) 17)), new Pair(ihv0.b, new req(zeqVar, (byte) 18)), new Pair(fbj.b, new req(zeqVar, (byte) 19)), new Pair(q6.b, new req(zeqVar, (byte) 20)), new Pair(avj.b, new req(zeqVar, (byte) 22)), new Pair(ewr0.b, new req(zeqVar, (byte) 23)), new Pair(c12.b, new req(zeqVar, (byte) 24)), new Pair(qdj.b, new req(zeqVar, (byte) 25)), new Pair(zwn.b, new req(zeqVar, (byte) 26)), new Pair(ksq.b, new req(zeqVar, (byte) 27)), new Pair(s7h0.b, new req(zeqVar, (byte) 28)), new Pair(ogq0.b, new req(zeqVar, (byte) 29)), new Pair(mqx.b, new seq(zeqVar, (byte) 0)), new Pair(keq.b, new seq(zeqVar, (byte) 1)), new Pair(gcg0.b, new seq(zeqVar, (byte) 3)), new Pair(i85.b, new seq(zeqVar, (byte) 4)), new Pair(pse0.b, new seq(zeqVar, (byte) 5)), new Pair(eoq0.b, new seq(zeqVar, (byte) 6)), new Pair(nvj.b, new seq(zeqVar, (byte) 7)));
                        }
                        arrayList4 = new ArrayList();
                        for (Pair pair51 : listJ3) {
                            veqVarZ2 = g8x.z(tul0Var2, (ueq) pair51.f46059a, (Function0) pair51.b);
                            if (veqVarZ2 != null) {
                                arrayList4.add(veqVarZ2);
                            }
                        }
                        meq.b.getClass();
                        if (meqVar.compareTo(meq.V_5) < 0) {
                            jf4.o("Failed requirement.");
                            return null;
                        }
                        i2 = qeq.f28596a[4];
                        if (i2 == 1) {
                            tul0Var3 = tul0.c;
                        } else {
                            tul0Var3 = tul0Var;
                        }
                        if (i2 == 1) {
                            listJ4 = kotlin.collections.a.c(new Pair(av3.b, new teq(zeqVar, (byte) 19)));
                        } else {
                            listJ4 = q3d.j(new Pair(av3.b, new teq(zeqVar, (byte) 20)), new Pair(z8o0.b, new teq(zeqVar, (byte) 21)));
                        }
                        arrayList5 = new ArrayList();
                        for (Pair pair52 : listJ4) {
                            veqVarZ = g8x.z(tul0Var3, (ueq) pair52.f46059a, (Function0) pair52.b);
                            if (veqVarZ != null) {
                                arrayList5.add(veqVarZ);
                            }
                        }
                        arrayList = CollectionsKt.A0(r3d.r(q3d.j(arrayList2, arrayList3, arrayList4, arrayList5)), new pkf(listJ5, (byte) 1));
                    }
                    arrayList2 = new ArrayList();
                    while (r2.hasNext()) {
                        tul0 tul0Var7 = tul0Var5;
                        veqVarZ4 = g8x.z(tul0Var7, (ueq) pair49.f46059a, (Function0) pair49.b);
                        if (veqVarZ4 != null) {
                            arrayList2.add(veqVarZ4);
                        }
                        tul0Var5 = tul0Var7;
                    }
                    tul0Var = tul0Var5;
                    meq.b.getClass();
                    if (meqVar.compareTo(meq.V_5) < 0) {
                        jf4.o("Failed requirement.");
                        return null;
                    }
                    if (qeq.f28596a[4] == 1) {
                        listJ2 = kotlin.collections.a.c(new Pair(leq.b, new teq(zeqVar, (byte) 22)));
                    } else {
                        listJ2 = q3d.j(new Pair(y23.b, new teq(zeqVar, (byte) 23)), new Pair(vch0.b, new teq(zeqVar, (byte) 24)), new Pair(pjy.b, new teq(zeqVar, (byte) 25)), new Pair(ywn.b, new teq(zeqVar, (byte) 26)), new Pair(lsh0.b, new teq(zeqVar, (byte) 27)), new Pair(gyc.b, new teq(zeqVar, (byte) 28)));
                    }
                    arrayList3 = new ArrayList();
                    while (r2.hasNext()) {
                        veqVarZ3 = g8x.z(tul0Var, (ueq) pair50.f46059a, (Function0) pair50.b);
                        if (veqVarZ3 != null) {
                            arrayList3.add(veqVarZ3);
                        }
                    }
                    meq.b.getClass();
                    if (meqVar.compareTo(meq.V_5) < 0) {
                        jf4.o("Failed requirement.");
                        return null;
                    }
                    i = qeq.f28596a[4];
                    if (i == 1) {
                        tul0Var2 = tul0.c;
                    } else {
                        tul0Var2 = tul0Var;
                    }
                    if (i == 1) {
                        listJ3 = q3d.j(new Pair(op.b, new req(zeqVar, (byte) 10)), new Pair(ngk.b, new req(zeqVar, (byte) 21)), new Pair(stw.b, new seq(zeqVar, (byte) 2)), new Pair(ims0.b, new seq(zeqVar, (byte) 8)), new Pair(ihv0.b, new seq(zeqVar, (byte) 9)), new Pair(fbj.b, new seq(zeqVar, (byte) 10)), new Pair(q6.b, new seq(zeqVar, (byte) 11)), new Pair(avj.b, new seq(zeqVar, (byte) 12)), new Pair(vkg0.b, new seq(zeqVar, (byte) 13)), new Pair(ewr0.b, new req(zeqVar, (byte) 0)), new Pair(c12.b, new req(zeqVar, (byte) 1)), new Pair(qdj.b, new req(zeqVar, (byte) 2)), new Pair(zwn.b, new req(zeqVar, (byte) 3)), new Pair(ksq.b, new req(zeqVar, (byte) 4)), new Pair(s7h0.b, new req(zeqVar, (byte) 5)), new Pair(a3q0.b, new req(zeqVar, (byte) 6)), new Pair(z2q0.b, new req(zeqVar, (byte) 7)), new Pair(ogq0.b, new req(zeqVar, (byte) 8)), new Pair(mqx.b, new req(zeqVar, (byte) 9)), new Pair(keq.b, new req(zeqVar, (byte) 11)), new Pair(gcg0.b, new req(zeqVar, (byte) 12)), new Pair(i85.b, new req(zeqVar, (byte) 13)));
                    } else {
                        listJ3 = q3d.j(new Pair(op.b, new req(zeqVar, (byte) 14)), new Pair(ngk.b, new req(zeqVar, (byte) 15)), new Pair(stw.b, new req(zeqVar, (byte) 16)), new Pair(ims0.b, new req(zeqVar, (byte) 17)), new Pair(ihv0.b, new req(zeqVar, (byte) 18)), new Pair(fbj.b, new req(zeqVar, (byte) 19)), new Pair(q6.b, new req(zeqVar, (byte) 20)), new Pair(avj.b, new req(zeqVar, (byte) 22)), new Pair(ewr0.b, new req(zeqVar, (byte) 23)), new Pair(c12.b, new req(zeqVar, (byte) 24)), new Pair(qdj.b, new req(zeqVar, (byte) 25)), new Pair(zwn.b, new req(zeqVar, (byte) 26)), new Pair(ksq.b, new req(zeqVar, (byte) 27)), new Pair(s7h0.b, new req(zeqVar, (byte) 28)), new Pair(ogq0.b, new req(zeqVar, (byte) 29)), new Pair(mqx.b, new seq(zeqVar, (byte) 0)), new Pair(keq.b, new seq(zeqVar, (byte) 1)), new Pair(gcg0.b, new seq(zeqVar, (byte) 3)), new Pair(i85.b, new seq(zeqVar, (byte) 4)), new Pair(pse0.b, new seq(zeqVar, (byte) 5)), new Pair(eoq0.b, new seq(zeqVar, (byte) 6)), new Pair(nvj.b, new seq(zeqVar, (byte) 7)));
                    }
                    arrayList4 = new ArrayList();
                    while (r0.hasNext()) {
                        veqVarZ2 = g8x.z(tul0Var2, (ueq) pair51.f46059a, (Function0) pair51.b);
                        if (veqVarZ2 != null) {
                            arrayList4.add(veqVarZ2);
                        }
                    }
                    meq.b.getClass();
                    if (meqVar.compareTo(meq.V_5) < 0) {
                        jf4.o("Failed requirement.");
                        return null;
                    }
                    i2 = qeq.f28596a[4];
                    if (i2 == 1) {
                        tul0Var3 = tul0.c;
                    } else {
                        tul0Var3 = tul0Var;
                    }
                    if (i2 == 1) {
                        listJ4 = kotlin.collections.a.c(new Pair(av3.b, new teq(zeqVar, (byte) 19)));
                    } else {
                        listJ4 = q3d.j(new Pair(av3.b, new teq(zeqVar, (byte) 20)), new Pair(z8o0.b, new teq(zeqVar, (byte) 21)));
                    }
                    arrayList5 = new ArrayList();
                    while (r0.hasNext()) {
                        veqVarZ = g8x.z(tul0Var3, (ueq) pair52.f46059a, (Function0) pair52.b);
                        if (veqVarZ != null) {
                            arrayList5.add(veqVarZ);
                        }
                    }
                    arrayList = CollectionsKt.A0(r3d.r(q3d.j(arrayList2, arrayList3, arrayList4, arrayList5)), new pkf(listJ5, (byte) 1));
                }
                if (arrayList != 0) {
                    ArrayList arrayList6 = new ArrayList();
                    for (veq veqVar : arrayList) {
                        Object objB = veqVar.b();
                        Pair pair53 = objB != null ? new Pair(veqVar.getClass().getSimpleName(), objB instanceof List ? CollectionsKt.b0((Iterable) objB, Separators.COMMA, null, null, new d69((byte) 8), 30) : objB.toString()) : null;
                        if (pair53 != null) {
                            arrayList6.add(pair53);
                        }
                    }
                    LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                    for (Object obj2 : arrayList6) {
                        String str7 = (String) ((Pair) obj2).f46059a;
                        Object arrayList7 = linkedHashMap4.get(str7);
                        if (arrayList7 == null) {
                            arrayList7 = new ArrayList();
                            linkedHashMap4.put(str7, arrayList7);
                        }
                        ((List) arrayList7).add(obj2);
                    }
                    linkedHashMap = new LinkedHashMap(wp20.a(linkedHashMap4.size()));
                    for (Map.Entry entry : linkedHashMap4.entrySet()) {
                        linkedHashMap.put(entry.getKey(), CollectionsKt.b0((Iterable) entry.getValue(), Separators.COMMA, null, null, new d69((byte) 9), 30));
                    }
                }
                linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.putAll(linkedHashMap);
                gr00Var = this;
                x7w0 x7w0Var = (x7w0) gr00Var.e;
                str5 = str;
                u6a u6aVar3 = u6aVar2;
                u6aVar3.i = str5;
                str6 = str2;
                u6aVar3.j = str6;
                iqiVar2 = iqiVar;
                u6aVar3.k = iqiVar2;
                u6aVar3.l = linkedHashMap2;
                u6aVar3.m = linkedHashMap2;
                u6aVar3.p = 1;
                rwj rwjVar = tvk.f34603a;
                objD0 = qjj.d0(dvj.c, new wup0(x7w0Var, yjeVar, (byte) 23), u6aVar3);
                wneVar2 = wneVar;
                if (objD0 == wneVar2) {
                    return wneVar2;
                }
                linkedHashMap3 = linkedHashMap2;
                iqiVar3 = iqiVar2;
            } else {
                u6aVar2 = u6aVar;
                wneVar = wneVar3;
                iqiVar = iqiVar4;
                str3 = "FingerprintJS";
                str4 = "Unexpected error occurred. Feel free to create an issue on Github repository of the fingerprintjs-android library.";
                yjeVar = null;
            }
            linkedHashMap = lun.f20680a;
            linkedHashMap.getClass();
            linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.putAll(linkedHashMap);
            gr00Var = this;
            x7w0 x7w0Var2 = (x7w0) gr00Var.e;
            str5 = str;
            u6a u6aVar4 = u6aVar2;
            u6aVar4.i = str5;
            str6 = str2;
            u6aVar4.j = str6;
            iqiVar2 = iqiVar;
            u6aVar4.k = iqiVar2;
            u6aVar4.l = linkedHashMap2;
            u6aVar4.m = linkedHashMap2;
            u6aVar4.p = 1;
            rwj rwjVar2 = tvk.f34603a;
            objD0 = qjj.d0(dvj.c, new wup0(x7w0Var2, yjeVar, (byte) 23), u6aVar4);
            wneVar2 = wneVar;
            if (objD0 == wneVar2) {
                return wneVar2;
            }
            linkedHashMap3 = linkedHashMap2;
            iqiVar3 = iqiVar2;
        } else {
            if (i4 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            linkedHashMap2 = u6aVar.m;
            linkedHashMap3 = u6aVar.l;
            iqiVar3 = u6aVar.k;
            String str8 = u6aVar.j;
            str5 = u6aVar.i;
            z1x.P(objD0);
            str3 = "FingerprintJS";
            str4 = "Unexpected error occurred. Feel free to create an issue on Github repository of the fingerprintjs-android library.";
            str6 = str8;
        }
        linkedHashMap2.putAll((Map) objD0);
        bek bekVar = meq.b;
        dc0 dc0Var = new dc0(gr00Var, str5, str6, linkedHashMap3);
        iqiVar3.getClass();
        t3e t3eVar = new t3e(iqiVar3, dc0Var, dc0Var);
        try {
            e0g0 e0g0Var2 = j0g0.b;
            moj0.f22137a.submit(new w1((Object) t3eVar, (byte) 8));
            g0g0Var = Unit.f46060a;
        } catch (Throwable th) {
            e0g0 e0g0Var3 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        Throwable thA2 = j0g0.a(g0g0Var);
        if (thA2 != null) {
            dc0Var.invoke(ken.f18160a);
            Log.e(str3, str4, thA2);
        }
        return Unit.f46060a;
    }

    public void m(Function1 function1) {
        int i;
        synchronized (this.f11760a) {
            try {
                vy40 vy40Var = (vy40) this.d;
                this.d = (vy40) this.e;
                this.e = vy40Var;
                a14 a14Var = (a14) this.c;
                do {
                    i = a14Var.get();
                } while (!a14Var.compareAndSet(i, ((((i >>> 27) & 15) + 1) & 15) << 27));
                int i2 = vy40Var.b;
                for (int i3 = 0; i3 < i2; i3++) {
                    function1.invoke(vy40Var.g(i3));
                }
                vy40Var.d();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // a.lry
    public void n(g950 g950Var, tlc tlcVar) {
        ((xzp) this.f11760a).n(g950Var, tlcVar);
    }

    public wti o() {
        nmo nmoVarH = ((eg3) this.b).h();
        x1x.x(nmoVarH);
        cad cadVar = (cad) this.c;
        mne mneVarH = ((psc) cadVar.b).h();
        x1x.x(mneVarH);
        ie5 ie5Var = (ie5) this.d;
        ie5Var.getClass();
        xex xexVar = new xex(mneVarH, ie5Var);
        mne mneVarH2 = ((psc) cadVar.b).h();
        x1x.x(mneVarH2);
        ie5 ie5Var2 = (ie5) this.e;
        ie5Var2.getClass();
        return new wti((Object) nmoVarH, (Object) new wti((Object) xexVar, (Object) new xex(mneVarH2, ie5Var2), (byte) 24), (byte) 20);
    }

    public do20 p() {
        return new do20((us00) this.f11760a);
    }

    public dd5 q(ed5 ed5Var) {
        String str;
        ed5Var.getClass();
        bf3 bf3Var = (bf3) this.b;
        int iOrdinal = ed5Var.ordinal();
        if (iOrdinal == 0) {
            str = "START_";
        } else {
            if (iOrdinal != 1) {
                t9f.b();
                return null;
            }
            str = "UPDATE_";
        }
        String strA = bf3Var.a(str, "BACKGROUND_SMALL_VIDEO_URN");
        String strA2 = bf3Var.a(str, "BACKGROUND_SMALL_PREVIEW_URN");
        String strA3 = bf3Var.a(str, "BACKGROUND_SMALL_IMAGE_URN");
        String strA4 = bf3Var.a(str, "BACKGROUND_MEDIUM_VIDEO_URN");
        String strA5 = bf3Var.a(str, "BACKGROUND_MEDIUM_PREVIEW_URN");
        String strA6 = bf3Var.a(str, "BACKGROUND_MEDIUM_IMAGE_URN");
        String strA7 = bf3Var.a(str, "BACKGROUND_LARGE_VIDEO_URN");
        String strA8 = bf3Var.a(str, "BACKGROUND_LARGE_PREVIEW_URN");
        String strA9 = bf3Var.a(str, "BACKGROUND_LARGE_IMAGE_URN");
        String strA10 = bf3Var.a(str, "BACKGROUND_LOGO_URN");
        String strA11 = bf3Var.a(str, "BACKGROUND_PARTNERS_URN");
        dd5 dd5Var = new dd5(strA, strA2, strA3, strA4, strA5, strA6, strA7, strA8, strA9, strA10, strA11);
        List listJ = q3d.j(strA, strA2, strA3, strA4, strA5, strA6, strA7, strA8, strA9, strA10, strA11);
        if (listJ == null || !listJ.isEmpty()) {
            Iterator it = listJ.iterator();
            while (it.hasNext()) {
                if (((String) it.next()).length() != 0) {
                    return dd5Var;
                }
            }
        }
        return null;
    }

    public ocl r() {
        return new ocl(h());
    }

    public gr00 s() {
        return new gr00(new nwd(), (htz) this.f11760a, (jh70) this.b, (kys0) this.c, (xuz) this.d);
    }

    public nmo u() {
        mne mneVarH = ((psc) ((cad) this.c).b).h();
        x1x.x(mneVarH);
        ie5 ie5Var = (ie5) this.d;
        ie5Var.getClass();
        return new nmo(new xex(mneVarH, ie5Var));
    }

    public drm0 v() {
        return new drm0(h());
    }

    /* JADX WARN: Code duplicated, block: B:62:0x0169  */
    /* JADX WARN: Code duplicated, block: B:64:0x016d  */
    /* JADX WARN: Code duplicated, block: B:65:0x0170  */
    /* JADX WARN: Code duplicated, block: B:67:0x0176  */
    /* JADX WARN: Code duplicated, block: B:70:0x017b  */
    /* JADX WARN: Code duplicated, block: B:71:0x017d  */
    public cev x() {
        int i;
        int size;
        long j;
        int i2;
        int iOrdinal;
        int i3;
        int i4;
        int i5;
        h7q h7qVar = ((meu) this.f11760a).f21665a;
        dev devVar = h7qVar.d;
        dev devVar2 = h7qVar.d;
        xbq xbqVar = (xbq) devVar.c.getValue();
        float f2 = xbqVar != null ? xbqVar.g : 0.0f;
        xbq xbqVar2 = (xbq) devVar2.c.getValue();
        long j2 = xbqVar2 != null ? xbqVar2.e : 0L;
        xbq xbqVar3 = (xbq) devVar.c.getValue();
        long j3 = xbqVar3 != null ? xbqVar3.f : 0L;
        List list = devVar.b;
        xbq xbqVar4 = (xbq) devVar2.c.getValue();
        long j4 = xbqVar4 != null ? xbqVar4.d : 0L;
        xbq xbqVar5 = (xbq) devVar.c.getValue();
        long j5 = xbqVar5 != null ? xbqVar5.c : 0L;
        ocq ocqVar = devVar.f5969a;
        list.getClass();
        int iA = ((neu) this.c).a();
        int iOrdinal2 = ocqVar.ordinal();
        List listSubList = null;
        if (iOrdinal2 == 0) {
            i = 300;
        } else {
            if (iOrdinal2 != 1) {
                t9f.b();
                return null;
            }
            i = 3600;
        }
        List listJ = q3d.j(Long.valueOf(j4 - ((long) i)), Long.valueOf(j4), Long.valueOf(j5));
        int size2 = list.size();
        if (size2 < 0) {
            size2 = list.size();
            ((meu) this.d).f21665a.d.d = 0;
        }
        float[] fArr = new float[size2];
        Iterator it = l1e0.o(0, size2).iterator();
        while (((kkx) it).c) {
            int iNextInt = ((bkx) it).nextInt();
            fArr[iNextInt] = ((ybq) list.get(iNextInt)).f42350a;
        }
        m1u m1uVar = (m1u) this.e;
        qdq qdqVar = (qdq) this.b;
        list.getClass();
        h7q h7qVar2 = qdqVar.f28547a;
        ocq ocqVar2 = h7qVar2.d.f5969a;
        if (!list.isEmpty()) {
            xbq xbqVar6 = (xbq) h7qVar2.d.c.getValue();
            long j6 = xbqVar6 != null ? xbqVar6.d : 0L;
            size = list.size() / 2;
            int size3 = list.size() - 1;
            int i6 = 0;
            while (true) {
                if (i6 >= size3) {
                    j = j2;
                    i2 = iA;
                    if (j6 - ((ybq) list.get(i6)).b >= ((ybq) list.get(size3)).b - j6) {
                        size = size3;
                        break;
                    }
                    size = i6;
                    break;
                }
                List list2 = list;
                if (((ybq) list.get(size)).b == j6) {
                    j = j2;
                    list = list2;
                } else {
                    list = list2;
                    long j7 = j2;
                    int i7 = iA;
                    if (((ybq) list.get(size)).b > j6) {
                        size3 = size - 1;
                    } else {
                        i6 = size + 1;
                    }
                    size = (size3 + i6) / 2;
                    iA = i7;
                    j2 = j7;
                }
            }
            iOrdinal = ocqVar2.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    i3 = 3600;
                } else {
                    t9f.b();
                }
                List list3 = listSubList;
                list3.getClass();
                h7q h7qVar3 = m1uVar.f21027a;
                h7qVar3.getClass();
                dev devVar3 = h7qVar3.d;
                devVar3.getClass();
                devVar3.b = list3;
                list.size();
                return new cev(f2, j, j3, tx3.d0(fArr), list, i2, listJ);
            }
            i3 = 300;
            i4 = size - i3;
            if (i4 < 0) {
                i5 = 0;
            } else {
                i5 = i4;
            }
            listSubList = list.subList(i5, list.size());
            List list4 = listSubList;
            list4.getClass();
            h7q h7qVar4 = m1uVar.f21027a;
            h7qVar4.getClass();
            dev devVar4 = h7qVar4.d;
            devVar4.getClass();
            devVar4.b = list4;
            list.size();
            return new cev(f2, j, j3, tx3.d0(fArr), list, i2, listJ);
        }
        j = j2;
        size = 0;
        i2 = iA;
        iOrdinal = ocqVar2.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                i3 = 3600;
            } else {
                t9f.b();
            }
            List list5 = listSubList;
            list5.getClass();
            h7q h7qVar5 = m1uVar.f21027a;
            h7qVar5.getClass();
            dev devVar5 = h7qVar5.d;
            devVar5.getClass();
            devVar5.b = list5;
            list.size();
            return new cev(f2, j, j3, tx3.d0(fArr), list, i2, listJ);
        }
        i3 = 300;
        i4 = size - i3;
        if (i4 < 0) {
            i5 = 0;
        } else {
            i5 = i4;
        }
        listSubList = list.subList(i5, list.size());
        List list6 = listSubList;
        list6.getClass();
        h7q h7qVar6 = m1uVar.f21027a;
        h7qVar6.getClass();
        dev devVar6 = h7qVar6.d;
        devVar6.getClass();
        devVar6.b = list6;
        list.size();
        return new cev(f2, j, j3, tx3.d0(fArr), list, i2, listJ);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:30:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:46:0x0114  */
    /* JADX WARN: Code duplicated, block: B:58:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:59:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:62:0x0201  */
    /* JADX WARN: Code duplicated, block: B:64:0x0206  */
    /* JADX WARN: Code duplicated, block: B:68:0x00e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00ff A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Serializable y(List list, long j, gwe gweVar, boolean z, boolean z2, zje zjeVar) {
        eaf eafVar;
        boolean z3;
        gwe gweVar2;
        long j2;
        boolean z4;
        List list2;
        List list3;
        boolean z5;
        long j3;
        gwe gweVar3;
        List list4;
        boolean z6;
        List list5;
        ArrayList arrayList;
        Iterator it;
        jwe jweVar;
        Iterator it2;
        Object next;
        xco xcoVar;
        Iterator it3;
        Object next2;
        jwe jweVar2;
        Pair pair;
        long j4;
        long j5;
        long j6;
        long j7;
        uoy uoyVar;
        gr00 gr00Var = this;
        if (zjeVar instanceof eaf) {
            eafVar = (eaf) zjeVar;
            int i = eafVar.q;
            if ((i & Integer.MIN_VALUE) != 0) {
                eafVar.q = i - Integer.MIN_VALUE;
            } else {
                eafVar = new eaf(gr00Var, zjeVar);
            }
        } else {
            eafVar = new eaf(gr00Var, zjeVar);
        }
        Object objB = eafVar.o;
        wne wneVar = wne.f39444a;
        int i2 = eafVar.q;
        Object obj = null;
        if (i2 == 0) {
            z1x.P(objB);
            zfo zfoVar = (zfo) gr00Var.b;
            eafVar.i = list;
            eafVar.j = gweVar;
            eafVar.n = j;
            eafVar.l = z;
            z3 = z2;
            eafVar.m = z3;
            eafVar.q = 1;
            objB = zfoVar.b(eafVar);
            if (objB != wneVar) {
                gweVar2 = gweVar;
                j2 = j;
                z4 = z;
                list2 = list;
            }
            return wneVar;
        }
        if (i2 == 1) {
            boolean z7 = eafVar.m;
            z4 = eafVar.l;
            j2 = eafVar.n;
            gweVar2 = eafVar.j;
            list2 = eafVar.i;
            z1x.P(objB);
            z3 = z7;
        } else {
            if (i2 != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            boolean z8 = eafVar.m;
            boolean z9 = eafVar.l;
            long j8 = eafVar.n;
            List list6 = eafVar.k;
            gwe gweVar4 = eafVar.j;
            list4 = eafVar.i;
            z1x.P(objB);
            z6 = z8;
            z5 = z9;
            j3 = j8;
            list3 = list6;
            gweVar3 = gweVar4;
        }
        list5 = (List) objB;
        arrayList = new ArrayList(r3d.q(list4, 10));
        it = list4.iterator();
        while (it.hasNext()) {
            jweVar = (jwe) it.next();
            it2 = list5.iterator();
            do {
                if (it2.hasNext()) {
                    next = obj;
                    break;
                }
                next = it2.next();
            } while (((xco) next).f40655a != jweVar.j);
            xcoVar = (xco) next;
            it3 = list3.iterator();
            do {
                if (it3.hasNext()) {
                    next2 = obj;
                    break;
                }
                next2 = it3.next();
            } while (((ueo) next2).f35538a != jweVar.c);
            ueo ueoVar = (ueo) next2;
            long j9 = jweVar.d;
            String strA = "";
            if (xcoVar != null || ueoVar == null || ueoVar.b.length() == 0) {
                list5 = list5;
                it = it;
                jweVar2 = jweVar;
                ((ulk) gr00Var.d).a();
                pair = new Pair("", "");
            } else if (jweVar.c == 707) {
                pair = new Pair(((us3) ((g45) gr00Var.f11760a).g).a(), "");
                list5 = list5;
                it = it;
                jweVar2 = jweVar;
            } else {
                if ("".length() == 0) {
                    String str = ueoVar.b;
                    yeo yeoVar = jweVar.z;
                    jweVar2 = jweVar;
                    strA = dii0.a(str, yeoVar.f42496a, yeoVar.b, Integer.valueOf(ueoVar.c), ((j1q0) gr00Var.e).f15748a.j(), kotlin.text.b.h(String.valueOf(jweVar.k)), jweVar.f, Long.valueOf(j9), ueoVar.f35538a, nt20.h, z5, z6);
                } else {
                    jweVar2 = jweVar;
                }
                pair = new Pair(strA, xcoVar.b);
            }
            String str2 = (String) pair.f46059a;
            String str3 = (String) pair.b;
            str2.getClass();
            str3.getClass();
            gweVar3.getClass();
            j4 = jweVar2.f17246a;
            j5 = jweVar2.b;
            if (j5 == 0) {
                j6 = j4;
            } else {
                j6 = j5;
            }
            long j10 = jweVar2.e;
            long j11 = jweVar2.d;
            String str4 = jweVar2.f;
            String str5 = jweVar2.l;
            String str6 = jweVar2.p;
            String str7 = jweVar2.q;
            String str8 = jweVar2.r;
            String str9 = jweVar2.s;
            String str10 = jweVar2.h;
            List list7 = list3;
            String strValueOf = String.valueOf(jweVar2.u);
            double d = jweVar2.k;
            tv6 tv6Var = new tv6("", jweVar2.g, jweVar2.x, jweVar2.y, jweVar2.t);
            j7 = jweVar2.c;
            if (j7 != 707) {
                uoyVar = jweVar2.v;
            } else {
                uoyVar = uoy.BONUS;
            }
            uoy uoyVar2 = uoyVar;
            arrayList.add(new qu6(0L, j4, j6, j10, j11, str4, str5, str6, str7, jweVar2.m, str8, str9, jweVar2.n, "", "", str3, str10, j3, strValueOf, d, tv6Var, str2, uoyVar2, j7, jweVar2.w, gweVar3, jweVar2.o, jweVar2.j, 0.0d, "", q4f.b.a(), new ic9(0, 0, 0, uyc.IDLE)));
            obj = null;
            gr00Var = this;
            list5 = list5;
            it = it;
            list3 = list7;
        }
        return arrayList;
        List list8 = (List) objB;
        edo edoVar = (edo) gr00Var.c;
        eafVar.i = list2;
        eafVar.j = gweVar2;
        eafVar.k = list8;
        eafVar.n = j2;
        eafVar.l = z4;
        eafVar.m = z3;
        eafVar.q = 2;
        Object objB2 = edoVar.b(eafVar);
        if (objB2 != wneVar) {
            list3 = list8;
            objB = objB2;
            z5 = z4;
            j3 = j2;
            gweVar3 = gweVar2;
            list4 = list2;
            z6 = z3;
            list5 = (List) objB;
            arrayList = new ArrayList(r3d.q(list4, 10));
            it = list4.iterator();
            while (it.hasNext()) {
                jweVar = (jwe) it.next();
                it2 = list5.iterator();
                do {
                    if (it2.hasNext()) {
                        next = obj;
                        break;
                    }
                    next = it2.next();
                } while (((xco) next).f40655a != jweVar.j);
                xcoVar = (xco) next;
                it3 = list3.iterator();
                do {
                    if (it3.hasNext()) {
                        next2 = obj;
                        break;
                    }
                    next2 = it3.next();
                } while (((ueo) next2).f35538a != jweVar.c);
                ueo ueoVar2 = (ueo) next2;
                long j12 = jweVar.d;
                String strA2 = "";
                if (xcoVar != null) {
                    list5 = list5;
                    it = it;
                    jweVar2 = jweVar;
                    ((ulk) gr00Var.d).a();
                    pair = new Pair("", "");
                } else {
                    list5 = list5;
                    it = it;
                    jweVar2 = jweVar;
                    ((ulk) gr00Var.d).a();
                    pair = new Pair("", "");
                }
                String str11 = (String) pair.f46059a;
                String str12 = (String) pair.b;
                str11.getClass();
                str12.getClass();
                gweVar3.getClass();
                j4 = jweVar2.f17246a;
                j5 = jweVar2.b;
                if (j5 == 0) {
                    j6 = j4;
                } else {
                    j6 = j5;
                }
                long j13 = jweVar2.e;
                long j14 = jweVar2.d;
                String str13 = jweVar2.f;
                String str14 = jweVar2.l;
                String str15 = jweVar2.p;
                String str16 = jweVar2.q;
                String str17 = jweVar2.r;
                String str18 = jweVar2.s;
                String str19 = jweVar2.h;
                List list9 = list3;
                String strValueOf2 = String.valueOf(jweVar2.u);
                double d2 = jweVar2.k;
                tv6 tv6Var2 = new tv6("", jweVar2.g, jweVar2.x, jweVar2.y, jweVar2.t);
                j7 = jweVar2.c;
                if (j7 != 707) {
                    uoyVar = jweVar2.v;
                } else {
                    uoyVar = uoy.BONUS;
                }
                uoy uoyVar3 = uoyVar;
                arrayList.add(new qu6(0L, j4, j6, j13, j14, str13, str14, str15, str16, jweVar2.m, str17, str18, jweVar2.n, "", "", str12, str19, j3, strValueOf2, d2, tv6Var2, str11, uoyVar3, j7, jweVar2.w, gweVar3, jweVar2.o, jweVar2.j, 0.0d, "", q4f.b.a(), new ic9(0, 0, 0, uyc.IDLE)));
                obj = null;
                gr00Var = this;
                list5 = list5;
                it = it;
                list3 = list9;
            }
            return arrayList;
        }
        return wneVar;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0070  */
    /* JADX WARN: Code duplicated, block: B:25:0x00a8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:29:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00a6 -> B:12:0x0038). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public java.lang.Object z(a.zje r20) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.gr00.z(a.zje):java.lang.Object");
    }

    public gr00(reu reuVar, ytw ytwVar, m73 m73Var, knf0 knf0Var, mne mneVar) {
        knf0Var.getClass();
        this.f11760a = reuVar;
        this.b = ytwVar;
        this.c = m73Var;
        this.d = knf0Var;
        this.e = mneVar;
    }

    public gr00(yk50 yk50Var, bf3 bf3Var, knf0 knf0Var, mne mneVar, vby vbyVar) {
        knf0Var.getClass();
        vbyVar.getClass();
        this.f11760a = yk50Var;
        this.b = bf3Var;
        this.c = knf0Var;
        this.d = mneVar;
        this.e = vbyVar;
    }

    public gr00(mne mneVar, peg0 peg0Var, m0w m0wVar, knf0 knf0Var, btt0 btt0Var) {
        m0wVar.getClass();
        knf0Var.getClass();
        btt0Var.getClass();
        this.f11760a = mneVar;
        this.b = peg0Var;
        this.c = m0wVar;
        this.d = knf0Var;
        this.e = btt0Var;
    }

    public gr00(g45 g45Var, zfo zfoVar, edo edoVar, ulk ulkVar, j1q0 j1q0Var) {
        zfoVar.getClass();
        edoVar.getClass();
        ulkVar.getClass();
        j1q0Var.getClass();
        this.f11760a = g45Var;
        this.b = zfoVar;
        this.c = edoVar;
        this.d = ulkVar;
        this.e = j1q0Var;
    }

    public gr00() {
        this.f11760a = new Object();
        this.c = new a14(0);
        this.d = new vy40();
        this.e = new vy40();
    }

    public /* synthetic */ gr00(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.f11760a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
        this.e = obj5;
    }
}

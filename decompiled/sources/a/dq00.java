package a;

import android.gov.nist.core.Separators;
import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;
import org.xplatform.registration_default.impl.presentation.udf.state.models.fields.CountryStateModel;
import org.xplatform.registration_default.impl.presentation.udf.state.models.fields.PhoneStateModel;

/* JADX INFO: loaded from: classes5.dex */
public final class dq00 implements zul0, Callback, zf60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f6491a;
    public Object b;
    public Object c;

    public dq00(gii0 gii0Var, byte b) {
        this.f6491a = b;
        gii0Var.getClass();
        switch (b) {
            case 15:
                this.b = gii0Var;
                this.c = new pl70(this, (byte) 25);
                break;
            case 16:
                this.b = gii0Var;
                this.c = new l3a0(this, (byte) 16);
                break;
            case 21:
                this.b = gii0Var;
                this.c = new p7d0(this, (byte) 13);
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                this.b = gii0Var;
                this.c = new a7g0(this, (byte) 3);
                break;
            default:
                this.b = gii0Var;
                this.c = new rx00(this, (byte) 17);
                break;
        }
    }

    public static Map d(aye0 aye0Var, List list) {
        if (list.isEmpty()) {
            return aye0Var.f;
        }
        Map map = aye0Var.f;
        LinkedHashMap linkedHashMap = new LinkedHashMap(wp20.a(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Map map2 = (Map) entry.getValue();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry2 : map2.entrySet()) {
                if (!list.contains((u0f0) entry2.getKey())) {
                    linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                }
            }
            linkedHashMap.put(key, linkedHashMap2);
        }
        return linkedHashMap;
    }

    public void a(Object obj, String str) {
        int length = str.length();
        String strValueOf = String.valueOf(obj);
        ((ArrayList) this.b).add(rw2.o(new StringBuilder(length + 1 + strValueOf.length()), str, "=", strValueOf));
    }

    @Override // okhttp3.Callback
    public void b(Call call, IOException iOException) {
        try {
            ((pp9) this.b).m((jf60) this.c, iOException);
        } catch (Throwable th) {
            ay3.c0(th);
            th.printStackTrace();
        }
    }

    public Pair c(aye0 aye0Var, CountryStateModel countryStateModel, String str, String str2, Integer num, List list) {
        PhoneStateModel phoneStateModel;
        vzg0 vzg0Var = (vzg0) this.b;
        q1f0 q1f0Var = aye0Var.h;
        if (q1f0Var.r != null) {
            str2.getClass();
            phoneStateModel = new PhoneStateModel("", "+" + str, str2, num);
        } else {
            phoneStateModel = new PhoneStateModel("", kng0.k("+", str), str2, num);
        }
        q1f0 q1f0VarA = q1f0.a(q1f0Var, null, false, null, null, false, false, countryStateModel, null, null, null, null, null, null, null, null, null, null, phoneStateModel, null, null, null, null, null, false, false, null, false, false, false, null, null, null, false, false, null, null, false, false, null, -2228297, 127);
        Map mapD = d(aye0Var, list);
        vzg0Var.e("COUNTRY", q1f0VarA.g);
        vzg0Var.e("PHONE", q1f0VarA.r);
        vzg0Var.e("REGION", null);
        vzg0Var.e("CITY", null);
        return new Pair(q1f0VarA, mapD);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0225  */
    /* JADX WARN: Code duplicated, block: B:102:0x0228  */
    /* JADX WARN: Code duplicated, block: B:103:0x022b  */
    /* JADX WARN: Code duplicated, block: B:107:0x023a  */
    /* JADX WARN: Code duplicated, block: B:110:0x0242  */
    /* JADX WARN: Code duplicated, block: B:113:0x00bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:0x00a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:0x0172 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:138:0x01ef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:140:0x01c1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:142:0x0236 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x0093  */
    /* JADX WARN: Code duplicated, block: B:31:0x00af  */
    /* JADX WARN: Code duplicated, block: B:37:0x00d5 A[LOOP:1: B:35:0x00cf->B:37:0x00d5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:40:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:44:0x0111  */
    /* JADX WARN: Code duplicated, block: B:51:0x0131  */
    /* JADX WARN: Code duplicated, block: B:54:0x0145  */
    /* JADX WARN: Code duplicated, block: B:56:0x014d  */
    /* JADX WARN: Code duplicated, block: B:58:0x015c  */
    /* JADX WARN: Code duplicated, block: B:59:0x015f  */
    /* JADX WARN: Code duplicated, block: B:61:0x0163  */
    /* JADX WARN: Code duplicated, block: B:62:0x0166  */
    /* JADX WARN: Code duplicated, block: B:66:0x0176  */
    /* JADX WARN: Code duplicated, block: B:69:0x017e  */
    /* JADX WARN: Code duplicated, block: B:73:0x019f  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:81:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:83:0x01db  */
    /* JADX WARN: Code duplicated, block: B:85:0x01de  */
    /* JADX WARN: Code duplicated, block: B:86:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:87:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:92:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:95:0x020d  */
    /* JADX WARN: Code duplicated, block: B:97:0x0215  */
    /* JADX WARN: Code duplicated, block: B:99:0x0223  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v12, types: [a.lc00, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v5, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.util.Collection] */
    public Serializable e(zje zjeVar) {
        cq00 cq00Var;
        bsu bsuVar;
        bm5 bm5Var;
        List list;
        Serializable serializableB;
        List list2;
        long j;
        ?? B;
        ArrayList arrayList;
        ArrayList arrayList2;
        Iterator it;
        ArrayList arrayList3;
        ?? arrayList4;
        ArrayList arrayList5;
        ?? arrayList6;
        int i;
        int i2;
        boolean z;
        boolean z2;
        sff0 sff0Var;
        int iOrdinal;
        boolean z3;
        ql5 ql5Var;
        int i3;
        int i4;
        boolean z4;
        boolean z5;
        ql5 ql5Var2;
        wsf0 wsf0Var = (wsf0) this.b;
        if (zjeVar instanceof cq00) {
            cq00Var = (cq00) zjeVar;
            int i5 = cq00Var.m;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                cq00Var.m = i5 - Integer.MIN_VALUE;
            } else {
                cq00Var = new cq00(this, zjeVar);
            }
        } else {
            cq00Var = new cq00(this, zjeVar);
        }
        Object objI = cq00Var.k;
        wne wneVar = wne.f39444a;
        int i6 = cq00Var.m;
        if (i6 == 0) {
            z1x.P(objI);
            bsuVar = new bsu();
            bm5Var = bm5.f;
            tl5 tl5Var = tl5.b;
            urt urtVarG = wsf0Var.g();
            cq00Var.i = bsuVar;
            cq00Var.j = bm5Var;
            cq00Var.m = 1;
            objI = urtVarG.f36180a.i(tl5Var, cq00Var);
            if (objI != wneVar) {
            }
            return wneVar;
        }
        if (i6 == 1) {
            bm5Var = cq00Var.j;
            bsuVar = (bsu) cq00Var.i;
            z1x.P(objI);
        } else {
            if (i6 == 2) {
                z1x.P(objI);
                list = (List) objI;
                ahu ahuVarY = ((g45) wsf0Var.b).y();
                cq00Var.i = list;
                cq00Var.m = 3;
                serializableB = ahuVarY.b(bm5.f2822a, cq00Var);
                if (serializableB != wneVar) {
                    list2 = list;
                    objI = serializableB;
                }
                return wneVar;
            }
            if (i6 != 3) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list2 = (List) cq00Var.i;
            z1x.P(objI);
        }
        j = ((ql5) objI).f28916a;
        B = kotlin.collections.a.b();
        arrayList = new ArrayList();
        for (Object obj : list2) {
            if (((ql5) obj).f28916a == j) {
                arrayList.add(obj);
            }
        }
        arrayList2 = new ArrayList(r3d.q(arrayList, 10));
        it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new xe(pg.d, (ql5) it.next(), true, true, true));
        }
        if (!arrayList2.isEmpty()) {
            B.add(new xe(pg.f26929a, null, true, true, true));
        }
        B.addAll(arrayList2);
        arrayList3 = new ArrayList();
        for (Object obj2 : list2) {
            ql5Var2 = (ql5) obj2;
            if (ql5Var2.f28916a == j && !ql5Var2.i.a()) {
                arrayList3.add(obj2);
            }
        }
        if (arrayList3.isEmpty()) {
            arrayList4 = iun.f15405a;
        } else {
            arrayList4 = new ArrayList(r3d.q(arrayList3, 10));
            i3 = 0;
            for (Object obj3 : arrayList3) {
                i4 = i3 + 1;
                if (i3 >= 0) {
                    q3d.p();
                    throw null;
                }
                ql5 ql5Var3 = (ql5) obj3;
                pg pgVar = pg.d;
                if (arrayList3.size() - 1 == i3) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (i3 == 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                arrayList4.add(new xe(pgVar, ql5Var3, false, z4, z5));
                i3 = i4;
            }
        }
        if (!arrayList4.isEmpty()) {
            B.add(new xe(pg.b, null, false, false, false));
        }
        B.addAll(arrayList4);
        ArrayList arrayList7 = new ArrayList();
        for (Object obj4 : list2) {
            ql5Var = (ql5) obj4;
            if (ql5Var.f28916a == j && ql5Var.i.a()) {
                arrayList7.add(obj4);
            }
        }
        arrayList5 = new ArrayList();
        for (Object obj5 : arrayList7) {
            sff0Var = (sff0) this.c;
            iOrdinal = ((ql5) obj5).i.ordinal();
            if (iOrdinal != 4) {
                z3 = sff0Var.b.f13233a.b;
            } else if (iOrdinal != 6) {
                z3 = true;
            } else {
                z3 = sff0Var.d.f27973a.f6914a;
            }
            if (z3) {
                arrayList5.add(obj5);
            }
        }
        if (arrayList5.isEmpty()) {
            arrayList6 = iun.f15405a;
        } else {
            arrayList6 = new ArrayList(r3d.q(arrayList5, 10));
            i = 0;
            for (Object obj6 : arrayList5) {
                i2 = i + 1;
                if (i >= 0) {
                    q3d.p();
                    throw null;
                }
                ql5 ql5Var4 = (ql5) obj6;
                pg pgVar2 = pg.d;
                if (arrayList5.size() - 1 == i) {
                    z = true;
                } else {
                    z = false;
                }
                if (i == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                arrayList6.add(new xe(pgVar2, ql5Var4, false, z, z2));
                i = i2;
            }
        }
        if (!arrayList6.isEmpty()) {
            B.add(new xe(pg.c, null, false, false, false));
        }
        B.addAll(arrayList6);
        return kotlin.collections.a.a(B);
        cq00Var.i = null;
        cq00Var.j = null;
        cq00Var.m = 2;
        objI = bsuVar.a(bm5Var, (List) objI);
        if (objI != wneVar) {
            list = (List) objI;
            ahu ahuVarY2 = ((g45) wsf0Var.b).y();
            cq00Var.i = list;
            cq00Var.m = 3;
            serializableB = ahuVarY2.b(bm5.f2822a, cq00Var);
            if (serializableB != wneVar) {
                list2 = list;
                objI = serializableB;
                j = ((ql5) objI).f28916a;
                B = kotlin.collections.a.b();
                arrayList = new ArrayList();
                while (r6.hasNext()) {
                    if (((ql5) obj).f28916a == j) {
                        arrayList.add(obj);
                    }
                }
                arrayList2 = new ArrayList(r3d.q(arrayList, 10));
                it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new xe(pg.d, (ql5) it.next(), true, true, true));
                }
                if (!arrayList2.isEmpty()) {
                    B.add(new xe(pg.f26929a, null, true, true, true));
                }
                B.addAll(arrayList2);
                arrayList3 = new ArrayList();
                while (r6.hasNext()) {
                    ql5Var2 = (ql5) obj2;
                    if (ql5Var2.f28916a == j) {
                    }
                }
                if (arrayList3.isEmpty()) {
                    arrayList4 = new ArrayList(r3d.q(arrayList3, 10));
                    i3 = 0;
                    while (r11.hasNext()) {
                        i4 = i3 + 1;
                        if (i3 >= 0) {
                            q3d.p();
                            throw null;
                        }
                        ql5 ql5Var5 = (ql5) obj3;
                        pg pgVar3 = pg.d;
                        if (arrayList3.size() - 1 == i3) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (i3 == 0) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        arrayList4.add(new xe(pgVar3, ql5Var5, false, z4, z5));
                        i3 = i4;
                    }
                } else {
                    arrayList4 = iun.f15405a;
                }
                if (!arrayList4.isEmpty()) {
                    B.add(new xe(pg.b, null, false, false, false));
                }
                B.addAll(arrayList4);
                ArrayList arrayList8 = new ArrayList();
                while (r2.hasNext()) {
                    ql5Var = (ql5) obj4;
                    if (ql5Var.f28916a == j) {
                    }
                }
                arrayList5 = new ArrayList();
                while (r3.hasNext()) {
                    sff0Var = (sff0) this.c;
                    iOrdinal = ((ql5) obj5).i.ordinal();
                    if (iOrdinal != 4) {
                        z3 = sff0Var.b.f13233a.b;
                    } else if (iOrdinal != 6) {
                        z3 = true;
                    } else {
                        z3 = sff0Var.d.f27973a.f6914a;
                    }
                    if (z3) {
                        arrayList5.add(obj5);
                    }
                }
                if (arrayList5.isEmpty()) {
                    arrayList6 = new ArrayList(r3d.q(arrayList5, 10));
                    i = 0;
                    while (r3.hasNext()) {
                        i2 = i + 1;
                        if (i >= 0) {
                            q3d.p();
                            throw null;
                        }
                        ql5 ql5Var6 = (ql5) obj6;
                        pg pgVar4 = pg.d;
                        if (arrayList5.size() - 1 == i) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (i == 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        arrayList6.add(new xe(pgVar4, ql5Var6, false, z, z2));
                        i = i2;
                    }
                } else {
                    arrayList6 = iun.f15405a;
                }
                if (!arrayList6.isEmpty()) {
                    B.add(new xe(pg.c, null, false, false, false));
                }
                B.addAll(arrayList6);
                return kotlin.collections.a.a(B);
            }
        }
        return wneVar;
    }

    @Override // a.zul0
    public StackTraceElement[] f(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        zul0[] zul0VarArr = (zul0[]) this.b;
        StackTraceElement[] stackTraceElementArrF = stackTraceElementArr;
        for (int i = 0; i < 1; i++) {
            zul0 zul0Var = zul0VarArr[i];
            if (stackTraceElementArrF.length <= 1024) {
                break;
            }
            stackTraceElementArrF = zul0Var.f(stackTraceElementArr);
        }
        return stackTraceElementArrF.length > 1024 ? ((wsz) this.c).f(stackTraceElementArrF) : stackTraceElementArrF;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:66:0x0168  */
    /* JADX WARN: Code duplicated, block: B:69:0x0198  */
    /* JADX WARN: Code duplicated, block: B:84:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x0148 -> B:64:0x0161). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x0198 -> B:70:0x019b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public java.lang.Object g(a.zje r24) {
        /*
            Method dump skipped, instruction units count: 466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.dq00.g(a.zje):java.lang.Object");
    }

    @Override // okhttp3.Callback
    public void h(Call call, Response response) {
        pp9 pp9Var = (pp9) this.b;
        jf60 jf60Var = (jf60) this.c;
        try {
            try {
                pp9Var.g(jf60Var, jf60Var.c(response));
            } catch (Throwable th) {
                ay3.c0(th);
                th.printStackTrace();
            }
        } catch (Throwable th2) {
            ay3.c0(th2);
            try {
                pp9Var.m(jf60Var, th2);
            } catch (Throwable th3) {
                ay3.c0(th3);
                th3.printStackTrace();
            }
        }
    }

    public void i(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (!((HashSet) this.b).remove(mediaCodec) || (loudnessCodecController = (LoudnessCodecController) this.c) == null) {
            return;
        }
        loudnessCodecController.removeMediaCodec(mediaCodec);
    }

    public void j(int i) {
        LoudnessCodecController loudnessCodecController = (LoudnessCodecController) this.c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.c = null;
        }
        LoudnessCodecController loudnessCodecControllerCreate = LoudnessCodecController.create(i, ank.f1158a, new ee10());
        this.c = loudnessCodecControllerCreate;
        Iterator it = ((HashSet) this.b).iterator();
        while (it.hasNext()) {
            if (!loudnessCodecControllerCreate.addMediaCodec((MediaCodec) it.next())) {
                it.remove();
            }
        }
    }

    public void k(List list) {
        list.getClass();
        yp90 yp90Var = (yp90) this.b;
        yp90Var.getClass();
        yp90Var.f43021a.o(null, list);
    }

    @Override // a.zf60
    public xiv0 l(View view, xiv0 xiv0Var) {
        view.getClass();
        uiv0 uiv0Var = xiv0Var.f40966a;
        int i = uiv0Var.i(8).d;
        int i2 = uiv0Var.i(519).d;
        ((ConstraintLayout) this.b).setTranslationY(-(i > i2 ? i - i2 : 0));
        bn70 bn70Var = (bn70) this.c;
        boolean z = i > i2;
        iiy[] iiyVarArr = bn70.S1;
        if (Build.VERSION.SDK_INT >= 33) {
            Window window = bn70Var.n0().getWindow();
            ma3 ma3Var = bn70Var.R1;
            if (!z) {
                if (ma3Var != null) {
                    OnBackInvokedDispatcher onBackInvokedDispatcher = window.getOnBackInvokedDispatcher();
                    onBackInvokedDispatcher.getClass();
                    onBackInvokedDispatcher.unregisterOnBackInvokedCallback(ma3Var);
                }
                bn70Var.R1 = null;
            } else if (ma3Var == null) {
                ma3 ma3Var2 = new ma3(window, (byte) 5);
                bn70Var.R1 = ma3Var2;
                window.getOnBackInvokedDispatcher().registerOnBackInvokedCallback(1000000, ma3Var2);
            }
        }
        return xiv0Var;
    }

    public void m(u0f0 u0f0Var, String str) {
        str.getClass();
        ((eye0) this.c).invoke(new zlb0(this, u0f0Var, str, (byte) 11));
    }

    public void n(mu40 mu40Var) {
        hz40 hz40Var = (hz40) this.b;
        Object objG = ((hz40) this.c).g(mu40Var);
        if (objG != null) {
            byte b = 19;
            if (!(objG instanceof vy40)) {
                fx40.c(hz40Var, (ju40) objG, new b530(mu40Var, b));
                return;
            }
            vy40 vy40Var = (vy40) objG;
            Object[] objArr = vy40Var.f38232a;
            int i = vy40Var.b;
            for (int i2 = 0; i2 < i; i2++) {
                Object obj = objArr[i2];
                obj.getClass();
                fx40.c(hz40Var, (ju40) obj, new b530(mu40Var, b));
            }
        }
    }

    public String toString() {
        int i = 0;
        switch (this.f6491a) {
            case 9:
                StringBuilder sb = new StringBuilder(100);
                sb.append(this.c.getClass().getSimpleName());
                sb.append('{');
                ArrayList arrayList = (ArrayList) this.b;
                int size = arrayList.size();
                while (i < size) {
                    sb.append((String) arrayList.get(i));
                    if (i < size - 1) {
                        sb.append(", ");
                    }
                    i++;
                }
                sb.append('}');
                return sb.toString();
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                String strO = "[ ";
                if (((ukk0) this.b) != null) {
                    while (i < 9) {
                        strO = kng0.o(new StringBuilder(strO), ((ukk0) this.b).h[i], Separators.SP);
                        i++;
                    }
                }
                StringBuilder sbT = brm0.t(strO, "] ");
                sbT.append((ukk0) this.b);
                return sbT.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ dq00(Object obj) {
        this.f6491a = (byte) 9;
        this.c = obj;
        this.b = new ArrayList();
    }

    public dq00(List list, List list2) {
        this.f6491a = (byte) 17;
        list.getClass();
        list2.getClass();
        this.b = list;
        this.c = list2;
    }

    public dq00(s470 s470Var, rkc0 rkc0Var) {
        this.f6491a = (byte) 13;
        rkc0Var.getClass();
        this.b = rkc0Var;
        this.c = s470Var;
    }

    public dq00(yo4 yo4Var, zr1 zr1Var, String str) {
        this.f6491a = (byte) 5;
        this.b = yo4Var;
        this.c = zr1Var;
    }

    public dq00(s1p s1pVar) {
        this.f6491a = (byte) 18;
        s1pVar.getClass();
        this.b = s1pVar;
        this.c = iun.f15405a;
    }

    public dq00(yp90 yp90Var, imb imbVar) {
        this.f6491a = (byte) 14;
        yp90Var.getClass();
        this.b = yp90Var;
        this.c = imbVar;
    }

    public dq00(nvu nvuVar, gst0 gst0Var) {
        this.f6491a = (byte) 29;
        gst0Var.getClass();
        this.b = nvuVar;
        this.c = gst0Var;
    }

    public dq00(nw20 nw20Var, us3 us3Var) {
        this.f6491a = (byte) 20;
        us3Var.getClass();
        this.b = nw20Var;
        this.c = us3Var;
    }

    public /* synthetic */ dq00(Object obj, Object obj2, byte b) {
        this.f6491a = b;
        this.b = obj;
        this.c = obj2;
    }

    public dq00(q7d0 q7d0Var, knf0 knf0Var) {
        this.f6491a = (byte) 7;
        q7d0Var.getClass();
        knf0Var.getClass();
        this.b = q7d0Var;
        this.c = knf0Var;
    }

    public dq00(us00 us00Var, ony onyVar) {
        this.f6491a = (byte) 1;
        onyVar.getClass();
        this.b = us00Var;
        this.c = onyVar;
    }

    public dq00(wsf0 wsf0Var, pru pruVar) {
        this.f6491a = (byte) 0;
        this.b = wsf0Var;
        this.c = pruVar.a();
    }

    public dq00(std stdVar, wdk0 wdk0Var, ii iiVar) {
        this.f6491a = (byte) 27;
        wdk0Var.getClass();
        iiVar.getClass();
        this.b = wdk0Var;
        this.c = iiVar;
    }

    public dq00(zul0[] zul0VarArr) {
        this.f6491a = (byte) 6;
        this.b = zul0VarArr;
        this.c = new wsz();
    }

    public dq00(owb0 owb0Var) {
        this.f6491a = (byte) 19;
        this.c = owb0Var;
    }

    public dq00(byte b) {
        this.f6491a = b;
        switch (b) {
            case 8:
                this.b = new hz40();
                this.c = new hz40();
                break;
            case 24:
                this.b = null;
                this.c = null;
                break;
            default:
                this.b = new HashSet();
                break;
        }
    }

    public dq00(jf60 jf60Var, pp9 pp9Var) {
        this.f6491a = (byte) 10;
        this.c = jf60Var;
        this.b = pp9Var;
    }
}

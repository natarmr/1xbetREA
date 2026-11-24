package a;

import android.content.Context;
import android.content.SharedPreferences;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.SDPFieldNames;
import android.text.format.DateFormat;
import android.util.Log;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;
import org.xbet.client1.R;
import org.xplatform.registration.simple.impl.presentation.state.models.fields.CountryStateModel;
import org.xplatform.registration.simple.impl.presentation.state.models.fields.PhoneStateModel;

/* JADX INFO: loaded from: classes5.dex */
public final class g090 implements gld0, lpj0, SuccessContinuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f10448a;
    public Object b;

    public g090(gii0 gii0Var, byte b) {
        byte b2 = 3;
        byte b3 = 21;
        switch (b) {
            case 4:
                gii0Var.getClass();
                this.f10448a = gii0Var;
                this.b = new l3a0(this, b3);
                break;
            case 8:
                gii0Var.getClass();
                this.f10448a = gii0Var;
                this.b = new p7d0(this, (byte) 17);
                break;
            case 20:
                gii0Var.getClass();
                this.f10448a = gii0Var;
                this.b = new jfm0(this, b2);
                break;
            case 23:
                gii0Var.getClass();
                this.f10448a = gii0Var;
                this.b = new nxo0(this, (byte) 16);
                break;
            case 24:
                this.f10448a = new enj0(gii0Var, (byte) 20);
                this.b = new enj0(gii0Var, b3);
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                gii0Var.getClass();
                this.f10448a = gii0Var;
                this.b = new qir0(this, (byte) 10);
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                this.f10448a = gii0Var;
                this.b = new qir0(this, b3);
                break;
            default:
                gii0Var.getClass();
                this.f10448a = gii0Var;
                this.b = new l3a0(this, b2);
                break;
        }
    }

    public static Map f(u4f0 u4f0Var, List list) {
        if (list.isEmpty()) {
            return u4f0Var.e;
        }
        Map map = u4f0Var.e;
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

    @Override // a.gld0
    public void a(fld0 fld0Var, int i) throws IOException {
        int[] iArr = (int[]) this.b;
        try {
            fld0Var.read((byte[]) this.f10448a, iArr[0], i);
            iArr[0] = iArr[0] + i;
        } finally {
            fld0Var.close();
        }
    }

    @Override // a.lpj0
    public gmq b(w6n0 w6n0Var) {
        return aoq.b((qoj0) this.b, ((o6m0) this.f10448a).b(w6n0Var));
    }

    public Pair c(u4f0 u4f0Var, CountryStateModel countryStateModel, String str, String str2, List list) {
        PhoneStateModel phoneStateModel;
        vzg0 vzg0Var = (vzg0) this.f10448a;
        r1f0 r1f0Var = u4f0Var.g;
        if (r1f0Var.r != null) {
            str2.getClass();
            phoneStateModel = new PhoneStateModel("", "+" + str, str2);
        } else {
            phoneStateModel = new PhoneStateModel("", kng0.k("+", str), str2);
        }
        r1f0 r1f0VarA = r1f0.a(r1f0Var, null, false, null, null, false, false, countryStateModel, null, null, null, null, null, null, null, null, null, null, phoneStateModel, null, null, null, null, null, false, false, null, false, false, false, null, null, null, false, null, null, null, false, false, null, -2228297, 127);
        Map mapF = f(u4f0Var, list);
        vzg0Var.e("COUNTRY", r1f0VarA.g);
        vzg0Var.e("PHONE", r1f0VarA.r);
        vzg0Var.e("REGION", null);
        vzg0Var.e("CITY", null);
        return new Pair(r1f0VarA, mapF);
    }

    public x680 d(kzv kzvVar, boolean z) {
        i0w i0wVar = kzvVar.g;
        y3d y3dVarJ = plc.J(i0wVar);
        if (kzvVar.n != lb90.b || !Intrinsics.d(kzvVar.O, hxu.h) || !z || y3dVarJ == null) {
            return null;
        }
        int i = plc.H(i0wVar) ? R.string.bet_possible_payout : R.string.payout_status;
        double d = plc.H(i0wVar) ? kzvVar.p : kzvVar.o;
        String strA = ((ctf0) this.f10448a).b.a(i, Arrays.copyOf(new Object[0], 0));
        pn40 pn40Var = pn40.f27267a;
        return new x680("POSSIBLE_PAYOUT_ID", strA, new wty(pn40.c(d, p3u0.c), (String) this.b, y3dVarJ.f41946a));
    }

    public String e(int i, String str, String str2) {
        str.getClass();
        str2.getClass();
        String str3 = (String) ((r6k0) this.f10448a).f.get();
        if (str3 != null) {
            str = str3;
        }
        long andIncrement = ((AtomicLong) this.b).getAndIncrement();
        String strM = n7x.M(str2);
        if (strM.length() == 0) {
            strM = "unknown";
        }
        StringBuilder sb = new StringBuilder("v=0\r\n");
        StringBuilder sbO = f140.o(andIncrement, SDPFieldNames.ORIGIN_FIELD, strM, Separators.SP);
        kng0.A(sbO, Separators.SP, andIncrement, " IN IP4 ");
        sbO.append(str);
        sbO.append(Separators.NEWLINE);
        sb.append(sbO.toString());
        sb.append("s=Call\r\n");
        sb.append("c=IN IP4 " + str + Separators.NEWLINE);
        sb.append("t=0 0\r\n");
        sb.append("m=audio " + i + " RTP/AVP 3 0\r\n");
        sb.append("a=rtpmap:3 GSM/8000\r\na=rtpmap:0 PCMU/8000\r\na=sendrecv\r\n");
        return sb.toString();
    }

    public File g() {
        if (((File) this.f10448a) == null) {
            synchronized (this) {
                try {
                    if (((File) this.f10448a) == null) {
                        String str = "PersistedInstallation." + ((nfq) this.b).f() + ".json";
                        nfq nfqVar = (nfq) this.b;
                        nfqVar.a();
                        File file = new File(nfqVar.f23449a.getNoBackupFilesDir(), str);
                        this.f10448a = file;
                        if (file.exists()) {
                            return (File) this.f10448a;
                        }
                        nfq nfqVar2 = (nfq) this.b;
                        nfqVar2.a();
                        File file2 = new File(nfqVar2.f23449a.getFilesDir(), str);
                        if (file2.exists() && !file2.renameTo((File) this.f10448a)) {
                            Log.e("PersistedInstallation", "Unable to move the file from back up to non back up directory", new IOException("Unable to move the file from back up to non back up directory"));
                            return file2;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return (File) this.f10448a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object h(String str, zje zjeVar) {
        yfq0 yfq0Var;
        if (zjeVar instanceof yfq0) {
            yfq0Var = (yfq0) zjeVar;
            int i = yfq0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                yfq0Var.k = i - Integer.MIN_VALUE;
            } else {
                yfq0Var = new yfq0(this, zjeVar);
            }
        } else {
            yfq0Var = new yfq0(this, zjeVar);
        }
        Object objB = yfq0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = yfq0Var.k;
        if (i2 == 0) {
            z1x.P(objB);
            y8r y8rVar = (y8r) ((enj0) this.f10448a).invoke();
            yfq0Var.k = 1;
            objB = y8rVar.b(str, yfq0Var);
            if (objB == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objB);
        }
        return ((nz5) objB).a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object i(String str, zje zjeVar) {
        zfq0 zfq0Var;
        if (zjeVar instanceof zfq0) {
            zfq0Var = (zfq0) zjeVar;
            int i = zfq0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                zfq0Var.k = i - Integer.MIN_VALUE;
            } else {
                zfq0Var = new zfq0(this, zjeVar);
            }
        } else {
            zfq0Var = new zfq0(this, zjeVar);
        }
        Object objD = zfq0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = zfq0Var.k;
        if (i2 == 0) {
            z1x.P(objD);
            y8r y8rVar = (y8r) ((enj0) this.f10448a).invoke();
            zfq0Var.k = 1;
            objD = y8rVar.d(str, zfq0Var);
            if (objD == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objD);
        }
        return ((nz5) objD).a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object j(String str, zje zjeVar) {
        agq0 agq0Var;
        if (zjeVar instanceof agq0) {
            agq0Var = (agq0) zjeVar;
            int i = agq0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                agq0Var.k = i - Integer.MIN_VALUE;
            } else {
                agq0Var = new agq0(this, zjeVar);
            }
        } else {
            agq0Var = new agq0(this, zjeVar);
        }
        Object objB = agq0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = agq0Var.k;
        if (i2 == 0) {
            z1x.P(objB);
            xet xetVar = (xet) ((enj0) this.b).invoke();
            agq0Var.k = 1;
            objB = xetVar.b(str, "", agq0Var);
            if (objB == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objB);
        }
        return ((q16) objB).a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object k(String str, zje zjeVar) {
        bgq0 bgq0Var;
        if (zjeVar instanceof bgq0) {
            bgq0Var = (bgq0) zjeVar;
            int i = bgq0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                bgq0Var.k = i - Integer.MIN_VALUE;
            } else {
                bgq0Var = new bgq0(this, zjeVar);
            }
        } else {
            bgq0Var = new bgq0(this, zjeVar);
        }
        Object objC = bgq0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = bgq0Var.k;
        if (i2 == 0) {
            z1x.P(objC);
            xet xetVar = (xet) ((enj0) this.b).invoke();
            bgq0Var.k = 1;
            objC = xetVar.c(str, "", bgq0Var);
            if (objC == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objC);
        }
        return ((q16) objC).a();
    }

    public List l() {
        Object g0g0Var;
        try {
            e0g0 e0g0Var = j0g0.b;
            q7d0 q7d0Var = (q7d0) this.f10448a;
            q7d0Var.getClass();
            String string = q7d0Var.a().getString("start_failed_saved_logs", "");
            if (string == null || StringsKt.W(string)) {
                g0g0Var = iun.f15405a;
            } else {
                vby vbyVar = (vby) this.b;
                vbyVar.getClass();
                g0g0Var = tx3.g0((Object[]) vbyVar.b(new wme0(sre0.f32672a.b(gv00.class), gv00.Companion.serializer()), string));
            }
        } catch (Throwable th) {
            e0g0 e0g0Var2 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        iun iunVar = iun.f15405a;
        if (g0g0Var instanceof g0g0) {
            g0g0Var = iunVar;
        }
        return (List) g0g0Var;
    }

    public okr0 m() {
        okr0 okr0Var = (okr0) ((gkr0) this.f10448a).b.getValue();
        return okr0Var == null ? new okr0("", "", 0L, 0L, "", "", 0L, 0.0d, 0.0d, iun.f15405a) : okr0Var;
    }

    public void n(q45 q45Var) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", q45Var.f28082a);
            jSONObject.put("Status", hne.E(q45Var.b));
            jSONObject.put("AuthToken", q45Var.c);
            jSONObject.put("RefreshToken", q45Var.d);
            jSONObject.put("TokenCreationEpochInSecs", q45Var.f);
            jSONObject.put("ExpiresInSecs", q45Var.e);
            jSONObject.put("FisError", q45Var.g);
            nfq nfqVar = (nfq) this.b;
            nfqVar.a();
            File fileCreateTempFile = File.createTempFile("PersistedInstallation", "tmp", nfqVar.f23449a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (fileCreateTempFile.renameTo(g())) {
            } else {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object o(zje zjeVar) {
        jht0 jht0Var;
        boolean zCompareAndSet;
        nvu nvuVar = (nvu) this.f10448a;
        if (zjeVar instanceof jht0) {
            jht0Var = (jht0) zjeVar;
            int i = jht0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                jht0Var.k = i - Integer.MIN_VALUE;
            } else {
                jht0Var = new jht0(this, zjeVar);
            }
        } else {
            jht0Var = new jht0(this, zjeVar);
        }
        Object objD = jht0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = jht0Var.k;
        if (i2 == 0) {
            z1x.P(objD);
            g8n0 g8n0Var = (g8n0) nvuVar.b;
            synchronized (g8n0Var) {
                AtomicBoolean atomicBoolean = g8n0Var.d;
                zCompareAndSet = atomicBoolean.compareAndSet(atomicBoolean.get(), true);
            }
            if (!zCompareAndSet) {
                return Unit.f46060a;
            }
            jht0Var.k = 1;
            objD = nvuVar.D(jht0Var);
            if (objD == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objD);
        }
        is7 is7Var = (is7) objD;
        List list = is7Var.b;
        list.getClass();
        g8n0 g8n0Var2 = (g8n0) nvuVar.b;
        g8n0Var2.getClass();
        g8n0Var2.f10874a.n(CollectionsKt.P0(list));
        mii0 mii0Var = (mii0) this.b;
        List list2 = is7Var.f15289a;
        list2.getClass();
        ev7 ev7Var = (ev7) mii0Var.d;
        ev7Var.getClass();
        ArrayList arrayList = ev7Var.f8454a;
        arrayList.clear();
        arrayList.addAll(list2);
        g8n0 g8n0Var3 = (g8n0) nvuVar.b;
        synchronized (g8n0Var3) {
            AtomicBoolean atomicBoolean2 = g8n0Var3.d;
            atomicBoolean2.compareAndSet(atomicBoolean2.get(), false);
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object p(l9s l9sVar, zje zjeVar) {
        fyg0 fyg0Var;
        aja ajaVar;
        Object value;
        egs egsVar;
        if (zjeVar instanceof fyg0) {
            fyg0Var = (fyg0) zjeVar;
            int i = fyg0Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                fyg0Var.m = i - Integer.MIN_VALUE;
            } else {
                fyg0Var = new fyg0(this, zjeVar);
            }
        } else {
            fyg0Var = new fyg0(this, zjeVar);
        }
        Object obj = fyg0Var.k;
        wne wneVar = wne.f39444a;
        int i2 = fyg0Var.m;
        if (i2 == 0) {
            z1x.P(obj);
            aja ajaVar2 = (aja) this.f10448a;
            rjl0 rjl0Var = (rjl0) this.b;
            fyg0Var.i = ajaVar2;
            fyg0Var.j = l9sVar;
            fyg0Var.m = 1;
            Object objA = rjl0Var.a(fyg0Var);
            if (objA == wneVar) {
                return wneVar;
            }
            obj = objA;
            ajaVar = ajaVar2;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            l9sVar = fyg0Var.j;
            ajaVar = fyg0Var.i;
            z1x.P(obj);
        }
        l9s l9sVar2 = l9sVar;
        List list = (List) obj;
        ajaVar.getClass();
        l9sVar2.getClass();
        list.getClass();
        rfs rfsVar = ajaVar.f964a;
        boolean zIs24HourFormat = DateFormat.is24HourFormat(ajaVar.b.f33916a);
        rfsVar.getClass();
        p7m0 p7m0Var = rfsVar.f30402a;
        do {
            value = p7m0Var.getValue();
            egsVar = (egs) value;
        } while (!p7m0Var.m(value, egsVar instanceof bgs ? bgs.a((bgs) egsVar, l9sVar2, null, l9sVar2.U(), null, null, list, zIs24HourFormat, 26) : new bgs(l9sVar2, null, l9sVar2.U(), null, null, list, zIs24HourFormat)));
        return Unit.f46060a;
    }

    public Object q(String str, rwn rwnVar, bnn0 bnn0Var) {
        if (rwnVar != null) {
            yje yjeVar = null;
            if (rwnVar instanceof pwn) {
                xex xexVar = (xex) this.f10448a;
                Object objD0 = qjj.d0(((mne) xexVar.f40764a).b, new ke5(xexVar, str, ((pwn) rwnVar).f27719a, yjeVar, (byte) 2), bnn0Var);
                wne wneVar = wne.f39444a;
                if (objD0 != wneVar) {
                    objD0 = Unit.f46060a;
                }
                return objD0 == wneVar ? objD0 : Unit.f46060a;
            }
            if (rwnVar instanceof qwn) {
                xex xexVar2 = (xex) this.b;
                Object objD1 = qjj.d0(((mne) xexVar2.f40764a).b, new ke5(xexVar2, str, ((qwn) rwnVar).f29443a, yjeVar, (byte) 2), bnn0Var);
                wne wneVar2 = wne.f39444a;
                if (objD1 != wneVar2) {
                    objD1 = Unit.f46060a;
                }
                return objD1 == wneVar2 ? objD1 : Unit.f46060a;
            }
        }
        t9f.b();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object r(String str, l9r l9rVar, zje zjeVar) {
        cgq0 cgq0Var;
        if (zjeVar instanceof cgq0) {
            cgq0Var = (cgq0) zjeVar;
            int i = cgq0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                cgq0Var.k = i - Integer.MIN_VALUE;
            } else {
                cgq0Var = new cgq0(this, zjeVar);
            }
        } else {
            cgq0Var = new cgq0(this, zjeVar);
        }
        Object objA = cgq0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = cgq0Var.k;
        if (i2 == 0) {
            z1x.P(objA);
            y8r y8rVar = (y8r) ((enj0) this.f10448a).invoke();
            cgq0Var.k = 1;
            objA = y8rVar.a(str, l9rVar, cgq0Var);
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
        return ((nz5) objA).a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object s(String str, jft jftVar, zje zjeVar) {
        dgq0 dgq0Var;
        if (zjeVar instanceof dgq0) {
            dgq0Var = (dgq0) zjeVar;
            int i = dgq0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                dgq0Var.k = i - Integer.MIN_VALUE;
            } else {
                dgq0Var = new dgq0(this, zjeVar);
            }
        } else {
            dgq0Var = new dgq0(this, zjeVar);
        }
        Object objA = dgq0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = dgq0Var.k;
        if (i2 == 0) {
            z1x.P(objA);
            xet xetVar = (xet) ((enj0) this.b).invoke();
            dgq0Var.k = 1;
            objA = xetVar.a(str, jftVar, dgq0Var);
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
        return ((q16) objA).a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object t(String str, x8r x8rVar, zje zjeVar) {
        egq0 egq0Var;
        if (zjeVar instanceof egq0) {
            egq0Var = (egq0) zjeVar;
            int i = egq0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                egq0Var.k = i - Integer.MIN_VALUE;
            } else {
                egq0Var = new egq0(this, zjeVar);
            }
        } else {
            egq0Var = new egq0(this, zjeVar);
        }
        Object objC = egq0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = egq0Var.k;
        if (i2 == 0) {
            z1x.P(objC);
            y8r y8rVar = (y8r) ((enj0) this.f10448a).invoke();
            egq0Var.k = 1;
            objC = y8rVar.c(str, x8rVar, egq0Var);
            if (objC == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objC);
        }
        return ((nz5) objC).a();
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) throws Throwable {
        FileWriter fileWriter;
        sd60 sd60Var = (sd60) this.b;
        JSONObject jSONObject = (JSONObject) ((aaf) ((cu) this.f10448a).d).f520a.submit(new hrd(this, (byte) 6)).get();
        FileWriter fileWriter2 = null;
        if (jSONObject != null) {
            lwi0 lwi0VarL = ((dpi0) sd60Var.d).l(jSONObject);
            do20 do20Var = (do20) sd60Var.e;
            long j = lwi0VarL.c;
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Writing settings to cache file...", null);
            }
            try {
                jSONObject.put("expires_at", j);
                fileWriter = new FileWriter((File) do20Var.f6397a);
                try {
                    try {
                        fileWriter.write(jSONObject.toString());
                        fileWriter.flush();
                    } catch (Exception e) {
                        e = e;
                        Log.e("FirebaseCrashlytics", "Failed to cache settings", e);
                    }
                } catch (Throwable th) {
                    th = th;
                    fileWriter2 = fileWriter;
                    aad.J(fileWriter2, "Failed to close settings writer.");
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
                fileWriter = null;
            } catch (Throwable th2) {
                th = th2;
                aad.J(fileWriter2, "Failed to close settings writer.");
                throw th;
            }
            aad.J(fileWriter, "Failed to close settings writer.");
            sd60.k(jSONObject, "Loaded settings: ");
            String str = ((z6j0) sd60Var.c).f;
            SharedPreferences.Editor editorEdit = ((Context) sd60Var.b).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
            editorEdit.putString("existing_instance_identifier", str);
            editorEdit.apply();
            ((AtomicReference) sd60Var.h).set(lwi0VarL);
            ((TaskCompletionSource) ((AtomicReference) sd60Var.i).get()).trySetResult(lwi0VarL);
        }
        return Tasks.forResult(null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object u(String str, wet wetVar, zje zjeVar) {
        fgq0 fgq0Var;
        if (zjeVar instanceof fgq0) {
            fgq0Var = (fgq0) zjeVar;
            int i = fgq0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                fgq0Var.k = i - Integer.MIN_VALUE;
            } else {
                fgq0Var = new fgq0(this, zjeVar);
            }
        } else {
            fgq0Var = new fgq0(this, zjeVar);
        }
        Object objD = fgq0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = fgq0Var.k;
        if (i2 == 0) {
            z1x.P(objD);
            xet xetVar = (xet) ((enj0) this.b).invoke();
            fgq0Var.k = 1;
            objD = xetVar.d(str, wetVar, fgq0Var);
            if (objD == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objD);
        }
        return ((q16) objD).a();
    }

    public q45 v() {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(g());
            while (true) {
                try {
                    int i = fileInputStream.read(bArr, 0, 16384);
                    if (i < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String strOptString = jSONObject.optString("Fid", null);
        int iOptInt = jSONObject.optInt("Status", 0);
        String strOptString2 = jSONObject.optString("AuthToken", null);
        String strOptString3 = jSONObject.optString("RefreshToken", null);
        long jOptLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long jOptLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String strOptString4 = jSONObject.optString("FisError", null);
        int i2 = q45.h;
        byte b = (byte) (((byte) (0 | 2)) | 1);
        int i3 = hne.H(5)[iOptInt];
        if (i3 == 0) {
            hny.u("Null registrationStatus");
            return null;
        }
        byte b2 = (byte) (((byte) (b | 2)) | 1);
        if (b2 == 3 && i3 != 0) {
            return new q45(i3, jOptLong2, jOptLong, strOptString, strOptString2, strOptString3, strOptString4);
        }
        StringBuilder sb = new StringBuilder();
        if (i3 == 0) {
            sb.append(" registrationStatus");
        }
        if ((b2 & 1) == 0) {
            sb.append(" expiresInSecs");
        }
        if ((b2 & 2) == 0) {
            sb.append(" tokenCreationEpochInSecs");
        }
        jf4.n(vqd.o("Missing required properties:", sb));
        return null;
    }

    public void w(List list) {
        boolean zIsEmpty = list.isEmpty();
        q7d0 q7d0Var = (q7d0) this.f10448a;
        if (zIsEmpty) {
            q7d0Var.h("start_failed_saved_logs");
            return;
        }
        vby vbyVar = (vby) this.b;
        vbyVar.getClass();
        q7d0Var.g("start_failed_saved_logs", vbyVar.d(new zw3(gv00.Companion.serializer(), (byte) 0), list));
    }

    public void x(u0f0 u0f0Var, String str) {
        str.getClass();
        ((y4f0) this.b).invoke(new zlb0(this, u0f0Var, str, (byte) 13));
    }

    public /* synthetic */ g090(Object obj, Object obj2) {
        this.f10448a = obj;
        this.b = obj2;
    }

    public g090(mne mneVar) {
        dvj dvjVar = mneVar.b;
        this.f10448a = new ir30(dvjVar, 120000L);
        this.b = new ir30(dvjVar, 120000L);
    }

    public g090(gkr0 gkr0Var, sd80 sd80Var) {
        gkr0Var.getClass();
        sd80Var.getClass();
        this.f10448a = gkr0Var;
        this.b = sd80Var;
    }

    public g090(ctf0 ctf0Var, String str) {
        ctf0Var.getClass();
        this.f10448a = ctf0Var;
        this.b = str;
    }
}

package a;

import android.content.SharedPreferences;
import android.os.Parcel;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.android.recaptcha.RecaptchaTasksClient;
import com.huawei.hms.support.feature.result.CommonConstant;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;
import okhttp3.Request;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class owp0 implements u73, vgu0, mff0, Continuation, thx0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f25975a;
    public Object b;

    public owp0(byte b) {
        this.f25975a = b;
        switch (b) {
            case 22:
                this.b = new ArrayList();
                break;
            case 23:
            default:
                this.b = new SparseArray();
                break;
            case 24:
                this.b = new ArrayDeque(16);
                break;
        }
    }

    public static owp0 j(JSONArray jSONArray) throws JSONException {
        niw0 niw0Var;
        if (jSONArray == null || jSONArray.length() == 0) {
            return new owp0(new ArrayList());
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            if (jSONObject == null) {
                niw0Var = new niw0();
            } else {
                String strA = ktm0.a(jSONObject.optString("federatedId"));
                String strA2 = ktm0.a(jSONObject.optString(CommonConstant.KEY_DISPLAY_NAME));
                String strA3 = ktm0.a(jSONObject.optString("photoUrl"));
                String strA4 = ktm0.a(jSONObject.optString("providerId"));
                String strA5 = ktm0.a(jSONObject.optString("phoneNumber"));
                String strA6 = ktm0.a(jSONObject.optString("email"));
                niw0 niw0Var2 = new niw0();
                niw0Var2.f23610a = strA;
                niw0Var2.b = strA2;
                niw0Var2.c = strA3;
                niw0Var2.d = strA4;
                niw0Var2.e = null;
                niw0Var2.f = strA5;
                niw0Var2.g = strA6;
                niw0Var = niw0Var2;
            }
            arrayList.add(niw0Var);
        }
        return new owp0(arrayList);
    }

    public void a() throws Exception {
        Object g0g0Var;
        uwb0 uwb0Var = (uwb0) this.b;
        uwb0Var.getClass();
        try {
            e0g0 e0g0Var = j0g0.b;
            if (uwb0Var.a().getAll().isEmpty()) {
                return;
            }
            SharedPreferences.Editor editorEdit = uwb0Var.a().edit();
            editorEdit.getClass();
            editorEdit.clear();
            editorEdit.apply();
            g0g0Var = Unit.f46060a;
        } catch (Throwable th) {
            e0g0 e0g0Var2 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        if (j0g0.a(g0g0Var) == null) {
            return;
        }
        try {
            uwb0Var.f36384a.deleteSharedPreferences(uwb0Var.b);
        } catch (Exception e) {
            if (!(e instanceof SecurityException)) {
                throw e;
            }
            throw new SecurityException(e.getMessage() + " ::  " + uwb0Var.a().getAll() + " :: " + uwb0Var.a(), e.getCause());
        }
    }

    @Override // a.mff0
    public void accept(Object obj, Object obj2) {
        switch (this.f25975a) {
            case 20:
                maw0 maw0Var = new maw0((TaskCompletionSource) obj2, (byte) 0);
                ebw0 ebw0Var = (ebw0) ((paw0) obj).l();
                BeginSignInRequest beginSignInRequest = (BeginSignInRequest) this.b;
                Parcel parcelC = ebw0Var.C();
                int i = taw0.f33634a;
                parcelC.writeStrongBinder(maw0Var);
                taw0.c(parcelC, beginSignInRequest);
                ebw0Var.D(parcelC, 1);
                break;
            default:
                int i2 = tzw0.l;
                izw0 izw0Var = new izw0((TaskCompletionSource) obj2);
                h0x0 h0x0Var = (h0x0) ((i0x0) obj).l();
                byte[] bArrA = ((g2x0) this.b).a();
                Parcel parcelG = h0x0Var.G();
                wmw0.c(parcelG, izw0Var);
                parcelG.writeByteArray(bArrA);
                h0x0Var.H(parcelG, 31);
                break;
        }
    }

    @Override // a.thx0
    public Iterator b(ikt0 ikt0Var, CharSequence charSequence) {
        Matcher matcher = ((u4x0) this.b).b.matcher(charSequence);
        nmt0 nmt0Var = new nmt0();
        matcher.getClass();
        nmt0Var.f23789a = matcher;
        return new nex0(ikt0Var, charSequence, nmt0Var, (byte) 0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    public Object c(int i, zje zjeVar, String str) {
        xlt0 xlt0Var;
        byte b;
        cyu cyuVar = (cyu) this.b;
        if (zjeVar instanceof xlt0) {
            xlt0Var = (xlt0) zjeVar;
            int i2 = xlt0Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xlt0Var.m = i2 - Integer.MIN_VALUE;
            } else {
                xlt0Var = new xlt0(this, zjeVar);
            }
        } else {
            xlt0Var = new xlt0(this, zjeVar);
        }
        Object objP = xlt0Var.k;
        Object obj = wne.f39444a;
        int i3 = xlt0Var.m;
        Integer num = null;
        if (i3 == 0) {
            z1x.P(objP);
            Integer intOrNull = StringsKt.toIntOrNull(str);
            if (intOrNull != null && intOrNull.intValue() != 0) {
                num = intOrNull;
            }
            xlt0Var.j = i;
            xlt0Var.m = 1;
            objP = cyuVar.p(num, xlt0Var);
            b = i;
            if (objP != obj) {
            }
        }
        if (i3 != 1) {
            if (i3 != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            List list = xlt0Var.i;
            z1x.P(objP);
            return list;
        }
        byte b2 = xlt0Var.j;
        z1x.P(objP);
        b = b2;
        List listD0 = CollectionsKt.D0((Iterable) objP, b);
        xlt0Var.i = listD0;
        xlt0Var.j = b;
        xlt0Var.m = 2;
        Object objA = ((qoj0) ((g2v) cyuVar.c).f10580a).a(listD0, xlt0Var);
        if (objA != obj) {
            objA = Unit.f46060a;
        }
        if (objA != obj) {
            objA = Unit.f46060a;
        }
        return objA == obj ? obj : listD0;
    }

    @Override // a.vgu0
    public Function0 d(x1 x1Var) {
        return lvm0.l(x1Var, (glz) this.b);
    }

    public Object e(zje zjeVar) {
        a4w0 a4w0Var = (a4w0) this.b;
        o3w0 o3w0Var = a4w0Var.c;
        return o3w0Var == null ? a4w0Var.a(zjeVar) : o3w0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    public Object f(Request request, int i, int i2, String str, long j, String str2, int i3, int i4, String str3, zje zjeVar) {
        d8w0 d8w0Var;
        Request.Builder builder;
        xcm0 xcm0Var;
        Request.Builder builder2;
        Request.Builder builder3;
        Request.Builder builder4;
        String str4;
        Request.Builder builder5;
        String str5;
        Request.Builder builder6;
        String str6;
        Request.Builder builder7;
        String str7;
        s7w0 s7w0Var = s7w0.b;
        s7w0 s7w0Var2 = s7w0.f31772a;
        s7w0 s7w0Var3 = s7w0.c;
        trm0 trm0Var = (trm0) this.b;
        if (zjeVar instanceof d8w0) {
            d8w0Var = (d8w0) zjeVar;
            int i5 = d8w0Var.n;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                d8w0Var.n = i5 - Integer.MIN_VALUE;
            } else {
                d8w0Var = new d8w0(this, zjeVar);
            }
        } else {
            d8w0Var = new d8w0(this, zjeVar);
        }
        Object obj = d8w0Var.l;
        wne wneVar = wne.f39444a;
        int i6 = d8w0Var.n;
        if (i6 == 0) {
            z1x.P(obj);
            u4w0 u4w0Var = new u4w0(i, i2, str, j, str2, i3, i4, str3, null, null, null);
            String strB = request.c.b("X-Push-Captcha");
            Request.Builder builderA = request.a();
            if (strB != null) {
                List listI0 = StringsKt.i0(strB, new char[]{','}, 6);
                if (listI0.size() != 3) {
                    jf4.o("Wrong value for X-Push-Captcha");
                    return null;
                }
                String str8 = (String) listI0.get(0);
                String str9 = (String) listI0.get(1);
                String str10 = (String) listI0.get(2);
                builder = builderA;
                u4w0 u4w0Var2 = new u4w0(i, i2, str, j, str2, i3, i4, str3, str8, str9, str10);
                builder.c.d("X-Push-Captcha");
                u4w0Var = u4w0Var2;
            } else {
                builder = builderA;
            }
            String str11 = request.f46108a.i;
            if (StringsKt.O(str11, "/UserAuth/GetCaptcha", false) || StringsKt.O(str11, "/captcha/v1/GetCaptcha", false)) {
                xcm0Var = s7w0Var;
            } else if (StringsKt.O(str11, "Register/Registration", false)) {
                xcm0Var = u7w0.f35206a;
            } else if (StringsKt.O(str11, "/UserAuth/Auth", false)) {
                xcm0Var = t7w0.f33487a;
            } else {
                xcm0Var = StringsKt.O(str11, "/MobileLiveBetX/MobileMakeBet", false) ? s7w0Var3 : s7w0Var2;
            }
            if (xcm0Var instanceof t7w0) {
                d8w0Var.i = builder;
                d8w0Var.j = builder;
                d8w0Var.k = "X-Sign";
                d8w0Var.n = 1;
                Object objA = trm0Var.a(xcm0Var, u4w0Var, d8w0Var);
                if (objA != wneVar) {
                    builder7 = builder;
                    builder4 = builder7;
                    obj = objA;
                    str7 = "X-Sign";
                    builder7.a(str7, (String) obj);
                    builder2 = builder4;
                }
            } else if (xcm0Var.equals(s7w0Var)) {
                d8w0Var.i = builder;
                d8w0Var.j = builder;
                d8w0Var.k = "X-Sign";
                d8w0Var.n = 2;
                Object objA2 = trm0Var.a(xcm0Var, u4w0Var, d8w0Var);
                if (objA2 != wneVar) {
                    builder6 = builder;
                    builder4 = builder6;
                    obj = objA2;
                    str6 = "X-Sign";
                    builder6.a(str6, (String) obj);
                    builder2 = builder4;
                }
            } else if (xcm0Var.equals(s7w0Var3)) {
                d8w0Var.i = builder;
                d8w0Var.j = builder;
                d8w0Var.k = "X-Sign";
                d8w0Var.n = 3;
                Object objA3 = trm0Var.a(xcm0Var, u4w0Var, d8w0Var);
                if (objA3 != wneVar) {
                    builder5 = builder;
                    builder4 = builder5;
                    obj = objA3;
                    str5 = "X-Sign";
                    builder5.a(str5, (String) obj);
                    builder2 = builder4;
                }
            } else if (xcm0Var instanceof u7w0) {
                d8w0Var.i = builder;
                d8w0Var.j = builder;
                d8w0Var.k = "X-Sign";
                d8w0Var.n = 4;
                Object objA4 = trm0Var.a(xcm0Var, u4w0Var, d8w0Var);
                if (objA4 != wneVar) {
                    builder3 = builder;
                    builder4 = builder3;
                    obj = objA4;
                    str4 = "X-Sign";
                    builder3.a(str4, (String) obj);
                    builder2 = builder4;
                }
            } else {
                if (!xcm0Var.equals(s7w0Var2)) {
                    t9f.b();
                    return null;
                }
                builder2 = builder;
            }
            return wneVar;
        }
        if (i6 == 1) {
            str7 = d8w0Var.k;
            builder7 = d8w0Var.j;
            builder4 = d8w0Var.i;
            z1x.P(obj);
            builder7.a(str7, (String) obj);
            builder2 = builder4;
        } else if (i6 == 2) {
            str6 = d8w0Var.k;
            builder6 = d8w0Var.j;
            builder4 = d8w0Var.i;
            z1x.P(obj);
            builder6.a(str6, (String) obj);
            builder2 = builder4;
        } else if (i6 == 3) {
            str5 = d8w0Var.k;
            builder5 = d8w0Var.j;
            builder4 = d8w0Var.i;
            z1x.P(obj);
            builder5.a(str5, (String) obj);
            builder2 = builder4;
        } else {
            if (i6 != 4) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str4 = d8w0Var.k;
            builder3 = d8w0Var.j;
            builder4 = d8w0Var.i;
            z1x.P(obj);
            builder3.a(str4, (String) obj);
            builder2 = builder4;
        }
        builder2.getClass();
        return new Request(builder2);
    }

    public void g(ldf0 ldf0Var) {
        Object value;
        hdf0 hdf0Var = (hdf0) ((pv00) this.b).f27640a;
        hdf0Var.getClass();
        p7m0 p7m0Var = hdf0Var.f12867a;
        do {
            value = p7m0Var.getValue();
        } while (!p7m0Var.m(value, ldf0Var));
    }

    @Override // a.u73
    public xkq get(int i) {
        return ((mlq[]) this.b)[i];
    }

    public void h(String str) {
        Object value;
        sar0 sar0Var;
        str.getClass();
        oar0 oar0Var = ((dhm0) this.b).d;
        oar0Var.getClass();
        p7m0 p7m0Var = oar0Var.f24943a;
        do {
            value = p7m0Var.getValue();
            sar0Var = (sar0) value;
        } while (!p7m0Var.m(value, sar0Var != null ? sar0.a(sar0Var, null, str, 1) : null));
    }

    public void i(String str) {
        str.getClass();
        ((uwb0) this.b).c("USER_PASS_PASS", str);
    }

    public n4x0 k(String str, boolean z) {
        return new n4x0(str, (fbv) this.b, z);
    }

    public void l() throws IOException {
        ArrayDeque arrayDeque = (ArrayDeque) this.b;
        if (arrayDeque.isEmpty()) {
            return;
        }
        throw new IOException("data item not completed, stackSize: " + arrayDeque.size() + " scope: " + n());
    }

    public void m(long j) throws IOException {
        long jN = n();
        if (jN != j) {
            if (jN != -1) {
                if (jN != -2) {
                    return;
                } else {
                    jN = -2;
                }
            }
            StringBuilder sbQ = kng0.q(j, "expected non-string scope or scope ", " but found ");
            sbQ.append(jN);
            throw new IOException(sbQ.toString());
        }
    }

    public long n() {
        ArrayDeque arrayDeque = (ArrayDeque) this.b;
        if (arrayDeque.isEmpty()) {
            return 0L;
        }
        return ((Long) arrayDeque.peek()).longValue();
    }

    public void o(int i, Object obj, egw0 egw0Var) {
        aew0 aew0Var = (aew0) this.b;
        jdw0 jdw0Var = (jdw0) obj;
        aew0Var.d(i, 2);
        aew0Var.r(jdw0Var.b(egw0Var));
        egw0Var.f(jdw0Var, this);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public /* synthetic */ Object then(Task task) {
        if (task.isSuccessful()) {
            return ((RecaptchaTasksClient) task.getResult()).executeTask((RecaptchaAction) this.b);
        }
        Exception exception = task.getException();
        s0x.H(exception);
        if (!(exception instanceof hnw0)) {
            return Tasks.forException(exception);
        }
        if (Log.isLoggable("RecaptchaHandler", 4)) {
            Log.i("RecaptchaHandler", "Ignoring error related to fetching recaptcha config - " + exception.getMessage());
        }
        return Tasks.forResult("");
    }

    public /* synthetic */ owp0(oaw0 oaw0Var, BeginSignInRequest beginSignInRequest) {
        this.f25975a = (byte) 20;
        this.b = beginSignInRequest;
    }

    public /* synthetic */ owp0(Object obj, byte b) {
        this.f25975a = b;
        this.b = obj;
    }

    public owp0(trm0 trm0Var, uxs0 uxs0Var) {
        this.f25975a = (byte) 19;
        this.b = trm0Var;
    }

    public owp0(aew0 aew0Var) {
        this.f25975a = (byte) 21;
        this.b = aew0Var;
        aew0Var.f750a = this;
    }

    public owp0(uwb0 uwb0Var) {
        this.f25975a = (byte) 14;
        uwb0Var.getClass();
        this.b = uwb0Var;
    }

    public owp0(fme fmeVar) {
        this.f25975a = (byte) 0;
        fmeVar.getClass();
        this.b = fmeVar;
    }

    public owp0(a4w0 a4w0Var) {
        this.f25975a = (byte) 18;
        a4w0Var.getClass();
        this.b = a4w0Var;
    }

    public owp0(gii0 gii0Var) {
        this.f25975a = (byte) 2;
        gii0Var.getClass();
        this.b = new lkr0(gii0Var, (byte) 1);
    }

    public owp0(zcw0 zcw0Var, RecaptchaAction recaptchaAction) {
        this.f25975a = (byte) 23;
        this.b = recaptchaAction;
        Objects.requireNonNull(zcw0Var);
    }

    public owp0(ArrayList arrayList) {
        this.f25975a = (byte) 22;
        if (!arrayList.isEmpty()) {
            this.b = Collections.unmodifiableList(arrayList);
        } else {
            this.b = Collections.EMPTY_LIST;
        }
    }

    public /* synthetic */ owp0(byte b, boolean z) {
        this.f25975a = b;
    }

    public owp0(clz clzVar) {
        this.f25975a = (byte) 16;
        this.b = clzVar.x();
    }

    public owp0(float f, float f2, t73 t73Var) {
        this.f25975a = (byte) 15;
        int iB = t73Var.b();
        mlq[] mlqVarArr = new mlq[iB];
        for (int i = 0; i < iB; i++) {
            mlqVarArr[i] = new mlq(f, f2, t73Var.a(i));
        }
        this.b = mlqVarArr;
    }
}

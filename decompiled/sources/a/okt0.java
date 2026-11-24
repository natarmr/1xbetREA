package a;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.internal.p000firebaseauthapi.zzaia;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.internal.GenericIdpActivity;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
public final class okt0 implements ylu0, ngw0, OnCompleteListener, mff0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f25422a;
    public Object b;

    public okt0(byte b) {
        switch (b) {
            case 15:
                this.f25422a = new HashMap();
                this.b = new HashMap();
                break;
            case 16:
                this.f25422a = new TreeMap();
                this.b = new TreeMap();
                break;
            default:
                this.f25422a = new HashMap();
                this.b = new xlw0((byte) 6);
                xlw0 xlw0Var = new xlw0((byte) 0);
                smw0 smw0Var = smw0.BITWISE_AND;
                ArrayList arrayList = xlw0Var.f41097a;
                arrayList.add(smw0Var);
                arrayList.add(smw0.BITWISE_LEFT_SHIFT);
                arrayList.add(smw0.BITWISE_NOT);
                arrayList.add(smw0.BITWISE_OR);
                arrayList.add(smw0.BITWISE_RIGHT_SHIFT);
                arrayList.add(smw0.BITWISE_UNSIGNED_RIGHT_SHIFT);
                arrayList.add(smw0.BITWISE_XOR);
                q(xlw0Var);
                xlw0 xlw0Var2 = new xlw0((byte) 1);
                smw0 smw0Var2 = smw0.EQUALS;
                ArrayList arrayList2 = xlw0Var2.f41097a;
                arrayList2.add(smw0Var2);
                arrayList2.add(smw0.GREATER_THAN);
                arrayList2.add(smw0.GREATER_THAN_EQUALS);
                arrayList2.add(smw0.IDENTITY_EQUALS);
                arrayList2.add(smw0.IDENTITY_NOT_EQUALS);
                arrayList2.add(smw0.LESS_THAN);
                arrayList2.add(smw0.LESS_THAN_EQUALS);
                arrayList2.add(smw0.NOT_EQUALS);
                q(xlw0Var2);
                xlw0 xlw0Var3 = new xlw0((byte) 2);
                smw0 smw0Var3 = smw0.APPLY;
                ArrayList arrayList3 = xlw0Var3.f41097a;
                arrayList3.add(smw0Var3);
                arrayList3.add(smw0.BLOCK);
                arrayList3.add(smw0.BREAK);
                arrayList3.add(smw0.CASE);
                arrayList3.add(smw0.DEFAULT);
                arrayList3.add(smw0.CONTINUE);
                arrayList3.add(smw0.DEFINE_FUNCTION);
                arrayList3.add(smw0.FN);
                arrayList3.add(smw0.IF);
                arrayList3.add(smw0.QUOTE);
                arrayList3.add(smw0.RETURN);
                arrayList3.add(smw0.SWITCH);
                arrayList3.add(smw0.TERNARY);
                q(xlw0Var3);
                xlw0 xlw0Var4 = new xlw0((byte) 3);
                smw0 smw0Var4 = smw0.AND;
                ArrayList arrayList4 = xlw0Var4.f41097a;
                arrayList4.add(smw0Var4);
                arrayList4.add(smw0.NOT);
                arrayList4.add(smw0.OR);
                q(xlw0Var4);
                xlw0 xlw0Var5 = new xlw0((byte) 4);
                smw0 smw0Var5 = smw0.FOR_IN;
                ArrayList arrayList5 = xlw0Var5.f41097a;
                arrayList5.add(smw0Var5);
                arrayList5.add(smw0.FOR_IN_CONST);
                arrayList5.add(smw0.FOR_IN_LET);
                arrayList5.add(smw0.FOR_LET);
                arrayList5.add(smw0.FOR_OF);
                arrayList5.add(smw0.FOR_OF_CONST);
                arrayList5.add(smw0.FOR_OF_LET);
                arrayList5.add(smw0.WHILE);
                q(xlw0Var5);
                xlw0 xlw0Var6 = new xlw0((byte) 5);
                smw0 smw0Var6 = smw0.ADD;
                ArrayList arrayList6 = xlw0Var6.f41097a;
                arrayList6.add(smw0Var6);
                arrayList6.add(smw0.DIVIDE);
                arrayList6.add(smw0.MODULUS);
                arrayList6.add(smw0.MULTIPLY);
                arrayList6.add(smw0.NEGATE);
                arrayList6.add(smw0.POST_DECREMENT);
                arrayList6.add(smw0.POST_INCREMENT);
                arrayList6.add(smw0.PRE_DECREMENT);
                arrayList6.add(smw0.PRE_INCREMENT);
                arrayList6.add(smw0.SUBTRACT);
                q(xlw0Var6);
                xlw0 xlw0Var7 = new xlw0((byte) 7);
                smw0 smw0Var7 = smw0.ASSIGN;
                ArrayList arrayList7 = xlw0Var7.f41097a;
                arrayList7.add(smw0Var7);
                arrayList7.add(smw0.CONST);
                arrayList7.add(smw0.CREATE_ARRAY);
                arrayList7.add(smw0.CREATE_OBJECT);
                arrayList7.add(smw0.EXPRESSION_LIST);
                arrayList7.add(smw0.GET);
                arrayList7.add(smw0.GET_INDEX);
                arrayList7.add(smw0.GET_PROPERTY);
                arrayList7.add(smw0.NULL);
                arrayList7.add(smw0.SET_PROPERTY);
                arrayList7.add(smw0.TYPEOF);
                arrayList7.add(smw0.UNDEFINED);
                arrayList7.add(smw0.VAR);
                q(xlw0Var7);
                break;
        }
    }

    public static fck0 l() {
        fck0 fck0Var = new fck0((byte) 27, false);
        fck0Var.b = new HashMap();
        fck0Var.c = new HashMap();
        return fck0Var;
    }

    @Override // a.mff0
    public void accept(Object obj, Object obj2) {
        int i = tzw0.l;
        izw0 izw0Var = new izw0((TaskCompletionSource) obj2);
        h0x0 h0x0Var = (h0x0) ((i0x0) obj).l();
        String[] strArr = (String[]) this.b;
        String str = (String) this.f25422a;
        Parcel parcelG = h0x0Var.G();
        wmw0.c(parcelG, izw0Var);
        parcelG.writeString(str);
        parcelG.writeInt(0);
        parcelG.writeStringArray(strArr);
        parcelG.writeByteArray(null);
        h0x0Var.H(parcelG, 1);
    }

    @Override // a.ylu0
    public int b(int i) {
        nj50 nj50Var = (nj50) this.f25422a;
        SparseArray sparseArray = (SparseArray) ((ilp0) this.b).f14992a;
        List arrayList = (List) sparseArray.get(i);
        if (arrayList == null) {
            arrayList = new ArrayList();
            sparseArray.put(i, arrayList);
        }
        if (!arrayList.contains(nj50Var)) {
            arrayList.add(nj50Var);
        }
        return i;
    }

    public t44 c() {
        return (t44) ((a8z) this.b).getValue();
    }

    public long d() {
        return ((btt0) this.f25422a).f3200a.b().getLong("TOKEN_EXPIRE_TIME", 0L);
    }

    public long e() {
        return ((btt0) this.f25422a).f3200a.b().getLong("TOKEN_REFRESH_TIME", 0L);
    }

    public void f(long j) {
        lef0 lef0Var = (lef0) this.f25422a;
        t5g0 t5g0Var = (t5g0) lef0Var.f19899a;
        Set set = (Set) ((Map) ((o5g0) ((pv00) this.b).f27640a).f24686a.getValue()).get(Long.valueOf(j));
        if (set == null) {
            set = xun.f41520a;
        }
        if (set.isEmpty()) {
            lef0Var.n(j);
            return;
        }
        v5g0 v5g0Var = (v5g0) t5g0Var.f33368a.getValue();
        Date date = v5g0Var != null ? v5g0Var.b : null;
        if (date != null && set.contains(date)) {
            lef0Var.n(j);
            return;
        }
        v5g0 v5g0Var2 = new v5g0(j, m2x.z(set));
        t5g0Var.getClass();
        t5g0Var.f33368a.o(null, v5g0Var2);
    }

    public void g() {
        btt0 btt0Var = (btt0) this.f25422a;
        vwb0 vwb0Var = btt0Var.f3200a;
        vwb0Var.i("new_user_token");
        vwb0Var.i("refresh_token");
        vwb0Var.i("TOKEN_EXPIRE_TIME");
        vwb0Var.i("TOKEN_REFRESH_TIME");
        btt0Var.b.set("");
    }

    @Override // a.ngw0
    public void h(xfw0 xfw0Var) {
        njw0 njw0Var = (njw0) xfw0Var;
        ((nmt0) this.b).g(new zzaia(Long.valueOf(njw0Var.c), njw0Var.b, njw0Var.f23656a), null, null, Boolean.valueOf(njw0Var.d), null, (hcp0) this.f25422a, this);
    }

    public void i(int i) {
        ls90 ls90Var = (ls90) this.b;
        if (ls90Var != null) {
            ls90Var.invoke(Integer.valueOf(i));
            return;
        }
        ks90 ks90Var = (ks90) this.f25422a;
        if (ks90Var != null) {
            ks90Var.invoke(Integer.valueOf(i));
        }
    }

    public void j(h6m0 h6m0Var, afm0 afm0Var) {
        h6m0Var.getClass();
        ((fpv0) this.b).a(new cps0(this, h6m0Var, afm0Var, (byte) 2));
    }

    public void k(h6m0 h6m0Var, int i) {
        h6m0Var.getClass();
        ((fpv0) this.b).a(new wqm0((ezb0) this.f25422a, h6m0Var, false, i));
    }

    public srw0 m() throws GeneralSecurityException {
        Integer num = (Integer) this.f25422a;
        if (num == null) {
            hny.o("Key size is not set");
            return null;
        }
        if (((m60) this.b) != null) {
            return new srw0(num.intValue(), (m60) this.b);
        }
        hny.o("Variant is not set");
        return null;
    }

    public Enum n(Object obj) throws GeneralSecurityException {
        Enum r1 = (Enum) ((Map) this.b).get(obj);
        if (r1 != null) {
            return r1;
        }
        throw new GeneralSecurityException("Unable to convert object enum: ".concat(String.valueOf(obj)));
    }

    public Object o(Enum r2) throws GeneralSecurityException {
        Object obj = ((Map) this.f25422a).get(r2);
        if (obj != null) {
            return obj;
        }
        throw new GeneralSecurityException("Unable to convert proto enum: ".concat(String.valueOf(r2)));
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        GenericIdpActivity genericIdpActivity = (GenericIdpActivity) this.f25422a;
        String str = (String) this.b;
        low0 low0Var = GenericIdpActivity.Y;
        if (genericIdpActivity.getPackageManager().resolveActivity(new Intent(CommonConstant.ACTION.HWID_SCHEME_URL), 0) == null) {
            Log.e("GenericIdpActivity", "Device cannot resolve intent for: android.intent.action.VIEW");
            genericIdpActivity.u();
            return;
        }
        List<ResolveInfo> listQueryIntentServices = genericIdpActivity.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, (Uri) task.getResult());
            intent.putExtra("com.android.browser.application_id", str);
            Log.i("GenericIdpActivity", "Opening IDP Sign In link in a browser window.");
            intent.addFlags(1073741824);
            intent.addFlags(268435456);
            genericIdpActivity.startActivity(intent);
            return;
        }
        yzn0 yzn0VarM = new mii0((byte) 22).m();
        Log.i("GenericIdpActivity", "Opening IDP Sign In link in a custom chrome tab.");
        Uri uri = (Uri) task.getResult();
        Intent intent2 = (Intent) yzn0VarM.f43523a;
        intent2.setData(uri);
        genericIdpActivity.startActivity(intent2, (Bundle) yzn0VarM.b);
    }

    public void p(int i) throws InvalidAlgorithmParameterException {
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
        }
        this.f25422a = Integer.valueOf(i);
    }

    public void q(xlw0 xlw0Var) {
        Iterator it = xlw0Var.f41097a.iterator();
        while (it.hasNext()) {
            ((HashMap) this.f25422a).put(Integer.valueOf(((smw0) it.next()).f32468a).toString(), xlw0Var);
        }
    }

    public void r(h7x0 h7x0Var) throws GeneralSecurityException {
        HashMap map = (HashMap) this.f25422a;
        if (h7x0Var == null) {
            hny.u("primitive constructor must be non-null");
            return;
        }
        m7x0 m7x0Var = new m7x0(h7x0Var.f12597a, h7x0Var.b);
        if (!map.containsKey(m7x0Var)) {
            map.put(m7x0Var, h7x0Var);
            return;
        }
        h7x0 h7x0Var2 = (h7x0) map.get(m7x0Var);
        if (!h7x0Var2.equals(h7x0Var) || h7x0Var != h7x0Var2) {
            throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ".concat(String.valueOf(m7x0Var)));
        }
    }

    public jlw0 s(h0q0 h0q0Var, jlw0 jlw0Var) {
        pvm0.N(h0q0Var);
        if (!(jlw0Var instanceof plw0)) {
            return jlw0Var;
        }
        plw0 plw0Var = (plw0) jlw0Var;
        ArrayList arrayList = plw0Var.b;
        String str = plw0Var.f27205a;
        HashMap map = (HashMap) this.f25422a;
        return (map.containsKey(str) ? (xlw0) map.get(str) : (xlw0) this.b).a(str, h0q0Var, arrayList);
    }

    public void t(h0q0 h0q0Var, mpt0 mpt0Var) {
        p0x0 p0x0Var = new p0x0(mpt0Var);
        TreeMap treeMap = (TreeMap) this.f25422a;
        for (Integer num : treeMap.keySet()) {
            nbw0 nbw0VarA = ((nbw0) mpt0Var.d).clone();
            jlw0 jlw0VarA = ((xkw0) treeMap.get(num)).a(h0q0Var, Collections.singletonList(p0x0Var));
            int iJ = jlw0VarA instanceof ihw0 ? pvm0.J(((ihw0) jlw0VarA).f14801a.doubleValue()) : -1;
            if (iJ == 2 || iJ == -1) {
                mpt0Var.d = nbw0VarA;
            }
        }
        TreeMap treeMap2 = (TreeMap) this.b;
        Iterator it = treeMap2.keySet().iterator();
        while (it.hasNext()) {
            jlw0 jlw0VarA2 = ((xkw0) treeMap2.get((Integer) it.next())).a(h0q0Var, Collections.singletonList(p0x0Var));
            if (jlw0VarA2 instanceof ihw0) {
                pvm0.J(((ihw0) jlw0VarA2).f14801a.doubleValue());
            }
        }
    }

    @Override // a.ngw0
    /* JADX INFO: renamed from: zza */
    public void mo2zza(String str) {
        ((hcp0) this.f25422a).a(msm0.v(str));
    }

    @Override // a.ylu0
    public int a(int i) {
        return i;
    }

    public /* synthetic */ okt0(Object obj, Object obj2, boolean z) {
        this.b = obj;
        this.f25422a = obj2;
    }

    public /* synthetic */ okt0(Object obj, Object obj2) {
        this.f25422a = obj;
        this.b = obj2;
    }

    public okt0(gii0 gii0Var) {
        gii0Var.getClass();
        this.f25422a = gii0Var;
        this.b = new rbt0(this, (byte) 19);
    }

    public okt0(j7x0 j7x0Var) {
        this.f25422a = new HashMap(j7x0Var.f16060a);
        this.b = new HashMap(j7x0Var.b);
    }

    public okt0(ezb0 ezb0Var, fpv0 fpv0Var) {
        ezb0Var.getClass();
        fpv0Var.getClass();
        this.f25422a = ezb0Var;
        this.b = fpv0Var;
    }

    public okt0(c8d c8dVar) {
        this.f25422a = c8dVar;
        this.b = maz.a(wez.b, new y9v0((byte) 15));
    }
}

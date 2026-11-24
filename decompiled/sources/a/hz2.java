package a;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.gov.nist.core.Separators;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes.dex */
public final class hz2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f13886a;

    public hz2(Context context, byte b) {
        switch (b) {
            case 1:
                this.f13886a = context;
                break;
            default:
                this.f13886a = context.getApplicationContext();
                break;
        }
    }

    public hyi a() {
        Context context = this.f13886a;
        if (context == null) {
            throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
        }
        hyi hyiVar = new hyi();
        hyiVar.f13860a = nbl.a(j47.o);
        byte b = 1;
        ubf ubfVar = new ubf(context, (byte) 1);
        hyiVar.b = ubfVar;
        byte b2 = 0;
        hyiVar.c = nbl.a(new id40(ubfVar, new ubf(ubfVar, (byte) 0), b2));
        ubf ubfVar2 = hyiVar.b;
        hyiVar.d = new mho(ubfVar2, (byte) 1);
        o5d0 o5d0VarA = nbl.a(new id40(hyiVar.d, nbl.a(new mho(ubfVar2, (byte) 0)), b));
        hyiVar.e = o5d0VarA;
        nho nhoVar = new nho((byte) 2);
        ubf ubfVar3 = hyiVar.b;
        n2h0 n2h0Var = new n2h0(ubfVar3, o5d0VarA, nhoVar, b2);
        o5d0 o5d0Var = hyiVar.f13860a;
        o5d0 o5d0Var2 = hyiVar.c;
        hyiVar.f = nbl.a(new n2h0(new twj(o5d0Var, o5d0Var2, n2h0Var, o5d0VarA, o5d0VarA), new znt0(ubfVar3, o5d0Var2, o5d0VarA, n2h0Var, o5d0Var, o5d0VarA, o5d0VarA), new bpv0(o5d0Var, o5d0VarA, n2h0Var, o5d0VarA), b));
        return hyiVar;
    }

    public Typeface b(atf0 atf0Var) {
        String strA;
        Context context = this.f13886a;
        if (!(atf0Var instanceof atf0)) {
            return null;
        }
        Typeface typefaceA = itf0.a(atf0Var.f1430a, context);
        typefaceA.getClass();
        List list = atf0Var.c.f25794a;
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            ThreadLocal threadLocal = p0t0.f26169a;
            if (typefaceA == null) {
                return null;
            }
            if (!list.isEmpty()) {
                ThreadLocal threadLocal2 = p0t0.f26169a;
                Paint paint = (Paint) threadLocal2.get();
                if (paint == null) {
                    paint = new Paint();
                    threadLocal2.set(paint);
                }
                paint.setFontVariationSettings(null);
                paint.setTypeface(typefaceA);
                a7k a7kVarE = q8a.e(context);
                int i2 = (i < 31 || context.getResources().getConfiguration().fontWeightAdjustment == Integer.MAX_VALUE) ? 0 : context.getResources().getConfiguration().fontWeightAdjustment;
                if (i2 == 0) {
                    strA = qf00.a(list, null, new er90(a7kVarE), 31);
                } else {
                    if (list.size() > 0) {
                        list.get(0).getClass();
                        hny.b();
                        return null;
                    }
                    strA = ((Object) (!list.isEmpty() ? Separators.COMMA : "")) + "'wght' " + l1e0.c(i2 + 400.0f, 1.0f, 1000.0f);
                }
                paint.setFontVariationSettings(strA);
                return paint.getTypeface();
            }
        }
        return typefaceA;
    }

    public zbf c() throws PackageManager.NameNotFoundException {
        String string;
        Context context = this.f13886a;
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 132);
        ArrayList arrayList = new ArrayList();
        ServiceInfo[] serviceInfoArr = packageInfo.services;
        if (serviceInfoArr != null) {
            for (ServiceInfo serviceInfo : serviceInfoArr) {
                Bundle bundle = serviceInfo.metaData;
                if (bundle != null && (string = bundle.getString("androidx.credentials.CREDENTIAL_PROVIDER_KEY")) != null) {
                    arrayList.add(string);
                }
            }
        }
        List listL0 = CollectionsKt.L0(arrayList);
        if (listL0.isEmpty()) {
            return null;
        }
        Iterator it = listL0.iterator();
        zbf zbfVar = null;
        while (it.hasNext()) {
            try {
                Object objNewInstance = Class.forName((String) it.next()).getConstructor(Context.class).newInstance(context);
                objNewInstance.getClass();
                zbf zbfVar2 = (zbf) objNewInstance;
                if (!zbfVar2.isAvailableOnDevice()) {
                    continue;
                } else {
                    if (zbfVar != null) {
                        Log.i("CredProviderFactory", "Only one active OEM CredentialProvider allowed");
                        return null;
                    }
                    zbfVar = zbfVar2;
                }
            } catch (Throwable unused) {
            }
        }
        return zbfVar;
    }
}

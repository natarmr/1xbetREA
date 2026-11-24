package a;

import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.javax.sip.message.Response;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.os.Trace;
import android.util.Log;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class vrq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final dj10 f37913a = new dj10(2);
    public static final l13 b = new l13((byte) 14);

    public static rsq a(Context context, List list) {
        String str;
        Typeface typefaceC;
        Trace.beginSection("FontProvider.getFontFamilyResult");
        try {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                xrq xrqVar = (xrq) list.get(i);
                if (Build.VERSION.SDK_INT < 31 || (typefaceC = m0t0.c((str = xrqVar.e))) == null || m0t0.d(typefaceC) == null) {
                    ProviderInfo providerInfoB = b(context.getPackageManager(), xrqVar, context.getResources());
                    if (providerInfoB == null) {
                        return new rsq();
                    }
                    arrayList.add(c(context, xrqVar, providerInfoB.authority));
                } else {
                    arrayList.add(new ssq[]{new ssq(str, xrqVar.f)});
                }
            }
            return new rsq(arrayList);
        } finally {
            Trace.endSection();
        }
    }

    public static ProviderInfo b(PackageManager packageManager, xrq xrqVar, Resources resources) {
        l13 l13Var = b;
        dj10 dj10Var = f37913a;
        Trace.beginSection("FontProvider.getProvider");
        try {
            List listL = xrqVar.d;
            String str = xrqVar.f41381a;
            String str2 = xrqVar.b;
            if (listL == null) {
                listL = u1c.L(resources, 0);
            }
            urq urqVar = new urq();
            urqVar.f36176a = str;
            urqVar.b = str2;
            urqVar.c = listL;
            ProviderInfo providerInfo = (ProviderInfo) dj10Var.c(urqVar);
            if (providerInfo != null) {
                Trace.endSection();
                return providerInfo;
            }
            ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(str, 0);
            if (providerInfoResolveContentProvider == null) {
                throw new PackageManager.NameNotFoundException("No package found for authority: " + str);
            }
            if (!providerInfoResolveContentProvider.packageName.equals(str2)) {
                throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + str2);
            }
            Signature[] signatureArr = packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures;
            ArrayList arrayList = new ArrayList();
            for (Signature signature : signatureArr) {
                arrayList.add(signature.toByteArray());
            }
            Collections.sort(arrayList, l13Var);
            for (int i = 0; i < listL.size(); i++) {
                ArrayList arrayList2 = new ArrayList((Collection) listL.get(i));
                Collections.sort(arrayList2, l13Var);
                if (arrayList.size() == arrayList2.size()) {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= arrayList.size()) {
                            dj10Var.d(urqVar, providerInfoResolveContentProvider);
                            Trace.endSection();
                            return providerInfoResolveContentProvider;
                        }
                        if (!Arrays.equals((byte[]) arrayList.get(i2), (byte[]) arrayList2.get(i2))) {
                            break;
                        }
                        i2++;
                    }
                }
            }
            Trace.endSection();
            return null;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public static ssq[] c(Context context, xrq xrqVar, String str) {
        String[] strArr;
        Trace.beginSection("FontProvider.query");
        try {
            ArrayList arrayList = new ArrayList();
            Uri uriBuild = new Uri.Builder().scheme(RemoteMessageConst.Notification.CONTENT).authority(str).build();
            Uri uriBuild2 = new Uri.Builder().scheme(RemoteMessageConst.Notification.CONTENT).authority(str).appendPath("file").build();
            ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(uriBuild);
            Cursor cursorQuery = null;
            try {
                String[] strArr2 = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                Trace.beginSection("ContentQueryWrapper.query");
                try {
                    String str2 = xrqVar.f;
                    String str3 = xrqVar.c;
                    if (str2 == null) {
                        strArr = new String[]{str3};
                        break;
                    }
                    int length = str2.length();
                    int iCharCount = 0;
                    while (true) {
                        if (iCharCount >= length) {
                            strArr = new String[]{str3};
                            break;
                        }
                        int iCodePointAt = str2.codePointAt(iCharCount);
                        if (!Character.isWhitespace(iCodePointAt)) {
                            strArr = new String[]{str3, "VF"};
                            break;
                        }
                        iCharCount += Character.charCount(iCodePointAt);
                    }
                    String[] strArr3 = strArr;
                    if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                        try {
                            cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uriBuild, strArr2, "query = ?", strArr3, null, null);
                        } catch (RemoteException e) {
                            Log.w("FontsProvider", "Unable to query the content provider", e);
                        }
                    }
                    Trace.endSection();
                    if (cursorQuery != null && cursorQuery.getCount() > 0) {
                        int columnIndex = cursorQuery.getColumnIndex("result_code");
                        arrayList = new ArrayList();
                        int columnIndex2 = cursorQuery.getColumnIndex("_id");
                        int columnIndex3 = cursorQuery.getColumnIndex("file_id");
                        int columnIndex4 = cursorQuery.getColumnIndex("font_ttc_index");
                        int columnIndex5 = cursorQuery.getColumnIndex("font_weight");
                        int columnIndex6 = cursorQuery.getColumnIndex("font_italic");
                        while (cursorQuery.moveToNext()) {
                            int i = columnIndex != -1 ? cursorQuery.getInt(columnIndex) : 0;
                            arrayList.add(new ssq(columnIndex3 == -1 ? ContentUris.withAppendedId(uriBuild, cursorQuery.getLong(columnIndex2)) : ContentUris.withAppendedId(uriBuild2, cursorQuery.getLong(columnIndex3)), columnIndex4 != -1 ? cursorQuery.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursorQuery.getInt(columnIndex5) : Response.BAD_REQUEST, columnIndex6 != -1 && cursorQuery.getInt(columnIndex6) == 1, xrqVar.f, i));
                        }
                    }
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                        contentProviderClientAcquireUnstableContentProviderClient.close();
                    }
                    ssq[] ssqVarArr = (ssq[]) arrayList.toArray(new ssq[0]);
                    Trace.endSection();
                    return ssqVarArr;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            } catch (Throwable th2) {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                    contentProviderClientAcquireUnstableContentProviderClient.close();
                }
                throw th2;
            }
        } catch (Throwable th3) {
            Trace.endSection();
            throw th3;
        }
    }
}

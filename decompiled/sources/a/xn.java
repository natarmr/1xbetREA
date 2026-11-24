package a;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.ext.SdkExtensions;
import android.provider.MediaStore;
import android.util.Log;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes.dex */
public final class xn extends bsr0 {
    public final /* synthetic */ byte h;

    public /* synthetic */ xn(byte b) {
        this.h = b;
    }

    @Override // a.bsr0
    public final Intent Z(Context context, Object obj) {
        Bundle bundleExtra;
        switch (this.h) {
            case 0:
                String[] strArr = (String[]) obj;
                strArr.getClass();
                Intent type = new Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", strArr).setType("*/*");
                type.getClass();
                return type;
            case 1:
                kn90 kn90Var = (kn90) obj;
                kn90Var.getClass();
                int i = Build.VERSION.SDK_INT;
                if (i >= 33 || (i >= 30 && SdkExtensions.getExtensionVersion(30) >= 2)) {
                    Intent intent = new Intent("android.provider.action.PICK_IMAGES");
                    intent.setType(rsr0.Y(kn90Var.f18574a));
                    int iMin = Math.min(10, kn90Var.b);
                    if (iMin <= 1 || iMin > MediaStore.getPickImagesMaxLimit()) {
                        jf4.o("Max items must be greater than 1 and lesser than or equal to MediaStore.getPickImagesMaxLimit()");
                        return null;
                    }
                    intent.putExtra("android.provider.extra.PICK_IMAGES_MAX", iMin);
                    kn90Var.c.getClass();
                    intent.putExtra("android.provider.extra.PICK_IMAGES_LAUNCH_TAB", 1);
                    intent.putExtra("android.provider.extra.PICK_IMAGES_IN_ORDER", false);
                    return intent;
                }
                if (context.getPackageManager().resolveActivity(new Intent("androidx.activity.result.contract.action.PICK_IMAGES"), 1114112) == null) {
                    Intent intent2 = new Intent("android.intent.action.OPEN_DOCUMENT");
                    intent2.setType(rsr0.Y(kn90Var.f18574a));
                    intent2.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                    if (intent2.getType() != null) {
                        return intent2;
                    }
                    intent2.setType("*/*");
                    intent2.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
                    return intent2;
                }
                ResolveInfo resolveInfoResolveActivity = context.getPackageManager().resolveActivity(new Intent("androidx.activity.result.contract.action.PICK_IMAGES"), 1114112);
                if (resolveInfoResolveActivity == null) {
                    jf4.n("Required value was null.");
                    return null;
                }
                ActivityInfo activityInfo = resolveInfoResolveActivity.activityInfo;
                Intent intent3 = new Intent("androidx.activity.result.contract.action.PICK_IMAGES");
                intent3.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
                intent3.setType(rsr0.Y(kn90Var.f18574a));
                int iMin2 = Math.min(10, kn90Var.b);
                if (iMin2 <= 1) {
                    jf4.o("Max items must be greater than 1");
                    return null;
                }
                intent3.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_MAX", iMin2);
                kn90Var.c.getClass();
                intent3.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_LAUNCH_TAB", 1);
                intent3.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_IN_ORDER", false);
                return intent3;
            case 2:
                String[] strArr2 = (String[]) obj;
                strArr2.getClass();
                Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr2);
                intentPutExtra.getClass();
                return intentPutExtra;
            case 3:
                String str = (String) obj;
                str.getClass();
                Intent intentPutExtra2 = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", new String[]{str});
                intentPutExtra2.getClass();
                return intentPutExtra2;
            case 4:
                Intent intent4 = (Intent) obj;
                intent4.getClass();
                return intent4;
            case 5:
                IntentSenderRequest intentSenderRequest = (IntentSenderRequest) obj;
                intentSenderRequest.getClass();
                Intent intentPutExtra3 = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", intentSenderRequest);
                intentPutExtra3.getClass();
                return intentPutExtra3;
            case 6:
                IntentSenderRequest intentSenderRequest2 = (IntentSenderRequest) obj;
                Intent intent5 = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
                Intent intent6 = intentSenderRequest2.b;
                if (intent6 != null && (bundleExtra = intent6.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                    intent5.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                    intent6.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    if (intent6.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        IntentSender intentSender = intentSenderRequest2.f45281a;
                        intentSender.getClass();
                        intentSenderRequest2 = new IntentSenderRequest(intentSender, null, intentSenderRequest2.c, intentSenderRequest2.d);
                    }
                }
                intent5.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", intentSenderRequest2);
                if (androidx.fragment.app.e.V(2)) {
                    Log.v("FragmentManager", "CreateIntent created the following intent: " + intent5);
                }
                return intent5;
            default:
                ((Unit) obj).getClass();
                if (Build.VERSION.SDK_INT >= 26) {
                    Intent intentPutExtra4 = new Intent("android.settings.APP_NOTIFICATION_SETTINGS").putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
                    intentPutExtra4.getClass();
                    return intentPutExtra4;
                }
                Intent intentJ = hne.j("android.settings.APP_NOTIFICATION_SETTINGS");
                intentJ.putExtra("app_package", context.getPackageName());
                intentJ.putExtra("app_uid", context.getApplicationInfo().uid);
                return intentJ;
        }
    }

    @Override // a.bsr0
    public r7v b0(Context context, Object obj) {
        switch (this.h) {
            case 0:
                ((String[]) obj).getClass();
                return null;
            case 1:
                ((kn90) obj).getClass();
                return null;
            case 2:
                String[] strArr = (String[]) obj;
                strArr.getClass();
                if (strArr.length == 0) {
                    lun lunVar = lun.f20680a;
                    lunVar.getClass();
                    return new r7v(lunVar);
                }
                for (String str : strArr) {
                    if (jiq0.j0(context, str) != 0) {
                        return null;
                    }
                }
                int iA = wp20.a(strArr.length);
                if (iA < 16) {
                    iA = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
                for (String str2 : strArr) {
                    linkedHashMap.put(str2, Boolean.TRUE);
                }
                return new r7v(linkedHashMap);
            case 3:
                String str3 = (String) obj;
                str3.getClass();
                if (jiq0.j0(context, str3) == 0) {
                    return new r7v(Boolean.TRUE);
                }
                return null;
            default:
                return super.b0(context, obj);
        }
    }

    @Override // a.bsr0
    public final Object i0(int i, Intent intent) {
        Object arrayList;
        z = false;
        boolean z = false;
        switch (this.h) {
            case 0:
                if (i != -1) {
                    intent = null;
                }
                if (intent != null) {
                    return intent.getData();
                }
                return null;
            case 1:
                if (i != -1) {
                    intent = null;
                }
                if (intent != null) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    Uri data = intent.getData();
                    if (data != null) {
                        linkedHashSet.add(data);
                    }
                    ClipData clipData = intent.getClipData();
                    if (clipData == null && linkedHashSet.isEmpty()) {
                        arrayList = iun.f15405a;
                    } else {
                        if (clipData != null) {
                            int itemCount = clipData.getItemCount();
                            for (int i2 = 0; i2 < itemCount; i2++) {
                                Uri uri = clipData.getItemAt(i2).getUri();
                                if (uri != null) {
                                    linkedHashSet.add(uri);
                                }
                            }
                        }
                        arrayList = new ArrayList(linkedHashSet);
                    }
                    if (arrayList != null) {
                        return arrayList;
                    }
                }
                return iun.f15405a;
            case 2:
                if (i != -1) {
                    lun lunVar = lun.f20680a;
                    lunVar.getClass();
                    return lunVar;
                }
                if (intent == null) {
                    lun lunVar2 = lun.f20680a;
                    lunVar2.getClass();
                    return lunVar2;
                }
                String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                if (intArrayExtra == null || stringArrayExtra == null) {
                    lun lunVar3 = lun.f20680a;
                    lunVar3.getClass();
                    return lunVar3;
                }
                ArrayList arrayList2 = new ArrayList(intArrayExtra.length);
                for (int i3 : intArrayExtra) {
                    arrayList2.add(Boolean.valueOf(i3 == 0));
                }
                return xp20.m(CollectionsKt.T0(tx3.z(stringArrayExtra), arrayList2));
            case 3:
                if (intent == null || i != -1) {
                    return Boolean.FALSE;
                }
                int[] intArrayExtra2 = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                if (intArrayExtra2 != null) {
                    for (int i4 : intArrayExtra2) {
                        if (i4 == 0) {
                            z = true;
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 4:
                return new ActivityResult(i, intent);
            case 5:
                return new ActivityResult(i, intent);
            case 6:
                return new ActivityResult(i, intent);
            default:
                return Unit.f46060a;
        }
    }
}

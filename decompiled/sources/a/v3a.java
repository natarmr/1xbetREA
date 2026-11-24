package a;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes3.dex */
public abstract class v3a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f36724a = q3d.j(".pdf", ".jpg", ".png");

    public static final boolean a(String str, ArrayList arrayList) {
        ArrayList arrayListQ0 = CollectionsKt.q0(arrayList, f36724a);
        if (!arrayListQ0.isEmpty()) {
            Iterator it = arrayListQ0.iterator();
            while (it.hasNext()) {
                if (kotlin.text.c.n(str, (String) it.next(), false)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean b(Intent intent, ArrayList arrayList, Context context) {
        intent.getClass();
        Uri data = intent.getData();
        String string = null;
        String scheme = data != null ? data.getScheme() : null;
        if (scheme != null) {
            int iHashCode = scheme.hashCode();
            if (iHashCode != 3143036) {
                if (iHashCode == 951530617 && scheme.equals(RemoteMessageConst.Notification.CONTENT)) {
                    String string2 = data.toString();
                    string2.getClass();
                    Locale locale = Locale.ROOT;
                    String lowerCase = string2.toLowerCase(locale);
                    lowerCase.getClass();
                    if (a(lowerCase, arrayList)) {
                        return true;
                    }
                    try {
                        Cursor cursorQuery = context.getContentResolver().query(data, null, null, null, null);
                        if (cursorQuery != null) {
                            try {
                                int columnIndex = cursorQuery.getColumnIndex("_display_name");
                                String str = "";
                                if (cursorQuery.moveToFirst()) {
                                    if (!cursorQuery.isNull(columnIndex)) {
                                        string = cursorQuery.getString(columnIndex);
                                    }
                                    if (string != null) {
                                        str = string;
                                    }
                                }
                                if (str.length() == 0) {
                                    cursorQuery.close();
                                    return false;
                                }
                                String lowerCase2 = str.toLowerCase(locale);
                                lowerCase2.getClass();
                                boolean zA = a(lowerCase2, arrayList);
                                cursorQuery.close();
                                return zA;
                            } catch (Throwable th) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    bkb.E(cursorQuery, th);
                                    throw th2;
                                }
                            }
                            e.printStackTrace();
                            return false;
                        }
                    } catch (SecurityException e) {
                        e.printStackTrace();
                        return false;
                    }
                }
            } else if (scheme.equals("file")) {
                File fileU = yqm0.u(data);
                String absolutePath = fileU.getAbsolutePath();
                absolutePath.getClass();
                String lowerCase3 = absolutePath.toLowerCase(Locale.ROOT);
                lowerCase3.getClass();
                if (fileU.exists() && fileU.canRead() && a(lowerCase3, arrayList)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final Intent c(Uri uri) {
        uri.getClass();
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        intent.putExtra("output", uri);
        intent.putExtra("com.google.assistant.extra.USE_FRONT_CAMERA", false);
        intent.putExtra("android.intent.extra.USE_FRONT_CAMERA", false);
        intent.putExtra("android.intent.extras.LENS_FACING_FRONT", 0);
        intent.putExtra("android.intent.extras.CAMERA_FACING", 0);
        intent.putExtra("camerafacing", "back");
        intent.putExtra("previous_mode", "Default");
        intent.putExtra("default_camera", "0");
        return intent;
    }
}

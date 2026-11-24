package a;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.gov.nist.core.Separators;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.Environment;
import androidx.activity.result.ActivityResult;
import androidx.core.content.FileProvider;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.huawei.hms.framework.common.BundleUtil;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class qm90 implements qvj {
    public static int h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yfd f28972a;
    public final zri b;
    public Function2 c;
    public Function2 d;
    public go e;
    public go f;
    public pm90 g;

    public qm90(yfd yfdVar, zri zriVar) {
        yfdVar.getClass();
        this.f28972a = yfdVar;
        this.b = zriVar;
        this.c = new ch90((byte) 25);
        this.d = new ch90((byte) 26);
        int i = h;
        h = i + 1;
        String strM = twn.m(i, "PHOTO_FILE_REQUEST_KEY");
        int i2 = h;
        h = i2 + 1;
        this.g = new pm90("", strM, twn.m(i2, "INTENT_REQUEST_KEY"));
    }

    public static boolean a(String str) {
        return kotlin.text.c.n(str, ".pdf", false) || kotlin.text.c.n(str, ".jpg", false) || kotlin.text.c.n(str, ".png", false) || kotlin.text.c.n(str, ".jpeg", false) || kotlin.text.c.n(str, ".webp", false) || kotlin.text.c.n(str, ".heic", false);
    }

    public static boolean b(Context context, Intent intent) throws IOException {
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
                    if (a(lowerCase)) {
                        return true;
                    }
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
                            boolean zA = a(lowerCase2);
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
                    }
                }
            } else if (scheme.equals("file")) {
                File fileU = yqm0.u(data);
                String absolutePath = fileU.getAbsolutePath();
                absolutePath.getClass();
                String lowerCase3 = absolutePath.toLowerCase(Locale.ROOT);
                lowerCase3.getClass();
                if (fileU.exists() && fileU.canRead() && a(lowerCase3)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0109  */
    public final void c() {
        Object g0g0Var;
        Object g0g0Var2;
        Intent intentC;
        Object g0g0Var3;
        zri zriVar = this.b;
        us00 us00Var = (us00) zriVar.c;
        try {
            e0g0 e0g0Var = j0g0.b;
            String str = (String) CollectionsKt.firstOrNull(StringsKt__StringsKt.split$default("image/jpg", new String[]{Separators.SLASH}, false, 0, 6, null));
            String str2 = "unknown";
            if (str == null) {
                str = "unknown";
            }
            String str3 = (String) CollectionsKt.f0(StringsKt__StringsKt.split$default("image/jpg", new String[]{Separators.SLASH}, false, 0, 6, null));
            if (str3 != null) {
                str2 = str3;
            }
            File file = new File(us00Var.getExternalFilesDir(Environment.DIRECTORY_DOCUMENTS), "files");
            file.mkdirs();
            String str4 = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault()).format(new Date());
            str4.getClass();
            File file2 = new File(file, (str + BundleUtil.UNDERLINE_TAG + str4 + BundleUtil.UNDERLINE_TAG) + Separators.DOT + str2);
            if (file2.exists()) {
                file2.delete();
            }
            file2.createNewFile();
            g0g0Var = file2;
        } catch (Throwable th) {
            e0g0 e0g0Var2 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        boolean z = g0g0Var instanceof g0g0;
        Object obj = g0g0Var;
        if (z) {
            obj = null;
        }
        File file3 = (File) obj;
        if (file3 != null) {
            try {
                ((us3) zriVar.b).getClass();
                try {
                    g0g0Var3 = new URI(FileProvider.c(us00Var, file3, "org.xbet.client1.provider").toString());
                } catch (Throwable th2) {
                    e0g0 e0g0Var3 = j0g0.b;
                    g0g0Var3 = new g0g0(th2);
                }
                if (g0g0Var3 instanceof g0g0) {
                    g0g0Var3 = null;
                }
                g0g0Var2 = Uri.parse(String.valueOf((URI) g0g0Var3));
            } catch (Throwable th3) {
                e0g0 e0g0Var4 = j0g0.b;
                g0g0Var2 = new g0g0(th3);
            }
            Uri uri = (Uri) (g0g0Var2 instanceof g0g0 ? null : g0g0Var2);
            if (uri == null) {
                intentC = new Intent();
            } else {
                pm90 pm90Var = this.g;
                String absolutePath = file3.getAbsolutePath();
                absolutePath.getClass();
                this.g = new pm90(absolutePath, pm90Var.b, pm90Var.c);
                intentC = v3a.c(uri);
            }
        } else {
            intentC = new Intent();
        }
        Intent intent = new Intent("android.intent.action.PICK");
        intent.setType("image/*");
        intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", false);
        Intent intent2 = new Intent("android.intent.action.GET_CONTENT");
        intent2.addCategory("android.intent.category.OPENABLE");
        intent2.putExtra("android.intent.extra.TITLE", "File Chooser");
        intent2.putExtra("android.intent.extra.MIME_TYPES", new String[]{"application/pdf", "image/jpeg", "image/png", "image/webp", "image/jpg", "image/heic"});
        intent2.setType("*/*");
        Intent[] intentArr = intentC.getAction() != null ? new Intent[]{intentC, intent2} : new Intent[]{intent2};
        Intent intent3 = new Intent("android.intent.action.CHOOSER");
        intent3.putExtra("android.intent.extra.INTENT", intent);
        intent3.putExtra("android.intent.extra.INITIAL_INTENTS", intentArr);
        intent3.putExtra("android.intent.extra.TITLE", "File Chooser");
        try {
            go goVar = this.f;
            if (goVar != null) {
                goVar.a(intent3);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // a.qvj
    public final void onCreate(clz clzVar) {
        String str = this.g.b;
        byte b = 4;
        xn xnVar = new xn(b);
        final byte b2 = 0;
        wn wnVar = new wn(this) { // from class: a.om90
            public final /* synthetic */ qm90 b;

            {
                this.b = this;
            }

            @Override // a.wn
            public final void a(Object obj) {
                File file;
                int i;
                Uri data;
                byte b3 = b2;
                qm90 qm90Var = this.b;
                ActivityResult activityResult = (ActivityResult) obj;
                switch (b3) {
                    case 0:
                        activityResult.getClass();
                        File file2 = new File(qm90Var.g.f27220a);
                        file = file2.exists() ? file2 : null;
                        if (file != null) {
                            try {
                                String path = file.getPath();
                                path.getClass();
                                try {
                                    int iD = new sko(path).d(1, "Orientation");
                                    if (iD == 3) {
                                        i = 180;
                                    } else if (iD != 6) {
                                        i = iD != 8 ? 1 : SubsamplingScaleImageView.ORIENTATION_270;
                                    } else {
                                        i = 90;
                                    }
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                                if (i != 1) {
                                    Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(file.getPath());
                                    if (bitmapDecodeFile == null) {
                                        throw new IllegalStateException("Bitmap could not be decoded");
                                    }
                                    Matrix matrix = new Matrix();
                                    matrix.postRotate(i);
                                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeFile, 0, 0, bitmapDecodeFile.getWidth(), bitmapDecodeFile.getHeight(), matrix, true);
                                    bitmapCreateBitmap.getClass();
                                    Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateBitmap, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), true);
                                    bitmapCreateScaledBitmap.getClass();
                                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                                    bitmapCreateScaledBitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                                    fileOutputStream.flush();
                                    fileOutputStream.close();
                                }
                            } catch (Exception e2) {
                                e2.printStackTrace();
                            }
                            qm90Var.c.invoke(Integer.valueOf(activityResult.f45280a), file);
                            return;
                        }
                        return;
                    default:
                        activityResult.getClass();
                        Intent intent = activityResult.b;
                        int i2 = activityResult.f45280a;
                        if ((intent != null ? intent.getClipData() : null) == null) {
                            String string = (intent == null || (data = intent.getData()) == null) ? null : data.toString();
                            if (string == null || string.length() == 0) {
                                File file3 = new File(qm90Var.g.f27220a);
                                file = file3.exists() ? file3 : null;
                                if (file != null) {
                                    qm90Var.c.invoke(Integer.valueOf(i2), file);
                                    return;
                                }
                                return;
                            }
                        }
                        if (intent != null) {
                            qm90Var.d.invoke(Integer.valueOf(i2), intent);
                            return;
                        }
                        return;
                }
            }
        };
        yfd yfdVar = this.f28972a;
        this.e = yfdVar.c(str, clzVar, xnVar, wnVar);
        final byte b3 = 1;
        this.f = yfdVar.c(this.g.c, clzVar, new xn(b), new wn(this) { // from class: a.om90
            public final /* synthetic */ qm90 b;

            {
                this.b = this;
            }

            @Override // a.wn
            public final void a(Object obj) {
                File file;
                int i;
                Uri data;
                byte b4 = b3;
                qm90 qm90Var = this.b;
                ActivityResult activityResult = (ActivityResult) obj;
                switch (b4) {
                    case 0:
                        activityResult.getClass();
                        File file2 = new File(qm90Var.g.f27220a);
                        file = file2.exists() ? file2 : null;
                        if (file != null) {
                            try {
                                String path = file.getPath();
                                path.getClass();
                                try {
                                    int iD = new sko(path).d(1, "Orientation");
                                    if (iD == 3) {
                                        i = 180;
                                    } else if (iD != 6) {
                                        i = iD != 8 ? 1 : SubsamplingScaleImageView.ORIENTATION_270;
                                    } else {
                                        i = 90;
                                    }
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                                if (i != 1) {
                                    Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(file.getPath());
                                    if (bitmapDecodeFile == null) {
                                        throw new IllegalStateException("Bitmap could not be decoded");
                                    }
                                    Matrix matrix = new Matrix();
                                    matrix.postRotate(i);
                                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeFile, 0, 0, bitmapDecodeFile.getWidth(), bitmapDecodeFile.getHeight(), matrix, true);
                                    bitmapCreateBitmap.getClass();
                                    Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateBitmap, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), true);
                                    bitmapCreateScaledBitmap.getClass();
                                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                                    bitmapCreateScaledBitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                                    fileOutputStream.flush();
                                    fileOutputStream.close();
                                }
                            } catch (Exception e2) {
                                e2.printStackTrace();
                            }
                            qm90Var.c.invoke(Integer.valueOf(activityResult.f45280a), file);
                            return;
                        }
                        return;
                    default:
                        activityResult.getClass();
                        Intent intent = activityResult.b;
                        int i2 = activityResult.f45280a;
                        if ((intent != null ? intent.getClipData() : null) == null) {
                            String string = (intent == null || (data = intent.getData()) == null) ? null : data.toString();
                            if (string == null || string.length() == 0) {
                                File file3 = new File(qm90Var.g.f27220a);
                                file = file3.exists() ? file3 : null;
                                if (file != null) {
                                    qm90Var.c.invoke(Integer.valueOf(i2), file);
                                    return;
                                }
                                return;
                            }
                        }
                        if (intent != null) {
                            qm90Var.d.invoke(Integer.valueOf(i2), intent);
                            return;
                        }
                        return;
                }
            }
        });
    }

    @Override // a.qvj
    public final void onDestroy(clz clzVar) {
        go goVar = this.e;
        if (goVar != null) {
            goVar.b();
        }
        this.e = null;
        go goVar2 = this.f;
        if (goVar2 != null) {
            goVar2.b();
        }
        this.f = null;
    }

    @Override // a.qvj
    public final void onPause(clz clzVar) {
    }

    @Override // a.qvj
    public final void onResume(clz clzVar) {
    }

    @Override // a.qvj
    public final void onStart(clz clzVar) {
    }

    @Override // a.qvj
    public final void onStop(clz clzVar) {
    }
}

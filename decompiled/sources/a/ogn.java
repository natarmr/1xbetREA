package a;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.gov.nist.core.Separators;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader;
import com.huawei.hms.framework.common.ExceptionCode;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes2.dex */
public final class ogn {
    public static Boolean e = null;
    public static String f = null;
    public static boolean g = false;
    public static int h = -1;
    public static Boolean i;
    public static c6x0 m;
    public static e7x0 n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f25229a;
    public static final ThreadLocal j = new ThreadLocal();
    public static final y50 k = new y50((byte) 18);
    public static final zow0 l = new zow0((byte) 12);
    public static final vow0 b = new vow0(19);
    public static final zow0 c = new zow0((byte) 23);
    public static final tow0 d = new tow0(24);

    public ogn(Context context) {
        this.f25229a = context;
    }

    public static int a(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb = new StringBuilder(str.length() + 61);
            sb.append("com.google.android.gms.dynamite.descriptors.");
            sb.append(str);
            sb.append(".ModuleDescriptor");
            Class<?> clsLoadClass = classLoader.loadClass(sb.toString());
            Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (l8x.Z(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            String strValueOf = String.valueOf(declaredField.get(null));
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 50 + str.length() + 1);
            sb2.append("Module descriptor id '");
            sb2.append(strValueOf);
            sb2.append("' didn't match expected id '");
            sb2.append(str);
            sb2.append(Separators.QUOTE);
            Log.e("DynamiteModule", sb2.toString());
            return 0;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb3 = new StringBuilder(str.length() + 45);
            sb3.append("Local module descriptor class for ");
            sb3.append(str);
            sb3.append(" not found.");
            Log.w("DynamiteModule", sb3.toString());
            return 0;
        } catch (Exception e2) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e2.getMessage())));
            return 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x023a A[Catch: all -> 0x0223, lgn -> 0x0226, RemoteException -> 0x0229, TryCatch #12 {lgn -> 0x0226, RemoteException -> 0x0229, all -> 0x0223, blocks: (B:90:0x0214, B:103:0x025b, B:105:0x0261, B:106:0x026a, B:107:0x0271, B:97:0x022c, B:98:0x0235, B:101:0x023a, B:102:0x024b, B:108:0x0272, B:109:0x027b, B:110:0x027c, B:111:0x0285, B:119:0x0296), top: B:166:0x00f1 }] */
    /* JADX WARN: Code duplicated, block: B:102:0x024b A[Catch: all -> 0x0223, lgn -> 0x0226, RemoteException -> 0x0229, TryCatch #12 {lgn -> 0x0226, RemoteException -> 0x0229, all -> 0x0223, blocks: (B:90:0x0214, B:103:0x025b, B:105:0x0261, B:106:0x026a, B:107:0x0271, B:97:0x022c, B:98:0x0235, B:101:0x023a, B:102:0x024b, B:108:0x0272, B:109:0x027b, B:110:0x027c, B:111:0x0285, B:119:0x0296), top: B:166:0x00f1 }] */
    /* JADX WARN: Code duplicated, block: B:105:0x0261 A[Catch: all -> 0x0223, lgn -> 0x0226, RemoteException -> 0x0229, TryCatch #12 {lgn -> 0x0226, RemoteException -> 0x0229, all -> 0x0223, blocks: (B:90:0x0214, B:103:0x025b, B:105:0x0261, B:106:0x026a, B:107:0x0271, B:97:0x022c, B:98:0x0235, B:101:0x023a, B:102:0x024b, B:108:0x0272, B:109:0x027b, B:110:0x027c, B:111:0x0285, B:119:0x0296), top: B:166:0x00f1 }] */
    /* JADX WARN: Code duplicated, block: B:106:0x026a A[Catch: all -> 0x0223, lgn -> 0x0226, RemoteException -> 0x0229, TryCatch #12 {lgn -> 0x0226, RemoteException -> 0x0229, all -> 0x0223, blocks: (B:90:0x0214, B:103:0x025b, B:105:0x0261, B:106:0x026a, B:107:0x0271, B:97:0x022c, B:98:0x0235, B:101:0x023a, B:102:0x024b, B:108:0x0272, B:109:0x027b, B:110:0x027c, B:111:0x0285, B:119:0x0296), top: B:166:0x00f1 }] */
    /* JADX WARN: Code duplicated, block: B:108:0x0272 A[Catch: all -> 0x0223, lgn -> 0x0226, RemoteException -> 0x0229, TryCatch #12 {lgn -> 0x0226, RemoteException -> 0x0229, all -> 0x0223, blocks: (B:90:0x0214, B:103:0x025b, B:105:0x0261, B:106:0x026a, B:107:0x0271, B:97:0x022c, B:98:0x0235, B:101:0x023a, B:102:0x024b, B:108:0x0272, B:109:0x027b, B:110:0x027c, B:111:0x0285, B:119:0x0296), top: B:166:0x00f1 }] */
    /* JADX WARN: Code duplicated, block: B:110:0x027c A[Catch: all -> 0x0223, lgn -> 0x0226, RemoteException -> 0x0229, TryCatch #12 {lgn -> 0x0226, RemoteException -> 0x0229, all -> 0x0223, blocks: (B:90:0x0214, B:103:0x025b, B:105:0x0261, B:106:0x026a, B:107:0x0271, B:97:0x022c, B:98:0x0235, B:101:0x023a, B:102:0x024b, B:108:0x0272, B:109:0x027b, B:110:0x027c, B:111:0x0285, B:119:0x0296), top: B:166:0x00f1 }] */
    /* JADX WARN: Code duplicated, block: B:114:0x028a  */
    /* JADX WARN: Code duplicated, block: B:136:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:137:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:140:0x0308  */
    /* JADX WARN: Code duplicated, block: B:145:0x0319 A[Catch: all -> 0x00b8, TryCatch #9 {all -> 0x00b8, blocks: (B:5:0x0042, B:9:0x00b1, B:16:0x00bd, B:19:0x00c3, B:32:0x00ed, B:120:0x0297, B:121:0x029e, B:129:0x02ad, B:131:0x02d5, B:133:0x02e5, B:143:0x0311, B:144:0x0318, B:124:0x02a1, B:125:0x02a2, B:126:0x02a9, B:145:0x0319, B:146:0x0339, B:147:0x033a, B:148:0x0387), top: B:167:0x0042 }] */
    /* JADX WARN: Code duplicated, block: B:160:0x00f2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:168:0x0133 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:19:0x00c3 A[Catch: all -> 0x00b8, TRY_LEAVE, TryCatch #9 {all -> 0x00b8, blocks: (B:5:0x0042, B:9:0x00b1, B:16:0x00bd, B:19:0x00c3, B:32:0x00ed, B:120:0x0297, B:121:0x029e, B:129:0x02ad, B:131:0x02d5, B:133:0x02e5, B:143:0x0311, B:144:0x0318, B:124:0x02a1, B:125:0x02a2, B:126:0x02a9, B:145:0x0319, B:146:0x0339, B:147:0x033a, B:148:0x0387), top: B:167:0x0042 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:23:0x00db  */
    /* JADX WARN: Code duplicated, block: B:26:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:29:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:37:0x00f8 A[Catch: all -> 0x0286, TryCatch #2 {all -> 0x0286, blocks: (B:35:0x00f2, B:37:0x00f8, B:38:0x00fa), top: B:160:0x00f2 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00fd A[Catch: all -> 0x0171, lgn -> 0x0176, RemoteException -> 0x017b, TRY_ENTER, TryCatch #10 {lgn -> 0x0176, RemoteException -> 0x017b, all -> 0x0171, blocks: (B:34:0x00f1, B:40:0x00fd, B:42:0x0104, B:43:0x0132, B:47:0x0138, B:49:0x0140, B:51:0x0144, B:52:0x0150, B:59:0x015b, B:67:0x0195, B:69:0x019d, B:70:0x01a4, B:71:0x01ab, B:66:0x0180, B:74:0x01ae, B:75:0x01af, B:76:0x01b6, B:77:0x01b7, B:78:0x01be, B:81:0x01c1, B:82:0x01c2, B:84:0x01f5, B:86:0x0208, B:88:0x0210), top: B:166:0x00f1 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x0104 A[Catch: all -> 0x0171, lgn -> 0x0176, RemoteException -> 0x017b, TryCatch #10 {lgn -> 0x0176, RemoteException -> 0x017b, all -> 0x0171, blocks: (B:34:0x00f1, B:40:0x00fd, B:42:0x0104, B:43:0x0132, B:47:0x0138, B:49:0x0140, B:51:0x0144, B:52:0x0150, B:59:0x015b, B:67:0x0195, B:69:0x019d, B:70:0x01a4, B:71:0x01ab, B:66:0x0180, B:74:0x01ae, B:75:0x01af, B:76:0x01b6, B:77:0x01b7, B:78:0x01be, B:81:0x01c1, B:82:0x01c2, B:84:0x01f5, B:86:0x0208, B:88:0x0210), top: B:166:0x00f1 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0138 A[Catch: all -> 0x0171, lgn -> 0x0176, RemoteException -> 0x017b, TRY_ENTER, TryCatch #10 {lgn -> 0x0176, RemoteException -> 0x017b, all -> 0x0171, blocks: (B:34:0x00f1, B:40:0x00fd, B:42:0x0104, B:43:0x0132, B:47:0x0138, B:49:0x0140, B:51:0x0144, B:52:0x0150, B:59:0x015b, B:67:0x0195, B:69:0x019d, B:70:0x01a4, B:71:0x01ab, B:66:0x0180, B:74:0x01ae, B:75:0x01af, B:76:0x01b6, B:77:0x01b7, B:78:0x01be, B:81:0x01c1, B:82:0x01c2, B:84:0x01f5, B:86:0x0208, B:88:0x0210), top: B:166:0x00f1 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x01b7 A[Catch: all -> 0x0171, lgn -> 0x0176, RemoteException -> 0x017b, TryCatch #10 {lgn -> 0x0176, RemoteException -> 0x017b, all -> 0x0171, blocks: (B:34:0x00f1, B:40:0x00fd, B:42:0x0104, B:43:0x0132, B:47:0x0138, B:49:0x0140, B:51:0x0144, B:52:0x0150, B:59:0x015b, B:67:0x0195, B:69:0x019d, B:70:0x01a4, B:71:0x01ab, B:66:0x0180, B:74:0x01ae, B:75:0x01af, B:76:0x01b6, B:77:0x01b7, B:78:0x01be, B:81:0x01c1, B:82:0x01c2, B:84:0x01f5, B:86:0x0208, B:88:0x0210), top: B:166:0x00f1 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x01c2 A[Catch: all -> 0x0171, lgn -> 0x0176, RemoteException -> 0x017b, TryCatch #10 {lgn -> 0x0176, RemoteException -> 0x017b, all -> 0x0171, blocks: (B:34:0x00f1, B:40:0x00fd, B:42:0x0104, B:43:0x0132, B:47:0x0138, B:49:0x0140, B:51:0x0144, B:52:0x0150, B:59:0x015b, B:67:0x0195, B:69:0x019d, B:70:0x01a4, B:71:0x01ab, B:66:0x0180, B:74:0x01ae, B:75:0x01af, B:76:0x01b6, B:77:0x01b7, B:78:0x01be, B:81:0x01c1, B:82:0x01c2, B:84:0x01f5, B:86:0x0208, B:88:0x0210), top: B:166:0x00f1 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x01f5 A[Catch: all -> 0x0171, lgn -> 0x0176, RemoteException -> 0x017b, TryCatch #10 {lgn -> 0x0176, RemoteException -> 0x017b, all -> 0x0171, blocks: (B:34:0x00f1, B:40:0x00fd, B:42:0x0104, B:43:0x0132, B:47:0x0138, B:49:0x0140, B:51:0x0144, B:52:0x0150, B:59:0x015b, B:67:0x0195, B:69:0x019d, B:70:0x01a4, B:71:0x01ab, B:66:0x0180, B:74:0x01ae, B:75:0x01af, B:76:0x01b6, B:77:0x01b7, B:78:0x01be, B:81:0x01c1, B:82:0x01c2, B:84:0x01f5, B:86:0x0208, B:88:0x0210), top: B:166:0x00f1 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x0208 A[Catch: all -> 0x0171, lgn -> 0x0176, RemoteException -> 0x017b, TryCatch #10 {lgn -> 0x0176, RemoteException -> 0x017b, all -> 0x0171, blocks: (B:34:0x00f1, B:40:0x00fd, B:42:0x0104, B:43:0x0132, B:47:0x0138, B:49:0x0140, B:51:0x0144, B:52:0x0150, B:59:0x015b, B:67:0x0195, B:69:0x019d, B:70:0x01a4, B:71:0x01ab, B:66:0x0180, B:74:0x01ae, B:75:0x01af, B:76:0x01b6, B:77:0x01b7, B:78:0x01be, B:81:0x01c1, B:82:0x01c2, B:84:0x01f5, B:86:0x0208, B:88:0x0210), top: B:166:0x00f1 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x0210 A[Catch: all -> 0x0171, lgn -> 0x0176, RemoteException -> 0x017b, TRY_LEAVE, TryCatch #10 {lgn -> 0x0176, RemoteException -> 0x017b, all -> 0x0171, blocks: (B:34:0x00f1, B:40:0x00fd, B:42:0x0104, B:43:0x0132, B:47:0x0138, B:49:0x0140, B:51:0x0144, B:52:0x0150, B:59:0x015b, B:67:0x0195, B:69:0x019d, B:70:0x01a4, B:71:0x01ab, B:66:0x0180, B:74:0x01ae, B:75:0x01af, B:76:0x01b6, B:77:0x01b7, B:78:0x01be, B:81:0x01c1, B:82:0x01c2, B:84:0x01f5, B:86:0x0208, B:88:0x0210), top: B:166:0x00f1 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x022c A[Catch: all -> 0x0223, lgn -> 0x0226, RemoteException -> 0x0229, TryCatch #12 {lgn -> 0x0226, RemoteException -> 0x0229, all -> 0x0223, blocks: (B:90:0x0214, B:103:0x025b, B:105:0x0261, B:106:0x026a, B:107:0x0271, B:97:0x022c, B:98:0x0235, B:101:0x023a, B:102:0x024b, B:108:0x0272, B:109:0x027b, B:110:0x027c, B:111:0x0285, B:119:0x0296), top: B:166:0x00f1 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x0236  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r30v0, types: [a.ngn] */
    /* JADX WARN: Type inference failed for: r7v2, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v3 */
    public static ogn c(Context context, ngn ngnVar, String str) throws lgn {
        ?? r7;
        int i2;
        ogn ognVar;
        Cursor cursor;
        int i3;
        Boolean bool;
        c6x0 c6x0VarH;
        int i4;
        gvw gvwVarJ;
        Object objH;
        n3x0 n3x0Var;
        e7x0 e7x0Var;
        n3x0 n3x0Var2;
        boolean z;
        gvw gvwVarJ2;
        Cursor cursor2;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new lgn("null application Context");
        }
        ThreadLocal threadLocal = j;
        n3x0 n3x0Var3 = (n3x0) threadLocal.get();
        n3x0 n3x0Var4 = new n3x0();
        threadLocal.set(n3x0Var4);
        y50 y50Var = k;
        Long l2 = (Long) y50Var.get();
        long jLongValue = l2.longValue();
        try {
            y50Var.set(Long.valueOf(SystemClock.uptimeMillis()));
            j6 j6VarI = ngnVar.i(context, str, l);
            int i5 = j6VarI.f15959a;
            int i6 = j6VarI.b;
            StringBuilder sb = new StringBuilder(str.length() + 26 + String.valueOf(i5).length() + 19 + str.length() + 1 + String.valueOf(i6).length());
            sb.append("Considering local module ");
            sb.append(str);
            sb.append(Separators.COLON);
            sb.append(i5);
            sb.append(" and remote module ");
            sb.append(str);
            sb.append(Separators.COLON);
            sb.append(i6);
            Log.i("DynamiteModule", sb.toString());
            int i7 = j6VarI.c;
            if (i7 != 0) {
                if (i7 != -1) {
                    if (i7 == 1 || j6VarI.b != 0) {
                        if (i7 == -1) {
                            Log.i("DynamiteModule", "Selected local version of ".concat(str));
                            ogn ognVar2 = new ogn(applicationContext);
                            if (jLongValue == 0) {
                                y50Var.remove();
                            } else {
                                y50Var.set(l2);
                            }
                            cursor2 = n3x0Var4.f22871a;
                            if (cursor2 != null) {
                                cursor2.close();
                            }
                            threadLocal.set(n3x0Var3);
                            return ognVar2;
                        }
                        if (i7 == 1) {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(i7).length() + 36);
                            sb2.append("VersionPolicy returned invalid code:");
                            sb2.append(i7);
                            throw new lgn(sb2.toString());
                        }
                        try {
                            try {
                                i3 = j6VarI.b;
                                try {
                                    try {
                                        try {
                                            synchronized (ogn.class) {
                                                try {
                                                    if (e(context)) {
                                                        throw new lgn("Remote loading disabled");
                                                    }
                                                    bool = e;
                                                    if (bool != null) {
                                                        throw new lgn("Failed to determine which loading route to use.");
                                                    }
                                                    if (bool.booleanValue()) {
                                                        StringBuilder sb3 = new StringBuilder(str.length() + 40 + String.valueOf(i3).length());
                                                        sb3.append("Selected remote version of ");
                                                        sb3.append(str);
                                                        sb3.append(", version >= ");
                                                        sb3.append(i3);
                                                        Log.i("DynamiteModule", sb3.toString());
                                                        synchronized (ogn.class) {
                                                            e7x0Var = n;
                                                        }
                                                        if (e7x0Var != null) {
                                                            throw new lgn("DynamiteLoaderV2 was not cached.");
                                                        }
                                                        n3x0Var2 = (n3x0) threadLocal.get();
                                                        if (n3x0Var2 != null || n3x0Var2.f22871a == null) {
                                                            throw new lgn("No result cursor");
                                                        }
                                                        Context applicationContext2 = context.getApplicationContext();
                                                        Cursor cursor3 = n3x0Var2.f22871a;
                                                        new aa60(null);
                                                        synchronized (ogn.class) {
                                                            z = h >= 2;
                                                        }
                                                        if (z) {
                                                            Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                                            gvwVarJ2 = e7x0Var.K(new aa60(applicationContext2), str, i3, new aa60(cursor3));
                                                        } else {
                                                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                                            gvwVarJ2 = e7x0Var.J(new aa60(applicationContext2), str, i3, new aa60(cursor3));
                                                        }
                                                        Context context2 = (Context) aa60.H(gvwVarJ2);
                                                        if (context2 == null) {
                                                            throw new lgn("Failed to get module context");
                                                        }
                                                        ognVar = new ogn(context2);
                                                    } else {
                                                        StringBuilder sb4 = new StringBuilder(str.length() + 40 + String.valueOf(i3).length());
                                                        sb4.append("Selected remote version of ");
                                                        sb4.append(str);
                                                        sb4.append(", version >= ");
                                                        sb4.append(i3);
                                                        Log.i("DynamiteModule", sb4.toString());
                                                        c6x0VarH = h(context);
                                                        if (c6x0VarH != null) {
                                                            throw new lgn("Failed to create IDynamiteLoader.");
                                                        }
                                                        Parcel parcelE = c6x0VarH.E(c6x0VarH.G(), 6);
                                                        i4 = parcelE.readInt();
                                                        parcelE.recycle();
                                                        if (i4 >= 3) {
                                                            n3x0Var = (n3x0) threadLocal.get();
                                                            if (n3x0Var != null) {
                                                                throw new lgn("No cached result cursor holder");
                                                            }
                                                            gvwVarJ = c6x0VarH.M(new aa60(context), str, i3, new aa60(n3x0Var.f22871a));
                                                        } else if (i4 == 2) {
                                                            Log.w("DynamiteModule", "IDynamite loader version = 2");
                                                            gvwVarJ = c6x0VarH.K(new aa60(context), str, i3);
                                                        } else {
                                                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                                            gvwVarJ = c6x0VarH.J(new aa60(context), str, i3);
                                                        }
                                                        objH = aa60.H(gvwVarJ);
                                                        if (objH != null) {
                                                            throw new lgn("Failed to load remote module.");
                                                        }
                                                        ognVar = new ogn((Context) objH);
                                                    }
                                                    if (jLongValue == 0) {
                                                        k.remove();
                                                    } else {
                                                        k.set(l2);
                                                    }
                                                    cursor = n3x0Var4.f22871a;
                                                    if (cursor != null) {
                                                        cursor.close();
                                                    }
                                                    j.set(n3x0Var3);
                                                    return ognVar;
                                                } catch (Throwable th) {
                                                    th = th;
                                                    throw th;
                                                }
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                        }
                                    } catch (lgn e2) {
                                        throw e2;
                                    } catch (RemoteException e3) {
                                        e = e3;
                                        throw new lgn("Failed to load remote module.", e);
                                    } catch (Throwable th3) {
                                        th = th3;
                                        throw new lgn("Failed to load remote module.", th);
                                    }
                                } catch (lgn e4) {
                                    throw e4;
                                } catch (RemoteException e5) {
                                    e = e5;
                                    throw new lgn("Failed to load remote module.", e);
                                } catch (Throwable th4) {
                                    th = th4;
                                    throw new lgn("Failed to load remote module.", th);
                                }
                            } catch (lgn e6) {
                                e = e6;
                                r7 = context;
                                String message = e.getMessage();
                                StringBuilder sb5 = new StringBuilder(String.valueOf(message).length() + 30);
                                sb5.append("Failed to load remote module: ");
                                sb5.append(message);
                                Log.w("DynamiteModule", sb5.toString());
                                i2 = j6VarI.f15959a;
                                if (i2 != 0 || ngnVar.i(r7, str, new x860(i2, false)).c != -1) {
                                    throw new lgn("Remote load failed. No local fallback found.", e);
                                }
                                Log.i("DynamiteModule", "Selected local version of ".concat(str));
                                ognVar = new ogn(applicationContext);
                            }
                        } catch (lgn e7) {
                            e = e7;
                            r7 = y50Var;
                            String message2 = e.getMessage();
                            StringBuilder sb6 = new StringBuilder(String.valueOf(message2).length() + 30);
                            sb6.append("Failed to load remote module: ");
                            sb6.append(message2);
                            Log.w("DynamiteModule", sb6.toString());
                            i2 = j6VarI.f15959a;
                            if (i2 != 0) {
                            }
                            throw new lgn("Remote load failed. No local fallback found.", e);
                        }
                    }
                } else if (j6VarI.f15959a != 0) {
                    i7 = -1;
                    if (i7 == 1) {
                    }
                    if (i7 == -1) {
                        Log.i("DynamiteModule", "Selected local version of ".concat(str));
                        ogn ognVar3 = new ogn(applicationContext);
                        if (jLongValue == 0) {
                            y50Var.remove();
                        } else {
                            y50Var.set(l2);
                        }
                        cursor2 = n3x0Var4.f22871a;
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        threadLocal.set(n3x0Var3);
                        return ognVar3;
                    }
                    if (i7 == 1) {
                        StringBuilder sb7 = new StringBuilder(String.valueOf(i7).length() + 36);
                        sb7.append("VersionPolicy returned invalid code:");
                        sb7.append(i7);
                        throw new lgn(sb7.toString());
                    }
                    i3 = j6VarI.b;
                    synchronized (ogn.class) {
                        if (e(context)) {
                            throw new lgn("Remote loading disabled");
                        }
                        bool = e;
                        if (bool != null) {
                            throw new lgn("Failed to determine which loading route to use.");
                        }
                        if (bool.booleanValue()) {
                            StringBuilder sb8 = new StringBuilder(str.length() + 40 + String.valueOf(i3).length());
                            sb8.append("Selected remote version of ");
                            sb8.append(str);
                            sb8.append(", version >= ");
                            sb8.append(i3);
                            Log.i("DynamiteModule", sb8.toString());
                            synchronized (ogn.class) {
                                e7x0Var = n;
                                if (e7x0Var != null) {
                                    throw new lgn("DynamiteLoaderV2 was not cached.");
                                }
                                n3x0Var2 = (n3x0) threadLocal.get();
                                if (n3x0Var2 != null) {
                                }
                                throw new lgn("No result cursor");
                            }
                        }
                        StringBuilder sb9 = new StringBuilder(str.length() + 40 + String.valueOf(i3).length());
                        sb9.append("Selected remote version of ");
                        sb9.append(str);
                        sb9.append(", version >= ");
                        sb9.append(i3);
                        Log.i("DynamiteModule", sb9.toString());
                        c6x0VarH = h(context);
                        if (c6x0VarH != null) {
                            throw new lgn("Failed to create IDynamiteLoader.");
                        }
                        Parcel parcelE2 = c6x0VarH.E(c6x0VarH.G(), 6);
                        i4 = parcelE2.readInt();
                        parcelE2.recycle();
                        if (i4 >= 3) {
                            n3x0Var = (n3x0) threadLocal.get();
                            if (n3x0Var != null) {
                                throw new lgn("No cached result cursor holder");
                            }
                            gvwVarJ = c6x0VarH.M(new aa60(context), str, i3, new aa60(n3x0Var.f22871a));
                        } else if (i4 == 2) {
                            Log.w("DynamiteModule", "IDynamite loader version = 2");
                            gvwVarJ = c6x0VarH.K(new aa60(context), str, i3);
                        } else {
                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                            gvwVarJ = c6x0VarH.J(new aa60(context), str, i3);
                        }
                        objH = aa60.H(gvwVarJ);
                        if (objH != null) {
                            throw new lgn("Failed to load remote module.");
                        }
                        ognVar = new ogn((Context) objH);
                        if (jLongValue == 0) {
                            k.remove();
                        } else {
                            k.set(l2);
                        }
                        cursor = n3x0Var4.f22871a;
                        if (cursor != null) {
                            cursor.close();
                        }
                        j.set(n3x0Var3);
                        return ognVar;
                    }
                }
            }
            int i8 = j6VarI.f15959a;
            int i9 = j6VarI.b;
            StringBuilder sb10 = new StringBuilder(str.length() + 46 + String.valueOf(i8).length() + 23 + String.valueOf(i9).length() + 1);
            sb10.append("No acceptable module ");
            sb10.append(str);
            sb10.append(" found. Local version is ");
            sb10.append(i8);
            sb10.append(" and remote version is ");
            sb10.append(i9);
            sb10.append(Separators.DOT);
            throw new lgn(sb10.toString());
        } catch (Throwable th5) {
            if (jLongValue == 0) {
                k.remove();
            } else {
                k.set(l2);
            }
            Cursor cursor4 = n3x0Var4.f22871a;
            if (cursor4 != null) {
                cursor4.close();
            }
            j.set(n3x0Var3);
            throw th5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0191  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b4 A[Catch: all -> 0x003b, TryCatch #12 {all -> 0x003b, blocks: (B:10:0x002b, B:12:0x0037, B:52:0x00bd, B:17:0x0040, B:19:0x0047, B:21:0x004d, B:26:0x0054, B:28:0x0058, B:31:0x0061, B:33:0x0069, B:36:0x0070, B:43:0x009c, B:44:0x00a4, B:39:0x0077, B:41:0x007d, B:42:0x008e, B:47:0x00a7, B:50:0x00aa, B:51:0x00b4, B:18:0x0043), top: B:150:0x002b, inners: #2 }] */
    public static int d(Context context, String str, boolean z) {
        Throwable th;
        RemoteException remoteException;
        int i2;
        Cursor cursor;
        try {
            synchronized (ogn.class) {
                Boolean bool = e;
                boolean z2 = true;
                Cursor cursor2 = null;
                if (bool == null) {
                    try {
                        Field declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteModule$DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                        synchronized (declaredField.getDeclaringClass()) {
                            try {
                                ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                                if (classLoader == ClassLoader.getSystemClassLoader()) {
                                    bool = Boolean.FALSE;
                                } else if (classLoader != null) {
                                    try {
                                        g(classLoader);
                                    } catch (lgn unused) {
                                    }
                                    bool = Boolean.TRUE;
                                } else {
                                    if (!e(context)) {
                                        return 0;
                                    }
                                    if (g) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        bool = Boolean.FALSE;
                                    } else {
                                        Boolean bool2 = Boolean.TRUE;
                                        if (bool2.equals(null)) {
                                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                                            bool = Boolean.FALSE;
                                        } else {
                                            try {
                                                int iF = f(z, true, str, context);
                                                String str2 = f;
                                                if (str2 != null && !str2.isEmpty()) {
                                                    ClassLoader classLoaderK0 = hmw0.k0();
                                                    if (classLoaderK0 == null) {
                                                        if (Build.VERSION.SDK_INT >= 29) {
                                                            s55.b();
                                                            String str3 = f;
                                                            s0x.H(str3);
                                                            classLoaderK0 = s55.a(ClassLoader.getSystemClassLoader(), str3);
                                                        } else {
                                                            String str4 = f;
                                                            s0x.H(str4);
                                                            classLoaderK0 = new zpw0(str4, ClassLoader.getSystemClassLoader());
                                                        }
                                                    }
                                                    g(classLoaderK0);
                                                    declaredField.set(null, classLoaderK0);
                                                    e = bool2;
                                                    return iF;
                                                }
                                                return iF;
                                            } catch (lgn unused2) {
                                                declaredField.set(null, ClassLoader.getSystemClassLoader());
                                                bool = Boolean.FALSE;
                                            }
                                        }
                                    }
                                }
                                e = bool;
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e2) {
                        String string = e2.toString();
                        StringBuilder sb = new StringBuilder(string.length() + 30);
                        sb.append("Failed to load module via V2: ");
                        sb.append(string);
                        Log.w("DynamiteModule", sb.toString());
                        bool = Boolean.FALSE;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return f(z, false, str, context);
                    } catch (lgn e3) {
                        String message = e3.getMessage();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 42);
                        sb2.append("Failed to retrieve remote module version: ");
                        sb2.append(message);
                        Log.w("DynamiteModule", sb2.toString());
                        return 0;
                    }
                }
                c6x0 c6x0VarH = h(context);
                try {
                    if (c6x0VarH == null) {
                        return 0;
                    }
                    try {
                        Parcel parcelE = c6x0VarH.E(c6x0VarH.G(), 6);
                        int i3 = parcelE.readInt();
                        parcelE.recycle();
                        if (i3 >= 3) {
                            ThreadLocal threadLocal = j;
                            n3x0 n3x0Var = (n3x0) threadLocal.get();
                            if (n3x0Var != null && (cursor = n3x0Var.f22871a) != null) {
                                return cursor.getInt(0);
                            }
                            Cursor cursor3 = (Cursor) aa60.H(c6x0VarH.L(new aa60(context), str, z, ((Long) k.get()).longValue()));
                            if (cursor3 != null) {
                                try {
                                    if (cursor3.moveToFirst()) {
                                        i2 = cursor3.getInt(0);
                                        if (i2 > 0) {
                                            n3x0 n3x0Var2 = (n3x0) threadLocal.get();
                                            if (n3x0Var2 == null || n3x0Var2.f22871a != null) {
                                                z2 = false;
                                            } else {
                                                n3x0Var2.f22871a = cursor3;
                                            }
                                            cursor2 = z2 ? null : cursor3;
                                        }
                                        if (cursor2 != null) {
                                            cursor2.close();
                                        }
                                    }
                                } catch (RemoteException e4) {
                                    remoteException = e4;
                                    cursor2 = cursor3;
                                    String message2 = remoteException.getMessage();
                                    StringBuilder sb3 = new StringBuilder(String.valueOf(message2).length() + 42);
                                    sb3.append("Failed to retrieve remote module version: ");
                                    sb3.append(message2);
                                    Log.w("DynamiteModule", sb3.toString());
                                    if (cursor2 == null) {
                                        return 0;
                                    }
                                    cursor2.close();
                                    return 0;
                                } catch (Throwable th3) {
                                    th = th3;
                                    cursor2 = cursor3;
                                    if (cursor2 == null) {
                                        throw th;
                                    }
                                    cursor2.close();
                                    throw th;
                                }
                            }
                            Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                            if (cursor3 == null) {
                                return 0;
                            }
                            cursor3.close();
                            return 0;
                        }
                        if (i3 == 2) {
                            Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                            aa60 aa60Var = new aa60(context);
                            Parcel parcelG = c6x0VarH.G();
                            mnw0.b(parcelG, aa60Var);
                            parcelG.writeString(str);
                            parcelG.writeInt(z ? 1 : 0);
                            Parcel parcelE2 = c6x0VarH.E(parcelG, 5);
                            i2 = parcelE2.readInt();
                            parcelE2.recycle();
                        } else {
                            Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                            aa60 aa60Var2 = new aa60(context);
                            Parcel parcelG2 = c6x0VarH.G();
                            mnw0.b(parcelG2, aa60Var2);
                            parcelG2.writeString(str);
                            parcelG2.writeInt(z ? 1 : 0);
                            Parcel parcelE3 = c6x0VarH.E(parcelG2, 3);
                            i2 = parcelE3.readInt();
                            parcelE3.recycle();
                        }
                        return i2;
                    } catch (RemoteException e5) {
                        remoteException = e5;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        } catch (Throwable th5) {
            try {
                s0x.H(context);
                throw th5;
            } catch (Exception e6) {
                Log.e("CrashUtils", "Error adding exception to DropBox!", e6);
                throw th5;
            }
        }
    }

    public static boolean e(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(i)) {
            return true;
        }
        boolean z = false;
        if (i == null) {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", Build.VERSION.SDK_INT >= 29 ? 268435456 : 0);
            if (pav.b.c(context, ExceptionCode.CRASH_EXCEPTION) == 0 && providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                z = true;
            }
            i = Boolean.valueOf(z);
            if (z && (applicationInfo = providerInfoResolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                g = true;
            }
        }
        if (!z) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:85:0x013a A[PHI: r3
  0x013a: PHI (r3v4 boolean) = (r3v3 boolean), (r3v6 boolean) binds: [B:58:0x00f1, B:83:0x0137] A[DONT_GENERATE, DONT_INLINE]] */
    public static int f(boolean z, boolean z2, String str, Context context) throws Throwable {
        Exception exc;
        Throwable th;
        MatrixCursor matrixCursor;
        boolean z3;
        MatrixCursor matrixCursor2 = null;
        try {
            try {
                boolean z4 = true;
                Uri uriBuild = new Uri.Builder().scheme(RemoteMessageConst.Notification.CONTENT).authority("com.google.android.gms.chimera").path(true != z ? "api" : "api_force_staging").appendPath(str).appendQueryParameter("requestStartUptime", String.valueOf(((Long) k.get()).longValue())).build();
                ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(uriBuild);
                boolean z5 = false;
                if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                    matrixCursor = null;
                } else {
                    try {
                        Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uriBuild, null, null, null, null);
                        if (cursorQuery == null) {
                            contentProviderClientAcquireUnstableContentProviderClient.release();
                            matrixCursor = null;
                        } else {
                            try {
                                int count = cursorQuery.getCount();
                                int columnCount = cursorQuery.getColumnCount();
                                matrixCursor = new MatrixCursor(cursorQuery.getColumnNames(), count);
                                for (int i2 = 0; i2 < count; i2++) {
                                    if (!cursorQuery.moveToPosition(i2)) {
                                        throw new RemoteException("Cursor read incomplete (ContentProvider dead?)");
                                    }
                                    Object[] objArr = new Object[columnCount];
                                    for (int i3 = 0; i3 < columnCount; i3++) {
                                        int type = cursorQuery.getType(i3);
                                        if (type == 0) {
                                            objArr[i3] = null;
                                        } else if (type == 1) {
                                            objArr[i3] = Long.valueOf(cursorQuery.getLong(i3));
                                        } else if (type == 2) {
                                            objArr[i3] = Double.valueOf(cursorQuery.getDouble(i3));
                                        } else if (type == 3) {
                                            objArr[i3] = cursorQuery.getString(i3);
                                        } else {
                                            if (type != 4) {
                                                throw new RemoteException("Unknown column type");
                                            }
                                            objArr[i3] = cursorQuery.getBlob(i3);
                                        }
                                    }
                                    matrixCursor.addRow(objArr);
                                }
                                cursorQuery.close();
                                contentProviderClientAcquireUnstableContentProviderClient.release();
                            } catch (Throwable th2) {
                                try {
                                    cursorQuery.close();
                                    throw th2;
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                    throw th2;
                                }
                            }
                        }
                    } catch (RemoteException unused) {
                    } catch (Throwable th4) {
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        throw th4;
                    }
                }
                if (matrixCursor != null) {
                    try {
                        if (matrixCursor.moveToFirst()) {
                            int i4 = matrixCursor.getInt(0);
                            if (i4 > 0) {
                                synchronized (ogn.class) {
                                    try {
                                        f = matrixCursor.getString(2);
                                        int columnIndex = matrixCursor.getColumnIndex("loaderVersion");
                                        if (columnIndex >= 0) {
                                            h = matrixCursor.getInt(columnIndex);
                                        }
                                        int columnIndex2 = matrixCursor.getColumnIndex("disableStandaloneDynamiteLoader2");
                                        if (columnIndex2 >= 0) {
                                            z3 = matrixCursor.getInt(columnIndex2) != 0;
                                            g = z3;
                                        } else {
                                            z3 = false;
                                        }
                                    } catch (Throwable th5) {
                                        throw th5;
                                    }
                                }
                                n3x0 n3x0Var = (n3x0) j.get();
                                if (n3x0Var == null || n3x0Var.f22871a != null) {
                                    z4 = false;
                                } else {
                                    n3x0Var.f22871a = matrixCursor;
                                }
                                z5 = z3;
                                matrixCursor2 = z4 ? null : matrixCursor;
                            }
                            if (z2 && z5) {
                                throw new lgn("forcing fallback to container DynamiteLoader impl");
                            }
                            if (matrixCursor2 != null) {
                                matrixCursor2.close();
                            }
                            return i4;
                        }
                    } catch (Exception e2) {
                        exc = e2;
                        if (exc instanceof lgn) {
                            throw exc;
                        }
                        String message = exc.getMessage();
                        StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 25);
                        sb.append("V2 version check failed: ");
                        sb.append(message);
                        throw new lgn(sb.toString(), exc);
                    } catch (Throwable th6) {
                        th = th6;
                        matrixCursor2 = matrixCursor;
                        if (matrixCursor2 == null) {
                            throw th;
                        }
                        matrixCursor2.close();
                        throw th;
                    }
                }
                Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                throw new lgn("Failed to connect to dynamite module ContentResolver.");
            } catch (Throwable th7) {
                th = th7;
            }
        } catch (Exception e3) {
            exc = e3;
        }
    }

    public static void g(ClassLoader classLoader) throws lgn {
        try {
            e7x0 e7x0Var = null;
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder != null) {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                e7x0Var = iInterfaceQueryLocalInterface instanceof e7x0 ? (e7x0) iInterfaceQueryLocalInterface : new e7x0(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2", (byte) 3);
            }
            n = e7x0Var;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e2) {
            throw new lgn("Failed to instantiate dynamite loader", e2);
        }
    }

    public static c6x0 h(Context context) {
        c6x0 c6x0Var;
        synchronized (ogn.class) {
            c6x0 c6x0Var2 = m;
            if (c6x0Var2 != null) {
                return c6x0Var2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    c6x0Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    c6x0Var = iInterfaceQueryLocalInterface instanceof c6x0 ? (c6x0) iInterfaceQueryLocalInterface : new c6x0(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader", (byte) 3);
                }
                if (c6x0Var != null) {
                    m = c6x0Var;
                    return c6x0Var;
                }
            } catch (Exception e2) {
                String message = e2.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 45);
                sb.append("Failed to load IDynamiteLoader from GmsCore: ");
                sb.append(message);
                Log.e("DynamiteModule", sb.toString());
            }
            return null;
        }
    }

    public final IBinder b(String str) throws lgn {
        try {
            return (IBinder) this.f25229a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e2) {
            throw new lgn("Failed to instantiate module class: ".concat(str), e2);
        }
    }
}

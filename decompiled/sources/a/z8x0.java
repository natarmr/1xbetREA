package a;

import android.accounts.Account;
import android.content.Context;
import android.gov.nist.core.Separators;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class z8x0 implements p9x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f43991a;
    public String d;
    public final Object c = new Object();
    public final d9x0 b = new d9x0();

    public z8x0(dwj dwjVar) {
        this.f43991a = dwjVar.f6801a;
    }

    @Override // a.p9x0
    public final h9x0 a(Uri uri) throws l52 {
        if (f(uri)) {
            throw new l52("Android backend cannot perform remote operations without a remote backend");
        }
        File fileR = zcm0.r(e(uri));
        return new h9x0(new FileInputStream(fileR), fileR);
    }

    @Override // a.p9x0
    public final OutputStream b(Uri uri) {
        return this.b.b(e(uri));
    }

    @Override // a.p9x0
    public final void c(Uri uri) throws IOException {
        this.b.c(e(uri));
    }

    @Override // a.p9x0
    public final void d(Uri uri, Uri uri2) throws IOException {
        this.b.d(e(uri), e(uri2));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:55:0x0115  */
    /* JADX WARN: Code duplicated, block: B:59:0x011c A[Catch: all -> 0x012f, TryCatch #1 {all -> 0x012f, blocks: (B:57:0x0118, B:59:0x011c, B:62:0x0131), top: B:88:0x0118 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x013d  */
    /* JADX WARN: Code duplicated, block: B:88:0x0118 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final Uri e(Uri uri) throws IOException {
        File file;
        File externalFilesDir;
        Account account;
        String absolutePath;
        if (f(uri)) {
            throw new l52("Operation across authorities is not allowed.");
        }
        if (!f(uri)) {
            Context context = this.f43991a;
            if (!uri.getScheme().equals("android")) {
                throw new l52("Scheme must be 'android'");
            }
            if (uri.getPathSegments().isEmpty()) {
                throw new l52(String.format("Path must start with a valid logical location: %s", uri));
            }
            if (!TextUtils.isEmpty(uri.getQuery())) {
                throw new l52("Did not expect uri to have query");
            }
            ArrayList arrayList = new ArrayList(uri.getPathSegments());
            String str = (String) arrayList.get(0);
            switch (str.hashCode()) {
                case -1820761141:
                    if (str.equals("external")) {
                        externalFilesDir = context.getExternalFilesDir(null);
                        file = new File(externalFilesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
                        if (!m0x0.X(context)) {
                            synchronized (this.c) {
                                try {
                                    absolutePath = this.d;
                                    if (absolutePath == null) {
                                        absolutePath = ycm0.B(context.createDeviceProtectedStorageContext()).getParentFile().getAbsolutePath();
                                        this.d = absolutePath;
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                                break;
                            }
                            if (!file.getAbsolutePath().startsWith(absolutePath)) {
                                throw new l52("Cannot access credential-protected data from direct boot");
                            }
                        }
                    }
                    throw new l52(String.format("Path must start with a valid logical location: %s", uri));
                case 94416770:
                    if (str.equals("cache")) {
                        externalFilesDir = context.getCacheDir();
                        file = new File(externalFilesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
                        if (!m0x0.X(context)) {
                            synchronized (this.c) {
                                absolutePath = this.d;
                                if (absolutePath == null) {
                                    absolutePath = ycm0.B(context.createDeviceProtectedStorageContext()).getParentFile().getAbsolutePath();
                                    this.d = absolutePath;
                                }
                                if (!file.getAbsolutePath().startsWith(absolutePath)) {
                                    throw new l52("Cannot access credential-protected data from direct boot");
                                }
                            }
                        }
                    }
                    throw new l52(String.format("Path must start with a valid logical location: %s", uri));
                case 97434231:
                    if (str.equals("files")) {
                        externalFilesDir = ycm0.B(context);
                        file = new File(externalFilesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
                        if (!m0x0.X(context)) {
                            synchronized (this.c) {
                                absolutePath = this.d;
                                if (absolutePath == null) {
                                    absolutePath = ycm0.B(context.createDeviceProtectedStorageContext()).getParentFile().getAbsolutePath();
                                    this.d = absolutePath;
                                }
                                if (!file.getAbsolutePath().startsWith(absolutePath)) {
                                    throw new l52("Cannot access credential-protected data from direct boot");
                                }
                            }
                        }
                    }
                    throw new l52(String.format("Path must start with a valid logical location: %s", uri));
                case 835260319:
                    if (str.equals("managed")) {
                        File file2 = new File(ycm0.B(context), "managed");
                        if (arrayList.size() >= 3) {
                            try {
                                String str2 = (String) arrayList.get(2);
                                Account account2 = y8x0.f42217a;
                                if ("shared".equals(str2)) {
                                    account = y8x0.f42217a;
                                } else {
                                    int iIndexOf = str2.indexOf(58);
                                    aem0.C(iIndexOf >= 0, "Malformed account", new Object[0]);
                                    account = new Account(str2.substring(iIndexOf + 1), str2.substring(0, iIndexOf));
                                }
                                if (!y8x0.f42217a.equals(account)) {
                                    throw new l52("AccountManager cannot be null");
                                }
                            } catch (IllegalArgumentException e) {
                                throw new l52(e);
                            }
                        }
                        externalFilesDir = file2;
                        file = new File(externalFilesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
                        if (!m0x0.X(context)) {
                            synchronized (this.c) {
                                absolutePath = this.d;
                                if (absolutePath == null) {
                                    absolutePath = ycm0.B(context.createDeviceProtectedStorageContext()).getParentFile().getAbsolutePath();
                                    this.d = absolutePath;
                                }
                                if (!file.getAbsolutePath().startsWith(absolutePath)) {
                                    throw new l52("Cannot access credential-protected data from direct boot");
                                }
                            }
                        }
                    }
                    throw new l52(String.format("Path must start with a valid logical location: %s", uri));
                case 988548496:
                    if (str.equals("directboot-cache")) {
                        externalFilesDir = context.createDeviceProtectedStorageContext().getCacheDir();
                        file = new File(externalFilesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
                        if (!m0x0.X(context)) {
                            synchronized (this.c) {
                                absolutePath = this.d;
                                if (absolutePath == null) {
                                    absolutePath = ycm0.B(context.createDeviceProtectedStorageContext()).getParentFile().getAbsolutePath();
                                    this.d = absolutePath;
                                }
                                if (!file.getAbsolutePath().startsWith(absolutePath)) {
                                    throw new l52("Cannot access credential-protected data from direct boot");
                                }
                            }
                        }
                    }
                    throw new l52(String.format("Path must start with a valid logical location: %s", uri));
                case 991565957:
                    if (str.equals("directboot-files")) {
                        externalFilesDir = context.createDeviceProtectedStorageContext().getFilesDir();
                        file = new File(externalFilesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
                        if (!m0x0.X(context)) {
                            synchronized (this.c) {
                                absolutePath = this.d;
                                if (absolutePath == null) {
                                    absolutePath = ycm0.B(context.createDeviceProtectedStorageContext()).getParentFile().getAbsolutePath();
                                    this.d = absolutePath;
                                }
                                if (!file.getAbsolutePath().startsWith(absolutePath)) {
                                    throw new l52("Cannot access credential-protected data from direct boot");
                                }
                            }
                        }
                    }
                    throw new l52(String.format("Path must start with a valid logical location: %s", uri));
                default:
                    throw new l52(String.format("Path must start with a valid logical location: %s", uri));
            }
        }
        ohq.l("operation is not permitted in other authorities.");
        file = null;
        Uri.Builder builderPath = new Uri.Builder().scheme("file").authority("").path(Separators.SLASH);
        u3x u3xVarL = b4x.l();
        builderPath.path(file.getAbsolutePath());
        rcf0 rcf0VarG = u3xVarL.g();
        Pattern pattern = l9x0.f19679a;
        return builderPath.encodedFragment(rcf0VarG.isEmpty() ? null : "transform=".concat(new pfw("+").b(rcf0VarG))).build();
    }

    public final boolean f(Uri uri) {
        return (TextUtils.isEmpty(uri.getAuthority()) || this.f43991a.getPackageName().equals(uri.getAuthority())) ? false : true;
    }

    @Override // a.p9x0
    public final String zzc() {
        return "android";
    }
}

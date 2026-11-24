package a;

import android.content.Context;
import android.util.Pair;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.concurrent.Callable;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipInputStream;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ha10 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f12703a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    public /* synthetic */ ha10(Context context, String str, String str2, byte b) {
        this.f12703a = b;
        this.b = context;
        this.c = str;
        this.d = str2;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x009d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [a.zvj] */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // java.util.concurrent.Callable
    public final Object call() throws Throwable {
        fa10 fa10Var;
        Exception exc;
        Throwable th;
        ?? r5;
        ob10 ob10Var;
        int i;
        ?? r6;
        fa10 fa10Var2;
        Pair pair;
        ob10 ob10VarH;
        ok50 ok50Var;
        switch (this.f12703a) {
            case 0:
                Context context = this.b;
                String str = this.c;
                String str2 = this.d;
                yk50 yk50Var = idx.f14607a;
                if (yk50Var == null) {
                    synchronized (yk50.class) {
                        try {
                            yk50Var = idx.f14607a;
                            if (yk50Var == null) {
                                Context applicationContext = context.getApplicationContext();
                                ok50 ok50Var2 = idx.b;
                                if (ok50Var2 == null) {
                                    synchronized (ok50.class) {
                                        try {
                                            ok50Var = idx.b;
                                            if (ok50Var == null) {
                                                ok50Var = new ok50(new qty(applicationContext));
                                                idx.b = ok50Var;
                                            }
                                        } catch (Throwable th2) {
                                            throw th2;
                                        }
                                        break;
                                    }
                                    ok50Var2 = ok50Var;
                                }
                                yk50Var = new yk50(ok50Var2, new kud());
                                idx.f14607a = yk50Var;
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
                yk50 yk50Var2 = yk50Var;
                boolean z = true;
                ?? r7 = 0;
                int responseCode = 0;
                zvj zvjVar = null;
                if (str2 != null) {
                    try {
                        File fileI = ((ok50) yk50Var2.b).i(str);
                        if (fileI == null) {
                            pair = null;
                        } else {
                            FileInputStream fileInputStream = new FileInputStream(fileI);
                            gzp gzpVar = fileI.getAbsolutePath().endsWith(".zip") ? gzp.ZIP : fileI.getAbsolutePath().endsWith(".gz") ? gzp.GZIP : gzp.JSON;
                            fileI.getAbsolutePath();
                            xv00.a();
                            pair = new Pair(gzpVar, fileInputStream);
                        }
                    } catch (FileNotFoundException unused) {
                    }
                    if (pair == null) {
                        fa10Var = null;
                    } else {
                        gzp gzpVar2 = (gzp) pair.first;
                        InputStream inputStream = (InputStream) pair.second;
                        int iOrdinal = gzpVar2.ordinal();
                        if (iOrdinal == 1) {
                            ob10VarH = ka10.h(context, new ZipInputStream(inputStream), str2);
                        } else if (iOrdinal != 2) {
                            ob10VarH = ka10.e(w9x.L(inputStream), str2);
                        } else {
                            try {
                                ob10VarH = ka10.e(w9x.L(new GZIPInputStream(inputStream)), str2);
                            } catch (IOException e) {
                                ob10VarH = new ob10(e);
                            }
                        }
                        fa10Var = ob10VarH.f24955a;
                        if (fa10Var == null) {
                            fa10Var = null;
                        }
                    }
                    break;
                } else {
                    fa10Var = null;
                }
                if (fa10Var == null) {
                    xv00.a();
                    xv00.a();
                    try {
                        try {
                            zvj zvjVarB = kud.b(str);
                            try {
                                HttpURLConnection httpURLConnection = (HttpURLConnection) zvjVarB.b;
                                try {
                                    responseCode = httpURLConnection.getResponseCode() / 100;
                                    i = responseCode;
                                    if (responseCode != 2) {
                                        z = false;
                                        i = responseCode;
                                    }
                                } catch (IOException unused2) {
                                }
                                if (z) {
                                    InputStream inputStream2 = httpURLConnection.getInputStream();
                                    String contentType = httpURLConnection.getContentType();
                                    ob10Var = yk50Var2.b(context, str, inputStream2, contentType, str2);
                                    fa10 fa10Var3 = ob10Var.f24955a;
                                    xv00.a();
                                    r6 = contentType;
                                } else {
                                    ob10Var = new ob10(new IllegalArgumentException(zvjVarB.a()));
                                    r6 = i;
                                }
                                try {
                                    zvjVarB.close();
                                    r7 = r6;
                                } catch (IOException e2) {
                                    xv00.c("LottieFetchResult close failed ", e2);
                                    r7 = r6;
                                }
                                break;
                            } catch (Exception e3) {
                                exc = e3;
                                zvjVar = zvjVarB;
                                ob10 ob10Var2 = new ob10(exc);
                                if (zvjVar != null) {
                                    try {
                                        zvjVar.close();
                                    } catch (IOException e4) {
                                        xv00.c("LottieFetchResult close failed ", e4);
                                    }
                                }
                                ob10Var = ob10Var2;
                                r7 = zvjVar;
                                break;
                            } catch (Throwable th4) {
                                th = th4;
                                r5 = zvjVarB;
                                if (r5 == 0) {
                                    throw th;
                                }
                                try {
                                    r5.close();
                                    throw th;
                                } catch (IOException e5) {
                                    xv00.c("LottieFetchResult close failed ", e5);
                                    throw th;
                                }
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            r5 = r7;
                        }
                    } catch (Exception e6) {
                        exc = e6;
                    }
                    break;
                } else {
                    ob10Var = new ob10(fa10Var);
                }
                if (str2 != null && (fa10Var2 = ob10Var.f24955a) != null) {
                    ga10.b.f10945a.d(str2, fa10Var2);
                }
                return ob10Var;
            default:
                return ka10.b(this.b, this.c, this.d);
        }
    }
}

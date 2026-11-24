package a;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class cvw0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5050a = 0;
    public final URL b;
    public final byte[] c;
    public final String d;
    public final Map e;
    public final Object f;
    public final /* synthetic */ p4 g;

    public cvw0(fvw0 fvw0Var, String str, URL url, byte[] bArr, Map map, zuw0 zuw0Var) {
        Objects.requireNonNull(fvw0Var);
        this.g = fvw0Var;
        s0x.E(str);
        s0x.H(url);
        this.b = url;
        this.c = bArr;
        this.f = zuw0Var;
        this.d = str;
        this.e = map;
    }

    public void a(int i, IOException iOException, byte[] bArr, Map map) {
        fxw0 fxw0Var = ((kxw0) ((k1x0) this.g).b).g;
        kxw0.g(fxw0Var);
        fxw0Var.v1(new wz3(this, i, iOException, bArr, map));
    }

    /* JADX WARN: Code duplicated, block: B:164:0x02be  */
    /* JADX WARN: Code duplicated, block: B:174:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:178:0x02a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:182:0x013f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:192:0x02e3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:0x0163 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x0154  */
    /* JADX WARN: Code duplicated, block: B:91:0x0178  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r24v0, types: [a.cvw0] */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.Map] */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Throwable th;
        int responseCode;
        HttpURLConnection httpURLConnection;
        IOException iOException;
        Map map;
        ouw0 ouw0Var;
        fxw0 fxw0Var;
        InputStream inputStream;
        Throwable th2;
        OutputStream outputStream;
        HttpURLConnection httpURLConnection2;
        ?? r6;
        IOException iOException2;
        OutputStream outputStream2;
        ?? r5;
        String str;
        Object obj;
        String str2;
        InputStream inputStream2;
        byte b = this.f5050a;
        String str3 = "Content-Encoding";
        byte[] bArr = this.c;
        Map map2 = this.e;
        URL url = this.b;
        p4 p4Var = this.g;
        int responseCode2 = 0;
        String str4 = this.d;
        switch (b) {
            case 0:
                OutputStream outputStream3 = null;
                Map map3 = null;
                outputStream = null;
                outputStream3 = null;
                outputStream = null;
                outputStream3 = null;
                OutputStream outputStream4 = null;
                zuw0 zuw0Var = (zuw0) this.f;
                fvw0 fvw0Var = (fvw0) p4Var;
                kxw0 kxw0Var = (kxw0) fvw0Var.b;
                kxw0 kxw0Var2 = (kxw0) fvw0Var.b;
                fxw0 fxw0Var2 = kxw0Var.g;
                kxw0.g(fxw0Var2);
                fxw0Var2.q1();
                try {
                    URLConnection uRLConnectionOpenConnection = url.openConnection();
                    if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
                        throw new IOException("Failed to obtain HTTP connection");
                    }
                    httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                    httpURLConnection.setDefaultUseCaches(false);
                    bkw0 bkw0Var = kxw0Var2.d;
                    httpURLConnection.setConnectTimeout(60000);
                    httpURLConnection.setReadTimeout(61000);
                    httpURLConnection.setInstanceFollowRedirects(false);
                    httpURLConnection.setDoInput(true);
                    if (map2 != null) {
                        try {
                            for (Map.Entry entry : map2.entrySet()) {
                                httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                            }
                        } catch (IOException e) {
                            iOException = e;
                            responseCode = 0;
                            map = null;
                            if (outputStream4 != null) {
                                try {
                                    outputStream4.close();
                                } catch (IOException e2) {
                                    uuw0 uuw0Var = kxw0Var2.f;
                                    kxw0.g(uuw0Var);
                                    uuw0Var.g.c(uuw0.q1(str4), e2, "Error closing HTTP compressed POST connection output stream. appId");
                                }
                                break;
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            fxw0Var = kxw0Var2.g;
                            kxw0.g(fxw0Var);
                            ouw0Var = new ouw0(this.d, zuw0Var, responseCode, iOException, (byte[]) null, map);
                            fxw0Var.v1(ouw0Var);
                            return;
                        } catch (Throwable th3) {
                            th = th3;
                            responseCode = 0;
                            th = th;
                            if (outputStream3 != null) {
                                try {
                                    outputStream3.close();
                                } catch (IOException e3) {
                                    uuw0 uuw0Var2 = kxw0Var2.f;
                                    kxw0.g(uuw0Var2);
                                    uuw0Var2.g.c(uuw0.q1(str4), e3, "Error closing HTTP compressed POST connection output stream. appId");
                                }
                                break;
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            fxw0 fxw0Var3 = kxw0Var2.g;
                            kxw0.g(fxw0Var3);
                            fxw0Var3.v1(new ouw0(this.d, zuw0Var, responseCode, (IOException) null, (byte[]) null, map3));
                            throw th;
                        }
                    }
                    if (bArr != null) {
                        r6x0 r6x0Var = fvw0Var.c.g;
                        m6x0.T(r6x0Var);
                        byte[] bArrW1 = r6x0Var.W1(bArr);
                        uuw0 uuw0Var3 = kxw0Var2.f;
                        kxw0.g(uuw0Var3);
                        quw0 quw0Var = uuw0Var3.o;
                        int length = bArrW1.length;
                        quw0Var.b(Integer.valueOf(length), "Uploading data. size");
                        httpURLConnection.setDoOutput(true);
                        httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
                        httpURLConnection.setFixedLengthStreamingMode(length);
                        httpURLConnection.connect();
                        OutputStream outputStream5 = httpURLConnection.getOutputStream();
                        try {
                            outputStream5.write(bArrW1);
                            outputStream5.close();
                        } catch (IOException e4) {
                            iOException = e4;
                            responseCode = 0;
                            map = null;
                            outputStream4 = outputStream5;
                            if (outputStream4 != null) {
                                outputStream4.close();
                                break;
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            fxw0Var = kxw0Var2.g;
                            kxw0.g(fxw0Var);
                            ouw0Var = new ouw0(this.d, zuw0Var, responseCode, iOException, (byte[]) null, map);
                            fxw0Var.v1(ouw0Var);
                            return;
                        } catch (Throwable th4) {
                            th = th4;
                            responseCode = 0;
                            outputStream3 = outputStream5;
                            httpURLConnection = httpURLConnection;
                            th = th;
                            if (outputStream3 != null) {
                                outputStream3.close();
                                break;
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            fxw0 fxw0Var4 = kxw0Var2.g;
                            kxw0.g(fxw0Var4);
                            fxw0Var4.v1(new ouw0(this.d, zuw0Var, responseCode, (IOException) null, (byte[]) null, map3));
                            throw th;
                        }
                    }
                    responseCode = httpURLConnection.getResponseCode();
                    try {
                        try {
                            Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                            try {
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                inputStream = httpURLConnection.getInputStream();
                                try {
                                    byte[] bArr2 = new byte[1024];
                                    while (true) {
                                        int i = inputStream.read(bArr2);
                                        if (i <= 0) {
                                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                                            inputStream.close();
                                            httpURLConnection.disconnect();
                                            fxw0Var = kxw0Var2.g;
                                            kxw0.g(fxw0Var);
                                            ouw0Var = new ouw0(this.d, zuw0Var, responseCode, (IOException) null, byteArray, headerFields);
                                            fxw0Var.v1(ouw0Var);
                                            return;
                                        }
                                        byteArrayOutputStream.write(bArr2, 0, i);
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    if (inputStream != null) {
                                        inputStream.close();
                                    }
                                    throw th;
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                inputStream = null;
                            }
                        } catch (IOException e5) {
                            iOException = e5;
                            if (outputStream4 != null) {
                                outputStream4.close();
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            fxw0Var = kxw0Var2.g;
                            kxw0.g(fxw0Var);
                            ouw0Var = new ouw0(this.d, zuw0Var, responseCode, iOException, (byte[]) null, map);
                            break;
                        } catch (Throwable th7) {
                            th = th7;
                            httpURLConnection = httpURLConnection;
                            th = th;
                            if (outputStream3 != null) {
                                outputStream3.close();
                                break;
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            fxw0 fxw0Var5 = kxw0Var2.g;
                            kxw0.g(fxw0Var5);
                            fxw0Var5.v1(new ouw0(this.d, zuw0Var, responseCode, (IOException) null, (byte[]) null, map3));
                            throw th;
                        }
                    } catch (IOException e6) {
                        iOException = e6;
                        map = null;
                        if (outputStream4 != null) {
                            outputStream4.close();
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        fxw0Var = kxw0Var2.g;
                        kxw0.g(fxw0Var);
                        ouw0Var = new ouw0(this.d, zuw0Var, responseCode, iOException, (byte[]) null, map);
                        break;
                    } catch (Throwable th8) {
                        th = th8;
                        th = th;
                        if (outputStream3 != null) {
                            outputStream3.close();
                            break;
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        fxw0 fxw0Var6 = kxw0Var2.g;
                        kxw0.g(fxw0Var6);
                        fxw0Var6.v1(new ouw0(this.d, zuw0Var, responseCode, (IOException) null, (byte[]) null, map3));
                        throw th;
                    }
                } catch (IOException e7) {
                    iOException = e7;
                    responseCode = 0;
                    httpURLConnection = null;
                    map = null;
                } catch (Throwable th9) {
                    th = th9;
                    responseCode = 0;
                    httpURLConnection = null;
                    map3 = null;
                }
                break;
            default:
                k1x0 k1x0Var = (k1x0) p4Var;
                kxw0 kxw0Var3 = (kxw0) k1x0Var.b;
                kxw0 kxw0Var4 = (kxw0) k1x0Var.b;
                fxw0 fxw0Var7 = kxw0Var3.g;
                kxw0.g(fxw0Var7);
                fxw0Var7.q1();
                try {
                    URLConnection uRLConnectionOpenConnection2 = url.openConnection();
                    if (!(uRLConnectionOpenConnection2 instanceof HttpURLConnection)) {
                        throw new IOException("Failed to obtain HTTP connection");
                    }
                    httpURLConnection2 = (HttpURLConnection) uRLConnectionOpenConnection2;
                    httpURLConnection2.setDefaultUseCaches(false);
                    bkw0 bkw0Var2 = kxw0Var4.d;
                    httpURLConnection2.setConnectTimeout(60000);
                    httpURLConnection2.setReadTimeout(61000);
                    httpURLConnection2.setInstanceFollowRedirects(false);
                    httpURLConnection2.setDoInput(true);
                    if (map2 != null) {
                        try {
                            try {
                                for (Map.Entry entry2 : map2.entrySet()) {
                                    httpURLConnection2.addRequestProperty((String) entry2.getKey(), (String) entry2.getValue());
                                }
                            } catch (IOException e8) {
                                e = e8;
                                str = null;
                                iOException2 = e;
                                outputStream2 = null;
                                r5 = str;
                                if (outputStream2 != null) {
                                    try {
                                        outputStream2.close();
                                    } catch (IOException e9) {
                                        uuw0 uuw0Var4 = kxw0Var4.f;
                                        kxw0.g(uuw0Var4);
                                        uuw0Var4.g.c(uuw0.q1(str4), e9, "Error closing HTTP compressed POST connection output stream. appId");
                                    }
                                    break;
                                }
                                if (httpURLConnection2 != null) {
                                    httpURLConnection2.disconnect();
                                }
                                a(responseCode2, iOException2, null, r5);
                                return;
                            }
                        } catch (Throwable th10) {
                            th = th10;
                            outputStream = null;
                            obj = null;
                            th2 = th;
                            r6 = obj;
                            if (outputStream != null) {
                                try {
                                    outputStream.close();
                                } catch (IOException e10) {
                                    uuw0 uuw0Var5 = kxw0Var4.f;
                                    kxw0.g(uuw0Var5);
                                    uuw0Var5.g.c(uuw0.q1(str4), e10, "Error closing HTTP compressed POST connection output stream. appId");
                                }
                                break;
                            }
                            if (httpURLConnection2 != null) {
                                httpURLConnection2.disconnect();
                            }
                            a(responseCode2, null, null, r6);
                            throw th2;
                        }
                    }
                    if (bArr != null) {
                        try {
                            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream2);
                            gZIPOutputStream.write(bArr);
                            gZIPOutputStream.close();
                            byteArrayOutputStream2.close();
                            byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
                            uuw0 uuw0Var6 = kxw0Var4.f;
                            kxw0.g(uuw0Var6);
                            quw0 quw0Var2 = uuw0Var6.o;
                            int length2 = byteArray2.length;
                            quw0Var2.b(Integer.valueOf(length2), "Uploading data. size");
                            httpURLConnection2.setDoOutput(true);
                            httpURLConnection2.addRequestProperty("Content-Encoding", "gzip");
                            httpURLConnection2.setFixedLengthStreamingMode(length2);
                            httpURLConnection2.connect();
                            outputStream = httpURLConnection2.getOutputStream();
                            try {
                                outputStream.write(byteArray2);
                                outputStream.close();
                            } catch (IOException e11) {
                                iOException2 = e11;
                                outputStream2 = outputStream;
                                httpURLConnection2 = httpURLConnection2;
                                r5 = 0;
                                if (outputStream2 != null) {
                                    outputStream2.close();
                                    break;
                                }
                                if (httpURLConnection2 != null) {
                                    httpURLConnection2.disconnect();
                                }
                                a(responseCode2, iOException2, null, r5);
                                return;
                            } catch (Throwable th11) {
                                th = th11;
                                httpURLConnection2 = httpURLConnection2;
                                obj = null;
                                th2 = th;
                                r6 = obj;
                                if (outputStream != null) {
                                    outputStream.close();
                                    break;
                                }
                                if (httpURLConnection2 != null) {
                                    httpURLConnection2.disconnect();
                                }
                                a(responseCode2, null, null, r6);
                                throw th2;
                            }
                        } catch (IOException e12) {
                            uuw0 uuw0Var7 = kxw0Var4.f;
                            kxw0.g(uuw0Var7);
                            uuw0Var7.g.b(e12, "Failed to gzip post request content");
                            throw e12;
                        }
                    }
                    responseCode2 = httpURLConnection2.getResponseCode();
                    try {
                        try {
                            Map<String, List<String>> headerFields2 = httpURLConnection2.getHeaderFields();
                            try {
                                ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                                inputStream2 = httpURLConnection2.getInputStream();
                                try {
                                    byte[] bArr3 = new byte[1024];
                                    while (true) {
                                        int i2 = inputStream2.read(bArr3);
                                        if (i2 <= 0) {
                                            byte[] byteArray3 = byteArrayOutputStream3.toByteArray();
                                            inputStream2.close();
                                            httpURLConnection2.disconnect();
                                            a(responseCode2, null, byteArray3, headerFields2);
                                            return;
                                        }
                                        byteArrayOutputStream3.write(bArr3, 0, i2);
                                    }
                                } catch (Throwable th12) {
                                    th = th12;
                                    if (inputStream2 != null) {
                                        inputStream2.close();
                                    }
                                    throw th;
                                }
                            } catch (Throwable th13) {
                                th = th13;
                                inputStream2 = null;
                            }
                        } catch (IOException e13) {
                            e = e13;
                            str2 = null;
                            str = str2;
                            iOException2 = e;
                            outputStream2 = null;
                            r5 = str;
                            if (outputStream2 != null) {
                                outputStream2.close();
                                break;
                            }
                            if (httpURLConnection2 != null) {
                                httpURLConnection2.disconnect();
                            }
                            a(responseCode2, iOException2, null, r5);
                            return;
                        } catch (Throwable th14) {
                            th = th14;
                            responseCode2 = responseCode2;
                            outputStream = null;
                            obj = null;
                            th2 = th;
                            r6 = obj;
                            if (outputStream != null) {
                                outputStream.close();
                                break;
                            }
                            if (httpURLConnection2 != null) {
                                httpURLConnection2.disconnect();
                            }
                            a(responseCode2, null, null, r6);
                            throw th2;
                        }
                    } catch (IOException e14) {
                        e = e14;
                        str2 = str3;
                        str = str2;
                        iOException2 = e;
                        outputStream2 = null;
                        r5 = str;
                        if (outputStream2 != null) {
                            outputStream2.close();
                            break;
                        }
                        if (httpURLConnection2 != null) {
                            httpURLConnection2.disconnect();
                        }
                        a(responseCode2, iOException2, null, r5);
                        return;
                    } catch (Throwable th15) {
                        th = th15;
                        responseCode2 = responseCode2;
                        obj = "Content-Encoding";
                        outputStream = null;
                        httpURLConnection2 = httpURLConnection2;
                        th2 = th;
                        r6 = obj;
                        if (outputStream != null) {
                            outputStream.close();
                            break;
                        }
                        if (httpURLConnection2 != null) {
                            httpURLConnection2.disconnect();
                        }
                        a(responseCode2, null, null, r6);
                        throw th2;
                    }
                } catch (IOException e15) {
                    iOException2 = e15;
                    outputStream2 = null;
                    httpURLConnection2 = null;
                } catch (Throwable th16) {
                    th2 = th16;
                    outputStream = null;
                    httpURLConnection2 = null;
                    r6 = 0;
                }
                break;
        }
    }

    public cvw0(k1x0 k1x0Var, String str, URL url, byte[] bArr, HashMap map, g1x0 g1x0Var) {
        Objects.requireNonNull(k1x0Var);
        this.g = k1x0Var;
        s0x.E(str);
        this.b = url;
        this.c = bArr;
        this.f = g1x0Var;
        this.d = str;
        this.e = map;
    }
}

package a;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class puj implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f27619a;
    public final /* synthetic */ quj b;

    public /* synthetic */ puj(quj qujVar, byte b) {
        this.f27619a = b;
        this.b = qujVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String string;
        switch (this.f27619a) {
            case 0:
                quj qujVar = this.b;
                synchronized (qujVar) {
                    try {
                        mtv mtvVar = (mtv) qujVar.f29348a.get();
                        ArrayList arrayListA = mtvVar.a();
                        synchronized (mtvVar) {
                            mtvVar.f22386a.a(new umu(mtvVar));
                        }
                        JSONArray jSONArray = new JSONArray();
                        for (int i = 0; i < arrayListA.size(); i++) {
                            x35 x35Var = (x35) arrayListA.get(i);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("agent", x35Var.f40199a);
                            jSONObject.put("dates", new JSONArray((Collection) x35Var.b));
                            jSONArray.put(jSONObject);
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("heartbeats", jSONArray);
                        jSONObject2.put("version", "2");
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 11);
                        try {
                            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                            try {
                                gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                                gZIPOutputStream.close();
                                base64OutputStream.close();
                                string = byteArrayOutputStream.toString("UTF-8");
                            } catch (Throwable th) {
                                try {
                                    gZIPOutputStream.close();
                                    break;
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            try {
                                base64OutputStream.close();
                                break;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                            throw th3;
                        }
                    } catch (Throwable th5) {
                        throw th5;
                    }
                }
                return string;
            default:
                quj qujVar2 = this.b;
                synchronized (qujVar2) {
                    mtv mtvVar2 = (mtv) qujVar2.f29348a.get();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    String strA = ((yyj) qujVar2.c.get()).a();
                    synchronized (mtvVar2) {
                        mtvVar2.f22386a.a(new k9v(mtvVar2, mtv.b(jCurrentTimeMillis), strA, new zsb0(strA)));
                    }
                }
                return null;
        }
    }
}

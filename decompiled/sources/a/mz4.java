package a;

import android.content.ComponentName;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.util.SparseArray;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.ArrayList;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
public final class mz4 implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f22635a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mz4(Object obj, byte b) {
        this.f22635a = b;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:139:0x0290  */
    /* JADX WARN: Code duplicated, block: B:141:0x02af  */
    /* JADX WARN: Code duplicated, block: B:142:0x02cb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:143:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:145:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:148:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:150:0x0316  */
    /* JADX WARN: Code duplicated, block: B:177:0x0319 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:139:0x0290, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        i0g0 i0g0Var;
        i0g0 i0g0VarB;
        ArrayList arrayList;
        float f;
        gv90 gv90Var = null;
        ComponentName componentName = null;
        boolean z = true;
        Object[] objArr = 0;
        switch (this.f22635a) {
            case 0:
                int i = message.what;
                oz4 oz4Var = (oz4) this.b;
                if (i != 1) {
                    return false;
                }
                oz4Var.b();
                return true;
            case 1:
                jrs0 jrs0Var = (jrs0) this.b;
                yqc yqcVar = (yqc) jrs0Var.j;
                q0a q0aVar = (q0a) jrs0Var.b;
                int i2 = message.what;
                if (i2 == R.id.zxing_decode) {
                    fmk0 fmk0Var = (fmk0) message.obj;
                    Handler handler = (Handler) jrs0Var.f;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    Rect rect = (Rect) jrs0Var.g;
                    fmk0Var.d = rect;
                    t68 t68Var = fmk0Var.f9787a;
                    int i3 = t68Var.b;
                    if (rect == null) {
                        z = true;
                    } else {
                        int i4 = fmk0Var.c;
                        byte[] bArr = t68Var.f33403a;
                        int i5 = t68Var.c;
                        if (i4 == 90) {
                            byte[] bArr2 = new byte[i3 * i5];
                            int i6 = 0;
                            for (int i7 = 0; i7 < i3; i7++) {
                                for (int i8 = i5 - 1; i8 >= 0; i8--) {
                                    bArr2[i6] = bArr[(i8 * i3) + i7];
                                    i6++;
                                }
                            }
                            t68Var = new t68(bArr2, i5, i3);
                        } else if (i4 == 180) {
                            int i9 = i3 * i5;
                            byte[] bArr3 = new byte[i9];
                            int i10 = i9 - 1;
                            for (int i11 = 0; i11 < i9; i11++) {
                                bArr3[i10] = bArr[i11];
                                i10--;
                            }
                            t68Var = new t68(bArr3, i3, i5);
                        } else if (i4 == 270) {
                            int i12 = i3 * i5;
                            byte[] bArr4 = new byte[i12];
                            int i13 = i12 - 1;
                            for (int i14 = 0; i14 < i3; i14++) {
                                for (int i15 = i5 - 1; i15 >= 0; i15--) {
                                    bArr4[i13] = bArr[(i15 * i3) + i14];
                                    i13--;
                                }
                            }
                            t68Var = new t68(bArr4, i5, i3);
                        }
                        Rect rect2 = fmk0Var.d;
                        byte[] bArr5 = t68Var.f33403a;
                        int iWidth = rect2.width();
                        int iHeight = rect2.height();
                        int i16 = rect2.top;
                        byte[] bArr6 = new byte[iWidth * iHeight];
                        int i17 = t68Var.b;
                        int i18 = (i16 * i17) + rect2.left;
                        for (int i19 = 0; i19 < iHeight; i19++) {
                            System.arraycopy(bArr5, i18, bArr6, i19 * iWidth, iWidth);
                            i18 += i17;
                        }
                        gv90Var = new gv90(bArr6, iWidth, iHeight, iWidth, iHeight);
                    }
                    if (gv90Var != null) {
                        qkj qkjVar = (qkj) jrs0Var.e;
                        chf0 chf0VarB = qkjVar.b(gv90Var);
                        vv40 vv40Var = qkjVar.f28888a;
                        qkjVar.b.clear();
                        try {
                            try {
                                if (vv40Var.b == null) {
                                    i0g0Var = null;
                                    try {
                                        vv40Var.c(null);
                                    } catch (Exception unused) {
                                        vv40Var.reset();
                                        i0g0VarB = i0g0Var;
                                    }
                                } else {
                                    i0g0Var = null;
                                }
                                i0g0VarB = vv40Var.b(chf0VarB);
                                vv40Var.reset();
                            } catch (Throwable th) {
                                vv40Var.reset();
                                throw th;
                            }
                        } catch (Exception unused2) {
                            i0g0Var = null;
                        }
                        if (i0g0VarB != null) {
                            Log.d("jrs0", "Found barcode in " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
                            if (handler != null) {
                                lu5 lu5Var = new lu5();
                                lu5Var.f20658a = i0g0VarB;
                                lu5Var.b = fmk0Var;
                                Message messageObtain = Message.obtain(handler, R.id.zxing_decode_succeeded, lu5Var);
                                messageObtain.setData(new Bundle());
                                messageObtain.sendToTarget();
                            }
                        } else if (handler != null) {
                            Message.obtain(handler, R.id.zxing_decode_failed).sendToTarget();
                        }
                        if (handler != null) {
                            qkj qkjVar2 = (qkj) jrs0Var.e;
                            qkjVar2.getClass();
                            ArrayList<d3g0> arrayList2 = new ArrayList(qkjVar2.b);
                            arrayList = new ArrayList(arrayList2.size());
                            for (d3g0 d3g0Var : arrayList2) {
                                float f2 = d3g0Var.f5402a * 1.0f;
                                Rect rect3 = fmk0Var.d;
                                f = f2 + rect3.left;
                                float f3 = (d3g0Var.b * 1.0f) + rect3.top;
                                if (fmk0Var.e) {
                                    f = i3 - f;
                                }
                                arrayList.add(new d3g0(f, f3));
                            }
                            Message.obtain(handler, R.id.zxing_possible_result_points, arrayList).sendToTarget();
                        }
                        q0aVar.h.post(new o0a(q0aVar, yqcVar, (byte) 0));
                    } else {
                        i0g0Var = null;
                    }
                    i0g0VarB = i0g0Var;
                    if (i0g0VarB != null) {
                        Log.d("jrs0", "Found barcode in " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
                        if (handler != null) {
                            lu5 lu5Var2 = new lu5();
                            lu5Var2.f20658a = i0g0VarB;
                            lu5Var2.b = fmk0Var;
                            Message messageObtain2 = Message.obtain(handler, R.id.zxing_decode_succeeded, lu5Var2);
                            messageObtain2.setData(new Bundle());
                            messageObtain2.sendToTarget();
                        }
                    } else if (handler != null) {
                        Message.obtain(handler, R.id.zxing_decode_failed).sendToTarget();
                    }
                    if (handler != null) {
                        qkj qkjVar3 = (qkj) jrs0Var.e;
                        qkjVar3.getClass();
                        ArrayList<d3g0> arrayList3 = new ArrayList(qkjVar3.b);
                        arrayList = new ArrayList(arrayList3.size());
                        while (r5.hasNext()) {
                            float f4 = d3g0Var.f5402a * 1.0f;
                            Rect rect4 = fmk0Var.d;
                            f = f4 + rect4.left;
                            float f5 = (d3g0Var.b * 1.0f) + rect4.top;
                            if (fmk0Var.e) {
                                f = i3 - f;
                            }
                            arrayList.add(new d3g0(f, f5));
                        }
                        Message.obtain(handler, R.id.zxing_possible_result_points, arrayList).sendToTarget();
                    }
                    q0aVar.h.post(new o0a(q0aVar, yqcVar, (byte) 0));
                } else {
                    z = true;
                    if (i2 == R.id.zxing_preview_failed) {
                        q0aVar.h.post(new o0a(q0aVar, yqcVar, objArr == true ? 1 : 0));
                    }
                }
                return z;
            case 2:
                if (message.what != 0) {
                    return false;
                }
                n660 n660Var = (n660) this.b;
                sdk0 sdk0Var = (sdk0) message.obj;
                synchronized (n660Var.f22981a) {
                    if (((sdk0) n660Var.c) == sdk0Var || ((sdk0) n660Var.d) == sdk0Var) {
                        n660Var.c(sdk0Var, 2);
                    }
                    break;
                }
                return true;
            case 3:
                int i20 = message.arg1;
                if (Log.isLoggable("MessengerIpcClient", 3)) {
                    StringBuilder sb = new StringBuilder(String.valueOf(i20).length() + 30);
                    sb.append("Received response to request: ");
                    sb.append(i20);
                    Log.d("MessengerIpcClient", sb.toString());
                }
                d6x0 d6x0Var = (d6x0) this.b;
                synchronized (d6x0Var) {
                    try {
                        SparseArray sparseArray = d6x0Var.e;
                        f8x0 f8x0Var = (f8x0) sparseArray.get(i20);
                        if (f8x0Var != null) {
                            sparseArray.remove(i20);
                            d6x0Var.d();
                            Bundle data = message.getData();
                            if (!data.getBoolean("unsupported", false)) {
                                switch (f8x0Var.e) {
                                    case 0:
                                        if (data.getBoolean("ack", false)) {
                                            f8x0Var.b(null);
                                        } else {
                                            f8x0Var.c(new c44("Invalid response to one way request", null, (byte) 20));
                                        }
                                        break;
                                    default:
                                        Bundle bundle = data.getBundle(RemoteMessageConst.DATA);
                                        if (bundle == null) {
                                            bundle = Bundle.EMPTY;
                                        }
                                        f8x0Var.b(bundle);
                                        break;
                                }
                            } else {
                                f8x0Var.c(new c44("Not supported by GmsCore", null, (byte) 20));
                            }
                        } else {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(i20).length() + 39);
                            sb2.append("Received response for unknown request: ");
                            sb2.append(i20);
                            Log.w("MessengerIpcClient", sb2.toString());
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return true;
            default:
                int i21 = message.what;
                if (i21 == 0) {
                    d7x0 d7x0Var = (d7x0) this.b;
                    synchronized (d7x0Var.f5615a) {
                        try {
                            m3x0 m3x0Var = (m3x0) message.obj;
                            t4x0 t4x0Var = (t4x0) d7x0Var.f5615a.get(m3x0Var);
                            if (t4x0Var != null && t4x0Var.f33343a.isEmpty()) {
                                if (t4x0Var.c) {
                                    m3x0 m3x0Var2 = t4x0Var.e;
                                    d7x0 d7x0Var2 = t4x0Var.g;
                                    d7x0Var2.c.removeMessages(1, m3x0Var2);
                                    d7x0Var2.d.s(d7x0Var2.b, t4x0Var);
                                    t4x0Var.c = false;
                                    t4x0Var.b = (byte) 2;
                                }
                                d7x0Var.f5615a.remove(m3x0Var);
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                        break;
                    }
                    return true;
                }
                if (i21 != 1) {
                    return false;
                }
                d7x0 d7x0Var3 = (d7x0) this.b;
                synchronized (d7x0Var3.f5615a) {
                    try {
                        m3x0 m3x0Var3 = (m3x0) message.obj;
                        t4x0 t4x0Var2 = (t4x0) d7x0Var3.f5615a.get(m3x0Var3);
                        if (t4x0Var2 != null && t4x0Var2.b == 3) {
                            String strValueOf = String.valueOf(m3x0Var3);
                            StringBuilder sb3 = new StringBuilder(strValueOf.length() + 47);
                            sb3.append("Timeout waiting for ServiceConnection callback ");
                            sb3.append(strValueOf);
                            Log.e("GmsClientSupervisor", sb3.toString(), new Exception());
                            ComponentName componentName2 = t4x0Var2.f;
                            if (componentName2 == null) {
                                m3x0Var3.getClass();
                            } else {
                                componentName = componentName2;
                            }
                            if (componentName == null) {
                                m3x0Var3.getClass();
                                componentName = new ComponentName("com.google.android.gms", "unknown");
                            }
                            t4x0Var2.onServiceDisconnected(componentName);
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                    break;
                }
                return true;
        }
    }
}

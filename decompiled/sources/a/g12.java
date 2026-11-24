package a;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaCodec;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class g12 extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f10488a;
    public Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g12(Object obj, Looper looper, byte b) {
        super(looper);
        this.f10488a = b;
        this.b = obj;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int size;
        edu[] eduVarArr;
        switch (this.f10488a) {
            case 0:
                int i = message.what;
                if (i == -3 || i == -2 || i == -1) {
                    ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) ((WeakReference) this.b).get(), message.what);
                    return;
                } else {
                    if (i != 1) {
                        return;
                    }
                    ((DialogInterface) message.obj).dismiss();
                    return;
                }
            case 1:
                t04 t04Var = (t04) this.b;
                int i2 = message.what;
                s04 s04Var = null;
                if (i2 == 1) {
                    s04 s04Var2 = (s04) message.obj;
                    try {
                        t04Var.f33100a.queueInputBuffer(s04Var2.f31395a, 0, s04Var2.b, s04Var2.d, s04Var2.e);
                        break;
                    } catch (RuntimeException e) {
                        AtomicReference atomicReference = t04Var.d;
                        while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
                        }
                    }
                    s04Var = s04Var2;
                } else if (i2 == 2) {
                    s04 s04Var3 = (s04) message.obj;
                    int i3 = s04Var3.f31395a;
                    MediaCodec.CryptoInfo cryptoInfo = s04Var3.c;
                    long j = s04Var3.d;
                    int i4 = s04Var3.e;
                    try {
                        if (Build.VERSION.SDK_INT < 31) {
                            synchronized (t04.h) {
                                t04Var.f33100a.queueSecureInputBuffer(i3, 0, cryptoInfo, j, i4);
                            }
                        } else {
                            t04Var.f33100a.queueSecureInputBuffer(i3, 0, cryptoInfo, j, i4);
                        }
                        break;
                    } catch (RuntimeException e2) {
                        AtomicReference atomicReference2 = t04Var.d;
                        while (!atomicReference2.compareAndSet(null, e2) && atomicReference2.get() == null) {
                        }
                    }
                    s04Var = s04Var3;
                } else if (i2 == 3) {
                    t04Var.e.c();
                } else if (i2 != 4) {
                    AtomicReference atomicReference3 = t04Var.d;
                    IllegalStateException illegalStateException = new IllegalStateException(String.valueOf(i2));
                    while (!atomicReference3.compareAndSet(null, illegalStateException) && atomicReference3.get() == null) {
                    }
                } else {
                    try {
                        t04Var.f33100a.setParameters((Bundle) message.obj);
                        break;
                    } catch (RuntimeException e3) {
                        AtomicReference atomicReference4 = t04Var.d;
                        while (!atomicReference4.compareAndSet(null, e3) && atomicReference4.get() == null) {
                        }
                    }
                }
                if (s04Var != null) {
                    ArrayDeque arrayDeque = t04.g;
                    synchronized (arrayDeque) {
                        arrayDeque.add(s04Var);
                        break;
                    }
                    return;
                }
                return;
            default:
                if (message.what != 1) {
                    super.handleMessage(message);
                    return;
                }
                gr00 gr00Var = (gr00) this.b;
                while (true) {
                    synchronized (((HashMap) gr00Var.b)) {
                        try {
                            size = ((ArrayList) gr00Var.d).size();
                            if (size <= 0) {
                                return;
                            }
                            eduVarArr = new edu[size];
                            ((ArrayList) gr00Var.d).toArray(eduVarArr);
                            ((ArrayList) gr00Var.d).clear();
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    for (int i5 = 0; i5 < size; i5++) {
                        edu eduVar = eduVarArr[i5];
                        int size2 = ((ArrayList) eduVar.b).size();
                        for (int i6 = 0; i6 < size2; i6++) {
                            fr00 fr00Var = (fr00) ((ArrayList) eduVar.b).get(i6);
                            if (!fr00Var.d) {
                                fr00Var.b.onReceive((Context) gr00Var.f11760a, (Intent) eduVar.c);
                            }
                        }
                    }
                }
                break;
        }
    }

    public /* synthetic */ g12() {
        this.f10488a = (byte) 0;
    }
}

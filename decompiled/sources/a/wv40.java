package a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import androidx.room3.MultiInstanceInvalidationService;

/* JADX INFO: loaded from: classes.dex */
public final class wv40 extends Binder implements bvw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MultiInstanceInvalidationService f39823a;

    public wv40(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f39823a = multiInstanceInvalidationService;
        attachInterface(this, bvw.i);
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        yv40 yv40Var;
        String str = bvw.i;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        if (i == 16777215) {
            parcel2.writeNoException();
            parcel2.writeInt(1);
            return true;
        }
        int i3 = 0;
        zuw zuwVar = null;
        zuw zuwVar2 = null;
        if (i == 1) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(zuw.g);
                if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof zuw)) {
                    xuw xuwVar = new xuw();
                    xuwVar.f41531a = strongBinder;
                    zuwVar = xuwVar;
                } else {
                    zuwVar = (zuw) iInterfaceQueryLocalInterface;
                }
            }
            String string = parcel.readString();
            zuwVar.getClass();
            if (string != null) {
                MultiInstanceInvalidationService multiInstanceInvalidationService = this.f39823a;
                synchronized (multiInstanceInvalidationService.c) {
                    try {
                        int i4 = multiInstanceInvalidationService.f45405a + 1;
                        multiInstanceInvalidationService.f45405a = i4;
                        if (multiInstanceInvalidationService.c.register(zuwVar, Integer.valueOf(i4))) {
                            multiInstanceInvalidationService.b.put(Integer.valueOf(i4), string);
                            i3 = i4;
                        } else {
                            multiInstanceInvalidationService.f45405a--;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            parcel2.writeNoException();
            parcel2.writeInt(i3);
            return true;
        }
        if (i == 2) {
            IBinder strongBinder2 = parcel.readStrongBinder();
            if (strongBinder2 != null) {
                IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface(zuw.g);
                if (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof zuw)) {
                    xuw xuwVar2 = new xuw();
                    xuwVar2.f41531a = strongBinder2;
                    zuwVar2 = xuwVar2;
                } else {
                    zuwVar2 = (zuw) iInterfaceQueryLocalInterface2;
                }
            }
            int i5 = parcel.readInt();
            zuwVar2.getClass();
            MultiInstanceInvalidationService multiInstanceInvalidationService2 = this.f39823a;
            synchronized (multiInstanceInvalidationService2.c) {
                multiInstanceInvalidationService2.c.unregister(zuwVar2);
            }
            parcel2.writeNoException();
            return true;
        }
        if (i != 3) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        int i6 = parcel.readInt();
        String[] strArrCreateStringArray = parcel.createStringArray();
        strArrCreateStringArray.getClass();
        MultiInstanceInvalidationService multiInstanceInvalidationService3 = this.f39823a;
        synchronized (multiInstanceInvalidationService3.c) {
            String str2 = (String) multiInstanceInvalidationService3.b.get(Integer.valueOf(i6));
            if (str2 == null) {
                Log.w("ROOM", "Remote invalidation client ID not registered");
            } else {
                int iBeginBroadcast = multiInstanceInvalidationService3.c.beginBroadcast();
                while (true) {
                    yv40Var = multiInstanceInvalidationService3.c;
                    if (i3 >= iBeginBroadcast) {
                        break;
                    }
                    try {
                        Object broadcastCookie = yv40Var.getBroadcastCookie(i3);
                        broadcastCookie.getClass();
                        Integer num = (Integer) broadcastCookie;
                        int iIntValue = num.intValue();
                        String str3 = (String) multiInstanceInvalidationService3.b.get(num);
                        if (i6 != iIntValue && str2.equals(str3)) {
                            try {
                                ((zuw) multiInstanceInvalidationService3.c.getBroadcastItem(i3)).a(strArrCreateStringArray);
                            } catch (RemoteException e) {
                                Log.w("ROOM", "Error invoking a remote callback", e);
                            }
                        }
                        i3++;
                    } catch (Throwable th2) {
                        multiInstanceInvalidationService3.c.finishBroadcast();
                        throw th2;
                    }
                }
                yv40Var.finishBroadcast();
            }
        }
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}

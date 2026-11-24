package a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.MultiInstanceInvalidationService;

/* JADX INFO: loaded from: classes.dex */
public final class xv40 extends Binder implements cvw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MultiInstanceInvalidationService f41540a;

    public xv40(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f41540a = multiInstanceInvalidationService;
        attachInterface(this, cvw.j);
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        yv40 yv40Var;
        String str = cvw.j;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        int i3 = 0;
        avw avwVar = null;
        avw avwVar2 = null;
        if (i == 1) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(avw.h);
                if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof avw)) {
                    yuw yuwVar = new yuw();
                    yuwVar.f43289a = strongBinder;
                    avwVar = yuwVar;
                } else {
                    avwVar = (avw) iInterfaceQueryLocalInterface;
                }
            }
            String string = parcel.readString();
            avwVar.getClass();
            if (string != null) {
                MultiInstanceInvalidationService multiInstanceInvalidationService = this.f41540a;
                synchronized (multiInstanceInvalidationService.c) {
                    try {
                        int i4 = multiInstanceInvalidationService.f45404a + 1;
                        multiInstanceInvalidationService.f45404a = i4;
                        if (multiInstanceInvalidationService.c.register(avwVar, Integer.valueOf(i4))) {
                            multiInstanceInvalidationService.b.put(Integer.valueOf(i4), string);
                            i3 = i4;
                        } else {
                            multiInstanceInvalidationService.f45404a--;
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
                IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface(avw.h);
                if (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof avw)) {
                    yuw yuwVar2 = new yuw();
                    yuwVar2.f43289a = strongBinder2;
                    avwVar2 = yuwVar2;
                } else {
                    avwVar2 = (avw) iInterfaceQueryLocalInterface2;
                }
            }
            int i5 = parcel.readInt();
            avwVar2.getClass();
            MultiInstanceInvalidationService multiInstanceInvalidationService2 = this.f41540a;
            synchronized (multiInstanceInvalidationService2.c) {
                multiInstanceInvalidationService2.c.unregister(avwVar2);
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
        MultiInstanceInvalidationService multiInstanceInvalidationService3 = this.f41540a;
        synchronized (multiInstanceInvalidationService3.c) {
            try {
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
                                    ((avw) multiInstanceInvalidationService3.c.getBroadcastItem(i3)).a(strArrCreateStringArray);
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
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}

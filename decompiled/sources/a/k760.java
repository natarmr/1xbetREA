package a;

import android.app.Notification;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public final class k760 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17804a;
    public final int b;
    public final Notification c;

    public k760(String str, int i, Notification notification) {
        this.f17804a = str;
        this.b = i;
        this.c = notification;
    }

    public final void a(fvw fvwVar) {
        String str = this.f17804a;
        int i = this.b;
        Notification notification = this.c;
        dvw dvwVar = (dvw) fvwVar;
        dvwVar.getClass();
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(fvw.k);
            parcelObtain.writeString(str);
            parcelObtain.writeInt(i);
            parcelObtain.writeString(null);
            parcelObtain.writeTypedObject(notification, 0);
            if (!dvwVar.f6765a.transact(1, parcelObtain, null, 1)) {
                throw new RemoteException("Method notify is unimplemented.");
            }
            parcelObtain.recycle();
        } catch (Throwable th) {
            parcelObtain.recycle();
            throw th;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotifyTask[packageName:");
        sb.append(this.f17804a);
        sb.append(", id:");
        return rz4.j(this.b, ", tag:null]", sb);
    }
}

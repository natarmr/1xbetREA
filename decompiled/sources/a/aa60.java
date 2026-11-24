package a;

import android.os.IBinder;
import android.os.IInterface;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes2.dex */
public final class aa60 extends f9w0 implements gvw {
    public final Object b;

    public aa60(Object obj) {
        super("com.google.android.gms.dynamic.IObjectWrapper", (byte) 2);
        this.b = obj;
    }

    public static gvw G(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
        return iInterfaceQueryLocalInterface instanceof gvw ? (gvw) iInterfaceQueryLocalInterface : new gmw0(iBinder, "com.google.android.gms.dynamic.IObjectWrapper", (byte) 3);
    }

    public static Object H(gvw gvwVar) {
        if (gvwVar instanceof aa60) {
            return ((aa60) gvwVar).b;
        }
        IBinder iBinderAsBinder = gvwVar.asBinder();
        Field[] declaredFields = iBinderAsBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i != 1) {
            int length = declaredFields.length;
            jf4.o(b1j.h(length, "Unexpected number of IObjectWrapper declared fields: ", new StringBuilder(String.valueOf(length).length() + 53)));
            return null;
        }
        s0x.H(field);
        if (field.isAccessible()) {
            jf4.o("IObjectWrapper declared field not private!");
            return null;
        }
        field.setAccessible(true);
        try {
            return field.get(iBinderAsBinder);
        } catch (IllegalAccessException e) {
            e9d0.t("Could not access the field in remoteBinder.", e);
            return null;
        } catch (NullPointerException e2) {
            e9d0.t("Binder object is null.", e2);
            return null;
        }
    }
}

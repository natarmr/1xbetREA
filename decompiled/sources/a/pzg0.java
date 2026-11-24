package a;

import android.os.IBinder;
import android.os.Parcelable;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public abstract class pzg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ugi0 f27844a;
    public static final ugi0 b;
    public static final ugi0 c;
    public static final ugi0 d;
    public static final uw3 e;
    public static final uw3 f;
    public static final uw3 g;
    public static final uw3 h;
    public static final uw3 i;
    public static final uw3 j;
    public static final uw3 k;
    public static final uw3 l;
    public static final ugi0 m;
    public static final ugi0 n;
    public static final ugi0 o;

    static {
        tre0 tre0Var = sre0.f32672a;
        f27844a = new uua0(tre0Var.b(CharSequence.class)).getDescriptor();
        b = new uua0(tre0Var.b(Parcelable.class)).getDescriptor();
        c = new uua0(tre0Var.b(Serializable.class)).getDescriptor();
        d = new uua0(tre0Var.b(IBinder.class)).getDescriptor();
        lwj lwjVar = lwj.b;
        e = mrv.k(tre0Var.b(Parcelable.class), lwjVar).c;
        f = mrv.k(tre0Var.b(Parcelable.class), new uua0(tre0Var.b(Parcelable.class))).c;
        g = new uw3(lwjVar.getDescriptor(), (byte) 1);
        ugi0 descriptor = new uua0(tre0Var.b(Parcelable.class)).getDescriptor();
        descriptor.getClass();
        h = new uw3(descriptor, (byte) 1);
        i = mrv.k(tre0Var.b(CharSequence.class), lvb.f20706a).c;
        j = mrv.k(tre0Var.b(CharSequence.class), new uua0(tre0Var.b(CharSequence.class))).c;
        wgi0 wgi0Var = lvb.b;
        wgi0Var.getClass();
        k = new uw3(wgi0Var, (byte) 1);
        ugi0 descriptor2 = new uua0(tre0Var.b(CharSequence.class)).getDescriptor();
        descriptor2.getClass();
        l = new uw3(descriptor2, (byte) 1);
        ink0 ink0Var = jnk0.Companion;
        m = ink0Var.serializer(lwjVar).getDescriptor();
        n = ink0Var.serializer(new uua0(tre0Var.b(Parcelable.class))).getDescriptor();
        o = ink0Var.serializer(mrv.j0(new uua0(tre0Var.b(Parcelable.class)))).getDescriptor();
    }
}

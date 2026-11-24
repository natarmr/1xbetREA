package a;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class ro implements u6v {
    public static Class b;
    public static boolean c;
    public static Method d;
    public static boolean e;
    public static Method f;
    public static boolean g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f30812a;

    public static void b() {
        if (c) {
            return;
        }
        try {
            b = Class.forName("android.view.GhostView");
        } catch (ClassNotFoundException e2) {
            Log.i("GhostViewApi21", "Failed to retrieve GhostView class", e2);
        }
        c = true;
    }

    @Override // a.u6v
    public void setVisibility(int i) {
        this.f30812a.setVisibility(i);
    }

    @Override // a.u6v
    public void a(View view, ViewGroup viewGroup) {
    }
}

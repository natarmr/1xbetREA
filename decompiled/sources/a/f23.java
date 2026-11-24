package a;

import android.R;
import android.app.PendingIntent;
import android.app.RemoteAction;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.textclassifier.TextClassification;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class f23 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g23 f8794a;
    public final d23 b;
    public final d23 c;
    public final View d;

    public f23(g23 g23Var, d23 d23Var, d23 d23Var2, View view) {
        this.f8794a = g23Var;
        this.b = d23Var;
        this.c = d23Var2;
        this.d = view;
    }

    public final boolean a(Menu menu) {
        int i;
        int i2;
        u4q0 u4q0Var = (u4q0) this.b.invoke();
        final byte b = 0;
        if (Intrinsics.d(u4q0Var, null)) {
            return false;
        }
        menu.clear();
        List list = u4q0Var.f35064a;
        int size = list.size();
        final byte b2 = 1;
        int i3 = 0;
        int i4 = 1;
        int i5 = 1;
        while (i3 < size) {
            t4q0 t4q0Var = (t4q0) list.get(i3);
            if (t4q0Var instanceof b5q0) {
                i = i4 + 1;
                Object obj = t4q0Var.f33334a;
                if (Intrinsics.d(obj, saj.m)) {
                    i2 = R.id.cut;
                } else if (Intrinsics.d(obj, saj.n)) {
                    i2 = R.id.copy;
                } else if (Intrinsics.d(obj, saj.o)) {
                    i2 = R.id.paste;
                } else if (Intrinsics.d(obj, saj.p)) {
                    i2 = R.id.selectAll;
                } else {
                    i2 = Intrinsics.d(obj, saj.q) ? R.id.autofill : i4;
                }
                final b5q0 b5q0Var = (b5q0) t4q0Var;
                MenuItem menuItemAdd = menu.add(i5, i2, i4, b5q0Var.b);
                menuItemAdd.setShowAsAction(2);
                menuItemAdd.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: a.e23
                    @Override // android.view.MenuItem.OnMenuItemClickListener
                    public final boolean onMenuItemClick(MenuItem menuItem) {
                        byte b3 = b;
                        Object obj2 = this;
                        Object obj3 = b5q0Var;
                        switch (b3) {
                            case 0:
                                ((b5q0) obj3).d.invoke(((f23) obj2).f8794a);
                                break;
                            default:
                                Context context = (Context) obj3;
                                TextClassification textClassification = (TextClassification) obj2;
                                String text = textClassification.getText();
                                btm0.u(PendingIntent.getActivity(context, text != null ? text.hashCode() : 0, textClassification.getIntent(), 201326592));
                                break;
                        }
                        return true;
                    }
                });
            } else {
                if (t4q0Var instanceof h5q0) {
                    if (Build.VERSION.SDK_INT >= 28) {
                        i = i4 + 1;
                        final Context context = this.d.getContext();
                        h5q0 h5q0Var = (h5q0) t4q0Var;
                        final TextClassification textClassification = h5q0Var.b;
                        int i6 = h5q0Var.c;
                        Drawable drawable = h5q0Var.d;
                        if (i6 < 0) {
                            MenuItem menuItemAdd2 = menu.add(R.id.textAssist, R.id.textAssist, i4, textClassification.getLabel());
                            menuItemAdd2.setShowAsAction(2);
                            menuItemAdd2.setIcon(drawable);
                            menuItemAdd2.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: a.e23
                                @Override // android.view.MenuItem.OnMenuItemClickListener
                                public final boolean onMenuItemClick(MenuItem menuItem) {
                                    byte b3 = b2;
                                    Object obj2 = textClassification;
                                    Object obj3 = context;
                                    switch (b3) {
                                        case 0:
                                            ((b5q0) obj3).d.invoke(((f23) obj2).f8794a);
                                            break;
                                        default:
                                            Context context2 = (Context) obj3;
                                            TextClassification textClassification2 = (TextClassification) obj2;
                                            String text = textClassification2.getText();
                                            btm0.u(PendingIntent.getActivity(context2, text != null ? text.hashCode() : 0, textClassification2.getIntent(), 201326592));
                                            break;
                                    }
                                    return true;
                                }
                            });
                        } else {
                            byte b3 = i6 == 0 ? (byte) 1 : b;
                            final RemoteAction remoteActionC = jw90.c(textClassification.getActions().get(i6));
                            MenuItem menuItemAdd3 = menu.add(R.id.textAssist, b3 != 0 ? 16908353 : b, i4, remoteActionC.getTitle());
                            menuItemAdd3.setShowAsAction(b3 == 0 ? 0 : 2);
                            if (drawable != null) {
                                menuItemAdd3.setIcon(drawable);
                            }
                            menuItemAdd3.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: a.baq0
                                @Override // android.view.MenuItem.OnMenuItemClickListener
                                public final boolean onMenuItemClick(MenuItem menuItem) {
                                    btm0.u(remoteActionC.getActionIntent());
                                    return true;
                                }
                            });
                        }
                    }
                } else if (t4q0Var instanceof f5q0) {
                    i5++;
                }
                i3++;
                b = 0;
            }
            i4 = i;
            i3++;
            b = 0;
        }
        return true;
    }
}

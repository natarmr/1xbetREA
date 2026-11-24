package a;

import android.widget.AbsListView;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public abstract class gil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Field f11353a;

    static {
        Field declaredField = null;
        try {
            declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        f11353a = declaredField;
    }
}

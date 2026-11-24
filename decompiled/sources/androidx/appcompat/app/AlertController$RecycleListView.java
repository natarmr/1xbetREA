package androidx.appcompat.app;

import a.mqd0;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;

/* JADX INFO: loaded from: classes.dex */
public class AlertController$RecycleListView extends ListView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f45282a;
    public final int b;

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, mqd0.t);
        this.b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, -1);
        this.f45282a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, -1);
    }

    public AlertController$RecycleListView(Context context) {
        this(context, null);
    }
}

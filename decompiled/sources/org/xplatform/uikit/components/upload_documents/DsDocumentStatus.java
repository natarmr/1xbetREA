package org.xplatform.uikit.components.upload_documents;

import a.bqd0;
import a.e0g0;
import a.hny;
import a.j0g0;
import a.kyk;
import a.m5d;
import a.vd7;
import a.yum0;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.xbet.client1.R;
import org.xplatform.uikit.components.views.LoadableImageView;

/* JADX INFO: loaded from: classes6.dex */
public final class DsDocumentStatus extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vd7 f47282a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DsDocumentStatus(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        LayoutInflater.from(context).inflate(R.layout.document_status_view, this);
        int i = R.id.icon;
        LoadableImageView loadableImageView = (LoadableImageView) yum0.f(this, R.id.icon);
        if (loadableImageView != null) {
            i = R.id.title;
            TextView textView = (TextView) yum0.f(this, R.id.title);
            if (textView != null) {
                this.f47282a = new vd7(this, loadableImageView, textView, (byte) 9);
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bqd0.H, 0, 0);
                try {
                    e0g0 e0g0Var = j0g0.b;
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, 0);
                    if (resourceId != 0) {
                        kyk kykVar = (kyk) kyk.d.get(typedArrayObtainStyledAttributes.getInt(0, -1));
                        kykVar.getClass();
                        setIcon(kykVar.f19108a);
                        setTextColor(kykVar.b);
                        setTitle(resourceId);
                    } else {
                        kyk kykVar2 = (kyk) kyk.d.get(typedArrayObtainStyledAttributes.getInt(0, -1));
                        String string = typedArrayObtainStyledAttributes.getString(1);
                        string = string == null ? "" : string;
                        kykVar2.getClass();
                        setIcon(kykVar2.f19108a);
                        setTextColor(kykVar2.b);
                        setTitle(string);
                    }
                } catch (Throwable unused) {
                    e0g0 e0g0Var2 = j0g0.b;
                }
                typedArrayObtainStyledAttributes.recycle();
                return;
            }
        }
        hny.u("Missing required view with ID: ".concat(getResources().getResourceName(i)));
        throw null;
    }

    private final void setIcon(int i) {
        ((LoadableImageView) this.f47282a.c).setImageResource(i);
    }

    private final void setTextColor(int i) {
        TextView textView = (TextView) this.f47282a.d;
        Context context = textView.getContext();
        context.getClass();
        textView.setTextColor(m5d.c(i, context));
    }

    public final void setStatus(kyk kykVar) {
        kykVar.getClass();
        setIcon(kykVar.f19108a);
        setTextColor(kykVar.b);
    }

    public final void setTitle(int i) {
        String string = getContext().getString(i);
        string.getClass();
        setTitle(string);
    }

    public final void setTitle(String str) {
        str.getClass();
        ((TextView) this.f47282a.d).setText(str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsDocumentStatus(Context context) {
        this(context, null);
        context.getClass();
    }
}

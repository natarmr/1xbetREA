package a;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.TextView;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;
import org.xplatform.uikit.components.views.LoadableShapeableImageView;

/* JADX INFO: loaded from: classes6.dex */
public final class o3b extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function0 f24575a;
    public final vd7 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3b(Context context, ntl ntlVar) {
        super(context, null);
        context.getClass();
        ntlVar.getClass();
        this.f24575a = ntlVar;
        LayoutInflater.from(context).inflate(R.layout.category_card_collection, this);
        int i = R.id.uikitCategoryCardLabel;
        TextView textView = (TextView) yum0.f(this, R.id.uikitCategoryCardLabel);
        if (textView != null) {
            i = R.id.uikitCategoryCardPicture;
            LoadableShapeableImageView loadableShapeableImageView = (LoadableShapeableImageView) yum0.f(this, R.id.uikitCategoryCardPicture);
            if (loadableShapeableImageView != null) {
                this.b = new vd7(this, textView, loadableShapeableImageView, (byte) 1);
                return;
            }
        }
        hny.u("Missing required view with ID: ".concat(getResources().getResourceName(i)));
        throw null;
    }

    public final void setLabel(String str) {
        str.getClass();
        ((TextView) this.b.c).setText(str);
    }

    public final void setModel(p3b p3bVar) {
        p3bVar.getClass();
        setPicture(p3bVar.b);
        setLabel(p3bVar.c);
    }

    public final void setPicture(o0x o0xVar) {
        o0xVar.getClass();
        ((LoadableShapeableImageView) this.b.d).h(o0xVar, (o0x) this.f24575a.invoke(), new w800((byte) 20), new w800((byte) 21));
    }
}

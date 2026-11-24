package org.xplatform.uikit_web_games.game_collection_section;

import a.a3v0;
import a.a5s;
import a.dqd0;
import a.ktt0;
import a.m5d;
import a.u4s;
import a.x2v0;
import a.xdr;
import a.y2v0;
import a.z2v0;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import org.xbet.client1.R;
import org.xplatform.uikit.components.header.DsHeader;

/* JADX INFO: loaded from: classes6.dex */
public final class WebGamesGameCollectionSection extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public FrameLayout f47307a;

    /* JADX WARN: Illegal instructions before constructor call */
    public WebGamesGameCollectionSection(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, dqd0.b, 0, 0);
        int iB = m5d.b(R.attr.uikitStaticTeal, context);
        String strP = ktt0.p(typedArrayObtainStyledAttributes, context, 4);
        String strP2 = ktt0.p(typedArrayObtainStyledAttributes, context, 0);
        setHeaderTitle(ktt0.p(typedArrayObtainStyledAttributes, context, 5));
        setButtonText(strP2);
        setTagText(strP);
        setTagColor(iB);
        typedArrayObtainStyledAttributes.recycle();
    }

    private final void setTagColor(int i) {
        FrameLayout frameLayout = this.f47307a;
        if (frameLayout == null) {
            return;
        }
        if (frameLayout instanceof y2v0) {
            ((y2v0) frameLayout).setTagColor(i);
        } else if (frameLayout instanceof z2v0) {
            ((z2v0) frameLayout).setTagColor(i);
        }
    }

    public final RecyclerView getCollectionRecycler() {
        ViewParent viewParent = this.f47307a;
        a5s a5sVar = viewParent != null ? (a5s) viewParent : null;
        if (a5sVar != null) {
            return a5sVar.getCollectionRecycler();
        }
        return null;
    }

    public final DsHeader getHeader() {
        ViewParent viewParent = this.f47307a;
        a5s a5sVar = viewParent != null ? (a5s) viewParent : null;
        if (a5sVar != null) {
            return a5sVar.getHeader();
        }
        return null;
    }

    public final void setButtonText(CharSequence charSequence) {
        FrameLayout frameLayout = this.f47307a;
        if (frameLayout == null) {
            return;
        }
        if (frameLayout instanceof y2v0) {
            ((y2v0) frameLayout).setButtonText(charSequence);
        } else if (frameLayout instanceof z2v0) {
            ((z2v0) frameLayout).setButtonText(charSequence);
        }
    }

    public final void setHeaderTitle(CharSequence charSequence) {
        FrameLayout frameLayout = this.f47307a;
        if (frameLayout == null) {
            return;
        }
        if (frameLayout instanceof y2v0) {
            ((y2v0) frameLayout).setHeaderTitle(charSequence);
        } else if (frameLayout instanceof z2v0) {
            ((z2v0) frameLayout).setHeaderTitle(charSequence);
        }
    }

    public final void setItems(List<u4s> list) {
        list.getClass();
        FrameLayout frameLayout = this.f47307a;
        if (frameLayout == null) {
            return;
        }
        if (frameLayout instanceof x2v0) {
            ((x2v0) frameLayout).setItems(list);
            return;
        }
        if (frameLayout instanceof y2v0) {
            ((y2v0) frameLayout).setItems(list);
        } else if (frameLayout instanceof z2v0) {
            ((z2v0) frameLayout).setItems(list);
        } else if (frameLayout instanceof a3v0) {
            ((a3v0) frameLayout).setItems(list);
        }
    }

    public final void setOnButtonClickListener(View.OnClickListener onClickListener) {
        onClickListener.getClass();
        FrameLayout frameLayout = this.f47307a;
        if (frameLayout == null) {
            return;
        }
        if (frameLayout instanceof y2v0) {
            ((y2v0) frameLayout).setOnButtonClickListener(onClickListener);
        } else if (frameLayout instanceof z2v0) {
            ((z2v0) frameLayout).setOnButtonClickListener(onClickListener);
        }
    }

    public final void setOnItemClickListener(xdr xdrVar) {
        xdrVar.getClass();
        FrameLayout frameLayout = this.f47307a;
        if (frameLayout == null) {
            return;
        }
        if (frameLayout instanceof x2v0) {
            ((x2v0) frameLayout).setOnItemClickListener(xdrVar);
            return;
        }
        if (frameLayout instanceof y2v0) {
            ((y2v0) frameLayout).setOnItemClickListener(xdrVar);
        } else if (frameLayout instanceof z2v0) {
            ((z2v0) frameLayout).setOnItemClickListener(xdrVar);
        } else if (frameLayout instanceof a3v0) {
            ((a3v0) frameLayout).setOnItemClickListener(xdrVar);
        }
    }

    public final void setOnTagClickListener(View.OnClickListener onClickListener) {
        onClickListener.getClass();
        FrameLayout frameLayout = this.f47307a;
        if (frameLayout == null) {
            return;
        }
        if (frameLayout instanceof y2v0) {
            ((y2v0) frameLayout).setOnTagClickListener(onClickListener);
        } else if (frameLayout instanceof z2v0) {
            ((z2v0) frameLayout).setOnTagClickListener(onClickListener);
        }
    }

    public final void setTagText(CharSequence charSequence) {
        FrameLayout frameLayout = this.f47307a;
        if (frameLayout == null) {
            return;
        }
        if (frameLayout instanceof y2v0) {
            ((y2v0) frameLayout).setTagText(charSequence);
        } else if (frameLayout instanceof z2v0) {
            ((z2v0) frameLayout).setTagText(charSequence);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WebGamesGameCollectionSection(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WebGamesGameCollectionSection(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}

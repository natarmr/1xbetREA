package a;

import android.view.View;
import org.xplatform.uikit.components.buttons.DsButton;
import org.xplatform.uikit.components.tag.DsTag;

/* JADX INFO: loaded from: classes6.dex */
public interface w0i {
    void a(o0x o0xVar, l0x l0xVar);

    void b(boolean z);

    void c();

    DsButton getButton();

    String getLabelText();

    DsTag getTag();

    void setButtonClickListener(View.OnClickListener onClickListener);

    void setButtonLabel(CharSequence charSequence);

    void setCounter(Integer num);

    void setIconColor(Integer num);

    void setLabel(CharSequence charSequence);

    void setLabelClickListener(View.OnClickListener onClickListener);

    void setLabelColor(Integer num);

    void setModel(prv prvVar);

    void setTagClickListener(View.OnClickListener onClickListener);

    void setTagColor(Integer num);

    void setTagLabel(CharSequence charSequence);

    void setTagStyle(int i);
}

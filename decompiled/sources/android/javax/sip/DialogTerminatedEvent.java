package android.javax.sip;

import java.util.EventObject;

/* JADX INFO: loaded from: classes.dex */
public class DialogTerminatedEvent extends EventObject {
    private Dialog m_dialog;

    public DialogTerminatedEvent(Object obj, Dialog dialog) {
        super(obj);
        this.m_dialog = dialog;
    }

    public Dialog getDialog() {
        return this.m_dialog;
    }
}

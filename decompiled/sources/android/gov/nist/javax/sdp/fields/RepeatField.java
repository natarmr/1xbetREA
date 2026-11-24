package android.gov.nist.javax.sdp.fields;

import a.ohq;
import a.qqp;
import a.wch0;
import android.gov.nist.core.GenericObject;
import android.gov.nist.core.Separators;
import java.util.LinkedList;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public class RepeatField extends SDPField implements qqp {
    private static final long serialVersionUID = -6415338212212641819L;
    protected TypedTime activeDuration;
    protected SDPObjectList offsets;
    protected TypedTime repeatInterval;

    public RepeatField() {
        super(SDPFieldNames.REPEAT_FIELD);
        this.offsets = new SDPObjectList();
    }

    public void addOffset(TypedTime typedTime) {
        this.offsets.add((SDPObject) typedTime);
    }

    @Override // android.gov.nist.core.GenericObject
    public Object clone() {
        RepeatField repeatField = (RepeatField) super.clone();
        TypedTime typedTime = this.repeatInterval;
        if (typedTime != null) {
            repeatField.repeatInterval = (TypedTime) typedTime.clone();
        }
        TypedTime typedTime2 = this.activeDuration;
        if (typedTime2 != null) {
            repeatField.activeDuration = (TypedTime) typedTime2.clone();
        }
        SDPObjectList sDPObjectList = this.offsets;
        if (sDPObjectList != null) {
            repeatField.offsets = (SDPObjectList) sDPObjectList.clone();
        }
        return repeatField;
    }

    @Override // android.gov.nist.javax.sdp.fields.SDPField, android.gov.nist.javax.sdp.fields.SDPObject, android.gov.nist.core.GenericObject
    public String encode() {
        StringBuilder sb = new StringBuilder(SDPFieldNames.REPEAT_FIELD);
        sb.append(this.repeatInterval.encode());
        sb.append(Separators.SP);
        sb.append(this.activeDuration.encode());
        ListIterator<GenericObject> listIterator = this.offsets.listIterator();
        while (listIterator.hasNext()) {
            TypedTime typedTime = (TypedTime) listIterator.next();
            sb.append(Separators.SP);
            sb.append(typedTime.encode());
        }
        sb.append(Separators.NEWLINE);
        return sb.toString();
    }

    public int getActiveDuration() {
        TypedTime typedTime = this.activeDuration;
        if (typedTime == null) {
            return -1;
        }
        return typedTime.getTime();
    }

    public int[] getOffsetArray() {
        LinkedList offsets = getOffsets();
        int[] iArr = new int[offsets.size()];
        for (int i = 0; i < offsets.size(); i++) {
            iArr[i] = ((TypedTime) offsets.get(i)).getTime();
        }
        return iArr;
    }

    public LinkedList getOffsets() {
        return this.offsets;
    }

    public int getRepeatInterval() {
        TypedTime typedTime = this.repeatInterval;
        if (typedTime == null) {
            return -1;
        }
        return typedTime.getTime();
    }

    public boolean getTypedTime() {
        return true;
    }

    public void setActiveDuration(int i) throws wch0 {
        if (i < 0) {
            ohq.s("The active Duration is <0");
            return;
        }
        TypedTime typedTime = this.activeDuration;
        if (typedTime == null) {
            typedTime = new TypedTime();
            this.activeDuration = typedTime;
        }
        typedTime.setTime(i);
    }

    public void setOffsetArray(int[] iArr) {
        for (int i : iArr) {
            TypedTime typedTime = new TypedTime();
            typedTime.setTime(i);
            addOffset(typedTime);
        }
    }

    public void setRepeatInterval(int i) throws wch0 {
        if (i < 0) {
            ohq.s("The repeat interval is <0");
            return;
        }
        TypedTime typedTime = this.repeatInterval;
        if (typedTime == null) {
            typedTime = new TypedTime();
            this.repeatInterval = typedTime;
        }
        typedTime.setTime(i);
    }

    public void setTypedTime(boolean z) {
    }

    public void setActiveDuration(TypedTime typedTime) {
        this.activeDuration = typedTime;
    }

    public void setRepeatInterval(TypedTime typedTime) {
        this.repeatInterval = typedTime;
    }
}

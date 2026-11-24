package a;

import android.media.AudioDeviceInfo;
import android.media.AudioProfile;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class nnk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final rcf0 f23827a = b4x.t(12);

    public static b4x a(AudioDeviceInfo audioDeviceInfo) {
        List audioProfiles = audioDeviceInfo.getAudioProfiles();
        TreeSet treeSet = new TreeSet(Comparator.comparing(new t24((byte) 0)).reversed());
        Iterator it = audioProfiles.iterator();
        while (it.hasNext()) {
            AudioProfile audioProfileJ = ow2.j(it.next());
            if (audioProfileJ.getEncapsulationType() != 1 && vtt0.I(audioProfileJ.getFormat())) {
                for (int i : audioProfileJ.getChannelMasks()) {
                    treeSet.add(Integer.valueOf(i));
                }
            }
        }
        return b4x.o(treeSet);
    }
}

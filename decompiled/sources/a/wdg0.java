package a;

/* JADX INFO: loaded from: classes.dex */
public abstract class wdg0 {
    public void a(w7r w7rVar) {
        w7rVar.getClass();
        w7rVar.a();
        try {
            w7rVar.l("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < " + (System.currentTimeMillis() - 86400000) + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
            w7rVar.r();
        } finally {
            w7rVar.k();
        }
    }
}

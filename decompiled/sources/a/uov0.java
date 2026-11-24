package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import androidx.work.impl.WorkDatabase_Impl;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public final class uov0 extends pa80 {
    public final /* synthetic */ WorkDatabase_Impl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uov0(WorkDatabase_Impl workDatabase_Impl) {
        super(24, "08b926448d86528e697981ddd30459f7", "149fd8ad55885d3fe3549a37a0163243");
        this.d = workDatabase_Impl;
    }

    @Override // a.pa80
    public final void a(qpg0 qpg0Var) {
        qpg0Var.getClass();
        n2x.x(qpg0Var, "CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        n2x.x(qpg0Var, "CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
        n2x.x(qpg0Var, "CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
        n2x.x(qpg0Var, "CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `trace_tag` TEXT, `backoff_on_system_interruptions` INTEGER, `required_network_type` INTEGER NOT NULL, `required_network_request` BLOB NOT NULL DEFAULT x'', `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
        n2x.x(qpg0Var, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
        n2x.x(qpg0Var, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
        n2x.x(qpg0Var, "CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        n2x.x(qpg0Var, "CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
        n2x.x(qpg0Var, "CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        n2x.x(qpg0Var, "CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        n2x.x(qpg0Var, "CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
        n2x.x(qpg0Var, "CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        n2x.x(qpg0Var, "CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        n2x.x(qpg0Var, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        n2x.x(qpg0Var, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '08b926448d86528e697981ddd30459f7')");
    }

    @Override // a.pa80
    public final void c(qpg0 qpg0Var) {
        qpg0Var.getClass();
        n2x.x(qpg0Var, "DROP TABLE IF EXISTS `Dependency`");
        n2x.x(qpg0Var, "DROP TABLE IF EXISTS `WorkSpec`");
        n2x.x(qpg0Var, "DROP TABLE IF EXISTS `WorkTag`");
        n2x.x(qpg0Var, "DROP TABLE IF EXISTS `SystemIdInfo`");
        n2x.x(qpg0Var, "DROP TABLE IF EXISTS `WorkName`");
        n2x.x(qpg0Var, "DROP TABLE IF EXISTS `WorkProgress`");
        n2x.x(qpg0Var, "DROP TABLE IF EXISTS `Preference`");
    }

    @Override // a.pa80
    public final void s(qpg0 qpg0Var) {
        qpg0Var.getClass();
    }

    @Override // a.pa80
    public final void t(qpg0 qpg0Var) {
        qpg0Var.getClass();
        n2x.x(qpg0Var, "PRAGMA foreign_keys = ON");
        mox moxVarG = this.d.g();
        krs0 krs0Var = moxVarG.b;
        krs0Var.getClass();
        xpg0 xpg0VarZ0 = qpg0Var.Z0("PRAGMA query_only");
        try {
            xpg0VarZ0.W0();
            boolean zB0 = xpg0VarZ0.B0();
            ay3.L(xpg0VarZ0, null);
            if (!zB0) {
                n2x.x(qpg0Var, "PRAGMA temp_store = MEMORY");
                n2x.x(qpg0Var, "PRAGMA recursive_triggers = 1");
                n2x.x(qpg0Var, "DROP TABLE IF EXISTS room_table_modification_log");
                if (krs0Var.f18784a) {
                    n2x.x(qpg0Var, "CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                } else {
                    n2x.x(qpg0Var, kotlin.text.c.r("CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)", "TEMP", "", false));
                }
                o24 o24Var = (o24) krs0Var.h;
                ReentrantLock reentrantLock = (ReentrantLock) o24Var.b;
                reentrantLock.lock();
                try {
                    o24Var.f24513a = true;
                    reentrantLock.unlock();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
            synchronized (moxVarG.h) {
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                ay3.L(xpg0VarZ0, th2);
                throw th3;
            }
        }
    }

    @Override // a.pa80
    public final void u(qpg0 qpg0Var) {
        qpg0Var.getClass();
    }

    @Override // a.pa80
    public final void v(qpg0 qpg0Var) {
        qpg0Var.getClass();
        lc00 lc00VarB = kotlin.collections.a.b();
        xpg0 xpg0VarZ0 = qpg0Var.Z0("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (xpg0VarZ0.W0()) {
            try {
                lc00VarB.add(xpg0VarZ0.J0(0));
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    ay3.L(xpg0VarZ0, th);
                    throw th2;
                }
            }
        }
        ay3.L(xpg0VarZ0, null);
        ListIterator listIterator = kotlin.collections.a.a(lc00VarB).listIterator(0);
        while (true) {
            paw pawVar = (paw) listIterator;
            if (!pawVar.hasNext()) {
                return;
            }
            String str = (String) pawVar.next();
            if (kotlin.text.c.x(str, "room_fts_content_sync_", false)) {
                n2x.x(qpg0Var, "DROP TRIGGER IF EXISTS ".concat(str));
            }
        }
    }

    @Override // a.pa80
    public final t40 w(qpg0 qpg0Var) {
        qpg0Var.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("work_spec_id", new ujo0(1, 1, "work_spec_id", "TEXT", null, true));
        linkedHashMap.put("prerequisite_id", new ujo0(2, 1, "prerequisite_id", "TEXT", null, true));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new wjo0("WorkSpec", "CASCADE", kotlin.collections.a.c("work_spec_id"), "CASCADE", kotlin.collections.a.c(ParameterNames.ID)));
        linkedHashSet.add(new wjo0("WorkSpec", "CASCADE", kotlin.collections.a.c("prerequisite_id"), "CASCADE", kotlin.collections.a.c(ParameterNames.ID)));
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        linkedHashSet2.add(new yjo0("index_Dependency_work_spec_id", false, kotlin.collections.a.c("work_spec_id"), kotlin.collections.a.c("ASC")));
        linkedHashSet2.add(new yjo0("index_Dependency_prerequisite_id", false, kotlin.collections.a.c("prerequisite_id"), kotlin.collections.a.c("ASC")));
        ako0 ako0Var = new ako0("Dependency", linkedHashMap, linkedHashSet, linkedHashSet2);
        ako0 ako0VarJ = a4n0.j(qpg0Var, "Dependency");
        if (!ako0Var.equals(ako0VarJ)) {
            return new t40("Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + ako0Var + "\n Found:\n" + ako0VarJ, false);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put(ParameterNames.ID, new ujo0(1, 1, ParameterNames.ID, "TEXT", null, true));
        linkedHashMap2.put(CommonConstant.ReqAccessTokenParam.STATE_LABEL, new ujo0(0, 1, CommonConstant.ReqAccessTokenParam.STATE_LABEL, "INTEGER", null, true));
        linkedHashMap2.put("worker_class_name", new ujo0(0, 1, "worker_class_name", "TEXT", null, true));
        linkedHashMap2.put("input_merger_class_name", new ujo0(0, 1, "input_merger_class_name", "TEXT", null, true));
        linkedHashMap2.put("input", new ujo0(0, 1, "input", "BLOB", null, true));
        linkedHashMap2.put("output", new ujo0(0, 1, "output", "BLOB", null, true));
        linkedHashMap2.put("initial_delay", new ujo0(0, 1, "initial_delay", "INTEGER", null, true));
        linkedHashMap2.put("interval_duration", new ujo0(0, 1, "interval_duration", "INTEGER", null, true));
        linkedHashMap2.put("flex_duration", new ujo0(0, 1, "flex_duration", "INTEGER", null, true));
        linkedHashMap2.put("run_attempt_count", new ujo0(0, 1, "run_attempt_count", "INTEGER", null, true));
        linkedHashMap2.put("backoff_policy", new ujo0(0, 1, "backoff_policy", "INTEGER", null, true));
        linkedHashMap2.put("backoff_delay_duration", new ujo0(0, 1, "backoff_delay_duration", "INTEGER", null, true));
        linkedHashMap2.put("last_enqueue_time", new ujo0(0, 1, "last_enqueue_time", "INTEGER", "-1", true));
        linkedHashMap2.put("minimum_retention_duration", new ujo0(0, 1, "minimum_retention_duration", "INTEGER", null, true));
        linkedHashMap2.put("schedule_requested_at", new ujo0(0, 1, "schedule_requested_at", "INTEGER", null, true));
        linkedHashMap2.put("run_in_foreground", new ujo0(0, 1, "run_in_foreground", "INTEGER", null, true));
        linkedHashMap2.put("out_of_quota_policy", new ujo0(0, 1, "out_of_quota_policy", "INTEGER", null, true));
        linkedHashMap2.put("period_count", new ujo0(0, 1, "period_count", "INTEGER", "0", true));
        linkedHashMap2.put("generation", new ujo0(0, 1, "generation", "INTEGER", "0", true));
        linkedHashMap2.put("next_schedule_time_override", new ujo0(0, 1, "next_schedule_time_override", "INTEGER", "9223372036854775807", true));
        linkedHashMap2.put("next_schedule_time_override_generation", new ujo0(0, 1, "next_schedule_time_override_generation", "INTEGER", "0", true));
        linkedHashMap2.put("stop_reason", new ujo0(0, 1, "stop_reason", "INTEGER", "-256", true));
        linkedHashMap2.put("trace_tag", new ujo0(0, 1, "trace_tag", "TEXT", null, false));
        linkedHashMap2.put("backoff_on_system_interruptions", new ujo0(0, 1, "backoff_on_system_interruptions", "INTEGER", null, false));
        linkedHashMap2.put("required_network_type", new ujo0(0, 1, "required_network_type", "INTEGER", null, true));
        linkedHashMap2.put("required_network_request", new ujo0(0, 1, "required_network_request", "BLOB", "x''", true));
        linkedHashMap2.put("requires_charging", new ujo0(0, 1, "requires_charging", "INTEGER", null, true));
        linkedHashMap2.put("requires_device_idle", new ujo0(0, 1, "requires_device_idle", "INTEGER", null, true));
        linkedHashMap2.put("requires_battery_not_low", new ujo0(0, 1, "requires_battery_not_low", "INTEGER", null, true));
        linkedHashMap2.put("requires_storage_not_low", new ujo0(0, 1, "requires_storage_not_low", "INTEGER", null, true));
        linkedHashMap2.put("trigger_content_update_delay", new ujo0(0, 1, "trigger_content_update_delay", "INTEGER", null, true));
        linkedHashMap2.put("trigger_max_content_delay", new ujo0(0, 1, "trigger_max_content_delay", "INTEGER", null, true));
        linkedHashMap2.put("content_uri_triggers", new ujo0(0, 1, "content_uri_triggers", "BLOB", null, true));
        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
        LinkedHashSet linkedHashSet4 = new LinkedHashSet();
        linkedHashSet4.add(new yjo0("index_WorkSpec_schedule_requested_at", false, kotlin.collections.a.c("schedule_requested_at"), kotlin.collections.a.c("ASC")));
        linkedHashSet4.add(new yjo0("index_WorkSpec_last_enqueue_time", false, kotlin.collections.a.c("last_enqueue_time"), kotlin.collections.a.c("ASC")));
        ako0 ako0Var2 = new ako0("WorkSpec", linkedHashMap2, linkedHashSet3, linkedHashSet4);
        ako0 ako0VarJ2 = a4n0.j(qpg0Var, "WorkSpec");
        if (!ako0Var2.equals(ako0VarJ2)) {
            return new t40("WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + ako0Var2 + "\n Found:\n" + ako0VarJ2, false);
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put("tag", new ujo0(1, 1, "tag", "TEXT", null, true));
        linkedHashMap3.put("work_spec_id", new ujo0(2, 1, "work_spec_id", "TEXT", null, true));
        LinkedHashSet linkedHashSet5 = new LinkedHashSet();
        linkedHashSet5.add(new wjo0("WorkSpec", "CASCADE", kotlin.collections.a.c("work_spec_id"), "CASCADE", kotlin.collections.a.c(ParameterNames.ID)));
        LinkedHashSet linkedHashSet6 = new LinkedHashSet();
        linkedHashSet6.add(new yjo0("index_WorkTag_work_spec_id", false, kotlin.collections.a.c("work_spec_id"), kotlin.collections.a.c("ASC")));
        ako0 ako0Var3 = new ako0("WorkTag", linkedHashMap3, linkedHashSet5, linkedHashSet6);
        ako0 ako0VarJ3 = a4n0.j(qpg0Var, "WorkTag");
        if (!ako0Var3.equals(ako0VarJ3)) {
            return new t40("WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + ako0Var3 + "\n Found:\n" + ako0VarJ3, false);
        }
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        linkedHashMap4.put("work_spec_id", new ujo0(1, 1, "work_spec_id", "TEXT", null, true));
        linkedHashMap4.put("generation", new ujo0(2, 1, "generation", "INTEGER", "0", true));
        linkedHashMap4.put("system_id", new ujo0(0, 1, "system_id", "INTEGER", null, true));
        LinkedHashSet linkedHashSet7 = new LinkedHashSet();
        linkedHashSet7.add(new wjo0("WorkSpec", "CASCADE", kotlin.collections.a.c("work_spec_id"), "CASCADE", kotlin.collections.a.c(ParameterNames.ID)));
        ako0 ako0Var4 = new ako0("SystemIdInfo", linkedHashMap4, linkedHashSet7, new LinkedHashSet());
        ako0 ako0VarJ4 = a4n0.j(qpg0Var, "SystemIdInfo");
        if (!ako0Var4.equals(ako0VarJ4)) {
            return new t40("SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + ako0Var4 + "\n Found:\n" + ako0VarJ4, false);
        }
        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
        linkedHashMap5.put("name", new ujo0(1, 1, "name", "TEXT", null, true));
        linkedHashMap5.put("work_spec_id", new ujo0(2, 1, "work_spec_id", "TEXT", null, true));
        LinkedHashSet linkedHashSet8 = new LinkedHashSet();
        linkedHashSet8.add(new wjo0("WorkSpec", "CASCADE", kotlin.collections.a.c("work_spec_id"), "CASCADE", kotlin.collections.a.c(ParameterNames.ID)));
        LinkedHashSet linkedHashSet9 = new LinkedHashSet();
        linkedHashSet9.add(new yjo0("index_WorkName_work_spec_id", false, kotlin.collections.a.c("work_spec_id"), kotlin.collections.a.c("ASC")));
        ako0 ako0Var5 = new ako0("WorkName", linkedHashMap5, linkedHashSet8, linkedHashSet9);
        ako0 ako0VarJ5 = a4n0.j(qpg0Var, "WorkName");
        if (!ako0Var5.equals(ako0VarJ5)) {
            return new t40("WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + ako0Var5 + "\n Found:\n" + ako0VarJ5, false);
        }
        LinkedHashMap linkedHashMap6 = new LinkedHashMap();
        linkedHashMap6.put("work_spec_id", new ujo0(1, 1, "work_spec_id", "TEXT", null, true));
        linkedHashMap6.put("progress", new ujo0(0, 1, "progress", "BLOB", null, true));
        LinkedHashSet linkedHashSet10 = new LinkedHashSet();
        linkedHashSet10.add(new wjo0("WorkSpec", "CASCADE", kotlin.collections.a.c("work_spec_id"), "CASCADE", kotlin.collections.a.c(ParameterNames.ID)));
        ako0 ako0Var6 = new ako0("WorkProgress", linkedHashMap6, linkedHashSet10, new LinkedHashSet());
        ako0 ako0VarJ6 = a4n0.j(qpg0Var, "WorkProgress");
        if (!ako0Var6.equals(ako0VarJ6)) {
            return new t40("WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + ako0Var6 + "\n Found:\n" + ako0VarJ6, false);
        }
        LinkedHashMap linkedHashMap7 = new LinkedHashMap();
        linkedHashMap7.put("key", new ujo0(1, 1, "key", "TEXT", null, true));
        linkedHashMap7.put("long_value", new ujo0(0, 1, "long_value", "INTEGER", null, false));
        ako0 ako0Var7 = new ako0("Preference", linkedHashMap7, new LinkedHashSet(), new LinkedHashSet());
        ako0 ako0VarJ7 = a4n0.j(qpg0Var, "Preference");
        if (ako0Var7.equals(ako0VarJ7)) {
            return new t40(null, true);
        }
        return new t40("Preference(androidx.work.impl.model.Preference).\n Expected:\n" + ako0Var7 + "\n Found:\n" + ako0VarJ7, false);
    }
}

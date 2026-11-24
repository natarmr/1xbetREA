.class public final La/x9o0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/j2h0;


# static fields
.field public static final e:Ljava/lang/String;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Landroid/app/job/JobScheduler;

.field public final c:La/w9o0;

.field public final d:Landroidx/work/impl/WorkDatabase;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "SystemJobScheduler"

    .line 2
    .line 3
    invoke-static {v0}, La/wv00;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, La/x9o0;->e:Ljava/lang/String;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroidx/work/impl/WorkDatabase;La/wsd;)V
    .locals 2

    .line 1
    invoke-static {p1}, La/fby;->b(Landroid/content/Context;)Landroid/app/job/JobScheduler;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, La/w9o0;

    .line 6
    .line 7
    iget-object p3, p3, La/wsd;->d:La/s2m0;

    .line 8
    .line 9
    invoke-direct {v1, p1, p3}, La/w9o0;-><init>(Landroid/content/Context;La/s2m0;)V

    .line 10
    .line 11
    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, La/x9o0;->a:Landroid/content/Context;

    .line 16
    .line 17
    iput-object v0, p0, La/x9o0;->b:Landroid/app/job/JobScheduler;

    .line 18
    .line 19
    iput-object v1, p0, La/x9o0;->c:La/w9o0;

    .line 20
    .line 21
    iput-object p2, p0, La/x9o0;->d:Landroidx/work/impl/WorkDatabase;

    .line 22
    .line 23
    return-void
.end method

.method public static a(Landroid/app/job/JobScheduler;I)V
    .locals 3

    .line 1
    :try_start_0
    invoke-virtual {p0, p1}, Landroid/app/job/JobScheduler;->cancel(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2
    .line 3
    .line 4
    return-void

    .line 5
    :catchall_0
    move-exception p0

    .line 6
    invoke-static {}, La/wv00;->f()La/wv00;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    const-string v2, "Exception while trying to cancel job (%d)"

    .line 23
    .line 24
    invoke-static {v1, v2, p1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    sget-object v1, La/x9o0;->e:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {v0, v1, p1, p0}, La/wv00;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public static c(Landroid/content/Context;Landroid/app/job/JobScheduler;)Ljava/util/ArrayList;
    .locals 3

    .line 1
    invoke-static {p1}, La/fby;->a(Landroid/app/job/JobScheduler;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    return-object p0

    .line 9
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 16
    .line 17
    .line 18
    new-instance v1, Landroid/content/ComponentName;

    .line 19
    .line 20
    const-class v2, Landroidx/work/impl/background/systemjob/SystemJobService;

    .line 21
    .line 22
    invoke-direct {v1, p0, v2}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 23
    .line 24
    .line 25
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-eqz p1, :cond_2

    .line 34
    .line 35
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    check-cast p1, Landroid/app/job/JobInfo;

    .line 40
    .line 41
    invoke-virtual {p1}, Landroid/app/job/JobInfo;->getService()Landroid/content/ComponentName;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-virtual {v1, v2}, Landroid/content/ComponentName;->equals(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    if-eqz v2, :cond_1

    .line 50
    .line 51
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_2
    return-object v0
.end method

.method public static f(Landroid/app/job/JobInfo;)La/xov0;
    .locals 3

    .line 1
    const-string v0, "EXTRA_WORK_SPEC_ID"

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/app/job/JobInfo;->getExtras()Landroid/os/PersistableBundle;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    :try_start_0
    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    const-string v1, "EXTRA_WORK_SPEC_GENERATION"

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    invoke-virtual {p0, v1, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    new-instance v2, La/xov0;

    .line 23
    .line 24
    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-direct {v2, p0, v1}, La/xov0;-><init>(Ljava/lang/String;I)V
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    .line 29
    .line 30
    .line 31
    return-object v2

    .line 32
    :catch_0
    :cond_0
    const/4 p0, 0x0

    .line 33
    return-object p0
.end method


# virtual methods
.method public final b(Ljava/lang/String;)V
    .locals 6

    .line 1
    iget-object v0, p0, La/x9o0;->a:Landroid/content/Context;

    .line 2
    .line 3
    iget-object v1, p0, La/x9o0;->b:Landroid/app/job/JobScheduler;

    .line 4
    .line 5
    invoke-static {v0, v1}, La/x9o0;->c(Landroid/content/Context;Landroid/app/job/JobScheduler;)Ljava/util/ArrayList;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    goto :goto_1

    .line 13
    :cond_0
    new-instance v2, Ljava/util/ArrayList;

    .line 14
    .line 15
    const/4 v3, 0x2

    .line 16
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    if-eqz v3, :cond_2

    .line 28
    .line 29
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    check-cast v3, Landroid/app/job/JobInfo;

    .line 34
    .line 35
    invoke-static {v3}, La/x9o0;->f(Landroid/app/job/JobInfo;)La/xov0;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    if-eqz v4, :cond_1

    .line 40
    .line 41
    iget-object v4, v4, La/xov0;->a:Ljava/lang/String;

    .line 42
    .line 43
    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    if-eqz v4, :cond_1

    .line 48
    .line 49
    invoke-virtual {v3}, Landroid/app/job/JobInfo;->getId()I

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_2
    move-object v0, v2

    .line 62
    :goto_1
    if-eqz v0, :cond_4

    .line 63
    .line 64
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    if-nez v2, :cond_4

    .line 69
    .line 70
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    if-eqz v2, :cond_3

    .line 79
    .line 80
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    check-cast v2, Ljava/lang/Integer;

    .line 85
    .line 86
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 87
    .line 88
    .line 89
    move-result v2

    .line 90
    invoke-static {}, La/wv00;->f()La/wv00;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    new-instance v4, Ljava/lang/StringBuilder;

    .line 95
    .line 96
    const-string v5, "Cancelling work ID "

    .line 97
    .line 98
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    const-string v5, ", Job ID "

    .line 105
    .line 106
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v4

    .line 116
    sget-object v5, La/x9o0;->e:Ljava/lang/String;

    .line 117
    .line 118
    invoke-virtual {v3, v5, v4}, La/wv00;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    invoke-static {v1, v2}, La/x9o0;->a(Landroid/app/job/JobScheduler;I)V

    .line 122
    .line 123
    .line 124
    goto :goto_2

    .line 125
    :cond_3
    iget-object p0, p0, La/x9o0;->d:Landroidx/work/impl/WorkDatabase;

    .line 126
    .line 127
    invoke-virtual {p0}, Landroidx/work/impl/WorkDatabase;->v()La/s9o0;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 135
    .line 136
    .line 137
    iget-object p0, p0, La/s9o0;->a:La/aeg0;

    .line 138
    .line 139
    new-instance v0, La/ka6;

    .line 140
    .line 141
    const/16 v1, 0x10

    .line 142
    .line 143
    invoke-direct {v0, p1, v1}, La/ka6;-><init>(Ljava/lang/String;B)V

    .line 144
    .line 145
    .line 146
    const/4 p1, 0x0

    .line 147
    const/4 v1, 0x1

    .line 148
    invoke-static {p0, p1, v1, v0}, La/kpb;->h0(La/aeg0;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    :cond_4
    return-void
.end method

.method public final varargs d([La/ppv0;)V
    .locals 13

    .line 1
    new-instance v0, La/jru;

    .line 2
    .line 3
    const/16 v1, 0x13

    .line 4
    .line 5
    iget-object v2, p0, La/x9o0;->d:Landroidx/work/impl/WorkDatabase;

    .line 6
    .line 7
    invoke-direct {v0, v2, v1}, La/jru;-><init>(Ljava/lang/Object;B)V

    .line 8
    .line 9
    .line 10
    array-length v1, p1

    .line 11
    const/4 v3, 0x0

    .line 12
    move v4, v3

    .line 13
    :goto_0
    if-ge v4, v1, :cond_4

    .line 14
    .line 15
    aget-object v5, p1, v4

    .line 16
    .line 17
    invoke-virtual {v2}, La/aeg0;->b()V

    .line 18
    .line 19
    .line 20
    :try_start_0
    invoke-virtual {v2}, Landroidx/work/impl/WorkDatabase;->y()La/upv0;

    .line 21
    .line 22
    .line 23
    move-result-object v6

    .line 24
    iget-object v7, v5, La/ppv0;->a:Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {v6, v7}, La/upv0;->e(Ljava/lang/String;)La/ppv0;

    .line 27
    .line 28
    .line 29
    move-result-object v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    const-string v8, "Skipping scheduling "

    .line 31
    .line 32
    sget-object v9, La/x9o0;->e:Ljava/lang/String;

    .line 33
    .line 34
    if-nez v6, :cond_0

    .line 35
    .line 36
    :try_start_1
    invoke-static {}, La/wv00;->f()La/wv00;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    new-instance v6, Ljava/lang/StringBuilder;

    .line 41
    .line 42
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    const-string v7, " because it\'s no longer in the DB"

    .line 52
    .line 53
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v6

    .line 60
    invoke-virtual {v5, v9, v6}, La/wv00;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v2}, La/aeg0;->q()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 64
    .line 65
    .line 66
    :goto_1
    invoke-virtual {v2}, La/aeg0;->m()V

    .line 67
    .line 68
    .line 69
    goto/16 :goto_3

    .line 70
    .line 71
    :catchall_0
    move-exception p0

    .line 72
    goto/16 :goto_4

    .line 73
    .line 74
    :cond_0
    :try_start_2
    iget-object v6, v6, La/ppv0;->b:La/zov0;

    .line 75
    .line 76
    sget-object v10, La/zov0;->a:La/zov0;

    .line 77
    .line 78
    if-eq v6, v10, :cond_1

    .line 79
    .line 80
    invoke-static {}, La/wv00;->f()La/wv00;

    .line 81
    .line 82
    .line 83
    move-result-object v5

    .line 84
    new-instance v6, Ljava/lang/StringBuilder;

    .line 85
    .line 86
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    const-string v7, " because it is no longer enqueued"

    .line 96
    .line 97
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v6

    .line 104
    invoke-virtual {v5, v9, v6}, La/wv00;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v2}, La/aeg0;->q()V

    .line 108
    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_1
    invoke-static {v5}, La/jpm0;->k(La/ppv0;)La/xov0;

    .line 112
    .line 113
    .line 114
    move-result-object v6

    .line 115
    iget v7, v6, La/xov0;->b:I

    .line 116
    .line 117
    iget-object v6, v6, La/xov0;->a:Ljava/lang/String;

    .line 118
    .line 119
    invoke-virtual {v2}, Landroidx/work/impl/WorkDatabase;->v()La/s9o0;

    .line 120
    .line 121
    .line 122
    move-result-object v8

    .line 123
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    iget-object v8, v8, La/s9o0;->a:La/aeg0;

    .line 130
    .line 131
    new-instance v9, La/e6n;

    .line 132
    .line 133
    const/4 v10, 0x2

    .line 134
    invoke-direct {v9, v10, v7, v6}, La/e6n;-><init>(BILjava/lang/String;)V

    .line 135
    .line 136
    .line 137
    const/4 v10, 0x1

    .line 138
    invoke-static {v8, v10, v3, v9}, La/kpb;->h0(La/aeg0;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v8

    .line 142
    check-cast v8, La/r9o0;

    .line 143
    .line 144
    if-eqz v8, :cond_2

    .line 145
    .line 146
    iget v9, v8, La/r9o0;->c:I

    .line 147
    .line 148
    goto :goto_2

    .line 149
    :cond_2
    iget-object v9, v0, La/jru;->b:Ljava/lang/Object;

    .line 150
    .line 151
    check-cast v9, Landroidx/work/impl/WorkDatabase;

    .line 152
    .line 153
    new-instance v11, La/hrd;

    .line 154
    .line 155
    const/4 v12, 0x3

    .line 156
    invoke-direct {v11, v0, v12}, La/hrd;-><init>(Ljava/lang/Object;B)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v9, v11}, La/aeg0;->o(Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v9

    .line 163
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 164
    .line 165
    .line 166
    check-cast v9, Ljava/lang/Number;

    .line 167
    .line 168
    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    .line 169
    .line 170
    .line 171
    move-result v9

    .line 172
    :goto_2
    if-nez v8, :cond_3

    .line 173
    .line 174
    new-instance v8, La/r9o0;

    .line 175
    .line 176
    invoke-direct {v8, v6, v7, v9}, La/r9o0;-><init>(Ljava/lang/String;II)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {v2}, Landroidx/work/impl/WorkDatabase;->v()La/s9o0;

    .line 180
    .line 181
    .line 182
    move-result-object v6

    .line 183
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 184
    .line 185
    .line 186
    iget-object v7, v6, La/s9o0;->a:La/aeg0;

    .line 187
    .line 188
    new-instance v11, La/itn0;

    .line 189
    .line 190
    const/4 v12, 0x5

    .line 191
    invoke-direct {v11, v6, v8, v12}, La/itn0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 192
    .line 193
    .line 194
    invoke-static {v7, v3, v10, v11}, La/kpb;->h0(La/aeg0;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    :cond_3
    invoke-virtual {p0, v5, v9}, La/x9o0;->g(La/ppv0;I)V

    .line 198
    .line 199
    .line 200
    invoke-virtual {v2}, La/aeg0;->q()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 201
    .line 202
    .line 203
    goto/16 :goto_1

    .line 204
    .line 205
    :goto_3
    add-int/lit8 v4, v4, 0x1

    .line 206
    .line 207
    goto/16 :goto_0

    .line 208
    .line 209
    :goto_4
    invoke-virtual {v2}, La/aeg0;->m()V

    .line 210
    .line 211
    .line 212
    throw p0

    .line 213
    :cond_4
    return-void
.end method

.method public final e()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final g(La/ppv0;I)V
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move/from16 v0, p2

    .line 6
    .line 7
    iget-object v3, v2, La/ppv0;->j:La/o4e;

    .line 8
    .line 9
    new-instance v4, Landroid/os/PersistableBundle;

    .line 10
    .line 11
    invoke-direct {v4}, Landroid/os/PersistableBundle;-><init>()V

    .line 12
    .line 13
    .line 14
    iget-object v5, v2, La/ppv0;->a:Ljava/lang/String;

    .line 15
    .line 16
    const-string v6, "EXTRA_WORK_SPEC_ID"

    .line 17
    .line 18
    invoke-virtual {v4, v6, v5}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v6, "EXTRA_WORK_SPEC_GENERATION"

    .line 22
    .line 23
    iget v7, v2, La/ppv0;->t:I

    .line 24
    .line 25
    invoke-virtual {v4, v6, v7}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 26
    .line 27
    .line 28
    const-string v6, "EXTRA_IS_PERIODIC"

    .line 29
    .line 30
    invoke-virtual {v2}, La/ppv0;->c()Z

    .line 31
    .line 32
    .line 33
    move-result v7

    .line 34
    invoke-virtual {v4, v6, v7}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 35
    .line 36
    .line 37
    new-instance v6, Landroid/app/job/JobInfo$Builder;

    .line 38
    .line 39
    iget-object v7, v1, La/x9o0;->c:La/w9o0;

    .line 40
    .line 41
    iget-object v7, v7, La/w9o0;->a:Landroid/content/ComponentName;

    .line 42
    .line 43
    invoke-direct {v6, v0, v7}, Landroid/app/job/JobInfo$Builder;-><init>(ILandroid/content/ComponentName;)V

    .line 44
    .line 45
    .line 46
    iget-boolean v7, v3, La/o4e;->c:Z

    .line 47
    .line 48
    iget-object v8, v3, La/o4e;->i:Ljava/util/Set;

    .line 49
    .line 50
    invoke-virtual {v6, v7}, Landroid/app/job/JobInfo$Builder;->setRequiresCharging(Z)Landroid/app/job/JobInfo$Builder;

    .line 51
    .line 52
    .line 53
    move-result-object v6

    .line 54
    iget-boolean v7, v3, La/o4e;->d:Z

    .line 55
    .line 56
    invoke-virtual {v6, v7}, Landroid/app/job/JobInfo$Builder;->setRequiresDeviceIdle(Z)Landroid/app/job/JobInfo$Builder;

    .line 57
    .line 58
    .line 59
    move-result-object v6

    .line 60
    invoke-virtual {v6, v4}, Landroid/app/job/JobInfo$Builder;->setExtras(Landroid/os/PersistableBundle;)Landroid/app/job/JobInfo$Builder;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    invoke-virtual {v3}, La/o4e;->a()Landroid/net/NetworkRequest;

    .line 65
    .line 66
    .line 67
    move-result-object v6

    .line 68
    sget v9, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 69
    .line 70
    const/16 v10, 0x1a

    .line 71
    .line 72
    const/4 v11, 0x0

    .line 73
    const/4 v12, 0x1

    .line 74
    const/16 v13, 0x1c

    .line 75
    .line 76
    if-lt v9, v13, :cond_0

    .line 77
    .line 78
    if-eqz v6, :cond_0

    .line 79
    .line 80
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    invoke-static {v4, v6}, La/o8m0;->u(Landroid/app/job/JobInfo$Builder;Landroid/net/NetworkRequest;)V

    .line 84
    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_0
    iget-object v6, v3, La/o4e;->a:La/sl50;

    .line 88
    .line 89
    const/16 v14, 0x1e

    .line 90
    .line 91
    if-lt v9, v14, :cond_1

    .line 92
    .line 93
    sget-object v14, La/sl50;->f:La/sl50;

    .line 94
    .line 95
    if-ne v6, v14, :cond_1

    .line 96
    .line 97
    new-instance v6, Landroid/net/NetworkRequest$Builder;

    .line 98
    .line 99
    invoke-direct {v6}, Landroid/net/NetworkRequest$Builder;-><init>()V

    .line 100
    .line 101
    .line 102
    const/16 v14, 0x19

    .line 103
    .line 104
    invoke-virtual {v6, v14}, Landroid/net/NetworkRequest$Builder;->addCapability(I)Landroid/net/NetworkRequest$Builder;

    .line 105
    .line 106
    .line 107
    move-result-object v6

    .line 108
    invoke-virtual {v6}, Landroid/net/NetworkRequest$Builder;->build()Landroid/net/NetworkRequest;

    .line 109
    .line 110
    .line 111
    move-result-object v6

    .line 112
    invoke-static {v4, v6}, La/o8m0;->l(Landroid/app/job/JobInfo$Builder;Landroid/net/NetworkRequest;)V

    .line 113
    .line 114
    .line 115
    goto :goto_2

    .line 116
    :cond_1
    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    .line 117
    .line 118
    .line 119
    move-result v14

    .line 120
    if-eqz v14, :cond_5

    .line 121
    .line 122
    if-eq v14, v12, :cond_4

    .line 123
    .line 124
    const/4 v15, 0x2

    .line 125
    if-eq v14, v15, :cond_6

    .line 126
    .line 127
    const/4 v15, 0x3

    .line 128
    if-eq v14, v15, :cond_6

    .line 129
    .line 130
    const/4 v15, 0x4

    .line 131
    if-eq v14, v15, :cond_2

    .line 132
    .line 133
    goto :goto_0

    .line 134
    :cond_2
    if-lt v9, v10, :cond_3

    .line 135
    .line 136
    goto :goto_1

    .line 137
    :cond_3
    :goto_0
    invoke-static {}, La/wv00;->f()La/wv00;

    .line 138
    .line 139
    .line 140
    move-result-object v14

    .line 141
    sget-object v15, La/w9o0;->b:Ljava/lang/String;

    .line 142
    .line 143
    new-instance v12, Ljava/lang/StringBuilder;

    .line 144
    .line 145
    const-string v10, "API version too low. Cannot convert network type value "

    .line 146
    .line 147
    invoke-direct {v12, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v12, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v6

    .line 157
    invoke-virtual {v14, v15, v6}, La/wv00;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    :cond_4
    const/4 v15, 0x1

    .line 161
    goto :goto_1

    .line 162
    :cond_5
    move v15, v11

    .line 163
    :cond_6
    :goto_1
    invoke-virtual {v4, v15}, Landroid/app/job/JobInfo$Builder;->setRequiredNetworkType(I)Landroid/app/job/JobInfo$Builder;

    .line 164
    .line 165
    .line 166
    :goto_2
    if-nez v7, :cond_8

    .line 167
    .line 168
    iget-object v6, v2, La/ppv0;->l:La/af5;

    .line 169
    .line 170
    sget-object v7, La/af5;->b:La/af5;

    .line 171
    .line 172
    if-ne v6, v7, :cond_7

    .line 173
    .line 174
    move v6, v11

    .line 175
    goto :goto_3

    .line 176
    :cond_7
    const/4 v6, 0x1

    .line 177
    :goto_3
    iget-wide v14, v2, La/ppv0;->m:J

    .line 178
    .line 179
    invoke-virtual {v4, v14, v15, v6}, Landroid/app/job/JobInfo$Builder;->setBackoffCriteria(JI)Landroid/app/job/JobInfo$Builder;

    .line 180
    .line 181
    .line 182
    :cond_8
    invoke-virtual {v2}, La/ppv0;->a()J

    .line 183
    .line 184
    .line 185
    move-result-wide v6

    .line 186
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 187
    .line 188
    .line 189
    move-result-wide v14

    .line 190
    sub-long/2addr v6, v14

    .line 191
    const-wide/16 v14, 0x0

    .line 192
    .line 193
    invoke-static {v6, v7, v14, v15}, Ljava/lang/Math;->max(JJ)J

    .line 194
    .line 195
    .line 196
    move-result-wide v6

    .line 197
    if-gt v9, v13, :cond_9

    .line 198
    .line 199
    invoke-virtual {v4, v6, v7}, Landroid/app/job/JobInfo$Builder;->setMinimumLatency(J)Landroid/app/job/JobInfo$Builder;

    .line 200
    .line 201
    .line 202
    goto :goto_4

    .line 203
    :cond_9
    cmp-long v9, v6, v14

    .line 204
    .line 205
    if-lez v9, :cond_a

    .line 206
    .line 207
    invoke-virtual {v4, v6, v7}, Landroid/app/job/JobInfo$Builder;->setMinimumLatency(J)Landroid/app/job/JobInfo$Builder;

    .line 208
    .line 209
    .line 210
    goto :goto_4

    .line 211
    :cond_a
    iget-boolean v9, v2, La/ppv0;->q:Z

    .line 212
    .line 213
    if-nez v9, :cond_b

    .line 214
    .line 215
    invoke-static {v4}, La/o8m0;->k(Landroid/app/job/JobInfo$Builder;)V

    .line 216
    .line 217
    .line 218
    :cond_b
    :goto_4
    move-object v9, v8

    .line 219
    check-cast v9, Ljava/util/Collection;

    .line 220
    .line 221
    invoke-interface {v9}, Ljava/util/Collection;->isEmpty()Z

    .line 222
    .line 223
    .line 224
    move-result v9

    .line 225
    if-nez v9, :cond_d

    .line 226
    .line 227
    invoke-interface {v8}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 228
    .line 229
    .line 230
    move-result-object v8

    .line 231
    :goto_5
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 232
    .line 233
    .line 234
    move-result v9

    .line 235
    if-eqz v9, :cond_c

    .line 236
    .line 237
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object v9

    .line 241
    check-cast v9, La/m4e;

    .line 242
    .line 243
    iget-boolean v10, v9, La/m4e;->b:Z

    .line 244
    .line 245
    new-instance v12, Landroid/app/job/JobInfo$TriggerContentUri;

    .line 246
    .line 247
    iget-object v9, v9, La/m4e;->a:Landroid/net/Uri;

    .line 248
    .line 249
    invoke-direct {v12, v9, v10}, Landroid/app/job/JobInfo$TriggerContentUri;-><init>(Landroid/net/Uri;I)V

    .line 250
    .line 251
    .line 252
    invoke-virtual {v4, v12}, Landroid/app/job/JobInfo$Builder;->addTriggerContentUri(Landroid/app/job/JobInfo$TriggerContentUri;)Landroid/app/job/JobInfo$Builder;

    .line 253
    .line 254
    .line 255
    goto :goto_5

    .line 256
    :cond_c
    iget-wide v8, v3, La/o4e;->g:J

    .line 257
    .line 258
    invoke-virtual {v4, v8, v9}, Landroid/app/job/JobInfo$Builder;->setTriggerContentUpdateDelay(J)Landroid/app/job/JobInfo$Builder;

    .line 259
    .line 260
    .line 261
    iget-wide v8, v3, La/o4e;->h:J

    .line 262
    .line 263
    invoke-virtual {v4, v8, v9}, Landroid/app/job/JobInfo$Builder;->setTriggerContentMaxDelay(J)Landroid/app/job/JobInfo$Builder;

    .line 264
    .line 265
    .line 266
    :cond_d
    invoke-virtual {v4, v11}, Landroid/app/job/JobInfo$Builder;->setPersisted(Z)Landroid/app/job/JobInfo$Builder;

    .line 267
    .line 268
    .line 269
    sget v8, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 270
    .line 271
    const/16 v9, 0x1a

    .line 272
    .line 273
    if-lt v8, v9, :cond_e

    .line 274
    .line 275
    iget-boolean v9, v3, La/o4e;->e:Z

    .line 276
    .line 277
    invoke-static {v4, v9}, La/jw90;->p(Landroid/app/job/JobInfo$Builder;Z)V

    .line 278
    .line 279
    .line 280
    iget-boolean v3, v3, La/o4e;->f:Z

    .line 281
    .line 282
    invoke-static {v4, v3}, La/jw90;->D(Landroid/app/job/JobInfo$Builder;Z)V

    .line 283
    .line 284
    .line 285
    :cond_e
    iget v3, v2, La/ppv0;->k:I

    .line 286
    .line 287
    if-lez v3, :cond_f

    .line 288
    .line 289
    const/4 v3, 0x1

    .line 290
    goto :goto_6

    .line 291
    :cond_f
    move v3, v11

    .line 292
    :goto_6
    cmp-long v6, v6, v14

    .line 293
    .line 294
    if-lez v6, :cond_10

    .line 295
    .line 296
    const/4 v6, 0x1

    .line 297
    goto :goto_7

    .line 298
    :cond_10
    move v6, v11

    .line 299
    :goto_7
    const/16 v7, 0x1f

    .line 300
    .line 301
    if-lt v8, v7, :cond_11

    .line 302
    .line 303
    iget-boolean v9, v2, La/ppv0;->q:Z

    .line 304
    .line 305
    if-eqz v9, :cond_11

    .line 306
    .line 307
    if-nez v3, :cond_11

    .line 308
    .line 309
    if-nez v6, :cond_11

    .line 310
    .line 311
    invoke-static {v4}, La/tl50;->t(Landroid/app/job/JobInfo$Builder;)V

    .line 312
    .line 313
    .line 314
    :cond_11
    const/16 v3, 0x23

    .line 315
    .line 316
    if-lt v8, v3, :cond_12

    .line 317
    .line 318
    iget-object v3, v2, La/ppv0;->x:Ljava/lang/String;

    .line 319
    .line 320
    if-eqz v3, :cond_12

    .line 321
    .line 322
    invoke-static {v4, v3}, La/oa3;->l(Landroid/app/job/JobInfo$Builder;Ljava/lang/String;)V

    .line 323
    .line 324
    .line 325
    :cond_12
    invoke-virtual {v4}, Landroid/app/job/JobInfo$Builder;->build()Landroid/app/job/JobInfo;

    .line 326
    .line 327
    .line 328
    move-result-object v3

    .line 329
    invoke-static {}, La/wv00;->f()La/wv00;

    .line 330
    .line 331
    .line 332
    move-result-object v4

    .line 333
    const-string v6, "Scheduling work ID "

    .line 334
    .line 335
    const-string v8, " ("

    .line 336
    .line 337
    invoke-static {v6, v5, v8}, La/kng0;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 338
    .line 339
    .line 340
    move-result-object v6

    .line 341
    iget-object v8, v2, La/ppv0;->c:Ljava/lang/String;

    .line 342
    .line 343
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 344
    .line 345
    .line 346
    const-string v8, "), Job ID "

    .line 347
    .line 348
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 349
    .line 350
    .line 351
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 352
    .line 353
    .line 354
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 355
    .line 356
    .line 357
    move-result-object v6

    .line 358
    sget-object v8, La/x9o0;->e:Ljava/lang/String;

    .line 359
    .line 360
    invoke-virtual {v4, v8, v6}, La/wv00;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 361
    .line 362
    .line 363
    :try_start_0
    iget-object v4, v1, La/x9o0;->b:Landroid/app/job/JobScheduler;

    .line 364
    .line 365
    invoke-virtual {v4, v3}, Landroid/app/job/JobScheduler;->schedule(Landroid/app/job/JobInfo;)I

    .line 366
    .line 367
    .line 368
    move-result v3

    .line 369
    if-nez v3, :cond_13

    .line 370
    .line 371
    invoke-static {}, La/wv00;->f()La/wv00;

    .line 372
    .line 373
    .line 374
    move-result-object v3

    .line 375
    new-instance v4, Ljava/lang/StringBuilder;

    .line 376
    .line 377
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 378
    .line 379
    .line 380
    const-string v6, "Unable to schedule work ID "

    .line 381
    .line 382
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 383
    .line 384
    .line 385
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 386
    .line 387
    .line 388
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 389
    .line 390
    .line 391
    move-result-object v4

    .line 392
    invoke-virtual {v3, v8, v4}, La/wv00;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 393
    .line 394
    .line 395
    iget-boolean v3, v2, La/ppv0;->q:Z

    .line 396
    .line 397
    if-eqz v3, :cond_13

    .line 398
    .line 399
    iget-object v3, v2, La/ppv0;->r:La/od80;

    .line 400
    .line 401
    sget-object v4, La/od80;->a:La/od80;

    .line 402
    .line 403
    if-ne v3, v4, :cond_13

    .line 404
    .line 405
    iput-boolean v11, v2, La/ppv0;->q:Z

    .line 406
    .line 407
    new-instance v3, Ljava/lang/StringBuilder;

    .line 408
    .line 409
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 410
    .line 411
    .line 412
    const-string v4, "Scheduling a non-expedited job (work ID "

    .line 413
    .line 414
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 415
    .line 416
    .line 417
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 418
    .line 419
    .line 420
    const-string v4, ")"

    .line 421
    .line 422
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 423
    .line 424
    .line 425
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 426
    .line 427
    .line 428
    move-result-object v3

    .line 429
    invoke-static {}, La/wv00;->f()La/wv00;

    .line 430
    .line 431
    .line 432
    move-result-object v4

    .line 433
    invoke-virtual {v4, v8, v3}, La/wv00;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 434
    .line 435
    .line 436
    invoke-virtual/range {p0 .. p2}, La/x9o0;->g(La/ppv0;I)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 437
    .line 438
    .line 439
    return-void

    .line 440
    :catchall_0
    move-exception v0

    .line 441
    goto :goto_8

    .line 442
    :catch_0
    move-exception v0

    .line 443
    goto :goto_9

    .line 444
    :cond_13
    return-void

    .line 445
    :goto_8
    invoke-static {}, La/wv00;->f()La/wv00;

    .line 446
    .line 447
    .line 448
    move-result-object v1

    .line 449
    new-instance v3, Ljava/lang/StringBuilder;

    .line 450
    .line 451
    const-string v4, "Unable to schedule "

    .line 452
    .line 453
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 454
    .line 455
    .line 456
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 457
    .line 458
    .line 459
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 460
    .line 461
    .line 462
    move-result-object v2

    .line 463
    invoke-virtual {v1, v8, v2, v0}, La/wv00;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 464
    .line 465
    .line 466
    return-void

    .line 467
    :goto_9
    sget-object v2, La/fby;->a:Ljava/lang/String;

    .line 468
    .line 469
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 470
    .line 471
    if-lt v2, v7, :cond_14

    .line 472
    .line 473
    const/16 v3, 0x96

    .line 474
    .line 475
    goto :goto_a

    .line 476
    :cond_14
    const/16 v3, 0x64

    .line 477
    .line 478
    :goto_a
    iget-object v4, v1, La/x9o0;->d:Landroidx/work/impl/WorkDatabase;

    .line 479
    .line 480
    invoke-virtual {v4}, Landroidx/work/impl/WorkDatabase;->y()La/upv0;

    .line 481
    .line 482
    .line 483
    move-result-object v4

    .line 484
    iget-object v4, v4, La/upv0;->a:La/aeg0;

    .line 485
    .line 486
    new-instance v5, La/ejv0;

    .line 487
    .line 488
    const/16 v6, 0x9

    .line 489
    .line 490
    invoke-direct {v5, v6}, La/ejv0;-><init>(B)V

    .line 491
    .line 492
    .line 493
    const/4 v6, 0x1

    .line 494
    invoke-static {v4, v6, v11, v5}, La/kpb;->h0(La/aeg0;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    .line 495
    .line 496
    .line 497
    move-result-object v4

    .line 498
    check-cast v4, Ljava/util/List;

    .line 499
    .line 500
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 501
    .line 502
    .line 503
    move-result v4

    .line 504
    const/16 v5, 0x22

    .line 505
    .line 506
    iget-object v1, v1, La/x9o0;->a:Landroid/content/Context;

    .line 507
    .line 508
    const-string v6, "<faulty JobScheduler failed to getPendingJobs>"

    .line 509
    .line 510
    if-lt v2, v5, :cond_19

    .line 511
    .line 512
    invoke-static {v1}, La/fby;->b(Landroid/content/Context;)Landroid/app/job/JobScheduler;

    .line 513
    .line 514
    .line 515
    move-result-object v2

    .line 516
    invoke-static {v2}, La/fby;->a(Landroid/app/job/JobScheduler;)Ljava/util/List;

    .line 517
    .line 518
    .line 519
    move-result-object v5

    .line 520
    if-eqz v5, :cond_1b

    .line 521
    .line 522
    invoke-static {v1, v2}, La/x9o0;->c(Landroid/content/Context;Landroid/app/job/JobScheduler;)Ljava/util/ArrayList;

    .line 523
    .line 524
    .line 525
    move-result-object v2

    .line 526
    if-eqz v2, :cond_15

    .line 527
    .line 528
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 529
    .line 530
    .line 531
    move-result v6

    .line 532
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 533
    .line 534
    .line 535
    move-result v2

    .line 536
    sub-int/2addr v6, v2

    .line 537
    goto :goto_b

    .line 538
    :cond_15
    move v6, v11

    .line 539
    :goto_b
    const/4 v2, 0x0

    .line 540
    if-nez v6, :cond_16

    .line 541
    .line 542
    move-object v6, v2

    .line 543
    goto :goto_c

    .line 544
    :cond_16
    const-string v7, " of which are not owned by WorkManager"

    .line 545
    .line 546
    invoke-static {v6, v7}, La/f140;->i(ILjava/lang/String;)Ljava/lang/String;

    .line 547
    .line 548
    .line 549
    move-result-object v6

    .line 550
    :goto_c
    const-string v7, "jobscheduler"

    .line 551
    .line 552
    invoke-virtual {v1, v7}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 553
    .line 554
    .line 555
    move-result-object v7

    .line 556
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 557
    .line 558
    .line 559
    check-cast v7, Landroid/app/job/JobScheduler;

    .line 560
    .line 561
    invoke-static {v1, v7}, La/x9o0;->c(Landroid/content/Context;Landroid/app/job/JobScheduler;)Ljava/util/ArrayList;

    .line 562
    .line 563
    .line 564
    move-result-object v1

    .line 565
    if-eqz v1, :cond_17

    .line 566
    .line 567
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 568
    .line 569
    .line 570
    move-result v11

    .line 571
    :cond_17
    if-nez v11, :cond_18

    .line 572
    .line 573
    goto :goto_d

    .line 574
    :cond_18
    const-string v1, " from WorkManager in the default namespace"

    .line 575
    .line 576
    invoke-static {v11, v1}, La/f140;->i(ILjava/lang/String;)Ljava/lang/String;

    .line 577
    .line 578
    .line 579
    move-result-object v2

    .line 580
    :goto_d
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 581
    .line 582
    .line 583
    move-result v1

    .line 584
    const-string v5, " jobs in \"androidx.work.systemjobscheduler\" namespace"

    .line 585
    .line 586
    invoke-static {v1, v5}, La/f140;->i(ILjava/lang/String;)Ljava/lang/String;

    .line 587
    .line 588
    .line 589
    move-result-object v1

    .line 590
    filled-new-array {v1, v6, v2}, [Ljava/lang/String;

    .line 591
    .line 592
    .line 593
    move-result-object v1

    .line 594
    invoke-static {v1}, La/tx3;->z([Ljava/lang/Object;)Ljava/util/List;

    .line 595
    .line 596
    .line 597
    move-result-object v9

    .line 598
    const/4 v13, 0x0

    .line 599
    const/16 v14, 0x3e

    .line 600
    .line 601
    const-string v10, ",\n"

    .line 602
    .line 603
    const/4 v11, 0x0

    .line 604
    const/4 v12, 0x0

    .line 605
    invoke-static/range {v9 .. v14}, Lkotlin/collections/CollectionsKt;->b0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    .line 606
    .line 607
    .line 608
    move-result-object v6

    .line 609
    goto :goto_e

    .line 610
    :cond_19
    invoke-static {v1}, La/fby;->b(Landroid/content/Context;)Landroid/app/job/JobScheduler;

    .line 611
    .line 612
    .line 613
    move-result-object v2

    .line 614
    invoke-static {v1, v2}, La/x9o0;->c(Landroid/content/Context;Landroid/app/job/JobScheduler;)Ljava/util/ArrayList;

    .line 615
    .line 616
    .line 617
    move-result-object v1

    .line 618
    if-nez v1, :cond_1a

    .line 619
    .line 620
    goto :goto_e

    .line 621
    :cond_1a
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 622
    .line 623
    .line 624
    move-result v1

    .line 625
    const-string v2, " jobs from WorkManager"

    .line 626
    .line 627
    invoke-static {v1, v2}, La/f140;->i(ILjava/lang/String;)Ljava/lang/String;

    .line 628
    .line 629
    .line 630
    move-result-object v6

    .line 631
    :cond_1b
    :goto_e
    const-string v1, " job limit exceeded.\nIn JobScheduler there are "

    .line 632
    .line 633
    const-string v2, ".\nThere are "

    .line 634
    .line 635
    const-string v5, "JobScheduler "

    .line 636
    .line 637
    invoke-static {v3, v5, v1, v6, v2}, La/vqd;->r(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 638
    .line 639
    .line 640
    move-result-object v1

    .line 641
    const-string v2, " jobs tracked by WorkManager\'s database;\nthe Configuration limit is 20."

    .line 642
    .line 643
    invoke-static {v4, v2, v1}, La/rz4;->j(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 644
    .line 645
    .line 646
    move-result-object v1

    .line 647
    invoke-static {}, La/wv00;->f()La/wv00;

    .line 648
    .line 649
    .line 650
    move-result-object v2

    .line 651
    invoke-virtual {v2, v8, v1}, La/wv00;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 652
    .line 653
    .line 654
    invoke-static {v1, v0}, La/hny;->q(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 655
    .line 656
    .line 657
    return-void
.end method

.class public final La/udg0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Z

.field public b:Z

.field public final c:La/rcj;

.field public final d:La/pa80;

.field public final e:Ljava/util/List;

.field public final f:La/t1e;

.field public g:La/w7r;


# direct methods
.method public constructor <init>(La/rcj;La/pa80;)V
    .locals 10

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/udg0;->c:La/rcj;

    .line 5
    .line 6
    iput-object p2, p0, La/udg0;->d:La/pa80;

    .line 7
    .line 8
    iget-object v0, p1, La/rcj;->e:Ljava/util/List;

    .line 9
    .line 10
    iget-object v1, p1, La/rcj;->g:La/ydg0;

    .line 11
    .line 12
    iget-object v2, p1, La/rcj;->c:La/qkn0;

    .line 13
    .line 14
    iget-object v5, p1, La/rcj;->b:Ljava/lang/String;

    .line 15
    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    sget-object v0, La/iun;->a:La/iun;

    .line 19
    .line 20
    :cond_0
    iput-object v0, p0, La/udg0;->e:Ljava/util/List;

    .line 21
    .line 22
    iget-object v0, p1, La/rcj;->p:La/spg0;

    .line 23
    .line 24
    const/4 v3, 0x0

    .line 25
    const/4 v9, 0x1

    .line 26
    if-nez v0, :cond_2

    .line 27
    .line 28
    if-eqz v2, :cond_1

    .line 29
    .line 30
    iget-object v4, p1, La/rcj;->a:Landroid/content/Context;

    .line 31
    .line 32
    new-instance v6, La/y78;

    .line 33
    .line 34
    iget p1, p2, La/pa80;->a:I

    .line 35
    .line 36
    invoke-direct {v6, p0, p1}, La/y78;-><init>(La/udg0;I)V

    .line 37
    .line 38
    .line 39
    new-instance v3, La/m9c;

    .line 40
    .line 41
    const/4 v7, 0x0

    .line 42
    const/4 v8, 0x0

    .line 43
    invoke-direct/range {v3 .. v8}, La/m9c;-><init>(Landroid/content/Context;Ljava/lang/String;La/y78;ZZ)V

    .line 44
    .line 45
    .line 46
    new-instance p1, La/pkn0;

    .line 47
    .line 48
    new-instance p2, La/roi0;

    .line 49
    .line 50
    invoke-interface {v2, v3}, La/qkn0;->l(La/m9c;)La/rkn0;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 58
    .line 59
    .line 60
    iput-object v0, p2, La/roi0;->a:Ljava/lang/Object;

    .line 61
    .line 62
    invoke-direct {p1, p2}, La/pkn0;-><init>(La/roi0;)V

    .line 63
    .line 64
    .line 65
    iput-object p1, p0, La/udg0;->f:La/t1e;

    .line 66
    .line 67
    goto :goto_3

    .line 68
    :cond_1
    const-string p0, "SQLiteManager was constructed with both null driver and open helper factory!"

    .line 69
    .line 70
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    throw v3

    .line 74
    :cond_2
    instance-of p1, v0, La/q13;

    .line 75
    .line 76
    if-eqz p1, :cond_4

    .line 77
    .line 78
    new-instance p1, La/r13;

    .line 79
    .line 80
    new-instance p2, La/ehf0;

    .line 81
    .line 82
    invoke-direct {p2, p0, v0}, La/ehf0;-><init>(La/udg0;La/spg0;)V

    .line 83
    .line 84
    .line 85
    if-nez v5, :cond_3

    .line 86
    .line 87
    const-string v5, ":memory:"

    .line 88
    .line 89
    :cond_3
    invoke-direct {p1, p2, v5}, La/r13;-><init>(La/ehf0;Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_4
    if-nez v5, :cond_5

    .line 94
    .line 95
    new-instance p1, La/ehf0;

    .line 96
    .line 97
    invoke-direct {p1, p0, v0}, La/ehf0;-><init>(La/udg0;La/spg0;)V

    .line 98
    .line 99
    .line 100
    new-instance p2, La/a2e;

    .line 101
    .line 102
    invoke-direct {p2, p1}, La/a2e;-><init>(La/ehf0;)V

    .line 103
    .line 104
    .line 105
    move-object p1, p2

    .line 106
    goto :goto_2

    .line 107
    :cond_5
    new-instance p1, La/ehf0;

    .line 108
    .line 109
    invoke-direct {p1, p0, v0}, La/ehf0;-><init>(La/udg0;La/spg0;)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 113
    .line 114
    .line 115
    move-result p2

    .line 116
    const/4 v0, 0x2

    .line 117
    if-eq p2, v9, :cond_7

    .line 118
    .line 119
    if-ne p2, v0, :cond_6

    .line 120
    .line 121
    const/4 p2, 0x4

    .line 122
    goto :goto_0

    .line 123
    :cond_6
    const-string p0, "Can\'t get max number of reader for journal mode \'"

    .line 124
    .line 125
    invoke-static {v1, p0}, La/e9d0;->y(Ljava/lang/Object;Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    throw v3

    .line 129
    :cond_7
    move p2, v9

    .line 130
    :goto_0
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 131
    .line 132
    .line 133
    move-result v2

    .line 134
    if-eq v2, v9, :cond_9

    .line 135
    .line 136
    if-ne v2, v0, :cond_8

    .line 137
    .line 138
    goto :goto_1

    .line 139
    :cond_8
    const-string p0, "Can\'t get max number of writers for journal mode \'"

    .line 140
    .line 141
    invoke-static {v1, p0}, La/e9d0;->y(Ljava/lang/Object;Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    throw v3

    .line 145
    :cond_9
    :goto_1
    new-instance v0, La/a2e;

    .line 146
    .line 147
    invoke-direct {v0, p1, v5, p2}, La/a2e;-><init>(La/ehf0;Ljava/lang/String;I)V

    .line 148
    .line 149
    .line 150
    move-object p1, v0

    .line 151
    :goto_2
    iput-object p1, p0, La/udg0;->f:La/t1e;

    .line 152
    .line 153
    :goto_3
    sget-object p1, La/ydg0;->b:La/ydg0;

    .line 154
    .line 155
    if-ne v1, p1, :cond_a

    .line 156
    .line 157
    goto :goto_4

    .line 158
    :cond_a
    const/4 v9, 0x0

    .line 159
    :goto_4
    invoke-virtual {p0}, La/udg0;->c()La/rkn0;

    .line 160
    .line 161
    .line 162
    move-result-object p0

    .line 163
    if-eqz p0, :cond_b

    .line 164
    .line 165
    invoke-interface {p0, v9}, La/rkn0;->setWriteAheadLoggingEnabled(Z)V

    .line 166
    .line 167
    .line 168
    :cond_b
    return-void
.end method

.method public constructor <init>(La/rcj;La/wtf0;)V
    .locals 2

    .line 169
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 170
    iput-object p1, p0, La/udg0;->c:La/rcj;

    .line 171
    new-instance p2, La/qdg0;

    const/4 v0, -0x1

    .line 172
    const-string v1, ""

    invoke-direct {p2, v0, v1, v1}, La/pa80;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 173
    iput-object p2, p0, La/udg0;->d:La/pa80;

    .line 174
    iget-object p2, p1, La/rcj;->e:Ljava/util/List;

    if-nez p2, :cond_0

    .line 175
    sget-object v0, La/iun;->a:La/iun;

    goto :goto_0

    :cond_0
    move-object v0, p2

    .line 176
    :goto_0
    iput-object v0, p0, La/udg0;->e:Ljava/util/List;

    .line 177
    new-instance v0, La/eme0;

    const/16 v1, 0x16

    invoke-direct {v0, p0, v1}, La/eme0;-><init>(Ljava/lang/Object;B)V

    if-nez p2, :cond_1

    .line 178
    sget-object p2, La/iun;->a:La/iun;

    .line 179
    :cond_1
    new-instance p0, La/rdg0;

    invoke-direct {p0, v0}, La/rdg0;-><init>(La/eme0;)V

    .line 180
    invoke-static {p2, p0}, Lkotlin/collections/CollectionsKt;->r0(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 181
    iget-object p0, p1, La/rcj;->h:Ljava/util/concurrent/Executor;

    .line 182
    iget-object p1, p1, La/rcj;->i:Ljava/util/concurrent/Executor;

    .line 183
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 184
    new-instance p0, La/q660;

    const/4 p1, 0x0

    const/4 p2, 0x1

    invoke-direct {p0, p1, p2, p1}, La/q660;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw p0
.end method

.method public static a(La/qpg0;)V
    .locals 5

    .line 1
    const-string v0, "PRAGMA busy_timeout"

    .line 2
    .line 3
    invoke-interface {p0, v0}, La/qpg0;->Z0(Ljava/lang/String;)La/xpg0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :try_start_0
    invoke-interface {v0}, La/xpg0;->W0()Z

    .line 8
    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-interface {v0, v1}, La/xpg0;->getLong(I)J

    .line 12
    .line 13
    .line 14
    move-result-wide v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    const/4 v3, 0x0

    .line 16
    invoke-static {v0, v3}, La/ay3;->L(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 17
    .line 18
    .line 19
    const-wide/16 v3, 0xbb8

    .line 20
    .line 21
    cmp-long v0, v1, v3

    .line 22
    .line 23
    if-gez v0, :cond_0

    .line 24
    .line 25
    const-string v0, "PRAGMA busy_timeout = 3000"

    .line 26
    .line 27
    invoke-static {p0, v0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    :cond_0
    return-void

    .line 31
    :catchall_0
    move-exception p0

    .line 32
    :try_start_1
    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 33
    :catchall_1
    move-exception v1

    .line 34
    invoke-static {v0, p0}, La/ay3;->L(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 35
    .line 36
    .line 37
    throw v1
.end method


# virtual methods
.method public final b(La/qpg0;)V
    .locals 4

    .line 1
    const-string v0, "PRAGMA user_version = "

    .line 2
    .line 3
    iget-object v1, p0, La/udg0;->c:La/rcj;

    .line 4
    .line 5
    iget-object v2, v1, La/rcj;->g:La/ydg0;

    .line 6
    .line 7
    sget-object v3, La/ydg0;->b:La/ydg0;

    .line 8
    .line 9
    if-ne v2, v3, :cond_0

    .line 10
    .line 11
    const-string v2, "PRAGMA journal_mode = WAL"

    .line 12
    .line 13
    invoke-static {p1, v2}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const-string v2, "PRAGMA journal_mode = TRUNCATE"

    .line 18
    .line 19
    invoke-static {p1, v2}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    :goto_0
    iget-object v1, v1, La/rcj;->g:La/ydg0;

    .line 23
    .line 24
    if-ne v1, v3, :cond_1

    .line 25
    .line 26
    const-string v1, "PRAGMA synchronous = NORMAL"

    .line 27
    .line 28
    invoke-static {p1, v1}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    const-string v1, "PRAGMA synchronous = FULL"

    .line 33
    .line 34
    invoke-static {p1, v1}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    :goto_1
    invoke-static {p1}, La/udg0;->a(La/qpg0;)V

    .line 38
    .line 39
    .line 40
    const-string v1, "PRAGMA user_version"

    .line 41
    .line 42
    invoke-interface {p1, v1}, La/qpg0;->Z0(Ljava/lang/String;)La/xpg0;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    :try_start_0
    invoke-interface {v1}, La/xpg0;->W0()Z

    .line 47
    .line 48
    .line 49
    const/4 v2, 0x0

    .line 50
    invoke-interface {v1, v2}, La/xpg0;->getLong(I)J

    .line 51
    .line 52
    .line 53
    move-result-wide v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 54
    long-to-int v2, v2

    .line 55
    const/4 v3, 0x0

    .line 56
    invoke-static {v1, v3}, La/ay3;->L(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 57
    .line 58
    .line 59
    iget-object v1, p0, La/udg0;->d:La/pa80;

    .line 60
    .line 61
    iget v3, v1, La/pa80;->a:I

    .line 62
    .line 63
    iget v1, v1, La/pa80;->a:I

    .line 64
    .line 65
    if-eq v2, v3, :cond_5

    .line 66
    .line 67
    const-string v3, "BEGIN EXCLUSIVE TRANSACTION"

    .line 68
    .line 69
    invoke-static {p1, v3}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    :try_start_1
    sget-object v3, La/j0g0;->b:La/e0g0;

    .line 73
    .line 74
    if-nez v2, :cond_2

    .line 75
    .line 76
    invoke-virtual {p0, p1}, La/udg0;->d(La/qpg0;)V

    .line 77
    .line 78
    .line 79
    goto :goto_2

    .line 80
    :catchall_0
    move-exception v0

    .line 81
    goto :goto_3

    .line 82
    :cond_2
    invoke-virtual {p0, p1, v2, v1}, La/udg0;->e(La/qpg0;II)V

    .line 83
    .line 84
    .line 85
    :goto_2
    new-instance v2, Ljava/lang/StringBuilder;

    .line 86
    .line 87
    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    invoke-static {p1, v0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 101
    .line 102
    goto :goto_4

    .line 103
    :goto_3
    sget-object v1, La/j0g0;->b:La/e0g0;

    .line 104
    .line 105
    new-instance v1, La/g0g0;

    .line 106
    .line 107
    invoke-direct {v1, v0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 108
    .line 109
    .line 110
    move-object v0, v1

    .line 111
    :goto_4
    nop

    .line 112
    instance-of v1, v0, La/g0g0;

    .line 113
    .line 114
    if-nez v1, :cond_3

    .line 115
    .line 116
    move-object v1, v0

    .line 117
    check-cast v1, Lkotlin/Unit;

    .line 118
    .line 119
    const-string v1, "END TRANSACTION"

    .line 120
    .line 121
    invoke-static {p1, v1}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    :cond_3
    invoke-static {v0}, La/j0g0;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    if-nez v0, :cond_4

    .line 129
    .line 130
    goto :goto_5

    .line 131
    :cond_4
    const-string p0, "ROLLBACK TRANSACTION"

    .line 132
    .line 133
    invoke-static {p1, p0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    throw v0

    .line 137
    :cond_5
    :goto_5
    invoke-virtual {p0, p1}, La/udg0;->f(La/qpg0;)V

    .line 138
    .line 139
    .line 140
    return-void

    .line 141
    :catchall_1
    move-exception p0

    .line 142
    :try_start_2
    throw p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 143
    :catchall_2
    move-exception p1

    .line 144
    invoke-static {v1, p0}, La/ay3;->L(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 145
    .line 146
    .line 147
    throw p1
.end method

.method public final c()La/rkn0;
    .locals 2

    .line 1
    iget-object p0, p0, La/udg0;->f:La/t1e;

    .line 2
    .line 3
    instance-of v0, p0, La/pkn0;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    check-cast p0, La/pkn0;

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move-object p0, v1

    .line 12
    :goto_0
    if-eqz p0, :cond_1

    .line 13
    .line 14
    iget-object p0, p0, La/pkn0;->a:La/roi0;

    .line 15
    .line 16
    iget-object p0, p0, La/roi0;->a:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p0, La/rkn0;

    .line 19
    .line 20
    return-object p0

    .line 21
    :cond_1
    return-object v1
.end method

.method public final d(La/qpg0;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string v0, "SELECT count(*) FROM sqlite_master WHERE name != \'android_metadata\'"

    .line 5
    .line 6
    invoke-interface {p1, v0}, La/qpg0;->Z0(Ljava/lang/String;)La/xpg0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    :try_start_0
    invoke-interface {v0}, La/xpg0;->W0()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/4 v2, 0x0

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-interface {v0, v2}, La/xpg0;->getLong(I)J

    .line 18
    .line 19
    .line 20
    move-result-wide v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    const-wide/16 v5, 0x0

    .line 22
    .line 23
    cmp-long v1, v3, v5

    .line 24
    .line 25
    if-nez v1, :cond_0

    .line 26
    .line 27
    const/4 v2, 0x1

    .line 28
    goto :goto_0

    .line 29
    :catchall_0
    move-exception p0

    .line 30
    goto :goto_3

    .line 31
    :cond_0
    :goto_0
    const/4 v1, 0x0

    .line 32
    invoke-static {v0, v1}, La/ay3;->L(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 33
    .line 34
    .line 35
    iget-object v0, p0, La/udg0;->d:La/pa80;

    .line 36
    .line 37
    invoke-virtual {v0, p1}, La/pa80;->a(La/qpg0;)V

    .line 38
    .line 39
    .line 40
    if-nez v2, :cond_2

    .line 41
    .line 42
    invoke-virtual {v0, p1}, La/pa80;->w(La/qpg0;)La/t40;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    iget-boolean v2, v1, La/t40;->b:Z

    .line 47
    .line 48
    if-eqz v2, :cond_1

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_1
    const-string p0, "Pre-packaged database has an invalid schema: "

    .line 52
    .line 53
    iget-object p1, v1, La/t40;->c:Ljava/lang/String;

    .line 54
    .line 55
    invoke-static {p1, p0}, La/e9d0;->x(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_2
    :goto_1
    invoke-virtual {p0, p1}, La/udg0;->g(La/qpg0;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, p1}, La/pa80;->s(La/qpg0;)V

    .line 63
    .line 64
    .line 65
    iget-object p0, p0, La/udg0;->e:Ljava/util/List;

    .line 66
    .line 67
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    :cond_3
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    if-eqz v0, :cond_4

    .line 76
    .line 77
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    check-cast v0, La/wdg0;

    .line 82
    .line 83
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    instance-of v0, p1, La/okn0;

    .line 87
    .line 88
    if-eqz v0, :cond_3

    .line 89
    .line 90
    move-object v0, p1

    .line 91
    check-cast v0, La/okn0;

    .line 92
    .line 93
    iget-object v0, v0, La/okn0;->a:La/w7r;

    .line 94
    .line 95
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_4
    return-void

    .line 100
    :goto_3
    :try_start_1
    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 101
    :catchall_1
    move-exception p1

    .line 102
    invoke-static {v0, p0}, La/ay3;->L(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 103
    .line 104
    .line 105
    throw p1
.end method

.method public final e(La/qpg0;II)V
    .locals 12

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/udg0;->c:La/rcj;

    .line 5
    .line 6
    iget-object v1, v0, La/rcj;->d:La/ea70;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    const/4 v3, 0x0

    .line 10
    const/4 v4, 0x1

    .line 11
    if-ne p2, p3, :cond_0

    .line 12
    .line 13
    sget-object v1, La/iun;->a:La/iun;

    .line 14
    .line 15
    goto/16 :goto_7

    .line 16
    .line 17
    :cond_0
    if-le p3, p2, :cond_1

    .line 18
    .line 19
    move v5, v4

    .line 20
    goto :goto_0

    .line 21
    :cond_1
    move v5, v3

    .line 22
    :goto_0
    new-instance v6, Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 25
    .line 26
    .line 27
    move v7, p2

    .line 28
    :cond_2
    if-eqz v5, :cond_3

    .line 29
    .line 30
    if-ge v7, p3, :cond_b

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_3
    if-le v7, p3, :cond_b

    .line 34
    .line 35
    :goto_1
    iget-object v8, v1, La/ea70;->a:Ljava/util/LinkedHashMap;

    .line 36
    .line 37
    if-eqz v5, :cond_5

    .line 38
    .line 39
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 40
    .line 41
    .line 42
    move-result-object v9

    .line 43
    invoke-virtual {v8, v9}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v8

    .line 47
    check-cast v8, Ljava/util/TreeMap;

    .line 48
    .line 49
    if-nez v8, :cond_4

    .line 50
    .line 51
    :goto_2
    move-object v10, v2

    .line 52
    goto :goto_3

    .line 53
    :cond_4
    invoke-virtual {v8}, Ljava/util/TreeMap;->descendingKeySet()Ljava/util/NavigableSet;

    .line 54
    .line 55
    .line 56
    move-result-object v9

    .line 57
    new-instance v10, Lkotlin/Pair;

    .line 58
    .line 59
    invoke-direct {v10, v8, v9}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    goto :goto_3

    .line 63
    :cond_5
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 64
    .line 65
    .line 66
    move-result-object v9

    .line 67
    invoke-virtual {v8, v9}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v8

    .line 71
    check-cast v8, Ljava/util/TreeMap;

    .line 72
    .line 73
    if-nez v8, :cond_6

    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_6
    invoke-virtual {v8}, Ljava/util/TreeMap;->keySet()Ljava/util/Set;

    .line 77
    .line 78
    .line 79
    move-result-object v9

    .line 80
    new-instance v10, Lkotlin/Pair;

    .line 81
    .line 82
    invoke-direct {v10, v8, v9}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    :goto_3
    if-nez v10, :cond_7

    .line 86
    .line 87
    goto :goto_6

    .line 88
    :cond_7
    iget-object v8, v10, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v8, Ljava/util/Map;

    .line 91
    .line 92
    iget-object v9, v10, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v9, Ljava/lang/Iterable;

    .line 95
    .line 96
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 97
    .line 98
    .line 99
    move-result-object v9

    .line 100
    :cond_8
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 101
    .line 102
    .line 103
    move-result v10

    .line 104
    if-eqz v10, :cond_a

    .line 105
    .line 106
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v10

    .line 110
    check-cast v10, Ljava/lang/Number;

    .line 111
    .line 112
    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    .line 113
    .line 114
    .line 115
    move-result v10

    .line 116
    if-eqz v5, :cond_9

    .line 117
    .line 118
    add-int/lit8 v11, v7, 0x1

    .line 119
    .line 120
    if-gt v11, v10, :cond_8

    .line 121
    .line 122
    if-gt v10, p3, :cond_8

    .line 123
    .line 124
    goto :goto_4

    .line 125
    :cond_9
    if-gt p3, v10, :cond_8

    .line 126
    .line 127
    if-ge v10, v7, :cond_8

    .line 128
    .line 129
    :goto_4
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 130
    .line 131
    .line 132
    move-result-object v7

    .line 133
    invoke-interface {v8, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v7

    .line 137
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    move v8, v4

    .line 144
    move v7, v10

    .line 145
    goto :goto_5

    .line 146
    :cond_a
    move v8, v3

    .line 147
    :goto_5
    if-nez v8, :cond_2

    .line 148
    .line 149
    :goto_6
    move-object v1, v2

    .line 150
    goto :goto_7

    .line 151
    :cond_b
    move-object v1, v6

    .line 152
    :goto_7
    iget-object v5, p0, La/udg0;->d:La/pa80;

    .line 153
    .line 154
    if-eqz v1, :cond_e

    .line 155
    .line 156
    invoke-virtual {v5, p1}, La/pa80;->v(La/qpg0;)V

    .line 157
    .line 158
    .line 159
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 160
    .line 161
    .line 162
    move-result-object p2

    .line 163
    :goto_8
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 164
    .line 165
    .line 166
    move-result p3

    .line 167
    if-eqz p3, :cond_c

    .line 168
    .line 169
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object p3

    .line 173
    check-cast p3, La/eg40;

    .line 174
    .line 175
    invoke-virtual {p3, p1}, La/eg40;->b(La/qpg0;)V

    .line 176
    .line 177
    .line 178
    goto :goto_8

    .line 179
    :cond_c
    invoke-virtual {v5, p1}, La/pa80;->w(La/qpg0;)La/t40;

    .line 180
    .line 181
    .line 182
    move-result-object p2

    .line 183
    iget-boolean p3, p2, La/t40;->b:Z

    .line 184
    .line 185
    if-eqz p3, :cond_d

    .line 186
    .line 187
    invoke-virtual {v5, p1}, La/pa80;->u(La/qpg0;)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {p0, p1}, La/udg0;->g(La/qpg0;)V

    .line 191
    .line 192
    .line 193
    return-void

    .line 194
    :cond_d
    const-string p0, "Migration didn\'t properly handle: "

    .line 195
    .line 196
    iget-object p1, p2, La/t40;->c:Ljava/lang/String;

    .line 197
    .line 198
    invoke-static {p1, p0}, La/e9d0;->x(Ljava/lang/Object;Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    return-void

    .line 202
    :cond_e
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 203
    .line 204
    .line 205
    if-le p2, p3, :cond_10

    .line 206
    .line 207
    iget-boolean v1, v0, La/rcj;->k:Z

    .line 208
    .line 209
    if-eqz v1, :cond_10

    .line 210
    .line 211
    :cond_f
    move v1, v3

    .line 212
    goto :goto_9

    .line 213
    :cond_10
    iget-object v1, v0, La/rcj;->l:Ljava/util/Set;

    .line 214
    .line 215
    iget-boolean v6, v0, La/rcj;->j:Z

    .line 216
    .line 217
    if-eqz v6, :cond_f

    .line 218
    .line 219
    if-eqz v1, :cond_11

    .line 220
    .line 221
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 222
    .line 223
    .line 224
    move-result-object v6

    .line 225
    invoke-interface {v1, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 226
    .line 227
    .line 228
    move-result v1

    .line 229
    if-nez v1, :cond_f

    .line 230
    .line 231
    :cond_11
    move v1, v4

    .line 232
    :goto_9
    if-nez v1, :cond_1a

    .line 233
    .line 234
    iget-boolean p2, v0, La/rcj;->o:Z

    .line 235
    .line 236
    if-eqz p2, :cond_16

    .line 237
    .line 238
    const-string p2, "SELECT name, type FROM sqlite_master WHERE type = \'table\' OR type = \'view\'"

    .line 239
    .line 240
    invoke-interface {p1, p2}, La/qpg0;->Z0(Ljava/lang/String;)La/xpg0;

    .line 241
    .line 242
    .line 243
    move-result-object p2

    .line 244
    :try_start_0
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 245
    .line 246
    .line 247
    move-result-object p3

    .line 248
    :cond_12
    :goto_a
    invoke-interface {p2}, La/xpg0;->W0()Z

    .line 249
    .line 250
    .line 251
    move-result v0

    .line 252
    if-eqz v0, :cond_14

    .line 253
    .line 254
    invoke-interface {p2, v3}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object v0

    .line 258
    const-string v1, "sqlite_"

    .line 259
    .line 260
    invoke-static {v0, v1, v3}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 261
    .line 262
    .line 263
    move-result v1

    .line 264
    if-nez v1, :cond_12

    .line 265
    .line 266
    const-string v1, "android_metadata"

    .line 267
    .line 268
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 269
    .line 270
    .line 271
    move-result v1

    .line 272
    if-eqz v1, :cond_13

    .line 273
    .line 274
    goto :goto_a

    .line 275
    :cond_13
    invoke-interface {p2, v4}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object v1

    .line 279
    const-string v6, "view"

    .line 280
    .line 281
    invoke-static {v1, v6}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 282
    .line 283
    .line 284
    move-result v1

    .line 285
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 286
    .line 287
    .line 288
    move-result-object v1

    .line 289
    new-instance v6, Lkotlin/Pair;

    .line 290
    .line 291
    invoke-direct {v6, v0, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 292
    .line 293
    .line 294
    invoke-virtual {p3, v6}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 295
    .line 296
    .line 297
    goto :goto_a

    .line 298
    :catchall_0
    move-exception p0

    .line 299
    goto :goto_c

    .line 300
    :cond_14
    invoke-static {p3}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 301
    .line 302
    .line 303
    move-result-object p3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 304
    invoke-static {p2, v2}, La/ay3;->L(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 305
    .line 306
    .line 307
    invoke-virtual {p3, v3}, La/lc00;->listIterator(I)Ljava/util/ListIterator;

    .line 308
    .line 309
    .line 310
    move-result-object p2

    .line 311
    :goto_b
    move-object p3, p2

    .line 312
    check-cast p3, La/paw;

    .line 313
    .line 314
    invoke-virtual {p3}, La/paw;->hasNext()Z

    .line 315
    .line 316
    .line 317
    move-result v0

    .line 318
    if-eqz v0, :cond_17

    .line 319
    .line 320
    invoke-virtual {p3}, La/paw;->next()Ljava/lang/Object;

    .line 321
    .line 322
    .line 323
    move-result-object p3

    .line 324
    check-cast p3, Lkotlin/Pair;

    .line 325
    .line 326
    iget-object v0, p3, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 327
    .line 328
    check-cast v0, Ljava/lang/String;

    .line 329
    .line 330
    iget-object p3, p3, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 331
    .line 332
    check-cast p3, Ljava/lang/Boolean;

    .line 333
    .line 334
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 335
    .line 336
    .line 337
    move-result p3

    .line 338
    if-eqz p3, :cond_15

    .line 339
    .line 340
    new-instance p3, Ljava/lang/StringBuilder;

    .line 341
    .line 342
    const-string v1, "DROP VIEW IF EXISTS "

    .line 343
    .line 344
    invoke-direct {p3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 345
    .line 346
    .line 347
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 348
    .line 349
    .line 350
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 351
    .line 352
    .line 353
    move-result-object p3

    .line 354
    invoke-static {p1, p3}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 355
    .line 356
    .line 357
    goto :goto_b

    .line 358
    :cond_15
    new-instance p3, Ljava/lang/StringBuilder;

    .line 359
    .line 360
    const-string v1, "DROP TABLE IF EXISTS "

    .line 361
    .line 362
    invoke-direct {p3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 363
    .line 364
    .line 365
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 366
    .line 367
    .line 368
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 369
    .line 370
    .line 371
    move-result-object p3

    .line 372
    invoke-static {p1, p3}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 373
    .line 374
    .line 375
    goto :goto_b

    .line 376
    :goto_c
    :try_start_1
    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 377
    :catchall_1
    move-exception p1

    .line 378
    invoke-static {p2, p0}, La/ay3;->L(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 379
    .line 380
    .line 381
    throw p1

    .line 382
    :cond_16
    invoke-virtual {v5, p1}, La/pa80;->c(La/qpg0;)V

    .line 383
    .line 384
    .line 385
    :cond_17
    iget-object p0, p0, La/udg0;->e:Ljava/util/List;

    .line 386
    .line 387
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 388
    .line 389
    .line 390
    move-result-object p0

    .line 391
    :cond_18
    :goto_d
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 392
    .line 393
    .line 394
    move-result p2

    .line 395
    if-eqz p2, :cond_19

    .line 396
    .line 397
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 398
    .line 399
    .line 400
    move-result-object p2

    .line 401
    check-cast p2, La/wdg0;

    .line 402
    .line 403
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 404
    .line 405
    .line 406
    instance-of p2, p1, La/okn0;

    .line 407
    .line 408
    if-eqz p2, :cond_18

    .line 409
    .line 410
    move-object p2, p1

    .line 411
    check-cast p2, La/okn0;

    .line 412
    .line 413
    iget-object p2, p2, La/okn0;->a:La/w7r;

    .line 414
    .line 415
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 416
    .line 417
    .line 418
    goto :goto_d

    .line 419
    :cond_19
    invoke-virtual {v5, p1}, La/pa80;->a(La/qpg0;)V

    .line 420
    .line 421
    .line 422
    return-void

    .line 423
    :cond_1a
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 424
    .line 425
    new-instance p1, Ljava/lang/StringBuilder;

    .line 426
    .line 427
    const-string v0, "A migration from "

    .line 428
    .line 429
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 430
    .line 431
    .line 432
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 433
    .line 434
    .line 435
    const-string p2, " to "

    .line 436
    .line 437
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 438
    .line 439
    .line 440
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 441
    .line 442
    .line 443
    const-string p2, " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* functions."

    .line 444
    .line 445
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 446
    .line 447
    .line 448
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 449
    .line 450
    .line 451
    move-result-object p1

    .line 452
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 453
    .line 454
    .line 455
    move-result-object p1

    .line 456
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 457
    .line 458
    .line 459
    throw p0
.end method

.method public final f(La/qpg0;)V
    .locals 9

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string v0, "Pre-packaged database has an invalid schema: "

    .line 5
    .line 6
    const-string v1, "SELECT 1 FROM sqlite_master WHERE type = \'table\' AND name = \'room_master_table\'"

    .line 7
    .line 8
    invoke-interface {p1, v1}, La/qpg0;->Z0(Ljava/lang/String;)La/xpg0;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    :try_start_0
    invoke-interface {v1}, La/xpg0;->W0()Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    const/4 v3, 0x1

    .line 17
    const/4 v4, 0x0

    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    invoke-interface {v1, v4}, La/xpg0;->getLong(I)J

    .line 21
    .line 22
    .line 23
    move-result-wide v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    const-wide/16 v7, 0x0

    .line 25
    .line 26
    cmp-long v2, v5, v7

    .line 27
    .line 28
    if-eqz v2, :cond_0

    .line 29
    .line 30
    move v2, v3

    .line 31
    goto :goto_0

    .line 32
    :catchall_0
    move-exception p0

    .line 33
    goto/16 :goto_7

    .line 34
    .line 35
    :cond_0
    move v2, v4

    .line 36
    :goto_0
    const/4 v5, 0x0

    .line 37
    invoke-static {v1, v5}, La/ay3;->L(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 38
    .line 39
    .line 40
    iget-object v1, p0, La/udg0;->d:La/pa80;

    .line 41
    .line 42
    if-eqz v2, :cond_3

    .line 43
    .line 44
    const-string v0, "SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"

    .line 45
    .line 46
    invoke-interface {p1, v0}, La/qpg0;->Z0(Ljava/lang/String;)La/xpg0;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    :try_start_1
    invoke-interface {v0}, La/xpg0;->W0()Z

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    if-eqz v2, :cond_1

    .line 55
    .line 56
    invoke-interface {v0, v4}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 60
    goto :goto_1

    .line 61
    :catchall_1
    move-exception p0

    .line 62
    goto :goto_2

    .line 63
    :cond_1
    move-object v2, v5

    .line 64
    :goto_1
    invoke-static {v0, v5}, La/ay3;->L(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 65
    .line 66
    .line 67
    iget-object v0, v1, La/pa80;->b:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v0, Ljava/lang/String;

    .line 70
    .line 71
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    if-nez v0, :cond_6

    .line 76
    .line 77
    iget-object v0, v1, La/pa80;->c:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v0, Ljava/lang/String;

    .line 80
    .line 81
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    if-eqz v0, :cond_2

    .line 86
    .line 87
    goto/16 :goto_5

    .line 88
    .line 89
    :cond_2
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 90
    .line 91
    iget-object p1, v1, La/pa80;->b:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast p1, Ljava/lang/String;

    .line 94
    .line 95
    new-instance v0, Ljava/lang/StringBuilder;

    .line 96
    .line 97
    const-string v1, "Room cannot verify the data integrity. Looks like you\'ve changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: "

    .line 98
    .line 99
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    const-string p1, ", found: "

    .line 106
    .line 107
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    throw p0

    .line 125
    :goto_2
    :try_start_2
    throw p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 126
    :catchall_2
    move-exception p1

    .line 127
    invoke-static {v0, p0}, La/ay3;->L(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 128
    .line 129
    .line 130
    throw p1

    .line 131
    :cond_3
    const-string v2, "BEGIN EXCLUSIVE TRANSACTION"

    .line 132
    .line 133
    invoke-static {p1, v2}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    :try_start_3
    sget-object v2, La/j0g0;->b:La/e0g0;

    .line 137
    .line 138
    invoke-virtual {v1, p1}, La/pa80;->w(La/qpg0;)La/t40;

    .line 139
    .line 140
    .line 141
    move-result-object v2

    .line 142
    iget-boolean v4, v2, La/t40;->b:Z

    .line 143
    .line 144
    if-eqz v4, :cond_4

    .line 145
    .line 146
    invoke-virtual {v1, p1}, La/pa80;->u(La/qpg0;)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {p0, p1}, La/udg0;->g(La/qpg0;)V

    .line 150
    .line 151
    .line 152
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 153
    .line 154
    goto :goto_4

    .line 155
    :catchall_3
    move-exception v0

    .line 156
    goto :goto_3

    .line 157
    :cond_4
    new-instance v4, Ljava/lang/IllegalStateException;

    .line 158
    .line 159
    new-instance v5, Ljava/lang/StringBuilder;

    .line 160
    .line 161
    invoke-direct {v5, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    iget-object v0, v2, La/t40;->c:Ljava/lang/String;

    .line 165
    .line 166
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    invoke-direct {v4, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 178
    .line 179
    .line 180
    throw v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 181
    :goto_3
    sget-object v2, La/j0g0;->b:La/e0g0;

    .line 182
    .line 183
    new-instance v2, La/g0g0;

    .line 184
    .line 185
    invoke-direct {v2, v0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 186
    .line 187
    .line 188
    move-object v0, v2

    .line 189
    :goto_4
    nop

    .line 190
    instance-of v2, v0, La/g0g0;

    .line 191
    .line 192
    if-nez v2, :cond_5

    .line 193
    .line 194
    move-object v2, v0

    .line 195
    check-cast v2, Lkotlin/Unit;

    .line 196
    .line 197
    const-string v2, "END TRANSACTION"

    .line 198
    .line 199
    invoke-static {p1, v2}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    :cond_5
    invoke-static {v0}, La/j0g0;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    if-nez v0, :cond_9

    .line 207
    .line 208
    :cond_6
    :goto_5
    invoke-virtual {v1, p1}, La/pa80;->t(La/qpg0;)V

    .line 209
    .line 210
    .line 211
    iget-object v0, p0, La/udg0;->e:Ljava/util/List;

    .line 212
    .line 213
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    :cond_7
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 218
    .line 219
    .line 220
    move-result v1

    .line 221
    if-eqz v1, :cond_8

    .line 222
    .line 223
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v1

    .line 227
    check-cast v1, La/wdg0;

    .line 228
    .line 229
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 230
    .line 231
    .line 232
    instance-of v2, p1, La/okn0;

    .line 233
    .line 234
    if-eqz v2, :cond_7

    .line 235
    .line 236
    move-object v2, p1

    .line 237
    check-cast v2, La/okn0;

    .line 238
    .line 239
    iget-object v2, v2, La/okn0;->a:La/w7r;

    .line 240
    .line 241
    invoke-virtual {v1, v2}, La/wdg0;->a(La/w7r;)V

    .line 242
    .line 243
    .line 244
    goto :goto_6

    .line 245
    :cond_8
    iput-boolean v3, p0, La/udg0;->a:Z

    .line 246
    .line 247
    return-void

    .line 248
    :cond_9
    const-string p0, "ROLLBACK TRANSACTION"

    .line 249
    .line 250
    invoke-static {p1, p0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 251
    .line 252
    .line 253
    throw v0

    .line 254
    :goto_7
    :try_start_4
    throw p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 255
    :catchall_4
    move-exception p1

    .line 256
    invoke-static {v1, p0}, La/ay3;->L(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 257
    .line 258
    .line 259
    throw p1
.end method

.method public final g(La/qpg0;)V
    .locals 2

    .line 1
    const-string v0, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)"

    .line 2
    .line 3
    invoke-static {p1, v0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, La/udg0;->d:La/pa80;

    .line 7
    .line 8
    iget-object p0, p0, La/pa80;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p0, Ljava/lang/String;

    .line 11
    .line 12
    new-instance v0, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const-string v1, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \'"

    .line 15
    .line 16
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const-string p0, "\')"

    .line 23
    .line 24
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-static {p1, p0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

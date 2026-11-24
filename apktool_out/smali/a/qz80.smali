.class public final La/qz80;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/s1e;


# instance fields
.field public final a:La/xg0;

.field public final b:La/due0;

.field public final c:Ljava/util/concurrent/locks/ReentrantLock;

.field public final d:La/k050;

.field public final e:La/mi70;

.field public f:La/qpg0;

.field public volatile g:Z


# direct methods
.method public constructor <init>(La/xg0;La/due0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/qz80;->a:La/xg0;

    .line 5
    .line 6
    iput-object p2, p0, La/qz80;->b:La/due0;

    .line 7
    .line 8
    new-instance p1, Ljava/util/concurrent/locks/ReentrantLock;

    .line 9
    .line 10
    invoke-direct {p1}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, La/qz80;->c:Ljava/util/concurrent/locks/ReentrantLock;

    .line 14
    .line 15
    new-instance p1, La/k050;

    .line 16
    .line 17
    invoke-direct {p1}, La/k050;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, La/qz80;->d:La/k050;

    .line 21
    .line 22
    new-instance p1, La/mi70;

    .line 23
    .line 24
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object p1, p0, La/qz80;->e:La/mi70;

    .line 28
    .line 29
    return-void
.end method


# virtual methods
.method public final a(La/gv60;La/zje;)Ljava/lang/Object;
    .locals 10

    .line 1
    instance-of v0, p2, La/pz80;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/pz80;

    .line 7
    .line 8
    iget v1, v0, La/pz80;->l:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/pz80;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/pz80;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/pz80;-><init>(La/qz80;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/pz80;->j:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/pz80;->l:I

    .line 30
    .line 31
    const-string v3, "Resumed on a different thread during connection pool initialization. This can occur when Room\'s SupportSQLite wrapper is used with a suspending driver. Please report this issue at https://issuetracker.google.com/issues/new?component=413107&template=1096568."

    .line 32
    .line 33
    const/4 v4, 0x0

    .line 34
    const/4 v5, 0x2

    .line 35
    const/4 v6, 0x1

    .line 36
    iget-object v7, p0, La/qz80;->c:Ljava/util/concurrent/locks/ReentrantLock;

    .line 37
    .line 38
    if-eqz v2, :cond_3

    .line 39
    .line 40
    if-eq v2, v6, :cond_2

    .line 41
    .line 42
    if-ne v2, v5, :cond_1

    .line 43
    .line 44
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    goto/16 :goto_5

    .line 48
    .line 49
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 50
    .line 51
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    return-object v4

    .line 55
    :cond_2
    iget-wide p0, v0, La/pz80;->i:J

    .line 56
    .line 57
    :try_start_0
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 58
    .line 59
    .line 60
    goto :goto_2

    .line 61
    :catchall_0
    move-exception p2

    .line 62
    goto :goto_3

    .line 63
    :cond_3
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    sget-object p2, La/vw90;->a:La/tw90;

    .line 67
    .line 68
    sget-object v2, La/tw90;->a:La/tw90;

    .line 69
    .line 70
    if-ne p2, v2, :cond_8

    .line 71
    .line 72
    invoke-interface {v0}, La/yje;->getContext()Lkotlin/coroutines/CoroutineContext;

    .line 73
    .line 74
    .line 75
    move-result-object p2

    .line 76
    sget-object v2, Lkotlin/coroutines/d;->d1:La/ake;

    .line 77
    .line 78
    invoke-interface {p2, v2}, Lkotlin/coroutines/CoroutineContext;->get(Lkotlin/coroutines/f;)Lkotlin/coroutines/CoroutineContext$Element;

    .line 79
    .line 80
    .line 81
    move-result-object p2

    .line 82
    sget-object v2, La/tvk;->b:La/l7t0;

    .line 83
    .line 84
    if-ne p2, v2, :cond_8

    .line 85
    .line 86
    invoke-interface {v0}, La/yje;->getContext()Lkotlin/coroutines/CoroutineContext;

    .line 87
    .line 88
    .line 89
    move-result-object p2

    .line 90
    sget-object v2, La/rne;->c:La/kud;

    .line 91
    .line 92
    invoke-interface {p2, v2}, Lkotlin/coroutines/CoroutineContext;->get(Lkotlin/coroutines/f;)Lkotlin/coroutines/CoroutineContext$Element;

    .line 93
    .line 94
    .line 95
    move-result-object p2

    .line 96
    check-cast p2, La/rne;

    .line 97
    .line 98
    if-eqz p2, :cond_4

    .line 99
    .line 100
    iget-object p2, p2, La/rne;->b:Ljava/lang/String;

    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_4
    move-object p2, v4

    .line 104
    :goto_1
    const-string v2, "RoomSupportSQLiteTransaction"

    .line 105
    .line 106
    invoke-static {p2, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result p2

    .line 110
    if-eqz p2, :cond_8

    .line 111
    .line 112
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    invoke-virtual {p0}, Ljava/lang/Thread;->getId()J

    .line 117
    .line 118
    .line 119
    move-result-wide v8

    .line 120
    invoke-virtual {v7}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 121
    .line 122
    .line 123
    :try_start_1
    iput-wide v8, v0, La/pz80;->i:J

    .line 124
    .line 125
    iput v6, v0, La/pz80;->l:I

    .line 126
    .line 127
    invoke-virtual {p1, v0}, La/gv60;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 131
    if-ne p0, v1, :cond_5

    .line 132
    .line 133
    goto :goto_4

    .line 134
    :cond_5
    move-wide p0, v8

    .line 135
    :goto_2
    :try_start_2
    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 136
    .line 137
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    invoke-virtual {v0}, Ljava/lang/Thread;->getId()J

    .line 142
    .line 143
    .line 144
    move-result-wide v0

    .line 145
    cmp-long p0, p0, v0

    .line 146
    .line 147
    if-nez p0, :cond_6

    .line 148
    .line 149
    invoke-virtual {v7}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 150
    .line 151
    .line 152
    return-object p2

    .line 153
    :cond_6
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    return-object v4

    .line 157
    :catchall_1
    move-exception p2

    .line 158
    move-wide p0, v8

    .line 159
    :goto_3
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    invoke-virtual {v0}, Ljava/lang/Thread;->getId()J

    .line 164
    .line 165
    .line 166
    move-result-wide v0

    .line 167
    cmp-long p0, p0, v0

    .line 168
    .line 169
    if-eqz p0, :cond_7

    .line 170
    .line 171
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    return-object v4

    .line 175
    :cond_7
    invoke-virtual {v7}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 176
    .line 177
    .line 178
    throw p2

    .line 179
    :cond_8
    new-instance p2, La/epp;

    .line 180
    .line 181
    const/16 v2, 0x14

    .line 182
    .line 183
    invoke-direct {p2, p1, v4, v2}, La/epp;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 184
    .line 185
    .line 186
    iput v5, v0, La/pz80;->l:I

    .line 187
    .line 188
    iget-object p0, p0, La/qz80;->d:La/k050;

    .line 189
    .line 190
    invoke-static {p0, p2, v0}, La/vdx;->h0(La/i050;Lkotlin/jvm/functions/Function1;La/zje;)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object p0

    .line 194
    if-ne p0, v1, :cond_9

    .line 195
    .line 196
    :goto_4
    return-object v1

    .line 197
    :cond_9
    :goto_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 198
    .line 199
    return-object p0
.end method

.method public final close()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, La/qz80;->g:Z

    .line 3
    .line 4
    iget-object p0, p0, La/qz80;->f:La/qpg0;

    .line 5
    .line 6
    if-eqz p0, :cond_1

    .line 7
    .line 8
    if-eqz p0, :cond_0

    .line 9
    .line 10
    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    const-string p0, "connection"

    .line 15
    .line 16
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    throw p0

    .line 21
    :cond_1
    return-void
.end method

.method public final m(ZLkotlin/jvm/functions/Function2;La/zje;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of p1, p3, La/oz80;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    move-object p1, p3

    .line 6
    check-cast p1, La/oz80;

    .line 7
    .line 8
    iget v0, p1, La/oz80;->l:I

    .line 9
    .line 10
    const/high16 v1, -0x80000000

    .line 11
    .line 12
    and-int v2, v0, v1

    .line 13
    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    sub-int/2addr v0, v1

    .line 17
    iput v0, p1, La/oz80;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance p1, La/oz80;

    .line 21
    .line 22
    invoke-direct {p1, p0, p3}, La/oz80;-><init>(La/qz80;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, p1, La/oz80;->j:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v0, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v1, p1, La/oz80;->l:I

    .line 30
    .line 31
    const/4 v2, 0x3

    .line 32
    const/4 v3, 0x2

    .line 33
    const/4 v4, 0x1

    .line 34
    const/4 v5, 0x0

    .line 35
    if-eqz v1, :cond_4

    .line 36
    .line 37
    if-eq v1, v4, :cond_3

    .line 38
    .line 39
    if-eq v1, v3, :cond_2

    .line 40
    .line 41
    if-ne v1, v2, :cond_1

    .line 42
    .line 43
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    return-object p3

    .line 47
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    return-object v5

    .line 53
    :cond_2
    iget-object p2, p1, La/oz80;->i:Lkotlin/jvm/functions/Function2;

    .line 54
    .line 55
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_3
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    return-object p3

    .line 63
    :cond_4
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    iget-boolean p3, p0, La/qz80;->g:Z

    .line 67
    .line 68
    if-nez p3, :cond_b

    .line 69
    .line 70
    invoke-interface {p1}, La/yje;->getContext()Lkotlin/coroutines/CoroutineContext;

    .line 71
    .line 72
    .line 73
    move-result-object p3

    .line 74
    iget-object v1, p0, La/qz80;->e:La/mi70;

    .line 75
    .line 76
    invoke-interface {p3, v1}, Lkotlin/coroutines/CoroutineContext;->get(Lkotlin/coroutines/f;)Lkotlin/coroutines/CoroutineContext$Element;

    .line 77
    .line 78
    .line 79
    move-result-object p3

    .line 80
    check-cast p3, La/nz80;

    .line 81
    .line 82
    if-eqz p3, :cond_5

    .line 83
    .line 84
    iget-object p3, p3, La/nz80;->b:La/mz80;

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_5
    move-object p3, v5

    .line 88
    :goto_1
    if-eqz p3, :cond_7

    .line 89
    .line 90
    iput v4, p1, La/oz80;->l:I

    .line 91
    .line 92
    invoke-interface {p2, p3, p1}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    if-ne p0, v0, :cond_6

    .line 97
    .line 98
    goto :goto_3

    .line 99
    :cond_6
    return-object p0

    .line 100
    :cond_7
    iget-object p3, p0, La/qz80;->f:La/qpg0;

    .line 101
    .line 102
    if-nez p3, :cond_8

    .line 103
    .line 104
    new-instance p3, La/gv60;

    .line 105
    .line 106
    invoke-direct {p3, p0, v5, v3}, La/gv60;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 107
    .line 108
    .line 109
    iput-object p2, p1, La/oz80;->i:Lkotlin/jvm/functions/Function2;

    .line 110
    .line 111
    iput v3, p1, La/oz80;->l:I

    .line 112
    .line 113
    invoke-virtual {p0, p3, p1}, La/qz80;->a(La/gv60;La/zje;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object p3

    .line 117
    if-ne p3, v0, :cond_8

    .line 118
    .line 119
    goto :goto_3

    .line 120
    :cond_8
    :goto_2
    new-instance p3, La/mz80;

    .line 121
    .line 122
    iget-object v1, p0, La/qz80;->b:La/due0;

    .line 123
    .line 124
    iget-object v3, p0, La/qz80;->f:La/qpg0;

    .line 125
    .line 126
    if-eqz v3, :cond_a

    .line 127
    .line 128
    invoke-direct {p3, v1, v3}, La/mz80;-><init>(La/due0;La/qpg0;)V

    .line 129
    .line 130
    .line 131
    new-instance v1, La/nz80;

    .line 132
    .line 133
    iget-object p0, p0, La/qz80;->e:La/mi70;

    .line 134
    .line 135
    invoke-direct {v1, p0, p3}, La/nz80;-><init>(Lkotlin/coroutines/f;La/mz80;)V

    .line 136
    .line 137
    .line 138
    new-instance p0, La/wk70;

    .line 139
    .line 140
    const/16 v3, 0x1c

    .line 141
    .line 142
    invoke-direct {p0, p2, p3, v5, v3}, La/wk70;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 143
    .line 144
    .line 145
    iput-object v5, p1, La/oz80;->i:Lkotlin/jvm/functions/Function2;

    .line 146
    .line 147
    iput v2, p1, La/oz80;->l:I

    .line 148
    .line 149
    invoke-static {v1, p0, p1}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object p0

    .line 153
    if-ne p0, v0, :cond_9

    .line 154
    .line 155
    :goto_3
    return-object v0

    .line 156
    :cond_9
    return-object p0

    .line 157
    :cond_a
    const-string p0, "connection"

    .line 158
    .line 159
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    throw v5

    .line 163
    :cond_b
    const/16 p0, 0x15

    .line 164
    .line 165
    const-string p1, "Connection pool is closed"

    .line 166
    .line 167
    invoke-static {p0, p1}, La/m2x;->J(ILjava/lang/String;)V

    .line 168
    .line 169
    .line 170
    throw v5
.end method

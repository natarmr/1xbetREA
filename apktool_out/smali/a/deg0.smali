.class public final La/deg0;
.super La/wh00;
.source "SourceFile"


# instance fields
.field public final l:Landroidx/work/impl/WorkDatabase_Impl;

.field public final m:La/ieu;

.field public final n:Z

.field public final o:La/heg0;

.field public final p:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final q:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final r:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final s:Lkotlin/coroutines/CoroutineContext;

.field public final t:La/m8s0;


# direct methods
.method public constructor <init>(Landroidx/work/impl/WorkDatabase_Impl;La/ieu;[Ljava/lang/String;La/m8s0;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, La/wh00;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/deg0;->l:Landroidx/work/impl/WorkDatabase_Impl;

    .line 8
    .line 9
    iput-object p2, p0, La/deg0;->m:La/ieu;

    .line 10
    .line 11
    const/4 p2, 0x1

    .line 12
    iput-boolean p2, p0, La/deg0;->n:Z

    .line 13
    .line 14
    new-instance v0, La/heg0;

    .line 15
    .line 16
    invoke-direct {v0, p3, p0}, La/heg0;-><init>([Ljava/lang/String;La/deg0;)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, La/deg0;->o:La/heg0;

    .line 20
    .line 21
    new-instance p3, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 22
    .line 23
    invoke-direct {p3, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 24
    .line 25
    .line 26
    iput-object p3, p0, La/deg0;->p:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 27
    .line 28
    new-instance p2, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 29
    .line 30
    const/4 p3, 0x0

    .line 31
    invoke-direct {p2, p3}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 32
    .line 33
    .line 34
    iput-object p2, p0, La/deg0;->q:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 35
    .line 36
    new-instance p2, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 37
    .line 38
    invoke-direct {p2, p3}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 39
    .line 40
    .line 41
    iput-object p2, p0, La/deg0;->r:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 42
    .line 43
    invoke-virtual {p1}, La/aeg0;->k()Z

    .line 44
    .line 45
    .line 46
    move-result p2

    .line 47
    if-eqz p2, :cond_1

    .line 48
    .line 49
    iget-object p1, p1, La/aeg0;->b:Lkotlin/coroutines/CoroutineContext;

    .line 50
    .line 51
    if-eqz p1, :cond_0

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    const-string p0, "transactionContext"

    .line 55
    .line 56
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    const/4 p0, 0x0

    .line 60
    throw p0

    .line 61
    :cond_1
    sget-object p1, Lkotlin/coroutines/g;->a:Lkotlin/coroutines/g;

    .line 62
    .line 63
    :goto_0
    iput-object p1, p0, La/deg0;->s:Lkotlin/coroutines/CoroutineContext;

    .line 64
    .line 65
    iput-object p4, p0, La/deg0;->t:La/m8s0;

    .line 66
    .line 67
    return-void
.end method


# virtual methods
.method public final g()V
    .locals 4

    .line 1
    iget-object v0, p0, La/deg0;->m:La/ieu;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v0, v0, La/ieu;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Ljava/util/Set;

    .line 9
    .line 10
    invoke-interface {v0, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, La/deg0;->l:Landroidx/work/impl/WorkDatabase_Impl;

    .line 14
    .line 15
    invoke-virtual {v0}, La/aeg0;->f()La/vne;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    new-instance v1, La/geg0;

    .line 20
    .line 21
    const/4 v2, 0x1

    .line 22
    const/4 v3, 0x0

    .line 23
    invoke-direct {v1, p0, v3, v2}, La/geg0;-><init>(La/deg0;La/yje;B)V

    .line 24
    .line 25
    .line 26
    const/4 v2, 0x2

    .line 27
    iget-object p0, p0, La/deg0;->s:Lkotlin/coroutines/CoroutineContext;

    .line 28
    .line 29
    invoke-static {v0, p0, v3, v1, v2}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final h()V
    .locals 1

    .line 1
    iget-object v0, p0, La/deg0;->m:La/ieu;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v0, v0, La/ieu;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Ljava/util/Set;

    .line 9
    .line 10
    invoke-interface {v0, p0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final m(La/zje;)Ljava/lang/Object;
    .locals 12

    .line 1
    instance-of v0, p1, La/ieg0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/ieg0;

    .line 7
    .line 8
    iget v1, v0, La/ieg0;->m:I

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
    iput v1, v0, La/ieg0;->m:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/ieg0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, La/ieg0;-><init>(La/deg0;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, La/ieg0;->k:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/ieg0;->m:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x0

    .line 33
    const/4 v5, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v5, :cond_1

    .line 37
    .line 38
    iget-boolean p0, v0, La/ieg0;->j:Z

    .line 39
    .line 40
    iget-object v2, v0, La/ieg0;->i:La/deg0;

    .line 41
    .line 42
    :try_start_0
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    .line 44
    .line 45
    goto/16 :goto_5

    .line 46
    .line 47
    :catchall_0
    move-exception p0

    .line 48
    goto/16 :goto_7

    .line 49
    .line 50
    :catch_0
    move-exception p0

    .line 51
    goto/16 :goto_6

    .line 52
    .line 53
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 54
    .line 55
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    return-object v3

    .line 59
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    iget-object p1, p0, La/deg0;->r:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 63
    .line 64
    invoke-virtual {p1, v4, v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    if-eqz p1, :cond_5

    .line 69
    .line 70
    iget-object p1, p0, La/deg0;->l:Landroidx/work/impl/WorkDatabase_Impl;

    .line 71
    .line 72
    invoke-virtual {p1}, La/aeg0;->g()La/mox;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    iget-object v2, p0, La/deg0;->o:La/heg0;

    .line 77
    .line 78
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    new-instance v6, La/f1v0;

    .line 82
    .line 83
    invoke-direct {v6, p1, v2}, La/f1v0;-><init>(La/mox;La/heg0;)V

    .line 84
    .line 85
    .line 86
    iget-object v2, p1, La/mox;->c:Ljava/util/LinkedHashMap;

    .line 87
    .line 88
    iget-object v7, p1, La/mox;->b:La/krs0;

    .line 89
    .line 90
    iget-object v8, v6, La/iox;->a:[Ljava/lang/String;

    .line 91
    .line 92
    invoke-virtual {v7, v8}, La/krs0;->k([Ljava/lang/String;)Lkotlin/Pair;

    .line 93
    .line 94
    .line 95
    move-result-object v8

    .line 96
    iget-object v9, v8, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v9, [Ljava/lang/String;

    .line 99
    .line 100
    iget-object v8, v8, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v8, [I

    .line 103
    .line 104
    new-instance v10, La/he60;

    .line 105
    .line 106
    invoke-direct {v10, v6, v8, v9}, La/he60;-><init>(La/iox;[I[Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    iget-object v9, p1, La/mox;->d:Ljava/util/concurrent/locks/ReentrantLock;

    .line 110
    .line 111
    invoke-virtual {v9}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 112
    .line 113
    .line 114
    :try_start_1
    invoke-interface {v2, v6}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result v11

    .line 118
    if-eqz v11, :cond_3

    .line 119
    .line 120
    invoke-static {v2, v6}, La/xp20;->d(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    check-cast v2, La/he60;

    .line 125
    .line 126
    goto :goto_1

    .line 127
    :catchall_1
    move-exception p0

    .line 128
    goto :goto_3

    .line 129
    :cond_3
    invoke-interface {v2, v6, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v2

    .line 133
    check-cast v2, La/he60;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 134
    .line 135
    :goto_1
    invoke-virtual {v9}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 136
    .line 137
    .line 138
    if-nez v2, :cond_4

    .line 139
    .line 140
    iget-object v2, v7, La/krs0;->h:Ljava/lang/Object;

    .line 141
    .line 142
    check-cast v2, La/o24;

    .line 143
    .line 144
    invoke-virtual {v2, v8}, La/o24;->i([I)Z

    .line 145
    .line 146
    .line 147
    move-result v2

    .line 148
    if-eqz v2, :cond_4

    .line 149
    .line 150
    move v2, v5

    .line 151
    goto :goto_2

    .line 152
    :cond_4
    move v2, v4

    .line 153
    :goto_2
    if-eqz v2, :cond_5

    .line 154
    .line 155
    new-instance v2, La/jox;

    .line 156
    .line 157
    invoke-direct {v2, p1, v3, v4}, La/jox;-><init>(La/mox;La/yje;B)V

    .line 158
    .line 159
    .line 160
    invoke-static {v2}, La/yyw;->Y(Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    goto :goto_4

    .line 164
    :goto_3
    invoke-virtual {v9}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 165
    .line 166
    .line 167
    throw p0

    .line 168
    :cond_5
    :goto_4
    iget-object p1, p0, La/deg0;->q:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 169
    .line 170
    invoke-virtual {p1, v4, v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 171
    .line 172
    .line 173
    move-result p1

    .line 174
    move-object v2, p0

    .line 175
    if-eqz p1, :cond_9

    .line 176
    .line 177
    move-object p1, v3

    .line 178
    move p0, v4

    .line 179
    :goto_5
    :try_start_2
    iget-object v6, v2, La/deg0;->p:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 180
    .line 181
    invoke-virtual {v6, v5, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 182
    .line 183
    .line 184
    move-result v6
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 185
    if-eqz v6, :cond_7

    .line 186
    .line 187
    :try_start_3
    iput-object v2, v0, La/ieg0;->i:La/deg0;

    .line 188
    .line 189
    iput-boolean v5, v0, La/ieg0;->j:Z

    .line 190
    .line 191
    iput v5, v0, La/ieg0;->m:I

    .line 192
    .line 193
    iget-object p0, v2, La/deg0;->l:Landroidx/work/impl/WorkDatabase_Impl;

    .line 194
    .line 195
    iget-boolean p1, v2, La/deg0;->n:Z

    .line 196
    .line 197
    iget-object v6, v2, La/deg0;->t:La/m8s0;

    .line 198
    .line 199
    invoke-static {p0, v5, p1, v6, v0}, La/kpb;->i0(La/aeg0;ZZLkotlin/jvm/functions/Function1;La/zje;)Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object p1
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 203
    if-ne p1, v1, :cond_6

    .line 204
    .line 205
    return-object v1

    .line 206
    :cond_6
    move p0, v5

    .line 207
    goto :goto_5

    .line 208
    :goto_6
    :try_start_4
    new-instance p1, Ljava/lang/RuntimeException;

    .line 209
    .line 210
    const-string v0, "Exception while computing database live data."

    .line 211
    .line 212
    invoke-direct {p1, v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 213
    .line 214
    .line 215
    throw p1

    .line 216
    :cond_7
    if-eqz p0, :cond_8

    .line 217
    .line 218
    invoke-virtual {v2, p1}, La/wh00;->i(Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 219
    .line 220
    .line 221
    :cond_8
    iget-object p1, v2, La/deg0;->q:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 222
    .line 223
    invoke-virtual {p1, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 224
    .line 225
    .line 226
    goto :goto_8

    .line 227
    :goto_7
    iget-object p1, v2, La/deg0;->q:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 228
    .line 229
    invoke-virtual {p1, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 230
    .line 231
    .line 232
    throw p0

    .line 233
    :cond_9
    move p0, v4

    .line 234
    :goto_8
    if-eqz p0, :cond_b

    .line 235
    .line 236
    iget-object p0, v2, La/deg0;->p:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 237
    .line 238
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 239
    .line 240
    .line 241
    move-result p0

    .line 242
    if-nez p0, :cond_a

    .line 243
    .line 244
    goto :goto_9

    .line 245
    :cond_a
    move-object p0, v2

    .line 246
    goto :goto_4

    .line 247
    :cond_b
    :goto_9
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 248
    .line 249
    return-object p0
.end method

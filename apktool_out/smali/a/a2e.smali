.class public final La/a2e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/t1e;


# instance fields
.field public final a:La/hva0;

.field public final b:La/hva0;

.field public final c:Ljava/lang/ThreadLocal;

.field public final d:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final e:J


# direct methods
.method public constructor <init>(La/ehf0;)V
    .locals 3

    .line 69
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 70
    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    iput-object v0, p0, La/a2e;->c:Ljava/lang/ThreadLocal;

    .line 71
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, La/a2e;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 72
    sget-object v0, La/wen;->b:La/uen;

    const/16 v0, 0x1e

    sget-object v1, La/bfn;->e:La/bfn;

    invoke-static {v0, v1}, La/ibc;->v0(ILa/bfn;)J

    move-result-wide v0

    iput-wide v0, p0, La/a2e;->e:J

    .line 73
    new-instance v0, La/hva0;

    new-instance v1, La/jwd;

    const/4 v2, 0x3

    invoke-direct {v1, p1, v2}, La/jwd;-><init>(Ljava/lang/Object;B)V

    const/4 p1, 0x1

    invoke-direct {v0, p1, v1}, La/hva0;-><init>(ILkotlin/jvm/functions/Function0;)V

    iput-object v0, p0, La/a2e;->a:La/hva0;

    .line 74
    iput-object v0, p0, La/a2e;->b:La/hva0;

    return-void
.end method

.method public constructor <init>(La/ehf0;Ljava/lang/String;I)V
    .locals 4

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    new-instance v0, Ljava/lang/ThreadLocal;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, La/a2e;->c:Ljava/lang/ThreadLocal;

    .line 13
    .line 14
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, La/a2e;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 21
    .line 22
    sget-object v0, La/wen;->b:La/uen;

    .line 23
    .line 24
    const/16 v0, 0x1e

    .line 25
    .line 26
    sget-object v2, La/bfn;->e:La/bfn;

    .line 27
    .line 28
    invoke-static {v0, v2}, La/ibc;->v0(ILa/bfn;)J

    .line 29
    .line 30
    .line 31
    move-result-wide v2

    .line 32
    iput-wide v2, p0, La/a2e;->e:J

    .line 33
    .line 34
    if-lez p3, :cond_0

    .line 35
    .line 36
    new-instance v0, La/hva0;

    .line 37
    .line 38
    new-instance v2, La/v1e;

    .line 39
    .line 40
    invoke-direct {v2, p1, p2, v1}, La/v1e;-><init>(La/ehf0;Ljava/lang/String;B)V

    .line 41
    .line 42
    .line 43
    invoke-direct {v0, p3, v2}, La/hva0;-><init>(ILkotlin/jvm/functions/Function0;)V

    .line 44
    .line 45
    .line 46
    iput-object v0, p0, La/a2e;->a:La/hva0;

    .line 47
    .line 48
    new-instance p3, La/hva0;

    .line 49
    .line 50
    new-instance v0, La/v1e;

    .line 51
    .line 52
    const/4 v1, 0x1

    .line 53
    invoke-direct {v0, p1, p2, v1}, La/v1e;-><init>(La/ehf0;Ljava/lang/String;B)V

    .line 54
    .line 55
    .line 56
    invoke-direct {p3, v1, v0}, La/hva0;-><init>(ILkotlin/jvm/functions/Function0;)V

    .line 57
    .line 58
    .line 59
    iput-object p3, p0, La/a2e;->b:La/hva0;

    .line 60
    .line 61
    return-void

    .line 62
    :cond_0
    const-string p0, "Maximum number of readers must be greater than 0"

    .line 63
    .line 64
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    const/4 p0, 0x0

    .line 68
    throw p0
.end method


# virtual methods
.method public final a(Z)V
    .locals 3

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    const-string p1, "reader"

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    const-string p1, "writer"

    .line 7
    .line 8
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 11
    .line 12
    .line 13
    new-instance v1, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string v2, "Timed out attempting to acquire a "

    .line 16
    .line 17
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string p1, " connection."

    .line 24
    .line 25
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string p1, "\n\nWriter pool:\n"

    .line 36
    .line 37
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    iget-object p1, p0, La/a2e;->b:La/hva0;

    .line 41
    .line 42
    invoke-virtual {p1, v0}, La/hva0;->c(Ljava/lang/StringBuilder;)V

    .line 43
    .line 44
    .line 45
    const-string p1, "Reader pool:"

    .line 46
    .line 47
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const/16 p1, 0xa

    .line 51
    .line 52
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    iget-object p0, p0, La/a2e;->a:La/hva0;

    .line 56
    .line 57
    invoke-virtual {p0, v0}, La/hva0;->c(Ljava/lang/StringBuilder;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    const/4 p1, 0x5

    .line 65
    invoke-static {p1, p0}, La/m2x;->J(ILjava/lang/String;)V

    .line 66
    .line 67
    .line 68
    const/4 p0, 0x0

    .line 69
    throw p0
.end method

.method public final close()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    iget-object v2, p0, La/a2e;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 4
    .line 5
    invoke-virtual {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, La/a2e;->a:La/hva0;

    .line 12
    .line 13
    invoke-virtual {v0}, La/hva0;->b()V

    .line 14
    .line 15
    .line 16
    iget-object p0, p0, La/a2e;->b:La/hva0;

    .line 17
    .line 18
    invoke-virtual {p0}, La/hva0;->b()V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
.end method

.method public final m(ZLkotlin/jvm/functions/Function2;La/zje;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v3, p2

    .line 6
    .line 7
    move-object/from16 v0, p3

    .line 8
    .line 9
    instance-of v4, v0, La/x1e;

    .line 10
    .line 11
    if-eqz v4, :cond_0

    .line 12
    .line 13
    move-object v4, v0

    .line 14
    check-cast v4, La/x1e;

    .line 15
    .line 16
    iget v5, v4, La/x1e;->r:I

    .line 17
    .line 18
    const/high16 v6, -0x80000000

    .line 19
    .line 20
    and-int v7, v5, v6

    .line 21
    .line 22
    if-eqz v7, :cond_0

    .line 23
    .line 24
    sub-int/2addr v5, v6

    .line 25
    iput v5, v4, La/x1e;->r:I

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    new-instance v4, La/x1e;

    .line 29
    .line 30
    invoke-direct {v4, v1, v0}, La/x1e;-><init>(La/a2e;La/zje;)V

    .line 31
    .line 32
    .line 33
    :goto_0
    iget-object v0, v4, La/x1e;->p:Ljava/lang/Object;

    .line 34
    .line 35
    sget-object v5, La/wne;->a:La/wne;

    .line 36
    .line 37
    iget v6, v4, La/x1e;->r:I

    .line 38
    .line 39
    const-string v7, "ROLLBACK TRANSACTION"

    .line 40
    .line 41
    const/4 v9, 0x4

    .line 42
    const/4 v10, 0x3

    .line 43
    const/4 v11, 0x2

    .line 44
    const/4 v12, 0x1

    .line 45
    const/4 v13, 0x0

    .line 46
    if-eqz v6, :cond_5

    .line 47
    .line 48
    if-eq v6, v12, :cond_4

    .line 49
    .line 50
    if-eq v6, v11, :cond_3

    .line 51
    .line 52
    if-eq v6, v10, :cond_2

    .line 53
    .line 54
    if-ne v6, v9, :cond_1

    .line 55
    .line 56
    iget-object v1, v4, La/x1e;->j:Ljava/io/Serializable;

    .line 57
    .line 58
    check-cast v1, La/mie0;

    .line 59
    .line 60
    iget-object v2, v4, La/x1e;->i:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v2, La/hva0;

    .line 63
    .line 64
    :try_start_0
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 65
    .line 66
    .line 67
    goto/16 :goto_d

    .line 68
    .line 69
    :catchall_0
    move-exception v0

    .line 70
    move-object v11, v1

    .line 71
    :goto_1
    move-object v1, v0

    .line 72
    goto/16 :goto_e

    .line 73
    .line 74
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 75
    .line 76
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    return-object v13

    .line 80
    :cond_2
    iget-boolean v1, v4, La/x1e;->o:Z

    .line 81
    .line 82
    iget-object v2, v4, La/x1e;->n:La/mie0;

    .line 83
    .line 84
    iget-object v3, v4, La/x1e;->m:Lkotlin/coroutines/CoroutineContext;

    .line 85
    .line 86
    iget-object v6, v4, La/x1e;->l:La/mie0;

    .line 87
    .line 88
    iget-object v10, v4, La/x1e;->k:La/hva0;

    .line 89
    .line 90
    iget-object v11, v4, La/x1e;->j:Ljava/io/Serializable;

    .line 91
    .line 92
    check-cast v11, Lkotlin/jvm/functions/Function2;

    .line 93
    .line 94
    iget-object v14, v4, La/x1e;->i:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v14, La/a2e;

    .line 97
    .line 98
    :try_start_1
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 99
    .line 100
    .line 101
    move-object v0, v3

    .line 102
    move-object v3, v11

    .line 103
    goto/16 :goto_6

    .line 104
    .line 105
    :catchall_1
    move-exception v0

    .line 106
    move-object v15, v2

    .line 107
    move v2, v1

    .line 108
    move-object v1, v14

    .line 109
    move-object v14, v3

    .line 110
    move-object v3, v11

    .line 111
    goto/16 :goto_8

    .line 112
    .line 113
    :cond_3
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    return-object v0

    .line 117
    :cond_4
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    return-object v0

    .line 121
    :cond_5
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    iget-object v0, v1, La/a2e;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 125
    .line 126
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 127
    .line 128
    .line 129
    move-result v0

    .line 130
    if-nez v0, :cond_1a

    .line 131
    .line 132
    iget-object v0, v1, La/a2e;->c:Ljava/lang/ThreadLocal;

    .line 133
    .line 134
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v6

    .line 138
    check-cast v6, La/yva0;

    .line 139
    .line 140
    sget-object v14, La/l1e;->b:La/nwd;

    .line 141
    .line 142
    if-nez v6, :cond_7

    .line 143
    .line 144
    invoke-interface {v4}, La/yje;->getContext()Lkotlin/coroutines/CoroutineContext;

    .line 145
    .line 146
    .line 147
    move-result-object v6

    .line 148
    invoke-interface {v6, v14}, Lkotlin/coroutines/CoroutineContext;->get(Lkotlin/coroutines/f;)Lkotlin/coroutines/CoroutineContext$Element;

    .line 149
    .line 150
    .line 151
    move-result-object v6

    .line 152
    check-cast v6, La/l1e;

    .line 153
    .line 154
    if-eqz v6, :cond_6

    .line 155
    .line 156
    iget-object v6, v6, La/l1e;->a:La/yva0;

    .line 157
    .line 158
    goto :goto_2

    .line 159
    :cond_6
    move-object v6, v13

    .line 160
    :cond_7
    :goto_2
    if-eqz v6, :cond_d

    .line 161
    .line 162
    if-nez v2, :cond_9

    .line 163
    .line 164
    iget-boolean v1, v6, La/yva0;->b:Z

    .line 165
    .line 166
    if-nez v1, :cond_8

    .line 167
    .line 168
    goto :goto_3

    .line 169
    :cond_8
    const-string v0, "Cannot upgrade connection from reader to writer"

    .line 170
    .line 171
    invoke-static {v12, v0}, La/m2x;->J(ILjava/lang/String;)V

    .line 172
    .line 173
    .line 174
    throw v13

    .line 175
    :cond_9
    :goto_3
    invoke-interface {v4}, La/yje;->getContext()Lkotlin/coroutines/CoroutineContext;

    .line 176
    .line 177
    .line 178
    move-result-object v1

    .line 179
    invoke-interface {v1, v14}, Lkotlin/coroutines/CoroutineContext;->get(Lkotlin/coroutines/f;)Lkotlin/coroutines/CoroutineContext$Element;

    .line 180
    .line 181
    .line 182
    move-result-object v1

    .line 183
    if-nez v1, :cond_b

    .line 184
    .line 185
    new-instance v1, La/l1e;

    .line 186
    .line 187
    invoke-direct {v1, v6}, La/l1e;-><init>(La/yva0;)V

    .line 188
    .line 189
    .line 190
    new-instance v2, La/fcq0;

    .line 191
    .line 192
    invoke-direct {v2, v6, v0}, La/fcq0;-><init>(Ljava/lang/Object;Ljava/lang/ThreadLocal;)V

    .line 193
    .line 194
    .line 195
    invoke-static {v1, v2}, Lkotlin/coroutines/e;->c(Lkotlin/coroutines/CoroutineContext$Element;Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    new-instance v1, La/jtb;

    .line 200
    .line 201
    const/16 v2, 0x11

    .line 202
    .line 203
    invoke-direct {v1, v3, v6, v13, v2}, La/jtb;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 204
    .line 205
    .line 206
    iput v12, v4, La/x1e;->r:I

    .line 207
    .line 208
    invoke-static {v0, v1, v4}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    if-ne v0, v5, :cond_a

    .line 213
    .line 214
    goto/16 :goto_c

    .line 215
    .line 216
    :cond_a
    return-object v0

    .line 217
    :cond_b
    iput v11, v4, La/x1e;->r:I

    .line 218
    .line 219
    invoke-interface {v3, v6, v4}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    if-ne v0, v5, :cond_c

    .line 224
    .line 225
    goto/16 :goto_c

    .line 226
    .line 227
    :cond_c
    return-object v0

    .line 228
    :cond_d
    if-eqz v2, :cond_e

    .line 229
    .line 230
    iget-object v0, v1, La/a2e;->a:La/hva0;

    .line 231
    .line 232
    :goto_4
    move-object v6, v0

    .line 233
    goto :goto_5

    .line 234
    :cond_e
    iget-object v0, v1, La/a2e;->b:La/hva0;

    .line 235
    .line 236
    goto :goto_4

    .line 237
    :goto_5
    new-instance v11, La/mie0;

    .line 238
    .line 239
    invoke-direct {v11}, Ljava/lang/Object;-><init>()V

    .line 240
    .line 241
    .line 242
    :try_start_2
    invoke-interface {v4}, La/yje;->getContext()Lkotlin/coroutines/CoroutineContext;

    .line 243
    .line 244
    .line 245
    move-result-object v14

    .line 246
    new-instance v15, La/mie0;

    .line 247
    .line 248
    invoke-direct {v15}, Ljava/lang/Object;-><init>()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_5

    .line 249
    .line 250
    .line 251
    :try_start_3
    iget-wide v8, v1, La/a2e;->e:J

    .line 252
    .line 253
    new-instance v0, La/cxd;

    .line 254
    .line 255
    const/16 v12, 0xa

    .line 256
    .line 257
    invoke-direct {v0, v15, v6, v13, v12}, La/cxd;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 258
    .line 259
    .line 260
    iput-object v1, v4, La/x1e;->i:Ljava/lang/Object;

    .line 261
    .line 262
    move-object v12, v3

    .line 263
    check-cast v12, Ljava/io/Serializable;

    .line 264
    .line 265
    iput-object v12, v4, La/x1e;->j:Ljava/io/Serializable;

    .line 266
    .line 267
    iput-object v6, v4, La/x1e;->k:La/hva0;

    .line 268
    .line 269
    iput-object v11, v4, La/x1e;->l:La/mie0;

    .line 270
    .line 271
    iput-object v14, v4, La/x1e;->m:Lkotlin/coroutines/CoroutineContext;

    .line 272
    .line 273
    iput-object v15, v4, La/x1e;->n:La/mie0;

    .line 274
    .line 275
    iput-boolean v2, v4, La/x1e;->o:Z

    .line 276
    .line 277
    iput v10, v4, La/x1e;->r:I

    .line 278
    .line 279
    invoke-static {v8, v9}, La/qcc;->g0(J)J

    .line 280
    .line 281
    .line 282
    move-result-wide v8

    .line 283
    invoke-static {v8, v9, v0, v4}, La/msm0;->t(JLkotlin/jvm/functions/Function2;La/zje;)Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 287
    if-ne v0, v5, :cond_f

    .line 288
    .line 289
    goto/16 :goto_c

    .line 290
    .line 291
    :cond_f
    move-object v10, v6

    .line 292
    move-object v6, v11

    .line 293
    move-object v0, v14

    .line 294
    move-object v14, v1

    .line 295
    move v1, v2

    .line 296
    move-object v2, v15

    .line 297
    :goto_6
    move-object v15, v2

    .line 298
    move v2, v1

    .line 299
    move-object v1, v6

    .line 300
    move-object v6, v14

    .line 301
    move-object v14, v0

    .line 302
    move-object v0, v13

    .line 303
    goto :goto_9

    .line 304
    :goto_7
    move-object v10, v6

    .line 305
    move-object v6, v11

    .line 306
    goto :goto_8

    .line 307
    :catchall_2
    move-exception v0

    .line 308
    goto :goto_7

    .line 309
    :goto_8
    move-object/from16 v16, v6

    .line 310
    .line 311
    move-object v6, v1

    .line 312
    move-object/from16 v1, v16

    .line 313
    .line 314
    :goto_9
    :try_start_4
    iget-object v8, v15, La/mie0;->a:Ljava/lang/Object;

    .line 315
    .line 316
    check-cast v8, La/e2e;

    .line 317
    .line 318
    if-eqz v8, :cond_11

    .line 319
    .line 320
    new-instance v9, La/yva0;

    .line 321
    .line 322
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 323
    .line 324
    .line 325
    iput-object v14, v8, La/e2e;->c:Lkotlin/coroutines/CoroutineContext;

    .line 326
    .line 327
    new-instance v11, Ljava/lang/Throwable;

    .line 328
    .line 329
    invoke-direct {v11}, Ljava/lang/Throwable;-><init>()V

    .line 330
    .line 331
    .line 332
    iput-object v11, v8, La/e2e;->d:Ljava/lang/Throwable;

    .line 333
    .line 334
    iget-object v11, v6, La/a2e;->a:La/hva0;

    .line 335
    .line 336
    iget-object v12, v6, La/a2e;->b:La/hva0;

    .line 337
    .line 338
    if-eq v11, v12, :cond_10

    .line 339
    .line 340
    if-eqz v2, :cond_10

    .line 341
    .line 342
    const/4 v11, 0x1

    .line 343
    goto :goto_a

    .line 344
    :cond_10
    const/4 v11, 0x0

    .line 345
    :goto_a
    invoke-direct {v9, v8, v11}, La/yva0;-><init>(La/e2e;Z)V

    .line 346
    .line 347
    .line 348
    goto :goto_b

    .line 349
    :catchall_3
    move-exception v0

    .line 350
    move-object v11, v1

    .line 351
    move-object v2, v10

    .line 352
    goto/16 :goto_1

    .line 353
    .line 354
    :cond_11
    move-object v9, v13

    .line 355
    :goto_b
    iput-object v9, v1, La/mie0;->a:Ljava/lang/Object;

    .line 356
    .line 357
    instance-of v8, v0, La/gmq0;

    .line 358
    .line 359
    if-nez v8, :cond_17

    .line 360
    .line 361
    if-nez v0, :cond_16

    .line 362
    .line 363
    if-eqz v9, :cond_15

    .line 364
    .line 365
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 366
    .line 367
    .line 368
    new-instance v0, La/l1e;

    .line 369
    .line 370
    invoke-direct {v0, v9}, La/l1e;-><init>(La/yva0;)V

    .line 371
    .line 372
    .line 373
    iget-object v2, v6, La/a2e;->c:Ljava/lang/ThreadLocal;

    .line 374
    .line 375
    new-instance v6, La/fcq0;

    .line 376
    .line 377
    invoke-direct {v6, v9, v2}, La/fcq0;-><init>(Ljava/lang/Object;Ljava/lang/ThreadLocal;)V

    .line 378
    .line 379
    .line 380
    invoke-static {v0, v6}, Lkotlin/coroutines/e;->c(Lkotlin/coroutines/CoroutineContext$Element;Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    .line 381
    .line 382
    .line 383
    move-result-object v0

    .line 384
    new-instance v2, La/y1e;

    .line 385
    .line 386
    const/4 v6, 0x1

    .line 387
    invoke-direct {v2, v3, v1, v13, v6}, La/y1e;-><init>(Lkotlin/jvm/functions/Function2;La/mie0;La/yje;B)V

    .line 388
    .line 389
    .line 390
    iput-object v10, v4, La/x1e;->i:Ljava/lang/Object;

    .line 391
    .line 392
    iput-object v1, v4, La/x1e;->j:Ljava/io/Serializable;

    .line 393
    .line 394
    iput-object v13, v4, La/x1e;->k:La/hva0;

    .line 395
    .line 396
    iput-object v13, v4, La/x1e;->l:La/mie0;

    .line 397
    .line 398
    iput-object v13, v4, La/x1e;->m:Lkotlin/coroutines/CoroutineContext;

    .line 399
    .line 400
    iput-object v13, v4, La/x1e;->n:La/mie0;

    .line 401
    .line 402
    const/4 v3, 0x4

    .line 403
    iput v3, v4, La/x1e;->r:I

    .line 404
    .line 405
    invoke-static {v0, v2, v4}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 406
    .line 407
    .line 408
    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 409
    if-ne v0, v5, :cond_12

    .line 410
    .line 411
    :goto_c
    return-object v5

    .line 412
    :cond_12
    move-object v2, v10

    .line 413
    :goto_d
    :try_start_5
    iget-object v1, v1, La/mie0;->a:Ljava/lang/Object;

    .line 414
    .line 415
    check-cast v1, La/yva0;

    .line 416
    .line 417
    if-eqz v1, :cond_14

    .line 418
    .line 419
    iget-object v3, v1, La/yva0;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 420
    .line 421
    const/4 v4, 0x0

    .line 422
    const/4 v6, 0x1

    .line 423
    invoke-virtual {v3, v4, v6}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 424
    .line 425
    .line 426
    move-result v3
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 427
    if-eqz v3, :cond_13

    .line 428
    .line 429
    :try_start_6
    iget-object v3, v1, La/yva0;->a:La/e2e;

    .line 430
    .line 431
    invoke-static {v3, v7}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V
    :try_end_6
    .catch Landroid/database/SQLException; {:try_start_6 .. :try_end_6} :catch_0
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 432
    .line 433
    .line 434
    :catch_0
    :cond_13
    :try_start_7
    iget-object v1, v1, La/yva0;->a:La/e2e;

    .line 435
    .line 436
    iput-object v13, v1, La/e2e;->c:Lkotlin/coroutines/CoroutineContext;

    .line 437
    .line 438
    iput-object v13, v1, La/e2e;->d:Ljava/lang/Throwable;

    .line 439
    .line 440
    invoke-virtual {v2, v1}, La/hva0;->d(La/e2e;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 441
    .line 442
    .line 443
    :catchall_4
    :cond_14
    return-object v0

    .line 444
    :cond_15
    :try_start_8
    const-string v0, "Required value was null."

    .line 445
    .line 446
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 447
    .line 448
    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 449
    .line 450
    .line 451
    throw v2

    .line 452
    :cond_16
    throw v0

    .line 453
    :cond_17
    invoke-virtual {v6, v2}, La/a2e;->a(Z)V

    .line 454
    .line 455
    .line 456
    throw v13
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 457
    :catchall_5
    move-exception v0

    .line 458
    move-object v1, v0

    .line 459
    move-object v2, v6

    .line 460
    :goto_e
    :try_start_9
    throw v1
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_6

    .line 461
    :catchall_6
    move-exception v0

    .line 462
    move-object v3, v0

    .line 463
    :try_start_a
    iget-object v0, v11, La/mie0;->a:Ljava/lang/Object;

    .line 464
    .line 465
    check-cast v0, La/yva0;

    .line 466
    .line 467
    if-eqz v0, :cond_19

    .line 468
    .line 469
    iget-object v4, v0, La/yva0;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 470
    .line 471
    const/4 v5, 0x0

    .line 472
    const/4 v6, 0x1

    .line 473
    invoke-virtual {v4, v5, v6}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 474
    .line 475
    .line 476
    move-result v4
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_7

    .line 477
    if-eqz v4, :cond_18

    .line 478
    .line 479
    :try_start_b
    iget-object v4, v0, La/yva0;->a:La/e2e;

    .line 480
    .line 481
    invoke-static {v4, v7}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V
    :try_end_b
    .catch Landroid/database/SQLException; {:try_start_b .. :try_end_b} :catch_1
    .catchall {:try_start_b .. :try_end_b} :catchall_7

    .line 482
    .line 483
    .line 484
    :catch_1
    :cond_18
    :try_start_c
    iget-object v0, v0, La/yva0;->a:La/e2e;

    .line 485
    .line 486
    iput-object v13, v0, La/e2e;->c:Lkotlin/coroutines/CoroutineContext;

    .line 487
    .line 488
    iput-object v13, v0, La/e2e;->d:Ljava/lang/Throwable;

    .line 489
    .line 490
    invoke-virtual {v2, v0}, La/hva0;->d(La/e2e;)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_7

    .line 491
    .line 492
    .line 493
    goto :goto_f

    .line 494
    :catchall_7
    move-exception v0

    .line 495
    invoke-static {v1, v0}, La/tjo;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 496
    .line 497
    .line 498
    :cond_19
    :goto_f
    throw v3

    .line 499
    :cond_1a
    const/16 v0, 0x15

    .line 500
    .line 501
    const-string v1, "Connection pool is closed"

    .line 502
    .line 503
    invoke-static {v0, v1}, La/m2x;->J(ILjava/lang/String;)V

    .line 504
    .line 505
    .line 506
    throw v13
.end method

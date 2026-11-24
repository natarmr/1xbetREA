.class public final La/lot0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public final synthetic j:La/mot0;

.field public k:Z


# direct methods
.method public constructor <init>(La/yje;La/mot0;)V
    .locals 1

    const/4 v0, 0x0

    iput-byte v0, p0, La/lot0;->i:B

    .line 13
    iput-object p2, p0, La/lot0;->j:La/mot0;

    const/4 p2, 0x2

    invoke-direct {p0, p2, p1}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method

.method public constructor <init>(La/yje;La/mot0;Z)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-byte v0, p0, La/lot0;->i:B

    .line 3
    .line 4
    iput-object p2, p0, La/lot0;->j:La/mot0;

    .line 5
    .line 6
    iput-boolean p3, p0, La/lot0;->k:Z

    .line 7
    .line 8
    const/4 p2, 0x2

    .line 9
    invoke-direct {p0, p2, p1}, La/bnn0;-><init>(ILa/yje;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/lot0;->i:B

    .line 2
    .line 3
    iget-object v0, p0, La/lot0;->j:La/mot0;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/lot0;

    .line 9
    .line 10
    iget-boolean p0, p0, La/lot0;->k:Z

    .line 11
    .line 12
    invoke-direct {p1, p2, v0, p0}, La/lot0;-><init>(La/yje;La/mot0;Z)V

    .line 13
    .line 14
    .line 15
    return-object p1

    .line 16
    :pswitch_0
    new-instance p0, La/lot0;

    .line 17
    .line 18
    invoke-direct {p0, p2, v0}, La/lot0;-><init>(La/yje;La/mot0;)V

    .line 19
    .line 20
    .line 21
    return-object p0

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/lot0;->i:B

    .line 2
    .line 3
    check-cast p1, La/vne;

    .line 4
    .line 5
    check-cast p2, La/yje;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/lot0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/lot0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/lot0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/lot0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/lot0;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/lot0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/lot0;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    sget-object v0, La/wne;->a:La/wne;

    .line 7
    .line 8
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, La/lot0;->j:La/mot0;

    .line 12
    .line 13
    iget-object p1, p1, La/mot0;->h:La/x04;

    .line 14
    .line 15
    invoke-virtual {p1}, La/x04;->b()Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    const-string p0, "CXCP"

    .line 22
    .line 23
    invoke-static {p0}, La/l8x;->f0(Ljava/lang/String;)Z

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    if-eqz p0, :cond_1

    .line 28
    .line 29
    const-string p0, "CXCP"

    .line 30
    .line 31
    const-string p1, "UseCaseCamera is closed before setActiveResumeMode, skipping setup."

    .line 32
    .line 33
    invoke-static {p0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    iget-object p1, p0, La/lot0;->j:La/mot0;

    .line 38
    .line 39
    iget-object p1, p1, La/mot0;->a:La/kpt0;

    .line 40
    .line 41
    invoke-virtual {p1}, La/kpt0;->a()La/b0a;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    iget-boolean p0, p0, La/lot0;->k:Z

    .line 46
    .line 47
    iget-object p1, p1, La/b0a;->e:La/iw9;

    .line 48
    .line 49
    iget-object v0, p1, La/iw9;->q:Ljava/lang/Object;

    .line 50
    .line 51
    monitor-enter v0

    .line 52
    :try_start_0
    iput-boolean p0, p1, La/iw9;->r:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    .line 54
    monitor-exit v0

    .line 55
    :cond_1
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 56
    .line 57
    return-object p0

    .line 58
    :catchall_0
    move-exception p0

    .line 59
    monitor-exit v0

    .line 60
    throw p0

    .line 61
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 62
    .line 63
    iget-boolean v1, p0, La/lot0;->k:Z

    .line 64
    .line 65
    const/4 v2, 0x0

    .line 66
    const/4 v3, 0x1

    .line 67
    if-eqz v1, :cond_3

    .line 68
    .line 69
    if-ne v1, v3, :cond_2

    .line 70
    .line 71
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    goto/16 :goto_5

    .line 75
    .line 76
    :cond_2
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 77
    .line 78
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    :goto_1
    move-object v0, v2

    .line 82
    goto/16 :goto_6

    .line 83
    .line 84
    :cond_3
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    const-string p1, "CXCP"

    .line 88
    .line 89
    invoke-static {p1}, La/l8x;->f0(Ljava/lang/String;)Z

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    if-eqz p1, :cond_4

    .line 94
    .line 95
    const-string p1, "CXCP"

    .line 96
    .line 97
    new-instance v1, Ljava/lang/StringBuilder;

    .line 98
    .line 99
    const-string v4, "Closing "

    .line 100
    .line 101
    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    iget-object v4, p0, La/lot0;->j:La/mot0;

    .line 105
    .line 106
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    invoke-static {p1, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 114
    .line 115
    .line 116
    :cond_4
    iget-object p1, p0, La/lot0;->j:La/mot0;

    .line 117
    .line 118
    iget-object p1, p1, La/mot0;->a:La/kpt0;

    .line 119
    .line 120
    iget-object v1, p1, La/kpt0;->e:La/n0o0;

    .line 121
    .line 122
    invoke-virtual {v1}, La/n0o0;->a()Z

    .line 123
    .line 124
    .line 125
    move-result v1

    .line 126
    if-eqz v1, :cond_a

    .line 127
    .line 128
    invoke-virtual {p1}, La/kpt0;->a()La/b0a;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    instance-of v1, p1, Ljava/lang/AutoCloseable;

    .line 133
    .line 134
    if-eqz v1, :cond_5

    .line 135
    .line 136
    invoke-virtual {p1}, La/b0a;->close()V

    .line 137
    .line 138
    .line 139
    goto :goto_3

    .line 140
    :cond_5
    instance-of v1, p1, Ljava/util/concurrent/ExecutorService;

    .line 141
    .line 142
    if-eqz v1, :cond_9

    .line 143
    .line 144
    check-cast p1, Ljava/util/concurrent/ExecutorService;

    .line 145
    .line 146
    invoke-static {}, Ljava/util/concurrent/ForkJoinPool;->commonPool()Ljava/util/concurrent/ForkJoinPool;

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    if-ne p1, v1, :cond_6

    .line 151
    .line 152
    goto :goto_3

    .line 153
    :cond_6
    invoke-interface {p1}, Ljava/util/concurrent/ExecutorService;->isTerminated()Z

    .line 154
    .line 155
    .line 156
    move-result v1

    .line 157
    if-nez v1, :cond_a

    .line 158
    .line 159
    invoke-interface {p1}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 160
    .line 161
    .line 162
    const/4 v4, 0x0

    .line 163
    :cond_7
    :goto_2
    if-nez v1, :cond_8

    .line 164
    .line 165
    :try_start_1
    sget-object v5, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    .line 166
    .line 167
    const-wide/16 v6, 0x1

    .line 168
    .line 169
    invoke-interface {p1, v6, v7, v5}, Ljava/util/concurrent/ExecutorService;->awaitTermination(JLjava/util/concurrent/TimeUnit;)Z

    .line 170
    .line 171
    .line 172
    move-result v1
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0

    .line 173
    goto :goto_2

    .line 174
    :catch_0
    if-nez v4, :cond_7

    .line 175
    .line 176
    invoke-interface {p1}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    .line 177
    .line 178
    .line 179
    move v4, v3

    .line 180
    goto :goto_2

    .line 181
    :cond_8
    if-eqz v4, :cond_a

    .line 182
    .line 183
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 184
    .line 185
    .line 186
    move-result-object p1

    .line 187
    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V

    .line 188
    .line 189
    .line 190
    goto :goto_3

    .line 191
    :cond_9
    invoke-static {}, La/e9d0;->o()V

    .line 192
    .line 193
    .line 194
    goto :goto_1

    .line 195
    :cond_a
    :goto_3
    iget-object p1, p0, La/lot0;->j:La/mot0;

    .line 196
    .line 197
    iget-object p1, p1, La/mot0;->i:La/n0o0;

    .line 198
    .line 199
    invoke-virtual {p1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object p1

    .line 203
    check-cast p1, La/spt0;

    .line 204
    .line 205
    iget-object v1, p1, La/spt0;->e:Ljava/lang/Object;

    .line 206
    .line 207
    monitor-enter v1

    .line 208
    :try_start_2
    iget-object v4, p1, La/spt0;->i:La/odd;

    .line 209
    .line 210
    if-eqz v4, :cond_b

    .line 211
    .line 212
    invoke-static {}, La/l8x;->j0()Z

    .line 213
    .line 214
    .line 215
    move-result p1

    .line 216
    if-eqz p1, :cond_d

    .line 217
    .line 218
    const-string p1, "CXCP"

    .line 219
    .line 220
    const-string v2, "UseCaseSurfaceManager is already stopping!"

    .line 221
    .line 222
    invoke-static {p1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 223
    .line 224
    .line 225
    goto :goto_4

    .line 226
    :catchall_1
    move-exception p0

    .line 227
    goto :goto_7

    .line 228
    :cond_b
    iget-object v4, p1, La/spt0;->f:La/kzj;

    .line 229
    .line 230
    if-eqz v4, :cond_c

    .line 231
    .line 232
    invoke-virtual {v4, v2}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 233
    .line 234
    .line 235
    :cond_c
    iget-object v4, p1, La/spt0;->c:La/r4x;

    .line 236
    .line 237
    invoke-interface {v4}, La/r4x;->h()V

    .line 238
    .line 239
    .line 240
    iput-object v2, p1, La/spt0;->h:Ljava/util/LinkedHashMap;

    .line 241
    .line 242
    new-instance v4, La/odd;

    .line 243
    .line 244
    invoke-direct {v4}, La/odd;-><init>()V

    .line 245
    .line 246
    .line 247
    iput-object v4, p1, La/spt0;->i:La/odd;

    .line 248
    .line 249
    invoke-virtual {p1}, La/spt0;->e()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 250
    .line 251
    .line 252
    :cond_d
    :goto_4
    monitor-exit v1

    .line 253
    iput-boolean v3, p0, La/lot0;->k:Z

    .line 254
    .line 255
    invoke-virtual {v4, p0}, La/pby;->q(La/yje;)Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object p0

    .line 259
    sget-object p1, La/wne;->a:La/wne;

    .line 260
    .line 261
    if-ne p0, v0, :cond_e

    .line 262
    .line 263
    goto :goto_6

    .line 264
    :cond_e
    :goto_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 265
    .line 266
    :goto_6
    return-object v0

    .line 267
    :goto_7
    monitor-exit v1

    .line 268
    throw p0

    .line 269
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

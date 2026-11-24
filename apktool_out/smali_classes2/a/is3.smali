.class public final La/is3;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public final synthetic j:Lorg/platform/app/ApplicationLoader;


# direct methods
.method public synthetic constructor <init>(Lorg/platform/app/ApplicationLoader;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/is3;->i:B

    iput-object p1, p0, La/is3;->j:Lorg/platform/app/ApplicationLoader;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/is3;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/is3;->j:Lorg/platform/app/ApplicationLoader;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/is3;

    .line 9
    .line 10
    const/4 v0, 0x3

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/is3;-><init>(Lorg/platform/app/ApplicationLoader;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/is3;

    .line 16
    .line 17
    const/4 v0, 0x2

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/is3;-><init>(Lorg/platform/app/ApplicationLoader;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    :pswitch_1
    new-instance p1, La/is3;

    .line 23
    .line 24
    const/4 v0, 0x1

    .line 25
    invoke-direct {p1, p0, p2, v0}, La/is3;-><init>(Lorg/platform/app/ApplicationLoader;La/yje;B)V

    .line 26
    .line 27
    .line 28
    return-object p1

    .line 29
    :pswitch_2
    new-instance p1, La/is3;

    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    invoke-direct {p1, p0, p2, v0}, La/is3;-><init>(Lorg/platform/app/ApplicationLoader;La/yje;B)V

    .line 33
    .line 34
    .line 35
    return-object p1

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/is3;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/vne;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/is3;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/is3;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/is3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, Ljava/lang/Boolean;

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 26
    .line 27
    .line 28
    check-cast p2, La/yje;

    .line 29
    .line 30
    invoke-virtual {p0, p1, p2}, La/is3;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, La/is3;

    .line 35
    .line 36
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    invoke-virtual {p0, p1}, La/is3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0

    .line 43
    :pswitch_1
    check-cast p1, La/vne;

    .line 44
    .line 45
    check-cast p2, La/yje;

    .line 46
    .line 47
    invoke-virtual {p0, p1, p2}, La/is3;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    check-cast p0, La/is3;

    .line 52
    .line 53
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    invoke-virtual {p0, p1}, La/is3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0

    .line 60
    :pswitch_2
    check-cast p1, La/vne;

    .line 61
    .line 62
    check-cast p2, La/yje;

    .line 63
    .line 64
    invoke-virtual {p0, p1, p2}, La/is3;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    check-cast p0, La/is3;

    .line 69
    .line 70
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 71
    .line 72
    invoke-virtual {p0, p1}, La/is3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    return-object p0

    .line 77
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/is3;->i:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    packed-switch v0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    sget-object v0, La/wne;->a:La/wne;

    .line 8
    .line 9
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iget-object p0, p0, La/is3;->j:Lorg/platform/app/ApplicationLoader;

    .line 13
    .line 14
    iget-object p0, p0, Lorg/platform/app/ApplicationLoader;->a:La/z7z;

    .line 15
    .line 16
    if-eqz p0, :cond_0

    .line 17
    .line 18
    invoke-interface {p0}, La/z7z;->get()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    check-cast p0, La/vwb0;

    .line 23
    .line 24
    invoke-virtual {p0}, La/vwb0;->b()Landroid/content/SharedPreferences;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    const-string p1, "preload_probe"

    .line 29
    .line 30
    const/4 v0, 0x0

    .line 31
    invoke-interface {p0, p1, v0}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 32
    .line 33
    .line 34
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 35
    .line 36
    return-object p0

    .line 37
    :cond_0
    const-string p0, "privatePreferencesWrapper"

    .line 38
    .line 39
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    throw v1

    .line 43
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 44
    .line 45
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    iget-object p0, p0, La/is3;->j:Lorg/platform/app/ApplicationLoader;

    .line 49
    .line 50
    invoke-virtual {p0}, Lorg/platform/app/ApplicationLoader;->c()La/g8i;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    iget-object p0, p0, La/g8i;->K1:La/n5d0;

    .line 55
    .line 56
    invoke-interface {p0}, La/o5d0;->get()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    check-cast p0, La/euc;

    .line 61
    .line 62
    monitor-enter p0

    .line 63
    :try_start_0
    iget-object p1, p0, La/euc;->g:La/duc;

    .line 64
    .line 65
    iget-object v0, p0, La/euc;->i:La/duc;

    .line 66
    .line 67
    iget-object v2, p0, La/euc;->j:La/duc;

    .line 68
    .line 69
    iget-object v3, p0, La/euc;->k:La/duc;

    .line 70
    .line 71
    filled-new-array {p1, v0, v2, v3}, [La/duc;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    invoke-static {p1}, La/tx3;->z([Ljava/lang/Object;)Ljava/util/List;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    iget-object v0, p0, La/euc;->h:Ljava/util/ArrayList;

    .line 80
    .line 81
    new-instance v2, Ljava/util/ArrayList;

    .line 82
    .line 83
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 91
    .line 92
    .line 93
    move-result v3

    .line 94
    if-nez v3, :cond_6

    .line 95
    .line 96
    invoke-static {p1, v2}, Lkotlin/collections/CollectionsKt;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 97
    .line 98
    .line 99
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 100
    monitor-exit p0

    .line 101
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 106
    .line 107
    .line 108
    move-result p1

    .line 109
    if-eqz p1, :cond_5

    .line 110
    .line 111
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    check-cast p1, La/duc;

    .line 116
    .line 117
    iget-object p1, p1, La/duc;->a:Lokhttp3/OkHttpClient;

    .line 118
    .line 119
    iget-object p1, p1, Lokhttp3/OkHttpClient;->E:Lokhttp3/ConnectionPool;

    .line 120
    .line 121
    iget-object p1, p1, Lokhttp3/ConnectionPool;->a:Lokhttp3/internal/connection/RealConnectionPool;

    .line 122
    .line 123
    iget-object v0, p1, Lokhttp3/internal/connection/RealConnectionPool;->d:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 124
    .line 125
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->iterator()Ljava/util/Iterator;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 133
    .line 134
    .line 135
    move-result v2

    .line 136
    if-eqz v2, :cond_4

    .line 137
    .line 138
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v2

    .line 142
    check-cast v2, Lokhttp3/internal/connection/RealConnection;

    .line 143
    .line 144
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 145
    .line 146
    .line 147
    monitor-enter v2

    .line 148
    :try_start_1
    iget-object v3, v2, Lokhttp3/internal/connection/RealConnection;->q:Ljava/util/ArrayList;

    .line 149
    .line 150
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 151
    .line 152
    .line 153
    move-result v3

    .line 154
    if-eqz v3, :cond_3

    .line 155
    .line 156
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 157
    .line 158
    .line 159
    const/4 v3, 0x1

    .line 160
    iput-boolean v3, v2, Lokhttp3/internal/connection/RealConnection;->k:Z

    .line 161
    .line 162
    iget-object v3, v2, Lokhttp3/internal/connection/RealConnection;->e:Ljava/net/Socket;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 163
    .line 164
    goto :goto_2

    .line 165
    :catchall_0
    move-exception p0

    .line 166
    goto :goto_3

    .line 167
    :cond_3
    move-object v3, v1

    .line 168
    :goto_2
    monitor-exit v2

    .line 169
    if-eqz v3, :cond_2

    .line 170
    .line 171
    invoke-static {v3}, Lokhttp3/internal/_UtilJvmKt;->c(Ljava/net/Socket;)V

    .line 172
    .line 173
    .line 174
    goto :goto_1

    .line 175
    :goto_3
    monitor-exit v2

    .line 176
    throw p0

    .line 177
    :cond_4
    iget-object v0, p1, Lokhttp3/internal/connection/RealConnectionPool;->d:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 178
    .line 179
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->isEmpty()Z

    .line 180
    .line 181
    .line 182
    move-result v0

    .line 183
    if-eqz v0, :cond_1

    .line 184
    .line 185
    iget-object p1, p1, Lokhttp3/internal/connection/RealConnectionPool;->b:Lokhttp3/internal/concurrent/TaskQueue;

    .line 186
    .line 187
    invoke-virtual {p1}, Lokhttp3/internal/concurrent/TaskQueue;->a()V

    .line 188
    .line 189
    .line 190
    goto :goto_0

    .line 191
    :cond_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 192
    .line 193
    return-object p0

    .line 194
    :catchall_1
    move-exception p1

    .line 195
    goto :goto_4

    .line 196
    :cond_6
    :try_start_2
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object p1

    .line 200
    if-nez p1, :cond_7

    .line 201
    .line 202
    throw v1

    .line 203
    :cond_7
    new-instance p1, Ljava/lang/ClassCastException;

    .line 204
    .line 205
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 206
    .line 207
    .line 208
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 209
    :goto_4
    monitor-exit p0

    .line 210
    throw p1

    .line 211
    :pswitch_1
    sget-object v0, La/wne;->a:La/wne;

    .line 212
    .line 213
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 214
    .line 215
    .line 216
    iget-object p0, p0, La/is3;->j:Lorg/platform/app/ApplicationLoader;

    .line 217
    .line 218
    sget-object p1, Lorg/platform/app/ApplicationLoader;->v1:Lorg/platform/app/ApplicationLoader;

    .line 219
    .line 220
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 221
    .line 222
    .line 223
    move-result-object p0

    .line 224
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 225
    .line 226
    .line 227
    invoke-static {p0}, La/cpv0;->d(Landroid/content/Context;)La/cpv0;

    .line 228
    .line 229
    .line 230
    move-result-object p0

    .line 231
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 232
    .line 233
    .line 234
    const-string p1, "CouponNotificationWorker"

    .line 235
    .line 236
    iget-object v0, p0, La/cpv0;->b:La/wsd;

    .line 237
    .line 238
    iget-object v0, v0, La/wsd;->f:La/std;

    .line 239
    .line 240
    const-string v1, "CancelWorkByTag_CouponNotificationWorker"

    .line 241
    .line 242
    iget-object v2, p0, La/cpv0;->d:La/fpv0;

    .line 243
    .line 244
    iget-object v2, v2, La/fpv0;->a:La/xgi0;

    .line 245
    .line 246
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 247
    .line 248
    .line 249
    new-instance v3, La/h5a;

    .line 250
    .line 251
    invoke-direct {v3, p0, p1}, La/h5a;-><init>(La/cpv0;Ljava/lang/String;)V

    .line 252
    .line 253
    .line 254
    invoke-static {v0, v1, v2, v3}, La/r8x;->T(La/std;Ljava/lang/String;Ljava/util/concurrent/Executor;Lkotlin/jvm/functions/Function0;)La/gqw0;

    .line 255
    .line 256
    .line 257
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 258
    .line 259
    return-object p0

    .line 260
    :pswitch_2
    sget-object v0, La/wne;->a:La/wne;

    .line 261
    .line 262
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 263
    .line 264
    .line 265
    iget-object p0, p0, La/is3;->j:Lorg/platform/app/ApplicationLoader;

    .line 266
    .line 267
    sget-object p1, Lorg/platform/app/ApplicationLoader;->v1:Lorg/platform/app/ApplicationLoader;

    .line 268
    .line 269
    invoke-virtual {p0}, Lorg/platform/app/ApplicationLoader;->h()V

    .line 270
    .line 271
    .line 272
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 273
    .line 274
    return-object p0

    .line 275
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.class public final synthetic La/b1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/j8f;Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    const/16 v0, 0x9

    iput-byte v0, p0, La/b1;->a:B

    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/b1;->c:Ljava/lang/Object;

    iput-object p2, p0, La/b1;->b:Ljava/lang/Object;

    iput-object v0, p0, La/b1;->d:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(La/vx9;La/ux9;La/gnf0;Ljava/lang/Object;B)V
    .locals 0

    .line 2
    iput-byte p5, p0, La/b1;->a:B

    iput-object p1, p0, La/b1;->b:Ljava/lang/Object;

    iput-object p3, p0, La/b1;->c:Ljava/lang/Object;

    iput-object p4, p0, La/b1;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/zri;La/pp9;Ljava/lang/Throwable;)V
    .locals 1

    .line 3
    const/16 v0, 0xb

    iput-byte v0, p0, La/b1;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/b1;->c:Ljava/lang/Object;

    iput-object p2, p0, La/b1;->d:Ljava/lang/Object;

    iput-object p3, p0, La/b1;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 4
    iput-byte p4, p0, La/b1;->a:B

    iput-object p1, p0, La/b1;->b:Ljava/lang/Object;

    iput-object p2, p0, La/b1;->c:Ljava/lang/Object;

    iput-object p3, p0, La/b1;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Ljava/lang/Throwable;Lorg/xplatform/uikit/components/views/LoadableImageView;)V
    .locals 1

    .line 5
    const/16 v0, 0x14

    iput-byte v0, p0, La/b1;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/b1;->c:Ljava/lang/Object;

    iput-object p2, p0, La/b1;->b:Ljava/lang/Object;

    iput-object p3, p0, La/b1;->d:Ljava/lang/Object;

    return-void
.end method

.method private final a()V
    .locals 8

    .line 1
    iget-object v0, p0, La/b1;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/ezb0;

    .line 4
    .line 5
    iget-object v1, p0, La/b1;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, La/wu9;

    .line 8
    .line 9
    iget-object p0, p0, La/b1;->d:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, La/nqv0;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    :try_start_0
    iget-object v1, v1, La/wu9;->b:La/vu9;

    .line 17
    .line 18
    invoke-virtual {v1}, La/y4;->get()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, Ljava/lang/Boolean;

    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 25
    .line 26
    .line 27
    move-result v1
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 28
    goto :goto_0

    .line 29
    :catch_0
    const/4 v1, 0x1

    .line 30
    :goto_0
    iget-object v2, v0, La/ezb0;->k:Ljava/lang/Object;

    .line 31
    .line 32
    monitor-enter v2

    .line 33
    :try_start_1
    iget-object v3, p0, La/nqv0;->a:La/ppv0;

    .line 34
    .line 35
    invoke-static {v3}, La/jpm0;->k(La/ppv0;)La/xov0;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    iget-object v4, v3, La/xov0;->a:Ljava/lang/String;

    .line 40
    .line 41
    invoke-virtual {v0, v4}, La/ezb0;->c(Ljava/lang/String;)La/nqv0;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    if-ne v5, p0, :cond_0

    .line 46
    .line 47
    invoke-virtual {v0, v4}, La/ezb0;->b(Ljava/lang/String;)La/nqv0;

    .line 48
    .line 49
    .line 50
    goto :goto_1

    .line 51
    :catchall_0
    move-exception p0

    .line 52
    goto :goto_3

    .line 53
    :cond_0
    :goto_1
    invoke-static {}, La/wv00;->f()La/wv00;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    sget-object v5, La/ezb0;->l:Ljava/lang/String;

    .line 58
    .line 59
    new-instance v6, Ljava/lang/StringBuilder;

    .line 60
    .line 61
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 62
    .line 63
    .line 64
    const-class v7, La/ezb0;

    .line 65
    .line 66
    invoke-virtual {v7}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v7

    .line 70
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const-string v7, " "

    .line 74
    .line 75
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    const-string v4, " executed; reschedule = "

    .line 82
    .line 83
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v4

    .line 93
    invoke-virtual {p0, v5, v4}, La/wv00;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    new-instance p0, Ljava/util/ArrayList;

    .line 97
    .line 98
    iget-object v0, v0, La/ezb0;->j:Ljava/util/ArrayList;

    .line 99
    .line 100
    invoke-direct {p0, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 101
    .line 102
    .line 103
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 104
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    if-eqz v0, :cond_1

    .line 113
    .line 114
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    check-cast v0, La/zjo;

    .line 119
    .line 120
    invoke-interface {v0, v3, v1}, La/zjo;->c(La/xov0;Z)V

    .line 121
    .line 122
    .line 123
    goto :goto_2

    .line 124
    :cond_1
    return-void

    .line 125
    :goto_3
    :try_start_2
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 126
    throw p0
.end method


# virtual methods
.method public final run()V
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/b1;->a:B

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v3, 0x1

    .line 7
    const/4 v4, 0x0

    .line 8
    const/4 v5, 0x0

    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-object v1, v0, La/b1;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, La/dps0;

    .line 15
    .line 16
    iget-object v2, v0, La/b1;->c:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v2, La/ibs0;

    .line 19
    .line 20
    iget-object v0, v0, La/b1;->d:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, La/ts3;

    .line 23
    .line 24
    invoke-static {}, La/nd90;->t()La/md90;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    invoke-virtual {v3}, La/zit;->i()V

    .line 29
    .line 30
    .line 31
    iget-object v4, v3, La/zit;->b:La/kjt;

    .line 32
    .line 33
    check-cast v4, La/nd90;

    .line 34
    .line 35
    invoke-virtual {v4, v2}, La/nd90;->x(La/ibs0;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1, v3, v0}, La/dps0;->d(La/md90;La/ts3;)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :pswitch_0
    iget-object v1, v0, La/b1;->b:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v1, La/dps0;

    .line 45
    .line 46
    iget-object v2, v0, La/b1;->c:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v2, La/set;

    .line 49
    .line 50
    iget-object v0, v0, La/b1;->d:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v0, La/ts3;

    .line 53
    .line 54
    invoke-static {}, La/nd90;->t()La/md90;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    invoke-virtual {v3}, La/zit;->i()V

    .line 59
    .line 60
    .line 61
    iget-object v4, v3, La/zit;->b:La/kjt;

    .line 62
    .line 63
    check-cast v4, La/nd90;

    .line 64
    .line 65
    invoke-virtual {v4, v2}, La/nd90;->v(La/set;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v1, v3, v0}, La/dps0;->d(La/md90;La/ts3;)V

    .line 69
    .line 70
    .line 71
    return-void

    .line 72
    :pswitch_1
    iget-object v1, v0, La/b1;->b:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v1, La/wmn0;

    .line 75
    .line 76
    iget-object v2, v0, La/b1;->c:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v2, La/pmn0;

    .line 79
    .line 80
    iget-object v0, v0, La/b1;->d:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v0, La/hi;

    .line 83
    .line 84
    iget-object v1, v1, La/wmn0;->f:La/vmn0;

    .line 85
    .line 86
    invoke-virtual {v1}, La/vmn0;->a()V

    .line 87
    .line 88
    .line 89
    iget-boolean v3, v1, La/vmn0;->g:Z

    .line 90
    .line 91
    if-eqz v3, :cond_0

    .line 92
    .line 93
    iput-boolean v4, v1, La/vmn0;->g:Z

    .line 94
    .line 95
    invoke-virtual {v2}, La/pmn0;->c()Z

    .line 96
    .line 97
    .line 98
    iget-object v0, v2, La/pmn0;->i:La/tu9;

    .line 99
    .line 100
    invoke-virtual {v0, v5}, La/tu9;->b(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_0
    iput-object v2, v1, La/vmn0;->b:La/pmn0;

    .line 105
    .line 106
    iput-object v0, v1, La/vmn0;->d:La/hi;

    .line 107
    .line 108
    iget-object v0, v2, La/pmn0;->b:Landroid/util/Size;

    .line 109
    .line 110
    iput-object v0, v1, La/vmn0;->a:Landroid/util/Size;

    .line 111
    .line 112
    iput-boolean v4, v1, La/vmn0;->f:Z

    .line 113
    .line 114
    invoke-virtual {v1}, La/vmn0;->b()Z

    .line 115
    .line 116
    .line 117
    move-result v2

    .line 118
    if-nez v2, :cond_1

    .line 119
    .line 120
    const-string v2, "SurfaceViewImpl"

    .line 121
    .line 122
    const-string v3, "Wait for new Surface creation."

    .line 123
    .line 124
    invoke-static {v2, v3}, La/l8x;->U(Ljava/lang/String;Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    iget-object v1, v1, La/vmn0;->h:La/wmn0;

    .line 128
    .line 129
    iget-object v1, v1, La/wmn0;->e:Landroid/view/SurfaceView;

    .line 130
    .line 131
    invoke-virtual {v1}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    invoke-virtual {v0}, Landroid/util/Size;->getWidth()I

    .line 136
    .line 137
    .line 138
    move-result v2

    .line 139
    invoke-virtual {v0}, Landroid/util/Size;->getHeight()I

    .line 140
    .line 141
    .line 142
    move-result v0

    .line 143
    invoke-interface {v1, v2, v0}, Landroid/view/SurfaceHolder;->setFixedSize(II)V

    .line 144
    .line 145
    .line 146
    :cond_1
    :goto_0
    return-void

    .line 147
    :pswitch_2
    iget-object v1, v0, La/b1;->b:Ljava/lang/Object;

    .line 148
    .line 149
    check-cast v1, La/cyu;

    .line 150
    .line 151
    iget-object v2, v0, La/b1;->c:Ljava/lang/Object;

    .line 152
    .line 153
    check-cast v2, La/cmn0;

    .line 154
    .line 155
    iget-object v0, v0, La/b1;->d:Ljava/lang/Object;

    .line 156
    .line 157
    check-cast v0, Ljava/util/Map$Entry;

    .line 158
    .line 159
    invoke-virtual {v1, v2, v0}, La/cyu;->f(La/cmn0;Ljava/util/Map$Entry;)V

    .line 160
    .line 161
    .line 162
    return-void

    .line 163
    :pswitch_3
    iget-object v1, v0, La/b1;->b:Ljava/lang/Object;

    .line 164
    .line 165
    check-cast v1, Landroidx/recyclerview/widget/RecyclerView;

    .line 166
    .line 167
    iget-object v2, v0, La/b1;->c:Ljava/lang/Object;

    .line 168
    .line 169
    check-cast v2, La/iej0;

    .line 170
    .line 171
    iget-object v0, v0, La/b1;->d:Ljava/lang/Object;

    .line 172
    .line 173
    check-cast v0, La/t1j0;

    .line 174
    .line 175
    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView;->b0()V

    .line 176
    .line 177
    .line 178
    iget-boolean v2, v2, La/iej0;->b:Z

    .line 179
    .line 180
    if-eqz v2, :cond_3

    .line 181
    .line 182
    invoke-virtual {v1, v4}, Landroidx/recyclerview/widget/RecyclerView;->y0(I)V

    .line 183
    .line 184
    .line 185
    sget-object v1, La/t1j0;->Y1:La/zie0;

    .line 186
    .line 187
    invoke-virtual {v0}, La/t1j0;->I0()Lorg/xplatform/settings/impl/presentation/a;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    iget-object v0, v0, Lorg/xplatform/settings/impl/presentation/a;->X0:La/p7m0;

    .line 192
    .line 193
    :cond_2
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v1

    .line 197
    move-object v2, v1

    .line 198
    check-cast v2, La/caj0;

    .line 199
    .line 200
    const/16 v24, 0x0

    .line 201
    .line 202
    const v25, 0x1fffffd

    .line 203
    .line 204
    .line 205
    const/4 v3, 0x0

    .line 206
    const/4 v4, 0x0

    .line 207
    const/4 v5, 0x0

    .line 208
    const/4 v6, 0x0

    .line 209
    const/4 v7, 0x0

    .line 210
    const/4 v8, 0x0

    .line 211
    const/4 v9, 0x0

    .line 212
    const/4 v10, 0x0

    .line 213
    const/4 v11, 0x0

    .line 214
    const/4 v12, 0x0

    .line 215
    const/4 v13, 0x0

    .line 216
    const/4 v14, 0x0

    .line 217
    const/4 v15, 0x0

    .line 218
    const/16 v16, 0x0

    .line 219
    .line 220
    const/16 v17, 0x0

    .line 221
    .line 222
    const/16 v18, 0x0

    .line 223
    .line 224
    const/16 v19, 0x0

    .line 225
    .line 226
    const/16 v20, 0x0

    .line 227
    .line 228
    const/16 v21, 0x0

    .line 229
    .line 230
    const/16 v22, 0x0

    .line 231
    .line 232
    const/16 v23, 0x0

    .line 233
    .line 234
    invoke-static/range {v2 .. v25}, La/caj0;->a(La/caj0;ZZZLa/j6d0;ZZLa/mrh0;La/baj0;ZZZZZZZZLjava/lang/String;ZZZZZI)La/caj0;

    .line 235
    .line 236
    .line 237
    move-result-object v2

    .line 238
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 239
    .line 240
    .line 241
    move-result v1

    .line 242
    if-eqz v1, :cond_2

    .line 243
    .line 244
    :cond_3
    return-void

    .line 245
    :pswitch_4
    iget-object v1, v0, La/b1;->b:Ljava/lang/Object;

    .line 246
    .line 247
    check-cast v1, Lcom/google/firebase/perf/session/SessionManager;

    .line 248
    .line 249
    iget-object v2, v0, La/b1;->c:Ljava/lang/Object;

    .line 250
    .line 251
    check-cast v2, Landroid/content/Context;

    .line 252
    .line 253
    iget-object v0, v0, La/b1;->d:Ljava/lang/Object;

    .line 254
    .line 255
    check-cast v0, Lcom/google/firebase/perf/session/PerfSession;

    .line 256
    .line 257
    invoke-static {v1, v2, v0}, Lcom/google/firebase/perf/session/SessionManager;->b(Lcom/google/firebase/perf/session/SessionManager;Landroid/content/Context;Lcom/google/firebase/perf/session/PerfSession;)V

    .line 258
    .line 259
    .line 260
    return-void

    .line 261
    :pswitch_5
    invoke-direct {v0}, La/b1;->a()V

    .line 262
    .line 263
    .line 264
    return-void

    .line 265
    :pswitch_6
    iget-object v1, v0, La/b1;->b:Ljava/lang/Object;

    .line 266
    .line 267
    check-cast v1, La/tea0;

    .line 268
    .line 269
    iget-object v2, v0, La/b1;->c:Ljava/lang/Object;

    .line 270
    .line 271
    check-cast v2, Landroid/view/SurfaceView;

    .line 272
    .line 273
    iget-object v0, v0, La/b1;->d:Ljava/lang/Object;

    .line 274
    .line 275
    check-cast v0, La/wss;

    .line 276
    .line 277
    invoke-virtual {v1, v2, v0}, La/tea0;->a(Landroid/view/SurfaceView;La/wss;)V

    .line 278
    .line 279
    .line 280
    return-void

    .line 281
    :pswitch_7
    iget-object v1, v0, La/b1;->b:Ljava/lang/Object;

    .line 282
    .line 283
    check-cast v1, La/pn30;

    .line 284
    .line 285
    iget-object v2, v0, La/b1;->c:Ljava/lang/Object;

    .line 286
    .line 287
    check-cast v2, La/u3x;

    .line 288
    .line 289
    iget-object v0, v0, La/b1;->d:Ljava/lang/Object;

    .line 290
    .line 291
    check-cast v0, La/vn30;

    .line 292
    .line 293
    iget-object v1, v1, La/pn30;->c:La/fsj;

    .line 294
    .line 295
    invoke-virtual {v2}, La/u3x;->g()La/rcf0;

    .line 296
    .line 297
    .line 298
    move-result-object v2

    .line 299
    iget-object v3, v1, La/fsj;->d:La/uii;

    .line 300
    .line 301
    iget-object v1, v1, La/fsj;->g:La/my90;

    .line 302
    .line 303
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 304
    .line 305
    .line 306
    invoke-static {v2}, La/b4x;->o(Ljava/util/Collection;)La/b4x;

    .line 307
    .line 308
    .line 309
    move-result-object v5

    .line 310
    iput-object v5, v3, La/uii;->b:Ljava/lang/Object;

    .line 311
    .line 312
    invoke-virtual {v2}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 313
    .line 314
    .line 315
    move-result v5

    .line 316
    if-nez v5, :cond_4

    .line 317
    .line 318
    invoke-virtual {v2, v4}, La/rcf0;->get(I)Ljava/lang/Object;

    .line 319
    .line 320
    .line 321
    move-result-object v2

    .line 322
    check-cast v2, La/vn30;

    .line 323
    .line 324
    iput-object v2, v3, La/uii;->e:Ljava/lang/Object;

    .line 325
    .line 326
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 327
    .line 328
    .line 329
    iput-object v0, v3, La/uii;->f:Ljava/lang/Object;

    .line 330
    .line 331
    :cond_4
    iget-object v0, v3, La/uii;->d:Ljava/lang/Object;

    .line 332
    .line 333
    check-cast v0, La/vn30;

    .line 334
    .line 335
    if-nez v0, :cond_5

    .line 336
    .line 337
    iget-object v0, v3, La/uii;->b:Ljava/lang/Object;

    .line 338
    .line 339
    check-cast v0, La/b4x;

    .line 340
    .line 341
    iget-object v2, v3, La/uii;->e:Ljava/lang/Object;

    .line 342
    .line 343
    check-cast v2, La/vn30;

    .line 344
    .line 345
    iget-object v4, v3, La/uii;->a:Ljava/lang/Object;

    .line 346
    .line 347
    check-cast v4, La/amq0;

    .line 348
    .line 349
    invoke-static {v1, v0, v2, v4}, La/uii;->g(La/my90;La/b4x;La/vn30;La/amq0;)La/vn30;

    .line 350
    .line 351
    .line 352
    move-result-object v0

    .line 353
    iput-object v0, v3, La/uii;->d:Ljava/lang/Object;

    .line 354
    .line 355
    :cond_5
    check-cast v1, La/ulo;

    .line 356
    .line 357
    invoke-virtual {v1}, La/ulo;->n()La/bmq0;

    .line 358
    .line 359
    .line 360
    move-result-object v0

    .line 361
    invoke-virtual {v3, v0}, La/uii;->K(La/bmq0;)V

    .line 362
    .line 363
    .line 364
    return-void

    .line 365
    :pswitch_8
    iget-object v1, v0, La/b1;->c:Ljava/lang/Object;

    .line 366
    .line 367
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 368
    .line 369
    iget-object v2, v0, La/b1;->b:Ljava/lang/Object;

    .line 370
    .line 371
    check-cast v2, Ljava/lang/Throwable;

    .line 372
    .line 373
    iget-object v0, v0, La/b1;->d:Ljava/lang/Object;

    .line 374
    .line 375
    check-cast v0, Lorg/xplatform/uikit/components/views/LoadableImageView;

    .line 376
    .line 377
    sget v3, Lorg/xplatform/uikit/components/views/LoadableImageView;->i:I

    .line 378
    .line 379
    invoke-interface {v1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 380
    .line 381
    .line 382
    move-result-object v1

    .line 383
    check-cast v1, Ljava/lang/Boolean;

    .line 384
    .line 385
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 386
    .line 387
    .line 388
    move-result v1

    .line 389
    if-nez v1, :cond_6

    .line 390
    .line 391
    iget-object v0, v0, Lorg/xplatform/uikit/components/views/LoadableImageView;->h:Lkotlin/jvm/functions/Function1;

    .line 392
    .line 393
    invoke-interface {v0, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 394
    .line 395
    .line 396
    :cond_6
    return-void

    .line 397
    :pswitch_9
    iget-object v1, v0, La/b1;->b:Ljava/lang/Object;

    .line 398
    .line 399
    check-cast v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 400
    .line 401
    iget-object v2, v0, La/b1;->c:Ljava/lang/Object;

    .line 402
    .line 403
    check-cast v2, La/tu9;

    .line 404
    .line 405
    iget-object v0, v0, La/b1;->d:Ljava/lang/Object;

    .line 406
    .line 407
    check-cast v0, La/zbg0;

    .line 408
    .line 409
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 410
    .line 411
    .line 412
    move-result v1

    .line 413
    if-eqz v1, :cond_7

    .line 414
    .line 415
    goto :goto_1

    .line 416
    :cond_7
    :try_start_0
    invoke-virtual {v0}, La/zbg0;->invoke()Ljava/lang/Object;

    .line 417
    .line 418
    .line 419
    invoke-virtual {v2, v5}, La/tu9;->b(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 420
    .line 421
    .line 422
    goto :goto_1

    .line 423
    :catchall_0
    move-exception v0

    .line 424
    invoke-virtual {v2, v0}, La/tu9;->d(Ljava/lang/Throwable;)Z

    .line 425
    .line 426
    .line 427
    :goto_1
    return-void

    .line 428
    :pswitch_a
    iget-object v1, v0, La/b1;->b:Ljava/lang/Object;

    .line 429
    .line 430
    check-cast v1, La/mzw;

    .line 431
    .line 432
    iget-object v2, v0, La/b1;->c:Ljava/lang/Object;

    .line 433
    .line 434
    check-cast v2, Ljava/util/concurrent/Executor;

    .line 435
    .line 436
    iget-object v0, v0, La/b1;->d:Ljava/lang/Object;

    .line 437
    .line 438
    check-cast v0, La/mz9;

    .line 439
    .line 440
    invoke-virtual {v1, v2, v0}, La/mzw;->K(Ljava/util/concurrent/Executor;La/mz9;)V

    .line 441
    .line 442
    .line 443
    return-void

    .line 444
    :pswitch_b
    iget-object v1, v0, La/b1;->b:Ljava/lang/Object;

    .line 445
    .line 446
    check-cast v1, La/vyn;

    .line 447
    .line 448
    iget-object v2, v0, La/b1;->c:Ljava/lang/Object;

    .line 449
    .line 450
    check-cast v2, Landroid/content/Intent;

    .line 451
    .line 452
    iget-object v0, v0, La/b1;->d:Ljava/lang/Object;

    .line 453
    .line 454
    move-object v3, v0

    .line 455
    check-cast v3, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 456
    .line 457
    :try_start_1
    invoke-virtual {v1, v2}, La/vyn;->handleIntent(Landroid/content/Intent;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 458
    .line 459
    .line 460
    invoke-virtual {v3, v5}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V

    .line 461
    .line 462
    .line 463
    return-void

    .line 464
    :catchall_1
    move-exception v0

    .line 465
    invoke-virtual {v3, v5}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V

    .line 466
    .line 467
    .line 468
    throw v0

    .line 469
    :pswitch_c
    iget-object v1, v0, La/b1;->b:Ljava/lang/Object;

    .line 470
    .line 471
    check-cast v1, La/dwj;

    .line 472
    .line 473
    iget-object v2, v0, La/b1;->c:Ljava/lang/Object;

    .line 474
    .line 475
    check-cast v2, La/rcb;

    .line 476
    .line 477
    iget-object v0, v0, La/b1;->d:Ljava/lang/Object;

    .line 478
    .line 479
    move-object v3, v0

    .line 480
    check-cast v3, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 481
    .line 482
    :try_start_2
    iget-object v0, v1, La/dwj;->a:Landroid/content/Context;

    .line 483
    .line 484
    invoke-static {v0}, La/aac;->Q(Landroid/content/Context;)La/zrq;

    .line 485
    .line 486
    .line 487
    move-result-object v0

    .line 488
    if-eqz v0, :cond_8

    .line 489
    .line 490
    iget-object v1, v0, La/zrq;->a:La/psn;

    .line 491
    .line 492
    check-cast v1, La/yrq;

    .line 493
    .line 494
    iget-object v4, v1, La/yrq;->c:Ljava/lang/Object;

    .line 495
    .line 496
    monitor-enter v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 497
    :try_start_3
    iput-object v3, v1, La/yrq;->e:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 498
    .line 499
    monitor-exit v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 500
    :try_start_4
    iget-object v0, v0, La/zrq;->a:La/psn;

    .line 501
    .line 502
    new-instance v1, La/ssn;

    .line 503
    .line 504
    invoke-direct {v1, v2, v3}, La/ssn;-><init>(La/rcb;Ljava/util/concurrent/ThreadPoolExecutor;)V

    .line 505
    .line 506
    .line 507
    invoke-interface {v0, v1}, La/psn;->a(La/rcb;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 508
    .line 509
    .line 510
    goto :goto_3

    .line 511
    :catchall_2
    move-exception v0

    .line 512
    goto :goto_2

    .line 513
    :catchall_3
    move-exception v0

    .line 514
    :try_start_5
    monitor-exit v4
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 515
    :try_start_6
    throw v0

    .line 516
    :cond_8
    new-instance v0, Ljava/lang/RuntimeException;

    .line 517
    .line 518
    const-string v1, "EmojiCompat font provider not available on this device."

    .line 519
    .line 520
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 521
    .line 522
    .line 523
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 524
    :goto_2
    invoke-virtual {v2, v0}, La/rcb;->a1(Ljava/lang/Throwable;)V

    .line 525
    .line 526
    .line 527
    invoke-virtual {v3}, Ljava/util/concurrent/ThreadPoolExecutor;->shutdown()V

    .line 528
    .line 529
    .line 530
    :goto_3
    return-void

    .line 531
    :pswitch_d
    iget-object v1, v0, La/b1;->b:Ljava/lang/Object;

    .line 532
    .line 533
    check-cast v1, La/mbn;

    .line 534
    .line 535
    iget-object v2, v0, La/b1;->c:Ljava/lang/Object;

    .line 536
    .line 537
    check-cast v2, Ljava/lang/Runnable;

    .line 538
    .line 539
    iget-object v0, v0, La/b1;->d:Ljava/lang/Object;

    .line 540
    .line 541
    check-cast v0, Ljava/lang/Runnable;

    .line 542
    .line 543
    iget-boolean v1, v1, La/mbn;->f:Z

    .line 544
    .line 545
    if-eqz v1, :cond_9

    .line 546
    .line 547
    invoke-interface {v2}, Ljava/lang/Runnable;->run()V

    .line 548
    .line 549
    .line 550
    goto :goto_4

    .line 551
    :cond_9
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 552
    .line 553
    .line 554
    :goto_4
    return-void

    .line 555
    :pswitch_e
    iget-object v1, v0, La/b1;->b:Ljava/lang/Object;

    .line 556
    .line 557
    check-cast v1, Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;

    .line 558
    .line 559
    iget-object v5, v0, La/b1;->c:Ljava/lang/Object;

    .line 560
    .line 561
    check-cast v5, Ljava/lang/CharSequence;

    .line 562
    .line 563
    iget-object v0, v0, La/b1;->d:Ljava/lang/Object;

    .line 564
    .line 565
    check-cast v0, Ljava/lang/String;

    .line 566
    .line 567
    iget-object v1, v1, Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;->q:La/jg;

    .line 568
    .line 569
    iget-object v6, v1, La/jg;->b:Landroid/widget/TextView;

    .line 570
    .line 571
    invoke-virtual {v6}, Landroid/widget/TextView;->getLayout()Landroid/text/Layout;

    .line 572
    .line 573
    .line 574
    move-result-object v6

    .line 575
    if-eqz v6, :cond_b

    .line 576
    .line 577
    invoke-virtual {v6, v4}, Landroid/text/Layout;->getEllipsisCount(I)I

    .line 578
    .line 579
    .line 580
    move-result v6

    .line 581
    if-lez v6, :cond_b

    .line 582
    .line 583
    iget-object v1, v1, La/jg;->b:Landroid/widget/TextView;

    .line 584
    .line 585
    invoke-virtual {v1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 586
    .line 587
    .line 588
    move-result-object v7

    .line 589
    invoke-interface {v7}, Ljava/lang/CharSequence;->length()I

    .line 590
    .line 591
    .line 592
    move-result v7

    .line 593
    sub-int/2addr v7, v6

    .line 594
    invoke-interface {v5}, Ljava/lang/CharSequence;->length()I

    .line 595
    .line 596
    .line 597
    move-result v6

    .line 598
    add-int/2addr v6, v3

    .line 599
    sub-int v3, v7, v6

    .line 600
    .line 601
    div-int/2addr v7, v2

    .line 602
    if-ge v3, v7, :cond_a

    .line 603
    .line 604
    goto :goto_5

    .line 605
    :cond_a
    const-string v0, "%s\u2026 %s"

    .line 606
    .line 607
    invoke-virtual {v1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 608
    .line 609
    .line 610
    move-result-object v6

    .line 611
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 612
    .line 613
    .line 614
    invoke-interface {v6, v4, v3}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 615
    .line 616
    .line 617
    move-result-object v3

    .line 618
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 619
    .line 620
    .line 621
    move-result-object v3

    .line 622
    filled-new-array {v3, v5}, [Ljava/lang/Object;

    .line 623
    .line 624
    .line 625
    move-result-object v3

    .line 626
    invoke-static {v3, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 627
    .line 628
    .line 629
    move-result-object v2

    .line 630
    invoke-static {v0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 631
    .line 632
    .line 633
    move-result-object v0

    .line 634
    :goto_5
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 635
    .line 636
    .line 637
    :cond_b
    return-void

    .line 638
    :pswitch_f
    iget-object v1, v0, La/b1;->b:Ljava/lang/Object;

    .line 639
    .line 640
    check-cast v1, La/txj;

    .line 641
    .line 642
    iget-object v2, v0, La/b1;->c:Ljava/lang/Object;

    .line 643
    .line 644
    check-cast v2, Ljava/lang/Runnable;

    .line 645
    .line 646
    iget-object v0, v0, La/b1;->d:Ljava/lang/Object;

    .line 647
    .line 648
    check-cast v0, Ljava/lang/Runnable;

    .line 649
    .line 650
    iget-boolean v1, v1, La/txj;->j:Z

    .line 651
    .line 652
    if-eqz v1, :cond_c

    .line 653
    .line 654
    invoke-interface {v2}, Ljava/lang/Runnable;->run()V

    .line 655
    .line 656
    .line 657
    goto :goto_6

    .line 658
    :cond_c
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 659
    .line 660
    .line 661
    :goto_6
    return-void

    .line 662
    :pswitch_10
    iget-object v1, v0, La/b1;->b:Ljava/lang/Object;

    .line 663
    .line 664
    check-cast v1, Landroid/view/ViewGroup;

    .line 665
    .line 666
    iget-object v2, v0, La/b1;->c:Ljava/lang/Object;

    .line 667
    .line 668
    check-cast v2, Landroid/view/View;

    .line 669
    .line 670
    iget-object v0, v0, La/b1;->d:Ljava/lang/Object;

    .line 671
    .line 672
    check-cast v0, La/ixj;

    .line 673
    .line 674
    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->endViewTransition(Landroid/view/View;)V

    .line 675
    .line 676
    .line 677
    iget-object v1, v0, La/ixj;->c:La/jxj;

    .line 678
    .line 679
    iget-object v1, v1, La/p4;->b:Ljava/lang/Object;

    .line 680
    .line 681
    check-cast v1, La/rnk0;

    .line 682
    .line 683
    invoke-virtual {v1, v0}, La/rnk0;->c(La/qnk0;)V

    .line 684
    .line 685
    .line 686
    return-void

    .line 687
    :pswitch_11
    iget-object v1, v0, La/b1;->c:Ljava/lang/Object;

    .line 688
    .line 689
    check-cast v1, La/zri;

    .line 690
    .line 691
    iget-object v2, v0, La/b1;->d:Ljava/lang/Object;

    .line 692
    .line 693
    check-cast v2, La/pp9;

    .line 694
    .line 695
    iget-object v0, v0, La/b1;->b:Ljava/lang/Object;

    .line 696
    .line 697
    check-cast v0, Ljava/lang/Throwable;

    .line 698
    .line 699
    iget-object v1, v1, La/zri;->c:Ljava/lang/Object;

    .line 700
    .line 701
    check-cast v1, La/ktj;

    .line 702
    .line 703
    invoke-interface {v2, v1, v0}, La/pp9;->m(La/to9;Ljava/lang/Throwable;)V

    .line 704
    .line 705
    .line 706
    return-void

    .line 707
    :pswitch_12
    iget-object v1, v0, La/b1;->b:Ljava/lang/Object;

    .line 708
    .line 709
    check-cast v1, La/zri;

    .line 710
    .line 711
    iget-object v2, v0, La/b1;->c:Ljava/lang/Object;

    .line 712
    .line 713
    check-cast v2, La/pp9;

    .line 714
    .line 715
    iget-object v0, v0, La/b1;->d:Ljava/lang/Object;

    .line 716
    .line 717
    check-cast v0, La/jtf0;

    .line 718
    .line 719
    iget-object v1, v1, La/zri;->c:Ljava/lang/Object;

    .line 720
    .line 721
    check-cast v1, La/ktj;

    .line 722
    .line 723
    iget-object v3, v1, La/ktj;->b:La/to9;

    .line 724
    .line 725
    invoke-interface {v3}, La/to9;->q()Z

    .line 726
    .line 727
    .line 728
    move-result v3

    .line 729
    if-eqz v3, :cond_d

    .line 730
    .line 731
    new-instance v0, Ljava/io/IOException;

    .line 732
    .line 733
    const-string v3, "Canceled"

    .line 734
    .line 735
    invoke-direct {v0, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 736
    .line 737
    .line 738
    invoke-interface {v2, v1, v0}, La/pp9;->m(La/to9;Ljava/lang/Throwable;)V

    .line 739
    .line 740
    .line 741
    goto :goto_7

    .line 742
    :cond_d
    invoke-interface {v2, v1, v0}, La/pp9;->g(La/to9;La/jtf0;)V

    .line 743
    .line 744
    .line 745
    :goto_7
    return-void

    .line 746
    :pswitch_13
    iget-object v1, v0, La/b1;->c:Ljava/lang/Object;

    .line 747
    .line 748
    check-cast v1, La/j8f;

    .line 749
    .line 750
    iget-object v0, v0, La/b1;->b:Ljava/lang/Object;

    .line 751
    .line 752
    move-object v7, v0

    .line 753
    check-cast v7, Ljava/lang/Throwable;

    .line 754
    .line 755
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 756
    .line 757
    iget-object v1, v1, La/j8f;->g:La/f8f;

    .line 758
    .line 759
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 760
    .line 761
    .line 762
    move-result-object v8

    .line 763
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 764
    .line 765
    .line 766
    const-string v3, "FirebaseCrashlytics"

    .line 767
    .line 768
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 769
    .line 770
    .line 771
    move-result-wide v9

    .line 772
    iget-object v4, v1, La/f8f;->n:La/y9f;

    .line 773
    .line 774
    if-eqz v4, :cond_e

    .line 775
    .line 776
    iget-object v4, v4, La/y9f;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 777
    .line 778
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 779
    .line 780
    .line 781
    move-result v4

    .line 782
    if-eqz v4, :cond_e

    .line 783
    .line 784
    goto :goto_8

    .line 785
    :cond_e
    const-wide/16 v11, 0x3e8

    .line 786
    .line 787
    div-long/2addr v9, v11

    .line 788
    invoke-virtual {v1}, La/f8f;->e()Ljava/lang/String;

    .line 789
    .line 790
    .line 791
    move-result-object v4

    .line 792
    if-nez v4, :cond_f

    .line 793
    .line 794
    const-string v0, "Tried to write a non-fatal exception while no session was open."

    .line 795
    .line 796
    invoke-static {v3, v0, v5}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 797
    .line 798
    .line 799
    goto :goto_8

    .line 800
    :cond_f
    new-instance v6, La/qeo;

    .line 801
    .line 802
    invoke-direct {v6, v4, v9, v10, v0}, La/qeo;-><init>(Ljava/lang/String;JLjava/util/Map;)V

    .line 803
    .line 804
    .line 805
    iget-object v0, v1, La/f8f;->m:La/ywq0;

    .line 806
    .line 807
    const-string v1, "Persisting non-fatal event for session "

    .line 808
    .line 809
    invoke-virtual {v1, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 810
    .line 811
    .line 812
    move-result-object v1

    .line 813
    invoke-static {v3, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 814
    .line 815
    .line 816
    move-result v2

    .line 817
    if-eqz v2, :cond_10

    .line 818
    .line 819
    invoke-static {v3, v1, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 820
    .line 821
    .line 822
    :cond_10
    const-string v9, "error"

    .line 823
    .line 824
    const/4 v11, 0x0

    .line 825
    move-object v10, v6

    .line 826
    move-object v6, v0

    .line 827
    invoke-virtual/range {v6 .. v11}, La/ywq0;->v(Ljava/lang/Throwable;Ljava/lang/Thread;Ljava/lang/String;La/qeo;Z)V

    .line 828
    .line 829
    .line 830
    :goto_8
    return-void

    .line 831
    :pswitch_14
    iget-object v1, v0, La/b1;->b:Ljava/lang/Object;

    .line 832
    .line 833
    check-cast v1, La/j8f;

    .line 834
    .line 835
    iget-object v3, v0, La/b1;->c:Ljava/lang/Object;

    .line 836
    .line 837
    check-cast v3, Ljava/lang/String;

    .line 838
    .line 839
    iget-object v0, v0, La/b1;->d:Ljava/lang/Object;

    .line 840
    .line 841
    check-cast v0, Ljava/lang/String;

    .line 842
    .line 843
    iget-object v1, v1, La/j8f;->g:La/f8f;

    .line 844
    .line 845
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 846
    .line 847
    .line 848
    :try_start_7
    iget-object v4, v1, La/f8f;->d:La/ywq0;

    .line 849
    .line 850
    iget-object v4, v4, La/ywq0;->d:Ljava/lang/Object;

    .line 851
    .line 852
    check-cast v4, La/o24;

    .line 853
    .line 854
    invoke-virtual {v4, v3, v0}, La/o24;->s(Ljava/lang/String;Ljava/lang/String;)Z
    :try_end_7
    .catch Ljava/lang/IllegalArgumentException; {:try_start_7 .. :try_end_7} :catch_0

    .line 855
    .line 856
    .line 857
    goto :goto_a

    .line 858
    :catch_0
    move-exception v0

    .line 859
    iget-object v1, v1, La/f8f;->a:Landroid/content/Context;

    .line 860
    .line 861
    if-eqz v1, :cond_12

    .line 862
    .line 863
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 864
    .line 865
    .line 866
    move-result-object v1

    .line 867
    iget v1, v1, Landroid/content/pm/ApplicationInfo;->flags:I

    .line 868
    .line 869
    and-int/2addr v1, v2

    .line 870
    if-nez v1, :cond_11

    .line 871
    .line 872
    goto :goto_9

    .line 873
    :cond_11
    throw v0

    .line 874
    :cond_12
    :goto_9
    const-string v0, "Attempting to set custom attribute with null key, ignoring."

    .line 875
    .line 876
    const-string v1, "FirebaseCrashlytics"

    .line 877
    .line 878
    invoke-static {v1, v0, v5}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 879
    .line 880
    .line 881
    :goto_a
    return-void

    .line 882
    :pswitch_15
    iget-object v1, v0, La/b1;->b:Ljava/lang/Object;

    .line 883
    .line 884
    check-cast v1, La/off0;

    .line 885
    .line 886
    iget-object v2, v0, La/b1;->c:Ljava/lang/Object;

    .line 887
    .line 888
    check-cast v2, Ljava/lang/String;

    .line 889
    .line 890
    iget-object v0, v0, La/b1;->d:Ljava/lang/Object;

    .line 891
    .line 892
    check-cast v0, La/mrd;

    .line 893
    .line 894
    iget-object v1, v1, La/off0;->a:La/zn00;

    .line 895
    .line 896
    iget-object v4, v1, La/zn00;->a:Ljava/lang/Object;

    .line 897
    .line 898
    check-cast v4, La/p5d0;

    .line 899
    .line 900
    invoke-interface {v4}, La/p5d0;->get()Ljava/lang/Object;

    .line 901
    .line 902
    .line 903
    move-result-object v4

    .line 904
    check-cast v4, La/vp2;

    .line 905
    .line 906
    if-nez v4, :cond_13

    .line 907
    .line 908
    goto/16 :goto_b

    .line 909
    .line 910
    :cond_13
    iget-object v5, v0, La/mrd;->e:Lorg/json/JSONObject;

    .line 911
    .line 912
    invoke-virtual {v5}, Lorg/json/JSONObject;->length()I

    .line 913
    .line 914
    .line 915
    move-result v6

    .line 916
    if-ge v6, v3, :cond_14

    .line 917
    .line 918
    goto/16 :goto_b

    .line 919
    .line 920
    :cond_14
    iget-object v0, v0, La/mrd;->b:Lorg/json/JSONObject;

    .line 921
    .line 922
    invoke-virtual {v0}, Lorg/json/JSONObject;->length()I

    .line 923
    .line 924
    .line 925
    move-result v6

    .line 926
    if-ge v6, v3, :cond_15

    .line 927
    .line 928
    goto/16 :goto_b

    .line 929
    .line 930
    :cond_15
    invoke-virtual {v5, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 931
    .line 932
    .line 933
    move-result-object v3

    .line 934
    if-nez v3, :cond_16

    .line 935
    .line 936
    goto/16 :goto_b

    .line 937
    .line 938
    :cond_16
    const-string v5, "choiceId"

    .line 939
    .line 940
    invoke-virtual {v3, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 941
    .line 942
    .line 943
    move-result-object v5

    .line 944
    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    .line 945
    .line 946
    .line 947
    move-result v6

    .line 948
    if-eqz v6, :cond_17

    .line 949
    .line 950
    goto :goto_b

    .line 951
    :cond_17
    iget-object v6, v1, La/zn00;->b:Ljava/lang/Object;

    .line 952
    .line 953
    check-cast v6, Ljava/util/Map;

    .line 954
    .line 955
    monitor-enter v6

    .line 956
    :try_start_8
    iget-object v7, v1, La/zn00;->b:Ljava/lang/Object;

    .line 957
    .line 958
    check-cast v7, Ljava/util/Map;

    .line 959
    .line 960
    invoke-interface {v7, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 961
    .line 962
    .line 963
    move-result-object v7

    .line 964
    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 965
    .line 966
    .line 967
    move-result v7

    .line 968
    if-eqz v7, :cond_18

    .line 969
    .line 970
    monitor-exit v6

    .line 971
    goto :goto_b

    .line 972
    :catchall_4
    move-exception v0

    .line 973
    goto :goto_c

    .line 974
    :cond_18
    iget-object v1, v1, La/zn00;->b:Ljava/lang/Object;

    .line 975
    .line 976
    check-cast v1, Ljava/util/Map;

    .line 977
    .line 978
    invoke-interface {v1, v2, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 979
    .line 980
    .line 981
    monitor-exit v6
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 982
    new-instance v1, Landroid/os/Bundle;

    .line 983
    .line 984
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 985
    .line 986
    .line 987
    const-string v6, "arm_key"

    .line 988
    .line 989
    invoke-virtual {v1, v6, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 990
    .line 991
    .line 992
    const-string v6, "arm_value"

    .line 993
    .line 994
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 995
    .line 996
    .line 997
    move-result-object v0

    .line 998
    invoke-virtual {v1, v6, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 999
    .line 1000
    .line 1001
    const-string v0, "personalization_id"

    .line 1002
    .line 1003
    const-string v2, "personalizationId"

    .line 1004
    .line 1005
    invoke-virtual {v3, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 1006
    .line 1007
    .line 1008
    move-result-object v2

    .line 1009
    invoke-virtual {v1, v0, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1010
    .line 1011
    .line 1012
    const-string v0, "arm_index"

    .line 1013
    .line 1014
    const-string v2, "armIndex"

    .line 1015
    .line 1016
    const/4 v6, -0x1

    .line 1017
    invoke-virtual {v3, v2, v6}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 1018
    .line 1019
    .line 1020
    move-result v2

    .line 1021
    invoke-virtual {v1, v0, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 1022
    .line 1023
    .line 1024
    const-string v0, "group"

    .line 1025
    .line 1026
    const-string v2, "group"

    .line 1027
    .line 1028
    invoke-virtual {v3, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 1029
    .line 1030
    .line 1031
    move-result-object v2

    .line 1032
    invoke-virtual {v1, v0, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1033
    .line 1034
    .line 1035
    const-string v0, "fp"

    .line 1036
    .line 1037
    const-string v2, "personalization_assignment"

    .line 1038
    .line 1039
    check-cast v4, La/wp2;

    .line 1040
    .line 1041
    invoke-virtual {v4, v0, v2, v1}, La/wp2;->a(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 1042
    .line 1043
    .line 1044
    new-instance v0, Landroid/os/Bundle;

    .line 1045
    .line 1046
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 1047
    .line 1048
    .line 1049
    const-string v1, "_fpid"

    .line 1050
    .line 1051
    invoke-virtual {v0, v1, v5}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1052
    .line 1053
    .line 1054
    const-string v1, "fp"

    .line 1055
    .line 1056
    const-string v2, "_fpc"

    .line 1057
    .line 1058
    invoke-virtual {v4, v1, v2, v0}, La/wp2;->a(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 1059
    .line 1060
    .line 1061
    :goto_b
    return-void

    .line 1062
    :goto_c
    :try_start_9
    monitor-exit v6
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .line 1063
    throw v0

    .line 1064
    :pswitch_16
    iget-object v1, v0, La/b1;->b:Ljava/lang/Object;

    .line 1065
    .line 1066
    check-cast v1, Ljava/util/ArrayList;

    .line 1067
    .line 1068
    iget-object v2, v0, La/b1;->c:Ljava/lang/Object;

    .line 1069
    .line 1070
    check-cast v2, La/ee60;

    .line 1071
    .line 1072
    iget-object v0, v0, La/b1;->d:Ljava/lang/Object;

    .line 1073
    .line 1074
    check-cast v0, Ljava/lang/String;

    .line 1075
    .line 1076
    :try_start_a
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1077
    .line 1078
    .line 1079
    move-result-object v1

    .line 1080
    :cond_19
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1081
    .line 1082
    .line 1083
    move-result v3

    .line 1084
    if-eqz v3, :cond_1a

    .line 1085
    .line 1086
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1087
    .line 1088
    .line 1089
    move-result-object v3

    .line 1090
    move-object v4, v3

    .line 1091
    check-cast v4, La/n0a;

    .line 1092
    .line 1093
    invoke-interface {v4}, La/n0a;->e()Ljava/lang/String;

    .line 1094
    .line 1095
    .line 1096
    move-result-object v4

    .line 1097
    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1098
    .line 1099
    .line 1100
    move-result v4

    .line 1101
    if-eqz v4, :cond_19

    .line 1102
    .line 1103
    move-object v5, v3

    .line 1104
    :cond_1a
    check-cast v5, La/n0a;

    .line 1105
    .line 1106
    if-eqz v5, :cond_1b

    .line 1107
    .line 1108
    invoke-interface {v5}, La/j0a;->b()La/wh00;

    .line 1109
    .line 1110
    .line 1111
    move-result-object v0

    .line 1112
    if-eqz v0, :cond_1b

    .line 1113
    .line 1114
    invoke-virtual {v0, v2}, La/wh00;->j(La/ee60;)V
    :try_end_a
    .catch Ljava/lang/IllegalArgumentException; {:try_start_a .. :try_end_a} :catch_1

    .line 1115
    .line 1116
    .line 1117
    :catch_1
    :cond_1b
    return-void

    .line 1118
    :pswitch_17
    iget-object v1, v0, La/b1;->b:Ljava/lang/Object;

    .line 1119
    .line 1120
    check-cast v1, La/vx9;

    .line 1121
    .line 1122
    iget-object v2, v0, La/b1;->c:Ljava/lang/Object;

    .line 1123
    .line 1124
    check-cast v2, La/gnf0;

    .line 1125
    .line 1126
    iget-object v0, v0, La/b1;->d:Ljava/lang/Object;

    .line 1127
    .line 1128
    check-cast v0, La/yk5;

    .line 1129
    .line 1130
    invoke-static {v2}, La/ux9;->g(La/gnf0;)I

    .line 1131
    .line 1132
    .line 1133
    move-result v2

    .line 1134
    invoke-virtual {v1, v2, v0}, La/vx9;->c(ILa/yk5;)V

    .line 1135
    .line 1136
    .line 1137
    return-void

    .line 1138
    :pswitch_18
    iget-object v1, v0, La/b1;->b:Ljava/lang/Object;

    .line 1139
    .line 1140
    check-cast v1, La/vx9;

    .line 1141
    .line 1142
    iget-object v2, v0, La/b1;->c:Ljava/lang/Object;

    .line 1143
    .line 1144
    check-cast v2, La/gnf0;

    .line 1145
    .line 1146
    iget-object v0, v0, La/b1;->d:Ljava/lang/Object;

    .line 1147
    .line 1148
    check-cast v0, La/j9a;

    .line 1149
    .line 1150
    invoke-static {v2}, La/ux9;->g(La/gnf0;)I

    .line 1151
    .line 1152
    .line 1153
    move-result v2

    .line 1154
    invoke-virtual {v1, v2, v0}, La/vx9;->b(ILa/cy9;)V

    .line 1155
    .line 1156
    .line 1157
    return-void

    .line 1158
    :pswitch_19
    iget-object v1, v0, La/b1;->b:Ljava/lang/Object;

    .line 1159
    .line 1160
    check-cast v1, Landroid/media/AudioTrack;

    .line 1161
    .line 1162
    iget-object v2, v0, La/b1;->c:Ljava/lang/Object;

    .line 1163
    .line 1164
    check-cast v2, Landroid/os/Handler;

    .line 1165
    .line 1166
    iget-object v0, v0, La/b1;->d:Ljava/lang/Object;

    .line 1167
    .line 1168
    move-object v4, v0

    .line 1169
    check-cast v4, La/vg00;

    .line 1170
    .line 1171
    const/16 v6, 0xf

    .line 1172
    .line 1173
    :try_start_b
    invoke-virtual {v1}, Landroid/media/AudioTrack;->flush()V

    .line 1174
    .line 1175
    .line 1176
    invoke-virtual {v1}, Landroid/media/AudioTrack;->release()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_6

    .line 1177
    .line 1178
    .line 1179
    invoke-virtual {v2}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 1180
    .line 1181
    .line 1182
    move-result-object v0

    .line 1183
    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 1184
    .line 1185
    .line 1186
    move-result-object v0

    .line 1187
    invoke-virtual {v0}, Ljava/lang/Thread;->isAlive()Z

    .line 1188
    .line 1189
    .line 1190
    move-result v0

    .line 1191
    if-eqz v0, :cond_1c

    .line 1192
    .line 1193
    new-instance v0, La/w1;

    .line 1194
    .line 1195
    invoke-direct {v0, v4, v6}, La/w1;-><init>(Ljava/lang/Object;B)V

    .line 1196
    .line 1197
    .line 1198
    invoke-virtual {v2, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 1199
    .line 1200
    .line 1201
    :cond_1c
    sget-object v1, La/l44;->r:Ljava/lang/Object;

    .line 1202
    .line 1203
    monitor-enter v1

    .line 1204
    :try_start_c
    sget v0, La/l44;->t:I

    .line 1205
    .line 1206
    sub-int/2addr v0, v3

    .line 1207
    sput v0, La/l44;->t:I

    .line 1208
    .line 1209
    if-nez v0, :cond_1d

    .line 1210
    .line 1211
    sget-object v0, La/l44;->s:Ljava/util/concurrent/ScheduledExecutorService;

    .line 1212
    .line 1213
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1214
    .line 1215
    .line 1216
    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 1217
    .line 1218
    .line 1219
    sput-object v5, La/l44;->s:Ljava/util/concurrent/ScheduledExecutorService;

    .line 1220
    .line 1221
    goto :goto_d

    .line 1222
    :catchall_5
    move-exception v0

    .line 1223
    goto :goto_e

    .line 1224
    :cond_1d
    :goto_d
    monitor-exit v1

    .line 1225
    return-void

    .line 1226
    :goto_e
    monitor-exit v1
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_5

    .line 1227
    throw v0

    .line 1228
    :catchall_6
    move-exception v0

    .line 1229
    invoke-virtual {v2}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 1230
    .line 1231
    .line 1232
    move-result-object v1

    .line 1233
    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 1234
    .line 1235
    .line 1236
    move-result-object v1

    .line 1237
    invoke-virtual {v1}, Ljava/lang/Thread;->isAlive()Z

    .line 1238
    .line 1239
    .line 1240
    move-result v1

    .line 1241
    if-eqz v1, :cond_1e

    .line 1242
    .line 1243
    new-instance v1, La/w1;

    .line 1244
    .line 1245
    invoke-direct {v1, v4, v6}, La/w1;-><init>(Ljava/lang/Object;B)V

    .line 1246
    .line 1247
    .line 1248
    invoke-virtual {v2, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 1249
    .line 1250
    .line 1251
    :cond_1e
    sget-object v1, La/l44;->r:Ljava/lang/Object;

    .line 1252
    .line 1253
    monitor-enter v1

    .line 1254
    :try_start_d
    sget v2, La/l44;->t:I

    .line 1255
    .line 1256
    sub-int/2addr v2, v3

    .line 1257
    sput v2, La/l44;->t:I

    .line 1258
    .line 1259
    if-nez v2, :cond_1f

    .line 1260
    .line 1261
    sget-object v2, La/l44;->s:Ljava/util/concurrent/ScheduledExecutorService;

    .line 1262
    .line 1263
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1264
    .line 1265
    .line 1266
    invoke-interface {v2}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 1267
    .line 1268
    .line 1269
    sput-object v5, La/l44;->s:Ljava/util/concurrent/ScheduledExecutorService;

    .line 1270
    .line 1271
    goto :goto_f

    .line 1272
    :catchall_7
    move-exception v0

    .line 1273
    goto :goto_10

    .line 1274
    :cond_1f
    :goto_f
    monitor-exit v1
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_7

    .line 1275
    throw v0

    .line 1276
    :goto_10
    :try_start_e
    monitor-exit v1
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_7

    .line 1277
    throw v0

    .line 1278
    :pswitch_1a
    iget-object v1, v0, La/b1;->b:Ljava/lang/Object;

    .line 1279
    .line 1280
    check-cast v1, Landroid/content/Context;

    .line 1281
    .line 1282
    iget-object v2, v0, La/b1;->c:Ljava/lang/Object;

    .line 1283
    .line 1284
    check-cast v2, Landroid/os/IBinder;

    .line 1285
    .line 1286
    iget-object v0, v0, La/b1;->d:Ljava/lang/Object;

    .line 1287
    .line 1288
    check-cast v0, Lkotlin/jvm/functions/Function0;

    .line 1289
    .line 1290
    const-string v3, "input_method"

    .line 1291
    .line 1292
    invoke-virtual {v1, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 1293
    .line 1294
    .line 1295
    move-result-object v1

    .line 1296
    instance-of v3, v1, Landroid/view/inputmethod/InputMethodManager;

    .line 1297
    .line 1298
    if-eqz v3, :cond_20

    .line 1299
    .line 1300
    move-object v5, v1

    .line 1301
    check-cast v5, Landroid/view/inputmethod/InputMethodManager;

    .line 1302
    .line 1303
    :cond_20
    if-eqz v5, :cond_21

    .line 1304
    .line 1305
    invoke-virtual {v5, v2, v4}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 1306
    .line 1307
    .line 1308
    :cond_21
    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 1309
    .line 1310
    .line 1311
    return-void

    .line 1312
    :pswitch_1b
    iget-object v1, v0, La/b1;->b:Ljava/lang/Object;

    .line 1313
    .line 1314
    check-cast v1, La/h23;

    .line 1315
    .line 1316
    iget-object v2, v0, La/b1;->c:Ljava/lang/Object;

    .line 1317
    .line 1318
    check-cast v2, La/f23;

    .line 1319
    .line 1320
    iget-object v0, v0, La/b1;->d:Ljava/lang/Object;

    .line 1321
    .line 1322
    check-cast v0, La/g23;

    .line 1323
    .line 1324
    iget-object v4, v1, La/h23;->a:Landroid/view/View;

    .line 1325
    .line 1326
    new-instance v5, La/emq;

    .line 1327
    .line 1328
    invoke-direct {v5, v2}, La/emq;-><init>(La/f23;)V

    .line 1329
    .line 1330
    .line 1331
    invoke-virtual {v4, v5, v3}, Landroid/view/View;->startActionMode(Landroid/view/ActionMode$Callback;I)Landroid/view/ActionMode;

    .line 1332
    .line 1333
    .line 1334
    move-result-object v2

    .line 1335
    iput-object v2, v1, La/h23;->h:Landroid/view/ActionMode;

    .line 1336
    .line 1337
    if-nez v2, :cond_22

    .line 1338
    .line 1339
    invoke-virtual {v0}, La/g23;->close()V

    .line 1340
    .line 1341
    .line 1342
    :cond_22
    return-void

    .line 1343
    :pswitch_1c
    iget-object v1, v0, La/b1;->b:Ljava/lang/Object;

    .line 1344
    .line 1345
    check-cast v1, Ljava/lang/Throwable;

    .line 1346
    .line 1347
    iget-object v2, v0, La/b1;->c:Ljava/lang/Object;

    .line 1348
    .line 1349
    check-cast v2, La/c1;

    .line 1350
    .line 1351
    iget-object v0, v0, La/b1;->d:Ljava/lang/Object;

    .line 1352
    .line 1353
    check-cast v0, Ljava/util/List;

    .line 1354
    .line 1355
    if-eqz v1, :cond_23

    .line 1356
    .line 1357
    iget-object v0, v2, La/c1;->b:La/ca60;

    .line 1358
    .line 1359
    invoke-interface {v0, v1}, La/ca60;->onError(Ljava/lang/Throwable;)V

    .line 1360
    .line 1361
    .line 1362
    goto :goto_11

    .line 1363
    :cond_23
    iget-object v1, v2, La/c1;->b:La/ca60;

    .line 1364
    .line 1365
    invoke-interface {v1, v0}, La/ca60;->a(Ljava/lang/Object;)V

    .line 1366
    .line 1367
    .line 1368
    :goto_11
    return-void

    .line 1369
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

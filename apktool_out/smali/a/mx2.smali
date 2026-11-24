.class public final La/mx2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:B

.field public final b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Landroid/view/ViewGroup;Landroid/view/ViewGroup;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/mx2;->a:B

    iput-object p2, p0, La/mx2;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 2
    iput-byte p2, p0, La/mx2;->a:B

    iput-object p1, p0, La/mx2;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    :try_start_0
    iget-object v2, p0, La/mx2;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v2, La/rgi0;

    .line 6
    .line 7
    iget-object v2, v2, La/rgi0;->a:Ljava/util/ArrayDeque;

    .line 8
    .line 9
    monitor-enter v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 10
    const/4 v3, 0x1

    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    :try_start_1
    iget-object v0, p0, La/mx2;->b:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, La/rgi0;

    .line 16
    .line 17
    iget v4, v0, La/rgi0;->d:I

    .line 18
    .line 19
    const/4 v5, 0x4

    .line 20
    if-ne v4, v5, :cond_0

    .line 21
    .line 22
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 23
    if-eqz v1, :cond_2

    .line 24
    .line 25
    :goto_1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-virtual {p0}, Ljava/lang/Thread;->interrupt()V

    .line 30
    .line 31
    .line 32
    goto :goto_2

    .line 33
    :catchall_0
    move-exception p0

    .line 34
    goto :goto_3

    .line 35
    :cond_0
    :try_start_2
    iget-wide v6, v0, La/rgi0;->e:J

    .line 36
    .line 37
    const-wide/16 v8, 0x1

    .line 38
    .line 39
    add-long/2addr v6, v8

    .line 40
    iput-wide v6, v0, La/rgi0;->e:J

    .line 41
    .line 42
    iput v5, v0, La/rgi0;->d:I

    .line 43
    .line 44
    move v0, v3

    .line 45
    :cond_1
    iget-object v4, p0, La/mx2;->b:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v4, La/rgi0;

    .line 48
    .line 49
    iget-object v4, v4, La/rgi0;->a:Ljava/util/ArrayDeque;

    .line 50
    .line 51
    invoke-virtual {v4}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    check-cast v4, Ljava/lang/Runnable;

    .line 56
    .line 57
    if-nez v4, :cond_3

    .line 58
    .line 59
    iget-object p0, p0, La/mx2;->b:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast p0, La/rgi0;

    .line 62
    .line 63
    iput v3, p0, La/rgi0;->d:I

    .line 64
    .line 65
    monitor-exit v2

    .line 66
    if-eqz v1, :cond_2

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_2
    :goto_2
    return-void

    .line 70
    :cond_3
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 71
    :try_start_3
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    .line 72
    .line 73
    .line 74
    move-result v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 75
    or-int/2addr v1, v2

    .line 76
    :try_start_4
    invoke-interface {v4}, Ljava/lang/Runnable;->run()V
    :try_end_4
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 77
    .line 78
    .line 79
    goto :goto_0

    .line 80
    :catchall_1
    move-exception p0

    .line 81
    goto :goto_4

    .line 82
    :catch_0
    move-exception v2

    .line 83
    :try_start_5
    const-string v3, "SequentialExecutor"

    .line 84
    .line 85
    new-instance v5, Ljava/lang/StringBuilder;

    .line 86
    .line 87
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 88
    .line 89
    .line 90
    const-string v6, "Exception while executing runnable "

    .line 91
    .line 92
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v4

    .line 102
    invoke-static {v3, v4, v2}, La/l8x;->Y(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 103
    .line 104
    .line 105
    goto :goto_0

    .line 106
    :goto_3
    :try_start_6
    monitor-exit v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 107
    :try_start_7
    throw p0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 108
    :goto_4
    if-eqz v1, :cond_4

    .line 109
    .line 110
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 115
    .line 116
    .line 117
    :cond_4
    throw p0
.end method

.method public final run()V
    .locals 21

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-byte v0, v1, La/mx2;->a:B

    .line 4
    .line 5
    const/16 v2, 0x8

    .line 6
    .line 7
    const-wide/16 v3, 0x0

    .line 8
    .line 9
    const/4 v5, 0x0

    .line 10
    const/4 v6, 0x0

    .line 11
    const/4 v7, 0x2

    .line 12
    const/4 v8, 0x1

    .line 13
    const/4 v9, 0x0

    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    iget-object v0, v1, La/mx2;->b:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, La/ygu0;

    .line 20
    .line 21
    invoke-virtual {v0, v9}, La/ygu0;->m(I)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :pswitch_0
    iget-object v0, v1, La/mx2;->b:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v0, Landroidx/appcompat/widget/Toolbar;

    .line 28
    .line 29
    iget-object v0, v0, Landroidx/appcompat/widget/Toolbar;->a:Landroidx/appcompat/widget/ActionMenuView;

    .line 30
    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    iget-object v0, v0, Landroidx/appcompat/widget/ActionMenuView;->t:La/xi;

    .line 34
    .line 35
    if-eqz v0, :cond_0

    .line 36
    .line 37
    invoke-virtual {v0}, La/xi;->l()Z

    .line 38
    .line 39
    .line 40
    :cond_0
    return-void

    .line 41
    :pswitch_1
    iget-object v0, v1, La/mx2;->b:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v0, Lcom/google/android/material/textfield/TextInputLayout;

    .line 44
    .line 45
    iget-object v0, v0, Lcom/google/android/material/textfield/TextInputLayout;->c:La/cxn;

    .line 46
    .line 47
    iget-object v0, v0, La/cxn;->g:Lcom/google/android/material/internal/CheckableImageButton;

    .line 48
    .line 49
    invoke-virtual {v0}, Landroid/view/View;->performClick()Z

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, Landroid/view/View;->jumpDrawablesToCurrentState()V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :pswitch_2
    iget-object v0, v1, La/mx2;->b:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    .line 59
    .line 60
    invoke-virtual {v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->U0()Z

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :pswitch_3
    :try_start_0
    invoke-virtual {v1}, La/mx2;->a()V
    :try_end_0
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :catch_0
    move-exception v0

    .line 69
    iget-object v2, v1, La/mx2;->b:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v2, La/rgi0;

    .line 72
    .line 73
    iget-object v2, v2, La/rgi0;->a:Ljava/util/ArrayDeque;

    .line 74
    .line 75
    monitor-enter v2

    .line 76
    :try_start_1
    iget-object v1, v1, La/mx2;->b:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v1, La/rgi0;

    .line 79
    .line 80
    iput v8, v1, La/rgi0;->d:I

    .line 81
    .line 82
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 83
    throw v0

    .line 84
    :catchall_0
    move-exception v0

    .line 85
    :try_start_2
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 86
    throw v0

    .line 87
    :pswitch_4
    iget-object v0, v1, La/mx2;->b:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v0, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    .line 90
    .line 91
    iget-boolean v1, v0, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->g:Z

    .line 92
    .line 93
    if-eqz v1, :cond_1

    .line 94
    .line 95
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    const-string v2, "input_method"

    .line 100
    .line 101
    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    check-cast v1, Landroid/view/inputmethod/InputMethodManager;

    .line 106
    .line 107
    invoke-virtual {v1, v0, v9}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    .line 108
    .line 109
    .line 110
    iput-boolean v9, v0, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->g:Z

    .line 111
    .line 112
    :cond_1
    return-void

    .line 113
    :pswitch_5
    iget-object v0, v1, La/mx2;->b:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast v0, Landroidx/constraintlayout/motion/widget/MotionLayout;

    .line 116
    .line 117
    iget-object v0, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->N1:La/xs40;

    .line 118
    .line 119
    invoke-virtual {v0}, La/xs40;->a()V

    .line 120
    .line 121
    .line 122
    return-void

    .line 123
    :pswitch_6
    iget-object v0, v1, La/mx2;->b:Ljava/lang/Object;

    .line 124
    .line 125
    check-cast v0, La/aa40;

    .line 126
    .line 127
    iget-boolean v2, v0, La/aa40;->h:Z

    .line 128
    .line 129
    if-nez v2, :cond_2

    .line 130
    .line 131
    goto/16 :goto_2

    .line 132
    .line 133
    :cond_2
    iget-object v2, v0, La/aa40;->m:La/n0o0;

    .line 134
    .line 135
    invoke-virtual {v2}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v2

    .line 139
    check-cast v2, La/guc;

    .line 140
    .line 141
    iget-object v2, v2, La/guc;->g:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 142
    .line 143
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 144
    .line 145
    .line 146
    move-result v2

    .line 147
    if-eqz v2, :cond_5

    .line 148
    .line 149
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 150
    .line 151
    .line 152
    move-result-wide v2

    .line 153
    iget-wide v4, v0, La/aa40;->g:J

    .line 154
    .line 155
    sub-long/2addr v2, v4

    .line 156
    const-wide/16 v4, 0x3a98

    .line 157
    .line 158
    cmp-long v2, v2, v4

    .line 159
    .line 160
    if-ltz v2, :cond_3

    .line 161
    .line 162
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 163
    .line 164
    .line 165
    move-result-wide v2

    .line 166
    iput-wide v2, v0, La/aa40;->g:J

    .line 167
    .line 168
    new-instance v2, Lorg/json/JSONObject;

    .line 169
    .line 170
    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 171
    .line 172
    .line 173
    const-string v3, "$type"

    .line 174
    .line 175
    const/4 v4, 0x6

    .line 176
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 177
    .line 178
    .line 179
    :try_start_3
    sget-object v3, La/j0g0;->b:La/e0g0;

    .line 180
    .line 181
    invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v2

    .line 185
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 186
    .line 187
    .line 188
    invoke-virtual {v0, v2}, La/aa40;->b(Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 189
    .line 190
    .line 191
    goto :goto_0

    .line 192
    :catchall_1
    sget-object v2, La/j0g0;->b:La/e0g0;

    .line 193
    .line 194
    :cond_3
    :goto_0
    iget-object v2, v0, La/aa40;->c:La/jwd;

    .line 195
    .line 196
    if-eqz v2, :cond_4

    .line 197
    .line 198
    invoke-virtual {v2}, La/jwd;->invoke()Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    :cond_4
    iget-object v0, v0, La/aa40;->k:Landroid/os/Handler;

    .line 202
    .line 203
    const-wide/16 v2, 0x1388

    .line 204
    .line 205
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 206
    .line 207
    .line 208
    goto :goto_2

    .line 209
    :cond_5
    iget-object v1, v0, La/aa40;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 210
    .line 211
    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    .line 212
    .line 213
    .line 214
    move-result-object v1

    .line 215
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 216
    .line 217
    .line 218
    check-cast v1, Ljava/lang/Iterable;

    .line 219
    .line 220
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 221
    .line 222
    .line 223
    move-result-object v1

    .line 224
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 225
    .line 226
    .line 227
    move-result v2

    .line 228
    if-eqz v2, :cond_6

    .line 229
    .line 230
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object v2

    .line 234
    check-cast v2, La/z940;

    .line 235
    .line 236
    new-instance v3, Ljava/net/UnknownHostException;

    .line 237
    .line 238
    invoke-direct {v3}, Ljava/net/UnknownHostException;-><init>()V

    .line 239
    .line 240
    .line 241
    iget-object v4, v2, La/z940;->a:La/aa40;

    .line 242
    .line 243
    iget-object v4, v4, La/aa40;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 244
    .line 245
    iget v5, v2, La/z940;->b:I

    .line 246
    .line 247
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 248
    .line 249
    .line 250
    move-result-object v5

    .line 251
    invoke-virtual {v4, v5}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    iget-object v2, v2, La/z940;->d:La/n5a;

    .line 255
    .line 256
    sget-object v4, La/j0g0;->b:La/e0g0;

    .line 257
    .line 258
    new-instance v4, La/g0g0;

    .line 259
    .line 260
    invoke-direct {v4, v3}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 261
    .line 262
    .line 263
    invoke-virtual {v2, v4}, La/n5a;->resumeWith(Ljava/lang/Object;)V

    .line 264
    .line 265
    .line 266
    goto :goto_1

    .line 267
    :cond_6
    iget-object v0, v0, La/aa40;->d:La/ejd;

    .line 268
    .line 269
    if-eqz v0, :cond_7

    .line 270
    .line 271
    new-instance v1, Ljava/util/concurrent/TimeoutException;

    .line 272
    .line 273
    invoke-direct {v1}, Ljava/util/concurrent/TimeoutException;-><init>()V

    .line 274
    .line 275
    .line 276
    invoke-virtual {v0, v1}, La/ejd;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    :cond_7
    :goto_2
    return-void

    .line 280
    :pswitch_7
    iget-object v0, v1, La/mx2;->b:Ljava/lang/Object;

    .line 281
    .line 282
    check-cast v0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;

    .line 283
    .line 284
    invoke-static {v0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->u(Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;)La/zhu0;

    .line 285
    .line 286
    .line 287
    move-result-object v1

    .line 288
    iget-object v1, v1, La/zhu0;->i:Landroidx/recyclerview/widget/RecyclerView;

    .line 289
    .line 290
    iget-object v0, v0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->h1:Lorg/xplatform/sportgame/classic/impl/presentation/legacy/models/CardIdentity;

    .line 291
    .line 292
    iget v0, v0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/models/CardIdentity;->b:I

    .line 293
    .line 294
    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->y0(I)V

    .line 295
    .line 296
    .line 297
    return-void

    .line 298
    :pswitch_8
    iget-object v0, v1, La/mx2;->b:Ljava/lang/Object;

    .line 299
    .line 300
    check-cast v0, La/lq00;

    .line 301
    .line 302
    invoke-interface {v0}, La/lq00;->i()V

    .line 303
    .line 304
    .line 305
    return-void

    .line 306
    :pswitch_9
    iget-object v0, v1, La/mx2;->b:Ljava/lang/Object;

    .line 307
    .line 308
    check-cast v0, La/wh00;

    .line 309
    .line 310
    iget-object v2, v0, La/wh00;->a:Ljava/lang/Object;

    .line 311
    .line 312
    monitor-enter v2

    .line 313
    :try_start_4
    iget-object v0, v1, La/mx2;->b:Ljava/lang/Object;

    .line 314
    .line 315
    check-cast v0, La/wh00;

    .line 316
    .line 317
    iget-object v0, v0, La/wh00;->f:Ljava/lang/Object;

    .line 318
    .line 319
    iget-object v3, v1, La/mx2;->b:Ljava/lang/Object;

    .line 320
    .line 321
    check-cast v3, La/wh00;

    .line 322
    .line 323
    sget-object v4, La/wh00;->k:Ljava/lang/Object;

    .line 324
    .line 325
    iput-object v4, v3, La/wh00;->f:Ljava/lang/Object;

    .line 326
    .line 327
    monitor-exit v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 328
    iget-object v1, v1, La/mx2;->b:Ljava/lang/Object;

    .line 329
    .line 330
    check-cast v1, La/wh00;

    .line 331
    .line 332
    invoke-virtual {v1, v0}, La/wh00;->l(Ljava/lang/Object;)V

    .line 333
    .line 334
    .line 335
    return-void

    .line 336
    :catchall_2
    move-exception v0

    .line 337
    :try_start_5
    monitor-exit v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 338
    throw v0

    .line 339
    :pswitch_a
    iget-object v0, v1, La/mx2;->b:Ljava/lang/Object;

    .line 340
    .line 341
    check-cast v0, La/gd00;

    .line 342
    .line 343
    iput-object v6, v0, La/gd00;->b:Ljava/util/ArrayList;

    .line 344
    .line 345
    iput-object v6, v0, La/gd00;->a:Ljava/util/ArrayList;

    .line 346
    .line 347
    return-void

    .line 348
    :pswitch_b
    iget-object v0, v1, La/mx2;->b:Ljava/lang/Object;

    .line 349
    .line 350
    check-cast v0, La/vyx;

    .line 351
    .line 352
    iget-object v2, v0, La/vyx;->c:La/xhe0;

    .line 353
    .line 354
    if-eqz v2, :cond_14

    .line 355
    .line 356
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 357
    .line 358
    .line 359
    move-result-wide v6

    .line 360
    iget-wide v10, v0, La/vyx;->A:J

    .line 361
    .line 362
    const-wide/high16 v12, -0x8000000000000000L

    .line 363
    .line 364
    cmp-long v2, v10, v12

    .line 365
    .line 366
    if-nez v2, :cond_8

    .line 367
    .line 368
    :goto_3
    move-wide/from16 v19, v3

    .line 369
    .line 370
    goto :goto_4

    .line 371
    :cond_8
    sub-long v3, v6, v10

    .line 372
    .line 373
    goto :goto_3

    .line 374
    :goto_4
    iget-object v2, v0, La/vyx;->q:Landroidx/recyclerview/widget/RecyclerView;

    .line 375
    .line 376
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/b;

    .line 377
    .line 378
    .line 379
    move-result-object v2

    .line 380
    iget-object v3, v0, La/vyx;->z:Landroid/graphics/Rect;

    .line 381
    .line 382
    if-nez v3, :cond_9

    .line 383
    .line 384
    new-instance v3, Landroid/graphics/Rect;

    .line 385
    .line 386
    invoke-direct {v3}, Landroid/graphics/Rect;-><init>()V

    .line 387
    .line 388
    .line 389
    iput-object v3, v0, La/vyx;->z:Landroid/graphics/Rect;

    .line 390
    .line 391
    :cond_9
    iget-object v4, v0, La/vyx;->c:La/xhe0;

    .line 392
    .line 393
    iget-object v4, v4, La/xhe0;->a:Landroid/view/View;

    .line 394
    .line 395
    invoke-virtual {v2, v3, v4}, Landroidx/recyclerview/widget/b;->p(Landroid/graphics/Rect;Landroid/view/View;)V

    .line 396
    .line 397
    .line 398
    invoke-virtual {v2}, Landroidx/recyclerview/widget/b;->q()Z

    .line 399
    .line 400
    .line 401
    move-result v3

    .line 402
    if-eqz v3, :cond_b

    .line 403
    .line 404
    iget v3, v0, La/vyx;->j:F

    .line 405
    .line 406
    iget v4, v0, La/vyx;->h:F

    .line 407
    .line 408
    add-float/2addr v3, v4

    .line 409
    float-to-int v3, v3

    .line 410
    iget-object v4, v0, La/vyx;->z:Landroid/graphics/Rect;

    .line 411
    .line 412
    iget v4, v4, Landroid/graphics/Rect;->left:I

    .line 413
    .line 414
    sub-int v4, v3, v4

    .line 415
    .line 416
    iget-object v8, v0, La/vyx;->q:Landroidx/recyclerview/widget/RecyclerView;

    .line 417
    .line 418
    invoke-virtual {v8}, Landroid/view/View;->getPaddingLeft()I

    .line 419
    .line 420
    .line 421
    move-result v8

    .line 422
    sub-int/2addr v4, v8

    .line 423
    iget v8, v0, La/vyx;->h:F

    .line 424
    .line 425
    cmpg-float v10, v8, v5

    .line 426
    .line 427
    if-gez v10, :cond_a

    .line 428
    .line 429
    if-gez v4, :cond_a

    .line 430
    .line 431
    :goto_5
    move/from16 v17, v4

    .line 432
    .line 433
    goto :goto_6

    .line 434
    :cond_a
    cmpl-float v4, v8, v5

    .line 435
    .line 436
    if-lez v4, :cond_b

    .line 437
    .line 438
    iget-object v4, v0, La/vyx;->c:La/xhe0;

    .line 439
    .line 440
    iget-object v4, v4, La/xhe0;->a:Landroid/view/View;

    .line 441
    .line 442
    invoke-virtual {v4}, Landroid/view/View;->getWidth()I

    .line 443
    .line 444
    .line 445
    move-result v4

    .line 446
    add-int/2addr v4, v3

    .line 447
    iget-object v3, v0, La/vyx;->z:Landroid/graphics/Rect;

    .line 448
    .line 449
    iget v3, v3, Landroid/graphics/Rect;->right:I

    .line 450
    .line 451
    add-int/2addr v4, v3

    .line 452
    iget-object v3, v0, La/vyx;->q:Landroidx/recyclerview/widget/RecyclerView;

    .line 453
    .line 454
    invoke-virtual {v3}, Landroid/view/View;->getWidth()I

    .line 455
    .line 456
    .line 457
    move-result v3

    .line 458
    iget-object v8, v0, La/vyx;->q:Landroidx/recyclerview/widget/RecyclerView;

    .line 459
    .line 460
    invoke-virtual {v8}, Landroid/view/View;->getPaddingRight()I

    .line 461
    .line 462
    .line 463
    move-result v8

    .line 464
    sub-int/2addr v3, v8

    .line 465
    sub-int/2addr v4, v3

    .line 466
    if-lez v4, :cond_b

    .line 467
    .line 468
    goto :goto_5

    .line 469
    :cond_b
    move/from16 v17, v9

    .line 470
    .line 471
    :goto_6
    invoke-virtual {v2}, Landroidx/recyclerview/widget/b;->r()Z

    .line 472
    .line 473
    .line 474
    move-result v2

    .line 475
    if-eqz v2, :cond_d

    .line 476
    .line 477
    iget v2, v0, La/vyx;->k:F

    .line 478
    .line 479
    iget v3, v0, La/vyx;->i:F

    .line 480
    .line 481
    add-float/2addr v2, v3

    .line 482
    float-to-int v2, v2

    .line 483
    iget-object v3, v0, La/vyx;->z:Landroid/graphics/Rect;

    .line 484
    .line 485
    iget v3, v3, Landroid/graphics/Rect;->top:I

    .line 486
    .line 487
    sub-int v3, v2, v3

    .line 488
    .line 489
    iget-object v4, v0, La/vyx;->q:Landroidx/recyclerview/widget/RecyclerView;

    .line 490
    .line 491
    invoke-virtual {v4}, Landroid/view/View;->getPaddingTop()I

    .line 492
    .line 493
    .line 494
    move-result v4

    .line 495
    sub-int/2addr v3, v4

    .line 496
    iget v4, v0, La/vyx;->i:F

    .line 497
    .line 498
    cmpg-float v8, v4, v5

    .line 499
    .line 500
    if-gez v8, :cond_c

    .line 501
    .line 502
    if-gez v3, :cond_c

    .line 503
    .line 504
    :goto_7
    move v9, v3

    .line 505
    goto :goto_8

    .line 506
    :cond_c
    cmpl-float v3, v4, v5

    .line 507
    .line 508
    if-lez v3, :cond_d

    .line 509
    .line 510
    iget-object v3, v0, La/vyx;->c:La/xhe0;

    .line 511
    .line 512
    iget-object v3, v3, La/xhe0;->a:Landroid/view/View;

    .line 513
    .line 514
    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    .line 515
    .line 516
    .line 517
    move-result v3

    .line 518
    add-int/2addr v3, v2

    .line 519
    iget-object v2, v0, La/vyx;->z:Landroid/graphics/Rect;

    .line 520
    .line 521
    iget v2, v2, Landroid/graphics/Rect;->bottom:I

    .line 522
    .line 523
    add-int/2addr v3, v2

    .line 524
    iget-object v2, v0, La/vyx;->q:Landroidx/recyclerview/widget/RecyclerView;

    .line 525
    .line 526
    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    .line 527
    .line 528
    .line 529
    move-result v2

    .line 530
    iget-object v4, v0, La/vyx;->q:Landroidx/recyclerview/widget/RecyclerView;

    .line 531
    .line 532
    invoke-virtual {v4}, Landroid/view/View;->getPaddingBottom()I

    .line 533
    .line 534
    .line 535
    move-result v4

    .line 536
    sub-int/2addr v2, v4

    .line 537
    sub-int/2addr v3, v2

    .line 538
    if-lez v3, :cond_d

    .line 539
    .line 540
    goto :goto_7

    .line 541
    :cond_d
    :goto_8
    if-eqz v17, :cond_e

    .line 542
    .line 543
    iget-object v14, v0, La/vyx;->m:La/syx;

    .line 544
    .line 545
    iget-object v15, v0, La/vyx;->q:Landroidx/recyclerview/widget/RecyclerView;

    .line 546
    .line 547
    iget-object v2, v0, La/vyx;->c:La/xhe0;

    .line 548
    .line 549
    iget-object v2, v2, La/xhe0;->a:Landroid/view/View;

    .line 550
    .line 551
    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    .line 552
    .line 553
    .line 554
    move-result v16

    .line 555
    iget-object v2, v0, La/vyx;->q:Landroidx/recyclerview/widget/RecyclerView;

    .line 556
    .line 557
    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    .line 558
    .line 559
    .line 560
    move-result v18

    .line 561
    invoke-virtual/range {v14 .. v20}, La/syx;->o(Landroidx/recyclerview/widget/RecyclerView;IIIJ)I

    .line 562
    .line 563
    .line 564
    move-result v17

    .line 565
    :cond_e
    move/from16 v2, v17

    .line 566
    .line 567
    if-eqz v9, :cond_f

    .line 568
    .line 569
    iget-object v14, v0, La/vyx;->m:La/syx;

    .line 570
    .line 571
    iget-object v15, v0, La/vyx;->q:Landroidx/recyclerview/widget/RecyclerView;

    .line 572
    .line 573
    iget-object v3, v0, La/vyx;->c:La/xhe0;

    .line 574
    .line 575
    iget-object v3, v3, La/xhe0;->a:Landroid/view/View;

    .line 576
    .line 577
    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    .line 578
    .line 579
    .line 580
    move-result v16

    .line 581
    iget-object v3, v0, La/vyx;->q:Landroidx/recyclerview/widget/RecyclerView;

    .line 582
    .line 583
    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    .line 584
    .line 585
    .line 586
    move-result v18

    .line 587
    move/from16 v17, v9

    .line 588
    .line 589
    invoke-virtual/range {v14 .. v20}, La/syx;->o(Landroidx/recyclerview/widget/RecyclerView;IIIJ)I

    .line 590
    .line 591
    .line 592
    move-result v9

    .line 593
    goto :goto_9

    .line 594
    :cond_f
    move/from16 v17, v9

    .line 595
    .line 596
    :goto_9
    if-nez v2, :cond_11

    .line 597
    .line 598
    if-eqz v9, :cond_10

    .line 599
    .line 600
    goto :goto_a

    .line 601
    :cond_10
    iput-wide v12, v0, La/vyx;->A:J

    .line 602
    .line 603
    goto :goto_b

    .line 604
    :cond_11
    :goto_a
    iget-wide v3, v0, La/vyx;->A:J

    .line 605
    .line 606
    cmp-long v3, v3, v12

    .line 607
    .line 608
    if-nez v3, :cond_12

    .line 609
    .line 610
    iput-wide v6, v0, La/vyx;->A:J

    .line 611
    .line 612
    :cond_12
    iget-object v3, v0, La/vyx;->q:Landroidx/recyclerview/widget/RecyclerView;

    .line 613
    .line 614
    invoke-virtual {v3, v2, v9}, Landroidx/recyclerview/widget/RecyclerView;->scrollBy(II)V

    .line 615
    .line 616
    .line 617
    iget-object v2, v0, La/vyx;->c:La/xhe0;

    .line 618
    .line 619
    if-eqz v2, :cond_13

    .line 620
    .line 621
    invoke-virtual {v0, v2}, La/vyx;->q(La/xhe0;)V

    .line 622
    .line 623
    .line 624
    :cond_13
    iget-object v2, v0, La/vyx;->q:Landroidx/recyclerview/widget/RecyclerView;

    .line 625
    .line 626
    iget-object v3, v0, La/vyx;->r:La/mx2;

    .line 627
    .line 628
    invoke-virtual {v2, v3}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 629
    .line 630
    .line 631
    iget-object v0, v0, La/vyx;->q:Landroidx/recyclerview/widget/RecyclerView;

    .line 632
    .line 633
    sget-object v2, La/rgu0;->a:Ljava/util/WeakHashMap;

    .line 634
    .line 635
    invoke-virtual {v0, v1}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    .line 636
    .line 637
    .line 638
    :cond_14
    :goto_b
    return-void

    .line 639
    :pswitch_c
    iget-object v0, v1, La/mx2;->b:Ljava/lang/Object;

    .line 640
    .line 641
    check-cast v0, La/gxu;

    .line 642
    .line 643
    iget-object v1, v0, La/gxu;->c:Ljava/lang/Object;

    .line 644
    .line 645
    check-cast v1, La/kmv;

    .line 646
    .line 647
    iget-object v2, v1, La/kmv;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 648
    .line 649
    invoke-virtual {v2, v6}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 650
    .line 651
    .line 652
    move-result-object v2

    .line 653
    if-eqz v2, :cond_15

    .line 654
    .line 655
    iget-object v0, v0, La/gxu;->a:Ljava/lang/Object;

    .line 656
    .line 657
    check-cast v0, Landroid/os/Handler;

    .line 658
    .line 659
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 660
    .line 661
    .line 662
    :cond_15
    return-void

    .line 663
    :pswitch_d
    iget-object v0, v1, La/mx2;->b:Ljava/lang/Object;

    .line 664
    .line 665
    check-cast v0, La/n5a;

    .line 666
    .line 667
    invoke-static {v0}, La/imv;->c(La/n5a;)V

    .line 668
    .line 669
    .line 670
    return-void

    .line 671
    :pswitch_e
    iget-object v0, v1, La/mx2;->b:Ljava/lang/Object;

    .line 672
    .line 673
    check-cast v0, La/f5r;

    .line 674
    .line 675
    iput-boolean v9, v0, La/f5r;->k:Z

    .line 676
    .line 677
    invoke-virtual {v0}, La/f5r;->C()V

    .line 678
    .line 679
    .line 680
    return-void

    .line 681
    :pswitch_f
    iget-object v0, v1, La/mx2;->b:Ljava/lang/Object;

    .line 682
    .line 683
    check-cast v0, Landroidx/fragment/app/e;

    .line 684
    .line 685
    invoke-virtual {v0, v8}, Landroidx/fragment/app/e;->C(Z)Z

    .line 686
    .line 687
    .line 688
    return-void

    .line 689
    :pswitch_10
    iget-object v0, v1, La/mx2;->b:Ljava/lang/Object;

    .line 690
    .line 691
    check-cast v0, Landroidx/fragment/app/Fragment;

    .line 692
    .line 693
    iget-object v1, v0, Landroidx/fragment/app/Fragment;->o1:La/cxq;

    .line 694
    .line 695
    if-eqz v1, :cond_16

    .line 696
    .line 697
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->A()La/cxq;

    .line 698
    .line 699
    .line 700
    :cond_16
    return-void

    .line 701
    :pswitch_11
    iget-object v0, v1, La/mx2;->b:Ljava/lang/Object;

    .line 702
    .line 703
    check-cast v0, La/zdq;

    .line 704
    .line 705
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->D()Landroid/content/Context;

    .line 706
    .line 707
    .line 708
    move-result-object v1

    .line 709
    if-nez v1, :cond_17

    .line 710
    .line 711
    const-string v0, "FingerprintFragment"

    .line 712
    .line 713
    const-string v1, "Not resetting the dialog. Context is null."

    .line 714
    .line 715
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 716
    .line 717
    .line 718
    goto :goto_c

    .line 719
    :cond_17
    iget-object v2, v0, La/zdq;->a2:La/t58;

    .line 720
    .line 721
    invoke-virtual {v2, v8}, La/t58;->w(I)V

    .line 722
    .line 723
    .line 724
    iget-object v0, v0, La/zdq;->a2:La/t58;

    .line 725
    .line 726
    const v2, 0x7f1308c8

    .line 727
    .line 728
    .line 729
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 730
    .line 731
    .line 732
    move-result-object v1

    .line 733
    iget-object v2, v0, La/t58;->C:La/hy40;

    .line 734
    .line 735
    if-nez v2, :cond_18

    .line 736
    .line 737
    new-instance v2, La/hy40;

    .line 738
    .line 739
    invoke-direct {v2}, La/wh00;-><init>()V

    .line 740
    .line 741
    .line 742
    iput-object v2, v0, La/t58;->C:La/hy40;

    .line 743
    .line 744
    :cond_18
    invoke-static {v2, v1}, La/t58;->z(La/hy40;Ljava/lang/Object;)V

    .line 745
    .line 746
    .line 747
    :goto_c
    return-void

    .line 748
    :pswitch_12
    iget-object v0, v1, La/mx2;->b:Ljava/lang/Object;

    .line 749
    .line 750
    check-cast v0, La/m0p;

    .line 751
    .line 752
    iget-object v1, v0, La/m0p;->z:Landroid/animation/ValueAnimator;

    .line 753
    .line 754
    iget-byte v2, v0, La/m0p;->A:B

    .line 755
    .line 756
    if-eq v2, v8, :cond_19

    .line 757
    .line 758
    if-eq v2, v7, :cond_1a

    .line 759
    .line 760
    goto :goto_d

    .line 761
    :cond_19
    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->cancel()V

    .line 762
    .line 763
    .line 764
    :cond_1a
    const/4 v2, 0x3

    .line 765
    iput-byte v2, v0, La/m0p;->A:B

    .line 766
    .line 767
    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 768
    .line 769
    .line 770
    move-result-object v0

    .line 771
    check-cast v0, Ljava/lang/Float;

    .line 772
    .line 773
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 774
    .line 775
    .line 776
    move-result v0

    .line 777
    new-array v2, v7, [F

    .line 778
    .line 779
    aput v0, v2, v9

    .line 780
    .line 781
    aput v5, v2, v8

    .line 782
    .line 783
    invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->setFloatValues([F)V

    .line 784
    .line 785
    .line 786
    const-wide/16 v2, 0x1f4

    .line 787
    .line 788
    invoke-virtual {v1, v2, v3}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 789
    .line 790
    .line 791
    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->start()V

    .line 792
    .line 793
    .line 794
    :goto_d
    return-void

    .line 795
    :pswitch_13
    iget-object v0, v1, La/mx2;->b:Ljava/lang/Object;

    .line 796
    .line 797
    check-cast v0, Lorg/xplatform/uikit/components/timer/DsTimer;

    .line 798
    .line 799
    iget-object v2, v0, Lorg/xplatform/uikit/components/timer/DsTimer;->g:Landroid/os/Handler;

    .line 800
    .line 801
    invoke-virtual {v2, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 802
    .line 803
    .line 804
    invoke-virtual {v0}, Lorg/xplatform/uikit/components/timer/DsTimer;->e()Z

    .line 805
    .line 806
    .line 807
    move-result v3

    .line 808
    iput-boolean v3, v0, Lorg/xplatform/uikit/components/timer/DsTimer;->l:Z

    .line 809
    .line 810
    if-eqz v3, :cond_1b

    .line 811
    .line 812
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 813
    .line 814
    .line 815
    move-result v3

    .line 816
    if-nez v3, :cond_1b

    .line 817
    .line 818
    iget-wide v3, v0, Lorg/xplatform/uikit/components/timer/DsTimer;->h:J

    .line 819
    .line 820
    invoke-virtual {v2, v1, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 821
    .line 822
    .line 823
    :cond_1b
    return-void

    .line 824
    :pswitch_14
    iget-object v0, v1, La/mx2;->b:Ljava/lang/Object;

    .line 825
    .line 826
    check-cast v0, La/hil;

    .line 827
    .line 828
    iput-object v6, v0, La/hil;->l:La/mx2;

    .line 829
    .line 830
    invoke-virtual {v0}, La/hil;->drawableStateChanged()V

    .line 831
    .line 832
    .line 833
    return-void

    .line 834
    :pswitch_15
    iget-object v0, v1, La/mx2;->b:Ljava/lang/Object;

    .line 835
    .line 836
    check-cast v0, La/o6l;

    .line 837
    .line 838
    invoke-virtual {v0}, Landroid/view/View;->getLayoutDirection()I

    .line 839
    .line 840
    .line 841
    move-result v1

    .line 842
    if-ne v1, v8, :cond_1c

    .line 843
    .line 844
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    .line 845
    .line 846
    .line 847
    move-result v1

    .line 848
    goto :goto_e

    .line 849
    :cond_1c
    move v1, v9

    .line 850
    :goto_e
    invoke-virtual {v0, v1, v9}, Landroid/view/View;->scrollTo(II)V

    .line 851
    .line 852
    .line 853
    return-void

    .line 854
    :pswitch_16
    iget-object v0, v1, La/mx2;->b:Ljava/lang/Object;

    .line 855
    .line 856
    check-cast v0, La/m5l;

    .line 857
    .line 858
    iget-object v1, v0, La/m5l;->a:La/dc3;

    .line 859
    .line 860
    invoke-virtual {v0}, Landroid/view/View;->getLayoutDirection()I

    .line 861
    .line 862
    .line 863
    move-result v0

    .line 864
    if-ne v0, v8, :cond_1d

    .line 865
    .line 866
    iget-object v0, v1, La/dc3;->e:Ljava/lang/Object;

    .line 867
    .line 868
    check-cast v0, Landroid/widget/HorizontalScrollView;

    .line 869
    .line 870
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    .line 871
    .line 872
    .line 873
    move-result v0

    .line 874
    goto :goto_f

    .line 875
    :cond_1d
    move v0, v9

    .line 876
    :goto_f
    iget-object v1, v1, La/dc3;->e:Ljava/lang/Object;

    .line 877
    .line 878
    check-cast v1, Landroid/widget/HorizontalScrollView;

    .line 879
    .line 880
    invoke-virtual {v1, v0, v9}, Landroid/widget/HorizontalScrollView;->scrollTo(II)V

    .line 881
    .line 882
    .line 883
    return-void

    .line 884
    :pswitch_17
    iget-object v0, v1, La/mx2;->b:Ljava/lang/Object;

    .line 885
    .line 886
    check-cast v0, La/sik;

    .line 887
    .line 888
    iget-object v1, v0, La/sik;->K1:La/qik;

    .line 889
    .line 890
    iget-object v0, v0, La/sik;->S1:Landroid/app/Dialog;

    .line 891
    .line 892
    invoke-virtual {v1, v0}, La/qik;->onDismiss(Landroid/content/DialogInterface;)V

    .line 893
    .line 894
    .line 895
    return-void

    .line 896
    :pswitch_18
    iget-object v0, v1, La/mx2;->b:Ljava/lang/Object;

    .line 897
    .line 898
    move-object v3, v0

    .line 899
    check-cast v3, La/esd;

    .line 900
    .line 901
    monitor-enter v3

    .line 902
    :try_start_6
    invoke-virtual {v3}, La/esd;->a()Z

    .line 903
    .line 904
    .line 905
    move-result v0

    .line 906
    if-eqz v0, :cond_1e

    .line 907
    .line 908
    monitor-enter v3
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 909
    :try_start_7
    iput-boolean v8, v3, La/esd;->b:Z
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 910
    .line 911
    :try_start_8
    monitor-exit v3
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 912
    goto :goto_10

    .line 913
    :catchall_3
    move-exception v0

    .line 914
    :try_start_9
    monitor-exit v3
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    .line 915
    :try_start_a
    throw v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    .line 916
    :cond_1e
    :goto_10
    monitor-exit v3

    .line 917
    if-nez v0, :cond_1f

    .line 918
    .line 919
    goto :goto_11

    .line 920
    :cond_1f
    iget-object v0, v3, La/esd;->p:La/msd;

    .line 921
    .line 922
    invoke-virtual {v0}, La/msd;->c()La/lsd;

    .line 923
    .line 924
    .line 925
    move-result-object v0

    .line 926
    new-instance v1, Ljava/util/Date;

    .line 927
    .line 928
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 929
    .line 930
    .line 931
    move-result-wide v4

    .line 932
    invoke-direct {v1, v4, v5}, Ljava/util/Date;-><init>(J)V

    .line 933
    .line 934
    .line 935
    iget-object v0, v0, La/lsd;->b:Ljava/util/Date;

    .line 936
    .line 937
    invoke-virtual {v1, v0}, Ljava/util/Date;->before(Ljava/util/Date;)Z

    .line 938
    .line 939
    .line 940
    move-result v0

    .line 941
    if-eqz v0, :cond_20

    .line 942
    .line 943
    invoke-virtual {v3}, La/esd;->h()V

    .line 944
    .line 945
    .line 946
    goto :goto_11

    .line 947
    :cond_20
    iget-object v0, v3, La/esd;->k:La/dgq;

    .line 948
    .line 949
    check-cast v0, La/cgq;

    .line 950
    .line 951
    invoke-virtual {v0}, La/cgq;->d()Lcom/google/android/gms/tasks/Task;

    .line 952
    .line 953
    .line 954
    move-result-object v1

    .line 955
    invoke-virtual {v0}, La/cgq;->c()Lcom/google/android/gms/tasks/Task;

    .line 956
    .line 957
    .line 958
    move-result-object v0

    .line 959
    filled-new-array {v1, v0}, [Lcom/google/android/gms/tasks/Task;

    .line 960
    .line 961
    .line 962
    move-result-object v4

    .line 963
    invoke-static {v4}, Lcom/google/android/gms/tasks/Tasks;->whenAllComplete([Lcom/google/android/gms/tasks/Task;)Lcom/google/android/gms/tasks/Task;

    .line 964
    .line 965
    .line 966
    move-result-object v4

    .line 967
    iget-object v5, v3, La/esd;->h:Ljava/util/concurrent/ScheduledExecutorService;

    .line 968
    .line 969
    new-instance v6, La/hi;

    .line 970
    .line 971
    invoke-direct {v6, v3, v1, v0, v7}, La/hi;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 972
    .line 973
    .line 974
    invoke-virtual {v4, v5, v6}, Lcom/google/android/gms/tasks/Task;->continueWithTask(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/Continuation;)Lcom/google/android/gms/tasks/Task;

    .line 975
    .line 976
    .line 977
    move-result-object v0

    .line 978
    filled-new-array {v0}, [Lcom/google/android/gms/tasks/Task;

    .line 979
    .line 980
    .line 981
    move-result-object v1

    .line 982
    invoke-static {v1}, Lcom/google/android/gms/tasks/Tasks;->whenAllComplete([Lcom/google/android/gms/tasks/Task;)Lcom/google/android/gms/tasks/Task;

    .line 983
    .line 984
    .line 985
    move-result-object v1

    .line 986
    iget-object v4, v3, La/esd;->h:Ljava/util/concurrent/ScheduledExecutorService;

    .line 987
    .line 988
    new-instance v5, La/uq;

    .line 989
    .line 990
    invoke-direct {v5, v3, v0, v2}, La/uq;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 991
    .line 992
    .line 993
    invoke-virtual {v1, v4, v5}, Lcom/google/android/gms/tasks/Task;->continueWith(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/Continuation;)Lcom/google/android/gms/tasks/Task;

    .line 994
    .line 995
    .line 996
    :goto_11
    return-void

    .line 997
    :catchall_4
    move-exception v0

    .line 998
    :try_start_b
    monitor-exit v3
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    .line 999
    throw v0

    .line 1000
    :pswitch_19
    iget-object v0, v1, La/mx2;->b:Ljava/lang/Object;

    .line 1001
    .line 1002
    check-cast v0, La/qo8;

    .line 1003
    .line 1004
    iput-boolean v9, v0, La/qo8;->c:Z

    .line 1005
    .line 1006
    iget-object v1, v0, La/qo8;->e:Ljava/lang/Object;

    .line 1007
    .line 1008
    check-cast v1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 1009
    .line 1010
    iget-object v2, v1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->Q:La/ygu0;

    .line 1011
    .line 1012
    if-eqz v2, :cond_21

    .line 1013
    .line 1014
    invoke-virtual {v2}, La/ygu0;->f()Z

    .line 1015
    .line 1016
    .line 1017
    move-result v2

    .line 1018
    if-eqz v2, :cond_21

    .line 1019
    .line 1020
    iget v1, v0, La/qo8;->b:I

    .line 1021
    .line 1022
    invoke-virtual {v0, v1}, La/qo8;->d(I)V

    .line 1023
    .line 1024
    .line 1025
    goto :goto_12

    .line 1026
    :cond_21
    iget v2, v1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->P:I

    .line 1027
    .line 1028
    if-ne v2, v7, :cond_22

    .line 1029
    .line 1030
    iget v0, v0, La/qo8;->b:I

    .line 1031
    .line 1032
    invoke-virtual {v1, v0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->O(I)V

    .line 1033
    .line 1034
    .line 1035
    :cond_22
    :goto_12
    return-void

    .line 1036
    :pswitch_1a
    iget-object v0, v1, La/mx2;->b:Ljava/lang/Object;

    .line 1037
    .line 1038
    check-cast v0, La/rf00;

    .line 1039
    .line 1040
    iget-object v2, v0, La/rf00;->c:La/hil;

    .line 1041
    .line 1042
    iget-object v5, v0, La/rf00;->a:La/g05;

    .line 1043
    .line 1044
    iget-boolean v6, v0, La/rf00;->n:Z

    .line 1045
    .line 1046
    if-nez v6, :cond_23

    .line 1047
    .line 1048
    goto/16 :goto_14

    .line 1049
    .line 1050
    :cond_23
    iget-boolean v6, v0, La/rf00;->l:Z

    .line 1051
    .line 1052
    if-eqz v6, :cond_24

    .line 1053
    .line 1054
    iput-boolean v9, v0, La/rf00;->l:Z

    .line 1055
    .line 1056
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    .line 1057
    .line 1058
    .line 1059
    move-result-wide v6

    .line 1060
    iput-wide v6, v5, La/g05;->e:J

    .line 1061
    .line 1062
    const-wide/16 v10, -0x1

    .line 1063
    .line 1064
    iput-wide v10, v5, La/g05;->g:J

    .line 1065
    .line 1066
    iput-wide v6, v5, La/g05;->f:J

    .line 1067
    .line 1068
    const/high16 v6, 0x3f000000    # 0.5f

    .line 1069
    .line 1070
    iput v6, v5, La/g05;->h:F

    .line 1071
    .line 1072
    :cond_24
    iget-wide v6, v5, La/g05;->g:J

    .line 1073
    .line 1074
    cmp-long v6, v6, v3

    .line 1075
    .line 1076
    if-lez v6, :cond_25

    .line 1077
    .line 1078
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    .line 1079
    .line 1080
    .line 1081
    move-result-wide v6

    .line 1082
    iget-wide v10, v5, La/g05;->g:J

    .line 1083
    .line 1084
    iget v8, v5, La/g05;->i:I

    .line 1085
    .line 1086
    int-to-long v12, v8

    .line 1087
    add-long/2addr v10, v12

    .line 1088
    cmp-long v6, v6, v10

    .line 1089
    .line 1090
    if-lez v6, :cond_25

    .line 1091
    .line 1092
    goto :goto_13

    .line 1093
    :cond_25
    invoke-virtual {v0}, La/rf00;->e()Z

    .line 1094
    .line 1095
    .line 1096
    move-result v6

    .line 1097
    if-nez v6, :cond_26

    .line 1098
    .line 1099
    :goto_13
    iput-boolean v9, v0, La/rf00;->n:Z

    .line 1100
    .line 1101
    goto :goto_14

    .line 1102
    :cond_26
    iget-boolean v6, v0, La/rf00;->m:Z

    .line 1103
    .line 1104
    if-eqz v6, :cond_27

    .line 1105
    .line 1106
    iput-boolean v9, v0, La/rf00;->m:Z

    .line 1107
    .line 1108
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 1109
    .line 1110
    .line 1111
    move-result-wide v10

    .line 1112
    const/16 v16, 0x0

    .line 1113
    .line 1114
    const/16 v17, 0x0

    .line 1115
    .line 1116
    const/4 v14, 0x3

    .line 1117
    const/4 v15, 0x0

    .line 1118
    move-wide v12, v10

    .line 1119
    invoke-static/range {v10 .. v17}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    .line 1120
    .line 1121
    .line 1122
    move-result-object v6

    .line 1123
    invoke-virtual {v2, v6}, La/hil;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 1124
    .line 1125
    .line 1126
    invoke-virtual {v6}, Landroid/view/MotionEvent;->recycle()V

    .line 1127
    .line 1128
    .line 1129
    :cond_27
    iget-wide v6, v5, La/g05;->f:J

    .line 1130
    .line 1131
    cmp-long v3, v6, v3

    .line 1132
    .line 1133
    if-eqz v3, :cond_28

    .line 1134
    .line 1135
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    .line 1136
    .line 1137
    .line 1138
    move-result-wide v3

    .line 1139
    invoke-virtual {v5, v3, v4}, La/g05;->a(J)F

    .line 1140
    .line 1141
    .line 1142
    move-result v6

    .line 1143
    const/high16 v7, -0x3f800000    # -4.0f

    .line 1144
    .line 1145
    mul-float/2addr v7, v6

    .line 1146
    mul-float/2addr v7, v6

    .line 1147
    const/high16 v8, 0x40800000    # 4.0f

    .line 1148
    .line 1149
    mul-float/2addr v6, v8

    .line 1150
    add-float/2addr v6, v7

    .line 1151
    iget-wide v7, v5, La/g05;->f:J

    .line 1152
    .line 1153
    sub-long v7, v3, v7

    .line 1154
    .line 1155
    iput-wide v3, v5, La/g05;->f:J

    .line 1156
    .line 1157
    long-to-float v3, v7

    .line 1158
    mul-float/2addr v3, v6

    .line 1159
    iget v4, v5, La/g05;->d:F

    .line 1160
    .line 1161
    mul-float/2addr v3, v4

    .line 1162
    float-to-int v3, v3

    .line 1163
    iget-object v0, v0, La/rf00;->p:La/hil;

    .line 1164
    .line 1165
    invoke-virtual {v0, v3}, Landroid/widget/AbsListView;->scrollListBy(I)V

    .line 1166
    .line 1167
    .line 1168
    sget-object v0, La/rgu0;->a:Ljava/util/WeakHashMap;

    .line 1169
    .line 1170
    invoke-virtual {v2, v1}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    .line 1171
    .line 1172
    .line 1173
    goto :goto_14

    .line 1174
    :cond_28
    const-string v0, "Cannot compute scroll delta before calling start()"

    .line 1175
    .line 1176
    invoke-static {v0}, La/itt0;->k(Ljava/lang/String;)V

    .line 1177
    .line 1178
    .line 1179
    :goto_14
    return-void

    .line 1180
    :pswitch_1b
    iget-object v0, v1, La/mx2;->b:Ljava/lang/Object;

    .line 1181
    .line 1182
    check-cast v0, Lcom/google/firebase/perf/metrics/AppStartTrace;

    .line 1183
    .line 1184
    iget-object v1, v0, Lcom/google/firebase/perf/metrics/AppStartTrace;->i:Lcom/google/firebase/perf/util/Timer;

    .line 1185
    .line 1186
    if-nez v1, :cond_29

    .line 1187
    .line 1188
    new-instance v1, Lcom/google/firebase/perf/util/Timer;

    .line 1189
    .line 1190
    invoke-direct {v1}, Lcom/google/firebase/perf/util/Timer;-><init>()V

    .line 1191
    .line 1192
    .line 1193
    iput-object v1, v0, Lcom/google/firebase/perf/metrics/AppStartTrace;->j:Lcom/google/firebase/perf/util/Timer;

    .line 1194
    .line 1195
    :cond_29
    return-void

    .line 1196
    :pswitch_1c
    iget-object v0, v1, La/mx2;->b:Ljava/lang/Object;

    .line 1197
    .line 1198
    move-object v9, v0

    .line 1199
    check-cast v9, Landroidx/compose/ui/platform/AndroidComposeView;

    .line 1200
    .line 1201
    invoke-virtual {v9, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 1202
    .line 1203
    .line 1204
    iget-object v10, v9, Landroidx/compose/ui/platform/AndroidComposeView;->N1:Landroid/view/MotionEvent;

    .line 1205
    .line 1206
    if-eqz v10, :cond_2c

    .line 1207
    .line 1208
    invoke-virtual {v10}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 1209
    .line 1210
    .line 1211
    move-result v0

    .line 1212
    const/16 v1, 0xa

    .line 1213
    .line 1214
    if-eq v0, v1, :cond_2c

    .line 1215
    .line 1216
    if-eq v0, v8, :cond_2c

    .line 1217
    .line 1218
    const/4 v1, 0x7

    .line 1219
    if-eq v0, v1, :cond_2b

    .line 1220
    .line 1221
    const/16 v3, 0x9

    .line 1222
    .line 1223
    if-eq v0, v2, :cond_2a

    .line 1224
    .line 1225
    if-eq v0, v3, :cond_2b

    .line 1226
    .line 1227
    move v11, v7

    .line 1228
    goto :goto_15

    .line 1229
    :cond_2a
    move v11, v3

    .line 1230
    goto :goto_15

    .line 1231
    :cond_2b
    move v11, v1

    .line 1232
    :goto_15
    iget-wide v12, v9, Landroidx/compose/ui/platform/AndroidComposeView;->O1:J

    .line 1233
    .line 1234
    const/4 v14, 0x0

    .line 1235
    invoke-virtual/range {v9 .. v14}, Landroidx/compose/ui/platform/AndroidComposeView;->J(Landroid/view/MotionEvent;IJZ)V

    .line 1236
    .line 1237
    .line 1238
    :cond_2c
    return-void

    .line 1239
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

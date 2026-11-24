.class public final synthetic La/ccf;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/dmo;I)V
    .locals 0

    .line 1
    const/16 p2, 0x14

    iput-byte p2, p0, La/ccf;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/ccf;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(La/dmo;La/y8a0;)V
    .locals 0

    .line 2
    const/16 p1, 0x15

    iput-byte p1, p0, La/ccf;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, La/ccf;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 3
    iput-byte p2, p0, La/ccf;->a:B

    iput-object p1, p0, La/ccf;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a()V
    .locals 5

    .line 1
    iget-object p0, p0, La/ccf;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/yrq;

    .line 4
    .line 5
    const-string v0, "fetchFonts result is not OK. ("

    .line 6
    .line 7
    iget-object v1, p0, La/yrq;->c:Ljava/lang/Object;

    .line 8
    .line 9
    monitor-enter v1

    .line 10
    :try_start_0
    iget-object v2, p0, La/yrq;->g:La/rcb;

    .line 11
    .line 12
    if-nez v2, :cond_0

    .line 13
    .line 14
    monitor-exit v1

    .line 15
    return-void

    .line 16
    :catchall_0
    move-exception p0

    .line 17
    goto/16 :goto_7

    .line 18
    .line 19
    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    :try_start_1
    invoke-virtual {p0}, La/yrq;->c()La/ssq;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    iget v2, v1, La/ssq;->f:I

    .line 25
    .line 26
    const/4 v3, 0x2

    .line 27
    if-ne v2, v3, :cond_1

    .line 28
    .line 29
    iget-object v3, p0, La/yrq;->c:Ljava/lang/Object;

    .line 30
    .line 31
    monitor-enter v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 32
    :try_start_2
    monitor-exit v3

    .line 33
    goto :goto_0

    .line 34
    :catchall_1
    move-exception v0

    .line 35
    monitor-exit v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 36
    :try_start_3
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 37
    :catchall_2
    move-exception v0

    .line 38
    goto/16 :goto_4

    .line 39
    .line 40
    :cond_1
    :goto_0
    if-nez v2, :cond_4

    .line 41
    .line 42
    :try_start_4
    const-string v0, "EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface"

    .line 43
    .line 44
    sget-object v2, La/ebs0;->b:Ljava/lang/reflect/Method;

    .line 45
    .line 46
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    iget-object v0, p0, La/yrq;->a:Landroid/content/Context;

    .line 50
    .line 51
    filled-new-array {v1}, [La/ssq;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    sget-object v3, La/m0t0;->a:La/atm0;

    .line 56
    .line 57
    const-string v3, "TypefaceCompat.createFromFontInfo"

    .line 58
    .line 59
    invoke-static {v3}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_5

    .line 60
    .line 61
    .line 62
    :try_start_5
    sget-object v3, La/m0t0;->a:La/atm0;

    .line 63
    .line 64
    const/4 v4, 0x0

    .line 65
    invoke-virtual {v3, v0, v2, v4}, La/atm0;->h(Landroid/content/Context;[La/ssq;I)Landroid/graphics/Typeface;

    .line 66
    .line 67
    .line 68
    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_6

    .line 69
    :try_start_6
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 70
    .line 71
    .line 72
    iget-object v2, p0, La/yrq;->a:Landroid/content/Context;

    .line 73
    .line 74
    iget-object v1, v1, La/ssq;->a:Landroid/net/Uri;

    .line 75
    .line 76
    invoke-static {v2, v1}, La/btm0;->s(Landroid/content/Context;Landroid/net/Uri;)Ljava/nio/MappedByteBuffer;

    .line 77
    .line 78
    .line 79
    move-result-object v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 80
    if-eqz v1, :cond_3

    .line 81
    .line 82
    if-eqz v0, :cond_3

    .line 83
    .line 84
    :try_start_7
    const-string v2, "EmojiCompat.MetadataRepo.create"

    .line 85
    .line 86
    invoke-static {v2}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    new-instance v2, La/dgu;

    .line 90
    .line 91
    invoke-static {v1}, La/k7x;->U(Ljava/nio/MappedByteBuffer;)La/od40;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    invoke-direct {v2, v0, v1}, La/dgu;-><init>(Landroid/graphics/Typeface;La/od40;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 96
    .line 97
    .line 98
    :try_start_8
    invoke-static {}, Landroid/os/Trace;->endSection()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    .line 99
    .line 100
    .line 101
    :try_start_9
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 102
    .line 103
    .line 104
    iget-object v0, p0, La/yrq;->c:Ljava/lang/Object;

    .line 105
    .line 106
    monitor-enter v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 107
    :try_start_a
    iget-object v1, p0, La/yrq;->g:La/rcb;

    .line 108
    .line 109
    if-eqz v1, :cond_2

    .line 110
    .line 111
    invoke-virtual {v1, v2}, La/rcb;->b1(La/dgu;)V

    .line 112
    .line 113
    .line 114
    goto :goto_1

    .line 115
    :catchall_3
    move-exception v1

    .line 116
    goto :goto_2

    .line 117
    :cond_2
    :goto_1
    monitor-exit v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    .line 118
    :try_start_b
    invoke-virtual {p0}, La/yrq;->b()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    .line 119
    .line 120
    .line 121
    return-void

    .line 122
    :goto_2
    :try_start_c
    monitor-exit v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_3

    .line 123
    :try_start_d
    throw v1
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_2

    .line 124
    :catchall_4
    move-exception v0

    .line 125
    :try_start_e
    sget-object v1, La/ebs0;->b:Ljava/lang/reflect/Method;

    .line 126
    .line 127
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 128
    .line 129
    .line 130
    throw v0

    .line 131
    :cond_3
    new-instance v0, Ljava/lang/RuntimeException;

    .line 132
    .line 133
    const-string v1, "Unable to open file."

    .line 134
    .line 135
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    throw v0

    .line 139
    :catchall_5
    move-exception v0

    .line 140
    goto :goto_3

    .line 141
    :catchall_6
    move-exception v0

    .line 142
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 143
    .line 144
    .line 145
    throw v0
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_5

    .line 146
    :goto_3
    :try_start_f
    sget-object v1, La/ebs0;->b:Ljava/lang/reflect/Method;

    .line 147
    .line 148
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 149
    .line 150
    .line 151
    throw v0

    .line 152
    :cond_4
    new-instance v1, Ljava/lang/RuntimeException;

    .line 153
    .line 154
    new-instance v3, Ljava/lang/StringBuilder;

    .line 155
    .line 156
    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    const-string v0, ")"

    .line 163
    .line 164
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    throw v1
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_2

    .line 175
    :goto_4
    iget-object v2, p0, La/yrq;->c:Ljava/lang/Object;

    .line 176
    .line 177
    monitor-enter v2

    .line 178
    :try_start_10
    iget-object v1, p0, La/yrq;->g:La/rcb;

    .line 179
    .line 180
    if-eqz v1, :cond_5

    .line 181
    .line 182
    invoke-virtual {v1, v0}, La/rcb;->a1(Ljava/lang/Throwable;)V

    .line 183
    .line 184
    .line 185
    goto :goto_5

    .line 186
    :catchall_7
    move-exception p0

    .line 187
    goto :goto_6

    .line 188
    :cond_5
    :goto_5
    monitor-exit v2
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_7

    .line 189
    invoke-virtual {p0}, La/yrq;->b()V

    .line 190
    .line 191
    .line 192
    return-void

    .line 193
    :goto_6
    :try_start_11
    monitor-exit v2
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_7

    .line 194
    throw p0

    .line 195
    :goto_7
    :try_start_12
    monitor-exit v1
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_0

    .line 196
    throw p0
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 1
    iget-byte v0, p0, La/ccf;->a:B

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, 0x0

    .line 6
    const/4 v4, 0x0

    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, La/ccf;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, La/s0r;

    .line 13
    .line 14
    iput-object v4, p0, La/s0r;->d:La/yfu0;

    .line 15
    .line 16
    return-void

    .line 17
    :pswitch_0
    iget-object p0, p0, La/ccf;->b:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p0, Landroidx/fragment/app/e;

    .line 20
    .line 21
    iget-object p0, p0, Landroidx/fragment/app/e;->o:Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_0

    .line 32
    .line 33
    return-void

    .line 34
    :cond_0
    invoke-static {p0}, La/rw2;->h(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    throw p0

    .line 39
    :pswitch_1
    iget-object p0, p0, La/ccf;->b:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p0, La/s0r;

    .line 42
    .line 43
    iput-object v4, p0, La/s0r;->d:La/yfu0;

    .line 44
    .line 45
    return-void

    .line 46
    :pswitch_2
    iget-object p0, p0, La/ccf;->b:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast p0, La/jvq;

    .line 49
    .line 50
    const-string v0, "a.jvq"

    .line 51
    .line 52
    iget-boolean v1, p0, La/jvq;->d:Z

    .line 53
    .line 54
    if-eqz v1, :cond_1

    .line 55
    .line 56
    iget-boolean v1, p0, La/jvq;->e:Z

    .line 57
    .line 58
    if-eqz v1, :cond_1

    .line 59
    .line 60
    iput-boolean v3, p0, La/jvq;->d:Z

    .line 61
    .line 62
    const-string v1, "went background"

    .line 63
    .line 64
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 65
    .line 66
    .line 67
    iget-object p0, p0, La/jvq;->g:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 68
    .line 69
    invoke-virtual {p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    if-eqz v1, :cond_2

    .line 78
    .line 79
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    check-cast v1, La/js3;

    .line 84
    .line 85
    :try_start_0
    invoke-virtual {v1}, La/js3;->a()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 86
    .line 87
    .line 88
    goto :goto_0

    .line 89
    :catch_0
    move-exception v1

    .line 90
    const-string v2, "Listener threw exception!"

    .line 91
    .line 92
    invoke-static {v0, v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 93
    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_1
    const-string p0, "still foreground"

    .line 97
    .line 98
    invoke-static {v0, p0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 99
    .line 100
    .line 101
    :cond_2
    return-void

    .line 102
    :pswitch_3
    invoke-direct {p0}, La/ccf;->a()V

    .line 103
    .line 104
    .line 105
    return-void

    .line 106
    :pswitch_4
    iget-object p0, p0, La/ccf;->b:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast p0, La/a2k;

    .line 109
    .line 110
    iget-object v0, p0, La/a2k;->e:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 111
    .line 112
    iget-object p0, p0, La/a2k;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 113
    .line 114
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 115
    .line 116
    .line 117
    move-result p0

    .line 118
    div-int/lit8 p0, p0, 0x2

    .line 119
    .line 120
    invoke-virtual {v0, p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->setMinWidth(I)V

    .line 121
    .line 122
    .line 123
    return-void

    .line 124
    :pswitch_5
    iget-object p0, p0, La/ccf;->b:Ljava/lang/Object;

    .line 125
    .line 126
    check-cast p0, La/z1k;

    .line 127
    .line 128
    iget-object v0, p0, La/z1k;->e:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 129
    .line 130
    iget-object p0, p0, La/z1k;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 131
    .line 132
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 133
    .line 134
    .line 135
    move-result p0

    .line 136
    div-int/lit8 p0, p0, 0x2

    .line 137
    .line 138
    invoke-virtual {v0, p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->setMinWidth(I)V

    .line 139
    .line 140
    .line 141
    return-void

    .line 142
    :pswitch_6
    iget-object p0, p0, La/ccf;->b:Ljava/lang/Object;

    .line 143
    .line 144
    check-cast p0, La/sbe;

    .line 145
    .line 146
    new-instance v0, La/jjv0;

    .line 147
    .line 148
    sget-object v1, La/iun;->a:La/iun;

    .line 149
    .line 150
    invoke-direct {v0, v1}, La/jjv0;-><init>(Ljava/util/List;)V

    .line 151
    .line 152
    .line 153
    invoke-interface {p0, v0}, La/sbe;->accept(Ljava/lang/Object;)V

    .line 154
    .line 155
    .line 156
    return-void

    .line 157
    :pswitch_7
    iget-object p0, p0, La/ccf;->b:Ljava/lang/Object;

    .line 158
    .line 159
    check-cast p0, La/y8a0;

    .line 160
    .line 161
    :try_start_1
    monitor-enter p0

    .line 162
    monitor-exit p0
    :try_end_1
    .catch La/dlo; {:try_start_1 .. :try_end_1} :catch_1

    .line 163
    :try_start_2
    iget-object v0, p0, La/y8a0;->a:La/x8a0;

    .line 164
    .line 165
    iget-short v1, p0, La/y8a0;->c:S

    .line 166
    .line 167
    iget-object v3, p0, La/y8a0;->d:Ljava/lang/Object;

    .line 168
    .line 169
    invoke-interface {v0, v1, v3}, La/x8a0;->c(ILjava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 170
    .line 171
    .line 172
    :try_start_3
    invoke-virtual {p0, v2}, La/y8a0;->a(Z)V

    .line 173
    .line 174
    .line 175
    goto :goto_1

    .line 176
    :catchall_0
    move-exception v0

    .line 177
    invoke-virtual {p0, v2}, La/y8a0;->a(Z)V

    .line 178
    .line 179
    .line 180
    throw v0
    :try_end_3
    .catch La/dlo; {:try_start_3 .. :try_end_3} :catch_1

    .line 181
    :catch_1
    move-exception p0

    .line 182
    const-string v0, "ExoPlayerImplInternal"

    .line 183
    .line 184
    const-string v1, "Unexpected error delivering message on external thread."

    .line 185
    .line 186
    invoke-static {v0, v1, p0}, La/f1t0;->R(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 187
    .line 188
    .line 189
    invoke-static {p0}, La/ohq;->p(Ljava/lang/Throwable;)V

    .line 190
    .line 191
    .line 192
    :goto_1
    return-void

    .line 193
    :pswitch_8
    iget-object p0, p0, La/ccf;->b:Ljava/lang/Object;

    .line 194
    .line 195
    check-cast p0, La/dmo;

    .line 196
    .line 197
    iget-object p0, p0, La/dmo;->w:La/fsj;

    .line 198
    .line 199
    invoke-virtual {p0}, La/fsj;->I()La/ft2;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    new-instance v1, La/t9f;

    .line 204
    .line 205
    const/16 v2, 0x11

    .line 206
    .line 207
    invoke-direct {v1, v2}, La/t9f;-><init>(B)V

    .line 208
    .line 209
    .line 210
    const/16 v2, 0x40a

    .line 211
    .line 212
    invoke-virtual {p0, v0, v2, v1}, La/fsj;->N(La/ft2;ILa/sg00;)V

    .line 213
    .line 214
    .line 215
    return-void

    .line 216
    :pswitch_9
    iget-object p0, p0, La/ccf;->b:Ljava/lang/Object;

    .line 217
    .line 218
    check-cast p0, La/ulo;

    .line 219
    .line 220
    iget-object v0, p0, La/ulo;->C:La/fp;

    .line 221
    .line 222
    iget-object v1, p0, La/ulo;->e:Landroid/content/Context;

    .line 223
    .line 224
    sget-object v4, La/vtt0;->a:Ljava/lang/String;

    .line 225
    .line 226
    invoke-static {v1}, La/b34;->g0(Landroid/content/Context;)Landroid/media/AudioManager;

    .line 227
    .line 228
    .line 229
    move-result-object v1

    .line 230
    invoke-virtual {v1}, Landroid/media/AudioManager;->generateAudioSessionId()I

    .line 231
    .line 232
    .line 233
    move-result v1

    .line 234
    const/4 v4, -0x1

    .line 235
    if-eq v1, v4, :cond_3

    .line 236
    .line 237
    goto :goto_2

    .line 238
    :cond_3
    move v1, v3

    .line 239
    :goto_2
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 240
    .line 241
    .line 242
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 243
    .line 244
    .line 245
    move-result-object v4

    .line 246
    iget-object v5, v0, La/fp;->d:Ljava/lang/Object;

    .line 247
    .line 248
    check-cast v5, La/q9o0;

    .line 249
    .line 250
    iget-object v5, v5, La/q9o0;->a:Landroid/os/Handler;

    .line 251
    .line 252
    invoke-virtual {v5}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 253
    .line 254
    .line 255
    move-result-object v5

    .line 256
    if-ne v4, v5, :cond_4

    .line 257
    .line 258
    iget-object v2, v0, La/fp;->f:Ljava/lang/Object;

    .line 259
    .line 260
    goto :goto_4

    .line 261
    :cond_4
    iget-object v5, v0, La/fp;->c:Ljava/lang/Object;

    .line 262
    .line 263
    check-cast v5, La/q9o0;

    .line 264
    .line 265
    iget-object v5, v5, La/q9o0;->a:Landroid/os/Handler;

    .line 266
    .line 267
    invoke-virtual {v5}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 268
    .line 269
    .line 270
    move-result-object v5

    .line 271
    if-ne v4, v5, :cond_5

    .line 272
    .line 273
    goto :goto_3

    .line 274
    :cond_5
    move v2, v3

    .line 275
    :goto_3
    invoke-static {v2}, La/x0x;->K(Z)V

    .line 276
    .line 277
    .line 278
    iget-object v2, v0, La/fp;->g:Ljava/lang/Object;

    .line 279
    .line 280
    :goto_4
    check-cast v2, Ljava/lang/Integer;

    .line 281
    .line 282
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 283
    .line 284
    .line 285
    move-result v2

    .line 286
    if-eq v2, v1, :cond_7

    .line 287
    .line 288
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 289
    .line 290
    .line 291
    move-result-object v2

    .line 292
    iput-object v2, v0, La/fp;->g:Ljava/lang/Object;

    .line 293
    .line 294
    new-instance v4, La/nd5;

    .line 295
    .line 296
    invoke-direct {v4, v0, v2, v3}, La/nd5;-><init>(La/fp;Ljava/lang/Object;B)V

    .line 297
    .line 298
    .line 299
    iget-object v0, v0, La/fp;->d:Ljava/lang/Object;

    .line 300
    .line 301
    check-cast v0, La/q9o0;

    .line 302
    .line 303
    iget-object v2, v0, La/q9o0;->a:Landroid/os/Handler;

    .line 304
    .line 305
    invoke-virtual {v2}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 306
    .line 307
    .line 308
    move-result-object v2

    .line 309
    invoke-virtual {v2}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 310
    .line 311
    .line 312
    move-result-object v2

    .line 313
    invoke-virtual {v2}, Ljava/lang/Thread;->isAlive()Z

    .line 314
    .line 315
    .line 316
    move-result v2

    .line 317
    if-nez v2, :cond_6

    .line 318
    .line 319
    goto :goto_5

    .line 320
    :cond_6
    invoke-virtual {v0, v4}, La/q9o0;->e(Ljava/lang/Runnable;)V

    .line 321
    .line 322
    .line 323
    :goto_5
    iget-object p0, p0, La/ulo;->l:La/dmo;

    .line 324
    .line 325
    iget-object p0, p0, La/dmo;->g:La/q9o0;

    .line 326
    .line 327
    const/16 v0, 0x28

    .line 328
    .line 329
    invoke-virtual {p0, v0, v1, v3}, La/q9o0;->b(III)La/p9o0;

    .line 330
    .line 331
    .line 332
    move-result-object v0

    .line 333
    iget-object p0, p0, La/q9o0;->a:Landroid/os/Handler;

    .line 334
    .line 335
    iget-object v1, v0, La/p9o0;->a:Landroid/os/Message;

    .line 336
    .line 337
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 338
    .line 339
    .line 340
    invoke-virtual {p0, v1}, Landroid/os/Handler;->sendMessageAtFrontOfQueue(Landroid/os/Message;)Z

    .line 341
    .line 342
    .line 343
    invoke-virtual {v0}, La/p9o0;->a()V

    .line 344
    .line 345
    .line 346
    :cond_7
    return-void

    .line 347
    :pswitch_a
    iget-object p0, p0, La/ccf;->b:Ljava/lang/Object;

    .line 348
    .line 349
    check-cast p0, La/kki;

    .line 350
    .line 351
    iget-object p0, p0, La/kki;->d:Ljava/lang/Object;

    .line 352
    .line 353
    check-cast p0, La/btd;

    .line 354
    .line 355
    if-eqz p0, :cond_8

    .line 356
    .line 357
    invoke-virtual {p0}, Ljava/util/AbstractMap;->values()Ljava/util/Collection;

    .line 358
    .line 359
    .line 360
    move-result-object p0

    .line 361
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 362
    .line 363
    .line 364
    move-result-object p0

    .line 365
    :goto_6
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 366
    .line 367
    .line 368
    move-result v0

    .line 369
    if-eqz v0, :cond_8

    .line 370
    .line 371
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 372
    .line 373
    .line 374
    move-result-object v0

    .line 375
    check-cast v0, La/cmn0;

    .line 376
    .line 377
    invoke-virtual {v0}, La/cmn0;->b()V

    .line 378
    .line 379
    .line 380
    goto :goto_6

    .line 381
    :cond_8
    return-void

    .line 382
    :pswitch_b
    iget-object p0, p0, La/ccf;->b:Ljava/lang/Object;

    .line 383
    .line 384
    check-cast p0, La/mbn;

    .line 385
    .line 386
    iput-boolean v2, p0, La/mbn;->f:Z

    .line 387
    .line 388
    invoke-virtual {p0}, La/mbn;->c()V

    .line 389
    .line 390
    .line 391
    return-void

    .line 392
    :pswitch_c
    iget-object p0, p0, La/ccf;->b:Ljava/lang/Object;

    .line 393
    .line 394
    check-cast p0, Lorg/xplatform/uikit/components/password_requirement/DsPasswordRequirement;

    .line 395
    .line 396
    sget v0, Lorg/xplatform/uikit/components/password_requirement/DsPasswordRequirement;->c:I

    .line 397
    .line 398
    new-instance v0, Landroid/graphics/Rect;

    .line 399
    .line 400
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 401
    .line 402
    .line 403
    iget-object v1, p0, Lorg/xplatform/uikit/components/password_requirement/DsPasswordRequirement;->a:La/dc3;

    .line 404
    .line 405
    iget-object v2, v1, La/dc3;->b:Landroid/view/ViewGroup;

    .line 406
    .line 407
    check-cast v2, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 408
    .line 409
    invoke-virtual {v2, v0}, Landroid/view/View;->getHitRect(Landroid/graphics/Rect;)V

    .line 410
    .line 411
    .line 412
    new-instance v2, Landroid/view/TouchDelegate;

    .line 413
    .line 414
    iget-object v1, v1, La/dc3;->c:Landroid/view/View;

    .line 415
    .line 416
    check-cast v1, Lorg/xplatform/uikit/components/accordion/DsAccordion;

    .line 417
    .line 418
    invoke-direct {v2, v0, v1}, Landroid/view/TouchDelegate;-><init>(Landroid/graphics/Rect;Landroid/view/View;)V

    .line 419
    .line 420
    .line 421
    invoke-virtual {p0, v2}, Landroid/view/View;->setTouchDelegate(Landroid/view/TouchDelegate;)V

    .line 422
    .line 423
    .line 424
    return-void

    .line 425
    :pswitch_d
    iget-object p0, p0, La/ccf;->b:Ljava/lang/Object;

    .line 426
    .line 427
    check-cast p0, Lorg/xplatform/uikit/components/page_control/DsPageControl;

    .line 428
    .line 429
    sget v0, Lorg/xplatform/uikit/components/page_control/DsPageControl;->y2:I

    .line 430
    .line 431
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->b0()V

    .line 432
    .line 433
    .line 434
    return-void

    .line 435
    :pswitch_e
    iget-object p0, p0, La/ccf;->b:Ljava/lang/Object;

    .line 436
    .line 437
    check-cast p0, La/til;

    .line 438
    .line 439
    iget-object v0, p0, La/til;->h:Landroid/widget/AutoCompleteTextView;

    .line 440
    .line 441
    invoke-virtual {v0}, Landroid/widget/AutoCompleteTextView;->isPopupShowing()Z

    .line 442
    .line 443
    .line 444
    move-result v0

    .line 445
    invoke-virtual {p0, v0}, La/til;->s(Z)V

    .line 446
    .line 447
    .line 448
    iput-boolean v0, p0, La/til;->m:Z

    .line 449
    .line 450
    return-void

    .line 451
    :pswitch_f
    iget-object p0, p0, La/ccf;->b:Ljava/lang/Object;

    .line 452
    .line 453
    check-cast p0, La/ali;

    .line 454
    .line 455
    iput-object v4, p0, La/ali;->c:Ljava/lang/Object;

    .line 456
    .line 457
    return-void

    .line 458
    :pswitch_10
    iget-object p0, p0, La/ccf;->b:Ljava/lang/Object;

    .line 459
    .line 460
    check-cast p0, La/pmi;

    .line 461
    .line 462
    iput-object v4, p0, La/pmi;->d:Ljava/lang/Object;

    .line 463
    .line 464
    return-void

    .line 465
    :pswitch_11
    iget-object p0, p0, La/ccf;->b:Ljava/lang/Object;

    .line 466
    .line 467
    check-cast p0, La/czj;

    .line 468
    .line 469
    iget-object p0, p0, La/czj;->i:La/nfu0;

    .line 470
    .line 471
    invoke-interface {p0}, La/nfu0;->d()V

    .line 472
    .line 473
    .line 474
    return-void

    .line 475
    :pswitch_12
    iget-object p0, p0, La/ccf;->b:Ljava/lang/Object;

    .line 476
    .line 477
    check-cast p0, La/syj;

    .line 478
    .line 479
    iget-object v0, p0, La/syj;->f:La/nyj;

    .line 480
    .line 481
    iget-boolean v0, v0, La/nyj;->C:Z

    .line 482
    .line 483
    if-eqz v0, :cond_9

    .line 484
    .line 485
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 486
    .line 487
    const/16 v1, 0x20

    .line 488
    .line 489
    if-lt v0, v1, :cond_9

    .line 490
    .line 491
    iget-object v0, p0, La/syj;->h:La/o24;

    .line 492
    .line 493
    if-eqz v0, :cond_9

    .line 494
    .line 495
    iget-boolean v0, v0, La/o24;->a:Z

    .line 496
    .line 497
    if-eqz v0, :cond_9

    .line 498
    .line 499
    iget-object p0, p0, La/syj;->a:La/dmo;

    .line 500
    .line 501
    if-eqz p0, :cond_9

    .line 502
    .line 503
    iget-object p0, p0, La/dmo;->g:La/q9o0;

    .line 504
    .line 505
    const/16 v0, 0xa

    .line 506
    .line 507
    invoke-virtual {p0, v0, v4}, La/q9o0;->c(ILjava/lang/Object;)La/p9o0;

    .line 508
    .line 509
    .line 510
    move-result-object p0

    .line 511
    invoke-virtual {p0}, La/p9o0;->b()V

    .line 512
    .line 513
    .line 514
    :cond_9
    return-void

    .line 515
    :pswitch_13
    iget-object p0, p0, La/ccf;->b:Ljava/lang/Object;

    .line 516
    .line 517
    check-cast p0, La/zxj;

    .line 518
    .line 519
    invoke-virtual {p0, v3}, La/zxj;->d(Z)V

    .line 520
    .line 521
    .line 522
    return-void

    .line 523
    :pswitch_14
    iget-object p0, p0, La/ccf;->b:Ljava/lang/Object;

    .line 524
    .line 525
    check-cast p0, La/txj;

    .line 526
    .line 527
    iput-boolean v2, p0, La/txj;->j:Z

    .line 528
    .line 529
    invoke-virtual {p0}, La/txj;->c()V

    .line 530
    .line 531
    .line 532
    return-void

    .line 533
    :pswitch_15
    iget-object p0, p0, La/ccf;->b:Ljava/lang/Object;

    .line 534
    .line 535
    check-cast p0, La/imn0;

    .line 536
    .line 537
    invoke-virtual {p0}, La/imn0;->close()V

    .line 538
    .line 539
    .line 540
    return-void

    .line 541
    :pswitch_16
    iget-object p0, p0, La/ccf;->b:Ljava/lang/Object;

    .line 542
    .line 543
    check-cast p0, La/tu9;

    .line 544
    .line 545
    new-instance v0, Ljava/lang/Exception;

    .line 546
    .line 547
    const-string v1, "Failed to snapshot: OpenGLRenderer not ready."

    .line 548
    .line 549
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 550
    .line 551
    .line 552
    invoke-virtual {p0, v0}, La/tu9;->d(Ljava/lang/Throwable;)Z

    .line 553
    .line 554
    .line 555
    return-void

    .line 556
    :pswitch_17
    iget-object p0, p0, La/ccf;->b:Ljava/lang/Object;

    .line 557
    .line 558
    check-cast p0, La/osj;

    .line 559
    .line 560
    iget-wide v0, p0, La/osj;->d0:J

    .line 561
    .line 562
    const-wide/32 v3, 0x493e0

    .line 563
    .line 564
    .line 565
    cmp-long v0, v0, v3

    .line 566
    .line 567
    if-ltz v0, :cond_a

    .line 568
    .line 569
    iget-object v0, p0, La/osj;->n:La/yox;

    .line 570
    .line 571
    iget-object v0, v0, La/yox;->a:Ljava/lang/Object;

    .line 572
    .line 573
    check-cast v0, La/fm30;

    .line 574
    .line 575
    iput-boolean v2, v0, La/fm30;->w2:Z

    .line 576
    .line 577
    const-wide/16 v0, 0x0

    .line 578
    .line 579
    iput-wide v0, p0, La/osj;->d0:J

    .line 580
    .line 581
    :cond_a
    return-void

    .line 582
    :pswitch_18
    iget-object p0, p0, La/ccf;->b:Ljava/lang/Object;

    .line 583
    .line 584
    check-cast p0, La/fsj;

    .line 585
    .line 586
    invoke-virtual {p0}, La/fsj;->I()La/ft2;

    .line 587
    .line 588
    .line 589
    move-result-object v0

    .line 590
    new-instance v1, La/t9f;

    .line 591
    .line 592
    const/16 v2, 0x19

    .line 593
    .line 594
    invoke-direct {v1, v2}, La/t9f;-><init>(B)V

    .line 595
    .line 596
    .line 597
    const/16 v2, 0x404

    .line 598
    .line 599
    invoke-virtual {p0, v0, v2, v1}, La/fsj;->N(La/ft2;ILa/sg00;)V

    .line 600
    .line 601
    .line 602
    iget-object p0, p0, La/fsj;->f:La/vg00;

    .line 603
    .line 604
    invoke-virtual {p0}, La/vg00;->d()V

    .line 605
    .line 606
    .line 607
    return-void

    .line 608
    :pswitch_19
    iget-object p0, p0, La/ccf;->b:Ljava/lang/Object;

    .line 609
    .line 610
    check-cast p0, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;

    .line 611
    .line 612
    sget v0, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->d:I

    .line 613
    .line 614
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 615
    .line 616
    .line 617
    return-void

    .line 618
    :pswitch_1a
    iget-object p0, p0, La/ccf;->b:Ljava/lang/Object;

    .line 619
    .line 620
    check-cast p0, La/u0i;

    .line 621
    .line 622
    sget-object v0, La/u0i;->c2:La/usd;

    .line 623
    .line 624
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->N()Z

    .line 625
    .line 626
    .line 627
    move-result v0

    .line 628
    if-eqz v0, :cond_b

    .line 629
    .line 630
    iget-object v0, p0, La/sik;->S1:Landroid/app/Dialog;

    .line 631
    .line 632
    if-eqz v0, :cond_b

    .line 633
    .line 634
    invoke-virtual {p0, v0}, La/u0i;->I0(Landroid/app/Dialog;)V

    .line 635
    .line 636
    .line 637
    :cond_b
    return-void

    .line 638
    :pswitch_1b
    iget-object p0, p0, La/ccf;->b:Ljava/lang/Object;

    .line 639
    .line 640
    check-cast p0, La/icf;

    .line 641
    .line 642
    invoke-virtual {p0}, La/icf;->d()La/ybf;

    .line 643
    .line 644
    .line 645
    move-result-object p0

    .line 646
    new-instance v0, La/d0u;

    .line 647
    .line 648
    const-string v2, "Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context."

    .line 649
    .line 650
    invoke-direct {v0, v2, v1}, La/d0u;-><init>(Ljava/lang/CharSequence;B)V

    .line 651
    .line 652
    .line 653
    check-cast p0, La/a1d;

    .line 654
    .line 655
    invoke-virtual {p0, v0}, La/a1d;->j(Ljava/lang/Object;)V

    .line 656
    .line 657
    .line 658
    return-void

    .line 659
    :pswitch_1c
    iget-object p0, p0, La/ccf;->b:Ljava/lang/Object;

    .line 660
    .line 661
    check-cast p0, La/dcf;

    .line 662
    .line 663
    invoke-virtual {p0}, La/dcf;->d()La/ybf;

    .line 664
    .line 665
    .line 666
    move-result-object p0

    .line 667
    new-instance v0, La/d0u;

    .line 668
    .line 669
    const-string v2, "Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context."

    .line 670
    .line 671
    invoke-direct {v0, v2, v1}, La/d0u;-><init>(Ljava/lang/CharSequence;B)V

    .line 672
    .line 673
    .line 674
    check-cast p0, La/a1d;

    .line 675
    .line 676
    invoke-virtual {p0, v0}, La/a1d;->j(Ljava/lang/Object;)V

    .line 677
    .line 678
    .line 679
    return-void

    .line 680
    nop

    .line 681
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

.class public final Lorg/xplatform/consultantchat/presentation/workers/UploadWorker;
.super Landroidx/work/CoroutineWorker;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lorg/xplatform/consultantchat/presentation/workers/UploadWorker;",
        "Landroidx/work/CoroutineWorker;",
        "Landroid/content/Context;",
        "context",
        "Landroidx/work/WorkerParameters;",
        "params",
        "<init>",
        "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V",
        "impl"
    }
    k = 0x1
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final g:La/opt;

.field public final h:La/is;

.field public final i:La/f4v;

.field public final j:La/f4v;

.field public final k:La/qv;

.field public final l:La/frc;

.field public final m:La/vpc;

.field public final n:La/qv;

.field public final o:La/h03;

.field public final p:La/frc;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, p1, p2}, Landroidx/work/CoroutineWorker;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, La/og00;->a:Landroid/content/Context;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    check-cast p1, Landroid/app/Application;

    .line 16
    .line 17
    instance-of p2, p1, La/af3;

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    if-eqz p2, :cond_0

    .line 21
    .line 22
    check-cast p1, La/af3;

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move-object p1, v0

    .line 26
    :goto_0
    const-class p2, La/snt0;

    .line 27
    .line 28
    if-eqz p1, :cond_3

    .line 29
    .line 30
    invoke-interface {p1}, La/af3;->d()La/wcf0;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-virtual {p1, p2}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    check-cast p1, La/o5d0;

    .line 39
    .line 40
    if-eqz p1, :cond_1

    .line 41
    .line 42
    invoke-interface {p1}, La/o5d0;->get()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    check-cast p1, La/ze3;

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    move-object p1, v0

    .line 50
    :goto_1
    instance-of v1, p1, La/snt0;

    .line 51
    .line 52
    if-nez v1, :cond_2

    .line 53
    .line 54
    move-object p1, v0

    .line 55
    :cond_2
    check-cast p1, La/snt0;

    .line 56
    .line 57
    if-eqz p1, :cond_3

    .line 58
    .line 59
    iget-object p1, p1, La/snt0;->a:La/g45;

    .line 60
    .line 61
    new-instance p2, La/opt;

    .line 62
    .line 63
    invoke-direct {p2, p1}, La/opt;-><init>(La/g45;)V

    .line 64
    .line 65
    .line 66
    iput-object p2, p0, Lorg/xplatform/consultantchat/presentation/workers/UploadWorker;->g:La/opt;

    .line 67
    .line 68
    new-instance p2, La/is;

    .line 69
    .line 70
    invoke-direct {p2, p1}, La/is;-><init>(La/g45;)V

    .line 71
    .line 72
    .line 73
    iput-object p2, p0, Lorg/xplatform/consultantchat/presentation/workers/UploadWorker;->h:La/is;

    .line 74
    .line 75
    new-instance p2, La/f4v;

    .line 76
    .line 77
    invoke-direct {p2, p1}, La/f4v;-><init>(La/g45;)V

    .line 78
    .line 79
    .line 80
    iput-object p2, p0, Lorg/xplatform/consultantchat/presentation/workers/UploadWorker;->i:La/f4v;

    .line 81
    .line 82
    new-instance p2, La/f4v;

    .line 83
    .line 84
    invoke-direct {p2, p1}, La/f4v;-><init>(La/g45;)V

    .line 85
    .line 86
    .line 87
    iput-object p2, p0, Lorg/xplatform/consultantchat/presentation/workers/UploadWorker;->j:La/f4v;

    .line 88
    .line 89
    new-instance p2, La/qv;

    .line 90
    .line 91
    invoke-direct {p2, p1}, La/qv;-><init>(La/g45;)V

    .line 92
    .line 93
    .line 94
    iput-object p2, p0, Lorg/xplatform/consultantchat/presentation/workers/UploadWorker;->k:La/qv;

    .line 95
    .line 96
    new-instance p2, La/frc;

    .line 97
    .line 98
    invoke-direct {p2, p1}, La/frc;-><init>(La/g45;)V

    .line 99
    .line 100
    .line 101
    iput-object p2, p0, Lorg/xplatform/consultantchat/presentation/workers/UploadWorker;->l:La/frc;

    .line 102
    .line 103
    new-instance p2, La/vpc;

    .line 104
    .line 105
    invoke-direct {p2, p1}, La/vpc;-><init>(La/g45;)V

    .line 106
    .line 107
    .line 108
    iput-object p2, p0, Lorg/xplatform/consultantchat/presentation/workers/UploadWorker;->m:La/vpc;

    .line 109
    .line 110
    new-instance p2, La/qv;

    .line 111
    .line 112
    invoke-direct {p2, p1}, La/qv;-><init>(La/g45;)V

    .line 113
    .line 114
    .line 115
    iput-object p2, p0, Lorg/xplatform/consultantchat/presentation/workers/UploadWorker;->n:La/qv;

    .line 116
    .line 117
    new-instance p2, La/h03;

    .line 118
    .line 119
    new-instance v0, La/is;

    .line 120
    .line 121
    invoke-direct {v0, p1}, La/is;-><init>(La/g45;)V

    .line 122
    .line 123
    .line 124
    const/16 v1, 0x15

    .line 125
    .line 126
    invoke-direct {p2, v0, v1}, La/h03;-><init>(Ljava/lang/Object;B)V

    .line 127
    .line 128
    .line 129
    iput-object p2, p0, Lorg/xplatform/consultantchat/presentation/workers/UploadWorker;->o:La/h03;

    .line 130
    .line 131
    new-instance p2, La/frc;

    .line 132
    .line 133
    invoke-direct {p2, p1}, La/frc;-><init>(La/g45;)V

    .line 134
    .line 135
    .line 136
    iput-object p2, p0, Lorg/xplatform/consultantchat/presentation/workers/UploadWorker;->p:La/frc;

    .line 137
    .line 138
    return-void

    .line 139
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 140
    .line 141
    invoke-static {p2, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object p0

    .line 145
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    throw v0
.end method


# virtual methods
.method public final c(La/yje;)Ljava/lang/Object;
    .locals 13

    .line 1
    const-string v0, "File "

    .line 2
    .line 3
    instance-of v1, p1, La/pnt0;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, p1

    .line 8
    check-cast v1, La/pnt0;

    .line 9
    .line 10
    iget v2, v1, La/pnt0;->p:I

    .line 11
    .line 12
    const/high16 v3, -0x80000000

    .line 13
    .line 14
    and-int v4, v2, v3

    .line 15
    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    sub-int/2addr v2, v3

    .line 19
    iput v2, v1, La/pnt0;->p:I

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance v1, La/pnt0;

    .line 23
    .line 24
    check-cast p1, La/zje;

    .line 25
    .line 26
    invoke-direct {v1, p0, p1}, La/pnt0;-><init>(Lorg/xplatform/consultantchat/presentation/workers/UploadWorker;La/zje;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object p1, v1, La/pnt0;->n:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v2, La/wne;->a:La/wne;

    .line 32
    .line 33
    iget v3, v1, La/pnt0;->p:I

    .line 34
    .line 35
    iget-object v4, p0, Lorg/xplatform/consultantchat/presentation/workers/UploadWorker;->l:La/frc;

    .line 36
    .line 37
    const-string v5, "updateDownloadFileStateUseCase"

    .line 38
    .line 39
    const/4 v6, 0x0

    .line 40
    packed-switch v3, :pswitch_data_0

    .line 41
    .line 42
    .line 43
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 44
    .line 45
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return-object v6

    .line 49
    :pswitch_0
    iget-object p0, v1, La/pnt0;->l:La/i050;

    .line 50
    .line 51
    :try_start_0
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    .line 53
    .line 54
    goto/16 :goto_e

    .line 55
    .line 56
    :catchall_0
    move-exception p1

    .line 57
    goto/16 :goto_10

    .line 58
    .line 59
    :pswitch_1
    iget-object p0, v1, La/pnt0;->m:Ljava/io/File;

    .line 60
    .line 61
    iget-object v0, v1, La/pnt0;->l:La/i050;

    .line 62
    .line 63
    iget-object v3, v1, La/pnt0;->k:La/rei0;

    .line 64
    .line 65
    :try_start_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 66
    .line 67
    .line 68
    goto/16 :goto_b

    .line 69
    .line 70
    :catchall_1
    move-exception p1

    .line 71
    move-object p0, v0

    .line 72
    goto/16 :goto_10

    .line 73
    .line 74
    :catch_0
    move-exception p1

    .line 75
    move-object v7, v3

    .line 76
    move-object v3, v0

    .line 77
    goto/16 :goto_c

    .line 78
    .line 79
    :pswitch_2
    iget-object v0, v1, La/pnt0;->m:Ljava/io/File;

    .line 80
    .line 81
    iget-object v3, v1, La/pnt0;->l:La/i050;

    .line 82
    .line 83
    iget-object v7, v1, La/pnt0;->k:La/rei0;

    .line 84
    .line 85
    :try_start_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 86
    .line 87
    .line 88
    move-object p1, v0

    .line 89
    goto/16 :goto_a

    .line 90
    .line 91
    :catchall_2
    move-exception p1

    .line 92
    :goto_1
    move-object p0, v3

    .line 93
    goto/16 :goto_10

    .line 94
    .line 95
    :catch_1
    move-exception p1

    .line 96
    move-object p0, v0

    .line 97
    goto/16 :goto_c

    .line 98
    .line 99
    :pswitch_3
    iget-object v0, v1, La/pnt0;->m:Ljava/io/File;

    .line 100
    .line 101
    iget-object v3, v1, La/pnt0;->l:La/i050;

    .line 102
    .line 103
    iget-object v7, v1, La/pnt0;->k:La/rei0;

    .line 104
    .line 105
    iget-object v8, v1, La/pnt0;->j:Ljava/lang/String;

    .line 106
    .line 107
    iget-object v9, v1, La/pnt0;->i:Ljava/lang/String;

    .line 108
    .line 109
    :try_start_3
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 110
    .line 111
    .line 112
    move-object p1, v0

    .line 113
    goto/16 :goto_9

    .line 114
    .line 115
    :pswitch_4
    iget-object v0, v1, La/pnt0;->m:Ljava/io/File;

    .line 116
    .line 117
    iget-object v3, v1, La/pnt0;->l:La/i050;

    .line 118
    .line 119
    iget-object v7, v1, La/pnt0;->k:La/rei0;

    .line 120
    .line 121
    iget-object v8, v1, La/pnt0;->j:Ljava/lang/String;

    .line 122
    .line 123
    iget-object v9, v1, La/pnt0;->i:Ljava/lang/String;

    .line 124
    .line 125
    :try_start_4
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 126
    .line 127
    .line 128
    move-object v12, v0

    .line 129
    move-object v0, p1

    .line 130
    move-object p1, v12

    .line 131
    goto/16 :goto_8

    .line 132
    .line 133
    :pswitch_5
    iget-object v0, v1, La/pnt0;->m:Ljava/io/File;

    .line 134
    .line 135
    iget-object v3, v1, La/pnt0;->l:La/i050;

    .line 136
    .line 137
    iget-object v7, v1, La/pnt0;->k:La/rei0;

    .line 138
    .line 139
    iget-object v8, v1, La/pnt0;->j:Ljava/lang/String;

    .line 140
    .line 141
    iget-object v9, v1, La/pnt0;->i:Ljava/lang/String;

    .line 142
    .line 143
    :try_start_5
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 144
    .line 145
    .line 146
    move-object v12, v0

    .line 147
    move-object v0, p1

    .line 148
    move-object p1, v12

    .line 149
    goto/16 :goto_7

    .line 150
    .line 151
    :pswitch_6
    iget-object v3, v1, La/pnt0;->m:Ljava/io/File;

    .line 152
    .line 153
    iget-object v7, v1, La/pnt0;->l:La/i050;

    .line 154
    .line 155
    iget-object v8, v1, La/pnt0;->k:La/rei0;

    .line 156
    .line 157
    iget-object v9, v1, La/pnt0;->j:Ljava/lang/String;

    .line 158
    .line 159
    iget-object v10, v1, La/pnt0;->i:Ljava/lang/String;

    .line 160
    .line 161
    :try_start_6
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_2
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 162
    .line 163
    .line 164
    move-object v12, v10

    .line 165
    move-object v10, p1

    .line 166
    move-object p1, v3

    .line 167
    move-object v3, v7

    .line 168
    move-object v7, v8

    .line 169
    move-object v8, v9

    .line 170
    move-object v9, v12

    .line 171
    goto/16 :goto_5

    .line 172
    .line 173
    :catchall_3
    move-exception p1

    .line 174
    move-object p0, v7

    .line 175
    goto/16 :goto_10

    .line 176
    .line 177
    :catch_2
    move-exception p1

    .line 178
    move-object p0, v3

    .line 179
    move-object v3, v7

    .line 180
    move-object v7, v8

    .line 181
    goto/16 :goto_c

    .line 182
    .line 183
    :pswitch_7
    iget-object v3, v1, La/pnt0;->l:La/i050;

    .line 184
    .line 185
    iget-object v7, v1, La/pnt0;->k:La/rei0;

    .line 186
    .line 187
    iget-object v8, v1, La/pnt0;->j:Ljava/lang/String;

    .line 188
    .line 189
    iget-object v9, v1, La/pnt0;->i:Ljava/lang/String;

    .line 190
    .line 191
    :try_start_7
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 192
    .line 193
    .line 194
    goto/16 :goto_4

    .line 195
    .line 196
    :pswitch_8
    iget-object v3, v1, La/pnt0;->l:La/i050;

    .line 197
    .line 198
    iget-object v7, v1, La/pnt0;->k:La/rei0;

    .line 199
    .line 200
    iget-object v8, v1, La/pnt0;->j:Ljava/lang/String;

    .line 201
    .line 202
    iget-object v9, v1, La/pnt0;->i:Ljava/lang/String;

    .line 203
    .line 204
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 205
    .line 206
    .line 207
    goto/16 :goto_3

    .line 208
    .line 209
    :pswitch_9
    iget-object v3, v1, La/pnt0;->j:Ljava/lang/String;

    .line 210
    .line 211
    iget-object v7, v1, La/pnt0;->i:Ljava/lang/String;

    .line 212
    .line 213
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 214
    .line 215
    .line 216
    goto :goto_2

    .line 217
    :pswitch_a
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 218
    .line 219
    .line 220
    iget-object p1, p0, La/og00;->b:Landroidx/work/WorkerParameters;

    .line 221
    .line 222
    iget-object v3, p1, Landroidx/work/WorkerParameters;->b:La/maj;

    .line 223
    .line 224
    const-string v7, "BUNDLE_LOCAL_MESSAGE_ID"

    .line 225
    .line 226
    invoke-virtual {v3, v7}, La/maj;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v7

    .line 230
    if-nez v7, :cond_1

    .line 231
    .line 232
    invoke-static {}, La/ng00;->a()La/mg00;

    .line 233
    .line 234
    .line 235
    move-result-object p0

    .line 236
    return-object p0

    .line 237
    :cond_1
    iget-object p1, p1, Landroidx/work/WorkerParameters;->b:La/maj;

    .line 238
    .line 239
    const-string v3, "BUNDLE_FILE_PATH"

    .line 240
    .line 241
    invoke-virtual {p1, v3}, La/maj;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object v3

    .line 245
    if-nez v3, :cond_2

    .line 246
    .line 247
    invoke-static {}, La/ng00;->a()La/mg00;

    .line 248
    .line 249
    .line 250
    move-result-object p0

    .line 251
    return-object p0

    .line 252
    :cond_2
    iget-object p1, p0, Lorg/xplatform/consultantchat/presentation/workers/UploadWorker;->g:La/opt;

    .line 253
    .line 254
    if-eqz p1, :cond_1b

    .line 255
    .line 256
    iput-object v7, v1, La/pnt0;->i:Ljava/lang/String;

    .line 257
    .line 258
    iput-object v3, v1, La/pnt0;->j:Ljava/lang/String;

    .line 259
    .line 260
    const/4 v8, 0x1

    .line 261
    iput v8, v1, La/pnt0;->p:I

    .line 262
    .line 263
    iget-object p1, p1, La/opt;->a:La/g45;

    .line 264
    .line 265
    iget-object v8, p1, La/g45;->c:Ljava/lang/Object;

    .line 266
    .line 267
    check-cast v8, La/i7e;

    .line 268
    .line 269
    iget-object v8, v8, La/i7e;->g:La/p7m0;

    .line 270
    .line 271
    new-instance v9, La/c00;

    .line 272
    .line 273
    const/16 v10, 0x19

    .line 274
    .line 275
    invoke-direct {v9, v8, p1, v10}, La/c00;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 276
    .line 277
    .line 278
    invoke-static {v9, v1}, La/ntb;->K(La/gmq;La/yje;)Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object p1

    .line 282
    if-ne p1, v2, :cond_3

    .line 283
    .line 284
    goto/16 :goto_d

    .line 285
    .line 286
    :cond_3
    :goto_2
    check-cast p1, Ljava/util/Map;

    .line 287
    .line 288
    invoke-interface {p1, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    move-result-object p1

    .line 292
    check-cast p1, La/rei0;

    .line 293
    .line 294
    if-nez p1, :cond_4

    .line 295
    .line 296
    invoke-static {}, La/ng00;->a()La/mg00;

    .line 297
    .line 298
    .line 299
    move-result-object p0

    .line 300
    return-object p0

    .line 301
    :cond_4
    iget-object v8, p0, Lorg/xplatform/consultantchat/presentation/workers/UploadWorker;->m:La/vpc;

    .line 302
    .line 303
    if-eqz v8, :cond_1a

    .line 304
    .line 305
    iget-object v8, v8, La/vpc;->a:La/g45;

    .line 306
    .line 307
    iget-object v8, v8, La/g45;->b:Ljava/lang/Object;

    .line 308
    .line 309
    check-cast v8, La/vae;

    .line 310
    .line 311
    iget-object v8, v8, La/vae;->c:La/k050;

    .line 312
    .line 313
    iput-object v7, v1, La/pnt0;->i:Ljava/lang/String;

    .line 314
    .line 315
    iput-object v3, v1, La/pnt0;->j:Ljava/lang/String;

    .line 316
    .line 317
    iput-object p1, v1, La/pnt0;->k:La/rei0;

    .line 318
    .line 319
    iput-object v8, v1, La/pnt0;->l:La/i050;

    .line 320
    .line 321
    const/4 v9, 0x2

    .line 322
    iput v9, v1, La/pnt0;->p:I

    .line 323
    .line 324
    invoke-virtual {v8, v1}, La/k050;->d(La/yje;)Ljava/lang/Object;

    .line 325
    .line 326
    .line 327
    move-result-object v9

    .line 328
    if-ne v9, v2, :cond_5

    .line 329
    .line 330
    goto/16 :goto_d

    .line 331
    .line 332
    :cond_5
    move-object v9, v8

    .line 333
    move-object v8, v3

    .line 334
    move-object v3, v9

    .line 335
    move-object v9, v7

    .line 336
    move-object v7, p1

    .line 337
    :goto_3
    :try_start_8
    iget-object p1, p0, Lorg/xplatform/consultantchat/presentation/workers/UploadWorker;->n:La/qv;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_10

    .line 338
    .line 339
    if-eqz p1, :cond_19

    .line 340
    .line 341
    :try_start_9
    iget-object p1, p1, La/qv;->a:La/g45;

    .line 342
    .line 343
    iget-object p1, p1, La/g45;->b:Ljava/lang/Object;

    .line 344
    .line 345
    check-cast p1, La/vae;

    .line 346
    .line 347
    iget-object p1, p1, La/vae;->r:La/p7m0;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_f

    .line 348
    .line 349
    :try_start_a
    new-instance v10, La/qaf0;

    .line 350
    .line 351
    const/16 v11, 0x11

    .line 352
    .line 353
    invoke-direct {v10, p1, v11}, La/qaf0;-><init>(La/gmq;B)V

    .line 354
    .line 355
    .line 356
    iput-object v9, v1, La/pnt0;->i:Ljava/lang/String;

    .line 357
    .line 358
    iput-object v8, v1, La/pnt0;->j:Ljava/lang/String;

    .line 359
    .line 360
    iput-object v7, v1, La/pnt0;->k:La/rei0;

    .line 361
    .line 362
    iput-object v3, v1, La/pnt0;->l:La/i050;

    .line 363
    .line 364
    const/4 p1, 0x3

    .line 365
    iput p1, v1, La/pnt0;->p:I

    .line 366
    .line 367
    invoke-static {v10, v1}, La/ntb;->K(La/gmq;La/yje;)Ljava/lang/Object;

    .line 368
    .line 369
    .line 370
    move-result-object p1

    .line 371
    if-ne p1, v2, :cond_6

    .line 372
    .line 373
    goto/16 :goto_d

    .line 374
    .line 375
    :cond_6
    :goto_4
    instance-of p1, v7, La/pei0;

    .line 376
    .line 377
    if-eqz p1, :cond_18

    .line 378
    .line 379
    new-instance p1, Ljava/io/File;

    .line 380
    .line 381
    invoke-direct {p1, v8}, Ljava/io/File;-><init>(Ljava/lang/String;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    .line 382
    .line 383
    .line 384
    :try_start_b
    iget-object v10, p0, Lorg/xplatform/consultantchat/presentation/workers/UploadWorker;->o:La/h03;
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_3
    .catchall {:try_start_b .. :try_end_b} :catchall_d

    .line 385
    .line 386
    if-eqz v10, :cond_15

    .line 387
    .line 388
    :try_start_c
    iput-object v9, v1, La/pnt0;->i:Ljava/lang/String;

    .line 389
    .line 390
    iput-object v8, v1, La/pnt0;->j:Ljava/lang/String;

    .line 391
    .line 392
    iput-object v7, v1, La/pnt0;->k:La/rei0;

    .line 393
    .line 394
    iput-object v3, v1, La/pnt0;->l:La/i050;

    .line 395
    .line 396
    iput-object p1, v1, La/pnt0;->m:Ljava/io/File;

    .line 397
    .line 398
    const/4 v11, 0x4

    .line 399
    iput v11, v1, La/pnt0;->p:I

    .line 400
    .line 401
    invoke-virtual {v10, p1, v1}, La/h03;->C(Ljava/io/File;La/zje;)Ljava/lang/Object;

    .line 402
    .line 403
    .line 404
    move-result-object v10

    .line 405
    if-ne v10, v2, :cond_7

    .line 406
    .line 407
    goto/16 :goto_d

    .line 408
    .line 409
    :cond_7
    :goto_5
    check-cast v10, La/a2c;

    .line 410
    .line 411
    sget-object v11, La/x1c;->a:La/x1c;

    .line 412
    .line 413
    invoke-static {v10, v11}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 414
    .line 415
    .line 416
    move-result v11
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_3
    .catchall {:try_start_c .. :try_end_c} :catchall_2

    .line 417
    if-nez v11, :cond_9

    .line 418
    .line 419
    :try_start_d
    iget-object p0, p0, Lorg/xplatform/consultantchat/presentation/workers/UploadWorker;->p:La/frc;
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_3
    .catchall {:try_start_d .. :try_end_d} :catchall_5

    .line 420
    .line 421
    if-eqz p0, :cond_8

    .line 422
    .line 423
    :try_start_e
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 424
    .line 425
    .line 426
    iget-object p0, p0, La/frc;->a:La/g45;

    .line 427
    .line 428
    iget-object p0, p0, La/g45;->c:Ljava/lang/Object;

    .line 429
    .line 430
    check-cast p0, La/i7e;

    .line 431
    .line 432
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 433
    .line 434
    .line 435
    iget-object p0, p0, La/i7e;->l:La/qoj0;

    .line 436
    .line 437
    invoke-virtual {p0, v10}, La/qoj0;->g(Ljava/lang/Object;)Z
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_3
    .catchall {:try_start_e .. :try_end_e} :catchall_4

    .line 438
    .line 439
    .line 440
    :try_start_f
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 441
    .line 442
    new-instance v8, Ljava/lang/StringBuilder;

    .line 443
    .line 444
    invoke-direct {v8, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 445
    .line 446
    .line 447
    invoke-virtual {v8, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 448
    .line 449
    .line 450
    const-string v0, " is unsupported"

    .line 451
    .line 452
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 453
    .line 454
    .line 455
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 456
    .line 457
    .line 458
    move-result-object v0

    .line 459
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 460
    .line 461
    .line 462
    throw p0
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_3
    .catchall {:try_start_f .. :try_end_f} :catchall_2

    .line 463
    :catch_3
    move-exception p0

    .line 464
    move-object v12, p1

    .line 465
    move-object p1, p0

    .line 466
    move-object p0, v12

    .line 467
    goto/16 :goto_c

    .line 468
    .line 469
    :goto_6
    move-object p1, p0

    .line 470
    goto/16 :goto_1

    .line 471
    .line 472
    :catchall_4
    move-exception p0

    .line 473
    goto :goto_6

    .line 474
    :cond_8
    :try_start_10
    const-string p0, "sendCheckFileResultUseCase"

    .line 475
    .line 476
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 477
    .line 478
    .line 479
    throw v6
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_3
    .catchall {:try_start_10 .. :try_end_10} :catchall_5

    .line 480
    :catchall_5
    move-exception p0

    .line 481
    goto :goto_6

    .line 482
    :cond_9
    :try_start_11
    iget-object v0, p0, Lorg/xplatform/consultantchat/presentation/workers/UploadWorker;->h:La/is;
    :try_end_11
    .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_11} :catch_3
    .catchall {:try_start_11 .. :try_end_11} :catchall_c

    .line 483
    .line 484
    if-eqz v0, :cond_14

    .line 485
    .line 486
    :try_start_12
    iput-object v9, v1, La/pnt0;->i:Ljava/lang/String;

    .line 487
    .line 488
    iput-object v8, v1, La/pnt0;->j:Ljava/lang/String;

    .line 489
    .line 490
    iput-object v7, v1, La/pnt0;->k:La/rei0;

    .line 491
    .line 492
    iput-object v3, v1, La/pnt0;->l:La/i050;

    .line 493
    .line 494
    iput-object p1, v1, La/pnt0;->m:Ljava/io/File;

    .line 495
    .line 496
    const/4 v10, 0x5

    .line 497
    iput v10, v1, La/pnt0;->p:I
    :try_end_12
    .catch Ljava/lang/Exception; {:try_start_12 .. :try_end_12} :catch_3
    .catchall {:try_start_12 .. :try_end_12} :catchall_2

    .line 498
    .line 499
    :try_start_13
    iget-object v0, v0, La/is;->a:La/g45;

    .line 500
    .line 501
    invoke-virtual {v0, p1, v1}, La/g45;->N(Ljava/io/File;La/zje;)Ljava/lang/Object;

    .line 502
    .line 503
    .line 504
    move-result-object v0
    :try_end_13
    .catch Ljava/lang/Exception; {:try_start_13 .. :try_end_13} :catch_3
    .catchall {:try_start_13 .. :try_end_13} :catchall_8

    .line 505
    if-ne v0, v2, :cond_a

    .line 506
    .line 507
    goto/16 :goto_d

    .line 508
    .line 509
    :cond_a
    :goto_7
    :try_start_14
    check-cast v0, Ljava/lang/String;
    :try_end_14
    .catch Ljava/lang/Exception; {:try_start_14 .. :try_end_14} :catch_3
    .catchall {:try_start_14 .. :try_end_14} :catchall_2

    .line 510
    .line 511
    :try_start_15
    iget-object v10, p0, Lorg/xplatform/consultantchat/presentation/workers/UploadWorker;->i:La/f4v;
    :try_end_15
    .catch Ljava/lang/Exception; {:try_start_15 .. :try_end_15} :catch_3
    .catchall {:try_start_15 .. :try_end_15} :catchall_b

    .line 512
    .line 513
    if-eqz v10, :cond_13

    .line 514
    .line 515
    :try_start_16
    iput-object v9, v1, La/pnt0;->i:Ljava/lang/String;

    .line 516
    .line 517
    iput-object v8, v1, La/pnt0;->j:Ljava/lang/String;

    .line 518
    .line 519
    iput-object v7, v1, La/pnt0;->k:La/rei0;

    .line 520
    .line 521
    iput-object v3, v1, La/pnt0;->l:La/i050;

    .line 522
    .line 523
    iput-object p1, v1, La/pnt0;->m:Ljava/io/File;

    .line 524
    .line 525
    const/4 v11, 0x6

    .line 526
    iput v11, v1, La/pnt0;->p:I
    :try_end_16
    .catch Ljava/lang/Exception; {:try_start_16 .. :try_end_16} :catch_3
    .catchall {:try_start_16 .. :try_end_16} :catchall_2

    .line 527
    .line 528
    :try_start_17
    iget-object v10, v10, La/f4v;->a:La/g45;

    .line 529
    .line 530
    invoke-virtual {v10, v0, p1, v1}, La/g45;->p0(Ljava/lang/String;Ljava/io/File;La/zje;)Ljava/lang/Object;

    .line 531
    .line 532
    .line 533
    move-result-object v0
    :try_end_17
    .catch Ljava/lang/Exception; {:try_start_17 .. :try_end_17} :catch_3
    .catchall {:try_start_17 .. :try_end_17} :catchall_8

    .line 534
    if-ne v0, v2, :cond_b

    .line 535
    .line 536
    goto/16 :goto_d

    .line 537
    .line 538
    :cond_b
    :goto_8
    :try_start_18
    check-cast v0, Ljava/lang/String;
    :try_end_18
    .catch Ljava/lang/Exception; {:try_start_18 .. :try_end_18} :catch_3
    .catchall {:try_start_18 .. :try_end_18} :catchall_2

    .line 539
    .line 540
    :try_start_19
    iget-object v10, p0, Lorg/xplatform/consultantchat/presentation/workers/UploadWorker;->k:La/qv;
    :try_end_19
    .catch Ljava/lang/Exception; {:try_start_19 .. :try_end_19} :catch_3
    .catchall {:try_start_19 .. :try_end_19} :catchall_a

    .line 541
    .line 542
    if-eqz v10, :cond_12

    .line 543
    .line 544
    :try_start_1a
    invoke-virtual {v10, p1, v0, v9}, La/qv;->b(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)V

    .line 545
    .line 546
    .line 547
    if-eqz v4, :cond_11

    .line 548
    .line 549
    new-instance v10, La/wos0;

    .line 550
    .line 551
    new-instance v11, La/oos0;

    .line 552
    .line 553
    invoke-direct {v11, v0}, La/oos0;-><init>(Ljava/lang/String;)V

    .line 554
    .line 555
    .line 556
    invoke-direct {v10, v11, p1}, La/wos0;-><init>(La/qos0;Ljava/io/File;)V

    .line 557
    .line 558
    .line 559
    iput-object v9, v1, La/pnt0;->i:Ljava/lang/String;

    .line 560
    .line 561
    iput-object v8, v1, La/pnt0;->j:Ljava/lang/String;

    .line 562
    .line 563
    iput-object v7, v1, La/pnt0;->k:La/rei0;

    .line 564
    .line 565
    iput-object v3, v1, La/pnt0;->l:La/i050;

    .line 566
    .line 567
    iput-object p1, v1, La/pnt0;->m:Ljava/io/File;

    .line 568
    .line 569
    const/4 v0, 0x7

    .line 570
    iput v0, v1, La/pnt0;->p:I
    :try_end_1a
    .catch Ljava/lang/Exception; {:try_start_1a .. :try_end_1a} :catch_3
    .catchall {:try_start_1a .. :try_end_1a} :catchall_2

    .line 571
    .line 572
    :try_start_1b
    iget-object v0, v4, La/frc;->a:La/g45;

    .line 573
    .line 574
    iget-object v0, v0, La/g45;->d:Ljava/lang/Object;

    .line 575
    .line 576
    check-cast v0, La/gcl;

    .line 577
    .line 578
    invoke-virtual {v0, v10}, La/gcl;->e(La/yos0;)V

    .line 579
    .line 580
    .line 581
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_1b
    .catch Ljava/lang/Exception; {:try_start_1b .. :try_end_1b} :catch_3
    .catchall {:try_start_1b .. :try_end_1b} :catchall_9

    .line 582
    .line 583
    if-ne v0, v2, :cond_c

    .line 584
    .line 585
    goto/16 :goto_d

    .line 586
    .line 587
    :cond_c
    :goto_9
    if-eqz v4, :cond_10

    .line 588
    .line 589
    :try_start_1c
    new-instance v0, La/wos0;

    .line 590
    .line 591
    new-instance v10, La/pos0;

    .line 592
    .line 593
    invoke-direct {v10, v9, v8}, La/pos0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 594
    .line 595
    .line 596
    invoke-direct {v0, v10, p1}, La/wos0;-><init>(La/qos0;Ljava/io/File;)V

    .line 597
    .line 598
    .line 599
    iput-object v6, v1, La/pnt0;->i:Ljava/lang/String;

    .line 600
    .line 601
    iput-object v6, v1, La/pnt0;->j:Ljava/lang/String;

    .line 602
    .line 603
    iput-object v7, v1, La/pnt0;->k:La/rei0;

    .line 604
    .line 605
    iput-object v3, v1, La/pnt0;->l:La/i050;

    .line 606
    .line 607
    iput-object p1, v1, La/pnt0;->m:Ljava/io/File;

    .line 608
    .line 609
    const/16 v8, 0x8

    .line 610
    .line 611
    iput v8, v1, La/pnt0;->p:I
    :try_end_1c
    .catch Ljava/lang/Exception; {:try_start_1c .. :try_end_1c} :catch_3
    .catchall {:try_start_1c .. :try_end_1c} :catchall_2

    .line 612
    .line 613
    :try_start_1d
    iget-object v8, v4, La/frc;->a:La/g45;

    .line 614
    .line 615
    iget-object v8, v8, La/g45;->d:Ljava/lang/Object;

    .line 616
    .line 617
    check-cast v8, La/gcl;

    .line 618
    .line 619
    invoke-virtual {v8, v0}, La/gcl;->e(La/yos0;)V

    .line 620
    .line 621
    .line 622
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_1d
    .catch Ljava/lang/Exception; {:try_start_1d .. :try_end_1d} :catch_3
    .catchall {:try_start_1d .. :try_end_1d} :catchall_7

    .line 623
    .line 624
    if-ne v0, v2, :cond_d

    .line 625
    .line 626
    goto/16 :goto_d

    .line 627
    .line 628
    :cond_d
    :goto_a
    :try_start_1e
    iget-object p0, p0, Lorg/xplatform/consultantchat/presentation/workers/UploadWorker;->j:La/f4v;
    :try_end_1e
    .catch Ljava/lang/Exception; {:try_start_1e .. :try_end_1e} :catch_3
    .catchall {:try_start_1e .. :try_end_1e} :catchall_6

    .line 629
    .line 630
    if-eqz p0, :cond_f

    .line 631
    .line 632
    :try_start_1f
    iput-object v6, v1, La/pnt0;->i:Ljava/lang/String;

    .line 633
    .line 634
    iput-object v6, v1, La/pnt0;->j:Ljava/lang/String;

    .line 635
    .line 636
    iput-object v7, v1, La/pnt0;->k:La/rei0;

    .line 637
    .line 638
    iput-object v3, v1, La/pnt0;->l:La/i050;

    .line 639
    .line 640
    iput-object p1, v1, La/pnt0;->m:Ljava/io/File;

    .line 641
    .line 642
    const/16 v0, 0x9

    .line 643
    .line 644
    iput v0, v1, La/pnt0;->p:I

    .line 645
    .line 646
    invoke-virtual {p0, v7, v1}, La/f4v;->c(La/rei0;La/zje;)Ljava/lang/Object;

    .line 647
    .line 648
    .line 649
    move-result-object p0
    :try_end_1f
    .catch Ljava/lang/Exception; {:try_start_1f .. :try_end_1f} :catch_3
    .catchall {:try_start_1f .. :try_end_1f} :catchall_2

    .line 650
    if-ne p0, v2, :cond_e

    .line 651
    .line 652
    goto/16 :goto_d

    .line 653
    .line 654
    :cond_e
    move-object v0, v3

    .line 655
    :goto_b
    move-object v3, v0

    .line 656
    goto/16 :goto_f

    .line 657
    .line 658
    :cond_f
    :try_start_20
    const-string p0, "sendMessageUseCase"

    .line 659
    .line 660
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 661
    .line 662
    .line 663
    throw v6
    :try_end_20
    .catch Ljava/lang/Exception; {:try_start_20 .. :try_end_20} :catch_3
    .catchall {:try_start_20 .. :try_end_20} :catchall_6

    .line 664
    :catchall_6
    move-exception p0

    .line 665
    goto/16 :goto_6

    .line 666
    .line 667
    :catchall_7
    move-exception p0

    .line 668
    goto/16 :goto_6

    .line 669
    .line 670
    :cond_10
    :try_start_21
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 671
    .line 672
    .line 673
    throw v6

    .line 674
    :catchall_8
    move-exception p0

    .line 675
    goto/16 :goto_6

    .line 676
    .line 677
    :catchall_9
    move-exception p0

    .line 678
    goto/16 :goto_6

    .line 679
    .line 680
    :cond_11
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 681
    .line 682
    .line 683
    throw v6
    :try_end_21
    .catch Ljava/lang/Exception; {:try_start_21 .. :try_end_21} :catch_3
    .catchall {:try_start_21 .. :try_end_21} :catchall_8

    .line 684
    :cond_12
    :try_start_22
    const-string p0, "addUploadedFileMediaInfoUseCase"

    .line 685
    .line 686
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 687
    .line 688
    .line 689
    throw v6
    :try_end_22
    .catch Ljava/lang/Exception; {:try_start_22 .. :try_end_22} :catch_3
    .catchall {:try_start_22 .. :try_end_22} :catchall_a

    .line 690
    :catchall_a
    move-exception p0

    .line 691
    goto/16 :goto_6

    .line 692
    .line 693
    :cond_13
    :try_start_23
    const-string p0, "uploadFileUseCase"

    .line 694
    .line 695
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 696
    .line 697
    .line 698
    throw v6
    :try_end_23
    .catch Ljava/lang/Exception; {:try_start_23 .. :try_end_23} :catch_3
    .catchall {:try_start_23 .. :try_end_23} :catchall_b

    .line 699
    :catchall_b
    move-exception p0

    .line 700
    goto/16 :goto_6

    .line 701
    .line 702
    :cond_14
    :try_start_24
    const-string p0, "getUploadMediaLinkUseCase"

    .line 703
    .line 704
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 705
    .line 706
    .line 707
    throw v6
    :try_end_24
    .catch Ljava/lang/Exception; {:try_start_24 .. :try_end_24} :catch_3
    .catchall {:try_start_24 .. :try_end_24} :catchall_c

    .line 708
    :catchall_c
    move-exception p0

    .line 709
    goto/16 :goto_6

    .line 710
    .line 711
    :cond_15
    :try_start_25
    const-string p0, "checkAttachFileSettingsScenario"

    .line 712
    .line 713
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 714
    .line 715
    .line 716
    throw v6
    :try_end_25
    .catch Ljava/lang/Exception; {:try_start_25 .. :try_end_25} :catch_3
    .catchall {:try_start_25 .. :try_end_25} :catchall_d

    .line 717
    :catchall_d
    move-exception p0

    .line 718
    goto/16 :goto_6

    .line 719
    .line 720
    :goto_c
    :try_start_26
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 721
    .line 722
    .line 723
    if-eqz v4, :cond_17

    .line 724
    .line 725
    new-instance v0, La/pos0;

    .line 726
    .line 727
    check-cast v7, La/pei0;

    .line 728
    .line 729
    iget-object v5, v7, La/pei0;->d:Ljava/lang/String;

    .line 730
    .line 731
    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 732
    .line 733
    .line 734
    move-result-object v7

    .line 735
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 736
    .line 737
    .line 738
    invoke-direct {v0, v5, v7}, La/pos0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 739
    .line 740
    .line 741
    new-instance v5, La/tos0;

    .line 742
    .line 743
    invoke-direct {v5, v0, p0, p1}, La/tos0;-><init>(La/pos0;Ljava/io/File;Ljava/lang/Exception;)V

    .line 744
    .line 745
    .line 746
    iput-object v6, v1, La/pnt0;->i:Ljava/lang/String;

    .line 747
    .line 748
    iput-object v6, v1, La/pnt0;->j:Ljava/lang/String;

    .line 749
    .line 750
    iput-object v6, v1, La/pnt0;->k:La/rei0;

    .line 751
    .line 752
    iput-object v3, v1, La/pnt0;->l:La/i050;

    .line 753
    .line 754
    iput-object v6, v1, La/pnt0;->m:Ljava/io/File;

    .line 755
    .line 756
    const/16 p0, 0xa

    .line 757
    .line 758
    iput p0, v1, La/pnt0;->p:I
    :try_end_26
    .catchall {:try_start_26 .. :try_end_26} :catchall_2

    .line 759
    .line 760
    :try_start_27
    iget-object p0, v4, La/frc;->a:La/g45;

    .line 761
    .line 762
    iget-object p0, p0, La/g45;->d:Ljava/lang/Object;

    .line 763
    .line 764
    check-cast p0, La/gcl;

    .line 765
    .line 766
    invoke-virtual {p0, v5}, La/gcl;->e(La/yos0;)V

    .line 767
    .line 768
    .line 769
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 770
    .line 771
    sget-object p1, La/wne;->a:La/wne;
    :try_end_27
    .catchall {:try_start_27 .. :try_end_27} :catchall_e

    .line 772
    .line 773
    if-ne p0, v2, :cond_16

    .line 774
    .line 775
    :goto_d
    return-object v2

    .line 776
    :cond_16
    move-object p0, v3

    .line 777
    :goto_e
    move-object v3, p0

    .line 778
    goto :goto_f

    .line 779
    :catchall_e
    move-exception p0

    .line 780
    goto/16 :goto_6

    .line 781
    .line 782
    :cond_17
    :try_start_28
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 783
    .line 784
    .line 785
    throw v6
    :try_end_28
    .catchall {:try_start_28 .. :try_end_28} :catchall_8

    .line 786
    :cond_18
    :goto_f
    invoke-interface {v3, v6}, La/i050;->c(Ljava/lang/Object;)V

    .line 787
    .line 788
    .line 789
    invoke-static {}, La/ng00;->a()La/mg00;

    .line 790
    .line 791
    .line 792
    move-result-object p0

    .line 793
    return-object p0

    .line 794
    :catchall_f
    move-exception p0

    .line 795
    goto/16 :goto_6

    .line 796
    .line 797
    :cond_19
    :try_start_29
    const-string p0, "getWSConnectionStreamUseCase"

    .line 798
    .line 799
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 800
    .line 801
    .line 802
    throw v6
    :try_end_29
    .catchall {:try_start_29 .. :try_end_29} :catchall_10

    .line 803
    :catchall_10
    move-exception p0

    .line 804
    goto/16 :goto_6

    .line 805
    .line 806
    :goto_10
    invoke-interface {p0, v6}, La/i050;->c(Ljava/lang/Object;)V

    .line 807
    .line 808
    .line 809
    throw p1

    .line 810
    :cond_1a
    const-string p0, "getUploadingMutexUseCase"

    .line 811
    .line 812
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 813
    .line 814
    .line 815
    throw v6

    .line 816
    :cond_1b
    const-string p0, "getSendingMessagesFromCacheUseCase"

    .line 817
    .line 818
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 819
    .line 820
    .line 821
    throw v6

    .line 822
    nop

    .line 823
    :pswitch_data_0
    .packed-switch 0x0
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

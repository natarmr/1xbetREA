.class public final La/s1d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/kmq;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Z

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/view/Window;Z)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, La/s1d;->a:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/s1d;->c:Ljava/lang/Object;

    .line 8
    .line 9
    iput-boolean p2, p0, La/s1d;->b:Z

    .line 10
    .line 11
    return-void
.end method

.method public constructor <init>(ZLa/tqo;)V
    .locals 1

    const/4 v0, 0x1

    iput-byte v0, p0, La/s1d;->a:B

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, La/s1d;->b:Z

    iput-object p2, p0, La/s1d;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/s1d;->a:B

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    iget-object v3, v0, La/s1d;->c:Ljava/lang/Object;

    .line 7
    .line 8
    iget-boolean v0, v0, La/s1d;->b:Z

    .line 9
    .line 10
    packed-switch v1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    move-object/from16 v1, p1

    .line 14
    .line 15
    check-cast v1, La/nqo;

    .line 16
    .line 17
    check-cast v3, La/tqo;

    .line 18
    .line 19
    iget-object v4, v3, La/i3t0;->f:La/oyg0;

    .line 20
    .line 21
    iget-object v5, v3, La/i3t0;->i:La/ocj;

    .line 22
    .line 23
    sget-object v6, La/lqo;->a:La/lqo;

    .line 24
    .line 25
    invoke-static {v1, v6}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v6

    .line 29
    if-nez v6, :cond_a

    .line 30
    .line 31
    instance-of v6, v1, La/mqo;

    .line 32
    .line 33
    const/4 v7, 0x0

    .line 34
    if-eqz v6, :cond_9

    .line 35
    .line 36
    new-instance v13, La/zhe;

    .line 37
    .line 38
    check-cast v1, La/mqo;

    .line 39
    .line 40
    iget-object v1, v1, La/mqo;->a:Ljava/util/List;

    .line 41
    .line 42
    invoke-direct {v13, v1}, La/zhe;-><init>(Ljava/util/List;)V

    .line 43
    .line 44
    .line 45
    if-eqz v0, :cond_4

    .line 46
    .line 47
    invoke-virtual {v3}, La/i3t0;->D()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    check-cast v1, La/pqo;

    .line 52
    .line 53
    iget-object v1, v1, La/pqo;->h:La/gie;

    .line 54
    .line 55
    instance-of v6, v1, La/zhe;

    .line 56
    .line 57
    if-eqz v6, :cond_0

    .line 58
    .line 59
    check-cast v1, La/zhe;

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_0
    move-object v1, v7

    .line 63
    :goto_0
    if-eqz v1, :cond_1

    .line 64
    .line 65
    iget-object v1, v1, La/zhe;->a:Ljava/util/List;

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_1
    move-object v1, v7

    .line 69
    :goto_1
    if-nez v1, :cond_2

    .line 70
    .line 71
    sget-object v1, La/iun;->a:La/iun;

    .line 72
    .line 73
    :cond_2
    move-object v11, v1

    .line 74
    iget-object v1, v5, La/ocj;->a:La/p7m0;

    .line 75
    .line 76
    :cond_3
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    move-object v8, v5

    .line 84
    check-cast v8, La/pqo;

    .line 85
    .line 86
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    const/16 v16, 0x0

    .line 90
    .line 91
    const/16 v17, 0x75f

    .line 92
    .line 93
    const/4 v9, 0x0

    .line 94
    const/4 v10, 0x0

    .line 95
    const/4 v12, 0x0

    .line 96
    const/4 v14, 0x0

    .line 97
    const/4 v15, 0x0

    .line 98
    invoke-static/range {v8 .. v17}, La/pqo;->a(La/pqo;La/swh0;ZLjava/util/List;Ljava/util/List;La/gie;La/gie;Ljava/util/Set;La/gd90;I)La/pqo;

    .line 99
    .line 100
    .line 101
    move-result-object v6

    .line 102
    invoke-virtual {v1, v5, v6}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result v5

    .line 106
    if-eqz v5, :cond_3

    .line 107
    .line 108
    goto :goto_4

    .line 109
    :cond_4
    invoke-virtual {v3}, La/i3t0;->D()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    check-cast v1, La/pqo;

    .line 114
    .line 115
    iget-object v1, v1, La/pqo;->i:La/gie;

    .line 116
    .line 117
    instance-of v6, v1, La/zhe;

    .line 118
    .line 119
    if-eqz v6, :cond_5

    .line 120
    .line 121
    check-cast v1, La/zhe;

    .line 122
    .line 123
    goto :goto_2

    .line 124
    :cond_5
    move-object v1, v7

    .line 125
    :goto_2
    if-eqz v1, :cond_6

    .line 126
    .line 127
    iget-object v1, v1, La/zhe;->a:Ljava/util/List;

    .line 128
    .line 129
    goto :goto_3

    .line 130
    :cond_6
    move-object v1, v7

    .line 131
    :goto_3
    if-nez v1, :cond_7

    .line 132
    .line 133
    sget-object v1, La/iun;->a:La/iun;

    .line 134
    .line 135
    :cond_7
    move-object v12, v1

    .line 136
    iget-object v1, v5, La/ocj;->a:La/p7m0;

    .line 137
    .line 138
    :cond_8
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v5

    .line 142
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 143
    .line 144
    .line 145
    move-object v8, v5

    .line 146
    check-cast v8, La/pqo;

    .line 147
    .line 148
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 149
    .line 150
    .line 151
    const/16 v16, 0x0

    .line 152
    .line 153
    const/16 v17, 0x6bf

    .line 154
    .line 155
    const/4 v9, 0x0

    .line 156
    const/4 v10, 0x0

    .line 157
    const/4 v11, 0x0

    .line 158
    move-object v14, v13

    .line 159
    const/4 v13, 0x0

    .line 160
    const/4 v15, 0x0

    .line 161
    invoke-static/range {v8 .. v17}, La/pqo;->a(La/pqo;La/swh0;ZLjava/util/List;Ljava/util/List;La/gie;La/gie;Ljava/util/Set;La/gd90;I)La/pqo;

    .line 162
    .line 163
    .line 164
    move-result-object v6

    .line 165
    move-object v13, v14

    .line 166
    invoke-virtual {v1, v5, v6}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    move-result v5

    .line 170
    if-eqz v5, :cond_8

    .line 171
    .line 172
    :goto_4
    sget v1, La/tqo;->G:I

    .line 173
    .line 174
    iget-object v1, v3, La/tqo;->D:La/bby;

    .line 175
    .line 176
    invoke-static {v1}, La/v3c;->N(La/bby;)V

    .line 177
    .line 178
    .line 179
    new-instance v1, La/vnn;

    .line 180
    .line 181
    invoke-direct {v1, v2, v7, v3, v0}, La/vnn;-><init>(BLa/yje;La/i3t0;Z)V

    .line 182
    .line 183
    .line 184
    const/4 v0, 0x3

    .line 185
    invoke-static {v3, v7, v7, v1, v0}, La/i3t0;->K(La/i3t0;La/lne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)La/bby;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    iput-object v0, v3, La/tqo;->D:La/bby;

    .line 190
    .line 191
    invoke-virtual {v3}, La/tqo;->N()V

    .line 192
    .line 193
    .line 194
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 195
    .line 196
    goto :goto_5

    .line 197
    :cond_9
    invoke-static {}, La/t9f;->b()V

    .line 198
    .line 199
    .line 200
    :goto_5
    return-object v7

    .line 201
    :cond_a
    new-instance v0, Ljava/net/UnknownHostException;

    .line 202
    .line 203
    invoke-direct {v0}, Ljava/net/UnknownHostException;-><init>()V

    .line 204
    .line 205
    .line 206
    throw v0

    .line 207
    :pswitch_0
    move-object/from16 v1, p1

    .line 208
    .line 209
    check-cast v1, Ljava/lang/Boolean;

    .line 210
    .line 211
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 212
    .line 213
    .line 214
    move-result v1

    .line 215
    check-cast v3, Landroid/view/Window;

    .line 216
    .line 217
    if-eqz v3, :cond_f

    .line 218
    .line 219
    if-nez v0, :cond_b

    .line 220
    .line 221
    if-eqz v1, :cond_b

    .line 222
    .line 223
    goto :goto_6

    .line 224
    :cond_b
    const/4 v2, 0x0

    .line 225
    :goto_6
    invoke-virtual {v3}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    new-instance v1, La/ani0;

    .line 230
    .line 231
    invoke-direct {v1, v0}, La/ani0;-><init>(Landroid/view/View;)V

    .line 232
    .line 233
    .line 234
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 235
    .line 236
    const/16 v4, 0x23

    .line 237
    .line 238
    if-lt v0, v4, :cond_c

    .line 239
    .line 240
    new-instance v0, La/bjv0;

    .line 241
    .line 242
    invoke-direct {v0, v3, v1}, La/ajv0;-><init>(Landroid/view/Window;La/ani0;)V

    .line 243
    .line 244
    .line 245
    goto :goto_7

    .line 246
    :cond_c
    const/16 v4, 0x1e

    .line 247
    .line 248
    if-lt v0, v4, :cond_d

    .line 249
    .line 250
    new-instance v0, La/ajv0;

    .line 251
    .line 252
    invoke-direct {v0, v3, v1}, La/ajv0;-><init>(Landroid/view/Window;La/ani0;)V

    .line 253
    .line 254
    .line 255
    goto :goto_7

    .line 256
    :cond_d
    const/16 v4, 0x1a

    .line 257
    .line 258
    if-lt v0, v4, :cond_e

    .line 259
    .line 260
    new-instance v0, La/ziv0;

    .line 261
    .line 262
    invoke-direct {v0, v3, v1}, La/yiv0;-><init>(Landroid/view/Window;La/ani0;)V

    .line 263
    .line 264
    .line 265
    goto :goto_7

    .line 266
    :cond_e
    new-instance v0, La/yiv0;

    .line 267
    .line 268
    invoke-direct {v0, v3, v1}, La/yiv0;-><init>(Landroid/view/Window;La/ani0;)V

    .line 269
    .line 270
    .line 271
    :goto_7
    invoke-virtual {v0, v2}, La/ycm0;->w(Z)V

    .line 272
    .line 273
    .line 274
    :cond_f
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 275
    .line 276
    return-object v0

    .line 277
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

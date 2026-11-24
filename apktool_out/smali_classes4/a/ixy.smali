.class public final La/ixy;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public k:B


# direct methods
.method public synthetic constructor <init>(ILa/yje;)V
    .locals 1

    .line 2
    const/4 v0, 0x3

    iput-byte v0, p0, La/ixy;->i:B

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method

.method public synthetic constructor <init>(ILa/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/ixy;->i:B

    iput-byte p1, p0, La/ixy;->k:B

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/ixy;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p0, La/ixy;

    .line 7
    .line 8
    const/4 v0, 0x2

    .line 9
    invoke-direct {p0, v0, p2}, La/ixy;-><init>(ILa/yje;)V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, La/ixy;->j:Ljava/lang/Object;

    .line 13
    .line 14
    return-object p0

    .line 15
    :pswitch_0
    new-instance v0, La/ixy;

    .line 16
    .line 17
    iget-byte p0, p0, La/ixy;->k:B

    .line 18
    .line 19
    const/4 v1, 0x2

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/ixy;-><init>(ILa/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/ixy;->j:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_1
    new-instance v0, La/ixy;

    .line 27
    .line 28
    iget-byte p0, p0, La/ixy;->k:B

    .line 29
    .line 30
    const/4 v1, 0x1

    .line 31
    invoke-direct {v0, p0, p2, v1}, La/ixy;-><init>(ILa/yje;B)V

    .line 32
    .line 33
    .line 34
    iput-object p1, v0, La/ixy;->j:Ljava/lang/Object;

    .line 35
    .line 36
    return-object v0

    .line 37
    :pswitch_2
    new-instance v0, La/ixy;

    .line 38
    .line 39
    iget-byte p0, p0, La/ixy;->k:B

    .line 40
    .line 41
    const/4 v1, 0x0

    .line 42
    invoke-direct {v0, p0, p2, v1}, La/ixy;-><init>(ILa/yje;B)V

    .line 43
    .line 44
    .line 45
    iput-object p1, v0, La/ixy;->j:Ljava/lang/Object;

    .line 46
    .line 47
    return-object v0

    .line 48
    nop

    .line 49
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
    iget-byte v0, p0, La/ixy;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/kmq;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/ixy;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/ixy;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/ixy;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/qpg0;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/ixy;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/ixy;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/ixy;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, La/qpg0;

    .line 41
    .line 42
    check-cast p2, La/yje;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, La/ixy;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/ixy;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/ixy;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :pswitch_2
    check-cast p1, La/qpg0;

    .line 58
    .line 59
    check-cast p2, La/yje;

    .line 60
    .line 61
    invoke-virtual {p0, p1, p2}, La/ixy;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    check-cast p0, La/ixy;

    .line 66
    .line 67
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 68
    .line 69
    invoke-virtual {p0, p1}, La/ixy;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    return-object p0

    .line 74
    nop

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte v0, p0, La/ixy;->i:B

    .line 2
    .line 3
    const-string v1, "date"

    .line 4
    .line 5
    const-string v2, "type"

    .line 6
    .line 7
    const-string v3, "id"

    .line 8
    .line 9
    const-string v4, "select * from last_action where type = ?"

    .line 10
    .line 11
    const/4 v5, 0x0

    .line 12
    const/4 v6, 0x1

    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    sget-object v0, La/wne;->a:La/wne;

    .line 17
    .line 18
    iget-byte v1, p0, La/ixy;->k:B

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    const/4 v3, 0x2

    .line 22
    if-eqz v1, :cond_2

    .line 23
    .line 24
    if-eq v1, v6, :cond_1

    .line 25
    .line 26
    if-ne v1, v3, :cond_0

    .line 27
    .line 28
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 33
    .line 34
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    move-object v0, v2

    .line 38
    goto :goto_2

    .line 39
    :cond_1
    iget-object v1, p0, La/ixy;->j:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v1, La/kmq;

    .line 42
    .line 43
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    check-cast p1, La/tgf0;

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iget-object p1, p0, La/ixy;->j:Ljava/lang/Object;

    .line 53
    .line 54
    move-object v1, p1

    .line 55
    check-cast v1, La/kmq;

    .line 56
    .line 57
    move-object p1, v2

    .line 58
    :goto_0
    sget-object v4, La/tgf0;->a:La/tgf0;

    .line 59
    .line 60
    if-ne p1, v4, :cond_3

    .line 61
    .line 62
    move v5, v6

    .line 63
    :cond_3
    sget-object p1, La/zh80;->c:La/zh80;

    .line 64
    .line 65
    new-instance v4, La/yh80;

    .line 66
    .line 67
    invoke-direct {v4, v5, p1}, La/yh80;-><init>(ZLa/b5x;)V

    .line 68
    .line 69
    .line 70
    iput-object v2, p0, La/ixy;->j:Ljava/lang/Object;

    .line 71
    .line 72
    iput-byte v3, p0, La/ixy;->k:B

    .line 73
    .line 74
    invoke-interface {v1, v4, p0}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    if-ne p0, v0, :cond_4

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_4
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 82
    .line 83
    :goto_2
    return-object v0

    .line 84
    :pswitch_0
    iget-object v0, p0, La/ixy;->j:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v0, La/qpg0;

    .line 87
    .line 88
    sget-object v5, La/wne;->a:La/wne;

    .line 89
    .line 90
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    invoke-interface {v0, v4}, La/qpg0;->Z0(Ljava/lang/String;)La/xpg0;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    :try_start_0
    iget-byte p0, p0, La/ixy;->k:B

    .line 98
    .line 99
    int-to-long v4, p0

    .line 100
    invoke-interface {p1, v6, v4, v5}, La/xpg0;->o(IJ)V

    .line 101
    .line 102
    .line 103
    invoke-static {p1, v3}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 104
    .line 105
    .line 106
    move-result p0

    .line 107
    invoke-static {p1, v2}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    invoke-static {p1, v1}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 112
    .line 113
    .line 114
    move-result v1

    .line 115
    new-instance v2, Ljava/util/ArrayList;

    .line 116
    .line 117
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 118
    .line 119
    .line 120
    :goto_3
    invoke-interface {p1}, La/xpg0;->W0()Z

    .line 121
    .line 122
    .line 123
    move-result v3

    .line 124
    if-eqz v3, :cond_5

    .line 125
    .line 126
    invoke-interface {p1, p0}, La/xpg0;->getLong(I)J

    .line 127
    .line 128
    .line 129
    move-result-wide v6

    .line 130
    invoke-interface {p1, v0}, La/xpg0;->getLong(I)J

    .line 131
    .line 132
    .line 133
    move-result-wide v3

    .line 134
    long-to-int v5, v3

    .line 135
    invoke-interface {p1, v1}, La/xpg0;->getLong(I)J

    .line 136
    .line 137
    .line 138
    move-result-wide v8

    .line 139
    new-instance v4, La/hxy;

    .line 140
    .line 141
    invoke-direct/range {v4 .. v9}, La/hxy;-><init>(IJJ)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 145
    .line 146
    .line 147
    goto :goto_3

    .line 148
    :catchall_0
    move-exception v0

    .line 149
    move-object p0, v0

    .line 150
    goto :goto_4

    .line 151
    :cond_5
    invoke-interface {p1}, Ljava/lang/AutoCloseable;->close()V

    .line 152
    .line 153
    .line 154
    return-object v2

    .line 155
    :goto_4
    invoke-interface {p1}, Ljava/lang/AutoCloseable;->close()V

    .line 156
    .line 157
    .line 158
    throw p0

    .line 159
    :pswitch_1
    iget-object v0, p0, La/ixy;->j:Ljava/lang/Object;

    .line 160
    .line 161
    check-cast v0, La/qpg0;

    .line 162
    .line 163
    sget-object v1, La/wne;->a:La/wne;

    .line 164
    .line 165
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 166
    .line 167
    .line 168
    const-string p1, "select count(*) from last_action where type = ?"

    .line 169
    .line 170
    invoke-interface {v0, p1}, La/qpg0;->Z0(Ljava/lang/String;)La/xpg0;

    .line 171
    .line 172
    .line 173
    move-result-object p1

    .line 174
    :try_start_1
    iget-byte p0, p0, La/ixy;->k:B

    .line 175
    .line 176
    int-to-long v0, p0

    .line 177
    invoke-interface {p1, v6, v0, v1}, La/xpg0;->o(IJ)V

    .line 178
    .line 179
    .line 180
    invoke-interface {p1}, La/xpg0;->W0()Z

    .line 181
    .line 182
    .line 183
    move-result p0

    .line 184
    if-eqz p0, :cond_6

    .line 185
    .line 186
    invoke-interface {p1, v5}, La/xpg0;->getLong(I)J

    .line 187
    .line 188
    .line 189
    move-result-wide v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 190
    goto :goto_5

    .line 191
    :catchall_1
    move-exception v0

    .line 192
    move-object p0, v0

    .line 193
    goto :goto_6

    .line 194
    :cond_6
    const-wide/16 v0, 0x0

    .line 195
    .line 196
    :goto_5
    invoke-interface {p1}, Ljava/lang/AutoCloseable;->close()V

    .line 197
    .line 198
    .line 199
    new-instance p0, Ljava/lang/Long;

    .line 200
    .line 201
    invoke-direct {p0, v0, v1}, Ljava/lang/Long;-><init>(J)V

    .line 202
    .line 203
    .line 204
    return-object p0

    .line 205
    :goto_6
    invoke-interface {p1}, Ljava/lang/AutoCloseable;->close()V

    .line 206
    .line 207
    .line 208
    throw p0

    .line 209
    :pswitch_2
    iget-object v0, p0, La/ixy;->j:Ljava/lang/Object;

    .line 210
    .line 211
    check-cast v0, La/qpg0;

    .line 212
    .line 213
    sget-object v5, La/wne;->a:La/wne;

    .line 214
    .line 215
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 216
    .line 217
    .line 218
    invoke-interface {v0, v4}, La/qpg0;->Z0(Ljava/lang/String;)La/xpg0;

    .line 219
    .line 220
    .line 221
    move-result-object p1

    .line 222
    :try_start_2
    iget-byte p0, p0, La/ixy;->k:B

    .line 223
    .line 224
    int-to-long v4, p0

    .line 225
    invoke-interface {p1, v6, v4, v5}, La/xpg0;->o(IJ)V

    .line 226
    .line 227
    .line 228
    invoke-static {p1, v3}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 229
    .line 230
    .line 231
    move-result p0

    .line 232
    invoke-static {p1, v2}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 233
    .line 234
    .line 235
    move-result v0

    .line 236
    invoke-static {p1, v1}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 237
    .line 238
    .line 239
    move-result v1

    .line 240
    new-instance v2, Ljava/util/ArrayList;

    .line 241
    .line 242
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 243
    .line 244
    .line 245
    :goto_7
    invoke-interface {p1}, La/xpg0;->W0()Z

    .line 246
    .line 247
    .line 248
    move-result v3

    .line 249
    if-eqz v3, :cond_7

    .line 250
    .line 251
    invoke-interface {p1, p0}, La/xpg0;->getLong(I)J

    .line 252
    .line 253
    .line 254
    move-result-wide v6

    .line 255
    invoke-interface {p1, v0}, La/xpg0;->getLong(I)J

    .line 256
    .line 257
    .line 258
    move-result-wide v3

    .line 259
    long-to-int v5, v3

    .line 260
    invoke-interface {p1, v1}, La/xpg0;->getLong(I)J

    .line 261
    .line 262
    .line 263
    move-result-wide v8

    .line 264
    new-instance v4, La/hxy;

    .line 265
    .line 266
    invoke-direct/range {v4 .. v9}, La/hxy;-><init>(IJJ)V

    .line 267
    .line 268
    .line 269
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 270
    .line 271
    .line 272
    goto :goto_7

    .line 273
    :catchall_2
    move-exception v0

    .line 274
    move-object p0, v0

    .line 275
    goto :goto_8

    .line 276
    :cond_7
    invoke-interface {p1}, Ljava/lang/AutoCloseable;->close()V

    .line 277
    .line 278
    .line 279
    return-object v2

    .line 280
    :goto_8
    invoke-interface {p1}, Ljava/lang/AutoCloseable;->close()V

    .line 281
    .line 282
    .line 283
    throw p0

    .line 284
    nop

    .line 285
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

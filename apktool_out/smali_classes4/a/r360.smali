.class public final La/r360;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/v360;


# direct methods
.method public synthetic constructor <init>(La/v360;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/r360;->i:B

    iput-object p1, p0, La/r360;->k:La/v360;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/r360;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/r360;->k:La/v360;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/r360;

    .line 9
    .line 10
    const/4 v0, 0x2

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/r360;-><init>(La/v360;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/r360;

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/r360;-><init>(La/v360;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    :pswitch_1
    new-instance v0, La/r360;

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    invoke-direct {v0, p0, p2, v1}, La/r360;-><init>(La/v360;La/yje;B)V

    .line 26
    .line 27
    .line 28
    check-cast p1, Ljava/lang/Boolean;

    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    iput-boolean p0, v0, La/r360;->j:Z

    .line 35
    .line 36
    return-object v0

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/r360;->i:B

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
    invoke-virtual {p0, p1, p2}, La/r360;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/r360;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/r360;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/vne;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/r360;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/r360;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/r360;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, Ljava/lang/Boolean;

    .line 41
    .line 42
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 43
    .line 44
    .line 45
    check-cast p2, La/yje;

    .line 46
    .line 47
    invoke-virtual {p0, p1, p2}, La/r360;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    check-cast p0, La/r360;

    .line 52
    .line 53
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    invoke-virtual {p0, p1}, La/r360;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0

    .line 60
    nop

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/r360;->i:B

    .line 4
    .line 5
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 6
    .line 7
    iget-object v3, v0, La/r360;->k:La/v360;

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    const/4 v5, 0x1

    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    sget-object v1, La/wne;->a:La/wne;

    .line 15
    .line 16
    iget-boolean v6, v0, La/r360;->j:Z

    .line 17
    .line 18
    if-eqz v6, :cond_1

    .line 19
    .line 20
    if-ne v6, v5, :cond_0

    .line 21
    .line 22
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    iget-object v2, v3, La/v360;->w:La/urt;

    .line 34
    .line 35
    sget-object v3, La/tl5;->a:La/tl5;

    .line 36
    .line 37
    iput-boolean v5, v0, La/r360;->j:Z

    .line 38
    .line 39
    iget-object v2, v2, La/urt;->a:La/rrd;

    .line 40
    .line 41
    invoke-virtual {v2, v3, v0}, La/rrd;->i(La/tl5;La/zje;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    if-ne v0, v1, :cond_2

    .line 46
    .line 47
    move-object v4, v1

    .line 48
    goto :goto_1

    .line 49
    :cond_2
    :goto_0
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 50
    .line 51
    :goto_1
    return-object v4

    .line 52
    :pswitch_0
    sget-object v1, La/wne;->a:La/wne;

    .line 53
    .line 54
    iget-boolean v6, v0, La/r360;->j:Z

    .line 55
    .line 56
    if-eqz v6, :cond_4

    .line 57
    .line 58
    if-ne v6, v5, :cond_3

    .line 59
    .line 60
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_3
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    goto :goto_3

    .line 68
    :cond_4
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    iget-object v2, v3, La/v360;->c0:La/phf0;

    .line 72
    .line 73
    invoke-virtual {v2}, La/phf0;->m()La/i89;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    iget-object v6, v3, La/v360;->d0:La/jqt;

    .line 78
    .line 79
    invoke-virtual {v6}, La/jqt;->a()La/h2c;

    .line 80
    .line 81
    .line 82
    move-result-object v6

    .line 83
    new-instance v7, La/t360;

    .line 84
    .line 85
    invoke-direct {v7, v3, v4}, La/t360;-><init>(La/v360;La/yje;)V

    .line 86
    .line 87
    .line 88
    const/4 v8, 0x2

    .line 89
    new-array v8, v8, [La/gmq;

    .line 90
    .line 91
    const/4 v9, 0x0

    .line 92
    aput-object v2, v8, v9

    .line 93
    .line 94
    aput-object v6, v8, v5

    .line 95
    .line 96
    new-instance v2, La/g6q;

    .line 97
    .line 98
    const/16 v6, 0xb

    .line 99
    .line 100
    invoke-direct {v2, v8, v4, v7, v6}, La/g6q;-><init>([La/gmq;La/yje;La/wdr;B)V

    .line 101
    .line 102
    .line 103
    new-instance v4, La/vsg0;

    .line 104
    .line 105
    invoke-direct {v4, v2}, La/vsg0;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 106
    .line 107
    .line 108
    new-instance v2, La/d360;

    .line 109
    .line 110
    invoke-direct {v2, v3, v5}, La/d360;-><init>(La/v360;B)V

    .line 111
    .line 112
    .line 113
    iput-boolean v5, v0, La/r360;->j:Z

    .line 114
    .line 115
    invoke-virtual {v4, v2, v0}, La/vsg0;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    if-ne v0, v1, :cond_5

    .line 120
    .line 121
    move-object v4, v1

    .line 122
    goto :goto_3

    .line 123
    :cond_5
    :goto_2
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 124
    .line 125
    :goto_3
    return-object v4

    .line 126
    :pswitch_1
    iget-boolean v10, v0, La/r360;->j:Z

    .line 127
    .line 128
    sget-object v0, La/wne;->a:La/wne;

    .line 129
    .line 130
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    sget v0, La/v360;->x0:I

    .line 134
    .line 135
    iget-object v0, v3, La/i3t0;->i:La/ocj;

    .line 136
    .line 137
    iget-object v1, v0, La/ocj;->a:La/p7m0;

    .line 138
    .line 139
    :cond_6
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v2

    .line 143
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 144
    .line 145
    .line 146
    move-object v6, v2

    .line 147
    check-cast v6, La/c260;

    .line 148
    .line 149
    const/16 v16, 0x0

    .line 150
    .line 151
    const v17, 0x3ffbf

    .line 152
    .line 153
    .line 154
    const/4 v7, 0x0

    .line 155
    const/4 v8, 0x0

    .line 156
    const/4 v9, 0x0

    .line 157
    const/4 v11, 0x0

    .line 158
    const/4 v12, 0x0

    .line 159
    const/4 v13, 0x0

    .line 160
    const/4 v14, 0x0

    .line 161
    const/4 v15, 0x0

    .line 162
    invoke-static/range {v6 .. v17}, La/c260;->a(La/c260;La/oz50;ZZZLa/om5;ZLjava/util/List;La/tz50;La/s4i0;La/s4i0;I)La/c260;

    .line 163
    .line 164
    .line 165
    move-result-object v6

    .line 166
    invoke-virtual {v1, v2, v6}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    move-result v2

    .line 170
    if-eqz v2, :cond_6

    .line 171
    .line 172
    if-eqz v10, :cond_8

    .line 173
    .line 174
    iget-object v1, v3, La/v360;->v0:La/bby;

    .line 175
    .line 176
    if-eqz v1, :cond_7

    .line 177
    .line 178
    invoke-interface {v1}, La/bby;->isActive()Z

    .line 179
    .line 180
    .line 181
    move-result v1

    .line 182
    if-ne v1, v5, :cond_7

    .line 183
    .line 184
    goto :goto_4

    .line 185
    :cond_7
    invoke-virtual {v3}, La/v360;->a0()V

    .line 186
    .line 187
    .line 188
    goto :goto_5

    .line 189
    :cond_8
    :goto_4
    if-nez v10, :cond_c

    .line 190
    .line 191
    invoke-virtual {v3}, La/i3t0;->D()Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v1

    .line 195
    check-cast v1, La/c260;

    .line 196
    .line 197
    iget-object v1, v1, La/c260;->j:La/tz50;

    .line 198
    .line 199
    instance-of v2, v1, La/rz50;

    .line 200
    .line 201
    if-eqz v2, :cond_9

    .line 202
    .line 203
    move-object v4, v1

    .line 204
    check-cast v4, La/rz50;

    .line 205
    .line 206
    :cond_9
    if-nez v4, :cond_a

    .line 207
    .line 208
    goto :goto_5

    .line 209
    :cond_a
    invoke-static {v4}, La/v360;->M(La/rz50;)Z

    .line 210
    .line 211
    .line 212
    move-result v1

    .line 213
    if-nez v1, :cond_c

    .line 214
    .line 215
    invoke-static {v4}, La/v360;->R(La/rz50;)Z

    .line 216
    .line 217
    .line 218
    move-result v1

    .line 219
    if-eqz v1, :cond_c

    .line 220
    .line 221
    iget-object v0, v0, La/ocj;->a:La/p7m0;

    .line 222
    .line 223
    :cond_b
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v1

    .line 227
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 228
    .line 229
    .line 230
    move-object v2, v1

    .line 231
    check-cast v2, La/c260;

    .line 232
    .line 233
    const/4 v12, 0x0

    .line 234
    const v13, 0x3fdff

    .line 235
    .line 236
    .line 237
    const/4 v3, 0x0

    .line 238
    const/4 v4, 0x0

    .line 239
    const/4 v5, 0x0

    .line 240
    const/4 v6, 0x0

    .line 241
    const/4 v7, 0x0

    .line 242
    const/4 v8, 0x1

    .line 243
    const/4 v9, 0x0

    .line 244
    const/4 v10, 0x0

    .line 245
    const/4 v11, 0x0

    .line 246
    invoke-static/range {v2 .. v13}, La/c260;->a(La/c260;La/oz50;ZZZLa/om5;ZLjava/util/List;La/tz50;La/s4i0;La/s4i0;I)La/c260;

    .line 247
    .line 248
    .line 249
    move-result-object v2

    .line 250
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 251
    .line 252
    .line 253
    move-result v1

    .line 254
    if-eqz v1, :cond_b

    .line 255
    .line 256
    :cond_c
    :goto_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 257
    .line 258
    return-object v0

    .line 259
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

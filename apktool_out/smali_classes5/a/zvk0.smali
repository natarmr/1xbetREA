.class public final La/zvk0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/iwk0;


# direct methods
.method public synthetic constructor <init>(La/iwk0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/zvk0;->i:B

    iput-object p1, p0, La/zvk0;->k:La/iwk0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/zvk0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/zvk0;->k:La/iwk0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/zvk0;

    .line 9
    .line 10
    const/4 v1, 0x6

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/zvk0;-><init>(La/iwk0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    check-cast p1, Ljava/lang/Boolean;

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    iput-boolean p0, v0, La/zvk0;->j:Z

    .line 21
    .line 22
    return-object v0

    .line 23
    :pswitch_0
    new-instance p1, La/zvk0;

    .line 24
    .line 25
    const/4 v0, 0x5

    .line 26
    invoke-direct {p1, p0, p2, v0}, La/zvk0;-><init>(La/iwk0;La/yje;B)V

    .line 27
    .line 28
    .line 29
    return-object p1

    .line 30
    :pswitch_1
    new-instance p1, La/zvk0;

    .line 31
    .line 32
    const/4 v0, 0x4

    .line 33
    invoke-direct {p1, p0, p2, v0}, La/zvk0;-><init>(La/iwk0;La/yje;B)V

    .line 34
    .line 35
    .line 36
    return-object p1

    .line 37
    :pswitch_2
    new-instance p1, La/zvk0;

    .line 38
    .line 39
    const/4 v0, 0x3

    .line 40
    invoke-direct {p1, p0, p2, v0}, La/zvk0;-><init>(La/iwk0;La/yje;B)V

    .line 41
    .line 42
    .line 43
    return-object p1

    .line 44
    :pswitch_3
    new-instance p1, La/zvk0;

    .line 45
    .line 46
    const/4 v0, 0x2

    .line 47
    invoke-direct {p1, p0, p2, v0}, La/zvk0;-><init>(La/iwk0;La/yje;B)V

    .line 48
    .line 49
    .line 50
    return-object p1

    .line 51
    :pswitch_4
    new-instance p1, La/zvk0;

    .line 52
    .line 53
    const/4 v0, 0x1

    .line 54
    invoke-direct {p1, p0, p2, v0}, La/zvk0;-><init>(La/iwk0;La/yje;B)V

    .line 55
    .line 56
    .line 57
    return-object p1

    .line 58
    :pswitch_5
    new-instance p1, La/zvk0;

    .line 59
    .line 60
    const/4 v0, 0x0

    .line 61
    invoke-direct {p1, p0, p2, v0}, La/zvk0;-><init>(La/iwk0;La/yje;B)V

    .line 62
    .line 63
    .line 64
    return-object p1

    .line 65
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/zvk0;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Boolean;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 9
    .line 10
    .line 11
    check-cast p2, La/yje;

    .line 12
    .line 13
    invoke-virtual {p0, p1, p2}, La/zvk0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, La/zvk0;

    .line 18
    .line 19
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 20
    .line 21
    invoke-virtual {p0, p1}, La/zvk0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0

    .line 26
    :pswitch_0
    check-cast p1, La/vne;

    .line 27
    .line 28
    check-cast p2, La/yje;

    .line 29
    .line 30
    invoke-virtual {p0, p1, p2}, La/zvk0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, La/zvk0;

    .line 35
    .line 36
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    invoke-virtual {p0, p1}, La/zvk0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/zvk0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    check-cast p0, La/zvk0;

    .line 52
    .line 53
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    invoke-virtual {p0, p1}, La/zvk0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/zvk0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    check-cast p0, La/zvk0;

    .line 69
    .line 70
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 71
    .line 72
    invoke-virtual {p0, p1}, La/zvk0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    return-object p0

    .line 77
    :pswitch_3
    check-cast p1, La/vne;

    .line 78
    .line 79
    check-cast p2, La/yje;

    .line 80
    .line 81
    invoke-virtual {p0, p1, p2}, La/zvk0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    check-cast p0, La/zvk0;

    .line 86
    .line 87
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 88
    .line 89
    invoke-virtual {p0, p1}, La/zvk0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    return-object p0

    .line 94
    :pswitch_4
    check-cast p1, La/vne;

    .line 95
    .line 96
    check-cast p2, La/yje;

    .line 97
    .line 98
    invoke-virtual {p0, p1, p2}, La/zvk0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    check-cast p0, La/zvk0;

    .line 103
    .line 104
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 105
    .line 106
    invoke-virtual {p0, p1}, La/zvk0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    return-object p0

    .line 111
    :pswitch_5
    check-cast p1, La/vne;

    .line 112
    .line 113
    check-cast p2, La/yje;

    .line 114
    .line 115
    invoke-virtual {p0, p1, p2}, La/zvk0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    check-cast p0, La/zvk0;

    .line 120
    .line 121
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 122
    .line 123
    invoke-virtual {p0, p1}, La/zvk0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    return-object p0

    .line 128
    nop

    .line 129
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 54

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/zvk0;->i:B

    .line 4
    .line 5
    sget-object v2, La/wsk0;->a:La/wsk0;

    .line 6
    .line 7
    sget-object v5, La/ysk0;->a:La/ysk0;

    .line 8
    .line 9
    sget-object v6, La/vsk0;->a:La/vsk0;

    .line 10
    .line 11
    const-string v7, "call to \'resume\' before \'invoke\' with coroutine"

    .line 12
    .line 13
    iget-object v8, v0, La/zvk0;->k:La/iwk0;

    .line 14
    .line 15
    const/4 v9, 0x0

    .line 16
    const/4 v10, 0x1

    .line 17
    packed-switch v1, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    iget-boolean v0, v0, La/zvk0;->j:Z

    .line 21
    .line 22
    sget-object v1, La/wne;->a:La/wne;

    .line 23
    .line 24
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iget-object v1, v8, La/i3t0;->f:La/oyg0;

    .line 28
    .line 29
    iget-object v5, v8, La/i3t0;->i:La/ocj;

    .line 30
    .line 31
    iget-object v6, v8, La/iwk0;->p:Lorg/xplatform/special_event/impl/special_event_tab/presentation/model/SpecialEventTabScreenParams;

    .line 32
    .line 33
    invoke-virtual {v8}, La/i3t0;->D()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v7

    .line 37
    check-cast v7, La/dvk0;

    .line 38
    .line 39
    if-eqz v0, :cond_40

    .line 40
    .line 41
    iget-object v0, v8, La/iwk0;->k0:La/cmt;

    .line 42
    .line 43
    iget-boolean v7, v6, Lorg/xplatform/special_event/impl/special_event_tab/presentation/model/SpecialEventTabScreenParams;->d:Z

    .line 44
    .line 45
    const/4 v12, 0x7

    .line 46
    const/16 v15, 0xe

    .line 47
    .line 48
    const/4 v4, 0x4

    .line 49
    sget-object v19, La/xsk0;->a:La/xsk0;

    .line 50
    .line 51
    if-eqz v7, :cond_2

    .line 52
    .line 53
    iget-object v7, v8, La/iwk0;->x0:La/c4m0;

    .line 54
    .line 55
    if-eqz v7, :cond_0

    .line 56
    .line 57
    invoke-virtual {v7}, La/pby;->isActive()Z

    .line 58
    .line 59
    .line 60
    move-result v7

    .line 61
    if-ne v7, v10, :cond_0

    .line 62
    .line 63
    move-object/from16 v24, v19

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_0
    invoke-virtual {v8}, La/i3t0;->D()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v7

    .line 70
    check-cast v7, La/dvk0;

    .line 71
    .line 72
    iget-object v7, v7, La/dvk0;->d:La/sdt;

    .line 73
    .line 74
    iget-object v7, v7, La/sdt;->a:La/btk0;

    .line 75
    .line 76
    invoke-static {v7}, La/g7x;->O(La/btk0;)Z

    .line 77
    .line 78
    .line 79
    move-result v7

    .line 80
    if-nez v7, :cond_1

    .line 81
    .line 82
    new-instance v18, La/xrk0;

    .line 83
    .line 84
    sget-object v20, La/iun;->a:La/iun;

    .line 85
    .line 86
    const/16 v23, 0x0

    .line 87
    .line 88
    move-object/from16 v21, v20

    .line 89
    .line 90
    move-object/from16 v22, v20

    .line 91
    .line 92
    invoke-direct/range {v18 .. v23}, La/xrk0;-><init>(La/btk0;Ljava/util/List;Ljava/util/List;Ljava/util/List;Z)V

    .line 93
    .line 94
    .line 95
    move-object/from16 v7, v18

    .line 96
    .line 97
    move-object/from16 v24, v19

    .line 98
    .line 99
    invoke-virtual {v8, v7}, La/iwk0;->W(La/usk0;)V

    .line 100
    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_1
    move-object/from16 v24, v19

    .line 104
    .line 105
    :goto_0
    iget-object v7, v8, La/iwk0;->t0:La/qgd;

    .line 106
    .line 107
    iget-object v13, v7, La/qgd;->b:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast v13, La/e1u;

    .line 110
    .line 111
    invoke-virtual {v13}, La/e1u;->a()La/xp90;

    .line 112
    .line 113
    .line 114
    move-result-object v13

    .line 115
    iget-object v14, v7, La/qgd;->c:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast v14, La/n4u;

    .line 118
    .line 119
    invoke-virtual {v14}, La/n4u;->d()La/xp90;

    .line 120
    .line 121
    .line 122
    move-result-object v14

    .line 123
    iget-object v11, v7, La/qgd;->d:Ljava/lang/Object;

    .line 124
    .line 125
    check-cast v11, La/f4u;

    .line 126
    .line 127
    sget-object v3, La/n0w;->a:La/n0w;

    .line 128
    .line 129
    invoke-virtual {v11, v3}, La/f4u;->a(La/n0w;)La/gmq;

    .line 130
    .line 131
    .line 132
    move-result-object v3

    .line 133
    new-instance v11, La/fl9;

    .line 134
    .line 135
    invoke-direct {v11, v7, v9, v4}, La/fl9;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 136
    .line 137
    .line 138
    invoke-static {v13, v14, v3, v11}, La/dub;->f0(La/gmq;La/gmq;La/gmq;La/ydr;)La/a1g;

    .line 139
    .line 140
    .line 141
    move-result-object v3

    .line 142
    new-instance v11, La/j0s;

    .line 143
    .line 144
    invoke-direct {v11, v7, v9, v15}, La/j0s;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 145
    .line 146
    .line 147
    new-instance v7, La/fnq;

    .line 148
    .line 149
    invoke-direct {v7, v3, v11, v4}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 150
    .line 151
    .line 152
    iget-object v3, v0, La/cmt;->b:Ljava/lang/Object;

    .line 153
    .line 154
    check-cast v3, La/dpi0;

    .line 155
    .line 156
    iget-object v3, v3, La/dpi0;->a:Ljava/lang/Object;

    .line 157
    .line 158
    check-cast v3, La/jtk0;

    .line 159
    .line 160
    iget-object v3, v3, La/jtk0;->a:La/p7m0;

    .line 161
    .line 162
    new-instance v11, La/p4b0;

    .line 163
    .line 164
    invoke-direct {v11, v8, v9, v12}, La/p4b0;-><init>(La/diu0;La/yje;B)V

    .line 165
    .line 166
    .line 167
    new-instance v13, La/p6d;

    .line 168
    .line 169
    invoke-direct {v13, v7, v3, v11, v10}, La/p6d;-><init>(La/gmq;La/gmq;La/xdr;B)V

    .line 170
    .line 171
    .line 172
    const/4 v3, 0x3

    .line 173
    invoke-static {v8, v13, v9, v9, v3}, La/i3t0;->L(La/i3t0;La/gmq;La/lne;Lkotlin/jvm/functions/Function1;I)La/c4m0;

    .line 174
    .line 175
    .line 176
    move-result-object v7

    .line 177
    iput-object v7, v8, La/iwk0;->x0:La/c4m0;

    .line 178
    .line 179
    :goto_1
    invoke-virtual {v8}, La/iwk0;->O()V

    .line 180
    .line 181
    .line 182
    iget-object v3, v8, La/iwk0;->o0:La/edu;

    .line 183
    .line 184
    iget-object v7, v3, La/edu;->c:Ljava/lang/Object;

    .line 185
    .line 186
    check-cast v7, La/ani0;

    .line 187
    .line 188
    iget-object v7, v7, La/ani0;->a:Ljava/lang/Object;

    .line 189
    .line 190
    check-cast v7, La/v8l0;

    .line 191
    .line 192
    iget-object v11, v7, La/v8l0;->f:La/p7m0;

    .line 193
    .line 194
    new-instance v13, La/qaf0;

    .line 195
    .line 196
    const/4 v14, 0x6

    .line 197
    invoke-direct {v13, v11, v14}, La/qaf0;-><init>(La/gmq;B)V

    .line 198
    .line 199
    .line 200
    iget-object v7, v7, La/v8l0;->e:La/p7m0;

    .line 201
    .line 202
    new-instance v11, La/fe0;

    .line 203
    .line 204
    const/16 v14, 0x8

    .line 205
    .line 206
    invoke-direct {v11, v3, v9, v14}, La/fe0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 207
    .line 208
    .line 209
    new-instance v3, La/p6d;

    .line 210
    .line 211
    invoke-direct {v3, v13, v7, v11, v10}, La/p6d;-><init>(La/gmq;La/gmq;La/xdr;B)V

    .line 212
    .line 213
    .line 214
    iget-object v7, v8, La/iwk0;->p0:La/yfu;

    .line 215
    .line 216
    invoke-virtual {v7}, La/yfu;->a()La/p6d;

    .line 217
    .line 218
    .line 219
    move-result-object v7

    .line 220
    new-instance v11, La/ib60;

    .line 221
    .line 222
    invoke-direct {v11, v8, v9, v15}, La/ib60;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 223
    .line 224
    .line 225
    new-instance v13, La/p6d;

    .line 226
    .line 227
    invoke-direct {v13, v3, v7, v11, v10}, La/p6d;-><init>(La/gmq;La/gmq;La/xdr;B)V

    .line 228
    .line 229
    .line 230
    const/4 v3, 0x3

    .line 231
    invoke-static {v8, v13, v9, v9, v3}, La/i3t0;->L(La/i3t0;La/gmq;La/lne;Lkotlin/jvm/functions/Function1;I)La/c4m0;

    .line 232
    .line 233
    .line 234
    iget-object v7, v8, La/iwk0;->r0:La/fhj;

    .line 235
    .line 236
    iget-object v11, v7, La/fhj;->b:Ljava/lang/Object;

    .line 237
    .line 238
    check-cast v11, La/ok50;

    .line 239
    .line 240
    iget-object v11, v11, La/ok50;->a:Ljava/lang/Object;

    .line 241
    .line 242
    check-cast v11, La/gl9;

    .line 243
    .line 244
    iget-object v11, v11, La/gl9;->d:La/a1g;

    .line 245
    .line 246
    new-instance v13, La/i89;

    .line 247
    .line 248
    invoke-direct {v13, v11, v3}, La/i89;-><init>(La/gmq;B)V

    .line 249
    .line 250
    .line 251
    iget-object v7, v7, La/fhj;->a:Ljava/lang/Object;

    .line 252
    .line 253
    check-cast v7, La/dpi0;

    .line 254
    .line 255
    iget-object v7, v7, La/dpi0;->a:Ljava/lang/Object;

    .line 256
    .line 257
    check-cast v7, La/jtk0;

    .line 258
    .line 259
    iget-object v7, v7, La/jtk0;->a:La/p7m0;

    .line 260
    .line 261
    new-instance v11, La/h2c;

    .line 262
    .line 263
    const/16 v14, 0x15

    .line 264
    .line 265
    invoke-direct {v11, v7, v14}, La/h2c;-><init>(La/p7m0;B)V

    .line 266
    .line 267
    .line 268
    new-instance v7, La/yno;

    .line 269
    .line 270
    invoke-direct {v7, v3, v9, v10}, La/yno;-><init>(ILa/yje;B)V

    .line 271
    .line 272
    .line 273
    new-instance v14, La/p6d;

    .line 274
    .line 275
    invoke-direct {v14, v13, v11, v7, v10}, La/p6d;-><init>(La/gmq;La/gmq;La/xdr;B)V

    .line 276
    .line 277
    .line 278
    new-instance v7, La/vvk0;

    .line 279
    .line 280
    const/16 v11, 0xb

    .line 281
    .line 282
    invoke-direct {v7, v8, v9, v11}, La/vvk0;-><init>(La/iwk0;La/yje;B)V

    .line 283
    .line 284
    .line 285
    new-instance v11, La/fnq;

    .line 286
    .line 287
    invoke-direct {v11, v14, v7, v4}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 288
    .line 289
    .line 290
    invoke-static {v8, v11, v9, v9, v3}, La/i3t0;->L(La/i3t0;La/gmq;La/lne;Lkotlin/jvm/functions/Function1;I)La/c4m0;

    .line 291
    .line 292
    .line 293
    iget-object v0, v0, La/cmt;->b:Ljava/lang/Object;

    .line 294
    .line 295
    check-cast v0, La/dpi0;

    .line 296
    .line 297
    iget-object v0, v0, La/dpi0;->a:Ljava/lang/Object;

    .line 298
    .line 299
    check-cast v0, La/jtk0;

    .line 300
    .line 301
    iget-object v0, v0, La/jtk0;->a:La/p7m0;

    .line 302
    .line 303
    new-instance v7, La/vvk0;

    .line 304
    .line 305
    const/16 v11, 0xc

    .line 306
    .line 307
    invoke-direct {v7, v8, v9, v11}, La/vvk0;-><init>(La/iwk0;La/yje;B)V

    .line 308
    .line 309
    .line 310
    new-instance v11, La/fnq;

    .line 311
    .line 312
    invoke-direct {v11, v0, v7, v4}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 313
    .line 314
    .line 315
    invoke-static {v8, v11, v9, v9, v3}, La/i3t0;->L(La/i3t0;La/gmq;La/lne;Lkotlin/jvm/functions/Function1;I)La/c4m0;

    .line 316
    .line 317
    .line 318
    goto :goto_2

    .line 319
    :cond_2
    move-object/from16 v24, v19

    .line 320
    .line 321
    :goto_2
    sget-object v52, La/mtk0;->a:La/mtk0;

    .line 322
    .line 323
    iget-object v0, v5, La/ocj;->a:La/p7m0;

    .line 324
    .line 325
    :goto_3
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 326
    .line 327
    .line 328
    move-result-object v3

    .line 329
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 330
    .line 331
    .line 332
    move-object/from16 v25, v3

    .line 333
    .line 334
    check-cast v25, La/dvk0;

    .line 335
    .line 336
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 337
    .line 338
    .line 339
    const/16 v51, 0x0

    .line 340
    .line 341
    const v53, 0x37ffffff

    .line 342
    .line 343
    .line 344
    const/16 v26, 0x0

    .line 345
    .line 346
    const/16 v27, 0x0

    .line 347
    .line 348
    const/16 v28, 0x0

    .line 349
    .line 350
    const/16 v29, 0x0

    .line 351
    .line 352
    const/16 v30, 0x0

    .line 353
    .line 354
    const/16 v31, 0x0

    .line 355
    .line 356
    const/16 v32, 0x0

    .line 357
    .line 358
    const/16 v33, 0x0

    .line 359
    .line 360
    const/16 v34, 0x0

    .line 361
    .line 362
    const/16 v35, 0x0

    .line 363
    .line 364
    const/16 v36, 0x0

    .line 365
    .line 366
    const/16 v37, 0x0

    .line 367
    .line 368
    const/16 v38, 0x0

    .line 369
    .line 370
    const/16 v39, 0x0

    .line 371
    .line 372
    const/16 v40, 0x0

    .line 373
    .line 374
    const/16 v41, 0x0

    .line 375
    .line 376
    const/16 v42, 0x0

    .line 377
    .line 378
    const/16 v43, 0x0

    .line 379
    .line 380
    const/16 v44, 0x0

    .line 381
    .line 382
    const/16 v45, 0x0

    .line 383
    .line 384
    const/16 v46, 0x0

    .line 385
    .line 386
    const/16 v47, 0x0

    .line 387
    .line 388
    const/16 v48, 0x0

    .line 389
    .line 390
    const/16 v49, 0x0

    .line 391
    .line 392
    const/16 v50, 0x0

    .line 393
    .line 394
    invoke-static/range {v25 .. v53}, La/dvk0;->a(La/dvk0;ZLa/xl9;La/a9l0;La/sdt;La/ptk0;La/cvk0;La/gvk0;La/evk0;La/lpp0;La/pvk0;La/rtk0;La/fvk0;La/bvk0;La/otk0;La/jwk0;La/gqk0;La/gtk0;La/ltk0;La/etk0;La/qtk0;La/ntk0;La/dtk0;La/avk0;La/ctk0;La/stk0;La/wcb;La/mtk0;I)La/dvk0;

    .line 395
    .line 396
    .line 397
    move-result-object v5

    .line 398
    invoke-virtual {v0, v3, v5}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 399
    .line 400
    .line 401
    move-result v3

    .line 402
    if-eqz v3, :cond_3f

    .line 403
    .line 404
    iget-object v0, v8, La/iwk0;->r:La/mne;

    .line 405
    .line 406
    invoke-virtual {v8}, La/i3t0;->D()Ljava/lang/Object;

    .line 407
    .line 408
    .line 409
    move-result-object v1

    .line 410
    check-cast v1, La/dvk0;

    .line 411
    .line 412
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 413
    .line 414
    .line 415
    iget-object v1, v1, La/dvk0;->e:Ljava/util/List;

    .line 416
    .line 417
    new-instance v3, Ljava/util/ArrayList;

    .line 418
    .line 419
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 420
    .line 421
    .line 422
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 423
    .line 424
    .line 425
    move-result-object v1

    .line 426
    :cond_3
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 427
    .line 428
    .line 429
    move-result v5

    .line 430
    if-eqz v5, :cond_4

    .line 431
    .line 432
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 433
    .line 434
    .line 435
    move-result-object v5

    .line 436
    instance-of v7, v5, La/quk0;

    .line 437
    .line 438
    if-eqz v7, :cond_3

    .line 439
    .line 440
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 441
    .line 442
    .line 443
    goto :goto_4

    .line 444
    :cond_4
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 445
    .line 446
    .line 447
    move-result-object v1

    .line 448
    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 449
    .line 450
    .line 451
    move-result v3

    .line 452
    if-eqz v3, :cond_42

    .line 453
    .line 454
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 455
    .line 456
    .line 457
    move-result-object v3

    .line 458
    check-cast v3, La/quk0;

    .line 459
    .line 460
    if-eqz v3, :cond_3e

    .line 461
    .line 462
    instance-of v5, v3, La/juk0;

    .line 463
    .line 464
    const-class v7, La/iwk0;

    .line 465
    .line 466
    if-eqz v5, :cond_6

    .line 467
    .line 468
    iget-object v3, v8, La/iwk0;->D0:La/bby;

    .line 469
    .line 470
    invoke-static {v3}, La/v3c;->N(La/bby;)V

    .line 471
    .line 472
    .line 473
    invoke-virtual {v8}, La/i3t0;->D()Ljava/lang/Object;

    .line 474
    .line 475
    .line 476
    move-result-object v3

    .line 477
    check-cast v3, La/dvk0;

    .line 478
    .line 479
    iget-object v3, v3, La/dvk0;->m:La/fvk0;

    .line 480
    .line 481
    iget-object v3, v3, La/fvk0;->a:La/btk0;

    .line 482
    .line 483
    invoke-static {v3}, La/g7x;->O(La/btk0;)Z

    .line 484
    .line 485
    .line 486
    move-result v3

    .line 487
    if-nez v3, :cond_5

    .line 488
    .line 489
    sget-object v3, La/iun;->a:La/iun;

    .line 490
    .line 491
    new-instance v5, La/qsk0;

    .line 492
    .line 493
    move-object/from16 v11, v24

    .line 494
    .line 495
    invoke-direct {v5, v11, v3, v3, v3}, La/qsk0;-><init>(La/btk0;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 496
    .line 497
    .line 498
    invoke-virtual {v8, v5}, La/iwk0;->W(La/usk0;)V

    .line 499
    .line 500
    .line 501
    goto :goto_6

    .line 502
    :cond_5
    move-object/from16 v11, v24

    .line 503
    .line 504
    :goto_6
    invoke-static {v8}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 505
    .line 506
    .line 507
    move-result-object v21

    .line 508
    invoke-virtual {v7}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 509
    .line 510
    .line 511
    move-result-object v3

    .line 512
    const-string v5, ".loadTopPlayers"

    .line 513
    .line 514
    invoke-virtual {v3, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 515
    .line 516
    .line 517
    move-result-object v22

    .line 518
    iget-object v3, v0, La/mne;->a:La/rwj;

    .line 519
    .line 520
    new-instance v5, La/rvk0;

    .line 521
    .line 522
    const/16 v7, 0xa

    .line 523
    .line 524
    invoke-direct {v5, v8, v7}, La/rvk0;-><init>(La/iwk0;B)V

    .line 525
    .line 526
    .line 527
    new-instance v7, La/zvk0;

    .line 528
    .line 529
    invoke-direct {v7, v8, v9, v4}, La/zvk0;-><init>(La/iwk0;La/yje;B)V

    .line 530
    .line 531
    .line 532
    const/16 v26, 0x50

    .line 533
    .line 534
    move-object/from16 v23, v3

    .line 535
    .line 536
    move-object/from16 v24, v5

    .line 537
    .line 538
    move-object/from16 v25, v7

    .line 539
    .line 540
    invoke-static/range {v21 .. v26}, La/sac;->g0(La/bvc;Ljava/lang/String;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 541
    .line 542
    .line 543
    move-result-object v3

    .line 544
    iput-object v3, v8, La/iwk0;->D0:La/bby;

    .line 545
    .line 546
    :goto_7
    move/from16 v21, v12

    .line 547
    .line 548
    const/4 v10, 0x3

    .line 549
    const/16 v12, 0xc

    .line 550
    .line 551
    const/16 v18, 0x8

    .line 552
    .line 553
    :goto_8
    const/16 v19, 0x6

    .line 554
    .line 555
    goto/16 :goto_1a

    .line 556
    .line 557
    :cond_6
    move-object/from16 v11, v24

    .line 558
    .line 559
    instance-of v5, v3, La/huk0;

    .line 560
    .line 561
    if-eqz v5, :cond_7

    .line 562
    .line 563
    invoke-virtual {v8}, La/iwk0;->O()V

    .line 564
    .line 565
    .line 566
    goto :goto_7

    .line 567
    :cond_7
    instance-of v5, v3, La/cuk0;

    .line 568
    .line 569
    const/4 v13, 0x2

    .line 570
    if-eqz v5, :cond_9

    .line 571
    .line 572
    iget-object v3, v8, La/iwk0;->E0:La/bby;

    .line 573
    .line 574
    invoke-static {v3}, La/v3c;->N(La/bby;)V

    .line 575
    .line 576
    .line 577
    invoke-virtual {v8}, La/i3t0;->D()Ljava/lang/Object;

    .line 578
    .line 579
    .line 580
    move-result-object v3

    .line 581
    check-cast v3, La/dvk0;

    .line 582
    .line 583
    iget-object v3, v3, La/dvk0;->o:La/otk0;

    .line 584
    .line 585
    iget-object v3, v3, La/otk0;->a:La/btk0;

    .line 586
    .line 587
    invoke-static {v3}, La/g7x;->O(La/btk0;)Z

    .line 588
    .line 589
    .line 590
    move-result v3

    .line 591
    if-nez v3, :cond_8

    .line 592
    .line 593
    new-instance v3, La/hsk0;

    .line 594
    .line 595
    sget-object v5, La/iun;->a:La/iun;

    .line 596
    .line 597
    invoke-direct {v3, v11, v5}, La/hsk0;-><init>(La/btk0;Ljava/util/List;)V

    .line 598
    .line 599
    .line 600
    invoke-virtual {v8, v3}, La/iwk0;->W(La/usk0;)V

    .line 601
    .line 602
    .line 603
    :cond_8
    invoke-static {v8}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 604
    .line 605
    .line 606
    move-result-object v21

    .line 607
    invoke-virtual {v7}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 608
    .line 609
    .line 610
    move-result-object v3

    .line 611
    const-string v5, ".loadMedalsTable"

    .line 612
    .line 613
    invoke-virtual {v3, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 614
    .line 615
    .line 616
    move-result-object v22

    .line 617
    iget-object v3, v0, La/mne;->a:La/rwj;

    .line 618
    .line 619
    new-instance v5, La/rvk0;

    .line 620
    .line 621
    invoke-direct {v5, v8, v13}, La/rvk0;-><init>(La/iwk0;B)V

    .line 622
    .line 623
    .line 624
    new-instance v7, La/zvk0;

    .line 625
    .line 626
    const/4 v13, 0x0

    .line 627
    invoke-direct {v7, v8, v9, v13}, La/zvk0;-><init>(La/iwk0;La/yje;B)V

    .line 628
    .line 629
    .line 630
    const/16 v26, 0x50

    .line 631
    .line 632
    move-object/from16 v23, v3

    .line 633
    .line 634
    move-object/from16 v24, v5

    .line 635
    .line 636
    move-object/from16 v25, v7

    .line 637
    .line 638
    invoke-static/range {v21 .. v26}, La/sac;->g0(La/bvc;Ljava/lang/String;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 639
    .line 640
    .line 641
    move-result-object v3

    .line 642
    iput-object v3, v8, La/iwk0;->E0:La/bby;

    .line 643
    .line 644
    goto :goto_7

    .line 645
    :cond_9
    instance-of v5, v3, La/ztk0;

    .line 646
    .line 647
    const/4 v14, 0x5

    .line 648
    if-eqz v5, :cond_c

    .line 649
    .line 650
    iget-object v3, v8, La/iwk0;->z0:La/bby;

    .line 651
    .line 652
    if-eqz v3, :cond_a

    .line 653
    .line 654
    invoke-static {v3}, La/v3c;->N(La/bby;)V

    .line 655
    .line 656
    .line 657
    :cond_a
    invoke-virtual {v8}, La/i3t0;->D()Ljava/lang/Object;

    .line 658
    .line 659
    .line 660
    move-result-object v3

    .line 661
    check-cast v3, La/dvk0;

    .line 662
    .line 663
    iget-object v3, v3, La/dvk0;->k:La/pvk0;

    .line 664
    .line 665
    iget-object v3, v3, La/pvk0;->a:La/btk0;

    .line 666
    .line 667
    invoke-static {v3}, La/g7x;->O(La/btk0;)Z

    .line 668
    .line 669
    .line 670
    move-result v3

    .line 671
    if-nez v3, :cond_b

    .line 672
    .line 673
    new-instance v3, La/ssk0;

    .line 674
    .line 675
    sget-object v5, La/iun;->a:La/iun;

    .line 676
    .line 677
    invoke-direct {v3, v11, v5}, La/ssk0;-><init>(La/btk0;Ljava/util/List;)V

    .line 678
    .line 679
    .line 680
    invoke-virtual {v8, v3}, La/iwk0;->W(La/usk0;)V

    .line 681
    .line 682
    .line 683
    :cond_b
    invoke-static {v8}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 684
    .line 685
    .line 686
    move-result-object v21

    .line 687
    invoke-virtual {v7}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 688
    .line 689
    .line 690
    move-result-object v3

    .line 691
    const-string v5, ".loadVenues"

    .line 692
    .line 693
    invoke-virtual {v3, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 694
    .line 695
    .line 696
    move-result-object v22

    .line 697
    iget-object v3, v0, La/mne;->a:La/rwj;

    .line 698
    .line 699
    new-instance v5, La/rvk0;

    .line 700
    .line 701
    const/16 v7, 0xb

    .line 702
    .line 703
    invoke-direct {v5, v8, v7}, La/rvk0;-><init>(La/iwk0;B)V

    .line 704
    .line 705
    .line 706
    new-instance v7, La/zvk0;

    .line 707
    .line 708
    invoke-direct {v7, v8, v9, v14}, La/zvk0;-><init>(La/iwk0;La/yje;B)V

    .line 709
    .line 710
    .line 711
    const/16 v26, 0x50

    .line 712
    .line 713
    move-object/from16 v23, v3

    .line 714
    .line 715
    move-object/from16 v24, v5

    .line 716
    .line 717
    move-object/from16 v25, v7

    .line 718
    .line 719
    invoke-static/range {v21 .. v26}, La/sac;->g0(La/bvc;Ljava/lang/String;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 720
    .line 721
    .line 722
    move-result-object v3

    .line 723
    iput-object v3, v8, La/iwk0;->z0:La/bby;

    .line 724
    .line 725
    goto/16 :goto_7

    .line 726
    .line 727
    :cond_c
    instance-of v5, v3, La/iuk0;

    .line 728
    .line 729
    const/16 v12, 0x9

    .line 730
    .line 731
    if-eqz v5, :cond_f

    .line 732
    .line 733
    iget-object v3, v8, La/iwk0;->y0:La/c4m0;

    .line 734
    .line 735
    if-eqz v3, :cond_d

    .line 736
    .line 737
    invoke-virtual {v3}, La/pby;->isActive()Z

    .line 738
    .line 739
    .line 740
    move-result v3

    .line 741
    if-ne v3, v10, :cond_d

    .line 742
    .line 743
    goto :goto_9

    .line 744
    :cond_d
    invoke-virtual {v8}, La/i3t0;->D()Ljava/lang/Object;

    .line 745
    .line 746
    .line 747
    move-result-object v3

    .line 748
    check-cast v3, La/dvk0;

    .line 749
    .line 750
    iget-object v3, v3, La/dvk0;->i:La/evk0;

    .line 751
    .line 752
    iget-object v3, v3, La/evk0;->a:La/btk0;

    .line 753
    .line 754
    invoke-static {v3}, La/g7x;->O(La/btk0;)Z

    .line 755
    .line 756
    .line 757
    move-result v3

    .line 758
    if-nez v3, :cond_e

    .line 759
    .line 760
    new-instance v3, La/psk0;

    .line 761
    .line 762
    sget-object v5, La/iun;->a:La/iun;

    .line 763
    .line 764
    invoke-direct {v3, v11, v5}, La/psk0;-><init>(La/btk0;Ljava/util/List;)V

    .line 765
    .line 766
    .line 767
    invoke-virtual {v8, v3}, La/iwk0;->W(La/usk0;)V

    .line 768
    .line 769
    .line 770
    :cond_e
    iget-object v3, v8, La/iwk0;->s:La/nyu;

    .line 771
    .line 772
    iget v5, v6, Lorg/xplatform/special_event/impl/special_event_tab/presentation/model/SpecialEventTabScreenParams;->a:I

    .line 773
    .line 774
    invoke-virtual {v3, v5}, La/nyu;->a(I)La/p6d;

    .line 775
    .line 776
    .line 777
    move-result-object v3

    .line 778
    invoke-virtual {v7}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 779
    .line 780
    .line 781
    move-result-object v5

    .line 782
    const-string v7, ".loadTeams"

    .line 783
    .line 784
    invoke-virtual {v5, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 785
    .line 786
    .line 787
    move-result-object v5

    .line 788
    const/16 v7, 0x38

    .line 789
    .line 790
    invoke-static {v3, v5, v9, v7}, La/bkb;->j0(La/gmq;Ljava/lang/String;Ljava/util/List;I)La/a1g;

    .line 791
    .line 792
    .line 793
    move-result-object v3

    .line 794
    new-instance v5, La/vvk0;

    .line 795
    .line 796
    const/16 v14, 0x8

    .line 797
    .line 798
    invoke-direct {v5, v8, v9, v14}, La/vvk0;-><init>(La/iwk0;La/yje;B)V

    .line 799
    .line 800
    .line 801
    new-instance v7, La/fnq;

    .line 802
    .line 803
    invoke-direct {v7, v3, v5, v4}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 804
    .line 805
    .line 806
    invoke-static {v8}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 807
    .line 808
    .line 809
    move-result-object v3

    .line 810
    iget-object v5, v0, La/mne;->a:La/rwj;

    .line 811
    .line 812
    invoke-static {v3, v5}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 813
    .line 814
    .line 815
    move-result-object v3

    .line 816
    new-instance v5, La/vvk0;

    .line 817
    .line 818
    invoke-direct {v5, v8, v9, v12}, La/vvk0;-><init>(La/iwk0;La/yje;B)V

    .line 819
    .line 820
    .line 821
    invoke-static {v7, v3, v5}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 822
    .line 823
    .line 824
    move-result-object v3

    .line 825
    iput-object v3, v8, La/iwk0;->y0:La/c4m0;

    .line 826
    .line 827
    :goto_9
    const/4 v10, 0x3

    .line 828
    const/16 v12, 0xc

    .line 829
    .line 830
    const/16 v18, 0x8

    .line 831
    .line 832
    :goto_a
    const/16 v19, 0x6

    .line 833
    .line 834
    const/16 v21, 0x7

    .line 835
    .line 836
    goto/16 :goto_1a

    .line 837
    .line 838
    :cond_f
    instance-of v5, v3, La/kuk0;

    .line 839
    .line 840
    const/16 v12, 0xd

    .line 841
    .line 842
    if-eqz v5, :cond_11

    .line 843
    .line 844
    iget-object v3, v8, La/iwk0;->R0:La/c4m0;

    .line 845
    .line 846
    invoke-static {v3}, La/v3c;->N(La/bby;)V

    .line 847
    .line 848
    .line 849
    invoke-virtual {v8}, La/i3t0;->D()Ljava/lang/Object;

    .line 850
    .line 851
    .line 852
    move-result-object v3

    .line 853
    check-cast v3, La/dvk0;

    .line 854
    .line 855
    iget-object v3, v3, La/dvk0;->p:La/jwk0;

    .line 856
    .line 857
    iget-object v3, v3, La/jwk0;->a:La/btk0;

    .line 858
    .line 859
    invoke-static {v3}, La/g7x;->O(La/btk0;)Z

    .line 860
    .line 861
    .line 862
    move-result v3

    .line 863
    if-nez v3, :cond_10

    .line 864
    .line 865
    new-instance v3, La/tsk0;

    .line 866
    .line 867
    sget-object v5, La/iun;->a:La/iun;

    .line 868
    .line 869
    invoke-direct {v3, v11, v5}, La/tsk0;-><init>(La/btk0;Ljava/util/List;)V

    .line 870
    .line 871
    .line 872
    invoke-virtual {v8, v3}, La/iwk0;->W(La/usk0;)V

    .line 873
    .line 874
    .line 875
    :cond_10
    iget-object v3, v8, La/iwk0;->N:La/awu;

    .line 876
    .line 877
    invoke-virtual {v3}, La/awu;->a()La/a1g;

    .line 878
    .line 879
    .line 880
    move-result-object v3

    .line 881
    new-instance v5, La/vvk0;

    .line 882
    .line 883
    invoke-direct {v5, v8, v9, v12}, La/vvk0;-><init>(La/iwk0;La/yje;B)V

    .line 884
    .line 885
    .line 886
    new-instance v7, La/fnq;

    .line 887
    .line 888
    invoke-direct {v7, v3, v5, v4}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 889
    .line 890
    .line 891
    const/4 v3, 0x3

    .line 892
    invoke-static {v8, v7, v9, v9, v3}, La/i3t0;->L(La/i3t0;La/gmq;La/lne;Lkotlin/jvm/functions/Function1;I)La/c4m0;

    .line 893
    .line 894
    .line 895
    move-result-object v5

    .line 896
    iput-object v5, v8, La/iwk0;->R0:La/c4m0;

    .line 897
    .line 898
    goto :goto_9

    .line 899
    :cond_11
    instance-of v5, v3, La/euk0;

    .line 900
    .line 901
    if-eqz v5, :cond_14

    .line 902
    .line 903
    iget-object v3, v8, La/iwk0;->A0:La/bby;

    .line 904
    .line 905
    if-eqz v3, :cond_12

    .line 906
    .line 907
    invoke-interface {v3}, La/bby;->isActive()Z

    .line 908
    .line 909
    .line 910
    move-result v3

    .line 911
    if-ne v3, v10, :cond_12

    .line 912
    .line 913
    goto :goto_9

    .line 914
    :cond_12
    invoke-virtual {v8}, La/i3t0;->D()Ljava/lang/Object;

    .line 915
    .line 916
    .line 917
    move-result-object v3

    .line 918
    check-cast v3, La/dvk0;

    .line 919
    .line 920
    iget-object v3, v3, La/dvk0;->l:La/rtk0;

    .line 921
    .line 922
    iget-object v3, v3, La/rtk0;->a:La/btk0;

    .line 923
    .line 924
    invoke-static {v3}, La/g7x;->O(La/btk0;)Z

    .line 925
    .line 926
    .line 927
    move-result v3

    .line 928
    if-nez v3, :cond_13

    .line 929
    .line 930
    new-instance v3, La/ksk0;

    .line 931
    .line 932
    sget-object v5, La/iun;->a:La/iun;

    .line 933
    .line 934
    invoke-direct {v3, v11, v5}, La/ksk0;-><init>(La/btk0;Ljava/util/List;)V

    .line 935
    .line 936
    .line 937
    invoke-virtual {v8, v3}, La/iwk0;->W(La/usk0;)V

    .line 938
    .line 939
    .line 940
    :cond_13
    invoke-static {v8}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 941
    .line 942
    .line 943
    move-result-object v22

    .line 944
    invoke-virtual {v7}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 945
    .line 946
    .line 947
    move-result-object v3

    .line 948
    const-string v5, ".loadPromotions"

    .line 949
    .line 950
    invoke-virtual {v3, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 951
    .line 952
    .line 953
    move-result-object v23

    .line 954
    iget-object v3, v0, La/mne;->a:La/rwj;

    .line 955
    .line 956
    new-instance v5, La/rvk0;

    .line 957
    .line 958
    invoke-direct {v5, v8, v10}, La/rvk0;-><init>(La/iwk0;B)V

    .line 959
    .line 960
    .line 961
    new-instance v7, La/zvk0;

    .line 962
    .line 963
    invoke-direct {v7, v8, v9, v10}, La/zvk0;-><init>(La/iwk0;La/yje;B)V

    .line 964
    .line 965
    .line 966
    const/16 v27, 0x50

    .line 967
    .line 968
    move-object/from16 v24, v3

    .line 969
    .line 970
    move-object/from16 v25, v5

    .line 971
    .line 972
    move-object/from16 v26, v7

    .line 973
    .line 974
    invoke-static/range {v22 .. v27}, La/sac;->g0(La/bvc;Ljava/lang/String;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 975
    .line 976
    .line 977
    move-result-object v3

    .line 978
    iput-object v3, v8, La/iwk0;->A0:La/bby;

    .line 979
    .line 980
    goto/16 :goto_9

    .line 981
    .line 982
    :cond_14
    instance-of v5, v3, La/muk0;

    .line 983
    .line 984
    if-eqz v5, :cond_15

    .line 985
    .line 986
    sget-object v3, La/isk0;->a:La/isk0;

    .line 987
    .line 988
    invoke-virtual {v8, v3}, La/iwk0;->W(La/usk0;)V

    .line 989
    .line 990
    .line 991
    goto/16 :goto_9

    .line 992
    .line 993
    :cond_15
    instance-of v5, v3, La/nuk0;

    .line 994
    .line 995
    if-eqz v5, :cond_16

    .line 996
    .line 997
    sget-object v3, La/osk0;->a:La/osk0;

    .line 998
    .line 999
    invoke-virtual {v8, v3}, La/iwk0;->W(La/usk0;)V

    .line 1000
    .line 1001
    .line 1002
    goto/16 :goto_9

    .line 1003
    .line 1004
    :cond_16
    instance-of v5, v3, La/ouk0;

    .line 1005
    .line 1006
    if-eqz v5, :cond_17

    .line 1007
    .line 1008
    sget-object v3, La/rsk0;->a:La/rsk0;

    .line 1009
    .line 1010
    invoke-virtual {v8, v3}, La/iwk0;->W(La/usk0;)V

    .line 1011
    .line 1012
    .line 1013
    goto/16 :goto_9

    .line 1014
    .line 1015
    :cond_17
    instance-of v5, v3, La/ytk0;

    .line 1016
    .line 1017
    const-wide/16 v23, 0x28

    .line 1018
    .line 1019
    if-eqz v5, :cond_1a

    .line 1020
    .line 1021
    invoke-virtual {v8}, La/i3t0;->D()Ljava/lang/Object;

    .line 1022
    .line 1023
    .line 1024
    move-result-object v3

    .line 1025
    check-cast v3, La/dvk0;

    .line 1026
    .line 1027
    iget-object v3, v3, La/dvk0;->C:La/ttk0;

    .line 1028
    .line 1029
    iget-wide v12, v3, La/ttk0;->d:J

    .line 1030
    .line 1031
    cmp-long v3, v12, v23

    .line 1032
    .line 1033
    if-eqz v3, :cond_18

    .line 1034
    .line 1035
    new-instance v3, La/bsk0;

    .line 1036
    .line 1037
    sget-object v5, La/iun;->a:La/iun;

    .line 1038
    .line 1039
    invoke-direct {v3, v2, v5}, La/bsk0;-><init>(La/btk0;Ljava/util/List;)V

    .line 1040
    .line 1041
    .line 1042
    invoke-virtual {v8, v3}, La/iwk0;->W(La/usk0;)V

    .line 1043
    .line 1044
    .line 1045
    goto/16 :goto_9

    .line 1046
    .line 1047
    :cond_18
    iget-object v3, v8, La/iwk0;->F0:La/c4m0;

    .line 1048
    .line 1049
    invoke-static {v3}, La/v3c;->N(La/bby;)V

    .line 1050
    .line 1051
    .line 1052
    invoke-virtual {v8}, La/i3t0;->D()Ljava/lang/Object;

    .line 1053
    .line 1054
    .line 1055
    move-result-object v3

    .line 1056
    check-cast v3, La/dvk0;

    .line 1057
    .line 1058
    iget-object v3, v3, La/dvk0;->r:La/gtk0;

    .line 1059
    .line 1060
    iget-object v3, v3, La/gtk0;->a:La/btk0;

    .line 1061
    .line 1062
    invoke-static {v3}, La/g7x;->O(La/btk0;)Z

    .line 1063
    .line 1064
    .line 1065
    move-result v3

    .line 1066
    if-nez v3, :cond_19

    .line 1067
    .line 1068
    new-instance v3, La/bsk0;

    .line 1069
    .line 1070
    sget-object v5, La/iun;->a:La/iun;

    .line 1071
    .line 1072
    invoke-direct {v3, v11, v5}, La/bsk0;-><init>(La/btk0;Ljava/util/List;)V

    .line 1073
    .line 1074
    .line 1075
    invoke-virtual {v8, v3}, La/iwk0;->W(La/usk0;)V

    .line 1076
    .line 1077
    .line 1078
    :cond_19
    iget-object v3, v8, La/iwk0;->R:La/o6u;

    .line 1079
    .line 1080
    iget v5, v6, Lorg/xplatform/special_event/impl/special_event_tab/presentation/model/SpecialEventTabScreenParams;->a:I

    .line 1081
    .line 1082
    iget-object v3, v3, La/o6u;->a:La/l6l;

    .line 1083
    .line 1084
    invoke-virtual {v3}, La/l6l;->a()La/i89;

    .line 1085
    .line 1086
    .line 1087
    move-result-object v3

    .line 1088
    new-instance v5, La/fc4;

    .line 1089
    .line 1090
    const/16 v7, 0x10

    .line 1091
    .line 1092
    invoke-direct {v5, v3, v7}, La/fc4;-><init>(La/i89;B)V

    .line 1093
    .line 1094
    .line 1095
    new-instance v3, La/vvk0;

    .line 1096
    .line 1097
    invoke-direct {v3, v8, v9, v4}, La/vvk0;-><init>(La/iwk0;La/yje;B)V

    .line 1098
    .line 1099
    .line 1100
    new-instance v7, La/fnq;

    .line 1101
    .line 1102
    invoke-direct {v7, v5, v3, v4}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 1103
    .line 1104
    .line 1105
    const/4 v3, 0x3

    .line 1106
    invoke-static {v8, v7, v9, v9, v3}, La/i3t0;->L(La/i3t0;La/gmq;La/lne;Lkotlin/jvm/functions/Function1;I)La/c4m0;

    .line 1107
    .line 1108
    .line 1109
    move-result-object v5

    .line 1110
    iput-object v5, v8, La/iwk0;->F0:La/c4m0;

    .line 1111
    .line 1112
    goto/16 :goto_9

    .line 1113
    .line 1114
    :cond_1a
    instance-of v5, v3, La/auk0;

    .line 1115
    .line 1116
    if-eqz v5, :cond_1d

    .line 1117
    .line 1118
    invoke-virtual {v8}, La/i3t0;->D()Ljava/lang/Object;

    .line 1119
    .line 1120
    .line 1121
    move-result-object v3

    .line 1122
    check-cast v3, La/dvk0;

    .line 1123
    .line 1124
    iget-object v3, v3, La/dvk0;->C:La/ttk0;

    .line 1125
    .line 1126
    iget-wide v12, v3, La/ttk0;->d:J

    .line 1127
    .line 1128
    cmp-long v3, v12, v23

    .line 1129
    .line 1130
    if-eqz v3, :cond_1b

    .line 1131
    .line 1132
    new-instance v3, La/fsk0;

    .line 1133
    .line 1134
    sget-object v5, La/iun;->a:La/iun;

    .line 1135
    .line 1136
    invoke-direct {v3, v2, v5}, La/fsk0;-><init>(La/btk0;Ljava/util/List;)V

    .line 1137
    .line 1138
    .line 1139
    invoke-virtual {v8, v3}, La/iwk0;->W(La/usk0;)V

    .line 1140
    .line 1141
    .line 1142
    goto/16 :goto_9

    .line 1143
    .line 1144
    :cond_1b
    iget-object v3, v8, La/iwk0;->G0:La/c4m0;

    .line 1145
    .line 1146
    invoke-static {v3}, La/v3c;->N(La/bby;)V

    .line 1147
    .line 1148
    .line 1149
    invoke-virtual {v8}, La/i3t0;->D()Ljava/lang/Object;

    .line 1150
    .line 1151
    .line 1152
    move-result-object v3

    .line 1153
    check-cast v3, La/dvk0;

    .line 1154
    .line 1155
    iget-object v3, v3, La/dvk0;->s:La/ltk0;

    .line 1156
    .line 1157
    iget-object v3, v3, La/ltk0;->a:La/btk0;

    .line 1158
    .line 1159
    invoke-static {v3}, La/g7x;->O(La/btk0;)Z

    .line 1160
    .line 1161
    .line 1162
    move-result v3

    .line 1163
    if-nez v3, :cond_1c

    .line 1164
    .line 1165
    new-instance v3, La/fsk0;

    .line 1166
    .line 1167
    sget-object v5, La/iun;->a:La/iun;

    .line 1168
    .line 1169
    invoke-direct {v3, v11, v5}, La/fsk0;-><init>(La/btk0;Ljava/util/List;)V

    .line 1170
    .line 1171
    .line 1172
    invoke-virtual {v8, v3}, La/iwk0;->W(La/usk0;)V

    .line 1173
    .line 1174
    .line 1175
    :cond_1c
    iget-object v3, v8, La/iwk0;->S:La/iju;

    .line 1176
    .line 1177
    iget v5, v6, Lorg/xplatform/special_event/impl/special_event_tab/presentation/model/SpecialEventTabScreenParams;->a:I

    .line 1178
    .line 1179
    iget-object v3, v3, La/iju;->a:La/f310;

    .line 1180
    .line 1181
    invoke-virtual {v3}, La/f310;->a()La/i89;

    .line 1182
    .line 1183
    .line 1184
    move-result-object v3

    .line 1185
    new-instance v5, La/fc4;

    .line 1186
    .line 1187
    const/16 v7, 0x18

    .line 1188
    .line 1189
    invoke-direct {v5, v3, v7}, La/fc4;-><init>(La/i89;B)V

    .line 1190
    .line 1191
    .line 1192
    new-instance v3, La/vvk0;

    .line 1193
    .line 1194
    invoke-direct {v3, v8, v9, v14}, La/vvk0;-><init>(La/iwk0;La/yje;B)V

    .line 1195
    .line 1196
    .line 1197
    new-instance v7, La/fnq;

    .line 1198
    .line 1199
    invoke-direct {v7, v5, v3, v4}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 1200
    .line 1201
    .line 1202
    const/4 v3, 0x3

    .line 1203
    invoke-static {v8, v7, v9, v9, v3}, La/i3t0;->L(La/i3t0;La/gmq;La/lne;Lkotlin/jvm/functions/Function1;I)La/c4m0;

    .line 1204
    .line 1205
    .line 1206
    move-result-object v5

    .line 1207
    iput-object v5, v8, La/iwk0;->G0:La/c4m0;

    .line 1208
    .line 1209
    goto/16 :goto_9

    .line 1210
    .line 1211
    :cond_1d
    instance-of v5, v3, La/utk0;

    .line 1212
    .line 1213
    const-string v7, "sub sport not found"

    .line 1214
    .line 1215
    const-wide/16 v25, 0x2

    .line 1216
    .line 1217
    const-wide/16 v27, 0x1

    .line 1218
    .line 1219
    const-wide/16 v29, 0x2e

    .line 1220
    .line 1221
    if-eqz v5, :cond_22

    .line 1222
    .line 1223
    iget-object v3, v8, La/iwk0;->H0:La/c4m0;

    .line 1224
    .line 1225
    invoke-static {v3}, La/v3c;->N(La/bby;)V

    .line 1226
    .line 1227
    .line 1228
    invoke-virtual {v8}, La/i3t0;->D()Ljava/lang/Object;

    .line 1229
    .line 1230
    .line 1231
    move-result-object v3

    .line 1232
    check-cast v3, La/dvk0;

    .line 1233
    .line 1234
    iget-object v3, v3, La/dvk0;->q:La/gqk0;

    .line 1235
    .line 1236
    iget-object v3, v3, La/gqk0;->a:La/btk0;

    .line 1237
    .line 1238
    invoke-static {v3}, La/g7x;->O(La/btk0;)Z

    .line 1239
    .line 1240
    .line 1241
    move-result v3

    .line 1242
    if-nez v3, :cond_1e

    .line 1243
    .line 1244
    new-instance v3, La/wrk0;

    .line 1245
    .line 1246
    invoke-direct {v3, v11, v9}, La/wrk0;-><init>(La/btk0;La/o0;)V

    .line 1247
    .line 1248
    .line 1249
    invoke-virtual {v8, v3}, La/iwk0;->W(La/usk0;)V

    .line 1250
    .line 1251
    .line 1252
    :cond_1e
    iget-object v3, v8, La/iwk0;->Q:La/es;

    .line 1253
    .line 1254
    iget v5, v6, Lorg/xplatform/special_event/impl/special_event_tab/presentation/model/SpecialEventTabScreenParams;->a:I

    .line 1255
    .line 1256
    invoke-virtual {v8}, La/i3t0;->D()Ljava/lang/Object;

    .line 1257
    .line 1258
    .line 1259
    move-result-object v5

    .line 1260
    check-cast v5, La/dvk0;

    .line 1261
    .line 1262
    iget-object v5, v5, La/dvk0;->C:La/ttk0;

    .line 1263
    .line 1264
    iget-wide v12, v5, La/ttk0;->e:J

    .line 1265
    .line 1266
    cmp-long v5, v12, v27

    .line 1267
    .line 1268
    if-nez v5, :cond_1f

    .line 1269
    .line 1270
    iget-object v3, v3, La/es;->b:Ljava/lang/Object;

    .line 1271
    .line 1272
    check-cast v3, La/g6u;

    .line 1273
    .line 1274
    iget-object v3, v3, La/g6u;->a:La/l6l;

    .line 1275
    .line 1276
    invoke-virtual {v3}, La/l6l;->a()La/i89;

    .line 1277
    .line 1278
    .line 1279
    move-result-object v3

    .line 1280
    new-instance v5, La/fc4;

    .line 1281
    .line 1282
    invoke-direct {v5, v3, v15}, La/fc4;-><init>(La/i89;B)V

    .line 1283
    .line 1284
    .line 1285
    :goto_b
    const/16 v12, 0x8

    .line 1286
    .line 1287
    goto :goto_c

    .line 1288
    :cond_1f
    cmp-long v5, v12, v25

    .line 1289
    .line 1290
    if-nez v5, :cond_20

    .line 1291
    .line 1292
    iget-object v3, v3, La/es;->a:Ljava/lang/Object;

    .line 1293
    .line 1294
    check-cast v3, La/cju;

    .line 1295
    .line 1296
    iget-object v3, v3, La/cju;->a:La/f310;

    .line 1297
    .line 1298
    invoke-virtual {v3}, La/f310;->a()La/i89;

    .line 1299
    .line 1300
    .line 1301
    move-result-object v3

    .line 1302
    new-instance v5, La/fc4;

    .line 1303
    .line 1304
    const/16 v7, 0x16

    .line 1305
    .line 1306
    invoke-direct {v5, v3, v7}, La/fc4;-><init>(La/i89;B)V

    .line 1307
    .line 1308
    .line 1309
    goto :goto_b

    .line 1310
    :cond_20
    cmp-long v5, v12, v29

    .line 1311
    .line 1312
    if-nez v5, :cond_21

    .line 1313
    .line 1314
    iget-object v3, v3, La/es;->c:Ljava/lang/Object;

    .line 1315
    .line 1316
    check-cast v3, La/out;

    .line 1317
    .line 1318
    iget-object v3, v3, La/out;->a:La/oh9;

    .line 1319
    .line 1320
    invoke-virtual {v3}, La/oh9;->a()La/i89;

    .line 1321
    .line 1322
    .line 1323
    move-result-object v3

    .line 1324
    new-instance v5, La/fc4;

    .line 1325
    .line 1326
    const/16 v12, 0x8

    .line 1327
    .line 1328
    invoke-direct {v5, v3, v12}, La/fc4;-><init>(La/i89;B)V

    .line 1329
    .line 1330
    .line 1331
    goto :goto_c

    .line 1332
    :cond_21
    const/16 v12, 0x8

    .line 1333
    .line 1334
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1335
    .line 1336
    .line 1337
    new-instance v3, La/bqk0;

    .line 1338
    .line 1339
    new-instance v5, Ljava/lang/IllegalStateException;

    .line 1340
    .line 1341
    invoke-direct {v5, v7}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1342
    .line 1343
    .line 1344
    invoke-direct {v3, v5}, La/bqk0;-><init>(Ljava/lang/Throwable;)V

    .line 1345
    .line 1346
    .line 1347
    new-instance v5, La/eu4;

    .line 1348
    .line 1349
    const/16 v7, 0xc

    .line 1350
    .line 1351
    invoke-direct {v5, v3, v7}, La/eu4;-><init>(Ljava/lang/Object;B)V

    .line 1352
    .line 1353
    .line 1354
    :goto_c
    new-instance v3, La/vvk0;

    .line 1355
    .line 1356
    const/4 v13, 0x0

    .line 1357
    invoke-direct {v3, v8, v9, v13}, La/vvk0;-><init>(La/iwk0;La/yje;B)V

    .line 1358
    .line 1359
    .line 1360
    new-instance v7, La/fnq;

    .line 1361
    .line 1362
    invoke-direct {v7, v5, v3, v4}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 1363
    .line 1364
    .line 1365
    invoke-static {v8}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 1366
    .line 1367
    .line 1368
    move-result-object v3

    .line 1369
    iget-object v5, v0, La/mne;->c:La/vs10;

    .line 1370
    .line 1371
    invoke-static {v3, v5}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 1372
    .line 1373
    .line 1374
    move-result-object v3

    .line 1375
    sget-object v5, La/wvk0;->h:La/wvk0;

    .line 1376
    .line 1377
    invoke-static {v7, v3, v5}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 1378
    .line 1379
    .line 1380
    move-result-object v3

    .line 1381
    iput-object v3, v8, La/iwk0;->H0:La/c4m0;

    .line 1382
    .line 1383
    move/from16 v18, v12

    .line 1384
    .line 1385
    :goto_d
    const/4 v10, 0x3

    .line 1386
    const/16 v12, 0xc

    .line 1387
    .line 1388
    goto/16 :goto_a

    .line 1389
    .line 1390
    :cond_22
    const/16 v18, 0x8

    .line 1391
    .line 1392
    instance-of v5, v3, La/xtk0;

    .line 1393
    .line 1394
    if-eqz v5, :cond_27

    .line 1395
    .line 1396
    iget-object v3, v8, La/iwk0;->L0:La/c4m0;

    .line 1397
    .line 1398
    invoke-static {v3}, La/v3c;->N(La/bby;)V

    .line 1399
    .line 1400
    .line 1401
    invoke-virtual {v8}, La/i3t0;->D()Ljava/lang/Object;

    .line 1402
    .line 1403
    .line 1404
    move-result-object v3

    .line 1405
    check-cast v3, La/dvk0;

    .line 1406
    .line 1407
    iget-object v3, v3, La/dvk0;->t:La/etk0;

    .line 1408
    .line 1409
    iget-object v3, v3, La/etk0;->a:La/btk0;

    .line 1410
    .line 1411
    invoke-static {v3}, La/g7x;->O(La/btk0;)Z

    .line 1412
    .line 1413
    .line 1414
    move-result v3

    .line 1415
    if-nez v3, :cond_23

    .line 1416
    .line 1417
    new-instance v3, La/ask0;

    .line 1418
    .line 1419
    sget-object v5, La/iun;->a:La/iun;

    .line 1420
    .line 1421
    invoke-direct {v3, v11, v5}, La/ask0;-><init>(La/btk0;Ljava/util/List;)V

    .line 1422
    .line 1423
    .line 1424
    invoke-virtual {v8, v3}, La/iwk0;->W(La/usk0;)V

    .line 1425
    .line 1426
    .line 1427
    :cond_23
    iget-object v3, v8, La/iwk0;->X:La/phf0;

    .line 1428
    .line 1429
    iget v5, v6, Lorg/xplatform/special_event/impl/special_event_tab/presentation/model/SpecialEventTabScreenParams;->a:I

    .line 1430
    .line 1431
    invoke-virtual {v8}, La/i3t0;->D()Ljava/lang/Object;

    .line 1432
    .line 1433
    .line 1434
    move-result-object v5

    .line 1435
    check-cast v5, La/dvk0;

    .line 1436
    .line 1437
    iget-object v5, v5, La/dvk0;->C:La/ttk0;

    .line 1438
    .line 1439
    move-object/from16 v32, v11

    .line 1440
    .line 1441
    iget-wide v10, v5, La/ttk0;->e:J

    .line 1442
    .line 1443
    cmp-long v5, v10, v29

    .line 1444
    .line 1445
    if-nez v5, :cond_24

    .line 1446
    .line 1447
    iget-object v3, v3, La/phf0;->a:Ljava/lang/Object;

    .line 1448
    .line 1449
    check-cast v3, La/zut;

    .line 1450
    .line 1451
    iget-object v3, v3, La/zut;->a:La/oh9;

    .line 1452
    .line 1453
    invoke-virtual {v3}, La/oh9;->a()La/i89;

    .line 1454
    .line 1455
    .line 1456
    move-result-object v3

    .line 1457
    new-instance v5, La/fc4;

    .line 1458
    .line 1459
    const/16 v7, 0xc

    .line 1460
    .line 1461
    invoke-direct {v5, v3, v7}, La/fc4;-><init>(La/i89;B)V

    .line 1462
    .line 1463
    .line 1464
    goto :goto_e

    .line 1465
    :cond_24
    cmp-long v5, v10, v27

    .line 1466
    .line 1467
    if-nez v5, :cond_25

    .line 1468
    .line 1469
    iget-object v3, v3, La/phf0;->b:Ljava/lang/Object;

    .line 1470
    .line 1471
    check-cast v3, La/v6u;

    .line 1472
    .line 1473
    iget-object v3, v3, La/v6u;->a:La/l6l;

    .line 1474
    .line 1475
    invoke-virtual {v3}, La/l6l;->a()La/i89;

    .line 1476
    .line 1477
    .line 1478
    move-result-object v3

    .line 1479
    new-instance v5, La/fc4;

    .line 1480
    .line 1481
    const/16 v7, 0x12

    .line 1482
    .line 1483
    invoke-direct {v5, v3, v7}, La/fc4;-><init>(La/i89;B)V

    .line 1484
    .line 1485
    .line 1486
    goto :goto_e

    .line 1487
    :cond_25
    cmp-long v5, v10, v25

    .line 1488
    .line 1489
    if-nez v5, :cond_26

    .line 1490
    .line 1491
    iget-object v3, v3, La/phf0;->c:Ljava/lang/Object;

    .line 1492
    .line 1493
    check-cast v3, La/oju;

    .line 1494
    .line 1495
    iget-object v3, v3, La/oju;->a:La/f310;

    .line 1496
    .line 1497
    invoke-virtual {v3}, La/f310;->a()La/i89;

    .line 1498
    .line 1499
    .line 1500
    move-result-object v3

    .line 1501
    new-instance v5, La/fc4;

    .line 1502
    .line 1503
    const/16 v7, 0x1a

    .line 1504
    .line 1505
    invoke-direct {v5, v3, v7}, La/fc4;-><init>(La/i89;B)V

    .line 1506
    .line 1507
    .line 1508
    goto :goto_e

    .line 1509
    :cond_26
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1510
    .line 1511
    .line 1512
    new-instance v3, La/bqk0;

    .line 1513
    .line 1514
    new-instance v5, Ljava/lang/IllegalStateException;

    .line 1515
    .line 1516
    invoke-direct {v5, v7}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1517
    .line 1518
    .line 1519
    invoke-direct {v3, v5}, La/bqk0;-><init>(Ljava/lang/Throwable;)V

    .line 1520
    .line 1521
    .line 1522
    new-instance v5, La/eu4;

    .line 1523
    .line 1524
    const/16 v7, 0xc

    .line 1525
    .line 1526
    invoke-direct {v5, v3, v7}, La/eu4;-><init>(Ljava/lang/Object;B)V

    .line 1527
    .line 1528
    .line 1529
    :goto_e
    new-instance v3, La/vvk0;

    .line 1530
    .line 1531
    const/4 v7, 0x3

    .line 1532
    invoke-direct {v3, v8, v9, v7}, La/vvk0;-><init>(La/iwk0;La/yje;B)V

    .line 1533
    .line 1534
    .line 1535
    new-instance v7, La/fnq;

    .line 1536
    .line 1537
    invoke-direct {v7, v5, v3, v4}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 1538
    .line 1539
    .line 1540
    invoke-static {v8}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 1541
    .line 1542
    .line 1543
    move-result-object v3

    .line 1544
    iget-object v5, v0, La/mne;->c:La/vs10;

    .line 1545
    .line 1546
    invoke-static {v3, v5}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 1547
    .line 1548
    .line 1549
    move-result-object v3

    .line 1550
    new-instance v5, La/xvk0;

    .line 1551
    .line 1552
    invoke-direct {v5, v8, v9, v13}, La/xvk0;-><init>(La/iwk0;La/yje;B)V

    .line 1553
    .line 1554
    .line 1555
    invoke-static {v7, v3, v5}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 1556
    .line 1557
    .line 1558
    move-result-object v3

    .line 1559
    iput-object v3, v8, La/iwk0;->L0:La/c4m0;

    .line 1560
    .line 1561
    move-object/from16 v11, v32

    .line 1562
    .line 1563
    goto/16 :goto_d

    .line 1564
    .line 1565
    :cond_27
    move-object/from16 v32, v11

    .line 1566
    .line 1567
    instance-of v5, v3, La/duk0;

    .line 1568
    .line 1569
    if-eqz v5, :cond_2c

    .line 1570
    .line 1571
    iget-object v3, v8, La/iwk0;->I0:La/c4m0;

    .line 1572
    .line 1573
    invoke-static {v3}, La/v3c;->N(La/bby;)V

    .line 1574
    .line 1575
    .line 1576
    invoke-virtual {v8}, La/i3t0;->D()Ljava/lang/Object;

    .line 1577
    .line 1578
    .line 1579
    move-result-object v3

    .line 1580
    check-cast v3, La/dvk0;

    .line 1581
    .line 1582
    iget-object v3, v3, La/dvk0;->u:La/qtk0;

    .line 1583
    .line 1584
    iget-object v3, v3, La/qtk0;->a:La/btk0;

    .line 1585
    .line 1586
    invoke-static {v3}, La/g7x;->O(La/btk0;)Z

    .line 1587
    .line 1588
    .line 1589
    move-result v3

    .line 1590
    if-nez v3, :cond_28

    .line 1591
    .line 1592
    new-instance v3, La/jsk0;

    .line 1593
    .line 1594
    sget-object v5, La/iun;->a:La/iun;

    .line 1595
    .line 1596
    move-object/from16 v11, v32

    .line 1597
    .line 1598
    invoke-direct {v3, v11, v5}, La/jsk0;-><init>(La/btk0;Ljava/util/List;)V

    .line 1599
    .line 1600
    .line 1601
    invoke-virtual {v8, v3}, La/iwk0;->W(La/usk0;)V

    .line 1602
    .line 1603
    .line 1604
    goto :goto_f

    .line 1605
    :cond_28
    move-object/from16 v11, v32

    .line 1606
    .line 1607
    :goto_f
    iget-object v3, v8, La/iwk0;->T:La/lhf0;

    .line 1608
    .line 1609
    iget v5, v6, Lorg/xplatform/special_event/impl/special_event_tab/presentation/model/SpecialEventTabScreenParams;->a:I

    .line 1610
    .line 1611
    invoke-virtual {v8}, La/i3t0;->D()Ljava/lang/Object;

    .line 1612
    .line 1613
    .line 1614
    move-result-object v5

    .line 1615
    check-cast v5, La/dvk0;

    .line 1616
    .line 1617
    iget-object v5, v5, La/dvk0;->C:La/ttk0;

    .line 1618
    .line 1619
    iget-wide v12, v5, La/ttk0;->e:J

    .line 1620
    .line 1621
    cmp-long v5, v12, v27

    .line 1622
    .line 1623
    if-nez v5, :cond_29

    .line 1624
    .line 1625
    iget-object v3, v3, La/lhf0;->c:Ljava/lang/Object;

    .line 1626
    .line 1627
    check-cast v3, La/r6u;

    .line 1628
    .line 1629
    iget-object v3, v3, La/r6u;->a:La/l6l;

    .line 1630
    .line 1631
    invoke-virtual {v3}, La/l6l;->a()La/i89;

    .line 1632
    .line 1633
    .line 1634
    move-result-object v3

    .line 1635
    new-instance v5, La/fc4;

    .line 1636
    .line 1637
    const/16 v7, 0x11

    .line 1638
    .line 1639
    invoke-direct {v5, v3, v7}, La/fc4;-><init>(La/i89;B)V

    .line 1640
    .line 1641
    .line 1642
    :goto_10
    const/16 v10, 0xb

    .line 1643
    .line 1644
    goto :goto_11

    .line 1645
    :cond_29
    cmp-long v5, v12, v25

    .line 1646
    .line 1647
    if-nez v5, :cond_2a

    .line 1648
    .line 1649
    iget-object v3, v3, La/lhf0;->b:Ljava/lang/Object;

    .line 1650
    .line 1651
    check-cast v3, La/lju;

    .line 1652
    .line 1653
    iget-object v3, v3, La/lju;->a:La/f310;

    .line 1654
    .line 1655
    invoke-virtual {v3}, La/f310;->a()La/i89;

    .line 1656
    .line 1657
    .line 1658
    move-result-object v3

    .line 1659
    new-instance v5, La/fc4;

    .line 1660
    .line 1661
    const/16 v7, 0x19

    .line 1662
    .line 1663
    invoke-direct {v5, v3, v7}, La/fc4;-><init>(La/i89;B)V

    .line 1664
    .line 1665
    .line 1666
    goto :goto_10

    .line 1667
    :cond_2a
    cmp-long v5, v12, v29

    .line 1668
    .line 1669
    if-nez v5, :cond_2b

    .line 1670
    .line 1671
    iget-object v3, v3, La/lhf0;->d:Ljava/lang/Object;

    .line 1672
    .line 1673
    check-cast v3, La/wut;

    .line 1674
    .line 1675
    iget-object v3, v3, La/wut;->a:La/oh9;

    .line 1676
    .line 1677
    invoke-virtual {v3}, La/oh9;->a()La/i89;

    .line 1678
    .line 1679
    .line 1680
    move-result-object v3

    .line 1681
    new-instance v5, La/fc4;

    .line 1682
    .line 1683
    const/16 v10, 0xb

    .line 1684
    .line 1685
    invoke-direct {v5, v3, v10}, La/fc4;-><init>(La/i89;B)V

    .line 1686
    .line 1687
    .line 1688
    goto :goto_11

    .line 1689
    :cond_2b
    const/16 v10, 0xb

    .line 1690
    .line 1691
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1692
    .line 1693
    .line 1694
    new-instance v3, La/bqk0;

    .line 1695
    .line 1696
    new-instance v5, Ljava/lang/IllegalStateException;

    .line 1697
    .line 1698
    invoke-direct {v5, v7}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1699
    .line 1700
    .line 1701
    invoke-direct {v3, v5}, La/bqk0;-><init>(Ljava/lang/Throwable;)V

    .line 1702
    .line 1703
    .line 1704
    new-instance v5, La/eu4;

    .line 1705
    .line 1706
    const/16 v7, 0xc

    .line 1707
    .line 1708
    invoke-direct {v5, v3, v7}, La/eu4;-><init>(Ljava/lang/Object;B)V

    .line 1709
    .line 1710
    .line 1711
    :goto_11
    new-instance v3, La/vvk0;

    .line 1712
    .line 1713
    const/4 v7, 0x7

    .line 1714
    invoke-direct {v3, v8, v9, v7}, La/vvk0;-><init>(La/iwk0;La/yje;B)V

    .line 1715
    .line 1716
    .line 1717
    new-instance v12, La/fnq;

    .line 1718
    .line 1719
    invoke-direct {v12, v5, v3, v4}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 1720
    .line 1721
    .line 1722
    invoke-static {v8}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 1723
    .line 1724
    .line 1725
    move-result-object v3

    .line 1726
    iget-object v5, v0, La/mne;->c:La/vs10;

    .line 1727
    .line 1728
    invoke-static {v3, v5}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 1729
    .line 1730
    .line 1731
    move-result-object v3

    .line 1732
    sget-object v5, La/bwk0;->h:La/bwk0;

    .line 1733
    .line 1734
    invoke-static {v12, v3, v5}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 1735
    .line 1736
    .line 1737
    move-result-object v3

    .line 1738
    iput-object v3, v8, La/iwk0;->I0:La/c4m0;

    .line 1739
    .line 1740
    move/from16 v21, v7

    .line 1741
    .line 1742
    :goto_12
    const/4 v10, 0x3

    .line 1743
    const/16 v12, 0xc

    .line 1744
    .line 1745
    goto/16 :goto_8

    .line 1746
    .line 1747
    :cond_2c
    move-object/from16 v11, v32

    .line 1748
    .line 1749
    const/16 v10, 0xb

    .line 1750
    .line 1751
    const/16 v21, 0x7

    .line 1752
    .line 1753
    instance-of v5, v3, La/buk0;

    .line 1754
    .line 1755
    if-eqz v5, :cond_30

    .line 1756
    .line 1757
    invoke-virtual {v8}, La/i3t0;->D()Ljava/lang/Object;

    .line 1758
    .line 1759
    .line 1760
    move-result-object v3

    .line 1761
    check-cast v3, La/dvk0;

    .line 1762
    .line 1763
    iget-object v3, v3, La/dvk0;->C:La/ttk0;

    .line 1764
    .line 1765
    iget-wide v12, v3, La/ttk0;->d:J

    .line 1766
    .line 1767
    cmp-long v3, v12, v23

    .line 1768
    .line 1769
    if-eqz v3, :cond_2d

    .line 1770
    .line 1771
    new-instance v3, La/gsk0;

    .line 1772
    .line 1773
    sget-object v5, La/iun;->a:La/iun;

    .line 1774
    .line 1775
    invoke-direct {v3, v2, v5}, La/gsk0;-><init>(La/btk0;Ljava/util/List;)V

    .line 1776
    .line 1777
    .line 1778
    invoke-virtual {v8, v3}, La/iwk0;->W(La/usk0;)V

    .line 1779
    .line 1780
    .line 1781
    goto :goto_12

    .line 1782
    :cond_2d
    invoke-virtual {v8}, La/i3t0;->D()Ljava/lang/Object;

    .line 1783
    .line 1784
    .line 1785
    move-result-object v3

    .line 1786
    check-cast v3, La/dvk0;

    .line 1787
    .line 1788
    iget-object v3, v3, La/dvk0;->C:La/ttk0;

    .line 1789
    .line 1790
    iget-wide v12, v3, La/ttk0;->d:J

    .line 1791
    .line 1792
    cmp-long v3, v12, v23

    .line 1793
    .line 1794
    if-eqz v3, :cond_2e

    .line 1795
    .line 1796
    new-instance v3, La/gsk0;

    .line 1797
    .line 1798
    sget-object v5, La/iun;->a:La/iun;

    .line 1799
    .line 1800
    invoke-direct {v3, v2, v5}, La/gsk0;-><init>(La/btk0;Ljava/util/List;)V

    .line 1801
    .line 1802
    .line 1803
    invoke-virtual {v8, v3}, La/iwk0;->W(La/usk0;)V

    .line 1804
    .line 1805
    .line 1806
    const/4 v7, 0x6

    .line 1807
    goto :goto_13

    .line 1808
    :cond_2e
    iget-object v3, v8, La/iwk0;->J0:La/c4m0;

    .line 1809
    .line 1810
    invoke-static {v3}, La/v3c;->N(La/bby;)V

    .line 1811
    .line 1812
    .line 1813
    invoke-virtual {v8}, La/i3t0;->D()Ljava/lang/Object;

    .line 1814
    .line 1815
    .line 1816
    move-result-object v3

    .line 1817
    check-cast v3, La/dvk0;

    .line 1818
    .line 1819
    iget-object v3, v3, La/dvk0;->v:La/ntk0;

    .line 1820
    .line 1821
    iget-object v3, v3, La/ntk0;->a:La/btk0;

    .line 1822
    .line 1823
    invoke-static {v3}, La/g7x;->O(La/btk0;)Z

    .line 1824
    .line 1825
    .line 1826
    move-result v3

    .line 1827
    if-nez v3, :cond_2f

    .line 1828
    .line 1829
    new-instance v3, La/gsk0;

    .line 1830
    .line 1831
    sget-object v5, La/iun;->a:La/iun;

    .line 1832
    .line 1833
    invoke-direct {v3, v11, v5}, La/gsk0;-><init>(La/btk0;Ljava/util/List;)V

    .line 1834
    .line 1835
    .line 1836
    invoke-virtual {v8, v3}, La/iwk0;->W(La/usk0;)V

    .line 1837
    .line 1838
    .line 1839
    :cond_2f
    iget-object v3, v8, La/iwk0;->U:La/tut;

    .line 1840
    .line 1841
    iget v5, v6, Lorg/xplatform/special_event/impl/special_event_tab/presentation/model/SpecialEventTabScreenParams;->a:I

    .line 1842
    .line 1843
    iget-object v3, v3, La/tut;->a:La/oh9;

    .line 1844
    .line 1845
    invoke-virtual {v3}, La/oh9;->a()La/i89;

    .line 1846
    .line 1847
    .line 1848
    move-result-object v3

    .line 1849
    new-instance v5, La/fc4;

    .line 1850
    .line 1851
    const/16 v7, 0xa

    .line 1852
    .line 1853
    invoke-direct {v5, v3, v7}, La/fc4;-><init>(La/i89;B)V

    .line 1854
    .line 1855
    .line 1856
    new-instance v3, La/vvk0;

    .line 1857
    .line 1858
    const/4 v7, 0x6

    .line 1859
    invoke-direct {v3, v8, v9, v7}, La/vvk0;-><init>(La/iwk0;La/yje;B)V

    .line 1860
    .line 1861
    .line 1862
    new-instance v12, La/fnq;

    .line 1863
    .line 1864
    invoke-direct {v12, v5, v3, v4}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 1865
    .line 1866
    .line 1867
    invoke-static {v8}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 1868
    .line 1869
    .line 1870
    move-result-object v3

    .line 1871
    iget-object v5, v0, La/mne;->c:La/vs10;

    .line 1872
    .line 1873
    invoke-static {v3, v5}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 1874
    .line 1875
    .line 1876
    move-result-object v3

    .line 1877
    sget-object v5, La/yvk0;->h:La/yvk0;

    .line 1878
    .line 1879
    invoke-static {v12, v3, v5}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 1880
    .line 1881
    .line 1882
    move-result-object v3

    .line 1883
    iput-object v3, v8, La/iwk0;->J0:La/c4m0;

    .line 1884
    .line 1885
    :goto_13
    move/from16 v19, v7

    .line 1886
    .line 1887
    :goto_14
    const/4 v10, 0x3

    .line 1888
    :goto_15
    const/16 v12, 0xc

    .line 1889
    .line 1890
    goto/16 :goto_1a

    .line 1891
    .line 1892
    :cond_30
    const/16 v19, 0x6

    .line 1893
    .line 1894
    instance-of v5, v3, La/wtk0;

    .line 1895
    .line 1896
    if-eqz v5, :cond_35

    .line 1897
    .line 1898
    iget-object v3, v8, La/iwk0;->K0:La/c4m0;

    .line 1899
    .line 1900
    invoke-static {v3}, La/v3c;->N(La/bby;)V

    .line 1901
    .line 1902
    .line 1903
    invoke-virtual {v8}, La/i3t0;->D()Ljava/lang/Object;

    .line 1904
    .line 1905
    .line 1906
    move-result-object v3

    .line 1907
    check-cast v3, La/dvk0;

    .line 1908
    .line 1909
    iget-object v3, v3, La/dvk0;->w:La/dtk0;

    .line 1910
    .line 1911
    iget-object v3, v3, La/dtk0;->a:La/btk0;

    .line 1912
    .line 1913
    invoke-static {v3}, La/g7x;->O(La/btk0;)Z

    .line 1914
    .line 1915
    .line 1916
    move-result v3

    .line 1917
    if-nez v3, :cond_31

    .line 1918
    .line 1919
    new-instance v3, La/zrk0;

    .line 1920
    .line 1921
    sget-object v5, La/iun;->a:La/iun;

    .line 1922
    .line 1923
    invoke-direct {v3, v11, v5}, La/zrk0;-><init>(La/btk0;Ljava/util/List;)V

    .line 1924
    .line 1925
    .line 1926
    invoke-virtual {v8, v3}, La/iwk0;->W(La/usk0;)V

    .line 1927
    .line 1928
    .line 1929
    :cond_31
    iget-object v3, v8, La/iwk0;->V:La/oif0;

    .line 1930
    .line 1931
    iget v5, v6, Lorg/xplatform/special_event/impl/special_event_tab/presentation/model/SpecialEventTabScreenParams;->a:I

    .line 1932
    .line 1933
    invoke-virtual {v8}, La/i3t0;->D()Ljava/lang/Object;

    .line 1934
    .line 1935
    .line 1936
    move-result-object v5

    .line 1937
    check-cast v5, La/dvk0;

    .line 1938
    .line 1939
    iget-object v5, v5, La/dvk0;->C:La/ttk0;

    .line 1940
    .line 1941
    move-object/from16 v24, v11

    .line 1942
    .line 1943
    iget-wide v10, v5, La/ttk0;->e:J

    .line 1944
    .line 1945
    cmp-long v5, v10, v27

    .line 1946
    .line 1947
    if-nez v5, :cond_32

    .line 1948
    .line 1949
    iget-object v3, v3, La/oif0;->b:Ljava/lang/Object;

    .line 1950
    .line 1951
    check-cast v3, La/z6u;

    .line 1952
    .line 1953
    iget-object v3, v3, La/z6u;->a:La/l6l;

    .line 1954
    .line 1955
    invoke-virtual {v3}, La/l6l;->a()La/i89;

    .line 1956
    .line 1957
    .line 1958
    move-result-object v3

    .line 1959
    new-instance v5, La/fc4;

    .line 1960
    .line 1961
    const/16 v7, 0x13

    .line 1962
    .line 1963
    invoke-direct {v5, v3, v7}, La/fc4;-><init>(La/i89;B)V

    .line 1964
    .line 1965
    .line 1966
    goto :goto_16

    .line 1967
    :cond_32
    cmp-long v5, v10, v25

    .line 1968
    .line 1969
    if-nez v5, :cond_33

    .line 1970
    .line 1971
    iget-object v3, v3, La/oif0;->c:Ljava/lang/Object;

    .line 1972
    .line 1973
    check-cast v3, La/rju;

    .line 1974
    .line 1975
    iget-object v3, v3, La/rju;->a:La/f310;

    .line 1976
    .line 1977
    invoke-virtual {v3}, La/f310;->a()La/i89;

    .line 1978
    .line 1979
    .line 1980
    move-result-object v3

    .line 1981
    new-instance v5, La/fc4;

    .line 1982
    .line 1983
    const/16 v7, 0x1b

    .line 1984
    .line 1985
    invoke-direct {v5, v3, v7}, La/fc4;-><init>(La/i89;B)V

    .line 1986
    .line 1987
    .line 1988
    goto :goto_16

    .line 1989
    :cond_33
    cmp-long v5, v10, v29

    .line 1990
    .line 1991
    if-nez v5, :cond_34

    .line 1992
    .line 1993
    iget-object v3, v3, La/oif0;->d:Ljava/lang/Object;

    .line 1994
    .line 1995
    check-cast v3, La/cvt;

    .line 1996
    .line 1997
    iget-object v3, v3, La/cvt;->a:La/oh9;

    .line 1998
    .line 1999
    invoke-virtual {v3}, La/oh9;->a()La/i89;

    .line 2000
    .line 2001
    .line 2002
    move-result-object v3

    .line 2003
    new-instance v5, La/fc4;

    .line 2004
    .line 2005
    invoke-direct {v5, v3, v12}, La/fc4;-><init>(La/i89;B)V

    .line 2006
    .line 2007
    .line 2008
    goto :goto_16

    .line 2009
    :cond_34
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2010
    .line 2011
    .line 2012
    new-instance v3, La/bqk0;

    .line 2013
    .line 2014
    new-instance v5, Ljava/lang/IllegalStateException;

    .line 2015
    .line 2016
    invoke-direct {v5, v7}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 2017
    .line 2018
    .line 2019
    invoke-direct {v3, v5}, La/bqk0;-><init>(Ljava/lang/Throwable;)V

    .line 2020
    .line 2021
    .line 2022
    new-instance v5, La/eu4;

    .line 2023
    .line 2024
    const/16 v7, 0xc

    .line 2025
    .line 2026
    invoke-direct {v5, v3, v7}, La/eu4;-><init>(Ljava/lang/Object;B)V

    .line 2027
    .line 2028
    .line 2029
    :goto_16
    new-instance v3, La/vvk0;

    .line 2030
    .line 2031
    invoke-direct {v3, v8, v9, v13}, La/vvk0;-><init>(La/iwk0;La/yje;B)V

    .line 2032
    .line 2033
    .line 2034
    new-instance v7, La/fnq;

    .line 2035
    .line 2036
    invoke-direct {v7, v5, v3, v4}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 2037
    .line 2038
    .line 2039
    invoke-static {v8}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 2040
    .line 2041
    .line 2042
    move-result-object v3

    .line 2043
    iget-object v5, v0, La/mne;->c:La/vs10;

    .line 2044
    .line 2045
    invoke-static {v3, v5}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 2046
    .line 2047
    .line 2048
    move-result-object v3

    .line 2049
    new-instance v5, La/xvk0;

    .line 2050
    .line 2051
    const/4 v10, 0x1

    .line 2052
    invoke-direct {v5, v8, v9, v10}, La/xvk0;-><init>(La/iwk0;La/yje;B)V

    .line 2053
    .line 2054
    .line 2055
    invoke-static {v7, v3, v5}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 2056
    .line 2057
    .line 2058
    move-result-object v3

    .line 2059
    iput-object v3, v8, La/iwk0;->K0:La/c4m0;

    .line 2060
    .line 2061
    move-object/from16 v11, v24

    .line 2062
    .line 2063
    goto/16 :goto_14

    .line 2064
    .line 2065
    :cond_35
    move-object/from16 v24, v11

    .line 2066
    .line 2067
    instance-of v5, v3, La/guk0;

    .line 2068
    .line 2069
    if-eqz v5, :cond_37

    .line 2070
    .line 2071
    iget-object v3, v8, La/iwk0;->M0:La/bby;

    .line 2072
    .line 2073
    invoke-static {v3}, La/v3c;->N(La/bby;)V

    .line 2074
    .line 2075
    .line 2076
    invoke-virtual {v8}, La/i3t0;->D()Ljava/lang/Object;

    .line 2077
    .line 2078
    .line 2079
    move-result-object v3

    .line 2080
    check-cast v3, La/dvk0;

    .line 2081
    .line 2082
    iget-object v3, v3, La/dvk0;->x:La/avk0;

    .line 2083
    .line 2084
    iget-object v3, v3, La/avk0;->a:La/btk0;

    .line 2085
    .line 2086
    invoke-static {v3}, La/g7x;->O(La/btk0;)Z

    .line 2087
    .line 2088
    .line 2089
    move-result v3

    .line 2090
    if-nez v3, :cond_36

    .line 2091
    .line 2092
    new-instance v3, La/msk0;

    .line 2093
    .line 2094
    sget-object v5, La/iun;->a:La/iun;

    .line 2095
    .line 2096
    move-object/from16 v11, v24

    .line 2097
    .line 2098
    invoke-direct {v3, v11, v5}, La/msk0;-><init>(La/btk0;Ljava/util/List;)V

    .line 2099
    .line 2100
    .line 2101
    invoke-virtual {v8, v3}, La/iwk0;->W(La/usk0;)V

    .line 2102
    .line 2103
    .line 2104
    goto :goto_17

    .line 2105
    :cond_36
    move-object/from16 v11, v24

    .line 2106
    .line 2107
    :goto_17
    invoke-static {v8}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 2108
    .line 2109
    .line 2110
    move-result-object v22

    .line 2111
    iget-object v3, v0, La/mne;->c:La/vs10;

    .line 2112
    .line 2113
    new-instance v5, La/rvk0;

    .line 2114
    .line 2115
    const/4 v10, 0x3

    .line 2116
    invoke-direct {v5, v8, v10}, La/rvk0;-><init>(La/iwk0;B)V

    .line 2117
    .line 2118
    .line 2119
    new-instance v7, La/xvk0;

    .line 2120
    .line 2121
    invoke-direct {v7, v8, v9, v10}, La/xvk0;-><init>(La/iwk0;La/yje;B)V

    .line 2122
    .line 2123
    .line 2124
    const/16 v27, 0xa

    .line 2125
    .line 2126
    const/16 v24, 0x0

    .line 2127
    .line 2128
    move-object/from16 v25, v3

    .line 2129
    .line 2130
    move-object/from16 v23, v5

    .line 2131
    .line 2132
    move-object/from16 v26, v7

    .line 2133
    .line 2134
    invoke-static/range {v22 .. v27}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 2135
    .line 2136
    .line 2137
    move-result-object v3

    .line 2138
    iput-object v3, v8, La/iwk0;->M0:La/bby;

    .line 2139
    .line 2140
    goto/16 :goto_15

    .line 2141
    .line 2142
    :cond_37
    move-object/from16 v11, v24

    .line 2143
    .line 2144
    const/4 v10, 0x3

    .line 2145
    instance-of v5, v3, La/vtk0;

    .line 2146
    .line 2147
    if-eqz v5, :cond_3c

    .line 2148
    .line 2149
    iget-object v3, v8, La/iwk0;->N0:La/c4m0;

    .line 2150
    .line 2151
    invoke-static {v3}, La/v3c;->N(La/bby;)V

    .line 2152
    .line 2153
    .line 2154
    invoke-virtual {v8}, La/i3t0;->D()Ljava/lang/Object;

    .line 2155
    .line 2156
    .line 2157
    move-result-object v3

    .line 2158
    check-cast v3, La/dvk0;

    .line 2159
    .line 2160
    iget-object v3, v3, La/dvk0;->y:La/ctk0;

    .line 2161
    .line 2162
    iget-object v3, v3, La/ctk0;->a:La/btk0;

    .line 2163
    .line 2164
    invoke-static {v3}, La/g7x;->O(La/btk0;)Z

    .line 2165
    .line 2166
    .line 2167
    move-result v3

    .line 2168
    if-nez v3, :cond_38

    .line 2169
    .line 2170
    new-instance v3, La/yrk0;

    .line 2171
    .line 2172
    sget-object v5, La/iun;->a:La/iun;

    .line 2173
    .line 2174
    invoke-direct {v3, v11, v5}, La/yrk0;-><init>(La/btk0;Ljava/util/List;)V

    .line 2175
    .line 2176
    .line 2177
    invoke-virtual {v8, v3}, La/iwk0;->W(La/usk0;)V

    .line 2178
    .line 2179
    .line 2180
    :cond_38
    iget-object v3, v8, La/iwk0;->Z:La/lhf0;

    .line 2181
    .line 2182
    iget v5, v6, Lorg/xplatform/special_event/impl/special_event_tab/presentation/model/SpecialEventTabScreenParams;->a:I

    .line 2183
    .line 2184
    invoke-virtual {v8}, La/i3t0;->D()Ljava/lang/Object;

    .line 2185
    .line 2186
    .line 2187
    move-result-object v5

    .line 2188
    check-cast v5, La/dvk0;

    .line 2189
    .line 2190
    iget-object v5, v5, La/dvk0;->C:La/ttk0;

    .line 2191
    .line 2192
    iget-wide v12, v5, La/ttk0;->e:J

    .line 2193
    .line 2194
    cmp-long v5, v12, v29

    .line 2195
    .line 2196
    if-nez v5, :cond_39

    .line 2197
    .line 2198
    iget-object v3, v3, La/lhf0;->b:Ljava/lang/Object;

    .line 2199
    .line 2200
    check-cast v3, La/a7q;

    .line 2201
    .line 2202
    iget-object v3, v3, La/a7q;->a:Ljava/lang/Object;

    .line 2203
    .line 2204
    check-cast v3, La/oh9;

    .line 2205
    .line 2206
    invoke-virtual {v3}, La/oh9;->a()La/i89;

    .line 2207
    .line 2208
    .line 2209
    move-result-object v3

    .line 2210
    new-instance v5, La/fc4;

    .line 2211
    .line 2212
    const/16 v7, 0x9

    .line 2213
    .line 2214
    invoke-direct {v5, v3, v7}, La/fc4;-><init>(La/i89;B)V

    .line 2215
    .line 2216
    .line 2217
    :goto_18
    const/16 v12, 0xc

    .line 2218
    .line 2219
    goto :goto_19

    .line 2220
    :cond_39
    cmp-long v5, v12, v27

    .line 2221
    .line 2222
    if-nez v5, :cond_3a

    .line 2223
    .line 2224
    iget-object v3, v3, La/lhf0;->c:Ljava/lang/Object;

    .line 2225
    .line 2226
    check-cast v3, La/j6u;

    .line 2227
    .line 2228
    iget-object v3, v3, La/j6u;->a:La/l6l;

    .line 2229
    .line 2230
    invoke-virtual {v3}, La/l6l;->a()La/i89;

    .line 2231
    .line 2232
    .line 2233
    move-result-object v3

    .line 2234
    new-instance v5, La/fc4;

    .line 2235
    .line 2236
    const/16 v7, 0xf

    .line 2237
    .line 2238
    invoke-direct {v5, v3, v7}, La/fc4;-><init>(La/i89;B)V

    .line 2239
    .line 2240
    .line 2241
    goto :goto_18

    .line 2242
    :cond_3a
    cmp-long v5, v12, v25

    .line 2243
    .line 2244
    if-nez v5, :cond_3b

    .line 2245
    .line 2246
    iget-object v3, v3, La/lhf0;->d:Ljava/lang/Object;

    .line 2247
    .line 2248
    check-cast v3, La/fju;

    .line 2249
    .line 2250
    iget-object v3, v3, La/fju;->a:La/f310;

    .line 2251
    .line 2252
    invoke-virtual {v3}, La/f310;->a()La/i89;

    .line 2253
    .line 2254
    .line 2255
    move-result-object v3

    .line 2256
    new-instance v5, La/fc4;

    .line 2257
    .line 2258
    const/16 v7, 0x17

    .line 2259
    .line 2260
    invoke-direct {v5, v3, v7}, La/fc4;-><init>(La/i89;B)V

    .line 2261
    .line 2262
    .line 2263
    goto :goto_18

    .line 2264
    :cond_3b
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2265
    .line 2266
    .line 2267
    new-instance v3, La/bqk0;

    .line 2268
    .line 2269
    new-instance v5, Ljava/lang/IllegalStateException;

    .line 2270
    .line 2271
    invoke-direct {v5, v7}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 2272
    .line 2273
    .line 2274
    invoke-direct {v3, v5}, La/bqk0;-><init>(Ljava/lang/Throwable;)V

    .line 2275
    .line 2276
    .line 2277
    new-instance v5, La/eu4;

    .line 2278
    .line 2279
    const/16 v12, 0xc

    .line 2280
    .line 2281
    invoke-direct {v5, v3, v12}, La/eu4;-><init>(Ljava/lang/Object;B)V

    .line 2282
    .line 2283
    .line 2284
    :goto_19
    new-instance v3, La/vvk0;

    .line 2285
    .line 2286
    const/4 v7, 0x1

    .line 2287
    invoke-direct {v3, v8, v9, v7}, La/vvk0;-><init>(La/iwk0;La/yje;B)V

    .line 2288
    .line 2289
    .line 2290
    new-instance v7, La/fnq;

    .line 2291
    .line 2292
    invoke-direct {v7, v5, v3, v4}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 2293
    .line 2294
    .line 2295
    invoke-static {v8}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 2296
    .line 2297
    .line 2298
    move-result-object v3

    .line 2299
    iget-object v5, v0, La/mne;->c:La/vs10;

    .line 2300
    .line 2301
    invoke-static {v3, v5}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 2302
    .line 2303
    .line 2304
    move-result-object v3

    .line 2305
    new-instance v5, La/xvk0;

    .line 2306
    .line 2307
    const/4 v13, 0x0

    .line 2308
    invoke-direct {v5, v8, v9, v13}, La/xvk0;-><init>(La/iwk0;La/yje;B)V

    .line 2309
    .line 2310
    .line 2311
    invoke-static {v7, v3, v5}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 2312
    .line 2313
    .line 2314
    move-result-object v3

    .line 2315
    iput-object v3, v8, La/iwk0;->N0:La/c4m0;

    .line 2316
    .line 2317
    goto :goto_1a

    .line 2318
    :cond_3c
    const/16 v12, 0xc

    .line 2319
    .line 2320
    instance-of v3, v3, La/fuk0;

    .line 2321
    .line 2322
    if-eqz v3, :cond_3e

    .line 2323
    .line 2324
    iget-object v3, v8, La/iwk0;->S0:La/bby;

    .line 2325
    .line 2326
    invoke-static {v3}, La/v3c;->N(La/bby;)V

    .line 2327
    .line 2328
    .line 2329
    invoke-virtual {v8}, La/i3t0;->D()Ljava/lang/Object;

    .line 2330
    .line 2331
    .line 2332
    move-result-object v3

    .line 2333
    check-cast v3, La/dvk0;

    .line 2334
    .line 2335
    iget-object v3, v3, La/dvk0;->z:La/stk0;

    .line 2336
    .line 2337
    iget-object v3, v3, La/stk0;->a:La/btk0;

    .line 2338
    .line 2339
    invoke-static {v3}, La/g7x;->O(La/btk0;)Z

    .line 2340
    .line 2341
    .line 2342
    move-result v3

    .line 2343
    if-nez v3, :cond_3d

    .line 2344
    .line 2345
    new-instance v3, La/lsk0;

    .line 2346
    .line 2347
    sget-object v5, La/iun;->a:La/iun;

    .line 2348
    .line 2349
    invoke-direct {v3, v11, v5}, La/lsk0;-><init>(La/btk0;Ljava/util/List;)V

    .line 2350
    .line 2351
    .line 2352
    invoke-virtual {v8, v3}, La/iwk0;->W(La/usk0;)V

    .line 2353
    .line 2354
    .line 2355
    :cond_3d
    invoke-static {v8}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 2356
    .line 2357
    .line 2358
    move-result-object v22

    .line 2359
    iget-object v3, v0, La/mne;->c:La/vs10;

    .line 2360
    .line 2361
    new-instance v5, La/rvk0;

    .line 2362
    .line 2363
    invoke-direct {v5, v8, v14}, La/rvk0;-><init>(La/iwk0;B)V

    .line 2364
    .line 2365
    .line 2366
    new-instance v7, La/zvk0;

    .line 2367
    .line 2368
    invoke-direct {v7, v8, v9, v13}, La/zvk0;-><init>(La/iwk0;La/yje;B)V

    .line 2369
    .line 2370
    .line 2371
    const/16 v27, 0xa

    .line 2372
    .line 2373
    const/16 v24, 0x0

    .line 2374
    .line 2375
    move-object/from16 v25, v3

    .line 2376
    .line 2377
    move-object/from16 v23, v5

    .line 2378
    .line 2379
    move-object/from16 v26, v7

    .line 2380
    .line 2381
    invoke-static/range {v22 .. v27}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 2382
    .line 2383
    .line 2384
    move-result-object v3

    .line 2385
    iput-object v3, v8, La/iwk0;->S0:La/bby;

    .line 2386
    .line 2387
    :goto_1a
    move-object/from16 v24, v11

    .line 2388
    .line 2389
    move/from16 v12, v21

    .line 2390
    .line 2391
    const/4 v10, 0x1

    .line 2392
    goto/16 :goto_5

    .line 2393
    .line 2394
    :cond_3e
    invoke-static {}, La/t9f;->b()V

    .line 2395
    .line 2396
    .line 2397
    goto :goto_1b

    .line 2398
    :cond_3f
    const/16 v18, 0x8

    .line 2399
    .line 2400
    const/16 v19, 0x6

    .line 2401
    .line 2402
    const/4 v10, 0x1

    .line 2403
    goto/16 :goto_3

    .line 2404
    .line 2405
    :cond_40
    invoke-static {v7}, La/g7x;->N(La/dvk0;)Z

    .line 2406
    .line 2407
    .line 2408
    move-result v0

    .line 2409
    if-eqz v0, :cond_42

    .line 2410
    .line 2411
    invoke-static {v7}, La/g7x;->M(La/dvk0;)Z

    .line 2412
    .line 2413
    .line 2414
    move-result v0

    .line 2415
    if-nez v0, :cond_42

    .line 2416
    .line 2417
    invoke-virtual {v8}, La/iwk0;->N()V

    .line 2418
    .line 2419
    .line 2420
    sget-object v36, La/mtk0;->b:La/mtk0;

    .line 2421
    .line 2422
    iget-object v0, v5, La/ocj;->a:La/p7m0;

    .line 2423
    .line 2424
    :cond_41
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 2425
    .line 2426
    .line 2427
    move-result-object v2

    .line 2428
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2429
    .line 2430
    .line 2431
    move-object v9, v2

    .line 2432
    check-cast v9, La/dvk0;

    .line 2433
    .line 2434
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2435
    .line 2436
    .line 2437
    const/16 v35, 0x0

    .line 2438
    .line 2439
    const v37, 0x37ffffff

    .line 2440
    .line 2441
    .line 2442
    const/4 v10, 0x0

    .line 2443
    const/4 v11, 0x0

    .line 2444
    const/4 v12, 0x0

    .line 2445
    const/4 v13, 0x0

    .line 2446
    const/4 v14, 0x0

    .line 2447
    const/4 v15, 0x0

    .line 2448
    const/16 v16, 0x0

    .line 2449
    .line 2450
    const/16 v17, 0x0

    .line 2451
    .line 2452
    const/16 v18, 0x0

    .line 2453
    .line 2454
    const/16 v19, 0x0

    .line 2455
    .line 2456
    const/16 v20, 0x0

    .line 2457
    .line 2458
    const/16 v21, 0x0

    .line 2459
    .line 2460
    const/16 v22, 0x0

    .line 2461
    .line 2462
    const/16 v23, 0x0

    .line 2463
    .line 2464
    const/16 v24, 0x0

    .line 2465
    .line 2466
    const/16 v25, 0x0

    .line 2467
    .line 2468
    const/16 v26, 0x0

    .line 2469
    .line 2470
    const/16 v27, 0x0

    .line 2471
    .line 2472
    const/16 v28, 0x0

    .line 2473
    .line 2474
    const/16 v29, 0x0

    .line 2475
    .line 2476
    const/16 v30, 0x0

    .line 2477
    .line 2478
    const/16 v31, 0x0

    .line 2479
    .line 2480
    const/16 v32, 0x0

    .line 2481
    .line 2482
    const/16 v33, 0x0

    .line 2483
    .line 2484
    const/16 v34, 0x0

    .line 2485
    .line 2486
    invoke-static/range {v9 .. v37}, La/dvk0;->a(La/dvk0;ZLa/xl9;La/a9l0;La/sdt;La/ptk0;La/cvk0;La/gvk0;La/evk0;La/lpp0;La/pvk0;La/rtk0;La/fvk0;La/bvk0;La/otk0;La/jwk0;La/gqk0;La/gtk0;La/ltk0;La/etk0;La/qtk0;La/ntk0;La/dtk0;La/avk0;La/ctk0;La/stk0;La/wcb;La/mtk0;I)La/dvk0;

    .line 2487
    .line 2488
    .line 2489
    move-result-object v3

    .line 2490
    invoke-virtual {v0, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2491
    .line 2492
    .line 2493
    move-result v2

    .line 2494
    if-eqz v2, :cond_41

    .line 2495
    .line 2496
    :cond_42
    sget-object v9, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2497
    .line 2498
    :goto_1b
    return-object v9

    .line 2499
    :pswitch_0
    sget-object v1, La/wne;->a:La/wne;

    .line 2500
    .line 2501
    iget-boolean v2, v0, La/zvk0;->j:Z

    .line 2502
    .line 2503
    const/4 v10, 0x1

    .line 2504
    if-eqz v2, :cond_44

    .line 2505
    .line 2506
    if-ne v2, v10, :cond_43

    .line 2507
    .line 2508
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 2509
    .line 2510
    .line 2511
    move-object/from16 v0, p1

    .line 2512
    .line 2513
    goto :goto_1c

    .line 2514
    :cond_43
    invoke-static {v7}, La/jf4;->n(Ljava/lang/String;)V

    .line 2515
    .line 2516
    .line 2517
    goto :goto_1f

    .line 2518
    :cond_44
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 2519
    .line 2520
    .line 2521
    iget-object v2, v8, La/iwk0;->H:La/xsu;

    .line 2522
    .line 2523
    iget-object v3, v8, La/iwk0;->p:Lorg/xplatform/special_event/impl/special_event_tab/presentation/model/SpecialEventTabScreenParams;

    .line 2524
    .line 2525
    iget v3, v3, Lorg/xplatform/special_event/impl/special_event_tab/presentation/model/SpecialEventTabScreenParams;->a:I

    .line 2526
    .line 2527
    iput-boolean v10, v0, La/zvk0;->j:Z

    .line 2528
    .line 2529
    iget-object v2, v2, La/xsu;->a:Ljava/lang/Object;

    .line 2530
    .line 2531
    check-cast v2, La/ggm0;

    .line 2532
    .line 2533
    invoke-virtual {v2, v3, v0}, La/ggm0;->a(ILa/zje;)Ljava/lang/Object;

    .line 2534
    .line 2535
    .line 2536
    move-result-object v0

    .line 2537
    if-ne v0, v1, :cond_45

    .line 2538
    .line 2539
    move-object v9, v1

    .line 2540
    goto :goto_1f

    .line 2541
    :cond_45
    :goto_1c
    check-cast v0, Ljava/util/List;

    .line 2542
    .line 2543
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 2544
    .line 2545
    .line 2546
    move-result v1

    .line 2547
    if-eqz v1, :cond_46

    .line 2548
    .line 2549
    new-instance v0, La/ssk0;

    .line 2550
    .line 2551
    sget-object v1, La/iun;->a:La/iun;

    .line 2552
    .line 2553
    invoke-direct {v0, v6, v1}, La/ssk0;-><init>(La/btk0;Ljava/util/List;)V

    .line 2554
    .line 2555
    .line 2556
    sget v1, La/iwk0;->X0:I

    .line 2557
    .line 2558
    invoke-virtual {v8, v0}, La/iwk0;->W(La/usk0;)V

    .line 2559
    .line 2560
    .line 2561
    goto :goto_1e

    .line 2562
    :cond_46
    new-instance v1, Ljava/util/ArrayList;

    .line 2563
    .line 2564
    const/16 v7, 0xa

    .line 2565
    .line 2566
    invoke-static {v0, v7}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 2567
    .line 2568
    .line 2569
    move-result v2

    .line 2570
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 2571
    .line 2572
    .line 2573
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2574
    .line 2575
    .line 2576
    move-result-object v2

    .line 2577
    :goto_1d
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 2578
    .line 2579
    .line 2580
    move-result v3

    .line 2581
    if-eqz v3, :cond_47

    .line 2582
    .line 2583
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2584
    .line 2585
    .line 2586
    move-result-object v3

    .line 2587
    check-cast v3, La/wwl0;

    .line 2588
    .line 2589
    iget-wide v3, v3, La/wwl0;->a:J

    .line 2590
    .line 2591
    invoke-static {v3, v4, v1}, La/axq;->t(JLjava/util/ArrayList;)V

    .line 2592
    .line 2593
    .line 2594
    goto :goto_1d

    .line 2595
    :cond_47
    sget v2, La/iwk0;->X0:I

    .line 2596
    .line 2597
    invoke-virtual {v8, v1}, La/iwk0;->P(Ljava/util/ArrayList;)V

    .line 2598
    .line 2599
    .line 2600
    new-instance v1, La/ssk0;

    .line 2601
    .line 2602
    invoke-direct {v1, v5, v0}, La/ssk0;-><init>(La/btk0;Ljava/util/List;)V

    .line 2603
    .line 2604
    .line 2605
    invoke-virtual {v8, v1}, La/iwk0;->W(La/usk0;)V

    .line 2606
    .line 2607
    .line 2608
    :goto_1e
    sget-object v9, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2609
    .line 2610
    :goto_1f
    return-object v9

    .line 2611
    :pswitch_1
    sget-object v1, La/wne;->a:La/wne;

    .line 2612
    .line 2613
    iget-boolean v2, v0, La/zvk0;->j:Z

    .line 2614
    .line 2615
    const/4 v10, 0x1

    .line 2616
    if-eqz v2, :cond_49

    .line 2617
    .line 2618
    if-ne v2, v10, :cond_48

    .line 2619
    .line 2620
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 2621
    .line 2622
    .line 2623
    move-object/from16 v0, p1

    .line 2624
    .line 2625
    goto :goto_20

    .line 2626
    :cond_48
    invoke-static {v7}, La/jf4;->n(Ljava/lang/String;)V

    .line 2627
    .line 2628
    .line 2629
    goto :goto_23

    .line 2630
    :cond_49
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 2631
    .line 2632
    .line 2633
    iget-object v2, v8, La/iwk0;->F:La/fzu;

    .line 2634
    .line 2635
    iget-object v3, v8, La/iwk0;->p:Lorg/xplatform/special_event/impl/special_event_tab/presentation/model/SpecialEventTabScreenParams;

    .line 2636
    .line 2637
    iget v3, v3, Lorg/xplatform/special_event/impl/special_event_tab/presentation/model/SpecialEventTabScreenParams;->a:I

    .line 2638
    .line 2639
    iput-boolean v10, v0, La/zvk0;->j:Z

    .line 2640
    .line 2641
    iget-object v2, v2, La/fzu;->a:La/dhm0;

    .line 2642
    .line 2643
    iget-object v4, v2, La/dhm0;->a:La/mne;

    .line 2644
    .line 2645
    iget-object v4, v4, La/mne;->b:La/dvj;

    .line 2646
    .line 2647
    new-instance v7, La/chm0;

    .line 2648
    .line 2649
    const/4 v13, 0x0

    .line 2650
    invoke-direct {v7, v2, v3, v9, v13}, La/chm0;-><init>(La/dhm0;ILa/yje;B)V

    .line 2651
    .line 2652
    .line 2653
    invoke-static {v4, v7, v0}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 2654
    .line 2655
    .line 2656
    move-result-object v0

    .line 2657
    if-ne v0, v1, :cond_4a

    .line 2658
    .line 2659
    move-object v9, v1

    .line 2660
    goto :goto_23

    .line 2661
    :cond_4a
    :goto_20
    check-cast v0, La/cxq0;

    .line 2662
    .line 2663
    iget-object v1, v0, La/cxq0;->b:La/h3r0;

    .line 2664
    .line 2665
    iget-object v0, v0, La/cxq0;->a:Ljava/util/List;

    .line 2666
    .line 2667
    iget-object v2, v1, La/h3r0;->a:Ljava/util/List;

    .line 2668
    .line 2669
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 2670
    .line 2671
    .line 2672
    move-result v2

    .line 2673
    if-nez v2, :cond_4c

    .line 2674
    .line 2675
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 2676
    .line 2677
    .line 2678
    move-result v2

    .line 2679
    if-eqz v2, :cond_4b

    .line 2680
    .line 2681
    goto :goto_21

    .line 2682
    :cond_4b
    iget-object v2, v1, La/h3r0;->a:Ljava/util/List;

    .line 2683
    .line 2684
    const/4 v13, 0x0

    .line 2685
    invoke-interface {v2, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 2686
    .line 2687
    .line 2688
    move-result-object v2

    .line 2689
    check-cast v2, La/u3r0;

    .line 2690
    .line 2691
    iget-object v2, v2, La/u3r0;->c:Ljava/util/List;

    .line 2692
    .line 2693
    iget-object v1, v1, La/h3r0;->b:Ljava/util/List;

    .line 2694
    .line 2695
    new-instance v3, La/qsk0;

    .line 2696
    .line 2697
    invoke-direct {v3, v5, v2, v1, v0}, La/qsk0;-><init>(La/btk0;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 2698
    .line 2699
    .line 2700
    sget v0, La/iwk0;->X0:I

    .line 2701
    .line 2702
    invoke-virtual {v8, v3}, La/iwk0;->W(La/usk0;)V

    .line 2703
    .line 2704
    .line 2705
    goto :goto_22

    .line 2706
    :cond_4c
    :goto_21
    sget-object v0, La/iun;->a:La/iun;

    .line 2707
    .line 2708
    new-instance v1, La/qsk0;

    .line 2709
    .line 2710
    invoke-direct {v1, v6, v0, v0, v0}, La/qsk0;-><init>(La/btk0;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 2711
    .line 2712
    .line 2713
    sget v0, La/iwk0;->X0:I

    .line 2714
    .line 2715
    invoke-virtual {v8, v1}, La/iwk0;->W(La/usk0;)V

    .line 2716
    .line 2717
    .line 2718
    :goto_22
    sget-object v9, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2719
    .line 2720
    :goto_23
    return-object v9

    .line 2721
    :pswitch_2
    sget-object v1, La/wne;->a:La/wne;

    .line 2722
    .line 2723
    iget-boolean v2, v0, La/zvk0;->j:Z

    .line 2724
    .line 2725
    const/4 v10, 0x1

    .line 2726
    if-eqz v2, :cond_4e

    .line 2727
    .line 2728
    if-ne v2, v10, :cond_4d

    .line 2729
    .line 2730
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 2731
    .line 2732
    .line 2733
    move-object/from16 v0, p1

    .line 2734
    .line 2735
    goto :goto_24

    .line 2736
    :cond_4d
    invoke-static {v7}, La/jf4;->n(Ljava/lang/String;)V

    .line 2737
    .line 2738
    .line 2739
    goto :goto_27

    .line 2740
    :cond_4e
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 2741
    .line 2742
    .line 2743
    iget-object v2, v8, La/iwk0;->H:La/xsu;

    .line 2744
    .line 2745
    iget-object v3, v8, La/iwk0;->p:Lorg/xplatform/special_event/impl/special_event_tab/presentation/model/SpecialEventTabScreenParams;

    .line 2746
    .line 2747
    iget v3, v3, Lorg/xplatform/special_event/impl/special_event_tab/presentation/model/SpecialEventTabScreenParams;->a:I

    .line 2748
    .line 2749
    iput-boolean v10, v0, La/zvk0;->j:Z

    .line 2750
    .line 2751
    iget-object v2, v2, La/xsu;->a:Ljava/lang/Object;

    .line 2752
    .line 2753
    check-cast v2, La/ggm0;

    .line 2754
    .line 2755
    invoke-virtual {v2, v3, v0}, La/ggm0;->a(ILa/zje;)Ljava/lang/Object;

    .line 2756
    .line 2757
    .line 2758
    move-result-object v0

    .line 2759
    if-ne v0, v1, :cond_4f

    .line 2760
    .line 2761
    move-object v9, v1

    .line 2762
    goto :goto_27

    .line 2763
    :cond_4f
    :goto_24
    check-cast v0, Ljava/util/List;

    .line 2764
    .line 2765
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 2766
    .line 2767
    .line 2768
    move-result v1

    .line 2769
    if-eqz v1, :cond_50

    .line 2770
    .line 2771
    new-instance v0, La/nsk0;

    .line 2772
    .line 2773
    sget-object v1, La/iun;->a:La/iun;

    .line 2774
    .line 2775
    invoke-direct {v0, v6, v1}, La/nsk0;-><init>(La/btk0;Ljava/util/List;)V

    .line 2776
    .line 2777
    .line 2778
    sget v1, La/iwk0;->X0:I

    .line 2779
    .line 2780
    invoke-virtual {v8, v0}, La/iwk0;->W(La/usk0;)V

    .line 2781
    .line 2782
    .line 2783
    goto :goto_26

    .line 2784
    :cond_50
    new-instance v1, Ljava/util/ArrayList;

    .line 2785
    .line 2786
    const/16 v7, 0xa

    .line 2787
    .line 2788
    invoke-static {v0, v7}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 2789
    .line 2790
    .line 2791
    move-result v2

    .line 2792
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 2793
    .line 2794
    .line 2795
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2796
    .line 2797
    .line 2798
    move-result-object v2

    .line 2799
    :goto_25
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 2800
    .line 2801
    .line 2802
    move-result v3

    .line 2803
    if-eqz v3, :cond_51

    .line 2804
    .line 2805
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2806
    .line 2807
    .line 2808
    move-result-object v3

    .line 2809
    check-cast v3, La/wwl0;

    .line 2810
    .line 2811
    iget-wide v3, v3, La/wwl0;->a:J

    .line 2812
    .line 2813
    invoke-static {v3, v4, v1}, La/axq;->t(JLjava/util/ArrayList;)V

    .line 2814
    .line 2815
    .line 2816
    goto :goto_25

    .line 2817
    :cond_51
    sget v2, La/iwk0;->X0:I

    .line 2818
    .line 2819
    invoke-virtual {v8, v1}, La/iwk0;->P(Ljava/util/ArrayList;)V

    .line 2820
    .line 2821
    .line 2822
    new-instance v1, La/nsk0;

    .line 2823
    .line 2824
    invoke-direct {v1, v5, v0}, La/nsk0;-><init>(La/btk0;Ljava/util/List;)V

    .line 2825
    .line 2826
    .line 2827
    invoke-virtual {v8, v1}, La/iwk0;->W(La/usk0;)V

    .line 2828
    .line 2829
    .line 2830
    :goto_26
    sget-object v9, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2831
    .line 2832
    :goto_27
    return-object v9

    .line 2833
    :pswitch_3
    sget-object v1, La/wne;->a:La/wne;

    .line 2834
    .line 2835
    iget-boolean v3, v0, La/zvk0;->j:Z

    .line 2836
    .line 2837
    const/4 v10, 0x1

    .line 2838
    if-eqz v3, :cond_53

    .line 2839
    .line 2840
    if-ne v3, v10, :cond_52

    .line 2841
    .line 2842
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 2843
    .line 2844
    .line 2845
    move-object/from16 v0, p1

    .line 2846
    .line 2847
    goto :goto_28

    .line 2848
    :cond_52
    invoke-static {v7}, La/jf4;->n(Ljava/lang/String;)V

    .line 2849
    .line 2850
    .line 2851
    goto :goto_2a

    .line 2852
    :cond_53
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 2853
    .line 2854
    .line 2855
    iget-object v3, v8, La/iwk0;->f0:La/hnu;

    .line 2856
    .line 2857
    iget-object v4, v8, La/iwk0;->p:Lorg/xplatform/special_event/impl/special_event_tab/presentation/model/SpecialEventTabScreenParams;

    .line 2858
    .line 2859
    iget v4, v4, Lorg/xplatform/special_event/impl/special_event_tab/presentation/model/SpecialEventTabScreenParams;->a:I

    .line 2860
    .line 2861
    iput-boolean v10, v0, La/zvk0;->j:Z

    .line 2862
    .line 2863
    iget-object v3, v3, La/hnu;->a:Ljava/lang/Object;

    .line 2864
    .line 2865
    check-cast v3, La/w1e0;

    .line 2866
    .line 2867
    iget-object v7, v3, La/w1e0;->a:La/mne;

    .line 2868
    .line 2869
    iget-object v7, v7, La/mne;->b:La/dvj;

    .line 2870
    .line 2871
    new-instance v10, La/v1e0;

    .line 2872
    .line 2873
    invoke-direct {v10, v3, v4, v9}, La/v1e0;-><init>(La/w1e0;ILa/yje;)V

    .line 2874
    .line 2875
    .line 2876
    invoke-static {v7, v10, v0}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 2877
    .line 2878
    .line 2879
    move-result-object v0

    .line 2880
    if-ne v0, v1, :cond_54

    .line 2881
    .line 2882
    move-object v9, v1

    .line 2883
    goto :goto_2a

    .line 2884
    :cond_54
    :goto_28
    check-cast v0, La/dqk0;

    .line 2885
    .line 2886
    if-eqz v0, :cond_57

    .line 2887
    .line 2888
    instance-of v1, v0, La/bqk0;

    .line 2889
    .line 2890
    if-eqz v1, :cond_55

    .line 2891
    .line 2892
    new-instance v0, La/lsk0;

    .line 2893
    .line 2894
    sget-object v1, La/iun;->a:La/iun;

    .line 2895
    .line 2896
    invoke-direct {v0, v2, v1}, La/lsk0;-><init>(La/btk0;Ljava/util/List;)V

    .line 2897
    .line 2898
    .line 2899
    sget v1, La/iwk0;->X0:I

    .line 2900
    .line 2901
    invoke-virtual {v8, v0}, La/iwk0;->W(La/usk0;)V

    .line 2902
    .line 2903
    .line 2904
    goto :goto_29

    .line 2905
    :cond_55
    instance-of v1, v0, La/cqk0;

    .line 2906
    .line 2907
    if-eqz v1, :cond_57

    .line 2908
    .line 2909
    check-cast v0, La/cqk0;

    .line 2910
    .line 2911
    iget-object v0, v0, La/cqk0;->a:Ljava/lang/Object;

    .line 2912
    .line 2913
    check-cast v0, Ljava/util/List;

    .line 2914
    .line 2915
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 2916
    .line 2917
    .line 2918
    move-result v1

    .line 2919
    if-nez v1, :cond_56

    .line 2920
    .line 2921
    new-instance v1, La/lsk0;

    .line 2922
    .line 2923
    invoke-direct {v1, v5, v0}, La/lsk0;-><init>(La/btk0;Ljava/util/List;)V

    .line 2924
    .line 2925
    .line 2926
    sget v0, La/iwk0;->X0:I

    .line 2927
    .line 2928
    invoke-virtual {v8, v1}, La/iwk0;->W(La/usk0;)V

    .line 2929
    .line 2930
    .line 2931
    goto :goto_29

    .line 2932
    :cond_56
    new-instance v0, La/lsk0;

    .line 2933
    .line 2934
    sget-object v1, La/iun;->a:La/iun;

    .line 2935
    .line 2936
    invoke-direct {v0, v6, v1}, La/lsk0;-><init>(La/btk0;Ljava/util/List;)V

    .line 2937
    .line 2938
    .line 2939
    sget v1, La/iwk0;->X0:I

    .line 2940
    .line 2941
    invoke-virtual {v8, v0}, La/iwk0;->W(La/usk0;)V

    .line 2942
    .line 2943
    .line 2944
    :goto_29
    sget-object v9, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2945
    .line 2946
    goto :goto_2a

    .line 2947
    :cond_57
    invoke-static {}, La/t9f;->b()V

    .line 2948
    .line 2949
    .line 2950
    :goto_2a
    return-object v9

    .line 2951
    :pswitch_4
    sget-object v1, La/wne;->a:La/wne;

    .line 2952
    .line 2953
    iget-boolean v2, v0, La/zvk0;->j:Z

    .line 2954
    .line 2955
    if-eqz v2, :cond_59

    .line 2956
    .line 2957
    const/4 v10, 0x1

    .line 2958
    if-ne v2, v10, :cond_58

    .line 2959
    .line 2960
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 2961
    .line 2962
    .line 2963
    move-object/from16 v0, p1

    .line 2964
    .line 2965
    goto/16 :goto_2d

    .line 2966
    .line 2967
    :cond_58
    invoke-static {v7}, La/jf4;->n(Ljava/lang/String;)V

    .line 2968
    .line 2969
    .line 2970
    goto/16 :goto_2f

    .line 2971
    .line 2972
    :cond_59
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 2973
    .line 2974
    .line 2975
    iget-object v2, v8, La/iwk0;->t:La/iuu;

    .line 2976
    .line 2977
    iget-object v3, v8, La/iwk0;->A:La/luu;

    .line 2978
    .line 2979
    iget-object v3, v3, La/luu;->a:La/nok0;

    .line 2980
    .line 2981
    invoke-virtual {v3}, La/nok0;->a()Ljava/util/List;

    .line 2982
    .line 2983
    .line 2984
    move-result-object v3

    .line 2985
    new-instance v4, Ljava/util/ArrayList;

    .line 2986
    .line 2987
    const/16 v7, 0xa

    .line 2988
    .line 2989
    invoke-static {v3, v7}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 2990
    .line 2991
    .line 2992
    move-result v9

    .line 2993
    invoke-direct {v4, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 2994
    .line 2995
    .line 2996
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2997
    .line 2998
    .line 2999
    move-result-object v7

    .line 3000
    :goto_2b
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 3001
    .line 3002
    .line 3003
    move-result v9

    .line 3004
    if-eqz v9, :cond_5a

    .line 3005
    .line 3006
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 3007
    .line 3008
    .line 3009
    move-result-object v9

    .line 3010
    check-cast v9, La/lok0;

    .line 3011
    .line 3012
    iget v9, v9, La/lok0;->a:I

    .line 3013
    .line 3014
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 3015
    .line 3016
    .line 3017
    move-result-object v9

    .line 3018
    invoke-virtual {v4, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 3019
    .line 3020
    .line 3021
    goto :goto_2b

    .line 3022
    :cond_5a
    iget-object v7, v8, La/iwk0;->p:Lorg/xplatform/special_event/impl/special_event_tab/presentation/model/SpecialEventTabScreenParams;

    .line 3023
    .line 3024
    iget v7, v7, Lorg/xplatform/special_event/impl/special_event_tab/presentation/model/SpecialEventTabScreenParams;->a:I

    .line 3025
    .line 3026
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 3027
    .line 3028
    .line 3029
    move-result-object v7

    .line 3030
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    .line 3031
    .line 3032
    .line 3033
    move-result v4

    .line 3034
    new-instance v7, Ljava/util/ArrayList;

    .line 3035
    .line 3036
    const/16 v9, 0xa

    .line 3037
    .line 3038
    invoke-static {v3, v9}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 3039
    .line 3040
    .line 3041
    move-result v9

    .line 3042
    invoke-direct {v7, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 3043
    .line 3044
    .line 3045
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 3046
    .line 3047
    .line 3048
    move-result-object v3

    .line 3049
    :goto_2c
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 3050
    .line 3051
    .line 3052
    move-result v9

    .line 3053
    if-eqz v9, :cond_5b

    .line 3054
    .line 3055
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 3056
    .line 3057
    .line 3058
    move-result-object v9

    .line 3059
    check-cast v9, La/lok0;

    .line 3060
    .line 3061
    iget v9, v9, La/lok0;->q:I

    .line 3062
    .line 3063
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 3064
    .line 3065
    .line 3066
    move-result-object v9

    .line 3067
    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 3068
    .line 3069
    .line 3070
    goto :goto_2c

    .line 3071
    :cond_5b
    invoke-virtual {v7, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 3072
    .line 3073
    .line 3074
    move-result-object v3

    .line 3075
    check-cast v3, Ljava/lang/Number;

    .line 3076
    .line 3077
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 3078
    .line 3079
    .line 3080
    move-result v3

    .line 3081
    const/4 v10, 0x1

    .line 3082
    iput-boolean v10, v0, La/zvk0;->j:Z

    .line 3083
    .line 3084
    invoke-virtual {v2, v3, v0}, La/iuu;->a(ILa/zje;)Ljava/lang/Object;

    .line 3085
    .line 3086
    .line 3087
    move-result-object v0

    .line 3088
    if-ne v0, v1, :cond_5c

    .line 3089
    .line 3090
    move-object v9, v1

    .line 3091
    goto :goto_2f

    .line 3092
    :cond_5c
    :goto_2d
    check-cast v0, Ljava/util/List;

    .line 3093
    .line 3094
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 3095
    .line 3096
    .line 3097
    move-result v1

    .line 3098
    if-eqz v1, :cond_5d

    .line 3099
    .line 3100
    new-instance v0, La/ksk0;

    .line 3101
    .line 3102
    sget-object v1, La/iun;->a:La/iun;

    .line 3103
    .line 3104
    invoke-direct {v0, v6, v1}, La/ksk0;-><init>(La/btk0;Ljava/util/List;)V

    .line 3105
    .line 3106
    .line 3107
    sget v1, La/iwk0;->X0:I

    .line 3108
    .line 3109
    invoke-virtual {v8, v0}, La/iwk0;->W(La/usk0;)V

    .line 3110
    .line 3111
    .line 3112
    goto :goto_2e

    .line 3113
    :cond_5d
    new-instance v1, La/ksk0;

    .line 3114
    .line 3115
    invoke-direct {v1, v5, v0}, La/ksk0;-><init>(La/btk0;Ljava/util/List;)V

    .line 3116
    .line 3117
    .line 3118
    sget v0, La/iwk0;->X0:I

    .line 3119
    .line 3120
    invoke-virtual {v8, v1}, La/iwk0;->W(La/usk0;)V

    .line 3121
    .line 3122
    .line 3123
    :goto_2e
    sget-object v9, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 3124
    .line 3125
    :goto_2f
    return-object v9

    .line 3126
    :pswitch_5
    sget-object v1, La/wne;->a:La/wne;

    .line 3127
    .line 3128
    iget-boolean v2, v0, La/zvk0;->j:Z

    .line 3129
    .line 3130
    const/4 v10, 0x1

    .line 3131
    if-eqz v2, :cond_5f

    .line 3132
    .line 3133
    if-ne v2, v10, :cond_5e

    .line 3134
    .line 3135
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 3136
    .line 3137
    .line 3138
    move-object/from16 v0, p1

    .line 3139
    .line 3140
    goto :goto_30

    .line 3141
    :cond_5e
    invoke-static {v7}, La/jf4;->n(Ljava/lang/String;)V

    .line 3142
    .line 3143
    .line 3144
    goto :goto_32

    .line 3145
    :cond_5f
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 3146
    .line 3147
    .line 3148
    iget-object v2, v8, La/iwk0;->L:La/fxt;

    .line 3149
    .line 3150
    iget-object v3, v8, La/iwk0;->p:Lorg/xplatform/special_event/impl/special_event_tab/presentation/model/SpecialEventTabScreenParams;

    .line 3151
    .line 3152
    iget v3, v3, Lorg/xplatform/special_event/impl/special_event_tab/presentation/model/SpecialEventTabScreenParams;->a:I

    .line 3153
    .line 3154
    iput-boolean v10, v0, La/zvk0;->j:Z

    .line 3155
    .line 3156
    invoke-virtual {v2, v3, v0}, La/fxt;->a(ILa/zje;)Ljava/lang/Object;

    .line 3157
    .line 3158
    .line 3159
    move-result-object v0

    .line 3160
    if-ne v0, v1, :cond_60

    .line 3161
    .line 3162
    move-object v9, v1

    .line 3163
    goto :goto_32

    .line 3164
    :cond_60
    :goto_30
    check-cast v0, Ljava/util/List;

    .line 3165
    .line 3166
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 3167
    .line 3168
    .line 3169
    move-result v1

    .line 3170
    if-eqz v1, :cond_61

    .line 3171
    .line 3172
    new-instance v0, La/hsk0;

    .line 3173
    .line 3174
    sget-object v1, La/iun;->a:La/iun;

    .line 3175
    .line 3176
    invoke-direct {v0, v6, v1}, La/hsk0;-><init>(La/btk0;Ljava/util/List;)V

    .line 3177
    .line 3178
    .line 3179
    sget v1, La/iwk0;->X0:I

    .line 3180
    .line 3181
    invoke-virtual {v8, v0}, La/iwk0;->W(La/usk0;)V

    .line 3182
    .line 3183
    .line 3184
    goto :goto_31

    .line 3185
    :cond_61
    new-instance v1, La/hsk0;

    .line 3186
    .line 3187
    invoke-direct {v1, v5, v0}, La/hsk0;-><init>(La/btk0;Ljava/util/List;)V

    .line 3188
    .line 3189
    .line 3190
    sget v0, La/iwk0;->X0:I

    .line 3191
    .line 3192
    invoke-virtual {v8, v1}, La/iwk0;->W(La/usk0;)V

    .line 3193
    .line 3194
    .line 3195
    :goto_31
    sget-object v9, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 3196
    .line 3197
    :goto_32
    return-object v9

    .line 3198
    nop

    .line 3199
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

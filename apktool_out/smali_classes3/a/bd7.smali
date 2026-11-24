.class public final La/bd7;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/kd7;


# direct methods
.method public synthetic constructor <init>(La/kd7;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/bd7;->i:B

    iput-object p1, p0, La/bd7;->k:La/kd7;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/bd7;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/bd7;->k:La/kd7;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/bd7;

    .line 9
    .line 10
    const/4 v0, 0x6

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/bd7;-><init>(La/kd7;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/bd7;

    .line 16
    .line 17
    const/4 v0, 0x5

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/bd7;-><init>(La/kd7;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    :pswitch_1
    new-instance p1, La/bd7;

    .line 23
    .line 24
    const/4 v0, 0x4

    .line 25
    invoke-direct {p1, p0, p2, v0}, La/bd7;-><init>(La/kd7;La/yje;B)V

    .line 26
    .line 27
    .line 28
    return-object p1

    .line 29
    :pswitch_2
    new-instance p1, La/bd7;

    .line 30
    .line 31
    const/4 v0, 0x3

    .line 32
    invoke-direct {p1, p0, p2, v0}, La/bd7;-><init>(La/kd7;La/yje;B)V

    .line 33
    .line 34
    .line 35
    return-object p1

    .line 36
    :pswitch_3
    new-instance p1, La/bd7;

    .line 37
    .line 38
    const/4 v0, 0x2

    .line 39
    invoke-direct {p1, p0, p2, v0}, La/bd7;-><init>(La/kd7;La/yje;B)V

    .line 40
    .line 41
    .line 42
    return-object p1

    .line 43
    :pswitch_4
    new-instance v0, La/bd7;

    .line 44
    .line 45
    const/4 v1, 0x1

    .line 46
    invoke-direct {v0, p0, p2, v1}, La/bd7;-><init>(La/kd7;La/yje;B)V

    .line 47
    .line 48
    .line 49
    check-cast p1, Ljava/lang/Boolean;

    .line 50
    .line 51
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    iput-boolean p0, v0, La/bd7;->j:Z

    .line 56
    .line 57
    return-object v0

    .line 58
    :pswitch_5
    new-instance p1, La/bd7;

    .line 59
    .line 60
    const/4 v0, 0x0

    .line 61
    invoke-direct {p1, p0, p2, v0}, La/bd7;-><init>(La/kd7;La/yje;B)V

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
    iget-byte v0, p0, La/bd7;->i:B

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
    invoke-virtual {p0, p1, p2}, La/bd7;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/bd7;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/bd7;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/bd7;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/bd7;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/bd7;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, La/vne;

    .line 41
    .line 42
    check-cast p2, La/yje;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, La/bd7;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/bd7;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/bd7;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :pswitch_2
    check-cast p1, La/vne;

    .line 58
    .line 59
    check-cast p2, La/yje;

    .line 60
    .line 61
    invoke-virtual {p0, p1, p2}, La/bd7;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    check-cast p0, La/bd7;

    .line 66
    .line 67
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 68
    .line 69
    invoke-virtual {p0, p1}, La/bd7;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    return-object p0

    .line 74
    :pswitch_3
    check-cast p1, La/vne;

    .line 75
    .line 76
    check-cast p2, La/yje;

    .line 77
    .line 78
    invoke-virtual {p0, p1, p2}, La/bd7;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    check-cast p0, La/bd7;

    .line 83
    .line 84
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 85
    .line 86
    invoke-virtual {p0, p1}, La/bd7;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    return-object p0

    .line 91
    :pswitch_4
    check-cast p1, Ljava/lang/Boolean;

    .line 92
    .line 93
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 94
    .line 95
    .line 96
    check-cast p2, La/yje;

    .line 97
    .line 98
    invoke-virtual {p0, p1, p2}, La/bd7;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    check-cast p0, La/bd7;

    .line 103
    .line 104
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 105
    .line 106
    invoke-virtual {p0, p1}, La/bd7;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/bd7;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    check-cast p0, La/bd7;

    .line 120
    .line 121
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 122
    .line 123
    invoke-virtual {p0, p1}, La/bd7;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/bd7;->i:B

    .line 4
    .line 5
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    const/4 v4, 0x0

    .line 9
    iget-object v5, v0, La/bd7;->k:La/kd7;

    .line 10
    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    sget-object v1, La/wne;->a:La/wne;

    .line 15
    .line 16
    iget-boolean v6, v0, La/bd7;->j:Z

    .line 17
    .line 18
    if-eqz v6, :cond_1

    .line 19
    .line 20
    if-ne v6, v3, :cond_0

    .line 21
    .line 22
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    move-object/from16 v0, p1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    goto :goto_2

    .line 32
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iget-object v2, v5, La/kd7;->u:La/uii;

    .line 36
    .line 37
    iget-object v6, v5, La/kd7;->o:Ljava/lang/String;

    .line 38
    .line 39
    iget-object v7, v5, La/kd7;->p:Lorg/xplatform/bet_history/bet_info/presentation/model/BetInfoScreenModel;

    .line 40
    .line 41
    iput-boolean v3, v0, La/bd7;->j:Z

    .line 42
    .line 43
    invoke-virtual {v2, v6, v7, v0}, La/uii;->B(Ljava/lang/String;Lorg/xplatform/bet_history/bet_info/presentation/model/BetInfoScreenModel;La/zje;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    if-ne v0, v1, :cond_2

    .line 48
    .line 49
    move-object v4, v1

    .line 50
    goto :goto_2

    .line 51
    :cond_2
    :goto_0
    move-object v9, v0

    .line 52
    check-cast v9, La/a5w;

    .line 53
    .line 54
    sget-object v0, La/kd7;->m0:Ljava/util/List;

    .line 55
    .line 56
    iget-object v0, v5, La/i3t0;->i:La/ocj;

    .line 57
    .line 58
    iget-object v1, v0, La/ocj;->a:La/p7m0;

    .line 59
    .line 60
    :cond_3
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    move-object v6, v0

    .line 68
    check-cast v6, La/rc7;

    .line 69
    .line 70
    const-wide/16 v21, 0x0

    .line 71
    .line 72
    const v23, 0xffffff7

    .line 73
    .line 74
    .line 75
    const/4 v7, 0x0

    .line 76
    const/4 v8, 0x0

    .line 77
    const/4 v10, 0x0

    .line 78
    const/4 v11, 0x0

    .line 79
    const/4 v12, 0x0

    .line 80
    const/4 v13, 0x0

    .line 81
    const/4 v14, 0x0

    .line 82
    const/4 v15, 0x0

    .line 83
    const/16 v16, 0x0

    .line 84
    .line 85
    const/16 v17, 0x0

    .line 86
    .line 87
    const/16 v18, 0x0

    .line 88
    .line 89
    const-wide/16 v19, 0x0

    .line 90
    .line 91
    invoke-static/range {v6 .. v23}, La/rc7;->a(La/rc7;La/s9x;ZLa/a5w;La/z760;Ljava/util/List;La/ql5;Ljava/util/List;Ljava/util/List;Ljava/util/Map;ZZZJJI)La/rc7;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    if-eqz v0, :cond_3

    .line 100
    .line 101
    invoke-virtual {v5}, La/kd7;->P()Z

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    if-eqz v0, :cond_4

    .line 106
    .line 107
    invoke-virtual {v5}, La/kd7;->R()Z

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    if-eqz v0, :cond_4

    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_4
    iget-object v0, v5, La/kd7;->k0:La/bby;

    .line 115
    .line 116
    if-eqz v0, :cond_5

    .line 117
    .line 118
    invoke-interface {v0, v4}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 119
    .line 120
    .line 121
    :cond_5
    :goto_1
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 122
    .line 123
    :goto_2
    return-object v4

    .line 124
    :pswitch_0
    sget-object v1, La/wne;->a:La/wne;

    .line 125
    .line 126
    iget-boolean v6, v0, La/bd7;->j:Z

    .line 127
    .line 128
    if-eqz v6, :cond_7

    .line 129
    .line 130
    if-ne v6, v3, :cond_6

    .line 131
    .line 132
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    goto :goto_3

    .line 136
    :cond_6
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    goto :goto_4

    .line 140
    :cond_7
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    iget-object v2, v5, La/kd7;->d0:La/xw30;

    .line 144
    .line 145
    iput-boolean v3, v0, La/bd7;->j:Z

    .line 146
    .line 147
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    sget-object v3, La/kv30;->a:La/kv30;

    .line 151
    .line 152
    invoke-virtual {v2, v3, v0}, La/xw30;->j(La/lv30;La/zje;)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    if-ne v0, v1, :cond_8

    .line 157
    .line 158
    move-object v4, v1

    .line 159
    goto :goto_4

    .line 160
    :cond_8
    :goto_3
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 161
    .line 162
    :goto_4
    return-object v4

    .line 163
    :pswitch_1
    sget-object v1, La/wne;->a:La/wne;

    .line 164
    .line 165
    iget-boolean v6, v0, La/bd7;->j:Z

    .line 166
    .line 167
    if-eqz v6, :cond_a

    .line 168
    .line 169
    if-ne v6, v3, :cond_9

    .line 170
    .line 171
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 172
    .line 173
    .line 174
    goto :goto_5

    .line 175
    :cond_9
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    goto :goto_6

    .line 179
    :cond_a
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 180
    .line 181
    .line 182
    sget-object v2, La/kd7;->m0:Ljava/util/List;

    .line 183
    .line 184
    iget-object v2, v5, La/i3t0;->i:La/ocj;

    .line 185
    .line 186
    iget-object v6, v2, La/ocj;->a:La/p7m0;

    .line 187
    .line 188
    :cond_b
    invoke-virtual {v6}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v2

    .line 192
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 193
    .line 194
    .line 195
    move-object v7, v2

    .line 196
    check-cast v7, La/rc7;

    .line 197
    .line 198
    const-wide/16 v22, 0x0

    .line 199
    .line 200
    const v24, 0xff7ffff

    .line 201
    .line 202
    .line 203
    const/4 v8, 0x0

    .line 204
    const/4 v9, 0x0

    .line 205
    const/4 v10, 0x0

    .line 206
    const/4 v11, 0x0

    .line 207
    const/4 v12, 0x0

    .line 208
    const/4 v13, 0x0

    .line 209
    const/4 v14, 0x0

    .line 210
    const/4 v15, 0x0

    .line 211
    const/16 v16, 0x0

    .line 212
    .line 213
    const/16 v17, 0x1

    .line 214
    .line 215
    const/16 v18, 0x0

    .line 216
    .line 217
    const/16 v19, 0x0

    .line 218
    .line 219
    const-wide/16 v20, 0x0

    .line 220
    .line 221
    invoke-static/range {v7 .. v24}, La/rc7;->a(La/rc7;La/s9x;ZLa/a5w;La/z760;Ljava/util/List;La/ql5;Ljava/util/List;Ljava/util/List;Ljava/util/Map;ZZZJJI)La/rc7;

    .line 222
    .line 223
    .line 224
    move-result-object v4

    .line 225
    invoke-virtual {v6, v2, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 226
    .line 227
    .line 228
    move-result v2

    .line 229
    if-eqz v2, :cond_b

    .line 230
    .line 231
    iget-object v2, v5, La/kd7;->d0:La/xw30;

    .line 232
    .line 233
    new-instance v4, La/iv30;

    .line 234
    .line 235
    iget-object v5, v5, La/kd7;->p:Lorg/xplatform/bet_history/bet_info/presentation/model/BetInfoScreenModel;

    .line 236
    .line 237
    iget-object v5, v5, Lorg/xplatform/bet_history/bet_info/presentation/model/BetInfoScreenModel;->c:La/f8w;

    .line 238
    .line 239
    invoke-direct {v4, v5}, La/iv30;-><init>(La/f8w;)V

    .line 240
    .line 241
    .line 242
    iput-boolean v3, v0, La/bd7;->j:Z

    .line 243
    .line 244
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 245
    .line 246
    .line 247
    invoke-virtual {v2, v4, v0}, La/xw30;->j(La/lv30;La/zje;)Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    move-result-object v0

    .line 251
    if-ne v0, v1, :cond_c

    .line 252
    .line 253
    move-object v4, v1

    .line 254
    goto :goto_6

    .line 255
    :cond_c
    :goto_5
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 256
    .line 257
    :goto_6
    return-object v4

    .line 258
    :pswitch_2
    sget-object v1, La/wne;->a:La/wne;

    .line 259
    .line 260
    iget-boolean v6, v0, La/bd7;->j:Z

    .line 261
    .line 262
    if-eqz v6, :cond_e

    .line 263
    .line 264
    if-ne v6, v3, :cond_d

    .line 265
    .line 266
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 267
    .line 268
    .line 269
    goto :goto_7

    .line 270
    :cond_d
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 271
    .line 272
    .line 273
    goto :goto_8

    .line 274
    :cond_e
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 275
    .line 276
    .line 277
    iget-object v2, v5, La/kd7;->d0:La/xw30;

    .line 278
    .line 279
    iput-boolean v3, v0, La/bd7;->j:Z

    .line 280
    .line 281
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 282
    .line 283
    .line 284
    sget-object v3, La/gv30;->a:La/gv30;

    .line 285
    .line 286
    invoke-virtual {v2, v3, v0}, La/xw30;->j(La/lv30;La/zje;)Ljava/lang/Object;

    .line 287
    .line 288
    .line 289
    move-result-object v0

    .line 290
    if-ne v0, v1, :cond_f

    .line 291
    .line 292
    move-object v4, v1

    .line 293
    goto :goto_8

    .line 294
    :cond_f
    :goto_7
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 295
    .line 296
    :goto_8
    return-object v4

    .line 297
    :pswitch_3
    sget-object v1, La/wne;->a:La/wne;

    .line 298
    .line 299
    iget-boolean v6, v0, La/bd7;->j:Z

    .line 300
    .line 301
    if-eqz v6, :cond_11

    .line 302
    .line 303
    if-ne v6, v3, :cond_10

    .line 304
    .line 305
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 306
    .line 307
    .line 308
    goto :goto_9

    .line 309
    :cond_10
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 310
    .line 311
    .line 312
    goto :goto_a

    .line 313
    :cond_11
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 314
    .line 315
    .line 316
    iget-object v2, v5, La/kd7;->d0:La/xw30;

    .line 317
    .line 318
    iput-boolean v3, v0, La/bd7;->j:Z

    .line 319
    .line 320
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 321
    .line 322
    .line 323
    sget-object v3, La/dv30;->a:La/dv30;

    .line 324
    .line 325
    invoke-virtual {v2, v3, v0}, La/xw30;->j(La/lv30;La/zje;)Ljava/lang/Object;

    .line 326
    .line 327
    .line 328
    move-result-object v0

    .line 329
    if-ne v0, v1, :cond_12

    .line 330
    .line 331
    move-object v4, v1

    .line 332
    goto :goto_a

    .line 333
    :cond_12
    :goto_9
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 334
    .line 335
    :goto_a
    return-object v4

    .line 336
    :pswitch_4
    iget-boolean v7, v0, La/bd7;->j:Z

    .line 337
    .line 338
    sget-object v0, La/wne;->a:La/wne;

    .line 339
    .line 340
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 341
    .line 342
    .line 343
    invoke-virtual {v5}, La/i3t0;->D()Ljava/lang/Object;

    .line 344
    .line 345
    .line 346
    move-result-object v0

    .line 347
    check-cast v0, La/rc7;

    .line 348
    .line 349
    iget-boolean v0, v0, La/rc7;->b:Z

    .line 350
    .line 351
    if-nez v0, :cond_13

    .line 352
    .line 353
    invoke-virtual {v5}, La/i3t0;->D()Ljava/lang/Object;

    .line 354
    .line 355
    .line 356
    move-result-object v0

    .line 357
    check-cast v0, La/rc7;

    .line 358
    .line 359
    iget-object v0, v0, La/rc7;->a:La/s9x;

    .line 360
    .line 361
    sget-object v1, La/r9x;->a:La/r9x;

    .line 362
    .line 363
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 364
    .line 365
    .line 366
    move-result v0

    .line 367
    if-nez v0, :cond_13

    .line 368
    .line 369
    invoke-virtual {v5}, La/kd7;->Q()V

    .line 370
    .line 371
    .line 372
    :cond_13
    iget-object v0, v5, La/i3t0;->i:La/ocj;

    .line 373
    .line 374
    iget-object v1, v0, La/ocj;->a:La/p7m0;

    .line 375
    .line 376
    :cond_14
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 377
    .line 378
    .line 379
    move-result-object v0

    .line 380
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 381
    .line 382
    .line 383
    move-object v5, v0

    .line 384
    check-cast v5, La/rc7;

    .line 385
    .line 386
    const-wide/16 v20, 0x0

    .line 387
    .line 388
    const v22, 0xffffffd

    .line 389
    .line 390
    .line 391
    const/4 v6, 0x0

    .line 392
    const/4 v8, 0x0

    .line 393
    const/4 v9, 0x0

    .line 394
    const/4 v10, 0x0

    .line 395
    const/4 v11, 0x0

    .line 396
    const/4 v12, 0x0

    .line 397
    const/4 v13, 0x0

    .line 398
    const/4 v14, 0x0

    .line 399
    const/4 v15, 0x0

    .line 400
    const/16 v16, 0x0

    .line 401
    .line 402
    const/16 v17, 0x0

    .line 403
    .line 404
    const-wide/16 v18, 0x0

    .line 405
    .line 406
    invoke-static/range {v5 .. v22}, La/rc7;->a(La/rc7;La/s9x;ZLa/a5w;La/z760;Ljava/util/List;La/ql5;Ljava/util/List;Ljava/util/List;Ljava/util/Map;ZZZJJI)La/rc7;

    .line 407
    .line 408
    .line 409
    move-result-object v2

    .line 410
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 411
    .line 412
    .line 413
    move-result v0

    .line 414
    if-eqz v0, :cond_14

    .line 415
    .line 416
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 417
    .line 418
    return-object v0

    .line 419
    :pswitch_5
    sget-object v1, La/wne;->a:La/wne;

    .line 420
    .line 421
    iget-boolean v6, v0, La/bd7;->j:Z

    .line 422
    .line 423
    if-eqz v6, :cond_16

    .line 424
    .line 425
    if-ne v6, v3, :cond_15

    .line 426
    .line 427
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 428
    .line 429
    .line 430
    move-object/from16 v0, p1

    .line 431
    .line 432
    goto :goto_b

    .line 433
    :cond_15
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 434
    .line 435
    .line 436
    goto :goto_c

    .line 437
    :cond_16
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 438
    .line 439
    .line 440
    iget-object v2, v5, La/kd7;->q:La/jrt;

    .line 441
    .line 442
    iget-object v4, v5, La/kd7;->p:Lorg/xplatform/bet_history/bet_info/presentation/model/BetInfoScreenModel;

    .line 443
    .line 444
    iget-wide v6, v4, Lorg/xplatform/bet_history/bet_info/presentation/model/BetInfoScreenModel;->b:J

    .line 445
    .line 446
    iget-object v4, v4, Lorg/xplatform/bet_history/bet_info/presentation/model/BetInfoScreenModel;->a:Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;

    .line 447
    .line 448
    iput-boolean v3, v0, La/bd7;->j:Z

    .line 449
    .line 450
    invoke-virtual {v2, v6, v7, v4, v0}, La/jrt;->b(JLorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;La/yje;)Ljava/io/Serializable;

    .line 451
    .line 452
    .line 453
    move-result-object v0

    .line 454
    if-ne v0, v1, :cond_17

    .line 455
    .line 456
    move-object v4, v1

    .line 457
    goto :goto_c

    .line 458
    :cond_17
    :goto_b
    move-object v12, v0

    .line 459
    check-cast v12, La/ql5;

    .line 460
    .line 461
    sget-object v0, La/kd7;->m0:Ljava/util/List;

    .line 462
    .line 463
    iget-object v0, v5, La/i3t0;->i:La/ocj;

    .line 464
    .line 465
    iget-object v0, v0, La/ocj;->a:La/p7m0;

    .line 466
    .line 467
    :cond_18
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 468
    .line 469
    .line 470
    move-result-object v1

    .line 471
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 472
    .line 473
    .line 474
    move-object v6, v1

    .line 475
    check-cast v6, La/rc7;

    .line 476
    .line 477
    const-wide/16 v21, 0x0

    .line 478
    .line 479
    const v23, 0xfffff7f

    .line 480
    .line 481
    .line 482
    const/4 v7, 0x0

    .line 483
    const/4 v8, 0x0

    .line 484
    const/4 v9, 0x0

    .line 485
    const/4 v10, 0x0

    .line 486
    const/4 v11, 0x0

    .line 487
    const/4 v13, 0x0

    .line 488
    const/4 v14, 0x0

    .line 489
    const/4 v15, 0x0

    .line 490
    const/16 v16, 0x0

    .line 491
    .line 492
    const/16 v17, 0x0

    .line 493
    .line 494
    const/16 v18, 0x0

    .line 495
    .line 496
    const-wide/16 v19, 0x0

    .line 497
    .line 498
    invoke-static/range {v6 .. v23}, La/rc7;->a(La/rc7;La/s9x;ZLa/a5w;La/z760;Ljava/util/List;La/ql5;Ljava/util/List;Ljava/util/List;Ljava/util/Map;ZZZJJI)La/rc7;

    .line 499
    .line 500
    .line 501
    move-result-object v2

    .line 502
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 503
    .line 504
    .line 505
    move-result v1

    .line 506
    if-eqz v1, :cond_18

    .line 507
    .line 508
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 509
    .line 510
    :goto_c
    return-object v4

    .line 511
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

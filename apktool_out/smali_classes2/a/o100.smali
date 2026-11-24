.class public final La/o100;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:B

.field public final synthetic k:La/p100;

.field public final synthetic l:Lorg/xplatform/limits_ne/api/domain/LimitNeGroupEnum;


# direct methods
.method public synthetic constructor <init>(La/p100;Lorg/xplatform/limits_ne/api/domain/LimitNeGroupEnum;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/o100;->i:B

    iput-object p1, p0, La/o100;->k:La/p100;

    iput-object p2, p0, La/o100;->l:Lorg/xplatform/limits_ne/api/domain/LimitNeGroupEnum;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte p1, p0, La/o100;->i:B

    .line 2
    .line 3
    iget-object v0, p0, La/o100;->l:Lorg/xplatform/limits_ne/api/domain/LimitNeGroupEnum;

    .line 4
    .line 5
    iget-object p0, p0, La/o100;->k:La/p100;

    .line 6
    .line 7
    packed-switch p1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance p1, La/o100;

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-direct {p1, p0, v0, p2, v1}, La/o100;-><init>(La/p100;Lorg/xplatform/limits_ne/api/domain/LimitNeGroupEnum;La/yje;B)V

    .line 14
    .line 15
    .line 16
    return-object p1

    .line 17
    :pswitch_0
    new-instance p1, La/o100;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {p1, p0, v0, p2, v1}, La/o100;-><init>(La/p100;Lorg/xplatform/limits_ne/api/domain/LimitNeGroupEnum;La/yje;B)V

    .line 21
    .line 22
    .line 23
    return-object p1

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/o100;->i:B

    .line 2
    .line 3
    check-cast p1, La/vne;

    .line 4
    .line 5
    check-cast p2, La/yje;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/o100;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/o100;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/o100;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/o100;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/o100;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/o100;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/o100;->i:B

    .line 4
    .line 5
    const-wide/16 v2, 0xdac

    .line 6
    .line 7
    iget-object v4, v0, La/o100;->l:Lorg/xplatform/limits_ne/api/domain/LimitNeGroupEnum;

    .line 8
    .line 9
    const/4 v5, 0x0

    .line 10
    const-string v6, "call to \'resume\' before \'invoke\' with coroutine"

    .line 11
    .line 12
    iget-object v7, v0, La/o100;->k:La/p100;

    .line 13
    .line 14
    const/4 v8, 0x1

    .line 15
    const/4 v9, 0x2

    .line 16
    packed-switch v1, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    sget-object v1, La/wne;->a:La/wne;

    .line 20
    .line 21
    iget-byte v10, v0, La/o100;->j:B

    .line 22
    .line 23
    if-eqz v10, :cond_2

    .line 24
    .line 25
    if-eq v10, v8, :cond_1

    .line 26
    .line 27
    if-ne v10, v9, :cond_0

    .line 28
    .line 29
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    goto :goto_3

    .line 33
    :cond_0
    invoke-static {v6}, La/jf4;->n(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    goto :goto_4

    .line 37
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_2
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    iget-object v5, v7, La/p100;->q:La/rti0;

    .line 45
    .line 46
    iput-byte v8, v0, La/o100;->j:B

    .line 47
    .line 48
    iget-object v5, v5, La/rti0;->a:La/r200;

    .line 49
    .line 50
    invoke-virtual {v5, v4, v0}, La/r200;->e(Lorg/xplatform/limits_ne/api/domain/LimitNeGroupEnum;La/zje;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    if-ne v4, v1, :cond_3

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_3
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 58
    .line 59
    :goto_0
    if-ne v4, v1, :cond_4

    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_4
    :goto_1
    sget v4, La/p100;->A:I

    .line 63
    .line 64
    iget-object v4, v7, La/i3t0;->i:La/ocj;

    .line 65
    .line 66
    iget-object v10, v4, La/ocj;->a:La/p7m0;

    .line 67
    .line 68
    :cond_5
    invoke-virtual {v10}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    move-object v11, v4

    .line 76
    check-cast v11, La/e100;

    .line 77
    .line 78
    const/16 v19, 0x0

    .line 79
    .line 80
    const/16 v20, 0x7ff

    .line 81
    .line 82
    const/4 v12, 0x0

    .line 83
    const/4 v13, 0x0

    .line 84
    const/4 v14, 0x0

    .line 85
    const/4 v15, 0x0

    .line 86
    const/16 v16, 0x0

    .line 87
    .line 88
    const/16 v17, 0x0

    .line 89
    .line 90
    const/16 v18, 0x0

    .line 91
    .line 92
    invoke-static/range {v11 .. v20}, La/e100;->a(La/e100;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;IZZLa/sn40;Ljava/util/Map;Lorg/xplatform/limits_ne/api/domain/LimitNeGroupEnum;I)La/e100;

    .line 93
    .line 94
    .line 95
    move-result-object v5

    .line 96
    invoke-virtual {v10, v4, v5}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v4

    .line 100
    if-eqz v4, :cond_5

    .line 101
    .line 102
    iput-byte v9, v0, La/o100;->j:B

    .line 103
    .line 104
    invoke-static {v2, v3, v0}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    if-ne v0, v1, :cond_6

    .line 109
    .line 110
    :goto_2
    move-object v5, v1

    .line 111
    goto :goto_4

    .line 112
    :cond_6
    :goto_3
    sget v0, La/p100;->A:I

    .line 113
    .line 114
    invoke-virtual {v7}, La/p100;->N()V

    .line 115
    .line 116
    .line 117
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 118
    .line 119
    :goto_4
    return-object v5

    .line 120
    :pswitch_0
    sget-object v1, La/wne;->a:La/wne;

    .line 121
    .line 122
    iget-byte v10, v0, La/o100;->j:B

    .line 123
    .line 124
    if-eqz v10, :cond_9

    .line 125
    .line 126
    if-eq v10, v8, :cond_8

    .line 127
    .line 128
    if-ne v10, v9, :cond_7

    .line 129
    .line 130
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    goto :goto_8

    .line 134
    :cond_7
    invoke-static {v6}, La/jf4;->n(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    goto :goto_9

    .line 138
    :cond_8
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    goto :goto_6

    .line 142
    :cond_9
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    iget-object v5, v7, La/p100;->p:La/tqi0;

    .line 146
    .line 147
    iput-byte v8, v0, La/o100;->j:B

    .line 148
    .line 149
    iget-object v5, v5, La/tqi0;->a:La/r200;

    .line 150
    .line 151
    invoke-virtual {v5, v4, v0}, La/r200;->d(Lorg/xplatform/limits_ne/api/domain/LimitNeGroupEnum;La/zje;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v4

    .line 155
    if-ne v4, v1, :cond_a

    .line 156
    .line 157
    goto :goto_5

    .line 158
    :cond_a
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 159
    .line 160
    :goto_5
    if-ne v4, v1, :cond_b

    .line 161
    .line 162
    goto :goto_7

    .line 163
    :cond_b
    :goto_6
    sget v4, La/p100;->A:I

    .line 164
    .line 165
    iget-object v4, v7, La/i3t0;->i:La/ocj;

    .line 166
    .line 167
    iget-object v4, v4, La/ocj;->a:La/p7m0;

    .line 168
    .line 169
    :cond_c
    invoke-virtual {v4}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v5

    .line 173
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    move-object v10, v5

    .line 177
    check-cast v10, La/e100;

    .line 178
    .line 179
    const/16 v18, 0x0

    .line 180
    .line 181
    const/16 v19, 0x7ff

    .line 182
    .line 183
    const/4 v11, 0x0

    .line 184
    const/4 v12, 0x0

    .line 185
    const/4 v13, 0x0

    .line 186
    const/4 v14, 0x0

    .line 187
    const/4 v15, 0x0

    .line 188
    const/16 v16, 0x0

    .line 189
    .line 190
    const/16 v17, 0x0

    .line 191
    .line 192
    invoke-static/range {v10 .. v19}, La/e100;->a(La/e100;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;IZZLa/sn40;Ljava/util/Map;Lorg/xplatform/limits_ne/api/domain/LimitNeGroupEnum;I)La/e100;

    .line 193
    .line 194
    .line 195
    move-result-object v6

    .line 196
    invoke-virtual {v4, v5, v6}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 197
    .line 198
    .line 199
    move-result v5

    .line 200
    if-eqz v5, :cond_c

    .line 201
    .line 202
    iput-byte v9, v0, La/o100;->j:B

    .line 203
    .line 204
    invoke-static {v2, v3, v0}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    if-ne v0, v1, :cond_d

    .line 209
    .line 210
    :goto_7
    move-object v5, v1

    .line 211
    goto :goto_9

    .line 212
    :cond_d
    :goto_8
    sget v0, La/p100;->A:I

    .line 213
    .line 214
    invoke-virtual {v7}, La/p100;->N()V

    .line 215
    .line 216
    .line 217
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 218
    .line 219
    :goto_9
    return-object v5

    .line 220
    nop

    .line 221
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

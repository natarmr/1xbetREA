.class public final La/ggb0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/kgb0;


# direct methods
.method public synthetic constructor <init>(La/kgb0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/ggb0;->i:B

    iput-object p1, p0, La/ggb0;->k:La/kgb0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/ggb0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/ggb0;->k:La/kgb0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/ggb0;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/ggb0;-><init>(La/kgb0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/ggb0;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/ggb0;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/ggb0;-><init>(La/kgb0;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/ggb0;->j:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/ggb0;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lkotlin/Pair;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/ggb0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/ggb0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/ggb0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/hfe;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/ggb0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/ggb0;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/ggb0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    nop

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/ggb0;->i:B

    .line 4
    .line 5
    iget-object v2, v0, La/ggb0;->k:La/kgb0;

    .line 6
    .line 7
    iget-object v0, v0, La/ggb0;->j:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast v0, Lkotlin/Pair;

    .line 13
    .line 14
    sget-object v1, La/wne;->a:La/wne;

    .line 15
    .line 16
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    iget-object v1, v0, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v1, Ljava/lang/Boolean;

    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 24
    .line 25
    .line 26
    move-result v5

    .line 27
    iget-object v0, v0, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v0, Ljava/lang/Boolean;

    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 32
    .line 33
    .line 34
    move-result v6

    .line 35
    iget-object v1, v2, La/i3t0;->i:La/ocj;

    .line 36
    .line 37
    invoke-virtual {v2}, La/i3t0;->D()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    check-cast v0, La/ufb0;

    .line 42
    .line 43
    iget-boolean v0, v0, La/ufb0;->c:Z

    .line 44
    .line 45
    if-eq v0, v6, :cond_0

    .line 46
    .line 47
    iget-object v0, v2, La/kgb0;->R:La/nhf0;

    .line 48
    .line 49
    invoke-virtual {v0}, La/nhf0;->y()Z

    .line 50
    .line 51
    .line 52
    :cond_0
    iget-object v0, v1, La/ocj;->a:La/p7m0;

    .line 53
    .line 54
    :goto_0
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    move-object v4, v3

    .line 62
    move-object v3, v4

    .line 63
    check-cast v3, La/ufb0;

    .line 64
    .line 65
    const/4 v14, 0x0

    .line 66
    const/16 v15, 0xff9

    .line 67
    .line 68
    move-object v7, v4

    .line 69
    const/4 v4, 0x0

    .line 70
    move-object v8, v7

    .line 71
    const/4 v7, 0x0

    .line 72
    move-object v9, v8

    .line 73
    const/4 v8, 0x0

    .line 74
    move-object v10, v9

    .line 75
    const/4 v9, 0x0

    .line 76
    move-object v11, v10

    .line 77
    const/4 v10, 0x0

    .line 78
    move-object v12, v11

    .line 79
    const/4 v11, 0x0

    .line 80
    move-object v13, v12

    .line 81
    const/4 v12, 0x0

    .line 82
    move-object/from16 v16, v13

    .line 83
    .line 84
    const/4 v13, 0x0

    .line 85
    move-object/from16 v17, v1

    .line 86
    .line 87
    move-object/from16 v1, v16

    .line 88
    .line 89
    invoke-static/range {v3 .. v15}, La/ufb0;->a(La/ufb0;Ljava/lang/String;ZZLa/seb0;ZLa/lq5;Ljava/util/List;La/hfe;La/hfe;La/hfe;La/hfe;I)La/ufb0;

    .line 90
    .line 91
    .line 92
    move-result-object v3

    .line 93
    invoke-virtual {v0, v1, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v1

    .line 97
    if-eqz v1, :cond_5

    .line 98
    .line 99
    if-eqz v5, :cond_1

    .line 100
    .line 101
    const/4 v0, 0x0

    .line 102
    invoke-virtual {v2, v0}, La/kgb0;->O(Z)V

    .line 103
    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_1
    if-nez v5, :cond_4

    .line 107
    .line 108
    invoke-virtual {v2}, La/i3t0;->D()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    check-cast v0, La/ufb0;

    .line 113
    .line 114
    iget-object v1, v0, La/ufb0;->i:La/hfe;

    .line 115
    .line 116
    invoke-virtual {v1}, La/hfe;->a()Z

    .line 117
    .line 118
    .line 119
    move-result v1

    .line 120
    if-eqz v1, :cond_2

    .line 121
    .line 122
    iget-object v1, v0, La/ufb0;->j:La/hfe;

    .line 123
    .line 124
    invoke-virtual {v1}, La/hfe;->a()Z

    .line 125
    .line 126
    .line 127
    move-result v1

    .line 128
    if-eqz v1, :cond_2

    .line 129
    .line 130
    iget-object v1, v0, La/ufb0;->k:La/hfe;

    .line 131
    .line 132
    invoke-virtual {v1}, La/hfe;->a()Z

    .line 133
    .line 134
    .line 135
    move-result v1

    .line 136
    if-eqz v1, :cond_2

    .line 137
    .line 138
    iget-object v0, v0, La/ufb0;->l:La/hfe;

    .line 139
    .line 140
    invoke-virtual {v0}, La/hfe;->a()Z

    .line 141
    .line 142
    .line 143
    move-result v0

    .line 144
    if-eqz v0, :cond_2

    .line 145
    .line 146
    goto :goto_1

    .line 147
    :cond_2
    move-object/from16 v1, v17

    .line 148
    .line 149
    iget-object v0, v1, La/ocj;->a:La/p7m0;

    .line 150
    .line 151
    :cond_3
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    move-object v2, v1

    .line 159
    check-cast v2, La/ufb0;

    .line 160
    .line 161
    sget-object v6, La/seb0;->b:La/seb0;

    .line 162
    .line 163
    const/4 v13, 0x0

    .line 164
    const/16 v14, 0xff7

    .line 165
    .line 166
    const/4 v3, 0x0

    .line 167
    const/4 v4, 0x0

    .line 168
    const/4 v5, 0x0

    .line 169
    const/4 v7, 0x0

    .line 170
    const/4 v8, 0x0

    .line 171
    const/4 v9, 0x0

    .line 172
    const/4 v10, 0x0

    .line 173
    const/4 v11, 0x0

    .line 174
    const/4 v12, 0x0

    .line 175
    invoke-static/range {v2 .. v14}, La/ufb0;->a(La/ufb0;Ljava/lang/String;ZZLa/seb0;ZLa/lq5;Ljava/util/List;La/hfe;La/hfe;La/hfe;La/hfe;I)La/ufb0;

    .line 176
    .line 177
    .line 178
    move-result-object v2

    .line 179
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 180
    .line 181
    .line 182
    move-result v1

    .line 183
    if-eqz v1, :cond_3

    .line 184
    .line 185
    :cond_4
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 186
    .line 187
    return-object v0

    .line 188
    :cond_5
    move-object/from16 v1, v17

    .line 189
    .line 190
    goto/16 :goto_0

    .line 191
    .line 192
    :pswitch_0
    move-object v13, v0

    .line 193
    check-cast v13, La/hfe;

    .line 194
    .line 195
    sget-object v0, La/wne;->a:La/wne;

    .line 196
    .line 197
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 198
    .line 199
    .line 200
    sget v0, La/kgb0;->k0:I

    .line 201
    .line 202
    iget-object v0, v2, La/i3t0;->i:La/ocj;

    .line 203
    .line 204
    iget-object v0, v0, La/ocj;->a:La/p7m0;

    .line 205
    .line 206
    :cond_6
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v1

    .line 210
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 211
    .line 212
    .line 213
    move-object v3, v1

    .line 214
    check-cast v3, La/ufb0;

    .line 215
    .line 216
    const/4 v14, 0x0

    .line 217
    const/16 v15, 0xbff

    .line 218
    .line 219
    const/4 v4, 0x0

    .line 220
    const/4 v5, 0x0

    .line 221
    const/4 v6, 0x0

    .line 222
    const/4 v7, 0x0

    .line 223
    const/4 v8, 0x0

    .line 224
    const/4 v9, 0x0

    .line 225
    const/4 v10, 0x0

    .line 226
    const/4 v11, 0x0

    .line 227
    const/4 v12, 0x0

    .line 228
    invoke-static/range {v3 .. v15}, La/ufb0;->a(La/ufb0;Ljava/lang/String;ZZLa/seb0;ZLa/lq5;Ljava/util/List;La/hfe;La/hfe;La/hfe;La/hfe;I)La/ufb0;

    .line 229
    .line 230
    .line 231
    move-result-object v2

    .line 232
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 233
    .line 234
    .line 235
    move-result v1

    .line 236
    if-eqz v1, :cond_6

    .line 237
    .line 238
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 239
    .line 240
    return-object v0

    .line 241
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

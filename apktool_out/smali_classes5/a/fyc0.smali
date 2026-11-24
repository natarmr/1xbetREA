.class public final La/fyc0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/hyc0;

.field public final synthetic l:Z


# direct methods
.method public synthetic constructor <init>(BLa/yje;La/hyc0;Z)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/fyc0;->i:B

    iput-object p3, p0, La/fyc0;->k:La/hyc0;

    iput-boolean p4, p0, La/fyc0;->l:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte p1, p0, La/fyc0;->i:B

    .line 2
    .line 3
    iget-boolean v0, p0, La/fyc0;->l:Z

    .line 4
    .line 5
    iget-object p0, p0, La/fyc0;->k:La/hyc0;

    .line 6
    .line 7
    packed-switch p1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance p1, La/fyc0;

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-direct {p1, v1, p2, p0, v0}, La/fyc0;-><init>(BLa/yje;La/hyc0;Z)V

    .line 14
    .line 15
    .line 16
    return-object p1

    .line 17
    :pswitch_0
    new-instance p1, La/fyc0;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {p1, v1, p2, p0, v0}, La/fyc0;-><init>(BLa/yje;La/hyc0;Z)V

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
    iget-byte v0, p0, La/fyc0;->i:B

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
    invoke-virtual {p0, p1, p2}, La/fyc0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/fyc0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/fyc0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/fyc0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/fyc0;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/fyc0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/fyc0;->i:B

    .line 4
    .line 5
    sget-object v2, La/yee;->a:La/yee;

    .line 6
    .line 7
    sget-object v3, La/dfe;->a:La/dfe;

    .line 8
    .line 9
    iget-boolean v4, v0, La/fyc0;->l:Z

    .line 10
    .line 11
    const-string v5, "call to \'resume\' before \'invoke\' with coroutine"

    .line 12
    .line 13
    iget-object v6, v0, La/fyc0;->k:La/hyc0;

    .line 14
    .line 15
    const/4 v7, 0x1

    .line 16
    const/4 v8, 0x0

    .line 17
    packed-switch v1, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    iget-object v1, v6, La/hyc0;->E:La/p7m0;

    .line 21
    .line 22
    sget-object v9, La/wne;->a:La/wne;

    .line 23
    .line 24
    iget-boolean v10, v0, La/fyc0;->j:Z

    .line 25
    .line 26
    if-eqz v10, :cond_1

    .line 27
    .line 28
    if-ne v10, v7, :cond_0

    .line 29
    .line 30
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    move-object/from16 v0, p1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    invoke-static {v5}, La/jf4;->n(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    goto :goto_2

    .line 40
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    iget-object v5, v6, La/hyc0;->z:La/toc0;

    .line 44
    .line 45
    iget-boolean v10, v5, La/toc0;->k:Z

    .line 46
    .line 47
    if-eqz v10, :cond_5

    .line 48
    .line 49
    iget-boolean v10, v5, La/toc0;->c:Z

    .line 50
    .line 51
    if-nez v10, :cond_2

    .line 52
    .line 53
    iget-boolean v5, v5, La/toc0;->f:Z

    .line 54
    .line 55
    if-eqz v5, :cond_5

    .line 56
    .line 57
    :cond_2
    if-eqz v4, :cond_3

    .line 58
    .line 59
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1, v8, v3}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    :cond_3
    iget-object v2, v6, La/hyc0;->f:La/uou;

    .line 66
    .line 67
    iput-boolean v7, v0, La/fyc0;->j:Z

    .line 68
    .line 69
    invoke-virtual {v2, v0}, La/uou;->a(La/zje;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    if-ne v0, v9, :cond_4

    .line 74
    .line 75
    move-object v8, v9

    .line 76
    goto :goto_2

    .line 77
    :cond_4
    :goto_0
    check-cast v0, La/dic0;

    .line 78
    .line 79
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    new-instance v9, La/eic0;

    .line 83
    .line 84
    iget v10, v0, La/dic0;->a:I

    .line 85
    .line 86
    iget-boolean v12, v0, La/dic0;->b:Z

    .line 87
    .line 88
    iget-boolean v13, v0, La/dic0;->c:Z

    .line 89
    .line 90
    iget-boolean v15, v0, La/dic0;->d:Z

    .line 91
    .line 92
    iget-object v11, v0, La/dic0;->e:Ljava/util/List;

    .line 93
    .line 94
    const/4 v14, 0x0

    .line 95
    invoke-direct/range {v9 .. v15}, La/eic0;-><init>(ILjava/util/List;ZZZZ)V

    .line 96
    .line 97
    .line 98
    iget-object v0, v6, La/hyc0;->c:La/tac0;

    .line 99
    .line 100
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    iput-object v11, v0, La/tac0;->l:Ljava/util/List;

    .line 104
    .line 105
    new-instance v0, La/afe;

    .line 106
    .line 107
    invoke-direct {v0, v9}, La/afe;-><init>(Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v1, v8, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    goto :goto_1

    .line 117
    :cond_5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v1, v8, v2}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    :goto_1
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 124
    .line 125
    :goto_2
    return-object v8

    .line 126
    :pswitch_0
    iget-object v1, v6, La/hyc0;->F:La/p7m0;

    .line 127
    .line 128
    sget-object v9, La/wne;->a:La/wne;

    .line 129
    .line 130
    iget-boolean v10, v0, La/fyc0;->j:Z

    .line 131
    .line 132
    if-eqz v10, :cond_7

    .line 133
    .line 134
    if-ne v10, v7, :cond_6

    .line 135
    .line 136
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    move-object/from16 v0, p1

    .line 140
    .line 141
    goto :goto_3

    .line 142
    :cond_6
    invoke-static {v5}, La/jf4;->n(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    goto :goto_6

    .line 146
    :cond_7
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 147
    .line 148
    .line 149
    iget-object v5, v6, La/hyc0;->z:La/toc0;

    .line 150
    .line 151
    iget-boolean v5, v5, La/toc0;->k:Z

    .line 152
    .line 153
    if-eqz v5, :cond_c

    .line 154
    .line 155
    if-eqz v4, :cond_8

    .line 156
    .line 157
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    invoke-virtual {v1, v8, v3}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    :cond_8
    iget-object v2, v6, La/hyc0;->i:La/hnu;

    .line 164
    .line 165
    iput-boolean v7, v0, La/fyc0;->j:Z

    .line 166
    .line 167
    iget-object v2, v2, La/hnu;->a:Ljava/lang/Object;

    .line 168
    .line 169
    check-cast v2, La/w5z;

    .line 170
    .line 171
    iget-object v3, v2, La/w5z;->b:Ljava/lang/Object;

    .line 172
    .line 173
    check-cast v3, La/xyt;

    .line 174
    .line 175
    invoke-virtual {v3}, La/xyt;->a()I

    .line 176
    .line 177
    .line 178
    move-result v3

    .line 179
    invoke-virtual {v2, v3, v0}, La/w5z;->Y(ILa/zje;)Ljava/io/Serializable;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    if-ne v0, v9, :cond_9

    .line 184
    .line 185
    move-object v8, v9

    .line 186
    goto :goto_6

    .line 187
    :cond_9
    :goto_3
    check-cast v0, Ljava/lang/Iterable;

    .line 188
    .line 189
    new-instance v2, Ljava/util/ArrayList;

    .line 190
    .line 191
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 192
    .line 193
    .line 194
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    :cond_a
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 199
    .line 200
    .line 201
    move-result v3

    .line 202
    if-eqz v3, :cond_b

    .line 203
    .line 204
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v3

    .line 208
    move-object v4, v3

    .line 209
    check-cast v4, La/zec0;

    .line 210
    .line 211
    iget v4, v4, La/zec0;->i:I

    .line 212
    .line 213
    if-ne v4, v7, :cond_a

    .line 214
    .line 215
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 216
    .line 217
    .line 218
    goto :goto_4

    .line 219
    :cond_b
    new-instance v0, La/afe;

    .line 220
    .line 221
    new-instance v3, La/mgc0;

    .line 222
    .line 223
    invoke-direct {v3, v2, v7}, La/mgc0;-><init>(Ljava/util/List;Z)V

    .line 224
    .line 225
    .line 226
    invoke-direct {v0, v3}, La/afe;-><init>(Ljava/lang/Object;)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 230
    .line 231
    .line 232
    invoke-virtual {v1, v8, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 233
    .line 234
    .line 235
    goto :goto_5

    .line 236
    :cond_c
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 237
    .line 238
    .line 239
    invoke-virtual {v1, v8, v2}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 240
    .line 241
    .line 242
    :goto_5
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 243
    .line 244
    :goto_6
    return-object v8

    .line 245
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

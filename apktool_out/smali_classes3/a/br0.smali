.class public final La/br0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:La/kmq;

.field public k:B

.field public synthetic l:Ljava/lang/Object;

.field public final synthetic m:La/jr0;

.field public final synthetic n:J

.field public final synthetic o:Z


# direct methods
.method public constructor <init>(La/jr0;JZLa/yje;B)V
    .locals 1

    .line 1
    iput-byte p6, p0, La/br0;->i:B

    .line 2
    .line 3
    const/4 v0, 0x2

    .line 4
    packed-switch p6, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    sget-object p6, La/uzb0;->a:La/uzb0;

    .line 8
    .line 9
    iput-object p1, p0, La/br0;->m:La/jr0;

    .line 10
    .line 11
    iput-wide p2, p0, La/br0;->n:J

    .line 12
    .line 13
    iput-boolean p4, p0, La/br0;->o:Z

    .line 14
    .line 15
    invoke-direct {p0, v0, p5}, La/bnn0;-><init>(ILa/yje;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_0
    iput-object p1, p0, La/br0;->m:La/jr0;

    .line 20
    .line 21
    iput-wide p2, p0, La/br0;->n:J

    .line 22
    .line 23
    iput-boolean p4, p0, La/br0;->o:Z

    .line 24
    .line 25
    invoke-direct {p0, v0, p5}, La/bnn0;-><init>(ILa/yje;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 9

    .line 1
    iget-byte v0, p0, La/br0;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v1, La/br0;

    .line 7
    .line 8
    iget-boolean v5, p0, La/br0;->o:Z

    .line 9
    .line 10
    const/4 v7, 0x1

    .line 11
    iget-object v2, p0, La/br0;->m:La/jr0;

    .line 12
    .line 13
    iget-wide v3, p0, La/br0;->n:J

    .line 14
    .line 15
    move-object v6, p2

    .line 16
    invoke-direct/range {v1 .. v7}, La/br0;-><init>(La/jr0;JZLa/yje;B)V

    .line 17
    .line 18
    .line 19
    iput-object p1, v1, La/br0;->l:Ljava/lang/Object;

    .line 20
    .line 21
    return-object v1

    .line 22
    :pswitch_0
    move-object v6, p2

    .line 23
    new-instance v2, La/br0;

    .line 24
    .line 25
    sget-object p2, La/uzb0;->a:La/uzb0;

    .line 26
    .line 27
    move-object v7, v6

    .line 28
    iget-boolean v6, p0, La/br0;->o:Z

    .line 29
    .line 30
    const/4 v8, 0x0

    .line 31
    iget-object v3, p0, La/br0;->m:La/jr0;

    .line 32
    .line 33
    iget-wide v4, p0, La/br0;->n:J

    .line 34
    .line 35
    invoke-direct/range {v2 .. v8}, La/br0;-><init>(La/jr0;JZLa/yje;B)V

    .line 36
    .line 37
    .line 38
    iput-object p1, v2, La/br0;->l:Ljava/lang/Object;

    .line 39
    .line 40
    return-object v2

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/br0;->i:B

    .line 2
    .line 3
    check-cast p1, La/kmq;

    .line 4
    .line 5
    check-cast p2, La/yje;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/br0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/br0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/br0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/br0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/br0;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/br0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    move-object/from16 v9, p0

    .line 2
    .line 3
    iget-byte v0, v9, La/br0;->i:B

    .line 4
    .line 5
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 6
    .line 7
    iget-object v2, v9, La/br0;->m:La/jr0;

    .line 8
    .line 9
    const/4 v3, 0x1

    .line 10
    const/4 v12, 0x2

    .line 11
    const/4 v13, 0x0

    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    iget-object v0, v2, La/jr0;->c:La/knf0;

    .line 16
    .line 17
    iget-object v4, v9, La/br0;->l:Ljava/lang/Object;

    .line 18
    .line 19
    move-object v14, v4

    .line 20
    check-cast v14, La/kmq;

    .line 21
    .line 22
    sget-object v15, La/wne;->a:La/wne;

    .line 23
    .line 24
    iget-byte v4, v9, La/br0;->k:B

    .line 25
    .line 26
    if-eqz v4, :cond_2

    .line 27
    .line 28
    if-eq v4, v3, :cond_1

    .line 29
    .line 30
    if-ne v4, v12, :cond_0

    .line 31
    .line 32
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    goto/16 :goto_4

    .line 36
    .line 37
    :cond_0
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    goto/16 :goto_5

    .line 41
    .line 42
    :cond_1
    iget-object v14, v9, La/br0;->j:La/kmq;

    .line 43
    .line 44
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    move-object/from16 v0, p1

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_2
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    iget-object v1, v2, La/jr0;->a:La/xzp;

    .line 54
    .line 55
    invoke-virtual {v0}, La/knf0;->b()I

    .line 56
    .line 57
    .line 58
    move-result v5

    .line 59
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0}, La/knf0;->c()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v7

    .line 72
    iput-object v13, v9, La/br0;->l:Ljava/lang/Object;

    .line 73
    .line 74
    iput-object v14, v9, La/br0;->j:La/kmq;

    .line 75
    .line 76
    iput-byte v3, v9, La/br0;->k:B

    .line 77
    .line 78
    iget-object v0, v1, La/xzp;->c:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v0, La/il1;

    .line 81
    .line 82
    invoke-virtual {v0}, La/il1;->invoke()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    check-cast v0, La/cq0;

    .line 87
    .line 88
    iget-object v1, v1, La/xzp;->b:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v1, La/x2c0;

    .line 91
    .line 92
    invoke-virtual {v1}, La/x2c0;->a()La/m2c0;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    if-eqz v1, :cond_3

    .line 97
    .line 98
    iget-object v1, v1, La/m2c0;->c:Ljava/lang/String;

    .line 99
    .line 100
    invoke-static {v1}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    move-object v4, v1

    .line 105
    goto :goto_0

    .line 106
    :cond_3
    move-object v4, v13

    .line 107
    :goto_0
    iget-boolean v1, v9, La/br0;->o:Z

    .line 108
    .line 109
    if-eqz v1, :cond_4

    .line 110
    .line 111
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_4
    move-object v1, v13

    .line 115
    :goto_1
    new-instance v10, La/fk9;

    .line 116
    .line 117
    const/4 v2, 0x0

    .line 118
    invoke-direct {v10, v2}, La/fk9;-><init>(Z)V

    .line 119
    .line 120
    .line 121
    move-object v3, v1

    .line 122
    iget-wide v1, v9, La/br0;->n:J

    .line 123
    .line 124
    move-object v9, v3

    .line 125
    const/16 v3, 0x16

    .line 126
    .line 127
    const/4 v6, 0x1

    .line 128
    const/16 v8, 0x54d

    .line 129
    .line 130
    move-object/from16 v11, p0

    .line 131
    .line 132
    invoke-interface/range {v0 .. v11}, La/cq0;->c(JILjava/lang/Integer;IILjava/lang/String;ILjava/lang/Boolean;La/fk9;La/yje;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    move-object v9, v11

    .line 137
    if-ne v0, v15, :cond_5

    .line 138
    .line 139
    goto :goto_3

    .line 140
    :cond_5
    :goto_2
    iput-object v13, v9, La/br0;->l:Ljava/lang/Object;

    .line 141
    .line 142
    iput-object v13, v9, La/br0;->j:La/kmq;

    .line 143
    .line 144
    iput-byte v12, v9, La/br0;->k:B

    .line 145
    .line 146
    invoke-interface {v14, v0, v9}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    if-ne v0, v15, :cond_6

    .line 151
    .line 152
    :goto_3
    move-object v13, v15

    .line 153
    goto :goto_5

    .line 154
    :cond_6
    :goto_4
    sget-object v13, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 155
    .line 156
    :goto_5
    return-object v13

    .line 157
    :pswitch_0
    iget-object v0, v2, La/jr0;->c:La/knf0;

    .line 158
    .line 159
    iget-object v4, v9, La/br0;->l:Ljava/lang/Object;

    .line 160
    .line 161
    move-object v10, v4

    .line 162
    check-cast v10, La/kmq;

    .line 163
    .line 164
    sget-object v11, La/wne;->a:La/wne;

    .line 165
    .line 166
    iget-byte v4, v9, La/br0;->k:B

    .line 167
    .line 168
    if-eqz v4, :cond_9

    .line 169
    .line 170
    if-eq v4, v3, :cond_8

    .line 171
    .line 172
    if-ne v4, v12, :cond_7

    .line 173
    .line 174
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 175
    .line 176
    .line 177
    goto :goto_8

    .line 178
    :cond_7
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    goto :goto_9

    .line 182
    :cond_8
    iget-object v10, v9, La/br0;->j:La/kmq;

    .line 183
    .line 184
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 185
    .line 186
    .line 187
    move-object/from16 v0, p1

    .line 188
    .line 189
    goto :goto_6

    .line 190
    :cond_9
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 191
    .line 192
    .line 193
    iget-object v1, v2, La/jr0;->a:La/xzp;

    .line 194
    .line 195
    sget-object v2, La/uzb0;->a:La/uzb0;

    .line 196
    .line 197
    invoke-static {v2}, La/r7x;->B(La/uzb0;)Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v4

    .line 201
    invoke-virtual {v0}, La/knf0;->b()I

    .line 202
    .line 203
    .line 204
    move-result v7

    .line 205
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 206
    .line 207
    .line 208
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 209
    .line 210
    .line 211
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 212
    .line 213
    .line 214
    invoke-virtual {v0}, La/knf0;->c()Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object v8

    .line 218
    iput-object v13, v9, La/br0;->l:Ljava/lang/Object;

    .line 219
    .line 220
    iput-object v10, v9, La/br0;->j:La/kmq;

    .line 221
    .line 222
    iput-byte v3, v9, La/br0;->k:B

    .line 223
    .line 224
    move-object v0, v1

    .line 225
    iget-wide v1, v9, La/br0;->n:J

    .line 226
    .line 227
    const v3, 0x7fffffff

    .line 228
    .line 229
    .line 230
    const-string v5, ""

    .line 231
    .line 232
    iget-boolean v6, v9, La/br0;->o:Z

    .line 233
    .line 234
    invoke-virtual/range {v0 .. v9}, La/xzp;->y(JILjava/lang/String;Ljava/lang/String;ZILjava/lang/String;La/zje;)Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object v0

    .line 238
    if-ne v0, v11, :cond_a

    .line 239
    .line 240
    goto :goto_7

    .line 241
    :cond_a
    :goto_6
    iput-object v13, v9, La/br0;->l:Ljava/lang/Object;

    .line 242
    .line 243
    iput-object v13, v9, La/br0;->j:La/kmq;

    .line 244
    .line 245
    iput-byte v12, v9, La/br0;->k:B

    .line 246
    .line 247
    invoke-interface {v10, v0, v9}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    move-result-object v0

    .line 251
    if-ne v0, v11, :cond_b

    .line 252
    .line 253
    :goto_7
    move-object v13, v11

    .line 254
    goto :goto_9

    .line 255
    :cond_b
    :goto_8
    sget-object v13, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 256
    .line 257
    :goto_9
    return-object v13

    .line 258
    nop

    .line 259
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

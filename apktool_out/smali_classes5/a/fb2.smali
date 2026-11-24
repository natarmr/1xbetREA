.class public final La/fb2;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/hb2;


# direct methods
.method public synthetic constructor <init>(La/hb2;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/fb2;->i:B

    iput-object p1, p0, La/fb2;->k:La/hb2;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/fb2;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/fb2;->k:La/hb2;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/fb2;

    .line 9
    .line 10
    const/4 v1, 0x3

    .line 11
    invoke-direct {v0, p0, p1, v1}, La/fb2;-><init>(La/hb2;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object v0

    .line 15
    :pswitch_0
    new-instance v0, La/fb2;

    .line 16
    .line 17
    const/4 v1, 0x2

    .line 18
    invoke-direct {v0, p0, p1, v1}, La/fb2;-><init>(La/hb2;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object v0

    .line 22
    :pswitch_1
    new-instance v0, La/fb2;

    .line 23
    .line 24
    const/4 v1, 0x1

    .line 25
    invoke-direct {v0, p0, p1, v1}, La/fb2;-><init>(La/hb2;La/yje;B)V

    .line 26
    .line 27
    .line 28
    return-object v0

    .line 29
    :pswitch_2
    new-instance v0, La/fb2;

    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    invoke-direct {v0, p0, p1, v1}, La/fb2;-><init>(La/hb2;La/yje;B)V

    .line 33
    .line 34
    .line 35
    return-object v0

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/fb2;->i:B

    .line 2
    .line 3
    check-cast p1, La/yje;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, La/fb2;->create(La/yje;)La/yje;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, La/fb2;

    .line 13
    .line 14
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, La/fb2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :pswitch_0
    invoke-virtual {p0, p1}, La/fb2;->create(La/yje;)La/yje;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, La/fb2;

    .line 26
    .line 27
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    invoke-virtual {p0, p1}, La/fb2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    sget-object p0, La/wne;->a:La/wne;

    .line 33
    .line 34
    return-object p0

    .line 35
    :pswitch_1
    invoke-virtual {p0, p1}, La/fb2;->create(La/yje;)La/yje;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    check-cast p0, La/fb2;

    .line 40
    .line 41
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 42
    .line 43
    invoke-virtual {p0, p1}, La/fb2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0

    .line 48
    :pswitch_2
    invoke-virtual {p0, p1}, La/fb2;->create(La/yje;)La/yje;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    check-cast p0, La/fb2;

    .line 53
    .line 54
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 55
    .line 56
    invoke-virtual {p0, p1}, La/fb2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    return-object p0

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/fb2;->i:B

    .line 4
    .line 5
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 6
    .line 7
    iget-object v3, v0, La/fb2;->k:La/hb2;

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
    iget-boolean v6, v0, La/fb2;->j:Z

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
    iget-object v2, v3, La/hb2;->v:La/m1e;

    .line 34
    .line 35
    invoke-interface {v2}, La/m1e;->b()La/gmq;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    new-instance v4, La/eb2;

    .line 40
    .line 41
    const/4 v6, 0x2

    .line 42
    invoke-direct {v4, v3, v6}, La/eb2;-><init>(La/hb2;B)V

    .line 43
    .line 44
    .line 45
    iput-boolean v5, v0, La/fb2;->j:Z

    .line 46
    .line 47
    invoke-interface {v2, v4, v0}, La/gmq;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    if-ne v0, v1, :cond_2

    .line 52
    .line 53
    move-object v4, v1

    .line 54
    goto :goto_1

    .line 55
    :cond_2
    :goto_0
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 56
    .line 57
    :goto_1
    return-object v4

    .line 58
    :pswitch_0
    sget-object v1, La/wne;->a:La/wne;

    .line 59
    .line 60
    iget-boolean v6, v0, La/fb2;->j:Z

    .line 61
    .line 62
    if-eqz v6, :cond_4

    .line 63
    .line 64
    if-eq v6, v5, :cond_3

    .line 65
    .line 66
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    goto :goto_3

    .line 70
    :cond_3
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_4
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    iget-object v2, v3, La/hb2;->r:La/hru;

    .line 78
    .line 79
    iget-boolean v6, v3, La/hb2;->A:Z

    .line 80
    .line 81
    invoke-virtual {v2, v6}, La/hru;->b(Z)La/xae0;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    new-instance v6, La/eb2;

    .line 86
    .line 87
    invoke-direct {v6, v3, v5}, La/eb2;-><init>(La/hb2;B)V

    .line 88
    .line 89
    .line 90
    iput-boolean v5, v0, La/fb2;->j:Z

    .line 91
    .line 92
    iget-object v2, v2, La/xae0;->a:La/n7m0;

    .line 93
    .line 94
    invoke-interface {v2, v6, v0}, La/gmq;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    if-ne v0, v1, :cond_5

    .line 99
    .line 100
    move-object v4, v1

    .line 101
    goto :goto_3

    .line 102
    :cond_5
    :goto_2
    invoke-static {}, La/csj;->b()V

    .line 103
    .line 104
    .line 105
    :goto_3
    return-object v4

    .line 106
    :pswitch_1
    sget-object v1, La/wne;->a:La/wne;

    .line 107
    .line 108
    iget-boolean v6, v0, La/fb2;->j:Z

    .line 109
    .line 110
    if-eqz v6, :cond_7

    .line 111
    .line 112
    if-ne v6, v5, :cond_6

    .line 113
    .line 114
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    move-object/from16 v0, p1

    .line 118
    .line 119
    goto :goto_4

    .line 120
    :cond_6
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    goto :goto_5

    .line 124
    :cond_7
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    iget-object v2, v3, La/hb2;->u:La/j3c;

    .line 128
    .line 129
    iput-boolean v5, v0, La/fb2;->j:Z

    .line 130
    .line 131
    invoke-virtual {v2, v0}, La/j3c;->c(La/yje;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    if-ne v0, v1, :cond_8

    .line 136
    .line 137
    move-object v4, v1

    .line 138
    goto :goto_5

    .line 139
    :cond_8
    :goto_4
    move-object v13, v0

    .line 140
    check-cast v13, La/wcb;

    .line 141
    .line 142
    sget v0, La/hb2;->E:I

    .line 143
    .line 144
    iget-object v0, v3, La/i3t0;->i:La/ocj;

    .line 145
    .line 146
    iget-object v1, v0, La/ocj;->a:La/p7m0;

    .line 147
    .line 148
    :cond_9
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    move-object v4, v0

    .line 156
    check-cast v4, La/ab2;

    .line 157
    .line 158
    const/4 v14, 0x0

    .line 159
    const v15, 0xefff

    .line 160
    .line 161
    .line 162
    const/4 v5, 0x0

    .line 163
    const/4 v6, 0x0

    .line 164
    const/4 v7, 0x0

    .line 165
    const/4 v8, 0x0

    .line 166
    const/4 v9, 0x0

    .line 167
    const/4 v10, 0x0

    .line 168
    const/4 v11, 0x0

    .line 169
    const/4 v12, 0x0

    .line 170
    invoke-static/range {v4 .. v15}, La/ab2;->a(La/ab2;Ljava/lang/String;Ljava/util/Date;ZLa/za2;ZZZLjava/util/List;La/wcb;Ljava/util/Set;I)La/ab2;

    .line 171
    .line 172
    .line 173
    move-result-object v2

    .line 174
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    move-result v0

    .line 178
    if-eqz v0, :cond_9

    .line 179
    .line 180
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 181
    .line 182
    :goto_5
    return-object v4

    .line 183
    :pswitch_2
    sget-object v1, La/wne;->a:La/wne;

    .line 184
    .line 185
    iget-boolean v6, v0, La/fb2;->j:Z

    .line 186
    .line 187
    if-eqz v6, :cond_b

    .line 188
    .line 189
    if-ne v6, v5, :cond_a

    .line 190
    .line 191
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 192
    .line 193
    .line 194
    goto :goto_6

    .line 195
    :cond_a
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    goto :goto_7

    .line 199
    :cond_b
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 200
    .line 201
    .line 202
    iget-object v2, v3, La/hb2;->y:La/g2g0;

    .line 203
    .line 204
    invoke-virtual {v2}, La/x2t0;->c()La/i89;

    .line 205
    .line 206
    .line 207
    move-result-object v2

    .line 208
    new-instance v4, La/eb2;

    .line 209
    .line 210
    const/4 v6, 0x0

    .line 211
    invoke-direct {v4, v3, v6}, La/eb2;-><init>(La/hb2;B)V

    .line 212
    .line 213
    .line 214
    iput-boolean v5, v0, La/fb2;->j:Z

    .line 215
    .line 216
    invoke-virtual {v2, v4, v0}, La/i89;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    if-ne v0, v1, :cond_c

    .line 221
    .line 222
    move-object v4, v1

    .line 223
    goto :goto_7

    .line 224
    :cond_c
    :goto_6
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 225
    .line 226
    :goto_7
    return-object v4

    .line 227
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

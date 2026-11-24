.class public final La/g7b;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Z

.field public final synthetic k:La/y7b;


# direct methods
.method public synthetic constructor <init>(La/y7b;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/g7b;->i:B

    iput-object p1, p0, La/g7b;->k:La/y7b;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/g7b;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/g7b;->k:La/y7b;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/g7b;

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/g7b;-><init>(La/y7b;La/yje;B)V

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
    iput-boolean p0, v0, La/g7b;->j:Z

    .line 21
    .line 22
    return-object v0

    .line 23
    :pswitch_0
    new-instance v0, La/g7b;

    .line 24
    .line 25
    const/4 v1, 0x1

    .line 26
    invoke-direct {v0, p0, p2, v1}, La/g7b;-><init>(La/y7b;La/yje;B)V

    .line 27
    .line 28
    .line 29
    check-cast p1, Ljava/lang/Boolean;

    .line 30
    .line 31
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    iput-boolean p0, v0, La/g7b;->j:Z

    .line 36
    .line 37
    return-object v0

    .line 38
    :pswitch_1
    new-instance v0, La/g7b;

    .line 39
    .line 40
    const/4 v1, 0x0

    .line 41
    invoke-direct {v0, p0, p2, v1}, La/g7b;-><init>(La/y7b;La/yje;B)V

    .line 42
    .line 43
    .line 44
    check-cast p1, Ljava/lang/Boolean;

    .line 45
    .line 46
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    iput-boolean p0, v0, La/g7b;->j:Z

    .line 51
    .line 52
    return-object v0

    .line 53
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/g7b;->i:B

    .line 2
    .line 3
    check-cast p1, Ljava/lang/Boolean;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 6
    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, p1, p2}, La/g7b;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, La/g7b;

    .line 18
    .line 19
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 20
    .line 21
    invoke-virtual {p0, p1}, La/g7b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0

    .line 26
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/g7b;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    check-cast p0, La/g7b;

    .line 31
    .line 32
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 33
    .line 34
    invoke-virtual {p0, p1}, La/g7b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0

    .line 39
    :pswitch_1
    invoke-virtual {p0, p1, p2}, La/g7b;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    check-cast p0, La/g7b;

    .line 44
    .line 45
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 46
    .line 47
    invoke-virtual {p0, p1}, La/g7b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    return-object p0

    .line 52
    nop

    .line 53
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/g7b;->i:B

    .line 4
    .line 5
    iget-object v2, v0, La/g7b;->k:La/y7b;

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-boolean v0, v0, La/g7b;->j:Z

    .line 11
    .line 12
    sget-object v1, La/wne;->a:La/wne;

    .line 13
    .line 14
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    sget v1, La/y7b;->K:I

    .line 18
    .line 19
    iget-object v1, v2, La/i3t0;->i:La/ocj;

    .line 20
    .line 21
    iget-object v1, v1, La/ocj;->a:La/p7m0;

    .line 22
    .line 23
    :goto_0
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    move-object v3, v2

    .line 31
    check-cast v3, La/r6b;

    .line 32
    .line 33
    const/16 v19, 0x0

    .line 34
    .line 35
    const v20, 0x6ffff

    .line 36
    .line 37
    .line 38
    const/4 v4, 0x0

    .line 39
    const/4 v5, 0x0

    .line 40
    const/4 v6, 0x0

    .line 41
    const/4 v7, 0x0

    .line 42
    const/4 v8, 0x0

    .line 43
    const/4 v9, 0x0

    .line 44
    const/4 v10, 0x0

    .line 45
    const/4 v11, 0x0

    .line 46
    const/4 v12, 0x0

    .line 47
    const/4 v13, 0x0

    .line 48
    const/4 v14, 0x0

    .line 49
    const/4 v15, 0x0

    .line 50
    const/16 v16, 0x0

    .line 51
    .line 52
    const/16 v17, 0x0

    .line 53
    .line 54
    move/from16 v18, v0

    .line 55
    .line 56
    invoke-static/range {v3 .. v20}, La/r6b;->a(La/r6b;Ljava/util/List;Ljava/util/Map;Ljava/util/List;Ljava/util/Map;La/l9s;La/js20;La/js20;Ljava/util/List;La/xvm0;La/xvm0;Ljava/util/List;La/aw20;La/ycs;Ljava/lang/String;ZZI)La/r6b;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-virtual {v1, v2, v0}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-eqz v0, :cond_0

    .line 65
    .line 66
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 67
    .line 68
    return-object v0

    .line 69
    :cond_0
    move/from16 v0, v18

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :pswitch_0
    iget-boolean v1, v0, La/g7b;->j:Z

    .line 73
    .line 74
    sget-object v0, La/wne;->a:La/wne;

    .line 75
    .line 76
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    sget v0, La/y7b;->K:I

    .line 80
    .line 81
    iget-object v0, v2, La/i3t0;->i:La/ocj;

    .line 82
    .line 83
    iget-object v3, v0, La/ocj;->a:La/p7m0;

    .line 84
    .line 85
    :cond_1
    invoke-virtual {v3}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    move-object v4, v0

    .line 93
    check-cast v4, La/r6b;

    .line 94
    .line 95
    sget-object v6, La/lun;->a:La/lun;

    .line 96
    .line 97
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    const/16 v20, 0x0

    .line 101
    .line 102
    const v21, 0x7bff1

    .line 103
    .line 104
    .line 105
    const/4 v5, 0x0

    .line 106
    const/4 v7, 0x0

    .line 107
    const/4 v9, 0x0

    .line 108
    const/4 v10, 0x0

    .line 109
    const/4 v11, 0x0

    .line 110
    const/4 v12, 0x0

    .line 111
    const/4 v13, 0x0

    .line 112
    const/4 v14, 0x0

    .line 113
    const/4 v15, 0x0

    .line 114
    const/16 v16, 0x0

    .line 115
    .line 116
    const/16 v17, 0x0

    .line 117
    .line 118
    const/16 v18, 0x0

    .line 119
    .line 120
    const/16 v19, 0x0

    .line 121
    .line 122
    move-object v8, v6

    .line 123
    invoke-static/range {v4 .. v21}, La/r6b;->a(La/r6b;Ljava/util/List;Ljava/util/Map;Ljava/util/List;Ljava/util/Map;La/l9s;La/js20;La/js20;Ljava/util/List;La/xvm0;La/xvm0;Ljava/util/List;La/aw20;La/ycs;Ljava/lang/String;ZZI)La/r6b;

    .line 124
    .line 125
    .line 126
    move-result-object v4

    .line 127
    invoke-virtual {v3, v0, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result v0

    .line 131
    if-eqz v0, :cond_1

    .line 132
    .line 133
    if-eqz v1, :cond_2

    .line 134
    .line 135
    iget-object v0, v2, La/y7b;->I:La/c4m0;

    .line 136
    .line 137
    if-eqz v0, :cond_3

    .line 138
    .line 139
    const/4 v1, 0x0

    .line 140
    invoke-virtual {v0, v1}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 141
    .line 142
    .line 143
    goto :goto_1

    .line 144
    :cond_2
    invoke-virtual {v2}, La/i3t0;->D()Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    check-cast v0, La/r6b;

    .line 149
    .line 150
    iget-object v0, v0, La/r6b;->i:La/xvm0;

    .line 151
    .line 152
    invoke-virtual {v2, v0}, La/y7b;->M(La/xvm0;)V

    .line 153
    .line 154
    .line 155
    :cond_3
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 156
    .line 157
    return-object v0

    .line 158
    :pswitch_1
    iget-boolean v0, v0, La/g7b;->j:Z

    .line 159
    .line 160
    sget-object v1, La/wne;->a:La/wne;

    .line 161
    .line 162
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 163
    .line 164
    .line 165
    sget v1, La/y7b;->K:I

    .line 166
    .line 167
    iget-object v1, v2, La/i3t0;->i:La/ocj;

    .line 168
    .line 169
    iget-object v1, v1, La/ocj;->a:La/p7m0;

    .line 170
    .line 171
    :goto_2
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v2

    .line 175
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 176
    .line 177
    .line 178
    move-object v3, v1

    .line 179
    move-object v1, v2

    .line 180
    check-cast v1, La/r6b;

    .line 181
    .line 182
    const/16 v16, 0x0

    .line 183
    .line 184
    const v18, 0x3ffff

    .line 185
    .line 186
    .line 187
    move-object v4, v2

    .line 188
    const/4 v2, 0x0

    .line 189
    move-object v5, v3

    .line 190
    const/4 v3, 0x0

    .line 191
    move-object v6, v4

    .line 192
    const/4 v4, 0x0

    .line 193
    move-object v7, v5

    .line 194
    const/4 v5, 0x0

    .line 195
    move-object v8, v6

    .line 196
    const/4 v6, 0x0

    .line 197
    move-object v9, v7

    .line 198
    const/4 v7, 0x0

    .line 199
    move-object v10, v8

    .line 200
    const/4 v8, 0x0

    .line 201
    move-object v11, v9

    .line 202
    const/4 v9, 0x0

    .line 203
    move-object v12, v10

    .line 204
    const/4 v10, 0x0

    .line 205
    move-object v13, v11

    .line 206
    const/4 v11, 0x0

    .line 207
    move-object v14, v12

    .line 208
    const/4 v12, 0x0

    .line 209
    move-object v15, v13

    .line 210
    const/4 v13, 0x0

    .line 211
    move-object/from16 v17, v14

    .line 212
    .line 213
    const/4 v14, 0x0

    .line 214
    move-object/from16 v19, v15

    .line 215
    .line 216
    const/4 v15, 0x0

    .line 217
    move-object/from16 v22, v17

    .line 218
    .line 219
    move/from16 v17, v0

    .line 220
    .line 221
    move-object/from16 v0, v19

    .line 222
    .line 223
    invoke-static/range {v1 .. v18}, La/r6b;->a(La/r6b;Ljava/util/List;Ljava/util/Map;Ljava/util/List;Ljava/util/Map;La/l9s;La/js20;La/js20;Ljava/util/List;La/xvm0;La/xvm0;Ljava/util/List;La/aw20;La/ycs;Ljava/lang/String;ZZI)La/r6b;

    .line 224
    .line 225
    .line 226
    move-result-object v1

    .line 227
    move-object/from16 v14, v22

    .line 228
    .line 229
    invoke-virtual {v0, v14, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 230
    .line 231
    .line 232
    move-result v1

    .line 233
    if-eqz v1, :cond_4

    .line 234
    .line 235
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 236
    .line 237
    return-object v0

    .line 238
    :cond_4
    move-object v1, v0

    .line 239
    move/from16 v0, v17

    .line 240
    .line 241
    goto :goto_2

    .line 242
    nop

    .line 243
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

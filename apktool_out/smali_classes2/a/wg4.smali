.class public final La/wg4;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/fh4;


# direct methods
.method public synthetic constructor <init>(La/fh4;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/wg4;->i:B

    iput-object p1, p0, La/wg4;->k:La/fh4;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/wg4;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/wg4;->k:La/fh4;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/wg4;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p1, v1}, La/wg4;-><init>(La/fh4;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object v0

    .line 15
    :pswitch_0
    new-instance v0, La/wg4;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-direct {v0, p0, p1, v1}, La/wg4;-><init>(La/fh4;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object v0

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/wg4;->i:B

    .line 2
    .line 3
    check-cast p1, La/yje;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, La/wg4;->create(La/yje;)La/yje;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, La/wg4;

    .line 13
    .line 14
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, La/wg4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :pswitch_0
    invoke-virtual {p0, p1}, La/wg4;->create(La/yje;)La/yje;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, La/wg4;

    .line 26
    .line 27
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    invoke-virtual {p0, p1}, La/wg4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/wg4;->i:B

    .line 4
    .line 5
    const-string v2, "KEY_CONTENT_VISIBILITY_STATUS"

    .line 6
    .line 7
    iget-object v3, v0, La/wg4;->k:La/fh4;

    .line 8
    .line 9
    const-wide/16 v4, 0xc8

    .line 10
    .line 11
    const/4 v6, 0x0

    .line 12
    const-string v7, "call to \'resume\' before \'invoke\' with coroutine"

    .line 13
    .line 14
    packed-switch v1, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    sget-object v1, La/wne;->a:La/wne;

    .line 18
    .line 19
    iget-boolean v8, v0, La/wg4;->j:Z

    .line 20
    .line 21
    const/4 v9, 0x1

    .line 22
    if-eqz v8, :cond_1

    .line 23
    .line 24
    if-ne v8, v9, :cond_0

    .line 25
    .line 26
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-static {v7}, La/jf4;->n(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    goto :goto_2

    .line 34
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    iput-boolean v9, v0, La/wg4;->j:Z

    .line 38
    .line 39
    invoke-static {v4, v5, v0}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    if-ne v0, v1, :cond_2

    .line 44
    .line 45
    move-object v6, v1

    .line 46
    goto :goto_2

    .line 47
    :cond_2
    :goto_0
    sget v0, La/fh4;->c0:I

    .line 48
    .line 49
    iget-object v0, v3, La/i3t0;->i:La/ocj;

    .line 50
    .line 51
    iget-object v1, v0, La/ocj;->a:La/p7m0;

    .line 52
    .line 53
    :goto_1
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    iget-object v4, v3, La/i3t0;->f:La/oyg0;

    .line 61
    .line 62
    move/from16 v21, v9

    .line 63
    .line 64
    move-object v9, v0

    .line 65
    check-cast v9, La/zf4;

    .line 66
    .line 67
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 71
    .line 72
    invoke-static {v4, v5, v2}, La/q7x;->F(La/oyg0;Ljava/lang/Object;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    const/16 v22, 0x3fff

    .line 76
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
    const/16 v19, 0x0

    .line 90
    .line 91
    const/16 v20, 0x0

    .line 92
    .line 93
    invoke-static/range {v9 .. v22}, La/zf4;->a(La/zf4;ZZZLa/gd4;La/hd4;La/id4;IZLjava/util/List;Lorg/xplatform/login/core/presentation/model/AuthDataErrorModel;ZZI)La/zf4;

    .line 94
    .line 95
    .line 96
    move-result-object v4

    .line 97
    invoke-virtual {v1, v0, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    if-eqz v0, :cond_3

    .line 102
    .line 103
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 104
    .line 105
    :goto_2
    return-object v6

    .line 106
    :cond_3
    move/from16 v9, v21

    .line 107
    .line 108
    goto :goto_1

    .line 109
    :pswitch_0
    sget-object v1, La/wne;->a:La/wne;

    .line 110
    .line 111
    iget-boolean v8, v0, La/wg4;->j:Z

    .line 112
    .line 113
    const/4 v9, 0x1

    .line 114
    if-eqz v8, :cond_5

    .line 115
    .line 116
    if-ne v8, v9, :cond_4

    .line 117
    .line 118
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    goto :goto_3

    .line 122
    :cond_4
    invoke-static {v7}, La/jf4;->n(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    goto :goto_4

    .line 126
    :cond_5
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    sget v6, La/fh4;->c0:I

    .line 130
    .line 131
    iget-object v6, v3, La/i3t0;->i:La/ocj;

    .line 132
    .line 133
    iget-object v6, v6, La/ocj;->a:La/p7m0;

    .line 134
    .line 135
    :cond_6
    invoke-virtual {v6}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v7

    .line 139
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 140
    .line 141
    .line 142
    iget-object v8, v3, La/i3t0;->f:La/oyg0;

    .line 143
    .line 144
    move-object v10, v7

    .line 145
    check-cast v10, La/zf4;

    .line 146
    .line 147
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    sget-object v11, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 151
    .line 152
    invoke-static {v8, v11, v2}, La/q7x;->F(La/oyg0;Ljava/lang/Object;Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    const/16 v23, 0x3fff

    .line 156
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
    const/16 v16, 0x0

    .line 163
    .line 164
    const/16 v17, 0x0

    .line 165
    .line 166
    const/16 v18, 0x0

    .line 167
    .line 168
    const/16 v19, 0x0

    .line 169
    .line 170
    const/16 v20, 0x0

    .line 171
    .line 172
    const/16 v21, 0x0

    .line 173
    .line 174
    const/16 v22, 0x0

    .line 175
    .line 176
    invoke-static/range {v10 .. v23}, La/zf4;->a(La/zf4;ZZZLa/gd4;La/hd4;La/id4;IZLjava/util/List;Lorg/xplatform/login/core/presentation/model/AuthDataErrorModel;ZZI)La/zf4;

    .line 177
    .line 178
    .line 179
    move-result-object v8

    .line 180
    invoke-virtual {v6, v7, v8}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    move-result v7

    .line 184
    if-eqz v7, :cond_6

    .line 185
    .line 186
    iput-boolean v9, v0, La/wg4;->j:Z

    .line 187
    .line 188
    invoke-static {v4, v5, v0}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    if-ne v0, v1, :cond_7

    .line 193
    .line 194
    move-object v6, v1

    .line 195
    goto :goto_4

    .line 196
    :cond_7
    :goto_3
    iget-object v0, v3, La/fh4;->x:La/i1w0;

    .line 197
    .line 198
    new-instance v1, La/or3;

    .line 199
    .line 200
    const/16 v2, 0x1c

    .line 201
    .line 202
    invoke-direct {v1, v2}, La/or3;-><init>(B)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {v0, v1}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 206
    .line 207
    .line 208
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 209
    .line 210
    :goto_4
    return-object v6

    .line 211
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

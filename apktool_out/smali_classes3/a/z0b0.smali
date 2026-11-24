.class public final La/z0b0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public synthetic k:Ljava/lang/Object;

.field public final synthetic l:La/f1b0;


# direct methods
.method public synthetic constructor <init>(La/f1b0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/z0b0;->i:B

    iput-object p1, p0, La/z0b0;->l:La/f1b0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/z0b0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/z0b0;->l:La/f1b0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/z0b0;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/z0b0;-><init>(La/f1b0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/z0b0;->k:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/z0b0;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/z0b0;-><init>(La/f1b0;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/z0b0;->k:Ljava/lang/Object;

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
    iget-byte v0, p0, La/z0b0;->i:B

    .line 2
    .line 3
    check-cast p1, La/sw00;

    .line 4
    .line 5
    check-cast p2, La/yje;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/z0b0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/z0b0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/z0b0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/z0b0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/z0b0;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/z0b0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/z0b0;->i:B

    .line 4
    .line 5
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    iget-object v4, v0, La/z0b0;->l:La/f1b0;

    .line 9
    .line 10
    const/4 v5, 0x0

    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    iget-object v1, v0, La/z0b0;->k:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v1, La/sw00;

    .line 17
    .line 18
    sget-object v6, La/wne;->a:La/wne;

    .line 19
    .line 20
    iget-boolean v7, v0, La/z0b0;->j:Z

    .line 21
    .line 22
    if-eqz v7, :cond_1

    .line 23
    .line 24
    if-ne v7, v3, :cond_0

    .line 25
    .line 26
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    iget-boolean v2, v1, La/sw00;->b:Z

    .line 38
    .line 39
    if-nez v2, :cond_3

    .line 40
    .line 41
    iget-boolean v1, v1, La/sw00;->a:Z

    .line 42
    .line 43
    if-eqz v1, :cond_3

    .line 44
    .line 45
    iget-object v1, v4, La/f1b0;->Q:La/wsf0;

    .line 46
    .line 47
    iput-object v5, v0, La/z0b0;->k:Ljava/lang/Object;

    .line 48
    .line 49
    iput-boolean v3, v0, La/z0b0;->j:Z

    .line 50
    .line 51
    invoke-virtual {v1, v0}, La/wsf0;->o(La/zje;)Lkotlin/Unit;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    if-ne v0, v6, :cond_2

    .line 56
    .line 57
    move-object v5, v6

    .line 58
    goto :goto_1

    .line 59
    :cond_2
    :goto_0
    sget v0, La/f1b0;->w0:I

    .line 60
    .line 61
    invoke-virtual {v4}, La/f1b0;->Y()V

    .line 62
    .line 63
    .line 64
    :cond_3
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 65
    .line 66
    :goto_1
    return-object v5

    .line 67
    :pswitch_0
    iget-object v1, v4, La/i3t0;->i:La/ocj;

    .line 68
    .line 69
    iget-object v6, v0, La/z0b0;->k:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v6, La/sw00;

    .line 72
    .line 73
    sget-object v7, La/wne;->a:La/wne;

    .line 74
    .line 75
    iget-boolean v8, v0, La/z0b0;->j:Z

    .line 76
    .line 77
    if-eqz v8, :cond_5

    .line 78
    .line 79
    if-ne v8, v3, :cond_4

    .line 80
    .line 81
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    move-object/from16 v0, p1

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_4
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    goto/16 :goto_3

    .line 91
    .line 92
    :cond_5
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    iget-object v2, v4, La/f1b0;->S:La/ouu;

    .line 96
    .line 97
    iput-object v6, v0, La/z0b0;->k:Ljava/lang/Object;

    .line 98
    .line 99
    iput-boolean v3, v0, La/z0b0;->j:Z

    .line 100
    .line 101
    invoke-virtual {v2, v0}, La/ouu;->E(La/yje;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    if-ne v0, v7, :cond_6

    .line 106
    .line 107
    move-object v5, v7

    .line 108
    goto :goto_3

    .line 109
    :cond_6
    :goto_2
    check-cast v0, Ljava/lang/Boolean;

    .line 110
    .line 111
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 112
    .line 113
    .line 114
    move-result v15

    .line 115
    sget v0, La/f1b0;->w0:I

    .line 116
    .line 117
    iget-object v0, v1, La/ocj;->a:La/p7m0;

    .line 118
    .line 119
    :cond_7
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    move-object v7, v2

    .line 127
    check-cast v7, La/d0b0;

    .line 128
    .line 129
    const/16 v18, 0x0

    .line 130
    .line 131
    const/16 v19, 0xeff

    .line 132
    .line 133
    const/4 v8, 0x0

    .line 134
    const/4 v9, 0x0

    .line 135
    const/4 v10, 0x0

    .line 136
    const/4 v11, 0x0

    .line 137
    const/4 v12, 0x0

    .line 138
    const/4 v13, 0x0

    .line 139
    const/4 v14, 0x0

    .line 140
    const/16 v16, 0x0

    .line 141
    .line 142
    const/16 v17, 0x0

    .line 143
    .line 144
    invoke-static/range {v7 .. v19}, La/d0b0;->a(La/d0b0;La/xza0;La/zza0;La/yza0;La/b0b0;Ljava/util/Set;ZZZZLa/a0b0;ZI)La/d0b0;

    .line 145
    .line 146
    .line 147
    move-result-object v5

    .line 148
    invoke-virtual {v0, v2, v5}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    move-result v2

    .line 152
    if-eqz v2, :cond_7

    .line 153
    .line 154
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    check-cast v0, La/d0b0;

    .line 159
    .line 160
    iget-boolean v0, v0, La/d0b0;->g:Z

    .line 161
    .line 162
    iget-boolean v2, v6, La/sw00;->a:Z

    .line 163
    .line 164
    if-eq v0, v2, :cond_9

    .line 165
    .line 166
    iget-object v0, v1, La/ocj;->a:La/p7m0;

    .line 167
    .line 168
    :cond_8
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v1

    .line 172
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 173
    .line 174
    .line 175
    move-object v7, v1

    .line 176
    check-cast v7, La/d0b0;

    .line 177
    .line 178
    iget-boolean v13, v6, La/sw00;->a:Z

    .line 179
    .line 180
    const/16 v18, 0x0

    .line 181
    .line 182
    const/16 v19, 0xfbf

    .line 183
    .line 184
    const/4 v8, 0x0

    .line 185
    const/4 v9, 0x0

    .line 186
    const/4 v10, 0x0

    .line 187
    const/4 v11, 0x0

    .line 188
    const/4 v12, 0x0

    .line 189
    const/4 v14, 0x0

    .line 190
    const/4 v15, 0x0

    .line 191
    const/16 v16, 0x0

    .line 192
    .line 193
    const/16 v17, 0x0

    .line 194
    .line 195
    invoke-static/range {v7 .. v19}, La/d0b0;->a(La/d0b0;La/xza0;La/zza0;La/yza0;La/b0b0;Ljava/util/Set;ZZZZLa/a0b0;ZI)La/d0b0;

    .line 196
    .line 197
    .line 198
    move-result-object v2

    .line 199
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 200
    .line 201
    .line 202
    move-result v1

    .line 203
    if-eqz v1, :cond_8

    .line 204
    .line 205
    invoke-virtual {v4, v3}, La/f1b0;->R(Z)V

    .line 206
    .line 207
    .line 208
    :cond_9
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 209
    .line 210
    :goto_3
    return-object v5

    .line 211
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

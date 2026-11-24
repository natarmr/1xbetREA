.class public final La/k9g0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/o9g0;


# direct methods
.method public synthetic constructor <init>(La/o9g0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/k9g0;->i:B

    iput-object p1, p0, La/k9g0;->k:La/o9g0;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/k9g0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/k9g0;->k:La/o9g0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/k9g0;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p1, v1}, La/k9g0;-><init>(La/o9g0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object v0

    .line 15
    :pswitch_0
    new-instance v0, La/k9g0;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-direct {v0, p0, p1, v1}, La/k9g0;-><init>(La/o9g0;La/yje;B)V

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
    iget-byte v0, p0, La/k9g0;->i:B

    .line 2
    .line 3
    check-cast p1, La/yje;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, La/k9g0;->create(La/yje;)La/yje;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, La/k9g0;

    .line 13
    .line 14
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, La/k9g0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :pswitch_0
    invoke-virtual {p0, p1}, La/k9g0;->create(La/yje;)La/yje;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, La/k9g0;

    .line 26
    .line 27
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    invoke-virtual {p0, p1}, La/k9g0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    nop

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
    iget-byte v1, v0, La/k9g0;->i:B

    .line 4
    .line 5
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    iget-object v4, v0, La/k9g0;->k:La/o9g0;

    .line 9
    .line 10
    const/4 v5, 0x0

    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    sget-object v1, La/wne;->a:La/wne;

    .line 15
    .line 16
    iget-boolean v6, v0, La/k9g0;->j:Z

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
    sget-object v2, La/wen;->b:La/uen;

    .line 34
    .line 35
    const/4 v2, 0x2

    .line 36
    sget-object v6, La/bfn;->f:La/bfn;

    .line 37
    .line 38
    invoke-static {v2, v6}, La/ibc;->v0(ILa/bfn;)J

    .line 39
    .line 40
    .line 41
    move-result-wide v6

    .line 42
    iput-boolean v3, v0, La/k9g0;->j:Z

    .line 43
    .line 44
    invoke-static {v6, v7, v0}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    if-ne v0, v1, :cond_2

    .line 49
    .line 50
    move-object v5, v1

    .line 51
    goto :goto_1

    .line 52
    :cond_2
    :goto_0
    iget-object v0, v4, La/o9g0;->w:La/vqc;

    .line 53
    .line 54
    iget-object v0, v0, La/vqc;->b:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v0, La/b6t;

    .line 57
    .line 58
    iget-object v0, v0, La/b6t;->c:La/t5t;

    .line 59
    .line 60
    iget-object v0, v0, La/t5t;->a:La/p7m0;

    .line 61
    .line 62
    invoke-virtual {v0, v5}, La/p7m0;->n(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    iget-object v0, v4, La/i3t0;->i:La/ocj;

    .line 66
    .line 67
    iget-object v1, v0, La/ocj;->a:La/p7m0;

    .line 68
    .line 69
    :cond_3
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    iget-object v2, v4, La/i3t0;->f:La/oyg0;

    .line 77
    .line 78
    move-object v6, v0

    .line 79
    check-cast v6, La/e9g0;

    .line 80
    .line 81
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    sget-object v8, La/iun;->a:La/iun;

    .line 85
    .line 86
    sget-object v7, La/xun;->a:La/xun;

    .line 87
    .line 88
    sget-object v9, La/q5g0;->b:La/q5g0;

    .line 89
    .line 90
    iget-object v2, v6, La/e9g0;->m:La/yl9;

    .line 91
    .line 92
    iget-object v2, v2, La/yl9;->a:Ljava/util/Set;

    .line 93
    .line 94
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    new-instance v14, La/yl9;

    .line 98
    .line 99
    invoke-direct {v14, v2, v5}, La/yl9;-><init>(Ljava/util/Set;Ljava/util/Date;)V

    .line 100
    .line 101
    .line 102
    const/4 v13, 0x0

    .line 103
    const/16 v15, 0x2e3b

    .line 104
    .line 105
    const-wide/16 v10, -0x141

    .line 106
    .line 107
    const/4 v12, 0x0

    .line 108
    invoke-static/range {v6 .. v15}, La/e9g0;->a(La/e9g0;Ljava/util/Set;Ljava/util/List;La/q5g0;JLjava/util/List;La/wcb;La/yl9;I)La/e9g0;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    if-eqz v0, :cond_3

    .line 117
    .line 118
    iget-object v0, v4, La/o9g0;->B:La/drm0;

    .line 119
    .line 120
    invoke-virtual {v0, v7}, La/drm0;->k(Ljava/util/Set;)V

    .line 121
    .line 122
    .line 123
    iget-object v0, v4, La/o9g0;->C:La/ilp0;

    .line 124
    .line 125
    invoke-virtual {v0, v8}, La/ilp0;->f(Ljava/util/List;)V

    .line 126
    .line 127
    .line 128
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 129
    .line 130
    :goto_1
    return-object v5

    .line 131
    :pswitch_0
    sget-object v1, La/wne;->a:La/wne;

    .line 132
    .line 133
    iget-boolean v6, v0, La/k9g0;->j:Z

    .line 134
    .line 135
    if-eqz v6, :cond_5

    .line 136
    .line 137
    if-ne v6, v3, :cond_4

    .line 138
    .line 139
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    move-object/from16 v0, p1

    .line 143
    .line 144
    goto :goto_2

    .line 145
    :cond_4
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    goto :goto_3

    .line 149
    :cond_5
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    iget-object v2, v4, La/o9g0;->H:La/j3c;

    .line 153
    .line 154
    iput-boolean v3, v0, La/k9g0;->j:Z

    .line 155
    .line 156
    invoke-virtual {v2, v0}, La/j3c;->c(La/yje;)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    if-ne v0, v1, :cond_6

    .line 161
    .line 162
    move-object v5, v1

    .line 163
    goto :goto_3

    .line 164
    :cond_6
    :goto_2
    move-object v12, v0

    .line 165
    check-cast v12, La/wcb;

    .line 166
    .line 167
    sget v0, La/o9g0;->M:I

    .line 168
    .line 169
    iget-object v0, v4, La/i3t0;->i:La/ocj;

    .line 170
    .line 171
    iget-object v0, v0, La/ocj;->a:La/p7m0;

    .line 172
    .line 173
    :cond_7
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v1

    .line 177
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 178
    .line 179
    .line 180
    move-object v5, v1

    .line 181
    check-cast v5, La/e9g0;

    .line 182
    .line 183
    const/4 v13, 0x0

    .line 184
    const/16 v14, 0x37ff

    .line 185
    .line 186
    const/4 v6, 0x0

    .line 187
    const/4 v7, 0x0

    .line 188
    const/4 v8, 0x0

    .line 189
    const-wide/16 v9, 0x0

    .line 190
    .line 191
    const/4 v11, 0x0

    .line 192
    invoke-static/range {v5 .. v14}, La/e9g0;->a(La/e9g0;Ljava/util/Set;Ljava/util/List;La/q5g0;JLjava/util/List;La/wcb;La/yl9;I)La/e9g0;

    .line 193
    .line 194
    .line 195
    move-result-object v2

    .line 196
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 197
    .line 198
    .line 199
    move-result v1

    .line 200
    if-eqz v1, :cond_7

    .line 201
    .line 202
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 203
    .line 204
    :goto_3
    return-object v5

    .line 205
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

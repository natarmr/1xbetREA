.class public final La/x5n;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:B

.field public final synthetic k:F

.field public final synthetic l:F

.field public final synthetic m:Ljava/lang/Object;

.field public final synthetic n:Ljava/lang/Object;


# direct methods
.method public constructor <init>(FFLa/pvh0;La/y1h0;La/yje;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-byte v0, p0, La/x5n;->i:B

    .line 3
    .line 4
    iput p1, p0, La/x5n;->k:F

    .line 5
    .line 6
    iput p2, p0, La/x5n;->l:F

    .line 7
    .line 8
    iput-object p3, p0, La/x5n;->m:Ljava/lang/Object;

    .line 9
    .line 10
    iput-object p4, p0, La/x5n;->n:Ljava/lang/Object;

    .line 11
    .line 12
    const/4 p1, 0x2

    .line 13
    invoke-direct {p0, p1, p5}, La/bnn0;-><init>(ILa/yje;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public constructor <init>(La/t33;FLa/t33;FLa/yje;)V
    .locals 1

    const/4 v0, 0x0

    iput-byte v0, p0, La/x5n;->i:B

    .line 17
    iput-object p1, p0, La/x5n;->m:Ljava/lang/Object;

    iput p2, p0, La/x5n;->k:F

    iput-object p3, p0, La/x5n;->n:Ljava/lang/Object;

    iput p4, p0, La/x5n;->l:F

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 7

    .line 1
    iget-byte p1, p0, La/x5n;->i:B

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, La/x5n;

    .line 7
    .line 8
    iget-object p1, p0, La/x5n;->m:Ljava/lang/Object;

    .line 9
    .line 10
    move-object v3, p1

    .line 11
    check-cast v3, La/pvh0;

    .line 12
    .line 13
    iget-object p1, p0, La/x5n;->n:Ljava/lang/Object;

    .line 14
    .line 15
    move-object v4, p1

    .line 16
    check-cast v4, La/y1h0;

    .line 17
    .line 18
    iget v1, p0, La/x5n;->k:F

    .line 19
    .line 20
    iget v2, p0, La/x5n;->l:F

    .line 21
    .line 22
    move-object v5, p2

    .line 23
    invoke-direct/range {v0 .. v5}, La/x5n;-><init>(FFLa/pvh0;La/y1h0;La/yje;)V

    .line 24
    .line 25
    .line 26
    return-object v0

    .line 27
    :pswitch_0
    move-object v5, p2

    .line 28
    new-instance v1, La/x5n;

    .line 29
    .line 30
    iget-object p1, p0, La/x5n;->m:Ljava/lang/Object;

    .line 31
    .line 32
    move-object v2, p1

    .line 33
    check-cast v2, La/t33;

    .line 34
    .line 35
    iget-object p1, p0, La/x5n;->n:Ljava/lang/Object;

    .line 36
    .line 37
    move-object v4, p1

    .line 38
    check-cast v4, La/t33;

    .line 39
    .line 40
    move-object v6, v5

    .line 41
    iget v5, p0, La/x5n;->l:F

    .line 42
    .line 43
    iget v3, p0, La/x5n;->k:F

    .line 44
    .line 45
    invoke-direct/range {v1 .. v6}, La/x5n;-><init>(La/t33;FLa/t33;FLa/yje;)V

    .line 46
    .line 47
    .line 48
    return-object v1

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/x5n;->i:B

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
    invoke-virtual {p0, p1, p2}, La/x5n;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/x5n;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/x5n;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/x5n;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/x5n;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/x5n;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget-byte v1, v0, La/x5n;->i:B

    .line 4
    .line 5
    iget-object v2, v0, La/x5n;->n:Ljava/lang/Object;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const-string v4, "call to \'resume\' before \'invoke\' with coroutine"

    .line 9
    .line 10
    const/4 v5, 0x1

    .line 11
    const/4 v6, 0x2

    .line 12
    iget v7, v0, La/x5n;->k:F

    .line 13
    .line 14
    iget v8, v0, La/x5n;->l:F

    .line 15
    .line 16
    iget-object v9, v0, La/x5n;->m:Ljava/lang/Object;

    .line 17
    .line 18
    packed-switch v1, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    move-object v11, v9

    .line 22
    check-cast v11, La/pvh0;

    .line 23
    .line 24
    sget-object v1, La/wne;->a:La/wne;

    .line 25
    .line 26
    iget-byte v9, v0, La/x5n;->j:B

    .line 27
    .line 28
    if-eqz v9, :cond_2

    .line 29
    .line 30
    if-eq v9, v5, :cond_1

    .line 31
    .line 32
    if-ne v9, v6, :cond_0

    .line 33
    .line 34
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    goto/16 :goto_3

    .line 38
    .line 39
    :cond_0
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    goto :goto_4

    .line 43
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_2
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    cmpg-float v3, v7, v8

    .line 51
    .line 52
    if-nez v3, :cond_3

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_3
    iput-byte v5, v0, La/x5n;->j:B

    .line 56
    .line 57
    iget-object v3, v11, La/pvh0;->c:La/pz40;

    .line 58
    .line 59
    check-cast v3, La/hgk0;

    .line 60
    .line 61
    invoke-virtual {v3}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    invoke-virtual {v11, v7, v3, v0}, La/pvh0;->s1(FLjava/lang/Object;La/bnn0;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    if-ne v3, v1, :cond_4

    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_4
    :goto_0
    cmpg-float v3, v7, v8

    .line 73
    .line 74
    if-nez v3, :cond_8

    .line 75
    .line 76
    move-object v12, v2

    .line 77
    check-cast v12, La/y1h0;

    .line 78
    .line 79
    iput-byte v6, v0, La/x5n;->j:B

    .line 80
    .line 81
    iget-object v13, v11, La/pvh0;->f:La/oms0;

    .line 82
    .line 83
    if-nez v13, :cond_5

    .line 84
    .line 85
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_5
    iget-object v2, v11, La/pvh0;->d:La/pz40;

    .line 89
    .line 90
    check-cast v2, La/hgk0;

    .line 91
    .line 92
    invoke-virtual {v2}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    invoke-static {v2, v12}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v2

    .line 100
    if-eqz v2, :cond_6

    .line 101
    .line 102
    iget-object v2, v11, La/pvh0;->c:La/pz40;

    .line 103
    .line 104
    check-cast v2, La/hgk0;

    .line 105
    .line 106
    invoke-virtual {v2}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    invoke-static {v2, v12}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v2

    .line 114
    if-eqz v2, :cond_6

    .line 115
    .line 116
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 117
    .line 118
    goto :goto_1

    .line 119
    :cond_6
    iget-object v2, v11, La/pvh0;->m:La/h050;

    .line 120
    .line 121
    new-instance v10, La/kvh0;

    .line 122
    .line 123
    const/4 v14, 0x0

    .line 124
    const/4 v15, 0x1

    .line 125
    invoke-direct/range {v10 .. v15}, La/kvh0;-><init>(La/pvh0;Ljava/lang/Object;La/oms0;La/yje;B)V

    .line 126
    .line 127
    .line 128
    invoke-static {v2, v10, v0}, La/h050;->a(La/h050;Lkotlin/jvm/functions/Function1;La/yje;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    if-ne v0, v1, :cond_7

    .line 133
    .line 134
    goto :goto_1

    .line 135
    :cond_7
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 136
    .line 137
    :goto_1
    if-ne v0, v1, :cond_8

    .line 138
    .line 139
    :goto_2
    move-object v3, v1

    .line 140
    goto :goto_4

    .line 141
    :cond_8
    :goto_3
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 142
    .line 143
    :goto_4
    return-object v3

    .line 144
    :pswitch_0
    sget-object v1, La/wne;->a:La/wne;

    .line 145
    .line 146
    iget-byte v10, v0, La/x5n;->j:B

    .line 147
    .line 148
    if-eqz v10, :cond_b

    .line 149
    .line 150
    if-eq v10, v5, :cond_a

    .line 151
    .line 152
    if-ne v10, v6, :cond_9

    .line 153
    .line 154
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    goto :goto_7

    .line 158
    :cond_9
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    goto :goto_8

    .line 162
    :cond_a
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 163
    .line 164
    .line 165
    goto :goto_5

    .line 166
    :cond_b
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 167
    .line 168
    .line 169
    check-cast v9, La/t33;

    .line 170
    .line 171
    new-instance v3, Ljava/lang/Float;

    .line 172
    .line 173
    invoke-direct {v3, v7}, Ljava/lang/Float;-><init>(F)V

    .line 174
    .line 175
    .line 176
    iput-byte v5, v0, La/x5n;->j:B

    .line 177
    .line 178
    invoke-virtual {v9, v0, v3}, La/t33;->f(La/yje;Ljava/lang/Object;)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v3

    .line 182
    if-ne v3, v1, :cond_c

    .line 183
    .line 184
    goto :goto_6

    .line 185
    :cond_c
    :goto_5
    check-cast v2, La/t33;

    .line 186
    .line 187
    new-instance v3, Ljava/lang/Float;

    .line 188
    .line 189
    invoke-direct {v3, v8}, Ljava/lang/Float;-><init>(F)V

    .line 190
    .line 191
    .line 192
    iput-byte v6, v0, La/x5n;->j:B

    .line 193
    .line 194
    invoke-virtual {v2, v0, v3}, La/t33;->f(La/yje;Ljava/lang/Object;)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    if-ne v0, v1, :cond_d

    .line 199
    .line 200
    :goto_6
    move-object v3, v1

    .line 201
    goto :goto_8

    .line 202
    :cond_d
    :goto_7
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 203
    .line 204
    :goto_8
    return-object v3

    .line 205
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

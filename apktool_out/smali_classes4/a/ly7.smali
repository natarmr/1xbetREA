.class public final La/ly7;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/t33;

.field public final synthetic l:F


# direct methods
.method public synthetic constructor <init>(La/t33;FLa/yje;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/ly7;->i:B

    iput-object p1, p0, La/ly7;->k:La/t33;

    iput p2, p0, La/ly7;->l:F

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte p1, p0, La/ly7;->i:B

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p1, La/ly7;

    .line 7
    .line 8
    iget v0, p0, La/ly7;->l:F

    .line 9
    .line 10
    const/4 v1, 0x3

    .line 11
    iget-object p0, p0, La/ly7;->k:La/t33;

    .line 12
    .line 13
    invoke-direct {p1, p0, v0, p2, v1}, La/ly7;-><init>(La/t33;FLa/yje;B)V

    .line 14
    .line 15
    .line 16
    return-object p1

    .line 17
    :pswitch_0
    new-instance p1, La/ly7;

    .line 18
    .line 19
    iget v0, p0, La/ly7;->l:F

    .line 20
    .line 21
    const/4 v1, 0x2

    .line 22
    iget-object p0, p0, La/ly7;->k:La/t33;

    .line 23
    .line 24
    invoke-direct {p1, p0, v0, p2, v1}, La/ly7;-><init>(La/t33;FLa/yje;B)V

    .line 25
    .line 26
    .line 27
    return-object p1

    .line 28
    :pswitch_1
    new-instance p1, La/ly7;

    .line 29
    .line 30
    iget v0, p0, La/ly7;->l:F

    .line 31
    .line 32
    const/4 v1, 0x1

    .line 33
    iget-object p0, p0, La/ly7;->k:La/t33;

    .line 34
    .line 35
    invoke-direct {p1, p0, v0, p2, v1}, La/ly7;-><init>(La/t33;FLa/yje;B)V

    .line 36
    .line 37
    .line 38
    return-object p1

    .line 39
    :pswitch_2
    new-instance p1, La/ly7;

    .line 40
    .line 41
    iget v0, p0, La/ly7;->l:F

    .line 42
    .line 43
    const/4 v1, 0x0

    .line 44
    iget-object p0, p0, La/ly7;->k:La/t33;

    .line 45
    .line 46
    invoke-direct {p1, p0, v0, p2, v1}, La/ly7;-><init>(La/t33;FLa/yje;B)V

    .line 47
    .line 48
    .line 49
    return-object p1

    .line 50
    nop

    .line 51
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/ly7;->i:B

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
    invoke-virtual {p0, p1, p2}, La/ly7;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/ly7;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/ly7;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/ly7;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/ly7;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/ly7;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, La/ly7;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, La/ly7;

    .line 41
    .line 42
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, La/ly7;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0

    .line 49
    :pswitch_2
    invoke-virtual {p0, p1, p2}, La/ly7;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    check-cast p0, La/ly7;

    .line 54
    .line 55
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 56
    .line 57
    invoke-virtual {p0, p1}, La/ly7;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    return-object p0

    .line 62
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte v0, p0, La/ly7;->i:B

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/16 v2, 0x12c

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    iget v4, p0, La/ly7;->l:F

    .line 8
    .line 9
    const-string v6, "call to \'resume\' before \'invoke\' with coroutine"

    .line 10
    .line 11
    const/4 v7, 0x1

    .line 12
    const/4 v8, 0x0

    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    sget-object v9, La/wne;->a:La/wne;

    .line 17
    .line 18
    iget-boolean v0, p0, La/ly7;->j:Z

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    if-ne v0, v7, :cond_0

    .line 23
    .line 24
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-static {v6}, La/jf4;->n(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    new-instance v0, Ljava/lang/Float;

    .line 36
    .line 37
    invoke-direct {v0, v4}, Ljava/lang/Float;-><init>(F)V

    .line 38
    .line 39
    .line 40
    sget-object v4, La/ihn;->a:La/zsf;

    .line 41
    .line 42
    invoke-static {v2, v3, v4, v1}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    iput-boolean v7, p0, La/ly7;->j:Z

    .line 47
    .line 48
    move-object v1, v0

    .line 49
    iget-object v0, p0, La/ly7;->k:La/t33;

    .line 50
    .line 51
    const/4 v3, 0x0

    .line 52
    const/4 v4, 0x0

    .line 53
    const/16 v6, 0xc

    .line 54
    .line 55
    move-object v5, p0

    .line 56
    invoke-static/range {v0 .. v6}, La/t33;->a(La/t33;Ljava/lang/Object;La/j73;Ljava/lang/Float;Lkotlin/jvm/functions/Function1;La/yje;I)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    if-ne v0, v9, :cond_2

    .line 61
    .line 62
    move-object v8, v9

    .line 63
    goto :goto_1

    .line 64
    :cond_2
    :goto_0
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 65
    .line 66
    :goto_1
    return-object v8

    .line 67
    :pswitch_0
    sget-object v9, La/wne;->a:La/wne;

    .line 68
    .line 69
    iget-boolean v0, p0, La/ly7;->j:Z

    .line 70
    .line 71
    if-eqz v0, :cond_4

    .line 72
    .line 73
    if-ne v0, v7, :cond_3

    .line 74
    .line 75
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    goto :goto_2

    .line 79
    :cond_3
    invoke-static {v6}, La/jf4;->n(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    goto :goto_3

    .line 83
    :cond_4
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    new-instance v0, Ljava/lang/Float;

    .line 87
    .line 88
    invoke-direct {v0, v4}, Ljava/lang/Float;-><init>(F)V

    .line 89
    .line 90
    .line 91
    sget-object v4, La/ihn;->a:La/zsf;

    .line 92
    .line 93
    invoke-static {v2, v3, v4, v1}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    iput-boolean v7, p0, La/ly7;->j:Z

    .line 98
    .line 99
    move-object v1, v0

    .line 100
    iget-object v0, p0, La/ly7;->k:La/t33;

    .line 101
    .line 102
    const/4 v3, 0x0

    .line 103
    const/4 v4, 0x0

    .line 104
    const/16 v6, 0xc

    .line 105
    .line 106
    move-object v5, p0

    .line 107
    invoke-static/range {v0 .. v6}, La/t33;->a(La/t33;Ljava/lang/Object;La/j73;Ljava/lang/Float;Lkotlin/jvm/functions/Function1;La/yje;I)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    if-ne v0, v9, :cond_5

    .line 112
    .line 113
    move-object v8, v9

    .line 114
    goto :goto_3

    .line 115
    :cond_5
    :goto_2
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 116
    .line 117
    :goto_3
    return-object v8

    .line 118
    :pswitch_1
    sget-object v9, La/wne;->a:La/wne;

    .line 119
    .line 120
    iget-boolean v0, p0, La/ly7;->j:Z

    .line 121
    .line 122
    if-eqz v0, :cond_7

    .line 123
    .line 124
    if-ne v0, v7, :cond_6

    .line 125
    .line 126
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    goto :goto_4

    .line 130
    :cond_6
    invoke-static {v6}, La/jf4;->n(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    goto :goto_5

    .line 134
    :cond_7
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    new-instance v1, Ljava/lang/Float;

    .line 138
    .line 139
    invoke-direct {v1, v4}, Ljava/lang/Float;-><init>(F)V

    .line 140
    .line 141
    .line 142
    const/4 v0, 0x6

    .line 143
    invoke-static {v3, v3, v8, v0}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    iput-boolean v7, p0, La/ly7;->j:Z

    .line 148
    .line 149
    iget-object v0, p0, La/ly7;->k:La/t33;

    .line 150
    .line 151
    const/4 v3, 0x0

    .line 152
    const/4 v4, 0x0

    .line 153
    const/16 v6, 0xc

    .line 154
    .line 155
    move-object v5, p0

    .line 156
    invoke-static/range {v0 .. v6}, La/t33;->a(La/t33;Ljava/lang/Object;La/j73;Ljava/lang/Float;Lkotlin/jvm/functions/Function1;La/yje;I)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    if-ne v0, v9, :cond_8

    .line 161
    .line 162
    move-object v8, v9

    .line 163
    goto :goto_5

    .line 164
    :cond_8
    :goto_4
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 165
    .line 166
    :goto_5
    return-object v8

    .line 167
    :pswitch_2
    sget-object v9, La/wne;->a:La/wne;

    .line 168
    .line 169
    iget-boolean v0, p0, La/ly7;->j:Z

    .line 170
    .line 171
    if-eqz v0, :cond_a

    .line 172
    .line 173
    if-ne v0, v7, :cond_9

    .line 174
    .line 175
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 176
    .line 177
    .line 178
    goto :goto_6

    .line 179
    :cond_9
    invoke-static {v6}, La/jf4;->n(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    goto :goto_7

    .line 183
    :cond_a
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 184
    .line 185
    .line 186
    new-instance v1, Ljava/lang/Float;

    .line 187
    .line 188
    invoke-direct {v1, v4}, Ljava/lang/Float;-><init>(F)V

    .line 189
    .line 190
    .line 191
    sget-object v0, La/ry7;->b:La/n0o0;

    .line 192
    .line 193
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    move-object v2, v0

    .line 198
    check-cast v2, La/j73;

    .line 199
    .line 200
    iput-boolean v7, p0, La/ly7;->j:Z

    .line 201
    .line 202
    iget-object v0, p0, La/ly7;->k:La/t33;

    .line 203
    .line 204
    const/4 v3, 0x0

    .line 205
    const/4 v4, 0x0

    .line 206
    const/16 v6, 0xc

    .line 207
    .line 208
    move-object v5, p0

    .line 209
    invoke-static/range {v0 .. v6}, La/t33;->a(La/t33;Ljava/lang/Object;La/j73;Ljava/lang/Float;Lkotlin/jvm/functions/Function1;La/yje;I)Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    if-ne v0, v9, :cond_b

    .line 214
    .line 215
    move-object v8, v9

    .line 216
    goto :goto_7

    .line 217
    :cond_b
    :goto_6
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 218
    .line 219
    :goto_7
    return-object v8

    .line 220
    nop

    .line 221
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

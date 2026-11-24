.class public final La/wj60;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/lge0;


# direct methods
.method public synthetic constructor <init>(La/lge0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/wj60;->i:B

    iput-object p1, p0, La/wj60;->k:La/lge0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/wj60;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/wj60;->k:La/lge0;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/wj60;

    .line 9
    .line 10
    const/4 v0, 0x3

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/wj60;-><init>(La/lge0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/wj60;

    .line 16
    .line 17
    const/4 v0, 0x2

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/wj60;-><init>(La/lge0;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    :pswitch_1
    new-instance p1, La/wj60;

    .line 23
    .line 24
    const/4 v0, 0x1

    .line 25
    invoke-direct {p1, p0, p2, v0}, La/wj60;-><init>(La/lge0;La/yje;B)V

    .line 26
    .line 27
    .line 28
    return-object p1

    .line 29
    :pswitch_2
    new-instance p1, La/wj60;

    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    invoke-direct {p1, p0, p2, v0}, La/wj60;-><init>(La/lge0;La/yje;B)V

    .line 33
    .line 34
    .line 35
    return-object p1

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

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/wj60;->i:B

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
    invoke-virtual {p0, p1, p2}, La/wj60;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/wj60;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/wj60;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/wj60;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/wj60;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/wj60;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, La/wj60;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, La/wj60;

    .line 41
    .line 42
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, La/wj60;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0

    .line 49
    :pswitch_2
    invoke-virtual {p0, p1, p2}, La/wj60;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    check-cast p0, La/wj60;

    .line 54
    .line 55
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 56
    .line 57
    invoke-virtual {p0, p1}, La/wj60;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget-byte v0, p0, La/wj60;->i:B

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x0

    .line 5
    const/16 v3, 0x258

    .line 6
    .line 7
    iget-object v4, p0, La/wj60;->k:La/lge0;

    .line 8
    .line 9
    const/4 v6, 0x0

    .line 10
    const-string v7, "call to \'resume\' before \'invoke\' with coroutine"

    .line 11
    .line 12
    const/4 v8, 0x1

    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    sget-object v9, La/wne;->a:La/wne;

    .line 17
    .line 18
    iget-boolean v0, p0, La/wj60;->j:Z

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    if-ne v0, v8, :cond_0

    .line 23
    .line 24
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-static {v7}, La/jf4;->n(Ljava/lang/String;)V

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
    iget-object v0, v4, La/lge0;->d:La/t33;

    .line 36
    .line 37
    iget v4, v4, La/lge0;->e:F

    .line 38
    .line 39
    new-instance v6, La/ycl;

    .line 40
    .line 41
    invoke-direct {v6, v4}, La/ycl;-><init>(F)V

    .line 42
    .line 43
    .line 44
    sget-object v4, La/hhn;->a:La/zsf;

    .line 45
    .line 46
    invoke-static {v3, v2, v4, v1}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    iput-boolean v8, p0, La/wj60;->j:Z

    .line 51
    .line 52
    const/4 v3, 0x0

    .line 53
    const/4 v4, 0x0

    .line 54
    move-object v1, v6

    .line 55
    const/16 v6, 0xc

    .line 56
    .line 57
    move-object v5, p0

    .line 58
    invoke-static/range {v0 .. v6}, La/t33;->a(La/t33;Ljava/lang/Object;La/j73;Ljava/lang/Float;Lkotlin/jvm/functions/Function1;La/yje;I)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    if-ne v0, v9, :cond_2

    .line 63
    .line 64
    move-object v6, v9

    .line 65
    goto :goto_1

    .line 66
    :cond_2
    :goto_0
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 67
    .line 68
    :goto_1
    return-object v6

    .line 69
    :pswitch_0
    sget-object v9, La/wne;->a:La/wne;

    .line 70
    .line 71
    iget-boolean v0, p0, La/wj60;->j:Z

    .line 72
    .line 73
    if-eqz v0, :cond_4

    .line 74
    .line 75
    if-ne v0, v8, :cond_3

    .line 76
    .line 77
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_3
    invoke-static {v7}, La/jf4;->n(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    goto :goto_3

    .line 85
    :cond_4
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    iget-object v0, v4, La/lge0;->c:La/t33;

    .line 89
    .line 90
    iget-object v4, v4, La/lge0;->a:La/jge0;

    .line 91
    .line 92
    invoke-virtual {v4}, La/jge0;->f()J

    .line 93
    .line 94
    .line 95
    move-result-wide v6

    .line 96
    new-instance v4, La/h7k0;

    .line 97
    .line 98
    invoke-direct {v4, v6, v7}, La/h7k0;-><init>(J)V

    .line 99
    .line 100
    .line 101
    sget-object v6, La/hhn;->a:La/zsf;

    .line 102
    .line 103
    invoke-static {v3, v2, v6, v1}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    iput-boolean v8, p0, La/wj60;->j:Z

    .line 108
    .line 109
    const/4 v3, 0x0

    .line 110
    move-object v1, v4

    .line 111
    const/4 v4, 0x0

    .line 112
    const/16 v6, 0xc

    .line 113
    .line 114
    move-object v5, p0

    .line 115
    invoke-static/range {v0 .. v6}, La/t33;->a(La/t33;Ljava/lang/Object;La/j73;Ljava/lang/Float;Lkotlin/jvm/functions/Function1;La/yje;I)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    if-ne v0, v9, :cond_5

    .line 120
    .line 121
    move-object v6, v9

    .line 122
    goto :goto_3

    .line 123
    :cond_5
    :goto_2
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 124
    .line 125
    :goto_3
    return-object v6

    .line 126
    :pswitch_1
    sget-object v9, La/wne;->a:La/wne;

    .line 127
    .line 128
    iget-boolean v0, p0, La/wj60;->j:Z

    .line 129
    .line 130
    if-eqz v0, :cond_7

    .line 131
    .line 132
    if-ne v0, v8, :cond_6

    .line 133
    .line 134
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    goto :goto_4

    .line 138
    :cond_6
    invoke-static {v7}, La/jf4;->n(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    goto :goto_5

    .line 142
    :cond_7
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    iget-object v0, v4, La/lge0;->b:La/t33;

    .line 146
    .line 147
    iget-object v4, v4, La/lge0;->a:La/jge0;

    .line 148
    .line 149
    invoke-virtual {v4}, La/jge0;->g()J

    .line 150
    .line 151
    .line 152
    move-result-wide v6

    .line 153
    new-instance v4, La/ne60;

    .line 154
    .line 155
    invoke-direct {v4, v6, v7}, La/ne60;-><init>(J)V

    .line 156
    .line 157
    .line 158
    sget-object v6, La/hhn;->a:La/zsf;

    .line 159
    .line 160
    invoke-static {v3, v2, v6, v1}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    .line 161
    .line 162
    .line 163
    move-result-object v2

    .line 164
    iput-boolean v8, p0, La/wj60;->j:Z

    .line 165
    .line 166
    const/4 v3, 0x0

    .line 167
    move-object v1, v4

    .line 168
    const/4 v4, 0x0

    .line 169
    const/16 v6, 0xc

    .line 170
    .line 171
    move-object v5, p0

    .line 172
    invoke-static/range {v0 .. v6}, La/t33;->a(La/t33;Ljava/lang/Object;La/j73;Ljava/lang/Float;Lkotlin/jvm/functions/Function1;La/yje;I)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    if-ne v0, v9, :cond_8

    .line 177
    .line 178
    move-object v6, v9

    .line 179
    goto :goto_5

    .line 180
    :cond_8
    :goto_4
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 181
    .line 182
    :goto_5
    return-object v6

    .line 183
    :pswitch_2
    sget-object v0, La/wne;->a:La/wne;

    .line 184
    .line 185
    iget-boolean v1, p0, La/wj60;->j:Z

    .line 186
    .line 187
    if-eqz v1, :cond_a

    .line 188
    .line 189
    if-ne v1, v8, :cond_9

    .line 190
    .line 191
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 192
    .line 193
    .line 194
    goto :goto_6

    .line 195
    :cond_9
    invoke-static {v7}, La/jf4;->n(Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    goto :goto_7

    .line 199
    :cond_a
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 200
    .line 201
    .line 202
    iput-boolean v8, p0, La/wj60;->j:Z

    .line 203
    .line 204
    invoke-virtual {v4, p0}, La/lge0;->a(La/zje;)Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v1

    .line 208
    if-ne v1, v0, :cond_b

    .line 209
    .line 210
    move-object v6, v0

    .line 211
    goto :goto_7

    .line 212
    :cond_b
    :goto_6
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 213
    .line 214
    :goto_7
    return-object v6

    .line 215
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.class public final La/x1f0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:B

.field public final synthetic k:Z

.field public final synthetic l:La/y1f0;

.field public final synthetic m:Ljava/lang/String;

.field public final synthetic n:La/d2f0;


# direct methods
.method public synthetic constructor <init>(ZLa/y1f0;Ljava/lang/String;La/d2f0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p6, p0, La/x1f0;->i:B

    iput-boolean p1, p0, La/x1f0;->k:Z

    iput-object p2, p0, La/x1f0;->l:La/y1f0;

    iput-object p3, p0, La/x1f0;->m:Ljava/lang/String;

    iput-object p4, p0, La/x1f0;->n:La/d2f0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 8

    .line 1
    iget-byte p1, p0, La/x1f0;->i:B

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, La/x1f0;

    .line 7
    .line 8
    iget-object v4, p0, La/x1f0;->n:La/d2f0;

    .line 9
    .line 10
    const/4 v6, 0x1

    .line 11
    iget-boolean v1, p0, La/x1f0;->k:Z

    .line 12
    .line 13
    iget-object v2, p0, La/x1f0;->l:La/y1f0;

    .line 14
    .line 15
    iget-object v3, p0, La/x1f0;->m:Ljava/lang/String;

    .line 16
    .line 17
    move-object v5, p2

    .line 18
    invoke-direct/range {v0 .. v6}, La/x1f0;-><init>(ZLa/y1f0;Ljava/lang/String;La/d2f0;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object v0

    .line 22
    :pswitch_0
    move-object v5, p2

    .line 23
    new-instance v1, La/x1f0;

    .line 24
    .line 25
    move-object v6, v5

    .line 26
    iget-object v5, p0, La/x1f0;->n:La/d2f0;

    .line 27
    .line 28
    const/4 v7, 0x0

    .line 29
    iget-boolean v2, p0, La/x1f0;->k:Z

    .line 30
    .line 31
    iget-object v3, p0, La/x1f0;->l:La/y1f0;

    .line 32
    .line 33
    iget-object v4, p0, La/x1f0;->m:Ljava/lang/String;

    .line 34
    .line 35
    invoke-direct/range {v1 .. v7}, La/x1f0;-><init>(ZLa/y1f0;Ljava/lang/String;La/d2f0;La/yje;B)V

    .line 36
    .line 37
    .line 38
    return-object v1

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/x1f0;->i:B

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
    invoke-virtual {p0, p1, p2}, La/x1f0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/x1f0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/x1f0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/x1f0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/x1f0;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/x1f0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 10

    .line 1
    iget-byte v0, p0, La/x1f0;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/x1f0;->l:La/y1f0;

    .line 4
    .line 5
    iget-boolean v2, p0, La/x1f0;->k:Z

    .line 6
    .line 7
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    const/4 v5, 0x2

    .line 11
    iget-object v6, p0, La/x1f0;->m:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v7, p0, La/x1f0;->n:La/d2f0;

    .line 14
    .line 15
    const/4 v8, 0x0

    .line 16
    packed-switch v0, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    sget-object v0, La/wne;->a:La/wne;

    .line 20
    .line 21
    iget-byte v9, p0, La/x1f0;->j:B

    .line 22
    .line 23
    if-eqz v9, :cond_2

    .line 24
    .line 25
    if-eq v9, v4, :cond_1

    .line 26
    .line 27
    if-ne v9, v5, :cond_0

    .line 28
    .line 29
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    goto :goto_2

    .line 33
    :cond_0
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    goto :goto_4

    .line 37
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    if-eqz v2, :cond_4

    .line 45
    .line 46
    iget-object p1, v1, La/y1f0;->a:La/jw20;

    .line 47
    .line 48
    iput-byte v4, p0, La/x1f0;->j:B

    .line 49
    .line 50
    iget-object p1, p1, La/jw20;->b:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p1, La/rta0;

    .line 53
    .line 54
    invoke-virtual {p1}, La/rta0;->invoke()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    check-cast p1, La/yte0;

    .line 59
    .line 60
    invoke-interface {p1, v6, v7, p0}, La/yte0;->c(Ljava/lang/String;La/d2f0;La/yje;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    if-ne p1, v0, :cond_3

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_3
    :goto_0
    check-cast p1, La/q16;

    .line 68
    .line 69
    goto :goto_3

    .line 70
    :cond_4
    iget-object p1, v1, La/y1f0;->a:La/jw20;

    .line 71
    .line 72
    iput-byte v5, p0, La/x1f0;->j:B

    .line 73
    .line 74
    iget-object p1, p1, La/jw20;->b:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast p1, La/rta0;

    .line 77
    .line 78
    invoke-virtual {p1}, La/rta0;->invoke()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    check-cast p1, La/yte0;

    .line 83
    .line 84
    invoke-interface {p1, v6, v7, p0}, La/yte0;->c(Ljava/lang/String;La/d2f0;La/yje;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    if-ne p1, v0, :cond_5

    .line 89
    .line 90
    :goto_1
    move-object v8, v0

    .line 91
    goto :goto_4

    .line 92
    :cond_5
    :goto_2
    check-cast p1, La/q16;

    .line 93
    .line 94
    :goto_3
    invoke-static {p1}, La/yyw;->G(La/q16;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    check-cast p0, La/fst0;

    .line 99
    .line 100
    iget-object p0, p0, La/fst0;->a:La/ort0;

    .line 101
    .line 102
    if-eqz p0, :cond_6

    .line 103
    .line 104
    invoke-static {p0}, La/xsm0;->x(La/ort0;)La/zqt0;

    .line 105
    .line 106
    .line 107
    move-result-object v8

    .line 108
    goto :goto_4

    .line 109
    :cond_6
    invoke-static {v8}, La/jf4;->k(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    :goto_4
    return-object v8

    .line 113
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 114
    .line 115
    iget-byte v9, p0, La/x1f0;->j:B

    .line 116
    .line 117
    if-eqz v9, :cond_9

    .line 118
    .line 119
    if-eq v9, v4, :cond_8

    .line 120
    .line 121
    if-ne v9, v5, :cond_7

    .line 122
    .line 123
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    goto :goto_7

    .line 127
    :cond_7
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    goto :goto_9

    .line 131
    :cond_8
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    goto :goto_5

    .line 135
    :cond_9
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    if-eqz v2, :cond_b

    .line 139
    .line 140
    iget-object p1, v1, La/y1f0;->a:La/jw20;

    .line 141
    .line 142
    iput-byte v4, p0, La/x1f0;->j:B

    .line 143
    .line 144
    iget-object p1, p1, La/jw20;->b:Ljava/lang/Object;

    .line 145
    .line 146
    check-cast p1, La/rta0;

    .line 147
    .line 148
    invoke-virtual {p1}, La/rta0;->invoke()Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    check-cast p1, La/yte0;

    .line 153
    .line 154
    invoke-interface {p1, v6, v7, p0}, La/yte0;->c(Ljava/lang/String;La/d2f0;La/yje;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    if-ne p1, v0, :cond_a

    .line 159
    .line 160
    goto :goto_6

    .line 161
    :cond_a
    :goto_5
    check-cast p1, La/q16;

    .line 162
    .line 163
    goto :goto_8

    .line 164
    :cond_b
    iget-object p1, v1, La/y1f0;->a:La/jw20;

    .line 165
    .line 166
    iput-byte v5, p0, La/x1f0;->j:B

    .line 167
    .line 168
    iget-object p1, p1, La/jw20;->b:Ljava/lang/Object;

    .line 169
    .line 170
    check-cast p1, La/rta0;

    .line 171
    .line 172
    invoke-virtual {p1}, La/rta0;->invoke()Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object p1

    .line 176
    check-cast p1, La/yte0;

    .line 177
    .line 178
    invoke-interface {p1, v6, v7, p0}, La/yte0;->a(Ljava/lang/String;La/d2f0;La/yje;)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object p1

    .line 182
    if-ne p1, v0, :cond_c

    .line 183
    .line 184
    :goto_6
    move-object v8, v0

    .line 185
    goto :goto_9

    .line 186
    :cond_c
    :goto_7
    check-cast p1, La/q16;

    .line 187
    .line 188
    :goto_8
    invoke-static {p1}, La/yyw;->G(La/q16;)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object p0

    .line 192
    check-cast p0, La/fst0;

    .line 193
    .line 194
    iget-object p0, p0, La/fst0;->a:La/ort0;

    .line 195
    .line 196
    if-eqz p0, :cond_d

    .line 197
    .line 198
    invoke-static {p0}, La/xsm0;->x(La/ort0;)La/zqt0;

    .line 199
    .line 200
    .line 201
    move-result-object v8

    .line 202
    goto :goto_9

    .line 203
    :cond_d
    invoke-static {v8}, La/jf4;->k(Ljava/lang/String;)V

    .line 204
    .line 205
    .line 206
    :goto_9
    return-object v8

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

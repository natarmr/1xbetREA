.class public final La/zxc0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/ayc0;


# direct methods
.method public synthetic constructor <init>(La/ayc0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/zxc0;->i:B

    iput-object p1, p0, La/zxc0;->k:La/ayc0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/zxc0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/zxc0;->k:La/ayc0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/zxc0;

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/zxc0;-><init>(La/ayc0;La/yje;B)V

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
    iput-boolean p0, v0, La/zxc0;->j:Z

    .line 21
    .line 22
    return-object v0

    .line 23
    :pswitch_0
    new-instance v0, La/zxc0;

    .line 24
    .line 25
    const/4 v1, 0x1

    .line 26
    invoke-direct {v0, p0, p2, v1}, La/zxc0;-><init>(La/ayc0;La/yje;B)V

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
    iput-boolean p0, v0, La/zxc0;->j:Z

    .line 36
    .line 37
    return-object v0

    .line 38
    :pswitch_1
    new-instance p1, La/zxc0;

    .line 39
    .line 40
    const/4 v0, 0x0

    .line 41
    invoke-direct {p1, p0, p2, v0}, La/zxc0;-><init>(La/ayc0;La/yje;B)V

    .line 42
    .line 43
    .line 44
    return-object p1

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/zxc0;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Boolean;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 9
    .line 10
    .line 11
    check-cast p2, La/yje;

    .line 12
    .line 13
    invoke-virtual {p0, p1, p2}, La/zxc0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, La/zxc0;

    .line 18
    .line 19
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 20
    .line 21
    invoke-virtual {p0, p1}, La/zxc0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0

    .line 26
    :pswitch_0
    check-cast p1, Ljava/lang/Boolean;

    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 29
    .line 30
    .line 31
    check-cast p2, La/yje;

    .line 32
    .line 33
    invoke-virtual {p0, p1, p2}, La/zxc0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    check-cast p0, La/zxc0;

    .line 38
    .line 39
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 40
    .line 41
    invoke-virtual {p0, p1}, La/zxc0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    return-object p0

    .line 46
    :pswitch_1
    check-cast p1, La/vne;

    .line 47
    .line 48
    check-cast p2, La/yje;

    .line 49
    .line 50
    invoke-virtual {p0, p1, p2}, La/zxc0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    check-cast p0, La/zxc0;

    .line 55
    .line 56
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 57
    .line 58
    invoke-virtual {p0, p1}, La/zxc0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    return-object p0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte v0, p0, La/zxc0;->i:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object v2, p0, La/zxc0;->k:La/ayc0;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    iget-boolean p0, p0, La/zxc0;->j:Z

    .line 10
    .line 11
    sget-object v0, La/wne;->a:La/wne;

    .line 12
    .line 13
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, v2, La/i3t0;->f:La/oyg0;

    .line 17
    .line 18
    iget-object p1, v2, La/i3t0;->i:La/ocj;

    .line 19
    .line 20
    if-eqz p0, :cond_1

    .line 21
    .line 22
    sget p0, La/ayc0;->O:I

    .line 23
    .line 24
    iget-object p0, p1, La/ocj;->a:La/p7m0;

    .line 25
    .line 26
    :cond_0
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    move-object v3, p1

    .line 34
    check-cast v3, La/qxc0;

    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    const/4 v7, 0x0

    .line 40
    const/16 v8, 0x19

    .line 41
    .line 42
    const/4 v4, 0x0

    .line 43
    const/4 v5, 0x1

    .line 44
    const/4 v6, 0x0

    .line 45
    invoke-static/range {v3 .. v8}, La/qxc0;->a(La/qxc0;ZZZZI)La/qxc0;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-virtual {p0, p1, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    if-eqz p1, :cond_0

    .line 54
    .line 55
    invoke-virtual {v2}, La/i3t0;->D()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    check-cast p0, La/qxc0;

    .line 60
    .line 61
    iget-boolean p0, p0, La/qxc0;->d:Z

    .line 62
    .line 63
    if-nez p0, :cond_3

    .line 64
    .line 65
    iget-object p0, v2, La/ayc0;->o:Ljava/lang/String;

    .line 66
    .line 67
    invoke-virtual {v2, p0}, La/ayc0;->Q(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_1
    sget p0, La/ayc0;->O:I

    .line 72
    .line 73
    iget-object v3, p1, La/ocj;->a:La/p7m0;

    .line 74
    .line 75
    :cond_2
    invoke-virtual {v3}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    move-object v4, p0

    .line 83
    check-cast v4, La/qxc0;

    .line 84
    .line 85
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    const/4 v8, 0x0

    .line 89
    const/16 v9, 0x18

    .line 90
    .line 91
    const/4 v5, 0x0

    .line 92
    const/4 v6, 0x0

    .line 93
    const/4 v7, 0x0

    .line 94
    invoke-static/range {v4 .. v9}, La/qxc0;->a(La/qxc0;ZZZZI)La/qxc0;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    invoke-virtual {v3, p0, p1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result p0

    .line 102
    if-eqz p0, :cond_2

    .line 103
    .line 104
    :cond_3
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 105
    .line 106
    return-object p0

    .line 107
    :pswitch_0
    iget-boolean v7, p0, La/zxc0;->j:Z

    .line 108
    .line 109
    sget-object p0, La/wne;->a:La/wne;

    .line 110
    .line 111
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v2}, La/i3t0;->D()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    check-cast p0, La/qxc0;

    .line 119
    .line 120
    iget-boolean p0, p0, La/qxc0;->e:Z

    .line 121
    .line 122
    if-eq p0, v7, :cond_4

    .line 123
    .line 124
    :goto_1
    move v0, v1

    .line 125
    goto :goto_2

    .line 126
    :cond_4
    const/4 v1, 0x0

    .line 127
    goto :goto_1

    .line 128
    :goto_2
    iget-object p0, v2, La/i3t0;->i:La/ocj;

    .line 129
    .line 130
    iget-object v9, p0, La/ocj;->a:La/p7m0;

    .line 131
    .line 132
    :cond_5
    invoke-virtual {v9}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    move-object v3, p0

    .line 140
    check-cast v3, La/qxc0;

    .line 141
    .line 142
    const/4 v6, 0x0

    .line 143
    const/16 v8, 0xf

    .line 144
    .line 145
    const/4 v4, 0x0

    .line 146
    const/4 v5, 0x0

    .line 147
    invoke-static/range {v3 .. v8}, La/qxc0;->a(La/qxc0;ZZZZI)La/qxc0;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    invoke-virtual {v9, p0, p1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    move-result p0

    .line 155
    if-eqz p0, :cond_5

    .line 156
    .line 157
    if-eqz v0, :cond_6

    .line 158
    .line 159
    iget-object p0, v2, La/ayc0;->o:Ljava/lang/String;

    .line 160
    .line 161
    invoke-virtual {v2, p0}, La/ayc0;->Q(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    :cond_6
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 165
    .line 166
    return-object p0

    .line 167
    :pswitch_1
    sget-object v0, La/wne;->a:La/wne;

    .line 168
    .line 169
    iget-boolean v3, p0, La/zxc0;->j:Z

    .line 170
    .line 171
    const/4 v4, 0x0

    .line 172
    if-eqz v3, :cond_8

    .line 173
    .line 174
    if-ne v3, v1, :cond_7

    .line 175
    .line 176
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    goto :goto_3

    .line 180
    :cond_7
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 181
    .line 182
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    move-object v0, v4

    .line 186
    goto :goto_4

    .line 187
    :cond_8
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 188
    .line 189
    .line 190
    iget-object p1, v2, La/ayc0;->p:La/hse0;

    .line 191
    .line 192
    iput-boolean v1, p0, La/zxc0;->j:Z

    .line 193
    .line 194
    const/4 v3, 0x5

    .line 195
    invoke-static {p1, v4, v1, p0, v3}, La/hse0;->a(La/hse0;Ljava/lang/String;ZLa/yje;I)Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object p0

    .line 199
    if-ne p0, v0, :cond_9

    .line 200
    .line 201
    goto :goto_4

    .line 202
    :cond_9
    :goto_3
    iget-object p0, v2, La/ayc0;->o:Ljava/lang/String;

    .line 203
    .line 204
    invoke-virtual {v2, p0}, La/ayc0;->Q(Ljava/lang/String;)V

    .line 205
    .line 206
    .line 207
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 208
    .line 209
    :goto_4
    return-object v0

    .line 210
    nop

    .line 211
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

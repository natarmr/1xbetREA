.class public final La/vge0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public final synthetic j:La/a9q0;

.field public final synthetic k:La/pz40;

.field public final synthetic l:La/cgk0;


# direct methods
.method public synthetic constructor <init>(La/a9q0;La/pz40;La/cgk0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p5, p0, La/vge0;->i:B

    iput-object p1, p0, La/vge0;->j:La/a9q0;

    iput-object p2, p0, La/vge0;->k:La/pz40;

    iput-object p3, p0, La/vge0;->l:La/cgk0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 7

    .line 1
    iget-byte p1, p0, La/vge0;->i:B

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, La/vge0;

    .line 7
    .line 8
    iget-object v3, p0, La/vge0;->l:La/cgk0;

    .line 9
    .line 10
    const/4 v5, 0x2

    .line 11
    iget-object v1, p0, La/vge0;->j:La/a9q0;

    .line 12
    .line 13
    iget-object v2, p0, La/vge0;->k:La/pz40;

    .line 14
    .line 15
    move-object v4, p2

    .line 16
    invoke-direct/range {v0 .. v5}, La/vge0;-><init>(La/a9q0;La/pz40;La/cgk0;La/yje;B)V

    .line 17
    .line 18
    .line 19
    return-object v0

    .line 20
    :pswitch_0
    move-object v5, p2

    .line 21
    new-instance v1, La/vge0;

    .line 22
    .line 23
    iget-object v4, p0, La/vge0;->l:La/cgk0;

    .line 24
    .line 25
    const/4 v6, 0x1

    .line 26
    iget-object v2, p0, La/vge0;->j:La/a9q0;

    .line 27
    .line 28
    iget-object v3, p0, La/vge0;->k:La/pz40;

    .line 29
    .line 30
    invoke-direct/range {v1 .. v6}, La/vge0;-><init>(La/a9q0;La/pz40;La/cgk0;La/yje;B)V

    .line 31
    .line 32
    .line 33
    return-object v1

    .line 34
    :pswitch_1
    move-object v5, p2

    .line 35
    new-instance v1, La/vge0;

    .line 36
    .line 37
    iget-object v4, p0, La/vge0;->l:La/cgk0;

    .line 38
    .line 39
    const/4 v6, 0x0

    .line 40
    iget-object v2, p0, La/vge0;->j:La/a9q0;

    .line 41
    .line 42
    iget-object v3, p0, La/vge0;->k:La/pz40;

    .line 43
    .line 44
    invoke-direct/range {v1 .. v6}, La/vge0;-><init>(La/a9q0;La/pz40;La/cgk0;La/yje;B)V

    .line 45
    .line 46
    .line 47
    return-object v1

    .line 48
    nop

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/vge0;->i:B

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
    invoke-virtual {p0, p1, p2}, La/vge0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/vge0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/vge0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/vge0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/vge0;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/vge0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, La/vge0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, La/vge0;

    .line 41
    .line 42
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, La/vge0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-byte v0, p0, La/vge0;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/vge0;->l:La/cgk0;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    iget-object v3, p0, La/vge0;->j:La/a9q0;

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    iget-object p0, p0, La/vge0;->k:La/pz40;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    sget-object v0, La/wne;->a:La/wne;

    .line 15
    .line 16
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    iget-object p1, v3, La/a9q0;->b:La/bw40;

    .line 20
    .line 21
    iget v0, p1, La/bw40;->f:I

    .line 22
    .line 23
    invoke-static {v4, v0}, La/l1e0;->o(II)Lkotlin/ranges/IntRange;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    instance-of v5, v0, Ljava/util/Collection;

    .line 28
    .line 29
    if-eqz v5, :cond_1

    .line 30
    .line 31
    move-object v5, v0

    .line 32
    check-cast v5, Ljava/util/Collection;

    .line 33
    .line 34
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    if-eqz v5, :cond_1

    .line 39
    .line 40
    :cond_0
    move v2, v4

    .line 41
    goto :goto_0

    .line 42
    :cond_1
    invoke-virtual {v0}, Lkotlin/ranges/a;->iterator()Ljava/util/Iterator;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    :cond_2
    move-object v5, v0

    .line 47
    check-cast v5, La/kkx;

    .line 48
    .line 49
    iget-boolean v5, v5, La/kkx;->c:Z

    .line 50
    .line 51
    if-eqz v5, :cond_0

    .line 52
    .line 53
    move-object v5, v0

    .line 54
    check-cast v5, La/bkx;

    .line 55
    .line 56
    invoke-virtual {v5}, La/bkx;->nextInt()I

    .line 57
    .line 58
    .line 59
    move-result v5

    .line 60
    invoke-virtual {v3, v5}, La/a9q0;->m(I)Z

    .line 61
    .line 62
    .line 63
    move-result v5

    .line 64
    if-eqz v5, :cond_2

    .line 65
    .line 66
    :goto_0
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-interface {p0, v0}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    iget p0, p1, La/bw40;->f:I

    .line 74
    .line 75
    invoke-virtual {v1, p0}, La/cgk0;->m(I)V

    .line 76
    .line 77
    .line 78
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 79
    .line 80
    return-object p0

    .line 81
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 82
    .line 83
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    iget-object p1, v3, La/a9q0;->b:La/bw40;

    .line 87
    .line 88
    iget v0, p1, La/bw40;->f:I

    .line 89
    .line 90
    invoke-static {v4, v0}, La/l1e0;->o(II)Lkotlin/ranges/IntRange;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    instance-of v5, v0, Ljava/util/Collection;

    .line 95
    .line 96
    if-eqz v5, :cond_4

    .line 97
    .line 98
    move-object v5, v0

    .line 99
    check-cast v5, Ljava/util/Collection;

    .line 100
    .line 101
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    .line 102
    .line 103
    .line 104
    move-result v5

    .line 105
    if-eqz v5, :cond_4

    .line 106
    .line 107
    :cond_3
    move v2, v4

    .line 108
    goto :goto_1

    .line 109
    :cond_4
    invoke-virtual {v0}, Lkotlin/ranges/a;->iterator()Ljava/util/Iterator;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    :cond_5
    move-object v5, v0

    .line 114
    check-cast v5, La/kkx;

    .line 115
    .line 116
    iget-boolean v5, v5, La/kkx;->c:Z

    .line 117
    .line 118
    if-eqz v5, :cond_3

    .line 119
    .line 120
    move-object v5, v0

    .line 121
    check-cast v5, La/bkx;

    .line 122
    .line 123
    invoke-virtual {v5}, La/bkx;->nextInt()I

    .line 124
    .line 125
    .line 126
    move-result v5

    .line 127
    invoke-virtual {v3, v5}, La/a9q0;->m(I)Z

    .line 128
    .line 129
    .line 130
    move-result v5

    .line 131
    if-eqz v5, :cond_5

    .line 132
    .line 133
    :goto_1
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    invoke-interface {p0, v0}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 138
    .line 139
    .line 140
    iget p0, p1, La/bw40;->f:I

    .line 141
    .line 142
    invoke-virtual {v1, p0}, La/cgk0;->m(I)V

    .line 143
    .line 144
    .line 145
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 146
    .line 147
    return-object p0

    .line 148
    :pswitch_1
    sget-object v0, La/wne;->a:La/wne;

    .line 149
    .line 150
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 151
    .line 152
    .line 153
    iget-object p1, v3, La/a9q0;->b:La/bw40;

    .line 154
    .line 155
    iget v0, p1, La/bw40;->f:I

    .line 156
    .line 157
    invoke-static {v4, v0}, La/l1e0;->o(II)Lkotlin/ranges/IntRange;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    instance-of v5, v0, Ljava/util/Collection;

    .line 162
    .line 163
    if-eqz v5, :cond_7

    .line 164
    .line 165
    move-object v5, v0

    .line 166
    check-cast v5, Ljava/util/Collection;

    .line 167
    .line 168
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    .line 169
    .line 170
    .line 171
    move-result v5

    .line 172
    if-eqz v5, :cond_7

    .line 173
    .line 174
    :cond_6
    move v2, v4

    .line 175
    goto :goto_2

    .line 176
    :cond_7
    invoke-virtual {v0}, Lkotlin/ranges/a;->iterator()Ljava/util/Iterator;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    :cond_8
    move-object v5, v0

    .line 181
    check-cast v5, La/kkx;

    .line 182
    .line 183
    iget-boolean v5, v5, La/kkx;->c:Z

    .line 184
    .line 185
    if-eqz v5, :cond_6

    .line 186
    .line 187
    move-object v5, v0

    .line 188
    check-cast v5, La/bkx;

    .line 189
    .line 190
    invoke-virtual {v5}, La/bkx;->nextInt()I

    .line 191
    .line 192
    .line 193
    move-result v5

    .line 194
    invoke-virtual {v3, v5}, La/a9q0;->m(I)Z

    .line 195
    .line 196
    .line 197
    move-result v5

    .line 198
    if-eqz v5, :cond_8

    .line 199
    .line 200
    :goto_2
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    invoke-interface {p0, v0}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 205
    .line 206
    .line 207
    iget p0, p1, La/bw40;->f:I

    .line 208
    .line 209
    invoke-virtual {v1, p0}, La/cgk0;->m(I)V

    .line 210
    .line 211
    .line 212
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 213
    .line 214
    return-object p0

    .line 215
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

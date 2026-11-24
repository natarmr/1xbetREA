.class public final La/rwd;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/twd;


# direct methods
.method public synthetic constructor <init>(La/twd;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/rwd;->i:B

    iput-object p1, p0, La/rwd;->k:La/twd;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/rwd;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/rwd;->k:La/twd;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/rwd;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/rwd;-><init>(La/twd;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/rwd;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/rwd;-><init>(La/twd;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/rwd;->i:B

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
    invoke-virtual {p0, p1, p2}, La/rwd;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/rwd;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/rwd;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/rwd;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/rwd;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/rwd;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 6

    .line 1
    iget-byte v0, p0, La/rwd;->i:B

    .line 2
    .line 3
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 4
    .line 5
    iget-object v2, p0, La/rwd;->k:La/twd;

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    const/4 v4, 0x0

    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    sget-object v0, La/wne;->a:La/wne;

    .line 13
    .line 14
    iget-boolean v5, p0, La/rwd;->j:Z

    .line 15
    .line 16
    if-eqz v5, :cond_1

    .line 17
    .line 18
    if-ne v5, v3, :cond_0

    .line 19
    .line 20
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    goto/16 :goto_4

    .line 28
    .line 29
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    iget-object p1, v2, La/twd;->F:La/f4u;

    .line 33
    .line 34
    iput-boolean v3, p0, La/rwd;->j:Z

    .line 35
    .line 36
    invoke-virtual {p1, p0}, La/f4u;->d(La/zje;)Ljava/io/Serializable;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    if-ne p1, v0, :cond_2

    .line 41
    .line 42
    move-object v4, v0

    .line 43
    goto/16 :goto_4

    .line 44
    .line 45
    :cond_2
    :goto_0
    check-cast p1, Ljava/util/List;

    .line 46
    .line 47
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    :cond_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-eqz v0, :cond_4

    .line 56
    .line 57
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    move-object v1, v0

    .line 62
    check-cast v1, La/muy;

    .line 63
    .line 64
    iget-object v1, v1, La/muy;->c:Ljava/lang/String;

    .line 65
    .line 66
    iget-object v3, v2, La/twd;->o:La/wgu;

    .line 67
    .line 68
    invoke-virtual {v3}, La/wgu;->a()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    if-eqz v1, :cond_3

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_4
    move-object v0, v4

    .line 80
    :goto_1
    check-cast v0, La/muy;

    .line 81
    .line 82
    if-eqz v0, :cond_5

    .line 83
    .line 84
    iget-object p0, v0, La/muy;->g:Ljava/lang/String;

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_5
    move-object p0, v4

    .line 88
    :goto_2
    const-string v0, ""

    .line 89
    .line 90
    if-nez p0, :cond_6

    .line 91
    .line 92
    move-object p0, v0

    .line 93
    :cond_6
    iget-object v1, v2, La/twd;->p:La/noc;

    .line 94
    .line 95
    iget-object v1, v1, La/noc;->a:La/vff0;

    .line 96
    .line 97
    iget-object v1, v1, La/vff0;->c:La/q7d0;

    .line 98
    .line 99
    const-string v3, "ISO_CODE_TO_CHANGE"

    .line 100
    .line 101
    invoke-virtual {v1}, La/q7d0;->a()Landroid/content/SharedPreferences;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    invoke-interface {v1, v3, v0}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    if-nez v1, :cond_7

    .line 110
    .line 111
    goto :goto_3

    .line 112
    :cond_7
    move-object v0, v1

    .line 113
    :goto_3
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    :cond_8
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 118
    .line 119
    .line 120
    move-result v1

    .line 121
    if-eqz v1, :cond_9

    .line 122
    .line 123
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    move-object v3, v1

    .line 128
    check-cast v3, La/muy;

    .line 129
    .line 130
    iget-object v3, v3, La/muy;->c:Ljava/lang/String;

    .line 131
    .line 132
    invoke-virtual {v3, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result v3

    .line 136
    if-eqz v3, :cond_8

    .line 137
    .line 138
    move-object v4, v1

    .line 139
    :cond_9
    check-cast v4, La/muy;

    .line 140
    .line 141
    new-instance p1, La/eod;

    .line 142
    .line 143
    const/4 v0, 0x4

    .line 144
    invoke-direct {p1, p0, v4, v0}, La/eod;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v2, p1}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 148
    .line 149
    .line 150
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 151
    .line 152
    :goto_4
    return-object v4

    .line 153
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 154
    .line 155
    iget-boolean v5, p0, La/rwd;->j:Z

    .line 156
    .line 157
    if-eqz v5, :cond_b

    .line 158
    .line 159
    if-ne v5, v3, :cond_a

    .line 160
    .line 161
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 162
    .line 163
    .line 164
    goto :goto_5

    .line 165
    :cond_a
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    goto :goto_6

    .line 169
    :cond_b
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 170
    .line 171
    .line 172
    iget-object p1, v2, La/twd;->w:La/zg;

    .line 173
    .line 174
    invoke-virtual {v2}, La/i3t0;->D()Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v1

    .line 178
    check-cast v1, La/gwd;

    .line 179
    .line 180
    iget-object v1, v1, La/gwd;->c:Ljava/lang/String;

    .line 181
    .line 182
    sget-object v4, La/hfc;->b:La/hfc;

    .line 183
    .line 184
    invoke-virtual {p1, v1, v4}, La/zg;->h(Ljava/lang/String;La/hfc;)V

    .line 185
    .line 186
    .line 187
    iget-object p1, v2, La/twd;->C:La/au0;

    .line 188
    .line 189
    invoke-virtual {v2}, La/i3t0;->D()Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v1

    .line 193
    check-cast v1, La/gwd;

    .line 194
    .line 195
    iget-object v1, v1, La/gwd;->c:Ljava/lang/String;

    .line 196
    .line 197
    const-string v4, "reload_now"

    .line 198
    .line 199
    invoke-virtual {p1, v1, v4}, La/au0;->o(Ljava/lang/String;Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    iput-boolean v3, p0, La/rwd;->j:Z

    .line 203
    .line 204
    invoke-virtual {v2, p0}, La/twd;->M(La/zje;)Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object p0

    .line 208
    if-ne p0, v0, :cond_c

    .line 209
    .line 210
    move-object v4, v0

    .line 211
    goto :goto_6

    .line 212
    :cond_c
    :goto_5
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 213
    .line 214
    :goto_6
    return-object v4

    .line 215
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

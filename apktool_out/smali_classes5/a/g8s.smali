.class public final La/g8s;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/g9s;


# direct methods
.method public synthetic constructor <init>(La/g9s;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/g8s;->i:B

    iput-object p1, p0, La/g8s;->k:La/g9s;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/g8s;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/g8s;->k:La/g9s;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/g8s;

    .line 9
    .line 10
    const/4 v0, 0x7

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/g8s;-><init>(La/g9s;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance v0, La/g8s;

    .line 16
    .line 17
    const/4 v1, 0x6

    .line 18
    invoke-direct {v0, p0, p2, v1}, La/g8s;-><init>(La/g9s;La/yje;B)V

    .line 19
    .line 20
    .line 21
    check-cast p1, Ljava/lang/Boolean;

    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    iput-boolean p0, v0, La/g8s;->j:Z

    .line 28
    .line 29
    return-object v0

    .line 30
    :pswitch_1
    new-instance p1, La/g8s;

    .line 31
    .line 32
    const/4 v0, 0x5

    .line 33
    invoke-direct {p1, p0, p2, v0}, La/g8s;-><init>(La/g9s;La/yje;B)V

    .line 34
    .line 35
    .line 36
    return-object p1

    .line 37
    :pswitch_2
    new-instance p1, La/g8s;

    .line 38
    .line 39
    const/4 v0, 0x4

    .line 40
    invoke-direct {p1, p0, p2, v0}, La/g8s;-><init>(La/g9s;La/yje;B)V

    .line 41
    .line 42
    .line 43
    return-object p1

    .line 44
    :pswitch_3
    new-instance v0, La/g8s;

    .line 45
    .line 46
    const/4 v1, 0x3

    .line 47
    invoke-direct {v0, p0, p2, v1}, La/g8s;-><init>(La/g9s;La/yje;B)V

    .line 48
    .line 49
    .line 50
    check-cast p1, Ljava/lang/Boolean;

    .line 51
    .line 52
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    iput-boolean p0, v0, La/g8s;->j:Z

    .line 57
    .line 58
    return-object v0

    .line 59
    :pswitch_4
    new-instance v0, La/g8s;

    .line 60
    .line 61
    const/4 v1, 0x2

    .line 62
    invoke-direct {v0, p0, p2, v1}, La/g8s;-><init>(La/g9s;La/yje;B)V

    .line 63
    .line 64
    .line 65
    check-cast p1, Ljava/lang/Boolean;

    .line 66
    .line 67
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 68
    .line 69
    .line 70
    move-result p0

    .line 71
    iput-boolean p0, v0, La/g8s;->j:Z

    .line 72
    .line 73
    return-object v0

    .line 74
    :pswitch_5
    new-instance v0, La/g8s;

    .line 75
    .line 76
    const/4 v1, 0x1

    .line 77
    invoke-direct {v0, p0, p2, v1}, La/g8s;-><init>(La/g9s;La/yje;B)V

    .line 78
    .line 79
    .line 80
    check-cast p1, Ljava/lang/Boolean;

    .line 81
    .line 82
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 83
    .line 84
    .line 85
    move-result p0

    .line 86
    iput-boolean p0, v0, La/g8s;->j:Z

    .line 87
    .line 88
    return-object v0

    .line 89
    :pswitch_6
    new-instance p1, La/g8s;

    .line 90
    .line 91
    const/4 v0, 0x0

    .line 92
    invoke-direct {p1, p0, p2, v0}, La/g8s;-><init>(La/g9s;La/yje;B)V

    .line 93
    .line 94
    .line 95
    return-object p1

    .line 96
    nop

    .line 97
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/g8s;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/vne;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/g8s;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/g8s;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/g8s;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, Ljava/lang/Boolean;

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 26
    .line 27
    .line 28
    check-cast p2, La/yje;

    .line 29
    .line 30
    invoke-virtual {p0, p1, p2}, La/g8s;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, La/g8s;

    .line 35
    .line 36
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    invoke-virtual {p0, p1}, La/g8s;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0

    .line 43
    :pswitch_1
    check-cast p1, La/vne;

    .line 44
    .line 45
    check-cast p2, La/yje;

    .line 46
    .line 47
    invoke-virtual {p0, p1, p2}, La/g8s;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    check-cast p0, La/g8s;

    .line 52
    .line 53
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    invoke-virtual {p0, p1}, La/g8s;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0

    .line 60
    :pswitch_2
    check-cast p1, La/vne;

    .line 61
    .line 62
    check-cast p2, La/yje;

    .line 63
    .line 64
    invoke-virtual {p0, p1, p2}, La/g8s;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    check-cast p0, La/g8s;

    .line 69
    .line 70
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 71
    .line 72
    invoke-virtual {p0, p1}, La/g8s;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    return-object p0

    .line 77
    :pswitch_3
    check-cast p1, Ljava/lang/Boolean;

    .line 78
    .line 79
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 80
    .line 81
    .line 82
    check-cast p2, La/yje;

    .line 83
    .line 84
    invoke-virtual {p0, p1, p2}, La/g8s;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    check-cast p0, La/g8s;

    .line 89
    .line 90
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 91
    .line 92
    invoke-virtual {p0, p1}, La/g8s;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    return-object p0

    .line 97
    :pswitch_4
    check-cast p1, Ljava/lang/Boolean;

    .line 98
    .line 99
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 100
    .line 101
    .line 102
    check-cast p2, La/yje;

    .line 103
    .line 104
    invoke-virtual {p0, p1, p2}, La/g8s;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    check-cast p0, La/g8s;

    .line 109
    .line 110
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 111
    .line 112
    invoke-virtual {p0, p1}, La/g8s;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    return-object p0

    .line 117
    :pswitch_5
    check-cast p1, Ljava/lang/Boolean;

    .line 118
    .line 119
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 120
    .line 121
    .line 122
    check-cast p2, La/yje;

    .line 123
    .line 124
    invoke-virtual {p0, p1, p2}, La/g8s;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    check-cast p0, La/g8s;

    .line 129
    .line 130
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 131
    .line 132
    invoke-virtual {p0, p1}, La/g8s;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    return-object p0

    .line 137
    :pswitch_6
    check-cast p1, La/vne;

    .line 138
    .line 139
    check-cast p2, La/yje;

    .line 140
    .line 141
    invoke-virtual {p0, p1, p2}, La/g8s;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 142
    .line 143
    .line 144
    move-result-object p0

    .line 145
    check-cast p0, La/g8s;

    .line 146
    .line 147
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 148
    .line 149
    invoke-virtual {p0, p1}, La/g8s;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object p0

    .line 153
    return-object p0

    .line 154
    nop

    .line 155
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget-byte v0, p0, La/g8s;->i:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    const/4 v4, 0x1

    .line 8
    iget-object v5, p0, La/g8s;->k:La/g9s;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    sget-object v0, La/wne;->a:La/wne;

    .line 14
    .line 15
    iget-boolean v6, p0, La/g8s;->j:Z

    .line 16
    .line 17
    if-eqz v6, :cond_1

    .line 18
    .line 19
    if-ne v6, v4, :cond_0

    .line 20
    .line 21
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    iget-object p1, v5, La/g9s;->z:La/vpu;

    .line 33
    .line 34
    iput-boolean v4, p0, La/g8s;->j:Z

    .line 35
    .line 36
    invoke-virtual {p1, v1, p0}, La/vpu;->b(ZLa/yje;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    if-ne p0, v0, :cond_2

    .line 41
    .line 42
    move-object v3, v0

    .line 43
    goto :goto_1

    .line 44
    :cond_2
    :goto_0
    sget-object p0, La/o7s;->b:La/o7s;

    .line 45
    .line 46
    sget p1, La/g9s;->n0:I

    .line 47
    .line 48
    invoke-virtual {v5, p0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 52
    .line 53
    :goto_1
    return-object v3

    .line 54
    :pswitch_0
    iget-boolean p0, p0, La/g8s;->j:Z

    .line 55
    .line 56
    sget-object v0, La/wne;->a:La/wne;

    .line 57
    .line 58
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    new-instance p1, La/obg;

    .line 62
    .line 63
    const/16 v0, 0xb

    .line 64
    .line 65
    invoke-direct {p1, v0, p0}, La/obg;-><init>(BZ)V

    .line 66
    .line 67
    .line 68
    sget v0, La/g9s;->n0:I

    .line 69
    .line 70
    invoke-virtual {v5, p1}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 71
    .line 72
    .line 73
    if-eqz p0, :cond_3

    .line 74
    .line 75
    invoke-virtual {v5}, La/i3t0;->D()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    check-cast p0, La/r7s;

    .line 80
    .line 81
    iget-object p0, p0, La/r7s;->k:La/py20;

    .line 82
    .line 83
    sget-object p1, La/py20;->a:La/py20;

    .line 84
    .line 85
    if-ne p0, p1, :cond_3

    .line 86
    .line 87
    sget-object p0, La/py20;->b:La/py20;

    .line 88
    .line 89
    new-instance p1, La/gup;

    .line 90
    .line 91
    const/16 v0, 0x1a

    .line 92
    .line 93
    invoke-direct {p1, p0, v5, v0}, La/gup;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v5, p1}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 97
    .line 98
    .line 99
    :cond_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 100
    .line 101
    return-object p0

    .line 102
    :pswitch_1
    sget-object v0, La/wne;->a:La/wne;

    .line 103
    .line 104
    iget-boolean v1, p0, La/g8s;->j:Z

    .line 105
    .line 106
    if-eqz v1, :cond_5

    .line 107
    .line 108
    if-ne v1, v4, :cond_4

    .line 109
    .line 110
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    goto :goto_2

    .line 114
    :cond_4
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    goto :goto_3

    .line 118
    :cond_5
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    iget-object p1, v5, La/g9s;->A:La/vpu;

    .line 122
    .line 123
    invoke-virtual {p1}, La/vpu;->a()La/fnq;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    new-instance v1, La/x8s;

    .line 128
    .line 129
    const/4 v2, 0x2

    .line 130
    invoke-direct {v1, v5, v2}, La/x8s;-><init>(La/g9s;B)V

    .line 131
    .line 132
    .line 133
    iput-boolean v4, p0, La/g8s;->j:Z

    .line 134
    .line 135
    invoke-virtual {p1, v1, p0}, La/fnq;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    if-ne p0, v0, :cond_6

    .line 140
    .line 141
    move-object v3, v0

    .line 142
    goto :goto_3

    .line 143
    :cond_6
    :goto_2
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 144
    .line 145
    :goto_3
    return-object v3

    .line 146
    :pswitch_2
    sget-object v0, La/wne;->a:La/wne;

    .line 147
    .line 148
    iget-boolean v1, p0, La/g8s;->j:Z

    .line 149
    .line 150
    if-eqz v1, :cond_8

    .line 151
    .line 152
    if-ne v1, v4, :cond_7

    .line 153
    .line 154
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    goto :goto_4

    .line 158
    :cond_7
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    goto :goto_5

    .line 162
    :cond_8
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 163
    .line 164
    .line 165
    iget-object p1, v5, La/g9s;->w:La/hnu;

    .line 166
    .line 167
    iget-object p1, p1, La/hnu;->a:Ljava/lang/Object;

    .line 168
    .line 169
    check-cast p1, La/n9s;

    .line 170
    .line 171
    invoke-virtual {p1}, La/n9s;->a()La/i89;

    .line 172
    .line 173
    .line 174
    move-result-object p1

    .line 175
    new-instance v1, La/fc4;

    .line 176
    .line 177
    const/16 v2, 0x1c

    .line 178
    .line 179
    invoke-direct {v1, p1, v2}, La/fc4;-><init>(La/i89;B)V

    .line 180
    .line 181
    .line 182
    new-instance p1, La/x8s;

    .line 183
    .line 184
    invoke-direct {p1, v5, v4}, La/x8s;-><init>(La/g9s;B)V

    .line 185
    .line 186
    .line 187
    iput-boolean v4, p0, La/g8s;->j:Z

    .line 188
    .line 189
    invoke-virtual {v1, p1, p0}, La/fc4;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object p0

    .line 193
    if-ne p0, v0, :cond_9

    .line 194
    .line 195
    move-object v3, v0

    .line 196
    goto :goto_5

    .line 197
    :cond_9
    :goto_4
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 198
    .line 199
    :goto_5
    return-object v3

    .line 200
    :pswitch_3
    iget-boolean v0, p0, La/g8s;->j:Z

    .line 201
    .line 202
    sget-object v2, La/wne;->a:La/wne;

    .line 203
    .line 204
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 205
    .line 206
    .line 207
    iget-object v5, p0, La/g8s;->k:La/g9s;

    .line 208
    .line 209
    if-eqz v0, :cond_e

    .line 210
    .line 211
    sget p0, La/g9s;->n0:I

    .line 212
    .line 213
    invoke-virtual {v5}, La/i3t0;->D()Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object p0

    .line 217
    check-cast p0, La/r7s;

    .line 218
    .line 219
    iget-wide v7, p0, La/r7s;->a:J

    .line 220
    .line 221
    iget-wide v10, p0, La/r7s;->e:J

    .line 222
    .line 223
    iget-object v9, p0, La/r7s;->h:La/t3z;

    .line 224
    .line 225
    new-instance v6, La/u3z;

    .line 226
    .line 227
    invoke-direct/range {v6 .. v11}, La/u3z;-><init>(JLa/t3z;J)V

    .line 228
    .line 229
    .line 230
    invoke-virtual {v5}, La/i3t0;->D()Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object p0

    .line 234
    check-cast p0, La/r7s;

    .line 235
    .line 236
    iget-wide p0, p0, La/r7s;->f:J

    .line 237
    .line 238
    cmp-long p0, v7, p0

    .line 239
    .line 240
    if-nez p0, :cond_a

    .line 241
    .line 242
    invoke-virtual {v5}, La/i3t0;->D()Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object p0

    .line 246
    check-cast p0, La/r7s;

    .line 247
    .line 248
    iget-object p0, p0, La/r7s;->R:Ljava/lang/Long;

    .line 249
    .line 250
    invoke-virtual {v5, v6, p0}, La/g9s;->O(La/u3z;Ljava/lang/Long;)V

    .line 251
    .line 252
    .line 253
    goto :goto_7

    .line 254
    :cond_a
    invoke-virtual {v5}, La/i3t0;->D()Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object p0

    .line 258
    check-cast p0, La/r7s;

    .line 259
    .line 260
    iget-wide p0, p0, La/r7s;->f:J

    .line 261
    .line 262
    const-wide/16 v12, 0x0

    .line 263
    .line 264
    cmp-long p0, p0, v12

    .line 265
    .line 266
    if-nez p0, :cond_b

    .line 267
    .line 268
    invoke-virtual {v5}, La/i3t0;->D()Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object p0

    .line 272
    check-cast p0, La/r7s;

    .line 273
    .line 274
    iget-object p0, p0, La/r7s;->R:Ljava/lang/Long;

    .line 275
    .line 276
    invoke-virtual {v5, v6, p0}, La/g9s;->O(La/u3z;Ljava/lang/Long;)V

    .line 277
    .line 278
    .line 279
    goto :goto_7

    .line 280
    :cond_b
    invoke-virtual {v5}, La/i3t0;->D()Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object p0

    .line 284
    check-cast p0, La/r7s;

    .line 285
    .line 286
    iget-wide p0, p0, La/r7s;->f:J

    .line 287
    .line 288
    const-wide/16 v12, -0x2ea

    .line 289
    .line 290
    cmp-long p0, p0, v12

    .line 291
    .line 292
    if-nez p0, :cond_c

    .line 293
    .line 294
    invoke-virtual {v5, v10, v11, v7, v8}, La/g9s;->P(JJ)V

    .line 295
    .line 296
    .line 297
    invoke-virtual {v5, v6, v3}, La/g9s;->O(La/u3z;Ljava/lang/Long;)V

    .line 298
    .line 299
    .line 300
    goto :goto_7

    .line 301
    :cond_c
    invoke-virtual {v5}, La/i3t0;->D()Ljava/lang/Object;

    .line 302
    .line 303
    .line 304
    move-result-object p0

    .line 305
    check-cast p0, La/r7s;

    .line 306
    .line 307
    iget-wide p0, p0, La/r7s;->f:J

    .line 308
    .line 309
    sget-object v0, La/t3z;->c:La/t3z;

    .line 310
    .line 311
    if-ne v9, v0, :cond_d

    .line 312
    .line 313
    move v12, v4

    .line 314
    goto :goto_6

    .line 315
    :cond_d
    move v12, v1

    .line 316
    :goto_6
    invoke-virtual {v5}, La/g9s;->M()La/sff0;

    .line 317
    .line 318
    .line 319
    move-result-object v0

    .line 320
    iget-boolean v13, v0, La/sff0;->D0:Z

    .line 321
    .line 322
    move-wide v8, v7

    .line 323
    move-wide v6, p0

    .line 324
    invoke-virtual/range {v5 .. v13}, La/g9s;->Q(JJJZZ)V

    .line 325
    .line 326
    .line 327
    :goto_7
    sget-object p0, La/t8s;->a:La/t8s;

    .line 328
    .line 329
    new-instance p1, La/p8s;

    .line 330
    .line 331
    const/4 v0, 0x3

    .line 332
    invoke-direct {p1, v5, v3, v0}, La/p8s;-><init>(La/g9s;La/yje;B)V

    .line 333
    .line 334
    .line 335
    invoke-static {v5, v3, p0, p1, v4}, La/i3t0;->K(La/i3t0;La/lne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)La/bby;

    .line 336
    .line 337
    .line 338
    move-result-object p0

    .line 339
    iput-object p0, v5, La/g9s;->k0:La/bby;

    .line 340
    .line 341
    goto :goto_8

    .line 342
    :cond_e
    sget p0, La/g9s;->n0:I

    .line 343
    .line 344
    iget-object p0, v5, La/g9s;->i0:La/c4m0;

    .line 345
    .line 346
    if-eqz p0, :cond_f

    .line 347
    .line 348
    invoke-virtual {p0, v3}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 349
    .line 350
    .line 351
    :cond_f
    iget-object p0, v5, La/g9s;->k0:La/bby;

    .line 352
    .line 353
    if-eqz p0, :cond_10

    .line 354
    .line 355
    invoke-interface {p0, v3}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 356
    .line 357
    .line 358
    :cond_10
    iget-object p0, v5, La/g9s;->m0:La/bby;

    .line 359
    .line 360
    if-eqz p0, :cond_11

    .line 361
    .line 362
    invoke-interface {p0, v3}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 363
    .line 364
    .line 365
    :cond_11
    :goto_8
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 366
    .line 367
    return-object p0

    .line 368
    :pswitch_4
    iget-boolean p0, p0, La/g8s;->j:Z

    .line 369
    .line 370
    sget-object v0, La/wne;->a:La/wne;

    .line 371
    .line 372
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 373
    .line 374
    .line 375
    new-instance p1, La/obg;

    .line 376
    .line 377
    const/16 v0, 0x9

    .line 378
    .line 379
    invoke-direct {p1, v0, p0}, La/obg;-><init>(BZ)V

    .line 380
    .line 381
    .line 382
    sget p0, La/g9s;->n0:I

    .line 383
    .line 384
    invoke-virtual {v5, p1}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 385
    .line 386
    .line 387
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 388
    .line 389
    return-object p0

    .line 390
    :pswitch_5
    iget-boolean p0, p0, La/g8s;->j:Z

    .line 391
    .line 392
    sget-object v0, La/wne;->a:La/wne;

    .line 393
    .line 394
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 395
    .line 396
    .line 397
    new-instance p1, La/obg;

    .line 398
    .line 399
    const/16 v0, 0x8

    .line 400
    .line 401
    invoke-direct {p1, v0, p0}, La/obg;-><init>(BZ)V

    .line 402
    .line 403
    .line 404
    sget p0, La/g9s;->n0:I

    .line 405
    .line 406
    invoke-virtual {v5, p1}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 407
    .line 408
    .line 409
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 410
    .line 411
    return-object p0

    .line 412
    :pswitch_6
    sget-object v0, La/wne;->a:La/wne;

    .line 413
    .line 414
    iget-boolean v1, p0, La/g8s;->j:Z

    .line 415
    .line 416
    if-eqz v1, :cond_13

    .line 417
    .line 418
    if-ne v1, v4, :cond_12

    .line 419
    .line 420
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 421
    .line 422
    .line 423
    goto :goto_9

    .line 424
    :cond_12
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 425
    .line 426
    .line 427
    goto :goto_b

    .line 428
    :cond_13
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 429
    .line 430
    .line 431
    iget-object p1, v5, La/g9s;->T:La/jru;

    .line 432
    .line 433
    invoke-virtual {v5}, La/i3t0;->D()Ljava/lang/Object;

    .line 434
    .line 435
    .line 436
    move-result-object v1

    .line 437
    check-cast v1, La/r7s;

    .line 438
    .line 439
    iget-wide v1, v1, La/r7s;->e:J

    .line 440
    .line 441
    iput-boolean v4, p0, La/g8s;->j:Z

    .line 442
    .line 443
    invoke-virtual {p1, v1, v2, p0}, La/jru;->e(JLa/zje;)Ljava/lang/Object;

    .line 444
    .line 445
    .line 446
    move-result-object p1

    .line 447
    if-ne p1, v0, :cond_14

    .line 448
    .line 449
    move-object v3, v0

    .line 450
    goto :goto_b

    .line 451
    :cond_14
    :goto_9
    check-cast p1, Ljava/lang/CharSequence;

    .line 452
    .line 453
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 454
    .line 455
    .line 456
    move-result p0

    .line 457
    if-nez p0, :cond_15

    .line 458
    .line 459
    goto :goto_a

    .line 460
    :cond_15
    move-object v3, p1

    .line 461
    :goto_a
    check-cast v3, Ljava/lang/String;

    .line 462
    .line 463
    new-instance p0, La/hxk;

    .line 464
    .line 465
    const/16 p1, 0xf

    .line 466
    .line 467
    invoke-direct {p0, v3, p1}, La/hxk;-><init>(Ljava/lang/String;B)V

    .line 468
    .line 469
    .line 470
    sget p1, La/g9s;->n0:I

    .line 471
    .line 472
    invoke-virtual {v5, p0}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 473
    .line 474
    .line 475
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 476
    .line 477
    :goto_b
    return-object v3

    .line 478
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

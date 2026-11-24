.class public final La/ptz;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/xk80;

.field public final synthetic l:La/l7m0;

.field public final synthetic m:Lkotlin/jvm/functions/Function1;


# direct methods
.method public constructor <init>(La/l7m0;La/xk80;Lkotlin/jvm/functions/Function1;La/yje;)V
    .locals 1

    .line 1
    const/4 v0, 0x6

    .line 2
    iput-byte v0, p0, La/ptz;->i:B

    .line 3
    .line 4
    iput-object p1, p0, La/ptz;->l:La/l7m0;

    .line 5
    .line 6
    iput-object p2, p0, La/ptz;->k:La/xk80;

    .line 7
    .line 8
    iput-object p3, p0, La/ptz;->m:Lkotlin/jvm/functions/Function1;

    .line 9
    .line 10
    const/4 p1, 0x2

    .line 11
    invoke-direct {p0, p1, p4}, La/bnn0;-><init>(ILa/yje;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public synthetic constructor <init>(La/xk80;La/l7m0;Lkotlin/jvm/functions/Function1;La/yje;B)V
    .locals 0

    .line 15
    iput-byte p5, p0, La/ptz;->i:B

    iput-object p1, p0, La/ptz;->k:La/xk80;

    iput-object p2, p0, La/ptz;->l:La/l7m0;

    iput-object p3, p0, La/ptz;->m:Lkotlin/jvm/functions/Function1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 9

    .line 1
    iget-byte p1, p0, La/ptz;->i:B

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p1, La/ptz;

    .line 7
    .line 8
    iget-object v0, p0, La/ptz;->k:La/xk80;

    .line 9
    .line 10
    iget-object v1, p0, La/ptz;->m:Lkotlin/jvm/functions/Function1;

    .line 11
    .line 12
    iget-object p0, p0, La/ptz;->l:La/l7m0;

    .line 13
    .line 14
    invoke-direct {p1, p0, v0, v1, p2}, La/ptz;-><init>(La/l7m0;La/xk80;Lkotlin/jvm/functions/Function1;La/yje;)V

    .line 15
    .line 16
    .line 17
    return-object p1

    .line 18
    :pswitch_0
    new-instance v2, La/ptz;

    .line 19
    .line 20
    iget-object v5, p0, La/ptz;->m:Lkotlin/jvm/functions/Function1;

    .line 21
    .line 22
    const/4 v7, 0x5

    .line 23
    iget-object v3, p0, La/ptz;->k:La/xk80;

    .line 24
    .line 25
    iget-object v4, p0, La/ptz;->l:La/l7m0;

    .line 26
    .line 27
    move-object v6, p2

    .line 28
    invoke-direct/range {v2 .. v7}, La/ptz;-><init>(La/xk80;La/l7m0;Lkotlin/jvm/functions/Function1;La/yje;B)V

    .line 29
    .line 30
    .line 31
    return-object v2

    .line 32
    :pswitch_1
    move-object v7, p2

    .line 33
    new-instance v3, La/ptz;

    .line 34
    .line 35
    iget-object v6, p0, La/ptz;->m:Lkotlin/jvm/functions/Function1;

    .line 36
    .line 37
    const/4 v8, 0x4

    .line 38
    iget-object v4, p0, La/ptz;->k:La/xk80;

    .line 39
    .line 40
    iget-object v5, p0, La/ptz;->l:La/l7m0;

    .line 41
    .line 42
    invoke-direct/range {v3 .. v8}, La/ptz;-><init>(La/xk80;La/l7m0;Lkotlin/jvm/functions/Function1;La/yje;B)V

    .line 43
    .line 44
    .line 45
    return-object v3

    .line 46
    :pswitch_2
    move-object v7, p2

    .line 47
    new-instance v3, La/ptz;

    .line 48
    .line 49
    iget-object v6, p0, La/ptz;->m:Lkotlin/jvm/functions/Function1;

    .line 50
    .line 51
    const/4 v8, 0x3

    .line 52
    iget-object v4, p0, La/ptz;->k:La/xk80;

    .line 53
    .line 54
    iget-object v5, p0, La/ptz;->l:La/l7m0;

    .line 55
    .line 56
    invoke-direct/range {v3 .. v8}, La/ptz;-><init>(La/xk80;La/l7m0;Lkotlin/jvm/functions/Function1;La/yje;B)V

    .line 57
    .line 58
    .line 59
    return-object v3

    .line 60
    :pswitch_3
    move-object v7, p2

    .line 61
    new-instance v3, La/ptz;

    .line 62
    .line 63
    iget-object v6, p0, La/ptz;->m:Lkotlin/jvm/functions/Function1;

    .line 64
    .line 65
    const/4 v8, 0x2

    .line 66
    iget-object v4, p0, La/ptz;->k:La/xk80;

    .line 67
    .line 68
    iget-object v5, p0, La/ptz;->l:La/l7m0;

    .line 69
    .line 70
    invoke-direct/range {v3 .. v8}, La/ptz;-><init>(La/xk80;La/l7m0;Lkotlin/jvm/functions/Function1;La/yje;B)V

    .line 71
    .line 72
    .line 73
    return-object v3

    .line 74
    :pswitch_4
    move-object v7, p2

    .line 75
    new-instance v3, La/ptz;

    .line 76
    .line 77
    iget-object v6, p0, La/ptz;->m:Lkotlin/jvm/functions/Function1;

    .line 78
    .line 79
    const/4 v8, 0x1

    .line 80
    iget-object v4, p0, La/ptz;->k:La/xk80;

    .line 81
    .line 82
    iget-object v5, p0, La/ptz;->l:La/l7m0;

    .line 83
    .line 84
    invoke-direct/range {v3 .. v8}, La/ptz;-><init>(La/xk80;La/l7m0;Lkotlin/jvm/functions/Function1;La/yje;B)V

    .line 85
    .line 86
    .line 87
    return-object v3

    .line 88
    :pswitch_5
    move-object v7, p2

    .line 89
    new-instance v3, La/ptz;

    .line 90
    .line 91
    iget-object v6, p0, La/ptz;->m:Lkotlin/jvm/functions/Function1;

    .line 92
    .line 93
    const/4 v8, 0x0

    .line 94
    iget-object v4, p0, La/ptz;->k:La/xk80;

    .line 95
    .line 96
    iget-object v5, p0, La/ptz;->l:La/l7m0;

    .line 97
    .line 98
    invoke-direct/range {v3 .. v8}, La/ptz;-><init>(La/xk80;La/l7m0;Lkotlin/jvm/functions/Function1;La/yje;B)V

    .line 99
    .line 100
    .line 101
    return-object v3

    .line 102
    nop

    .line 103
    :pswitch_data_0
    .packed-switch 0x0
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
    iget-byte v0, p0, La/ptz;->i:B

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
    invoke-virtual {p0, p1, p2}, La/ptz;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/ptz;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/ptz;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/ptz;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/ptz;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/ptz;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, La/ptz;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, La/ptz;

    .line 41
    .line 42
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, La/ptz;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0

    .line 49
    :pswitch_2
    invoke-virtual {p0, p1, p2}, La/ptz;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    check-cast p0, La/ptz;

    .line 54
    .line 55
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 56
    .line 57
    invoke-virtual {p0, p1}, La/ptz;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    return-object p0

    .line 62
    :pswitch_3
    invoke-virtual {p0, p1, p2}, La/ptz;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    check-cast p0, La/ptz;

    .line 67
    .line 68
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 69
    .line 70
    invoke-virtual {p0, p1}, La/ptz;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    return-object p0

    .line 75
    :pswitch_4
    invoke-virtual {p0, p1, p2}, La/ptz;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    check-cast p0, La/ptz;

    .line 80
    .line 81
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 82
    .line 83
    invoke-virtual {p0, p1}, La/ptz;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    return-object p0

    .line 88
    :pswitch_5
    invoke-virtual {p0, p1, p2}, La/ptz;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    check-cast p0, La/ptz;

    .line 93
    .line 94
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 95
    .line 96
    invoke-virtual {p0, p1}, La/ptz;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    return-object p0

    .line 101
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/ptz;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/ptz;->m:Lkotlin/jvm/functions/Function1;

    .line 4
    .line 5
    iget-object v2, p0, La/ptz;->k:La/xk80;

    .line 6
    .line 7
    iget-object v3, p0, La/ptz;->l:La/l7m0;

    .line 8
    .line 9
    const-string v4, "call to \'resume\' before \'invoke\' with coroutine"

    .line 10
    .line 11
    const/4 v5, 0x1

    .line 12
    const/4 v6, 0x0

    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    sget-object v0, La/wne;->a:La/wne;

    .line 17
    .line 18
    iget-boolean v7, p0, La/ptz;->j:Z

    .line 19
    .line 20
    if-eqz v7, :cond_1

    .line 21
    .line 22
    if-ne v7, v5, :cond_0

    .line 23
    .line 24
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

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
    new-instance p1, La/x000;

    .line 36
    .line 37
    const/16 v4, 0x15

    .line 38
    .line 39
    invoke-direct {p1, v3, v4}, La/x000;-><init>(La/l7m0;B)V

    .line 40
    .line 41
    .line 42
    invoke-static {v6, p1}, La/ydx;->V(La/ufk0;Lkotlin/jvm/functions/Function0;)La/vsg0;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-static {p1}, La/i120;->W(La/gmq;)La/gmq;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    new-instance v3, La/clu;

    .line 51
    .line 52
    const/16 v4, 0x16

    .line 53
    .line 54
    invoke-direct {v3, v2, v1, v4}, La/clu;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 55
    .line 56
    .line 57
    iput-boolean v5, p0, La/ptz;->j:Z

    .line 58
    .line 59
    invoke-interface {p1, v3, p0}, La/gmq;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    if-ne p0, v0, :cond_2

    .line 64
    .line 65
    move-object v6, v0

    .line 66
    goto :goto_1

    .line 67
    :cond_2
    :goto_0
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 68
    .line 69
    :goto_1
    return-object v6

    .line 70
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 71
    .line 72
    iget-boolean v7, p0, La/ptz;->j:Z

    .line 73
    .line 74
    if-eqz v7, :cond_4

    .line 75
    .line 76
    if-ne v7, v5, :cond_3

    .line 77
    .line 78
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_3
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    goto :goto_3

    .line 86
    :cond_4
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    new-instance p1, La/s39;

    .line 90
    .line 91
    const/16 v4, 0x12

    .line 92
    .line 93
    invoke-direct {p1, v2, v4}, La/s39;-><init>(La/xk80;B)V

    .line 94
    .line 95
    .line 96
    invoke-static {v6, p1}, La/ydx;->V(La/ufk0;Lkotlin/jvm/functions/Function0;)La/vsg0;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    invoke-static {p1}, La/i120;->W(La/gmq;)La/gmq;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    new-instance v2, La/dn2;

    .line 105
    .line 106
    const/4 v4, 0x6

    .line 107
    invoke-direct {v2, v3, v1, v4}, La/dn2;-><init>(La/l7m0;Lkotlin/jvm/functions/Function1;B)V

    .line 108
    .line 109
    .line 110
    iput-boolean v5, p0, La/ptz;->j:Z

    .line 111
    .line 112
    invoke-interface {p1, v2, p0}, La/gmq;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    if-ne p0, v0, :cond_5

    .line 117
    .line 118
    move-object v6, v0

    .line 119
    goto :goto_3

    .line 120
    :cond_5
    :goto_2
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 121
    .line 122
    :goto_3
    return-object v6

    .line 123
    :pswitch_1
    sget-object v0, La/wne;->a:La/wne;

    .line 124
    .line 125
    iget-boolean v7, p0, La/ptz;->j:Z

    .line 126
    .line 127
    if-eqz v7, :cond_7

    .line 128
    .line 129
    if-ne v7, v5, :cond_6

    .line 130
    .line 131
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    goto :goto_4

    .line 135
    :cond_6
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    goto :goto_5

    .line 139
    :cond_7
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    new-instance p1, La/s39;

    .line 143
    .line 144
    const/16 v4, 0x11

    .line 145
    .line 146
    invoke-direct {p1, v2, v4}, La/s39;-><init>(La/xk80;B)V

    .line 147
    .line 148
    .line 149
    invoke-static {v6, p1}, La/ydx;->V(La/ufk0;Lkotlin/jvm/functions/Function0;)La/vsg0;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    invoke-static {p1}, La/i120;->W(La/gmq;)La/gmq;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    new-instance v2, La/dn2;

    .line 158
    .line 159
    const/4 v4, 0x5

    .line 160
    invoke-direct {v2, v3, v1, v4}, La/dn2;-><init>(La/l7m0;Lkotlin/jvm/functions/Function1;B)V

    .line 161
    .line 162
    .line 163
    iput-boolean v5, p0, La/ptz;->j:Z

    .line 164
    .line 165
    invoke-interface {p1, v2, p0}, La/gmq;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object p0

    .line 169
    if-ne p0, v0, :cond_8

    .line 170
    .line 171
    move-object v6, v0

    .line 172
    goto :goto_5

    .line 173
    :cond_8
    :goto_4
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 174
    .line 175
    :goto_5
    return-object v6

    .line 176
    :pswitch_2
    sget-object v0, La/wne;->a:La/wne;

    .line 177
    .line 178
    iget-boolean v7, p0, La/ptz;->j:Z

    .line 179
    .line 180
    if-eqz v7, :cond_a

    .line 181
    .line 182
    if-ne v7, v5, :cond_9

    .line 183
    .line 184
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 185
    .line 186
    .line 187
    goto :goto_6

    .line 188
    :cond_9
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    goto :goto_7

    .line 192
    :cond_a
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 193
    .line 194
    .line 195
    new-instance p1, La/s39;

    .line 196
    .line 197
    const/16 v4, 0x10

    .line 198
    .line 199
    invoke-direct {p1, v2, v4}, La/s39;-><init>(La/xk80;B)V

    .line 200
    .line 201
    .line 202
    invoke-static {v6, p1}, La/ydx;->V(La/ufk0;Lkotlin/jvm/functions/Function0;)La/vsg0;

    .line 203
    .line 204
    .line 205
    move-result-object p1

    .line 206
    invoke-static {p1}, La/i120;->W(La/gmq;)La/gmq;

    .line 207
    .line 208
    .line 209
    move-result-object p1

    .line 210
    new-instance v2, La/dn2;

    .line 211
    .line 212
    const/4 v4, 0x4

    .line 213
    invoke-direct {v2, v3, v1, v4}, La/dn2;-><init>(La/l7m0;Lkotlin/jvm/functions/Function1;B)V

    .line 214
    .line 215
    .line 216
    iput-boolean v5, p0, La/ptz;->j:Z

    .line 217
    .line 218
    invoke-interface {p1, v2, p0}, La/gmq;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object p0

    .line 222
    if-ne p0, v0, :cond_b

    .line 223
    .line 224
    move-object v6, v0

    .line 225
    goto :goto_7

    .line 226
    :cond_b
    :goto_6
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 227
    .line 228
    :goto_7
    return-object v6

    .line 229
    :pswitch_3
    sget-object v0, La/wne;->a:La/wne;

    .line 230
    .line 231
    iget-boolean v7, p0, La/ptz;->j:Z

    .line 232
    .line 233
    if-eqz v7, :cond_d

    .line 234
    .line 235
    if-ne v7, v5, :cond_c

    .line 236
    .line 237
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 238
    .line 239
    .line 240
    goto :goto_8

    .line 241
    :cond_c
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 242
    .line 243
    .line 244
    goto :goto_9

    .line 245
    :cond_d
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 246
    .line 247
    .line 248
    new-instance p1, La/s39;

    .line 249
    .line 250
    const/16 v4, 0xf

    .line 251
    .line 252
    invoke-direct {p1, v2, v4}, La/s39;-><init>(La/xk80;B)V

    .line 253
    .line 254
    .line 255
    invoke-static {v6, p1}, La/ydx;->V(La/ufk0;Lkotlin/jvm/functions/Function0;)La/vsg0;

    .line 256
    .line 257
    .line 258
    move-result-object p1

    .line 259
    invoke-static {p1}, La/i120;->W(La/gmq;)La/gmq;

    .line 260
    .line 261
    .line 262
    move-result-object p1

    .line 263
    new-instance v2, La/dn2;

    .line 264
    .line 265
    const/4 v4, 0x3

    .line 266
    invoke-direct {v2, v3, v1, v4}, La/dn2;-><init>(La/l7m0;Lkotlin/jvm/functions/Function1;B)V

    .line 267
    .line 268
    .line 269
    iput-boolean v5, p0, La/ptz;->j:Z

    .line 270
    .line 271
    invoke-interface {p1, v2, p0}, La/gmq;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object p0

    .line 275
    if-ne p0, v0, :cond_e

    .line 276
    .line 277
    move-object v6, v0

    .line 278
    goto :goto_9

    .line 279
    :cond_e
    :goto_8
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 280
    .line 281
    :goto_9
    return-object v6

    .line 282
    :pswitch_4
    sget-object v0, La/wne;->a:La/wne;

    .line 283
    .line 284
    iget-boolean v7, p0, La/ptz;->j:Z

    .line 285
    .line 286
    if-eqz v7, :cond_10

    .line 287
    .line 288
    if-ne v7, v5, :cond_f

    .line 289
    .line 290
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 291
    .line 292
    .line 293
    goto :goto_a

    .line 294
    :cond_f
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 295
    .line 296
    .line 297
    goto :goto_b

    .line 298
    :cond_10
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 299
    .line 300
    .line 301
    new-instance p1, La/s39;

    .line 302
    .line 303
    const/16 v4, 0xe

    .line 304
    .line 305
    invoke-direct {p1, v2, v4}, La/s39;-><init>(La/xk80;B)V

    .line 306
    .line 307
    .line 308
    invoke-static {v6, p1}, La/ydx;->V(La/ufk0;Lkotlin/jvm/functions/Function0;)La/vsg0;

    .line 309
    .line 310
    .line 311
    move-result-object p1

    .line 312
    invoke-static {p1}, La/i120;->W(La/gmq;)La/gmq;

    .line 313
    .line 314
    .line 315
    move-result-object p1

    .line 316
    new-instance v2, La/dn2;

    .line 317
    .line 318
    const/4 v4, 0x2

    .line 319
    invoke-direct {v2, v3, v1, v4}, La/dn2;-><init>(La/l7m0;Lkotlin/jvm/functions/Function1;B)V

    .line 320
    .line 321
    .line 322
    iput-boolean v5, p0, La/ptz;->j:Z

    .line 323
    .line 324
    invoke-interface {p1, v2, p0}, La/gmq;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 325
    .line 326
    .line 327
    move-result-object p0

    .line 328
    if-ne p0, v0, :cond_11

    .line 329
    .line 330
    move-object v6, v0

    .line 331
    goto :goto_b

    .line 332
    :cond_11
    :goto_a
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 333
    .line 334
    :goto_b
    return-object v6

    .line 335
    :pswitch_5
    sget-object v0, La/wne;->a:La/wne;

    .line 336
    .line 337
    iget-boolean v7, p0, La/ptz;->j:Z

    .line 338
    .line 339
    if-eqz v7, :cond_13

    .line 340
    .line 341
    if-ne v7, v5, :cond_12

    .line 342
    .line 343
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 344
    .line 345
    .line 346
    goto :goto_c

    .line 347
    :cond_12
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 348
    .line 349
    .line 350
    goto :goto_d

    .line 351
    :cond_13
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 352
    .line 353
    .line 354
    new-instance p1, La/s39;

    .line 355
    .line 356
    const/16 v4, 0xd

    .line 357
    .line 358
    invoke-direct {p1, v2, v4}, La/s39;-><init>(La/xk80;B)V

    .line 359
    .line 360
    .line 361
    invoke-static {v6, p1}, La/ydx;->V(La/ufk0;Lkotlin/jvm/functions/Function0;)La/vsg0;

    .line 362
    .line 363
    .line 364
    move-result-object p1

    .line 365
    invoke-static {p1}, La/i120;->W(La/gmq;)La/gmq;

    .line 366
    .line 367
    .line 368
    move-result-object p1

    .line 369
    new-instance v2, La/dn2;

    .line 370
    .line 371
    invoke-direct {v2, v3, v1, v5}, La/dn2;-><init>(La/l7m0;Lkotlin/jvm/functions/Function1;B)V

    .line 372
    .line 373
    .line 374
    iput-boolean v5, p0, La/ptz;->j:Z

    .line 375
    .line 376
    invoke-interface {p1, v2, p0}, La/gmq;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 377
    .line 378
    .line 379
    move-result-object p0

    .line 380
    if-ne p0, v0, :cond_14

    .line 381
    .line 382
    move-object v6, v0

    .line 383
    goto :goto_d

    .line 384
    :cond_14
    :goto_c
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 385
    .line 386
    :goto_d
    return-object v6

    .line 387
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

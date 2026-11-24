.class public final La/i29;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public final synthetic j:La/s29;


# direct methods
.method public synthetic constructor <init>(La/s29;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/i29;->i:B

    iput-object p1, p0, La/i29;->j:La/s29;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/i29;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/i29;->j:La/s29;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/i29;

    .line 9
    .line 10
    const/4 v0, 0x4

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/i29;-><init>(La/s29;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/i29;

    .line 16
    .line 17
    const/4 v0, 0x3

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/i29;-><init>(La/s29;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    :pswitch_1
    new-instance p1, La/i29;

    .line 23
    .line 24
    const/4 v0, 0x2

    .line 25
    invoke-direct {p1, p0, p2, v0}, La/i29;-><init>(La/s29;La/yje;B)V

    .line 26
    .line 27
    .line 28
    return-object p1

    .line 29
    :pswitch_2
    new-instance p1, La/i29;

    .line 30
    .line 31
    const/4 v0, 0x1

    .line 32
    invoke-direct {p1, p0, p2, v0}, La/i29;-><init>(La/s29;La/yje;B)V

    .line 33
    .line 34
    .line 35
    return-object p1

    .line 36
    :pswitch_3
    new-instance p1, La/i29;

    .line 37
    .line 38
    const/4 v0, 0x0

    .line 39
    invoke-direct {p1, p0, p2, v0}, La/i29;-><init>(La/s29;La/yje;B)V

    .line 40
    .line 41
    .line 42
    return-object p1

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/i29;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/uaq0;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/i29;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/i29;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/i29;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/vne;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/i29;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/i29;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/i29;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, La/vne;

    .line 41
    .line 42
    check-cast p2, La/yje;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, La/i29;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/i29;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/i29;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :pswitch_2
    check-cast p1, La/vne;

    .line 58
    .line 59
    check-cast p2, La/yje;

    .line 60
    .line 61
    invoke-virtual {p0, p1, p2}, La/i29;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    check-cast p0, La/i29;

    .line 66
    .line 67
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 68
    .line 69
    invoke-virtual {p0, p1}, La/i29;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    return-object p0

    .line 74
    :pswitch_3
    check-cast p1, La/vne;

    .line 75
    .line 76
    check-cast p2, La/yje;

    .line 77
    .line 78
    invoke-virtual {p0, p1, p2}, La/i29;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    check-cast p0, La/i29;

    .line 83
    .line 84
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 85
    .line 86
    invoke-virtual {p0, p1}, La/i29;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    return-object p0

    .line 91
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/i29;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/i29;->j:La/s29;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object p0, La/wne;->a:La/wne;

    .line 9
    .line 10
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    sget-object p0, La/s29;->Y:Ljava/lang/String;

    .line 14
    .line 15
    invoke-virtual {v1}, La/s29;->O()V

    .line 16
    .line 17
    .line 18
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 19
    .line 20
    return-object p0

    .line 21
    :pswitch_0
    sget-object p0, La/wne;->a:La/wne;

    .line 22
    .line 23
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    new-instance p0, La/s19;

    .line 27
    .line 28
    invoke-virtual {v1}, La/i3t0;->D()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    check-cast p1, La/x19;

    .line 33
    .line 34
    iget-object p1, p1, La/x19;->g:La/uzb0;

    .line 35
    .line 36
    invoke-direct {p0, p1}, La/s19;-><init>(La/uzb0;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1, p0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    return-object p0

    .line 45
    :pswitch_1
    sget-object p0, La/wne;->a:La/wne;

    .line 46
    .line 47
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1}, La/i3t0;->D()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    check-cast p0, La/x19;

    .line 55
    .line 56
    iget-object p0, p0, La/x19;->a:La/w19;

    .line 57
    .line 58
    iget-boolean p0, p0, La/w19;->a:Z

    .line 59
    .line 60
    if-eqz p0, :cond_1

    .line 61
    .line 62
    iget-object p0, v1, La/i3t0;->i:La/ocj;

    .line 63
    .line 64
    iget-object p0, p0, La/ocj;->a:La/p7m0;

    .line 65
    .line 66
    :cond_0
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    move-object v0, p1

    .line 74
    check-cast v0, La/x19;

    .line 75
    .line 76
    const/4 v2, 0x0

    .line 77
    const/4 v3, 0x6

    .line 78
    const/4 v4, 0x0

    .line 79
    invoke-static {v0, v2, v4, v4, v3}, La/ay3;->N(La/x19;ZLjava/lang/String;Ljava/lang/String;I)La/x19;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-virtual {p0, p1, v0}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    if-eqz p1, :cond_0

    .line 88
    .line 89
    invoke-static {v1}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 90
    .line 91
    .line 92
    move-result-object v5

    .line 93
    iget-object p0, v1, La/s29;->w:La/mne;

    .line 94
    .line 95
    iget-object v8, p0, La/mne;->a:La/rwj;

    .line 96
    .line 97
    sget-object v6, La/m29;->a:La/m29;

    .line 98
    .line 99
    new-instance v9, La/d09;

    .line 100
    .line 101
    const/4 p0, 0x3

    .line 102
    const-string p1, ""

    .line 103
    .line 104
    invoke-direct {v9, v1, p1, v4, p0}, La/d09;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 105
    .line 106
    .line 107
    const/16 v10, 0xa

    .line 108
    .line 109
    const/4 v7, 0x0

    .line 110
    invoke-static/range {v5 .. v10}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 111
    .line 112
    .line 113
    goto :goto_0

    .line 114
    :cond_1
    iget-object p0, v1, La/s29;->x:La/u58;

    .line 115
    .line 116
    iget-object p0, p0, La/u58;->a:La/kt2;

    .line 117
    .line 118
    const-string p1, "provbrand_back"

    .line 119
    .line 120
    invoke-interface {p0, p1}, La/kt2;->c(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    iget-object p0, v1, La/s29;->B:La/au0;

    .line 124
    .line 125
    iget-object p0, p0, La/au0;->a:La/s1p;

    .line 126
    .line 127
    const-wide/16 v2, 0x2aca

    .line 128
    .line 129
    sget-object p1, La/xun;->a:La/xun;

    .line 130
    .line 131
    invoke-virtual {p0, p1, v2, v3}, La/s1p;->a(Ljava/util/Set;J)V

    .line 132
    .line 133
    .line 134
    sget-object p0, La/p19;->a:La/p19;

    .line 135
    .line 136
    invoke-virtual {v1, p0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 140
    .line 141
    return-object p0

    .line 142
    :pswitch_2
    sget-object v0, La/wne;->a:La/wne;

    .line 143
    .line 144
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    iget-object v1, p0, La/i29;->j:La/s29;

    .line 148
    .line 149
    iget-object v2, v1, La/s29;->A:La/kb0;

    .line 150
    .line 151
    new-instance v3, La/db0;

    .line 152
    .line 153
    sget-object p0, La/s29;->Y:Ljava/lang/String;

    .line 154
    .line 155
    sget-object p1, La/k7k;->B:La/k7k;

    .line 156
    .line 157
    iget-object v0, v1, La/s29;->L:La/cmt;

    .line 158
    .line 159
    invoke-virtual {v0}, La/cmt;->g()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    invoke-direct {v3, p0, p1, v0}, La/db0;-><init>(Ljava/lang/String;La/k7k;Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    iget-object p0, v1, La/s29;->w:La/mne;

    .line 167
    .line 168
    iget-object v4, p0, La/mne;->b:La/dvj;

    .line 169
    .line 170
    const/4 v5, 0x0

    .line 171
    const/4 v6, 0x4

    .line 172
    invoke-static/range {v1 .. v6}, La/i3t0;->A(La/i3t0;La/j3t0;Ljava/lang/Object;La/lne;Lkotlin/jvm/functions/Function1;I)V

    .line 173
    .line 174
    .line 175
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 176
    .line 177
    return-object p0

    .line 178
    :pswitch_3
    sget-object v0, La/wne;->a:La/wne;

    .line 179
    .line 180
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    iget-object v1, p0, La/i29;->j:La/s29;

    .line 184
    .line 185
    iget-object v2, v1, La/s29;->A:La/kb0;

    .line 186
    .line 187
    new-instance v3, La/cb0;

    .line 188
    .line 189
    sget-object p0, La/s29;->Y:Ljava/lang/String;

    .line 190
    .line 191
    const-string p1, "aggregator_providers"

    .line 192
    .line 193
    invoke-direct {v3, p0, p1}, La/cb0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    const/4 v5, 0x0

    .line 197
    const/4 v6, 0x6

    .line 198
    const/4 v4, 0x0

    .line 199
    invoke-static/range {v1 .. v6}, La/i3t0;->A(La/i3t0;La/j3t0;Ljava/lang/Object;La/lne;Lkotlin/jvm/functions/Function1;I)V

    .line 200
    .line 201
    .line 202
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 203
    .line 204
    return-object p0

    .line 205
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

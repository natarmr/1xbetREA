.class public final La/fco;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/l7m0;

.field public final synthetic l:La/xk80;


# direct methods
.method public synthetic constructor <init>(BLa/yje;La/xk80;La/l7m0;)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/fco;->i:B

    iput-object p4, p0, La/fco;->k:La/l7m0;

    iput-object p3, p0, La/fco;->l:La/xk80;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 3

    .line 1
    iget-byte v0, p0, La/fco;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, La/fco;

    .line 7
    .line 8
    iget-object v1, p0, La/fco;->l:La/xk80;

    .line 9
    .line 10
    const/4 v2, 0x2

    .line 11
    iget-object p0, p0, La/fco;->k:La/l7m0;

    .line 12
    .line 13
    invoke-direct {v0, v2, p2, v1, p0}, La/fco;-><init>(BLa/yje;La/xk80;La/l7m0;)V

    .line 14
    .line 15
    .line 16
    iput-object p1, v0, La/fco;->j:Ljava/lang/Object;

    .line 17
    .line 18
    return-object v0

    .line 19
    :pswitch_0
    new-instance v0, La/fco;

    .line 20
    .line 21
    iget-object v1, p0, La/fco;->l:La/xk80;

    .line 22
    .line 23
    const/4 v2, 0x1

    .line 24
    iget-object p0, p0, La/fco;->k:La/l7m0;

    .line 25
    .line 26
    invoke-direct {v0, v2, p2, v1, p0}, La/fco;-><init>(BLa/yje;La/xk80;La/l7m0;)V

    .line 27
    .line 28
    .line 29
    iput-object p1, v0, La/fco;->j:Ljava/lang/Object;

    .line 30
    .line 31
    return-object v0

    .line 32
    :pswitch_1
    new-instance v0, La/fco;

    .line 33
    .line 34
    iget-object v1, p0, La/fco;->l:La/xk80;

    .line 35
    .line 36
    const/4 v2, 0x0

    .line 37
    iget-object p0, p0, La/fco;->k:La/l7m0;

    .line 38
    .line 39
    invoke-direct {v0, v2, p2, v1, p0}, La/fco;-><init>(BLa/yje;La/xk80;La/l7m0;)V

    .line 40
    .line 41
    .line 42
    iput-object p1, v0, La/fco;->j:Ljava/lang/Object;

    .line 43
    .line 44
    return-object v0

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
    iget-byte v0, p0, La/fco;->i:B

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
    invoke-virtual {p0, p1, p2}, La/fco;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/fco;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/fco;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/fco;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/fco;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/fco;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, La/fco;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, La/fco;

    .line 41
    .line 42
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, La/fco;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 5

    .line 1
    iget-byte v0, p0, La/fco;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/fco;->k:La/l7m0;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v3, p0, La/fco;->l:La/xk80;

    .line 7
    .line 8
    const/4 v4, 0x3

    .line 9
    iget-object p0, p0, La/fco;->j:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, La/vne;

    .line 12
    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    sget-object v0, La/wne;->a:La/wne;

    .line 17
    .line 18
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    invoke-interface {v1}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    check-cast p1, La/gkw;

    .line 26
    .line 27
    if-eqz p1, :cond_0

    .line 28
    .line 29
    iget-object p1, p1, La/gkw;->b:La/a4x;

    .line 30
    .line 31
    if-eqz p1, :cond_0

    .line 32
    .line 33
    invoke-virtual {v3}, La/xk80;->k()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    check-cast p1, La/ekw;

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    move-object p1, v2

    .line 45
    :goto_0
    invoke-interface {v1}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    check-cast v0, La/gkw;

    .line 50
    .line 51
    if-eqz v0, :cond_1

    .line 52
    .line 53
    iget-object v0, v0, La/gkw;->c:La/ekw;

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_1
    move-object v0, v2

    .line 57
    :goto_1
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    if-nez p1, :cond_2

    .line 62
    .line 63
    new-instance p1, La/eyj;

    .line 64
    .line 65
    invoke-direct {p1, v4, v2, v3, v1}, La/eyj;-><init>(BLa/yje;La/xk80;La/l7m0;)V

    .line 66
    .line 67
    .line 68
    invoke-static {p0, v2, v2, p1, v4}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 69
    .line 70
    .line 71
    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 72
    .line 73
    return-object p0

    .line 74
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 75
    .line 76
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    invoke-interface {v1}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    check-cast p1, La/gkw;

    .line 84
    .line 85
    if-eqz p1, :cond_3

    .line 86
    .line 87
    iget-object p1, p1, La/gkw;->b:La/a4x;

    .line 88
    .line 89
    if-eqz p1, :cond_3

    .line 90
    .line 91
    invoke-virtual {v3}, La/xk80;->k()I

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    check-cast p1, La/ekw;

    .line 100
    .line 101
    goto :goto_2

    .line 102
    :cond_3
    move-object p1, v2

    .line 103
    :goto_2
    invoke-interface {v1}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    check-cast v0, La/gkw;

    .line 108
    .line 109
    if-eqz v0, :cond_4

    .line 110
    .line 111
    iget-object v0, v0, La/gkw;->c:La/ekw;

    .line 112
    .line 113
    goto :goto_3

    .line 114
    :cond_4
    move-object v0, v2

    .line 115
    :goto_3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result p1

    .line 119
    if-nez p1, :cond_5

    .line 120
    .line 121
    new-instance p1, La/eyj;

    .line 122
    .line 123
    const/4 v0, 0x2

    .line 124
    invoke-direct {p1, v0, v2, v3, v1}, La/eyj;-><init>(BLa/yje;La/xk80;La/l7m0;)V

    .line 125
    .line 126
    .line 127
    invoke-static {p0, v2, v2, p1, v4}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 128
    .line 129
    .line 130
    :cond_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 131
    .line 132
    return-object p0

    .line 133
    :pswitch_1
    sget-object v0, La/wne;->a:La/wne;

    .line 134
    .line 135
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    invoke-interface {v1}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    check-cast p1, La/gkw;

    .line 143
    .line 144
    if-eqz p1, :cond_6

    .line 145
    .line 146
    iget-object p1, p1, La/gkw;->b:La/a4x;

    .line 147
    .line 148
    if-eqz p1, :cond_6

    .line 149
    .line 150
    invoke-virtual {v3}, La/xk80;->k()I

    .line 151
    .line 152
    .line 153
    move-result v0

    .line 154
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    check-cast p1, La/ekw;

    .line 159
    .line 160
    goto :goto_4

    .line 161
    :cond_6
    move-object p1, v2

    .line 162
    :goto_4
    invoke-interface {v1}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    check-cast v0, La/gkw;

    .line 167
    .line 168
    if-eqz v0, :cond_7

    .line 169
    .line 170
    iget-object v0, v0, La/gkw;->c:La/ekw;

    .line 171
    .line 172
    goto :goto_5

    .line 173
    :cond_7
    move-object v0, v2

    .line 174
    :goto_5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    move-result p1

    .line 178
    if-nez p1, :cond_8

    .line 179
    .line 180
    new-instance p1, La/eyj;

    .line 181
    .line 182
    const/4 v0, 0x1

    .line 183
    invoke-direct {p1, v0, v2, v3, v1}, La/eyj;-><init>(BLa/yje;La/xk80;La/l7m0;)V

    .line 184
    .line 185
    .line 186
    invoke-static {p0, v2, v2, p1, v4}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 187
    .line 188
    .line 189
    :cond_8
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 190
    .line 191
    return-object p0

    .line 192
    nop

    .line 193
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

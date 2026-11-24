.class public final La/fyj;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public final synthetic j:La/vne;

.field public final synthetic k:La/xk80;

.field public final synthetic l:La/l7m0;


# direct methods
.method public constructor <init>(La/l7m0;La/xk80;La/vne;La/yje;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, La/fyj;->i:B

    .line 3
    .line 4
    iput-object p1, p0, La/fyj;->l:La/l7m0;

    .line 5
    .line 6
    iput-object p2, p0, La/fyj;->k:La/xk80;

    .line 7
    .line 8
    iput-object p3, p0, La/fyj;->j:La/vne;

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

.method public synthetic constructor <init>(La/vne;La/xk80;La/l7m0;La/yje;B)V
    .locals 0

    .line 15
    iput-byte p5, p0, La/fyj;->i:B

    iput-object p1, p0, La/fyj;->j:La/vne;

    iput-object p2, p0, La/fyj;->k:La/xk80;

    iput-object p3, p0, La/fyj;->l:La/l7m0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 7

    .line 1
    iget-byte p1, p0, La/fyj;->i:B

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, La/fyj;

    .line 7
    .line 8
    iget-object v3, p0, La/fyj;->l:La/l7m0;

    .line 9
    .line 10
    const/4 v5, 0x6

    .line 11
    iget-object v1, p0, La/fyj;->j:La/vne;

    .line 12
    .line 13
    iget-object v2, p0, La/fyj;->k:La/xk80;

    .line 14
    .line 15
    move-object v4, p2

    .line 16
    invoke-direct/range {v0 .. v5}, La/fyj;-><init>(La/vne;La/xk80;La/l7m0;La/yje;B)V

    .line 17
    .line 18
    .line 19
    return-object v0

    .line 20
    :pswitch_0
    move-object v5, p2

    .line 21
    new-instance v1, La/fyj;

    .line 22
    .line 23
    iget-object v4, p0, La/fyj;->l:La/l7m0;

    .line 24
    .line 25
    const/4 v6, 0x5

    .line 26
    iget-object v2, p0, La/fyj;->j:La/vne;

    .line 27
    .line 28
    iget-object v3, p0, La/fyj;->k:La/xk80;

    .line 29
    .line 30
    invoke-direct/range {v1 .. v6}, La/fyj;-><init>(La/vne;La/xk80;La/l7m0;La/yje;B)V

    .line 31
    .line 32
    .line 33
    return-object v1

    .line 34
    :pswitch_1
    move-object v5, p2

    .line 35
    new-instance v1, La/fyj;

    .line 36
    .line 37
    iget-object v4, p0, La/fyj;->l:La/l7m0;

    .line 38
    .line 39
    const/4 v6, 0x4

    .line 40
    iget-object v2, p0, La/fyj;->j:La/vne;

    .line 41
    .line 42
    iget-object v3, p0, La/fyj;->k:La/xk80;

    .line 43
    .line 44
    invoke-direct/range {v1 .. v6}, La/fyj;-><init>(La/vne;La/xk80;La/l7m0;La/yje;B)V

    .line 45
    .line 46
    .line 47
    return-object v1

    .line 48
    :pswitch_2
    move-object v5, p2

    .line 49
    new-instance v1, La/fyj;

    .line 50
    .line 51
    iget-object v4, p0, La/fyj;->l:La/l7m0;

    .line 52
    .line 53
    const/4 v6, 0x3

    .line 54
    iget-object v2, p0, La/fyj;->j:La/vne;

    .line 55
    .line 56
    iget-object v3, p0, La/fyj;->k:La/xk80;

    .line 57
    .line 58
    invoke-direct/range {v1 .. v6}, La/fyj;-><init>(La/vne;La/xk80;La/l7m0;La/yje;B)V

    .line 59
    .line 60
    .line 61
    return-object v1

    .line 62
    :pswitch_3
    move-object v5, p2

    .line 63
    new-instance v1, La/fyj;

    .line 64
    .line 65
    iget-object v4, p0, La/fyj;->l:La/l7m0;

    .line 66
    .line 67
    const/4 v6, 0x2

    .line 68
    iget-object v2, p0, La/fyj;->j:La/vne;

    .line 69
    .line 70
    iget-object v3, p0, La/fyj;->k:La/xk80;

    .line 71
    .line 72
    invoke-direct/range {v1 .. v6}, La/fyj;-><init>(La/vne;La/xk80;La/l7m0;La/yje;B)V

    .line 73
    .line 74
    .line 75
    return-object v1

    .line 76
    :pswitch_4
    move-object v5, p2

    .line 77
    new-instance v1, La/fyj;

    .line 78
    .line 79
    iget-object v4, p0, La/fyj;->l:La/l7m0;

    .line 80
    .line 81
    const/4 v6, 0x1

    .line 82
    iget-object v2, p0, La/fyj;->j:La/vne;

    .line 83
    .line 84
    iget-object v3, p0, La/fyj;->k:La/xk80;

    .line 85
    .line 86
    invoke-direct/range {v1 .. v6}, La/fyj;-><init>(La/vne;La/xk80;La/l7m0;La/yje;B)V

    .line 87
    .line 88
    .line 89
    return-object v1

    .line 90
    :pswitch_5
    move-object v5, p2

    .line 91
    new-instance p1, La/fyj;

    .line 92
    .line 93
    iget-object p2, p0, La/fyj;->k:La/xk80;

    .line 94
    .line 95
    iget-object v0, p0, La/fyj;->j:La/vne;

    .line 96
    .line 97
    iget-object p0, p0, La/fyj;->l:La/l7m0;

    .line 98
    .line 99
    invoke-direct {p1, p0, p2, v0, v5}, La/fyj;-><init>(La/l7m0;La/xk80;La/vne;La/yje;)V

    .line 100
    .line 101
    .line 102
    return-object p1

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
    iget-byte v0, p0, La/fyj;->i:B

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
    invoke-virtual {p0, p1, p2}, La/fyj;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/fyj;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/fyj;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/fyj;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/fyj;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/fyj;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, La/fyj;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, La/fyj;

    .line 41
    .line 42
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, La/fyj;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0

    .line 49
    :pswitch_2
    invoke-virtual {p0, p1, p2}, La/fyj;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    check-cast p0, La/fyj;

    .line 54
    .line 55
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 56
    .line 57
    invoke-virtual {p0, p1}, La/fyj;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    return-object p0

    .line 62
    :pswitch_3
    invoke-virtual {p0, p1, p2}, La/fyj;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    check-cast p0, La/fyj;

    .line 67
    .line 68
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 69
    .line 70
    invoke-virtual {p0, p1}, La/fyj;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    return-object p0

    .line 75
    :pswitch_4
    invoke-virtual {p0, p1, p2}, La/fyj;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    check-cast p0, La/fyj;

    .line 80
    .line 81
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 82
    .line 83
    invoke-virtual {p0, p1}, La/fyj;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    return-object p0

    .line 88
    :pswitch_5
    invoke-virtual {p0, p1, p2}, La/fyj;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    check-cast p0, La/fyj;

    .line 93
    .line 94
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 95
    .line 96
    invoke-virtual {p0, p1}, La/fyj;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 5

    .line 1
    iget-byte v0, p0, La/fyj;->i:B

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    iget-object v2, p0, La/fyj;->l:La/l7m0;

    .line 5
    .line 6
    iget-object v3, p0, La/fyj;->k:La/xk80;

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    iget-object p0, p0, La/fyj;->j:La/vne;

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
    new-instance p1, La/eyj;

    .line 20
    .line 21
    const/16 v0, 0x9

    .line 22
    .line 23
    invoke-direct {p1, v0, v4, v3, v2}, La/eyj;-><init>(BLa/yje;La/xk80;La/l7m0;)V

    .line 24
    .line 25
    .line 26
    invoke-static {p0, v4, v4, p1, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 27
    .line 28
    .line 29
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    return-object p0

    .line 32
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 33
    .line 34
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    new-instance p1, La/eyj;

    .line 38
    .line 39
    const/16 v0, 0x8

    .line 40
    .line 41
    invoke-direct {p1, v0, v4, v3, v2}, La/eyj;-><init>(BLa/yje;La/xk80;La/l7m0;)V

    .line 42
    .line 43
    .line 44
    invoke-static {p0, v4, v4, p1, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 45
    .line 46
    .line 47
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 48
    .line 49
    return-object p0

    .line 50
    :pswitch_1
    sget-object v0, La/wne;->a:La/wne;

    .line 51
    .line 52
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    new-instance p1, La/eyj;

    .line 56
    .line 57
    const/4 v0, 0x7

    .line 58
    invoke-direct {p1, v0, v4, v3, v2}, La/eyj;-><init>(BLa/yje;La/xk80;La/l7m0;)V

    .line 59
    .line 60
    .line 61
    invoke-static {p0, v4, v4, p1, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 62
    .line 63
    .line 64
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 65
    .line 66
    return-object p0

    .line 67
    :pswitch_2
    sget-object v0, La/wne;->a:La/wne;

    .line 68
    .line 69
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    new-instance p1, La/eyj;

    .line 73
    .line 74
    const/4 v0, 0x6

    .line 75
    invoke-direct {p1, v0, v4, v3, v2}, La/eyj;-><init>(BLa/yje;La/xk80;La/l7m0;)V

    .line 76
    .line 77
    .line 78
    invoke-static {p0, v4, v4, p1, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 79
    .line 80
    .line 81
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 82
    .line 83
    return-object p0

    .line 84
    :pswitch_3
    sget-object v0, La/wne;->a:La/wne;

    .line 85
    .line 86
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    new-instance p1, La/eyj;

    .line 90
    .line 91
    const/4 v0, 0x5

    .line 92
    invoke-direct {p1, v0, v4, v3, v2}, La/eyj;-><init>(BLa/yje;La/xk80;La/l7m0;)V

    .line 93
    .line 94
    .line 95
    invoke-static {p0, v4, v4, p1, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 96
    .line 97
    .line 98
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 99
    .line 100
    return-object p0

    .line 101
    :pswitch_4
    sget-object v0, La/wne;->a:La/wne;

    .line 102
    .line 103
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    new-instance p1, La/eyj;

    .line 107
    .line 108
    const/4 v0, 0x4

    .line 109
    invoke-direct {p1, v0, v4, v3, v2}, La/eyj;-><init>(BLa/yje;La/xk80;La/l7m0;)V

    .line 110
    .line 111
    .line 112
    invoke-static {p0, v4, v4, p1, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 113
    .line 114
    .line 115
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 116
    .line 117
    return-object p0

    .line 118
    :pswitch_5
    sget-object v0, La/wne;->a:La/wne;

    .line 119
    .line 120
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    invoke-interface {v2}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    check-cast p1, La/gkw;

    .line 128
    .line 129
    if-eqz p1, :cond_0

    .line 130
    .line 131
    iget-object p1, p1, La/gkw;->b:La/a4x;

    .line 132
    .line 133
    if-eqz p1, :cond_0

    .line 134
    .line 135
    invoke-virtual {v3}, La/xk80;->k()I

    .line 136
    .line 137
    .line 138
    move-result v0

    .line 139
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    check-cast p1, La/ekw;

    .line 144
    .line 145
    goto :goto_0

    .line 146
    :cond_0
    move-object p1, v4

    .line 147
    :goto_0
    invoke-interface {v2}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    check-cast v0, La/gkw;

    .line 152
    .line 153
    if-eqz v0, :cond_1

    .line 154
    .line 155
    iget-object v0, v0, La/gkw;->c:La/ekw;

    .line 156
    .line 157
    goto :goto_1

    .line 158
    :cond_1
    move-object v0, v4

    .line 159
    :goto_1
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    move-result p1

    .line 163
    if-nez p1, :cond_2

    .line 164
    .line 165
    new-instance p1, La/eyj;

    .line 166
    .line 167
    const/4 v0, 0x0

    .line 168
    invoke-direct {p1, v0, v4, v3, v2}, La/eyj;-><init>(BLa/yje;La/xk80;La/l7m0;)V

    .line 169
    .line 170
    .line 171
    invoke-static {p0, v4, v4, p1, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 172
    .line 173
    .line 174
    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 175
    .line 176
    return-object p0

    .line 177
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

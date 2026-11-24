.class public final La/ygz;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/l7m0;

.field public final synthetic l:La/xcz;

.field public final synthetic m:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(La/l7m0;La/xcz;Lkotlin/jvm/functions/Function1;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p5, p0, La/ygz;->i:B

    iput-object p1, p0, La/ygz;->k:La/l7m0;

    iput-object p2, p0, La/ygz;->l:La/xcz;

    iput-object p3, p0, La/ygz;->m:Lkotlin/jvm/functions/Function1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 7

    .line 1
    iget-byte p1, p0, La/ygz;->i:B

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, La/ygz;

    .line 7
    .line 8
    iget-object v3, p0, La/ygz;->m:Lkotlin/jvm/functions/Function1;

    .line 9
    .line 10
    const/4 v5, 0x2

    .line 11
    iget-object v1, p0, La/ygz;->k:La/l7m0;

    .line 12
    .line 13
    iget-object v2, p0, La/ygz;->l:La/xcz;

    .line 14
    .line 15
    move-object v4, p2

    .line 16
    invoke-direct/range {v0 .. v5}, La/ygz;-><init>(La/l7m0;La/xcz;Lkotlin/jvm/functions/Function1;La/yje;B)V

    .line 17
    .line 18
    .line 19
    return-object v0

    .line 20
    :pswitch_0
    move-object v5, p2

    .line 21
    new-instance v1, La/ygz;

    .line 22
    .line 23
    iget-object v4, p0, La/ygz;->m:Lkotlin/jvm/functions/Function1;

    .line 24
    .line 25
    const/4 v6, 0x1

    .line 26
    iget-object v2, p0, La/ygz;->k:La/l7m0;

    .line 27
    .line 28
    iget-object v3, p0, La/ygz;->l:La/xcz;

    .line 29
    .line 30
    invoke-direct/range {v1 .. v6}, La/ygz;-><init>(La/l7m0;La/xcz;Lkotlin/jvm/functions/Function1;La/yje;B)V

    .line 31
    .line 32
    .line 33
    return-object v1

    .line 34
    :pswitch_1
    move-object v5, p2

    .line 35
    new-instance v1, La/ygz;

    .line 36
    .line 37
    iget-object v4, p0, La/ygz;->m:Lkotlin/jvm/functions/Function1;

    .line 38
    .line 39
    const/4 v6, 0x0

    .line 40
    iget-object v2, p0, La/ygz;->k:La/l7m0;

    .line 41
    .line 42
    iget-object v3, p0, La/ygz;->l:La/xcz;

    .line 43
    .line 44
    invoke-direct/range {v1 .. v6}, La/ygz;-><init>(La/l7m0;La/xcz;Lkotlin/jvm/functions/Function1;La/yje;B)V

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
    iget-byte v0, p0, La/ygz;->i:B

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
    invoke-virtual {p0, p1, p2}, La/ygz;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/ygz;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/ygz;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/ygz;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/ygz;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/ygz;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, La/ygz;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, La/ygz;

    .line 41
    .line 42
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, La/ygz;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 9

    .line 1
    iget-byte v0, p0, La/ygz;->i:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, La/ygz;->m:Lkotlin/jvm/functions/Function1;

    .line 5
    .line 6
    iget-object v3, p0, La/ygz;->l:La/xcz;

    .line 7
    .line 8
    iget-object v4, p0, La/ygz;->k:La/l7m0;

    .line 9
    .line 10
    const-string v5, "call to \'resume\' before \'invoke\' with coroutine"

    .line 11
    .line 12
    const/4 v6, 0x1

    .line 13
    const/4 v7, 0x0

    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    sget-object v0, La/wne;->a:La/wne;

    .line 18
    .line 19
    iget-boolean v8, p0, La/ygz;->j:Z

    .line 20
    .line 21
    if-eqz v8, :cond_1

    .line 22
    .line 23
    if-ne v8, v6, :cond_0

    .line 24
    .line 25
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    invoke-static {v5}, La/jf4;->n(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    invoke-interface {v4}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    check-cast p1, La/bls0;

    .line 41
    .line 42
    iget-boolean p1, p1, La/bls0;->c:Z

    .line 43
    .line 44
    if-eqz p1, :cond_3

    .line 45
    .line 46
    iput-boolean v6, p0, La/ygz;->j:Z

    .line 47
    .line 48
    sget-object p1, La/xcz;->y:La/v0h0;

    .line 49
    .line 50
    invoke-virtual {v3, v1, v1, p0}, La/xcz;->l(IILa/yje;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    if-ne p0, v0, :cond_2

    .line 55
    .line 56
    move-object v7, v0

    .line 57
    goto :goto_1

    .line 58
    :cond_2
    :goto_0
    sget-object p0, La/kis0;->a:La/kis0;

    .line 59
    .line 60
    invoke-interface {v2, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    :cond_3
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 64
    .line 65
    :goto_1
    return-object v7

    .line 66
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 67
    .line 68
    iget-boolean v1, p0, La/ygz;->j:Z

    .line 69
    .line 70
    if-eqz v1, :cond_5

    .line 71
    .line 72
    if-ne v1, v6, :cond_4

    .line 73
    .line 74
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_4
    invoke-static {v5}, La/jf4;->n(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    goto :goto_3

    .line 82
    :cond_5
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    new-instance p1, La/x000;

    .line 86
    .line 87
    const/16 v1, 0xb

    .line 88
    .line 89
    invoke-direct {p1, v4, v1}, La/x000;-><init>(La/l7m0;B)V

    .line 90
    .line 91
    .line 92
    invoke-static {v7, p1}, La/ydx;->V(La/ufk0;Lkotlin/jvm/functions/Function0;)La/vsg0;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    new-instance v1, La/clu;

    .line 97
    .line 98
    const/16 v4, 0x9

    .line 99
    .line 100
    invoke-direct {v1, v3, v2, v4}, La/clu;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 101
    .line 102
    .line 103
    iput-boolean v6, p0, La/ygz;->j:Z

    .line 104
    .line 105
    invoke-virtual {p1, v1, p0}, La/vsg0;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    if-ne p0, v0, :cond_6

    .line 110
    .line 111
    move-object v7, v0

    .line 112
    goto :goto_3

    .line 113
    :cond_6
    :goto_2
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 114
    .line 115
    :goto_3
    return-object v7

    .line 116
    :pswitch_1
    sget-object v0, La/wne;->a:La/wne;

    .line 117
    .line 118
    iget-boolean v8, p0, La/ygz;->j:Z

    .line 119
    .line 120
    if-eqz v8, :cond_8

    .line 121
    .line 122
    if-ne v8, v6, :cond_7

    .line 123
    .line 124
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    goto :goto_4

    .line 128
    :cond_7
    invoke-static {v5}, La/jf4;->n(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    goto :goto_5

    .line 132
    :cond_8
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    invoke-interface {v4}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    check-cast p1, La/yhz;

    .line 140
    .line 141
    iget-boolean p1, p1, La/yhz;->c:Z

    .line 142
    .line 143
    if-eqz p1, :cond_a

    .line 144
    .line 145
    iput-boolean v6, p0, La/ygz;->j:Z

    .line 146
    .line 147
    sget-object p1, La/xcz;->y:La/v0h0;

    .line 148
    .line 149
    invoke-virtual {v3, v1, v1, p0}, La/xcz;->l(IILa/yje;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object p0

    .line 153
    if-ne p0, v0, :cond_9

    .line 154
    .line 155
    move-object v7, v0

    .line 156
    goto :goto_5

    .line 157
    :cond_9
    :goto_4
    sget-object p0, La/mfz;->a:La/mfz;

    .line 158
    .line 159
    invoke-interface {v2, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    :cond_a
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 163
    .line 164
    :goto_5
    return-object v7

    .line 165
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

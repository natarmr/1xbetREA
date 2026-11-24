.class public final La/ow7;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/pz40;

.field public final synthetic l:La/vne;

.field public final synthetic m:La/t33;

.field public final synthetic n:La/pz40;


# direct methods
.method public synthetic constructor <init>(La/pz40;La/vne;La/t33;La/pz40;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p6, p0, La/ow7;->i:B

    iput-object p1, p0, La/ow7;->k:La/pz40;

    iput-object p2, p0, La/ow7;->l:La/vne;

    iput-object p3, p0, La/ow7;->m:La/t33;

    iput-object p4, p0, La/ow7;->n:La/pz40;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 8

    .line 1
    iget-byte p1, p0, La/ow7;->i:B

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, La/ow7;

    .line 7
    .line 8
    iget-object v4, p0, La/ow7;->n:La/pz40;

    .line 9
    .line 10
    const/4 v6, 0x2

    .line 11
    iget-object v1, p0, La/ow7;->k:La/pz40;

    .line 12
    .line 13
    iget-object v2, p0, La/ow7;->l:La/vne;

    .line 14
    .line 15
    iget-object v3, p0, La/ow7;->m:La/t33;

    .line 16
    .line 17
    move-object v5, p2

    .line 18
    invoke-direct/range {v0 .. v6}, La/ow7;-><init>(La/pz40;La/vne;La/t33;La/pz40;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object v0

    .line 22
    :pswitch_0
    move-object v6, p2

    .line 23
    new-instance v1, La/ow7;

    .line 24
    .line 25
    iget-object v5, p0, La/ow7;->n:La/pz40;

    .line 26
    .line 27
    const/4 v7, 0x1

    .line 28
    iget-object v2, p0, La/ow7;->k:La/pz40;

    .line 29
    .line 30
    iget-object v3, p0, La/ow7;->l:La/vne;

    .line 31
    .line 32
    iget-object v4, p0, La/ow7;->m:La/t33;

    .line 33
    .line 34
    invoke-direct/range {v1 .. v7}, La/ow7;-><init>(La/pz40;La/vne;La/t33;La/pz40;La/yje;B)V

    .line 35
    .line 36
    .line 37
    return-object v1

    .line 38
    :pswitch_1
    move-object v6, p2

    .line 39
    new-instance v1, La/ow7;

    .line 40
    .line 41
    iget-object v5, p0, La/ow7;->n:La/pz40;

    .line 42
    .line 43
    const/4 v7, 0x0

    .line 44
    iget-object v2, p0, La/ow7;->k:La/pz40;

    .line 45
    .line 46
    iget-object v3, p0, La/ow7;->l:La/vne;

    .line 47
    .line 48
    iget-object v4, p0, La/ow7;->m:La/t33;

    .line 49
    .line 50
    invoke-direct/range {v1 .. v7}, La/ow7;-><init>(La/pz40;La/vne;La/t33;La/pz40;La/yje;B)V

    .line 51
    .line 52
    .line 53
    return-object v1

    .line 54
    nop

    .line 55
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/ow7;->i:B

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
    invoke-virtual {p0, p1, p2}, La/ow7;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/ow7;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/ow7;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/ow7;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/ow7;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/ow7;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, La/ow7;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, La/ow7;

    .line 41
    .line 42
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, La/ow7;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget-byte v0, p0, La/ow7;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/ow7;->n:La/pz40;

    .line 4
    .line 5
    iget-object v2, p0, La/ow7;->m:La/t33;

    .line 6
    .line 7
    iget-object v3, p0, La/ow7;->l:La/vne;

    .line 8
    .line 9
    iget-object v4, p0, La/ow7;->k:La/pz40;

    .line 10
    .line 11
    const-string v5, "call to \'resume\' before \'invoke\' with coroutine"

    .line 12
    .line 13
    const/4 v6, 0x1

    .line 14
    const/4 v7, 0x0

    .line 15
    packed-switch v0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    sget-object v0, La/wne;->a:La/wne;

    .line 19
    .line 20
    iget-boolean v8, p0, La/ow7;->j:Z

    .line 21
    .line 22
    if-eqz v8, :cond_1

    .line 23
    .line 24
    if-ne v8, v6, :cond_0

    .line 25
    .line 26
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-static {v5}, La/jf4;->n(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    new-instance p1, La/rip;

    .line 38
    .line 39
    const/16 v5, 0xa

    .line 40
    .line 41
    invoke-direct {p1, v4, v5}, La/rip;-><init>(La/pz40;B)V

    .line 42
    .line 43
    .line 44
    invoke-static {v7, p1}, La/ydx;->V(La/ufk0;Lkotlin/jvm/functions/Function0;)La/vsg0;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    new-instance v4, La/nw7;

    .line 49
    .line 50
    const/4 v5, 0x2

    .line 51
    invoke-direct {v4, v3, v2, v1, v5}, La/nw7;-><init>(La/vne;La/t33;La/pz40;B)V

    .line 52
    .line 53
    .line 54
    iput-boolean v6, p0, La/ow7;->j:Z

    .line 55
    .line 56
    invoke-virtual {p1, v4, p0}, La/vsg0;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    if-ne p0, v0, :cond_2

    .line 61
    .line 62
    move-object v7, v0

    .line 63
    goto :goto_1

    .line 64
    :cond_2
    :goto_0
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 65
    .line 66
    :goto_1
    return-object v7

    .line 67
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 68
    .line 69
    iget-boolean v8, p0, La/ow7;->j:Z

    .line 70
    .line 71
    if-eqz v8, :cond_4

    .line 72
    .line 73
    if-ne v8, v6, :cond_3

    .line 74
    .line 75
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    goto :goto_2

    .line 79
    :cond_3
    invoke-static {v5}, La/jf4;->n(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    goto :goto_3

    .line 83
    :cond_4
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    new-instance p1, La/xx;

    .line 87
    .line 88
    const/16 v5, 0xf

    .line 89
    .line 90
    invoke-direct {p1, v4, v5}, La/xx;-><init>(La/pz40;B)V

    .line 91
    .line 92
    .line 93
    invoke-static {v7, p1}, La/ydx;->V(La/ufk0;Lkotlin/jvm/functions/Function0;)La/vsg0;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    new-instance v4, La/nw7;

    .line 98
    .line 99
    invoke-direct {v4, v3, v2, v1, v6}, La/nw7;-><init>(La/vne;La/t33;La/pz40;B)V

    .line 100
    .line 101
    .line 102
    iput-boolean v6, p0, La/ow7;->j:Z

    .line 103
    .line 104
    invoke-virtual {p1, v4, p0}, La/vsg0;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    if-ne p0, v0, :cond_5

    .line 109
    .line 110
    move-object v7, v0

    .line 111
    goto :goto_3

    .line 112
    :cond_5
    :goto_2
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 113
    .line 114
    :goto_3
    return-object v7

    .line 115
    :pswitch_1
    sget-object v0, La/wne;->a:La/wne;

    .line 116
    .line 117
    iget-boolean v8, p0, La/ow7;->j:Z

    .line 118
    .line 119
    if-eqz v8, :cond_7

    .line 120
    .line 121
    if-ne v8, v6, :cond_6

    .line 122
    .line 123
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    goto :goto_4

    .line 127
    :cond_6
    invoke-static {v5}, La/jf4;->n(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    goto :goto_5

    .line 131
    :cond_7
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    new-instance p1, La/xx;

    .line 135
    .line 136
    const/16 v5, 0xe

    .line 137
    .line 138
    invoke-direct {p1, v4, v5}, La/xx;-><init>(La/pz40;B)V

    .line 139
    .line 140
    .line 141
    invoke-static {v7, p1}, La/ydx;->V(La/ufk0;Lkotlin/jvm/functions/Function0;)La/vsg0;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    new-instance v4, La/nw7;

    .line 146
    .line 147
    const/4 v5, 0x0

    .line 148
    invoke-direct {v4, v3, v2, v1, v5}, La/nw7;-><init>(La/vne;La/t33;La/pz40;B)V

    .line 149
    .line 150
    .line 151
    iput-boolean v6, p0, La/ow7;->j:Z

    .line 152
    .line 153
    invoke-virtual {p1, v4, p0}, La/vsg0;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object p0

    .line 157
    if-ne p0, v0, :cond_8

    .line 158
    .line 159
    move-object v7, v0

    .line 160
    goto :goto_5

    .line 161
    :cond_8
    :goto_4
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 162
    .line 163
    :goto_5
    return-object v7

    .line 164
    nop

    .line 165
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

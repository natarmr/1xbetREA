.class public final La/pig;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/xcz;

.field public final synthetic l:La/pkk0;


# direct methods
.method public synthetic constructor <init>(La/xcz;La/pkk0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/pig;->i:B

    iput-object p1, p0, La/pig;->k:La/xcz;

    iput-object p2, p0, La/pig;->l:La/pkk0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte p1, p0, La/pig;->i:B

    .line 2
    .line 3
    iget-object v0, p0, La/pig;->l:La/pkk0;

    .line 4
    .line 5
    iget-object p0, p0, La/pig;->k:La/xcz;

    .line 6
    .line 7
    packed-switch p1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance p1, La/pig;

    .line 11
    .line 12
    const/4 v1, 0x2

    .line 13
    invoke-direct {p1, p0, v0, p2, v1}, La/pig;-><init>(La/xcz;La/pkk0;La/yje;B)V

    .line 14
    .line 15
    .line 16
    return-object p1

    .line 17
    :pswitch_0
    new-instance p1, La/pig;

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    invoke-direct {p1, p0, v0, p2, v1}, La/pig;-><init>(La/xcz;La/pkk0;La/yje;B)V

    .line 21
    .line 22
    .line 23
    return-object p1

    .line 24
    :pswitch_1
    new-instance p1, La/pig;

    .line 25
    .line 26
    const/4 v1, 0x0

    .line 27
    invoke-direct {p1, p0, v0, p2, v1}, La/pig;-><init>(La/xcz;La/pkk0;La/yje;B)V

    .line 28
    .line 29
    .line 30
    return-object p1

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/pig;->i:B

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
    invoke-virtual {p0, p1, p2}, La/pig;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/pig;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/pig;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/pig;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/pig;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/pig;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, La/pig;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, La/pig;

    .line 41
    .line 42
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, La/pig;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 8

    .line 1
    iget-byte v0, p0, La/pig;->i:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, La/pig;->l:La/pkk0;

    .line 5
    .line 6
    iget-object v3, p0, La/pig;->k:La/xcz;

    .line 7
    .line 8
    const-string v4, "call to \'resume\' before \'invoke\' with coroutine"

    .line 9
    .line 10
    const/4 v5, 0x1

    .line 11
    const/4 v6, 0x0

    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    sget-object v0, La/wne;->a:La/wne;

    .line 16
    .line 17
    iget-boolean v1, p0, La/pig;->j:Z

    .line 18
    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    if-ne v1, v5, :cond_0

    .line 22
    .line 23
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    new-instance p1, La/gg90;

    .line 35
    .line 36
    const/16 v1, 0x14

    .line 37
    .line 38
    invoke-direct {p1, v3, v1}, La/gg90;-><init>(La/xcz;B)V

    .line 39
    .line 40
    .line 41
    invoke-static {v6, p1}, La/ydx;->V(La/ufk0;Lkotlin/jvm/functions/Function0;)La/vsg0;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    new-instance v1, La/oig;

    .line 46
    .line 47
    const/4 v3, 0x4

    .line 48
    invoke-direct {v1, v2, v3}, La/oig;-><init>(La/pkk0;B)V

    .line 49
    .line 50
    .line 51
    iput-boolean v5, p0, La/pig;->j:Z

    .line 52
    .line 53
    invoke-virtual {p1, v1, p0}, La/vsg0;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    if-ne p0, v0, :cond_2

    .line 58
    .line 59
    move-object v6, v0

    .line 60
    goto :goto_1

    .line 61
    :cond_2
    :goto_0
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 62
    .line 63
    :goto_1
    return-object v6

    .line 64
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 65
    .line 66
    iget-boolean v7, p0, La/pig;->j:Z

    .line 67
    .line 68
    if-eqz v7, :cond_4

    .line 69
    .line 70
    if-ne v7, v5, :cond_3

    .line 71
    .line 72
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_3
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    goto :goto_3

    .line 80
    :cond_4
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    iput-boolean v5, p0, La/pig;->j:Z

    .line 84
    .line 85
    sget-object p1, La/xcz;->y:La/v0h0;

    .line 86
    .line 87
    invoke-virtual {v3, v1, v1, p0}, La/xcz;->f(IILa/yje;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    if-ne p0, v0, :cond_5

    .line 92
    .line 93
    move-object v6, v0

    .line 94
    goto :goto_3

    .line 95
    :cond_5
    :goto_2
    if-eqz v2, :cond_6

    .line 96
    .line 97
    check-cast v2, La/r3k;

    .line 98
    .line 99
    invoke-virtual {v2}, La/r3k;->a()V

    .line 100
    .line 101
    .line 102
    :cond_6
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 103
    .line 104
    :goto_3
    return-object v6

    .line 105
    :pswitch_1
    sget-object v0, La/wne;->a:La/wne;

    .line 106
    .line 107
    iget-boolean v7, p0, La/pig;->j:Z

    .line 108
    .line 109
    if-eqz v7, :cond_8

    .line 110
    .line 111
    if-ne v7, v5, :cond_7

    .line 112
    .line 113
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    goto :goto_4

    .line 117
    :cond_7
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    goto :goto_5

    .line 121
    :cond_8
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    new-instance p1, La/eb;

    .line 125
    .line 126
    const/16 v4, 0x13

    .line 127
    .line 128
    invoke-direct {p1, v3, v4}, La/eb;-><init>(La/xcz;B)V

    .line 129
    .line 130
    .line 131
    invoke-static {v6, p1}, La/ydx;->V(La/ufk0;Lkotlin/jvm/functions/Function0;)La/vsg0;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    new-instance v3, La/oig;

    .line 136
    .line 137
    invoke-direct {v3, v2, v1}, La/oig;-><init>(La/pkk0;B)V

    .line 138
    .line 139
    .line 140
    iput-boolean v5, p0, La/pig;->j:Z

    .line 141
    .line 142
    invoke-virtual {p1, v3, p0}, La/vsg0;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object p0

    .line 146
    if-ne p0, v0, :cond_9

    .line 147
    .line 148
    move-object v6, v0

    .line 149
    goto :goto_5

    .line 150
    :cond_9
    :goto_4
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 151
    .line 152
    :goto_5
    return-object v6

    .line 153
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

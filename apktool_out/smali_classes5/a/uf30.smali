.class public final La/uf30;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:B

.field public final synthetic k:Z

.field public final synthetic l:La/xcz;


# direct methods
.method public synthetic constructor <init>(ZLa/xcz;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/uf30;->i:B

    iput-boolean p1, p0, La/uf30;->k:Z

    iput-object p2, p0, La/uf30;->l:La/xcz;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte p1, p0, La/uf30;->i:B

    .line 2
    .line 3
    iget-object v0, p0, La/uf30;->l:La/xcz;

    .line 4
    .line 5
    iget-boolean p0, p0, La/uf30;->k:Z

    .line 6
    .line 7
    packed-switch p1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance p1, La/uf30;

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-direct {p1, p0, v0, p2, v1}, La/uf30;-><init>(ZLa/xcz;La/yje;B)V

    .line 14
    .line 15
    .line 16
    return-object p1

    .line 17
    :pswitch_0
    new-instance p1, La/uf30;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {p1, p0, v0, p2, v1}, La/uf30;-><init>(ZLa/xcz;La/yje;B)V

    .line 21
    .line 22
    .line 23
    return-object p1

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/uf30;->i:B

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
    invoke-virtual {p0, p1, p2}, La/uf30;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/uf30;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/uf30;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/uf30;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/uf30;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/uf30;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 9

    .line 1
    iget-byte v0, p0, La/uf30;->i:B

    .line 2
    .line 3
    iget-boolean v1, p0, La/uf30;->k:Z

    .line 4
    .line 5
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 6
    .line 7
    const/4 v3, 0x2

    .line 8
    iget-object v4, p0, La/uf30;->l:La/xcz;

    .line 9
    .line 10
    const/4 v5, 0x0

    .line 11
    const/4 v6, 0x1

    .line 12
    const/4 v7, 0x0

    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    sget-object v0, La/wne;->a:La/wne;

    .line 17
    .line 18
    iget-byte v8, p0, La/uf30;->j:B

    .line 19
    .line 20
    if-eqz v8, :cond_2

    .line 21
    .line 22
    if-eq v8, v6, :cond_1

    .line 23
    .line 24
    if-ne v8, v3, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    goto :goto_3

    .line 31
    :cond_1
    :goto_0
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    goto :goto_2

    .line 35
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    if-eqz v1, :cond_3

    .line 39
    .line 40
    invoke-virtual {v4}, La/xcz;->j()La/mcz;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    iget p1, p1, La/mcz;->o:I

    .line 45
    .line 46
    sub-int/2addr p1, v6

    .line 47
    if-ltz p1, :cond_4

    .line 48
    .line 49
    iput-byte v6, p0, La/uf30;->j:B

    .line 50
    .line 51
    invoke-virtual {v4, p1, v5, p0}, La/xcz;->l(IILa/yje;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    if-ne p0, v0, :cond_4

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_3
    new-instance p1, La/a7s;

    .line 59
    .line 60
    const/16 v1, 0xf

    .line 61
    .line 62
    invoke-direct {p1, v4, v1}, La/a7s;-><init>(La/xcz;B)V

    .line 63
    .line 64
    .line 65
    invoke-static {v7, p1}, La/ydx;->V(La/ufk0;Lkotlin/jvm/functions/Function0;)La/vsg0;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    new-instance v1, La/tf30;

    .line 70
    .line 71
    invoke-direct {v1, v4, v6}, La/tf30;-><init>(La/xcz;B)V

    .line 72
    .line 73
    .line 74
    iput-byte v3, p0, La/uf30;->j:B

    .line 75
    .line 76
    invoke-virtual {p1, v1, p0}, La/vsg0;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    if-ne p0, v0, :cond_4

    .line 81
    .line 82
    :goto_1
    move-object v7, v0

    .line 83
    goto :goto_3

    .line 84
    :cond_4
    :goto_2
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 85
    .line 86
    :goto_3
    return-object v7

    .line 87
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 88
    .line 89
    iget-byte v8, p0, La/uf30;->j:B

    .line 90
    .line 91
    if-eqz v8, :cond_7

    .line 92
    .line 93
    if-eq v8, v6, :cond_6

    .line 94
    .line 95
    if-ne v8, v3, :cond_5

    .line 96
    .line 97
    goto :goto_4

    .line 98
    :cond_5
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    goto :goto_7

    .line 102
    :cond_6
    :goto_4
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    goto :goto_6

    .line 106
    :cond_7
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    if-eqz v1, :cond_8

    .line 110
    .line 111
    invoke-virtual {v4}, La/xcz;->j()La/mcz;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    iget p1, p1, La/mcz;->o:I

    .line 116
    .line 117
    sub-int/2addr p1, v6

    .line 118
    if-ltz p1, :cond_9

    .line 119
    .line 120
    iput-byte v6, p0, La/uf30;->j:B

    .line 121
    .line 122
    invoke-virtual {v4, p1, v5, p0}, La/xcz;->l(IILa/yje;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    if-ne p0, v0, :cond_9

    .line 127
    .line 128
    goto :goto_5

    .line 129
    :cond_8
    new-instance p1, La/a7s;

    .line 130
    .line 131
    const/16 v1, 0xe

    .line 132
    .line 133
    invoke-direct {p1, v4, v1}, La/a7s;-><init>(La/xcz;B)V

    .line 134
    .line 135
    .line 136
    invoke-static {v7, p1}, La/ydx;->V(La/ufk0;Lkotlin/jvm/functions/Function0;)La/vsg0;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    new-instance v1, La/tf30;

    .line 141
    .line 142
    invoke-direct {v1, v4, v5}, La/tf30;-><init>(La/xcz;B)V

    .line 143
    .line 144
    .line 145
    iput-byte v3, p0, La/uf30;->j:B

    .line 146
    .line 147
    invoke-virtual {p1, v1, p0}, La/vsg0;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object p0

    .line 151
    if-ne p0, v0, :cond_9

    .line 152
    .line 153
    :goto_5
    move-object v7, v0

    .line 154
    goto :goto_7

    .line 155
    :cond_9
    :goto_6
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 156
    .line 157
    :goto_7
    return-object v7

    .line 158
    nop

    .line 159
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.class public final La/ycg0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/xcz;

.field public final synthetic l:F

.field public final synthetic m:F

.field public final synthetic n:F

.field public final synthetic o:La/l7m0;


# direct methods
.method public synthetic constructor <init>(La/l7m0;La/xcz;FFFLa/yje;B)V
    .locals 0

    .line 1
    iput-byte p7, p0, La/ycg0;->i:B

    iput-object p1, p0, La/ycg0;->o:La/l7m0;

    iput-object p2, p0, La/ycg0;->k:La/xcz;

    iput p3, p0, La/ycg0;->l:F

    iput p4, p0, La/ycg0;->m:F

    iput p5, p0, La/ycg0;->n:F

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 9

    .line 1
    iget-byte p1, p0, La/ycg0;->i:B

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, La/ycg0;

    .line 7
    .line 8
    iget v5, p0, La/ycg0;->n:F

    .line 9
    .line 10
    const/4 v7, 0x1

    .line 11
    iget-object v1, p0, La/ycg0;->o:La/l7m0;

    .line 12
    .line 13
    iget-object v2, p0, La/ycg0;->k:La/xcz;

    .line 14
    .line 15
    iget v3, p0, La/ycg0;->l:F

    .line 16
    .line 17
    iget v4, p0, La/ycg0;->m:F

    .line 18
    .line 19
    move-object v6, p2

    .line 20
    invoke-direct/range {v0 .. v7}, La/ycg0;-><init>(La/l7m0;La/xcz;FFFLa/yje;B)V

    .line 21
    .line 22
    .line 23
    return-object v0

    .line 24
    :pswitch_0
    move-object v6, p2

    .line 25
    new-instance v1, La/ycg0;

    .line 26
    .line 27
    iget-object p1, p0, La/ycg0;->o:La/l7m0;

    .line 28
    .line 29
    move-object v2, p1

    .line 30
    check-cast v2, La/pz40;

    .line 31
    .line 32
    move-object v7, v6

    .line 33
    iget v6, p0, La/ycg0;->n:F

    .line 34
    .line 35
    const/4 v8, 0x0

    .line 36
    iget-object v3, p0, La/ycg0;->k:La/xcz;

    .line 37
    .line 38
    iget v4, p0, La/ycg0;->l:F

    .line 39
    .line 40
    iget v5, p0, La/ycg0;->m:F

    .line 41
    .line 42
    invoke-direct/range {v1 .. v8}, La/ycg0;-><init>(La/l7m0;La/xcz;FFFLa/yje;B)V

    .line 43
    .line 44
    .line 45
    return-object v1

    .line 46
    nop

    .line 47
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/ycg0;->i:B

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
    invoke-virtual {p0, p1, p2}, La/ycg0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/ycg0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/ycg0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/ycg0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/ycg0;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/ycg0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 12

    .line 1
    iget-byte v0, p0, La/ycg0;->i:B

    .line 2
    .line 3
    const/16 v1, 0x17

    .line 4
    .line 5
    iget-object v2, p0, La/ycg0;->o:La/l7m0;

    .line 6
    .line 7
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    const/4 v5, 0x0

    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    sget-object v0, La/wne;->a:La/wne;

    .line 15
    .line 16
    iget-boolean v6, p0, La/ycg0;->j:Z

    .line 17
    .line 18
    if-eqz v6, :cond_1

    .line 19
    .line 20
    if-ne v6, v4, :cond_0

    .line 21
    .line 22
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    new-instance p1, La/g7o0;

    .line 34
    .line 35
    invoke-direct {p1, v2, v1}, La/g7o0;-><init>(La/l7m0;B)V

    .line 36
    .line 37
    .line 38
    invoke-static {v5, p1}, La/ydx;->V(La/ufk0;Lkotlin/jvm/functions/Function0;)La/vsg0;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-static {p1}, La/i120;->W(La/gmq;)La/gmq;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    new-instance v5, La/xcg0;

    .line 47
    .line 48
    const/4 v10, 0x0

    .line 49
    const/4 v11, 0x1

    .line 50
    iget-object v6, p0, La/ycg0;->k:La/xcz;

    .line 51
    .line 52
    iget v7, p0, La/ycg0;->l:F

    .line 53
    .line 54
    iget v8, p0, La/ycg0;->m:F

    .line 55
    .line 56
    iget v9, p0, La/ycg0;->n:F

    .line 57
    .line 58
    invoke-direct/range {v5 .. v11}, La/xcg0;-><init>(La/xcz;FFFLa/yje;B)V

    .line 59
    .line 60
    .line 61
    iput-boolean v4, p0, La/ycg0;->j:Z

    .line 62
    .line 63
    invoke-static {p1, v5, p0}, La/slb;->O(La/gmq;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    if-ne p0, v0, :cond_2

    .line 68
    .line 69
    move-object v5, v0

    .line 70
    goto :goto_1

    .line 71
    :cond_2
    :goto_0
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 72
    .line 73
    :goto_1
    return-object v5

    .line 74
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 75
    .line 76
    iget-boolean v6, p0, La/ycg0;->j:Z

    .line 77
    .line 78
    if-eqz v6, :cond_4

    .line 79
    .line 80
    if-ne v6, v4, :cond_3

    .line 81
    .line 82
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_3
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    goto :goto_3

    .line 90
    :cond_4
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    check-cast v2, La/pz40;

    .line 94
    .line 95
    new-instance p1, La/rip;

    .line 96
    .line 97
    invoke-direct {p1, v2, v1}, La/rip;-><init>(La/pz40;B)V

    .line 98
    .line 99
    .line 100
    invoke-static {v5, p1}, La/ydx;->V(La/ufk0;Lkotlin/jvm/functions/Function0;)La/vsg0;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    invoke-static {p1}, La/i120;->W(La/gmq;)La/gmq;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    new-instance v5, La/xcg0;

    .line 109
    .line 110
    const/4 v10, 0x0

    .line 111
    const/4 v11, 0x0

    .line 112
    iget-object v6, p0, La/ycg0;->k:La/xcz;

    .line 113
    .line 114
    iget v7, p0, La/ycg0;->l:F

    .line 115
    .line 116
    iget v8, p0, La/ycg0;->m:F

    .line 117
    .line 118
    iget v9, p0, La/ycg0;->n:F

    .line 119
    .line 120
    invoke-direct/range {v5 .. v11}, La/xcg0;-><init>(La/xcz;FFFLa/yje;B)V

    .line 121
    .line 122
    .line 123
    iput-boolean v4, p0, La/ycg0;->j:Z

    .line 124
    .line 125
    invoke-static {p1, v5, p0}, La/slb;->O(La/gmq;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    if-ne p0, v0, :cond_5

    .line 130
    .line 131
    move-object v5, v0

    .line 132
    goto :goto_3

    .line 133
    :cond_5
    :goto_2
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 134
    .line 135
    :goto_3
    return-object v5

    .line 136
    nop

    .line 137
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

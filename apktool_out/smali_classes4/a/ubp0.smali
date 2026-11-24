.class public final La/ubp0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/wbp0;


# direct methods
.method public synthetic constructor <init>(La/wbp0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/ubp0;->i:B

    iput-object p1, p0, La/ubp0;->k:La/wbp0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/ubp0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/ubp0;->k:La/wbp0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/ubp0;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/ubp0;-><init>(La/wbp0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance v0, La/ubp0;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-direct {v0, p0, p2, v1}, La/ubp0;-><init>(La/wbp0;La/yje;B)V

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
    iput-boolean p0, v0, La/ubp0;->j:Z

    .line 28
    .line 29
    return-object v0

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/ubp0;->i:B

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
    invoke-virtual {p0, p1, p2}, La/ubp0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/ubp0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/ubp0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/ubp0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, La/ubp0;

    .line 35
    .line 36
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    invoke-virtual {p0, p1}, La/ubp0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-byte v0, p0, La/ubp0;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/ubp0;->k:La/wbp0;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    sget-object v0, La/wne;->a:La/wne;

    .line 10
    .line 11
    iget-boolean v3, p0, La/ubp0;->j:Z

    .line 12
    .line 13
    const/4 v4, 0x1

    .line 14
    if-eqz v3, :cond_1

    .line 15
    .line 16
    if-ne v3, v4, :cond_0

    .line 17
    .line 18
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 23
    .line 24
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    move-object p1, v2

    .line 28
    goto :goto_0

    .line 29
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    iget-object p1, v1, La/wbp0;->r:La/reu;

    .line 33
    .line 34
    iget-object v1, v1, La/wbp0;->p:Lorg/xplatform/cyber/section/api/team_details/presentation/TeamDetailsParams;

    .line 35
    .line 36
    iget-wide v2, v1, Lorg/xplatform/cyber/section/api/team_details/presentation/TeamDetailsParams;->a:J

    .line 37
    .line 38
    iget-object v1, v1, Lorg/xplatform/cyber/section/api/team_details/presentation/TeamDetailsParams;->c:Ljava/lang/String;

    .line 39
    .line 40
    iput-boolean v4, p0, La/ubp0;->j:Z

    .line 41
    .line 42
    iget-object p1, p1, La/reu;->b:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p1, La/epi0;

    .line 45
    .line 46
    invoke-virtual {p1, v2, v3, p0, v1}, La/epi0;->d(JLa/zje;Ljava/lang/String;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    if-ne p1, v0, :cond_2

    .line 51
    .line 52
    move-object p1, v0

    .line 53
    :cond_2
    :goto_0
    return-object p1

    .line 54
    :pswitch_0
    iget-boolean v4, p0, La/ubp0;->j:Z

    .line 55
    .line 56
    sget-object p0, La/wne;->a:La/wne;

    .line 57
    .line 58
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    sget p0, La/wbp0;->L:I

    .line 62
    .line 63
    iget-object p0, v1, La/i3t0;->i:La/ocj;

    .line 64
    .line 65
    iget-object p0, p0, La/ocj;->a:La/p7m0;

    .line 66
    .line 67
    :cond_3
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    move-object v3, p1

    .line 75
    check-cast v3, La/mbp0;

    .line 76
    .line 77
    const/4 v11, 0x0

    .line 78
    const/16 v12, 0x7ffe

    .line 79
    .line 80
    const/4 v5, 0x0

    .line 81
    const/4 v6, 0x0

    .line 82
    const/4 v7, 0x0

    .line 83
    const/4 v8, 0x0

    .line 84
    const/4 v9, 0x0

    .line 85
    const/4 v10, 0x0

    .line 86
    invoke-static/range {v3 .. v12}, La/mbp0;->a(La/mbp0;ZLa/o9p0;Ljava/util/Map;La/fbp0;La/e9p0;La/obp0;Ljava/lang/Integer;Ljava/util/ArrayList;I)La/mbp0;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    invoke-virtual {p0, p1, v0}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result p1

    .line 94
    if-eqz p1, :cond_3

    .line 95
    .line 96
    if-eqz v4, :cond_5

    .line 97
    .line 98
    invoke-virtual {v1}, La/i3t0;->D()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    check-cast p0, La/mbp0;

    .line 103
    .line 104
    iget-object p0, p0, La/mbp0;->h:La/fbp0;

    .line 105
    .line 106
    instance-of p0, p0, La/dbp0;

    .line 107
    .line 108
    const/4 p1, 0x3

    .line 109
    if-eqz p0, :cond_4

    .line 110
    .line 111
    iget-object p0, v1, La/wbp0;->I:La/bby;

    .line 112
    .line 113
    invoke-static {p0}, La/e3c;->n(La/bby;)V

    .line 114
    .line 115
    .line 116
    new-instance p0, La/vbp0;

    .line 117
    .line 118
    invoke-direct {p0, v1, v2}, La/vbp0;-><init>(La/wbp0;La/yje;)V

    .line 119
    .line 120
    .line 121
    invoke-static {v1, v2, v2, p0, p1}, La/i3t0;->K(La/i3t0;La/lne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)La/bby;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    iput-object p0, v1, La/wbp0;->I:La/bby;

    .line 126
    .line 127
    goto :goto_1

    .line 128
    :cond_4
    iget-object p0, v1, La/wbp0;->J:La/bby;

    .line 129
    .line 130
    invoke-static {p0}, La/e3c;->n(La/bby;)V

    .line 131
    .line 132
    .line 133
    new-instance p0, La/hhb0;

    .line 134
    .line 135
    const/16 v0, 0x16

    .line 136
    .line 137
    invoke-direct {p0, v1, v2, v0}, La/hhb0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 138
    .line 139
    .line 140
    invoke-static {v1, v2, v2, p0, p1}, La/i3t0;->K(La/i3t0;La/lne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)La/bby;

    .line 141
    .line 142
    .line 143
    move-result-object p0

    .line 144
    iput-object p0, v1, La/wbp0;->J:La/bby;

    .line 145
    .line 146
    :cond_5
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 147
    .line 148
    return-object p0

    .line 149
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

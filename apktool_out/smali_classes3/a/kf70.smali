.class public final La/kf70;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/qf70;


# direct methods
.method public synthetic constructor <init>(La/qf70;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/kf70;->i:B

    iput-object p1, p0, La/kf70;->k:La/qf70;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/kf70;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/kf70;->k:La/qf70;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/kf70;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/kf70;-><init>(La/qf70;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/kf70;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/kf70;-><init>(La/qf70;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/kf70;->i:B

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
    invoke-virtual {p0, p1, p2}, La/kf70;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/kf70;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/kf70;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/kf70;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/kf70;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/kf70;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 8

    .line 1
    iget-byte v0, p0, La/kf70;->i:B

    .line 2
    .line 3
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    iget-object v3, p0, La/kf70;->k:La/qf70;

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    sget-object v0, La/wne;->a:La/wne;

    .line 13
    .line 14
    iget-boolean v5, p0, La/kf70;->j:Z

    .line 15
    .line 16
    if-eqz v5, :cond_1

    .line 17
    .line 18
    if-ne v5, v2, :cond_0

    .line 19
    .line 20
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iget-object p1, v3, La/qf70;->n:La/qpt;

    .line 32
    .line 33
    invoke-virtual {p1}, La/qpt;->a()La/ql5;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    if-eqz p1, :cond_2

    .line 38
    .line 39
    new-instance v1, La/nf60;

    .line 40
    .line 41
    const/16 v5, 0x10

    .line 42
    .line 43
    invoke-direct {v1, v3, v4, v5}, La/nf60;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 44
    .line 45
    .line 46
    iput-boolean v2, p0, La/kf70;->j:Z

    .line 47
    .line 48
    const/4 v2, 0x0

    .line 49
    invoke-virtual {v3, p1, v2, v1, p0}, La/qf70;->J(La/ql5;ZLkotlin/jvm/functions/Function2;La/zje;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    if-ne p0, v0, :cond_2

    .line 54
    .line 55
    move-object v4, v0

    .line 56
    goto :goto_1

    .line 57
    :cond_2
    :goto_0
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 58
    .line 59
    :goto_1
    return-object v4

    .line 60
    :pswitch_0
    iget-object v0, v3, La/qf70;->E:La/y5s;

    .line 61
    .line 62
    sget-object v5, La/wne;->a:La/wne;

    .line 63
    .line 64
    iget-boolean v6, p0, La/kf70;->j:Z

    .line 65
    .line 66
    if-eqz v6, :cond_4

    .line 67
    .line 68
    if-ne v6, v2, :cond_3

    .line 69
    .line 70
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_3
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    goto :goto_3

    .line 78
    :cond_4
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    iget-object p1, v3, La/qf70;->A:La/hs60;

    .line 82
    .line 83
    iget-object v1, v0, La/y5s;->a:La/s470;

    .line 84
    .line 85
    invoke-virtual {v1}, La/s470;->a()J

    .line 86
    .line 87
    .line 88
    move-result-wide v6

    .line 89
    sget-object v1, La/zn60;->b:La/zn60;

    .line 90
    .line 91
    invoke-virtual {p1, v6, v7}, La/hs60;->b(J)V

    .line 92
    .line 93
    .line 94
    iget-object p1, v3, La/qf70;->B:La/l7k;

    .line 95
    .line 96
    iget-object v0, v0, La/y5s;->a:La/s470;

    .line 97
    .line 98
    invoke-virtual {v0}, La/s470;->a()J

    .line 99
    .line 100
    .line 101
    move-result-wide v0

    .line 102
    long-to-int v0, v0

    .line 103
    sget-object v1, La/y1p;->b:La/y1p;

    .line 104
    .line 105
    iget-object v1, v3, La/qf70;->C:La/cmt;

    .line 106
    .line 107
    invoke-virtual {v1}, La/cmt;->g()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    const-string v4, "games"

    .line 112
    .line 113
    invoke-virtual {p1, v0, v4, v1}, La/l7k;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    iput-boolean v2, p0, La/kf70;->j:Z

    .line 117
    .line 118
    invoke-virtual {v3, p0}, La/qf70;->z(La/zje;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    if-ne p1, v5, :cond_5

    .line 123
    .line 124
    move-object v4, v5

    .line 125
    goto :goto_3

    .line 126
    :cond_5
    :goto_2
    check-cast p1, La/ql5;

    .line 127
    .line 128
    iget-object p0, v3, La/qf70;->w:La/v88;

    .line 129
    .line 130
    iget-object v0, v3, La/qf70;->b:La/i1w0;

    .line 131
    .line 132
    iget-wide v3, p1, La/ql5;->a:J

    .line 133
    .line 134
    invoke-virtual {p0, v0, v2, v3, v4}, La/v88;->a(La/i1w0;ZJ)V

    .line 135
    .line 136
    .line 137
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 138
    .line 139
    :goto_3
    return-object v4

    .line 140
    nop

    .line 141
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

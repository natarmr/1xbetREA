.class public final La/u5b;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/w5b;


# direct methods
.method public synthetic constructor <init>(La/w5b;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/u5b;->i:B

    iput-object p1, p0, La/u5b;->k:La/w5b;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/u5b;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/u5b;->k:La/w5b;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/u5b;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/u5b;-><init>(La/w5b;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/u5b;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/u5b;-><init>(La/w5b;La/yje;B)V

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
    iget-byte v0, p0, La/u5b;->i:B

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
    invoke-virtual {p0, p1, p2}, La/u5b;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/u5b;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/u5b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/u5b;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/u5b;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/u5b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget-byte v0, p0, La/u5b;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/u5b;->k:La/w5b;

    .line 4
    .line 5
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x1

    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    sget-object v0, La/wne;->a:La/wne;

    .line 13
    .line 14
    iget-boolean v5, p0, La/u5b;->j:Z

    .line 15
    .line 16
    if-eqz v5, :cond_1

    .line 17
    .line 18
    if-ne v5, v4, :cond_0

    .line 19
    .line 20
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

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
    iget-object p1, v1, La/w5b;->v:La/urt;

    .line 32
    .line 33
    sget-object v1, La/tl5;->a:La/tl5;

    .line 34
    .line 35
    iput-boolean v4, p0, La/u5b;->j:Z

    .line 36
    .line 37
    iget-object p1, p1, La/urt;->a:La/rrd;

    .line 38
    .line 39
    invoke-virtual {p1, v1, p0}, La/rrd;->i(La/tl5;La/zje;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    if-ne p0, v0, :cond_2

    .line 44
    .line 45
    move-object v3, v0

    .line 46
    goto :goto_1

    .line 47
    :cond_2
    :goto_0
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 48
    .line 49
    :goto_1
    return-object v3

    .line 50
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 51
    .line 52
    iget-boolean v5, p0, La/u5b;->j:Z

    .line 53
    .line 54
    if-eqz v5, :cond_4

    .line 55
    .line 56
    if-ne v5, v4, :cond_3

    .line 57
    .line 58
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    goto :goto_3

    .line 62
    :cond_3
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    goto :goto_4

    .line 66
    :cond_4
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    iget-object p1, v1, La/w5b;->t:La/phf0;

    .line 70
    .line 71
    invoke-virtual {p1}, La/phf0;->m()La/i89;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    iget-object v2, v1, La/w5b;->u:La/jqt;

    .line 76
    .line 77
    invoke-virtual {v2}, La/jqt;->a()La/h2c;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    new-instance v5, La/ko0;

    .line 82
    .line 83
    const/4 v6, 0x5

    .line 84
    invoke-direct {v5, v1, v3, v6}, La/ko0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 85
    .line 86
    .line 87
    new-instance v6, La/f5b;

    .line 88
    .line 89
    invoke-direct {v6, v1, v4}, La/f5b;-><init>(Ljava/lang/Object;B)V

    .line 90
    .line 91
    .line 92
    iput-boolean v4, p0, La/u5b;->j:Z

    .line 93
    .line 94
    const/4 v1, 0x2

    .line 95
    new-array v1, v1, [La/gmq;

    .line 96
    .line 97
    const/4 v7, 0x0

    .line 98
    aput-object p1, v1, v7

    .line 99
    .line 100
    aput-object v2, v1, v4

    .line 101
    .line 102
    sget-object p1, La/pul;->j:La/pul;

    .line 103
    .line 104
    new-instance v2, La/kh1;

    .line 105
    .line 106
    const/16 v4, 0x9

    .line 107
    .line 108
    invoke-direct {v2, v5, v3, v4}, La/kh1;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 109
    .line 110
    .line 111
    invoke-static {p0, v6, v2, p1, v1}, La/tdc;->G(La/yje;La/kmq;La/xdr;Lkotlin/jvm/functions/Function0;[La/gmq;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    if-ne p0, v0, :cond_5

    .line 116
    .line 117
    goto :goto_2

    .line 118
    :cond_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 119
    .line 120
    :goto_2
    if-ne p0, v0, :cond_6

    .line 121
    .line 122
    move-object v3, v0

    .line 123
    goto :goto_4

    .line 124
    :cond_6
    :goto_3
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 125
    .line 126
    :goto_4
    return-object v3

    .line 127
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

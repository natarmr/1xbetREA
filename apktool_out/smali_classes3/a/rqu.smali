.class public final La/rqu;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public synthetic k:La/kmq;

.field public synthetic l:Ljava/lang/Object;

.field public final synthetic m:La/rrd;

.field public final synthetic n:Z


# direct methods
.method public synthetic constructor <init>(La/yje;La/rrd;ZB)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/rqu;->i:B

    iput-object p2, p0, La/rqu;->m:La/rrd;

    iput-boolean p3, p0, La/rqu;->n:Z

    const/4 p2, 0x3

    invoke-direct {p0, p2, p1}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, La/rqu;->i:B

    .line 2
    .line 3
    iget-boolean v1, p0, La/rqu;->n:Z

    .line 4
    .line 5
    iget-object p0, p0, La/rqu;->m:La/rrd;

    .line 6
    .line 7
    check-cast p1, La/kmq;

    .line 8
    .line 9
    check-cast p3, La/yje;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    new-instance v0, La/rqu;

    .line 15
    .line 16
    const/4 v2, 0x1

    .line 17
    invoke-direct {v0, p3, p0, v1, v2}, La/rqu;-><init>(La/yje;La/rrd;ZB)V

    .line 18
    .line 19
    .line 20
    iput-object p1, v0, La/rqu;->k:La/kmq;

    .line 21
    .line 22
    iput-object p2, v0, La/rqu;->l:Ljava/lang/Object;

    .line 23
    .line 24
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 25
    .line 26
    invoke-virtual {v0, p0}, La/rqu;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0

    .line 31
    :pswitch_0
    new-instance v0, La/rqu;

    .line 32
    .line 33
    const/4 v2, 0x0

    .line 34
    invoke-direct {v0, p3, p0, v1, v2}, La/rqu;-><init>(La/yje;La/rrd;ZB)V

    .line 35
    .line 36
    .line 37
    iput-object p1, v0, La/rqu;->k:La/kmq;

    .line 38
    .line 39
    iput-object p2, v0, La/rqu;->l:Ljava/lang/Object;

    .line 40
    .line 41
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 42
    .line 43
    invoke-virtual {v0, p0}, La/rqu;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0

    .line 48
    nop

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, La/rqu;->i:B

    .line 2
    .line 3
    iget-boolean v1, p0, La/rqu;->n:Z

    .line 4
    .line 5
    iget-object v2, p0, La/rqu;->m:La/rrd;

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
    iget-boolean v6, p0, La/rqu;->j:Z

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
    iget-object p1, p0, La/rqu;->k:La/kmq;

    .line 34
    .line 35
    iget-object v3, p0, La/rqu;->l:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v3, Ljava/util/List;

    .line 38
    .line 39
    iget-object v6, v2, La/rrd;->d:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v6, La/v7i;

    .line 42
    .line 43
    iget-object v2, v2, La/rrd;->h:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v2, La/pru;

    .line 46
    .line 47
    invoke-virtual {v2}, La/pru;->a()La/sff0;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    iget-boolean v2, v2, La/sff0;->O1:Z

    .line 52
    .line 53
    invoke-virtual {v6, v3, v1, v2}, La/v7i;->k(Ljava/util/List;ZZ)La/acu;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    iput-object v5, p0, La/rqu;->k:La/kmq;

    .line 58
    .line 59
    iput-object v5, p0, La/rqu;->l:Ljava/lang/Object;

    .line 60
    .line 61
    iput-boolean v4, p0, La/rqu;->j:Z

    .line 62
    .line 63
    invoke-static {p1, v1, p0}, La/slb;->Q(La/kmq;La/gmq;La/yje;)Ljava/lang/Object;

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
    iget-boolean v6, p0, La/rqu;->j:Z

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
    iget-object p1, p0, La/rqu;->k:La/kmq;

    .line 94
    .line 95
    iget-object v3, p0, La/rqu;->l:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v3, Lkotlin/collections/IndexedValue;

    .line 98
    .line 99
    iget v6, v3, Lkotlin/collections/IndexedValue;->a:I

    .line 100
    .line 101
    iget-object v3, v3, Lkotlin/collections/IndexedValue;->b:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v3, Ljava/util/List;

    .line 104
    .line 105
    iget-object v6, v2, La/rrd;->d:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v6, La/v7i;

    .line 108
    .line 109
    iget-object v2, v2, La/rrd;->h:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast v2, La/pru;

    .line 112
    .line 113
    invoke-virtual {v2}, La/pru;->a()La/sff0;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    iget-boolean v2, v2, La/sff0;->O1:Z

    .line 118
    .line 119
    invoke-virtual {v6, v3, v1, v2}, La/v7i;->k(Ljava/util/List;ZZ)La/acu;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    iput-object v5, p0, La/rqu;->k:La/kmq;

    .line 124
    .line 125
    iput-object v5, p0, La/rqu;->l:Ljava/lang/Object;

    .line 126
    .line 127
    iput-boolean v4, p0, La/rqu;->j:Z

    .line 128
    .line 129
    invoke-static {p1, v1, p0}, La/slb;->Q(La/kmq;La/gmq;La/yje;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    if-ne p0, v0, :cond_5

    .line 134
    .line 135
    move-object v5, v0

    .line 136
    goto :goto_3

    .line 137
    :cond_5
    :goto_2
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 138
    .line 139
    :goto_3
    return-object v5

    .line 140
    nop

    .line 141
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

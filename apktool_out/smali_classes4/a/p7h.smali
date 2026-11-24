.class public final La/p7h;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public synthetic k:La/kmq;

.field public synthetic l:Ljava/lang/Object;

.field public final synthetic m:La/a8h;


# direct methods
.method public synthetic constructor <init>(BLa/yje;La/a8h;)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/p7h;->i:B

    iput-object p3, p0, La/p7h;->m:La/a8h;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/p7h;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/p7h;->m:La/a8h;

    .line 4
    .line 5
    check-cast p1, La/kmq;

    .line 6
    .line 7
    check-cast p3, La/yje;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    new-instance v0, La/p7h;

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    invoke-direct {v0, v1, p3, p0}, La/p7h;-><init>(BLa/yje;La/a8h;)V

    .line 16
    .line 17
    .line 18
    iput-object p1, v0, La/p7h;->k:La/kmq;

    .line 19
    .line 20
    iput-object p2, v0, La/p7h;->l:Ljava/lang/Object;

    .line 21
    .line 22
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 23
    .line 24
    invoke-virtual {v0, p0}, La/p7h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0

    .line 29
    :pswitch_0
    new-instance v0, La/p7h;

    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    invoke-direct {v0, v1, p3, p0}, La/p7h;-><init>(BLa/yje;La/a8h;)V

    .line 33
    .line 34
    .line 35
    iput-object p1, v0, La/p7h;->k:La/kmq;

    .line 36
    .line 37
    iput-object p2, v0, La/p7h;->l:Ljava/lang/Object;

    .line 38
    .line 39
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 40
    .line 41
    invoke-virtual {v0, p0}, La/p7h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    return-object p0

    .line 46
    nop

    .line 47
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/p7h;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/p7h;->m:La/a8h;

    .line 4
    .line 5
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 6
    .line 7
    const/4 v3, 0x1

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
    iget-boolean v5, p0, La/p7h;->j:Z

    .line 15
    .line 16
    if-eqz v5, :cond_1

    .line 17
    .line 18
    if-ne v5, v3, :cond_0

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
    iget-object p1, p0, La/p7h;->k:La/kmq;

    .line 32
    .line 33
    iget-object v2, p0, La/p7h;->l:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v2, Ljava/lang/Number;

    .line 36
    .line 37
    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    .line 38
    .line 39
    .line 40
    move-result-wide v5

    .line 41
    iget-object v1, v1, La/a8h;->w:La/ub60;

    .line 42
    .line 43
    iget-object v1, v1, La/ub60;->a:La/hoo;

    .line 44
    .line 45
    iget-object v1, v1, La/hoo;->a:La/vno;

    .line 46
    .line 47
    iget-object v1, v1, La/vno;->b:La/p7m0;

    .line 48
    .line 49
    new-instance v2, La/rno;

    .line 50
    .line 51
    invoke-direct {v2, v1, v5, v6, v3}, La/rno;-><init>(La/p7m0;JB)V

    .line 52
    .line 53
    .line 54
    new-instance v1, La/t7h;

    .line 55
    .line 56
    invoke-direct {v1, v2, v5, v6, v3}, La/t7h;-><init>(La/gmq;JB)V

    .line 57
    .line 58
    .line 59
    iput-object v4, p0, La/p7h;->k:La/kmq;

    .line 60
    .line 61
    iput-object v4, p0, La/p7h;->l:Ljava/lang/Object;

    .line 62
    .line 63
    iput-boolean v3, p0, La/p7h;->j:Z

    .line 64
    .line 65
    invoke-static {p1, v1, p0}, La/slb;->Q(La/kmq;La/gmq;La/yje;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    if-ne p0, v0, :cond_2

    .line 70
    .line 71
    move-object v4, v0

    .line 72
    goto :goto_1

    .line 73
    :cond_2
    :goto_0
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 74
    .line 75
    :goto_1
    return-object v4

    .line 76
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 77
    .line 78
    iget-boolean v5, p0, La/p7h;->j:Z

    .line 79
    .line 80
    if-eqz v5, :cond_4

    .line 81
    .line 82
    if-ne v5, v3, :cond_3

    .line 83
    .line 84
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_3
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    goto :goto_3

    .line 92
    :cond_4
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    iget-object p1, p0, La/p7h;->k:La/kmq;

    .line 96
    .line 97
    iget-object v2, p0, La/p7h;->l:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v2, Ljava/lang/Number;

    .line 100
    .line 101
    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    .line 102
    .line 103
    .line 104
    move-result-wide v5

    .line 105
    iget-object v1, v1, La/a8h;->x:La/qmo;

    .line 106
    .line 107
    iget-object v1, v1, La/qmo;->a:La/hoo;

    .line 108
    .line 109
    iget-object v1, v1, La/hoo;->a:La/vno;

    .line 110
    .line 111
    iget-object v1, v1, La/vno;->c:La/p7m0;

    .line 112
    .line 113
    new-instance v2, La/rno;

    .line 114
    .line 115
    const/4 v7, 0x0

    .line 116
    invoke-direct {v2, v1, v5, v6, v7}, La/rno;-><init>(La/p7m0;JB)V

    .line 117
    .line 118
    .line 119
    invoke-static {v2}, La/i120;->W(La/gmq;)La/gmq;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    new-instance v2, La/t7h;

    .line 124
    .line 125
    invoke-direct {v2, v1, v5, v6, v7}, La/t7h;-><init>(La/gmq;JB)V

    .line 126
    .line 127
    .line 128
    iput-object v4, p0, La/p7h;->k:La/kmq;

    .line 129
    .line 130
    iput-object v4, p0, La/p7h;->l:Ljava/lang/Object;

    .line 131
    .line 132
    iput-boolean v3, p0, La/p7h;->j:Z

    .line 133
    .line 134
    invoke-static {p1, v2, p0}, La/slb;->Q(La/kmq;La/gmq;La/yje;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object p0

    .line 138
    if-ne p0, v0, :cond_5

    .line 139
    .line 140
    move-object v4, v0

    .line 141
    goto :goto_3

    .line 142
    :cond_5
    :goto_2
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 143
    .line 144
    :goto_3
    return-object v4

    .line 145
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.class public final La/n2v;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:La/kmq;

.field public k:B

.field public synthetic l:Ljava/lang/Object;

.field public final synthetic m:La/wdu;

.field public final synthetic n:La/gu1;


# direct methods
.method public synthetic constructor <init>(La/wdu;La/gu1;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/n2v;->i:B

    iput-object p1, p0, La/n2v;->m:La/wdu;

    iput-object p2, p0, La/n2v;->n:La/gu1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 3

    .line 1
    iget-byte v0, p0, La/n2v;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/n2v;->n:La/gu1;

    .line 4
    .line 5
    iget-object p0, p0, La/n2v;->m:La/wdu;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance v0, La/n2v;

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    invoke-direct {v0, p0, v1, p2, v2}, La/n2v;-><init>(La/wdu;La/gu1;La/yje;B)V

    .line 14
    .line 15
    .line 16
    iput-object p1, v0, La/n2v;->l:Ljava/lang/Object;

    .line 17
    .line 18
    return-object v0

    .line 19
    :pswitch_0
    new-instance v0, La/n2v;

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    invoke-direct {v0, p0, v1, p2, v2}, La/n2v;-><init>(La/wdu;La/gu1;La/yje;B)V

    .line 23
    .line 24
    .line 25
    iput-object p1, v0, La/n2v;->l:Ljava/lang/Object;

    .line 26
    .line 27
    return-object v0

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/n2v;->i:B

    .line 2
    .line 3
    check-cast p1, La/kmq;

    .line 4
    .line 5
    check-cast p2, La/yje;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/n2v;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/n2v;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/n2v;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/n2v;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/n2v;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/n2v;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget-byte v0, p0, La/n2v;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/n2v;->n:La/gu1;

    .line 4
    .line 5
    iget-object v2, p0, La/n2v;->m:La/wdu;

    .line 6
    .line 7
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    const/4 v5, 0x2

    .line 11
    const/4 v6, 0x0

    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, La/n2v;->l:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, La/kmq;

    .line 18
    .line 19
    sget-object v7, La/wne;->a:La/wne;

    .line 20
    .line 21
    iget-byte v8, p0, La/n2v;->k:B

    .line 22
    .line 23
    if-eqz v8, :cond_2

    .line 24
    .line 25
    if-eq v8, v4, :cond_1

    .line 26
    .line 27
    if-ne v8, v5, :cond_0

    .line 28
    .line 29
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    goto :goto_2

    .line 33
    :cond_0
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    goto :goto_3

    .line 37
    :cond_1
    iget-object v0, p0, La/n2v;->j:La/kmq;

    .line 38
    .line 39
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    iget-object p1, v2, La/wdu;->f:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast p1, La/r2v;

    .line 49
    .line 50
    iget-wide v1, v1, La/gu1;->a:J

    .line 51
    .line 52
    iput-object v6, p0, La/n2v;->l:Ljava/lang/Object;

    .line 53
    .line 54
    iput-object v0, p0, La/n2v;->j:La/kmq;

    .line 55
    .line 56
    iput-byte v4, p0, La/n2v;->k:B

    .line 57
    .line 58
    iget-object p1, p1, La/r2v;->a:La/j9s0;

    .line 59
    .line 60
    invoke-virtual {p1, v1, v2, p0}, La/j9s0;->b(JLa/zje;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    if-ne p1, v7, :cond_3

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_3
    :goto_0
    iput-object v6, p0, La/n2v;->l:Ljava/lang/Object;

    .line 68
    .line 69
    iput-object v6, p0, La/n2v;->j:La/kmq;

    .line 70
    .line 71
    iput-byte v5, p0, La/n2v;->k:B

    .line 72
    .line 73
    invoke-interface {v0, p1, p0}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    if-ne p0, v7, :cond_4

    .line 78
    .line 79
    :goto_1
    move-object v6, v7

    .line 80
    goto :goto_3

    .line 81
    :cond_4
    :goto_2
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 82
    .line 83
    :goto_3
    return-object v6

    .line 84
    :pswitch_0
    iget-object v0, p0, La/n2v;->l:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v0, La/kmq;

    .line 87
    .line 88
    sget-object v7, La/wne;->a:La/wne;

    .line 89
    .line 90
    iget-byte v8, p0, La/n2v;->k:B

    .line 91
    .line 92
    if-eqz v8, :cond_7

    .line 93
    .line 94
    if-eq v8, v4, :cond_6

    .line 95
    .line 96
    if-ne v8, v5, :cond_5

    .line 97
    .line 98
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    goto :goto_6

    .line 102
    :cond_5
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    goto :goto_7

    .line 106
    :cond_6
    iget-object v0, p0, La/n2v;->j:La/kmq;

    .line 107
    .line 108
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    goto :goto_4

    .line 112
    :cond_7
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    iget-object p1, v2, La/wdu;->i:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast p1, La/u8u;

    .line 118
    .line 119
    iget-wide v2, v1, La/gu1;->a:J

    .line 120
    .line 121
    invoke-static {v1}, La/ny9;->P(La/gu1;)Ljava/lang/Long;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    iput-object v6, p0, La/n2v;->l:Ljava/lang/Object;

    .line 126
    .line 127
    iput-object v0, p0, La/n2v;->j:La/kmq;

    .line 128
    .line 129
    iput-byte v4, p0, La/n2v;->k:B

    .line 130
    .line 131
    invoke-virtual {p1, v2, v3, p0, v1}, La/u8u;->u(JLa/zje;Ljava/lang/Long;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    if-ne p1, v7, :cond_8

    .line 136
    .line 137
    goto :goto_5

    .line 138
    :cond_8
    :goto_4
    iput-object v6, p0, La/n2v;->l:Ljava/lang/Object;

    .line 139
    .line 140
    iput-object v6, p0, La/n2v;->j:La/kmq;

    .line 141
    .line 142
    iput-byte v5, p0, La/n2v;->k:B

    .line 143
    .line 144
    invoke-interface {v0, p1, p0}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    if-ne p0, v7, :cond_9

    .line 149
    .line 150
    :goto_5
    move-object v6, v7

    .line 151
    goto :goto_7

    .line 152
    :cond_9
    :goto_6
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 153
    .line 154
    :goto_7
    return-object v6

    .line 155
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.class public final La/keq0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/oeq0;


# direct methods
.method public synthetic constructor <init>(La/oeq0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/keq0;->i:B

    iput-object p1, p0, La/keq0;->k:La/oeq0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/keq0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/keq0;->k:La/oeq0;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/keq0;

    .line 9
    .line 10
    const/4 v0, 0x2

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/keq0;-><init>(La/oeq0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/keq0;

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/keq0;-><init>(La/oeq0;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    :pswitch_1
    new-instance p1, La/keq0;

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    invoke-direct {p1, p0, p2, v0}, La/keq0;-><init>(La/oeq0;La/yje;B)V

    .line 26
    .line 27
    .line 28
    return-object p1

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/keq0;->i:B

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
    invoke-virtual {p0, p1, p2}, La/keq0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/keq0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/keq0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/keq0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/keq0;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/keq0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, La/keq0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, La/keq0;

    .line 41
    .line 42
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, La/keq0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 7

    .line 1
    iget-byte v0, p0, La/keq0;->i:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 5
    .line 6
    const/4 v3, 0x1

    .line 7
    iget-object v4, p0, La/keq0;->k:La/oeq0;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-object v0, v4, La/oeq0;->d:La/wsf0;

    .line 13
    .line 14
    sget-object v5, La/wne;->a:La/wne;

    .line 15
    .line 16
    iget-boolean v6, p0, La/keq0;->j:Z

    .line 17
    .line 18
    if-eqz v6, :cond_1

    .line 19
    .line 20
    if-ne v6, v3, :cond_0

    .line 21
    .line 22
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

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
    iget-object p1, v0, La/wsf0;->b:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast p1, La/g45;

    .line 36
    .line 37
    invoke-virtual {p1}, La/g45;->G()La/khf0;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    sget-object v1, La/bm5;->d:La/bm5;

    .line 42
    .line 43
    iput-boolean v3, p0, La/keq0;->j:Z

    .line 44
    .line 45
    sget-object v2, La/tl5;->c:La/tl5;

    .line 46
    .line 47
    invoke-virtual {p1, v1, v2, p0}, La/khf0;->A(La/bm5;La/tl5;La/yje;)Ljava/io/Serializable;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    if-ne p1, v5, :cond_2

    .line 52
    .line 53
    move-object v1, v5

    .line 54
    goto :goto_1

    .line 55
    :cond_2
    :goto_0
    check-cast p1, La/ql5;

    .line 56
    .line 57
    invoke-virtual {v0}, La/wsf0;->s()La/trm0;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    sget-object v0, La/bm5;->d:La/bm5;

    .line 62
    .line 63
    invoke-virtual {p0, v0, p1}, La/trm0;->l(La/bm5;La/ql5;)V

    .line 64
    .line 65
    .line 66
    iget-object p0, v4, La/oeq0;->c:La/v88;

    .line 67
    .line 68
    iget-object v0, v4, La/oeq0;->b:La/i1w0;

    .line 69
    .line 70
    iget-wide v1, p1, La/ql5;->a:J

    .line 71
    .line 72
    invoke-virtual {p0, v0, v3, v1, v2}, La/v88;->a(La/i1w0;ZJ)V

    .line 73
    .line 74
    .line 75
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 76
    .line 77
    :goto_1
    return-object v1

    .line 78
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 79
    .line 80
    iget-boolean v5, p0, La/keq0;->j:Z

    .line 81
    .line 82
    if-eqz v5, :cond_4

    .line 83
    .line 84
    if-ne v5, v3, :cond_3

    .line 85
    .line 86
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_3
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    goto :goto_3

    .line 94
    :cond_4
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    iget-object p1, v4, La/oeq0;->k:La/i5m0;

    .line 98
    .line 99
    iput-boolean v3, p0, La/keq0;->j:Z

    .line 100
    .line 101
    invoke-virtual {p1, p0}, La/i5m0;->b(La/yje;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    if-ne p0, v0, :cond_5

    .line 106
    .line 107
    move-object v1, v0

    .line 108
    goto :goto_3

    .line 109
    :cond_5
    :goto_2
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 110
    .line 111
    :goto_3
    return-object v1

    .line 112
    :pswitch_1
    sget-object v0, La/wne;->a:La/wne;

    .line 113
    .line 114
    iget-boolean v5, p0, La/keq0;->j:Z

    .line 115
    .line 116
    if-eqz v5, :cond_7

    .line 117
    .line 118
    if-ne v5, v3, :cond_6

    .line 119
    .line 120
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    goto :goto_4

    .line 124
    :cond_6
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    goto :goto_5

    .line 128
    :cond_7
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    iget-object p1, v4, La/oeq0;->g:La/fq;

    .line 132
    .line 133
    iput-boolean v3, p0, La/keq0;->j:Z

    .line 134
    .line 135
    sget-object v1, La/ry5;->a:La/ry5;

    .line 136
    .line 137
    invoke-virtual {p1, v1, p0}, La/fq;->f(La/zy5;La/yje;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    if-ne p0, v0, :cond_8

    .line 142
    .line 143
    move-object v1, v0

    .line 144
    goto :goto_5

    .line 145
    :cond_8
    :goto_4
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 146
    .line 147
    :goto_5
    return-object v1

    .line 148
    nop

    .line 149
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.class public final La/sag;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/tag;


# direct methods
.method public synthetic constructor <init>(La/tag;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/sag;->i:B

    iput-object p1, p0, La/sag;->k:La/tag;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/sag;->i:B

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p1, La/sag;

    .line 7
    .line 8
    iget-object p0, p0, La/sag;->k:La/tag;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/sag;-><init>(La/tag;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/sag;

    .line 16
    .line 17
    iget-object p0, p0, La/sag;->k:La/tag;

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    invoke-direct {p1, p0, p2, v0}, La/sag;-><init>(La/tag;La/yje;B)V

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
    iget-byte v0, p0, La/sag;->i:B

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
    invoke-virtual {p0, p1, p2}, La/sag;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/sag;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/sag;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/sag;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/sag;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/sag;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget-byte v0, p0, La/sag;->i:B

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    sget-object v2, La/h660;->a:La/h660;

    .line 5
    .line 6
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 7
    .line 8
    iget-object v4, p0, La/sag;->k:La/tag;

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
    iget-boolean v7, p0, La/sag;->j:Z

    .line 18
    .line 19
    if-eqz v7, :cond_1

    .line 20
    .line 21
    if-ne v7, v5, :cond_0

    .line 22
    .line 23
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    goto :goto_2

    .line 27
    :cond_0
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    goto :goto_3

    .line 31
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    iget-object p1, v4, La/tag;->e:La/y1u;

    .line 35
    .line 36
    iget-object p1, p1, La/y1u;->a:La/ul9;

    .line 37
    .line 38
    invoke-virtual {p1}, La/ul9;->e()La/p7m0;

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
    new-instance v3, La/rag;

    .line 47
    .line 48
    invoke-direct {v3, v4, v6, v5}, La/rag;-><init>(La/tag;La/yje;B)V

    .line 49
    .line 50
    .line 51
    iput-boolean v5, p0, La/sag;->j:Z

    .line 52
    .line 53
    new-instance v4, La/vnq;

    .line 54
    .line 55
    invoke-direct {v4, v2, v3, v1}, La/vnq;-><init>(La/kmq;Lkotlin/jvm/functions/Function2;B)V

    .line 56
    .line 57
    .line 58
    invoke-interface {p1, v4, p0}, La/gmq;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    if-ne p0, v0, :cond_2

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 66
    .line 67
    :goto_0
    if-ne p0, v0, :cond_3

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 71
    .line 72
    :goto_1
    if-ne p0, v0, :cond_4

    .line 73
    .line 74
    move-object v6, v0

    .line 75
    goto :goto_3

    .line 76
    :cond_4
    :goto_2
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 77
    .line 78
    :goto_3
    return-object v6

    .line 79
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 80
    .line 81
    iget-boolean v7, p0, La/sag;->j:Z

    .line 82
    .line 83
    if-eqz v7, :cond_6

    .line 84
    .line 85
    if-ne v7, v5, :cond_5

    .line 86
    .line 87
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 91
    .line 92
    goto :goto_4

    .line 93
    :cond_5
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    goto :goto_4

    .line 97
    :cond_6
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    iget-object p1, v4, La/tag;->d:La/z1u;

    .line 101
    .line 102
    iget-object p1, p1, La/z1u;->a:La/ul9;

    .line 103
    .line 104
    invoke-virtual {p1}, La/ul9;->d()La/p7m0;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    new-instance v3, La/rag;

    .line 109
    .line 110
    const/4 v7, 0x0

    .line 111
    invoke-direct {v3, v4, v6, v7}, La/rag;-><init>(La/tag;La/yje;B)V

    .line 112
    .line 113
    .line 114
    iput-boolean v5, p0, La/sag;->j:Z

    .line 115
    .line 116
    new-instance v4, La/vnq;

    .line 117
    .line 118
    invoke-direct {v4, v2, v3, v1}, La/vnq;-><init>(La/kmq;Lkotlin/jvm/functions/Function2;B)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {p1, v4, p0}, La/p7m0;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-object v6, v0

    .line 125
    :goto_4
    return-object v6

    .line 126
    nop

    .line 127
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

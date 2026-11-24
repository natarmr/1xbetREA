.class public final La/au;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/cu;

.field public final synthetic l:J


# direct methods
.method public synthetic constructor <init>(La/cu;JLa/yje;B)V
    .locals 0

    .line 1
    iput-byte p5, p0, La/au;->i:B

    iput-object p1, p0, La/au;->k:La/cu;

    iput-wide p2, p0, La/au;->l:J

    const/4 p1, 0x1

    invoke-direct {p0, p1, p4}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(La/yje;)La/yje;
    .locals 8

    .line 1
    iget-byte v0, p0, La/au;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v1, La/au;

    .line 7
    .line 8
    iget-wide v3, p0, La/au;->l:J

    .line 9
    .line 10
    const/4 v6, 0x1

    .line 11
    iget-object v2, p0, La/au;->k:La/cu;

    .line 12
    .line 13
    move-object v5, p1

    .line 14
    invoke-direct/range {v1 .. v6}, La/au;-><init>(La/cu;JLa/yje;B)V

    .line 15
    .line 16
    .line 17
    return-object v1

    .line 18
    :pswitch_0
    move-object v5, p1

    .line 19
    new-instance v2, La/au;

    .line 20
    .line 21
    move-object v6, v5

    .line 22
    iget-wide v4, p0, La/au;->l:J

    .line 23
    .line 24
    const/4 v7, 0x0

    .line 25
    iget-object v3, p0, La/au;->k:La/cu;

    .line 26
    .line 27
    invoke-direct/range {v2 .. v7}, La/au;-><init>(La/cu;JLa/yje;B)V

    .line 28
    .line 29
    .line 30
    return-object v2

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/au;->i:B

    .line 2
    .line 3
    check-cast p1, La/yje;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, La/au;->create(La/yje;)La/yje;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, La/au;

    .line 13
    .line 14
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, La/au;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :pswitch_0
    invoke-virtual {p0, p1}, La/au;->create(La/yje;)La/yje;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, La/au;

    .line 26
    .line 27
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    invoke-virtual {p0, p1}, La/au;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/au;->i:B

    .line 2
    .line 3
    iget-wide v1, p0, La/au;->l:J

    .line 4
    .line 5
    iget-object v3, p0, La/au;->k:La/cu;

    .line 6
    .line 7
    const/4 v4, 0x0

    .line 8
    const-string v5, "call to \'resume\' before \'invoke\' with coroutine"

    .line 9
    .line 10
    const/4 v6, 0x1

    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    sget-object v0, La/wne;->a:La/wne;

    .line 15
    .line 16
    iget-boolean v7, p0, La/au;->j:Z

    .line 17
    .line 18
    if-eqz v7, :cond_1

    .line 19
    .line 20
    if-ne v7, v6, :cond_0

    .line 21
    .line 22
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    goto :goto_2

    .line 26
    :cond_0
    invoke-static {v5}, La/jf4;->n(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    goto :goto_3

    .line 30
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    iget-object p1, v3, La/cu;->c:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast p1, La/y3v;

    .line 36
    .line 37
    iput-boolean v6, p0, La/au;->j:Z

    .line 38
    .line 39
    iget-object v3, p1, La/y3v;->c:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v3, La/epi0;

    .line 42
    .line 43
    iget-object p1, p1, La/y3v;->d:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p1, La/btt0;

    .line 46
    .line 47
    invoke-virtual {p1}, La/btt0;->a()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    new-instance v4, La/o6n0;

    .line 52
    .line 53
    invoke-direct {v4, v1, v2}, La/o6n0;-><init>(J)V

    .line 54
    .line 55
    .line 56
    iget-object v1, v3, La/epi0;->b:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v1, La/enj0;

    .line 59
    .line 60
    invoke-virtual {v1}, La/enj0;->invoke()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    check-cast v1, La/z9n0;

    .line 65
    .line 66
    invoke-interface {v1, p1, v4, p0}, La/z9n0;->b(Ljava/lang/String;La/o6n0;La/yje;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    if-ne p0, v0, :cond_2

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 74
    .line 75
    :goto_0
    if-ne p0, v0, :cond_3

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 79
    .line 80
    :goto_1
    if-ne p0, v0, :cond_4

    .line 81
    .line 82
    move-object v4, v0

    .line 83
    goto :goto_3

    .line 84
    :cond_4
    :goto_2
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 85
    .line 86
    :goto_3
    return-object v4

    .line 87
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 88
    .line 89
    iget-boolean v7, p0, La/au;->j:Z

    .line 90
    .line 91
    if-eqz v7, :cond_6

    .line 92
    .line 93
    if-ne v7, v6, :cond_5

    .line 94
    .line 95
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    goto :goto_4

    .line 99
    :cond_5
    invoke-static {v5}, La/jf4;->n(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    move-object p1, v4

    .line 103
    goto :goto_4

    .line 104
    :cond_6
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    iget-object p1, v3, La/cu;->c:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast p1, La/y3v;

    .line 110
    .line 111
    iput-boolean v6, p0, La/au;->j:Z

    .line 112
    .line 113
    iget-object p1, p1, La/y3v;->b:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast p1, La/y9n0;

    .line 116
    .line 117
    invoke-virtual {p1, v1, v2, p0, v6}, La/y9n0;->a(JLa/zje;Z)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    if-ne p1, v0, :cond_7

    .line 122
    .line 123
    move-object p1, v0

    .line 124
    :cond_7
    :goto_4
    return-object p1

    .line 125
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

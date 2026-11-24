.class public final La/jta;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/xcz;

.field public final synthetic l:La/cgk0;

.field public final synthetic m:La/cgk0;

.field public final synthetic n:La/t33;


# direct methods
.method public synthetic constructor <init>(La/xcz;La/cgk0;La/cgk0;La/t33;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p6, p0, La/jta;->i:B

    iput-object p1, p0, La/jta;->k:La/xcz;

    iput-object p2, p0, La/jta;->l:La/cgk0;

    iput-object p3, p0, La/jta;->m:La/cgk0;

    iput-object p4, p0, La/jta;->n:La/t33;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 8

    .line 1
    iget-byte p1, p0, La/jta;->i:B

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, La/jta;

    .line 7
    .line 8
    iget-object v4, p0, La/jta;->n:La/t33;

    .line 9
    .line 10
    const/4 v6, 0x1

    .line 11
    iget-object v1, p0, La/jta;->k:La/xcz;

    .line 12
    .line 13
    iget-object v2, p0, La/jta;->l:La/cgk0;

    .line 14
    .line 15
    iget-object v3, p0, La/jta;->m:La/cgk0;

    .line 16
    .line 17
    move-object v5, p2

    .line 18
    invoke-direct/range {v0 .. v6}, La/jta;-><init>(La/xcz;La/cgk0;La/cgk0;La/t33;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object v0

    .line 22
    :pswitch_0
    move-object v5, p2

    .line 23
    new-instance v1, La/jta;

    .line 24
    .line 25
    move-object v6, v5

    .line 26
    iget-object v5, p0, La/jta;->n:La/t33;

    .line 27
    .line 28
    const/4 v7, 0x0

    .line 29
    iget-object v2, p0, La/jta;->k:La/xcz;

    .line 30
    .line 31
    iget-object v3, p0, La/jta;->l:La/cgk0;

    .line 32
    .line 33
    iget-object v4, p0, La/jta;->m:La/cgk0;

    .line 34
    .line 35
    invoke-direct/range {v1 .. v7}, La/jta;-><init>(La/xcz;La/cgk0;La/cgk0;La/t33;La/yje;B)V

    .line 36
    .line 37
    .line 38
    return-object v1

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/jta;->i:B

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
    invoke-virtual {p0, p1, p2}, La/jta;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/jta;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/jta;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/jta;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/jta;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/jta;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget-byte v0, p0, La/jta;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/jta;->n:La/t33;

    .line 4
    .line 5
    iget-object v2, p0, La/jta;->m:La/cgk0;

    .line 6
    .line 7
    iget-object v3, p0, La/jta;->l:La/cgk0;

    .line 8
    .line 9
    iget-object v4, p0, La/jta;->k:La/xcz;

    .line 10
    .line 11
    const-string v5, "call to \'resume\' before \'invoke\' with coroutine"

    .line 12
    .line 13
    const/4 v6, 0x1

    .line 14
    const/4 v7, 0x0

    .line 15
    packed-switch v0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    sget-object v0, La/wne;->a:La/wne;

    .line 19
    .line 20
    iget-boolean v8, p0, La/jta;->j:Z

    .line 21
    .line 22
    if-eqz v8, :cond_1

    .line 23
    .line 24
    if-ne v8, v6, :cond_0

    .line 25
    .line 26
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-static {v5}, La/jf4;->n(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    new-instance p1, La/eb;

    .line 38
    .line 39
    const/16 v5, 0xe

    .line 40
    .line 41
    invoke-direct {p1, v4, v5}, La/eb;-><init>(La/xcz;B)V

    .line 42
    .line 43
    .line 44
    invoke-static {v7, p1}, La/ydx;->V(La/ufk0;Lkotlin/jvm/functions/Function0;)La/vsg0;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    new-instance v4, La/ita;

    .line 49
    .line 50
    invoke-direct {v4, v3, v2, v1, v6}, La/ita;-><init>(La/cgk0;La/cgk0;La/t33;B)V

    .line 51
    .line 52
    .line 53
    iput-boolean v6, p0, La/jta;->j:Z

    .line 54
    .line 55
    invoke-virtual {p1, v4, p0}, La/vsg0;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    if-ne p0, v0, :cond_2

    .line 60
    .line 61
    move-object v7, v0

    .line 62
    goto :goto_1

    .line 63
    :cond_2
    :goto_0
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 64
    .line 65
    :goto_1
    return-object v7

    .line 66
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 67
    .line 68
    iget-boolean v8, p0, La/jta;->j:Z

    .line 69
    .line 70
    if-eqz v8, :cond_4

    .line 71
    .line 72
    if-ne v8, v6, :cond_3

    .line 73
    .line 74
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_3
    invoke-static {v5}, La/jf4;->n(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    goto :goto_3

    .line 82
    :cond_4
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    new-instance p1, La/eb;

    .line 86
    .line 87
    const/16 v5, 0xd

    .line 88
    .line 89
    invoke-direct {p1, v4, v5}, La/eb;-><init>(La/xcz;B)V

    .line 90
    .line 91
    .line 92
    invoke-static {v7, p1}, La/ydx;->V(La/ufk0;Lkotlin/jvm/functions/Function0;)La/vsg0;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    new-instance v4, La/ita;

    .line 97
    .line 98
    const/4 v5, 0x0

    .line 99
    invoke-direct {v4, v3, v2, v1, v5}, La/ita;-><init>(La/cgk0;La/cgk0;La/t33;B)V

    .line 100
    .line 101
    .line 102
    iput-boolean v6, p0, La/jta;->j:Z

    .line 103
    .line 104
    invoke-virtual {p1, v4, p0}, La/vsg0;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    if-ne p0, v0, :cond_5

    .line 109
    .line 110
    move-object v7, v0

    .line 111
    goto :goto_3

    .line 112
    :cond_5
    :goto_2
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 113
    .line 114
    :goto_3
    return-object v7

    .line 115
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

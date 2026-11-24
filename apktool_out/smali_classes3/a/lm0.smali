.class public final La/lm0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/dn0;

.field public final synthetic l:Ljava/lang/String;

.field public final synthetic m:Z

.field public final synthetic n:Z


# direct methods
.method public synthetic constructor <init>(La/dn0;Ljava/lang/String;ZZLa/yje;B)V
    .locals 0

    .line 1
    iput-byte p6, p0, La/lm0;->i:B

    iput-object p1, p0, La/lm0;->k:La/dn0;

    iput-object p2, p0, La/lm0;->l:Ljava/lang/String;

    iput-boolean p3, p0, La/lm0;->m:Z

    iput-boolean p4, p0, La/lm0;->n:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 8

    .line 1
    iget-byte p1, p0, La/lm0;->i:B

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, La/lm0;

    .line 7
    .line 8
    iget-boolean v4, p0, La/lm0;->n:Z

    .line 9
    .line 10
    const/4 v6, 0x1

    .line 11
    iget-object v1, p0, La/lm0;->k:La/dn0;

    .line 12
    .line 13
    iget-object v2, p0, La/lm0;->l:Ljava/lang/String;

    .line 14
    .line 15
    iget-boolean v3, p0, La/lm0;->m:Z

    .line 16
    .line 17
    move-object v5, p2

    .line 18
    invoke-direct/range {v0 .. v6}, La/lm0;-><init>(La/dn0;Ljava/lang/String;ZZLa/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object v0

    .line 22
    :pswitch_0
    move-object v5, p2

    .line 23
    new-instance v1, La/lm0;

    .line 24
    .line 25
    move-object v6, v5

    .line 26
    iget-boolean v5, p0, La/lm0;->n:Z

    .line 27
    .line 28
    const/4 v7, 0x0

    .line 29
    iget-object v2, p0, La/lm0;->k:La/dn0;

    .line 30
    .line 31
    iget-object v3, p0, La/lm0;->l:Ljava/lang/String;

    .line 32
    .line 33
    iget-boolean v4, p0, La/lm0;->m:Z

    .line 34
    .line 35
    invoke-direct/range {v1 .. v7}, La/lm0;-><init>(La/dn0;Ljava/lang/String;ZZLa/yje;B)V

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
    iget-byte v0, p0, La/lm0;->i:B

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
    invoke-virtual {p0, p1, p2}, La/lm0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/lm0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/lm0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/lm0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/lm0;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/lm0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 11

    .line 1
    iget-byte v0, p0, La/lm0;->i:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 5
    .line 6
    const/4 v3, 0x1

    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object v0, La/wne;->a:La/wne;

    .line 11
    .line 12
    iget-boolean v4, p0, La/lm0;->j:Z

    .line 13
    .line 14
    if-eqz v4, :cond_1

    .line 15
    .line 16
    if-ne v4, v3, :cond_0

    .line 17
    .line 18
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    goto :goto_2

    .line 26
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    iput-boolean v3, p0, La/lm0;->j:Z

    .line 30
    .line 31
    iget-object v6, p0, La/lm0;->k:La/dn0;

    .line 32
    .line 33
    iget-object p1, v6, La/dn0;->c:La/xk0;

    .line 34
    .line 35
    new-instance v5, La/km0;

    .line 36
    .line 37
    const/4 v10, 0x0

    .line 38
    iget-object v7, p0, La/lm0;->l:Ljava/lang/String;

    .line 39
    .line 40
    iget-boolean v8, p0, La/lm0;->m:Z

    .line 41
    .line 42
    iget-boolean v9, p0, La/lm0;->n:Z

    .line 43
    .line 44
    invoke-direct/range {v5 .. v10}, La/km0;-><init>(La/dn0;Ljava/lang/String;ZZLa/yje;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1, v5, p0}, La/xk0;->b(La/km0;La/zje;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    if-ne p0, v0, :cond_2

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 55
    .line 56
    :goto_0
    if-ne p0, v0, :cond_3

    .line 57
    .line 58
    move-object v1, v0

    .line 59
    goto :goto_2

    .line 60
    :cond_3
    :goto_1
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 61
    .line 62
    :goto_2
    return-object v1

    .line 63
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 64
    .line 65
    iget-boolean v4, p0, La/lm0;->j:Z

    .line 66
    .line 67
    if-eqz v4, :cond_5

    .line 68
    .line 69
    if-ne v4, v3, :cond_4

    .line 70
    .line 71
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    goto :goto_4

    .line 75
    :cond_4
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    goto :goto_5

    .line 79
    :cond_5
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    iput-boolean v3, p0, La/lm0;->j:Z

    .line 83
    .line 84
    iget-object v6, p0, La/lm0;->k:La/dn0;

    .line 85
    .line 86
    iget-object p1, v6, La/dn0;->c:La/xk0;

    .line 87
    .line 88
    new-instance v5, La/jm0;

    .line 89
    .line 90
    const/4 v10, 0x0

    .line 91
    iget-object v7, p0, La/lm0;->l:Ljava/lang/String;

    .line 92
    .line 93
    iget-boolean v8, p0, La/lm0;->m:Z

    .line 94
    .line 95
    iget-boolean v9, p0, La/lm0;->n:Z

    .line 96
    .line 97
    invoke-direct/range {v5 .. v10}, La/jm0;-><init>(La/dn0;Ljava/lang/String;ZZLa/yje;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p1, v5, p0}, La/xk0;->a(La/jm0;La/zje;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    if-ne p0, v0, :cond_6

    .line 105
    .line 106
    goto :goto_3

    .line 107
    :cond_6
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 108
    .line 109
    :goto_3
    if-ne p0, v0, :cond_7

    .line 110
    .line 111
    move-object v1, v0

    .line 112
    goto :goto_5

    .line 113
    :cond_7
    :goto_4
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 114
    .line 115
    :goto_5
    return-object v1

    .line 116
    nop

    .line 117
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

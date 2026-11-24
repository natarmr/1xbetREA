.class public final La/oa6;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public synthetic k:Ljava/lang/Object;

.field public final synthetic l:La/hpa0;

.field public final synthetic m:La/bxq0;


# direct methods
.method public synthetic constructor <init>(La/hpa0;La/bxq0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/oa6;->i:B

    iput-object p1, p0, La/oa6;->l:La/hpa0;

    iput-object p2, p0, La/oa6;->m:La/bxq0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 3

    .line 1
    iget-byte v0, p0, La/oa6;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, La/oa6;

    .line 7
    .line 8
    iget-object v1, p0, La/oa6;->m:La/bxq0;

    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    iget-object p0, p0, La/oa6;->l:La/hpa0;

    .line 12
    .line 13
    invoke-direct {v0, p0, v1, p2, v2}, La/oa6;-><init>(La/hpa0;La/bxq0;La/yje;B)V

    .line 14
    .line 15
    .line 16
    iput-object p1, v0, La/oa6;->k:Ljava/lang/Object;

    .line 17
    .line 18
    return-object v0

    .line 19
    :pswitch_0
    new-instance v0, La/oa6;

    .line 20
    .line 21
    iget-object v1, p0, La/oa6;->m:La/bxq0;

    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    iget-object p0, p0, La/oa6;->l:La/hpa0;

    .line 25
    .line 26
    invoke-direct {v0, p0, v1, p2, v2}, La/oa6;-><init>(La/hpa0;La/bxq0;La/yje;B)V

    .line 27
    .line 28
    .line 29
    iput-object p1, v0, La/oa6;->k:Ljava/lang/Object;

    .line 30
    .line 31
    return-object v0

    .line 32
    nop

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/oa6;->i:B

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
    invoke-virtual {p0, p1, p2}, La/oa6;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/oa6;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/oa6;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/oa6;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/oa6;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/oa6;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 7

    .line 1
    iget-byte v0, p0, La/oa6;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/oa6;->m:La/bxq0;

    .line 4
    .line 5
    iget-object v2, p0, La/oa6;->l:La/hpa0;

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
    iget-boolean v6, p0, La/oa6;->j:Z

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
    iget-object p1, p0, La/oa6;->k:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast p1, La/vne;

    .line 36
    .line 37
    new-instance v3, La/qa6;

    .line 38
    .line 39
    invoke-direct {v3, p1, v1, v5}, La/qa6;-><init>(La/vne;La/bxq0;La/yje;)V

    .line 40
    .line 41
    .line 42
    iput-boolean v4, p0, La/oa6;->j:Z

    .line 43
    .line 44
    check-cast v2, La/jnn0;

    .line 45
    .line 46
    invoke-virtual {v2, p0, v3}, La/jnn0;->Z0(La/yje;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    if-ne p0, v0, :cond_2

    .line 51
    .line 52
    move-object v5, v0

    .line 53
    goto :goto_1

    .line 54
    :cond_2
    :goto_0
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 55
    .line 56
    :goto_1
    return-object v5

    .line 57
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 58
    .line 59
    iget-boolean v6, p0, La/oa6;->j:Z

    .line 60
    .line 61
    if-eqz v6, :cond_4

    .line 62
    .line 63
    if-ne v6, v4, :cond_3

    .line 64
    .line 65
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_3
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    goto :goto_3

    .line 73
    :cond_4
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    iget-object p1, p0, La/oa6;->k:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast p1, La/vne;

    .line 79
    .line 80
    new-instance v3, La/na6;

    .line 81
    .line 82
    invoke-direct {v3, p1, v1, v5}, La/na6;-><init>(La/vne;La/bxq0;La/yje;)V

    .line 83
    .line 84
    .line 85
    iput-boolean v4, p0, La/oa6;->j:Z

    .line 86
    .line 87
    invoke-static {v2, v3, p0}, La/ebc;->Y(La/hpa0;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    if-ne p0, v0, :cond_5

    .line 92
    .line 93
    move-object v5, v0

    .line 94
    goto :goto_3

    .line 95
    :cond_5
    :goto_2
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 96
    .line 97
    :goto_3
    return-object v5

    .line 98
    nop

    .line 99
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

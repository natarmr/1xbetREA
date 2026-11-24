.class public final La/xly;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/zly;

.field public final synthetic l:F


# direct methods
.method public synthetic constructor <init>(La/zly;FLa/yje;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/xly;->i:B

    iput-object p1, p0, La/xly;->k:La/zly;

    iput p2, p0, La/xly;->l:F

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte p1, p0, La/xly;->i:B

    .line 2
    .line 3
    iget v0, p0, La/xly;->l:F

    .line 4
    .line 5
    iget-object p0, p0, La/xly;->k:La/zly;

    .line 6
    .line 7
    packed-switch p1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance p1, La/xly;

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-direct {p1, p0, v0, p2, v1}, La/xly;-><init>(La/zly;FLa/yje;B)V

    .line 14
    .line 15
    .line 16
    return-object p1

    .line 17
    :pswitch_0
    new-instance p1, La/xly;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {p1, p0, v0, p2, v1}, La/xly;-><init>(La/zly;FLa/yje;B)V

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
    iget-byte v0, p0, La/xly;->i:B

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
    invoke-virtual {p0, p1, p2}, La/xly;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/xly;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/xly;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/xly;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/xly;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/xly;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 14

    .line 1
    iget-byte v0, p0, La/xly;->i:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 5
    .line 6
    iget-object v3, p0, La/xly;->k:La/zly;

    .line 7
    .line 8
    iget v4, p0, La/xly;->l:F

    .line 9
    .line 10
    const/4 v5, 0x1

    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    sget-object v0, La/wne;->a:La/wne;

    .line 15
    .line 16
    iget-boolean v6, p0, La/xly;->j:Z

    .line 17
    .line 18
    if-eqz v6, :cond_1

    .line 19
    .line 20
    if-ne v6, v5, :cond_0

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
    iget-object p1, v3, La/zly;->B:La/t33;

    .line 34
    .line 35
    new-instance v1, Ljava/lang/Float;

    .line 36
    .line 37
    invoke-direct {v1, v4}, Ljava/lang/Float;-><init>(F)V

    .line 38
    .line 39
    .line 40
    iput-boolean v5, p0, La/xly;->j:Z

    .line 41
    .line 42
    invoke-virtual {p1, p0, v1}, La/t33;->f(La/yje;Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    if-ne p0, v0, :cond_2

    .line 47
    .line 48
    move-object v1, v0

    .line 49
    goto :goto_1

    .line 50
    :cond_2
    :goto_0
    iput v4, v3, La/zly;->q:F

    .line 51
    .line 52
    invoke-static {v3}, La/n7x;->I(La/v6z;)V

    .line 53
    .line 54
    .line 55
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 56
    .line 57
    :goto_1
    return-object v1

    .line 58
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 59
    .line 60
    iget-boolean v6, p0, La/xly;->j:Z

    .line 61
    .line 62
    if-eqz v6, :cond_4

    .line 63
    .line 64
    if-ne v6, v5, :cond_3

    .line 65
    .line 66
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    goto :goto_2

    .line 70
    :cond_3
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    goto :goto_3

    .line 74
    :cond_4
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    iget-object v7, v3, La/zly;->B:La/t33;

    .line 78
    .line 79
    new-instance v8, Ljava/lang/Float;

    .line 80
    .line 81
    invoke-direct {v8, v4}, Ljava/lang/Float;-><init>(F)V

    .line 82
    .line 83
    .line 84
    iget-object p1, v3, La/zly;->o:La/ghn;

    .line 85
    .line 86
    const/4 v1, 0x2

    .line 87
    const/16 v2, 0x12c

    .line 88
    .line 89
    const/4 v4, 0x0

    .line 90
    invoke-static {v2, v4, p1, v1}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    .line 91
    .line 92
    .line 93
    move-result-object v9

    .line 94
    new-instance v11, La/vly;

    .line 95
    .line 96
    invoke-direct {v11, v3, v5}, La/vly;-><init>(La/zly;B)V

    .line 97
    .line 98
    .line 99
    iput-boolean v5, p0, La/xly;->j:Z

    .line 100
    .line 101
    const/4 v10, 0x0

    .line 102
    const/4 v13, 0x4

    .line 103
    move-object v12, p0

    .line 104
    invoke-static/range {v7 .. v13}, La/t33;->a(La/t33;Ljava/lang/Object;La/j73;Ljava/lang/Float;Lkotlin/jvm/functions/Function1;La/yje;I)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    if-ne p0, v0, :cond_5

    .line 109
    .line 110
    move-object v1, v0

    .line 111
    goto :goto_3

    .line 112
    :cond_5
    :goto_2
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 113
    .line 114
    :goto_3
    return-object v1

    .line 115
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

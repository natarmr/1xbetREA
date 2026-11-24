.class public final La/dzl;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:F

.field public synthetic l:Ljava/lang/Object;

.field public final synthetic m:Ljava/lang/Object;

.field public final synthetic n:Ljava/lang/Object;


# direct methods
.method public constructor <init>(FLa/j73;La/jie0;La/yje;)V
    .locals 1

    const/4 v0, 0x1

    iput-byte v0, p0, La/dzl;->i:B

    .line 17
    iput p1, p0, La/dzl;->k:F

    iput-object p2, p0, La/dzl;->m:Ljava/lang/Object;

    iput-object p3, p0, La/dzl;->n:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method

.method public constructor <init>(La/bzl;FLa/sjj;La/nul0;La/yje;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, La/dzl;->i:B

    .line 3
    .line 4
    iput-object p1, p0, La/dzl;->l:Ljava/lang/Object;

    .line 5
    .line 6
    iput p2, p0, La/dzl;->k:F

    .line 7
    .line 8
    iput-object p3, p0, La/dzl;->m:Ljava/lang/Object;

    .line 9
    .line 10
    iput-object p4, p0, La/dzl;->n:Ljava/lang/Object;

    .line 11
    .line 12
    const/4 p1, 0x2

    .line 13
    invoke-direct {p0, p1, p5}, La/bnn0;-><init>(ILa/yje;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 9

    .line 1
    iget-byte v0, p0, La/dzl;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/dzl;->n:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, La/dzl;->m:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance v0, La/dzl;

    .line 11
    .line 12
    check-cast v2, La/j73;

    .line 13
    .line 14
    check-cast v1, La/jie0;

    .line 15
    .line 16
    iget p0, p0, La/dzl;->k:F

    .line 17
    .line 18
    invoke-direct {v0, p0, v2, v1, p2}, La/dzl;-><init>(FLa/j73;La/jie0;La/yje;)V

    .line 19
    .line 20
    .line 21
    iput-object p1, v0, La/dzl;->l:Ljava/lang/Object;

    .line 22
    .line 23
    return-object v0

    .line 24
    :pswitch_0
    new-instance v3, La/dzl;

    .line 25
    .line 26
    iget-object p1, p0, La/dzl;->l:Ljava/lang/Object;

    .line 27
    .line 28
    move-object v4, p1

    .line 29
    check-cast v4, La/bzl;

    .line 30
    .line 31
    move-object v6, v2

    .line 32
    check-cast v6, La/sjj;

    .line 33
    .line 34
    move-object v7, v1

    .line 35
    check-cast v7, La/nul0;

    .line 36
    .line 37
    iget v5, p0, La/dzl;->k:F

    .line 38
    .line 39
    move-object v8, p2

    .line 40
    invoke-direct/range {v3 .. v8}, La/dzl;-><init>(La/bzl;FLa/sjj;La/nul0;La/yje;)V

    .line 41
    .line 42
    .line 43
    return-object v3

    .line 44
    nop

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/dzl;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/qah0;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/dzl;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/dzl;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/dzl;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/vne;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/dzl;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/dzl;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/dzl;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    nop

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/dzl;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/dzl;->n:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, La/dzl;->m:Ljava/lang/Object;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const-string v4, "call to \'resume\' before \'invoke\' with coroutine"

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
    iget-boolean v6, p0, La/dzl;->j:Z

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
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

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
    iget-object p1, p0, La/dzl;->l:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast p1, La/qah0;

    .line 36
    .line 37
    move-object v8, v2

    .line 38
    check-cast v8, La/j73;

    .line 39
    .line 40
    check-cast v1, La/jie0;

    .line 41
    .line 42
    new-instance v9, La/vs90;

    .line 43
    .line 44
    invoke-direct {v9, v1, p1, v5}, La/vs90;-><init>(La/jie0;La/qah0;B)V

    .line 45
    .line 46
    .line 47
    iput-boolean v5, p0, La/dzl;->j:Z

    .line 48
    .line 49
    const/4 v6, 0x0

    .line 50
    iget v7, p0, La/dzl;->k:F

    .line 51
    .line 52
    const/4 v11, 0x4

    .line 53
    move-object v10, p0

    .line 54
    invoke-static/range {v6 .. v11}, La/hhm0;->n(FFLa/j73;Lkotlin/jvm/functions/Function2;La/bnn0;I)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    if-ne p0, v0, :cond_2

    .line 59
    .line 60
    move-object v3, v0

    .line 61
    goto :goto_1

    .line 62
    :cond_2
    :goto_0
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 63
    .line 64
    :goto_1
    return-object v3

    .line 65
    :pswitch_0
    move-object v10, p0

    .line 66
    sget-object p0, La/wne;->a:La/wne;

    .line 67
    .line 68
    iget-boolean v0, v10, La/dzl;->j:Z

    .line 69
    .line 70
    if-eqz v0, :cond_4

    .line 71
    .line 72
    if-ne v0, v5, :cond_3

    .line 73
    .line 74
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_3
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

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
    iget-object p1, v10, La/dzl;->l:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast p1, La/bzl;

    .line 88
    .line 89
    iget-object p1, p1, La/bzl;->a:La/oyq0;

    .line 90
    .line 91
    check-cast v2, La/sjj;

    .line 92
    .line 93
    check-cast v1, La/nul0;

    .line 94
    .line 95
    iput-boolean v5, v10, La/dzl;->j:Z

    .line 96
    .line 97
    iget v0, v10, La/dzl;->k:F

    .line 98
    .line 99
    invoke-static {p1, v0, v2, v1, v10}, La/mbc;->b0(La/oyq0;FLa/sjj;La/nul0;La/zje;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    if-ne p1, p0, :cond_5

    .line 104
    .line 105
    move-object v3, p0

    .line 106
    goto :goto_3

    .line 107
    :cond_5
    :goto_2
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 108
    .line 109
    :goto_3
    return-object v3

    .line 110
    nop

    .line 111
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

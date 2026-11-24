.class public final La/t910;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:F

.field public final synthetic l:Ljava/lang/Object;

.field public final synthetic m:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/glt0;FLa/j73;La/yje;)V
    .locals 1

    const/4 v0, 0x1

    iput-byte v0, p0, La/t910;->i:B

    .line 17
    iput-object p1, p0, La/t910;->l:Ljava/lang/Object;

    iput p2, p0, La/t910;->k:F

    iput-object p3, p0, La/t910;->m:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p4}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method

.method public constructor <init>(La/u910;La/fa10;FZLa/yje;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, La/t910;->i:B

    .line 3
    .line 4
    iput-object p1, p0, La/t910;->l:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, La/t910;->m:Ljava/lang/Object;

    .line 7
    .line 8
    iput p3, p0, La/t910;->k:F

    .line 9
    .line 10
    iput-boolean p4, p0, La/t910;->j:Z

    .line 11
    .line 12
    const/4 p1, 0x1

    .line 13
    invoke-direct {p0, p1, p5}, La/bnn0;-><init>(ILa/yje;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final create(La/yje;)La/yje;
    .locals 9

    .line 1
    iget-byte v0, p0, La/t910;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, La/t910;

    .line 7
    .line 8
    iget-object v1, p0, La/t910;->l:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, La/glt0;

    .line 11
    .line 12
    iget-object v2, p0, La/t910;->m:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v2, La/j73;

    .line 15
    .line 16
    iget p0, p0, La/t910;->k:F

    .line 17
    .line 18
    invoke-direct {v0, v1, p0, v2, p1}, La/t910;-><init>(La/glt0;FLa/j73;La/yje;)V

    .line 19
    .line 20
    .line 21
    return-object v0

    .line 22
    :pswitch_0
    new-instance v3, La/t910;

    .line 23
    .line 24
    iget-object v0, p0, La/t910;->l:Ljava/lang/Object;

    .line 25
    .line 26
    move-object v4, v0

    .line 27
    check-cast v4, La/u910;

    .line 28
    .line 29
    iget-object v0, p0, La/t910;->m:Ljava/lang/Object;

    .line 30
    .line 31
    move-object v5, v0

    .line 32
    check-cast v5, La/fa10;

    .line 33
    .line 34
    iget v6, p0, La/t910;->k:F

    .line 35
    .line 36
    iget-boolean v7, p0, La/t910;->j:Z

    .line 37
    .line 38
    move-object v8, p1

    .line 39
    invoke-direct/range {v3 .. v8}, La/t910;-><init>(La/u910;La/fa10;FZLa/yje;)V

    .line 40
    .line 41
    .line 42
    return-object v3

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/t910;->i:B

    .line 2
    .line 3
    check-cast p1, La/yje;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, La/t910;->create(La/yje;)La/yje;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, La/t910;

    .line 13
    .line 14
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, La/t910;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :pswitch_0
    invoke-virtual {p0, p1}, La/t910;->create(La/yje;)La/yje;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, La/t910;

    .line 26
    .line 27
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    invoke-virtual {p0, p1}, La/t910;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 12

    .line 1
    iget-byte v0, p0, La/t910;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/t910;->m:Ljava/lang/Object;

    .line 4
    .line 5
    iget v2, p0, La/t910;->k:F

    .line 6
    .line 7
    iget-object v3, p0, La/t910;->l:Ljava/lang/Object;

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    sget-object v0, La/wne;->a:La/wne;

    .line 14
    .line 15
    iget-boolean v5, p0, La/t910;->j:Z

    .line 16
    .line 17
    if-eqz v5, :cond_1

    .line 18
    .line 19
    if-ne v5, v4, :cond_0

    .line 20
    .line 21
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 26
    .line 27
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    const/4 p1, 0x0

    .line 31
    goto :goto_0

    .line 32
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    check-cast v3, La/glt0;

    .line 36
    .line 37
    iget-object p1, v3, La/glt0;->c:Ljava/lang/Object;

    .line 38
    .line 39
    move-object v5, p1

    .line 40
    check-cast v5, La/t33;

    .line 41
    .line 42
    new-instance v6, Ljava/lang/Float;

    .line 43
    .line 44
    invoke-direct {v6, v2}, Ljava/lang/Float;-><init>(F)V

    .line 45
    .line 46
    .line 47
    move-object v7, v1

    .line 48
    check-cast v7, La/j73;

    .line 49
    .line 50
    iput-boolean v4, p0, La/t910;->j:Z

    .line 51
    .line 52
    const/4 v8, 0x0

    .line 53
    const/4 v9, 0x0

    .line 54
    const/16 v11, 0xc

    .line 55
    .line 56
    move-object v10, p0

    .line 57
    invoke-static/range {v5 .. v11}, La/t33;->a(La/t33;Ljava/lang/Object;La/j73;Ljava/lang/Float;Lkotlin/jvm/functions/Function1;La/yje;I)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    if-ne p1, v0, :cond_2

    .line 62
    .line 63
    move-object p1, v0

    .line 64
    :cond_2
    :goto_0
    return-object p1

    .line 65
    :pswitch_0
    move-object v10, p0

    .line 66
    sget-object p0, La/wne;->a:La/wne;

    .line 67
    .line 68
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    check-cast v3, La/u910;

    .line 72
    .line 73
    check-cast v1, La/fa10;

    .line 74
    .line 75
    iget-object p0, v3, La/u910;->i:La/pz40;

    .line 76
    .line 77
    check-cast p0, La/hgk0;

    .line 78
    .line 79
    invoke-virtual {p0, v1}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v3, v2}, La/u910;->k(F)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v3, v4}, La/u910;->i(I)V

    .line 86
    .line 87
    .line 88
    const/4 p0, 0x0

    .line 89
    invoke-virtual {v3, p0}, La/u910;->j(Z)V

    .line 90
    .line 91
    .line 92
    iget-boolean p0, v10, La/t910;->j:Z

    .line 93
    .line 94
    if-eqz p0, :cond_3

    .line 95
    .line 96
    iget-object p0, v3, La/u910;->l:La/pz40;

    .line 97
    .line 98
    const-wide/high16 v0, -0x8000000000000000L

    .line 99
    .line 100
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    check-cast p0, La/hgk0;

    .line 105
    .line 106
    invoke-virtual {p0, p1}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    :cond_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 110
    .line 111
    return-object p0

    .line 112
    nop

    .line 113
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.class public final La/cl60;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:B

.field public final synthetic j:La/hl60;


# direct methods
.method public constructor <init>(La/hl60;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/cl60;->j:La/hl60;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 0

    .line 1
    new-instance p1, La/cl60;

    .line 2
    .line 3
    iget-object p0, p0, La/cl60;->j:La/hl60;

    .line 4
    .line 5
    invoke-direct {p1, p0, p2}, La/cl60;-><init>(La/hl60;La/yje;)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/vne;

    .line 2
    .line 3
    check-cast p2, La/yje;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, La/cl60;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/cl60;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/cl60;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    sget-object v0, La/wne;->a:La/wne;

    .line 2
    .line 3
    iget-byte v1, p0, La/cl60;->i:B

    .line 4
    .line 5
    iget-object v2, p0, La/cl60;->j:La/hl60;

    .line 6
    .line 7
    const/4 v3, 0x2

    .line 8
    const/4 v4, 0x1

    .line 9
    if-eqz v1, :cond_2

    .line 10
    .line 11
    if-eq v1, v4, :cond_1

    .line 12
    .line 13
    if-ne v1, v3, :cond_0

    .line 14
    .line 15
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    goto :goto_3

    .line 19
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 20
    .line 21
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    const/4 p0, 0x0

    .line 25
    return-object p0

    .line 26
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    iget-object p1, v2, La/hl60;->i:La/sp4;

    .line 34
    .line 35
    iget-object p1, p1, La/sp4;->a:La/b9i;

    .line 36
    .line 37
    invoke-virtual {p1}, La/b9i;->w()La/c5k;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    iput-byte v4, p0, La/cl60;->i:B

    .line 42
    .line 43
    invoke-virtual {p1, p0}, La/c5k;->o(La/zje;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    if-ne p1, v0, :cond_3

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_3
    :goto_0
    check-cast p1, La/i2f0;

    .line 51
    .line 52
    iget-boolean p1, p1, La/i2f0;->c:Z

    .line 53
    .line 54
    if-eqz p1, :cond_4

    .line 55
    .line 56
    iget-object p0, v2, La/hl60;->n:La/i1w0;

    .line 57
    .line 58
    invoke-static {p0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    iget-object v0, v2, La/hl60;->k:La/zn00;

    .line 63
    .line 64
    sget-object v1, Lorg/xplatform/security/api/presentation/models/ConfirmRestoreByAuthenticatorType$ConfirmByAuthenticator;->a:Lorg/xplatform/security/api/presentation/models/ConfirmRestoreByAuthenticatorType$ConfirmByAuthenticator;

    .line 65
    .line 66
    invoke-virtual {v0, v1}, La/zn00;->z0(Lorg/xplatform/security/api/presentation/models/ConfirmRestoreByAuthenticatorType;)Lcom/github/terrakok/cicerone/androidx/FragmentScreen$Companion$invoke$1;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    new-instance v1, La/d1w0;

    .line 71
    .line 72
    invoke-direct {v1, v0}, La/d1w0;-><init>(La/m7h0;)V

    .line 73
    .line 74
    .line 75
    new-instance v0, La/c8d;

    .line 76
    .line 77
    sget-object v2, La/y7d;->a:La/v7d;

    .line 78
    .line 79
    invoke-direct {v0, v2, v1}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 80
    .line 81
    .line 82
    const/4 v1, 0x0

    .line 83
    invoke-static {p1, v0, p0, p1, v1}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    :goto_1
    move-object v0, p1

    .line 88
    check-cast v0, La/paw;

    .line 89
    .line 90
    invoke-virtual {v0}, La/paw;->hasNext()Z

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    if-eqz v1, :cond_5

    .line 95
    .line 96
    invoke-virtual {v0}, La/paw;->next()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    check-cast v0, La/oe50;

    .line 101
    .line 102
    invoke-virtual {p0, v0}, La/i1w0;->a(La/oe50;)V

    .line 103
    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_4
    iput-byte v3, p0, La/cl60;->i:B

    .line 107
    .line 108
    invoke-virtual {v2, p0}, La/hl60;->x(La/zje;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    if-ne p0, v0, :cond_5

    .line 113
    .line 114
    :goto_2
    return-object v0

    .line 115
    :cond_5
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 116
    .line 117
    return-object p0
.end method

.class public final La/m1c;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:B

.field public final synthetic j:La/s1c;


# direct methods
.method public constructor <init>(La/s1c;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/m1c;->j:La/s1c;

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
    new-instance p1, La/m1c;

    .line 2
    .line 3
    iget-object p0, p0, La/m1c;->j:La/s1c;

    .line 4
    .line 5
    invoke-direct {p1, p0, p2}, La/m1c;-><init>(La/s1c;La/yje;)V

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
    invoke-virtual {p0, p1, p2}, La/m1c;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/m1c;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/m1c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-object v0, p0, La/m1c;->j:La/s1c;

    .line 2
    .line 3
    iget-object v1, v0, La/s1c;->x:La/p7m0;

    .line 4
    .line 5
    iget-object v2, v0, La/s1c;->u:Lorg/xplatform/security/api/presentation/models/SendEmailIntention;

    .line 6
    .line 7
    sget-object v3, La/wne;->a:La/wne;

    .line 8
    .line 9
    iget-byte v4, p0, La/m1c;->i:B

    .line 10
    .line 11
    const/4 v5, 0x0

    .line 12
    const/4 v6, 0x3

    .line 13
    const/4 v7, 0x2

    .line 14
    const/4 v8, 0x1

    .line 15
    if-eqz v4, :cond_2

    .line 16
    .line 17
    if-eq v4, v8, :cond_1

    .line 18
    .line 19
    if-eq v4, v7, :cond_1

    .line 20
    .line 21
    if-ne v4, v6, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 25
    .line 26
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    return-object v5

    .line 30
    :cond_1
    :goto_0
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    goto :goto_2

    .line 34
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    if-eqz v2, :cond_6

    .line 38
    .line 39
    instance-of p1, v2, Lorg/xplatform/security/api/presentation/models/SendEmailIntention$Bind;

    .line 40
    .line 41
    if-eqz p1, :cond_3

    .line 42
    .line 43
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    check-cast p1, La/f1c;

    .line 48
    .line 49
    iget-object p1, p1, La/f1c;->b:Ljava/lang/String;

    .line 50
    .line 51
    iput-byte v8, p0, La/m1c;->i:B

    .line 52
    .line 53
    invoke-virtual {v0, p1, p0}, La/s1c;->x(Ljava/lang/String;La/zje;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    if-ne p0, v3, :cond_5

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_3
    instance-of p1, v2, Lorg/xplatform/security/api/presentation/models/SendEmailIntention$Registration;

    .line 61
    .line 62
    if-eqz p1, :cond_4

    .line 63
    .line 64
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    check-cast p1, La/f1c;

    .line 69
    .line 70
    iget-object p1, p1, La/f1c;->b:Ljava/lang/String;

    .line 71
    .line 72
    check-cast v2, Lorg/xplatform/security/api/presentation/models/SendEmailIntention$Registration;

    .line 73
    .line 74
    iput-byte v7, p0, La/m1c;->i:B

    .line 75
    .line 76
    invoke-virtual {v0, p1, v2, p0}, La/s1c;->C(Ljava/lang/String;Lorg/xplatform/security/api/presentation/models/SendEmailIntention$Registration;La/zje;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    if-ne p0, v3, :cond_5

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_4
    instance-of p1, v2, Lorg/xplatform/security/api/presentation/models/SendEmailIntention$RestorePassword;

    .line 84
    .line 85
    if-eqz p1, :cond_6

    .line 86
    .line 87
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    check-cast p1, La/f1c;

    .line 92
    .line 93
    iget-object p1, p1, La/f1c;->b:Ljava/lang/String;

    .line 94
    .line 95
    check-cast v2, Lorg/xplatform/security/api/presentation/models/SendEmailIntention$RestorePassword;

    .line 96
    .line 97
    iput-byte v6, p0, La/m1c;->i:B

    .line 98
    .line 99
    invoke-virtual {v0, p1, v2, p0}, La/s1c;->D(Ljava/lang/String;Lorg/xplatform/security/api/presentation/models/SendEmailIntention$RestorePassword;La/zje;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    if-ne p0, v3, :cond_5

    .line 104
    .line 105
    :goto_1
    return-object v3

    .line 106
    :cond_5
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 107
    .line 108
    return-object p0

    .line 109
    :cond_6
    invoke-static {}, La/t9f;->b()V

    .line 110
    .line 111
    .line 112
    return-object v5
.end method

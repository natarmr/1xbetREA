.class public final La/a1e;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:B

.field public final synthetic j:La/g1e;


# direct methods
.method public constructor <init>(La/g1e;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/a1e;->j:La/g1e;

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
    new-instance p1, La/a1e;

    .line 2
    .line 3
    iget-object p0, p0, La/a1e;->j:La/g1e;

    .line 4
    .line 5
    invoke-direct {p1, p0, p2}, La/a1e;-><init>(La/g1e;La/yje;)V

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
    invoke-virtual {p0, p1, p2}, La/a1e;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/a1e;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/a1e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, La/a1e;->j:La/g1e;

    .line 2
    .line 3
    iget-object v1, v0, La/g1e;->x:La/s64;

    .line 4
    .line 5
    sget-object v2, La/wne;->a:La/wne;

    .line 6
    .line 7
    iget-byte v3, p0, La/a1e;->i:B

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    const/4 v5, 0x2

    .line 11
    const/4 v6, 0x1

    .line 12
    if-eqz v3, :cond_2

    .line 13
    .line 14
    if-eq v3, v6, :cond_1

    .line 15
    .line 16
    if-ne v3, v5, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 20
    .line 21
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    return-object v4

    .line 25
    :cond_1
    :goto_0
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    goto :goto_2

    .line 29
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    iget-object p1, v0, La/g1e;->d:Lorg/xplatform/login/new_place/api/navigation/ConfirmationNewPlaceScreenType;

    .line 33
    .line 34
    if-eqz p1, :cond_6

    .line 35
    .line 36
    instance-of v3, p1, Lorg/xplatform/login/new_place/api/navigation/ConfirmationNewPlaceScreenType$Authenticator;

    .line 37
    .line 38
    if-eqz v3, :cond_3

    .line 39
    .line 40
    sget-object p1, La/hfi0;->e:La/hfi0;

    .line 41
    .line 42
    invoke-virtual {v1, p1}, La/s64;->f(La/hfi0;)V

    .line 43
    .line 44
    .line 45
    iget-object p1, v0, La/g1e;->q:La/tvd;

    .line 46
    .line 47
    iget-object v0, v0, La/g1e;->A:Ljava/lang/String;

    .line 48
    .line 49
    iput-byte v6, p0, La/a1e;->i:B

    .line 50
    .line 51
    invoke-virtual {p1, v0, p0}, La/tvd;->a(Ljava/lang/String;La/bnn0;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    if-ne p0, v2, :cond_5

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_3
    instance-of v3, p1, Lorg/xplatform/login/new_place/api/navigation/ConfirmationNewPlaceScreenType$Simple;

    .line 59
    .line 60
    if-eqz v3, :cond_4

    .line 61
    .line 62
    iget-object p1, v0, La/g1e;->A:Ljava/lang/String;

    .line 63
    .line 64
    iput-byte v5, p0, La/a1e;->i:B

    .line 65
    .line 66
    invoke-virtual {v0, p1, p0}, La/g1e;->w(Ljava/lang/String;La/zje;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    if-ne p0, v2, :cond_5

    .line 71
    .line 72
    :goto_1
    return-object v2

    .line 73
    :cond_4
    instance-of p0, p1, Lorg/xplatform/login/new_place/api/navigation/ConfirmationNewPlaceScreenType$SmsCode;

    .line 74
    .line 75
    if-eqz p0, :cond_6

    .line 76
    .line 77
    sget-object p0, La/hfi0;->b:La/hfi0;

    .line 78
    .line 79
    invoke-virtual {v1, p0}, La/s64;->f(La/hfi0;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0}, La/g1e;->D()V

    .line 83
    .line 84
    .line 85
    :cond_5
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 86
    .line 87
    return-object p0

    .line 88
    :cond_6
    invoke-static {}, La/t9f;->b()V

    .line 89
    .line 90
    .line 91
    return-object v4
.end method

.class public final Lorg/xplatform/security/impl/presentation/password/change/input_password/e;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public synthetic i:Ljava/lang/Object;

.field public final synthetic j:Lorg/xplatform/security/impl/presentation/password/change/input_password/f;


# direct methods
.method public constructor <init>(Lorg/xplatform/security/impl/presentation/password/change/input_password/f;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/xplatform/security/impl/presentation/password/change/input_password/e;->j:Lorg/xplatform/security/impl/presentation/password/change/input_password/f;

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
    .locals 1

    .line 1
    new-instance v0, Lorg/xplatform/security/impl/presentation/password/change/input_password/e;

    .line 2
    .line 3
    iget-object p0, p0, Lorg/xplatform/security/impl/presentation/password/change/input_password/e;->j:Lorg/xplatform/security/impl/presentation/password/change/input_password/f;

    .line 4
    .line 5
    invoke-direct {v0, p0, p2}, Lorg/xplatform/security/impl/presentation/password/change/input_password/e;-><init>(Lorg/xplatform/security/impl/presentation/password/change/input_password/f;La/yje;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, Lorg/xplatform/security/impl/presentation/password/change/input_password/e;->i:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Throwable;

    .line 2
    .line 3
    check-cast p2, La/yje;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lorg/xplatform/security/impl/presentation/password/change/input_password/e;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lorg/xplatform/security/impl/presentation/password/change/input_password/e;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lorg/xplatform/security/impl/presentation/password/change/input_password/e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-object v0, p0, Lorg/xplatform/security/impl/presentation/password/change/input_password/e;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/Throwable;

    .line 4
    .line 5
    sget-object v1, La/wne;->a:La/wne;

    .line 6
    .line 7
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    instance-of p1, v0, La/x4x;

    .line 11
    .line 12
    iget-object p0, p0, Lorg/xplatform/security/impl/presentation/password/change/input_password/e;->j:Lorg/xplatform/security/impl/presentation/password/change/input_password/f;

    .line 13
    .line 14
    if-eqz p1, :cond_1

    .line 15
    .line 16
    new-instance p1, Lorg/xplatform/security/impl/presentation/password/change/input_password/PasswordChangeViewModel$ScreenUiState$IncorrectPassword;

    .line 17
    .line 18
    iget-object v1, p0, Lorg/xplatform/security/impl/presentation/password/change/input_password/f;->n:La/xae0;

    .line 19
    .line 20
    iget-object v1, v1, La/xae0;->a:La/n7m0;

    .line 21
    .line 22
    invoke-interface {v1}, La/n7m0;->getValue()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    check-cast v1, Lorg/xplatform/security/impl/presentation/password/change/input_password/PasswordChangeViewModel$ScreenUiState;

    .line 27
    .line 28
    invoke-virtual {v1}, Lorg/xplatform/security/impl/presentation/password/change/input_password/PasswordChangeViewModel$ScreenUiState;->a()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    if-nez v0, :cond_0

    .line 37
    .line 38
    const-string v0, ""

    .line 39
    .line 40
    :cond_0
    invoke-direct {p1, v1, v0}, Lorg/xplatform/security/impl/presentation/password/change/input_password/PasswordChangeViewModel$ScreenUiState$IncorrectPassword;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    iget-object p0, p0, Lorg/xplatform/security/impl/presentation/password/change/input_password/f;->b:La/vzg0;

    .line 44
    .line 45
    const-string v0, "current_password_key"

    .line 46
    .line 47
    invoke-virtual {p0, v0, p1}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    goto :goto_2

    .line 51
    :cond_1
    if-nez v0, :cond_2

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_2
    instance-of p1, v0, Ljava/net/SocketTimeoutException;

    .line 55
    .line 56
    if-eqz p1, :cond_3

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_3
    instance-of p1, v0, Ljava/net/UnknownHostException;

    .line 60
    .line 61
    if-eqz p1, :cond_4

    .line 62
    .line 63
    :goto_0
    iget-object p0, p0, Lorg/xplatform/security/impl/presentation/password/change/input_password/f;->p:La/ol60;

    .line 64
    .line 65
    sget-object p1, La/b090;->a:La/b090;

    .line 66
    .line 67
    invoke-virtual {p0, p1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_4
    instance-of p1, v0, La/zhi0;

    .line 72
    .line 73
    if-eqz p1, :cond_5

    .line 74
    .line 75
    check-cast v0, La/zhi0;

    .line 76
    .line 77
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    new-instance v2, La/xj80;

    .line 82
    .line 83
    iget-object v4, p0, Lorg/xplatform/security/impl/presentation/password/change/input_password/f;->l:La/duj;

    .line 84
    .line 85
    const/4 v8, 0x0

    .line 86
    const/16 v9, 0xa

    .line 87
    .line 88
    const/4 v3, 0x1

    .line 89
    const-class v5, La/duj;

    .line 90
    .line 91
    const-string v6, "handleError"

    .line 92
    .line 93
    const-string v7, "handleError(Ljava/lang/Throwable;)V"

    .line 94
    .line 95
    invoke-direct/range {v2 .. v9}, La/xj80;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 96
    .line 97
    .line 98
    new-instance v5, La/s980;

    .line 99
    .line 100
    const/4 p1, 0x0

    .line 101
    const/4 v3, 0x5

    .line 102
    invoke-direct {v5, v0, p0, p1, v3}, La/s980;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 103
    .line 104
    .line 105
    const/16 v6, 0xe

    .line 106
    .line 107
    const/4 v3, 0x0

    .line 108
    const/4 v4, 0x0

    .line 109
    invoke-static/range {v1 .. v6}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 110
    .line 111
    .line 112
    goto :goto_2

    .line 113
    :cond_5
    :goto_1
    iget-object p0, p0, Lorg/xplatform/security/impl/presentation/password/change/input_password/f;->l:La/duj;

    .line 114
    .line 115
    invoke-virtual {p0, v0}, La/duj;->a(Ljava/lang/Throwable;)V

    .line 116
    .line 117
    .line 118
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 119
    .line 120
    return-object p0
.end method

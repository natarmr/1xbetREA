.class public final Lorg/xplatform/security/impl/presentation/password/change/input_password/a;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public synthetic i:Ljava/lang/Object;

.field public final synthetic j:La/xz80;


# direct methods
.method public constructor <init>(La/xz80;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/xplatform/security/impl/presentation/password/change/input_password/a;->j:La/xz80;

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
    new-instance v0, Lorg/xplatform/security/impl/presentation/password/change/input_password/a;

    .line 2
    .line 3
    iget-object p0, p0, Lorg/xplatform/security/impl/presentation/password/change/input_password/a;->j:La/xz80;

    .line 4
    .line 5
    invoke-direct {v0, p0, p2}, Lorg/xplatform/security/impl/presentation/password/change/input_password/a;-><init>(La/xz80;La/yje;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, Lorg/xplatform/security/impl/presentation/password/change/input_password/a;->i:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lorg/xplatform/security/impl/presentation/password/change/input_password/PasswordChangeViewModel$ScreenUiState;

    .line 2
    .line 3
    check-cast p2, La/yje;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lorg/xplatform/security/impl/presentation/password/change/input_password/a;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lorg/xplatform/security/impl/presentation/password/change/input_password/a;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lorg/xplatform/security/impl/presentation/password/change/input_password/a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lorg/xplatform/security/impl/presentation/password/change/input_password/a;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lorg/xplatform/security/impl/presentation/password/change/input_password/PasswordChangeViewModel$ScreenUiState;

    .line 4
    .line 5
    sget-object v1, La/wne;->a:La/wne;

    .line 6
    .line 7
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    if-eqz v0, :cond_3

    .line 11
    .line 12
    instance-of p1, v0, Lorg/xplatform/security/impl/presentation/password/change/input_password/PasswordChangeViewModel$ScreenUiState$Default;

    .line 13
    .line 14
    const-string v1, ""

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    iget-object p0, p0, Lorg/xplatform/security/impl/presentation/password/change/input_password/a;->j:La/xz80;

    .line 18
    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    sget-object p1, La/xz80;->U1:La/xi70;

    .line 22
    .line 23
    invoke-virtual {p0}, La/xz80;->G0()La/zyq;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    iget-object p0, p0, La/zyq;->f:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 28
    .line 29
    invoke-virtual {p0, v2}, Lorg/xplatform/uikit/components/text_field/DsTextField;->f(Z)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, v1}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setErrorText(Ljava/lang/CharSequence;)V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    instance-of p1, v0, Lorg/xplatform/security/impl/presentation/password/change/input_password/PasswordChangeViewModel$ScreenUiState$PasswordInputted;

    .line 37
    .line 38
    if-eqz p1, :cond_1

    .line 39
    .line 40
    sget-object p1, La/xz80;->U1:La/xi70;

    .line 41
    .line 42
    invoke-virtual {p0}, La/xz80;->G0()La/zyq;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    iget-object p0, p0, La/zyq;->f:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 47
    .line 48
    invoke-virtual {p0, v2}, Lorg/xplatform/uikit/components/text_field/DsTextField;->f(Z)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0, v1}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setErrorText(Ljava/lang/CharSequence;)V

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    instance-of p1, v0, Lorg/xplatform/security/impl/presentation/password/change/input_password/PasswordChangeViewModel$ScreenUiState$IncorrectPassword;

    .line 56
    .line 57
    if-eqz p1, :cond_3

    .line 58
    .line 59
    sget-object p1, La/xz80;->U1:La/xi70;

    .line 60
    .line 61
    invoke-virtual {p0}, La/xz80;->G0()La/zyq;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    iget-object p0, p0, La/zyq;->f:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 66
    .line 67
    check-cast v0, Lorg/xplatform/security/impl/presentation/password/change/input_password/PasswordChangeViewModel$ScreenUiState$IncorrectPassword;

    .line 68
    .line 69
    iget-object p1, v0, Lorg/xplatform/security/impl/presentation/password/change/input_password/PasswordChangeViewModel$ScreenUiState$IncorrectPassword;->c:Ljava/lang/String;

    .line 70
    .line 71
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    if-lez v0, :cond_2

    .line 76
    .line 77
    const/4 v2, 0x1

    .line 78
    :cond_2
    invoke-virtual {p0, v2}, Lorg/xplatform/uikit/components/text_field/DsTextField;->f(Z)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setErrorText(Ljava/lang/CharSequence;)V

    .line 82
    .line 83
    .line 84
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 85
    .line 86
    return-object p0

    .line 87
    :cond_3
    invoke-static {}, La/t9f;->b()V

    .line 88
    .line 89
    .line 90
    const/4 p0, 0x0

    .line 91
    return-object p0
.end method

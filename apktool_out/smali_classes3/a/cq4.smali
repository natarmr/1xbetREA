.class public final La/cq4;
.super La/w46;
.source "SourceFile"


# instance fields
.field public final b:La/ctf0;

.field public final c:La/zj2;

.field public final d:La/ol60;

.field public final e:La/xae0;


# direct methods
.method public constructor <init>(La/vzg0;La/mne;La/ctf0;Lorg/xplatform/authenticator/impl/ui/dialogs/authenticator_filter/models/AuthenticatorFilterDialogSettings;)V
    .locals 5

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, La/w46;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p3, p0, La/cq4;->b:La/ctf0;

    .line 8
    .line 9
    iget-object v0, p4, Lorg/xplatform/authenticator/impl/ui/dialogs/authenticator_filter/models/AuthenticatorFilterDialogSettings;->b:Lorg/xplatform/authenticator/impl/util/NotificationPeriodInfo;

    .line 10
    .line 11
    iget-object p4, p4, Lorg/xplatform/authenticator/impl/ui/dialogs/authenticator_filter/models/AuthenticatorFilterDialogSettings;->a:Lorg/xplatform/authenticator/impl/util/NotificationTypeInfo;

    .line 12
    .line 13
    iget-object v1, p4, Lorg/xplatform/authenticator/impl/util/NotificationTypeInfo;->a:La/c860;

    .line 14
    .line 15
    sget-object v2, La/q760;->b:La/q760;

    .line 16
    .line 17
    new-instance v3, Lorg/xplatform/authenticator/impl/ui/dialogs/authenticator_filter/AuthenticatorFilterViewModel$ViewModelState;

    .line 18
    .line 19
    invoke-direct {v3, v1, v0, v2}, Lorg/xplatform/authenticator/impl/ui/dialogs/authenticator_filter/AuthenticatorFilterViewModel$ViewModelState;-><init>(La/c860;Lorg/xplatform/authenticator/impl/util/NotificationPeriodInfo;La/q760;)V

    .line 20
    .line 21
    .line 22
    new-instance v1, La/zj2;

    .line 23
    .line 24
    const-string v4, "UI_STATE_SAVED_STATE_KEY"

    .line 25
    .line 26
    invoke-direct {v1, p1, v4, v3}, La/zj2;-><init>(La/vzg0;Ljava/lang/String;Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    iput-object v1, p0, La/cq4;->c:La/zj2;

    .line 30
    .line 31
    new-instance p1, La/ol60;

    .line 32
    .line 33
    const/4 v3, 0x3

    .line 34
    invoke-direct {p1, v3}, La/ol60;-><init>(I)V

    .line 35
    .line 36
    .line 37
    iput-object p1, p0, La/cq4;->d:La/ol60;

    .line 38
    .line 39
    new-instance p1, La/c00;

    .line 40
    .line 41
    const/16 v3, 0xe

    .line 42
    .line 43
    invoke-direct {p1, v1, p0, v3}, La/c00;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 44
    .line 45
    .line 46
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    iget-object p2, p2, La/mne;->b:La/dvj;

    .line 51
    .line 52
    invoke-static {v1, p2}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 53
    .line 54
    .line 55
    move-result-object p2

    .line 56
    iget-object p4, p4, Lorg/xplatform/authenticator/impl/util/NotificationTypeInfo;->a:La/c860;

    .line 57
    .line 58
    new-instance v1, Lorg/xplatform/authenticator/impl/ui/dialogs/authenticator_filter/AuthenticatorFilterViewModel$ViewModelState;

    .line 59
    .line 60
    invoke-direct {v1, p4, v0, v2}, Lorg/xplatform/authenticator/impl/ui/dialogs/authenticator_filter/AuthenticatorFilterViewModel$ViewModelState;-><init>(La/c860;Lorg/xplatform/authenticator/impl/util/NotificationPeriodInfo;La/q760;)V

    .line 61
    .line 62
    .line 63
    invoke-static {v1, p3}, La/z6t0;->a(Lorg/xplatform/authenticator/impl/ui/dialogs/authenticator_filter/AuthenticatorFilterViewModel$ViewModelState;La/ctf0;)La/y6t0;

    .line 64
    .line 65
    .line 66
    move-result-object p3

    .line 67
    sget-object p4, La/kpj0;->b:La/m6m0;

    .line 68
    .line 69
    invoke-static {p1, p2, p4, p3}, La/vtb;->h0(La/gmq;La/vne;La/lpj0;Ljava/lang/Object;)La/xae0;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    iput-object p1, p0, La/cq4;->e:La/xae0;

    .line 74
    .line 75
    return-void
.end method

.method public static w(J)Ljava/lang/String;
    .locals 3

    .line 1
    sget-object v0, La/rdj;->a:La/rdj;

    .line 2
    .line 3
    new-instance v1, Ljava/util/Date;

    .line 4
    .line 5
    invoke-direct {v1, p0, p1}, Ljava/util/Date;-><init>(J)V

    .line 6
    .line 7
    .line 8
    sget-object p0, La/sdj;->b:La/sdj;

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    const/16 v2, 0x3c

    .line 12
    .line 13
    invoke-static {v0, p0, v1, p1, v2}, La/rdj;->c(La/rdj;La/sdj;Ljava/util/Date;Ljava/util/Locale;I)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method


# virtual methods
.method public final x(La/q760;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, La/q760;->e:La/q760;

    .line 5
    .line 6
    if-ne p1, v0, :cond_0

    .line 7
    .line 8
    new-instance p1, La/yp4;

    .line 9
    .line 10
    new-instance v0, Ljava/util/Date;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    .line 16
    .line 17
    .line 18
    move-result-wide v0

    .line 19
    const-wide/16 v2, 0x3e8

    .line 20
    .line 21
    div-long/2addr v0, v2

    .line 22
    const-wide/16 v2, 0x0

    .line 23
    .line 24
    invoke-direct {p1, v2, v3, v0, v1}, La/yp4;-><init>(JJ)V

    .line 25
    .line 26
    .line 27
    iget-object p0, p0, La/cq4;->d:La/ol60;

    .line 28
    .line 29
    invoke-virtual {p0, p1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_0
    iget-object p0, p0, La/cq4;->c:La/zj2;

    .line 34
    .line 35
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, La/zj2;->getValue()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    check-cast v0, Lorg/xplatform/authenticator/impl/ui/dialogs/authenticator_filter/AuthenticatorFilterViewModel$ViewModelState;

    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    iget-object v1, v0, Lorg/xplatform/authenticator/impl/ui/dialogs/authenticator_filter/AuthenticatorFilterViewModel$ViewModelState;->b:Lorg/xplatform/authenticator/impl/util/NotificationPeriodInfo;

    .line 48
    .line 49
    const-wide/16 v4, 0x0

    .line 50
    .line 51
    const/4 v6, 0x2

    .line 52
    const/4 v3, 0x0

    .line 53
    move-object v2, p1

    .line 54
    invoke-static/range {v1 .. v6}, Lorg/xplatform/authenticator/impl/util/NotificationPeriodInfo;->a(Lorg/xplatform/authenticator/impl/util/NotificationPeriodInfo;La/q760;Ljava/lang/String;JI)Lorg/xplatform/authenticator/impl/util/NotificationPeriodInfo;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    const/4 v1, 0x5

    .line 59
    const/4 v2, 0x0

    .line 60
    invoke-static {v0, v2, p1, v1}, Lorg/xplatform/authenticator/impl/ui/dialogs/authenticator_filter/AuthenticatorFilterViewModel$ViewModelState;->a(Lorg/xplatform/authenticator/impl/ui/dialogs/authenticator_filter/AuthenticatorFilterViewModel$ViewModelState;La/c860;Lorg/xplatform/authenticator/impl/util/NotificationPeriodInfo;I)Lorg/xplatform/authenticator/impl/ui/dialogs/authenticator_filter/AuthenticatorFilterViewModel$ViewModelState;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-virtual {p0, p1}, La/zj2;->f(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    return-void
.end method

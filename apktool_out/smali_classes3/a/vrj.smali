.class public final synthetic La/vrj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/zrj;

.field public final synthetic c:Z


# direct methods
.method public synthetic constructor <init>(La/zrj;ZB)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/vrj;->a:B

    iput-object p1, p0, La/vrj;->b:La/zrj;

    iput-boolean p2, p0, La/vrj;->c:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/vrj;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-boolean v2, p0, La/vrj;->c:Z

    .line 5
    .line 6
    iget-object p0, p0, La/vrj;->b:La/zrj;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast p1, La/i1w0;

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    new-instance v0, La/z;

    .line 17
    .line 18
    invoke-direct {v0, p0, v2}, La/z;-><init>(La/zrj;Z)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, v0}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 22
    .line 23
    .line 24
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 25
    .line 26
    return-object p0

    .line 27
    :pswitch_0
    check-cast p1, La/i1w0;

    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    new-instance v0, La/vrj;

    .line 33
    .line 34
    invoke-direct {v0, p0, v2, v1}, La/vrj;-><init>(La/zrj;ZB)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1, v0}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 38
    .line 39
    .line 40
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 41
    .line 42
    return-object p0

    .line 43
    :pswitch_1
    check-cast p1, La/k0w0;

    .line 44
    .line 45
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    iget-object p0, p0, La/zrj;->d:La/lp4;

    .line 49
    .line 50
    invoke-interface {p0}, La/lp4;->m()La/rek0;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-static {p0}, La/rek0;->l(La/rek0;)Lorg/xplatform/authenticator/impl/navigation/AuthenticatorScreenFactoryImpl$registrationOnboardingScreen$1;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    iget-object p0, p0, La/ikt0;->a:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast p0, La/c8d;

    .line 65
    .line 66
    sget-object p1, La/cfx0;->o:La/bjk;

    .line 67
    .line 68
    new-instance v0, La/bjk;

    .line 69
    .line 70
    const/4 v3, 0x0

    .line 71
    invoke-direct {v0, v3, v1, v1, v2}, La/bjk;-><init>(Ljava/lang/String;ZZZ)V

    .line 72
    .line 73
    .line 74
    new-instance v1, La/v7d;

    .line 75
    .line 76
    const/4 v2, 0x1

    .line 77
    invoke-direct {v1, v2, p1, v0}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 78
    .line 79
    .line 80
    iput-object v1, p0, La/c8d;->a:La/w7d;

    .line 81
    .line 82
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 83
    .line 84
    return-object p0

    .line 85
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

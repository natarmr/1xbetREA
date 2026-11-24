.class public final synthetic La/xrj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/zrj;

.field public final synthetic c:La/rlj;

.field public final synthetic d:Z


# direct methods
.method public synthetic constructor <init>(La/zrj;La/rlj;ZB)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/xrj;->a:B

    iput-object p1, p0, La/xrj;->b:La/zrj;

    iput-object p2, p0, La/xrj;->c:La/rlj;

    iput-boolean p3, p0, La/xrj;->d:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-byte v0, p0, La/xrj;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-boolean v2, p0, La/xrj;->d:Z

    .line 5
    .line 6
    iget-object v3, p0, La/xrj;->c:La/rlj;

    .line 7
    .line 8
    iget-object p0, p0, La/xrj;->b:La/zrj;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    check-cast p1, La/i1w0;

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    new-instance v0, La/xrj;

    .line 19
    .line 20
    invoke-direct {v0, p0, v3, v2, v1}, La/xrj;-><init>(La/zrj;La/rlj;ZB)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1, v0}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 24
    .line 25
    .line 26
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 27
    .line 28
    return-object p0

    .line 29
    :pswitch_0
    check-cast p1, La/k0w0;

    .line 30
    .line 31
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    iget-object p0, p0, La/zrj;->d:La/lp4;

    .line 35
    .line 36
    invoke-interface {p0}, La/lp4;->m()La/rek0;

    .line 37
    .line 38
    .line 39
    sget-object p0, La/mq4;->b:La/mq4;

    .line 40
    .line 41
    iget-object v0, v3, La/rlj;->a:Ljava/lang/String;

    .line 42
    .line 43
    iget-object v3, v3, La/rlj;->b:La/r080;

    .line 44
    .line 45
    new-instance v4, Lorg/xplatform/authenticator/impl/navigation/AuthenticatorScreenFactoryImpl$authenticatorScreen$1;

    .line 46
    .line 47
    invoke-direct {v4, p0, v0, v3}, Lorg/xplatform/authenticator/impl/navigation/AuthenticatorScreenFactoryImpl$authenticatorScreen$1;-><init>(La/mq4;Ljava/lang/String;La/r080;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1, v4}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    iget-object p0, p0, La/ikt0;->a:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast p0, La/c8d;

    .line 57
    .line 58
    sget-object p1, La/cfx0;->o:La/bjk;

    .line 59
    .line 60
    new-instance v0, La/bjk;

    .line 61
    .line 62
    const/4 v3, 0x0

    .line 63
    invoke-direct {v0, v3, v1, v1, v2}, La/bjk;-><init>(Ljava/lang/String;ZZZ)V

    .line 64
    .line 65
    .line 66
    new-instance v1, La/v7d;

    .line 67
    .line 68
    const/4 v2, 0x1

    .line 69
    invoke-direct {v1, v2, p1, v0}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 70
    .line 71
    .line 72
    iput-object v1, p0, La/c8d;->a:La/w7d;

    .line 73
    .line 74
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 75
    .line 76
    return-object p0

    .line 77
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

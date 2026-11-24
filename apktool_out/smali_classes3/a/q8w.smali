.class public final synthetic La/q8w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Throwable;

.field public final synthetic c:La/naw;


# direct methods
.method public synthetic constructor <init>(La/naw;Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-byte v0, p0, La/q8w;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/q8w;->c:La/naw;

    iput-object p2, p0, La/q8w;->b:Ljava/lang/Throwable;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Throwable;La/naw;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput-byte v0, p0, La/q8w;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/q8w;->b:Ljava/lang/Throwable;

    iput-object p2, p0, La/q8w;->c:La/naw;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/q8w;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/q8w;->c:La/naw;

    .line 4
    .line 5
    iget-object p0, p0, La/q8w;->b:Ljava/lang/Throwable;

    .line 6
    .line 7
    check-cast p1, Ljava/lang/Throwable;

    .line 8
    .line 9
    check-cast p2, Ljava/lang/String;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    instance-of p1, p0, Ljava/net/SocketTimeoutException;

    .line 21
    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    instance-of p1, p0, Ljava/net/UnknownHostException;

    .line 26
    .line 27
    if-eqz p1, :cond_1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    instance-of p1, p0, Ljavax/net/ssl/SSLHandshakeException;

    .line 31
    .line 32
    if-eqz p1, :cond_2

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_2
    instance-of p1, p0, Ljava/net/ConnectException;

    .line 36
    .line 37
    if-eqz p1, :cond_3

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_3
    instance-of p0, p0, Ljava/lang/IllegalStateException;

    .line 41
    .line 42
    if-eqz p0, :cond_4

    .line 43
    .line 44
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_4
    iget-object p0, v1, La/naw;->Z0:La/ol60;

    .line 48
    .line 49
    new-instance p1, La/g9w;

    .line 50
    .line 51
    invoke-direct {p1, p2}, La/g9w;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0, p1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 58
    .line 59
    :goto_1
    return-object p0

    .line 60
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    instance-of p1, p0, La/zhi0;

    .line 67
    .line 68
    if-eqz p1, :cond_5

    .line 69
    .line 70
    check-cast p0, La/zhi0;

    .line 71
    .line 72
    iget-object p0, p0, La/zhi0;->c:La/kuw;

    .line 73
    .line 74
    sget-object p1, La/i2o;->r:La/i2o;

    .line 75
    .line 76
    if-ne p0, p1, :cond_5

    .line 77
    .line 78
    iget-object p0, v1, La/naw;->Z0:La/ol60;

    .line 79
    .line 80
    sget-object p1, La/x8w;->a:La/x8w;

    .line 81
    .line 82
    invoke-virtual {p0, p1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    :cond_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 86
    .line 87
    return-object p0

    .line 88
    nop

    .line 89
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

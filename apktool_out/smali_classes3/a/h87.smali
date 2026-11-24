.class public final synthetic La/h87;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Throwable;

.field public final synthetic c:La/f97;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Throwable;La/f97;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/h87;->a:B

    iput-object p1, p0, La/h87;->b:Ljava/lang/Throwable;

    iput-object p2, p0, La/h87;->c:La/f97;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/h87;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/h87;->c:La/f97;

    .line 4
    .line 5
    iget-object p0, p0, La/h87;->b:Ljava/lang/Throwable;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object v0, v1, La/f97;->r:La/ctf0;

    .line 11
    .line 12
    check-cast p1, Ljava/lang/Throwable;

    .line 13
    .line 14
    check-cast p2, Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    instance-of p1, p0, Ljava/net/SocketTimeoutException;

    .line 23
    .line 24
    if-eqz p1, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    instance-of p1, p0, Ljava/net/UnknownHostException;

    .line 28
    .line 29
    if-eqz p1, :cond_1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    instance-of p1, p0, Ljavax/net/ssl/SSLHandshakeException;

    .line 33
    .line 34
    if-eqz p1, :cond_2

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_2
    instance-of p1, p0, Ljava/net/ConnectException;

    .line 38
    .line 39
    if-eqz p1, :cond_3

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_3
    instance-of p0, p0, Ljava/lang/IllegalStateException;

    .line 43
    .line 44
    if-eqz p0, :cond_4

    .line 45
    .line 46
    :goto_0
    new-instance p0, La/y67;

    .line 47
    .line 48
    const/4 p1, 0x0

    .line 49
    new-array p2, p1, [Ljava/lang/Object;

    .line 50
    .line 51
    iget-object v2, v0, La/ctf0;->b:La/lsm0;

    .line 52
    .line 53
    invoke-static {p2, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    const v3, 0x7f1311ad

    .line 58
    .line 59
    .line 60
    invoke-virtual {v2, v3, p2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p2

    .line 64
    new-array v2, p1, [Ljava/lang/Object;

    .line 65
    .line 66
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 67
    .line 68
    invoke-static {v2, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    const v2, 0x7f13115d

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0, v2, p1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-direct {p0, p2, p1}, La/y67;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v1, p0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_4
    new-instance p0, La/x67;

    .line 87
    .line 88
    invoke-direct {p0, p2}, La/x67;-><init>(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v1, p0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 95
    .line 96
    return-object p0

    .line 97
    :pswitch_0
    check-cast p1, Ljava/lang/Throwable;

    .line 98
    .line 99
    check-cast p2, Ljava/lang/String;

    .line 100
    .line 101
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    instance-of p1, p0, La/zhi0;

    .line 108
    .line 109
    if-eqz p1, :cond_5

    .line 110
    .line 111
    check-cast p0, La/zhi0;

    .line 112
    .line 113
    iget-object p0, p0, La/zhi0;->c:La/kuw;

    .line 114
    .line 115
    sget-object p1, La/i2o;->r:La/i2o;

    .line 116
    .line 117
    if-ne p0, p1, :cond_5

    .line 118
    .line 119
    sget-object p0, La/j67;->a:La/j67;

    .line 120
    .line 121
    invoke-virtual {v1, p0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    :cond_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 125
    .line 126
    return-object p0

    .line 127
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

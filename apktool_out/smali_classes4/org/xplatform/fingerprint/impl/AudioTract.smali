.class public final Lorg/xplatform/fingerprint/impl/AudioTract;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0015\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001:\u0001\u0005J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0082 \u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "Lorg/xplatform/fingerprint/impl/AudioTract;",
        "",
        "",
        "getHardwareAudioProfile",
        "()[I",
        "a/p44",
        "impl"
    }
    k = 0x1
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final a:La/n0o0;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/a04;

    .line 5
    .line 6
    const/4 v1, 0x2

    .line 7
    invoke-direct {v0, v1}, La/a04;-><init>(B)V

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iput-object v0, p0, Lorg/xplatform/fingerprint/impl/AudioTract;->a:La/n0o0;

    .line 15
    .line 16
    return-void
.end method

.method private final native getHardwareAudioProfile()[I
.end method


# virtual methods
.method public final a()La/p44;
    .locals 5

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1a

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-lt v0, v1, :cond_2

    .line 7
    .line 8
    iget-object v0, p0, Lorg/xplatform/fingerprint/impl/AudioTract;->a:La/n0o0;

    .line 9
    .line 10
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Ljava/lang/Boolean;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_2

    .line 21
    .line 22
    :try_start_0
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 23
    .line 24
    invoke-direct {p0}, Lorg/xplatform/fingerprint/impl/AudioTract;->getHardwareAudioProfile()[I

    .line 25
    .line 26
    .line 27
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    goto :goto_0

    .line 29
    :catchall_0
    move-exception p0

    .line 30
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 31
    .line 32
    new-instance v0, La/g0g0;

    .line 33
    .line 34
    invoke-direct {v0, p0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 35
    .line 36
    .line 37
    move-object p0, v0

    .line 38
    :goto_0
    nop

    .line 39
    instance-of v0, p0, La/g0g0;

    .line 40
    .line 41
    if-eqz v0, :cond_0

    .line 42
    .line 43
    move-object p0, v2

    .line 44
    :cond_0
    check-cast p0, [I

    .line 45
    .line 46
    if-eqz p0, :cond_2

    .line 47
    .line 48
    array-length v0, p0

    .line 49
    const/4 v1, 0x4

    .line 50
    if-ne v0, v1, :cond_1

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_1
    move-object p0, v2

    .line 54
    :goto_1
    if-eqz p0, :cond_2

    .line 55
    .line 56
    new-instance v2, La/p44;

    .line 57
    .line 58
    const/4 v0, 0x0

    .line 59
    aget v0, p0, v0

    .line 60
    .line 61
    const/4 v1, 0x1

    .line 62
    aget v1, p0, v1

    .line 63
    .line 64
    const/4 v3, 0x2

    .line 65
    aget v3, p0, v3

    .line 66
    .line 67
    const/4 v4, 0x3

    .line 68
    aget p0, p0, v4

    .line 69
    .line 70
    invoke-direct {v2, v0, v1, v3, p0}, La/p44;-><init>(IIII)V

    .line 71
    .line 72
    .line 73
    :cond_2
    return-object v2
.end method

.class public final Lorg/xplatform/fingerprint/impl/MathTribunal;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001:\u0001\tJ \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0082 \u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\n"
    }
    d2 = {
        "Lorg/xplatform/fingerprint/impl/MathTribunal;",
        "",
        "",
        "seed",
        "",
        "iterations",
        "",
        "runFpuStress",
        "(DI)J",
        "a/ti30",
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
    new-instance v0, La/n230;

    .line 5
    .line 6
    const/16 v1, 0x1b

    .line 7
    .line 8
    invoke-direct {v0, v1}, La/n230;-><init>(B)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lorg/xplatform/fingerprint/impl/MathTribunal;->a:La/n0o0;

    .line 16
    .line 17
    return-void
.end method

.method public static a(Lorg/xplatform/fingerprint/impl/MathTribunal;)La/ti30;
    .locals 8

    .line 1
    iget-object v0, p0, Lorg/xplatform/fingerprint/impl/MathTribunal;->a:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    return-object v1

    .line 17
    :cond_0
    :try_start_0
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 18
    .line 19
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 20
    .line 21
    .line 22
    move-result-wide v2

    .line 23
    const-wide v4, 0x400921fb54442d18L    # Math.PI

    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    const v0, 0xf4240

    .line 29
    .line 30
    .line 31
    invoke-direct {p0, v4, v5, v0}, Lorg/xplatform/fingerprint/impl/MathTribunal;->runFpuStress(DI)J

    .line 32
    .line 33
    .line 34
    move-result-wide v4

    .line 35
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 36
    .line 37
    .line 38
    move-result-wide v6

    .line 39
    sub-long/2addr v6, v2

    .line 40
    new-instance p0, La/ti30;

    .line 41
    .line 42
    invoke-static {v4, v5}, Ljava/lang/Long;->toHexString(J)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    const/16 v2, 0x10

    .line 50
    .line 51
    invoke-static {v2, v0}, Lkotlin/text/StringsKt;->b0(ILjava/lang/String;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    long-to-double v2, v6

    .line 56
    const-wide v4, 0x412e848000000000L    # 1000000.0

    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    div-double/2addr v2, v4

    .line 62
    invoke-direct {p0, v0, v2, v3}, La/ti30;-><init>(Ljava/lang/String;D)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :catchall_0
    move-exception p0

    .line 67
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 68
    .line 69
    new-instance v0, La/g0g0;

    .line 70
    .line 71
    invoke-direct {v0, p0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 72
    .line 73
    .line 74
    move-object p0, v0

    .line 75
    :goto_0
    nop

    .line 76
    instance-of v0, p0, La/g0g0;

    .line 77
    .line 78
    if-eqz v0, :cond_1

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_1
    move-object v1, p0

    .line 82
    :goto_1
    check-cast v1, La/ti30;

    .line 83
    .line 84
    return-object v1
.end method

.method private final native runFpuStress(DI)J
.end method

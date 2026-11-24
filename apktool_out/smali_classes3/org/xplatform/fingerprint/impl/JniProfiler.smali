.class public final Lorg/xplatform/fingerprint/impl/JniProfiler;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001:\u0001\u0007J \u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0082 \u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0008"
    }
    d2 = {
        "Lorg/xplatform/fingerprint/impl/JniProfiler;",
        "",
        "",
        "a",
        "b",
        "pingWithParams",
        "(II)I",
        "a/aby",
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
    new-instance v0, La/qgx;

    .line 5
    .line 6
    const/16 v1, 0x1a

    .line 7
    .line 8
    invoke-direct {v0, v1}, La/qgx;-><init>(B)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lorg/xplatform/fingerprint/impl/JniProfiler;->a:La/n0o0;

    .line 16
    .line 17
    return-void
.end method

.method public static a(Lorg/xplatform/fingerprint/impl/JniProfiler;)La/aby;
    .locals 6

    .line 1
    iget-object v0, p0, Lorg/xplatform/fingerprint/impl/JniProfiler;->a:La/n0o0;

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
    const/4 v0, 0x0

    .line 20
    move v2, v0

    .line 21
    :goto_0
    const/16 v3, 0x4e20

    .line 22
    .line 23
    if-ge v2, v3, :cond_1

    .line 24
    .line 25
    invoke-direct {p0, v2, v2}, Lorg/xplatform/fingerprint/impl/JniProfiler;->pingWithParams(II)I

    .line 26
    .line 27
    .line 28
    add-int/lit8 v2, v2, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :catchall_0
    move-exception p0

    .line 32
    goto :goto_2

    .line 33
    :cond_1
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 34
    .line 35
    .line 36
    move-result-wide v2

    .line 37
    move v4, v0

    .line 38
    :goto_1
    const v5, 0x186a0

    .line 39
    .line 40
    .line 41
    if-ge v4, v5, :cond_2

    .line 42
    .line 43
    invoke-direct {p0, v4, v4}, Lorg/xplatform/fingerprint/impl/JniProfiler;->pingWithParams(II)I

    .line 44
    .line 45
    .line 46
    add-int/lit8 v4, v4, 0x1

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_2
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 50
    .line 51
    .line 52
    move-result-wide v4

    .line 53
    sub-long/2addr v4, v2

    .line 54
    long-to-double v2, v4

    .line 55
    const-wide v4, 0x40f86a0000000000L    # 100000.0

    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    div-double/2addr v2, v4

    .line 61
    const-wide/high16 v4, 0x4059000000000000L    # 100.0

    .line 62
    .line 63
    cmpl-double p0, v2, v4

    .line 64
    .line 65
    if-lez p0, :cond_3

    .line 66
    .line 67
    const/4 v0, 0x1

    .line 68
    :cond_3
    new-instance p0, La/aby;

    .line 69
    .line 70
    invoke-direct {p0, v2, v3, v0}, La/aby;-><init>(DZ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 71
    .line 72
    .line 73
    goto :goto_3

    .line 74
    :goto_2
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 75
    .line 76
    new-instance v0, La/g0g0;

    .line 77
    .line 78
    invoke-direct {v0, p0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 79
    .line 80
    .line 81
    move-object p0, v0

    .line 82
    :goto_3
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 83
    .line 84
    instance-of v0, p0, La/g0g0;

    .line 85
    .line 86
    if-eqz v0, :cond_4

    .line 87
    .line 88
    goto :goto_4

    .line 89
    :cond_4
    move-object v1, p0

    .line 90
    :goto_4
    check-cast v1, La/aby;

    .line 91
    .line 92
    return-object v1
.end method

.method private final native pingWithParams(II)I
.end method

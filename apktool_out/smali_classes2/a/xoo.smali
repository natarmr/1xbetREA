.class public final La/xoo;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:C

.field public final b:F

.field public final c:Ljava/util/Random;

.field public volatile d:J

.field public volatile e:I


# direct methods
.method public constructor <init>(FJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    long-to-int p2, p2

    .line 5
    iput-char p2, p0, La/xoo;->a:C

    .line 6
    .line 7
    iput p1, p0, La/xoo;->b:F

    .line 8
    .line 9
    new-instance p1, Ljava/util/Random;

    .line 10
    .line 11
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 12
    .line 13
    .line 14
    move-result-wide p2

    .line 15
    invoke-direct {p1, p2, p3}, Ljava/util/Random;-><init>(J)V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, La/xoo;->c:Ljava/util/Random;

    .line 19
    .line 20
    const-wide/16 p1, 0x3e8

    .line 21
    .line 22
    iput-wide p1, p0, La/xoo;->d:J

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 7

    .line 1
    iget v0, p0, La/xoo;->b:F

    .line 2
    .line 3
    iget-wide v1, p0, La/xoo;->d:J

    .line 4
    .line 5
    long-to-float v1, v1

    .line 6
    mul-float/2addr v1, v0

    .line 7
    iget-char v0, p0, La/xoo;->a:C

    .line 8
    .line 9
    int-to-long v2, v0

    .line 10
    long-to-float v0, v2

    .line 11
    invoke-static {v1, v0}, Ljava/lang/Math;->min(FF)F

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    float-to-long v0, v0

    .line 16
    iput-wide v0, p0, La/xoo;->d:J

    .line 17
    .line 18
    iget-wide v0, p0, La/xoo;->d:J

    .line 19
    .line 20
    iget-wide v2, p0, La/xoo;->d:J

    .line 21
    .line 22
    long-to-float v2, v2

    .line 23
    const v3, 0x3dcccccd    # 0.1f

    .line 24
    .line 25
    .line 26
    mul-float/2addr v2, v3

    .line 27
    iget-object v3, p0, La/xoo;->c:Ljava/util/Random;

    .line 28
    .line 29
    invoke-virtual {v3}, Ljava/util/Random;->nextGaussian()D

    .line 30
    .line 31
    .line 32
    move-result-wide v3

    .line 33
    float-to-double v5, v2

    .line 34
    mul-double/2addr v3, v5

    .line 35
    double-to-long v2, v3

    .line 36
    add-long/2addr v0, v2

    .line 37
    iput-wide v0, p0, La/xoo;->d:J

    .line 38
    .line 39
    iget v0, p0, La/xoo;->e:I

    .line 40
    .line 41
    add-int/lit8 v0, v0, 0x1

    .line 42
    .line 43
    iput v0, p0, La/xoo;->e:I

    .line 44
    .line 45
    return-void
.end method

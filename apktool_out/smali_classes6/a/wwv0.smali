.class public final La/wwv0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/fck0;

.field public final b:La/g2e0;

.field public final c:La/ktv0;


# direct methods
.method public constructor <init>()V
    .locals 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/fck0;

    .line 5
    .line 6
    const v1, 0x3f19999a    # 0.6f

    .line 7
    .line 8
    .line 9
    invoke-static {v1}, La/msm0;->a(F)La/dsv0;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const/16 v2, 0x13

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    invoke-direct {v0, v2, v3}, La/fck0;-><init>(BZ)V

    .line 17
    .line 18
    .line 19
    iput-object v1, v0, La/fck0;->b:Ljava/lang/Object;

    .line 20
    .line 21
    sget-object v1, La/csv0;->a:La/csv0;

    .line 22
    .line 23
    iput-object v1, v0, La/fck0;->c:Ljava/lang/Object;

    .line 24
    .line 25
    iput-object v0, p0, La/wwv0;->a:La/fck0;

    .line 26
    .line 27
    sget-object v0, La/stv0;->a:La/stv0;

    .line 28
    .line 29
    sget-object v0, La/qmk;->a:La/zcl;

    .line 30
    .line 31
    new-instance v0, La/g2e0;

    .line 32
    .line 33
    sget-wide v1, La/y3d;->g:J

    .line 34
    .line 35
    sget-object v3, La/qmk;->a:La/zcl;

    .line 36
    .line 37
    sget-object v3, La/qmk;->a:La/zcl;

    .line 38
    .line 39
    new-instance v3, La/isv0;

    .line 40
    .line 41
    const/4 v4, 0x1

    .line 42
    invoke-direct {v3, v4}, La/isv0;-><init>(Z)V

    .line 43
    .line 44
    .line 45
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 46
    .line 47
    .line 48
    iput-wide v1, v0, La/g2e0;->a:J

    .line 49
    .line 50
    iput-object v3, v0, La/g2e0;->c:Ljava/io/Serializable;

    .line 51
    .line 52
    iput-wide v1, v0, La/g2e0;->b:J

    .line 53
    .line 54
    iput-object v0, p0, La/wwv0;->b:La/g2e0;

    .line 55
    .line 56
    new-instance v0, La/ktv0;

    .line 57
    .line 58
    new-instance v3, La/ptv0;

    .line 59
    .line 60
    invoke-direct {v3, v1, v2}, La/ptv0;-><init>(J)V

    .line 61
    .line 62
    .line 63
    const/high16 v4, 0x42100000    # 36.0f

    .line 64
    .line 65
    const/high16 v5, 0x40800000    # 4.0f

    .line 66
    .line 67
    invoke-static {v4, v5}, La/qbc;->i(FF)J

    .line 68
    .line 69
    .line 70
    move-result-wide v4

    .line 71
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 72
    .line 73
    .line 74
    iput-object v3, v0, La/ktv0;->a:La/qtv0;

    .line 75
    .line 76
    iput-wide v1, v0, La/ktv0;->b:J

    .line 77
    .line 78
    sget-object v1, La/mtv0;->a:La/mtv0;

    .line 79
    .line 80
    iput-object v1, v0, La/ktv0;->c:La/ntv0;

    .line 81
    .line 82
    const/high16 v1, 0x41a00000    # 20.0f

    .line 83
    .line 84
    iput v1, v0, La/ktv0;->d:F

    .line 85
    .line 86
    iput-wide v4, v0, La/ktv0;->e:J

    .line 87
    .line 88
    iput-object v0, p0, La/wwv0;->c:La/ktv0;

    .line 89
    .line 90
    sget-object p0, La/ssv0;->a:La/ssv0;

    .line 91
    .line 92
    return-void
.end method

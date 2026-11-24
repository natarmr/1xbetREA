.class public abstract La/jz7;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/zsf;

.field public static final b:La/zsf;

.field public static final c:La/zsf;

.field public static final d:La/zsf;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/zsf;

    .line 2
    .line 3
    const v1, 0x3dac0831    # 0.084f

    .line 4
    .line 5
    .line 6
    const v2, 0x3f95c28f    # 1.17f

    .line 7
    .line 8
    .line 9
    const v3, 0x3eb0a3d7    # 0.345f

    .line 10
    .line 11
    .line 12
    const v4, 0x3f220c4a    # 0.633f

    .line 13
    .line 14
    .line 15
    invoke-direct {v0, v3, v4, v1, v2}, La/zsf;-><init>(FFFF)V

    .line 16
    .line 17
    .line 18
    sput-object v0, La/jz7;->a:La/zsf;

    .line 19
    .line 20
    new-instance v0, La/zsf;

    .line 21
    .line 22
    const v1, 0x3d343958    # 0.044f

    .line 23
    .line 24
    .line 25
    const v2, 0x3f69ba5e    # 0.913f

    .line 26
    .line 27
    .line 28
    const v3, 0x3ee978d5    # 0.456f

    .line 29
    .line 30
    .line 31
    const v4, 0x3fd83127    # 1.689f

    .line 32
    .line 33
    .line 34
    invoke-direct {v0, v3, v4, v1, v2}, La/zsf;-><init>(FFFF)V

    .line 35
    .line 36
    .line 37
    sput-object v0, La/jz7;->b:La/zsf;

    .line 38
    .line 39
    new-instance v0, La/zsf;

    .line 40
    .line 41
    const v1, 0x3ed70a3d    # 0.42f

    .line 42
    .line 43
    .line 44
    const/4 v2, 0x0

    .line 45
    const/high16 v3, 0x3f800000    # 1.0f

    .line 46
    .line 47
    invoke-direct {v0, v1, v2, v3, v3}, La/zsf;-><init>(FFFF)V

    .line 48
    .line 49
    .line 50
    sput-object v0, La/jz7;->c:La/zsf;

    .line 51
    .line 52
    new-instance v0, La/zsf;

    .line 53
    .line 54
    invoke-direct {v0, v2, v3, v3, v3}, La/zsf;-><init>(FFFF)V

    .line 55
    .line 56
    .line 57
    sput-object v0, La/jz7;->d:La/zsf;

    .line 58
    .line 59
    return-void
.end method

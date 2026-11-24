.class public abstract La/c6v0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:F

.field public static final b:F

.field public static final c:F

.field public static final d:La/lh80;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    sget-object v0, La/qmk;->a:La/zcl;

    .line 2
    .line 3
    const/high16 v0, 0x41e00000    # 28.0f

    .line 4
    .line 5
    sput v0, La/c6v0;->a:F

    .line 6
    .line 7
    const/high16 v0, 0x42000000    # 32.0f

    .line 8
    .line 9
    sput v0, La/c6v0;->b:F

    .line 10
    .line 11
    const/high16 v0, 0x42200000    # 40.0f

    .line 12
    .line 13
    sput v0, La/c6v0;->c:F

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    const/4 v1, 0x2

    .line 17
    const/high16 v2, 0x40800000    # 4.0f

    .line 18
    .line 19
    invoke-static {v2, v0, v1}, La/s5x0;->t(FFI)La/lh80;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sput-object v0, La/c6v0;->d:La/lh80;

    .line 24
    .line 25
    return-void
.end method

.class public abstract La/wmo0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:F

.field public static final b:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, La/qmk;->a:La/zcl;

    .line 2
    .line 3
    const/high16 v0, 0x42a80000    # 84.0f

    .line 4
    .line 5
    sput v0, La/wmo0;->a:F

    .line 6
    .line 7
    const/high16 v0, 0x40800000    # 4.0f

    .line 8
    .line 9
    sput v0, La/wmo0;->b:F

    .line 10
    .line 11
    return-void
.end method

.method public static final a(La/vmo0;)F
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    const/high16 v0, 0x41c00000    # 24.0f

    .line 6
    .line 7
    if-eqz p0, :cond_2

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    if-eq p0, v1, :cond_1

    .line 11
    .line 12
    const/4 v0, 0x2

    .line 13
    if-ne p0, v0, :cond_0

    .line 14
    .line 15
    sget-object p0, La/qmk;->a:La/zcl;

    .line 16
    .line 17
    const/high16 p0, 0x42000000    # 32.0f

    .line 18
    .line 19
    return p0

    .line 20
    :cond_0
    invoke-static {}, La/t9f;->b()V

    .line 21
    .line 22
    .line 23
    const/4 p0, 0x0

    .line 24
    return p0

    .line 25
    :cond_1
    sget-object p0, La/qmk;->a:La/zcl;

    .line 26
    .line 27
    return v0

    .line 28
    :cond_2
    sget-object p0, La/qmk;->a:La/zcl;

    .line 29
    .line 30
    return v0
.end method

.class public final La/kjw;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ljw;


# static fields
.field public static final a:La/kjw;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, La/kjw;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/kjw;->a:La/kjw;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(La/fet;)J
    .locals 2

    .line 1
    const p0, -0x2e46a05e

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, p0}, La/fet;->e0(I)V

    .line 5
    .line 6
    .line 7
    sget-object p0, La/zaq0;->b:La/zfn;

    .line 8
    .line 9
    invoke-virtual {p1, p0}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    check-cast p0, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 14
    .line 15
    invoke-virtual {p0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getPrimaryForeground-0d7_KjU()J

    .line 16
    .line 17
    .line 18
    move-result-wide v0

    .line 19
    const/4 p0, 0x0

    .line 20
    invoke-virtual {p1, p0}, La/fet;->r(Z)V

    .line 21
    .line 22
    .line 23
    return-wide v0
.end method

.method public final b(La/fet;)J
    .locals 2

    .line 1
    const p0, 0x213bdd22

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, p0}, La/fet;->e0(I)V

    .line 5
    .line 6
    .line 7
    sget-object p0, La/zaq0;->b:La/zfn;

    .line 8
    .line 9
    invoke-virtual {p1, p0}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    check-cast p0, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 14
    .line 15
    invoke-virtual {p0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getPrimary-0d7_KjU()J

    .line 16
    .line 17
    .line 18
    move-result-wide v0

    .line 19
    const/4 p0, 0x0

    .line 20
    invoke-virtual {p1, p0}, La/fet;->r(Z)V

    .line 21
    .line 22
    .line 23
    return-wide v0
.end method

.method public final c(La/fet;)F
    .locals 0

    .line 1
    const p0, -0x10484fc1

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, p0}, La/fet;->e0(I)V

    .line 5
    .line 6
    .line 7
    sget-object p0, La/qmk;->a:La/zcl;

    .line 8
    .line 9
    const/4 p0, 0x0

    .line 10
    invoke-virtual {p1, p0}, La/fet;->r(Z)V

    .line 11
    .line 12
    .line 13
    const/high16 p0, 0x40800000    # 4.0f

    .line 14
    .line 15
    return p0
.end method

.method public final d(La/fet;)J
    .locals 2

    .line 1
    const p0, 0x3fce5442

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, p0}, La/fet;->e0(I)V

    .line 5
    .line 6
    .line 7
    sget-object p0, La/zaq0;->b:La/zfn;

    .line 8
    .line 9
    invoke-virtual {p1, p0}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    check-cast p0, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 14
    .line 15
    invoke-virtual {p0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 16
    .line 17
    .line 18
    move-result-wide v0

    .line 19
    const/4 p0, 0x0

    .line 20
    invoke-virtual {p1, p0}, La/fet;->r(Z)V

    .line 21
    .line 22
    .line 23
    return-wide v0
.end method

.method public final e(La/fet;)V
    .locals 0

    .line 1
    const p0, -0x9ef3fdd

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, p0}, La/fet;->e0(I)V

    .line 5
    .line 6
    .line 7
    sget-object p0, La/qmk;->a:La/zcl;

    .line 8
    .line 9
    const/4 p0, 0x0

    .line 10
    invoke-virtual {p1, p0}, La/fet;->r(Z)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of p0, p1, La/kjw;

    .line 6
    .line 7
    if-nez p0, :cond_1

    .line 8
    .line 9
    const/4 p0, 0x0

    .line 10
    return p0

    .line 11
    :cond_1
    return v0
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    const p0, -0x64098aa8

    .line 2
    .line 3
    .line 4
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "HeaderFocus"

    .line 2
    .line 3
    return-object p0
.end method

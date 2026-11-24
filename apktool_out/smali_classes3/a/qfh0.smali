.class public final La/qfh0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/sfh0;


# static fields
.field public static final a:La/qfh0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, La/qfh0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/qfh0;->a:La/qfh0;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(La/fet;)J
    .locals 2

    .line 1
    const p0, 0x42bcd834

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
    invoke-virtual {p0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getInputBackground60-0d7_KjU()J

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
    const p0, 0x6a4f6272

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
    invoke-virtual {p0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getTextPrimary-0d7_KjU()J

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

.method public final c(La/fet;)La/y9q0;
    .locals 21

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    const v1, 0x7a1deb4b

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, v1}, La/fet;->e0(I)V

    .line 7
    .line 8
    .line 9
    sget-object v1, La/j1t0;->e:La/zfn;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, La/g1t0;

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    invoke-static {}, La/g1t0;->k()La/y9q0;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    sget-object v1, La/zaq0;->b:La/zfn;

    .line 25
    .line 26
    invoke-virtual {v0, v1}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    check-cast v1, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 31
    .line 32
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 33
    .line 34
    .line 35
    move-result-wide v3

    .line 36
    const/16 v19, 0x0

    .line 37
    .line 38
    const v20, 0xfffffe

    .line 39
    .line 40
    .line 41
    const-wide/16 v5, 0x0

    .line 42
    .line 43
    const/4 v7, 0x0

    .line 44
    const/4 v8, 0x0

    .line 45
    const/4 v9, 0x0

    .line 46
    const-wide/16 v10, 0x0

    .line 47
    .line 48
    const/4 v12, 0x0

    .line 49
    const/4 v13, 0x0

    .line 50
    const/4 v14, 0x0

    .line 51
    const/4 v15, 0x0

    .line 52
    const-wide/16 v16, 0x0

    .line 53
    .line 54
    const/16 v18, 0x0

    .line 55
    .line 56
    invoke-static/range {v2 .. v20}, La/y9q0;->a(La/y9q0;JJLa/psq;La/lsq;La/nrq;JLa/j56;La/k5q0;IIJLa/rw90;La/m600;I)La/y9q0;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    const/4 v2, 0x0

    .line 61
    invoke-virtual {v0, v2}, La/fet;->r(Z)V

    .line 62
    .line 63
    .line 64
    return-object v1
.end method

.method public final d(La/fet;)J
    .locals 2

    .line 1
    const p0, -0x4396d7cc

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

.method public final e(La/fet;)J
    .locals 2

    .line 1
    const p0, -0x645f757e

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
    instance-of p0, p1, La/qfh0;

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

.method public final f(La/fet;)La/y9q0;
    .locals 21

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    const v1, -0x357ca4e9    # -4304267.5f

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, v1}, La/fet;->e0(I)V

    .line 7
    .line 8
    .line 9
    sget-object v1, La/j1t0;->e:La/zfn;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, La/g1t0;

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    invoke-static {}, La/g1t0;->k()La/y9q0;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    sget-object v1, La/zaq0;->b:La/zfn;

    .line 25
    .line 26
    invoke-virtual {v0, v1}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    check-cast v1, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 31
    .line 32
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getTextPrimary-0d7_KjU()J

    .line 33
    .line 34
    .line 35
    move-result-wide v3

    .line 36
    const/16 v19, 0x0

    .line 37
    .line 38
    const v20, 0xfffffe

    .line 39
    .line 40
    .line 41
    const-wide/16 v5, 0x0

    .line 42
    .line 43
    const/4 v7, 0x0

    .line 44
    const/4 v8, 0x0

    .line 45
    const/4 v9, 0x0

    .line 46
    const-wide/16 v10, 0x0

    .line 47
    .line 48
    const/4 v12, 0x0

    .line 49
    const/4 v13, 0x0

    .line 50
    const/4 v14, 0x0

    .line 51
    const/4 v15, 0x0

    .line 52
    const-wide/16 v16, 0x0

    .line 53
    .line 54
    const/16 v18, 0x0

    .line 55
    .line 56
    invoke-static/range {v2 .. v20}, La/y9q0;->a(La/y9q0;JJLa/psq;La/lsq;La/nrq;JLa/j56;La/k5q0;IIJLa/rw90;La/m600;I)La/y9q0;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    const/4 v2, 0x0

    .line 61
    invoke-virtual {v0, v2}, La/fet;->r(Z)V

    .line 62
    .line 63
    .line 64
    return-object v1
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    const p0, 0x3d3f3c91    # 0.04668862f

    .line 2
    .line 3
    .line 4
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "Default"

    .line 2
    .line 3
    return-object p0
.end method

.class public abstract La/v6h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/uts0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    sget-object v0, La/hhn;->c:La/zsf;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/16 v2, 0xc8

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    invoke-static {v2, v3, v0, v1}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, La/v6h;->a:La/uts0;

    .line 12
    .line 13
    return-void
.end method

.method public static final a()La/alo;
    .locals 5

    .line 1
    sget-object v0, La/gqw0;->l:La/yx7;

    .line 2
    .line 3
    sget-object v1, La/quu0;->a:Ljava/util/Map;

    .line 4
    .line 5
    new-instance v1, La/qkx;

    .line 6
    .line 7
    const-wide v2, 0x100000001L

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    invoke-direct {v1, v2, v3}, La/qkx;-><init>(J)V

    .line 13
    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    const/4 v3, 0x0

    .line 17
    const/high16 v4, 0x43c80000    # 400.0f

    .line 18
    .line 19
    invoke-static {v3, v4, v1, v2}, La/ro4;->g0(FFLjava/lang/Object;I)La/nul0;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    const/16 v2, 0xc

    .line 24
    .line 25
    invoke-static {v1, v0, v2}, La/kzn;->i(La/cfq;La/yx7;I)La/alo;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    return-object v0
.end method

.method public static final b()La/pzn;
    .locals 5

    .line 1
    sget-object v0, La/gqw0;->l:La/yx7;

    .line 2
    .line 3
    sget-object v1, La/quu0;->a:Ljava/util/Map;

    .line 4
    .line 5
    new-instance v1, La/qkx;

    .line 6
    .line 7
    const-wide v2, 0x100000001L

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    invoke-direct {v1, v2, v3}, La/qkx;-><init>(J)V

    .line 13
    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    const/4 v3, 0x0

    .line 17
    const/high16 v4, 0x43480000    # 200.0f

    .line 18
    .line 19
    invoke-static {v3, v4, v1, v2}, La/ro4;->g0(FFLjava/lang/Object;I)La/nul0;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    const/16 v2, 0xc

    .line 24
    .line 25
    invoke-static {v1, v0, v2}, La/kzn;->c(La/cfq;La/yx7;I)La/pzn;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    return-object v0
.end method

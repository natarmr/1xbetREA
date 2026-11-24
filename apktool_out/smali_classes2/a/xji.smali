.class public final La/xji;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/cs00;


# instance fields
.field public final a:La/gii0;

.field public final b:La/n5d0;


# direct methods
.method public constructor <init>(La/gii0;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/xji;->a:La/gii0;

    .line 5
    .line 6
    new-instance p1, La/p8i;

    .line 7
    .line 8
    const/4 v0, 0x7

    .line 9
    invoke-direct {p1, v0}, La/p8i;-><init>(B)V

    .line 10
    .line 11
    .line 12
    invoke-static {p1}, La/mbl;->b(La/n5d0;)La/n5d0;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iput-object p1, p0, La/xji;->b:La/n5d0;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final a()La/dpi0;
    .locals 1

    .line 1
    new-instance v0, La/dpi0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/xji;->g()La/ieu;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-direct {v0, p0}, La/dpi0;-><init>(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public final b()La/viu;
    .locals 1

    .line 1
    new-instance v0, La/viu;

    .line 2
    .line 3
    invoke-virtual {p0}, La/xji;->g()La/ieu;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-direct {v0, p0}, La/viu;-><init>(La/ieu;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public final c()La/drm0;
    .locals 1

    .line 1
    new-instance v0, La/drm0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/xji;->g()La/ieu;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-direct {v0, p0}, La/drm0;-><init>(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public final d()La/viu;
    .locals 1

    .line 1
    new-instance v0, La/viu;

    .line 2
    .line 3
    invoke-virtual {p0}, La/xji;->g()La/ieu;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-direct {v0, p0}, La/viu;-><init>(La/ieu;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public final e()La/hs00;
    .locals 1

    .line 1
    new-instance v0, La/hs00;

    .line 2
    .line 3
    invoke-virtual {p0}, La/xji;->g()La/ieu;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-direct {v0, p0}, La/hs00;-><init>(La/ieu;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public final f()La/o2z;
    .locals 1

    .line 1
    new-instance v0, La/o2z;

    .line 2
    .line 3
    invoke-virtual {p0}, La/xji;->g()La/ieu;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-direct {v0, p0}, La/o2z;-><init>(La/ieu;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public final g()La/ieu;
    .locals 4

    .line 1
    new-instance v0, La/ieu;

    .line 2
    .line 3
    new-instance v1, La/zn00;

    .line 4
    .line 5
    iget-object v2, p0, La/xji;->a:La/gii0;

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    invoke-direct {v1, v2, v3}, La/zn00;-><init>(La/gii0;B)V

    .line 9
    .line 10
    .line 11
    iget-object p0, p0, La/xji;->b:La/n5d0;

    .line 12
    .line 13
    invoke-interface {p0}, La/o5d0;->get()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, La/es00;

    .line 18
    .line 19
    invoke-direct {v0, v1, p0}, La/ieu;-><init>(La/zn00;La/es00;)V

    .line 20
    .line 21
    .line 22
    return-object v0
.end method

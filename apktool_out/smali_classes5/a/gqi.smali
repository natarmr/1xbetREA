.class public final La/gqi;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/c1d0;


# instance fields
.field public final a:La/j1d0;

.field public final b:La/gii0;

.field public final c:La/a1d0;

.field public final d:La/knf0;

.field public final e:La/tgk;

.field public final f:La/cs00;


# direct methods
.method public constructor <init>(La/cs00;La/a1d0;La/j1d0;La/gii0;La/knf0;La/tgk;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, La/gqi;->a:La/j1d0;

    .line 5
    .line 6
    iput-object p4, p0, La/gqi;->b:La/gii0;

    .line 7
    .line 8
    iput-object p2, p0, La/gqi;->c:La/a1d0;

    .line 9
    .line 10
    iput-object p5, p0, La/gqi;->d:La/knf0;

    .line 11
    .line 12
    iput-object p6, p0, La/gqi;->e:La/tgk;

    .line 13
    .line 14
    iput-object p1, p0, La/gqi;->f:La/cs00;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final a()La/fl70;
    .locals 0

    .line 1
    new-instance p0, La/fl70;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public final b()La/a1d0;
    .locals 0

    .line 1
    iget-object p0, p0, La/gqi;->c:La/a1d0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final c()La/orc;
    .locals 1

    .line 1
    new-instance v0, La/orc;

    .line 2
    .line 3
    invoke-virtual {p0}, La/gqi;->j()La/y1d0;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-direct {v0, p0}, La/orc;-><init>(La/y1d0;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public final d()La/zx10;
    .locals 2

    .line 1
    new-instance v0, La/zx10;

    .line 2
    .line 3
    new-instance v1, La/orc;

    .line 4
    .line 5
    invoke-virtual {p0}, La/gqi;->j()La/y1d0;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-direct {v1, p0}, La/orc;-><init>(La/y1d0;)V

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, v1}, La/zx10;-><init>(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public final e()La/ylt0;
    .locals 3

    .line 1
    new-instance v0, La/ylt0;

    .line 2
    .line 3
    new-instance v1, La/ppu;

    .line 4
    .line 5
    invoke-virtual {p0}, La/gqi;->j()La/y1d0;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-direct {v1, v2}, La/ppu;-><init>(La/y1d0;)V

    .line 10
    .line 11
    .line 12
    iget-object p0, p0, La/gqi;->f:La/cs00;

    .line 13
    .line 14
    invoke-interface {p0}, La/cs00;->d()La/viu;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-direct {v0, v1, p0}, La/ylt0;-><init>(La/ppu;La/viu;)V

    .line 19
    .line 20
    .line 21
    return-object v0
.end method

.method public final f()La/orc;
    .locals 1

    .line 1
    new-instance v0, La/orc;

    .line 2
    .line 3
    invoke-virtual {p0}, La/gqi;->j()La/y1d0;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-direct {v0, p0}, La/orc;-><init>(La/y1d0;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public final g()La/i1d0;
    .locals 2

    .line 1
    new-instance v0, La/i1d0;

    .line 2
    .line 3
    new-instance v1, La/iw20;

    .line 4
    .line 5
    invoke-virtual {p0}, La/gqi;->j()La/y1d0;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-direct {v1, p0}, La/iw20;-><init>(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, v1}, La/i1d0;-><init>(La/iw20;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public final h()La/ppu;
    .locals 1

    .line 1
    new-instance v0, La/ppu;

    .line 2
    .line 3
    invoke-virtual {p0}, La/gqi;->j()La/y1d0;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-direct {v0, p0}, La/ppu;-><init>(La/y1d0;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public final i()La/iw20;
    .locals 1

    .line 1
    new-instance v0, La/iw20;

    .line 2
    .line 3
    invoke-virtual {p0}, La/gqi;->j()La/y1d0;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-direct {v0, p0}, La/iw20;-><init>(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public final j()La/y1d0;
    .locals 6

    .line 1
    new-instance v0, La/y1d0;

    .line 2
    .line 3
    new-instance v2, La/jw20;

    .line 4
    .line 5
    iget-object v1, p0, La/gqi;->b:La/gii0;

    .line 6
    .line 7
    const/16 v3, 0x10

    .line 8
    .line 9
    invoke-direct {v2, v1, v3}, La/jw20;-><init>(La/gii0;B)V

    .line 10
    .line 11
    .line 12
    iget-object v4, p0, La/gqi;->d:La/knf0;

    .line 13
    .line 14
    iget-object v5, p0, La/gqi;->e:La/tgk;

    .line 15
    .line 16
    iget-object v1, p0, La/gqi;->a:La/j1d0;

    .line 17
    .line 18
    iget-object v3, p0, La/gqi;->c:La/a1d0;

    .line 19
    .line 20
    invoke-direct/range {v0 .. v5}, La/y1d0;-><init>(La/j1d0;La/jw20;La/a1d0;La/knf0;La/tgk;)V

    .line 21
    .line 22
    .line 23
    return-object v0
.end method

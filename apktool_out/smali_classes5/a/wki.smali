.class public final La/wki;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/dx10;


# instance fields
.field public final a:La/epi0;

.field public final b:La/rmd0;

.field public final c:La/roi0;

.field public final d:La/wsf0;


# direct methods
.method public constructor <init>(La/roi0;La/wsf0;La/rmd0;La/epi0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p4, p0, La/wki;->a:La/epi0;

    .line 5
    .line 6
    iput-object p3, p0, La/wki;->b:La/rmd0;

    .line 7
    .line 8
    iput-object p1, p0, La/wki;->c:La/roi0;

    .line 9
    .line 10
    iput-object p2, p0, La/wki;->d:La/wsf0;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final a()La/zx10;
    .locals 1

    .line 1
    new-instance v0, La/zx10;

    .line 2
    .line 3
    iget-object p0, p0, La/wki;->a:La/epi0;

    .line 4
    .line 5
    iget-object p0, p0, La/epi0;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/xzp;

    .line 8
    .line 9
    invoke-virtual {p0}, La/xzp;->C()La/r9u;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-direct {v0, p0}, La/zx10;-><init>(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public final b()La/mnb;
    .locals 8

    .line 1
    new-instance v0, La/mnb;

    .line 2
    .line 3
    iget-object v1, p0, La/wki;->b:La/rmd0;

    .line 4
    .line 5
    invoke-interface {v1}, La/rmd0;->c()La/yqc;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v1}, La/x1x;->x(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iget-object v2, p0, La/wki;->c:La/roi0;

    .line 13
    .line 14
    iget-object v2, v2, La/roi0;->a:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v2, La/qgd;

    .line 17
    .line 18
    invoke-virtual {v2}, La/qgd;->x()La/rrc;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    iget-object p0, p0, La/wki;->d:La/wsf0;

    .line 23
    .line 24
    invoke-virtual {p0}, La/wsf0;->b()La/ot;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    invoke-virtual {p0}, La/wsf0;->q()La/jyg0;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    iget-object v5, p0, La/wsf0;->b:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v5, La/g45;

    .line 35
    .line 36
    invoke-virtual {v5}, La/g45;->b()La/sp;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    invoke-virtual {p0}, La/wsf0;->s()La/trm0;

    .line 41
    .line 42
    .line 43
    move-result-object v6

    .line 44
    const/4 v7, 0x1

    .line 45
    invoke-direct/range {v0 .. v7}, La/mnb;-><init>(La/yqc;La/rrc;La/ot;La/jyg0;La/sp;La/trm0;B)V

    .line 46
    .line 47
    .line 48
    return-object v0
.end method

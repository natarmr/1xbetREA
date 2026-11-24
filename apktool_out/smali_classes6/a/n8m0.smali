.class public final La/n8m0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/cwk;


# instance fields
.field public final a:La/l7m0;

.field public final b:La/l7m0;


# direct methods
.method public constructor <init>(La/bwk;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, La/bwk;->a:La/zhk;

    .line 5
    .line 6
    invoke-static {v0}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 7
    .line 8
    .line 9
    iget-object v0, p1, La/bwk;->b:La/la80;

    .line 10
    .line 11
    invoke-static {v0}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 12
    .line 13
    .line 14
    iget v0, p1, La/bwk;->c:F

    .line 15
    .line 16
    new-instance v1, La/ycl;

    .line 17
    .line 18
    invoke-direct {v1, v0}, La/ycl;-><init>(F)V

    .line 19
    .line 20
    .line 21
    invoke-static {v1}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 22
    .line 23
    .line 24
    iget v0, p1, La/bwk;->d:F

    .line 25
    .line 26
    new-instance v1, La/ycl;

    .line 27
    .line 28
    invoke-direct {v1, v0}, La/ycl;-><init>(F)V

    .line 29
    .line 30
    .line 31
    invoke-static {v1}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 32
    .line 33
    .line 34
    iget-object v0, p1, La/bwk;->e:La/w6k;

    .line 35
    .line 36
    invoke-static {v0}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 37
    .line 38
    .line 39
    iget v0, p1, La/bwk;->f:F

    .line 40
    .line 41
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-static {v0}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 46
    .line 47
    .line 48
    iget-object v0, p1, La/bwk;->g:La/erq;

    .line 49
    .line 50
    invoke-static {v0}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 51
    .line 52
    .line 53
    iget-object v0, p1, La/bwk;->h:La/t9o0;

    .line 54
    .line 55
    invoke-static {v0}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    iput-object v0, p0, La/n8m0;->a:La/l7m0;

    .line 60
    .line 61
    iget-object v0, p1, La/bwk;->i:La/sly;

    .line 62
    .line 63
    invoke-static {v0}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 64
    .line 65
    .line 66
    iget p1, p1, La/bwk;->j:F

    .line 67
    .line 68
    new-instance v0, La/ycl;

    .line 69
    .line 70
    invoke-direct {v0, p1}, La/ycl;-><init>(F)V

    .line 71
    .line 72
    .line 73
    invoke-static {v0}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    iput-object p1, p0, La/n8m0;->b:La/l7m0;

    .line 78
    .line 79
    return-void
.end method


# virtual methods
.method public final a()La/l7m0;
    .locals 0

    .line 1
    iget-object p0, p0, La/n8m0;->b:La/l7m0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final b()La/l7m0;
    .locals 0

    .line 1
    iget-object p0, p0, La/n8m0;->a:La/l7m0;

    .line 2
    .line 3
    return-object p0
.end method

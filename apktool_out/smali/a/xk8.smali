.class public final La/xk8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/vj50;


# instance fields
.field public final synthetic a:La/c3d;

.field public final synthetic b:La/c3d;

.field public final synthetic c:La/wom;


# direct methods
.method public constructor <init>(La/c3d;La/wom;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/xk8;->b:La/c3d;

    .line 5
    .line 6
    iput-object p2, p0, La/xk8;->c:La/wom;

    .line 7
    .line 8
    iput-object p1, p0, La/xk8;->a:La/c3d;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final C(IJ)J
    .locals 4

    .line 1
    iget-object v0, p0, La/xk8;->c:La/wom;

    .line 2
    .line 3
    invoke-virtual {v0}, La/wom;->c()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    cmpl-float v0, v0, v1

    .line 9
    .line 10
    if-lez v0, :cond_0

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    if-ne p1, v0, :cond_0

    .line 14
    .line 15
    const-wide v2, 0xffffffffL

    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    and-long/2addr v2, p2

    .line 21
    long-to-int v0, v2

    .line 22
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    cmpg-float v0, v0, v1

    .line 27
    .line 28
    if-gez v0, :cond_0

    .line 29
    .line 30
    const-wide/16 p0, 0x0

    .line 31
    .line 32
    return-wide p0

    .line 33
    :cond_0
    iget-object p0, p0, La/xk8;->b:La/c3d;

    .line 34
    .line 35
    invoke-virtual {p0, p1, p2, p3}, La/c3d;->C(IJ)J

    .line 36
    .line 37
    .line 38
    move-result-wide p0

    .line 39
    return-wide p0
.end method

.method public final I0(JLa/yje;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, La/xk8;->a:La/c3d;

    .line 2
    .line 3
    invoke-interface {p0, p1, p2, p3}, La/vj50;->I0(JLa/yje;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final S(IJJ)J
    .locals 0

    .line 1
    iget-object p0, p0, La/xk8;->a:La/c3d;

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p5}, La/c3d;->S(IJJ)J

    .line 4
    .line 5
    .line 6
    move-result-wide p0

    .line 7
    return-wide p0
.end method

.method public final g(JJLa/zje;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, La/xk8;->a:La/c3d;

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p5}, La/c3d;->g(JJLa/zje;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

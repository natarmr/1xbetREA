.class public final La/y4q0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/v4q0;


# instance fields
.field public final a:J

.field public final synthetic b:La/z4q0;


# direct methods
.method public constructor <init>(La/z4q0;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/y4q0;->b:La/z4q0;

    .line 5
    .line 6
    iput-wide p2, p0, La/y4q0;->a:J

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final G()La/u4q0;
    .locals 0

    .line 1
    iget-object p0, p0, La/y4q0;->b:La/z4q0;

    .line 2
    .line 3
    invoke-static {p0}, La/etm0;->k(La/yzj;)La/u4q0;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final L0(La/j6z;)J
    .locals 4

    .line 1
    iget-object v0, p0, La/y4q0;->b:La/z4q0;

    .line 2
    .line 3
    iget-object v0, v0, La/z4q0;->r:La/pz40;

    .line 4
    .line 5
    check-cast v0, La/hgk0;

    .line 6
    .line 7
    invoke-virtual {v0}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, La/j6z;

    .line 12
    .line 13
    const-wide/16 v1, 0x0

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    invoke-interface {v0}, La/j6z;->h()Z

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    if-nez v3, :cond_0

    .line 22
    .line 23
    return-wide v1

    .line 24
    :cond_0
    iget-wide v1, p0, La/y4q0;->a:J

    .line 25
    .line 26
    invoke-interface {v0, v1, v2}, La/j6z;->R(J)J

    .line 27
    .line 28
    .line 29
    move-result-wide v0

    .line 30
    invoke-interface {p1, v0, v1}, La/j6z;->C(J)J

    .line 31
    .line 32
    .line 33
    move-result-wide p0

    .line 34
    return-wide p0

    .line 35
    :cond_1
    const-string p0, "Tried to open context menu before the anchor was placed."

    .line 36
    .line 37
    invoke-static {p0}, La/adx;->d(Ljava/lang/String;)Ljava/lang/Void;

    .line 38
    .line 39
    .line 40
    invoke-static {}, La/csj;->b()V

    .line 41
    .line 42
    .line 43
    return-wide v1
.end method

.method public final y0(La/j6z;)La/jge0;
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, La/y4q0;->L0(La/j6z;)J

    .line 2
    .line 3
    .line 4
    move-result-wide p0

    .line 5
    const-wide/16 v0, 0x0

    .line 6
    .line 7
    invoke-static {p0, p1, v0, v1}, La/k9x;->r(JJ)La/jge0;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.class public final La/x33;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/b43;


# instance fields
.field public final a:La/v33;

.field public final b:La/v33;


# direct methods
.method public constructor <init>(La/v33;La/v33;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/x33;->a:La/v33;

    .line 5
    .line 6
    iput-object p2, p0, La/x33;->b:La/v33;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final f0()La/sz5;
    .locals 2

    .line 1
    new-instance v0, La/a0l0;

    .line 2
    .line 3
    iget-object v1, p0, La/x33;->a:La/v33;

    .line 4
    .line 5
    invoke-virtual {v1}, La/v33;->n1()La/hlq;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object p0, p0, La/x33;->b:La/v33;

    .line 10
    .line 11
    invoke-virtual {p0}, La/v33;->n1()La/hlq;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-direct {v0, v1, p0}, La/a0l0;-><init>(La/hlq;La/hlq;)V

    .line 16
    .line 17
    .line 18
    return-object v0
.end method

.method public final g()Z
    .locals 1

    .line 1
    iget-object v0, p0, La/x33;->a:La/v33;

    .line 2
    .line 3
    invoke-virtual {v0}, La/p4;->g()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object p0, p0, La/x33;->b:La/v33;

    .line 10
    .line 11
    invoke-virtual {p0}, La/p4;->g()Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    const/4 p0, 0x1

    .line 18
    return p0

    .line 19
    :cond_0
    const/4 p0, 0x0

    .line 20
    return p0
.end method

.method public final j0()Ljava/util/List;
    .locals 1

    .line 1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string v0, "Cannot call getKeyframes on AnimatableSplitDimensionPathValue."

    .line 4
    .line 5
    invoke-direct {p0, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

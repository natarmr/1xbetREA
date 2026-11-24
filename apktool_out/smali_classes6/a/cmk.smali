.class public final La/cmk;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public b:I

.field public c:I

.field public d:I


# virtual methods
.method public final a()I
    .locals 1

    .line 1
    iget v0, p0, La/cmk;->d:I

    .line 2
    .line 3
    iget p0, p0, La/cmk;->c:I

    .line 4
    .line 5
    sub-int/2addr v0, p0

    .line 6
    return v0
.end method

.method public final b()I
    .locals 1

    .line 1
    iget v0, p0, La/cmk;->b:I

    .line 2
    .line 3
    iget p0, p0, La/cmk;->a:I

    .line 4
    .line 5
    sub-int/2addr v0, p0

    .line 6
    return v0
.end method

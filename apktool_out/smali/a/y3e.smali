.class public final La/y3e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/x3e;


# instance fields
.field public a:F

.field public b:F


# virtual methods
.method public final value()F
    .locals 2

    .line 1
    iget v0, p0, La/y3e;->b:F

    .line 2
    .line 3
    iget v1, p0, La/y3e;->a:F

    .line 4
    .line 5
    add-float/2addr v0, v1

    .line 6
    iput v0, p0, La/y3e;->b:F

    .line 7
    .line 8
    return v0
.end method

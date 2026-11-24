.class public final La/ch80;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/hh80;


# instance fields
.field public final synthetic b:La/hh80;

.field public final synthetic c:La/hh80;


# direct methods
.method public constructor <init>(La/hh80;La/hh80;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/ch80;->b:La/hh80;

    .line 5
    .line 6
    iput-object p2, p0, La/ch80;->c:La/hh80;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()F
    .locals 1

    .line 1
    iget-object v0, p0, La/ch80;->b:La/hh80;

    .line 2
    .line 3
    invoke-interface {v0}, La/hh80;->a()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object p0, p0, La/ch80;->c:La/hh80;

    .line 8
    .line 9
    invoke-interface {p0}, La/hh80;->a()F

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    add-float/2addr p0, v0

    .line 14
    return p0
.end method

.method public final b(La/k6z;)F
    .locals 1

    .line 1
    iget-object v0, p0, La/ch80;->b:La/hh80;

    .line 2
    .line 3
    invoke-interface {v0, p1}, La/hh80;->b(La/k6z;)F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object p0, p0, La/ch80;->c:La/hh80;

    .line 8
    .line 9
    invoke-interface {p0, p1}, La/hh80;->b(La/k6z;)F

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    add-float/2addr p0, v0

    .line 14
    return p0
.end method

.method public final c(La/k6z;)F
    .locals 1

    .line 1
    iget-object v0, p0, La/ch80;->b:La/hh80;

    .line 2
    .line 3
    invoke-interface {v0, p1}, La/hh80;->c(La/k6z;)F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object p0, p0, La/ch80;->c:La/hh80;

    .line 8
    .line 9
    invoke-interface {p0, p1}, La/hh80;->c(La/k6z;)F

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    add-float/2addr p0, v0

    .line 14
    return p0
.end method

.method public final d()F
    .locals 1

    .line 1
    iget-object v0, p0, La/ch80;->b:La/hh80;

    .line 2
    .line 3
    invoke-interface {v0}, La/hh80;->d()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object p0, p0, La/ch80;->c:La/hh80;

    .line 8
    .line 9
    invoke-interface {p0}, La/hh80;->d()F

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    add-float/2addr p0, v0

    .line 14
    return p0
.end method

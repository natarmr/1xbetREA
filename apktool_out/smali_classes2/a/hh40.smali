.class public final La/hh40;
.super La/qkj;
.source "SourceFile"


# instance fields
.field public c:Z


# virtual methods
.method public final b(La/gv90;)La/chf0;
    .locals 3

    .line 1
    iget-boolean v0, p0, La/hh40;->c:Z

    .line 2
    .line 3
    const/16 v1, 0xc

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput-boolean v0, p0, La/hh40;->c:Z

    .line 9
    .line 10
    new-instance p0, La/chf0;

    .line 11
    .line 12
    new-instance v0, La/nhf0;

    .line 13
    .line 14
    new-instance v2, La/oox;

    .line 15
    .line 16
    invoke-direct {v2, p1}, La/oox;-><init>(La/mjq;)V

    .line 17
    .line 18
    .line 19
    invoke-direct {v0, v2}, La/nhf0;-><init>(La/mjq;)V

    .line 20
    .line 21
    .line 22
    invoke-direct {p0, v0, v1}, La/chf0;-><init>(Ljava/lang/Object;B)V

    .line 23
    .line 24
    .line 25
    return-object p0

    .line 26
    :cond_0
    const/4 v0, 0x1

    .line 27
    iput-boolean v0, p0, La/hh40;->c:Z

    .line 28
    .line 29
    new-instance p0, La/chf0;

    .line 30
    .line 31
    new-instance v0, La/nhf0;

    .line 32
    .line 33
    invoke-direct {v0, p1}, La/nhf0;-><init>(La/mjq;)V

    .line 34
    .line 35
    .line 36
    invoke-direct {p0, v0, v1}, La/chf0;-><init>(Ljava/lang/Object;B)V

    .line 37
    .line 38
    .line 39
    return-object p0
.end method

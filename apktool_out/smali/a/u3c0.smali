.class public final La/u3c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ncs0;


# instance fields
.field public final a:La/hxg0;

.field public final b:La/hxg0;

.field public final c:La/pnk;

.field public final d:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method public constructor <init>(La/hxg0;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/u3c0;->a:La/hxg0;

    .line 5
    .line 6
    iput-object p1, p0, La/u3c0;->b:La/hxg0;

    .line 7
    .line 8
    new-instance p1, La/pnk;

    .line 9
    .line 10
    invoke-direct {p1}, La/pnk;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, La/u3c0;->c:La/pnk;

    .line 14
    .line 15
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, La/u3c0;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final a(ILa/fq80;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, La/u3c0;->h()La/ncs0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0, p1, p2}, La/ncs0;->a(ILa/fq80;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final b(JIIILa/mcs0;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, La/u3c0;->h()La/ncs0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface/range {p0 .. p6}, La/ncs0;->b(JIIILa/mcs0;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final c(Landroidx/media3/common/b;)V
    .locals 0

    .line 1
    iget-object p0, p0, La/u3c0;->a:La/hxg0;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/hxg0;->c(Landroidx/media3/common/b;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final d(La/fq80;II)V
    .locals 0

    .line 1
    invoke-virtual {p0}, La/u3c0;->h()La/ncs0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0, p1, p2, p3}, La/ncs0;->d(La/fq80;II)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final e(La/bbj;IZ)I
    .locals 0

    .line 1
    invoke-virtual {p0}, La/u3c0;->h()La/ncs0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0, p1, p2, p3}, La/ncs0;->e(La/bbj;IZ)I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final f(J)V
    .locals 0

    .line 1
    return-void
.end method

.method public final g(La/bbj;IZ)I
    .locals 0

    .line 1
    invoke-virtual {p0}, La/u3c0;->h()La/ncs0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0, p1, p2, p3}, La/ncs0;->g(La/bbj;IZ)I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final h()La/ncs0;
    .locals 1

    .line 1
    iget-object v0, p0, La/u3c0;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object p0, p0, La/u3c0;->c:La/pnk;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    iget-object p0, p0, La/u3c0;->b:La/hxg0;

    .line 13
    .line 14
    return-object p0
.end method

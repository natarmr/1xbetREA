.class public final La/h0h0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/i0h0;

.field public final b:La/a7g0;

.field public final c:La/y2m0;

.field public final d:La/hz40;

.field public e:Z

.field public f:Landroid/os/Bundle;

.field public g:Z

.field public h:Z


# direct methods
.method public constructor <init>(La/i0h0;La/a7g0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/h0h0;->a:La/i0h0;

    .line 5
    .line 6
    iput-object p2, p0, La/h0h0;->b:La/a7g0;

    .line 7
    .line 8
    new-instance p1, La/y2m0;

    .line 9
    .line 10
    const/16 p2, 0x9

    .line 11
    .line 12
    invoke-direct {p1, p2}, La/y2m0;-><init>(B)V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, La/h0h0;->c:La/y2m0;

    .line 16
    .line 17
    sget-object p1, La/u1h0;->a:[J

    .line 18
    .line 19
    new-instance p1, La/hz40;

    .line 20
    .line 21
    invoke-direct {p1}, La/hz40;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, La/h0h0;->d:La/hz40;

    .line 25
    .line 26
    const/4 p1, 0x1

    .line 27
    iput-boolean p1, p0, La/h0h0;->h:Z

    .line 28
    .line 29
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .line 1
    iget-object v0, p0, La/h0h0;->a:La/i0h0;

    .line 2
    .line 3
    invoke-interface {v0}, La/clz;->x()La/glz;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object v1, v1, La/glz;->i:La/lkz;

    .line 8
    .line 9
    sget-object v2, La/lkz;->b:La/lkz;

    .line 10
    .line 11
    if-ne v1, v2, :cond_1

    .line 12
    .line 13
    iget-boolean v1, p0, La/h0h0;->e:Z

    .line 14
    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    iget-object v1, p0, La/h0h0;->b:La/a7g0;

    .line 18
    .line 19
    invoke-virtual {v1}, La/a7g0;->invoke()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    invoke-interface {v0}, La/clz;->x()La/glz;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    new-instance v1, La/g02;

    .line 27
    .line 28
    const/4 v2, 0x3

    .line 29
    invoke-direct {v1, p0, v2}, La/g02;-><init>(Ljava/lang/Object;B)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, v1}, La/glz;->a(La/blz;)V

    .line 33
    .line 34
    .line 35
    const/4 v0, 0x1

    .line 36
    iput-boolean v0, p0, La/h0h0;->e:Z

    .line 37
    .line 38
    return-void

    .line 39
    :cond_0
    const-string p0, "SavedStateRegistry was already attached."

    .line 40
    .line 41
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_1
    const-string p0, "Restarter must be created only during owner\'s initialization stage"

    .line 46
    .line 47
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    return-void
.end method

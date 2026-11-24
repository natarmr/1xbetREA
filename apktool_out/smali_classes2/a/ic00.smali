.class public final La/ic00;
.super La/a1;
.source "SourceFile"


# instance fields
.field public final a:La/gc00;

.field public b:Z

.field public c:I


# direct methods
.method public constructor <init>(La/gc00;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/ic00;->a:La/gc00;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final b(La/p78;)Z
    .locals 2

    .line 1
    instance-of p1, p1, La/hd00;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p1, :cond_1

    .line 5
    .line 6
    iget-boolean p1, p0, La/ic00;->b:Z

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    iget p1, p0, La/ic00;->c:I

    .line 12
    .line 13
    if-ne p1, v1, :cond_0

    .line 14
    .line 15
    iget-object p1, p0, La/ic00;->a:La/gc00;

    .line 16
    .line 17
    iput-boolean v0, p1, La/gc00;->g:Z

    .line 18
    .line 19
    iput-boolean v0, p0, La/ic00;->b:Z

    .line 20
    .line 21
    :cond_0
    return v1

    .line 22
    :cond_1
    return v0
.end method

.method public final d()La/p78;
    .locals 0

    .line 1
    iget-object p0, p0, La/ic00;->a:La/gc00;

    .line 2
    .line 3
    return-object p0
.end method

.method public final e()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final g(La/yxk;)La/iyc;
    .locals 2

    .line 1
    iget-boolean v0, p1, La/yxk;->h:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iput-boolean v1, p0, La/ic00;->b:Z

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput v0, p0, La/ic00;->c:I

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-boolean v0, p0, La/ic00;->b:Z

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    iget v0, p0, La/ic00;->c:I

    .line 17
    .line 18
    add-int/2addr v0, v1

    .line 19
    iput v0, p0, La/ic00;->c:I

    .line 20
    .line 21
    :cond_1
    :goto_0
    iget p0, p1, La/yxk;->b:I

    .line 22
    .line 23
    invoke-static {p0}, La/iyc;->a(I)La/iyc;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0
.end method

.class public La/hyj0;
.super La/fdx;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:B

.field public final c:I


# direct methods
.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/hyj0;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput-byte p2, p0, La/hyj0;->b:B

    .line 7
    .line 8
    iput p3, p0, La/hyj0;->c:I

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public b(La/htw;Ljava/lang/String;La/j;)V
    .locals 0

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/hyj0;->a:Ljava/lang/String;

    .line 5
    .line 6
    invoke-virtual {p1, p0}, La/htw;->g0(Ljava/lang/CharSequence;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public c(La/htw;Ljava/lang/String;La/j;)V
    .locals 1

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 p2, 0x0

    .line 5
    new-array v0, p2, [Ljava/lang/CharSequence;

    .line 6
    .line 7
    iget-object p0, p0, La/hyj0;->a:Ljava/lang/String;

    .line 8
    .line 9
    invoke-virtual {p1, p3, p0, v0, p2}, La/htw;->h0(La/j;Ljava/lang/CharSequence;[Ljava/lang/CharSequence;Z)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final d(La/j;)Ljava/util/List;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, La/j;->a()Ljava/util/List;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {p1}, La/j;->a()Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    iget v1, p0, La/hyj0;->c:I

    .line 17
    .line 18
    add-int/2addr p1, v1

    .line 19
    iget-byte p0, p0, La/hyj0;->b:B

    .line 20
    .line 21
    invoke-interface {v0, p0, p1}, Ljava/util/List;->subList(II)Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0
.end method

.class public final La/x3x;
.super La/b4x;
.source "SourceFile"


# instance fields
.field public final transient c:I

.field public final transient d:I

.field public final synthetic e:La/b4x;


# direct methods
.method public constructor <init>(La/b4x;II)V
    .locals 0

    .line 1
    iput-object p1, p0, La/x3x;->e:La/b4x;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/util/AbstractCollection;-><init>()V

    .line 4
    .line 5
    .line 6
    iput p2, p0, La/x3x;->c:I

    .line 7
    .line 8
    iput p3, p0, La/x3x;->d:I

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final G(II)La/b4x;
    .locals 1

    .line 1
    iget v0, p0, La/x3x;->d:I

    .line 2
    .line 3
    invoke-static {p1, p2, v0}, La/x0x;->I(III)V

    .line 4
    .line 5
    .line 6
    iget v0, p0, La/x3x;->c:I

    .line 7
    .line 8
    add-int/2addr p1, v0

    .line 9
    add-int/2addr p2, v0

    .line 10
    iget-object p0, p0, La/x3x;->e:La/b4x;

    .line 11
    .line 12
    invoke-virtual {p0, p1, p2}, La/b4x;->G(II)La/b4x;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public final f()[Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, La/x3x;->e:La/b4x;

    .line 2
    .line 3
    invoke-virtual {p0}, La/s3x;->f()[Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final g()I
    .locals 2

    .line 1
    iget-object v0, p0, La/x3x;->e:La/b4x;

    .line 2
    .line 3
    invoke-virtual {v0}, La/s3x;->h()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget v1, p0, La/x3x;->c:I

    .line 8
    .line 9
    add-int/2addr v0, v1

    .line 10
    iget p0, p0, La/x3x;->d:I

    .line 11
    .line 12
    add-int/2addr v0, p0

    .line 13
    return v0
.end method

.method public final get(I)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, La/x3x;->d:I

    .line 2
    .line 3
    invoke-static {p1, v0}, La/x0x;->D(II)V

    .line 4
    .line 5
    .line 6
    iget v0, p0, La/x3x;->c:I

    .line 7
    .line 8
    add-int/2addr p1, v0

    .line 9
    iget-object p0, p0, La/x3x;->e:La/b4x;

    .line 10
    .line 11
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public final h()I
    .locals 1

    .line 1
    iget-object v0, p0, La/x3x;->e:La/b4x;

    .line 2
    .line 3
    invoke-virtual {v0}, La/s3x;->h()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget p0, p0, La/x3x;->c:I

    .line 8
    .line 9
    add-int/2addr v0, p0

    .line 10
    return v0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, La/b4x;->r(I)La/v3x;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    return-object p0
.end method

.method public final listIterator()Ljava/util/ListIterator;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, La/b4x;->r(I)La/v3x;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    return-object p0
.end method

.method public final bridge synthetic listIterator(I)Ljava/util/ListIterator;
    .locals 0

    .line 7
    invoke-virtual {p0, p1}, La/b4x;->r(I)La/v3x;

    move-result-object p0

    return-object p0
.end method

.method public final size()I
    .locals 0

    .line 1
    iget p0, p0, La/x3x;->d:I

    .line 2
    .line 3
    return p0
.end method

.method public final bridge synthetic subList(II)Ljava/util/List;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, La/x3x;->G(II)La/b4x;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

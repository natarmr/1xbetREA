.class public final La/uu90;
.super La/kpb;
.source "SourceFile"


# instance fields
.field public final synthetic a:La/zi80;

.field public final synthetic b:La/zi80;

.field public final synthetic c:La/dtb;

.field public final synthetic d:I

.field public final synthetic e:I


# direct methods
.method public constructor <init>(La/zi80;La/zi80;La/dtb;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/uu90;->a:La/zi80;

    .line 5
    .line 6
    iput-object p2, p0, La/uu90;->b:La/zi80;

    .line 7
    .line 8
    iput-object p3, p0, La/uu90;->c:La/dtb;

    .line 9
    .line 10
    iput p4, p0, La/uu90;->d:I

    .line 11
    .line 12
    iput p5, p0, La/uu90;->e:I

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final I()I
    .locals 0

    .line 1
    iget p0, p0, La/uu90;->e:I

    .line 2
    .line 3
    return p0
.end method

.method public final J()I
    .locals 0

    .line 1
    iget p0, p0, La/uu90;->d:I

    .line 2
    .line 3
    return p0
.end method

.method public final s(II)Z
    .locals 1

    .line 1
    iget-object v0, p0, La/uu90;->a:La/zi80;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, La/zi80;->c(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object v0, p0, La/uu90;->b:La/zi80;

    .line 8
    .line 9
    invoke-virtual {v0, p2}, La/zi80;->c(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    if-ne p1, p2, :cond_0

    .line 14
    .line 15
    const/4 p0, 0x1

    .line 16
    return p0

    .line 17
    :cond_0
    iget-object p0, p0, La/uu90;->c:La/dtb;

    .line 18
    .line 19
    invoke-virtual {p0, p1, p2}, La/dtb;->w(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    return p0
.end method

.method public final t(II)Z
    .locals 1

    .line 1
    iget-object v0, p0, La/uu90;->a:La/zi80;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, La/zi80;->c(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object v0, p0, La/uu90;->b:La/zi80;

    .line 8
    .line 9
    invoke-virtual {v0, p2}, La/zi80;->c(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    if-ne p1, p2, :cond_0

    .line 14
    .line 15
    const/4 p0, 0x1

    .line 16
    return p0

    .line 17
    :cond_0
    iget-object p0, p0, La/uu90;->c:La/dtb;

    .line 18
    .line 19
    invoke-virtual {p0, p1, p2}, La/dtb;->x(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    return p0
.end method

.method public final z(II)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, La/uu90;->a:La/zi80;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, La/zi80;->c(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object v0, p0, La/uu90;->b:La/zi80;

    .line 8
    .line 9
    invoke-virtual {v0, p2}, La/zi80;->c(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    if-ne p1, p2, :cond_0

    .line 14
    .line 15
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_0
    iget-object p0, p0, La/uu90;->c:La/dtb;

    .line 19
    .line 20
    invoke-virtual {p0, p1, p2}, La/dtb;->E(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0
.end method

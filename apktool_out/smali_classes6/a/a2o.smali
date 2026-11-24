.class public final La/a2o;
.super La/kzj0;
.source "SourceFile"


# instance fields
.field public final b:La/iys0;

.field public final c:La/t1o;

.field public final d:La/c2o;

.field public final e:Ljava/util/List;

.field public final f:Z

.field public final g:[Ljava/lang/String;

.field public final h:Ljava/lang/String;


# direct methods
.method public varargs constructor <init>(La/iys0;La/t1o;La/c2o;Ljava/util/List;Z[Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/a2o;->b:La/iys0;

    .line 11
    .line 12
    iput-object p2, p0, La/a2o;->c:La/t1o;

    .line 13
    .line 14
    iput-object p3, p0, La/a2o;->d:La/c2o;

    .line 15
    .line 16
    iput-object p4, p0, La/a2o;->e:Ljava/util/List;

    .line 17
    .line 18
    iput-boolean p5, p0, La/a2o;->f:Z

    .line 19
    .line 20
    iput-object p6, p0, La/a2o;->g:[Ljava/lang/String;

    .line 21
    .line 22
    iget-object p1, p3, La/c2o;->a:Ljava/lang/String;

    .line 23
    .line 24
    array-length p2, p6

    .line 25
    invoke-static {p6, p2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    array-length p3, p2

    .line 30
    invoke-static {p2, p3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    invoke-static {p1, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    iput-object p1, p0, La/a2o;->h:Ljava/lang/String;

    .line 39
    .line 40
    return-void
.end method


# virtual methods
.method public final J()Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, La/a2o;->e:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public final S()La/iys0;
    .locals 0

    .line 1
    iget-object p0, p0, La/a2o;->b:La/iys0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final U()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/a2o;->f:Z

    .line 2
    .line 3
    return p0
.end method

.method public final bridge synthetic k0(Z)La/tft0;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, La/a2o;->n0(Z)La/kzj0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final n0(Z)La/kzj0;
    .locals 7

    .line 1
    new-instance v0, La/a2o;

    .line 2
    .line 3
    iget-object v1, p0, La/a2o;->g:[Ljava/lang/String;

    .line 4
    .line 5
    array-length v2, v1

    .line 6
    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    move-object v6, v1

    .line 11
    check-cast v6, [Ljava/lang/String;

    .line 12
    .line 13
    iget-object v1, p0, La/a2o;->b:La/iys0;

    .line 14
    .line 15
    iget-object v2, p0, La/a2o;->c:La/t1o;

    .line 16
    .line 17
    iget-object v3, p0, La/a2o;->d:La/c2o;

    .line 18
    .line 19
    iget-object v4, p0, La/a2o;->e:Ljava/util/List;

    .line 20
    .line 21
    move v5, p1

    .line 22
    invoke-direct/range {v0 .. v6}, La/a2o;-><init>(La/iys0;La/t1o;La/c2o;Ljava/util/List;Z[Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    return-object v0
.end method

.method public final y()La/cr30;
    .locals 0

    .line 1
    iget-object p0, p0, La/a2o;->c:La/t1o;

    .line 2
    .line 3
    return-object p0
.end method

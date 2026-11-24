.class public final La/gdz;
.super La/wjj;
.source "SourceFile"


# static fields
.field public static final synthetic i:[La/iiy;


# instance fields
.field public final d:La/zm40;

.field public final e:La/swq;

.field public final f:La/cu00;

.field public final g:La/cu00;

.field public final h:La/mdz;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/gdz;

    .line 4
    .line 5
    const-string v2, "fragments"

    .line 6
    .line 7
    const-string v3, "getFragments()Ljava/util/List;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    new-instance v2, La/j0d0;

    .line 14
    .line 15
    const-string v3, "empty"

    .line 16
    .line 17
    const-string v5, "getEmpty()Z"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    const/4 v1, 0x2

    .line 23
    new-array v1, v1, [La/iiy;

    .line 24
    .line 25
    aput-object v0, v1, v4

    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    aput-object v2, v1, v0

    .line 29
    .line 30
    sput-object v1, La/gdz;->i:[La/iiy;

    .line 31
    .line 32
    return-void
.end method

.method public constructor <init>(La/zm40;La/swq;La/eu00;)V
    .locals 3

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, La/ujn;->c:La/f93;

    .line 5
    .line 6
    iget-object v1, p2, La/swq;->a:La/twq;

    .line 7
    .line 8
    invoke-virtual {v1}, La/twq;->c()Z

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    sget-object v1, La/twq;->e:La/g950;

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-virtual {v1}, La/twq;->g()La/g950;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    :goto_0
    invoke-direct {p0, v0, v1}, La/wjj;-><init>(La/g93;La/g950;)V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, La/gdz;->d:La/zm40;

    .line 25
    .line 26
    iput-object p2, p0, La/gdz;->e:La/swq;

    .line 27
    .line 28
    new-instance p1, La/fdz;

    .line 29
    .line 30
    const/4 p2, 0x0

    .line 31
    invoke-direct {p1, p0, p2}, La/fdz;-><init>(La/gdz;B)V

    .line 32
    .line 33
    .line 34
    new-instance p2, La/cu00;

    .line 35
    .line 36
    invoke-direct {p2, p3, p1}, La/bu00;-><init>(La/eu00;Lkotlin/jvm/functions/Function0;)V

    .line 37
    .line 38
    .line 39
    iput-object p2, p0, La/gdz;->f:La/cu00;

    .line 40
    .line 41
    new-instance p1, La/fdz;

    .line 42
    .line 43
    const/4 p2, 0x1

    .line 44
    invoke-direct {p1, p0, p2}, La/fdz;-><init>(La/gdz;B)V

    .line 45
    .line 46
    .line 47
    new-instance p2, La/cu00;

    .line 48
    .line 49
    invoke-direct {p2, p3, p1}, La/bu00;-><init>(La/eu00;Lkotlin/jvm/functions/Function0;)V

    .line 50
    .line 51
    .line 52
    iput-object p2, p0, La/gdz;->g:La/cu00;

    .line 53
    .line 54
    new-instance p1, La/mdz;

    .line 55
    .line 56
    new-instance p2, La/fdz;

    .line 57
    .line 58
    const/4 v0, 0x2

    .line 59
    invoke-direct {p2, p0, v0}, La/fdz;-><init>(La/gdz;B)V

    .line 60
    .line 61
    .line 62
    invoke-direct {p1, p3, p2}, La/mdz;-><init>(La/eu00;Lkotlin/jvm/functions/Function0;)V

    .line 63
    .line 64
    .line 65
    iput-object p1, p0, La/gdz;->h:La/mdz;

    .line 66
    .line 67
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    instance-of v0, p1, La/gdz;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, La/gdz;

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 p1, 0x0

    .line 9
    :goto_0
    const/4 v0, 0x0

    .line 10
    if-nez p1, :cond_1

    .line 11
    .line 12
    return v0

    .line 13
    :cond_1
    iget-object v1, p0, La/gdz;->e:La/swq;

    .line 14
    .line 15
    iget-object v2, p1, La/gdz;->e:La/swq;

    .line 16
    .line 17
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_2

    .line 22
    .line 23
    iget-object p0, p0, La/gdz;->d:La/zm40;

    .line 24
    .line 25
    iget-object p1, p1, La/gdz;->d:La/zm40;

    .line 26
    .line 27
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    if-eqz p0, :cond_2

    .line 32
    .line 33
    const/4 p0, 0x1

    .line 34
    return p0

    .line 35
    :cond_2
    return v0
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, La/gdz;->d:La/zm40;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object p0, p0, La/gdz;->e:La/swq;

    .line 10
    .line 11
    invoke-virtual {p0}, La/swq;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    add-int/2addr p0, v0

    .line 16
    return p0
.end method

.method public final i0(La/zjj;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-interface {p1, p0, p2}, La/zjj;->u(La/gdz;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final j()La/vjj;
    .locals 2

    .line 1
    iget-object v0, p0, La/gdz;->e:La/swq;

    .line 2
    .line 3
    iget-object v1, v0, La/swq;->a:La/twq;

    .line 4
    .line 5
    invoke-virtual {v1}, La/twq;->c()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    return-object p0

    .line 13
    :cond_0
    iget-object p0, p0, La/gdz;->d:La/zm40;

    .line 14
    .line 15
    invoke-virtual {v0}, La/swq;->b()La/swq;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {p0, v0}, La/zm40;->c0(La/swq;)La/gdz;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
.end method

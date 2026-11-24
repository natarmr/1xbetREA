.class public final La/fcz;
.super La/sj9;
.source "SourceFile"

# interfaces
.implements La/pcz;


# instance fields
.field public final p:La/abu;


# direct methods
.method public constructor <init>(La/uwq;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, p1, v0}, La/sj9;-><init>(La/vaz;Z)V

    .line 3
    .line 4
    .line 5
    new-instance p1, La/abu;

    .line 6
    .line 7
    invoke-direct {p1}, La/abu;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/fcz;->p:La/abu;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final a(La/jru;La/mcz;)V
    .locals 1

    .line 1
    iget-object v0, p0, La/fcz;->p:La/abu;

    .line 2
    .line 3
    iput-object p2, v0, La/abu;->b:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p1, v0, La/abu;->c:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-virtual {p0, v0}, La/sj9;->i(La/tj9;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final b(La/rbz;I)V
    .locals 2

    .line 1
    iget p0, p1, La/rbz;->a:I

    .line 2
    .line 3
    const/4 v0, -0x1

    .line 4
    if-ne p0, v0, :cond_0

    .line 5
    .line 6
    const/4 p0, 0x2

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    :goto_0
    if-ge v0, p0, :cond_1

    .line 9
    .line 10
    add-int v1, p2, v0

    .line 11
    .line 12
    invoke-virtual {p1, v1}, La/rbz;->a(I)V

    .line 13
    .line 14
    .line 15
    add-int/lit8 v0, v0, 0x1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_1
    return-void
.end method

.method public final c(La/jru;FLa/mcz;)V
    .locals 1

    .line 1
    iget-object v0, p0, La/fcz;->p:La/abu;

    .line 2
    .line 3
    iput-object p3, v0, La/abu;->b:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p1, v0, La/abu;->c:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-virtual {p0, v0, p2}, La/sj9;->h(La/tj9;F)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

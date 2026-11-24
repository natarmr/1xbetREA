.class public abstract La/ir20;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/v9d;

.field public final b:La/y78;

.field public c:I

.field public d:La/hr20;

.field public e:La/k810;


# direct methods
.method public constructor <init>(La/y78;La/v9d;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, La/ir20;->a:La/v9d;

    .line 8
    .line 9
    iput-object p1, p0, La/ir20;->b:La/y78;

    .line 10
    .line 11
    const/4 p1, -0x2

    .line 12
    iput p1, p0, La/ir20;->c:I

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public a()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public b(La/k810;)I
    .locals 0

    .line 1
    invoke-virtual {p1}, La/k810;->c()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public c(La/v9d;La/k810;)La/hr20;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget p0, p2, La/k810;->b:I

    .line 5
    .line 6
    const/4 p1, -0x1

    .line 7
    if-ne p0, p1, :cond_0

    .line 8
    .line 9
    new-instance p0, La/hr20;

    .line 10
    .line 11
    const/4 p1, 0x2

    .line 12
    const/4 p2, 0x1

    .line 13
    invoke-direct {p0, p1, p2, p2}, La/hr20;-><init>(III)V

    .line 14
    .line 15
    .line 16
    return-object p0

    .line 17
    :cond_0
    sget-object p0, La/hr20;->e:La/hr20;

    .line 18
    .line 19
    return-object p0
.end method

.method public d()La/ar20;
    .locals 0

    .line 1
    sget-object p0, La/wb;->s:La/ar20;

    .line 2
    .line 3
    return-object p0
.end method

.method public final e(La/k810;I)La/k810;
    .locals 4

    .line 1
    iget v0, p1, La/k810;->c:I

    .line 2
    .line 3
    iget-object v1, p0, La/ir20;->e:La/k810;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iget v2, v1, La/k810;->c:I

    .line 8
    .line 9
    if-le v2, v0, :cond_0

    .line 10
    .line 11
    return-object v1

    .line 12
    :cond_0
    add-int/lit8 p2, p2, -0x1

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    move-object v2, p1

    .line 16
    :goto_0
    const/4 v3, 0x0

    .line 17
    if-ge v1, p2, :cond_2

    .line 18
    .line 19
    invoke-virtual {p1}, La/k810;->d()La/k810;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    if-nez v2, :cond_1

    .line 24
    .line 25
    :goto_1
    move-object v2, v3

    .line 26
    goto :goto_2

    .line 27
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_2
    invoke-virtual {v2}, La/k810;->a()Ljava/lang/Integer;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    if-nez p1, :cond_3

    .line 35
    .line 36
    invoke-virtual {v2}, La/k810;->d()La/k810;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    if-nez v2, :cond_2

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_3
    :goto_2
    if-eqz v2, :cond_4

    .line 44
    .line 45
    iget p1, v2, La/k810;->c:I

    .line 46
    .line 47
    if-le p1, v0, :cond_4

    .line 48
    .line 49
    move-object v3, v2

    .line 50
    :cond_4
    iput-object v3, p0, La/ir20;->e:La/k810;

    .line 51
    .line 52
    return-object v2
.end method

.method public f(La/k810;)Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

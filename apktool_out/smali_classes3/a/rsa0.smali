.class public abstract La/rsa0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/i4;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, La/f4n;->a:La/f4n;

    .line 2
    .line 3
    filled-new-array {v0, v0}, [La/f4n;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, La/dyb;->g0([Ljava/lang/Object;)La/i4;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, La/rsa0;->a:La/i4;

    .line 12
    .line 13
    return-void
.end method

.method public static final a(La/nsa0;)Ljava/util/List;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/nsa0;->c:La/pn00;

    .line 5
    .line 6
    instance-of v0, p0, La/in00;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    check-cast p0, La/in00;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 p0, 0x0

    .line 14
    :goto_0
    if-eqz p0, :cond_2

    .line 15
    .line 16
    iget-object p0, p0, La/in00;->a:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p0, Ljava/util/List;

    .line 19
    .line 20
    if-nez p0, :cond_1

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_1
    return-object p0

    .line 24
    :cond_2
    :goto_1
    sget-object p0, La/iun;->a:La/iun;

    .line 25
    .line 26
    return-object p0
.end method

.method public static final b(La/nsa0;)La/l9s;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/nsa0;->b:La/pn00;

    .line 5
    .line 6
    instance-of v0, p0, La/in00;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    check-cast p0, La/in00;

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move-object p0, v1

    .line 15
    :goto_0
    if-eqz p0, :cond_1

    .line 16
    .line 17
    iget-object p0, p0, La/in00;->a:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p0, La/l9s;

    .line 20
    .line 21
    return-object p0

    .line 22
    :cond_1
    return-object v1
.end method

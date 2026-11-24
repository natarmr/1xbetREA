.class public final La/kfy;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/hfk;


# instance fields
.field public final a:La/rey;

.field public final b:La/rey;

.field public final c:La/jre0;


# direct methods
.method public constructor <init>(La/jre0;La/m3d0;La/ify;ZLa/gfk;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget-object p5, p1, La/jre0;->a:Ljava/lang/Class;

    .line 11
    .line 12
    invoke-static {p5}, La/bqe0;->a(Ljava/lang/Class;)La/qlc;

    .line 13
    .line 14
    .line 15
    move-result-object p5

    .line 16
    new-instance v0, La/rey;

    .line 17
    .line 18
    invoke-static {p5}, La/rey;->b(La/qlc;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p5

    .line 22
    invoke-direct {v0, p5}, La/rey;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    iget-object p5, p1, La/jre0;->b:La/cry;

    .line 26
    .line 27
    iget-object v1, p5, La/cry;->h:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v1, Ljava/lang/String;

    .line 30
    .line 31
    iget-object p5, p5, La/cry;->c:Ljava/io/Serializable;

    .line 32
    .line 33
    check-cast p5, La/bry;

    .line 34
    .line 35
    sget-object v2, La/bry;->i:La/bry;

    .line 36
    .line 37
    const/4 v3, 0x0

    .line 38
    if-ne p5, v2, :cond_0

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    move-object v1, v3

    .line 42
    :goto_0
    if-eqz v1, :cond_1

    .line 43
    .line 44
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 45
    .line 46
    .line 47
    move-result p5

    .line 48
    if-lez p5, :cond_1

    .line 49
    .line 50
    new-instance v3, La/rey;

    .line 51
    .line 52
    invoke-direct {v3, v1}, La/rey;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    :cond_1
    new-instance p5, La/wrb0;

    .line 56
    .line 57
    invoke-direct {p5, p4}, La/wrb0;-><init>(Z)V

    .line 58
    .line 59
    .line 60
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 61
    .line 62
    .line 63
    iput-object v0, p0, La/kfy;->a:La/rey;

    .line 64
    .line 65
    iput-object v3, p0, La/kfy;->b:La/rey;

    .line 66
    .line 67
    iput-object p1, p0, La/kfy;->c:La/jre0;

    .line 68
    .line 69
    sget-object p0, La/dgy;->k:La/ijt;

    .line 70
    .line 71
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    invoke-static {p2, p0}, La/h8x;->L(La/gjt;La/ijt;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    check-cast p0, Ljava/lang/Integer;

    .line 79
    .line 80
    if-eqz p0, :cond_2

    .line 81
    .line 82
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 83
    .line 84
    .line 85
    move-result p0

    .line 86
    invoke-virtual {p3, p0}, La/ify;->getString(I)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    :cond_2
    return-void
.end method


# virtual methods
.method public final a()La/qlc;
    .locals 7

    .line 1
    new-instance v0, La/qlc;

    .line 2
    .line 3
    iget-object p0, p0, La/kfy;->a:La/rey;

    .line 4
    .line 5
    iget-object v1, p0, La/rey;->a:Ljava/lang/String;

    .line 6
    .line 7
    const-string v2, "/"

    .line 8
    .line 9
    invoke-virtual {v1, v2}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    const/4 v3, -0x1

    .line 14
    const/16 v4, 0x2f

    .line 15
    .line 16
    const/4 v5, 0x0

    .line 17
    if-ne v2, v3, :cond_1

    .line 18
    .line 19
    sget-object v1, La/swq;->c:La/swq;

    .line 20
    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/16 p0, 0x9

    .line 25
    .line 26
    invoke-static {p0}, La/rey;->a(I)V

    .line 27
    .line 28
    .line 29
    throw v5

    .line 30
    :cond_1
    new-instance v3, La/swq;

    .line 31
    .line 32
    const/4 v6, 0x0

    .line 33
    invoke-virtual {v1, v6, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    const/16 v2, 0x2e

    .line 38
    .line 39
    invoke-virtual {v1, v4, v2}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-direct {v3, v1}, La/swq;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    move-object v1, v3

    .line 47
    :goto_0
    iget-object p0, p0, La/rey;->a:Ljava/lang/String;

    .line 48
    .line 49
    if-eqz p0, :cond_2

    .line 50
    .line 51
    invoke-static {v4, p0, p0}, Lkotlin/text/StringsKt;->o0(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-static {p0}, La/g950;->e(Ljava/lang/String;)La/g950;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    invoke-direct {v0, v1, p0}, La/qlc;-><init>(La/swq;La/g950;)V

    .line 60
    .line 61
    .line 62
    return-object v0

    .line 63
    :cond_2
    const/16 p0, 0xa

    .line 64
    .line 65
    invoke-static {p0}, La/rey;->a(I)V

    .line 66
    .line 67
    .line 68
    throw v5
.end method

.method public final b()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Class \'"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, La/kfy;->a()La/qlc;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, La/qlc;->a()La/swq;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    iget-object p0, p0, La/swq;->a:La/twq;

    .line 17
    .line 18
    iget-object p0, p0, La/twq;->a:Ljava/lang/String;

    .line 19
    .line 20
    const/16 v1, 0x27

    .line 21
    .line 22
    invoke-static {v0, p0, v1}, La/axq;->m(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-class v1, La/kfy;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string v1, ": "

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    iget-object p0, p0, La/kfy;->a:La/rey;

    .line 18
    .line 19
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method

.class public final La/ed9;
.super La/ng80;
.source "SourceFile"

# interfaces
.implements La/mg80;


# instance fields
.field public final h:La/e28;

.field public final i:La/i950;

.field public final j:La/n660;

.field public k:La/n3d0;

.field public l:La/qfk;


# direct methods
.method public constructor <init>(La/swq;La/eu00;La/ym40;La/n3d0;La/ad9;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0, p3, p1}, La/ng80;-><init>(La/ym40;La/swq;)V

    .line 11
    .line 12
    .line 13
    iput-object p5, p0, La/ed9;->h:La/e28;

    .line 14
    .line 15
    new-instance p1, La/i950;

    .line 16
    .line 17
    iget-object p2, p4, La/n3d0;->d:La/v3d0;

    .line 18
    .line 19
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    iget-object p3, p4, La/n3d0;->e:La/t3d0;

    .line 23
    .line 24
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    invoke-direct {p1, p2, p3}, La/i950;-><init>(La/v3d0;La/t3d0;)V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, La/ed9;->i:La/i950;

    .line 31
    .line 32
    new-instance p2, La/n660;

    .line 33
    .line 34
    new-instance p3, La/pnk0;

    .line 35
    .line 36
    const/16 v0, 0x11

    .line 37
    .line 38
    invoke-direct {p3, p0, v0}, La/pnk0;-><init>(Ljava/lang/Object;B)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 45
    .line 46
    .line 47
    iput-object p1, p2, La/n660;->a:Ljava/lang/Object;

    .line 48
    .line 49
    iput-object p5, p2, La/n660;->b:Ljava/lang/Object;

    .line 50
    .line 51
    iput-object p3, p2, La/n660;->c:Ljava/lang/Object;

    .line 52
    .line 53
    iget-object p1, p4, La/n3d0;->g:Ljava/util/List;

    .line 54
    .line 55
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    const/16 p3, 0xa

    .line 59
    .line 60
    invoke-static {p1, p3}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 61
    .line 62
    .line 63
    move-result p3

    .line 64
    invoke-static {p3}, La/wp20;->a(I)I

    .line 65
    .line 66
    .line 67
    move-result p3

    .line 68
    const/16 p5, 0x10

    .line 69
    .line 70
    if-ge p3, p5, :cond_0

    .line 71
    .line 72
    move p3, p5

    .line 73
    :cond_0
    new-instance p5, Ljava/util/LinkedHashMap;

    .line 74
    .line 75
    invoke-direct {p5, p3}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 76
    .line 77
    .line 78
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 83
    .line 84
    .line 85
    move-result p3

    .line 86
    if-eqz p3, :cond_1

    .line 87
    .line 88
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object p3

    .line 92
    move-object v0, p3

    .line 93
    check-cast v0, La/s2d0;

    .line 94
    .line 95
    iget-object v1, p2, La/n660;->a:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v1, La/i950;

    .line 98
    .line 99
    iget v0, v0, La/s2d0;->e:I

    .line 100
    .line 101
    invoke-static {v1, v0}, La/ydx;->K(La/h950;I)La/qlc;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    invoke-interface {p5, v0, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_1
    iput-object p5, p2, La/n660;->d:Ljava/lang/Object;

    .line 110
    .line 111
    iput-object p2, p0, La/ed9;->j:La/n660;

    .line 112
    .line 113
    iput-object p4, p0, La/ed9;->k:La/n3d0;

    .line 114
    .line 115
    return-void
.end method


# virtual methods
.method public final q1(La/f6i;)V
    .locals 11

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/ed9;->k:La/n3d0;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    iput-object v1, p0, La/ed9;->k:La/n3d0;

    .line 10
    .line 11
    new-instance v2, La/qfk;

    .line 12
    .line 13
    iget-object v4, v0, La/n3d0;->f:La/m3d0;

    .line 14
    .line 15
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    new-instance v0, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    const-string v1, "scope of "

    .line 21
    .line 22
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v9

    .line 32
    new-instance v10, La/v9k;

    .line 33
    .line 34
    const/16 v0, 0xd

    .line 35
    .line 36
    invoke-direct {v10, p0, v0}, La/v9k;-><init>(Ljava/lang/Object;B)V

    .line 37
    .line 38
    .line 39
    iget-object v5, p0, La/ed9;->i:La/i950;

    .line 40
    .line 41
    iget-object v6, p0, La/ed9;->h:La/e28;

    .line 42
    .line 43
    const/4 v7, 0x0

    .line 44
    move-object v3, p0

    .line 45
    move-object v8, p1

    .line 46
    invoke-direct/range {v2 .. v10}, La/qfk;-><init>(La/mg80;La/m3d0;La/h950;La/e28;La/kfy;La/f6i;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 47
    .line 48
    .line 49
    iput-object v2, v3, La/ed9;->l:La/qfk;

    .line 50
    .line 51
    return-void

    .line 52
    :cond_0
    const-string p0, "Repeated call to DeserializedPackageFragmentImpl::initialize"

    .line 53
    .line 54
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "builtins package fragment for "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, La/ng80;->f:La/swq;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, " from "

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    sget v1, La/rek;->a:I

    .line 19
    .line 20
    invoke-static {p0}, La/oek;->c(La/vjj;)La/ym40;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0
.end method

.method public final y()La/cr30;
    .locals 0

    .line 1
    iget-object p0, p0, La/ed9;->l:La/qfk;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const-string p0, "_memberScope"

    .line 7
    .line 8
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    throw p0
.end method

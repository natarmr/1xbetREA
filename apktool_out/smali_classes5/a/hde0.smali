.class public final La/hde0;
.super La/w46;
.source "SourceFile"


# instance fields
.field public final b:La/i1w0;

.field public final c:La/xqc;

.field public final d:La/f5a;

.field public final e:La/woc;

.field public final f:La/xqt;

.field public final g:La/duj;

.field public final h:La/p7m0;

.field public final i:La/ol60;

.field public final j:La/p7m0;


# direct methods
.method public constructor <init>(La/i1w0;La/xqc;La/f5a;La/f5a;La/woc;La/xqt;La/ctf0;La/duj;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, La/w46;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/hde0;->b:La/i1w0;

    .line 11
    .line 12
    iput-object p2, p0, La/hde0;->c:La/xqc;

    .line 13
    .line 14
    iput-object p4, p0, La/hde0;->d:La/f5a;

    .line 15
    .line 16
    iput-object p5, p0, La/hde0;->e:La/woc;

    .line 17
    .line 18
    iput-object p6, p0, La/hde0;->f:La/xqt;

    .line 19
    .line 20
    iput-object p8, p0, La/hde0;->g:La/duj;

    .line 21
    .line 22
    const/4 p1, 0x0

    .line 23
    new-array p1, p1, [Ljava/lang/Object;

    .line 24
    .line 25
    const p2, 0x7f1310c9

    .line 26
    .line 27
    .line 28
    invoke-virtual {p7, p2, p1}, La/ctf0;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    iget-object p2, p3, La/f5a;->a:La/pzu;

    .line 33
    .line 34
    iget-object p2, p2, La/pzu;->b:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast p2, La/dzz;

    .line 37
    .line 38
    iget p2, p2, La/dzz;->e:I

    .line 39
    .line 40
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    const/4 p3, 0x1

    .line 49
    invoke-static {p2, p3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    invoke-static {p1, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-static {p1}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    iput-object p1, p0, La/hde0;->h:La/p7m0;

    .line 62
    .line 63
    new-instance p1, La/ol60;

    .line 64
    .line 65
    sget-object p2, La/i99;->b:La/i99;

    .line 66
    .line 67
    invoke-direct {p1, p3, p2}, La/ol60;-><init>(ILa/i99;)V

    .line 68
    .line 69
    .line 70
    iput-object p1, p0, La/hde0;->i:La/ol60;

    .line 71
    .line 72
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 73
    .line 74
    invoke-static {p1}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    iput-object p1, p0, La/hde0;->j:La/p7m0;

    .line 79
    .line 80
    return-void
.end method


# virtual methods
.method public final w(Z)V
    .locals 3

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object p1, p0, La/hde0;->d:La/f5a;

    .line 4
    .line 5
    iget-object p1, p1, La/f5a;->a:La/pzu;

    .line 6
    .line 7
    iget-object p1, p1, La/pzu;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p1, La/dzz;

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    iput-boolean v0, p1, La/dzz;->h:Z

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    iget-object p1, p0, La/hde0;->f:La/xqt;

    .line 16
    .line 17
    invoke-virtual {p1}, La/xqt;->b()V

    .line 18
    .line 19
    .line 20
    :goto_0
    iget-object p0, p0, La/hde0;->b:La/i1w0;

    .line 21
    .line 22
    invoke-static {p0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    new-instance v0, La/c8d;

    .line 27
    .line 28
    sget-object v1, La/y7d;->a:La/v7d;

    .line 29
    .line 30
    sget-object v2, La/p0w0;->a:La/p0w0;

    .line 31
    .line 32
    invoke-direct {v0, v1, v2}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 33
    .line 34
    .line 35
    const/4 v1, 0x0

    .line 36
    invoke-static {p1, v0, p0, p1, v1}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    :goto_1
    move-object v0, p1

    .line 41
    check-cast v0, La/paw;

    .line 42
    .line 43
    invoke-virtual {v0}, La/paw;->hasNext()Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-eqz v1, :cond_1

    .line 48
    .line 49
    invoke-virtual {v0}, La/paw;->next()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    check-cast v0, La/oe50;

    .line 54
    .line 55
    invoke-virtual {p0, v0}, La/i1w0;->a(La/oe50;)V

    .line 56
    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_1
    return-void
.end method

.method public final x(La/zbe0;La/bnn0;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object p0, p0, La/hde0;->c:La/xqc;

    .line 2
    .line 3
    iget-object p0, p0, La/xqc;->a:La/pzu;

    .line 4
    .line 5
    sget-object v0, La/wen;->b:La/uen;

    .line 6
    .line 7
    iget-object v0, p0, La/pzu;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, La/dzz;

    .line 10
    .line 11
    iget-wide v0, v0, La/dzz;->d:J

    .line 12
    .line 13
    sget-object v2, La/bfn;->d:La/bfn;

    .line 14
    .line 15
    invoke-static {v0, v1, v2}, La/ibc;->w0(JLa/bfn;)J

    .line 16
    .line 17
    .line 18
    move-result-wide v0

    .line 19
    sget-object v2, La/bfn;->e:La/bfn;

    .line 20
    .line 21
    invoke-static {v0, v1, v2}, La/wen;->l(JLa/bfn;)J

    .line 22
    .line 23
    .line 24
    move-result-wide v0

    .line 25
    iget-object v2, p0, La/pzu;->a:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v2, La/abu;

    .line 28
    .line 29
    iget-object p0, p0, La/pzu;->e:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast p0, La/btt0;

    .line 32
    .line 33
    invoke-virtual {p0}, La/btt0;->a()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    if-eqz p1, :cond_1

    .line 42
    .line 43
    const/4 v3, 0x1

    .line 44
    if-eq p1, v3, :cond_2

    .line 45
    .line 46
    const/4 v3, 0x2

    .line 47
    if-eq p1, v3, :cond_2

    .line 48
    .line 49
    const/4 v3, 0x3

    .line 50
    if-eq p1, v3, :cond_2

    .line 51
    .line 52
    const/4 v3, 0x4

    .line 53
    if-ne p1, v3, :cond_0

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    invoke-static {}, La/t9f;->b()V

    .line 57
    .line 58
    .line 59
    const/4 p0, 0x0

    .line 60
    return-object p0

    .line 61
    :cond_1
    const/4 v3, 0x0

    .line 62
    :cond_2
    :goto_0
    new-instance p1, La/fce0;

    .line 63
    .line 64
    invoke-direct {p1, v0, v1, v3}, La/fce0;-><init>(JI)V

    .line 65
    .line 66
    .line 67
    iget-object v0, v2, La/abu;->c:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v0, La/rcz;

    .line 70
    .line 71
    invoke-virtual {v0}, La/rcz;->invoke()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    check-cast v0, La/kuz;

    .line 76
    .line 77
    invoke-interface {v0, p0, p1, p2}, La/kuz;->b(Ljava/lang/String;La/fce0;La/yje;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    sget-object p1, La/wne;->a:La/wne;

    .line 82
    .line 83
    if-ne p0, p1, :cond_3

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 87
    .line 88
    :goto_1
    if-ne p0, p1, :cond_4

    .line 89
    .line 90
    goto :goto_2

    .line 91
    :cond_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 92
    .line 93
    :goto_2
    if-ne p0, p1, :cond_5

    .line 94
    .line 95
    goto :goto_3

    .line 96
    :cond_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 97
    .line 98
    :goto_3
    if-ne p0, p1, :cond_6

    .line 99
    .line 100
    return-object p0

    .line 101
    :cond_6
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 102
    .line 103
    return-object p0
.end method

.class public final La/k8w;
.super La/i3t0;
.source "SourceFile"


# instance fields
.field public final o:Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;


# direct methods
.method public constructor <init>(Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;La/ql5;La/f8w;La/mne;La/bst;La/pru;La/ctf0;)V
    .locals 6

    .line 1
    invoke-virtual {p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v2, La/g8l;

    .line 5
    .line 6
    const/16 p5, 0xf

    .line 7
    .line 8
    invoke-direct {v2, p6, p3, p1, p5}, La/g8l;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 9
    .line 10
    .line 11
    new-instance v3, La/bcn;

    .line 12
    .line 13
    const/16 p3, 0x16

    .line 14
    .line 15
    invoke-direct {v3, p7, p3}, La/bcn;-><init>(La/ctf0;B)V

    .line 16
    .line 17
    .line 18
    iget-object p3, p4, La/mne;->c:La/vs10;

    .line 19
    .line 20
    iget-object p4, p4, La/mne;->a:La/rwj;

    .line 21
    .line 22
    invoke-static {p3, p4}, La/cvm0;->p(La/lne;La/lne;)La/g090;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    const/4 v5, 0x0

    .line 27
    const/4 v1, 0x0

    .line 28
    move-object v0, p0

    .line 29
    invoke-direct/range {v0 .. v5}, La/i3t0;-><init>(La/vzg0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/g090;La/yzn0;)V

    .line 30
    .line 31
    .line 32
    iput-object p1, v0, La/k8w;->o:Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;

    .line 33
    .line 34
    invoke-virtual {p6}, La/pru;->a()La/sff0;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-static {p2, p0}, La/bst;->d(La/ql5;La/sff0;)La/i4;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    iget-object p0, v0, La/i3t0;->i:La/ocj;

    .line 43
    .line 44
    iget-object p0, p0, La/ocj;->a:La/p7m0;

    .line 45
    .line 46
    :cond_0
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p7

    .line 50
    invoke-virtual {p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    iget-object p1, v0, La/i3t0;->f:La/oyg0;

    .line 54
    .line 55
    move-object p3, p7

    .line 56
    check-cast p3, La/z7w;

    .line 57
    .line 58
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    move-object p1, p3

    .line 62
    iget-object p3, p1, La/z7w;->b:Ljava/lang/String;

    .line 63
    .line 64
    iget-object p4, p1, La/z7w;->c:La/f8w;

    .line 65
    .line 66
    iget-object p5, p1, La/z7w;->d:Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;

    .line 67
    .line 68
    iget-boolean p6, p1, La/z7w;->e:Z

    .line 69
    .line 70
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    new-instance p1, La/z7w;

    .line 74
    .line 75
    invoke-direct/range {p1 .. p6}, La/z7w;-><init>(Ljava/util/List;Ljava/lang/String;La/f8w;Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;Z)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p0, p7, p1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    if-eqz p1, :cond_0

    .line 83
    .line 84
    return-void
.end method


# virtual methods
.method public final x(Ljava/lang/Object;)V
    .locals 3

    .line 1
    check-cast p1, La/u7w;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, La/i3t0;->x(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    instance-of v0, p1, La/t7w;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    move-object v1, p1

    .line 14
    check-cast v1, La/t7w;

    .line 15
    .line 16
    iget-object v1, v1, La/t7w;->a:Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;

    .line 17
    .line 18
    iget-object v2, p0, La/k8w;->o:Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;

    .line 19
    .line 20
    if-eq v1, v2, :cond_0

    .line 21
    .line 22
    new-instance p1, La/v7w;

    .line 23
    .line 24
    invoke-direct {p1, v1}, La/v7w;-><init>(Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, p1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    if-eqz v0, :cond_1

    .line 32
    .line 33
    sget-object p1, La/w7w;->a:La/w7w;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_1
    sget-object v0, La/s7w;->a:La/s7w;

    .line 40
    .line 41
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    if-eqz p1, :cond_2

    .line 46
    .line 47
    sget-object p1, La/x7w;->a:La/x7w;

    .line 48
    .line 49
    invoke-virtual {p0, p1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    :cond_2
    return-void
.end method

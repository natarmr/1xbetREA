.class public final synthetic La/rme;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:La/djz;

.field public final synthetic b:Z

.field public final synthetic c:Z

.field public final synthetic d:La/o8q0;

.field public final synthetic e:La/a8q0;

.field public final synthetic f:La/k3x;

.field public final synthetic g:La/qe60;

.field public final synthetic h:La/k7q0;

.field public final synthetic i:La/vne;

.field public final synthetic j:La/d39;


# direct methods
.method public synthetic constructor <init>(La/djz;ZZLa/o8q0;La/a8q0;La/k3x;La/qe60;La/k7q0;La/vne;La/d39;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/rme;->a:La/djz;

    iput-boolean p2, p0, La/rme;->b:Z

    iput-boolean p3, p0, La/rme;->c:Z

    iput-object p4, p0, La/rme;->d:La/o8q0;

    iput-object p5, p0, La/rme;->e:La/a8q0;

    iput-object p6, p0, La/rme;->f:La/k3x;

    iput-object p7, p0, La/rme;->g:La/qe60;

    iput-object p8, p0, La/rme;->h:La/k7q0;

    iput-object p9, p0, La/rme;->i:La/vne;

    iput-object p10, p0, La/rme;->j:La/d39;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    check-cast p1, La/iqq;

    .line 2
    .line 3
    iget-object v3, p0, La/rme;->a:La/djz;

    .line 4
    .line 5
    invoke-virtual {v3}, La/djz;->b()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-virtual {p1}, La/iqq;->b()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-ne v0, v1, :cond_0

    .line 14
    .line 15
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_0
    invoke-virtual {p1}, La/iqq;->b()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v1, v3, La/djz;->f:La/pz40;

    .line 23
    .line 24
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v1, La/hgk0;

    .line 29
    .line 30
    invoke-virtual {v1, v0}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v3}, La/djz;->b()Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    iget-object v2, p0, La/rme;->e:La/a8q0;

    .line 38
    .line 39
    iget-object v5, p0, La/rme;->g:La/qe60;

    .line 40
    .line 41
    if-eqz v0, :cond_1

    .line 42
    .line 43
    iget-boolean v0, p0, La/rme;->b:Z

    .line 44
    .line 45
    if-eqz v0, :cond_1

    .line 46
    .line 47
    iget-boolean v0, p0, La/rme;->c:Z

    .line 48
    .line 49
    if-nez v0, :cond_1

    .line 50
    .line 51
    iget-object v0, p0, La/rme;->d:La/o8q0;

    .line 52
    .line 53
    iget-object v1, p0, La/rme;->f:La/k3x;

    .line 54
    .line 55
    invoke-static {v0, v3, v2, v1, v5}, La/dyb;->l0(La/o8q0;La/djz;La/a8q0;La/k3x;La/qe60;)V

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_1
    invoke-static {v3}, La/dyb;->R(La/djz;)V

    .line 60
    .line 61
    .line 62
    :goto_0
    invoke-virtual {p1}, La/iqq;->b()Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    const/4 v8, 0x0

    .line 67
    if-eqz v0, :cond_2

    .line 68
    .line 69
    invoke-virtual {v3}, La/djz;->d()La/b9q0;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    if-eqz v4, :cond_2

    .line 74
    .line 75
    new-instance v0, La/wn2;

    .line 76
    .line 77
    const/4 v6, 0x0

    .line 78
    const/16 v7, 0xc

    .line 79
    .line 80
    iget-object v1, p0, La/rme;->j:La/d39;

    .line 81
    .line 82
    invoke-direct/range {v0 .. v7}, La/wn2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 83
    .line 84
    .line 85
    const/4 v1, 0x3

    .line 86
    iget-object v2, p0, La/rme;->i:La/vne;

    .line 87
    .line 88
    invoke-static {v2, v8, v8, v0, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 89
    .line 90
    .line 91
    :cond_2
    invoke-virtual {p1}, La/iqq;->b()Z

    .line 92
    .line 93
    .line 94
    move-result p1

    .line 95
    if-nez p1, :cond_3

    .line 96
    .line 97
    iget-object p0, p0, La/rme;->h:La/k7q0;

    .line 98
    .line 99
    invoke-virtual {p0, v8}, La/k7q0;->d(La/ne60;)V

    .line 100
    .line 101
    .line 102
    :cond_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 103
    .line 104
    return-object p0
.end method

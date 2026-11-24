.class public final La/xz0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/zdr;


# instance fields
.field public synthetic i:Z

.field public synthetic j:La/sw00;

.field public synthetic k:Ljava/lang/String;

.field public synthetic l:Ljava/util/List;

.field public final synthetic m:La/a01;


# direct methods
.method public constructor <init>(La/a01;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/xz0;->m:La/a01;

    .line 2
    .line 3
    const/4 p1, 0x5

    .line 4
    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final O(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    check-cast p1, Ljava/lang/Boolean;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    check-cast p2, La/sw00;

    .line 8
    .line 9
    check-cast p3, Ljava/lang/String;

    .line 10
    .line 11
    check-cast p4, Ljava/util/List;

    .line 12
    .line 13
    check-cast p5, La/yje;

    .line 14
    .line 15
    new-instance v0, La/xz0;

    .line 16
    .line 17
    iget-object p0, p0, La/xz0;->m:La/a01;

    .line 18
    .line 19
    invoke-direct {v0, p0, p5}, La/xz0;-><init>(La/a01;La/yje;)V

    .line 20
    .line 21
    .line 22
    iput-boolean p1, v0, La/xz0;->i:Z

    .line 23
    .line 24
    iput-object p2, v0, La/xz0;->j:La/sw00;

    .line 25
    .line 26
    iput-object p3, v0, La/xz0;->k:Ljava/lang/String;

    .line 27
    .line 28
    iput-object p4, v0, La/xz0;->l:Ljava/util/List;

    .line 29
    .line 30
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 31
    .line 32
    invoke-virtual {v0, p0}, La/xz0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-boolean v0, p0, La/xz0;->i:Z

    .line 2
    .line 3
    iget-object v1, p0, La/xz0;->j:La/sw00;

    .line 4
    .line 5
    iget-object v2, p0, La/xz0;->k:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v3, p0, La/xz0;->l:Ljava/util/List;

    .line 8
    .line 9
    sget-object v4, La/wne;->a:La/wne;

    .line 10
    .line 11
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    new-instance p1, La/znk;

    .line 15
    .line 16
    const/16 v4, 0x11

    .line 17
    .line 18
    iget-object p0, p0, La/xz0;->m:La/a01;

    .line 19
    .line 20
    invoke-direct {p1, v2, p0, v3, v4}, La/znk;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 21
    .line 22
    .line 23
    sget v3, La/a01;->M:I

    .line 24
    .line 25
    invoke-virtual {p0, p1}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 26
    .line 27
    .line 28
    const/4 p1, 0x0

    .line 29
    if-nez v0, :cond_2

    .line 30
    .line 31
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    check-cast v3, La/hz0;

    .line 36
    .line 37
    iget-object v3, v3, La/hz0;->b:La/g9h0;

    .line 38
    .line 39
    instance-of v3, v3, La/q8h0;

    .line 40
    .line 41
    if-nez v3, :cond_0

    .line 42
    .line 43
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    check-cast v3, La/hz0;

    .line 48
    .line 49
    iget-object v3, v3, La/hz0;->c:Ljava/lang/String;

    .line 50
    .line 51
    invoke-virtual {v3, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    if-nez v3, :cond_2

    .line 56
    .line 57
    :cond_0
    iget-object v0, p0, La/i3t0;->i:La/ocj;

    .line 58
    .line 59
    iget-object v3, v0, La/ocj;->a:La/p7m0;

    .line 60
    .line 61
    :cond_1
    invoke-virtual {v3}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    iget-object v1, p0, La/i3t0;->f:La/oyg0;

    .line 69
    .line 70
    move-object v4, v0

    .line 71
    check-cast v4, La/hz0;

    .line 72
    .line 73
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    new-instance v6, La/k8h0;

    .line 77
    .line 78
    invoke-direct {v6, p1}, La/k8h0;-><init>(Z)V

    .line 79
    .line 80
    .line 81
    const/4 v11, 0x0

    .line 82
    const/16 v12, 0x3fd

    .line 83
    .line 84
    const/4 v5, 0x0

    .line 85
    const/4 v7, 0x0

    .line 86
    const/4 v8, 0x0

    .line 87
    const/4 v9, 0x0

    .line 88
    const/4 v10, 0x0

    .line 89
    invoke-static/range {v4 .. v12}, La/hz0;->a(La/hz0;Ljava/lang/String;La/g9h0;Ljava/lang/String;Ljava/util/List;ZILa/jo20;I)La/hz0;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    invoke-virtual {v3, v0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    if-eqz v0, :cond_1

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_2
    if-eqz v0, :cond_4

    .line 101
    .line 102
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    const/4 v2, 0x3

    .line 107
    if-lt v0, v2, :cond_3

    .line 108
    .line 109
    iget-boolean p1, v1, La/sw00;->a:Z

    .line 110
    .line 111
    invoke-static {p0, p1}, La/a01;->V(La/a01;Z)V

    .line 112
    .line 113
    .line 114
    goto :goto_0

    .line 115
    :cond_3
    iget-boolean v0, v1, La/sw00;->a:Z

    .line 116
    .line 117
    const/4 v1, 0x1

    .line 118
    invoke-virtual {p0, v0, v1, p1}, La/a01;->U(ZZZ)V

    .line 119
    .line 120
    .line 121
    :cond_4
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 122
    .line 123
    return-object p0
.end method

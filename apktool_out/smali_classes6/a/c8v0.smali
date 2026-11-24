.class public final La/c8v0;
.super La/i3t0;
.source "SourceFile"


# static fields
.field public static final synthetic v:I


# instance fields
.field public final o:Lorg/xplatform/ufc/api/weight_class_rating/UfcWeightClassRatingParams;

.field public final p:La/i1w0;

.field public final q:La/m1e;

.field public final r:La/x4u;

.field public final s:La/kys0;

.field public t:La/c4m0;

.field public u:La/bby;


# direct methods
.method public constructor <init>(Lorg/xplatform/ufc/api/weight_class_rating/UfcWeightClassRatingParams;La/i1w0;La/m1e;La/x4u;La/g2v;La/ctf0;La/mne;La/kys0;)V
    .locals 3

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object p7, p7, La/mne;->a:La/rwj;

    .line 8
    .line 9
    invoke-static {p7, p7}, La/cvm0;->p(La/lne;La/lne;)La/g090;

    .line 10
    .line 11
    .line 12
    move-result-object p7

    .line 13
    new-instance v0, La/o1u0;

    .line 14
    .line 15
    const/16 v1, 0x1c

    .line 16
    .line 17
    invoke-direct {v0, v1}, La/o1u0;-><init>(B)V

    .line 18
    .line 19
    .line 20
    new-instance v1, La/m8s0;

    .line 21
    .line 22
    const/16 v2, 0xa

    .line 23
    .line 24
    invoke-direct {v1, p1, p5, p6, v2}, La/m8s0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 25
    .line 26
    .line 27
    const/4 p5, 0x0

    .line 28
    invoke-direct {p0, v0, p7, v1, p5}, La/i3t0;-><init>(Lkotlin/jvm/functions/Function0;La/g090;Lkotlin/jvm/functions/Function1;La/yzn0;)V

    .line 29
    .line 30
    .line 31
    iput-object p1, p0, La/c8v0;->o:Lorg/xplatform/ufc/api/weight_class_rating/UfcWeightClassRatingParams;

    .line 32
    .line 33
    iput-object p2, p0, La/c8v0;->p:La/i1w0;

    .line 34
    .line 35
    iput-object p3, p0, La/c8v0;->q:La/m1e;

    .line 36
    .line 37
    iput-object p4, p0, La/c8v0;->r:La/x4u;

    .line 38
    .line 39
    iput-object p8, p0, La/c8v0;->s:La/kys0;

    .line 40
    .line 41
    return-void
.end method


# virtual methods
.method public final M()V
    .locals 5

    .line 1
    iget-object v0, p0, La/c8v0;->t:La/c4m0;

    .line 2
    .line 3
    invoke-static {v0}, La/e3c;->n(La/bby;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, La/c8v0;->q:La/m1e;

    .line 7
    .line 8
    invoke-interface {v0}, La/m1e;->b()La/gmq;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-static {v0}, La/i120;->W(La/gmq;)La/gmq;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    new-instance v1, La/k6s0;

    .line 17
    .line 18
    const/16 v2, 0x18

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    invoke-direct {v1, p0, v3, v2}, La/k6s0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 22
    .line 23
    .line 24
    new-instance v2, La/fnq;

    .line 25
    .line 26
    const/4 v4, 0x4

    .line 27
    invoke-direct {v2, v0, v1, v4}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 28
    .line 29
    .line 30
    const/4 v0, 0x3

    .line 31
    invoke-static {p0, v2, v3, v3, v0}, La/i3t0;->L(La/i3t0;La/gmq;La/lne;Lkotlin/jvm/functions/Function1;I)La/c4m0;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    iput-object v0, p0, La/c8v0;->t:La/c4m0;

    .line 36
    .line 37
    return-void
.end method

.method public final x(Ljava/lang/Object;)V
    .locals 3

    .line 1
    check-cast p1, La/o7v0;

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
    instance-of v0, p1, La/n7v0;

    .line 10
    .line 11
    if-eqz v0, :cond_3

    .line 12
    .line 13
    check-cast p1, La/n7v0;

    .line 14
    .line 15
    sget-object v0, La/k7v0;->a:La/k7v0;

    .line 16
    .line 17
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    iget-object v1, p0, La/c8v0;->p:La/i1w0;

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    invoke-static {v1}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    new-instance p1, La/c8d;

    .line 30
    .line 31
    sget-object v0, La/y7d;->a:La/v7d;

    .line 32
    .line 33
    sget-object v2, La/p0w0;->a:La/p0w0;

    .line 34
    .line 35
    invoke-direct {p1, v0, v2}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 36
    .line 37
    .line 38
    const/4 v0, 0x0

    .line 39
    invoke-static {p0, p1, v1, p0, v0}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    :goto_0
    move-object p1, p0

    .line 44
    check-cast p1, La/paw;

    .line 45
    .line 46
    invoke-virtual {p1}, La/paw;->hasNext()Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-eqz v0, :cond_6

    .line 51
    .line 52
    invoke-virtual {p1}, La/paw;->next()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    check-cast p1, La/oe50;

    .line 57
    .line 58
    invoke-virtual {v1, p1}, La/i1w0;->a(La/oe50;)V

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_0
    sget-object v0, La/m7v0;->a:La/m7v0;

    .line 63
    .line 64
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-eqz v0, :cond_1

    .line 69
    .line 70
    invoke-virtual {p0}, La/c8v0;->M()V

    .line 71
    .line 72
    .line 73
    return-void

    .line 74
    :cond_1
    instance-of v0, p1, La/l7v0;

    .line 75
    .line 76
    if-eqz v0, :cond_2

    .line 77
    .line 78
    check-cast p1, La/l7v0;

    .line 79
    .line 80
    new-instance v0, La/xis0;

    .line 81
    .line 82
    const/16 v2, 0x1b

    .line 83
    .line 84
    invoke-direct {v0, p0, p1, v2}, La/xis0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v1, v0}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 88
    .line 89
    .line 90
    return-void

    .line 91
    :cond_2
    invoke-static {}, La/t9f;->b()V

    .line 92
    .line 93
    .line 94
    return-void

    .line 95
    :cond_3
    instance-of v0, p1, La/j7v0;

    .line 96
    .line 97
    if-eqz v0, :cond_9

    .line 98
    .line 99
    check-cast p1, La/j7v0;

    .line 100
    .line 101
    sget-object v0, La/g7v0;->a:La/g7v0;

    .line 102
    .line 103
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    if-eqz v0, :cond_4

    .line 108
    .line 109
    invoke-virtual {p0}, La/i3t0;->E()V

    .line 110
    .line 111
    .line 112
    return-void

    .line 113
    :cond_4
    sget-object v0, La/h7v0;->a:La/h7v0;

    .line 114
    .line 115
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result v0

    .line 119
    if-eqz v0, :cond_7

    .line 120
    .line 121
    iget-object p1, p0, La/c8v0;->u:La/bby;

    .line 122
    .line 123
    if-eqz p1, :cond_5

    .line 124
    .line 125
    invoke-static {p1}, La/e3c;->n(La/bby;)V

    .line 126
    .line 127
    .line 128
    :cond_5
    iget-object p0, p0, La/c8v0;->t:La/c4m0;

    .line 129
    .line 130
    if-eqz p0, :cond_6

    .line 131
    .line 132
    invoke-static {p0}, La/e3c;->n(La/bby;)V

    .line 133
    .line 134
    .line 135
    :cond_6
    return-void

    .line 136
    :cond_7
    sget-object v0, La/i7v0;->a:La/i7v0;

    .line 137
    .line 138
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    move-result p1

    .line 142
    if-eqz p1, :cond_8

    .line 143
    .line 144
    invoke-virtual {p0}, La/c8v0;->M()V

    .line 145
    .line 146
    .line 147
    return-void

    .line 148
    :cond_8
    invoke-static {}, La/t9f;->b()V

    .line 149
    .line 150
    .line 151
    return-void

    .line 152
    :cond_9
    invoke-static {}, La/t9f;->b()V

    .line 153
    .line 154
    .line 155
    return-void
.end method

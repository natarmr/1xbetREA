.class public final La/brt;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/pru;


# direct methods
.method public synthetic constructor <init>(La/pru;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/brt;->a:La/pru;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(La/sff0;Ljava/util/List;)Ljava/util/ArrayList;
    .locals 4

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_a

    .line 15
    .line 16
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, La/bmb0;

    .line 21
    .line 22
    sget-object v2, La/bmb0;->b:La/bmb0;

    .line 23
    .line 24
    if-ne v1, v2, :cond_1

    .line 25
    .line 26
    sget-object v1, La/s9b0;->b:La/s9b0;

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    sget-object v2, La/bmb0;->c:La/bmb0;

    .line 30
    .line 31
    if-ne v1, v2, :cond_2

    .line 32
    .line 33
    sget-object v1, La/s9b0;->c:La/s9b0;

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_2
    iget-object v2, p0, La/sff0;->c:La/ech;

    .line 37
    .line 38
    iget-object v3, p0, La/sff0;->b:La/hl1;

    .line 39
    .line 40
    iget-object v2, v2, La/ech;->a:La/hdh;

    .line 41
    .line 42
    iget-boolean v2, v2, La/hdh;->a:Z

    .line 43
    .line 44
    if-eqz v2, :cond_3

    .line 45
    .line 46
    sget-object v2, La/bmb0;->d:La/bmb0;

    .line 47
    .line 48
    if-ne v1, v2, :cond_3

    .line 49
    .line 50
    sget-object v1, La/s9b0;->d:La/s9b0;

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_3
    iget-object v2, p0, La/sff0;->d:La/q1w0;

    .line 54
    .line 55
    iget-object v2, v2, La/q1w0;->a:La/dyv0;

    .line 56
    .line 57
    iget-boolean v2, v2, La/dyv0;->a:Z

    .line 58
    .line 59
    if-eqz v2, :cond_4

    .line 60
    .line 61
    sget-object v2, La/bmb0;->e:La/bmb0;

    .line 62
    .line 63
    if-ne v1, v2, :cond_4

    .line 64
    .line 65
    sget-object v1, La/s9b0;->e:La/s9b0;

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_4
    sget-object v2, La/bmb0;->f:La/bmb0;

    .line 69
    .line 70
    if-ne v1, v2, :cond_5

    .line 71
    .line 72
    iget-object v2, v3, La/hl1;->a:La/f61;

    .line 73
    .line 74
    iget-boolean v2, v2, La/f61;->b:Z

    .line 75
    .line 76
    if-eqz v2, :cond_5

    .line 77
    .line 78
    sget-object v1, La/s9b0;->f:La/s9b0;

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_5
    sget-object v2, La/bmb0;->g:La/bmb0;

    .line 82
    .line 83
    if-ne v1, v2, :cond_6

    .line 84
    .line 85
    iget-boolean v2, v3, La/hl1;->C:Z

    .line 86
    .line 87
    if-eqz v2, :cond_6

    .line 88
    .line 89
    sget-object v1, La/s9b0;->f:La/s9b0;

    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_6
    sget-object v2, La/bmb0;->h:La/bmb0;

    .line 93
    .line 94
    if-ne v1, v2, :cond_7

    .line 95
    .line 96
    sget-object v1, La/s9b0;->g:La/s9b0;

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_7
    sget-object v2, La/bmb0;->i:La/bmb0;

    .line 100
    .line 101
    if-ne v1, v2, :cond_8

    .line 102
    .line 103
    sget-object v1, La/s9b0;->h:La/s9b0;

    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_8
    sget-object v2, La/bmb0;->j:La/bmb0;

    .line 107
    .line 108
    if-ne v1, v2, :cond_9

    .line 109
    .line 110
    sget-object v1, La/s9b0;->i:La/s9b0;

    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_9
    const/4 v1, 0x0

    .line 114
    :goto_1
    if-eqz v1, :cond_0

    .line 115
    .line 116
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    goto :goto_0

    .line 120
    :cond_a
    return-object v0
.end method
